package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class af8 extends kr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final phw<?, ?, ?> h;
    public MetaLayout i;
    public int j;
    public int o;
    public ValueAnimator p;
    public int q;
    public auc r;
    public final int k = 150;
    public int l;
    public int m = -this.l;
    public int n = 2;
    public final ValueAnimator.AnimatorUpdateListener s = new ValueAnimator.AnimatorUpdateListener() { // from class: tb.d6z
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            af8.m(af8.this, valueAnimator);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793418);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/newsearch/header/EnhanceSceneHeaderBehavior$startAnim$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            af8.t(af8.this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            af8.t(af8.this);
            af8.r(af8.this);
            ytc l = af8.l(af8.this);
            if (l != null) {
                l.e(0, af8.n(af8.this), 0);
            }
        }
    }

    static {
        t2o.a(815793417);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af8(View view, phw<?, ?, ?> phwVar) {
        super(view, true, new zwm(1000, 1001, 1000), 0);
        ckf.g(phwVar, "widget");
        this.h = phwVar;
    }

    public static /* synthetic */ Object ipc$super(af8 af8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/newsearch/header/EnhanceSceneHeaderBehavior");
    }

    public static final /* synthetic */ ytc l(af8 af8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytc) ipChange.ipc$dispatch("f389926a", new Object[]{af8Var});
        }
        return af8Var.g;
    }

    public static final void m(af8 af8Var, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0751", new Object[]{af8Var, valueAnimator});
            return;
        }
        ckf.g(af8Var, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ckf.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        af8Var.b = ((Integer) animatedValue).intValue();
        af8Var.G();
        auc aucVar = af8Var.r;
        if (aucVar != null) {
            aucVar.K0(af8Var.p(), af8Var.h());
        }
        if (esi.j(af8Var.h(), 0.0f)) {
            auc aucVar2 = af8Var.r;
            if (aucVar2 != null) {
                aucVar2.h0();
            }
        } else {
            auc aucVar3 = af8Var.r;
            if (aucVar3 != null) {
                aucVar3.Z0();
            }
        }
        MetaLayout metaLayout = af8Var.i;
        if (metaLayout != null) {
            metaLayout.requestLayout();
        }
    }

    public static final /* synthetic */ int n(af8 af8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed357333", new Object[]{af8Var})).intValue();
        }
        return af8Var.q;
    }

    public static final /* synthetic */ void r(af8 af8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b66fdee", new Object[]{af8Var});
        } else {
            af8Var.F();
        }
    }

    public static final /* synthetic */ void t(af8 af8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7921428e", new Object[]{af8Var});
        } else {
            af8Var.H();
        }
    }

    public static /* synthetic */ void x(af8 af8Var, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511cc543", new Object[]{af8Var, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        af8Var.w(z);
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("661645b6", new Object[]{this});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.b, -this.j);
        ckf.f(ofInt, "ofInt(...)");
        E(ofInt, -1);
    }

    public final void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27bb728", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public final void C(auc aucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0f9d23", new Object[]{this, aucVar});
        } else {
            this.r = aucVar;
        }
    }

    public final void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cc72a3", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        this.b = -i;
        this.m = -this.l;
    }

    public final void E(ValueAnimator valueAnimator, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1b3d769", new Object[]{this, valueAnimator, new Integer(i)});
            return;
        }
        v();
        this.p = valueAnimator;
        valueAnimator.addUpdateListener(this.s);
        valueAnimator.addListener(new c());
        if (i >= 0) {
            valueAnimator.setDuration(i);
        } else {
            valueAnimator.setDuration(300L);
        }
        valueAnimator.start();
    }

    public final void F() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96caceaf", new Object[]{this});
            return;
        }
        this.o = this.n;
        MetaLayout metaLayout = this.i;
        if (metaLayout != null) {
            metaLayout.setCanFling(true);
        }
        if (this.o == 1) {
            i = this.j;
        } else {
            i = this.l;
        }
        this.m = -i;
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c579049", new Object[]{this});
        } else {
            j(hfn.b(-1.0f, hfn.e(0.0f, ((this.j + this.b) * 1.0f) / ((this.f22863a.getMeasuredHeight() - this.j) - this.q))) + 1.0f);
        }
    }

    public final void H() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7451cf", new Object[]{this});
            return;
        }
        int i2 = this.b;
        int i3 = this.j;
        if (i2 >= (-i3)) {
            if (i2 < (-i3) || i2 >= (-this.l)) {
                i = 3;
            } else {
                i = 2;
            }
        }
        this.n = i;
    }

    @Override // tb.kr1, tb.kcc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9c42e6", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            F();
        }
    }

    @Override // tb.kr1, tb.kcc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2da086e", new Object[]{this, new Integer(i)});
            return;
        }
        H();
        int i2 = this.o;
        if (i2 == 2) {
            int i3 = this.b;
            int i4 = this.j;
            if (i3 <= (-i4)) {
                return;
            }
            if (i3 >= (-i4) + this.k) {
                this.h.postScopeEvent(iml.b("dragHandler", false), "childPageWidget");
                x(this, false, 1, null);
                return;
            }
            this.h.postScopeEvent(jml.a("dragHandler"), "childPageWidget");
        } else if (i2 == 3) {
            if (this.b <= (-this.l) - this.k) {
                this.h.postScopeEvent(kml.a("dragHandler"), "childPageWidget");
                y();
                return;
            }
            this.h.postScopeEvent(iml.a("dragHandler"), "childPageWidget");
            x(this, false, 1, null);
        }
    }

    @Override // tb.kr1, tb.kcc
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86368875", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.kr1, tb.kcc
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8e58d9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.kcc
    public int e(int i, int i2, int i3) {
        boolean z;
        float f;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b8e4ea6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        this.q = i2;
        v();
        float f2 = this.b;
        if (f2 < (-this.j) || i >= 0) {
            f = 1.0f;
            z = false;
        } else {
            f = 0.5f;
            z = true;
        }
        int i4 = (int) (i * f);
        if (i < 0 && i4 == 0) {
            i4 = -1;
        }
        float f3 = f2 - i4;
        float f4 = 0.0f;
        if (i4 < 0 && f3 > 0.0f) {
            f3 = 0.0f;
        } else if (i4 > 0) {
            float measuredHeight = this.f22863a.getMeasuredHeight() + f3;
            if (!p()) {
                measuredHeight += i2;
            }
            float f5 = i2;
            if (measuredHeight < f5) {
                if (p()) {
                    f4 = f5;
                }
                f3 = f4 - this.f22863a.getMeasuredHeight();
            }
        }
        float e = hfn.e(f3, this.m);
        this.b = (int) e;
        G();
        MetaLayout metaLayout = this.i;
        if (metaLayout != null) {
            if (this.b > (-this.j)) {
                z2 = false;
            }
            metaLayout.setCanFling(z2);
        }
        H();
        if (z) {
            return i;
        }
        return (int) (f2 - e);
    }

    @Override // tb.kr1
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return -this.b;
    }

    @Override // tb.kr1, tb.kcc
    public void g(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7c587", new Object[]{this, metaLayout});
            return;
        }
        ckf.g(metaLayout, "layout");
        this.i = metaLayout;
        this.q = metaLayout.getListStart();
    }

    public final void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfeaf4d4", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = -i;
        this.m = -this.l;
        this.n = 2;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58d0d83e", new Object[]{this});
        } else if (z()) {
            ValueAnimator valueAnimator = this.p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.p = null;
        }
    }

    public final void w(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab37178", new Object[]{this, new Boolean(z)});
        } else if (this.n != 3 && !z()) {
            MetaLayout metaLayout = this.i;
            if (metaLayout != null) {
                metaLayout.setCanFling(false);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.b, -this.l);
            ckf.f(ofInt, "ofInt(...)");
            if (z) {
                i = -1;
            }
            E(ofInt, i);
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116da808", new Object[]{this});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.b, (-this.f22863a.getMeasuredHeight()) + this.q);
        ckf.f(ofInt, "ofInt(...)");
        E(ofInt, -1);
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acb39cf0", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator == null) {
            return false;
        }
        ckf.d(valueAnimator);
        if (valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }
}
