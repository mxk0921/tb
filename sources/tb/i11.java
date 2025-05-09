package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class i11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final i11 b = new i11(1);
    public static final i11 c = new i11(2);
    public static final i11 d = new i11(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f21028a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(144703510);
        }

        public a() {
        }

        public final i11 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i11) ipChange.ipc$dispatch("1b0dad13", new Object[]{this});
            }
            return i11.a();
        }

        public final i11 b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i11) ipChange.ipc$dispatch("19cf6b6c", new Object[]{this});
            }
            return i11.b();
        }

        public final i11 c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i11) ipChange.ipc$dispatch("a86cc4be", new Object[]{this});
            }
            return i11.c();
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(144703509);
    }

    public i11() {
        this(0, 1, null);
    }

    public static final /* synthetic */ i11 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i11) ipChange.ipc$dispatch("6b815738", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ i11 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i11) ipChange.ipc$dispatch("18ce84bf", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ i11 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i11) ipChange.ipc$dispatch("1186322d", new Object[0]);
        }
        return d;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b10ec9bd", new Object[]{this})).intValue();
        }
        return this.f21028a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj || ((obj instanceof i11) && this.f21028a == ((i11) obj).f21028a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.f21028a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ApiSpec(threadMode=" + this.f21028a + f7l.BRACKET_END_STR;
    }

    public i11(int i) {
        this.f21028a = i;
    }

    public /* synthetic */ i11(int i, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 2 : i);
    }
}
