// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChatService.proto

// Protobuf Java Version: 3.25.0
package generated;

public interface RemoteResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:generated.RemoteResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool added = 1;</code>
   * @return The added.
   */
  boolean getAdded();

  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  java.util.List<generated.Remote> 
      getRemotesList();
  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  generated.Remote getRemotes(int index);
  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  int getRemotesCount();
  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  java.util.List<? extends generated.RemoteOrBuilder> 
      getRemotesOrBuilderList();
  /**
   * <code>repeated .generated.Remote remotes = 2;</code>
   */
  generated.RemoteOrBuilder getRemotesOrBuilder(
      int index);
}
