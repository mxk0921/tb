package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.PerfClientReport;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PerfClientReport f14684a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ a f649a;

    public c(a aVar, PerfClientReport perfClientReport) {
        this.f649a = aVar;
        this.f14684a = perfClientReport;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f649a.b(this.f14684a);
    }
}
