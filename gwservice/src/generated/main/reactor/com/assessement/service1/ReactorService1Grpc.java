package com.assessement.service1;

import static com.assessement.service1.Service1Grpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: service1.proto")
public final class ReactorService1Grpc {
    private ReactorService1Grpc() {}

    public static ReactorService1Stub newReactorStub(io.grpc.Channel channel) {
        return new ReactorService1Stub(channel);
    }

    public static final class ReactorService1Stub extends io.grpc.stub.AbstractStub<ReactorService1Stub> {
        private Service1Grpc.Service1Stub delegateStub;

        private ReactorService1Stub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = Service1Grpc.newStub(channel);
        }

        private ReactorService1Stub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = Service1Grpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorService1Stub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorService1Stub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<com.assessement.service1.Service1OuterClass.Service1Reply> getService1(reactor.core.publisher.Mono<com.assessement.service1.Service1OuterClass.NoParams> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::getService1, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.assessement.service1.Service1OuterClass.Service1Reply> getService1(com.assessement.service1.Service1OuterClass.NoParams reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::getService1, getCallOptions());
        }

    }

    public static abstract class Service1ImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<com.assessement.service1.Service1OuterClass.Service1Reply> getService1(reactor.core.publisher.Mono<com.assessement.service1.Service1OuterClass.NoParams> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.assessement.service1.Service1Grpc.getGetService1Method(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.assessement.service1.Service1OuterClass.NoParams,
                                            com.assessement.service1.Service1OuterClass.Service1Reply>(
                                            this, METHODID_GET_SERVICE1)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_GET_SERVICE1 = 0;

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
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.assessement.service1.Service1OuterClass.NoParams) request,
                            (io.grpc.stub.StreamObserver<com.assessement.service1.Service1OuterClass.Service1Reply>) responseObserver,
                            serviceImpl::getService1);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
