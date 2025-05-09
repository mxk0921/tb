package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ab implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MiTinyDataClient.a.C0853a f14706a;

    public ab(MiTinyDataClient.a.C0853a aVar) {
        this.f14706a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        if (this.f14706a.f664a.size() != 0) {
            this.f14706a.b();
            return;
        }
        scheduledFuture = this.f14706a.f665a;
        if (scheduledFuture != null) {
            scheduledFuture2 = this.f14706a.f665a;
            scheduledFuture2.cancel(false);
            this.f14706a.f665a = null;
        }
    }
}
