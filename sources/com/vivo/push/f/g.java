package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSNotificationMessage f14598a;
    final /* synthetic */ e b;

    public g(e eVar, UPSNotificationMessage uPSNotificationMessage) {
        this.b = eVar;
        this.f14598a = uPSNotificationMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        e eVar = this.b;
        PushMessageCallback pushMessageCallback = ((aa) eVar).b;
        context = ((s) eVar).f14645a;
        pushMessageCallback.onNotificationMessageClicked(context, this.f14598a);
    }
}
