package com.loc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class cv {

    /* renamed from: a  reason: collision with root package name */
    cx f5640a;
    private ByteBuffer b;

    public cv(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        this.b = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.f5640a = new cx(this.b);
    }

    public final cv a() {
        this.f5640a.a(this.b);
        return this;
    }
}
