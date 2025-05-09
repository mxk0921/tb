package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.ah;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ce extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f15095a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Notification f1619a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Context f1620a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1621a;
    final /* synthetic */ String b;

    public ce(int i, String str, Context context, String str2, Notification notification) {
        this.f15095a = i;
        this.f1621a = str;
        this.f1620a = context;
        this.b = str2;
        this.f1619a = notification;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        String b;
        b = cd.b(this.f15095a, this.f1621a);
        return b;
    }

    @Override // java.lang.Runnable
    public void run() {
        cd.c(this.f1620a, this.b, this.f15095a, this.f1621a, this.f1619a);
    }
}
