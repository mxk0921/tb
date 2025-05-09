package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14744a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Intent f714a;

    public y(Context context, Intent intent) {
        this.f14744a = context;
        this.f714a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f14744a.startService(this.f714a);
        } catch (Exception e) {
            b.m410a(e.getMessage());
        }
    }
}
