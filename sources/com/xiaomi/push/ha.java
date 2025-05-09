package com.xiaomi.push;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class ha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gx f14920a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1088a;

    public ha(gx gxVar, String str) {
        this.f14920a = gxVar;
        this.f1088a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        cs.a().a(this.f1088a, true);
    }
}
