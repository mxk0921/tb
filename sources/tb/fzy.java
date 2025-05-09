package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.itz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fzy implements itz<fzy> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BASE_VIEW_PROPS_ALPHA_HASH = 1723268708;
    public static final int BASE_VIEW_PROPS_BACKGROUND_HASH = 1522917796;
    public static final int BASE_VIEW_PROPS_SHADOW_COLOR_HASH = -18018673;
    public static final int BASE_VIEW_PROPS_SHADOW_OPACITY_HASH = -1295530522;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public int f19652a = sjz.a(0);
    public zsz b;
    public int c;
    public z2z d;
    public vzy e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598737162);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737161);
        t2o.a(598737505);
    }

    @Override // tb.jkz
    public jkz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("f3431015", new Object[]{this});
        }
        fzy o = o();
        n(o);
        return o;
    }

    @Override // tb.itz
    public zsz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zsz) ipChange.ipc$dispatch("21674f9a", new Object[]{this});
        }
        return new gzy();
    }

    @Override // tb.itz
    public void d(zsz zszVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170fb86e", new Object[]{this, zszVar});
        } else {
            this.b = zszVar;
        }
    }

    @Override // tb.itz
    public zsz e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zsz) ipChange.ipc$dispatch("6c385f4", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.jkz
    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itz)) {
            return false;
        }
        return u((fzy) obj);
    }

    @Override // tb.jkz
    public void g(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad3ff3d", new Object[]{this, new Integer(i), str});
            return;
        }
        ckf.g(str, "value");
        if (i == -18018673) {
            r().g(i, str);
        } else {
            itz.a.h(this, i, str);
        }
    }

    @Override // tb.jkz
    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f9d30", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == 1522917796) {
            this.c = i2;
        } else {
            itz.a.e(this, i, i2);
        }
    }

    @Override // tb.jkz
    public void i(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848fa0f1", new Object[]{this, new Integer(i), new Long(j)});
        } else {
            itz.a.f(this, i, j);
        }
    }

    @Override // tb.jkz
    public void j(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f8a6b", new Object[]{this, new Integer(i), new Double(d)});
        } else {
            itz.a.c(this, i, d);
        }
    }

    @Override // tb.jkz
    public void k(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f91ed", new Object[]{this, new Integer(i), new Float(f)});
        } else if (i == -1295530522) {
            r().k(i, f);
        } else {
            itz.a.d(this, i, f);
        }
    }

    @Override // tb.jkz
    public void l(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848fdd01", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            itz.a.i(this, i, z);
        }
    }

    @Override // tb.jkz
    public void m(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd52c54f", new Object[]{this, new Integer(i), obj});
            return;
        }
        ckf.g(obj, "value");
        itz.a.g(this, i, obj);
    }

    public final void n(fzy fzyVar) {
        zsz zszVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71aa31e", new Object[]{this, fzyVar});
            return;
        }
        zsz e = e();
        if (e == null) {
            zszVar = null;
        } else {
            zszVar = (zsz) e.b();
        }
        fzyVar.d(zszVar);
    }

    public fzy o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("3d4b8f22", new Object[]{this});
        }
        return new fzy();
    }

    public final int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("44f6b31e", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final vzy q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vzy) ipChange.ipc$dispatch("c0fb75a1", new Object[]{this});
        }
        return this.e;
    }

    public zsz r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zsz) ipChange.ipc$dispatch("76cde4d3", new Object[]{this});
        }
        return itz.a.a(this);
    }

    public final int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2db0484", new Object[]{this})).intValue();
        }
        return this.f19652a;
    }

    public final z2z t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z2z) ipChange.ipc$dispatch("51b77e0e", new Object[]{this});
        }
        return this.d;
    }

    public final void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db99f044", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final void w(vzy vzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6179549", new Object[]{this, vzyVar});
        } else {
            this.e = vzyVar;
        }
    }

    public final void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7b9427", new Object[]{this, new Integer(i)});
        } else {
            this.f19652a = i;
        }
    }

    public final void y(z2z z2zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad78077a", new Object[]{this, z2zVar});
        } else {
            this.d = z2zVar;
        }
    }

    public final void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30a3887", new Object[]{this, new Integer(i)});
        } else {
            x(sjz.a(i | s()));
        }
    }

    public boolean u(fzy fzyVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d517d57", new Object[]{this, fzyVar})).booleanValue();
        }
        ckf.g(fzyVar, "other");
        zsz e = e();
        if (e == null) {
            z = true;
        } else {
            zsz e2 = fzyVar.e();
            if (e2 == null) {
                return false;
            }
            z = e.f(e2);
        }
        return z && this.c == fzyVar.c && itz.a.b(this, fzyVar);
    }
}
