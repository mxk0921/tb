package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile vep j = null;

    /* renamed from: a  reason: collision with root package name */
    public long f29965a;
    public String b;
    public String c = "";
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicInteger e = new AtomicInteger(0);
    public final Set<String> f = new HashSet();
    public final Set<String> g = new HashSet();
    public final HashMap<String, AtomicInteger> h = new HashMap<>();
    public final AtomicInteger i = new AtomicInteger(0);

    static {
        t2o.a(962592896);
    }

    public vep() {
        d();
    }

    public static vep a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vep) ipChange.ipc$dispatch("a272f4a7", new Object[0]);
        }
        if (j == null) {
            synchronized (vep.class) {
                try {
                    if (j == null) {
                        j = new vep();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public synchronized long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b4a0011", new Object[]{this})).longValue();
        }
        return this.f29965a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d12bf712", new Object[]{this});
        }
        return this.b;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        long p = vyp.i().p();
        if (p == 0) {
            e(System.currentTimeMillis());
        } else {
            e(p);
        }
    }

    public final synchronized void e(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcec80d", new Object[]{this, new Long(j2)});
        } else if (j2 != this.f29965a) {
            this.f29965a = j2;
            String valueOf = String.valueOf(j2);
            this.b = valueOf;
            if (!TextUtils.isEmpty(valueOf)) {
                if (this.b.length() >= 2) {
                    String str = this.b;
                    this.c = str.substring(str.length() - 2);
                } else {
                    this.c = this.b;
                }
            }
            this.d.set(0);
            this.e.set(0);
            this.f.clear();
            this.f.add("65501");
            this.f.add("65502");
            this.f.add("65503");
            this.f.add("19998");
            this.f.add("19997");
            this.g.clear();
            this.g.add("1010");
            this.g.add("1023");
            this.g.add("2001");
            this.g.add("2101");
            this.g.add("2201");
            this.g.add("2202");
            this.g.add("65501");
            this.g.add("65502");
            this.g.add("65503");
            this.g.add("19998");
            this.g.add("19997");
            this.g.add("2006");
            this.h.clear();
            this.h.put("1010", new AtomicInteger(0));
            this.h.put("1023", new AtomicInteger(0));
            this.h.put("2001", new AtomicInteger(0));
            this.h.put("2101", new AtomicInteger(0));
            this.h.put("2201", new AtomicInteger(0));
            this.h.put("2202", new AtomicInteger(0));
            this.h.put("65501", new AtomicInteger(0));
            this.h.put("65502", new AtomicInteger(0));
            this.h.put("65503", new AtomicInteger(0));
            this.h.put("19998", new AtomicInteger(0));
            this.h.put("19997", new AtomicInteger(0));
            this.h.put("2006", new AtomicInteger(0));
            this.i.set(0);
        }
    }

    public synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d804f2", new Object[]{this});
            return;
        }
        nhh.f("SessionTimeAndIndexMgr", "changeSession");
        d();
    }

    public synchronized void h(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990829e", new Object[]{this, new Long(j2)});
            return;
        }
        nhh.f("SessionTimeAndIndexMgr", "changeSession", Long.valueOf(j2));
        e(j2);
    }

    public synchronized void f(String str, Map<String, String> map) {
        int i;
        long j2;
        int incrementAndGet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2485cd", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if ("1".equals(x2r.f().e("ut_old_index"))) {
            map.put(oeh.RESERVE3, String.format("%s%06d", this.c, Integer.valueOf(this.d.incrementAndGet())));
            map.put(oeh.START_SESSION_TIMESTAMP, this.b);
            return;
        }
        if (!((HashSet) this.f).contains(str)) {
            i = this.e.incrementAndGet();
        } else {
            i = this.e.get();
        }
        long j3 = i;
        if (((HashSet) this.g).contains(str)) {
            AtomicInteger atomicInteger = this.h.get(str);
            if (atomicInteger != null) {
                incrementAndGet = atomicInteger.incrementAndGet();
            } else {
                j2 = 0;
                map.put(oeh.RESERVE3, String.format("%s%06d,%s%06d", this.c, Long.valueOf(j3), this.c, Long.valueOf(j2)));
                map.put(oeh.START_SESSION_TIMESTAMP, this.b);
            }
        } else {
            incrementAndGet = this.i.incrementAndGet();
        }
        j2 = incrementAndGet;
        map.put(oeh.RESERVE3, String.format("%s%06d,%s%06d", this.c, Long.valueOf(j3), this.c, Long.valueOf(j2)));
        map.put(oeh.START_SESSION_TIMESTAMP, this.b);
    }
}
