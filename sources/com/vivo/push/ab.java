package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.u;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class ab {

    /* renamed from: a  reason: collision with root package name */
    protected Context f14553a;
    protected Handler b;
    private final Object c = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ab.this.b(message);
        }
    }

    public ab() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.b = new a(handlerThread.getLooper());
    }

    public final void a(Context context) {
        this.f14553a = context;
    }

    public abstract void b(Message message);

    public final void a(Message message) {
        synchronized (this.c) {
            try {
                Handler handler = this.b;
                if (handler == null) {
                    String simpleName = getClass().getSimpleName();
                    u.e(simpleName, ("Dead worker dropping a message: " + message.what) + " (Thread " + Thread.currentThread().getId() + f7l.BRACKET_END_STR);
                } else {
                    handler.sendMessage(message);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
