package com.uc.webview.base;

import android.os.SystemClock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f14263a = System.currentTimeMillis();
    private long b = SystemClock.currentThreadTimeMillis();

    public final long a() {
        return System.currentTimeMillis() - this.f14263a;
    }

    public final String toString() {
        return String.format("milis: %d/%d", Long.valueOf(a()), Long.valueOf(SystemClock.currentThreadTimeMillis() - this.b));
    }
}
