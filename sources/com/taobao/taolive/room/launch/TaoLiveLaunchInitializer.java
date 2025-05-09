package com.taobao.taolive.room.launch;

import android.app.Application;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.a;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.adapterimpl.global.TaoLiveApplication;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.o3s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TaoLiveLaunchInitializer implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaoLiveLaunchInitializer";
    private static final AtomicBoolean INIT = new AtomicBoolean(false);
    private static final AtomicBoolean ONCE_LAUNCHER = new AtomicBoolean(false);
    private static final AtomicBoolean ONCE_APP_BUNDLE = new AtomicBoolean(false);
    public static volatile long sLaunchInitializerTime = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.appbundle.a.c
        public void onFeatureComponentLoaded(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("334c129c", new Object[]{this, str});
                return;
            }
            o3s.b(TaoLiveLaunchInitializer.TAG, "app bundle onFeatureComponentLoaded, try to init live");
            TaoLiveLaunchInitializer.init();
        }
    }

    static {
        t2o.a(806355716);
    }

    public static synchronized void init() {
        synchronized (TaoLiveLaunchInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            boolean z = Looper.myLooper() == Looper.getMainLooper();
            TLog.loge("TaoLive", TAG, "init, isMainThread: " + z);
            if (z) {
                initInner();
            } else if (!Thread.currentThread().getName().contains("launcher-")) {
                initInner();
            } else if (ONCE_LAUNCHER.compareAndSet(false, true)) {
                initInner();
            } else {
                TLog.loge("TaoLive", TAG, "init, already once, no need to once again");
            }
            if (ONCE_APP_BUNDLE.compareAndSet(false, true)) {
                com.taobao.appbundle.a.Companion.a().p("taolive_android", new a());
            }
        }
    }

    private static synchronized void initInner() {
        synchronized (TaoLiveLaunchInitializer.class) {
            TLog.loge("TaoLive", TAG, "initInner, start. threadName: " + Thread.currentThread().getName());
            AtomicBoolean atomicBoolean = INIT;
            if (atomicBoolean.get()) {
                TLog.loge("TaoLive", TAG, "initInner, init finish, return");
                return;
            }
            sLaunchInitializerTime = System.currentTimeMillis();
            IpChange ipChange = TaoLiveApplication.$ipChange;
            Method declaredMethod = TaoLiveApplication.class.getDeclaredMethod("init", Application.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, Globals.getApplication());
            atomicBoolean.set(true);
            TLog.loge("TaoLive", TAG, "initInner, success");
        }
    }

    public static synchronized void init(Application application, HashMap<String, Object> hashMap) {
        synchronized (TaoLiveLaunchInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            } else {
                init();
            }
        }
    }
}
