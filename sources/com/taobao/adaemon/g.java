package com.taobao.adaemon;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.app.IActivityManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Printer;
import android.view.Choreographer;
import android.view.Display;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewRootImpl;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.adaemon.e;
import com.taobao.adaemon.g;
import com.taobao.atools.StaticHook;
import com.ut.mini.UTAnalytics;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mtopsdk.common.util.SymbolExpUtil;
import tb.cp;
import tb.f;
import tb.f2d;
import tb.f7l;
import tb.fxp;
import tb.hkq;
import tb.ik4;
import tb.mf;
import tb.nxm;
import tb.o41;
import tb.qja;
import tb.qp0;
import tb.s55;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f6157a;
    public static ActivityManager b;
    public static File d;
    public static String e;
    public static Boolean f;
    public static Integer g;
    public static long h;
    public static volatile Choreographer i;
    public static StringBuilder j;
    public static Method n;
    public static Method o;
    public static Method p;
    public static Field q;
    public static Field r;
    public static Field s;
    public static boolean c = false;
    public static int k = -1;
    public static final char[] l = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
    public static final char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final ThreadLocal<char[]> digitsArr = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends ThreadLocal<char[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/Utils$1");
        }

        /* renamed from: a */
        public char[] initialValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (char[]) ipChange.ipc$dispatch("b226a8ca", new Object[]{this});
            }
            return new char[12];
        }
    }

    static {
        t2o.a(349175883);
    }

    public static Debug.MemoryInfo A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Debug.MemoryInfo) ipChange.ipc$dispatch("d84a9ae2", new Object[]{context});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        Log.e("Utils", "getMemoryInfo time:" + (System.currentTimeMillis() - currentTimeMillis));
        return memoryInfo;
    }

    public static Debug.MemoryInfo B(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Debug.MemoryInfo) ipChange.ipc$dispatch("b35f6176", new Object[]{context});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (b == null) {
            b = (ActivityManager) context.getSystemService("activity");
        }
        Debug.MemoryInfo[] processMemoryInfo = b.getProcessMemoryInfo(new int[]{Process.myPid()});
        if (processMemoryInfo == null || processMemoryInfo.length != 1) {
            return null;
        }
        Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
        Log.e("Utils", "getMemoryInfoAM time:" + (System.currentTimeMillis() - currentTimeMillis));
        return memoryInfo;
    }

    public static String C(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("392a3da0", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(":")) < 0) {
            return "empty_what";
        }
        return str.substring(indexOf + 1);
    }

    public static String D(Context context, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ec675fa", new Object[]{context, new Integer(i2)});
        }
        try {
            if (b == null) {
                b = (ActivityManager) context.getSystemService("activity");
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = b.getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.size() <= 0) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i2) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Exception e2) {
            s55.h("Utils", "[getProcessName]error.", null, e2);
            return "";
        }
    }

    public static float E(Context context) {
        Display display;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8658960c", new Object[]{context})).floatValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                display = context.getDisplay();
                return display.getRefreshRate();
            }
            Display display2 = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
            if (display2 != null) {
                return display2.getRefreshRate();
            }
            return 0.0f;
        } catch (Throwable th) {
            s55.h("Utils", "getRefreshRate err", th, new Object[0]);
            return 0.0f;
        }
    }

    public static int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec636251", new Object[0])).intValue();
        }
        return (int) ((Runtime.getRuntime().totalMemory() * 100) / Runtime.getRuntime().maxMemory());
    }

    public static boolean H(Context context, int i2) {
        boolean z;
        Object th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef41207e", new Object[]{context, new Integer(i2)})).booleanValue();
        }
        try {
            if (i2 < 0) {
                s55.i("Utils", "get pid fail!", new Object[0]);
                return false;
            }
            if (b == null) {
                b = (ActivityManager) context.getSystemService("activity");
            }
            List<ActivityManager.RunningServiceInfo> runningServices = b.getRunningServices(100);
            if (!(runningServices == null || runningServices.size() == 0)) {
                for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                    if (runningServiceInfo.pid == i2 && !runningServiceInfo.service.getClassName().equals(TriggerService.class.getName()) && runningServiceInfo.foreground) {
                        try {
                            s55.i("Utils", "has foreground service:" + runningServiceInfo.service.getClassName(), new Object[0]);
                            return true;
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                            s55.h("Utils", "hasForegroundService error", null, th);
                            return z;
                        }
                    }
                }
                return false;
            }
            s55.i("Utils", "get service info fail", new Object[0]);
            return true;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    public static boolean I(Context context) {
        StatusBarNotification[] activeNotifications;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96ba2a0", new Object[]{context})).booleanValue();
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                activeNotifications = ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).getActiveNotifications();
                if (!(activeNotifications == null || activeNotifications.length == 0)) {
                    s55.g("Utils", "hasNotifications num:" + activeNotifications.length, new Object[0]);
                    z = true;
                }
                return z;
            }
            s55.g("Utils", "hasNotifications android version:" + i2, new Object[0]);
            return true;
        } catch (Throwable th) {
            s55.g("Utils", "hasNotifications", null, th);
            return true;
        }
    }

    public static void J(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92da8395", new Object[]{context, str, str2, str3});
            return;
        }
        int i2 = Calendar.getInstance().get(6);
        SharedPreferences sharedPreferences = context.getSharedPreferences(nxm.SP_NAME, 4);
        int i3 = sharedPreferences.getInt(str, -1);
        int i4 = sharedPreferences.getInt(str2, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i2 != i3) {
            edit.putInt(str, i2).putInt(str2, 1);
        } else {
            edit.putInt(str2, i4 + 1);
        }
        if (str3 != null) {
            edit.putInt(str3, (Calendar.getInstance().get(11) * 60) + Calendar.getInstance().get(12));
        }
        edit.commit();
    }

    public static boolean K(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("560ee89f", new Object[]{context})).booleanValue();
        }
        if (TextUtils.isEmpty(o(context))) {
            return false;
        }
        return o(context).equals(m(context));
    }

    public static boolean L(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43caa213", new Object[]{context})).booleanValue();
        }
        String m2 = m(context);
        if (TextUtils.isEmpty(m2)) {
            return false;
        }
        if (b == null) {
            b = (ActivityManager) context.getSystemService("activity");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = b.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(m2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4380c38a", new Object[]{context})).booleanValue();
        }
        try {
            if (d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getFilesDir().getAbsolutePath());
                String str = File.separator;
                sb.append(str);
                sb.append("..");
                sb.append(str);
                sb.append("..");
                d = new File(sb.toString());
            }
            return d.canRead();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean N(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b036e38", new Object[]{context})).booleanValue();
        }
        return UtilityImpl.isForeground(context);
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7b876", new Object[0])).booleanValue();
        }
        Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Context l2 = l();
            int identifier = l2.getResources().getIdentifier("publish_type", "string", l2.getPackageName());
            if (identifier < 0) {
                f = Boolean.FALSE;
                s55.i("Utils", "[isGrayVersion]error", new Object[0]);
            } else {
                f = Boolean.valueOf("0".equals(l2.getString(identifier)));
                s55.i("Utils", "isGrayVersion = " + f, new Object[0]);
            }
        } catch (Throwable th) {
            s55.h("Utils", qja.IS_GRAY_VERSION, th, new Object[0]);
        }
        return f.booleanValue();
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3435fc9", new Object[0])).booleanValue();
        }
        return UtilityImpl.isAppKeepAlive();
    }

    public static boolean Q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        return context.getPackageName().equals(o(context));
    }

    public static boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1e760b5", new Object[0])).booleanValue();
        }
        return c;
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d6b9d0", new Object[0])).booleanValue();
        }
        try {
            if (fxp.g(fxp.j()) != -2 && !TriggerService.d) {
                return false;
            }
            if (!LocalProcessMonitor.s0()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            s55.h("Utils", "isTinyProcess err", th, new Object[0]);
            return false;
        }
    }

    public static /* synthetic */ void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec8b926", new Object[0]);
        } else {
            s(true);
        }
    }

    public static /* synthetic */ void U(ik4 ik4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81b618c", new Object[]{ik4Var});
            return;
        }
        i = Choreographer.getInstance();
        if (ik4Var != null) {
            ik4Var.accept(i);
        }
    }

    public static String W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6732c5f5", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "null";
        }
        return str;
    }

    public static boolean X(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b600590", new Object[]{new Integer(i2)})).booleanValue();
        }
        if (SystemClock.elapsedRealtime() % 100 < i2) {
            return true;
        }
        return false;
    }

    public static void Y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e563e0b", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static long d(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e912f5e9", new Object[]{new Long(j2)})).longValue();
        }
        if (h == 0) {
            long sysconf = 1000 / Os.sysconf(OsConstants._SC_CLK_TCK);
            h = sysconf;
            s55.i("Utils", "cpuJiffToMs", "jiff", Long.valueOf(sysconf));
        }
        return j2 * h;
    }

    public static void e(IBinder iBinder, int i2, String str, Bundle bundle, boolean z, int i3) throws Throwable {
        Object obj;
        if (n == null) {
            Class cls = Integer.TYPE;
            n = StaticHook.g(IActivityManager.class, "finishReceiver", IBinder.class, cls, String.class, Bundle.class, Boolean.TYPE, cls);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            obj = j();
        } else {
            obj = iBinder;
        }
        if (z) {
            n.invoke(t(), obj, Integer.valueOf(i2), str, bundle, Boolean.FALSE, Integer.valueOf(i3));
        } else {
            n.invoke(t(), obj, 0, null, null, Boolean.FALSE, Integer.valueOf(i3));
        }
    }

    public static String f(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa68c4c2", new Object[]{new Long(j2)});
        }
        if (j2 >= 0) {
            long j3 = j2 % 86400000;
            int i2 = (int) (j3 % 1000);
            long j4 = j3 / 1000;
            int i3 = (int) (j4 % 60);
            long j5 = j4 / 60;
            int i4 = (int) (j5 % 60);
            int i5 = ((int) ((j5 / 60) + 8)) % 24;
            char[] cArr = digitsArr.get();
            char[] cArr2 = l;
            cArr[0] = cArr2[i5];
            char[] cArr3 = m;
            cArr[1] = cArr3[i5];
            cArr[2] = f7l.CONDITION_IF_MIDDLE;
            cArr[3] = cArr2[i4];
            cArr[4] = cArr3[i4];
            cArr[5] = f7l.CONDITION_IF_MIDDLE;
            cArr[6] = cArr2[i3];
            cArr[7] = cArr3[i3];
            cArr[8] = '.';
            if (i2 < 100) {
                cArr[9] = '0';
            } else {
                cArr[9] = cArr3[i2 / 100];
                i2 %= 100;
            }
            cArr[10] = cArr2[i2];
            cArr[11] = cArr3[i2];
            return new String(cArr);
        }
        throw new IllegalArgumentException("Wrong timestamp");
    }

    public static String g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26e062c", new Object[]{activity});
        }
        Intent intent = activity.getIntent();
        if (intent != null) {
            return intent.getDataString();
        }
        return null;
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d87bb142", new Object[]{context});
        }
        if (!Q(context)) {
            return "";
        }
        try {
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            if (!TextUtils.isEmpty(globalProperty)) {
                return globalProperty.replaceAll(SymbolExpUtil.SYMBOL_VERTICALBAR, Constants.WAVE_SEPARATOR);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static List<Integer> i(Context context) {
        ArrayList arrayList;
        Object th;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d2b0f059", new Object[]{context});
        }
        try {
            if (b == null) {
                b = (ActivityManager) context.getSystemService("activity");
            }
            runningAppProcesses = b.getRunningAppProcesses();
        } catch (Throwable th2) {
            th = th2;
            arrayList = null;
        }
        if (!(runningAppProcesses == null || runningAppProcesses.size() == 0)) {
            arrayList = null;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                try {
                    if (runningAppProcessInfo.uid == Process.myUid() && (str2 = runningAppProcessInfo.processName) != null && !str2.endsWith(":channel")) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(Integer.valueOf(runningAppProcessInfo.pid));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    s55.h("Utils", "getMainPId error", null, th);
                    return arrayList;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("get app pids:");
            if (arrayList == null) {
                str = "";
            } else {
                str = arrayList.toString();
            }
            sb.append(str);
            s55.g("Utils", sb.toString(), new Object[0]);
            return arrayList;
        }
        s55.g("Utils", "get main pid fail", new Object[0]);
        return null;
    }

    public static Object j() {
        try {
            if (r == null) {
                Field i2 = StaticHook.i(ActivityThread.class, "mAppThread");
                r = i2;
                i2.setAccessible(true);
            }
            return r.get(ActivityThread.currentActivityThread());
        } catch (Throwable th) {
            s55.h("Utils", "getAppThread err", th, new Object[0]);
            return null;
        }
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        if (TextUtils.isEmpty(e)) {
            Context context = GlobalClientInfo.getContext();
            try {
                e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return e;
    }

    public static Context l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return o41.a();
    }

    public static String m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e141b048", new Object[]{context});
        }
        try {
            ComponentName componentName = new ComponentName(context, "com.taobao.accs.AccsIPCProvider");
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getProviderInfo(componentName, 0).processName;
            }
            return null;
        } catch (Exception e2) {
            s55.h("Utils", "[getCoreProviderProcess]error", e2, new Object[0]);
            return null;
        }
    }

    public static Pair<Long, Long> n() {
        BufferedReader bufferedReader;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("dcc55230", new Object[0]);
        }
        int myPid = Process.myPid();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + myPid + "/stat"));
            try {
                String[] split = bufferedReader.readLine().split(" ");
                Pair<Long, Long> create = Pair.create(Long.valueOf(d(Long.parseLong(split[13]))), Long.valueOf(d(Long.parseLong(split[14]))));
                s55.g("Utils", "getCpuTime", "uTime", create.first, "sTime", create.second, MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(myPid), "spent", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                return create;
            } catch (Throwable th2) {
                th = th2;
                try {
                    s55.h("Utils", "getCpuTime err", th, new Object[0]);
                    return null;
                } finally {
                    f2d.a(bufferedReader);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static String o(Context context) {
        String processName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdc92c4b", new Object[]{context});
        }
        if (TextUtils.isEmpty(f6157a)) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f6157a = processName;
            } else {
                f6157a = ActivityThread.currentProcessName();
            }
            if (TextUtils.isEmpty(f6157a)) {
                f6157a = D(context, Process.myPid());
            }
        }
        return f6157a;
    }

    public static SharedPreferences p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3fa5162d", new Object[]{context});
        }
        return context.getSharedPreferences(e.MODULE_NAME, 4);
    }

    public static int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        Integer num = g;
        if (num == null || num.intValue() < 0) {
            try {
                g = Integer.valueOf(qp0.b());
            } catch (Throwable unused) {
                g = -1;
            }
        }
        return g.intValue();
    }

    public static String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f131f20", new Object[0]);
        }
        int q2 = q();
        if (q2 == 0) {
            return "high";
        }
        if (q2 == 1) {
            return "middle";
        }
        if (q2 != 2) {
            return "unknown";
        }
        return "low";
    }

    public static Object t() {
        try {
            if (o == null) {
                o = StaticHook.g(ActivityManager.class, "getService", new Class[0]);
            }
            return o.invoke(null, new Object[0]);
        } catch (Throwable th) {
            s55.h("Utils", "getIActivityManager err", th, new Object[0]);
            return null;
        }
    }

    public static Field u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("af35d562", new Object[0]);
        }
        if (q == null) {
            Field i2 = StaticHook.i(ViewRootImpl.class, "mInputCompatProcessor");
            q = i2;
            if (i2 != null) {
                e.f.b("static_hook");
            } else {
                e.f.a("static_hook", null);
            }
            q.setAccessible(true);
        }
        return q;
    }

    public static String v(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            return MotionEvent.actionToString(((MotionEvent) inputEvent).getAction());
        }
        if (inputEvent instanceof KeyEvent) {
            try {
                if (p == null) {
                    p = StaticHook.g(KeyEvent.class, "actionToString", Integer.TYPE);
                }
                return p.invoke(null, Integer.valueOf(((KeyEvent) inputEvent).getAction())) + "," + KeyEvent.keyCodeToString(((KeyEvent) inputEvent).getKeyCode());
            } catch (Throwable unused) {
            }
        }
        if (inputEvent == null) {
            return "";
        }
        return inputEvent.toString();
    }

    public static void w(final ik4<Choreographer> ik4Var) {
        if (i == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                i = Choreographer.getInstance();
            }
            if (i == null) {
                try {
                    Method g2 = StaticHook.g(Choreographer.class, "getMainThreadInstance", new Class[0]);
                    if (g2 != null) {
                        i = (Choreographer) g2.invoke(null, new Object[0]);
                    }
                } catch (Throwable th) {
                    s55.h("Utils", "postMainLooper, get choreographer err: ", th, new Object[0]);
                }
            }
            if (i == null) {
                if (!f.i() || Build.VERSION.SDK_INT >= 28) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.cxv
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.U(ik4.this);
                        }
                    });
                }
            } else if (ik4Var != null) {
                ik4Var.accept(i);
            }
        } else if (ik4Var != null) {
            ik4Var.accept(i);
        }
    }

    public static Choreographer x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Choreographer) ipChange.ipc$dispatch("4f75706a", new Object[0]);
        }
        w(null);
        return i;
    }

    public static Printer y() {
        try {
            if (s == null) {
                Field i2 = StaticHook.i(Looper.class, "mLogging");
                s = i2;
                i2.setAccessible(true);
            }
            return (Printer) s.get(Looper.getMainLooper());
        } catch (Throwable th) {
            s55.h("Utils", "getMainLooperPrinter err", th, new Object[0]);
            return null;
        }
    }

    public static int z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39771b8", new Object[]{context})).intValue();
        }
        try {
            if (!com.taobao.accs.connection.state.a.v().A(context)) {
                return -1;
            }
            if (b == null) {
                b = (ActivityManager) context.getSystemService("activity");
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = b.getRunningAppProcesses();
            if (!(runningAppProcesses == null || runningAppProcesses.size() == 0)) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.uid == Process.myUid() && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                        int i2 = runningAppProcessInfo.pid;
                        s55.g("Utils", "get main pid:" + i2, new Object[0]);
                        return i2;
                    }
                }
                return -1;
            }
            s55.g("Utils", "get main pid fail", new Object[0]);
            return -1;
        } catch (Throwable th) {
            s55.h("Utils", "getMainPId error", null, th);
            return -1;
        }
    }

    public static /* synthetic */ void V(String str, String str2, long j2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ba0340", new Object[]{str, str2, new Long(j2)});
            return;
        }
        FileWriter fileWriter = null;
        try {
            File file = new File(l().getExternalCacheDir() + "/adaemon");
            if (!file.exists()) {
                file.mkdirs();
            }
            fileWriter = new FileWriter(new File(file.getAbsolutePath() + "/main_msg_" + Process.myPid() + ".txt"), true);
            try {
                StringBuilder sb = j;
                if (sb == null) {
                    j = new StringBuilder(100);
                } else {
                    sb.setLength(0);
                }
                StringBuilder sb2 = j;
                sb2.append(str);
                sb2.delete(0, 18);
                int indexOf = j.indexOf("{");
                if (indexOf > 0) {
                    StringBuilder sb3 = j;
                    sb3.delete(indexOf, sb3.indexOf("}") + 1);
                }
                int indexOf2 = j.indexOf("@");
                if (indexOf2 > 0) {
                    StringBuilder sb4 = j;
                    sb4.delete(indexOf2, sb4.length());
                }
                StringBuilder sb5 = j;
                sb5.append(" what=");
                sb5.append(str2);
                sb5.append(" spent=");
                sb5.append(j2);
                sb5.append("ms");
                fileWriter.write(j.toString());
                fileWriter.write(System.lineSeparator());
            } catch (Throwable th2) {
                th = th2;
                fileWriter = fileWriter;
                try {
                    s55.h("Utils", "printImpl write err", th, new Object[0]);
                } finally {
                    f2d.a(fileWriter);
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static int s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13e573b2", new Object[]{new Boolean(z)})).intValue();
        }
        if (k < 0 || z) {
            s55.i("Utils", "getHugeMsgTimeLimit", "force", Boolean.valueOf(z));
            try {
                Context l2 = l();
                SharedPreferences sharedPreferences = l2.getSharedPreferences("adaemon-anr", 0);
                int i2 = sharedPreferences.getInt("dev-level", -1);
                if (i2 < 0 && cp.h(l2)) {
                    i2 = q();
                    if (i2 >= 0) {
                        sharedPreferences.edit().putInt("dev-level", i2).apply();
                    } else {
                        mf.k(new Runnable() { // from class: tb.bxv
                            @Override // java.lang.Runnable
                            public final void run() {
                                g.T();
                            }
                        }, 10L, TimeUnit.SECONDS);
                    }
                }
                if (i2 == 0) {
                    k = 500;
                } else if (i2 != 1) {
                    k = 1000;
                } else {
                    k = 750;
                }
                s55.i("Utils", "getHugeMsgTimeLimit", "devLevel", Integer.valueOf(i2), "time", Integer.valueOf(k));
            } catch (Throwable th) {
                s55.h("Utils", "getHugeMsgTimeLimit err", th, new Object[0]);
                k = 1000;
            }
        }
        return k;
    }

    public static void Z(final String str, final String str2, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93315a70", new Object[]{str, str2, new Long(j2)});
            return;
        }
        s55.i("Utils", "writeHugeMsgToLocal", "msg", str, "spent", Long.valueOf(j2));
        mf.e().execute(new Runnable() { // from class: tb.axv
            @Override // java.lang.Runnable
            public final void run() {
                g.V(str, str2, j2);
            }
        });
    }

    public static int F(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b8c374b", new Object[]{context, str, str2, str3, str4})).intValue();
        }
        int i2 = Calendar.getInstance().get(6);
        SharedPreferences sharedPreferences = context.getSharedPreferences(nxm.SP_NAME, 4);
        int i3 = sharedPreferences.getInt(str2, -1);
        int i4 = sharedPreferences.getInt(str3, 0);
        if (i2 == i3) {
            return i4;
        }
        if (str4 != null) {
            int i5 = sharedPreferences.getInt(str4, 0);
            s55.i("Utils", "getStartTimesToday", "type", str, "lastDay", Integer.valueOf(i3), "lastStartTimes", Integer.valueOf(i4), "hh", Double.valueOf(i5 / 60.0d));
            String str5 = e.c;
            hkq.b(e.MODULE_NAME, str5, str + "|" + i5, i4);
        }
        return 0;
    }
}
