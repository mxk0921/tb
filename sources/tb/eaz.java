package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class eaz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final long f18433a = faz.a(0, 0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737518);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("865135e9", new Object[]{this})).longValue();
            }
            return eaz.a();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737517);
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42629ee", new Object[0])).longValue();
        }
        return f18433a;
    }

    public static long b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3fede", new Object[]{new Long(j)})).longValue();
        }
        return j;
    }

    public static final boolean c(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1700584d", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final int d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("808568a5", new Object[]{new Long(j)})).intValue();
        }
        return (int) (j >> 32);
    }

    public static final int e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("156a1b66", new Object[]{new Long(j)})).intValue();
        }
        return (int) (j & tiv.INT_MASK);
    }

    public static int f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6440ddbe", new Object[]{new Long(j)})).intValue();
        }
        return en9.a(j);
    }

    public static String g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df7ff544", new Object[]{new Long(j)});
        }
        return f7l.BRACKET_START_STR + d(j) + ", " + e(j) + ')';
    }
}
