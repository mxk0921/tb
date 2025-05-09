package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.b.i;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class af implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f14596a;
    final /* synthetic */ ae b;

    public af(ae aeVar, i iVar) {
        this.b = aeVar;
        this.f14596a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        ae aeVar = this.b;
        PushMessageCallback pushMessageCallback = ((aa) aeVar).b;
        context = ((s) aeVar).f14645a;
        pushMessageCallback.onUnBind(context, this.f14596a.i(), this.f14596a.d());
    }
}
