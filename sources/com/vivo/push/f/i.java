package com.vivo.push.f;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f14599a;
    final /* synthetic */ com.vivo.push.b.i b;
    final /* synthetic */ h c;

    public i(h hVar, String str, com.vivo.push.b.i iVar) {
        this.c = hVar;
        this.f14599a = str;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        if (!TextUtils.isEmpty(this.f14599a)) {
            h hVar = this.c;
            PushMessageCallback pushMessageCallback = ((aa) hVar).b;
            context2 = ((s) hVar).f14645a;
            pushMessageCallback.onReceiveRegId(context2, this.f14599a);
        }
        h hVar2 = this.c;
        PushMessageCallback pushMessageCallback2 = ((aa) hVar2).b;
        context = ((s) hVar2).f14645a;
        pushMessageCallback2.onBind(context, this.b.i(), this.b.d());
    }
}
