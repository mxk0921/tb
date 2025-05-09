package com.xiaomi.push.service;

import com.xiaomi.push.ah;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class am extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f15046a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ aw f1555a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1556a;

    public am(String str, aw awVar, int i) {
        this.f1556a = str;
        this.f1555a = awVar;
        this.f15046a = i;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return this.f1556a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1555a.a(this.f15046a);
    }
}
