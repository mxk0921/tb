package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.analytics.core.selfmonitor.exception.AppMonitorException;
import com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.model.Metric;
import com.alibaba.appmonitor.offline.TempAlarm;
import com.alibaba.appmonitor.offline.TempCounter;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class j71 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Application b;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f21807a = false;
    public static volatile boolean c = false;
    public static final Map<String, String> d = new ConcurrentHashMap();

    static {
        t2o.a(962593019);
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b0dd0c", new Object[]{new Boolean(z)});
            return;
        }
        nhh.f("AppMonitorDelegate", "[enableLog]");
        nhh.s(z);
    }

    public static Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ee9a6762", new Object[0]);
        }
        return d;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        if (mp7.b()) {
            return false;
        }
        return f21807a;
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286ea5cd", new Object[]{str});
        } else {
            ((ConcurrentHashMap) d).remove(str);
        }
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56d47b5", new Object[]{str, str2});
        } else if (!hsq.f(str) && str2 != null) {
            ((ConcurrentHashMap) d).put(str, str2);
        }
    }

    public static void i(boolean z, boolean z2, String str, String str2) {
        x4e x4eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5136307e", new Object[]{new Boolean(z), new Boolean(z2), str, str2});
            return;
        }
        if (z) {
            x4eVar = new v2v(str, str2);
        } else {
            x4eVar = new yzu(str, str2, z2);
        }
        o2w.k().X(x4eVar);
    }

    public static void j(int i) {
        EventType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
            return;
        }
        nhh.f("AppMonitorDelegate", "[setSampling]");
        for (EventType eventType : EventType.values()) {
            eventType.setDefaultSampling(i);
            sa.h().o(eventType, i);
        }
    }

    public static void k(int i) {
        EventType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
            return;
        }
        for (EventType eventType : EventType.values()) {
            eventType.setStatisticsInterval(i);
            l(eventType, i);
        }
    }

    public static void l(EventType eventType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30fd404d", new Object[]{eventType, new Integer(i)});
            return;
        }
        try {
            if (c && eventType != null) {
                t44.c(eventType.getEventId(), i);
                if (i > 0) {
                    eventType.setOpen(true);
                } else {
                    eventType.setOpen(false);
                }
            }
        } catch (Throwable th) {
            ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
        }
    }

    public static void n(String str, String str2, String str3, double d2, double d3, double d4) {
        Metric c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205fd704", new Object[]{str, str2, str3, new Double(d2), new Double(d3), new Double(d4)});
            return;
        }
        nhh.f("AppMonitorDelegate", "[updateMeasure]");
        try {
            if (c && !hsq.e(str) && !hsq.e(str2) && (c2 = lti.d().c(str, str2)) != null && c2.getMeasureSet() != null) {
                c2.getMeasureSet().upateMeasure(new Measure(str3, Double.valueOf(d4), Double.valueOf(d2), Double.valueOf(d3)));
            }
        } catch (Exception unused) {
        }
    }

    public static synchronized void a() {
        synchronized (j71.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[0]);
                return;
            }
            nhh.f("AppMonitorDelegate", "start destory");
            if (c) {
                t44.d();
                t44.a();
                ts3.a();
                Application application = b;
                if (application != null) {
                    NetworkUtil.n(application.getApplicationContext());
                }
                c = false;
            }
        }
    }

    public static synchronized void m() {
        synchronized (j71.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("711015e0", new Object[0]);
                return;
            }
            nhh.f("AppMonitorDelegate", "triggerUpload");
            if (c && o2w.J()) {
                t44.d();
            }
        }
    }

    public static synchronized void d(Application application) {
        synchronized (j71.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3847dd28", new Object[]{application});
                return;
            }
            nhh.f("AppMonitorDelegate", "start init");
            if (!c) {
                b = application;
                ts3.b();
                t44.b();
                ko1.a();
                c = true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593020);
        }

        @Deprecated
        public static boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("198741f1", new Object[]{str, str2})).booleanValue();
            }
            return sa.h().e(str, str2, Boolean.TRUE, null);
        }

        public static void b(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
            } else {
                c(str, str2, null, str3, str4);
            }
        }

        public static void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
            } else {
                e(str, str2, null);
            }
        }

        public static void f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
            } else {
                sa.h().o(EventType.ALARM, i);
            }
        }

        public static void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
                return;
            }
            EventType eventType = EventType.ALARM;
            eventType.setStatisticsInterval(i);
            j71.l(eventType, i);
        }

        public static void c(String str, String str2, String str3, String str4, String str5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49c1ffee", new Object[]{str, str2, str3, str4, str5});
                return;
            }
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("_status", "0");
                    if (j71.c && o2w.J()) {
                        EventType eventType = EventType.ALARM;
                        if (eventType.isOpen()) {
                            if (!j71.e()) {
                                if (sa.h().e(str, str2, Boolean.FALSE, hashMap)) {
                                }
                            }
                            nhh.f("commitFail ", "module", str, "monitorPoint", str2, "errorCode:", str4, "errorMsg:", str5);
                            if (sa.h().k(eventType, str, str2)) {
                                Context g = o2w.k().g();
                                ait.v().g(eventType, new TempAlarm(str, str2, str3, str4, str5, false, NetworkUtil.c(g), NetworkUtil.d(g)));
                                return;
                            }
                            fl8.s().a(eventType.getEventId(), str, str2, str3, str4, str5);
                            return;
                        }
                    }
                    nhh.r("log discard !", "module", str, "monitorPoint", str2, "errorCode:", str4, "errorMsg:", str5);
                    return;
                }
                nhh.v("AppMonitorDelegate", "module & monitorPoint must not null");
            } catch (Throwable th) {
                ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }

        public static void e(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d3416f1", new Object[]{str, str2, str3});
                return;
            }
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    if (j71.c && o2w.J()) {
                        EventType eventType = EventType.ALARM;
                        if (eventType.isOpen()) {
                            if (!j71.e()) {
                                if (sa.h().e(str, str2, Boolean.TRUE, null)) {
                                }
                            }
                            nhh.f("commitSuccess", "module", str, "monitorPoint", str2, "arg", str3);
                            if (sa.h().k(eventType, str, str2)) {
                                Context g = o2w.k().g();
                                ait.v().g(eventType, new TempAlarm(str, str2, str3, null, null, true, NetworkUtil.c(g), NetworkUtil.d(g)));
                                return;
                            }
                            fl8.s().c(eventType.getEventId(), str, str2, str3);
                            return;
                        }
                    }
                    nhh.r("log discard !", "module", str, "monitorPoint", str2, "arg", str3);
                    return;
                }
                nhh.v("AppMonitorDelegate", "module & monitorPoint must not null");
            } catch (Throwable th) {
                ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593022);
        }

        @Deprecated
        public static boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("198741f1", new Object[]{str, str2})).booleanValue();
            }
            return sa.h().f(EventType.COUNTER, str, str2);
        }

        public static void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
            } else {
                sa.h().o(EventType.COUNTER, i);
            }
        }

        public static void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
                return;
            }
            EventType eventType = EventType.COUNTER;
            eventType.setStatisticsInterval(i);
            j71.l(eventType, i);
        }

        public static void b(String str, String str2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9042c22c", new Object[]{str, str2, new Double(d)});
                return;
            }
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    if (j71.c && o2w.J()) {
                        EventType eventType = EventType.COUNTER;
                        if (eventType.isOpen()) {
                            if (!j71.e()) {
                                if (sa.h().f(eventType, str, str2)) {
                                }
                            }
                            nhh.f("commitOffLineCount", "module", str, "monitorPoint", str2, "value", Double.valueOf(d));
                            fl8.s().l(eventType.getEventId(), str, str2, null, d);
                            return;
                        }
                    }
                    nhh.r("log discard !", "module", str, "monitorPoint", str2);
                    return;
                }
                nhh.v("AppMonitorDelegate", "module & monitorPoint must not null");
            } catch (Throwable th) {
                ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593021);
        }

        @Deprecated
        public static boolean a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("198741f1", new Object[]{str, str2})).booleanValue();
            }
            return sa.h().f(EventType.COUNTER, str, str2);
        }

        public static void b(String str, String str2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9042c22c", new Object[]{str, str2, new Double(d)});
            } else {
                c(str, str2, null, d);
            }
        }

        public static void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
            } else {
                sa.h().o(EventType.COUNTER, i);
            }
        }

        public static void e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
                return;
            }
            EventType eventType = EventType.COUNTER;
            eventType.setStatisticsInterval(i);
            j71.l(eventType, i);
        }

        public static void c(String str, String str2, String str3, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d137222", new Object[]{str, str2, str3, new Double(d)});
                return;
            }
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    if (j71.c && o2w.J()) {
                        EventType eventType = EventType.COUNTER;
                        if (eventType.isOpen()) {
                            if (!j71.e()) {
                                if (sa.h().f(eventType, str, str2)) {
                                }
                            }
                            nhh.f("commitCount", "module", str, "monitorPoint", str2, "args", str3, "value", Double.valueOf(d));
                            if (sa.h().k(eventType, str, str2)) {
                                Context g = o2w.k().g();
                                ait.v().g(eventType, new TempCounter(str, str2, str3, d, NetworkUtil.c(g), NetworkUtil.d(g)));
                                return;
                            }
                            fl8.s().l(eventType.getEventId(), str, str2, str3, d);
                            return;
                        }
                    }
                    nhh.r("log discard !", "module", str, "monitorPoint", str2, "args", str3, "value", Double.valueOf(d));
                    return;
                }
                nhh.v("AppMonitorDelegate", "module & monitorPoint must not null");
            } catch (Throwable th) {
                ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593023);
        }

        @Deprecated
        public static boolean b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("198741f1", new Object[]{str, str2})).booleanValue();
            }
            return sa.h().f(EventType.STAT, str, str2);
        }

        public static void c(String str, String str2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9042c22c", new Object[]{str, str2, new Double(d)});
            } else {
                d(str, str2, null, d);
            }
        }

        public static void g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a69aa93", new Object[]{new Integer(i)});
            } else {
                sa.h().o(EventType.STAT, i);
            }
        }

        public static void h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3c1ca92", new Object[]{new Integer(i)});
                return;
            }
            EventType eventType = EventType.STAT;
            eventType.setStatisticsInterval(i);
            j71.l(eventType, i);
        }

        public static void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a24ade8e", new Object[]{str, str2, str3});
                return;
            }
            try {
                if (j71.c && o2w.J()) {
                    EventType eventType = EventType.STAT;
                    if (eventType.isOpen()) {
                        if (!j71.e()) {
                            if (sa.h().f(eventType, str, str2)) {
                            }
                        }
                        nhh.f("AppMonitorDelegate", "statEvent begin. module: ", str, " monitorPoint: ", str2, " measureName: ", str3);
                        fl8.s().e(Integer.valueOf(eventType.getEventId()), str, str2, str3);
                        return;
                    }
                }
                nhh.r("log discard !", "module", str, "monitorPoint", str2);
            } catch (Throwable th) {
                ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
            if (tb.sa.h().g(r5, r8, r9, r10 != null ? r10.getMap() : null) != false) goto L_0x004c;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void d(java.lang.String r8, java.lang.String r9, com.alibaba.mtl.appmonitor.model.DimensionValueSet r10, double r11) {
            /*
                r0 = 3
                r1 = 2
                r2 = 4
                r3 = 1
                r4 = 0
                com.android.alibaba.ip.runtime.IpChange r5 = tb.j71.d.$ipChange
                boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r6 == 0) goto L_0x0020
                java.lang.Double r6 = new java.lang.Double
                r6.<init>(r11)
                java.lang.Object[] r11 = new java.lang.Object[r2]
                r11[r4] = r8
                r11[r3] = r9
                r11[r1] = r10
                r11[r0] = r6
                java.lang.String r8 = "94480723"
                r5.ipc$dispatch(r8, r11)
                return
            L_0x0020:
                boolean r5 = tb.j71.c     // Catch: all -> 0x0043
                if (r5 == 0) goto L_0x0098
                boolean r5 = tb.o2w.J()     // Catch: all -> 0x0043
                if (r5 == 0) goto L_0x0098
                com.alibaba.appmonitor.event.EventType r5 = com.alibaba.appmonitor.event.EventType.STAT     // Catch: all -> 0x0043
                boolean r6 = r5.isOpen()     // Catch: all -> 0x0043
                if (r6 == 0) goto L_0x0098
                boolean r6 = tb.j71.e()     // Catch: all -> 0x0043
                if (r6 != 0) goto L_0x004c
                tb.sa r6 = tb.sa.h()     // Catch: all -> 0x0043
                if (r10 == 0) goto L_0x0045
                java.util.Map r7 = r10.getMap()     // Catch: all -> 0x0043
                goto L_0x0046
            L_0x0043:
                r8 = move-exception
                goto L_0x00af
            L_0x0045:
                r7 = 0
            L_0x0046:
                boolean r5 = r6.g(r5, r8, r9, r7)     // Catch: all -> 0x0043
                if (r5 == 0) goto L_0x0098
            L_0x004c:
                java.lang.String r5 = "AppMonitorDelegate"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: all -> 0x0043
                java.lang.String r6 = "statEvent commit. module: "
                r2[r4] = r6     // Catch: all -> 0x0043
                r2[r3] = r8     // Catch: all -> 0x0043
                java.lang.String r6 = " monitorPoint: "
                r2[r1] = r6     // Catch: all -> 0x0043
                r2[r0] = r9     // Catch: all -> 0x0043
                tb.nhh.f(r5, r2)     // Catch: all -> 0x0043
                tb.lti r0 = tb.lti.d()     // Catch: all -> 0x0043
                com.alibaba.appmonitor.model.Metric r0 = r0.c(r8, r9)     // Catch: all -> 0x0043
                if (r0 == 0) goto L_0x00b4
                com.alibaba.mtl.appmonitor.model.MeasureSet r0 = r0.getMeasureSet()     // Catch: all -> 0x0043
                java.util.List r0 = r0.getMeasures()     // Catch: all -> 0x0043
                int r1 = r0.size()     // Catch: all -> 0x0043
                if (r1 != r3) goto L_0x00b4
                java.lang.Object r0 = r0.get(r4)     // Catch: all -> 0x0043
                com.alibaba.mtl.appmonitor.model.Measure r0 = (com.alibaba.mtl.appmonitor.model.Measure) r0     // Catch: all -> 0x0043
                java.lang.String r0 = r0.getName()     // Catch: all -> 0x0043
                tb.to1 r1 = tb.to1.a()     // Catch: all -> 0x0043
                java.lang.Class<com.alibaba.mtl.appmonitor.model.MeasureValueSet> r2 = com.alibaba.mtl.appmonitor.model.MeasureValueSet.class
                java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: all -> 0x0043
                tb.rbo r1 = r1.d(r2, r3)     // Catch: all -> 0x0043
                com.alibaba.mtl.appmonitor.model.MeasureValueSet r1 = (com.alibaba.mtl.appmonitor.model.MeasureValueSet) r1     // Catch: all -> 0x0043
                com.alibaba.mtl.appmonitor.model.MeasureValueSet r11 = r1.setValue(r0, r11)     // Catch: all -> 0x0043
                e(r8, r9, r10, r11)     // Catch: all -> 0x0043
                goto L_0x00b4
            L_0x0098:
                java.lang.String r10 = "log discard !"
                java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: all -> 0x0043
                java.lang.String r12 = "module"
                r11[r4] = r12     // Catch: all -> 0x0043
                r11[r3] = r8     // Catch: all -> 0x0043
                java.lang.String r8 = "monitorPoint"
                r11[r1] = r8     // Catch: all -> 0x0043
                r11[r0] = r9     // Catch: all -> 0x0043
                tb.nhh.r(r10, r11)     // Catch: all -> 0x0043
                goto L_0x00b4
            L_0x00af:
                com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder$ExceptionType r9 = com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder.ExceptionType.AP
                com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder.c(r9, r8)
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.j71.d.d(java.lang.String, java.lang.String, com.alibaba.mtl.appmonitor.model.DimensionValueSet, double):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
            if (tb.sa.h().g(r10, r12, r13, r14 != null ? r14.getMap() : null) != false) goto L_0x004d;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void e(java.lang.String r12, java.lang.String r13, com.alibaba.mtl.appmonitor.model.DimensionValueSet r14, com.alibaba.mtl.appmonitor.model.MeasureValueSet r15) {
            /*
                r1 = 3
                r2 = 2
                r3 = 1
                r5 = 0
                r6 = 4
                com.android.alibaba.ip.runtime.IpChange r7 = tb.j71.d.$ipChange
                boolean r8 = r7 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r8 == 0) goto L_0x001b
                java.lang.String r8 = "f1b73ec"
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r6[r5] = r12
                r6[r3] = r13
                r6[r2] = r14
                r6[r1] = r15
                r7.ipc$dispatch(r8, r6)
                return
            L_0x001b:
                boolean r7 = tb.j71.c     // Catch: all -> 0x0044
                java.lang.String r8 = "monitorPoint"
                java.lang.String r9 = "module"
                if (r7 == 0) goto L_0x0099
                boolean r7 = tb.o2w.J()     // Catch: all -> 0x0044
                if (r7 == 0) goto L_0x0099
                com.alibaba.appmonitor.event.EventType r10 = com.alibaba.appmonitor.event.EventType.STAT     // Catch: all -> 0x0044
                boolean r7 = r10.isOpen()     // Catch: all -> 0x0044
                if (r7 == 0) goto L_0x0099
                boolean r7 = tb.j71.e()     // Catch: all -> 0x0044
                if (r7 != 0) goto L_0x004d
                tb.sa r7 = tb.sa.h()     // Catch: all -> 0x0044
                if (r14 == 0) goto L_0x0046
                java.util.Map r11 = r14.getMap()     // Catch: all -> 0x0044
                goto L_0x0047
            L_0x0044:
                r0 = move-exception
                goto L_0x00aa
            L_0x0046:
                r11 = 0
            L_0x0047:
                boolean r7 = r7.g(r10, r12, r13, r11)     // Catch: all -> 0x0044
                if (r7 == 0) goto L_0x0099
            L_0x004d:
                java.lang.String r7 = "statEvent commit"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: all -> 0x0044
                r6[r5] = r9     // Catch: all -> 0x0044
                r6[r3] = r12     // Catch: all -> 0x0044
                r6[r2] = r8     // Catch: all -> 0x0044
                r6[r1] = r13     // Catch: all -> 0x0044
                tb.nhh.f(r7, r6)     // Catch: all -> 0x0044
                tb.sa r1 = tb.sa.h()     // Catch: all -> 0x0044
                boolean r1 = r1.k(r10, r12, r13)     // Catch: all -> 0x0044
                if (r1 == 0) goto L_0x0089
                tb.o2w r1 = tb.o2w.k()     // Catch: all -> 0x0044
                android.content.Context r1 = r1.g()     // Catch: all -> 0x0044
                tb.ait r8 = tb.ait.v()     // Catch: all -> 0x0044
                com.alibaba.appmonitor.offline.TempStat r9 = new com.alibaba.appmonitor.offline.TempStat     // Catch: all -> 0x0044
                java.lang.String r6 = com.alibaba.analytics.core.network.NetworkUtil.c(r1)     // Catch: all -> 0x0044
                java.lang.String r7 = com.alibaba.analytics.core.network.NetworkUtil.d(r1)     // Catch: all -> 0x0044
                r1 = r9
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: all -> 0x0044
                r8.g(r10, r9)     // Catch: all -> 0x0044
                goto L_0x00af
            L_0x0089:
                tb.fl8 r1 = tb.fl8.s()     // Catch: all -> 0x0044
                int r2 = r10.getEventId()     // Catch: all -> 0x0044
                r3 = r12
                r4 = r13
                r5 = r15
                r6 = r14
                r1.j(r2, r3, r4, r5, r6)     // Catch: all -> 0x0044
                goto L_0x00af
            L_0x0099:
                java.lang.String r7 = "log discard !"
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: all -> 0x0044
                r6[r5] = r9     // Catch: all -> 0x0044
                r6[r3] = r12     // Catch: all -> 0x0044
                r6[r2] = r8     // Catch: all -> 0x0044
                r6[r1] = r13     // Catch: all -> 0x0044
                tb.nhh.r(r7, r6)     // Catch: all -> 0x0044
                goto L_0x00af
            L_0x00aa:
                com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder$ExceptionType r1 = com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder.ExceptionType.AP
                com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder.c(r1, r0)
            L_0x00af:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.j71.d.e(java.lang.String, java.lang.String, com.alibaba.mtl.appmonitor.model.DimensionValueSet, com.alibaba.mtl.appmonitor.model.MeasureValueSet):void");
        }

        public static void f(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eac5ec40", new Object[]{str, str2, str3});
                return;
            }
            try {
                if (j71.c && o2w.J()) {
                    EventType eventType = EventType.STAT;
                    if (eventType.isOpen()) {
                        if (!j71.e()) {
                            if (sa.h().f(eventType, str, str2)) {
                            }
                        }
                        nhh.f("statEvent end. module: ", str, " monitorPoint: ", str2, " measureName: ", str3);
                        fl8.s().n(str, str2, str3);
                        return;
                    }
                }
                nhh.r("log discard !", " module ", str, "monitorPoint", str2, " measureName", str3);
            } catch (Throwable th) {
                ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
            }
        }
    }

    public static void f(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9377804e", new Object[]{str, str2, measureSet, dimensionSet, new Boolean(z)});
            return;
        }
        try {
            if (c) {
                if (!hsq.e(str) && !hsq.e(str2)) {
                    if (lti.d().b(str, str2)) {
                        Metric metric = new Metric(str, str2, measureSet, dimensionSet, z);
                        lti.d().a(metric);
                        ait.v().h(metric);
                        return;
                    }
                    return;
                }
                nhh.f("AppMonitorDelegate", "register stat event. module: ", str, " monitorPoint: ", str2);
                if (e()) {
                    throw new AppMonitorException("register error. module and monitorPoint can't be null");
                }
            }
        } catch (Throwable th) {
            ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
        }
    }
}
