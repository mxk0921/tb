package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.bg;
import com.xiaomi.push.service.bm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ar extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ao f14720a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(ao aoVar, Handler handler) {
        super(handler);
        this.f14720a = aoVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Context context;
        Integer num;
        Context context2;
        Context context3;
        ao aoVar = this.f14720a;
        context = aoVar.f680a;
        aoVar.f684a = Integer.valueOf(bm.a(context).a());
        num = this.f14720a.f684a;
        if (num.intValue() != 0) {
            context2 = this.f14720a.f680a;
            context2.getContentResolver().unregisterContentObserver(this);
            context3 = this.f14720a.f680a;
            if (bg.b(context3)) {
                this.f14720a.m449c();
            }
        }
    }
}
