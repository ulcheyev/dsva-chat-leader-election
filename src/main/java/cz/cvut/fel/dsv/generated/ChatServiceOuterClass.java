// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatService.proto

// Protobuf Java Version: 3.25.0
package generated;

public final class ChatServiceOuterClass {
  private ChatServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generated_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generated_ChatMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generated_RoomRequestMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generated_RoomRequestMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generated_RoomResponseMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generated_RoomResponseMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generated_RoomChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generated_RoomChatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ChatService.proto\022\tgenerated\"6\n\013ChatMe" +
      "ssage\022\026\n\016senderUsername\030\001 \001(\t\022\017\n\007message" +
      "\030\002 \001(\t\">\n\022RoomRequestMessage\022\020\n\010roomName" +
      "\030\001 \001(\t\022\026\n\016senderUsername\030\002 \001(\t\"\'\n\023RoomRe" +
      "sponseMessage\022\020\n\010response\030\001 \001(\t\"D\n\017RoomC" +
      "hatMessage\022#\n\003msg\030\001 \001(\0132\026.generated.Chat" +
      "Message\022\014\n\004room\030\002 \001(\t2\262\002\n\013ChatService\022K\n" +
      "\ncreateRoom\022\035.generated.RoomRequestMessa" +
      "ge\032\036.generated.RoomResponseMessage\022I\n\njo" +
      "inToRoom\022\035.generated.RoomRequestMessage\032" +
      "\032.generated.RoomChatMessage0\001\022O\n\021sendMes" +
      "sageToRoom\022\032.generated.RoomChatMessage\032\036" +
      ".generated.RoomResponseMessage\022:\n\004chat\022\026" +
      ".generated.ChatMessage\032\026.generated.ChatM" +
      "essage(\0010\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_generated_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_generated_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generated_ChatMessage_descriptor,
        new java.lang.String[] { "SenderUsername", "Message", });
    internal_static_generated_RoomRequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_generated_RoomRequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generated_RoomRequestMessage_descriptor,
        new java.lang.String[] { "RoomName", "SenderUsername", });
    internal_static_generated_RoomResponseMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_generated_RoomResponseMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generated_RoomResponseMessage_descriptor,
        new java.lang.String[] { "Response", });
    internal_static_generated_RoomChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_generated_RoomChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generated_RoomChatMessage_descriptor,
        new java.lang.String[] { "Msg", "Room", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
