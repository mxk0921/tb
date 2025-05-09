package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.view.FilletLinearLayout;
import com.taobao.taobao.R;
import tb.psg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oy0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DEFAULT_ALPHA_ANIMATION_DURATION = 100;
    public static final long DEFAULT_ANIMATION_DURATION = 500;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f25737a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            jgh.a("AnimationManager", "AnimatorListener:onAnimationCancel");
            oy0.a(oy0.this).c().a();
            oy0.a(oy0.this).c().e(2001);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            jgh.a("AnimationManager", "AnimatorListener:onAnimationEnd");
            oy0.a(oy0.this).c().a();
            oy0.a(oy0.this).c().e(2001);
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
            jgh.a("AnimationManager", "AnimatorListener:onAnimationStart");
            oy0.a(oy0.this).c().b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f25739a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ psg.a f;
        public final /* synthetic */ float g;
        public final /* synthetic */ float h;

        public b(View view, int i, int i2, int i3, int i4, psg.a aVar, float f, float f2) {
            this.f25739a = view;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = aVar;
            this.g = f;
            this.h = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int i;
            int i2;
            float f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.f25739a.getLayoutParams();
            float parseFloat = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
            layoutParams.width = this.b + ((int) ((this.c - i) * parseFloat));
            layoutParams.height = this.d + ((int) ((this.e - i2) * parseFloat));
            this.f25739a.setLayoutParams(layoutParams);
            float animatedFraction = valueAnimator.getAnimatedFraction();
            this.f25739a.setX(this.f.c * animatedFraction);
            this.f25739a.setTranslationY(this.f.d * animatedFraction);
            ImageView c = oy0.a(oy0.this).b().c();
            double d = parseFloat;
            if (d < 0.5d && c != null && (c.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) c.getLayoutParams();
                layoutParams2.setMargins(0, 0, 0, (int) ((d - 0.5d) * 2.0d * this.g));
                c.setLayoutParams(layoutParams2);
            }
            if (oy0.a(oy0.this).b().b() instanceof FilletLinearLayout) {
                if (this.h > 0.0f) {
                    ((FilletLinearLayout) oy0.a(oy0.this).b().b()).setCornerSize(Math.max((int) (f * (1.0f - parseFloat)), 0));
                }
            }
        }
    }

    static {
        t2o.a(573571142);
    }

    public oy0(nwi nwiVar) {
        this.f25737a = nwiVar;
    }

    public static /* synthetic */ nwi a(oy0 oy0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwi) ipChange.ipc$dispatch("6013d764", new Object[]{oy0Var});
        }
        return oy0Var.f25737a;
    }

    public boolean b() {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c942acf8", new Object[]{this})).booleanValue();
        }
        if (this.f25737a.b() == null || this.f25737a.b().b() == null) {
            jgh.a("AnimationManager", "canShow: bootImageViewWrapper or bootImageContainer is null");
            return false;
        }
        if (this.f25737a.b().b().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f25737a.d().a() == null || !this.f25737a.d().a().animation) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public void d(psg.a aVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1448fca8", new Object[]{this, aVar});
            return;
        }
        this.f25737a.b().d();
        ViewGroup b2 = this.f25737a.b().b();
        View a2 = this.f25737a.b().a();
        BitmapDrawable a3 = ocw.a(b2);
        if (a3 != null) {
            ImageView imageView = new ImageView(b2.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(a3);
            try {
                i = b2.indexOfChild(b2.findViewById(R.id.rv_title)) + 1;
            } catch (Exception e) {
                jgh.b("AnimationManager", "captureVideo and add: indexOfChild error", e);
                i = -1;
            }
            b2.addView(imageView, i, new ViewGroup.LayoutParams(-1, -1));
        }
        c(b2, a2, aVar, this.f25737a.d().a(), new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
        if (r14 >= r12) goto L_0x0057;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.view.View r24, android.view.View r25, tb.psg.a r26, com.taobao.mmad.data.BaseMmAdModel r27, android.animation.Animator.AnimatorListener r28) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oy0.c(android.view.View, android.view.View, tb.psg$a, com.taobao.mmad.data.BaseMmAdModel, android.animation.Animator$AnimatorListener):void");
    }
}
