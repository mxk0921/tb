package com.vivo.push;

import android.os.SystemClock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private volatile long f14677a = -1;

    public final synchronized boolean a() {
        boolean z;
        long j = this.f14677a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j == -1 || elapsedRealtime <= j || elapsedRealtime >= j + 2000) {
            z = false;
        } else {
            z = true;
        }
        this.f14677a = SystemClock.elapsedRealtime();
        return z;
    }
}
