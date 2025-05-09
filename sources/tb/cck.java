package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cck implements paq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ROOT_SPAN_ID = "0";
    private static Map<String, Integer> j = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f16974a;
    private volatile String b;
    private dck c;
    public long d;
    private long e;
    private eck f;
    private List<utn> g;
    private boolean h;
    private long i;

    static {
        t2o.a(315621412);
        t2o.a(315621381);
    }

    public cck(eck eckVar, String str, long j2, Map<String, Object> map, List<utn> list) {
        ArrayList arrayList;
        HashMap hashMap;
        this.h = false;
        this.b = str;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        this.g = arrayList;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = new HashMap();
        }
        this.f16974a = hashMap;
        this.d = j2;
        this.f = eckVar;
        if (list == null || list.isEmpty()) {
            this.c = x0();
            Map<String, Integer> map2 = j;
            map2.put(this.c.b() + this.c.c(), 0);
            return;
        }
        this.c = w0();
        if (C0()) {
            this.h = true;
            return;
        }
        Map<String, Integer> map3 = j;
        map3.put(this.c.b() + this.c.c(), 0);
    }

    private static int G0(dck dckVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdb546c9", new Object[]{dckVar})).intValue();
        }
        if (dckVar == null) {
            return 0;
        }
        String str = dckVar.b() + dckVar.c();
        Integer num = j.get(str);
        if (num == null) {
            return -1;
        }
        int intValue = num.intValue() + 1;
        j.put(str, Integer.valueOf(intValue));
        return intValue;
    }

    public static long H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d139e2a0", new Object[0])).longValue();
        }
        return System.currentTimeMillis();
    }

    private void I0(dck dckVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ab1154", new Object[]{this, dckVar});
        } else if (dckVar != null) {
            j.remove(dckVar.b() + dckVar.c());
        }
    }

    private paq K0(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("3c66dd4a", new Object[]{this, str, obj});
        }
        this.f16974a.put(str, obj);
        return this;
    }

    public static long v0(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3a6473e", new Object[]{l})).longValue();
        }
        if (l == null || l.longValue() <= 0) {
            return H0();
        }
        return l.longValue();
    }

    private dck w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dck) ipChange.ipc$dispatch("f9ad4b22", new Object[]{this});
        }
        utn utnVar = this.g.get(0);
        Iterator<utn> it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            utn next = it.next();
            if ("child_of".equals(next.a()) && !"child_of".equals(utnVar.a())) {
                utnVar = next;
                break;
            }
        }
        dck b = utnVar.b();
        if ("follows_from".equals(utnVar.a())) {
            int lastIndexOf = b.c().lastIndexOf(".");
            if (lastIndexOf == -1) {
                return x0();
            }
            b = new dck(b.b(), b.c().substring(0, lastIndexOf), b.d());
        }
        int G0 = G0(b);
        if (G0 <= 0) {
            return x0();
        }
        String b2 = b.b();
        return new dck(b2, b.c() + "." + G0, b.d());
    }

    private dck x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dck) ipChange.ipc$dispatch("4d325a1e", new Object[]{this});
        }
        return new dck(zxv.b(), "0", null);
    }

    public Object A0(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1938174a", new Object[]{this, str});
        }
        synchronized (this) {
            obj = this.f16974a.get(str);
        }
        return obj;
    }

    public boolean B0() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            z = this.h;
        }
        return z;
    }

    @Override // tb.paq
    public paq C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("a8d0149", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public boolean C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68239c21", new Object[]{this})).booleanValue();
        }
        return "0".equalsIgnoreCase(a().c());
    }

    public paq D0(long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("4274af4b", new Object[]{this, new Long(j2), str});
        }
        this.f.p().releaseLog(this, "timestampMicroseconds=" + j2 + ", event=" + str);
        return this;
    }

    @Override // tb.paq
    public void H(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d81da6a", new Object[]{this, new Long(j2)});
            return;
        }
        if (j2 < 0) {
            j2 = H0();
        }
        synchronized (this) {
            try {
                if (!this.h) {
                    this.h = true;
                    this.e = j2;
                    this.i = j2 - this.d;
                    I0(this.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized <T> paq J0(ess<T> essVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("1e125eec", new Object[]{this, essVar, t});
        }
        return K0(essVar.getKey(), t);
    }

    public paq L0(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("88d04bb0", new Object[]{this, str, obj});
        }
        this.f16974a.put(str, obj);
        return this;
    }

    public eck M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eck) ipChange.ipc$dispatch("9b4a6bda", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.paq
    public synchronized paq S(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("738fef3", new Object[]{this, str, new Boolean(z)});
        }
        return K0(str, Boolean.valueOf(z));
    }

    @Override // tb.paq
    public synchronized paq X(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("c97fa15b", new Object[]{this, str, str2});
        }
        return K0(str, str2);
    }

    @Override // tb.paq
    public raq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (raq) ipChange.ipc$dispatch("4e991149", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.paq
    public String d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2339e5a7", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.paq
    public synchronized paq f(String str, Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("19069b23", new Object[]{this, str, number});
        }
        return K0(str, number);
    }

    @Override // tb.paq
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            H(H0());
        }
    }

    @Override // tb.paq
    public paq g0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("b82f6534", new Object[]{this, str, str2});
        }
        this.c.g(str, str2);
        return this;
    }

    @Override // tb.paq
    public Map<String, ?> j0() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2ba5e55", new Object[]{this});
        }
        synchronized (this) {
            hashMap = new HashMap(this.f16974a);
        }
        return hashMap;
    }

    @Override // tb.paq
    public paq log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("7605ca3d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        mhh p = this.f.p();
        p.releaseLog(this, "event=" + str);
        return this;
    }

    @Override // tb.paq
    public long s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2ff567b", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.c.toString() + " - " + this.b;
    }

    public String y0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1f93a52", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.c.f(str);
    }

    @Override // tb.paq
    public long z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8baf4f4a", new Object[]{this})).longValue();
        }
        return this.d;
    }

    public long z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15199160", new Object[]{this})).longValue();
        }
        return this.i;
    }

    public paq E0(long j2, Map<String, ?> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("d5974f74", new Object[]{this, new Long(j2), map});
        }
        StringBuilder sb = new StringBuilder("timestampMicroseconds=");
        sb.append(j2);
        sb.append(", fields={");
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            z = false;
        }
        sb.append("}");
        this.f.p().releaseLog(this, sb.toString());
        return this;
    }

    public paq F0(Map<String, ?> map) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (paq) ipChange.ipc$dispatch("337b69c2", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            StringBuilder sb = new StringBuilder("fields={");
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                z = false;
            }
            sb.append("}");
            this.f.p().releaseLog(this, sb.toString());
        }
        return this;
    }
}
