package com.vivo.push.util;

import android.content.Context;
import com.vivo.push.f.u;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f14671a;
    final /* synthetic */ p b;

    public q(p pVar, List list) {
        this.b = pVar;
        this.f14671a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InsideNotificationItem insideNotificationItem;
        long j;
        Context context;
        InsideNotificationItem insideNotificationItem2;
        long j2;
        int i;
        NotifyArriveCallbackByUser notifyArriveCallbackByUser;
        u.a aVar;
        insideNotificationItem = this.b.b;
        if (insideNotificationItem != null) {
            ad b = ad.b();
            j = this.b.c;
            b.a("com.vivo.push.notify_key", j);
            context = this.b.f14670a;
            List list = this.f14671a;
            insideNotificationItem2 = this.b.b;
            j2 = this.b.c;
            i = this.b.e;
            notifyArriveCallbackByUser = this.b.f;
            aVar = this.b.g;
            NotifyAdapterUtil.pushNotification(context, list, insideNotificationItem2, j2, i, notifyArriveCallbackByUser, aVar);
        }
    }
}
