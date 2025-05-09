package com.taobao.tao.flexbox.layoutmanager.view.edgepan;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.akt;
import tb.nwv;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class EdgePanViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHILD_CAN_SCROLL = 1;
    public static final int EDGE_PAN_LEFT = 1;
    public static final int EDGE_PAN_RIGHT = 16;
    public static final int SCROLL_STATE_ALLOW = 1;
    public static final int SCROLL_STATE_FORBIDDEN = -1;
    public static final int SCROLL_STATE_UNKNOWN = 0;
    private static final int SELF_CAN_NOT_SCROLL = -1;
    private static final int SELF_CAN_SCROLL = 0;
    private static final String TAG = "ViewPager";
    private int edgePan = 0;
    private boolean enableSwipe = true;
    private boolean enablePullIntercept = false;
    private int motionEventAction = -1;

    static {
        t2o.a(503317512);
    }

    public EdgePanViewPager(Context context) {
        super(context);
    }

    private int canEdgePanScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37f091f0", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (view instanceof EdgePanViewPager) {
            EdgePanViewPager edgePanViewPager = (EdgePanViewPager) view;
            if (edgePanViewPager.isEnableSwipe()) {
                ViewPager viewPager = (ViewPager) view;
                int currentItem = viewPager.getCurrentItem();
                int count = viewPager.getAdapter().getCount();
                if (count > 1) {
                    int edgePan = edgePanViewPager.getEdgePan();
                    if ((edgePan & 1) == 0 && currentItem == 0 && i > 0) {
                        return 1;
                    }
                    if ((edgePan & 16) == 0 && currentItem == count - 1 && i < 0) {
                        return 1;
                    }
                }
            } else if (checkNonSwipePageScrollStatus(view, z, i, i2, i3) == 1) {
                return 0;
            } else {
                return -1;
            }
        }
        return 0;
    }

    private int checkNonSwipePageScrollStatus(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92834fca", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount() - 1;
            while (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 < childAt.getLeft() || i6 >= childAt.getRight() || (i5 = i3 + scrollY) < childAt.getTop() || i5 >= childAt.getBottom()) {
                    i4 = childCount;
                } else {
                    i4 = childCount;
                    if (super.canScroll(childAt, true, i, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return 1;
                    }
                }
                childCount = i4 - 1;
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return -1;
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(EdgePanViewPager edgePanViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 222452193:
                return new Boolean(super.canScroll((View) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue()));
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/edgepan/EdgePanViewPager");
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        Object tag = view.getTag(R.id.layout_manager_vp_canscroll_tag);
        if (tag != null) {
            return nwv.o(tag, false);
        }
        int canEdgePanScroll = canEdgePanScroll(view, z, i, i2, i3);
        if (canEdgePanScroll == 1) {
            return true;
        }
        if (canEdgePanScroll == -1) {
            return false;
        }
        return super.canScroll(view, z, i, i2, i3);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!super.canScrollHorizontally(i) || !isEnableSwipe()) {
            return false;
        }
        return true;
    }

    public int getCurrentMotionEventAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b3ff1d1", new Object[]{this})).intValue();
        }
        return this.motionEventAction;
    }

    public int getEdgePan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbbc90e4", new Object[]{this})).intValue();
        }
        return this.edgePan;
    }

    public boolean isEnableSwipe() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cc85f8", new Object[]{this})).booleanValue();
        }
        return this.enableSwipe;
    }

    public boolean isTouchOnView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0fa71c4", new Object[]{this})).booleanValue();
        }
        int i = this.motionEventAction;
        if (i == 0 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            int action = motionEvent.getAction();
            this.motionEventAction = action;
            if ((action == 0 || action == 2) && this.enablePullIntercept && pullIntercept(this)) {
                return false;
            }
            if (isEnableSwipe()) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            tfs.d(e.getMessage());
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            tfs.d("ViewPager onMeasure error: " + e.getMessage());
        }
    }

    public boolean pullIntercept(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
        }
        return false;
    }

    public void setEdgePan(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d21efb3e", new Object[]{this, new Integer(i)});
        } else {
            this.edgePan = i;
        }
    }

    public void setEnableSwipe(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b12a98", new Object[]{this, new Boolean(z)});
            return;
        }
        this.enableSwipe = z;
        tfs.g(TAG, "setEnableSwipe: " + z);
    }

    public void setEnablePullIntercept(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6166b5", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z && !akt.p2("forcePullIntercept", false)) {
            z2 = false;
        }
        this.enablePullIntercept = z2;
        tfs.g(TAG, "setEnablePullIntercept: " + this.enablePullIntercept);
    }

    public EdgePanViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
