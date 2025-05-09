package com.taobao.android.detail.ttdetail.widget.draglayout;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DragLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isDragIntercept;
    private ViewDragHelper mDragHelper;
    private ViewDragListener mDragListener;
    private volatile boolean mIsLayoutRequested;
    private View mTargetView;
    private Rect mTargetViewCurrentPosition = new Rect();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ViewDragListener extends ViewDragHelper.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DragLayout f7011a;

        static {
            t2o.a(912263015);
        }

        public ViewDragListener(DragLayout dragLayout) {
            this.f7011a = dragLayout;
        }

        public static /* synthetic */ Object ipc$super(ViewDragListener viewDragListener, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1276834111:
                    super.onViewDragStateChanged(((Number) objArr[0]).intValue());
                    return null;
                case -90054502:
                    super.onViewCaptured((View) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                case 852508362:
                    super.onViewReleased((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                    return null;
                case 1539766340:
                    super.onViewPositionChanged((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/draglayout/DragLayout$ViewDragListener");
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c2378c14", new Object[]{this, view})).intValue();
            }
            return 1;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("896fc226", new Object[]{this, view})).intValue();
            }
            return 1;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
            } else {
                super.onViewCaptured(view, i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
                return;
            }
            super.onViewDragStateChanged(i);
            if (i == 0 && DragLayout.access$200(this.f7011a)) {
                this.f7011a.requestLayout();
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.onViewPositionChanged(view, i, i2, i3, i4);
            DragLayout.access$100(this.f7011a).left = view.getLeft();
            DragLayout.access$100(this.f7011a).top = view.getTop();
            DragLayout.access$100(this.f7011a).right = view.getRight();
            DragLayout.access$100(this.f7011a).bottom = view.getBottom();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                return;
            }
            super.onViewReleased(view, f, f2);
            int top = view.getTop();
            if (((view.getLeft() + view.getRight()) >> 1) > this.f7011a.getWidth() / 2) {
                i = (this.f7011a.getWidth() - this.f7011a.getPaddingRight()) - view.getWidth();
            } else {
                i = this.f7011a.getPaddingLeft();
            }
            if (top < this.f7011a.getPaddingTop()) {
                top = this.f7011a.getPaddingTop();
            } else if (view.getBottom() > this.f7011a.getHeight() - this.f7011a.getPaddingBottom()) {
                top = (this.f7011a.getHeight() - this.f7011a.getPaddingBottom()) - view.getHeight();
            }
            DragLayout.access$300(this.f7011a).settleCapturedViewAt(i, top);
            this.f7011a.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue();
            }
            if (DragLayout.access$000(this.f7011a) == view) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(912263014);
    }

    public DragLayout(Context context) {
        super(context);
        ViewDragListener viewDragListener = new ViewDragListener(this);
        this.mDragListener = viewDragListener;
        this.mDragHelper = ViewDragHelper.create(this, viewDragListener);
    }

    public static /* synthetic */ View access$000(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c75a6a55", new Object[]{dragLayout});
        }
        return dragLayout.mTargetView;
    }

    public static /* synthetic */ Rect access$100(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("8b6d957b", new Object[]{dragLayout});
        }
        return dragLayout.mTargetViewCurrentPosition;
    }

    public static /* synthetic */ boolean access$200(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd2aa95", new Object[]{dragLayout})).booleanValue();
        }
        return dragLayout.mIsLayoutRequested;
    }

    public static /* synthetic */ ViewDragHelper access$300(DragLayout dragLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewDragHelper) ipChange.ipc$dispatch("84980c82", new Object[]{dragLayout});
        }
        return dragLayout.mDragHelper;
    }

    public static /* synthetic */ Object ipc$super(DragLayout dragLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -894236565:
                super.computeScroll();
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 2041279898:
                super.requestDisallowInterceptTouchEvent(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/draglayout/DragLayout");
        }
    }

    private boolean isOffsetting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a77759d6", new Object[]{this})).booleanValue();
        }
        ViewDragHelper viewDragHelper = this.mDragHelper;
        if (viewDragHelper == null) {
            return false;
        }
        if (viewDragHelper.getViewDragState() == 1 || this.mDragHelper.getViewDragState() == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        if (this.mDragHelper.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean shouldInterceptTouchEvent = this.mDragHelper.shouldInterceptTouchEvent(motionEvent);
        this.isDragIntercept = shouldInterceptTouchEvent;
        return super.onInterceptTouchEvent(motionEvent) | shouldInterceptTouchEvent;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mTargetView != null && !this.mTargetViewCurrentPosition.isEmpty()) {
            View view = this.mTargetView;
            Rect rect = this.mTargetViewCurrentPosition;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.isDragIntercept) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
        } else {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else if (isOffsetting()) {
            this.mIsLayoutRequested = true;
        } else {
            super.requestLayout();
            this.mIsLayoutRequested = false;
        }
    }

    public void setTargetView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb50b813", new Object[]{this, view});
        } else {
            this.mTargetView = view;
        }
    }

    public DragLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewDragListener viewDragListener = new ViewDragListener(this);
        this.mDragListener = viewDragListener;
        this.mDragHelper = ViewDragHelper.create(this, viewDragListener);
    }

    public DragLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewDragListener viewDragListener = new ViewDragListener(this);
        this.mDragListener = viewDragListener;
        this.mDragHelper = ViewDragHelper.create(this, viewDragListener);
    }
}
