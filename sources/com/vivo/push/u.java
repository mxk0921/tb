package com.vivo.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class u extends Handler {
    public u(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof s) {
            s sVar = (s) obj;
            com.vivo.push.util.u.c("PushClientThread", "PushClientThread-handleMessage, task = ".concat(String.valueOf(sVar)));
            sVar.run();
        }
    }
}
