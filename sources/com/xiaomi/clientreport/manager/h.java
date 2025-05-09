package com.xiaomi.clientreport.manager;

import com.xiaomi.push.bn;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f14689a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ bn f650a;

    public h(a aVar, bn bnVar) {
        this.f14689a = aVar;
        this.f650a = bnVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f650a.run();
    }
}
