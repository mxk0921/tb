package com.taobao.adaemon;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.adaemon.anr.ANRHacker;
import com.taobao.adaemon.power.CpuPerformance;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.atools.StaticHook;
import com.taobao.keepalive.KeepAliveManager;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.CallBack;
import tb.cc5;
import tb.f;
import tb.g91;
import tb.hkq;
import tb.hvd;
import tb.lef;
import tb.mf;
import tb.o41;
import tb.oao;
import tb.oxn;
import tb.qgg;
import tb.re;
import tb.s55;
import tb.sy9;
import tb.t2o;
import tb.ttt;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ADaemon {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOOST_LENGTH_LONG = 2;
    public static final int BOOST_LENGTH_SHORT = 1;
    private static final String KEY_DAY = "push_day";
    private static final String KEY_MINUTE = "push_minute";
    private static final String KEY_TIMES = "push_times";
    public static final int REASON_LIFECYCLE = 1;
    public static final int REASON_ND_PIC = 4;
    public static final int REASON_TAB2_AVATAR_BREATHING = 6;
    public static final int REASON_TAOLIVE = 2;
    public static final int REASON_TAOLIVE_NOTICE = 5;
    public static final int REASON_TAOLIVE_PLAYER = 3;
    private static final String TAG = "adaemon";
    public static volatile long appLaunchTimeInMill;
    private static Method keepAliveInitMethod;
    public static boolean traceEnabled;
    private static final AtomicBoolean IS_INITIALIZED = new AtomicBoolean(false);
    private static final byte[] TRACE_LOCK = {47, 115, 100, 99, 97, 114, 100, 47, 46, 116, 98, 95, 116, 114, 97, 99, 101};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements CallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6106a;

        public a(Context context) {
            this.f6106a = context;
        }

        @Override // org.android.agoo.common.CallBack
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
            }
        }

        @Override // org.android.agoo.common.CallBack
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else if (!com.taobao.accs.connection.state.a.v().A(this.f6106a)) {
                if (g.F(g.l(), "push", ADaemon.KEY_DAY, ADaemon.KEY_TIMES, ADaemon.KEY_MINUTE) >= oxn.s().A()) {
                    s55.i(ADaemon.TAG, "push execute limit", new Object[0]);
                } else if (!qgg.d().b(this.f6106a)) {
                    s55.i(ADaemon.TAG, "push execute limit, install", new Object[0]);
                } else {
                    ADaemon.access$000(this.f6106a);
                    g.J(this.f6106a, ADaemon.KEY_DAY, ADaemon.KEY_TIMES, ADaemon.KEY_MINUTE);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            }
        }
    }

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            startTargetProcess(context);
        }
    }

    private static boolean checkLockFrameReason(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d31862", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i < 1 || i > 6) {
            return false;
        }
        return true;
    }

    public static void dumpRecentMainLooperMsg(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774c7f95", new Object[]{new Long(j)});
        } else if (Build.VERSION.SDK_INT >= 26 && ttt.a("adaemon_dump_msg", 5000L)) {
            ANRHacker.u0().t0(j);
        }
    }

    public static boolean isChannelMemOptimizeEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10657e29", new Object[]{context})).booleanValue();
        }
        return true;
    }

    public static boolean isChannelNativeOptimizeEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51b19a55", new Object[]{context})).booleanValue();
        }
        return true;
    }

    public static boolean isProcessBackground(String str) {
        d process;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e5cef48", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (process = ProcessController.getInstance().getProcess(str)) != null && process.f()) {
            return process.d();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$boostCpu$5(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b444a7e9", new Object[]{new Integer(i)});
        } else {
            CpuPerformance.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initializeLifecycle$3(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c3df5", new Object[]{context});
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ANRHacker.u0().w0();
        }
        g91.a(context, true);
        g.w(null);
        enableMainLooperTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initializeLifecycle$4(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da5a8d9", new Object[]{new Integer(i), str});
        } else {
            LocalProcessMonitor.h0().H0(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$null$0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b132751", new Object[]{context});
        } else {
            CpuPerformance.b(context);
        }
    }

    public static boolean optANRNormal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b4aa9c4", new Object[0])).booleanValue();
        }
        if (!f.b() || !f.i()) {
            return false;
        }
        return true;
    }

    private static void registerPush(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfb6de4", new Object[]{context});
        } else {
            TaobaoRegister.registerPushListener(context, new a(context));
        }
    }

    public static void removeAllMainLooperCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c128b5ce", new Object[0]);
            return;
        }
        s55.i(TAG, "removeAllMainLooperCallbacks", new Object[0]);
        if (traceEnabled) {
            Trace.beginSection("ADaemon:removeAllMainLooperCallbacks()");
        }
        sy9.m().D();
        if (traceEnabled) {
            Trace.endSection();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class PatchReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(349175813);
        }

        public static /* synthetic */ Object ipc$super(PatchReceiver patchReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/ADaemon$PatchReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                s55.i("PatchReceiver", "action", intent.getAction());
                if (!oxn.s().y()) {
                    s55.i("PatchReceiver", "getPatchRestartSwitch not allowed", new Object[0]);
                    return;
                }
                boolean booleanExtra = intent.getBooleanExtra("triggered_from_app_after_instantpatch", false);
                boolean booleanExtra2 = intent.getBooleanExtra("triggered_from_app_background", false);
                boolean booleanExtra3 = intent.getBooleanExtra("instantpatch_channelProcNeedRestart", false);
                if (booleanExtra && booleanExtra2 && booleanExtra3) {
                    oao.e().a();
                }
            }
        }
    }

    public static void initialize(final Context context) {
        try {
            oxn.s().B(context);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        if (g.M(context)) {
            s55.i(TAG, "dual app", new Object[0]);
            return;
        }
        s55.i(TAG, "initialize LocalProcessMonitor start", new Object[0]);
        final boolean K = g.K(context);
        if (K && Build.VERSION.SDK_INT >= 26) {
            ANRHacker.u0().w0();
        }
        LocalProcessMonitor.h0().Q0(context);
        mf.l(new Runnable() { // from class: tb.w1
            @Override // java.lang.Runnable
            public final void run() {
                ADaemon.lambda$initialize$1(K, context);
            }
        });
        if (K) {
            Method method = keepAliveInitMethod;
            if (method != null) {
                try {
                    method.invoke(null, context);
                    s55.i(TAG, "initialize keepAliveInitMethod success", new Object[0]);
                } catch (Throwable th) {
                    s55.h(TAG, "initialize keepAliveInitMethod err", th, new Object[0]);
                }
            }
            if (oxn.s().u()) {
                s55.i(TAG, "start light process when launch, delay 3s", new Object[0]);
                LocalProcessMonitor.h0().R0(3000L, false);
            }
            registerPush(context);
            mf.l(new Runnable() { // from class: tb.x1
                @Override // java.lang.Runnable
                public final void run() {
                    ADaemon.lambda$initialize$2(context);
                }
            });
        }
    }

    public static void initializeLifecycle(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d544f1a7", new Object[]{context});
        } else if (!g.M(context) && context != null) {
            s55.i(TAG, "initialize activity lifecycle", new Object[0]);
            long currentTimeMillis = System.currentTimeMillis();
            if (appLaunchTimeInMill == 0) {
                appLaunchTimeInMill = currentTimeMillis;
            }
            oxn.s().M(context);
            mf.l(new Runnable() { // from class: tb.a2
                @Override // java.lang.Runnable
                public final void run() {
                    ADaemon.lambda$initializeLifecycle$3(context);
                }
            });
            LocalProcessMonitor.h0().N0(context);
            LocalProcessMonitor.h0().p0(false);
            try {
                com.taobao.tao.navigation.a.h(new hvd() { // from class: tb.b2
                    @Override // tb.hvd
                    public final void onTabChanged(int i, String str) {
                        ADaemon.lambda$initializeLifecycle$4(i, str);
                    }
                });
            } catch (Throwable th) {
                s55.h(TAG, "addOnTabChangeListener err", th, new Object[0]);
            }
        }
    }

    public static boolean isProcessAlive(String str) {
        d process;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb5e867d", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (process = ProcessController.getInstance().getProcess(str)) != null) {
            return process.f();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763af126", new Object[]{context});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.alibaba.android.instantpatch_action");
            context.registerReceiver(new PatchReceiver(), intentFilter);
        } catch (Throwable th) {
            s55.h(TAG, "register patch err", th, new Object[0]);
        }
    }

    public static boolean optPrewarmByProvider(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57fe0f88", new Object[]{context})).booleanValue();
        }
        try {
            o41.c(context);
            if (f.c(f.KEY_CLOSE_PROVIDER)) {
                return false;
            }
            return oxn.s().z();
        } catch (Throwable th) {
            s55.h(TAG, "optPrewarmByProvider err", th, new Object[0]);
            return false;
        }
    }

    public static boolean optProviderPreload(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80e8cfa0", new Object[]{context})).booleanValue();
        }
        try {
            o41.c(context);
            if (f.c(f.KEY_CLOSE_PROVIDER)) {
                return false;
            }
            return f.c(f.KEY_PROVIDER_PRELOAD);
        } catch (Throwable th) {
            s55.h(TAG, "optProviderPreload err", th, new Object[0]);
            return false;
        }
    }

    private static void enableMainLooperTrace() {
        try {
            File file = new File(new String(TRACE_LOCK));
            File file2 = new File("/data/local/tmp/.trace_adaemon");
            if (file.exists() || file2.exists()) {
                traceEnabled = true;
                Looper mainLooper = Looper.getMainLooper();
                Field i = StaticHook.i(Looper.class, "mTraceTag");
                i.setAccessible(true);
                s55.i(TAG, "trace mTraceTagF：" + i.get(mainLooper), new Object[0]);
                i.set(mainLooper, 4097L);
                Field m = StaticHook.m(Trace.class, "sEnabledTags");
                m.setAccessible(true);
                s55.i(TAG, "trace sEnabledTagsF：" + m.get(null), new Object[0]);
                m.set(null, 4097L);
                Method g = StaticHook.g(Trace.class, "nativeGetEnabledTags", new Class[0]);
                g.setAccessible(true);
                s55.i(TAG, "trace nativeGetEnabledTagsMtd: " + g.invoke(null, new Object[0]), new Object[0]);
                Method g2 = StaticHook.g(Trace.class, "isTagEnabled", Long.TYPE);
                s55.i(TAG, "enableMainLooperTrace succ: " + g2.invoke(null, 4097L), new Object[0]);
            }
        } catch (Throwable th) {
            s55.h(TAG, "enableMainLooperTrace err", th, new Object[0]);
        }
    }

    public static void removeMainLooperCallback(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64cff8", new Object[]{runnable});
        } else if (runnable != null) {
            s55.i(TAG, "removeMainLooperCallback", "Runnable", runnable);
            if (traceEnabled) {
                Trace.beginSection("ADaemon:removeMainLooperCallback():" + runnable.hashCode());
            }
            sy9.m().E(runnable);
            if (traceEnabled) {
                Trace.endSection();
            }
        }
    }

    private static void startTargetProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97ba045", new Object[]{context});
            return;
        }
        s55.i(TAG, "startTargetProcess from push", new Object[0]);
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClass(context, TriggerService.class);
        intent.putExtra("type", 4);
        if (oxn.s().z()) {
            intent.putExtra(TriggerService.FLAG_AUTO_START, false);
            intent.putExtra(TriggerService.FLAG_PROVIDER_START, true);
            re.j(intent, new b(), 1);
            return;
        }
        lef.f(context, intent);
    }

    static {
        t2o.a(349175810);
        try {
            IpChange ipChange = KeepAliveManager.$ipChange;
            keepAliveInitMethod = KeepAliveManager.class.getDeclaredMethod("initInChannel", Context.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void boostCpu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e43fb77", new Object[]{new Integer(i)});
        } else if (i == 1 || i == 2) {
            final int i2 = i * 1000;
            try {
                int q = g.q();
                s55.i(TAG, "boostCpu", "devLevel", Integer.valueOf(q));
                if (q == 2) {
                    i2 = (int) (i2 * 1.5d);
                }
            } catch (Throwable th) {
                s55.h(TAG, "boostCpu err", th, new Object[0]);
            }
            mf.e().execute(new Runnable() { // from class: tb.y1
                @Override // java.lang.Runnable
                public final void run() {
                    ADaemon.lambda$boostCpu$5(i2);
                }
            });
        } else {
            s55.i(TAG, "boostCpu illegalArgs", "duration", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$1(boolean z, final Context context) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f8a6d95", new Object[]{new Boolean(z), context});
            return;
        }
        try {
            if (!IS_INITIALIZED.getAndSet(true)) {
                if (z) {
                    DaemonWorker.u().D(context);
                    hkq.b("accs", e.POINT_PROC_LAUNCHER, context.getPackageName() + ":channel", vu3.b.GEO_NOT_SUPPORT);
                    return;
                }
                String packageName = context.getPackageName();
                if (appLaunchTimeInMill > 0 && Build.VERSION.SDK_INT >= 30) {
                    long b2 = com.taobao.adaemon.a.b(context, context.getPackageName());
                    long j0 = LocalProcessMonitor.h0().j0(context);
                    boolean q0 = LocalProcessMonitor.h0().q0(context);
                    if (j0 > 0 && b2 > j0 && appLaunchTimeInMill > b2 && b2 - j0 < 5000 && appLaunchTimeInMill - b2 < 10000 && !q0) {
                        String i0 = LocalProcessMonitor.h0().i0(context);
                        s55.i(TAG, "restart after remove task", "page", i0);
                        packageName = packageName + "~~" + i0;
                        hkq.b("accs", e.POINT_PROC_LAUNCHER, packageName, i);
                        mf.e().execute(new Runnable() { // from class: tb.z1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ADaemon.lambda$null$0(context);
                            }
                        });
                    }
                }
                i = 0;
                hkq.b("accs", e.POINT_PROC_LAUNCHER, packageName, i);
                mf.e().execute(new Runnable() { // from class: tb.z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ADaemon.lambda$null$0(context);
                    }
                });
            }
        } catch (Throwable th) {
            s55.h(TAG, "initialize error", th, new Object[0]);
        }
    }

    public static void pauseFrameLock(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26149ba", new Object[]{new Integer(i)});
        } else if (!checkLockFrameReason(i)) {
            s55.i(TAG, "pauseFrameLock, illegalArgs", "reason", Integer.valueOf(i));
        } else {
            int g0 = LocalProcessMonitor.h0().g0();
            s55.i(TAG, "pauseFrameLock", "hash", Integer.valueOf(g0), "reason", Integer.valueOf(i));
            sy9.m().B(g0, i);
        }
    }

    public static void postMainLooper(Runnable runnable, long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2854be", new Object[]{runnable, jArr});
        } else if (runnable != null) {
            long j = (jArr == null || jArr.length != 1) ? 0L : jArr[0];
            s55.i(TAG, "postMainLooper", "Runnable", runnable, cc5.DELAY_MILLIS, Long.valueOf(j));
            sy9.m().C(runnable, j);
        }
    }

    public static void resumeFrameLock(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf73fb1", new Object[]{new Integer(i)});
        } else if (!checkLockFrameReason(i)) {
            s55.i(TAG, "resumeFrameLock, illegalArgs", "reason", Integer.valueOf(i));
        } else {
            int g0 = LocalProcessMonitor.h0().g0();
            s55.i(TAG, "resumeFrameLock", "hash", Integer.valueOf(g0), "reason", Integer.valueOf(i));
            sy9.m().F(g0, i);
        }
    }
}
