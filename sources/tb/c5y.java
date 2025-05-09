package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c5y {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean r;
    public static final byte[] s = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public String f16884a;
    public int b;
    public String c;
    public int d;
    public int e;
    public String f;
    public String g;
    public int h;
    public int i;
    public long j;
    public long k;
    public int l;
    public double m;
    public double n;
    public int o;
    public int p;
    public long q;

    public static /* synthetic */ Set a(c5y c5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("8a21179b", new Object[]{c5yVar});
        }
        return c5yVar.h();
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        r = z;
        return z;
    }

    public static /* synthetic */ Set d(c5y c5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("89aab19c", new Object[]{c5yVar});
        }
        return c5yVar.g();
    }

    public static /* synthetic */ boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return r;
    }

    public static /* synthetic */ byte[] f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[0]);
        }
        return s;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ewx.a(new a());
        }
    }

    public final Set<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("916979a", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add(pod.IP);
        hashSet.add("port");
        hashSet.add("protocol");
        hashSet.add(rb.RESULT_KEY);
        hashSet.add("errorcode");
        hashSet.add("scid");
        hashSet.add("dcid");
        hashSet.add("congcontrolkind");
        hashSet.add("xqc0rttstatus");
        return hashSet;
    }

    public final Set<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d6c0f95b", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add("connecttime");
        hashSet.add("livetime");
        hashSet.add("requestcount");
        hashSet.add("sendcount");
        hashSet.add("retransmissionrate");
        hashSet.add("lossrate");
        hashSet.add("tlpcount");
        hashSet.add("rtocount");
        hashSet.add("srtt");
        return hashSet;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(pod.IP, c5y.this.f16884a);
            hashMap.put("port", String.valueOf(c5y.this.b));
            hashMap.put("protocol", c5y.this.c);
            hashMap.put(rb.RESULT_KEY, String.valueOf(c5y.this.d));
            hashMap.put("errorcode", String.valueOf(c5y.this.e));
            hashMap.put("scid", c5y.this.f);
            hashMap.put("dcid", c5y.this.g);
            hashMap.put("congcontrolkind", String.valueOf(c5y.this.h));
            hashMap.put("xqc0rttstatus", String.valueOf(c5y.this.i));
            HashMap hashMap2 = new HashMap();
            c5y.this.getClass();
            hashMap2.put("connecttime", Double.valueOf(0L));
            hashMap2.put("livetime", Double.valueOf(c5y.this.j));
            hashMap2.put("requestcount", Double.valueOf(c5y.this.k));
            hashMap2.put("sendcount", Double.valueOf(c5y.this.l));
            hashMap2.put("retransmissionrate", Double.valueOf(c5y.this.m));
            hashMap2.put("lossrate", Double.valueOf(c5y.this.n));
            hashMap2.put("tlpcount", Double.valueOf(c5y.this.o));
            hashMap2.put("rtocount", Double.valueOf(c5y.this.p));
            hashMap2.put("srtt", Double.valueOf(c5y.this.q));
            if (!c5y.e()) {
                synchronized (c5y.f()) {
                    try {
                        if (!c5y.e()) {
                            dzx.b("ARUP", "Session", c5y.a(c5y.this), c5y.d(c5y.this), false);
                            c5y.c(true);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (rtx.d(16)) {
                rtx.a(16, "SessionStatistics", "commit statistic, dimensions:" + hashMap + ", measures:" + hashMap2);
            }
            dzx.a("ARUP", "Session", hashMap2, hashMap);
        }
    }
}
