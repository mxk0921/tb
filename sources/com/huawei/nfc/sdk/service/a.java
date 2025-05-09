package com.huawei.nfc.sdk.service;

import android.os.Bundle;
import tb.bzx;
import tb.l9b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l9b f5528a;
    final /* synthetic */ String b;
    final /* synthetic */ c c;

    public a(c cVar, l9b l9bVar, String str) {
        this.c = cVar;
        this.f5528a = l9bVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        ICUPOnlinePayService iCUPOnlinePayService;
        c cVar;
        ICUPOnlinePayService iCUPOnlinePayService2;
        bArr = this.c.f5530a;
        synchronized (bArr) {
            this.c.d = this.f5528a;
            this.c.n();
            iCUPOnlinePayService = this.c.c;
            if (iCUPOnlinePayService != null) {
                try {
                    iCUPOnlinePayService2 = this.c.c;
                    boolean supportCapacity = iCUPOnlinePayService2.supportCapacity(this.b);
                    l9b l9bVar = this.f5528a;
                    if (l9bVar != null) {
                        ((bzx) l9bVar).a(supportCapacity ? 1 : 0, new Bundle());
                    }
                    cVar = this.c;
                } catch (Exception unused) {
                    ((bzx) this.f5528a).a(0, new Bundle());
                    cVar = this.c;
                }
                cVar.l();
            }
        }
    }
}
