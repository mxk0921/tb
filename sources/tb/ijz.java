package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.modifier.PaddingNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ijz implements pfz<PaddingNode> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final float f21359a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737133);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final ijz a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ijz) ipChange.ipc$dispatch("242d5df1", new Object[]{this, new Float(f), new Float(f2)});
            }
            return new ijz(f, f2, f, f2, true, null);
        }

        public final ijz b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ijz) ipChange.ipc$dispatch("96533c87", new Object[]{this, new Float(f)});
            }
            return new ijz(f, f, f, f, true, null);
        }

        public final ijz c(float f, float f2, float f3, float f4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ijz) ipChange.ipc$dispatch("44f01c0f", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            }
            return new ijz(f, f2, f3, f4, true, null);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737132);
        t2o.a(598737401);
    }

    public /* synthetic */ ijz(float f, float f2, float f3, float f4, boolean z, a07 a07Var) {
        this(f, f2, f3, f4, z);
    }

    /* renamed from: b */
    public PaddingNode a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PaddingNode) ipChange.ipc$dispatch("bf50724c", new Object[]{this});
        }
        return new PaddingNode(e(), f(), d(), c(), this.e, null);
    }

    public final float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("107cd88c", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e995af10", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public final float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3098d97", new Object[]{this})).floatValue();
        }
        return this.f21359a;
    }

    public boolean equals(Object obj) {
        ijz ijzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ijz) {
            ijzVar = (ijz) obj;
        } else {
            ijzVar = null;
        }
        if (ijzVar != null && n5z.l(e(), ijzVar.e()) && n5z.l(f(), ijzVar.f()) && n5z.l(d(), ijzVar.d()) && n5z.l(c(), ijzVar.c()) && this.e == ijzVar.e) {
            return true;
        }
        return false;
    }

    public final float f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d73008a", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    /* renamed from: g */
    public void a(PaddingNode paddingNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5c3589", new Object[]{this, paddingNode});
            return;
        }
        ckf.g(paddingNode, "node");
        paddingNode.w(e());
        paddingNode.x(f());
        paddingNode.u(d());
        paddingNode.t(c());
        paddingNode.v(this.e);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((n5z.n(e()) * 31) + n5z.n(f())) * 31) + n5z.n(d())) * 31) + n5z.n(c())) * 31) + bbz.a(this.e);
    }

    public ijz(float f, float f2, float f3, float f4, boolean z) {
        this.f21359a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
        if (!((e() >= 0.0f || n5z.l(e(), n5z.Companion.a())) && (f() >= 0.0f || n5z.l(f(), n5z.Companion.a())) && ((d() >= 0.0f || n5z.l(d(), n5z.Companion.a())) && (c() >= 0.0f || n5z.l(c(), n5z.Companion.a()))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }
}
