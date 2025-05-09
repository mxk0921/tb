package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f14823a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f840a;

    public dg(Context context, long j) {
        this.f840a = context;
        this.f14823a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            de.c(this.f840a, this.f14823a);
        } catch (Exception e) {
            b.m410a("DisconnectStatsSP onReconnection exception: " + e.getMessage());
        }
    }
}
