package com.assessement.service2;

import static com.assessement.service2.Service2Grpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: service2.proto")
public final class ReactorService2Grpc {
    private ReactorService2Grpc() {}

    public static ReactorService2Stub newReactorStub(io.grpc.Channel channel) {
        return new ReactorService2Stub(channel);
    }

    public static final class ReactorService2Stub extends io.grpc.stub.AbstractStub<ReactorService2Stub> {
        private Service2Grpc.Service2Stub delegateStub;

        private ReactorService2Stub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = Service2Grpc.newStub(channel);
        }

        private ReactorService2Stub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = Service2Grpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorService2Stub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorService2Stub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<Service2OuterClass.Service2Reply> getService2(reactor.core.publisher.Mono<Service2OuterClass.NoParams> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::getService2, getCallOptions());
        }

        public reactor.core.publisher.Mono<Service2OuterClass.Service2Reply> getService2(Service2OuterClass.NoParams reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::getService2, getCallOptions());
        }

    }

    public static abstract class Service2ImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<Service2OuterClass.Service2Reply> getService2(reactor.core.publisher.Mono<Service2OuterClass.NoParams> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            Service2Grpc.getGetService2Method(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            Service2OuterClass.NoParams,
                                            Service2OuterClass.Service2Reply>(
                                            this, METHODID_GET_SERVICE2)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_GET_SERVICE2 = 0;

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
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((Service2OuterClass.NoParams) request,
                            (io.grpc.stub.StreamObserver<Service2OuterClass.Service2Reply>) responseObserver,
                            serviceImpl::getService2);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @Override
        @SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

}
