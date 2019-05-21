package cc.arduino.core.rpc;

import java.io.IOException;

import cc.arduino.core.rpc.ArduinoCoreGrpc.ArduinoCoreBlockingStub;
import cc.arduino.core.rpc.ArduinoCoreGrpc.ArduinoCoreStub;
import cc.arduino.core.rpc.Commands.Configuration;
import cc.arduino.core.rpc.Commands.InitReq;
import cc.arduino.core.rpc.Commands.InitResp;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import processing.app.debug.MessageSiphon;

public class ArduinoCore {

  private Process builder;
  private MessageSiphon builderOut;
  private MessageSiphon builderErr;
  private ArduinoCoreBlockingStub blocking;
  private ArduinoCoreStub async;

  public ArduinoCore() throws IOException {
    ManagedChannel channel = ManagedChannelBuilder //
        .forAddress("127.0.0.1", 50051) //
        .usePlaintext() //
        .build();
    blocking = ArduinoCoreGrpc.newBlockingStub(channel);
    async = ArduinoCoreGrpc.newStub(channel);

    // List<String> cmd = new ArrayList<>();
    // cmd.add(BaseNoGui.getContentFile("arduino-cli").getAbsolutePath());
    // cmd.add("daemon");
    // builder = ProcessUtils.exec(cmd.toArray(new String[0]));
    // builderOut = new MessageSiphon(builder.getInputStream(), (msg) -> {
    // System.out.println(msg);
    // // try {
    // // xxx.write(msg.getBytes());
    // // } catch (Exception e) {
    // // exception = new RunnerException(e);
    // // }
    // });
    // builderErr = new MessageSiphon(builder.getErrorStream(), (msg) -> {
    // System.err.println(msg);
    // // try {
    // // xxx.write(msg.getBytes());
    // // } catch (Exception e) {
    // // exception = new RunnerException(e);
    // // }
    // });
  }

  ArduinoCoreInstance init(String dataDir) {
    Configuration.Builder conf = Configuration.newBuilder();
    conf.setDataDir(dataDir);

    InitReq.Builder req = InitReq.newBuilder();
    req.setConfiguration(conf.build());
    InitResp resp = blocking.init(req.build());
    return new ArduinoCoreInstance(resp.getInstance(), blocking);
  }

  public static void main(String[] args) throws IOException {
    ArduinoCore core = new ArduinoCore();
    ArduinoCoreInstance instance = core.init("/mnt/ramdisk");
    instance.boardDetails("arduino:samd:mkr1000");
    instance.compile("arduino:samd:mkr1000",
                     "/home/megabug/Arduino/alloc_check");
  }
}
