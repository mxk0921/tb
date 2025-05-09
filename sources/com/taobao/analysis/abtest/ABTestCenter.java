package com.taobao.analysis.abtest;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.crt;
import tb.gzu;
import tb.i2p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ABTestCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SPEED_BUCKET_DEFAULT = "";
    private static final String SP_UTABTEST_PRE = "nw_abtest_";
    private static final String TAG = "falco.ABTestManager";
    private static final String UTABTEST_NAMESPACE = "middleware_yixiu";
    private static Method getExperimentBucketIdMethod;
    private static Method getValueMethod;
    private static Method getVariationMethod;
    private static Method isSpeedEditionMethod;
    private static boolean isTbSpeedSdkValid;
    private static boolean isUTABTestValid;
    private static volatile String tbSpeedBucket;
    private static Class tbSpeedClazz;
    private static Class utABTestClazz;
    private static Method utABTestMethod;
    private static Map<String, gzu> utabTestInfos = new ConcurrentHashMap();
    private static Class variationClazz;
    private static Class variationSetClazz;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements AppLifecycle.AppLifecycleListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.analysis.abtest.ABTestCenter$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0325a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0325a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ABTestCenter.access$000();
                }
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("550392b5", new Object[]{this});
            } else {
                crt.k(new RunnableC0325a());
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5402817", new Object[]{this});
            }
        }
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            updateUTABTestInfo();
        }
    }

    private static String getString(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && (context = GlobalAppRuntimeInfo.getContext()) != null) {
            return PreferenceManager.getDefaultSharedPreferences(context).getString(str, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        com.taobao.analysis.abtest.ABTestCenter.tbSpeedBucket = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getTBSpeedBucket() {
        /*
            java.lang.String r0 = ""
            boolean r1 = com.taobao.analysis.abtest.ABTestCenter.isTbSpeedSdkValid
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r1 = com.taobao.analysis.abtest.ABTestCenter.tbSpeedBucket
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r3 = 0
            java.lang.Class r4 = com.taobao.analysis.abtest.ABTestCenter.tbSpeedClazz     // Catch: all -> 0x0027, Exception -> 0x0029
            java.lang.String r5 = "getSubEdition"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: all -> 0x0027, Exception -> 0x0029
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: all -> 0x0027, Exception -> 0x0029
            if (r4 == 0) goto L_0x002b
            java.lang.Class r5 = com.taobao.analysis.abtest.ABTestCenter.tbSpeedClazz     // Catch: all -> 0x0027, Exception -> 0x0029
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: all -> 0x0027, Exception -> 0x0029
            java.lang.Object r4 = r4.invoke(r5, r6)     // Catch: all -> 0x0027, Exception -> 0x0029
            java.lang.String r4 = (java.lang.String) r4     // Catch: all -> 0x0027, Exception -> 0x0029
            r1 = r4
            goto L_0x002b
        L_0x0027:
            r0 = move-exception
            goto L_0x0030
        L_0x0029:
            r4 = move-exception
            goto L_0x0031
        L_0x002b:
            if (r1 != 0) goto L_0x002e
            goto L_0x003e
        L_0x002e:
            r0 = r1
            goto L_0x003e
        L_0x0030:
            throw r0
        L_0x0031:
            java.lang.String r5 = "falco.ABTestManager"
            java.lang.String r6 = "getTbSpeedInfo fail."
            java.lang.Object[] r3 = new java.lang.Object[r3]
            anet.channel.util.ALog.e(r5, r6, r2, r4, r3)
            if (r1 != 0) goto L_0x002e
        L_0x003e:
            com.taobao.analysis.abtest.ABTestCenter.tbSpeedBucket = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.abtest.ABTestCenter.getTBSpeedBucket():java.lang.String");
    }

    public static String getUTABTestBucketId(String str) {
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf26fbc2", new Object[]{str});
        }
        if (!isUTABTestValid || TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (ABTestCenter.class) {
            try {
                Map<String, gzu> map = utabTestInfos;
                gzu gzuVar = map.get(str);
                if (gzuVar == null) {
                    gzuVar = new gzu(str, getString(SP_UTABTEST_PRE + str));
                    map.put(str, gzuVar);
                    utabTestInfos = map;
                }
                valueOf = String.valueOf(gzuVar.b);
            } catch (Throwable th) {
                throw th;
            }
        }
        return valueOf;
    }

    public static String getUTABTestValue(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de9f6bc", new Object[]{str, str2});
        }
        if (!isUTABTestValid || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        synchronized (ABTestCenter.class) {
            try {
                Map<String, gzu> map = utabTestInfos;
                gzu gzuVar = map.get(str);
                if (gzuVar == null) {
                    gzuVar = new gzu(str, getString(SP_UTABTEST_PRE + str));
                }
                if (!gzuVar.f20331a.containsKey(str2)) {
                    gzuVar.f20331a.put(str2, null);
                }
                map.put(str, gzuVar);
                utabTestInfos = map;
                str3 = gzuVar.f20331a.get(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    public static boolean isTBSpeedEdition(String str) {
        Context context;
        Method method;
        if (!isTbSpeedSdkValid) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                context = GlobalAppRuntimeInfo.getContext();
                if (context == null || (method = isSpeedEditionMethod) == null) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return ((Boolean) method.invoke(tbSpeedClazz, context, str)).booleanValue();
    }

    private static void putString(String str, String str2) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && (context = GlobalAppRuntimeInfo.getContext()) != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    private static void updateUTABTestInfo() {
        gzu value;
        if (isUTABTestValid) {
            try {
                for (Map.Entry<String, gzu> entry : utabTestInfos.entrySet()) {
                    String key = entry.getKey();
                    Object invoke = utABTestMethod.invoke(utABTestClazz, UTABTEST_NAMESPACE, key);
                    if (!(invoke == null || (value = entry.getValue()) == null)) {
                        gzu gzuVar = new gzu(key);
                        boolean z = false;
                        for (Map.Entry<String, String> entry2 : value.f20331a.entrySet()) {
                            String key2 = entry2.getKey();
                            Object invoke2 = getVariationMethod.invoke(invoke, key2);
                            if (invoke2 == null) {
                                break;
                            }
                            String str = (String) getValueMethod.invoke(invoke2, "");
                            gzuVar.f20331a.put(key2, str);
                            if (!TextUtils.isEmpty(str) && !str.equals(entry2.getValue())) {
                                z = true;
                            }
                        }
                        long longValue = ((Long) getExperimentBucketIdMethod.invoke(invoke, new Object[0])).longValue();
                        gzuVar.b = longValue;
                        if (longValue != value.b) {
                            z = true;
                        }
                        if (z) {
                            putString(SP_UTABTEST_PRE + key, gzuVar.toString());
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                ALog.e(TAG, "updateUTABTestInfo error.", null, th, new Object[0]);
            }
        }
    }

    static {
        try {
            IpChange ipChange = UTABTest.$ipChange;
            utABTestClazz = UTABTest.class;
            utABTestMethod = UTABTest.class.getMethod(i2p.TYPE_ACTIVATE, String.class, String.class);
            variationSetClazz = VariationSet.class;
            getVariationMethod = VariationSet.class.getMethod("getVariation", String.class);
            getExperimentBucketIdMethod = variationSetClazz.getMethod("getExperimentBucketId", new Class[0]);
            variationClazz = Variation.class;
            getValueMethod = Variation.class.getMethod("getValueAsString", String.class);
            isUTABTestValid = true;
        } catch (Exception e) {
            isUTABTestValid = false;
            ALog.e(TAG, "UTABTest not support.", null, e, new Object[0]);
        }
        try {
            IpChange ipChange2 = TBSpeed.$ipChange;
            tbSpeedClazz = TBSpeed.class;
            isSpeedEditionMethod = TBSpeed.class.getDeclaredMethod("isSpeedEdition", Context.class, String.class);
            isTbSpeedSdkValid = true;
        } catch (Exception e2) {
            isTbSpeedSdkValid = false;
            ALog.e(TAG, "TBSpeed not support.", null, e2, new Object[0]);
        }
        AppLifecycle.registerLifecycleListener(new a());
    }
}
