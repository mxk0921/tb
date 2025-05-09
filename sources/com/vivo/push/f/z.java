package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.b.r;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r f14606a;
    final /* synthetic */ y b;

    public z(y yVar, r rVar) {
        this.b = yVar;
        this.f14606a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        y yVar = this.b;
        PushMessageCallback pushMessageCallback = ((aa) yVar).b;
        context = ((s) yVar).f14645a;
        pushMessageCallback.onPublish(context, this.f14606a.i(), this.f14606a.h());
    }
}
