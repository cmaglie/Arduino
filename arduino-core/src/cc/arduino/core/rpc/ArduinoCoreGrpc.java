package cc.arduino.core.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The main Arduino Platform Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: commands.proto")
public final class ArduinoCoreGrpc {

  private ArduinoCoreGrpc() {}

  public static final String SERVICE_NAME = "cc.arduino.core.rpc.ArduinoCore";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.InitReq,
      cc.arduino.core.rpc.Commands.InitResp> getInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Init",
      requestType = cc.arduino.core.rpc.Commands.InitReq.class,
      responseType = cc.arduino.core.rpc.Commands.InitResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.InitReq,
      cc.arduino.core.rpc.Commands.InitResp> getInitMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.InitReq, cc.arduino.core.rpc.Commands.InitResp> getInitMethod;
    if ((getInitMethod = ArduinoCoreGrpc.getInitMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getInitMethod = ArduinoCoreGrpc.getInitMethod) == null) {
          ArduinoCoreGrpc.getInitMethod = getInitMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Commands.InitReq, cc.arduino.core.rpc.Commands.InitResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "Init"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Commands.InitReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Commands.InitResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("Init"))
                  .build();
          }
        }
     }
     return getInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.DestroyReq,
      cc.arduino.core.rpc.Commands.DestroyResp> getDestroyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Destroy",
      requestType = cc.arduino.core.rpc.Commands.DestroyReq.class,
      responseType = cc.arduino.core.rpc.Commands.DestroyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.DestroyReq,
      cc.arduino.core.rpc.Commands.DestroyResp> getDestroyMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.DestroyReq, cc.arduino.core.rpc.Commands.DestroyResp> getDestroyMethod;
    if ((getDestroyMethod = ArduinoCoreGrpc.getDestroyMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getDestroyMethod = ArduinoCoreGrpc.getDestroyMethod) == null) {
          ArduinoCoreGrpc.getDestroyMethod = getDestroyMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Commands.DestroyReq, cc.arduino.core.rpc.Commands.DestroyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "Destroy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Commands.DestroyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Commands.DestroyResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("Destroy"))
                  .build();
          }
        }
     }
     return getDestroyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.RescanReq,
      cc.arduino.core.rpc.Commands.RescanResp> getRescanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rescan",
      requestType = cc.arduino.core.rpc.Commands.RescanReq.class,
      responseType = cc.arduino.core.rpc.Commands.RescanResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.RescanReq,
      cc.arduino.core.rpc.Commands.RescanResp> getRescanMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.RescanReq, cc.arduino.core.rpc.Commands.RescanResp> getRescanMethod;
    if ((getRescanMethod = ArduinoCoreGrpc.getRescanMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getRescanMethod = ArduinoCoreGrpc.getRescanMethod) == null) {
          ArduinoCoreGrpc.getRescanMethod = getRescanMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Commands.RescanReq, cc.arduino.core.rpc.Commands.RescanResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "Rescan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Commands.RescanReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Commands.RescanResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("Rescan"))
                  .build();
          }
        }
     }
     return getRescanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.UpdateIndexReq,
      cc.arduino.core.rpc.Commands.UpdateIndexResp> getUpdateIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateIndex",
      requestType = cc.arduino.core.rpc.Commands.UpdateIndexReq.class,
      responseType = cc.arduino.core.rpc.Commands.UpdateIndexResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.UpdateIndexReq,
      cc.arduino.core.rpc.Commands.UpdateIndexResp> getUpdateIndexMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Commands.UpdateIndexReq, cc.arduino.core.rpc.Commands.UpdateIndexResp> getUpdateIndexMethod;
    if ((getUpdateIndexMethod = ArduinoCoreGrpc.getUpdateIndexMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getUpdateIndexMethod = ArduinoCoreGrpc.getUpdateIndexMethod) == null) {
          ArduinoCoreGrpc.getUpdateIndexMethod = getUpdateIndexMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Commands.UpdateIndexReq, cc.arduino.core.rpc.Commands.UpdateIndexResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "UpdateIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Commands.UpdateIndexReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Commands.UpdateIndexResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("UpdateIndex"))
                  .build();
          }
        }
     }
     return getUpdateIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Board.BoardDetailsReq,
      cc.arduino.core.rpc.Board.BoardDetailsResp> getBoardDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BoardDetails",
      requestType = cc.arduino.core.rpc.Board.BoardDetailsReq.class,
      responseType = cc.arduino.core.rpc.Board.BoardDetailsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Board.BoardDetailsReq,
      cc.arduino.core.rpc.Board.BoardDetailsResp> getBoardDetailsMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Board.BoardDetailsReq, cc.arduino.core.rpc.Board.BoardDetailsResp> getBoardDetailsMethod;
    if ((getBoardDetailsMethod = ArduinoCoreGrpc.getBoardDetailsMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getBoardDetailsMethod = ArduinoCoreGrpc.getBoardDetailsMethod) == null) {
          ArduinoCoreGrpc.getBoardDetailsMethod = getBoardDetailsMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Board.BoardDetailsReq, cc.arduino.core.rpc.Board.BoardDetailsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "BoardDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Board.BoardDetailsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Board.BoardDetailsResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("BoardDetails"))
                  .build();
          }
        }
     }
     return getBoardDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Compile.CompileReq,
      cc.arduino.core.rpc.Compile.CompileResp> getCompileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compile",
      requestType = cc.arduino.core.rpc.Compile.CompileReq.class,
      responseType = cc.arduino.core.rpc.Compile.CompileResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Compile.CompileReq,
      cc.arduino.core.rpc.Compile.CompileResp> getCompileMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Compile.CompileReq, cc.arduino.core.rpc.Compile.CompileResp> getCompileMethod;
    if ((getCompileMethod = ArduinoCoreGrpc.getCompileMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getCompileMethod = ArduinoCoreGrpc.getCompileMethod) == null) {
          ArduinoCoreGrpc.getCompileMethod = getCompileMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Compile.CompileReq, cc.arduino.core.rpc.Compile.CompileResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "Compile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Compile.CompileReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Compile.CompileResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("Compile"))
                  .build();
          }
        }
     }
     return getCompileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformInstallReq,
      cc.arduino.core.rpc.Core.PlatformInstallResp> getPlatformInstallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlatformInstall",
      requestType = cc.arduino.core.rpc.Core.PlatformInstallReq.class,
      responseType = cc.arduino.core.rpc.Core.PlatformInstallResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformInstallReq,
      cc.arduino.core.rpc.Core.PlatformInstallResp> getPlatformInstallMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformInstallReq, cc.arduino.core.rpc.Core.PlatformInstallResp> getPlatformInstallMethod;
    if ((getPlatformInstallMethod = ArduinoCoreGrpc.getPlatformInstallMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getPlatformInstallMethod = ArduinoCoreGrpc.getPlatformInstallMethod) == null) {
          ArduinoCoreGrpc.getPlatformInstallMethod = getPlatformInstallMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Core.PlatformInstallReq, cc.arduino.core.rpc.Core.PlatformInstallResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "PlatformInstall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformInstallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformInstallResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("PlatformInstall"))
                  .build();
          }
        }
     }
     return getPlatformInstallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformDownloadReq,
      cc.arduino.core.rpc.Core.PlatformDownloadResp> getPlatformDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlatformDownload",
      requestType = cc.arduino.core.rpc.Core.PlatformDownloadReq.class,
      responseType = cc.arduino.core.rpc.Core.PlatformDownloadResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformDownloadReq,
      cc.arduino.core.rpc.Core.PlatformDownloadResp> getPlatformDownloadMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformDownloadReq, cc.arduino.core.rpc.Core.PlatformDownloadResp> getPlatformDownloadMethod;
    if ((getPlatformDownloadMethod = ArduinoCoreGrpc.getPlatformDownloadMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getPlatformDownloadMethod = ArduinoCoreGrpc.getPlatformDownloadMethod) == null) {
          ArduinoCoreGrpc.getPlatformDownloadMethod = getPlatformDownloadMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Core.PlatformDownloadReq, cc.arduino.core.rpc.Core.PlatformDownloadResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "PlatformDownload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformDownloadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformDownloadResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("PlatformDownload"))
                  .build();
          }
        }
     }
     return getPlatformDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformUninstallReq,
      cc.arduino.core.rpc.Core.PlatformUninstallResp> getPlatformUninstallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlatformUninstall",
      requestType = cc.arduino.core.rpc.Core.PlatformUninstallReq.class,
      responseType = cc.arduino.core.rpc.Core.PlatformUninstallResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformUninstallReq,
      cc.arduino.core.rpc.Core.PlatformUninstallResp> getPlatformUninstallMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformUninstallReq, cc.arduino.core.rpc.Core.PlatformUninstallResp> getPlatformUninstallMethod;
    if ((getPlatformUninstallMethod = ArduinoCoreGrpc.getPlatformUninstallMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getPlatformUninstallMethod = ArduinoCoreGrpc.getPlatformUninstallMethod) == null) {
          ArduinoCoreGrpc.getPlatformUninstallMethod = getPlatformUninstallMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Core.PlatformUninstallReq, cc.arduino.core.rpc.Core.PlatformUninstallResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "PlatformUninstall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformUninstallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformUninstallResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("PlatformUninstall"))
                  .build();
          }
        }
     }
     return getPlatformUninstallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformUpgradeReq,
      cc.arduino.core.rpc.Core.PlatformUpgradeResp> getPlatformUpgradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlatformUpgrade",
      requestType = cc.arduino.core.rpc.Core.PlatformUpgradeReq.class,
      responseType = cc.arduino.core.rpc.Core.PlatformUpgradeResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformUpgradeReq,
      cc.arduino.core.rpc.Core.PlatformUpgradeResp> getPlatformUpgradeMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformUpgradeReq, cc.arduino.core.rpc.Core.PlatformUpgradeResp> getPlatformUpgradeMethod;
    if ((getPlatformUpgradeMethod = ArduinoCoreGrpc.getPlatformUpgradeMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getPlatformUpgradeMethod = ArduinoCoreGrpc.getPlatformUpgradeMethod) == null) {
          ArduinoCoreGrpc.getPlatformUpgradeMethod = getPlatformUpgradeMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Core.PlatformUpgradeReq, cc.arduino.core.rpc.Core.PlatformUpgradeResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "PlatformUpgrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformUpgradeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformUpgradeResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("PlatformUpgrade"))
                  .build();
          }
        }
     }
     return getPlatformUpgradeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Upload.UploadReq,
      cc.arduino.core.rpc.Upload.UploadResp> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = cc.arduino.core.rpc.Upload.UploadReq.class,
      responseType = cc.arduino.core.rpc.Upload.UploadResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Upload.UploadReq,
      cc.arduino.core.rpc.Upload.UploadResp> getUploadMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Upload.UploadReq, cc.arduino.core.rpc.Upload.UploadResp> getUploadMethod;
    if ((getUploadMethod = ArduinoCoreGrpc.getUploadMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getUploadMethod = ArduinoCoreGrpc.getUploadMethod) == null) {
          ArduinoCoreGrpc.getUploadMethod = getUploadMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Upload.UploadReq, cc.arduino.core.rpc.Upload.UploadResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Upload.UploadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Upload.UploadResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("Upload"))
                  .build();
          }
        }
     }
     return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformSearchReq,
      cc.arduino.core.rpc.Core.PlatformSearchResp> getPlatformSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlatformSearch",
      requestType = cc.arduino.core.rpc.Core.PlatformSearchReq.class,
      responseType = cc.arduino.core.rpc.Core.PlatformSearchResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformSearchReq,
      cc.arduino.core.rpc.Core.PlatformSearchResp> getPlatformSearchMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformSearchReq, cc.arduino.core.rpc.Core.PlatformSearchResp> getPlatformSearchMethod;
    if ((getPlatformSearchMethod = ArduinoCoreGrpc.getPlatformSearchMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getPlatformSearchMethod = ArduinoCoreGrpc.getPlatformSearchMethod) == null) {
          ArduinoCoreGrpc.getPlatformSearchMethod = getPlatformSearchMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Core.PlatformSearchReq, cc.arduino.core.rpc.Core.PlatformSearchResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "PlatformSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformSearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformSearchResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("PlatformSearch"))
                  .build();
          }
        }
     }
     return getPlatformSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformListReq,
      cc.arduino.core.rpc.Core.PlatformListResp> getPlatformListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlatformList",
      requestType = cc.arduino.core.rpc.Core.PlatformListReq.class,
      responseType = cc.arduino.core.rpc.Core.PlatformListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformListReq,
      cc.arduino.core.rpc.Core.PlatformListResp> getPlatformListMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Core.PlatformListReq, cc.arduino.core.rpc.Core.PlatformListResp> getPlatformListMethod;
    if ((getPlatformListMethod = ArduinoCoreGrpc.getPlatformListMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getPlatformListMethod = ArduinoCoreGrpc.getPlatformListMethod) == null) {
          ArduinoCoreGrpc.getPlatformListMethod = getPlatformListMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Core.PlatformListReq, cc.arduino.core.rpc.Core.PlatformListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "PlatformList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Core.PlatformListResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("PlatformList"))
                  .build();
          }
        }
     }
     return getPlatformListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryDownloadReq,
      cc.arduino.core.rpc.Lib.LibraryDownloadResp> getLibraryDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LibraryDownload",
      requestType = cc.arduino.core.rpc.Lib.LibraryDownloadReq.class,
      responseType = cc.arduino.core.rpc.Lib.LibraryDownloadResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryDownloadReq,
      cc.arduino.core.rpc.Lib.LibraryDownloadResp> getLibraryDownloadMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryDownloadReq, cc.arduino.core.rpc.Lib.LibraryDownloadResp> getLibraryDownloadMethod;
    if ((getLibraryDownloadMethod = ArduinoCoreGrpc.getLibraryDownloadMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getLibraryDownloadMethod = ArduinoCoreGrpc.getLibraryDownloadMethod) == null) {
          ArduinoCoreGrpc.getLibraryDownloadMethod = getLibraryDownloadMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Lib.LibraryDownloadReq, cc.arduino.core.rpc.Lib.LibraryDownloadResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "LibraryDownload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibraryDownloadReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibraryDownloadResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("LibraryDownload"))
                  .build();
          }
        }
     }
     return getLibraryDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryInstallReq,
      cc.arduino.core.rpc.Lib.LibraryInstallResp> getLibraryInstallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LibraryInstall",
      requestType = cc.arduino.core.rpc.Lib.LibraryInstallReq.class,
      responseType = cc.arduino.core.rpc.Lib.LibraryInstallResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryInstallReq,
      cc.arduino.core.rpc.Lib.LibraryInstallResp> getLibraryInstallMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryInstallReq, cc.arduino.core.rpc.Lib.LibraryInstallResp> getLibraryInstallMethod;
    if ((getLibraryInstallMethod = ArduinoCoreGrpc.getLibraryInstallMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getLibraryInstallMethod = ArduinoCoreGrpc.getLibraryInstallMethod) == null) {
          ArduinoCoreGrpc.getLibraryInstallMethod = getLibraryInstallMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Lib.LibraryInstallReq, cc.arduino.core.rpc.Lib.LibraryInstallResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "LibraryInstall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibraryInstallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibraryInstallResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("LibraryInstall"))
                  .build();
          }
        }
     }
     return getLibraryInstallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryUninstallReq,
      cc.arduino.core.rpc.Lib.LibraryUninstallResp> getLibraryUninstallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LibraryUninstall",
      requestType = cc.arduino.core.rpc.Lib.LibraryUninstallReq.class,
      responseType = cc.arduino.core.rpc.Lib.LibraryUninstallResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryUninstallReq,
      cc.arduino.core.rpc.Lib.LibraryUninstallResp> getLibraryUninstallMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryUninstallReq, cc.arduino.core.rpc.Lib.LibraryUninstallResp> getLibraryUninstallMethod;
    if ((getLibraryUninstallMethod = ArduinoCoreGrpc.getLibraryUninstallMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getLibraryUninstallMethod = ArduinoCoreGrpc.getLibraryUninstallMethod) == null) {
          ArduinoCoreGrpc.getLibraryUninstallMethod = getLibraryUninstallMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Lib.LibraryUninstallReq, cc.arduino.core.rpc.Lib.LibraryUninstallResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "LibraryUninstall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibraryUninstallReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibraryUninstallResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("LibraryUninstall"))
                  .build();
          }
        }
     }
     return getLibraryUninstallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq,
      cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> getLibraryUpgradeAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LibraryUpgradeAll",
      requestType = cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq.class,
      responseType = cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq,
      cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> getLibraryUpgradeAllMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq, cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> getLibraryUpgradeAllMethod;
    if ((getLibraryUpgradeAllMethod = ArduinoCoreGrpc.getLibraryUpgradeAllMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getLibraryUpgradeAllMethod = ArduinoCoreGrpc.getLibraryUpgradeAllMethod) == null) {
          ArduinoCoreGrpc.getLibraryUpgradeAllMethod = getLibraryUpgradeAllMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq, cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "LibraryUpgradeAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("LibraryUpgradeAll"))
                  .build();
          }
        }
     }
     return getLibraryUpgradeAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibrarySearchReq,
      cc.arduino.core.rpc.Lib.LibrarySearchResp> getLibrarySearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LibrarySearch",
      requestType = cc.arduino.core.rpc.Lib.LibrarySearchReq.class,
      responseType = cc.arduino.core.rpc.Lib.LibrarySearchResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibrarySearchReq,
      cc.arduino.core.rpc.Lib.LibrarySearchResp> getLibrarySearchMethod() {
    io.grpc.MethodDescriptor<cc.arduino.core.rpc.Lib.LibrarySearchReq, cc.arduino.core.rpc.Lib.LibrarySearchResp> getLibrarySearchMethod;
    if ((getLibrarySearchMethod = ArduinoCoreGrpc.getLibrarySearchMethod) == null) {
      synchronized (ArduinoCoreGrpc.class) {
        if ((getLibrarySearchMethod = ArduinoCoreGrpc.getLibrarySearchMethod) == null) {
          ArduinoCoreGrpc.getLibrarySearchMethod = getLibrarySearchMethod = 
              io.grpc.MethodDescriptor.<cc.arduino.core.rpc.Lib.LibrarySearchReq, cc.arduino.core.rpc.Lib.LibrarySearchResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cc.arduino.core.rpc.ArduinoCore", "LibrarySearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibrarySearchReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cc.arduino.core.rpc.Lib.LibrarySearchResp.getDefaultInstance()))
                  .setSchemaDescriptor(new ArduinoCoreMethodDescriptorSupplier("LibrarySearch"))
                  .build();
          }
        }
     }
     return getLibrarySearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArduinoCoreStub newStub(io.grpc.Channel channel) {
    return new ArduinoCoreStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArduinoCoreBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ArduinoCoreBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArduinoCoreFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ArduinoCoreFutureStub(channel);
  }

  /**
   * <pre>
   * The main Arduino Platform Service
   * </pre>
   */
  public static abstract class ArduinoCoreImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Start a new instance of the Arduino Core Service
     * </pre>
     */
    public void init(cc.arduino.core.rpc.Commands.InitReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.InitResp> responseObserver) {
      asyncUnimplementedUnaryCall(getInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Destroy an instance of the Arduino Core Service
     * </pre>
     */
    public void destroy(cc.arduino.core.rpc.Commands.DestroyReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.DestroyResp> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Rescan instance of the Arduino Core Service
     * </pre>
     */
    public void rescan(cc.arduino.core.rpc.Commands.RescanReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.RescanResp> responseObserver) {
      asyncUnimplementedUnaryCall(getRescanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update package index of the Arduino Core Service
     * </pre>
     */
    public void updateIndex(cc.arduino.core.rpc.Commands.UpdateIndexReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateIndexResp> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * Requests details about a board
     * </pre>
     */
    public void boardDetails(cc.arduino.core.rpc.Board.BoardDetailsReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardDetailsResp> responseObserver) {
      asyncUnimplementedUnaryCall(getBoardDetailsMethod(), responseObserver);
    }

    /**
     */
    public void compile(cc.arduino.core.rpc.Compile.CompileReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Compile.CompileResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCompileMethod(), responseObserver);
    }

    /**
     */
    public void platformInstall(cc.arduino.core.rpc.Core.PlatformInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformInstallResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPlatformInstallMethod(), responseObserver);
    }

    /**
     */
    public void platformDownload(cc.arduino.core.rpc.Core.PlatformDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformDownloadResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPlatformDownloadMethod(), responseObserver);
    }

    /**
     */
    public void platformUninstall(cc.arduino.core.rpc.Core.PlatformUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUninstallResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPlatformUninstallMethod(), responseObserver);
    }

    /**
     */
    public void platformUpgrade(cc.arduino.core.rpc.Core.PlatformUpgradeReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUpgradeResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPlatformUpgradeMethod(), responseObserver);
    }

    /**
     */
    public void upload(cc.arduino.core.rpc.Upload.UploadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Upload.UploadResp> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
    }

    /**
     */
    public void platformSearch(cc.arduino.core.rpc.Core.PlatformSearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformSearchResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPlatformSearchMethod(), responseObserver);
    }

    /**
     */
    public void platformList(cc.arduino.core.rpc.Core.PlatformListReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformListResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPlatformListMethod(), responseObserver);
    }

    /**
     */
    public void libraryDownload(cc.arduino.core.rpc.Lib.LibraryDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryDownloadResp> responseObserver) {
      asyncUnimplementedUnaryCall(getLibraryDownloadMethod(), responseObserver);
    }

    /**
     */
    public void libraryInstall(cc.arduino.core.rpc.Lib.LibraryInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryInstallResp> responseObserver) {
      asyncUnimplementedUnaryCall(getLibraryInstallMethod(), responseObserver);
    }

    /**
     */
    public void libraryUninstall(cc.arduino.core.rpc.Lib.LibraryUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUninstallResp> responseObserver) {
      asyncUnimplementedUnaryCall(getLibraryUninstallMethod(), responseObserver);
    }

    /**
     */
    public void libraryUpgradeAll(cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> responseObserver) {
      asyncUnimplementedUnaryCall(getLibraryUpgradeAllMethod(), responseObserver);
    }

    /**
     */
    public void librarySearch(cc.arduino.core.rpc.Lib.LibrarySearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibrarySearchResp> responseObserver) {
      asyncUnimplementedUnaryCall(getLibrarySearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Commands.InitReq,
                cc.arduino.core.rpc.Commands.InitResp>(
                  this, METHODID_INIT)))
          .addMethod(
            getDestroyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Commands.DestroyReq,
                cc.arduino.core.rpc.Commands.DestroyResp>(
                  this, METHODID_DESTROY)))
          .addMethod(
            getRescanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Commands.RescanReq,
                cc.arduino.core.rpc.Commands.RescanResp>(
                  this, METHODID_RESCAN)))
          .addMethod(
            getUpdateIndexMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Commands.UpdateIndexReq,
                cc.arduino.core.rpc.Commands.UpdateIndexResp>(
                  this, METHODID_UPDATE_INDEX)))
          .addMethod(
            getBoardDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Board.BoardDetailsReq,
                cc.arduino.core.rpc.Board.BoardDetailsResp>(
                  this, METHODID_BOARD_DETAILS)))
          .addMethod(
            getCompileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Compile.CompileReq,
                cc.arduino.core.rpc.Compile.CompileResp>(
                  this, METHODID_COMPILE)))
          .addMethod(
            getPlatformInstallMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Core.PlatformInstallReq,
                cc.arduino.core.rpc.Core.PlatformInstallResp>(
                  this, METHODID_PLATFORM_INSTALL)))
          .addMethod(
            getPlatformDownloadMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Core.PlatformDownloadReq,
                cc.arduino.core.rpc.Core.PlatformDownloadResp>(
                  this, METHODID_PLATFORM_DOWNLOAD)))
          .addMethod(
            getPlatformUninstallMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Core.PlatformUninstallReq,
                cc.arduino.core.rpc.Core.PlatformUninstallResp>(
                  this, METHODID_PLATFORM_UNINSTALL)))
          .addMethod(
            getPlatformUpgradeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Core.PlatformUpgradeReq,
                cc.arduino.core.rpc.Core.PlatformUpgradeResp>(
                  this, METHODID_PLATFORM_UPGRADE)))
          .addMethod(
            getUploadMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Upload.UploadReq,
                cc.arduino.core.rpc.Upload.UploadResp>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getPlatformSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Core.PlatformSearchReq,
                cc.arduino.core.rpc.Core.PlatformSearchResp>(
                  this, METHODID_PLATFORM_SEARCH)))
          .addMethod(
            getPlatformListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Core.PlatformListReq,
                cc.arduino.core.rpc.Core.PlatformListResp>(
                  this, METHODID_PLATFORM_LIST)))
          .addMethod(
            getLibraryDownloadMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Lib.LibraryDownloadReq,
                cc.arduino.core.rpc.Lib.LibraryDownloadResp>(
                  this, METHODID_LIBRARY_DOWNLOAD)))
          .addMethod(
            getLibraryInstallMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Lib.LibraryInstallReq,
                cc.arduino.core.rpc.Lib.LibraryInstallResp>(
                  this, METHODID_LIBRARY_INSTALL)))
          .addMethod(
            getLibraryUninstallMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Lib.LibraryUninstallReq,
                cc.arduino.core.rpc.Lib.LibraryUninstallResp>(
                  this, METHODID_LIBRARY_UNINSTALL)))
          .addMethod(
            getLibraryUpgradeAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq,
                cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp>(
                  this, METHODID_LIBRARY_UPGRADE_ALL)))
          .addMethod(
            getLibrarySearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cc.arduino.core.rpc.Lib.LibrarySearchReq,
                cc.arduino.core.rpc.Lib.LibrarySearchResp>(
                  this, METHODID_LIBRARY_SEARCH)))
          .build();
    }
  }

  /**
   * <pre>
   * The main Arduino Platform Service
   * </pre>
   */
  public static final class ArduinoCoreStub extends io.grpc.stub.AbstractStub<ArduinoCoreStub> {
    private ArduinoCoreStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArduinoCoreStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArduinoCoreStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArduinoCoreStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start a new instance of the Arduino Core Service
     * </pre>
     */
    public void init(cc.arduino.core.rpc.Commands.InitReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.InitResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Destroy an instance of the Arduino Core Service
     * </pre>
     */
    public void destroy(cc.arduino.core.rpc.Commands.DestroyReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.DestroyResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Rescan instance of the Arduino Core Service
     * </pre>
     */
    public void rescan(cc.arduino.core.rpc.Commands.RescanReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.RescanResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRescanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update package index of the Arduino Core Service
     * </pre>
     */
    public void updateIndex(cc.arduino.core.rpc.Commands.UpdateIndexReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateIndexResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getUpdateIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Requests details about a board
     * </pre>
     */
    public void boardDetails(cc.arduino.core.rpc.Board.BoardDetailsReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardDetailsResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBoardDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void compile(cc.arduino.core.rpc.Compile.CompileReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Compile.CompileResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCompileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void platformInstall(cc.arduino.core.rpc.Core.PlatformInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformInstallResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPlatformInstallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void platformDownload(cc.arduino.core.rpc.Core.PlatformDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformDownloadResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPlatformDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void platformUninstall(cc.arduino.core.rpc.Core.PlatformUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUninstallResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPlatformUninstallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void platformUpgrade(cc.arduino.core.rpc.Core.PlatformUpgradeReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUpgradeResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPlatformUpgradeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upload(cc.arduino.core.rpc.Upload.UploadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Upload.UploadResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void platformSearch(cc.arduino.core.rpc.Core.PlatformSearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformSearchResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlatformSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void platformList(cc.arduino.core.rpc.Core.PlatformListReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformListResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlatformListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void libraryDownload(cc.arduino.core.rpc.Lib.LibraryDownloadReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryDownloadResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLibraryDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void libraryInstall(cc.arduino.core.rpc.Lib.LibraryInstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryInstallResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLibraryInstallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void libraryUninstall(cc.arduino.core.rpc.Lib.LibraryUninstallReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUninstallResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLibraryUninstallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void libraryUpgradeAll(cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLibraryUpgradeAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void librarySearch(cc.arduino.core.rpc.Lib.LibrarySearchReq request,
        io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibrarySearchResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLibrarySearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The main Arduino Platform Service
   * </pre>
   */
  public static final class ArduinoCoreBlockingStub extends io.grpc.stub.AbstractStub<ArduinoCoreBlockingStub> {
    private ArduinoCoreBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArduinoCoreBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArduinoCoreBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArduinoCoreBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start a new instance of the Arduino Core Service
     * </pre>
     */
    public cc.arduino.core.rpc.Commands.InitResp init(cc.arduino.core.rpc.Commands.InitReq request) {
      return blockingUnaryCall(
          getChannel(), getInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Destroy an instance of the Arduino Core Service
     * </pre>
     */
    public cc.arduino.core.rpc.Commands.DestroyResp destroy(cc.arduino.core.rpc.Commands.DestroyReq request) {
      return blockingUnaryCall(
          getChannel(), getDestroyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Rescan instance of the Arduino Core Service
     * </pre>
     */
    public cc.arduino.core.rpc.Commands.RescanResp rescan(cc.arduino.core.rpc.Commands.RescanReq request) {
      return blockingUnaryCall(
          getChannel(), getRescanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update package index of the Arduino Core Service
     * </pre>
     */
    public java.util.Iterator<cc.arduino.core.rpc.Commands.UpdateIndexResp> updateIndex(
        cc.arduino.core.rpc.Commands.UpdateIndexReq request) {
      return blockingServerStreamingCall(
          getChannel(), getUpdateIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Requests details about a board
     * </pre>
     */
    public cc.arduino.core.rpc.Board.BoardDetailsResp boardDetails(cc.arduino.core.rpc.Board.BoardDetailsReq request) {
      return blockingUnaryCall(
          getChannel(), getBoardDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Compile.CompileResp> compile(
        cc.arduino.core.rpc.Compile.CompileReq request) {
      return blockingServerStreamingCall(
          getChannel(), getCompileMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformInstallResp> platformInstall(
        cc.arduino.core.rpc.Core.PlatformInstallReq request) {
      return blockingServerStreamingCall(
          getChannel(), getPlatformInstallMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformDownloadResp> platformDownload(
        cc.arduino.core.rpc.Core.PlatformDownloadReq request) {
      return blockingServerStreamingCall(
          getChannel(), getPlatformDownloadMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformUninstallResp> platformUninstall(
        cc.arduino.core.rpc.Core.PlatformUninstallReq request) {
      return blockingServerStreamingCall(
          getChannel(), getPlatformUninstallMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Core.PlatformUpgradeResp> platformUpgrade(
        cc.arduino.core.rpc.Core.PlatformUpgradeReq request) {
      return blockingServerStreamingCall(
          getChannel(), getPlatformUpgradeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Upload.UploadResp> upload(
        cc.arduino.core.rpc.Upload.UploadReq request) {
      return blockingServerStreamingCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public cc.arduino.core.rpc.Core.PlatformSearchResp platformSearch(cc.arduino.core.rpc.Core.PlatformSearchReq request) {
      return blockingUnaryCall(
          getChannel(), getPlatformSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public cc.arduino.core.rpc.Core.PlatformListResp platformList(cc.arduino.core.rpc.Core.PlatformListReq request) {
      return blockingUnaryCall(
          getChannel(), getPlatformListMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryDownloadResp> libraryDownload(
        cc.arduino.core.rpc.Lib.LibraryDownloadReq request) {
      return blockingServerStreamingCall(
          getChannel(), getLibraryDownloadMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryInstallResp> libraryInstall(
        cc.arduino.core.rpc.Lib.LibraryInstallReq request) {
      return blockingServerStreamingCall(
          getChannel(), getLibraryInstallMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryUninstallResp> libraryUninstall(
        cc.arduino.core.rpc.Lib.LibraryUninstallReq request) {
      return blockingServerStreamingCall(
          getChannel(), getLibraryUninstallMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp> libraryUpgradeAll(
        cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq request) {
      return blockingServerStreamingCall(
          getChannel(), getLibraryUpgradeAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public cc.arduino.core.rpc.Lib.LibrarySearchResp librarySearch(cc.arduino.core.rpc.Lib.LibrarySearchReq request) {
      return blockingUnaryCall(
          getChannel(), getLibrarySearchMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The main Arduino Platform Service
   * </pre>
   */
  public static final class ArduinoCoreFutureStub extends io.grpc.stub.AbstractStub<ArduinoCoreFutureStub> {
    private ArduinoCoreFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArduinoCoreFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArduinoCoreFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArduinoCoreFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start a new instance of the Arduino Core Service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Commands.InitResp> init(
        cc.arduino.core.rpc.Commands.InitReq request) {
      return futureUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Destroy an instance of the Arduino Core Service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Commands.DestroyResp> destroy(
        cc.arduino.core.rpc.Commands.DestroyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Rescan instance of the Arduino Core Service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Commands.RescanResp> rescan(
        cc.arduino.core.rpc.Commands.RescanReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRescanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Requests details about a board
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Board.BoardDetailsResp> boardDetails(
        cc.arduino.core.rpc.Board.BoardDetailsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getBoardDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Core.PlatformSearchResp> platformSearch(
        cc.arduino.core.rpc.Core.PlatformSearchReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPlatformSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Core.PlatformListResp> platformList(
        cc.arduino.core.rpc.Core.PlatformListReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPlatformListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cc.arduino.core.rpc.Lib.LibrarySearchResp> librarySearch(
        cc.arduino.core.rpc.Lib.LibrarySearchReq request) {
      return futureUnaryCall(
          getChannel().newCall(getLibrarySearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT = 0;
  private static final int METHODID_DESTROY = 1;
  private static final int METHODID_RESCAN = 2;
  private static final int METHODID_UPDATE_INDEX = 3;
  private static final int METHODID_BOARD_DETAILS = 4;
  private static final int METHODID_COMPILE = 5;
  private static final int METHODID_PLATFORM_INSTALL = 6;
  private static final int METHODID_PLATFORM_DOWNLOAD = 7;
  private static final int METHODID_PLATFORM_UNINSTALL = 8;
  private static final int METHODID_PLATFORM_UPGRADE = 9;
  private static final int METHODID_UPLOAD = 10;
  private static final int METHODID_PLATFORM_SEARCH = 11;
  private static final int METHODID_PLATFORM_LIST = 12;
  private static final int METHODID_LIBRARY_DOWNLOAD = 13;
  private static final int METHODID_LIBRARY_INSTALL = 14;
  private static final int METHODID_LIBRARY_UNINSTALL = 15;
  private static final int METHODID_LIBRARY_UPGRADE_ALL = 16;
  private static final int METHODID_LIBRARY_SEARCH = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArduinoCoreImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArduinoCoreImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INIT:
          serviceImpl.init((cc.arduino.core.rpc.Commands.InitReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.InitResp>) responseObserver);
          break;
        case METHODID_DESTROY:
          serviceImpl.destroy((cc.arduino.core.rpc.Commands.DestroyReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.DestroyResp>) responseObserver);
          break;
        case METHODID_RESCAN:
          serviceImpl.rescan((cc.arduino.core.rpc.Commands.RescanReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.RescanResp>) responseObserver);
          break;
        case METHODID_UPDATE_INDEX:
          serviceImpl.updateIndex((cc.arduino.core.rpc.Commands.UpdateIndexReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Commands.UpdateIndexResp>) responseObserver);
          break;
        case METHODID_BOARD_DETAILS:
          serviceImpl.boardDetails((cc.arduino.core.rpc.Board.BoardDetailsReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Board.BoardDetailsResp>) responseObserver);
          break;
        case METHODID_COMPILE:
          serviceImpl.compile((cc.arduino.core.rpc.Compile.CompileReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Compile.CompileResp>) responseObserver);
          break;
        case METHODID_PLATFORM_INSTALL:
          serviceImpl.platformInstall((cc.arduino.core.rpc.Core.PlatformInstallReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformInstallResp>) responseObserver);
          break;
        case METHODID_PLATFORM_DOWNLOAD:
          serviceImpl.platformDownload((cc.arduino.core.rpc.Core.PlatformDownloadReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformDownloadResp>) responseObserver);
          break;
        case METHODID_PLATFORM_UNINSTALL:
          serviceImpl.platformUninstall((cc.arduino.core.rpc.Core.PlatformUninstallReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUninstallResp>) responseObserver);
          break;
        case METHODID_PLATFORM_UPGRADE:
          serviceImpl.platformUpgrade((cc.arduino.core.rpc.Core.PlatformUpgradeReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformUpgradeResp>) responseObserver);
          break;
        case METHODID_UPLOAD:
          serviceImpl.upload((cc.arduino.core.rpc.Upload.UploadReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Upload.UploadResp>) responseObserver);
          break;
        case METHODID_PLATFORM_SEARCH:
          serviceImpl.platformSearch((cc.arduino.core.rpc.Core.PlatformSearchReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformSearchResp>) responseObserver);
          break;
        case METHODID_PLATFORM_LIST:
          serviceImpl.platformList((cc.arduino.core.rpc.Core.PlatformListReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Core.PlatformListResp>) responseObserver);
          break;
        case METHODID_LIBRARY_DOWNLOAD:
          serviceImpl.libraryDownload((cc.arduino.core.rpc.Lib.LibraryDownloadReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryDownloadResp>) responseObserver);
          break;
        case METHODID_LIBRARY_INSTALL:
          serviceImpl.libraryInstall((cc.arduino.core.rpc.Lib.LibraryInstallReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryInstallResp>) responseObserver);
          break;
        case METHODID_LIBRARY_UNINSTALL:
          serviceImpl.libraryUninstall((cc.arduino.core.rpc.Lib.LibraryUninstallReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUninstallResp>) responseObserver);
          break;
        case METHODID_LIBRARY_UPGRADE_ALL:
          serviceImpl.libraryUpgradeAll((cc.arduino.core.rpc.Lib.LibraryUpgradeAllReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibraryUpgradeAllResp>) responseObserver);
          break;
        case METHODID_LIBRARY_SEARCH:
          serviceImpl.librarySearch((cc.arduino.core.rpc.Lib.LibrarySearchReq) request,
              (io.grpc.stub.StreamObserver<cc.arduino.core.rpc.Lib.LibrarySearchResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ArduinoCoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ArduinoCoreBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cc.arduino.core.rpc.Commands.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ArduinoCore");
    }
  }

  private static final class ArduinoCoreFileDescriptorSupplier
      extends ArduinoCoreBaseDescriptorSupplier {
    ArduinoCoreFileDescriptorSupplier() {}
  }

  private static final class ArduinoCoreMethodDescriptorSupplier
      extends ArduinoCoreBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ArduinoCoreMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ArduinoCoreGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArduinoCoreFileDescriptorSupplier())
              .addMethod(getInitMethod())
              .addMethod(getDestroyMethod())
              .addMethod(getRescanMethod())
              .addMethod(getUpdateIndexMethod())
              .addMethod(getBoardDetailsMethod())
              .addMethod(getCompileMethod())
              .addMethod(getPlatformInstallMethod())
              .addMethod(getPlatformDownloadMethod())
              .addMethod(getPlatformUninstallMethod())
              .addMethod(getPlatformUpgradeMethod())
              .addMethod(getUploadMethod())
              .addMethod(getPlatformSearchMethod())
              .addMethod(getPlatformListMethod())
              .addMethod(getLibraryDownloadMethod())
              .addMethod(getLibraryInstallMethod())
              .addMethod(getLibraryUninstallMethod())
              .addMethod(getLibraryUpgradeAllMethod())
              .addMethod(getLibrarySearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
