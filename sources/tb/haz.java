package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class haz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f20524a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737522);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737521);
        b(0L);
    }

    public /* synthetic */ haz(long j) {
        this.f20524a = j;
    }

    public static final /* synthetic */ haz a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (haz) ipChange.ipc$dispatch("f7c1a98c", new Object[]{new Long(j)});
        }
        return new haz(j);
    }

    public static long b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3fede", new Object[]{new Long(j)})).longValue();
        }
        return j;
    }

    public static boolean c(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d581c68f", new Object[]{new Long(j), obj})).booleanValue();
        }
        if ((obj instanceof haz) && j == ((haz) obj).i()) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1700584d", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final int e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cca24b40", new Object[]{new Long(j)})).intValue();
        }
        return (int) (j & tiv.INT_MASK);
    }

    public static final int f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d695773", new Object[]{new Long(j)})).intValue();
        }
        return (int) (j >> 32);
    }

    public static int g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6440ddbe", new Object[]{new Long(j)})).intValue();
        }
        return en9.a(j);
    }

    public static String h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df7ff544", new Object[]{new Long(j)});
        }
        return f(j) + " x " + e(j);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return c(i(), obj);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return g(i());
    }

    public final /* synthetic */ long i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d22176", new Object[]{this})).longValue();
        }
        return this.f20524a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return h(i());
    }
}
