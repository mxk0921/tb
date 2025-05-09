package com.vivo.push.model;

import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private String f14616a;
    private String d;
    private long b = -1;
    private int c = -1;
    private boolean e = false;
    private boolean f = false;

    public b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f14616a = str;
            return;
        }
        throw new IllegalAccessError("PushPackageInfo need a non-null pkgName.");
    }

    public final String a() {
        return this.f14616a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.f;
    }

    public final String toString() {
        return "PushPackageInfo{mPackageName=" + this.f14616a + ", mPushVersion=" + this.b + ", mPackageVersion=" + this.c + ", mInBlackList=" + this.e + ", mPushEnable=" + this.f + "}";
    }

    public final void a(long j) {
        this.b = j;
    }

    public final void b(boolean z) {
        this.f = z;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final void a(int i) {
        this.c = i;
    }

    public final void a(String str) {
        this.d = str;
    }
}
