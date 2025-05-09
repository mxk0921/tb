package com.taobao.accs.init;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.ConnectionServiceManager;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.init.Launcher_InitAgooLifecycle;
import com.taobao.accs.ut.monitor.LauncherMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.adaemon.ADaemon;
import com.taobao.keepalive.KeepAliveManager;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.brt;
import tb.c71;
import tb.czv;
import tb.h5d;
import tb.m8l;
import tb.o41;
import tb.re;
import tb.t2o;
import tb.tv9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Launcher_InitAgooLifecycle implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Launcher_InitAgooLifecycle";
    public static Class<?> adaemonClazz;
    private static Method aliveInitMethod;
    public static long coldLaunchTimeInMill;
    public static boolean hasConnected;
    public static boolean mADaemonValid;
    private static final AtomicBoolean sInit = new AtomicBoolean();
    private String mAppKey;
    private int mMode = 0;
    private String mProcess;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f6062a;

        public b(long j) {
            this.f6062a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c71.c("accs", "cold_launch_time", "", this.f6062a);
            }
        }
    }

    private void coldLaunch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1442e8ca", new Object[]{this, context});
            return;
        }
        boolean isMainProcess = UtilityImpl.isMainProcess(context);
        if (h5d.g(context, 3)) {
            m8l.B();
            ConnectionServiceManager.getInstance().coldLaunch();
            if (isMainProcess) {
                coldLaunchTimeInMill = SystemClock.elapsedRealtime();
            }
        }
    }

    private Runnable initPushRunnable(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("5dfb25e3", new Object[]{this, application});
        }
        return new a(application);
    }

    public static synchronized void monitorConnected() {
        synchronized (Launcher_InitAgooLifecycle.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239f3fd6", new Object[0]);
            } else if (!hasConnected) {
                hasConnected = true;
                if (coldLaunchTimeInMill > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - coldLaunchTimeInMill;
                    ALog.e(TAG, "accs connected, spent " + elapsedRealtime, new Object[0]);
                    if (elapsedRealtime > 10000) {
                        c71.c("accs", "cold_launch_time", "", elapsedRealtime);
                    } else {
                        brt.h().schedule(new b(elapsedRealtime), 10L, TimeUnit.SECONDS);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f6061a;

        public a(Application application) {
            this.f6061a = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ALog.e(Launcher_InitAgooLifecycle.TAG, "reportToken by report_token_time", new Object[0]);
                Launcher_InitPush.manuMonitor.hasInitialized = true;
                Launcher_InitPush.init(this.f6061a, null);
            } catch (Throwable th) {
                ALog.e(Launcher_InitAgooLifecycle.TAG, "initPushRunnable err", th, new Object[0]);
            }
        }
    }

    private void checkAndInitPush(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733ee5bf", new Object[]{this, application});
            return;
        }
        ALog.e(TAG, "checkAndInitPush", new Object[0]);
        if (UtilityImpl.needPeriodicReport(application.getApplicationContext(), Constants.SP_KEY_REPORT_TOKEN_TIME)) {
            brt.h().schedule(initPushRunnable(application), 15L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$9(boolean z, Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ae15f4", new Object[]{this, new Boolean(z), application});
        } else if (z) {
            if (UtilityImpl.isChannelProcessAlive(application)) {
                com.taobao.accs.connection.state.a.v().c(StateMachine.Event.obtain(104));
            } else {
                com.taobao.accs.connection.state.a.v().c(StateMachine.Event.obtain(100));
            }
            checkAndInitPush(application);
        } else {
            ALog.e(TAG, "in " + this.mProcess, new Object[0]);
            if (UtilityImpl.isMainProcessAlive(application)) {
                com.taobao.accs.connection.state.a.v().c(StateMachine.Event.obtain(104));
            } else {
                com.taobao.accs.connection.state.a.v().c(StateMachine.Event.obtain(102));
            }
        }
    }

    private void launchInMain(Application application, HashMap<String, Object> hashMap) {
        ALog.e(TAG, "in main", new Object[0]);
        tv9.h().j(application);
        GlobalClientInfo.getInstance(application).setRemoteAppReceiver("default", Launcher_InitAccs.mAppReceiver);
        try {
            re.i(new ComponentName(application, "com.taobao.accs.AccsIPCProvider"), UtilityImpl.getChannelProcessName(application));
        } catch (Throwable th) {
            ALog.e(TAG, "addComponentAuthority error", th, new Object[0]);
        }
        new Launcher_InitAccs().initImpl(application, hashMap, 10);
        Method method = aliveInitMethod;
        if (method != null) {
            try {
                method.invoke(null, application);
            } catch (Exception e) {
                ALog.e(TAG, "alive initializeLifecycle error", e, new Object[0]);
            }
        }
    }

    public void init(final Application application, HashMap<String, Object> hashMap) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        o41.c(application);
        Context applicationContext = application.getApplicationContext();
        if (applicationContext != null) {
            GlobalClientInfo.mContext = applicationContext;
        }
        UtilityImpl.debug(GlobalClientInfo.getContext());
        parseMap(hashMap, application);
        if (!sInit.getAndSet(true)) {
            ALog.e(TAG, "init", new Object[0]);
            Log.e("NAccs", "Launcher_InitAgooLifecycle init");
            re.t(application);
            final boolean isMainProcess = UtilityImpl.isMainProcess(application);
            if (isMainProcess && mADaemonValid) {
                try {
                    adaemonClazz.getMethod("initializeLifecycle", Context.class).invoke(null, application);
                } catch (Exception e) {
                    ALog.e(TAG, "adaemon initializeLifecycle error", e, new Object[0]);
                }
            }
            coldLaunch(application);
            if (isMainProcess) {
                launchInMain(application, hashMap);
            }
            brt.d().execute(new Runnable() { // from class: tb.whg
                @Override // java.lang.Runnable
                public final void run() {
                    Launcher_InitAgooLifecycle.this.lambda$init$9(isMainProcess, application);
                }
            });
            AppMonitor.getInstance().commitStat(new LauncherMonitor(true, SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void parseMap(HashMap<String, Object> hashMap, Application application) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aafb363c", new Object[]{this, hashMap, application});
            return;
        }
        try {
            int intValue = ((Integer) hashMap.get(OConstant.LAUNCH_ENVINDEX)).intValue();
            this.mProcess = (String) hashMap.get("process");
            this.mAppKey = (String) hashMap.get(OConstant.LAUNCH_ONLINEAPPKEY);
            if (intValue == 1) {
                this.mAppKey = (String) hashMap.get(OConstant.LAUNCH_PREAPPKEY);
                this.mMode = 1;
            } else {
                boolean z2 = intValue == 2;
                if (intValue != 3) {
                    z = false;
                }
                if (z || z2) {
                    this.mAppKey = (String) hashMap.get(OConstant.LAUNCH_TESTAPPKEY);
                    this.mMode = 2;
                }
            }
        } catch (Throwable th) {
            ALog.e(TAG, "init get param error", th, new Object[0]);
        }
        if (TextUtils.isEmpty(this.mAppKey)) {
            this.mAppKey = "21646297";
            this.mMode = 0;
        }
        ACCSManager.setAppkey(application, this.mAppKey, this.mMode);
        if (UtilityImpl.debug(application)) {
            AccsClientConfig.mEnv = this.mMode;
            czv.k(application, this.mMode);
        }
    }

    static {
        t2o.a(343933120);
        try {
            IpChange ipChange = ADaemon.$ipChange;
            adaemonClazz = ADaemon.class;
            mADaemonValid = true;
        } catch (Exception unused) {
            mADaemonValid = false;
        }
        try {
            IpChange ipChange2 = KeepAliveManager.$ipChange;
            aliveInitMethod = KeepAliveManager.class.getDeclaredMethod("initInMainProcess", Context.class);
        } catch (Exception unused2) {
        }
        hasConnected = false;
    }
}
