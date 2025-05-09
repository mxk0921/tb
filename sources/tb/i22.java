package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.page.FullPage;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.avplayer.r;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class i22 implements q2e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long IMAGE_TRANSLATION_DURATION = 200;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21048a;
    public final FluidContext b;
    public final boolean c;
    public final anl d;
    public ViewGroup e;
    public MultiTabLayout f;
    public FrameLayout g;
    public RotateAnimation h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public rv4 m;
    public Drawable n = null;
    public final boolean o;
    public final cl4 p;

    static {
        t2o.a(468714747);
        t2o.a(468714749);
    }

    public i22(Context context, anl anlVar, FluidContext fluidContext, ViewGroup viewGroup, boolean z) {
        this.o = false;
        this.b = fluidContext;
        this.f21048a = context;
        this.d = anlVar;
        this.c = z;
        this.p = ((IContainerService) fluidContext.getService(IContainerService.class)).getContainer();
        m(viewGroup);
        k();
        this.o = f2k.d(fluidContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r10.n == null) goto L_0x0047;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.r8e a(boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.i22.a(boolean, boolean):tb.r8e");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3be61a", new Object[]{this});
            return;
        }
        String f = f();
        r i = ogi.e().i(f);
        boolean b = ogi.e().b(f);
        if (i != null && b) {
            g7m.o().g(true, ogi.e().h(f));
            ogi.e().c();
        }
        l9f.f().d(f);
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2e27f139", new Object[]{this});
        }
        return this.p.r();
    }

    public TUrlImageView d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("b085964a", new Object[]{this});
        }
        return this.p.s();
    }

    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("95dbfc54", new Object[]{this});
        }
        return this.p.t();
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe2dfd1b", new Object[]{this});
        }
        return this.b.getInstanceConfig().getPreCoverKey();
    }

    public TUrlImageView g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("525dc880", new Object[]{this});
        }
        return this.p.x();
    }

    public View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2bd394d9", new Object[]{this});
        }
        return this.p.w();
    }

    public RotateAnimation i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RotateAnimation) ipChange.ipc$dispatch("b1a7db17", new Object[]{this});
        }
        return this.h;
    }

    public View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4d8f55b7", new Object[]{this});
        }
        return this.p.A();
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        String f = f();
        this.i = this.b.getInstanceConfig().isNeedTransferAnimation();
        rv4 b = qv4.c().b(f);
        this.m = b;
        if (b == null) {
            this.m = this.b.getInstanceConfig().getCoverObject();
        }
        rv4 rv4Var = this.m;
        if (rv4Var != null) {
            this.n = rv4Var.c();
        }
        this.j = ogi.e().b(f);
        this.k = ogi.e().m(f);
        this.l = l9f.f().o(f);
        ((ICardService) this.b.getService(ICardService.class)).getConfig().A(this.j);
        if (this.d instanceof FullPage) {
            t();
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d90aec", new Object[]{this, new Boolean(z)});
            return;
        }
        View c = c();
        ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
        if (layoutParams != null) {
            if (f2k.d(this.b)) {
                layoutParams.height = pr9.q(360);
            } else {
                layoutParams.height = s6o.S(c.getContext(), 360);
            }
            c.setLayoutParams(layoutParams);
        }
        View j = j();
        ViewGroup.LayoutParams layoutParams2 = j.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = pr9.c(j.getContext(), 50);
            j.setLayoutParams(layoutParams2);
        }
        c.setVisibility(8);
        j.setVisibility(8);
    }

    public final void m(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59e761b", new Object[]{this, viewGroup});
            return;
        }
        this.e = viewGroup;
        this.f = (MultiTabLayout) viewGroup.findViewById(R.id.fluid_sdk_multi_tab_layout);
        this.g = (FrameLayout) this.e.findViewById(R.id.fluid_sdk_tab_anim_layout);
    }

    public void n() {
        boolean z;
        int i;
        int n;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80ee067", new Object[]{this});
            return;
        }
        String f = f();
        m9f h = l9f.f().h(f);
        if (h == null) {
            q();
            return;
        }
        r8e b = h.b();
        if (b == null) {
            q();
            return;
        }
        atb i2 = l9f.f().i(f);
        if (i2 == null) {
            q();
            return;
        }
        ViewGroup view = i2.getView();
        if (view == null) {
            q();
            return;
        }
        int v = s6o.v(this.f21048a);
        int t = s6o.t(this.f21048a) - s6o.z(this.f21048a);
        if (v != 0) {
            if ((t * 1.0f) / v < 1.9444444f) {
                z2 = false;
            }
            z = z2;
        } else {
            z = false;
        }
        if (!this.o) {
            Context context = this.f21048a;
            FluidContext fluidContext = this.b;
            if (z) {
                n = pcw.k(fluidContext);
            } else {
                n = pcw.n(fluidContext);
            }
            i = s6o.S(context, n);
        } else {
            i = 0;
        }
        bbw.j(this.b, v, t, z, i, b, false);
        int i3 = b.k;
        if (i3 == 0) {
            i3 = b.c;
        }
        i2.f(b.d, i3);
        i2.mute(mfj.u(this.b));
        this.f.setBackgroundColor(0);
        h().setBackgroundColor(0);
        l(false);
        this.e.post(new a(view, b));
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbaa617a", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableTab3HideLoading", true);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b03bfaeb", new Object[]{this});
            return;
        }
        e().setVisibility(0);
        TUrlImageView d = d();
        d.setVisibility(0);
        d.setImageDrawable(this.f21048a.getResources().getDrawable(R.drawable.fluid_sdk_whiteloading));
        int c = pr9.c(this.f21048a, 40);
        ViewGroup.LayoutParams layoutParams = d.getLayoutParams();
        layoutParams.width = c;
        layoutParams.height = c;
        d.setLayoutParams(layoutParams);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.h = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.h.setDuration(1000L);
        this.h.setRepeatCount(-1);
        d.startAnimation(this.h);
        s();
        ((IQuickOpenService) this.b.getService(IQuickOpenService.class)).onAnimationEnd();
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd197e5c", new Object[]{this});
            return;
        }
        if (!pto.f(this.b)) {
            ImageStrategyConfig imageStrategyConfig = FluidSDK.getImageAdapter().getImageStrategyConfig();
            TUrlImageView g = g();
            g.setStrategyConfig(imageStrategyConfig);
            g.setImageUrl(sj4.FOLLOW_TAB_VIDEO_LOADING);
        } else if (!pto.g(this.b)) {
            TUrlImageView g2 = g();
            g2.setStrategyConfig(FluidSDK.getImageAdapter().getImageStrategyConfig());
            g2.setImageUrl(sj4.FOLLOW_TAB_VIDEO_GUANGGUANG_LOADING);
        } else if (!x()) {
            TUrlImageView g3 = g();
            g3.setImageDrawable(this.f21048a.getResources().getDrawable(R.drawable.fluid_sdk_tab3_loading));
            int c = pr9.c(this.f21048a, 35);
            ViewGroup.LayoutParams layoutParams = g3.getLayoutParams();
            layoutParams.width = c;
            layoutParams.height = c;
            g3.setLayoutParams(layoutParams);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            this.h = rotateAnimation;
            rotateAnimation.setInterpolator(new LinearInterpolator());
            this.h.setDuration(1000L);
            this.h.setRepeatCount(-1);
            g3.startAnimation(this.h);
            ir9.a("DefaultFluidInstance", "动画开始");
        }
        s();
        ((IQuickOpenService) this.b.getService(IQuickOpenService.class)).onAnimationEnd();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0d0103", new Object[]{this});
            return;
        }
        rv4 rv4Var = this.m;
        if (rv4Var != null) {
            if (rv4Var.e() != null && (!this.j || this.k)) {
                this.n = this.m.e();
            }
            TUrlImageView g = g();
            if (this.n != null || this.m.f() == null) {
                g.setImageDrawable(this.n);
                return;
            }
            g.setStrategyConfig(FluidSDK.getImageAdapter().getImageStrategyConfig());
            g.setImageUrl(this.m.f());
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f30c6cd", new Object[]{this});
            return;
        }
        Context context = this.f21048a;
        if (context instanceof Activity) {
            hpj.f((Activity) context, -16777216);
        } else {
            FluidException.throwException(this.b, FluidInstance.INSTANCE_ANDROID_CONTEXT_NOT_ACTIVITY);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80302f9", new Object[]{this});
            return;
        }
        rv4 rv4Var = this.m;
        if (rv4Var != null && ((this.n != null || rv4Var.f() != null) && (!this.j || this.k))) {
            ((FullPage) this.d).setSelfTransitionExecuted(true);
        } else if (this.m == null || !this.j) {
            ((FullPage) this.d).setSelfTransitionExecuted(false);
        } else {
            ((FullPage) this.d).setSelfTransitionExecuted(true);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1406bafd", new Object[]{this});
            return;
        }
        this.f.setBackgroundColor(0);
        h().setBackgroundColor(0);
        l(true);
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96233150", new Object[]{this});
            return;
        }
        this.f.setBackgroundColor(-16777216);
        h().setBackgroundColor(-16777216);
        c().setVisibility(8);
        View j = j();
        ViewGroup.LayoutParams layoutParams = j.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = pr9.c(j.getContext(), 50);
            j.setLayoutParams(layoutParams);
        }
    }

    public final boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1089607", new Object[]{this})).booleanValue();
        }
        o();
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f21049a;
        public final /* synthetic */ r8e b;

        public a(View view, r8e r8eVar) {
            this.f21049a = view;
            this.b = r8eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ir9.a(y6d.QUICK_OPEN_TAG, "inner view post getContentView().post");
            if (((ILifecycleService) i22.this.b.getService(ILifecycleService.class)).getPageState() == 5) {
                i22.this.b();
                return;
            }
            if (this.f21049a.getParent() != null) {
                ((ViewGroup) this.f21049a.getParent()).removeView(this.f21049a);
            }
            r8e r8eVar = this.b;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r8eVar.d, r8eVar.c);
            r8e r8eVar2 = this.b;
            layoutParams.topMargin = r8eVar2.e;
            layoutParams.width = r8eVar2.d;
            layoutParams.height = r8eVar2.c;
            i22.this.h().getLayoutParams().height = this.b.c;
            i22.this.g.getLayoutParams().height = this.b.c;
            i22.this.g.addView(this.f21049a, 0, layoutParams);
            ((IQuickOpenService) i22.this.b.getService(IQuickOpenService.class)).setLoadingImage(i22.this.g());
            ((ISharePlayerService) i22.this.b.getService(ISharePlayerService.class)).setHasShowInnerSharePlayerPV(true);
            l9f.f().t(true);
            ((IQuickOpenService) i22.this.b.getService(IQuickOpenService.class)).onAnimationEnd();
            i22.this.w();
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8f179d", new Object[]{this});
            return;
        }
        r i = ogi.e().i(f());
        if (i == null) {
            ir9.b(y6d.QUICK_OPEN_TAG, "sharePlayerViewAnim TBHighPerformanceDWInstance为null return");
            q();
            return;
        }
        ViewGroup K = i.K();
        if (K == null) {
            ir9.b(y6d.QUICK_OPEN_TAG, "sharePlayerViewAnim videoView为null return");
            q();
            return;
        }
        r8e a2 = a(false, true);
        i.V(mfj.u(this.b));
        ((neu) this).f0(K, a2, i, false);
    }
}
