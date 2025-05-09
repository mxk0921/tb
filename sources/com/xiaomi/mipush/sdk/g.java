package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ih;
import com.xiaomi.push.service.az;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g extends az.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f14729a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, int i, String str) {
        super(i, str);
        this.f14729a = fVar;
    }

    @Override // com.xiaomi.push.service.az.a
    public void onCallback() {
        Context context;
        boolean z;
        Context context2;
        context = this.f14729a.f703a;
        boolean a2 = az.a(context).a(ih.AggregatePushSwitch.a(), true);
        z = this.f14729a.f706a;
        if (z != a2) {
            this.f14729a.f706a = a2;
            context2 = this.f14729a.f703a;
            i.b(context2);
        }
    }
}
