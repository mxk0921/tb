package com.uc.webview.base.klog;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.klog.ILogger;
import com.uc.webview.base.task.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class KLogHandler {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private static final a f14276a = new a();
        private final ConcurrentLinkedQueue<com.uc.webview.base.klog.a> b = new ConcurrentLinkedQueue<>();
        private final AtomicBoolean c = new AtomicBoolean(false);

        private a() {
        }

        public static void a(com.uc.webview.base.klog.a aVar) {
            a aVar2 = f14276a;
            aVar2.b.add(aVar);
            if (!aVar2.c.get()) {
                aVar2.c.set(true);
                try {
                    if (Build.VERSION.SDK_INT < 30) {
                        AsyncTask.SERIAL_EXECUTOR.execute(aVar2);
                    } else {
                        b.a.f14282a.a(aVar2);
                    }
                } catch (Throwable th) {
                    Log.e("thread", "post to thread pool failed", th);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            do {
                try {
                    com.uc.webview.base.klog.a poll = this.b.poll();
                    while (poll != null) {
                        KLogHandler.b(poll);
                        poll = this.b.poll();
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            } while (this.b.peek() != null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static volatile boolean f14277a = GlobalSettings.getBoolValue(50);
        private static final GlobalSettings.Observer b;

        static {
            GlobalSettings.Observer observer = new GlobalSettings.Observer() { // from class: com.uc.webview.base.klog.KLogHandler.b.1
                @Override // com.uc.webview.base.GlobalSettings.Observer
                public final void onValueChanged(int i, String str) {
                    if (i == 50) {
                        boolean unused = b.f14277a = Boolean.valueOf(str).booleanValue();
                    } else if (i == 84) {
                        com.uc.webview.base.Log.a(Boolean.valueOf(str).booleanValue());
                    }
                }
            };
            b = observer;
            GlobalSettings.addObserver(observer);
            com.uc.webview.base.Log.a(GlobalSettings.getBoolValue(84));
        }
    }

    public static void a(boolean z) {
        boolean unused = b.f14277a = z;
        GlobalSettings.set(50, z);
    }

    public static /* synthetic */ void b(com.uc.webview.base.klog.a aVar) {
        ILogger iLogger = ILogger.Instance.get();
        if (iLogger != null) {
            int i = aVar.f;
            String str = aVar.g;
            String str2 = "[" + String.valueOf(aVar.e) + " " + aVar.c + " " + aVar.d + "] " + aVar.h;
            Throwable th = aVar.i;
            if (i == 1) {
                iLogger.i(str, str2, th);
            } else if (i == 2) {
                iLogger.w(str, str2, th);
            } else if (i != 3) {
                iLogger.d(str, str2, th);
            } else {
                iLogger.e(str, str2, th);
            }
        }
    }

    public static void postLogMessage(long j, int i, int i2, int i3, String str, String str2, Throwable th) {
        a(new com.uc.webview.base.klog.a(j, i, i2, i3, str, str2, th));
    }

    public static boolean a() {
        return b.f14277a;
    }

    public static void a(com.uc.webview.base.klog.a aVar) {
        if (b.f14277a) {
            a.a(aVar);
        }
    }
}
