package com.xiaomi.push;

import com.xiaomi.push.ak;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class am implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak.b f14757a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ak f730a;

    public am(ak akVar, ak.b bVar) {
        this.f730a = akVar;
        this.f14757a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f730a.a(this.f14757a);
    }
}
