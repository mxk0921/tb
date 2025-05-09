package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.perf.uikit.LiveLottieAnimationView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ga2 extends f00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public h j;
    public final Runnable i = new a();
    public final Handler h = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ga2.this.i();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
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
            ga2 ga2Var = ga2.this;
            ga2Var.e = null;
            if (ga2.d(ga2Var) != null) {
                ga2.d(ga2.this).onHide();
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
            } else {
                ga2.this.e = null;
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
    public class d implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
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
            } else {
                ga2.this.e = null;
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
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = (TextView) ga2.this.d.findViewById(R.id.tv_items);
            if (textView != null) {
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
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
            ga2 ga2Var = ga2.this;
            ga2Var.g++;
            ga2Var.n();
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
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = (TextView) ga2.this.d.findViewById(R.id.tv_items);
            if (textView != null) {
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface h {
        void onHide();
    }

    static {
        t2o.a(295699142);
    }

    public ga2(Context context, xea xeaVar, LiveLottieAnimationView liveLottieAnimationView, gg1 gg1Var) {
        super(context, xeaVar, liveLottieAnimationView, gg1Var);
    }

    public static /* synthetic */ h d(ga2 ga2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("30c66f59", new Object[]{ga2Var});
        }
        return ga2Var.j;
    }

    public static /* synthetic */ Object ipc$super(ga2 ga2Var, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/hot/BigHotAtmosphere");
    }

    @Override // tb.f00
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.b();
        this.h.removeCallbacksAndMessages(null);
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ead51b", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.f.f19964a - i;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Animator j = j();
        if (j != null) {
            arrayList.add(j);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(g());
        }
        animatorSet.playSequentially(arrayList);
        animatorSet.addListener(new d());
        animatorSet.start();
        this.e = animatorSet;
    }

    public View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5fae2d26", new Object[]{this});
        }
        if (this.d == null) {
            View inflate = LayoutInflater.from(this.f18910a).inflate(R.layout.layout_hot_atmosphere_high_flexalocal, (ViewGroup) null);
            this.d = inflate;
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.iv_background);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(yga.g0());
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) this.d.findViewById(R.id.iv_title);
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(yga.h0());
            }
        }
        if (this.c.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(nw0.d(this.f18910a, 80.0f), nw0.d(this.f18910a, 145.0f));
        layoutParams.gravity = 85;
        layoutParams.bottomMargin = nw0.d(this.f18910a, -9.0f);
        ((FrameLayout) this.d).addView(this.c, 1, layoutParams);
        return this.d;
    }

    public final AnimatorSet g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("a1df070f", new Object[]{this});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.15f);
        ofFloat.addUpdateListener(new e());
        ofFloat.setDuration(250L);
        ofFloat.addListener(new f());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.15f, 1.0f);
        ofFloat2.addUpdateListener(new g());
        ofFloat2.setDuration(250L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.h.removeCallbacks(this.i);
        View view = this.d;
        if (view != null) {
            try {
                LiveLottieAnimationView liveLottieAnimationView = (LiveLottieAnimationView) view.findViewById(R.id.animated_icon_flexallocal);
                if (liveLottieAnimationView != null) {
                    liveLottieAnimationView.cancelAnimation();
                }
                if (this.d.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.d.getParent()).removeView(this.d);
                }
            } catch (Exception e2) {
                hha.b("BigAtmosphere", e2.getMessage());
            }
        }
        Animator animator = this.e;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db2d11a", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        this.h.removeCallbacks(this.i);
        e(i);
        this.h.postDelayed(this.i, TimeUnit.SECONDS.toMillis(6L) + ((this.f.f19964a - i) * 250));
    }

    public void l(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442b777d", new Object[]{this, hVar});
        } else {
            this.j = hVar;
        }
    }

    public void m() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e060c471", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null && (textView = (TextView) view.findViewById(R.id.tv_items)) != null) {
            textView.setText(this.f18910a.getString(R.string.taolive_project_show_case_atmosphere_prefix) + a(this.f.f19964a));
        }
    }

    public void n() {
        int i;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c9c5e3", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null && (i = this.g) > 0 && i < this.f.f19964a && (textView = (TextView) view.findViewById(R.id.tv_items)) != null) {
            textView.setText(this.f18910a.getString(R.string.taolive_project_show_case_atmosphere_prefix) + a(this.g));
        }
    }

    public void o(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43d61f1", new Object[]{this, viewGroup, new Boolean(z)});
            return;
        }
        this.h.removeCallbacks(this.i);
        View f2 = f();
        if (f2.getParent() == null) {
            viewGroup.addView(f2);
        }
        try {
            LiveLottieAnimationView liveLottieAnimationView = (LiveLottieAnimationView) this.d.findViewById(R.id.animated_icon_flexallocal);
            xea xeaVar = this.b;
            if (!(xeaVar == null || xeaVar.q() == null)) {
                liveLottieAnimationView.setFrameContext(this.b.q());
                liveLottieAnimationView.setAnimationName("AnimationLifeCycle/HighAtmosphere");
                liveLottieAnimationView.playAnimation();
            }
        } catch (Exception e2) {
            hha.b("BigAtmosphere", e2.getMessage());
        }
        if (z) {
            m();
        }
        Animator j = j();
        if (j != null) {
            j.start();
        }
        this.h.postDelayed(this.i, TimeUnit.SECONDS.toMillis(6L));
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55ef88c6", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.5f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.d, "scaleY", 1.0f, 0.5f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.d, "translationY", 0.0f, nw0.d(this.f18910a, 40.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
            animatorSet.setDuration(300L);
            animatorSet.addListener(new b());
            animatorSet.start();
            this.e = animatorSet;
        }
    }

    public Animator j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("cc64ea28", new Object[]{this});
        }
        View view = this.d;
        if (view == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.5f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.d, "scaleY", 0.5f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.d, "translationY", nw0.d(this.f18910a, 40.0f), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new c());
        this.e = animatorSet;
        return animatorSet;
    }
}
