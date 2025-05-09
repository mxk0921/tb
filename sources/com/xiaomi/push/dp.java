package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f14831a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f849a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f850a;

    public dp(Context context, long j, boolean z) {
        this.f849a = context;
        this.f14831a = j;
        this.f850a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dn.j(this.f849a, this.f14831a, this.f850a);
        } catch (Exception e) {
            b.m410a("PowerStatsSP onReceiveMsg exception: " + e.getMessage());
        }
    }
}
