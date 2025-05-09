package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Message;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lmk implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23416a;
    public final View b;
    public final LottieAnimationView c;
    public AnimatorSet d;
    public AnimatorSet e;
    public final jyw f;
    public dmh<kkh> g;

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
                return;
            }
            AnimatorSet animatorSet = lmk.this.e;
            if (animatorSet != null) {
                animatorSet.start();
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
                    lmk.this.e();
                }
            }
        }

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
            lmk.a(lmk.this);
            jyw jywVar = lmk.this.f;
            if (jywVar != null) {
                jywVar.postDelayed(new a(), 10000L);
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
    public class c implements plh<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
                return;
            }
            cwd A = v2s.o().A();
            A.c("OfficialEnhanceAnimatorManager", "loadLottieAnimation#onResult fail, msg=" + th.getMessage());
            dmh<kkh> dmhVar = lmk.this.g;
            if (dmhVar != null) {
                dmhVar.i(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements plh<kkh> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public void onResult(kkh kkhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1419bbae", new Object[]{this, kkhVar});
            } else if (kkhVar == null) {
                v2s.o().A().c("OfficialEnhanceAnimatorManager", "loadLottieAnimation#onResult success, lottieComposition is null");
            } else {
                LottieAnimationView lottieAnimationView = lmk.this.c;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setComposition(kkhVar);
                }
                dmh<kkh> dmhVar = lmk.this.g;
                if (dmhVar != null) {
                    dmhVar.j(this);
                }
            }
        }
    }

    static {
        t2o.a(295700007);
        t2o.a(806356161);
    }

    public lmk(View view) {
        this.b = view;
        this.f = new jyw(this);
        b();
    }

    public static /* synthetic */ void a(lmk lmkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff05d22", new Object[]{lmkVar});
        } else {
            lmkVar.d();
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d230", new Object[]{this, str});
            return;
        }
        Context context = this.f23416a;
        if (context != null && str != null) {
            try {
                dmh<kkh> x = ukh.x(context, str);
                this.g = x;
                x.d(new d());
                x.c(new c());
            } catch (Throwable unused) {
                v2s.o().A().c("OfficialEnhanceAnimatorManager", "loadLottieAnimation error");
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2495e0d8", new Object[]{this});
            return;
        }
        LottieAnimationView lottieAnimationView = this.c;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
            this.c.setVisibility(0);
            this.c.playAnimation();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ba7970", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97117bd2", new Object[]{this});
            return;
        }
        View view = this.b;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotationY", 0.0f, 90.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b, "rotationY", 270.0f, 360.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            this.d = animatorSet;
            animatorSet.setDuration(500L);
            this.d.playSequentially(ofFloat, ofFloat2);
            this.d.addListener(new a());
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.b, "rotationY", 0.0f, 22.5f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.b, "rotationY", 22.5f, 0.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.e = animatorSet2;
            animatorSet2.setDuration(500L);
            this.e.playSequentially(ofFloat3, ofFloat4);
            this.e.addListener(new b());
        }
    }

    public lmk(Context context, View view, LottieAnimationView lottieAnimationView) {
        this(view);
        this.f23416a = context;
        this.c = lottieAnimationView;
    }
}
