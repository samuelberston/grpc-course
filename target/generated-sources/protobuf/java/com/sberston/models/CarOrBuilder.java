// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/car.proto

package com.sberston.models;

public interface CarOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.Car)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string make = 1;</code>
   * @return The make.
   */
  java.lang.String getMake();
  /**
   * <code>string make = 1;</code>
   * @return The bytes for make.
   */
  com.google.protobuf.ByteString
      getMakeBytes();

  /**
   * <code>string model = 2;</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <code>string model = 2;</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <code>int32 year = 3;</code>
   * @return The year.
   */
  int getYear();

  /**
   * <code>.common.BodyStyle body_style = 4;</code>
   * @return The enum numeric value on the wire for bodyStyle.
   */
  int getBodyStyleValue();
  /**
   * <code>.common.BodyStyle body_style = 4;</code>
   * @return The bodyStyle.
   */
  com.sberston.models.BodyStyle getBodyStyle();
}
