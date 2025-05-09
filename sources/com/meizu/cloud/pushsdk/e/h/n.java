package com.meizu.cloud.pushsdk.e.h;

import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f5851a = new a();
    private boolean b;
    private long c;

    public void a() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.b && this.c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends n {
        @Override // com.meizu.cloud.pushsdk.e.h.n
        public void a() {
        }
    }
}
