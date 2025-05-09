package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.modifier.Direction;
import com.taobao.android.nanocompose.foundation.layout.modifier.FillNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class y6z implements pfz<FillNode> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Direction f31885a;
    public final float b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737121);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final y6z a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y6z) ipChange.ipc$dispatch("d5827d55", new Object[]{this, new Float(f)});
            }
            return new y6z(Direction.Vertical, f, "fillMaxHeight");
        }

        public final y6z b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y6z) ipChange.ipc$dispatch("bbf5123b", new Object[]{this, new Float(f)});
            }
            return new y6z(Direction.Both, f, "fillMaxSize");
        }

        public final y6z c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y6z) ipChange.ipc$dispatch("e4e88f56", new Object[]{this, new Float(f)});
            }
            return new y6z(Direction.Horizontal, f, "fillMaxWidth");
        }

        public a() {
        }
    }

    static {
        t2o.a(598737120);
        t2o.a(598737401);
    }

    public y6z(Direction direction, float f, String str) {
        ckf.g(direction, "direction");
        ckf.g(str, "inspectorName");
        this.f31885a = direction;
        this.b = f;
    }

    /* renamed from: b */
    public FillNode a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FillNode) ipChange.ipc$dispatch("5d5c97d2", new Object[]{this});
        }
        return new FillNode(this.f31885a, this.b);
    }

    /* renamed from: c */
    public void a(FillNode fillNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c3f5af", new Object[]{this, fillNode});
            return;
        }
        ckf.g(fillNode, "node");
        fillNode.o(this.f31885a);
        fillNode.p(this.b);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6z)) {
            return false;
        }
        y6z y6zVar = (y6z) obj;
        if (this.f31885a == y6zVar.f31885a && this.b == y6zVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (this.f31885a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }
}
