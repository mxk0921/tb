package com.taobao.tao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.ipc.a;
import com.taobao.android.lifecycle.PanguApplication;
import java.util.HashMap;
import tb.b8l;
import tb.d51;
import tb.gi2;
import tb.i1d;
import tb.iia;
import tb.mdq;
import tb.n1x;
import tb.q41;
import tb.qmp;
import tb.s11;
import tb.s9t;
import tb.w35;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaobaoApplication extends PanguApplication implements a.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long START;
    public static String sAppVersion;
    public static TaobaoApplication sApplication;
    public static long sLauncherStartTime;
    public static Handler sMainHandler;
    public static String sPackageName;
    public static String sProcessName;
    public static long sStartTime;
    public static String sTTID;
    private q41 bootstrap;
    private boolean isIsolatedProcess = false;
    private final i1d.a getter = new a();
    private final a.AbstractC0433a ipcContext = new b();

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements i1d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public SharedPreferences a(Context context, String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("3f3e6062", new Object[]{this, context, str, new Integer(i)});
            }
            return new qmp(str, TaobaoApplication.access$001(TaobaoApplication.this, str, i));
        }
    }

    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements a.AbstractC0433a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.AbstractC0433a
        public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("41edc960", new Object[]{this, broadcastReceiver, intentFilter});
            }
            return TaobaoApplication.access$301(TaobaoApplication.this, broadcastReceiver, intentFilter);
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.AbstractC0433a
        public Intent b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("d2e01403", new Object[]{this, broadcastReceiver, intentFilter, new Integer(i)});
            }
            return TaobaoApplication.access$401(TaobaoApplication.this, broadcastReceiver, intentFilter, i);
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.AbstractC0433a
        public Intent c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("3fd0fe66", new Object[]{this, broadcastReceiver, intentFilter, str, handler});
            }
            return TaobaoApplication.access$101(TaobaoApplication.this, broadcastReceiver, intentFilter, str, handler);
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.AbstractC0433a
        public Intent d(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("91637fbd", new Object[]{this, broadcastReceiver, intentFilter, str, handler, new Integer(i)});
            }
            return TaobaoApplication.access$201(TaobaoApplication.this, broadcastReceiver, intentFilter, str, handler, i);
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.AbstractC0433a
        public Context getAppContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[]{this});
            }
            return TaobaoApplication.this;
        }
    }

    public TaobaoApplication() {
        long currentTimeMillis = System.currentTimeMillis();
        sStartTime = currentTimeMillis;
        START = currentTimeMillis;
        sLauncherStartTime = System.nanoTime();
        sMainHandler = new Handler();
    }

    public static /* synthetic */ SharedPreferences access$001(TaobaoApplication taobaoApplication, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("97ddd928", new Object[]{taobaoApplication, str, new Integer(i)});
        }
        return super.getSharedPreferences(str, i);
    }

    public static /* synthetic */ Intent access$101(TaobaoApplication taobaoApplication, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("c5c43873", new Object[]{taobaoApplication, broadcastReceiver, intentFilter, str, handler});
        }
        return super.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static /* synthetic */ Intent access$201(TaobaoApplication taobaoApplication, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("b548882f", new Object[]{taobaoApplication, broadcastReceiver, intentFilter, str, handler, new Integer(i)});
        }
        return super.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }

    public static /* synthetic */ Intent access$301(TaobaoApplication taobaoApplication, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("c38d252f", new Object[]{taobaoApplication, broadcastReceiver, intentFilter});
        }
        return super.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static /* synthetic */ Intent access$401(TaobaoApplication taobaoApplication, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("194b4233", new Object[]{taobaoApplication, broadcastReceiver, intentFilter, new Integer(i)});
        }
        return super.registerReceiver(broadcastReceiver, intentFilter, i);
    }

    public static String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        if (TextUtils.isEmpty(sAppVersion)) {
            sAppVersion = TaoPackageInfo.getVersion();
        }
        return sAppVersion;
    }

    public static String getPackageName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b1a51a", new Object[]{context});
        }
        if (!TextUtils.isEmpty(sPackageName)) {
            return sPackageName;
        }
        if (context == null) {
            return "packageName:null";
        }
        String packageName = context.getPackageName();
        sPackageName = packageName;
        return packageName;
    }

    public static String getProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        if (!TextUtils.isEmpty(sProcessName)) {
            return sProcessName;
        }
        if (context == null) {
            return "processName:null";
        }
        String c = d51.c(context);
        sProcessName = c;
        return c;
    }

    public static String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        if (TextUtils.isEmpty(sTTID)) {
            sTTID = TaoPackageInfo.getTTID();
        }
        return sTTID;
    }

    private void initAppBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb909da", new Object[]{this});
        } else if (isMainProcess() || isChannelProcess()) {
            d51.f(new Runnable() { // from class: com.taobao.tao.TaobaoApplication.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.appbundle.a.Companion.a().j(com.alibaba.flexa.compat.a.b(TaobaoApplication.this).f(null).g(null).d(true).e(false).b(true).a());
                    }
                }
            });
        }
    }

    public static /* synthetic */ Object ipc$super(TaobaoApplication taobaoApplication, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1855750211:
                return super.registerReceiver((BroadcastReceiver) objArr[0], (IntentFilter) objArr[1], (String) objArr[2], (Handler) objArr[3], ((Number) objArr[4]).intValue());
            case -976790220:
                return super.getApplicationContext();
            case -757066749:
                return super.registerReceiver((BroadcastReceiver) objArr[0], (IntentFilter) objArr[1], ((Number) objArr[2]).intValue());
            case -406270088:
                return super.openOrCreateDatabase((String) objArr[0], ((Number) objArr[1]).intValue(), (SQLiteDatabase.CursorFactory) objArr[2]);
            case -40033047:
                return super.getSharedPreferences((String) objArr[0], ((Number) objArr[1]).intValue());
            case 413640386:
                super.onCreate();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 922616583:
                return super.getResources();
            case 1070661222:
                return super.registerReceiver((BroadcastReceiver) objArr[0], (IntentFilter) objArr[1], (String) objArr[2], (Handler) objArr[3]);
            case 1106102624:
                return super.registerReceiver((BroadcastReceiver) objArr[0], (IntentFilter) objArr[1]);
            case 2064626307:
                return super.getAssets();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/TaobaoApplication");
        }
    }

    public static boolean isChannelProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86016141", new Object[0])).booleanValue();
        }
        return "com.taobao.taobao:channel".equalsIgnoreCase(getProcessName(sApplication));
    }

    public static boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        return "com.taobao.taobao".equals(getProcessName(sApplication));
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        sProcessName = getProcessName(context);
        sPackageName = getPackageName(context);
        try {
            sAppVersion = getPackageManager().getPackageInfo(sPackageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            sAppVersion = "1.0.0";
        }
        if (TextUtils.equals(sProcessName, sPackageName)) {
            i1d.c(context, this.getter);
            this.isIsolatedProcess = false;
        } else {
            this.isIsolatedProcess = d51.e();
        }
        sApplication = this;
        if (this.isIsolatedProcess) {
            sProcessName = getProcessNameIsolate(context);
        } else if (!s11.h(context)) {
            Process.killProcess(Process.myPid());
            return;
        }
        if (!d51.d(sProcessName)) {
            s9t.a(this, sPackageName, sProcessName, this.isIsolatedProcess).run();
            if (!this.isIsolatedProcess) {
                b8l b8lVar = new b8l();
                String str = sPackageName;
                b8lVar.f16248a = str;
                String str2 = sProcessName;
                b8lVar.b = str2;
                b8lVar.d = sAppVersion;
                b8lVar.c = sStartTime;
                if (TextUtils.equals(str2, str)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("appVersion", sAppVersion);
                    n1x.a(this, hashMap);
                }
                q41 a2 = new gi2.b(this, b8lVar).a();
                this.bootstrap = a2;
                a2.e(this);
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[]{this});
        }
        Context applicationContext = super.getApplicationContext();
        if (applicationContext == null) {
            return this;
        }
        return applicationContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AssetManager) ipChange.ipc$dispatch("7b0fb283", new Object[]{this});
        }
        AssetManager assets = super.getAssets();
        mdq.b(assets);
        return assets;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.c
    public a.AbstractC0433a getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.AbstractC0433a) ipChange.ipc$dispatch("90c5108f", new Object[]{this});
        }
        return this.ipcContext;
    }

    public String getProcessNameIsolate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ed38d06", new Object[]{this, context});
        }
        if (sProcessName == null) {
            sProcessName = d51.b(context);
        }
        return sProcessName;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this});
        }
        mdq.b(super.getAssets());
        return super.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("fd9d24e9", new Object[]{this, str, new Integer(i)});
        }
        w35.a("getSP4" + str);
        SharedPreferences b2 = i1d.b(this, str, i, this.getter);
        w35.c();
        return b2;
    }

    public SQLiteDatabase hookDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("dd072c72", new Object[]{this, str, new Integer(i), cursorFactory});
        }
        try {
            return super.openOrCreateDatabase(str, i, cursorFactory);
        } catch (SQLiteException unused) {
            if (deleteDatabase(str)) {
                try {
                    return super.openOrCreateDatabase(str, i, cursorFactory);
                } catch (SQLiteException unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        if (!this.isIsolatedProcess) {
            initAppBundle();
            q41 q41Var = this.bootstrap;
            if (q41Var != null) {
                q41Var.onCreate();
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("d2e01403", new Object[]{this, broadcastReceiver, intentFilter, new Integer(i)});
        }
        if ((i & 6) == 0 && iia.b(this)) {
            return com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.d(this, broadcastReceiver, intentFilter, 2);
        }
        return com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.d(this, broadcastReceiver, intentFilter, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("e7c8cf78", new Object[]{this, str, new Integer(i), cursorFactory});
        }
        String str2 = sProcessName;
        if (TextUtils.isEmpty(str2)) {
            return hookDatabase(str, i, cursorFactory);
        }
        if (str2.equals(getPackageName())) {
            return hookDatabase(str, i, cursorFactory);
        }
        String[] split = str2.split(":");
        if (split.length <= 1) {
            return hookDatabase(str, i, cursorFactory);
        }
        return hookDatabase(split[1] + "_" + str, i, cursorFactory);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("41edc960", new Object[]{this, broadcastReceiver, intentFilter});
        }
        if (Build.VERSION.SDK_INT < 26 || !iia.b(this)) {
            return com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.c(this, broadcastReceiver, intentFilter);
        }
        return com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.d(this, broadcastReceiver, intentFilter, 2);
    }
}
