package com.alibaba.ability.impl.audio.floatwindow;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.megadesign.anim.lottie.MALottieView;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.t2o;
import tb.wkh;
import tb.xhv;
import tb.ywo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AudioCollapse extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float CONTAINER_HEIGHT = 36.0f;
    public static final float CONTAINER_WIDTH = 36.0f;
    private static final a Companion = new a(null);
    public static final float EDGE_LIMIT_MARGIN = 0.0f;
    public static final float MOVE_TRANSLATION_Y_LIMIT = 25.0f;
    public static final float STROKE_WIDTH = 2.0f;
    private int bottomLimit;
    private float[] centerRadii;
    private DisplayMetrics displayMetrics;
    private long downDelay;
    private float downX;
    private float downY;
    private GradientDrawable drawable;
    private final d1a<xhv> expand;
    private float interceptDownX;
    private float interceptDownY;
    private volatile boolean isMoving;
    private int leftLimit;
    private float[] leftRadii;
    private MALottieView lottieVIew;
    private final int moveSlop;
    private int rightLimit;
    private float[] rightRadii;
    private int topLimit;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(98566189);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$BooleanRef b;

        public b(Ref$BooleanRef ref$BooleanRef) {
            this.b = ref$BooleanRef;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.g(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            AudioCollapse audioCollapse = AudioCollapse.this;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                audioCollapse.setTranslationX(((Float) animatedValue).floatValue());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$BooleanRef b;

        public c(Ref$BooleanRef ref$BooleanRef) {
            this.b = ref$BooleanRef;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            if (this.b.element) {
                GradientDrawable access$getDrawable$p = AudioCollapse.access$getDrawable$p(AudioCollapse.this);
                ckf.d(access$getDrawable$p);
                access$getDrawable$p.setCornerRadii(AudioCollapse.access$getRightRadii$p(AudioCollapse.this));
                return;
            }
            GradientDrawable access$getDrawable$p2 = AudioCollapse.access$getDrawable$p(AudioCollapse.this);
            ckf.d(access$getDrawable$p2);
            access$getDrawable$p2.setCornerRadii(AudioCollapse.access$getLeftRadii$p(AudioCollapse.this));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }
    }

    static {
        t2o.a(98566188);
    }

    public AudioCollapse(Context context, d1a<xhv> d1aVar) {
        this(context, d1aVar, null, 0, 12, null);
    }

    public static final /* synthetic */ GradientDrawable access$getDrawable$p(AudioCollapse audioCollapse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("1a176b52", new Object[]{audioCollapse});
        }
        return audioCollapse.drawable;
    }

    public static final /* synthetic */ float[] access$getLeftRadii$p(AudioCollapse audioCollapse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("d03b565", new Object[]{audioCollapse});
        }
        return audioCollapse.leftRadii;
    }

    public static final /* synthetic */ float[] access$getRightRadii$p(AudioCollapse audioCollapse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("d96e710e", new Object[]{audioCollapse});
        }
        return audioCollapse.rightRadii;
    }

    public static final /* synthetic */ void access$setDrawable$p(AudioCollapse audioCollapse, GradientDrawable gradientDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70907f8", new Object[]{audioCollapse, gradientDrawable});
        } else {
            audioCollapse.drawable = gradientDrawable;
        }
    }

    public static final /* synthetic */ void access$setLeftRadii$p(AudioCollapse audioCollapse, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf99333b", new Object[]{audioCollapse, fArr});
        } else {
            audioCollapse.leftRadii = fArr;
        }
    }

    public static final /* synthetic */ void access$setRightRadii$p(AudioCollapse audioCollapse, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa60b44a", new Object[]{audioCollapse, fArr});
        } else {
            audioCollapse.rightRadii = fArr;
        }
    }

    private final void initLayout() {
        Context context;
        Resources resources;
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adf07e1", new Object[]{this});
            return;
        }
        if (getLayoutParams() == null) {
            Context context3 = getContext();
            ckf.f(context3, "context");
            int a2 = ywo.a(context3, 36.0f);
            Context context4 = getContext();
            ckf.f(context4, "context");
            setLayoutParams(new FrameLayout.LayoutParams(a2, ywo.a(context4, 36.0f)));
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.gravity = GravityCompat.END;
        }
        ckf.f(getContext(), "context");
        setTranslationX(-ywo.a(context, 0.0f));
        Context context5 = getContext();
        ckf.f(context5, "context");
        ckf.f(context5.getResources(), "context.resources");
        ckf.f(getContext(), "context");
        setTranslationY((resources.getDisplayMetrics().heightPixels / 2.0f) - ywo.a(context2, 18.0f));
        float f = getLayoutParams().height / 2;
        this.rightRadii = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        this.centerRadii = new float[]{f, f, f, f, f, f, f, f};
        this.leftRadii = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        setBackground();
        Context context6 = getContext();
        ckf.f(context6, "context");
        int a3 = ywo.a(context6, 6.0f);
        MALottieView mALottieView = new MALottieView(getContext());
        this.lottieVIew = mALottieView;
        mALottieView.setPadding(a3, a3, a3, a3);
        mALottieView.setUpWithConfig(wkh.Builder.e("https://gw.alipayobjects.com/os/finxbff/lolita/9d55c508-d926-419e-a73a-e6669bb1d0a0/lottie.json").d(-1).b());
        addView(mALottieView, new FrameLayout.LayoutParams(-1, -1));
    }

    public static /* synthetic */ Object ipc$super(AudioCollapse audioCollapse, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/floatwindow/AudioCollapse");
    }

    private final void setBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91c7b7", new Object[]{this});
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(this.rightRadii);
        Context context = getContext();
        ckf.f(context, "context");
        gradientDrawable.setStroke(ywo.a(context, 2.0f), Color.parseColor("#0DFFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#FF363636"));
        setBackground(gradientDrawable);
        this.drawable = gradientDrawable;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer num;
        boolean z;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.isMoving = false;
            this.interceptDownY = motionEvent.getRawY();
            this.interceptDownX = motionEvent.getRawX();
        } else if (num != null && num.intValue() == 2) {
            this.downY = motionEvent.getRawY();
            this.downX = motionEvent.getRawX();
            this.downDelay = System.currentTimeMillis();
            if (Math.abs(motionEvent.getRawY() - this.interceptDownY) > this.moveSlop) {
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(motionEvent.getRawX() - this.interceptDownX) <= this.moveSlop) {
                z2 = false;
            }
            boolean z3 = z | z2;
            this.isMoving = z3;
            return z3;
        } else if (num != null && num.intValue() == 1) {
            if (!this.isMoving) {
                this.expand.invoke();
            }
            this.isMoving = false;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        boolean z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 2) {
            float rawY = motionEvent.getRawY() - this.downY;
            float rawX = motionEvent.getRawX() - this.downX;
            float translationY = getTranslationY() + rawY;
            if (translationY >= this.topLimit && translationY <= this.bottomLimit) {
                setTranslationY(translationY);
            }
            float translationX = getTranslationX() + rawX;
            if (translationX >= this.leftLimit && translationX <= this.rightLimit) {
                setTranslationX(translationX);
            }
            this.downY = motionEvent.getRawY();
            this.downX = motionEvent.getRawX();
            GradientDrawable gradientDrawable = this.drawable;
            ckf.d(gradientDrawable);
            gradientDrawable.setCornerRadii(this.centerRadii);
        } else if (num != null && num.intValue() == 1) {
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            float f = this.downX;
            Context context = getContext();
            ckf.f(context, "context");
            Resources resources = context.getResources();
            ckf.f(resources, "context.resources");
            if (f >= resources.getDisplayMetrics().widthPixels / 2) {
                z = true;
            } else {
                z = false;
            }
            ref$BooleanRef.element = z;
            if (z) {
                i = this.rightLimit;
            } else {
                i = this.leftLimit;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(getTranslationX(), i);
            ofFloat.addUpdateListener(new b(ref$BooleanRef));
            ofFloat.addListener(new c(ref$BooleanRef));
            ofFloat.setDuration(150L);
            ofFloat.start();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        MALottieView mALottieView = this.lottieVIew;
        if (mALottieView != null) {
            mALottieView.pauseAnimation();
        }
    }

    public final void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        MALottieView mALottieView = this.lottieVIew;
        if (mALottieView != null) {
            mALottieView.playAnimation();
        }
    }

    public AudioCollapse(Context context, d1a<xhv> d1aVar, AttributeSet attributeSet) {
        this(context, d1aVar, attributeSet, 0, 8, null);
    }

    public /* synthetic */ AudioCollapse(Context context, d1a d1aVar, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, d1aVar, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCollapse(Context context, d1a<xhv> d1aVar, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.g(context, "context");
        ckf.g(d1aVar, "expand");
        this.expand = d1aVar;
        this.moveSlop = ywo.a(context, 2.0f);
        this.topLimit = ywo.a(context, 25.0f);
        this.rightLimit = -ywo.a(context, 0.0f);
        DisplayMetrics b2 = ywo.b(context);
        this.displayMetrics = b2;
        this.bottomLimit = b2.heightPixels - ywo.a(context, 61.0f);
        this.leftLimit = ywo.a(context, 36.0f) - this.displayMetrics.widthPixels;
        initLayout();
    }
}
