package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f15003a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1482a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public o(n nVar, String str, String str2, String str3) {
        this.f15003a = nVar;
        this.f1482a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        context = this.f15003a.f1479a;
        SharedPreferences.Editor edit = context.getSharedPreferences(this.f1482a, 4).edit();
        edit.putString(this.b, this.c);
        edit.commit();
    }
}
