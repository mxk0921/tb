package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.tao.util.DensityUtil;
import tb.anl;
import tb.hpj;
import tb.ied;
import tb.pn1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SlidingLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SHADOW_WIDTH = 16;
    private Activity mActivity;
    private pn1 mBackInterceptListener;
    private boolean mDisableScroll;
    private Drawable mLeftShadow;
    private hpj.b mNavigationBarColorChangeListener;
    private b mPullRightHelper;
    private Scroller mScroller;
    private int mShadowWidth;
    private anl pageInterface;
    private View statusBarBackground;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(View view) {
            super(view);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/SlidingLayout$1");
        }

        @Override // com.taobao.android.layoutmanager.container.SlidingLayout.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
                return;
            }
            SlidingLayout.access$000(SlidingLayout.this);
            if (SlidingLayout.access$100(SlidingLayout.this) != null) {
                SlidingLayout.access$100(SlidingLayout.this).onBack(hpj.b);
            }
        }

        @Override // com.taobao.android.layoutmanager.container.SlidingLayout.b
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else if (SlidingLayout.access$200(SlidingLayout.this)) {
                SlidingLayout.access$300(SlidingLayout.this).b();
            } else {
                SlidingLayout.access$400(SlidingLayout.this);
                if (SlidingLayout.access$100(SlidingLayout.this) != null) {
                    SlidingLayout.access$100(SlidingLayout.this).onFinish(hpj.b, 0.0f);
                }
            }
        }

        @Override // com.taobao.android.layoutmanager.container.SlidingLayout.b
        public void h(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b042fc9", new Object[]{this, new Float(f)});
            } else if (!SlidingLayout.access$200(SlidingLayout.this)) {
                SlidingLayout.this.scrollTo((int) (-f), 0);
                SlidingLayout.access$500(SlidingLayout.this, f);
                if (SlidingLayout.access$100(SlidingLayout.this) != null) {
                    SlidingLayout.access$100(SlidingLayout.this).onMove(hpj.b);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f8185a;
        public float b;
        public float c;
        public float d;
        public boolean e;
        public boolean f;
        public final int h;
        public final float i;
        public final View l;
        public int g = -1;
        public final int j = -4;
        public final int k = 4;
        public VelocityTracker m = VelocityTracker.obtain();

        static {
            t2o.a(502268019);
        }

        public b(View view) {
            this.l = view;
            this.h = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity();
            this.i = DensityUtil.dip2px(view.getContext(), 60.0f);
        }

        public final boolean a(View view, boolean z, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int scrollX = view.getScrollX();
                int scrollY = view.getScrollY();
                int childCount = viewGroup.getChildCount() - 1;
                while (childCount >= 0) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt != null && (i5 = i2 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() * childAt.getScaleX() && (i6 = i3 + scrollY) >= childAt.getTop() && i6 < childAt.getBottom()) {
                        i4 = childCount;
                        if (a(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                            return true;
                        }
                    } else {
                        i4 = childCount;
                    }
                    childCount = i4 - 1;
                }
            } else if (view instanceof SeekBar) {
                return true;
            }
            if (!z || !view.canScrollHorizontally(-i)) {
                return false;
            }
            return true;
        }

        public final boolean b(float f, float f2) {
            o n3;
            n d0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e5ec7d4a", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
            }
            View view = this.l;
            if (view == null || !(view.getContext() instanceof CommonContainerActivity) || (n3 = ((CommonContainerActivity) this.l.getContext()).n3()) == null || (d0 = n3.d0()) == null || q.e(d0, (int) f, (int) f2, true) == null) {
                return true;
            }
            return false;
        }

        public final void c(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b5c5c4d", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            float f3 = this.i;
            if (f > f3) {
                int i = this.j;
                if (f2 < i || (f < f3 * 2.0f && f2 < i / 2)) {
                    e();
                } else if (f2 > this.k) {
                    f();
                } else {
                    f();
                }
            } else if (f2 > this.k) {
                f();
            } else {
                e();
            }
        }

        public final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd6d5772", new Object[]{this});
                return;
            }
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker == null) {
                this.m = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
        }

        public void e() {
            throw null;
        }

        public void f() {
            throw null;
        }

        public boolean g(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                i(motionEvent);
                            }
                        }
                    } else if (k(this.l, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f) {
                        return false;
                    } else {
                        if (this.e) {
                            return true;
                        }
                        int i = this.g;
                        if (i == -1) {
                            Log.e("PullLeftHelper", "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        if (findPointerIndex < 0) {
                            return false;
                        }
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        float f = x - this.f8185a;
                        if (f == 0.0f || !a(this.l, false, (int) f, (int) x, (int) y)) {
                            m(rawX, rawY);
                        } else {
                            this.f8185a = x;
                            this.f = true;
                            return false;
                        }
                    }
                }
                this.e = false;
                this.f = false;
                this.g = -1;
            } else if (k(this.l, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            } else {
                View view = this.l;
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).requestDisallowInterceptTouchEvent(false);
                }
                int pointerId = motionEvent.getPointerId(0);
                this.g = pointerId;
                this.e = false;
                this.f = false;
                if (motionEvent.findPointerIndex(pointerId) < 0) {
                    return false;
                }
                this.c = motionEvent.getRawX();
                this.d = motionEvent.getRawY();
                this.f8185a = motionEvent.getX();
                motionEvent.getY();
            }
            return this.e;
        }

        public void h(float f) {
            throw null;
        }

        public final void i(MotionEvent motionEvent) {
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24b537f", new Object[]{this, motionEvent});
                return;
            }
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.g) {
                if (actionIndex != 0) {
                    i = 0;
                }
                this.g = motionEvent.getPointerId(i);
            }
        }

        public boolean j(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (actionIndex < 0) {
                                    Log.e("PullLeftHelper", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                    return false;
                                }
                                this.g = motionEvent.getPointerId(actionIndex);
                            } else if (actionMasked == 6) {
                                i(motionEvent);
                            }
                        }
                    } else if (motionEvent.findPointerIndex(this.g) < 0) {
                        Log.e("PullLeftHelper", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    } else {
                        float rawX = motionEvent.getRawX();
                        m(rawX, motionEvent.getRawY());
                        if (this.e) {
                            float f = (rawX - this.b) * 1.0f;
                            if (f > 0.0f) {
                                h(f);
                            } else {
                                h(0.0f);
                            }
                        }
                    }
                }
                if (motionEvent.findPointerIndex(this.g) < 0) {
                    Log.e("PullLeftHelper", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.e) {
                    this.e = false;
                    this.m.computeCurrentVelocity(1);
                    c((motionEvent.getRawX() - this.b) * 1.0f, this.m.getXVelocity());
                }
                this.g = -1;
                return false;
            }
            this.g = motionEvent.getPointerId(0);
            this.e = false;
            d();
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return true;
        }

        public final boolean k(View view, int i, int i2) {
            int i3;
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5069c932", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if ((view instanceof ied) && ((ied) view).canPullIntercept(ied.PULL_HORIZONTAL_DRAG)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int scrollX = view.getScrollX();
                int scrollY = view.getScrollY();
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt != null && (i3 = i + scrollX) >= childAt.getLeft() && i3 < childAt.getRight() && (i4 = i2 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && k(childAt, i3 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a86dd0f", new Object[]{this});
                return;
            }
            VelocityTracker velocityTracker = this.m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.m = null;
            }
        }

        public final void m(float f, float f2) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dcd19d8", new Object[]{this, new Float(f), new Float(f2)});
            } else if (!this.e) {
                float f3 = f - this.c;
                if (Math.abs(f3) * 0.5f > Math.abs(f2 - this.d)) {
                    z = true;
                }
                if (f3 > this.h && z && b(f, f2)) {
                    this.b = this.c + this.h;
                    this.e = true;
                }
            }
        }
    }

    static {
        t2o.a(502268017);
    }

    public SlidingLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$000(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1c0ebb", new Object[]{slidingLayout});
        } else {
            slidingLayout.scrollBack();
        }
    }

    public static /* synthetic */ hpj.b access$100(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hpj.b) ipChange.ipc$dispatch("eed751e6", new Object[]{slidingLayout});
        }
        return slidingLayout.mNavigationBarColorChangeListener;
    }

    public static /* synthetic */ boolean access$200(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79afec1", new Object[]{slidingLayout})).booleanValue();
        }
        return slidingLayout.shouldInterceptBack();
    }

    public static /* synthetic */ pn1 access$300(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pn1) ipChange.ipc$dispatch("4dfdf6c5", new Object[]{slidingLayout});
        }
        return slidingLayout.mBackInterceptListener;
    }

    public static /* synthetic */ void access$400(SlidingLayout slidingLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a319eebf", new Object[]{slidingLayout});
        } else {
            slidingLayout.scrollClose();
        }
    }

    public static /* synthetic */ void access$500(SlidingLayout slidingLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a53d900", new Object[]{slidingLayout, new Float(f)});
        } else {
            slidingLayout.updateStatusBarTranslateX(f);
        }
    }

    public static void disableScroll(Activity activity, boolean z) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48851466", new Object[]{activity, new Boolean(z)});
        } else if (activity != null && (viewGroup = (ViewGroup) activity.getWindow().getDecorView()) != null) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof SlidingLayout) {
                ((SlidingLayout) childAt).disableScroll(z);
            }
        }
    }

    private void drawShadow(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a2d9ba", new Object[]{this, canvas});
            return;
        }
        this.mLeftShadow.setBounds(0, 0, this.mShadowWidth, getHeight());
        this.mLeftShadow.setAlpha((int) ((1.0f - (((-getScrollX()) * 1.0f) / getWidth())) * 255.0f));
        canvas.save();
        canvas.translate(-this.mShadowWidth, 0.0f);
        this.mLeftShadow.draw(canvas);
        canvas.restore();
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mPullRightHelper = new a(this);
        this.mScroller = new Scroller(context);
        this.mLeftShadow = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, 1342177280});
        this.mShadowWidth = ((int) getResources().getDisplayMetrics().density) * 16;
    }

    public static /* synthetic */ Object ipc$super(SlidingLayout slidingLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/SlidingLayout");
        }
    }

    private void scrollBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9febdb", new Object[]{this});
            return;
        }
        this.mScroller.startScroll(getScrollX(), 0, -getScrollX(), 0, 300);
        invalidate();
    }

    private void scrollClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cca3632", new Object[]{this});
            return;
        }
        this.mScroller.startScroll(getScrollX(), 0, (-getScrollX()) - getWidth(), 0, 250);
        invalidate();
    }

    private boolean shouldInterceptBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6a4761", new Object[]{this})).booleanValue();
        }
        pn1 pn1Var = this.mBackInterceptListener;
        if (pn1Var == null || !pn1Var.a()) {
            return false;
        }
        return true;
    }

    private void updateStatusBarTranslateX(float f) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83306277", new Object[]{this, new Float(f)});
            return;
        }
        if (this.statusBarBackground == null && (activity = this.mActivity) != null && (activity instanceof CommonContainerActivity)) {
            this.statusBarBackground = activity.getWindow().getDecorView().findViewById(16908335);
        }
        View view = this.statusBarBackground;
        if (view != null) {
            view.setTranslationX(f);
        }
    }

    public void bindActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0574c05", new Object[]{this, activity});
            return;
        }
        this.mActivity = activity;
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        addView(childAt);
        viewGroup.addView(this);
    }

    public void bindNavigationBarColorChangeListener(hpj.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10923f58", new Object[]{this, bVar});
        } else {
            this.mNavigationBarColorChangeListener = bVar;
        }
    }

    public void bindPage(anl anlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e91bc46f", new Object[]{this, anlVar});
        } else {
            this.pageInterface = anlVar;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.mScroller.computeScrollOffset()) {
            scrollTo(this.mScroller.getCurrX(), 0);
            updateStatusBarTranslateX(-this.mScroller.getCurrX());
            postInvalidate();
        } else if ((-getScrollX()) >= getWidth() && getWidth() > 0) {
            Activity activity = this.mActivity;
            if (activity != null) {
                activity.finish();
                this.mActivity.overridePendingTransition(0, 0);
                return;
            }
            anl anlVar = this.pageInterface;
            if (anlVar != null) {
                anlVar.finish(false);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        drawShadow(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mPullRightHelper.l();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mDisableScroll) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return this.mPullRightHelper.g(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mDisableScroll) {
            super.onTouchEvent(motionEvent);
        }
        return this.mPullRightHelper.j(motionEvent);
    }

    public void setBackInterceptListener(pn1 pn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1b8b61", new Object[]{this, pn1Var});
        } else {
            this.mBackInterceptListener = pn1Var;
        }
    }

    public void setShadowViewBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d05e2e", new Object[]{this, new Integer(i)});
        } else {
            setBackgroundColor(i);
        }
    }

    public SlidingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    public void disableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a473478", new Object[]{this, new Boolean(z)});
        } else {
            this.mDisableScroll = z;
        }
    }
}
