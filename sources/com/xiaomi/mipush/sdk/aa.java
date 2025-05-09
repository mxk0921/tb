package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import com.xiaomi.push.ig;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C0853a f14705a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ig f669a;

    public aa(MiTinyDataClient.a.C0853a aVar, ig igVar) {
        this.f14705a = aVar;
        this.f669a = igVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14705a.f664a.add(this.f669a);
        this.f14705a.a();
    }
}
