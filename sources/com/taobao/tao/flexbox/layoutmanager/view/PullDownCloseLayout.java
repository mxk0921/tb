package com.taobao.tao.flexbox.layoutmanager.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.s6o;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PullDownCloseLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BACK_DURATION = 300;
    private static final int DISMISS_SPEED = 3000;
    private int dismissOffset;
    private int mDisplayHeight;
    private int mDownRawX;
    private int mDownRawY;
    private int mDownY;
    private boolean mForbidGesture;
    private int mInitTop;
    private boolean mIsBeingDragged;
    private c mOnSwipeFinishListener;
    private int mTemplateValue;
    private VelocityTracker mVelocityTracker;
    private int mViewHeight;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PullDownCloseLayout pullDownCloseLayout = PullDownCloseLayout.this;
            pullDownCloseLayout.offsetTopAndBottom(intValue - PullDownCloseLayout.access$000(pullDownCloseLayout));
            PullDownCloseLayout.access$002(PullDownCloseLayout.this, intValue);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12380a;

        public b(boolean z) {
            this.f12380a = z;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/PullDownCloseLayout$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            if (PullDownCloseLayout.access$100(PullDownCloseLayout.this) != null && this.f12380a) {
                PullDownCloseLayout.access$100(PullDownCloseLayout.this).t0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void t0();
    }

    static {
        t2o.a(503317472);
    }

    public PullDownCloseLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ int access$000(PullDownCloseLayout pullDownCloseLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9451963", new Object[]{pullDownCloseLayout})).intValue();
        }
        return pullDownCloseLayout.mTemplateValue;
    }

    public static /* synthetic */ int access$002(PullDownCloseLayout pullDownCloseLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4201a688", new Object[]{pullDownCloseLayout, new Integer(i)})).intValue();
        }
        pullDownCloseLayout.mTemplateValue = i;
        return i;
    }

    public static /* synthetic */ c access$100(PullDownCloseLayout pullDownCloseLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("327bc228", new Object[]{pullDownCloseLayout});
        }
        return pullDownCloseLayout.mOnSwipeFinishListener;
    }

    private boolean canScroll(View view, boolean z, int i, int i2, int i3) {
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
                    if (canScroll(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                        return true;
                    }
                } else {
                    i4 = childCount;
                }
                childCount = i4 - 1;
            }
        }
        if (!z || !view.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(PullDownCloseLayout pullDownCloseLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/PullDownCloseLayout");
        }
    }

    private void resetState(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f24fd1cb", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        this.mTemplateValue = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new a());
        ofInt.start();
        ofInt.addListener(new b(z));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mForbidGesture) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownRawY = (int) motionEvent.getRawY();
            this.mDownRawX = (int) motionEvent.getRawX();
            this.mDownY = (int) motionEvent.getY();
            this.mIsBeingDragged = false;
        } else if (action == 2) {
            if (this.mIsBeingDragged) {
                return true;
            }
            int rawY = ((int) motionEvent.getRawY()) - this.mDownRawY;
            int rawX = ((int) motionEvent.getRawX()) - this.mDownRawX;
            if (rawY != 0 && Math.abs(rawY) > Math.abs(rawX)) {
                if (canScroll(this, false, -rawY, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.mIsBeingDragged = false;
                    return false;
                }
                this.mIsBeingDragged = true;
            }
        }
        return this.mIsBeingDragged;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.mInitTop = getTop();
        int height = getHeight();
        this.mViewHeight = height;
        this.dismissOffset = (height - this.mInitTop) / 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r3 != 3) goto L_0x00cc;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a9b14c3a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r10
            r2[r0] = r11
            java.lang.Object r11 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x001c:
            boolean r3 = r10.mForbidGesture
            if (r3 != 0) goto L_0x00cd
            android.view.VelocityTracker r3 = r10.mVelocityTracker
            r3.addMovement(r11)
            int r3 = r11.getAction()
            if (r3 == 0) goto L_0x00ca
            if (r3 == r0) goto L_0x0089
            if (r3 == r2) goto L_0x0034
            r11 = 3
            if (r3 == r11) goto L_0x0089
            goto L_0x00cc
        L_0x0034:
            float r1 = r11.getRawY()
            int r2 = r10.mDownRawY
            float r2 = (float) r2
            float r1 = r1 - r2
            int r1 = (int) r1
            float r2 = r11.getRawX()
            int r3 = r10.mDownRawX
            float r3 = (float) r3
            float r2 = r2 - r3
            int r2 = (int) r2
            boolean r3 = r10.mIsBeingDragged
            if (r3 != 0) goto L_0x006c
            if (r1 == 0) goto L_0x006c
            int r3 = java.lang.Math.abs(r1)
            int r2 = java.lang.Math.abs(r2)
            if (r3 <= r2) goto L_0x006c
            int r7 = -r1
            float r1 = r11.getRawX()
            int r8 = (int) r1
            float r1 = r11.getRawY()
            int r9 = (int) r1
            r6 = 0
            r4 = r10
            r5 = r10
            boolean r1 = r4.canScroll(r5, r6, r7, r8, r9)
            if (r1 != 0) goto L_0x006c
            r10.mIsBeingDragged = r0
        L_0x006c:
            boolean r1 = r10.mIsBeingDragged
            if (r1 == 0) goto L_0x00cc
            int r1 = r10.getTop()
            float r11 = r11.getY()
            int r2 = r10.mDownY
            float r2 = (float) r2
            float r11 = r11 - r2
            int r11 = (int) r11
            int r2 = r1 + r11
            int r3 = r10.mInitTop
            if (r2 > r3) goto L_0x0085
            int r11 = r3 - r1
        L_0x0085:
            r10.offsetTopAndBottom(r11)
            goto L_0x00cc
        L_0x0089:
            android.view.VelocityTracker r11 = r10.mVelocityTracker
            android.content.Context r2 = r10.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledMaximumFlingVelocity()
            float r2 = (float) r2
            r3 = 1000(0x3e8, float:1.401E-42)
            r11.computeCurrentVelocity(r3, r2)
            android.view.VelocityTracker r11 = r10.mVelocityTracker
            float r11 = r11.getYVelocity()
            int r2 = r10.getTop()
            int r3 = r10.mInitTop
            int r2 = r2 - r3
            int r3 = r10.dismissOffset
            if (r2 > r3) goto L_0x00c0
            r2 = 1161527296(0x453b8000, float:3000.0)
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x00b6
            goto L_0x00c0
        L_0x00b6:
            int r11 = r10.getTop()
            int r2 = r10.mInitTop
            r10.resetState(r11, r2, r1)
            goto L_0x00cc
        L_0x00c0:
            int r11 = r10.getTop()
            int r1 = r10.mDisplayHeight
            r10.resetState(r11, r1, r0)
            goto L_0x00cc
        L_0x00ca:
            r10.mIsBeingDragged = r1
        L_0x00cc:
            return r0
        L_0x00cd:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setForbidGesture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224d913a", new Object[]{this, new Boolean(z)});
        } else {
            this.mForbidGesture = z;
        }
    }

    public void setOnSwipeFinishListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee0ece2", new Object[]{this, cVar});
        } else {
            this.mOnSwipeFinishListener = cVar;
        }
    }

    public PullDownCloseLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PullDownCloseLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mForbidGesture = true;
        this.dismissOffset = s6o.c(getContext(), 65);
        this.mDisplayHeight = getResources().getDisplayMetrics().heightPixels;
    }
}
