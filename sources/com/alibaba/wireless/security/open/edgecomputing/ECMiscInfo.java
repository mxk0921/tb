package com.alibaba.wireless.security.open.edgecomputing;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes.dex */
public class ECMiscInfo {

    /* renamed from: б  reason: contains not printable characters */
    static Handler f335 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static final boolean f336 = false;

    /* renamed from: г  reason: contains not printable characters */
    private static final String f337 = "ECMiscInfo";

    /* renamed from: д  reason: contains not printable characters */
    private static final int f338 = 0;

    /* renamed from: е  reason: contains not printable characters */
    private static final int f339 = 1;

    /* renamed from: ж  reason: contains not printable characters */
    private static final int f340 = 3;

    /* renamed from: з  reason: contains not printable characters */
    private static final int f341 = 4;

    /* renamed from: и  reason: contains not printable characters */
    private static final int f342 = 5;

    /* renamed from: й  reason: contains not printable characters */
    private static Context f343 = null;

    /* renamed from: ё  reason: contains not printable characters */
    private static final int f344 = 2;

    /* renamed from: а  reason: contains not printable characters */
    private final Handler f345 = new Handler(Looper.getMainLooper());

    /* renamed from: com.alibaba.wireless.security.open.edgecomputing.ECMiscInfo$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    private static class C0162 implements Application.ActivityLifecycleCallbacks {
        C0162(Context context) {
            if (ECMiscInfo.f335 == null) {
                HandlerThread handlerThread = new HandlerThread("EC-ALFC");
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                if (looper != null) {
                    ECMiscInfo.f335 = new Handler(looper);
                }
            }
            ProxyUtil.init(ECMiscInfo.f335);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ECMiscInfo.m215(activity, 0);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            ECMiscInfo.m215(activity, 5);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ECMiscInfo.m215(activity, 3);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            ECMiscInfo.m215(activity, 2);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            ECMiscInfo.m215(activity, 1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ECMiscInfo.m215(activity, 4);
        }
    }

    public static void registerAppLifeCyCleCallBack() {
        Context context;
        if (Build.VERSION.SDK_INT >= 14 && (context = C0165.m219()) != null) {
            Application application = context instanceof Application ? (Application) context : (Application) context.getApplicationContext();
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new C0162(context));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: б  reason: contains not printable characters */
    public static void m215(Activity activity, int i) {
        try {
            C0165.m221().doCommand(12611, activity, Integer.valueOf(i), activity.getClass().getCanonicalName(), f335);
        } catch (Exception unused) {
        }
    }
}
