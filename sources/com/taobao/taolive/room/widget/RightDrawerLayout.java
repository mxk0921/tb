package com.taobao.taolive.room.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import tb.o3s;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RightDrawerLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private boolean isOpened;
    private View mContentView;
    private int mDrawerState;
    private List<b> mListeners;
    private int mMinDrawerMargin;
    private final ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private float mRightMenuOnScrreen;
    private View mRightMenuView;
    private boolean hasScrollableView = false;
    private boolean isHorizontallyGesture = false;
    private float touchStartX = 0.0f;
    private float touchStartY = 0.0f;
    private float startX = 0.0f;
    private int mLockModeRight = 3;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class ViewDragCallback extends ViewDragHelper.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ViewDragHelper f13267a;
        public final Runnable b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                }
            }
        }

        static {
            t2o.a(779093388);
        }

        public ViewDragCallback() {
            this.b = new a();
        }

        public static /* synthetic */ Object ipc$super(ViewDragCallback viewDragCallback, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/widget/RightDrawerLayout$ViewDragCallback");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            int width = RightDrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c2378c14", new Object[]{this, view})).intValue();
            }
            if (RightDrawerLayout.access$100(RightDrawerLayout.this, view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ceb6938", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (RightDrawerLayout.access$300(RightDrawerLayout.this) != null && RightDrawerLayout.this.getDrawerLockMode() == 0) {
                this.f13267a.captureChildView(RightDrawerLayout.access$300(RightDrawerLayout.this), i2);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
            } else {
                RightDrawerLayout.access$400(RightDrawerLayout.this, i, this.f13267a.getCapturedView());
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            int i5 = 4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            float width = (RightDrawerLayout.this.getWidth() - i) / view.getWidth();
            RightDrawerLayout.access$202(RightDrawerLayout.this, width);
            if (width != 0.0f) {
                i5 = 0;
            }
            view.setVisibility(i5);
            RightDrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                return;
            }
            int width = view.getWidth();
            int width2 = RightDrawerLayout.this.getWidth();
            if (f < 0.0f || (f == 0.0f && RightDrawerLayout.access$200(RightDrawerLayout.this) > 0.5f)) {
                width2 -= width;
            }
            this.f13267a.settleCapturedViewAt(width2, view.getTop());
            RightDrawerLayout.this.invalidate();
        }

        public void removeCallbacks() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58438431", new Object[]{this});
            } else {
                RightDrawerLayout.this.removeCallbacks(this.b);
            }
        }

        public void setDragger(ViewDragHelper viewDragHelper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efb28b1d", new Object[]{this, viewDragHelper});
            } else {
                this.f13267a = viewDragHelper;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue();
            }
            if (!RightDrawerLayout.access$100(RightDrawerLayout.this, view) || RightDrawerLayout.this.getDrawerLockMode() != 0) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerStateChanged(int i);
    }

    static {
        t2o.a(779093385);
    }

    public RightDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f = getResources().getDisplayMetrics().density;
        float f2 = 400.0f * f;
        this.mMinDrawerMargin = (int) ((f * 64.0f) + 0.5f);
        ViewDragCallback viewDragCallback = new ViewDragCallback();
        this.mRightCallback = viewDragCallback;
        ViewDragHelper create = ViewDragHelper.create(this, 1.0f, viewDragCallback);
        this.mRightDragger = create;
        create.setEdgeTrackingEnabled(2);
        create.setMinVelocity(f2);
        viewDragCallback.setDragger(create);
        setDrawerRightEdgeSize(context, 1.0f);
    }

    public static /* synthetic */ boolean access$100(RightDrawerLayout rightDrawerLayout, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4068f2fb", new Object[]{rightDrawerLayout, view})).booleanValue();
        }
        return rightDrawerLayout.isDrawerView(view);
    }

    public static /* synthetic */ float access$200(RightDrawerLayout rightDrawerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5f4deec", new Object[]{rightDrawerLayout})).floatValue();
        }
        return rightDrawerLayout.mRightMenuOnScrreen;
    }

    public static /* synthetic */ float access$202(RightDrawerLayout rightDrawerLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb140df2", new Object[]{rightDrawerLayout, new Float(f)})).floatValue();
        }
        rightDrawerLayout.mRightMenuOnScrreen = f;
        return f;
    }

    public static /* synthetic */ View access$300(RightDrawerLayout rightDrawerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f19e5aff", new Object[]{rightDrawerLayout});
        }
        return rightDrawerLayout.mRightMenuView;
    }

    public static /* synthetic */ void access$400(RightDrawerLayout rightDrawerLayout, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f96eed", new Object[]{rightDrawerLayout, new Integer(i), view});
        } else {
            rightDrawerLayout.updateDrawerState(i, view);
        }
    }

    private void checkForScrollableView(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a1053e", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (view != null && view.getVisibility() == 0 && i >= view.getLeft() && i <= view.getRight() && i2 >= view.getTop() && i2 <= view.getBottom()) {
            if (viewCanScrollAndSetTag(view)) {
                this.hasScrollableView = true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    checkForScrollableView(viewGroup.getChildAt(i3), i - view.getLeft(), i2 - view.getTop());
                }
            }
        }
    }

    private void dispatchOnDrawerClosed(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782773d5", new Object[]{this, view});
        } else if (this.isOpened) {
            this.isOpened = false;
            List<b> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerClosed(view);
                }
            }
        }
    }

    private void dispatchOnDrawerOpened(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c10038", new Object[]{this, view});
        } else if (!this.isOpened) {
            this.isOpened = true;
            List<b> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerOpened(view);
                }
            }
        }
    }

    private int findChildIndexByPosition(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c53da08", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)})).intValue();
        }
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (i >= childAt.getLeft() && i <= childAt.getRight() && i2 >= childAt.getTop() && i2 <= childAt.getBottom()) {
                return i3;
            }
        }
        return -1;
    }

    private View getRightMenuChildAt(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1f8c3173", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        View view = this.mRightMenuView;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        return ((ViewGroup) this.mRightMenuView).getChildAt(findChildIndexByPosition((ViewGroup) view, i, i2));
    }

    public static /* synthetic */ Object ipc$super(RightDrawerLayout rightDrawerLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/widget/RightDrawerLayout");
    }

    private boolean isDrawerView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4997cef", new Object[]{this, view})).booleanValue();
        }
        if (view == this.mRightMenuView) {
            return true;
        }
        return false;
    }

    private boolean isDrawerVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84a73642", new Object[]{this})).booleanValue();
        }
        if (this.mRightMenuOnScrreen > 0.0f) {
            return true;
        }
        return false;
    }

    private boolean onInterceptSwipeLeft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a4ae589", new Object[]{this})).booleanValue();
        }
        if (this.mRightMenuView.findViewWithTag("canScrollHorizontallyRight") != null) {
            return false;
        }
        return true;
    }

    private boolean onInterceptSwipeRight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c7a4b10", new Object[]{this})).booleanValue();
        }
        if (this.mRightMenuView.findViewWithTag("canScrollHorizontallyLeft") != null) {
            return false;
        }
        return true;
    }

    private void setDrawerRightEdgeSize(Context context, float f) {
        if (context instanceof Activity) {
            try {
                Field declaredField = this.mRightDragger.getClass().getDeclaredField("mEdgeSize");
                declaredField.setAccessible(true);
                int i = declaredField.getInt(this.mRightDragger);
                Point point = new Point();
                ((Activity) context).getWindowManager().getDefaultDisplay().getSize(point);
                declaredField.setInt(this.mRightDragger, Math.max(i, (int) (point.x * f)));
            } catch (Throwable th) {
                v7t.e("RightDrawerLayout", "setDrawerRightEdgeSize", th, new Object[0]);
            }
        }
    }

    private void setViewTag(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69218939", new Object[]{this, viewGroup});
            return;
        }
        if (viewGroup.canScrollHorizontally(1)) {
            viewGroup.setTag("canScrollHorizontallyRight");
        }
        if (viewGroup.canScrollHorizontally(-1)) {
            viewGroup.setTag("canScrollHorizontallyLeft");
        }
    }

    private void updateDrawerState(int i, View view) {
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d33b608d", new Object[]{this, new Integer(i), view});
            return;
        }
        int viewDragState = this.mRightDragger.getViewDragState();
        if (viewDragState == 1) {
            this.isOpened = false;
            i2 = 1;
        } else if (viewDragState != 2) {
            i2 = 0;
        }
        if (view != null && i == 0) {
            float f = this.mRightMenuOnScrreen;
            if (f == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (f == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i2 != this.mDrawerState) {
            this.mDrawerState = i2;
            List<b> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerStateChanged(i2);
                }
            }
        }
    }

    private boolean viewCanScrollAndSetTag(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11527938", new Object[]{this, view})).booleanValue();
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        setViewTag(viewGroup);
        if (viewGroup.canScrollHorizontally(-1) || viewGroup.canScrollHorizontally(1)) {
            return true;
        }
        return false;
    }

    public void addDrawerListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c258f3", new Object[]{this, bVar});
        } else if (bVar != null) {
            if (this.mListeners == null) {
                this.mListeners = new ArrayList();
            }
            this.mListeners.add(bVar);
        }
    }

    public void closeDrawer() {
        ViewDragHelper viewDragHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374b4110", new Object[]{this});
            return;
        }
        View view = this.mRightMenuView;
        if (view != null && (viewDragHelper = this.mRightDragger) != null) {
            this.mRightMenuOnScrreen = 0.0f;
            boolean smoothSlideViewTo = viewDragHelper.smoothSlideViewTo(view, getWidth(), view.getTop());
            ViewDragCallback viewDragCallback = this.mRightCallback;
            if (viewDragCallback != null) {
                viewDragCallback.removeCallbacks();
            }
            if (smoothSlideViewTo) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
        } else if (this.mRightDragger.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this});
        }
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getDrawerLockMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fd9d06f", new Object[]{this})).intValue();
        }
        int i = this.mLockModeRight;
        if (i != 3) {
            return i;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.startX = motionEvent.getX();
            float y = motionEvent.getY();
            if (isDrawerVisible()) {
                int i = (int) y;
                checkForScrollableView(getRightMenuChildAt((int) this.startX, i), (int) this.startX, i);
                float f = this.startX;
                if (f >= 0.0f && (view = this.mContentView) != null && this.mRightMenuView != null && f < view.getMeasuredWidth() - this.mRightMenuView.getMeasuredWidth()) {
                    closeDrawer();
                    return true;
                }
            }
        } else if (actionMasked == 1) {
            this.hasScrollableView = false;
            this.startX = 0.0f;
        } else if (actionMasked == 2 && this.hasScrollableView) {
            float x = motionEvent.getX();
            float f2 = x - this.startX;
            if (Math.abs(f2) > 5.0f) {
                if (f2 > 0.0f) {
                    z = onInterceptSwipeRight();
                } else {
                    z = onInterceptSwipeLeft();
                }
                this.startX = x;
                if (z || !this.mRightDragger.shouldInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            }
        }
        z = true;
        if (z) {
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        View view = this.mRightMenuView;
        View view2 = this.mContentView;
        int i6 = i3 - i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin;
        view2.layout(i7, marginLayoutParams.topMargin, view2.getMeasuredWidth() + i7, marginLayoutParams.topMargin + view2.getMeasuredHeight());
        int measuredWidth = view.getMeasuredWidth();
        float f = measuredWidth;
        int i8 = i6 - ((int) (this.mRightMenuOnScrreen * f));
        int i9 = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
        view.layout(i8, i9, measuredWidth + i8, view.getMeasuredHeight() + i9);
        float f2 = (i6 - i8) / f;
        if (f2 != this.mRightMenuOnScrreen) {
            this.mRightMenuOnScrreen = f2;
        }
        if (this.mRightMenuOnScrreen > 0.0f) {
            i5 = 0;
        }
        if (view.getVisibility() != i5) {
            view.setVisibility(i5);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        View childAt = getChildAt(1);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.mMinDrawerMargin + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i2, marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        View childAt2 = getChildAt(0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
        childAt2.measure(View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - marginLayoutParams2.topMargin) - marginLayoutParams2.bottomMargin, 1073741824));
        this.mRightMenuView = childAt;
        this.mContentView = childAt2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.touchStartX = motionEvent.getX();
                this.touchStartY = motionEvent.getY();
                this.mRightDragger.processTouchEvent(motionEvent);
            } else if (actionMasked == 1) {
                this.mRightDragger.processTouchEvent(motionEvent);
                if (this.isOpened) {
                    closeDrawer();
                }
                this.isHorizontallyGesture = false;
                this.touchStartX = 0.0f;
                this.touchStartY = 0.0f;
            } else if (actionMasked != 2) {
                if (actionMasked == 3 && this.isOpened) {
                    closeDrawer();
                }
            } else if (this.isOpened || this.isHorizontallyGesture) {
                this.mRightDragger.processTouchEvent(motionEvent);
            } else {
                float abs = Math.abs(motionEvent.getX() - this.touchStartX);
                float abs2 = Math.abs(motionEvent.getY() - this.touchStartY);
                if (abs <= 0.0f || abs < abs2 * Math.sqrt(3.0d)) {
                    z = false;
                } else {
                    z = true;
                }
                this.isHorizontallyGesture = z;
                if (z) {
                    this.mRightDragger.processTouchEvent(motionEvent);
                }
            }
            return true;
        } catch (Throwable th) {
            o3s.b("RightDrawerLayout", th.getMessage());
            return false;
        }
    }

    public void openDrawer() {
        ViewDragHelper viewDragHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe0cae2", new Object[]{this});
            return;
        }
        View view = this.mRightMenuView;
        if (view != null && (viewDragHelper = this.mRightDragger) != null) {
            this.mRightMenuOnScrreen = 1.0f;
            viewDragHelper.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
            invalidate();
        }
    }

    public void removeDrawerListener(b bVar) {
        List<b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baaa87d6", new Object[]{this, bVar});
        } else if (bVar != null && (list = this.mListeners) != null) {
            list.remove(bVar);
        }
    }

    public void setDrawerLockMode(int i) {
        ViewDragHelper viewDragHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a5717b", new Object[]{this, new Integer(i)});
            return;
        }
        this.mLockModeRight = i;
        if (!(i == 0 || (viewDragHelper = this.mRightDragger) == null)) {
            viewDragHelper.cancel();
        }
        if (i == 1) {
            closeDrawer();
        } else if (i == 2) {
            openDrawer();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
