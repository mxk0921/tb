package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.AddBagModel;
import com.taobao.android.opencart.view.FrameLayoutWrapper;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.features.ImageLoadFeature;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ce0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f17000a;
    public final FrameLayoutWrapper b;
    public final ViewGroup c;
    public PointF d;
    public PointF e;
    public PointF f;
    public long g;
    public AnimatorSet h;
    public final Handler i = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements FrameLayoutWrapper.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("795a635a", new Object[]{this, view});
            } else if (ce0.a(ce0.this) != null) {
                ce0.a(ce0.this).cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PathMeasure f17002a;
        public final /* synthetic */ float[] b;
        public final /* synthetic */ LinearLayout c;

        public b(PathMeasure pathMeasure, float[] fArr, LinearLayout linearLayout) {
            this.f17002a = pathMeasure;
            this.b = fArr;
            this.c = linearLayout;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            this.f17002a.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, null);
            this.c.setX(this.b[0]);
            this.c.setY(this.b[1]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f17003a;

        public c(h hVar) {
            this.f17003a = hVar;
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
            ce0.b(ce0.this, this.f17003a);
            ce0.this.f();
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f17004a;

        public d(h hVar) {
            this.f17004a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ce0.c(ce0.this, this.f17004a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f17005a;

        public e(h hVar) {
            this.f17005a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f17005a.onAnimationEnd();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f17006a;

        public f(ce0 ce0Var, TUrlImageView tUrlImageView) {
            this.f17006a = tUrlImageView;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            this.f17006a.setAlpha(1.0f);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f17007a;

        public g(TUrlImageView tUrlImageView) {
            this.f17007a = tUrlImageView;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ce0.d(ce0.this, this.f17007a);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface h {
        boolean a();

        void onAnimationEnd();
    }

    public ce0(Activity activity) {
        this.f17000a = activity;
        this.c = (ViewGroup) activity.getWindow().getDecorView();
        FrameLayoutWrapper frameLayoutWrapper = new FrameLayoutWrapper(activity);
        this.b = frameLayoutWrapper;
        frameLayoutWrapper.setDetachListener(new a());
        frameLayoutWrapper.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public static /* synthetic */ AnimatorSet a(ce0 ce0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("4355e20b", new Object[]{ce0Var});
        }
        return ce0Var.h;
    }

    public static /* synthetic */ void b(ce0 ce0Var, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b16b549a", new Object[]{ce0Var, hVar});
        } else {
            ce0Var.i(hVar);
        }
    }

    public static /* synthetic */ void c(ce0 ce0Var, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc54b1b", new Object[]{ce0Var, hVar});
        } else {
            ce0Var.j(hVar);
        }
    }

    public static /* synthetic */ void d(ce0 ce0Var, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eda324d", new Object[]{ce0Var, tUrlImageView});
        } else {
            ce0Var.k(tUrlImageView);
        }
    }

    public boolean e(AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c62f1a10", new Object[]{this, addBagModel})).booleanValue();
        }
        if (addBagModel.getStartRect() == null || addBagModel.getEndRect() == null || addBagModel.getStartRect().g() == 0.0f || addBagModel.getStartRect().f() == 0.0f || addBagModel.getEndRect().g() == 0.0f || addBagModel.getEndRect().f() == 0.0f) {
            return true;
        }
        return false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (this.b.getParent() != null) {
            ((ViewGroup) this.b.getParent()).removeView(this.b);
        }
    }

    public long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return 550L;
    }

    public final TUrlImageView h(AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("d65c745c", new Object[]{this, addBagModel});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(this.f17000a);
        tUrlImageView.setImageUrl(addBagModel.getPic());
        if (TextUtils.isEmpty(addBagModel.getPic())) {
            tUrlImageView.setBackgroundResource(R.drawable.animation_pic_error);
            k(tUrlImageView);
            return tUrlImageView;
        }
        tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ImageLoadFeature imageLoadFeature = tUrlImageView.getmImageLoad();
        if (imageLoadFeature != null) {
            tUrlImageView.setAlpha(0.0f);
            imageLoadFeature.succListener(new f(this, tUrlImageView));
            imageLoadFeature.failListener(new g(tUrlImageView));
        }
        tUrlImageView.setErrorImageResId(R.drawable.animation_pic_error);
        return tUrlImageView;
    }

    public final void i(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("358cda9d", new Object[]{this, hVar});
        } else if (hVar != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.g;
            if (currentTimeMillis < 275) {
                this.i.postDelayed(new d(hVar), 550 - currentTimeMillis);
            } else {
                j(hVar);
            }
        }
    }

    public final void j(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89eee29", new Object[]{this, hVar});
        } else if (hVar != null) {
            boolean a2 = hVar.a();
            shv.c("AddBagAnimation", "isWeexLoadSuccess=" + a2);
            if (a2) {
                hVar.onAnimationEnd();
                return;
            }
            int a3 = (int) (t8l.a() * 1000.0f);
            shv.c("AddBagAnimation", "loadWeexError and waitTime=" + a3);
            if (a3 == 0) {
                hVar.onAnimationEnd();
            } else {
                this.i.postDelayed(new e(hVar), a3);
            }
        }
    }

    public final void k(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7caa405c", new Object[]{this, tUrlImageView});
            return;
        }
        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
        int a2 = zwo.a(15.5f);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(a2, a2);
        } else {
            layoutParams.width = a2;
            layoutParams.height = a2;
        }
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setAlpha(1.0f);
    }

    public void l(AddBagModel addBagModel, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2c0f160", new Object[]{this, addBagModel, hVar});
        } else if (!e(addBagModel)) {
            AddBagModel.c e2 = addBagModel.getStartRect().e();
            AddBagModel.c e3 = addBagModel.getEndRect().e();
            shv.c("AddBagAnimation", "startRect=" + e2);
            shv.c("AddBagAnimation", "endRect=" + e3);
            e2.m((float) zwo.a(e2.h()));
            e2.n((float) zwo.a(e2.i()));
            e2.l(zwo.a(e2.g()));
            e2.k(zwo.a(e2.f()));
            e3.m(zwo.a(e3.h()));
            e3.n(zwo.a(e3.i()));
            e3.l(zwo.a(e3.g()));
            e3.k(zwo.a(e3.f()));
            this.b.removeAllViews();
            this.c.removeView(this.b);
            TUrlImageView h2 = h(addBagModel);
            this.d = new PointF(e2.h(), e2.i());
            this.e = new PointF(e3.h() - ((e2.g() / 2.0f) - (e3.g() / 2.0f)), e3.i() - ((e2.f() / 2.0f) - (e3.f() / 2.0f)));
            this.f = new PointF(e2.h() + (e2.g() / 2.0f), e3.i() + (e3.f() / 2.0f));
            LinearLayout linearLayout = new LinearLayout(this.f17000a);
            linearLayout.setGravity(17);
            linearLayout.setX(this.d.x);
            linearLayout.setY(this.d.y);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams((int) e2.g(), (int) e2.f()));
            linearLayout.addView(h2);
            Path path = new Path();
            PointF pointF = this.d;
            path.moveTo(pointF.x, pointF.y);
            PointF pointF2 = this.f;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            PointF pointF3 = this.e;
            path.quadTo(f2, f3, pointF3.x, pointF3.y);
            PathMeasure pathMeasure = new PathMeasure();
            pathMeasure.setPath(path, false);
            linearLayout.setPivotX(e2.h() / 2.0f);
            linearLayout.setPivotY(e2.i() / 2.0f);
            this.h = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, "alpha", 1.0f, 0.5f);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(400L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, "alpha", 0.5f, 0.0f);
            ofFloat2.setDuration(50L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h2, "scaleX", 1.0f, 0.3f);
            ofFloat3.setDuration(400L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(h2, "scaleY", 1.0f, 0.3f);
            ofFloat4.setDuration(400L);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
            ofFloat5.setInterpolator(new LinearInterpolator());
            ofFloat5.setDuration(400L);
            ofFloat5.addUpdateListener(new b(pathMeasure, new float[2], linearLayout));
            this.g = System.currentTimeMillis();
            ofFloat5.addListener(new c(hVar));
            this.h.playSequentially(ofFloat, ofFloat2);
            this.h.playTogether(ofFloat3, ofFloat4, ofFloat5);
            this.h.setStartDelay(150L);
            this.h.start();
            this.b.addView(linearLayout);
            this.c.addView(this.b);
        }
    }
}
