package com.meizu.cloud.pushsdk.e.c;

import com.meizu.cloud.pushsdk.e.d.k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private String f5814a;
    private int b = 0;
    private String c;
    private k d;

    public a() {
    }

    public String a() {
        return this.f5814a;
    }

    public int b() {
        return this.b;
    }

    public k c() {
        return this.d;
    }

    public a(k kVar) {
        this.d = kVar;
    }

    public void a(int i) {
        this.b = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public a(Throwable th) {
        super(th);
    }

    public void a(String str) {
        this.f5814a = str;
    }
}
