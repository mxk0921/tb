package com.taobao.calendar.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.taobao.login4android.broadcast.LoginAction;
import tb.ju2;
import tb.t2o;
import tb.ts2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarReceiver extends BroadcastReceiver {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ts2.c().b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10271a;

        static {
            int[] iArr = new int[LoginAction.values().length];
            f10271a = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10271a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final Handler f10272a;

        static {
            t2o.a(693108778);
            HandlerThread handlerThread = new HandlerThread("AsyncHandler");
            handlerThread.start();
            f10272a = new Handler(handlerThread.getLooper());
        }

        public static void a(Runnable runnable) {
            f10272a.post(runnable);
        }
    }

    static {
        t2o.a(693108775);
    }

    public final void a() {
        c.a(new a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LoginAction loginAction;
        new ju2(context);
        String action = intent.getAction();
        if (!TextUtils.isEmpty(action)) {
            try {
                loginAction = LoginAction.valueOf(action);
            } catch (Exception unused) {
                loginAction = null;
            }
            if (loginAction != null && b.f10271a[loginAction.ordinal()] == 1) {
                a();
            }
        }
    }
}
