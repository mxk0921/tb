package tb;

import com.alibaba.appmonitor.event.EventType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class t44 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String d = "CommitTask";
    private static Map<Integer, t44> f;

    /* renamed from: a  reason: collision with root package name */
    private int f28478a;
    private int b;
    private long c = System.currentTimeMillis();
    private static boolean e = false;
    private static HashMap<Integer, ScheduledFuture> g = new HashMap<>();

    static {
        t2o.a(962593026);
    }

    private t44(int i, int i2) {
        this.b = i;
        this.f28478a = i2;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[0]);
            return;
        }
        for (Integer num : g.keySet()) {
            ScheduledFuture scheduledFuture = g.get(num);
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(true);
            }
        }
        e = false;
        f = null;
        g.clear();
    }

    public static void b() {
        EventType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!e) {
            nhh.f(d, "init StatisticsAlarmEvent");
            f = new ConcurrentHashMap();
            for (EventType eventType : EventType.values()) {
                if (eventType.isOpen()) {
                    int eventId = eventType.getEventId();
                    t44 t44Var = new t44(eventId, eventType.getForegroundStatisticsInterval() * 1000);
                    f.put(Integer.valueOf(eventId), t44Var);
                    g.put(Integer.valueOf(eventId), zdt.c().d(g.get(Integer.valueOf(eventId)), t44Var, t44Var.f28478a));
                }
            }
            e = true;
        }
    }

    public static void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c477fab1", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        synchronized (f) {
            try {
                t44 t44Var = f.get(Integer.valueOf(i));
                if (t44Var == null) {
                    if (i2 > 0) {
                        t44 t44Var2 = new t44(i, i2 * 1000);
                        f.put(Integer.valueOf(i), t44Var2);
                        g.put(Integer.valueOf(i), zdt.c().d(g.get(Integer.valueOf(i)), t44Var2, t44Var2.f28478a));
                    }
                } else if (i2 > 0) {
                    int i3 = i2 * 1000;
                    if (t44Var.f28478a != i3) {
                        t44Var.f28478a = i3;
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = t44Var.f28478a - (currentTimeMillis - t44Var.c);
                        if (j < 0) {
                            j = 0;
                        }
                        ScheduledFuture scheduledFuture = g.get(Integer.valueOf(i));
                        zdt.c().d(scheduledFuture, t44Var, j);
                        g.put(Integer.valueOf(i), scheduledFuture);
                        t44Var.c = currentTimeMillis;
                    }
                } else {
                    f.remove(Integer.valueOf(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db36e21", new Object[0]);
            return;
        }
        for (EventType eventType : EventType.values()) {
            fl8.s().w(eventType.getEventId());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        nhh.f(d, "check&commit event", Integer.valueOf(this.b));
        fl8.s().w(this.b);
        if (f.containsValue(this)) {
            this.c = System.currentTimeMillis();
            g.put(Integer.valueOf(this.b), zdt.c().d(g.get(Integer.valueOf(this.b)), this, this.f28478a));
        }
    }
}
