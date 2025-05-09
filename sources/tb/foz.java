package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.modifier.SizeNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class foz implements pfz<SizeNode> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final float f19450a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737138);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final foz a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (foz) ipChange.ipc$dispatch("4207496f", new Object[]{this, new Float(f), new Float(f2)});
            }
            return new foz(f, f2, f, f2, true, null);
        }

        public final foz b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (foz) ipChange.ipc$dispatch("80370cb9", new Object[]{this, new Float(f)});
            }
            return new foz(f, f, f, f, true, null);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737137);
        t2o.a(598737401);
    }

    public /* synthetic */ foz(float f, float f2, float f3, float f4, boolean z, a07 a07Var) {
        this(f, f2, f3, f4, z);
    }

    /* renamed from: b */
    public SizeNode a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SizeNode) ipChange.ipc$dispatch("bd7b8c14", new Object[]{this});
        }
        return new SizeNode(this.f19450a, this.b, this.c, this.d, this.e, null);
    }

    /* renamed from: c */
    public void a(SizeNode sizeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f6e171", new Object[]{this, sizeNode});
            return;
        }
        ckf.g(sizeNode, "node");
        sizeNode.y(this.f19450a);
        sizeNode.x(this.b);
        sizeNode.w(this.c);
        sizeNode.v(this.d);
        sizeNode.u(this.e);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foz)) {
            return false;
        }
        foz fozVar = (foz) obj;
        if (n5z.l(this.f19450a, fozVar.f19450a) && n5z.l(this.b, fozVar.b) && n5z.l(this.c, fozVar.c) && n5z.l(this.d, fozVar.d) && this.e == fozVar.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((n5z.n(this.f19450a) * 31) + n5z.n(this.b)) * 31) + n5z.n(this.c)) * 31) + n5z.n(this.d)) * 31) + bbz.a(this.e);
    }

    public foz(float f, float f2, float f3, float f4, boolean z) {
        this.f19450a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    public /* synthetic */ foz(float f, float f2, float f3, float f4, boolean z, int i, a07 a07Var) {
        this((i & 1) != 0 ? n5z.Companion.a() : f, (i & 2) != 0 ? n5z.Companion.a() : f2, (i & 4) != 0 ? n5z.Companion.a() : f3, (i & 8) != 0 ? n5z.Companion.a() : f4, z, null);
    }
}
