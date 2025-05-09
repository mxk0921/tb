package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.perf.uikit.LiveLottieAnimationView;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.ArrayList;
import java.util.List;
import tb.xvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hoo implements xvg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SabAtmosphereAnimation";

    /* renamed from: a  reason: collision with root package name */
    public ObjectAnimator f20782a;
    public ObjectAnimator b;
    public final LiveLottieAnimationView c;
    public final LiveLottieAnimationView d;
    public int f;
    public boolean g;
    public final Handler h;
    public boolean i;
    public final View j;
    public final ViewGroup k;
    public final Context l;
    public LiveItem.SabItemAtmosphere m;
    public int e = 2;
    public final List<xvg.a> n = new ArrayList();
    public final Runnable o = new a();

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
            } else if (hoo.a(hoo.this)) {
                hoo.this.w();
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
            hoo hooVar = hoo.this;
            hoo.h(hooVar, hoo.g(hooVar));
            hoo hooVar2 = hoo.this;
            hoo.h(hooVar2, hoo.i(hooVar2));
            if (hoo.j(hoo.this) != null) {
                hoo.j(hoo.this).postDelayed(hoo.k(hoo.this), 10000L);
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
                return;
            }
            hoo.c(hoo.this).setVisibility(0);
            hoo.b(hoo.this, true);
            sjr.g().e("com.taobao.taolive.room.sab_atmosphere_show", Integer.valueOf(hoo.e(hoo.this)));
            for (int i = 0; i < hoo.f(hoo.this).size(); i++) {
                if (hoo.f(hoo.this).get(i) != null) {
                    ((xvg.a) hoo.f(hoo.this).get(i)).b(hoo.this);
                }
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
                return;
            }
            for (int i = 0; i < hoo.f(hoo.this).size(); i++) {
                if (hoo.f(hoo.this).get(i) != null) {
                    ((xvg.a) hoo.f(hoo.this).get(i)).a(hoo.this);
                }
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
            } else {
                sjr.g().d("com.taobao.taolive.room.sab_atmosphere_dismiss");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements plh<Throwable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f750ea72", new Object[]{this, th});
                return;
            }
            hoo.l(hoo.this, 2);
            cwd A = v2s.o().A();
            A.c(hoo.TAG, "loadLottieAnimation#onResult fail, msg=" + th.getMessage());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements plh<kkh> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveLottieAnimationView f20787a;
        public final /* synthetic */ boolean b;

        public e(LiveLottieAnimationView liveLottieAnimationView, boolean z) {
            this.f20787a = liveLottieAnimationView;
            this.b = z;
        }

        /* renamed from: a */
        public void onResult(kkh kkhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1419bbae", new Object[]{this, kkhVar});
            } else if (kkhVar == null) {
                v2s.o().A().c(hoo.TAG, "loadLottieAnimation#onResult success, lottieComposition is null");
            } else {
                this.f20787a.setComposition(kkhVar);
                if (this.b) {
                    hoo.d(hoo.this);
                } else {
                    hoo.h(hoo.this, this.f20787a);
                }
            }
        }
    }

    static {
        t2o.a(295699086);
        t2o.a(806355070);
    }

    public hoo(Context context, View view, ViewGroup viewGroup, ux9 ux9Var) {
        this.l = context;
        this.j = view;
        this.k = viewGroup;
        LiveLottieAnimationView liveLottieAnimationView = (LiveLottieAnimationView) view.findViewById(R.id.bg);
        this.d = liveLottieAnimationView;
        LiveLottieAnimationView liveLottieAnimationView2 = (LiveLottieAnimationView) view.findViewById(R.id.postmark);
        this.c = liveLottieAnimationView2;
        if (liveLottieAnimationView2 != null) {
            liveLottieAnimationView2.setDirectExecution(true);
            liveLottieAnimationView2.setFrameContext(ux9Var);
            liveLottieAnimationView2.setShouldUseEnvironmentAwareness(vwl.e().b());
        }
        if (liveLottieAnimationView != null) {
            liveLottieAnimationView.setDirectExecution(true);
            liveLottieAnimationView.setFrameContext(ux9Var);
            liveLottieAnimationView.setShouldUseEnvironmentAwareness(vwl.e().b());
        }
        n();
        this.h = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ boolean a(hoo hooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edb35d40", new Object[]{hooVar})).booleanValue();
        }
        return hooVar.g;
    }

    public static /* synthetic */ boolean b(hoo hooVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7061bda", new Object[]{hooVar, new Boolean(z)})).booleanValue();
        }
        hooVar.g = z;
        return z;
    }

    public static /* synthetic */ View c(hoo hooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("97cb3cbf", new Object[]{hooVar});
        }
        return hooVar.j;
    }

    public static /* synthetic */ void d(hoo hooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658cb52b", new Object[]{hooVar});
        } else {
            hooVar.m();
        }
    }

    public static /* synthetic */ int e(hoo hooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b90a1631", new Object[]{hooVar})).intValue();
        }
        return hooVar.f;
    }

    public static /* synthetic */ List f(hoo hooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1d2a9a8", new Object[]{hooVar});
        }
        return hooVar.n;
    }

    public static /* synthetic */ LiveLottieAnimationView g(hoo hooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveLottieAnimationView) ipChange.ipc$dispatch("e11523f2", new Object[]{hooVar});
        }
        return hooVar.c;
    }

    public static /* synthetic */ void h(hoo hooVar, LottieAnimationView lottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c94c91", new Object[]{hooVar, lottieAnimationView});
        } else {
            hooVar.r(lottieAnimationView);
        }
    }

    public static /* synthetic */ LiveLottieAnimationView i(hoo hooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveLottieAnimationView) ipChange.ipc$dispatch("542fc774", new Object[]{hooVar});
        }
        return hooVar.d;
    }

    public static /* synthetic */ Handler j(hoo hooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("53649523", new Object[]{hooVar});
        }
        return hooVar.h;
    }

    public static /* synthetic */ Runnable k(hoo hooVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("46ffb5d0", new Object[]{hooVar});
        }
        return hooVar.o;
    }

    public static /* synthetic */ int l(hoo hooVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14c7ac8f", new Object[]{hooVar, new Integer(i)})).intValue();
        }
        hooVar.e = i;
        return i;
    }

    @Override // tb.xvg
    public void addAnimationListener(xvg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f42599", new Object[]{this, aVar});
        } else {
            ((ArrayList) this.n).add(aVar);
        }
    }

    @Override // tb.xvg
    public String getAnimationGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e86a3148", new Object[]{this});
        }
        return xr9.NO_GROUP;
    }

    @Override // tb.xvg
    public String getAnimationName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43b88020", new Object[]{this});
        }
        return "AnimationLifeCycle/SabAtmosphere";
    }

    @Override // tb.xvg
    public boolean isDirectExecution() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e29500b0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xvg
    public boolean isQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de7cef12", new Object[]{this})).booleanValue();
        }
        return vwl.e().c();
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea0be58", new Object[]{this});
            return;
        }
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            v();
            this.e = 2;
        }
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void p(LiveItem.SabItemAtmosphere sabItemAtmosphere) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c2c1ad", new Object[]{this, sabItemAtmosphere});
        } else {
            this.m = sabItemAtmosphere;
        }
    }

    public final void q(LiveLottieAnimationView liveLottieAnimationView, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c31b5ac", new Object[]{this, liveLottieAnimationView, str, new Integer(i), new Boolean(z)});
            return;
        }
        liveLottieAnimationView.setRepeatCount(i);
        liveLottieAnimationView.setDirectExecution(true);
        try {
            dmh<kkh> x = ukh.x(this.l, str);
            x.d(new e(liveLottieAnimationView, z));
            x.c(new d());
        } catch (Throwable unused) {
            v2s.o().A().c(TAG, "loadLottieAnimation error");
        }
    }

    public final void r(LottieAnimationView lottieAnimationView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1e9b9a", new Object[]{this, lottieAnimationView});
        } else if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.playAnimation();
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454fdc78", new Object[]{this, str});
            return;
        }
        q(this.c, str, 0, false);
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacks(this.o);
            this.h.postDelayed(this.o, 5000L);
        }
    }

    @Override // tb.xvg
    public void start() {
        LiveLottieAnimationView liveLottieAnimationView;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        LiveItem.SabItemAtmosphere sabItemAtmosphere = this.m;
        if (!(sabItemAtmosphere == null || (liveLottieAnimationView = this.d) == null || this.c == null || (str = sabItemAtmosphere.atmosphereBgImg) == null || sabItemAtmosphere.posterMark == null)) {
            q(liveLottieAnimationView, str, -1, true);
            q(this.c, this.m.posterMark, 0, true);
        }
        if (!this.i) {
            h4s.a(getAnimationName(), hashCode());
            this.i = true;
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacks(this.o);
        }
        LiveLottieAnimationView liveLottieAnimationView = this.d;
        if (liveLottieAnimationView != null) {
            liveLottieAnimationView.cancelAnimation();
        }
        LiveLottieAnimationView liveLottieAnimationView2 = this.c;
        if (liveLottieAnimationView2 != null) {
            liveLottieAnimationView2.cancelAnimation();
        }
        ObjectAnimator objectAnimator = this.f20782a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.b;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.g = false;
        this.e = 2;
        if (this.i) {
            this.i = false;
            h4s.d(getAnimationName(), hashCode());
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1da73b", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            float width = viewGroup.getWidth() / 750.0f;
            this.f = (int) (450.0f * width);
            bhw.a(this.d, this.k.getWidth(), this.f);
            bhw.c(this.c, (int) (210.0f * width), (int) (260.0f * width), 0, 0, 0, (int) (width * 58.0f));
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6b160e", new Object[]{this});
            return;
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.b.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f20782a;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacks(this.o);
        }
        ObjectAnimator objectAnimator = this.f20782a;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f20782a.cancel();
        }
        ObjectAnimator objectAnimator2 = this.b;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327f851e", new Object[]{this});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.j, "translationY", this.k.getMeasuredWidth(), 0.0f);
        this.f20782a = ofFloat;
        ofFloat.setDuration(250L);
        this.f20782a.addListener(new b());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.j, "translationY", 0.0f, this.k.getMeasuredWidth());
        this.b = ofFloat2;
        ofFloat2.setDuration(250L);
        this.b.addListener(new c());
    }
}
