package com.mobile.auth;

import android.content.Context;
import com.cmic.sso.sdk.a;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0OOO00 {
    private static final ExecutorService O000000o = new ThreadPoolExecutor(0, 30, 60, TimeUnit.SECONDS, new SynchronousQueue());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class O000000o implements Runnable {
        private final Thread.UncaughtExceptionHandler O000000o;

        public O000000o() {
            this.O000000o = new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.O0OOO00.O000000o.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    th.printStackTrace();
                }
            };
        }

        public abstract void O000000o();

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setUncaughtExceptionHandler(this.O000000o);
            O000000o();
            Thread.currentThread().setUncaughtExceptionHandler(null);
        }

        public O000000o(final Context context, final a aVar) {
            this.O000000o = new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.O0OOO00.O000000o.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    aVar.a().O000000o.add(th);
                    O00O00o0.O000000o(context).O000000o("200025", "发生未知错误", aVar, null);
                }
            };
        }
    }

    public static void O000000o(O000000o o000000o) {
        try {
            O000000o.execute(o000000o);
        } catch (Exception e) {
            o000000o.O000000o.uncaughtException(Thread.currentThread(), e);
        }
    }
}
