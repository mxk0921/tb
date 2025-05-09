package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f14832a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f851a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f852a;

    public dq(Context context, long j, boolean z) {
        this.f851a = context;
        this.f14832a = j;
        this.f852a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dn.k(this.f851a, this.f14832a, this.f852a);
        } catch (Exception e) {
            b.m410a("PowerStatsSP onPing exception: " + e.getMessage());
        }
    }
}
