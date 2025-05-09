package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s6y {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f27836a = "";
    public static ActivityManager b;

    static {
        t2o.a(253755454);
    }

    public static String a() {
        String str = null;
        if (TextUtils.isEmpty(null)) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/cmdline"));
                str = bufferedReader.readLine();
                if (!TextUtils.isEmpty(str)) {
                    str = str.trim();
                }
                bufferedReader.close();
            } catch (Exception unused) {
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:2:0x0000, B:9:0x0015, B:18:0x0045, B:20:0x004a, B:22:0x0052, B:23:0x0058, B:25:0x0060), top: B:37:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:2:0x0000, B:9:0x0015, B:18:0x0045, B:20:0x004a, B:22:0x0052, B:23:0x0058, B:25:0x0060), top: B:37:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r5) {
        /*
            java.lang.String r0 = tb.s6y.f27836a     // Catch: all -> 0x0048
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0048
            if (r0 == 0) goto L_0x0066
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0014
            r2 = 28
            if (r1 < r2) goto L_0x0014
            java.lang.String r1 = tb.vwv.a()     // Catch: all -> 0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            tb.s6y.f27836a = r1     // Catch: all -> 0x0048
            java.lang.String r1 = tb.s6y.f27836a     // Catch: all -> 0x0048
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: all -> 0x0048
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: all -> 0x0045
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: all -> 0x0045
            java.lang.String r2 = "currentProcessName"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: all -> 0x0045
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: all -> 0x0045
            r2 = 1
            r1.setAccessible(r2)     // Catch: all -> 0x0045
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: all -> 0x0045
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: all -> 0x0045
            boolean r2 = r1 instanceof java.lang.String     // Catch: all -> 0x0045
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = (java.lang.String) r1     // Catch: all -> 0x0045
            r0 = r1
        L_0x0045:
            tb.s6y.f27836a = r0     // Catch: all -> 0x0048
            goto L_0x004a
        L_0x0048:
            goto L_0x0066
        L_0x004a:
            java.lang.String r0 = tb.s6y.f27836a     // Catch: all -> 0x0048
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0048
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = a()     // Catch: all -> 0x0048
            tb.s6y.f27836a = r0     // Catch: all -> 0x0048
        L_0x0058:
            java.lang.String r0 = tb.s6y.f27836a     // Catch: all -> 0x0048
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0048
            if (r0 == 0) goto L_0x0066
            java.lang.String r5 = c(r5)     // Catch: all -> 0x0048
            tb.s6y.f27836a = r5     // Catch: all -> 0x0048
        L_0x0066:
            java.lang.String r5 = tb.s6y.f27836a
            if (r5 != 0) goto L_0x006e
            java.lang.String r5 = ""
            tb.s6y.f27836a = r5
        L_0x006e:
            java.lang.String r5 = tb.s6y.f27836a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s6y.b(android.content.Context):java.lang.String");
    }

    public static String c(Context context) {
        int i;
        try {
            if (b == null && context != null) {
                b = (ActivityManager) context.getApplicationContext().getSystemService("activity");
            }
            ActivityManager activityManager = b;
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    int i2 = runningAppProcessInfo.pid;
                    try {
                        i = Process.myPid();
                        continue;
                    } catch (Exception unused) {
                        i = -1;
                        continue;
                    }
                    if (i2 == i) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return "";
    }
}
