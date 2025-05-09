package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ep implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f14864a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f958a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f959a;
    final /* synthetic */ String b;

    public ep(Context context, String str, int i, String str2) {
        this.f958a = context;
        this.f959a = str;
        this.f14864a = i;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        eo.c(this.f958a, this.f959a, this.f14864a, this.b);
    }
}
