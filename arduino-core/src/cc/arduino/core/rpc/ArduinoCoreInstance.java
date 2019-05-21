package cc.arduino.core.rpc;

import java.util.Iterator;

import com.google.protobuf.ByteString;

import cc.arduino.core.rpc.ArduinoCoreGrpc.ArduinoCoreBlockingStub;
import cc.arduino.core.rpc.Board.BoardDetailsReq;
import cc.arduino.core.rpc.Board.BoardDetailsResp;
import cc.arduino.core.rpc.Commands.RescanReq;
import cc.arduino.core.rpc.Common.Instance;
import cc.arduino.core.rpc.Compile.CompileReq;
import cc.arduino.core.rpc.Compile.CompileResp;

public class ArduinoCoreInstance {

  private Instance instance;
  private ArduinoCoreBlockingStub stub;

  public ArduinoCoreInstance(Instance instance,
                             ArduinoCoreBlockingStub blocking) {
    this.instance = instance;
    this.stub = blocking;
  }

  void boardDetails(String fqbn) {
    BoardDetailsReq.Builder req = BoardDetailsReq.newBuilder();
    req.setFqbn(fqbn);
    req.setInstance(instance);
    BoardDetailsResp resp = stub.boardDetails(req.build());
    System.out.println(resp.getName());
  }

  void compile(String fqbn, String sketchPath) {
    CompileReq.Builder req = CompileReq.newBuilder();
    req.setInstance(instance);
    req.setFqbn(fqbn);
    req.setSketchPath(sketchPath);
    req.setVerbose(true);
    Iterator<CompileResp> stream = stub.compile(req.build());
    while (stream.hasNext()) {
      CompileResp resp = stream.next();
      ByteString out = resp.getOutStream();
      if (out != null)
        System.out.print(out.toStringUtf8());
    }
  }

  void rescan() {
    RescanReq.Builder req = RescanReq.newBuilder();
    req.setInstance(instance);
    stub.rescan(req.build());
  }
}
