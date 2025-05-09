package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import com.taobao.avplayer.r;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class neu extends i22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f24688a;
        public final /* synthetic */ r8e b;
        public final /* synthetic */ r c;

        public a(View view, r8e r8eVar, r rVar) {
            this.f24688a = view;
            this.b = r8eVar;
            this.c = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar;
            View view;
            View view2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ir9.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim getContentView.post");
            if (((ILifecycleService) neu.y(neu.this).getService(ILifecycleService.class)).getPageState() == 5) {
                neu.z(neu.this);
                ir9.b("TransitionAnimController_SharePlayer", "sharePlayerViewAnim getContentView.post return");
                return;
            }
            if (neu.K(neu.this) || (view2 = this.f24688a) == null) {
                neu.a0(neu.this);
                TUrlImageView g = neu.this.g();
                g.setScaleType(this.b.f);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g.getLayoutParams();
                r8e r8eVar = this.b;
                layoutParams.width = r8eVar.d;
                layoutParams.height = r8eVar.c;
                neu.this.h().getLayoutParams().height = this.b.c;
                g.setLayoutParams(layoutParams);
                g.setTag(R.id.fluid_sdk_tag_prerender_videosize_object, this.b);
            } else {
                if (view2.getParent() != null) {
                    ((ViewGroup) this.f24688a.getParent()).removeView(this.f24688a);
                }
                FrameLayout.LayoutParams V = neu.V(neu.this, this.b);
                neu.Y(neu.this).getLayoutParams().height = this.b.c;
                neu.Z(neu.this).addView(this.f24688a, 0, V);
                this.f24688a.setTag(R.id.fluid_sdk_tag_prerender_videosize_object, this.b);
            }
            ((IQuickOpenService) neu.b0(neu.this).getService(IQuickOpenService.class)).setLoadingImage(neu.this.g());
            if (neu.c0(neu.this) || this.f24688a == null) {
                view = neu.this.h();
                rVar = null;
            } else {
                view = neu.d0(neu.this);
                rVar = this.c;
            }
            if (neu.A(neu.this)) {
                neu.B(neu.this, this.b, view, rVar);
                return;
            }
            ((IQuickOpenService) neu.C(neu.this).getService(IQuickOpenService.class)).onAnimationEnd();
            if (this.c != null && !neu.D(neu.this)) {
                r8e r8eVar2 = this.b;
                int i = r8eVar2.k;
                if (i == 0) {
                    i = r8eVar2.c;
                }
                this.c.m0(r8eVar2.d, i);
            }
            neu.E(neu.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f24689a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        public b(float f, float f2, float f3, float f4) {
            this.f24689a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup F = neu.F(neu.this);
            float f = this.f24689a;
            F.setTranslationX(f - (floatValue * f));
            ViewGroup G = neu.G(neu.this);
            float f2 = this.b;
            G.setTranslationY(f2 - (floatValue * f2));
            ViewGroup H = neu.H(neu.this);
            float f3 = this.c;
            H.setScaleX(f3 + ((1.0f - f3) * floatValue));
            ViewGroup I = neu.I(neu.this);
            float f4 = this.d;
            I.setScaleY(f4 + ((1.0f - f4) * floatValue));
            neu.J(neu.this).setAlpha(floatValue);
            neu.L(neu.this, floatValue, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ((IQuickOpenService) neu.M(neu.this).getService(IQuickOpenService.class)).onAnimationEnd();
            neu.N(neu.this);
            if (neu.O(neu.this) != null && (neu.P(neu.this).getDecorView() instanceof GestureLayout)) {
                ((GestureLayout) neu.Q(neu.this).getDecorView()).setDragLayoutBackground(Color.parseColor("#52000000"));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f24691a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;

        public d(View view, float f, float f2, float f3, float f4) {
            this.f24691a = view;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = this.f24691a;
            float f = this.b;
            view.setTranslationX(f - (floatValue * f));
            View view2 = this.f24691a;
            float f2 = this.c;
            view2.setTranslationY(f2 - (floatValue * f2));
            View view3 = this.f24691a;
            float f3 = this.d;
            view3.setScaleX(f3 + ((1.0f - f3) * floatValue));
            View view4 = this.f24691a;
            float f4 = this.e;
            view4.setScaleY(f4 + (floatValue * (1.0f - f4)));
            this.f24691a.setAlpha(1.0f);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            neu.R(neu.this).setBackgroundColor(intValue);
            neu.L(neu.this, intValue, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f24693a;
        public final /* synthetic */ r b;
        public final /* synthetic */ r8e c;
        public final /* synthetic */ int d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ir9.a("TransitionAnimController_SharePlayer", "cflog anim " + floatValue);
                neu.this.c().setVisibility(0);
                neu.this.j().setVisibility(0);
                neu.this.c().setAlpha(floatValue);
                neu.this.j().setAlpha(floatValue);
            }
        }

        public f(boolean z, r rVar, r8e r8eVar, int i) {
            this.f24693a = z;
            this.b = rVar;
            this.c = r8eVar;
            this.d = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                ir9.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim 动画取消");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ((IQuickOpenService) neu.T(neu.this).getService(IQuickOpenService.class)).onAnimationEnd();
            neu.N(neu.this);
            if (neu.U(neu.this) != null && (neu.W(neu.this).getDecorView() instanceof GestureLayout)) {
                ((GestureLayout) neu.X(neu.this).getDecorView()).setDragLayoutBackground(Color.parseColor("#52000000"));
            }
            if (!meu.c()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.5f, 1.0f);
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 1.0f, 1.0f));
                ofFloat.addUpdateListener(new a());
                ofFloat.start();
            }
            ir9.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim 动画结束");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                ir9.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim 动画onAnimationRepeat");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            r rVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            if (this.f24693a && (rVar = this.b) != null) {
                rVar.m0(this.c.d, this.d);
            }
            ir9.a("TransitionAnimController_SharePlayer", "sharePlayerViewAnim 动画开始");
            if (meu.a()) {
                g7m.o().e(true, ogi.e().h(neu.S(neu.this)));
            }
        }
    }

    static {
        t2o.a(468714769);
    }

    public neu(Context context, anl anlVar, FluidContext fluidContext, ViewGroup viewGroup, boolean z) {
        super(context, anlVar, fluidContext, viewGroup, z);
    }

    public static /* synthetic */ boolean A(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7aaf4fa6", new Object[]{neuVar})).booleanValue();
        }
        return neuVar.i;
    }

    public static /* synthetic */ void B(neu neuVar, r8e r8eVar, View view, r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207b8b09", new Object[]{neuVar, r8eVar, view, rVar});
        } else {
            neuVar.h0(r8eVar, view, rVar);
        }
    }

    public static /* synthetic */ FluidContext C(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("6afd77a4", new Object[]{neuVar});
        }
        return neuVar.b;
    }

    public static /* synthetic */ boolean D(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3821069", new Object[]{neuVar})).booleanValue();
        }
        return neuVar.k;
    }

    public static /* synthetic */ void E(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc850a6", new Object[]{neuVar});
        } else {
            neuVar.w();
        }
    }

    public static /* synthetic */ ViewGroup F(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("346c754e", new Object[]{neuVar});
        }
        return neuVar.e;
    }

    public static /* synthetic */ ViewGroup G(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7d837bed", new Object[]{neuVar});
        }
        return neuVar.e;
    }

    public static /* synthetic */ ViewGroup H(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c69a828c", new Object[]{neuVar});
        }
        return neuVar.e;
    }

    public static /* synthetic */ ViewGroup I(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("fb1892b", new Object[]{neuVar});
        }
        return neuVar.e;
    }

    public static /* synthetic */ ViewGroup J(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("58c88fca", new Object[]{neuVar});
        }
        return neuVar.e;
    }

    public static /* synthetic */ boolean K(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e458b7f9", new Object[]{neuVar})).booleanValue();
        }
        return neuVar.k;
    }

    public static /* synthetic */ void L(neu neuVar, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53567e55", new Object[]{neuVar, new Float(f2), new Boolean(z)});
        } else {
            neuVar.e0(f2, z);
        }
    }

    public static /* synthetic */ FluidContext M(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("f55c9946", new Object[]{neuVar});
        }
        return neuVar.b;
    }

    public static /* synthetic */ void N(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abbd9803", new Object[]{neuVar});
        } else {
            neuVar.l0();
        }
    }

    public static /* synthetic */ anl O(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("f88cddce", new Object[]{neuVar});
        }
        return neuVar.d;
    }

    public static /* synthetic */ anl P(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("95c8f52d", new Object[]{neuVar});
        }
        return neuVar.d;
    }

    public static /* synthetic */ anl Q(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("33050c8c", new Object[]{neuVar});
        }
        return neuVar.d;
    }

    public static /* synthetic */ MultiTabLayout R(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTabLayout) ipChange.ipc$dispatch("d2ff4f4a", new Object[]{neuVar});
        }
        return neuVar.f;
    }

    public static /* synthetic */ String S(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2151d458", new Object[]{neuVar});
        }
        return neuVar.g0();
    }

    public static /* synthetic */ FluidContext T(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("b7c8211f", new Object[]{neuVar});
        }
        return neuVar.b;
    }

    public static /* synthetic */ anl U(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("a7f56a08", new Object[]{neuVar});
        }
        return neuVar.d;
    }

    public static /* synthetic */ FrameLayout.LayoutParams V(neu neuVar, r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("607c552", new Object[]{neuVar, r8eVar});
        }
        return neuVar.j0(r8eVar);
    }

    public static /* synthetic */ anl W(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("2b1f6c32", new Object[]{neuVar});
        }
        return neuVar.d;
    }

    public static /* synthetic */ anl X(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anl) ipChange.ipc$dispatch("c85b8391", new Object[]{neuVar});
        }
        return neuVar.d;
    }

    public static /* synthetic */ FrameLayout Y(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("da3a3e02", new Object[]{neuVar});
        }
        return neuVar.g;
    }

    public static /* synthetic */ FrameLayout Z(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("1d1edd21", new Object[]{neuVar});
        }
        return neuVar.g;
    }

    public static /* synthetic */ void a0(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8571b8f9", new Object[]{neuVar});
        } else {
            neuVar.r();
        }
    }

    public static /* synthetic */ FluidContext b0(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("f032bcce", new Object[]{neuVar});
        }
        return neuVar.b;
    }

    public static /* synthetic */ boolean c0(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5fe397f", new Object[]{neuVar})).booleanValue();
        }
        return neuVar.k;
    }

    public static /* synthetic */ FrameLayout d0(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("28b1599d", new Object[]{neuVar});
        }
        return neuVar.g;
    }

    public static /* synthetic */ Object ipc$super(neu neuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/shareplayer/TransitionAnim/TransitionAnimController");
    }

    public static /* synthetic */ FluidContext y(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("2dc734f5", new Object[]{neuVar});
        }
        return neuVar.b;
    }

    public static /* synthetic */ void z(neu neuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1277b4", new Object[]{neuVar});
        } else {
            neuVar.b();
        }
    }

    public final void e0(float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe012a", new Object[]{this, new Float(f2), new Boolean(z)});
        } else if (this.c) {
        } else {
            if (z) {
                hpj.g((Activity) this.f21048a, (int) f2, -1);
            } else {
                hpj.d((Activity) this.f21048a, (int) (f2 * 255.0f));
            }
        }
    }

    public void f0(View view, r8e r8eVar, r rVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6787c99", new Object[]{this, view, r8eVar, rVar, new Boolean(z)});
            return;
        }
        u();
        this.e.post(new a(view, r8eVar, rVar));
    }

    public final String g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c0b1464", new Object[]{this});
        }
        return this.b.getInstanceConfig().getPreCoverKey();
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6fe708", new Object[]{this});
            return;
        }
        rv4 rv4Var = this.m;
        if (rv4Var == null || ((this.n == null && rv4Var.f() == null) || (this.j && !this.k))) {
            if (this.m != null && this.j) {
                v();
            } else if (this.l) {
                n();
            } else if (hn4.i(this.b)) {
                p();
            } else if (!qtm.i(this.b)) {
                q();
            }
        } else if (!meu.b()) {
            r8e a2 = a(true, false);
            r();
            TUrlImageView g = g();
            g.setScaleType(a2.f);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g.getLayoutParams();
            layoutParams.topMargin = a2.e;
            layoutParams.width = a2.d;
            layoutParams.height = a2.c;
            h().getLayoutParams().height = a2.c;
            g.setLayoutParams(layoutParams);
            ((IQuickOpenService) this.b.getService(IQuickOpenService.class)).setLoadingImage(g);
            if (this.i) {
                float m = this.m.m() / a2.d;
                float g2 = this.m.g() / a2.c;
                int[] iArr = this.m.h;
                float f2 = iArr[0];
                float z = iArr[1] - s6o.z(this.f21048a);
                this.e.setPivotX(0.0f);
                this.e.setPivotY(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                duration.setInterpolator(PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f));
                duration.addUpdateListener(new b(f2, z, m, g2));
                duration.addListener(new c());
                duration.start();
            } else {
                ((IQuickOpenService) this.b.getService(IQuickOpenService.class)).onAnimationEnd();
            }
            k0();
        } else {
            f0(null, a(true, true), null, true);
        }
    }

    public final FrameLayout.LayoutParams j0(r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("7a3d94b7", new Object[]{this, r8eVar});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r8eVar.d, r8eVar.c);
        layoutParams.topMargin = r8eVar.e;
        layoutParams.width = r8eVar.d;
        layoutParams.height = r8eVar.c;
        h().getLayoutParams().height = r8eVar.c;
        return layoutParams;
    }

    public final void k0() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492e313a", new Object[]{this});
            return;
        }
        View c2 = c();
        ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
        if (layoutParams != null) {
            if (f2k.d(this.b)) {
                layoutParams.height = pr9.q(360);
            } else {
                layoutParams.height = s6o.S(c2.getContext(), 360);
            }
            c2.setLayoutParams(layoutParams);
        }
        View j = j();
        ViewGroup.LayoutParams layoutParams2 = j.getLayoutParams();
        if (layoutParams2 != null) {
            Context context = j.getContext();
            if (meu.c()) {
                i2 = 44;
            } else {
                i2 = 50;
            }
            layoutParams2.height = pr9.c(context, i2);
            j.setLayoutParams(layoutParams2);
        }
        if (meu.c()) {
            i = 8;
        } else {
            i = 0;
        }
        c2.setVisibility(i);
        j.setVisibility(0);
    }

    public final void l0() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5989b2c", new Object[]{this});
            return;
        }
        anl anlVar = this.d;
        if (anlVar != null && anlVar.getPageTransition() != null && (view = this.d.getPageTransition().b().get(0)) != null) {
            view.setAlpha(0.0f);
        }
    }

    public final void h0(r8e r8eVar, View view, r rVar) {
        float f2;
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f62595f", new Object[]{this, r8eVar, view, rVar});
            return;
        }
        boolean c2 = meu.c();
        float m = this.m.m();
        float g = this.m.g();
        int i = r8eVar.k;
        if (i == 0) {
            i = r8eVar.c;
        }
        int i2 = r8eVar.d;
        if (i2 == 0 || i == 0) {
            w();
            ir9.b("TransitionAnimController_SharePlayer", "sharePlayerViewAnim getContentView.post 宽高为0 return");
            return;
        }
        float f5 = i2;
        float f6 = m / f5;
        float f7 = g / i;
        int i3 = r8eVar.c;
        int i4 = (i3 - r8eVar.h) / 2;
        int[] iArr = this.m.h;
        if (i4 > 0) {
            f4 = iArr[0] - (((f5 * f7) - m) / 2.0f);
            if (c2) {
                f3 = (iArr[1] - s6o.z(this.f21048a)) - (i4 * f7);
            } else {
                f3 = (iArr[1] - s6o.z(this.f21048a)) - i4;
            }
            f2 = f7;
        } else {
            f4 = iArr[0];
            f3 = (iArr[1] - s6o.z(this.f21048a)) - (((i3 * f6) - g) / 2.0f);
            f2 = f6;
        }
        int c3 = pr9.c(this.f21048a, 44);
        if (c2 && (view instanceof ViewGroup) && r8eVar.e < c3) {
            View view2 = new View(this.f21048a);
            view2.setLayoutParams(new FrameLayout.LayoutParams(-1, c3, 48));
            view2.setBackgroundResource(R.drawable.fluid_sdk_video_background_top);
            view2.setVisibility(0);
            ((ViewGroup) view).addView(view2);
        }
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new d(view, f4, f3, f2, f2));
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), 0, Integer.MIN_VALUE, -16777216);
        ofObject.setInterpolator(PathInterpolatorCompat.create(0.0f, 0.0f, 1.0f, 1.0f));
        ofObject.addUpdateListener(new e());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(new f(c2, rVar, r8eVar, i));
        animatorSet.playTogether(ofFloat, ofObject);
        animatorSet.start();
    }
}
