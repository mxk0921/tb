package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f14649a = new Handler(Looper.getMainLooper());
    private static final HandlerThread b;
    private static final Handler c;

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        b = handlerThread;
        handlerThread.start();
        c = new u(handlerThread.getLooper());
    }

    public static void a(s sVar) {
        if (sVar == null) {
            u.a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int a2 = sVar.a();
        Message message = new Message();
        message.what = a2;
        message.obj = sVar;
        c.sendMessageDelayed(message, 0L);
    }

    public static void b(Runnable runnable) {
        f14649a.post(runnable);
    }

    public static void c(Runnable runnable) {
        Handler handler = c;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void a(Runnable runnable) {
        Handler handler = c;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 15000L);
    }
}
