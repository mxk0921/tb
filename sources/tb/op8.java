package tb;

import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class op8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean trackerExposureOpen = true;
    public static int timeThreshold = 500;
    public static int maxTimeThreshold = 3600000;
    public static double dimThreshold = 0.5d;

    /* renamed from: a  reason: collision with root package name */
    public static String f25545a = null;
    public static boolean notClearTagAfterDisAppear = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.op8$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC1016a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1016a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    op8.updateExposureConfig();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                op8.access$000(iaq.a(wu3.c().b(), "autoExposure"));
                ccu.getInstance().getThreadHandle().postDelayed(new RunnableC1016a(), 15000L);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(962593278);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r9.equalsIgnoreCase(tb.op8.f25545a) == false) goto L_0x0021;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r9) {
        /*
            java.lang.String r0 = "timeThreshold"
            r1 = 0
            r2 = 1
            java.lang.String r3 = "1"
            com.android.alibaba.ip.runtime.IpChange r4 = tb.op8.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0017
            java.lang.String r0 = "86868d63"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r9
            r4.ipc$dispatch(r0, r2)
            return
        L_0x0017:
            if (r9 == 0) goto L_0x0021
            java.lang.String r4 = tb.op8.f25545a     // Catch: all -> 0x00b6
            boolean r4 = r9.equalsIgnoreCase(r4)     // Catch: all -> 0x00b6
            if (r4 != 0) goto L_0x00b6
        L_0x0021:
            if (r9 != 0) goto L_0x0029
            java.lang.String r4 = tb.op8.f25545a     // Catch: all -> 0x00b6
            if (r4 != 0) goto L_0x0029
            goto L_0x00b6
        L_0x0029:
            tb.op8.f25545a = r9     // Catch: all -> 0x00b6
            tb.wu3 r9 = tb.wu3.c()     // Catch: all -> 0x00b6
            android.content.Context r9 = r9.b()     // Catch: all -> 0x00b6
            java.lang.String r4 = "autoExposure"
            java.lang.String r5 = tb.op8.f25545a     // Catch: all -> 0x00b6
            tb.iaq.b(r9, r4, r5)     // Catch: all -> 0x00b6
            java.lang.String r9 = tb.op8.f25545a     // Catch: all -> 0x00b6
            if (r9 == 0) goto L_0x00ac
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.Object r9 = com.alibaba.fastjson.JSON.parseObject(r9, r4)     // Catch: Exception -> 0x0062, all -> 0x00b6
            java.util.Map r9 = (java.util.Map) r9     // Catch: Exception -> 0x0062, all -> 0x00b6
            if (r9 == 0) goto L_0x00b6
            int r4 = r9.size()     // Catch: Exception -> 0x0062, all -> 0x00b6
            if (r4 <= 0) goto L_0x00b6
            java.lang.String r4 = "turnOn"
            java.lang.Object r4 = r9.get(r4)     // Catch: Exception -> 0x0062, all -> 0x00b6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: Exception -> 0x0062, all -> 0x00b6
            boolean r4 = r4.equals(r3)     // Catch: Exception -> 0x0062, all -> 0x00b6
            if (r4 == 0) goto L_0x0064
            tb.op8.trackerExposureOpen = r2     // Catch: Exception -> 0x0062, all -> 0x00b6
            goto L_0x0066
        L_0x0062:
            r9 = move-exception
            goto L_0x00a8
        L_0x0064:
            tb.op8.trackerExposureOpen = r1     // Catch: Exception -> 0x0062, all -> 0x00b6
        L_0x0066:
            java.lang.Object r4 = r9.get(r0)     // Catch: Exception -> 0x0062, all -> 0x00b6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: Exception -> 0x0062, all -> 0x00b6
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: Exception -> 0x0073, all -> 0x00b6
            goto L_0x0074
        L_0x0073:
            r4 = -1
        L_0x0074:
            if (r4 < 0) goto L_0x0078
            tb.op8.timeThreshold = r4     // Catch: Exception -> 0x0062, all -> 0x00b6
        L_0x0078:
            java.lang.String r4 = "areaThreshold"
            java.lang.Object r4 = r9.get(r4)     // Catch: Exception -> 0x0062, all -> 0x00b6
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: Exception -> 0x0062, all -> 0x00b6
            double r4 = java.lang.Double.parseDouble(r4)     // Catch: Exception -> 0x0087, all -> 0x00b6
            goto L_0x0089
        L_0x0087:
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x0089:
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0091
            tb.op8.dimThreshold = r4     // Catch: Exception -> 0x0062, all -> 0x00b6
        L_0x0091:
            java.lang.String r4 = "notClearTag"
            java.lang.Object r9 = r9.get(r4)     // Catch: Exception -> 0x0062, all -> 0x00b6
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: Exception -> 0x0062, all -> 0x00b6
            boolean r9 = r9.equals(r3)     // Catch: Exception -> 0x0062, all -> 0x00b6
            if (r9 == 0) goto L_0x00a5
            tb.op8.notClearTagAfterDisAppear = r2     // Catch: Exception -> 0x0062, all -> 0x00b6
            goto L_0x00b6
        L_0x00a5:
            tb.op8.notClearTagAfterDisAppear = r1     // Catch: Exception -> 0x0062, all -> 0x00b6
            goto L_0x00b6
        L_0x00a8:
            r9.printStackTrace()     // Catch: all -> 0x00b6
            goto L_0x00b6
        L_0x00ac:
            tb.op8.trackerExposureOpen = r2     // Catch: all -> 0x00b6
            r9 = 500(0x1f4, float:7.0E-43)
            tb.op8.timeThreshold = r9     // Catch: all -> 0x00b6
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            tb.op8.dimThreshold = r3     // Catch: all -> 0x00b6
        L_0x00b6:
            boolean r9 = tb.op8.trackerExposureOpen
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            int r3 = tb.op8.timeThreshold
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            double r4 = tb.op8.dimThreshold
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "trackerExposureOpen"
            r5[r1] = r6
            r5[r2] = r9
            r9 = 2
            r5[r9] = r0
            r9 = 3
            r5[r9] = r3
            java.lang.String r9 = " dimThreshold"
            r0 = 4
            r5[r0] = r9
            r9 = 5
            r5[r9] = r4
            java.lang.String r9 = "ExposureConfigMgr"
            tb.un8.d(r9, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.op8.a(java.lang.String):void");
    }

    public static /* synthetic */ void access$000(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38fae181", new Object[]{str});
        } else {
            a(str);
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else {
            zdt.c().f(new a());
        }
    }

    public static void updateExposureConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3847d9", new Object[0]);
            return;
        }
        try {
            a(AnalyticsMgr.N("autoExposure"));
        } catch (Throwable unused) {
        }
    }
}
