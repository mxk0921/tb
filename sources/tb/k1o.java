package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import tb.c2v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k1o implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String f = "RepeatExposureQueueMgr";
    private static final Map<String, String> g = new HashMap();
    private static k1o h = new k1o();

    /* renamed from: a  reason: collision with root package name */
    private boolean f22346a = false;
    private BlockingQueue<Map<String, String>> b = new LinkedBlockingQueue();
    private HashSet<Integer> c = new HashSet<>();
    private boolean d = false;
    private Map<String, String> e = new TreeMap(new a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Comparator<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue() : str.compareTo(str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements c2v.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962593140);
            t2o.a(962593166);
        }

        @Override // tb.c2v.a
        public void onPageAppear(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7330a6", new Object[]{this, obj});
            } else {
                k1o.access$000(k1o.getInstance());
            }
        }

        @Override // tb.c2v.a
        public void onPageDisAppear(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4c99138", new Object[]{this, obj});
            } else {
                k1o.access$000(k1o.getInstance());
            }
        }
    }

    static {
        t2o.a(962593138);
    }

    private synchronized int a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44f33210", new Object[]{this, map})).intValue();
        }
        if (map != null && !map.isEmpty()) {
            this.e.putAll(map);
            StringBuilder c = iqq.a().c();
            for (Map.Entry<String, String> entry : this.e.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    c.append(key);
                }
                String value = entry.getValue();
                if (!TextUtils.isEmpty(value)) {
                    c.append(value);
                }
            }
            this.e.clear();
            String sb = c.toString();
            iqq.a().b(c);
            return sb.hashCode();
        }
        return 0;
    }

    public static /* synthetic */ void access$000(k1o k1oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4871a1e7", new Object[]{k1oVar});
        } else {
            k1oVar.b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6bc343", new Object[]{this});
        } else if (this.f22346a) {
            this.b.add(g);
        }
    }

    public static k1o getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k1o) ipChange.ipc$dispatch("7d051134", new Object[0]);
        }
        return h;
    }

    public void putExposureEvent(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c39929a", new Object[]{this, map});
        } else if (this.f22346a && map != null && !map.isEmpty()) {
            this.b.add(map);
        }
    }

    public synchronized void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (!this.f22346a) {
            this.f22346a = true;
            zdt.c().f(getInstance());
            c2v.addPageChangerListener(new b());
        }
    }

    public synchronized void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        if (this.f22346a) {
            this.f22346a = false;
            try {
                this.b.clear();
                this.c.clear();
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int i2 = 0;
        while (true) {
            if (this.f22346a || i2 > 0) {
                try {
                    if (this.d) {
                        nhh.f(f, "------");
                        nhh.f(f, "take mQueueCache size", Integer.valueOf(this.b.size()));
                        nhh.f(f, "mExposureSet size", Integer.valueOf(this.c.size()));
                    }
                    Map<String, String> take = this.b.take();
                    if (this.d) {
                        long currentTimeMillis = System.currentTimeMillis();
                        i = a(take);
                        nhh.f(f, "getMapHashCode cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    } else {
                        i = a(take);
                    }
                    if (i == 0) {
                        nhh.f(f, "clear ExposureSet");
                        this.c.clear();
                    } else if (this.c.contains(Integer.valueOf(i))) {
                        nhh.f(f, "repeat Exposure");
                    } else {
                        this.c.add(Integer.valueOf(i));
                        nhh.f(f, "send Exposure");
                        UTAnalytics.getInstance().transferLog(take);
                    }
                    i2 = this.b.size();
                    if (this.d) {
                        nhh.f(f, "isRunning", Boolean.valueOf(this.f22346a), "mQueueCache size", Integer.valueOf(i2));
                    }
                } catch (Throwable th) {
                    nhh.f("", th);
                }
            } else {
                return;
            }
        }
    }
}
