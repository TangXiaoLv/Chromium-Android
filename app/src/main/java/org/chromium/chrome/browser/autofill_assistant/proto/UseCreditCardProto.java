// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Fill a form with a credit card if there is, otherwise fail this action.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.UseCreditCardProto}
 */
public  final class UseCreditCardProto extends
    com.google.protobuf.GeneratedMessageLite<
        UseCreditCardProto, UseCreditCardProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.UseCreditCardProto)
    UseCreditCardProtoOrBuilder {
  private UseCreditCardProto() {
    prompt_ = "";
  }
  private int bitField0_;
  public static final int PROMPT_FIELD_NUMBER = 1;
  private java.lang.String prompt_;
  /**
   * <pre>
   * An optional message to show to the user when asking to select a card.
   * TODO(crbug.com/806868): Make the prompt a required field.
   * </pre>
   *
   * <code>optional string prompt = 1;</code>
   */
  public boolean hasPrompt() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * An optional message to show to the user when asking to select a card.
   * TODO(crbug.com/806868): Make the prompt a required field.
   * </pre>
   *
   * <code>optional string prompt = 1;</code>
   */
  public java.lang.String getPrompt() {
    return prompt_;
  }
  /**
   * <pre>
   * An optional message to show to the user when asking to select a card.
   * TODO(crbug.com/806868): Make the prompt a required field.
   * </pre>
   *
   * <code>optional string prompt = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPromptBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(prompt_);
  }
  /**
   * <pre>
   * An optional message to show to the user when asking to select a card.
   * TODO(crbug.com/806868): Make the prompt a required field.
   * </pre>
   *
   * <code>optional string prompt = 1;</code>
   */
  private void setPrompt(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    prompt_ = value;
  }
  /**
   * <pre>
   * An optional message to show to the user when asking to select a card.
   * TODO(crbug.com/806868): Make the prompt a required field.
   * </pre>
   *
   * <code>optional string prompt = 1;</code>
   */
  private void clearPrompt() {
    bitField0_ = (bitField0_ & ~0x00000001);
    prompt_ = getDefaultInstance().getPrompt();
  }
  /**
   * <pre>
   * An optional message to show to the user when asking to select a card.
   * TODO(crbug.com/806868): Make the prompt a required field.
   * </pre>
   *
   * <code>optional string prompt = 1;</code>
   */
  private void setPromptBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    prompt_ = value.toStringUtf8();
  }

  public static final int FORM_FIELD_ELEMENT_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto formFieldElement_;
  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
   */
  public boolean hasFormFieldElement() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getFormFieldElement() {
    return formFieldElement_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance() : formFieldElement_;
  }
  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
   */
  private void setFormFieldElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    formFieldElement_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
   */
  private void setFormFieldElement(
      org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
    formFieldElement_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
   */
  private void mergeFormFieldElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
    if (formFieldElement_ != null &&
        formFieldElement_ != org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.getDefaultInstance()) {
      formFieldElement_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.newBuilder(formFieldElement_).mergeFrom(value).buildPartial();
    } else {
      formFieldElement_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * A reference to the card number field in the form that should be filled.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
   */
  private void clearFormFieldElement() {  formFieldElement_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int STRINGS_FIELD_NUMBER = 8;
  private org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings strings_;
  /**
   * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
   */
  public boolean hasStrings() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings getStrings() {
    return strings_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings.getDefaultInstance() : strings_;
  }
  /**
   * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
   */
  private void setStrings(org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings value) {
    if (value == null) {
      throw new NullPointerException();
    }
    strings_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
   */
  private void setStrings(
      org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings.Builder builderForValue) {
    strings_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
   */
  private void mergeStrings(org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings value) {
    if (strings_ != null &&
        strings_ != org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings.getDefaultInstance()) {
      strings_ =
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings.newBuilder(strings_).mergeFrom(value).buildPartial();
    } else {
      strings_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
   */
  private void clearStrings() {  strings_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getPrompt());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(3, getFormFieldElement());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(8, getStrings());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getPrompt());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFormFieldElement());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, getStrings());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Fill a form with a credit card if there is, otherwise fail this action.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.UseCreditCardProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.UseCreditCardProto)
      org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * An optional message to show to the user when asking to select a card.
     * TODO(crbug.com/806868): Make the prompt a required field.
     * </pre>
     *
     * <code>optional string prompt = 1;</code>
     */
    public boolean hasPrompt() {
      return instance.hasPrompt();
    }
    /**
     * <pre>
     * An optional message to show to the user when asking to select a card.
     * TODO(crbug.com/806868): Make the prompt a required field.
     * </pre>
     *
     * <code>optional string prompt = 1;</code>
     */
    public java.lang.String getPrompt() {
      return instance.getPrompt();
    }
    /**
     * <pre>
     * An optional message to show to the user when asking to select a card.
     * TODO(crbug.com/806868): Make the prompt a required field.
     * </pre>
     *
     * <code>optional string prompt = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPromptBytes() {
      return instance.getPromptBytes();
    }
    /**
     * <pre>
     * An optional message to show to the user when asking to select a card.
     * TODO(crbug.com/806868): Make the prompt a required field.
     * </pre>
     *
     * <code>optional string prompt = 1;</code>
     */
    public Builder setPrompt(
        java.lang.String value) {
      copyOnWrite();
      instance.setPrompt(value);
      return this;
    }
    /**
     * <pre>
     * An optional message to show to the user when asking to select a card.
     * TODO(crbug.com/806868): Make the prompt a required field.
     * </pre>
     *
     * <code>optional string prompt = 1;</code>
     */
    public Builder clearPrompt() {
      copyOnWrite();
      instance.clearPrompt();
      return this;
    }
    /**
     * <pre>
     * An optional message to show to the user when asking to select a card.
     * TODO(crbug.com/806868): Make the prompt a required field.
     * </pre>
     *
     * <code>optional string prompt = 1;</code>
     */
    public Builder setPromptBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPromptBytes(value);
      return this;
    }

    /**
     * <pre>
     * A reference to the card number field in the form that should be filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
     */
    public boolean hasFormFieldElement() {
      return instance.hasFormFieldElement();
    }
    /**
     * <pre>
     * A reference to the card number field in the form that should be filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto getFormFieldElement() {
      return instance.getFormFieldElement();
    }
    /**
     * <pre>
     * A reference to the card number field in the form that should be filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
     */
    public Builder setFormFieldElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.setFormFieldElement(value);
      return this;
      }
    /**
     * <pre>
     * A reference to the card number field in the form that should be filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
     */
    public Builder setFormFieldElement(
        org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder builderForValue) {
      copyOnWrite();
      instance.setFormFieldElement(builderForValue);
      return this;
    }
    /**
     * <pre>
     * A reference to the card number field in the form that should be filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
     */
    public Builder mergeFormFieldElement(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto value) {
      copyOnWrite();
      instance.mergeFormFieldElement(value);
      return this;
    }
    /**
     * <pre>
     * A reference to the card number field in the form that should be filled.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementReferenceProto form_field_element = 3;</code>
     */
    public Builder clearFormFieldElement() {  copyOnWrite();
      instance.clearFormFieldElement();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
     */
    public boolean hasStrings() {
      return instance.hasStrings();
    }
    /**
     * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings getStrings() {
      return instance.getStrings();
    }
    /**
     * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
     */
    public Builder setStrings(org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings value) {
      copyOnWrite();
      instance.setStrings(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
     */
    public Builder setStrings(
        org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings.Builder builderForValue) {
      copyOnWrite();
      instance.setStrings(builderForValue);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
     */
    public Builder mergeStrings(org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings value) {
      copyOnWrite();
      instance.mergeStrings(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.AutofillStrings strings = 8;</code>
     */
    public Builder clearStrings() {  copyOnWrite();
      instance.clearStrings();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.UseCreditCardProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto other = (org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto) arg1;
        prompt_ = visitor.visitString(
            hasPrompt(), prompt_,
            other.hasPrompt(), other.prompt_);
        formFieldElement_ = visitor.visitMessage(formFieldElement_, other.formFieldElement_);
        strings_ = visitor.visitMessage(strings_, other.strings_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readString();
                bitField0_ |= 0x00000001;
                prompt_ = s;
                break;
              }
              case 26: {
                org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = formFieldElement_.toBuilder();
                }
                formFieldElement_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ElementReferenceProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(formFieldElement_);
                  formFieldElement_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 66: {
                org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = strings_.toBuilder();
                }
                strings_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.AutofillStrings.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(strings_);
                  strings_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.UseCreditCardProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UseCreditCardProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.UseCreditCardProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UseCreditCardProto> PARSER;

  public static com.google.protobuf.Parser<UseCreditCardProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

