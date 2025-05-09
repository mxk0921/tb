package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class z2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a */
    public final a3z f32506a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737004);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final z2z a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z2z) ipChange.ipc$dispatch("95297f2e", new Object[]{this});
            }
            return b(50);
        }

        public final z2z b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z2z) ipChange.ipc$dispatch("9ccfbe4e", new Object[]{this, new Integer(i)});
            }
            if (i >= 0 && i <= 100) {
                return new z2z(new c3z(i), null);
            }
            throw new IllegalArgumentException("Percent must be between 0 and 100");
        }

        public final z2z c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z2z) ipChange.ipc$dispatch("1d2a4e2f", new Object[]{this});
            }
            return d(0.0f);
        }

        public final z2z d(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z2z) ipChange.ipc$dispatch("c438a059", new Object[]{this, new Float(f)});
            }
            return e(new y2z(f, f, f, f));
        }

        public final z2z e(y2z y2zVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z2z) ipChange.ipc$dispatch("e54a639", new Object[]{this, y2zVar});
            }
            ckf.g(y2zVar, "corner");
            return new z2z(new b3z(y2zVar), null);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737003);
    }

    public /* synthetic */ z2z(a3z a3zVar, a07 a07Var) {
        this(a3zVar);
    }

    public static /* synthetic */ y2z b(z2z z2zVar, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y2z) ipChange.ipc$dispatch("b89eb91c", new Object[]{z2zVar, new Long(j), new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            j = f7z.Companion.a();
        }
        return z2zVar.a(j);
    }

    public final y2z a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y2z) ipChange.ipc$dispatch("1a1f2e2f", new Object[]{this, new Long(j)});
        }
        return this.f32506a.a(j);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2z)) {
            return false;
        }
        return ckf.b(this.f32506a, ((z2z) obj).f32506a);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.f32506a.hashCode();
    }

    public z2z(a3z a3zVar) {
        this.f32506a = a3zVar;
    }
}
