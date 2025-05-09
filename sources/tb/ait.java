package tb;

import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.model.Metric;
import com.alibaba.appmonitor.offline.TempAlarm;
import com.alibaba.appmonitor.offline.TempCounter;
import com.alibaba.appmonitor.offline.TempStat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import tb.w2v;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ait implements w2v.a, hx4, x2r.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ait j = new ait();

    /* renamed from: a  reason: collision with root package name */
    public final List<zht> f15765a = Collections.synchronizedList(new ArrayList());
    public final List<zht> b = Collections.synchronizedList(new ArrayList());
    public final List<zht> c = Collections.synchronizedList(new ArrayList());
    public final List<Metric> d = Collections.synchronizedList(new ArrayList());
    public long e = -2;
    public ScheduledFuture f = null;
    public ScheduledFuture g = null;
    public final Runnable h = new a();
    public final Runnable i = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ait.this.y();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ait.c(ait.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$alibaba$appmonitor$event$EventType;

        static {
            int[] iArr = new int[EventType.values().length];
            $SwitchMap$com$alibaba$appmonitor$event$EventType = iArr;
            try {
                iArr[EventType.ALARM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$appmonitor$event$EventType[EventType.COUNTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$appmonitor$event$EventType[EventType.STAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593055);
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ait.d(ait.this);
            ait.e(ait.this);
            ait.f(ait.this);
        }

        public /* synthetic */ d(ait aitVar, a aVar) {
            this();
        }
    }

    static {
        t2o.a(962593051);
        t2o.a(962593012);
        t2o.a(962592914);
        t2o.a(962592825);
    }

    public ait() {
        w2v.d(this);
        gx4.b().a(this);
        x2r.f().i("offline_duration", this);
        zdt.c().f(new d(this, null));
        x();
    }

    public static /* synthetic */ void c(ait aitVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ee0277", new Object[]{aitVar});
        } else {
            aitVar.q();
        }
    }

    public static /* synthetic */ void d(ait aitVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9f3735", new Object[]{aitVar});
        } else {
            aitVar.n();
        }
    }

    public static /* synthetic */ void e(ait aitVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca77d194", new Object[]{aitVar});
        } else {
            aitVar.o();
        }
    }

    public static /* synthetic */ void f(ait aitVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8506bf3", new Object[]{aitVar});
        } else {
            aitVar.p();
        }
    }

    public static ait v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ait) ipChange.ipc$dispatch("d08c66d0", new Object[0]);
        }
        return j;
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else if ("offline_duration".equalsIgnoreCase(str)) {
            x();
        }
    }

    @Override // tb.hx4
    public void b(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3eb2f5", new Object[]{this, thread, th});
            return;
        }
        nhh.d();
        y();
    }

    public void g(EventType eventType, zht zhtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0669117", new Object[]{this, eventType, zhtVar});
            return;
        }
        if (EventType.ALARM == eventType) {
            this.f15765a.add(zhtVar);
        } else if (EventType.COUNTER == eventType) {
            this.b.add(zhtVar);
        } else if (EventType.STAT == eventType) {
            this.c.add(zhtVar);
        }
        if (this.f15765a.size() >= 100 || this.b.size() >= 100 || this.c.size() >= 100) {
            this.f = zdt.c().d(null, this.h, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture == null || (scheduledFuture != null && scheduledFuture.isDone())) {
            this.f = zdt.c().d(this.f, this.h, 30000L);
        }
    }

    public void h(Metric metric) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e32d04e", new Object[]{this, metric});
            return;
        }
        if (metric != null) {
            this.d.add(metric);
        }
        if (this.d.size() >= 100) {
            this.f = zdt.c().d(null, this.h, 0L);
        } else {
            this.f = zdt.c().d(this.f, this.h, 30000L);
        }
    }

    public final void i(List<?> list) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d423caf", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            synchronized (list) {
                arrayList = new ArrayList(list);
                list.clear();
            }
            o2w.k().h().o(arrayList);
        }
    }

    public final void j(List<Metric> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe98b70d", new Object[]{this, list});
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            synchronized (list) {
                for (int i = 0; i < list.size(); i++) {
                    try {
                        Metric metric = list.get(i);
                        Metric w = w(metric.getModule(), metric.getMonitorPoint());
                        if (w != null) {
                            metric._id = w._id;
                            arrayList.add(metric);
                        } else {
                            arrayList2.add(metric);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                list.clear();
            }
            if (arrayList.size() > 0) {
                o2w.k().h().q(arrayList);
            }
            if (arrayList2.size() > 0) {
                o2w.k().h().o(arrayList2);
            }
        }
    }

    public final void k(Class<? extends rf8> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("495b7f69", new Object[]{this, cls});
            return;
        }
        m(cls);
        if (o2w.k().h().d(cls) > 50000) {
            l(cls, 10000);
        }
    }

    public final long l(Class<? extends rf8> cls, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dcb57cc", new Object[]{this, cls, new Integer(i)})).longValue();
        }
        String n = o2w.k().h().n(cls);
        c55 h = o2w.k().h();
        return h.f(cls, " _id in ( select _id from " + n + "  ORDER BY  _id ASC LIMIT " + i + " )", null);
    }

    public final int m(Class<? extends rf8> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdc61967", new Object[]{this, cls})).intValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.add(5, -7);
        c55 h = o2w.k().h();
        return h.f(cls, "commit_time< " + (instance.getTimeInMillis() / 1000), null);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6fd0025", new Object[]{this});
        } else {
            k(TempAlarm.class);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b3109a", new Object[]{this});
        } else {
            k(TempCounter.class);
        }
    }

    @Override // tb.w2v.a
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71e3320", new Object[]{this});
        } else {
            k(TempStat.class);
        }
    }

    public final void r(List<? extends zht> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642e25a3", new Object[]{this, list});
        } else {
            o2w.k().h().g(list);
        }
    }

    public final Class<? extends rf8> s(EventType eventType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("894e220d", new Object[]{this, eventType});
        }
        if (EventType.ALARM == eventType) {
            return TempAlarm.class;
        }
        if (EventType.COUNTER == eventType) {
            return TempCounter.class;
        }
        if (EventType.STAT == eventType) {
            return TempStat.class;
        }
        return zht.class;
    }

    public final long t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        int g = x2r.f().g("offline_duration");
        return g <= 0 ? IDetailCache.KEEP_MIN_HAS_CACHE_TIME : g <= 3600 ? 3600000 : g * 1000;
    }

    public List<? extends zht> u(EventType eventType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2524cede", new Object[]{this, eventType, new Integer(i)});
        }
        c55 h = o2w.k().h();
        Class<? extends rf8> s = s(eventType);
        return h.i(s, "commit_time<" + ((System.currentTimeMillis() / 1000) - (t() / 1000)), "access,sub_access,module,monitor_point", i);
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b912e5", new Object[]{this});
            return;
        }
        long t = t();
        if (this.e != t) {
            this.e = t;
            this.g = zdt.c().e(this.g, this.i, this.e);
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c724e8", new Object[]{this});
            return;
        }
        nhh.d();
        i(this.f15765a);
        i(this.b);
        i(this.c);
        j(this.d);
    }

    @Override // tb.w2v.a
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        nhh.f("TempEventMgr", "onBackground", Boolean.TRUE);
        this.f = zdt.c().d(null, this.h, 0L);
    }

    public Metric w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Metric) ipChange.ipc$dispatch("590a4f67", new Object[]{this, str, str2});
        }
        c55 h = o2w.k().h();
        List<? extends rf8> i = h.i(Metric.class, "module=\"" + str + "\" and monitor_point=\"" + str2 + "\"", null, 1);
        if (i == null || i.size() <= 0) {
            return null;
        }
        return (Metric) i.get(0);
    }

    public final void q() {
        int i = 3;
        int i2 = 2;
        char c2 = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3af698d", new Object[]{this});
            return;
        }
        nhh.d();
        EventType[] values = EventType.values();
        int length = values.length;
        for (int i4 = 0; i4 < length; i4 += i3) {
            EventType eventType = values[i4];
            while (true) {
                List<? extends zht> u = u(eventType, 500);
                Integer valueOf = Integer.valueOf(u.size());
                Object[] objArr = new Object[4];
                objArr[c2] = "type";
                objArr[i3] = eventType;
                objArr[i2] = "events.size()";
                objArr[i] = valueOf;
                nhh.f(null, objArr);
                if (u.size() == 0) {
                    break;
                }
                int i5 = 0;
                while (i5 < u.size()) {
                    int i6 = c.$SwitchMap$com$alibaba$appmonitor$event$EventType[eventType.ordinal()];
                    if (i6 == i3) {
                        values = values;
                        TempAlarm tempAlarm = (TempAlarm) u.get(i5);
                        if (tempAlarm.isSuccessEvent()) {
                            fl8.s().d(eventType.getEventId(), tempAlarm.module, tempAlarm.monitorPoint, tempAlarm.arg, Long.valueOf(tempAlarm.commitTime), tempAlarm.access, tempAlarm.accessSubType);
                        } else {
                            fl8.s().b(eventType.getEventId(), tempAlarm.module, tempAlarm.monitorPoint, tempAlarm.arg, tempAlarm.errCode, tempAlarm.errMsg, Long.valueOf(tempAlarm.commitTime), tempAlarm.access, tempAlarm.accessSubType);
                        }
                    } else if (i6 != i2) {
                        if (i6 == i) {
                            TempStat tempStat = (TempStat) u.get(i5);
                            fl8.s().j(eventType.getEventId(), tempStat.module, tempStat.monitorPoint, tempStat.getMeasureVauleSet(), tempStat.getDimensionValue());
                        }
                        values = values;
                    } else {
                        TempCounter tempCounter = (TempCounter) u.get(i5);
                        values = values;
                        fl8.s().m(eventType.getEventId(), tempCounter.module, tempCounter.monitorPoint, tempCounter.arg, tempCounter.value, Long.valueOf(tempCounter.commitTime), tempCounter.access, tempCounter.accessSubType);
                    }
                    i5++;
                    i = 3;
                    i2 = 2;
                    i3 = 1;
                }
                r(u);
                i = 3;
                i2 = 2;
                c2 = 0;
                i3 = 1;
            }
        }
    }
}
