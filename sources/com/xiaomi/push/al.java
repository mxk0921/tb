package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.push.ak;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class al extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak f14756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(ak akVar, Looper looper) {
        super(looper);
        this.f14756a = akVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ak.b bVar = (ak.b) message.obj;
        int i = message.what;
        if (i == 0) {
            bVar.a();
        } else if (i == 1) {
            bVar.mo599c();
        }
        super.handleMessage(message);
    }
}
