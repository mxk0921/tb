package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.perf.uikit.LiveLottieAnimationView;
import tb.ga2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eg1 implements kdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f18546a;
    public final Context b;
    public final FrameLayout c;
    public final LiveLottieAnimationView d;
    public final gg1 e;
    public final boolean f = nh4.j();
    public final ga2 g;
    public final m4q h;
    public final xwn i;
    public final boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements plh<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(eg1 eg1Var) {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
                return;
            }
            hha.b("ShowcaseAtmosphereControllerNew", "lottie 下载失败：" + th.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ga2.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ga2.h
        public void onHide() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
            } else if (eg1.i(eg1.this).b > 0) {
                eg1.j(eg1.this);
            } else {
                eg1.this.s(true);
            }
        }
    }

    static {
        t2o.a(295699138);
        t2o.a(295699154);
    }

    public eg1(xea xeaVar, Context context, FrameLayout frameLayout) {
        this.f18546a = xeaVar;
        this.b = context;
        this.c = frameLayout;
        this.j = wda.y(xeaVar);
        frameLayout.removeAllViews();
        LiveLottieAnimationView liveLottieAnimationView = new LiveLottieAnimationView(context);
        this.d = liveLottieAnimationView;
        liveLottieAnimationView.setId(R.id.animated_icon_flexallocal);
        liveLottieAnimationView.setAnimationFromUrl(yga.i0());
        liveLottieAnimationView.setRepeatCount(-1);
        liveLottieAnimationView.setShouldUseEnvironmentAwareness(vwl.e().b());
        liveLottieAnimationView.setFailureListener(new a(this));
        gg1 gg1Var = new gg1(-1L, 0, 0);
        this.e = gg1Var;
        ga2 ga2Var = new ga2(context, xeaVar, liveLottieAnimationView, gg1Var);
        this.g = ga2Var;
        ga2Var.l(new b());
        this.h = new m4q(context, xeaVar, liveLottieAnimationView, gg1Var);
        this.i = new xwn(context, xeaVar, liveLottieAnimationView, gg1Var);
    }

    public static /* synthetic */ gg1 i(eg1 eg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gg1) ipChange.ipc$dispatch("d9543251", new Object[]{eg1Var});
        }
        return eg1Var.e;
    }

    public static /* synthetic */ boolean j(eg1 eg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf9fd449", new Object[]{eg1Var})).booleanValue();
        }
        return eg1Var.l();
    }

    @Override // tb.kdc
    public void a(long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ee4dd0", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)});
            return;
        }
        hha.b("ShowcaseAtmosphereControllerNew", "setCount | itemId=" + j + " itemSellingTotal=" + i + " remainCount=" + i2 + " mCount=" + this.e.f19964a + " mRemainCount=" + this.e.b);
        gg1 gg1Var = new gg1(j, i, i2);
        if (m(gg1Var)) {
            hha.b("ShowcaseAtmosphereControllerNew", "setCount | show remain.");
        } else if (k(gg1Var)) {
            hha.b("ShowcaseAtmosphereControllerNew", "setCount | show big hot.");
        } else {
            n(gg1Var);
            hha.b("ShowcaseAtmosphereControllerNew", "setCount | show small hot.");
        }
    }

    @Override // tb.kdc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb8aba0", new Object[]{this});
        } else {
            s(false);
        }
    }

    @Override // tb.kdc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3962ce8b", new Object[]{this});
            return;
        }
        q(false);
        this.g.h();
        this.h.g();
        this.i.e();
    }

    @Override // tb.kdc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbba6d7", new Object[]{this});
        } else {
            this.h.i();
        }
    }

    @Override // tb.kdc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        q(false);
        this.d.cancelAnimation();
        if (this.d.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.d.getParent()).removeView(this.d);
        }
        this.h.b();
        this.g.b();
        this.i.b();
        this.c.removeAllViews();
    }

    @Override // tb.kdc
    public int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88b67a61", new Object[]{this, new Integer(i)})).intValue();
        }
        return nw0.d(this.b, i);
    }

    @Override // tb.kdc
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbdc85af", new Object[]{this, new Integer(i)});
        } else {
            this.e.f19964a = i;
        }
    }

    @Override // tb.kdc
    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bd3a9f1f", new Object[]{this});
        }
        return this.g.f();
    }

    @Override // tb.kdc
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.e.f19964a;
    }

    @Override // tb.kdc
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e060c471", new Object[]{this});
        } else {
            this.g.m();
        }
    }

    public final boolean k(gg1 gg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("781806c5", new Object[]{this, gg1Var})).booleanValue();
        }
        long j = gg1Var.c;
        gg1 gg1Var2 = this.e;
        if (j == gg1Var2.c || gg1Var.f19964a <= 100) {
            int i = gg1Var2.f19964a;
            int i2 = gg1Var.f19964a - i;
            if (i2 <= 100 && (this.g.f() == null || this.g.f().getParent() == null)) {
                return false;
            }
            this.e.b(gg1Var);
            r(false);
            if (i2 > 20) {
                i = this.e.f19964a - 20;
            }
            this.g.k(i);
            return true;
        }
        gg1Var2.b(gg1Var);
        r(true);
        return true;
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22134422", new Object[]{this})).booleanValue();
        }
        if (this.e.b > 0) {
            this.h.g();
            this.g.h();
            q(true);
            this.i.f(this.c);
            return true;
        }
        this.i.e();
        return false;
    }

    public final boolean m(gg1 gg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e4d2594", new Object[]{this, gg1Var})).booleanValue();
        }
        if (this.g.c() || !this.j) {
            return false;
        }
        if (gg1Var.b > 0) {
            this.e.b(gg1Var);
            this.h.g();
            this.g.h();
            q(true);
            this.i.f(this.c);
            return true;
        }
        this.i.e();
        return false;
    }

    public final void n(gg1 gg1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb36419a", new Object[]{this, gg1Var});
            return;
        }
        long j = gg1Var.c;
        gg1 gg1Var2 = this.e;
        if (j != gg1Var2.c) {
            gg1Var2.b(gg1Var);
            s(true);
            return;
        }
        int i = gg1Var2.f19964a;
        int i2 = gg1Var.f19964a;
        int i3 = i2 - i;
        if (i2 == 0 && yga.x0()) {
            c();
        } else if (i3 <= 0) {
            gg1Var.f19964a = i;
            this.e.b(gg1Var);
            s(true);
        } else {
            this.e.b(gg1Var);
            s(false);
            if (i3 > 20) {
                i = this.e.f19964a - 20;
            }
            this.h.h(i);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            c();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5502526", new Object[]{this});
            return;
        }
        this.e.a();
        c();
    }

    public final void q(boolean z) {
        xea xeaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e772f74b", new Object[]{this, new Boolean(z)});
        } else if (this.f && (xeaVar = this.f18546a) != null && xeaVar.q() != null && this.f18546a.q().j() != null) {
            this.f18546a.q().j().I("showHotAtmosphere", Boolean.valueOf(z));
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f187730c", new Object[]{this, new Boolean(z)});
        } else if (this.e.f19964a == 0) {
            o();
        } else {
            q(true);
            this.h.g();
            this.i.e();
            this.g.o(this.c, z);
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d7b34", new Object[]{this, new Boolean(z)});
        } else if (this.e.f19964a == 0) {
            o();
        } else {
            q(true);
            this.g.h();
            this.h.g();
            this.h.k(this.c, z);
        }
    }

    @Override // tb.kdc
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
    }
}
