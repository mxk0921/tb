package com.alibaba.one.android.inner;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.gat;

/* loaded from: classes.dex */
public class UserTrackBridge {

    /* renamed from: a  reason: collision with root package name */
    private static Context f2502a;
    private static String b;
    private static long c = System.nanoTime();
    private static long d = System.currentTimeMillis();
    private static volatile int e = 0;
    private static volatile int f = 0;
    private static Class g = null;
    private static Class h = null;
    private static Class i = null;
    private static Constructor j = null;
    private static Method k = null;
    private static Method l = null;
    private static Method m = null;
    private static Method n = null;

    public static void addUtRecord(String str, String str2, String str3) {
        Map map;
        Object invoke;
        Object invoke2;
        if (!(isUtAvaiable() == 0 || str2 == null || str2.length() == 0)) {
            try {
                String valueOf = String.valueOf(str);
                HashMap hashMap = new HashMap();
                hashMap.put("pn", getProcessName());
                StringBuilder sb = new StringBuilder();
                sb.append(Process.myPid());
                hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Process.myTid());
                hashMap.put("ppid", sb2.toString());
                hashMap.put(MspGlobalDefine.PA, b);
                long nanoTime = System.nanoTime();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(System.currentTimeMillis());
                hashMap.put(gat.CT, sb3.toString());
                hashMap.put("ctu", String.valueOf((d * 1000) + ((nanoTime - c) / 1000)));
                String convertWithIteration = convertWithIteration(hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("v", String.valueOf(str3));
                Object newInstance = j.newInstance("Page_EcoOneSDK", 19997, str2, valueOf, convertWithIteration, hashMap2);
                if (newInstance != null && (map = (Map) k.invoke(newInstance, new Object[0])) != null && map.size() != 0 && (invoke = l.invoke(h, new Object[0])) != null && (invoke2 = m.invoke(invoke, new Object[0])) != null) {
                    n.invoke(invoke2, map);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static String convertWithIteration(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(str + "=" + map.get(str) + ",");
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r2 == null) goto L_0x0067;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getProcessName() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 28
            if (r0 < r2) goto L_0x001f
            java.lang.String r0 = "android.app.Application"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: Exception -> 0x001f
            java.lang.String r2 = "getProcessName"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: Exception -> 0x001f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch: Exception -> 0x001f
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: Exception -> 0x001f
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: Exception -> 0x001f
            java.lang.String r0 = (java.lang.String) r0     // Catch: Exception -> 0x001f
            return r0
        L_0x001f:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "/proc/"
            r2.<init>(r3)
            int r3 = android.os.Process.myPid()
            r2.append(r3)
            java.lang.String r3 = "/cmdline"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: all -> 0x005c, Exception -> 0x0063
            java.io.FileReader r3 = new java.io.FileReader     // Catch: all -> 0x005c, Exception -> 0x0063
            r3.<init>(r0)     // Catch: all -> 0x005c, Exception -> 0x0063
            r2.<init>(r3)     // Catch: all -> 0x005c, Exception -> 0x0063
            java.lang.String r0 = r2.readLine()     // Catch: all -> 0x0057, Exception -> 0x005a
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r0.trim()     // Catch: all -> 0x0057, Exception -> 0x005a
            r2.close()     // Catch: IOException -> 0x0052
        L_0x0052:
            return r0
        L_0x0053:
            r2.close()     // Catch: IOException -> 0x0067
            goto L_0x0067
        L_0x0057:
            r0 = move-exception
            r1 = r2
            goto L_0x005d
        L_0x005a:
            goto L_0x0064
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch: IOException -> 0x0062
        L_0x0062:
            throw r0
        L_0x0063:
            r2 = r1
        L_0x0064:
            if (r2 == 0) goto L_0x0067
            goto L_0x0053
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.android.inner.UserTrackBridge.getProcessName():java.lang.String");
    }

    public static void init(Context context) {
        ApplicationInfo applicationInfo;
        if (context != null) {
            f2502a = context;
            if (context != null && (applicationInfo = context.getApplicationInfo()) != null) {
                b = applicationInfo.packageName;
            }
        }
    }

    public static int isUtAvaiable() {
        if (f == 0) {
            synchronized (UserTrackBridge.class) {
                if (f == 0) {
                    try {
                        g = Class.forName("com.ut.mini.internal.UTOriginalCustomHitBuilder");
                        h = Class.forName("com.ut.mini.UTAnalytics");
                        i = Class.forName("com.ut.mini.UTTracker");
                        j = g.getConstructor(String.class, Integer.TYPE, String.class, String.class, String.class, Map.class);
                        k = g.getMethod(CartRecommendRefreshScene.build, new Class[0]);
                        l = h.getMethod("getInstance", new Class[0]);
                        m = h.getMethod("getDefaultTracker", new Class[0]);
                        n = i.getMethod("send", Map.class);
                        e = 1;
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    }
                    f = 1;
                }
            }
        }
        return e;
    }
}
