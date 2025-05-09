package com.xiaomi.clientreport.manager;

import com.xiaomi.clientreport.data.EventClientReport;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EventClientReport f14683a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ a f648a;

    public b(a aVar, EventClientReport eventClientReport) {
        this.f648a = aVar;
        this.f14683a = eventClientReport;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f648a.b(this.f14683a);
    }
}
