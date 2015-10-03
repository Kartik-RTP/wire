// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto at 43:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import okio.ByteString;

public final class C extends Message<C, C.Builder> {
  public static final ProtoAdapter<C> ADAPTER = ProtoAdapter.newMessageAdapter(C.class);

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_I = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer i;

  public C(Integer i) {
    this(i, ByteString.EMPTY);
  }

  public C(Integer i, ByteString unknownFields) {
    super(unknownFields);
    this.i = i;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.i = i;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof C)) return false;
    C o = (C) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(i, o.i);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (i != null ? i.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<C, Builder> {
    public Integer i;

    public Builder() {
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    @Override
    public C build() {
      return new C(i, buildUnknownFields());
    }
  }
}
