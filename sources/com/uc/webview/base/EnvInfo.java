package com.uc.webview.base;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.taobao.orange.OConstant;
import com.uc.webview.base.build.CoreType;
import com.uc.webview.base.h;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.UUID;
import tb.a2n;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class EnvInfo {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14246a = new Object();
    private static volatile Context b;
    private static volatile Context c;
    private static volatile Boolean d;
    private static volatile Pair<Boolean, String> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f14247a;
        private String[] b;
        private Method c;

        private a() {
        }

        public static boolean a(String str) {
            String str2 = Build.HARDWARE;
            if (!TextUtils.isEmpty(str2) && str2.contains(str)) {
                return true;
            }
            String str3 = Build.FINGERPRINT;
            return !TextUtils.isEmpty(str3) && str3.contains(str);
        }

        public final String b(String str) {
            try {
                if (this.c == null) {
                    this.c = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
                }
                return (String) this.c.invoke(null, str);
            } catch (Throwable unused) {
                return null;
            }
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final String[] a() {
            String[] strArr;
            String[] strArr2 = this.b;
            if (strArr2 != null) {
                return strArr2;
            }
            HashSet hashSet = new HashSet();
            String property = System.getProperty("os.arch");
            if (!TextUtils.isEmpty(property)) {
                hashSet.add(property.toLowerCase());
            }
            String str = Build.CPU_ABI;
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(str.toLowerCase());
            }
            String[] strArr3 = null;
            try {
                strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            } catch (Throwable unused) {
                strArr = null;
            }
            String b = b("ro.product.cpu.abi");
            if (!TextUtils.isEmpty(b)) {
                hashSet.add(b.toLowerCase());
            }
            if (strArr == null) {
                String b2 = b("ro.product.cpu.abilist");
                if (!TextUtils.isEmpty(b2)) {
                    strArr = b2.toLowerCase().split(",");
                }
            }
            if (strArr != null) {
                try {
                    if (strArr.length != 0) {
                        for (String str2 : strArr) {
                            hashSet.add(str2.toLowerCase());
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (!hashSet.isEmpty()) {
                strArr3 = (String[]) hashSet.toArray(new String[0]);
            }
            this.b = strArr3;
            return strArr3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final String f14248a = b();

        private static String b() {
            String processName;
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                return processName;
            }
            try {
                try {
                    return (String) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
                } catch (Throwable unused) {
                    Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                    return (String) cls.getMethod(ProcessUtils.GET_PROCESS_NAME, new Class[0]).invoke(cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]), new Object[0]);
                }
            } catch (Throwable unused2) {
                Context context = EnvInfo.getContext();
                if (context == null) {
                    return "";
                }
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
                return "";
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private static volatile String f14249a;

        private c() {
        }

        public static String a() {
            if (TextUtils.isEmpty(f14249a) && EnvInfo.b != null) {
                synchronized (c.class) {
                    try {
                        if (TextUtils.isEmpty(f14249a)) {
                            String c = h.c("uuid");
                            if (TextUtils.isEmpty(c)) {
                                c = UUID.randomUUID().toString();
                                h.a a2 = h.a();
                                if (a2 != null) {
                                    a2.a("uuid", c).a();
                                }
                            }
                            f14249a = c;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f14249a;
        }
    }

    public static boolean a() {
        return GlobalSettings.getBoolValue(96);
    }

    public static boolean b() {
        return !GlobalSettings.getBoolValue(13);
    }

    public static boolean c() {
        int i = CoreType.CORE_THICK;
        int i2 = CoreType.Type;
        if (i == i2 || CoreType.CORE_THICK_7Z == i2 || CoreType.CORE_THICK_ZIP == i2) {
            return true;
        }
        return false;
    }

    public static String d() {
        return getContext().getApplicationInfo().nativeLibraryDir;
    }

    public static String e() {
        return GlobalSettings.getStringValue(211);
    }

    public static String f() {
        if (b != null) {
            return b.getPackageName();
        }
        return null;
    }

    public static boolean g() {
        String f = f();
        if (TextUtils.isEmpty(f) || 1855462465 != f.hashCode()) {
            return false;
        }
        return true;
    }

    public static Context getContext() {
        if (b != null) {
            return b;
        }
        if (c == null) {
            try {
                c = (Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
            }
        }
        new StringBuilder("call getContext() before setContext(), return context from ActivityThread - ").append(c);
        return c;
    }

    public static String getProcessName() {
        return b.f14248a;
    }

    public static boolean h() {
        boolean booleanValue;
        if (e != null) {
            return ((Boolean) e.first).booleanValue();
        }
        synchronized (f14246a) {
            try {
                if (e == null) {
                    boolean z = false;
                    a aVar = new a((byte) 0);
                    if (!"1".equals(aVar.b("ro.kernel.qemu")) && !"1".equals(aVar.b("ro.boot.qemu"))) {
                        if (a.a("vbox")) {
                            aVar.f14247a = "vbox";
                        } else {
                            if (GlobalSettings.getBoolValue(92)) {
                                if (!a.a("x86")) {
                                    String[] a2 = aVar.a();
                                    if (a2 != null && a2.length > 0) {
                                        for (String str : a2) {
                                            if (!TextUtils.isEmpty(str) && str.contains("x86")) {
                                                aVar.f14247a = "abi-x86";
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    aVar.f14247a = "hf-x86";
                                }
                            }
                            z = true;
                        }
                        e = new Pair<>(Boolean.valueOf(z), aVar.f14247a);
                    }
                    aVar.f14247a = "qemu";
                    e = new Pair<>(Boolean.valueOf(z), aVar.f14247a);
                }
                booleanValue = ((Boolean) e.first).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static String i() {
        if (e != null) {
            return (String) e.second;
        }
        return null;
    }

    public static boolean is64Bit() {
        boolean booleanValue;
        String str;
        if (d != null) {
            return d.booleanValue();
        }
        synchronized (f14246a) {
            try {
                if (d == null) {
                    d = Boolean.valueOf(q());
                    StringBuilder sb = new StringBuilder("runningIn: ");
                    if (d.booleanValue()) {
                        str = a2n.ARCH_BIT64;
                    } else {
                        str = a2n.ARCH_BIT32;
                    }
                    sb.append(str);
                    sb.append("bit");
                    Log.d("EnvInfo", sb.toString());
                }
                booleanValue = d.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean isSupportedCoreVersion(String str, String str2, String str3, String str4, String str5) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        try {
            Log.d(str, "sdkVer: " + str2 + " (minSupportCoreVer: " + str3 + f7l.BRACKET_END_STR);
            Log.d(str, "coreVer: " + str4 + " (minSupportSdkVer: " + str5 + f7l.BRACKET_END_STR);
            int[] a2 = a(str4);
            int[] a3 = a(str3);
            if (!(a2 == null || a3 == null)) {
                int i9 = a2[0];
                int i10 = a3[0];
                if (i9 >= i10 && (i9 != i10 || ((i5 = a2[1]) >= (i6 = a3[1]) && (i5 != i6 || ((i7 = a2[2]) >= (i8 = a3[2]) && (i7 != i8 || a2[3] >= a3[3])))))) {
                    int[] a4 = a(str2);
                    int[] a5 = a(str5);
                    if (!(a4 == null || a5 == null)) {
                        int i11 = a4[0];
                        int i12 = a5[0];
                        if (i11 >= i12 && (i11 != i12 || ((i = a4[1]) >= (i2 = a5[1]) && (i != i2 || ((i3 = a4[2]) >= (i4 = a5[2]) && (i3 != i4 || a4[3] >= a5[3])))))) {
                            return true;
                        }
                        Log.d(str, "minSupportSdkVer failed");
                    }
                    return false;
                }
                Log.d(str, "minSupportCoreVer failed");
            }
            return false;
        } catch (Throwable th) {
            Log.w(str, "parseVer failed", th);
            return false;
        }
    }

    public static boolean j() {
        if (b == null) {
            return false;
        }
        switch (b.getPackageName().hashCode()) {
            case -2086095549:
            case 270694045:
            case 1191029559:
            case 1335515207:
            case 1855462465:
            case 2049668591:
                return true;
            default:
                return false;
        }
    }

    public static String k() {
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            return str.trim().replaceAll("[`|=]", "");
        }
        return str;
    }

    public static String l() {
        String str = Build.BRAND;
        if (!TextUtils.isEmpty(str)) {
            return str.trim().replaceAll("[`|=]", "");
        }
        return str;
    }

    public static String m() {
        return c.a();
    }

    public static String n() {
        return d.a();
    }

    public static boolean o() {
        if (!b.f14248a.contains(":")) {
            return true;
        }
        return false;
    }

    private static boolean q() {
        Boolean bool;
        boolean is64Bit;
        if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        try {
            Object b2 = f.b("dalvik.system.VMRuntime", "getRuntime");
            if (b2 != null) {
                bool = (Boolean) f.b(b2, "is64Bit");
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        } catch (Throwable unused) {
        }
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || !str.contains(a2n.ARCH_BIT64)) {
            return false;
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private static volatile String f14250a;

        private d() {
        }

        public static String a() {
            if (TextUtils.isEmpty(f14250a)) {
                synchronized (d.class) {
                    try {
                        if (TextUtils.isEmpty(f14250a)) {
                            String stringValue = GlobalSettings.getStringValue(183);
                            if (!TextUtils.isEmpty(stringValue)) {
                                f14250a = stringValue;
                            } else if (EnvInfo.b != null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                String str = (String) f.b(OConstant.REFLECT_UTDID, "getUtdid", new Class[]{Context.class}, new Object[]{EnvInfo.b});
                                if (TextUtils.isEmpty(str)) {
                                    str = "null";
                                }
                                Log.d("EnvInfo", "initUtdid:" + str + " cost:" + (System.currentTimeMillis() - currentTimeMillis));
                                f14250a = str;
                                if (!"null".equals(f14250a)) {
                                    GlobalSettings.setValue(183, f14250a);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f14250a;
        }
    }

    public static void a(Context context) {
        if (b == null && context != null) {
            b = context.getApplicationContext();
            if (c != null && !b.equals(c)) {
                Log.e("EnvInfo", "setContext(" + b + "), it is != " + c);
            }
        }
    }

    public static boolean b(Context context) {
        return context == null || (context.getApplicationInfo().flags & 268435456) != 0;
    }

    private static int[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split.length > 3) {
            return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3])};
        }
        return null;
    }

    public static String[][] a(ClassLoader classLoader) {
        try {
            return (String[][]) f.a(classLoader, "com.uc.webview.base.build.NativeLibrariesArm".concat(is64Bit() ? a2n.ARCH_BIT64 : a2n.ARCH_BIT32), "LIBRARIES");
        } catch (Throwable th) {
            ErrorCode.NATIVE_LIBRARIES_MISSING.report(th);
            return null;
        }
    }
}
