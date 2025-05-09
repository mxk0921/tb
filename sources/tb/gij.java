package tb;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gij implements ayc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TranslateAnimation f20023a;
    public AlphaAnimation b;
    public TranslateAnimation c;
    public AlphaAnimation d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byc f20024a;

        public a(byc bycVar) {
            this.f20024a = bycVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            byc bycVar = this.f20024a;
            if (bycVar != null) {
                bycVar.b();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byc f20025a;

        public b(byc bycVar) {
            this.f20025a = bycVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            byc bycVar = this.f20025a;
            if (bycVar != null) {
                bycVar.b();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(81789305);
        t2o.a(81789293);
    }

    @Override // tb.ayc
    public void a(View view, byc bycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83edbe87", new Object[]{this, view, bycVar});
            return;
        }
        c(new a(bycVar));
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f20023a);
        animationSet.addAnimation(this.b);
        view.startAnimation(animationSet);
    }

    @Override // tb.ayc
    public void b(View view, byc bycVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6adeed1a", new Object[]{this, view, bycVar});
        } else if (this.f20023a != null) {
            d(new b(bycVar));
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(this.c);
            animationSet.addAnimation(this.d);
            view.startAnimation(animationSet);
        } else if (bycVar != null) {
            bycVar.b();
        }
    }

    public final void c(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5738a4ae", new Object[]{this, animationListener});
            return;
        }
        if (this.f20023a == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            this.f20023a = translateAnimation;
            translateAnimation.setDuration(300L);
            this.f20023a.setFillAfter(true);
        }
        this.f20023a.setAnimationListener(animationListener);
        if (this.b == null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
            this.b = alphaAnimation;
            alphaAnimation.setDuration(300L);
            this.b.setFillAfter(true);
        }
    }

    public final void d(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca02c1a1", new Object[]{this, animationListener});
            return;
        }
        if (this.c == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            this.c = translateAnimation;
            translateAnimation.setDuration(300L);
            this.c.setFillAfter(true);
        }
        this.c.setAnimationListener(animationListener);
        if (this.d == null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.2f);
            this.d = alphaAnimation;
            alphaAnimation.setDuration(300L);
            this.d.setFillAfter(true);
        }
    }
}
