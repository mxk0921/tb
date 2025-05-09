package com.vivo.push.restructure.a.a;

import com.vivo.push.PushClient;
import com.vivo.push.restructure.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f14627a;
    final /* synthetic */ String b;
    final /* synthetic */ e c;

    public f(e eVar, int i, String str) {
        this.c = eVar;
        this.f14627a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f14627a;
        if (i == 3) {
            PushClient.getInstance(a.a().b()).unBindAlias(this.b, null);
        } else if (i == 4) {
            PushClient.getInstance(a.a().b()).delTopic(this.b, null);
        }
    }
}
