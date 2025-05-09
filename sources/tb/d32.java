package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.jiv;
import tb.mz1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class d32<T extends mz1, M extends jiv, C> implements rcc<M, C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h g = new c();
    public static final h h = new d();
    public static final h i = new e();
    public static final h j = new f();
    public static final h k = new g();

    /* renamed from: a  reason: collision with root package name */
    public final T f17536a;
    public final rcc<M, C> b;
    public final Activity c;
    public final boolean d;
    public int e;
    public List<d32<T, M, C>> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17537a;
        public final /* synthetic */ String[] b;
        public final /* synthetic */ int[] c;

        public a(d32 d32Var, int i, String[] strArr, int[] iArr) {
            this.f17537a = i;
            this.b = strArr;
            this.c = iArr;
        }

        @Override // tb.d32.h
        public void a(d32 d32Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("148eff8d", new Object[]{this, d32Var});
            } else {
                d32Var.E(this.f17537a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements pwo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.pwo
        public void w(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
                return;
            }
            agh.h("BaseView", "onScreenTypeChanged " + i);
            d32.this.G(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.d32.h
        public void a(d32 d32Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("148eff8d", new Object[]{this, d32Var});
            } else {
                d32Var.F();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.d32.h
        public void a(d32 d32Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("148eff8d", new Object[]{this, d32Var});
            } else {
                d32Var.D();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.d32.h
        public void a(d32 d32Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("148eff8d", new Object[]{this, d32Var});
            } else {
                d32Var.H();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.d32.h
        public void a(d32 d32Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("148eff8d", new Object[]{this, d32Var});
            } else {
                d32Var.A();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.d32.h
        public void a(d32 d32Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("148eff8d", new Object[]{this, d32Var});
            } else {
                d32Var.B();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface h {
        void a(d32 d32Var);
    }

    static {
        t2o.a(481297472);
        t2o.a(481297484);
        t2o.a(481297482);
    }

    public d32(Activity activity, rcc<M, C> rccVar) {
        this(activity, rccVar, true);
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541a3230", new Object[]{this});
            return;
        }
        this.e = 5;
        T t = this.f17536a;
        if (t != null) {
            t.q();
        }
        M(j);
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a19c6ba", new Object[]{this});
            return;
        }
        T t = this.f17536a;
        if (t != null) {
            t.d();
        }
        M(k);
    }

    public void C(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fb678f", new Object[]{this, intent});
            return;
        }
        T t = this.f17536a;
        if (t != null) {
            t.r(intent);
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946839ec", new Object[]{this});
            return;
        }
        this.e = 3;
        T t = this.f17536a;
        if (t != null) {
            t.s();
        }
        M(h);
    }

    public void E(int i2, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc05357e", new Object[]{this, new Integer(i2), strArr, iArr});
            return;
        }
        T t = this.f17536a;
        if (t != null) {
            t.e(i2, strArr, iArr);
        }
        M(new a(this, i2, strArr, iArr));
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfe41a5", new Object[]{this});
            return;
        }
        this.e = 2;
        T t = this.f17536a;
        if (t != null) {
            t.v();
        }
        M(g);
    }

    public void G(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd45225", new Object[]{this, new Integer(i2)});
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b8b73a", new Object[]{this});
            return;
        }
        this.e = 4;
        T t = this.f17536a;
        if (t != null) {
            t.w();
        }
        M(i);
    }

    public Activity I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.c;
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3508c4ea", new Object[]{this})).intValue();
        }
        ScreenType g2 = ScreenType.g(this.c);
        if (g2 != null) {
            return g2.c();
        }
        return 0;
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
        }
    }

    public final void L(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3725ac06", new Object[]{this, activity});
            return;
        }
        agh.h("BaseView", "register ScreenTypeChange listener");
        ScreenType g2 = ScreenType.g(activity);
        if (g2 != null) {
            g2.i(new b());
        }
    }

    public final void M(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa216df", new Object[]{this, hVar});
            return;
        }
        List<d32<T, M, C>> list = this.f;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f).iterator();
            while (it.hasNext()) {
                hVar.a((d32) it.next());
            }
        }
    }

    @Override // tb.rcc
    public void f(d32 d32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60bd8d5e", new Object[]{this, d32Var});
            return;
        }
        z();
        ((CopyOnWriteArrayList) this.f).add(d32Var);
    }

    @Override // tb.rcc
    public C m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("c488a674", new Object[]{this});
        }
        rcc<M, C> rccVar = this.b;
        if (rccVar != null) {
            return rccVar.m();
        }
        return null;
    }

    @Override // tb.rcc
    public M p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ((jiv) ipChange.ipc$dispatch("7e916a88", new Object[]{this}));
        }
        rcc<M, C> rccVar = this.b;
        if (rccVar != null) {
            return rccVar.p();
        }
        return null;
    }

    public T y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((mz1) ipChange.ipc$dispatch("2a938686", new Object[]{this}));
        }
        return null;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0e1bc3", new Object[]{this});
        } else if (this.f == null) {
            this.f = new CopyOnWriteArrayList();
        }
    }

    public d32(Activity activity, rcc<M, C> rccVar, boolean z) {
        this(activity, rccVar, z, true);
    }

    public d32(Activity activity, rcc<M, C> rccVar, boolean z, boolean z2) {
        this.e = 1;
        this.c = activity;
        this.d = z2;
        this.b = rccVar;
        if (rccVar != null && z2) {
            rccVar.f(this);
        }
        T y = y();
        this.f17536a = y;
        if (y != null) {
            y.x(this);
        }
        K();
        if (y != null) {
            y.n();
        }
        if (z) {
            L(activity);
        }
    }

    public d32(Activity activity) {
        this(activity, null);
    }
}
