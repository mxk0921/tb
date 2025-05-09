package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xzy implements pfz<yzy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final float f31749a;
    public final float b;
    public final float c;
    public final float d;
    public final String e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598736995);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final xzy a(float f, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xzy) ipChange.ipc$dispatch("98b5a145", new Object[]{this, new Float(f), str});
            }
            ckf.g(str, "color");
            return new xzy(f, f, f, f, str, null);
        }

        public final xzy b(float f, float f2, float f3, float f4, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xzy) ipChange.ipc$dispatch("84b77d1b", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), str});
            }
            ckf.g(str, "color");
            return new xzy(f, f2, f3, f4, str, null);
        }

        public a() {
        }
    }

    static {
        t2o.a(598736994);
        t2o.a(598737401);
    }

    public /* synthetic */ xzy(float f, float f2, float f3, float f4, String str, a07 a07Var) {
        this(f, f2, f3, f4, str);
    }

    /* renamed from: b */
    public yzy a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yzy) ipChange.ipc$dispatch("40fecf3a", new Object[]{this});
        }
        return new yzy(d(), f(), e(), c(), this.e, null);
    }

    public final float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3c0c290", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62301ab4", new Object[]{this})).floatValue();
        }
        return this.f31749a;
    }

    public final float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecad69eb", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        xzy xzyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof xzy) {
            xzyVar = (xzy) obj;
        } else {
            xzyVar = null;
        }
        if (xzyVar != null && n5z.l(d(), xzyVar.d()) && n5z.l(f(), xzyVar.f()) && n5z.l(e(), xzyVar.e()) && n5z.l(c(), xzyVar.c())) {
            return true;
        }
        return false;
    }

    public final float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ef9e952", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    /* renamed from: g */
    public void a(yzy yzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dcefef7", new Object[]{this, yzyVar});
            return;
        }
        ckf.g(yzyVar, "node");
        yzyVar.t(d());
        yzyVar.v(f());
        yzyVar.u(e());
        yzyVar.s(c());
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((n5z.n(d()) * 31) + n5z.n(f())) * 31) + n5z.n(e())) * 31) + n5z.n(c());
    }

    public xzy(float f, float f2, float f3, float f4, String str) {
        this.f31749a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = str;
    }
}
