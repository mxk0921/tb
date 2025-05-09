package com.uc.webview.base.task;

import android.os.Handler;
import android.os.HandlerThread;
import com.uc.webview.base.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f14292a;
    public Handler b;

    public f(String str) {
        HandlerThread handlerThread = new HandlerThread(str, 0);
        this.f14292a = handlerThread;
        handlerThread.start();
        this.b = new Handler(this.f14292a.getLooper());
        Log.d("Task.trd", "create: ".concat(String.valueOf(str)));
    }

    public static final String a(String str) {
        return "u4sdk-".concat(String.valueOf(str));
    }

    public final void finalize() throws Throwable {
        this.f14292a.quit();
    }
}
