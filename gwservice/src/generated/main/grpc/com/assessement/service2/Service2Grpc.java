package com.assessement.service2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: service2.proto")
public final class Service2Grpc {

  private Service2Grpc() {}

  public static final String SERVICE_NAME = "com.assessement.service2.Service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.assessement.service2.Service2OuterClass.NoParams,
      com.assessement.service2.Service2OuterClass.Service2Reply> getGetService2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetService2",
      requestType = com.assessement.service2.Service2OuterClass.NoParams.class,
      responseType = com.assessement.service2.Service2OuterClass.Service2Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assessement.service2.Service2OuterClass.NoParams,
      com.assessement.service2.Service2OuterClass.Service2Reply> getGetService2Method() {
    io.grpc.MethodDescriptor<com.assessement.service2.Service2OuterClass.NoParams, com.assessement.service2.Service2OuterClass.Service2Reply> getGetService2Method;
    if ((getGetService2Method = Service2Grpc.getGetService2Method) == null) {
      synchronized (Service2Grpc.class) {
        if ((getGetService2Method = Service2Grpc.getGetService2Method) == null) {
          Service2Grpc.getGetService2Method = getGetService2Method =
              io.grpc.MethodDescriptor.<com.assessement.service2.Service2OuterClass.NoParams, com.assessement.service2.Service2OuterClass.Service2Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetService2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assessement.service2.Service2OuterClass.NoParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assessement.service2.Service2OuterClass.Service2Reply.getDefaultInstance()))
              .setSchemaDescriptor(new Service2MethodDescriptorSupplier("GetService2"))
              .build();
        }
      }
    }
    return getGetService2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service2Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Service2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Service2Stub>() {
        @Override
        public Service2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Service2Stub(channel, callOptions);
        }
      };
    return Service2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Service2BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Service2BlockingStub>() {
        @Override
        public Service2BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Service2BlockingStub(channel, callOptions);
        }
      };
    return Service2BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Service2FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Service2FutureStub>() {
        @Override
        public Service2FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Service2FutureStub(channel, callOptions);
        }
      };
    return Service2FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class Service2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void getService2(com.assessement.service2.Service2OuterClass.NoParams request,
        io.grpc.stub.StreamObserver<com.assessement.service2.Service2OuterClass.Service2Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetService2Method(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetService2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.assessement.service2.Service2OuterClass.NoParams,
                com.assessement.service2.Service2OuterClass.Service2Reply>(
                  this, METHODID_GET_SERVICE2)))
          .build();
    }
  }

  /**
   */
  public static final class Service2Stub extends io.grpc.stub.AbstractAsyncStub<Service2Stub> {
    private Service2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected Service2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Service2Stub(channel, callOptions);
    }

    /**
     */
    public void getService2(com.assessement.service2.Service2OuterClass.NoParams request,
        io.grpc.stub.StreamObserver<com.assessement.service2.Service2OuterClass.Service2Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetService2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Service2BlockingStub extends io.grpc.stub.AbstractBlockingStub<Service2BlockingStub> {
    private Service2BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected Service2BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Service2BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.assessement.service2.Service2OuterClass.Service2Reply getService2(com.assessement.service2.Service2OuterClass.NoParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetService2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service2FutureStub extends io.grpc.stub.AbstractFutureStub<Service2FutureStub> {
    private Service2FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected Service2FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Service2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assessement.service2.Service2OuterClass.Service2Reply> getService2(
        com.assessement.service2.Service2OuterClass.NoParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetService2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SERVICE2 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SERVICE2:
          serviceImpl.getService2((com.assessement.service2.Service2OuterClass.NoParams) request,
              (io.grpc.stub.StreamObserver<com.assessement.service2.Service2OuterClass.Service2Reply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service2BaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.assessement.service2.Service2OuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service2");
    }
  }

  private static final class Service2FileDescriptorSupplier
      extends Service2BaseDescriptorSupplier {
    Service2FileDescriptorSupplier() {}
  }

  private static final class Service2MethodDescriptorSupplier
      extends Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service2MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (Service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service2FileDescriptorSupplier())
              .addMethod(getGetService2Method())
              .build();
        }
      }
    }
    return result;
  }
}
