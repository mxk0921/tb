package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dr implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f14833a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f853a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f854a;

    public dr(Context context, long j, boolean z) {
        this.f853a = context;
        this.f14833a = j;
        this.f854a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dn.l(this.f853a, this.f14833a, this.f854a);
        } catch (Exception e) {
            b.m410a("PowerStatsSP onPong exception: " + e.getMessage());
        }
    }
}
