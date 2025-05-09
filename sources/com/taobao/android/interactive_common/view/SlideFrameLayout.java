package com.taobao.android.interactive_common.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import tb.ain;
import tb.y3q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SlideFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DRAG_MODE = 0;
    public static final int EXIT_ANIMATE_LENGTH = 50;
    public static final int IDLE = 2;
    public static final int MAX_FINISH_Y = ain.b(100.0f);
    public static final int MIN_MOVE_DISTANCE = 20;
    public static final int RESTORE_ANIMATE_LENGTH = 300;
    public static final int SLIDER_MODE = 1;
    private static final String TAG = "SlideFrameLayout";
    private float iDownX;
    private float iDownY;
    private boolean mIsScaleEnabled;
    private boolean mIsUpSlideEnabled;
    private y3q mSlideHandler;
    private float mTouchSlop;
    private int restoreAnimationLength = 300;
    private int exitAnimationLength = 50;
    private int finishMoveY = (ain.c() * 2) / 3;
    private boolean mDraggable = false;
    private int mSlideMode = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f8119a;
        public final /* synthetic */ float b;

        public a(float f, float f2) {
            this.f8119a = f;
            this.b = f2;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAnimationUpdate(android.animation.ValueAnimator r5) {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0015
                java.lang.String r1 = "8ffc03bf"
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r4
                r3 = 1
                r2[r3] = r5
                r0.ipc$dispatch(r1, r2)
                return
            L_0x0015:
                java.lang.Object r5 = r5.getAnimatedValue()
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                float r0 = r4.f8119a
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 == 0) goto L_0x0031
                float r2 = r4.b
                int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r3 <= 0) goto L_0x0031
                float r2 = r5 / r2
                float r2 = r2 * r0
                goto L_0x0032
            L_0x0031:
                r2 = 0
            L_0x0032:
                com.taobao.android.interactive_common.view.SlideFrameLayout r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                boolean r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.access$000(r0)
                if (r0 != 0) goto L_0x003f
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x003f
                r5 = 0
            L_0x003f:
                com.taobao.android.interactive_common.view.SlideFrameLayout r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                boolean r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.access$100(r0)
                if (r0 != 0) goto L_0x0048
                goto L_0x0049
            L_0x0048:
                r1 = r2
            L_0x0049:
                com.taobao.android.interactive_common.view.SlideFrameLayout r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                r0.setTranslationX(r1)
                com.taobao.android.interactive_common.view.SlideFrameLayout r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                r0.setTranslationY(r5)
                com.taobao.android.interactive_common.view.SlideFrameLayout r0 = com.taobao.android.interactive_common.view.SlideFrameLayout.this
                com.taobao.android.interactive_common.view.SlideFrameLayout.access$200(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.interactive_common.view.SlideFrameLayout.a.onAnimationUpdate(android.animation.ValueAnimator):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else {
                SlideFrameLayout.this.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f8121a;
        public final /* synthetic */ float b;

        public c(float f, float f2) {
            this.f8121a = f;
            this.b = f2;
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
            } else if (SlideFrameLayout.access$300(SlideFrameLayout.this) != null) {
                SlideFrameLayout.access$300(SlideFrameLayout.this).b(this.f8121a, this.b, SlideFrameLayout.access$400(SlideFrameLayout.this));
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

    public SlideFrameLayout(Context context) {
        super(context);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setScaleEnabled(true);
        setUpSlideEnabled(true);
    }

    public static /* synthetic */ boolean access$000(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("343d80f2", new Object[]{slideFrameLayout})).booleanValue();
        }
        return slideFrameLayout.mIsUpSlideEnabled;
    }

    public static /* synthetic */ boolean access$100(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0ab7d51", new Object[]{slideFrameLayout})).booleanValue();
        }
        return slideFrameLayout.mIsScaleEnabled;
    }

    public static /* synthetic */ void access$200(SlideFrameLayout slideFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36162394", new Object[]{slideFrameLayout, new Float(f)});
        } else {
            slideFrameLayout.doScale(f);
        }
    }

    public static /* synthetic */ y3q access$300(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y3q) ipChange.ipc$dispatch("e9df7c6d", new Object[]{slideFrameLayout});
        }
        return slideFrameLayout.mSlideHandler;
    }

    public static /* synthetic */ int access$400(SlideFrameLayout slideFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5f5725d", new Object[]{slideFrameLayout})).intValue();
        }
        return slideFrameLayout.exitAnimationLength;
    }

    private void doScale(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773c9ffa", new Object[]{this, new Float(f)});
        } else if (this.mIsScaleEnabled) {
            float f2 = 1.0f;
            float f3 = 1.0f - (f / 1000.0f);
            if (f3 <= 1.0f) {
                f2 = f3;
            }
            if (f2 < 0.7d) {
                f2 = 0.7f;
            }
            setPivotX((getRight() - getLeft()) / 2);
            setPivotY((getTop() + getBottom()) / 2);
            setScaleX(f2);
            setScaleY(f2);
        }
    }

    public static /* synthetic */ Object ipc$super(SlideFrameLayout slideFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/interactive_common/view/SlideFrameLayout");
    }

    public void doFinishTranslation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae8c126", new Object[]{this, new Float(f)});
        }
    }

    public void doPagerDown(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca74f201", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        if (f2 < 0.0f) {
            f = 0.0f;
        }
        setTranslationY(f2);
        if (this.mIsScaleEnabled) {
            setTranslationX(f);
        }
        doScale(f2);
        y3q y3qVar = this.mSlideHandler;
        if (y3qVar != null) {
            y3qVar.c(f2);
        }
    }

    public boolean draggable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e6bf398", new Object[]{this})).booleanValue();
        }
        return this.mDraggable;
    }

    public void finish(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b8091a", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 400.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new b());
        ofFloat.addListener(new c(f, f2));
        ofFloat.setDuration(getExitAnimateLength());
        ofFloat.start();
    }

    public boolean finishActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f622f44d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public int getExitAnimateLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c96a7eed", new Object[]{this})).intValue();
        }
        return this.exitAnimationLength;
    }

    public int getFinishMoveY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d12e0999", new Object[]{this})).intValue();
        }
        return this.finishMoveY;
    }

    public int getRestoreAnimateLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28d832a9", new Object[]{this})).intValue();
        }
        return this.restoreAnimationLength;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float rawY = motionEvent.getRawY() - this.iDownY;
                float rawX = motionEvent.getRawX() - this.iDownX;
                if (WXEnvironment.isApkDebugable()) {
                    if (motionEvent.getAction() == 1) {
                        StringBuilder sb = new StringBuilder("ACTION_UP---->>>mSlideMode=");
                        sb.append(this.mSlideMode);
                        sb.append(", x=");
                        sb.append(rawX);
                        sb.append(", y=");
                        sb.append(rawY);
                        sb.append(", TouchSlop = ");
                        sb.append(this.mTouchSlop);
                    } else if (motionEvent.getAction() == 3) {
                        StringBuilder sb2 = new StringBuilder("ACTION_CANCEL---->>>mSlideMode=");
                        sb2.append(this.mSlideMode);
                        sb2.append(", x=");
                        sb2.append(rawX);
                        sb2.append(", y=");
                        sb2.append(rawY);
                        sb2.append(", TouchSlop = ");
                        sb2.append(this.mTouchSlop);
                    }
                }
                if (rawY > MAX_FINISH_Y && draggable()) {
                    finish(rawX, rawY);
                } else if (Math.abs(rawY) < this.mTouchSlop) {
                    if (WXEnvironment.isApkDebugable()) {
                        StringBuilder sb3 = new StringBuilder("ACTION_UP----click>>>mSlideMode=");
                        sb3.append(this.mSlideMode);
                        sb3.append(", x=");
                        sb3.append(rawX);
                        sb3.append(", y=");
                        sb3.append(rawY);
                        sb3.append(", TouchSlop = ");
                        sb3.append(this.mTouchSlop);
                    }
                    y3q y3qVar = this.mSlideHandler;
                    if (y3qVar != null) {
                        y3qVar.a();
                    }
                } else if (draggable()) {
                    restore(rawX, rawY);
                    return true;
                }
                return false;
            } else if (action == 2) {
                if (this.mSlideMode == 1) {
                    return super.onTouchEvent(motionEvent);
                }
                float rawX2 = motionEvent.getRawX() - this.iDownX;
                float rawY2 = motionEvent.getRawY() - this.iDownY;
                if (!this.mIsScaleEnabled && Math.abs(rawY2) < Math.abs(rawX2)) {
                    this.iDownX = (int) motionEvent.getRawX();
                    this.iDownY = (int) motionEvent.getRawY();
                    return super.onTouchEvent(motionEvent);
                } else if (rawY2 > 0.0f || this.mIsUpSlideEnabled) {
                    if (Math.abs(rawX2) - Math.abs(rawY2) < 20.0f || this.mSlideMode != 2) {
                        if (WXEnvironment.isApkDebugable()) {
                            StringBuilder sb4 = new StringBuilder("ACTION_MOVE---->>>DRAG_MODE : x=");
                            sb4.append(rawX2);
                            sb4.append(", y=");
                            sb4.append(rawY2);
                            sb4.append(", 是否可拖动=");
                            if (this.mTouchSlop > Math.abs(rawY2)) {
                                z = false;
                            }
                            sb4.append(z);
                        }
                        if (this.mTouchSlop <= Math.abs(rawY2) && draggable()) {
                            this.mSlideMode = 0;
                            y3q y3qVar2 = this.mSlideHandler;
                            if (y3qVar2 != null) {
                                y3qVar2.f(rawX2, rawY2);
                            }
                            doPagerDown(rawX2, rawY2);
                        }
                        ViewParent parent = getParent();
                        if (parent instanceof StretchViewPager) {
                            ((StretchViewPager) parent).setScroll(false);
                        }
                    } else {
                        if (WXEnvironment.isApkDebugable()) {
                            StringBuilder sb5 = new StringBuilder("ACTION_MOVE---->>>SLIDER_MODE : x=");
                            sb5.append(rawX2);
                            sb5.append(", y=");
                            sb5.append(rawY2);
                        }
                        this.mSlideMode = 1;
                        ViewParent parent2 = getParent();
                        if (parent2 instanceof StretchViewPager) {
                            ((StretchViewPager) parent2).setScroll(true);
                        }
                    }
                    return false;
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        this.mSlideMode = 2;
        this.iDownX = (int) motionEvent.getRawX();
        this.iDownY = (int) motionEvent.getRawY();
        if (WXEnvironment.isApkDebugable()) {
            StringBuilder sb6 = new StringBuilder("ACTION_DOWN : x=");
            sb6.append(motionEvent.getRawX());
            sb6.append(", y=");
            sb6.append(motionEvent.getRawY());
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public void restore(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0da6d5", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new a(f, f2));
        ofFloat.setDuration(getRestoreAnimateLength());
        ofFloat.start();
        y3q y3qVar = this.mSlideHandler;
        if (y3qVar != null) {
            y3qVar.e(f, f2, this.restoreAnimationLength);
        }
    }

    public void setDraggable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a166c2", new Object[]{this, new Boolean(z)});
        } else {
            this.mDraggable = z;
        }
    }

    public void setExitAnimationLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c69a2d2", new Object[]{this, new Integer(i)});
        } else {
            this.exitAnimationLength = i;
        }
    }

    public void setFinishMoveY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8903329", new Object[]{this, new Integer(i)});
        } else {
            this.finishMoveY = i;
        }
    }

    public void setRestoreAnimationLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3dbc7fe", new Object[]{this, new Integer(i)});
        } else {
            this.restoreAnimationLength = i;
        }
    }

    public void setScaleEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42966b4", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsScaleEnabled = z;
        }
    }

    public void setSlideHandler(y3q y3qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba92e24", new Object[]{this, y3qVar});
        } else {
            this.mSlideHandler = y3qVar;
        }
    }

    public void setUpSlideEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3571bc0", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsUpSlideEnabled = z;
        }
    }

    public void updateAnimPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93db79", new Object[]{this, new Integer(i)});
            return;
        }
        y3q y3qVar = this.mSlideHandler;
        if (y3qVar != null) {
            y3qVar.d(i);
        }
    }

    public SlideFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setScaleEnabled(true);
        setUpSlideEnabled(true);
    }

    public SlideFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setScaleEnabled(true);
        setUpSlideEnabled(true);
    }
}
