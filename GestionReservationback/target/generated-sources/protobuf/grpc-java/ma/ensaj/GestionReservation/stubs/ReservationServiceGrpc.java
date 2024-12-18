package ma.ensaj.GestionReservation.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: ReservationService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.CreateReservationRequest,
      ma.ensaj.GestionReservation.stubs.ReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = ma.ensaj.GestionReservation.stubs.CreateReservationRequest.class,
      responseType = ma.ensaj.GestionReservation.stubs.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.CreateReservationRequest,
      ma.ensaj.GestionReservation.stubs.ReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.CreateReservationRequest, ma.ensaj.GestionReservation.stubs.ReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
          ReservationServiceGrpc.getCreateReservationMethod = getCreateReservationMethod =
              io.grpc.MethodDescriptor.<ma.ensaj.GestionReservation.stubs.CreateReservationRequest, ma.ensaj.GestionReservation.stubs.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.CreateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("CreateReservation"))
              .build();
        }
      }
    }
    return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.UpdateReservationRequest,
      ma.ensaj.GestionReservation.stubs.ReservationResponse> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = ma.ensaj.GestionReservation.stubs.UpdateReservationRequest.class,
      responseType = ma.ensaj.GestionReservation.stubs.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.UpdateReservationRequest,
      ma.ensaj.GestionReservation.stubs.ReservationResponse> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.UpdateReservationRequest, ma.ensaj.GestionReservation.stubs.ReservationResponse> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
          ReservationServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod =
              io.grpc.MethodDescriptor.<ma.ensaj.GestionReservation.stubs.UpdateReservationRequest, ma.ensaj.GestionReservation.stubs.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("UpdateReservation"))
              .build();
        }
      }
    }
    return getUpdateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest,
      ma.ensaj.GestionReservation.stubs.ReservationResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest.class,
      responseType = ma.ensaj.GestionReservation.stubs.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest,
      ma.ensaj.GestionReservation.stubs.ReservationResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest, ma.ensaj.GestionReservation.stubs.ReservationResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod =
              io.grpc.MethodDescriptor.<ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest, ma.ensaj.GestionReservation.stubs.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservation"))
              .build();
        }
      }
    }
    return getDeleteReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest,
      ma.ensaj.GestionReservation.stubs.ReservationResponse> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservationById",
      requestType = ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest.class,
      responseType = ma.ensaj.GestionReservation.stubs.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest,
      ma.ensaj.GestionReservation.stubs.ReservationResponse> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest, ma.ensaj.GestionReservation.stubs.ReservationResponse> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod =
              io.grpc.MethodDescriptor.<ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest, ma.ensaj.GestionReservation.stubs.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.ReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservationById"))
              .build();
        }
      }
    }
    return getGetReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest,
      ma.ensaj.GestionReservation.stubs.ReservationsResponse> getGetReservationsByClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservationsByClient",
      requestType = ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest.class,
      responseType = ma.ensaj.GestionReservation.stubs.ReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest,
      ma.ensaj.GestionReservation.stubs.ReservationsResponse> getGetReservationsByClientMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest, ma.ensaj.GestionReservation.stubs.ReservationsResponse> getGetReservationsByClientMethod;
    if ((getGetReservationsByClientMethod = ReservationServiceGrpc.getGetReservationsByClientMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationsByClientMethod = ReservationServiceGrpc.getGetReservationsByClientMethod) == null) {
          ReservationServiceGrpc.getGetReservationsByClientMethod = getGetReservationsByClientMethod =
              io.grpc.MethodDescriptor.<ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest, ma.ensaj.GestionReservation.stubs.ReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReservationsByClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.ReservationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservationsByClient"))
              .build();
        }
      }
    }
    return getGetReservationsByClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest,
      ma.ensaj.GestionReservation.stubs.ReservationsResponse> getGetReservationsByDateRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservationsByDateRange",
      requestType = ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest.class,
      responseType = ma.ensaj.GestionReservation.stubs.ReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest,
      ma.ensaj.GestionReservation.stubs.ReservationsResponse> getGetReservationsByDateRangeMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest, ma.ensaj.GestionReservation.stubs.ReservationsResponse> getGetReservationsByDateRangeMethod;
    if ((getGetReservationsByDateRangeMethod = ReservationServiceGrpc.getGetReservationsByDateRangeMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationsByDateRangeMethod = ReservationServiceGrpc.getGetReservationsByDateRangeMethod) == null) {
          ReservationServiceGrpc.getGetReservationsByDateRangeMethod = getGetReservationsByDateRangeMethod =
              io.grpc.MethodDescriptor.<ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest, ma.ensaj.GestionReservation.stubs.ReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReservationsByDateRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.ReservationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservationsByDateRange"))
              .build();
        }
      }
    }
    return getGetReservationsByDateRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest,
      ma.ensaj.GestionReservation.stubs.ReservationsResponse> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllReservations",
      requestType = ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest.class,
      responseType = ma.ensaj.GestionReservation.stubs.ReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest,
      ma.ensaj.GestionReservation.stubs.ReservationsResponse> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest, ma.ensaj.GestionReservation.stubs.ReservationsResponse> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
          ReservationServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod =
              io.grpc.MethodDescriptor.<ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest, ma.ensaj.GestionReservation.stubs.ReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.ensaj.GestionReservation.stubs.ReservationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetAllReservations"))
              .build();
        }
      }
    }
    return getGetAllReservationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub>() {
        @java.lang.Override
        public ReservationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceStub(channel, callOptions);
        }
      };
    return ReservationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub>() {
        @java.lang.Override
        public ReservationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceBlockingStub(channel, callOptions);
        }
      };
    return ReservationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub>() {
        @java.lang.Override
        public ReservationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceFutureStub(channel, callOptions);
        }
      };
    return ReservationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createReservation(ma.ensaj.GestionReservation.stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     */
    default void updateReservation(ma.ensaj.GestionReservation.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    /**
     */
    default void deleteReservation(ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    /**
     */
    default void getReservationById(ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    /**
     */
    default void getReservationsByClient(ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationsByClientMethod(), responseObserver);
    }

    /**
     */
    default void getReservationsByDateRange(ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReservationsByDateRangeMethod(), responseObserver);
    }

    /**
     */
    default void getAllReservations(ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReservationService.
   */
  public static abstract class ReservationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReservationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReservationService.
   */
  public static final class ReservationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReservationServiceStub> {
    private ReservationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createReservation(ma.ensaj.GestionReservation.stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReservation(ma.ensaj.GestionReservation.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationById(ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationsByClient(ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReservationsByClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationsByDateRange(ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReservationsByDateRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllReservations(ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReservationService.
   */
  public static final class ReservationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.ensaj.GestionReservation.stubs.ReservationResponse createReservation(ma.ensaj.GestionReservation.stubs.CreateReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.GestionReservation.stubs.ReservationResponse updateReservation(ma.ensaj.GestionReservation.stubs.UpdateReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.GestionReservation.stubs.ReservationResponse deleteReservation(ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.GestionReservation.stubs.ReservationResponse getReservationById(ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.GestionReservation.stubs.ReservationsResponse getReservationsByClient(ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReservationsByClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.GestionReservation.stubs.ReservationsResponse getReservationsByDateRange(ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReservationsByDateRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.ensaj.GestionReservation.stubs.ReservationsResponse getAllReservations(ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReservationService.
   */
  public static final class ReservationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.GestionReservation.stubs.ReservationResponse> createReservation(
        ma.ensaj.GestionReservation.stubs.CreateReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.GestionReservation.stubs.ReservationResponse> updateReservation(
        ma.ensaj.GestionReservation.stubs.UpdateReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.GestionReservation.stubs.ReservationResponse> deleteReservation(
        ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.GestionReservation.stubs.ReservationResponse> getReservationById(
        ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.GestionReservation.stubs.ReservationsResponse> getReservationsByClient(
        ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReservationsByClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.GestionReservation.stubs.ReservationsResponse> getReservationsByDateRange(
        ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReservationsByDateRangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.ensaj.GestionReservation.stubs.ReservationsResponse> getAllReservations(
        ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RESERVATION = 0;
  private static final int METHODID_UPDATE_RESERVATION = 1;
  private static final int METHODID_DELETE_RESERVATION = 2;
  private static final int METHODID_GET_RESERVATION_BY_ID = 3;
  private static final int METHODID_GET_RESERVATIONS_BY_CLIENT = 4;
  private static final int METHODID_GET_RESERVATIONS_BY_DATE_RANGE = 5;
  private static final int METHODID_GET_ALL_RESERVATIONS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((ma.ensaj.GestionReservation.stubs.CreateReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((ma.ensaj.GestionReservation.stubs.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATIONS_BY_CLIENT:
          serviceImpl.getReservationsByClient((ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationsResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATIONS_BY_DATE_RANGE:
          serviceImpl.getReservationsByDateRange((ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationsResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest) request,
              (io.grpc.stub.StreamObserver<ma.ensaj.GestionReservation.stubs.ReservationsResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.ensaj.GestionReservation.stubs.CreateReservationRequest,
              ma.ensaj.GestionReservation.stubs.ReservationResponse>(
                service, METHODID_CREATE_RESERVATION)))
        .addMethod(
          getUpdateReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.ensaj.GestionReservation.stubs.UpdateReservationRequest,
              ma.ensaj.GestionReservation.stubs.ReservationResponse>(
                service, METHODID_UPDATE_RESERVATION)))
        .addMethod(
          getDeleteReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest,
              ma.ensaj.GestionReservation.stubs.ReservationResponse>(
                service, METHODID_DELETE_RESERVATION)))
        .addMethod(
          getGetReservationByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.ensaj.GestionReservation.stubs.GetReservationByIdRequest,
              ma.ensaj.GestionReservation.stubs.ReservationResponse>(
                service, METHODID_GET_RESERVATION_BY_ID)))
        .addMethod(
          getGetReservationsByClientMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.ensaj.GestionReservation.stubs.GetReservationsByClientRequest,
              ma.ensaj.GestionReservation.stubs.ReservationsResponse>(
                service, METHODID_GET_RESERVATIONS_BY_CLIENT)))
        .addMethod(
          getGetReservationsByDateRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.ensaj.GestionReservation.stubs.GetReservationsByDateRangeRequest,
              ma.ensaj.GestionReservation.stubs.ReservationsResponse>(
                service, METHODID_GET_RESERVATIONS_BY_DATE_RANGE)))
        .addMethod(
          getGetAllReservationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ma.ensaj.GestionReservation.stubs.GetAllReservationsRequest,
              ma.ensaj.GestionReservation.stubs.ReservationsResponse>(
                service, METHODID_GET_ALL_RESERVATIONS)))
        .build();
  }

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.ensaj.GestionReservation.stubs.ReservationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getCreateReservationMethod())
              .addMethod(getUpdateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .addMethod(getGetReservationByIdMethod())
              .addMethod(getGetReservationsByClientMethod())
              .addMethod(getGetReservationsByDateRangeMethod())
              .addMethod(getGetAllReservationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
