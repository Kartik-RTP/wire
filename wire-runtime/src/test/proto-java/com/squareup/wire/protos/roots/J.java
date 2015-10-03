// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto at 75:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class J extends Message<J, J.Builder> {
  public static final ProtoAdapter<J> ADAPTER = ProtoAdapter.newMessageAdapter(J.class);

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.protos.roots.K#ADAPTER"
  )
  public final K k;

  public J(K k) {
    this(k, ByteString.EMPTY);
  }

  public J(K k, ByteString unknownFields) {
    super(unknownFields);
    this.k = k;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.k = k;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof J)) return false;
    J o = (J) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(k, o.k);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (k != null ? k.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<J, Builder> {
    public K k;

    public Builder() {
    }

    public Builder k(K k) {
      this.k = k;
      return this;
    }

    @Override
    public J build() {
      return new J(k, buildUnknownFields());
    }
  }
}
