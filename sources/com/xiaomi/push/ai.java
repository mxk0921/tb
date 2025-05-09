package com.xiaomi.push;

import android.content.SharedPreferences;
import com.xiaomi.push.ah;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ai extends ah.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ah f14752a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f723a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f724a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ah ahVar, ah.a aVar, boolean z, String str) {
        super(aVar);
        this.f14752a = ahVar;
        this.f724a = z;
        this.f723a = str;
    }

    @Override // com.xiaomi.push.ah.b
    public void a() {
        super.a();
    }

    @Override // com.xiaomi.push.ah.b
    public void b() {
        SharedPreferences sharedPreferences;
        if (!this.f724a) {
            sharedPreferences = this.f14752a.f719a;
            sharedPreferences.edit().putLong(this.f723a, System.currentTimeMillis()).commit();
        }
    }
}
