package com.uc.webview.internal.setup.component;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class m {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Handler f14430a;

        static {
            HandlerThread handlerThread = new HandlerThread("U4Pars.WD");
            handlerThread.start();
            f14430a = new Handler(handlerThread.getLooper());
        }
    }

    public static void a(Runnable runnable, int i) {
        a.f14430a.removeCallbacks(runnable);
        long j = i;
        y.a(j);
        a.f14430a.postDelayed(runnable, j);
    }

    public static void a(Runnable runnable) {
        a.f14430a.removeCallbacks(runnable);
    }
}
