package com.taobao.keepalive;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.adaemon.TriggerInstrumentation;
import com.taobao.atools.Constants;
import com.taobao.atools.StaticHook;
import com.taobao.keepalive.KeepAliveManager;
import com.taobao.keepalive.account.AccountProvider;
import com.taobao.keepalive.account.SyncService;
import com.taobao.keepalive.periodic.AliveReceiver;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.weex.utils.TBWXConfigManger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.c0;
import tb.cp;
import tb.cux;
import tb.d4y;
import tb.dux;
import tb.hkq;
import tb.izx;
import tb.k5y;
import tb.o41;
import tb.p01;
import tb.pxx;
import tb.qxx;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeepAliveManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILE_LAUNCH = "f_launch";
    public static final String FILE_RECENT_ENTRANCE = "f_recent_entrance";
    public static final String FILE_REMOVE_TASK = "f_remove_task";
    public static final String SP_KEY_APP_VER = "app_ver";
    public static final String SP_NAME_CHANNEL = "alive_channel";
    public static final String SP_NAME_MAIN = "alive_main";
    public static final String TAG = "KeepAliveManager";
    public static boolean isLaunched;
    public static final AtomicBoolean initMain = new AtomicBoolean();
    public static final BroadcastReceiver mReceiver = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(499122181);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/keepalive/KeepAliveManager$b");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    pxx.f26392a.e(KeepAliveManager.TAG, "ACTION_SCREEN_OFF", new Object[0]);
                } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                    pxx.f26392a.e(KeepAliveManager.TAG, "ACTION_SCREEN_ON", new Object[0]);
                } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                    pxx.f26392a.e(KeepAliveManager.TAG, "ACTION_USER_PRESENT", new Object[0]);
                    KeepAliveManager.access$100(context.getApplicationContext());
                }
            } catch (Throwable th) {
                pxx.f26392a.d(KeepAliveManager.TAG, "onReceive err", th, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f10865a = 0;
        public int b;
        public boolean c;

        static {
            t2o.a(499122182);
        }

        public static /* synthetic */ void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
                return;
            }
            cux.h(context, KeepAliveManager.FILE_LAUNCH, Process.myPid() + "");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            final Context applicationContext = activity.getApplicationContext();
            if (!KeepAliveManager.access$200()) {
                KeepAliveManager.access$202(true);
                izx.b().schedule(new Runnable() { // from class: tb.y1g
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeepAliveManager.c.b(applicationContext);
                    }
                }, 3L, TimeUnit.SECONDS);
            }
            int i = this.b + 1;
            this.b = i;
            if (i == 1) {
                izx.a().schedule(new Runnable() { // from class: tb.z1g
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeepAliveManager.c.c(applicationContext);
                    }
                }, 10L, TimeUnit.SECONDS);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                this.b--;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        public static void c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            } else if (k5y.a.f22424a.h(context)) {
                try {
                    pxx.f26392a.e(KeepAliveManager.TAG, "send recent finish broadcast", new Object[0]);
                    Intent intent = new Intent("tb.alive.recent.finish");
                    intent.setPackage(context.getPackageName());
                    context.sendBroadcast(intent);
                } catch (Exception e) {
                    pxx.f26392a.d(KeepAliveManager.TAG, "sendBroadcast err", e, new Object[0]);
                }
            }
        }

        public static void d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
                return;
            }
            try {
                Intent intent = new Intent("com.taobao.alive.kill.finish_now");
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                pxx.f26392a.d(KeepAliveManager.TAG, "onActivityStarted sendBroadcast err", th, new Object[0]);
            }
        }

        public final void e(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
                return;
            }
            try {
                k5y k5yVar = k5y.a.f22424a;
                if (!k5yVar.g(context)) {
                    pxx.f26392a.e(KeepAliveManager.TAG, "onActivityStopped switch off", new Object[0]);
                } else if (!TimeMeter.a("com.taobao.alive.kill.finish_delay", k5yVar.a(context) * 1000)) {
                    pxx.f26392a.e(KeepAliveManager.TAG, "ACTION_DELAY_FINISH freq", new Object[0]);
                } else {
                    Intent intent = new Intent("com.taobao.alive.kill.finish_delay");
                    intent.setPackage(context.getPackageName());
                    context.sendOrderedBroadcast(intent, null);
                    this.c = true;
                }
            } catch (Exception e) {
                pxx.f26392a.d(KeepAliveManager.TAG, "onBackState err", e, new Object[0]);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            int i = this.f10865a;
            this.f10865a = 1 + i;
            if (i == 0) {
                pxx pxxVar = pxx.f26392a;
                pxxVar.e(KeepAliveManager.TAG, "onForeground", new Object[0]);
                if (this.c) {
                    this.c = false;
                    pxxVar.e(KeepAliveManager.TAG, "send finish broad cast", new Object[0]);
                    final Context applicationContext = activity.getApplicationContext();
                    izx.a().execute(new Runnable() { // from class: tb.b2g
                        @Override // java.lang.Runnable
                        public final void run() {
                            KeepAliveManager.c.d(applicationContext);
                        }
                    });
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            int max = Math.max(0, this.f10865a - 1);
            this.f10865a = max;
            if (max == 0) {
                pxx.f26392a.e(KeepAliveManager.TAG, "onBackground", new Object[0]);
                final Context a2 = o41.a();
                izx.a().execute(new Runnable() { // from class: tb.a2g
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeepAliveManager.c.this.e(a2);
                    }
                });
            }
        }
    }

    static {
        t2o.a(499122179);
    }

    public static void a(Context context) {
        long j;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            if (k5y.a.f22424a.h(context)) {
                pxx pxxVar = pxx.f26392a;
                pxxVar.e(TAG, "addRecentEntrance", new Object[0]);
                String f = cux.f(context, FILE_RECENT_ENTRANCE, "-1");
                if ("-1".equals(f)) {
                    pxxVar.e(TAG, "recentStr err", new Object[0]);
                } else if (TextUtils.isEmpty(f) || Integer.parseInt(f) != Calendar.getInstance().get(6)) {
                    try {
                        j = Long.parseLong(cux.f(context, FILE_REMOVE_TASK, "-1"));
                    } catch (Throwable unused) {
                        j = 0;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j > 0 && currentTimeMillis > j) {
                        long j2 = currentTimeMillis - j;
                        try {
                            string = context.getSharedPreferences("keepalive", 4).getString("r_e_kill_delay", "2880");
                        } catch (Exception e) {
                            pxx.f26392a.d("RemoteConfig", "getConfigFromSP fail:", e, "key", "r_e_kill_delay");
                        }
                        if (j2 < Integer.parseInt(string) * 60000) {
                            pxx.f26392a.e(TAG, "addRecentEntrance, kill recently", "lastKillTime", Long.valueOf(j));
                            return;
                        }
                    }
                    Iterator it = ((ArrayList) cux.b(context)).iterator();
                    String str = "";
                    boolean z = false;
                    while (it.hasNext()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
                        if ("com.taobao.taobao".equals(runningAppProcessInfo.processName)) {
                            str = runningAppProcessInfo.pid + "";
                        } else if (runningAppProcessInfo.processName.endsWith(TBWXConfigManger.WX_SUPPORT_KEY)) {
                            z = true;
                        }
                    }
                    if (z) {
                        pxx.f26392a.e(TAG, "addRecentEntrance, support process alive", new Object[0]);
                        return;
                    }
                    String f2 = cux.f(context, FILE_LAUNCH, "");
                    if (TextUtils.isEmpty(str) || !str.equals(f2)) {
                        addRecentEntranceImpl(context);
                    } else {
                        pxx.f26392a.e(TAG, "addRecentEntrance, activity already started", "mainProcessPid", str, "lastMainPid", f2);
                    }
                } else {
                    pxxVar.c(TAG, "addRecentEntrance, already added today", new Object[0]);
                    hkq.b("keepalive", Constants.POINT_FULL_VERIFY, "recent added", vu3.b.GEO_NOT_SUPPORT);
                }
            }
        } catch (Throwable th) {
            pxx.f26392a.d(TAG, "addRecentEntrance err", th, new Object[0]);
        }
    }

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            recordLastRemoveTask(context);
        }
    }

    public static /* synthetic */ void access$100(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18144810", new Object[]{context});
        } else {
            addRecentEntrance(context);
        }
    }

    public static /* synthetic */ boolean access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue();
        }
        return isLaunched;
    }

    public static /* synthetic */ boolean access$202(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117a53d", new Object[]{new Boolean(z)})).booleanValue();
        }
        isLaunched = z;
        return z;
    }

    public static void addRecentEntrance(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6000c12f", new Object[]{context});
        } else if (Build.VERSION.SDK_INT >= 30) {
            izx.b().execute(new Runnable() { // from class: tb.nly
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.a(context);
                }
            });
        }
    }

    public static /* synthetic */ void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            AliveReceiver.b(context);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        ComponentName componentName = new ComponentName(context, AccountProvider.class);
        ComponentName componentName2 = new ComponentName(context, SyncService.class);
        if (k5y.a.f22424a.e(context)) {
            cux.g(context, componentName);
            cux.g(context, componentName2);
            accountSync(context);
            return;
        }
        cux.c(context, componentName);
        cux.c(context, componentName2);
    }

    public static void initInMainProcess(Context context) {
        if (initMain.getAndSet(true)) {
            pxx.f26392a.e(TAG, "main process has been initialized", new Object[0]);
            return;
        }
        pxx pxxVar = pxx.f26392a;
        pxxVar.e(TAG, "initInMainProcess", new Object[0]);
        recordLastRemoveTask(context);
        if (context instanceof Application) {
            Application application = (Application) context;
            try {
                Field e = StaticHook.e(Application.class, "mActivityLifecycleCallbacks");
                e.setAccessible(true);
                ArrayList arrayList = (ArrayList) e.get(application);
                pxxVar.e(TAG, "Add lifecycle", "lifecycleList is null", Boolean.valueOf(arrayList == null));
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.add(0, new c());
                    }
                }
            } catch (Exception e2) {
                pxx.f26392a.d(TAG, "hook lifecycle err", e2, new Object[0]);
            }
        }
    }

    public static boolean isInstrMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ca6a6b0", new Object[0])).booleanValue();
        }
        return TriggerInstrumentation.triggered.get();
    }

    public static void listenToProcessState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef3e9ab", new Object[0]);
        } else {
            com.taobao.accs.connection.state.a.v().H(new a());
        }
    }

    public static void performSpeedOpt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc5dd74", new Object[0]);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if ("OPPO".equals(Build.BRAND) && i >= 26 && i <= 31) {
            if (!c0.e("anr_normal_change")) {
                pxx.f26392a.e(TAG, "performSpeedOpt closed", new Object[0]);
                return;
            }
            izx.b().schedule(new Runnable() { // from class: tb.x1g
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.a();
                }
            }, 3L, TimeUnit.SECONDS);
        }
    }

    public static void recordLastRemoveTask(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53c1511", new Object[]{context});
        } else {
            izx.b().schedule(new Runnable() { // from class: tb.t1g
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.d(context);
                }
            }, UtilityImpl.isMainProcess(context) ? 3L : 0L, TimeUnit.SECONDS);
        }
    }

    public static void registerScreenReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f15985", new Object[0]);
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            o41.a().registerReceiver(mReceiver, intentFilter);
        } catch (Throwable th) {
            pxx.f26392a.d(TAG, "registerScreenReceiver err", th, new Object[0]);
        }
    }

    public static void addRecentEntranceImpl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3dbef", new Object[]{context});
            return;
        }
        pxx pxxVar = pxx.f26392a;
        pxxVar.e(TAG, "addRecentEntranceImpl", new Object[0]);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Intent intent = new Intent(context, SupportRecentActivity.class);
            intent.putExtra("time", elapsedRealtime);
            intent.putExtra("seed", new Random().nextInt(1000));
            intent.addFlags(268435456);
            context.startActivity(intent);
            pxxVar.e(TAG, "addRecentEntranceImpl success", new Object[0]);
        } catch (Throwable th) {
            pxx.f26392a.d(TAG, "addRecentEntranceImpl err", th, new Object[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements a.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(499122180);
            t2o.a(343933071);
        }

        @Override // com.taobao.accs.connection.state.a.g
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("898c8053", new Object[]{this, str});
            }
        }

        @Override // com.taobao.accs.connection.state.a.g
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5675eb25", new Object[]{this, str});
                return;
            }
            pxx.f26392a.e(KeepAliveManager.TAG, "onProcessDied", "process", str);
            ka.ka.ka.f.a.b.set(true);
            Context a2 = o41.a();
            try {
                Intent intent = new Intent("com.taobao.alive.kill.finish_now");
                intent.setPackage(a2.getPackageName());
                a2.sendBroadcast(intent);
            } catch (Throwable th) {
                pxx.f26392a.d(KeepAliveManager.TAG, "onActivityStarted sendBroadcast err", th, new Object[0]);
            }
            KeepAliveManager.access$000(a2);
        }
    }

    public static void accountSync(Context context) {
        int i;
        int parseInt;
        int parseInt2;
        int appKeepAliveBucketId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2181bb9", new Object[]{context});
            return;
        }
        pxx.f26392a.e(TAG, "accountSync", new Object[0]);
        AccountManager accountManager = (AccountManager) context.getSystemService(LoginConstant.ACCOUNT);
        try {
            Account[] accountsByType = accountManager.getAccountsByType("tb_alive.account");
            Account account = new Account("淘宝", "tb_alive.account");
            if (accountsByType.length == 0) {
                accountManager.addAccountExplicitly(account, "tb20231127", new Bundle());
            }
            ContentResolver.setIsSyncable(account, "com.taobao.alive.account", 1);
            ContentResolver.setSyncAutomatically(account, "com.taobao.alive.account", true);
            String str = "39-39";
            try {
                str = context.getSharedPreferences("keepalive", 4).getString("reduce_account_range", str);
            } catch (Exception e) {
                pxx.f26392a.d("RemoteConfig", "getConfigFromSP fail:", e, "key", "reduce_account_range");
            }
            if (!TextUtils.isEmpty(str) && UtilityImpl.isAppKeepAlive()) {
                try {
                    String[] split = str.split("-");
                    parseInt = Integer.parseInt(split[0]);
                    parseInt2 = Integer.parseInt(split[1]);
                    appKeepAliveBucketId = UtilityImpl.getAppKeepAliveBucketId(o41.a());
                } catch (Exception unused) {
                }
                if (appKeepAliveBucketId >= parseInt && appKeepAliveBucketId <= parseInt2) {
                    i = ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
                    ContentResolver.addPeriodicSync(account, "com.taobao.alive.account", new Bundle(), i);
                }
            }
            i = 900;
            ContentResolver.addPeriodicSync(account, "com.taobao.alive.account", new Bundle(), i);
        } catch (Throwable th) {
            pxx.f26392a.d(TAG, "set account err", th, new Object[0]);
        }
    }

    public static void d(Context context) {
        List<Object> historicalProcessExitReasons;
        String description;
        String description2;
        long timestamp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
        } else if (Build.VERSION.SDK_INT >= 30) {
            historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(context.getPackageName(), 0, 16);
            long j = 0;
            for (Object obj : historicalProcessExitReasons) {
                ApplicationExitInfo a2 = p01.a(obj);
                description = a2.getDescription();
                if (!TextUtils.isEmpty(description)) {
                    description2 = a2.getDescription();
                    if (description2.toLowerCase().contains("remove task")) {
                        timestamp = a2.getTimestamp();
                        j = Math.max(j, timestamp);
                    }
                }
            }
            if (j > 0) {
                cux.h(context, FILE_REMOVE_TASK, j + "");
                pxx.f26392a.e(TAG, "record remove-task", "lastKillTime", Long.valueOf(j));
            }
        }
    }

    public static void initInChannel(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52299af3", new Object[]{context});
        } else if (!cp.g()) {
            Object[] objArr = {MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(Process.myPid())};
            pxx pxxVar = pxx.f26392a;
            pxxVar.e(TAG, "initInChannel", objArr);
            recordLastRemoveTask(context);
            k5y k5yVar = k5y.a.f22424a;
            k5yVar.f22423a = context;
            OrangeConfig.getInstance().registerListener(new String[]{"keepalive"}, new d4y(k5yVar), true);
            if (k5yVar.f(context)) {
                if (qxx.b == null) {
                    synchronized (qxx.class) {
                        try {
                            if (qxx.b == null) {
                                qxx.b = new qxx();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                qxx qxxVar = qxx.b;
                qxxVar.getClass();
                pxxVar.e("ProcessAdjuster", "init", new Object[0]);
                if (Build.VERSION.SDK_INT >= 26) {
                    Context a2 = o41.a();
                    com.taobao.accs.connection.state.a.v().H(new dux(qxxVar));
                    if (!com.taobao.accs.connection.state.a.v().A(a2)) {
                        qxxVar.c();
                    }
                }
            }
            izx.b().execute(new Runnable() { // from class: tb.u1g
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.registerScreenReceiver();
                }
            });
            if (UtilityImpl.isAppKeepAlive()) {
                izx.b().scheduleWithFixedDelay(new Runnable() { // from class: tb.v1g
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeepAliveManager.b(context);
                    }
                }, 0L, 60L, TimeUnit.MINUTES);
            }
            listenToProcessState();
            if (k5yVar.g(context)) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.taobao.alive.kill.finish_delay");
                    intentFilter.addAction("com.taobao.alive.kill.finish_now");
                    context.registerReceiver(new ka.ka.ka.f.a(), intentFilter);
                    pxxVar.e(TAG, "register PreventKillReceiver", new Object[0]);
                } catch (Throwable th2) {
                    pxx.f26392a.d(TAG, "register PreventKillReceiver err", th2, new Object[0]);
                }
            }
            izx.b().execute(new Runnable() { // from class: tb.w1g
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.c(context);
                }
            });
            if (k5y.a.f22424a.i(context)) {
                performSpeedOpt();
            }
        }
    }

    public static void a() {
        try {
            Context a2 = o41.a();
            String a3 = cp.a();
            SharedPreferences sharedPreferences = a2.getSharedPreferences(SP_NAME_CHANNEL, 0);
            String string = sharedPreferences.getString("app_ver", "");
            if (TextUtils.isEmpty(string) || !string.equals(a3)) {
                sharedPreferences.edit().putString("app_ver", a3).commit();
                if (cp.d()) {
                    pxx.f26392a.e(TAG, "performSpeedOpt foreground", new Object[0]);
                    return;
                }
                Object invoke = StaticHook.g(ActivityThread.class, "getPackageManager", new Class[0]).invoke(null, new Object[0]);
                Class<?> cls = invoke.getClass();
                Class cls2 = Boolean.TYPE;
                Method g = StaticHook.g(cls, "performDexOptMode", String.class, cls2, String.class, cls2, cls2, String.class);
                g.setAccessible(true);
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = (Boolean) g.invoke(invoke, o41.a().getPackageName(), Boolean.FALSE, TBImageFlowMonitor.SPEED_MEASURE, bool, bool, null);
                bool2.booleanValue();
                pxx.f26392a.e(TAG, "performSpeedOpt", "result", bool2);
                return;
            }
            pxx.f26392a.e(TAG, "performSpeedOpt executed", new Object[0]);
        } catch (Throwable th) {
            pxx.f26392a.d(TAG, "performSpeedOpt err", th, new Object[0]);
        }
    }
}
