package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* renamed from: com.xiaomi.push.do  reason: invalid class name */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Cdo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f14830a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f847a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f848a;

    public Cdo(Context context, long j, boolean z) {
        this.f847a = context;
        this.f14830a = j;
        this.f848a = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dn.i(this.f847a, this.f14830a, this.f848a);
        } catch (Exception e) {
            b.m410a("PowerStatsSP onSendMsg exception: " + e.getMessage());
        }
    }
}
