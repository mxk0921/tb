package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class df implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f14822a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ long f834a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f835a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f836a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f837a;
    final /* synthetic */ int b;

    /* renamed from: b  reason: collision with other field name */
    final /* synthetic */ long f838b;

    /* renamed from: b  reason: collision with other field name */
    final /* synthetic */ String f839b;
    final /* synthetic */ int c;

    public df(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        this.f835a = context;
        this.f836a = str;
        this.f837a = z;
        this.f834a = j;
        this.f14822a = i;
        this.f838b = j2;
        this.b = i2;
        this.f839b = str2;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            de.c(this.f835a, this.f836a, this.f837a, this.f834a, this.f14822a, this.f838b, this.b, this.f839b, this.c);
        } catch (Exception e) {
            b.m410a("DisconnectStatsSP onDisconnection exception: " + e.getMessage());
        }
    }
}
