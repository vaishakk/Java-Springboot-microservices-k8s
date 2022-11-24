package com.assessement.service1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: service1.proto")
public final class Service1Grpc {

  private Service1Grpc() {}

  public static final String SERVICE_NAME = "com.assessement.service1.Service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.assessement.service1.Service1OuterClass.NoParams,
      com.assessement.service1.Service1OuterClass.Service1Reply> getGetService1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetService1",
      requestType = com.assessement.service1.Service1OuterClass.NoParams.class,
      responseType = com.assessement.service1.Service1OuterClass.Service1Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.assessement.service1.Service1OuterClass.NoParams,
      com.assessement.service1.Service1OuterClass.Service1Reply> getGetService1Method() {
    io.grpc.MethodDescriptor<com.assessement.service1.Service1OuterClass.NoParams, com.assessement.service1.Service1OuterClass.Service1Reply> getGetService1Method;
    if ((getGetService1Method = Service1Grpc.getGetService1Method) == null) {
      synchronized (Service1Grpc.class) {
        if ((getGetService1Method = Service1Grpc.getGetService1Method) == null) {
          Service1Grpc.getGetService1Method = getGetService1Method =
              io.grpc.MethodDescriptor.<com.assessement.service1.Service1OuterClass.NoParams, com.assessement.service1.Service1OuterClass.Service1Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetService1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assessement.service1.Service1OuterClass.NoParams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.assessement.service1.Service1OuterClass.Service1Reply.getDefaultInstance()))
              .setSchemaDescriptor(new Service1MethodDescriptorSupplier("GetService1"))
              .build();
        }
      }
    }
    return getGetService1Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Service1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Service1Stub>() {
        @java.lang.Override
        public Service1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Service1Stub(channel, callOptions);
        }
      };
    return Service1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Service1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Service1BlockingStub>() {
        @java.lang.Override
        public Service1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Service1BlockingStub(channel, callOptions);
        }
      };
    return Service1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Service1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Service1FutureStub>() {
        @java.lang.Override
        public Service1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Service1FutureStub(channel, callOptions);
        }
      };
    return Service1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class Service1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void getService1(com.assessement.service1.Service1OuterClass.NoParams request,
        io.grpc.stub.StreamObserver<com.assessement.service1.Service1OuterClass.Service1Reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetService1Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetService1Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.assessement.service1.Service1OuterClass.NoParams,
                com.assessement.service1.Service1OuterClass.Service1Reply>(
                  this, METHODID_GET_SERVICE1)))
          .build();
    }
  }

  /**
   */
  public static final class Service1Stub extends io.grpc.stub.AbstractAsyncStub<Service1Stub> {
    private Service1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Service1Stub(channel, callOptions);
    }

    /**
     */
    public void getService1(com.assessement.service1.Service1OuterClass.NoParams request,
        io.grpc.stub.StreamObserver<com.assessement.service1.Service1OuterClass.Service1Reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetService1Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Service1BlockingStub extends io.grpc.stub.AbstractBlockingStub<Service1BlockingStub> {
    private Service1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Service1BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.assessement.service1.Service1OuterClass.Service1Reply getService1(com.assessement.service1.Service1OuterClass.NoParams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetService1Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service1FutureStub extends io.grpc.stub.AbstractFutureStub<Service1FutureStub> {
    private Service1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Service1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.assessement.service1.Service1OuterClass.Service1Reply> getService1(
        com.assessement.service1.Service1OuterClass.NoParams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetService1Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SERVICE1 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SERVICE1:
          serviceImpl.getService1((com.assessement.service1.Service1OuterClass.NoParams) request,
              (io.grpc.stub.StreamObserver<com.assessement.service1.Service1OuterClass.Service1Reply>) responseObserver);
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

  private static abstract class Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.assessement.service1.Service1OuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service1");
    }
  }

  private static final class Service1FileDescriptorSupplier
      extends Service1BaseDescriptorSupplier {
    Service1FileDescriptorSupplier() {}
  }

  private static final class Service1MethodDescriptorSupplier
      extends Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service1MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service1FileDescriptorSupplier())
              .addMethod(getGetService1Method())
              .build();
        }
      }
    }
    return result;
  }
}
