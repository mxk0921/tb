package com.xiaomi.clientreport.manager;

import com.xiaomi.push.bo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f14690a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ bo f651a;

    public i(a aVar, bo boVar) {
        this.f14690a = aVar;
        this.f651a = boVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f651a.run();
    }
}
