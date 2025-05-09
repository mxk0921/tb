package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ic;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ci implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jb f15098a;

    public ci(jb jbVar) {
        this.f15098a = jbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        byte[] a2 = jm.a(ai.a(this.f15098a.c(), this.f15098a.b(), this.f15098a, ic.Notification));
        context = ch.f15097a;
        if (context instanceof XMPushService) {
            context2 = ch.f15097a;
            ((XMPushService) context2).a(this.f15098a.c(), a2, true);
            return;
        }
        b.m410a("UNDatas UploadNotificationDatas failed because not xmsf");
    }
}
