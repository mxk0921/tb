package com.vivo.push;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.restructure.a;
import com.vivo.push.util.ag;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f14552a;
    final /* synthetic */ z b;

    public aa(z zVar, String str) {
        this.b = zVar;
        this.f14552a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        Context b = a.a().b();
        if (b != null) {
            if (m.a().f()) {
                j = 488;
            } else {
                j = 341;
            }
            if (!TextUtils.isEmpty(this.f14552a) && ag.a(b, b.getPackageName(), this.f14552a, j)) {
                a.a().e().e();
                this.b.d = "";
            }
        }
    }
}
