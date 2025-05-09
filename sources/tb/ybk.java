package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ybk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597074);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77efb12", new Object[0]);
        }
        return Build.MANUFACTURER;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("667d0659", new Object[0])).intValue();
        }
        String g = g("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(g)) {
            return -1;
        }
        try {
            return Integer.parseInt(g) + 2;
        } catch (Exception e) {
            h36.d("OSUtils", "get MIUI version code failed: " + g, e);
            return -1;
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c992dfd1", new Object[0]);
        }
        return Build.VERSION.INCREMENTAL;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51197fd4", new Object[0]);
        }
        if (h()) {
            return "MIUI";
        }
        return "OTHER";
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bab610", new Object[0]);
        }
        if (i()) {
            return g("ro.miui.ui.version.name");
        }
        return "";
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1d5475", new Object[0]);
        }
        return Build.MODEL;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(java.lang.String r4) {
        /*
            java.lang.String r0 = "getprop "
            com.android.alibaba.ip.runtime.IpChange r1 = tb.ybk.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "a5b062d5"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r1.ipc$dispatch(r0, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0017:
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: all -> 0x004e, Exception -> 0x0050
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x004e, Exception -> 0x0050
            r3.<init>(r0)     // Catch: all -> 0x004e, Exception -> 0x0050
            r3.append(r4)     // Catch: all -> 0x004e, Exception -> 0x0050
            java.lang.String r4 = r3.toString()     // Catch: all -> 0x004e, Exception -> 0x0050
            java.lang.Process r4 = r2.exec(r4)     // Catch: all -> 0x004e, Exception -> 0x0050
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: all -> 0x004e, Exception -> 0x0050
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: all -> 0x004e, Exception -> 0x0050
            java.io.InputStream r4 = r4.getInputStream()     // Catch: all -> 0x004e, Exception -> 0x0050
            r2.<init>(r4)     // Catch: all -> 0x004e, Exception -> 0x0050
            r4 = 1024(0x400, float:1.435E-42)
            r0.<init>(r2, r4)     // Catch: all -> 0x004e, Exception -> 0x0050
            java.lang.String r1 = r0.readLine()     // Catch: all -> 0x0049, Exception -> 0x004c
            r0.close()     // Catch: IOException -> 0x0044
            goto L_0x005a
        L_0x0044:
            r4 = move-exception
            tb.xv5.b(r4)
            goto L_0x005a
        L_0x0049:
            r4 = move-exception
            r1 = r0
            goto L_0x005b
        L_0x004c:
            r4 = move-exception
            goto L_0x0052
        L_0x004e:
            r4 = move-exception
            goto L_0x005b
        L_0x0050:
            r4 = move-exception
            r0 = r1
        L_0x0052:
            tb.xv5.b(r4)     // Catch: all -> 0x0049
            if (r0 == 0) goto L_0x005a
            r0.close()     // Catch: IOException -> 0x0044
        L_0x005a:
            return r1
        L_0x005b:
            if (r1 == 0) goto L_0x0065
            r1.close()     // Catch: IOException -> 0x0061
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            tb.xv5.b(r0)
        L_0x0065:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ybk.g(java.lang.String):java.lang.String");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b8a3905", new Object[0])).booleanValue();
        }
        return !TextUtils.isEmpty(g("ro.miui.ui.version.name")) || b() != -1;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfeca090", new Object[0])).booleanValue();
        }
        return "Xiaomi".equals(Build.MANUFACTURER);
    }
}
