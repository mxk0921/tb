package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class vkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static long f30074a;
    public static long b;
    public static long c;
    public static long d;
    public static long e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297080);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d84b6b1b", new Object[]{this});
            } else {
                vkn.h(System.currentTimeMillis());
            }
        }

        public final void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21d7d2e0", new Object[]{this});
            } else {
                vkn.j(System.currentTimeMillis());
            }
        }

        public a() {
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd716565", new Object[]{this});
                return;
            }
            vkn.g(System.currentTimeMillis());
            HashMap hashMap = new HashMap(2);
            hashMap.put("time", Double.valueOf(vkn.a() - vkn.f()));
            jzu.d(rwl.KEY_DIMENSION, "metasightCanRequest", hashMap, new HashMap(1));
        }

        public final void c(boolean z, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d19202f", new Object[]{this, new Boolean(z), new Long(j)});
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("time", Double.valueOf(j));
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("success", String.valueOf(z));
            jzu.d(rwl.KEY_DIMENSION, "metasightCardRender", hashMap, hashMap2);
        }

        public final void d(boolean z, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f77d8f7", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
                return;
            }
            vkn.i(System.currentTimeMillis());
            HashMap hashMap = new HashMap(2);
            hashMap.put("time", Double.valueOf(vkn.c() - vkn.b()));
            hashMap.put("requestObjectCount", Double.valueOf(i));
            hashMap.put("objectCount", Double.valueOf(i2));
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("success", String.valueOf(z));
            jzu.d(rwl.KEY_DIMENSION, "metasightRequestProcess", hashMap, hashMap2);
        }

        public final void f(boolean z, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e692441", new Object[]{this, new Boolean(z), new Integer(i)});
                return;
            }
            vkn.k(System.currentTimeMillis());
            HashMap hashMap = new HashMap(2);
            hashMap.put("time", Double.valueOf(vkn.e() - vkn.d()));
            hashMap.put("objectCount", Double.valueOf(i));
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("success", String.valueOf(z));
            jzu.d(rwl.KEY_DIMENSION, "metasightRequestEnd", hashMap, hashMap2);
        }
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8810b8a", new Object[0])).longValue();
        }
        return f30074a;
    }

    public static final /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c24134f", new Object[0])).longValue();
        }
        return d;
    }

    public static final /* synthetic */ long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bf1d513", new Object[0])).longValue();
        }
        return e;
    }

    public static final /* synthetic */ long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bef9a76f", new Object[0])).longValue();
        }
        return b;
    }

    public static final /* synthetic */ long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86d57e3d", new Object[0])).longValue();
        }
        return c;
    }

    public static final /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b1d9e93", new Object[0])).longValue();
        }
        return 0L;
    }

    public static final /* synthetic */ void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e479fa", new Object[]{new Long(j)});
        } else {
            f30074a = j;
        }
    }

    public static final /* synthetic */ void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82b97d5", new Object[]{new Long(j)});
        } else {
            d = j;
        }
    }

    public static final /* synthetic */ void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c159df9", new Object[]{new Long(j)});
        } else {
            e = j;
        }
    }

    public static final /* synthetic */ void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00887b5", new Object[]{new Long(j)});
        } else {
            b = j;
        }
    }

    public static final /* synthetic */ void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861e5da7", new Object[]{new Long(j)});
        } else {
            c = j;
        }
    }

    static {
        t2o.a(481297079);
        jzu.m(rwl.KEY_DIMENSION, "metasightCanRequest", xz3.e("time"), yz3.i());
        jzu.m(rwl.KEY_DIMENSION, "metasightRequestEnd", yz3.l("time", "objectCount"), xz3.e("success"));
        jzu.m(rwl.KEY_DIMENSION, "metasightRequestProcess", yz3.l("time", "requestObjectCount", "objectCount"), xz3.e("success"));
        jzu.m(rwl.KEY_DIMENSION, "metasightCardRender", xz3.e("time"), xz3.e("success"));
    }
}
