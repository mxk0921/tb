package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m4q extends f00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
                m4q.this.e = null;
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
            m4q m4qVar = m4q.this;
            m4qVar.g++;
            m4qVar.j();
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

    static {
        t2o.a(295699156);
    }

    public m4q(Context context, xea xeaVar, LiveLottieAnimationView liveLottieAnimationView, gg1 gg1Var) {
        super(context, xeaVar, liveLottieAnimationView, gg1Var);
    }

    public static /* synthetic */ Object ipc$super(m4q m4qVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/hot/SmallHotAtmosphere");
    }

    @Override // tb.f00
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            super.b();
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94ae661", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.f.f19964a - i;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(f());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.addListener(new a());
        animatorSet.start();
        this.e = animatorSet;
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5fae2d26", new Object[]{this});
        }
        if (this.d == null) {
            View inflate = LayoutInflater.from(this.f18910a).inflate(R.layout.layout_hot_atmosphere_low_flexalocal, (ViewGroup) null);
            this.d = inflate;
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.iv_background);
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(yga.j0());
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) this.d.findViewById(R.id.iv_title);
            if (tUrlImageView2 != null) {
                tUrlImageView2.setImageUrl(yga.k0());
            }
        }
        if (this.c.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(nw0.d(this.f18910a, 28.0f), nw0.d(this.f18910a, 31.0f));
        layoutParams.gravity = 83;
        ((FrameLayout) this.d).addView(this.c, layoutParams);
        return this.d;
    }

    public final AnimatorSet f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("68114cc5", new Object[]{this});
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.addListener(new b());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 1.0f);
        ofFloat2.setDuration(250L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
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
            } catch (Exception e) {
                hha.b("HotAtmosphere", e.getMessage());
            }
        }
        Animator animator = this.e;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db2d11a", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        d(i);
    }

    public void i() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbba6d7", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null && (textView = (TextView) view.findViewById(R.id.tv_items)) != null) {
            textView.setText(this.f18910a.getString(R.string.taolive_project_show_case_atmosphere_prefix) + a(this.f.f19964a));
        }
    }

    public void j() {
        int i;
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daaecc9", new Object[]{this});
            return;
        }
        View view = this.d;
        if (view != null && (i = this.g) > 0 && i <= this.f.f19964a && (textView = (TextView) view.findViewById(R.id.tv_items)) != null) {
            textView.setText(this.f18910a.getString(R.string.taolive_project_show_case_atmosphere_prefix) + a(this.g));
        }
    }

    public void k(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43d61f1", new Object[]{this, viewGroup, new Boolean(z)});
        } else if (viewGroup != null) {
            View e = e();
            if (e.getParent() == null) {
                viewGroup.addView(e);
            }
            try {
                LiveLottieAnimationView liveLottieAnimationView = (LiveLottieAnimationView) this.d.findViewById(R.id.animated_icon_flexallocal);
                xea xeaVar = this.b;
                if (!(xeaVar == null || xeaVar.q() == null)) {
                    liveLottieAnimationView.setAnimationName("AnimationLifeCycle/LowAtmosphere");
                    liveLottieAnimationView.setFrameContext(this.b.q());
                    liveLottieAnimationView.playAnimation();
                }
            } catch (Exception e2) {
                hha.b("HotAtmosphere", e2.getMessage());
            }
            if (z) {
                i();
            }
        }
    }
}
