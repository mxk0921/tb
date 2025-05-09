package com.uc.webview.base;

import android.os.Bundle;
import com.uc.crashsdk.export.CrashApi;
import com.uc.webview.base.task.d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f14260a;
    private static volatile Class b;
    private static volatile Object c;
    private static volatile Method d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        Throwable c;

        /* renamed from: a  reason: collision with root package name */
        public boolean f14262a = true;
        boolean b = false;
        ArrayList<String> d = new ArrayList<>(9);
        ArrayList<String> e = new ArrayList<>(5);

        public a(String str, Throwable th) {
            a("k_ct", "exception");
            a("k_ac", str);
            this.c = th;
        }

        public final a a(String str, String str2) {
            ArrayList<String> arrayList = this.d;
            arrayList.add(str + ": " + str2);
            return this;
        }

        public final a b(String str, String str2) {
            ArrayList<String> arrayList = this.e;
            arrayList.add(str + ":\n" + str2);
            return this;
        }
    }

    public static void a() {
        try {
            e();
        } catch (Throwable th) {
            Log.w("CrashSdkHelper", "init failed", th);
        }
    }

    public static int b() {
        int i = 0;
        try {
            i = ((Integer) a("getLastExitTypeEx", null, null)).intValue();
            Log.d("CrashSdkHelper", "getLastExitTypeEx result:".concat(String.valueOf(i)));
            return i;
        } catch (Throwable th) {
            Log.w("CrashSdkHelper", "getLastExitTypeEx failed", th);
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() throws Exception {
        if (!f14260a) {
            synchronized (b.class) {
                try {
                    if (!f14260a) {
                        f14260a = true;
                        try {
                            b = CrashApi.class;
                            c = f.a((Class<?>) CrashApi.class, "getInstance", (Class[]) null, (Object[]) null);
                        } catch (Throwable unused) {
                        }
                        if (c == null) {
                            try {
                                Class<?> cls = Class.forName("com.uc2.crashsdk.export.CrashApi");
                                b = cls;
                                c = f.a(cls, "getInstance", (Class[]) null, (Object[]) null);
                            } catch (Throwable unused2) {
                            }
                        }
                        if (c == null) {
                            b = null;
                        }
                        d = f.a(b, "addHeaderInfo", String.class, String.class);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(final String str, final String str2) {
        d.b("addHeaderInfo", new Runnable() { // from class: com.uc.webview.base.b.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.e();
                    b.a(b.d, new Object[]{str, str2});
                    Log.d("CrashSdkHelper", "addHeaderInfo: " + str + "=" + str2);
                } catch (Throwable th) {
                    Log.w("CrashSdkHelper", "addHeaderInfo failed", th);
                }
            }
        });
    }

    public static void a(a aVar) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<String> it = aVar.d.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append("\n");
            }
            stringBuffer.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\nException message:\nBack traces starts.\n");
            stringBuffer.append(Log.a(aVar.c));
            stringBuffer.append("Back traces ends.\n");
            Iterator<String> it2 = aVar.e.iterator();
            while (it2.hasNext()) {
                stringBuffer.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                stringBuffer.append(it2.next());
                stringBuffer.append("\n");
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("mAddLogcat", aVar.f14262a);
            bundle.putBoolean("mUploadNow", aVar.b);
            bundle.putBoolean("mAddThreadsDump", true);
            bundle.putBoolean("mAddBuildId", true);
            a("generateCustomLog", new Class[]{StringBuffer.class, String.class, Bundle.class}, new Object[]{stringBuffer, "exception", bundle});
            Log.d("CrashSdkHelper", "generateCustomLog size:" + stringBuffer.length());
        } catch (Throwable th) {
            Log.w("CrashSdkHelper", "generateCustomLog failed", th);
        }
    }

    public static void a(String str, Callable<String> callable) {
        try {
            a("registerInfoCallback", new Class[]{String.class, Integer.TYPE, Callable.class}, new Object[]{str, 1048593, callable});
            Log.d("CrashSdkHelper", "registerInfoCallback category:" + str + ", logType:1048593");
        } catch (Throwable th) {
            Log.w("CrashSdkHelper", "registerInfoCallback failed", th);
        }
    }

    public static String a(String str) {
        Throwable th;
        String str2 = null;
        try {
            try {
                String str3 = (String) a("getLastExitExtraInfo", new Class[]{String.class}, new Object[]{str});
                try {
                    Log.d("CrashSdkHelper", "getLastExitExtraInfo result:".concat(String.valueOf(str3)));
                    return str3;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str3;
                    Log.w("CrashSdkHelper", "getLastExitExtraInfo failed", th);
                    return str2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static Object a(String str, Class[] clsArr, Object[] objArr) throws Exception {
        e();
        Method a2 = f.a(b, str, clsArr);
        if (a2 != null) {
            return a2.invoke(c, objArr);
        }
        return null;
    }

    public static /* synthetic */ Object a(Method method, Object[] objArr) throws Exception {
        if (method != null) {
            return method.invoke(c, objArr);
        }
        return null;
    }
}
