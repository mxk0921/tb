package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.ScrollViewComponent;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import java.util.ArrayList;
import java.util.List;
import tb.bk2;
import tb.grj;
import tb.o3g;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AbsTNodeScrollView extends NestedScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEYBOARD_DISMISS_MODE_DRAG = "drag";
    private ScrollViewComponent component;
    private String keyBoardDismissMode;
    private boolean mHaveHideKeyBoard = false;
    public List<ScrollChangeListener> mScrollChangedListener = null;
    private o3g mKeyBoardDismissListener = null;
    public int scrollState = 0;
    private Handler handler = new Handler(Looper.getMainLooper());
    private long lastScrollUp = -1;
    private Runnable scrollStateChecker = new a();
    private grj scrollHelper = new grj(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AbsTNodeScrollView absTNodeScrollView = AbsTNodeScrollView.this;
            absTNodeScrollView.scrollState = 0;
            for (ScrollChangeListener scrollChangeListener : absTNodeScrollView.mScrollChangedListener) {
                scrollChangeListener.onScrollStateChanged(0, 0);
            }
            AbsTNodeScrollView.access$002(AbsTNodeScrollView.this, -1L);
        }
    }

    static {
        t2o.a(503317442);
    }

    public AbsTNodeScrollView(Context context) {
        super(context);
    }

    public static /* synthetic */ long access$002(AbsTNodeScrollView absTNodeScrollView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4c220e7", new Object[]{absTNodeScrollView, new Long(j)})).longValue();
        }
        absTNodeScrollView.lastScrollUp = j;
        return j;
    }

    private static int clamp(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7709794", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        if (i2 + i > i3) {
            return i3 - i2;
        }
        return i;
    }

    private int getMaxScrollYOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d50629e", new Object[]{this, new Integer(i)})).intValue();
        }
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() > 0) {
            return clamp(i, height, getChildAt(0).getHeight());
        }
        return i;
    }

    public static /* synthetic */ Object ipc$super(AbsTNodeScrollView absTNodeScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1577577649:
                super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1228744384:
                return new Boolean(super.canScrollVertically(((Number) objArr[0]).intValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/AbsTNodeScrollView");
        }
    }

    public void addScrollChangedListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23b6572", new Object[]{this, scrollChangeListener});
            return;
        }
        if (this.mScrollChangedListener == null) {
            this.mScrollChangedListener = new ArrayList();
        }
        if (!this.mScrollChangedListener.contains(scrollChangeListener)) {
            this.mScrollChangedListener.add(scrollChangeListener);
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        TNodeRecyclerView findTargetRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        boolean canScrollVertically = super.canScrollVertically(i);
        if (i != -1 || canScrollVertically || (findTargetRecyclerView = findTargetRecyclerView(this)) == null) {
            return canScrollVertically;
        }
        return findTargetRecyclerView.canScrollVertically(i);
    }

    public void enableEdgeEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b269f98", new Object[]{this});
        } else {
            bk2.a(this, true);
        }
    }

    public TNodeRecyclerView findTargetRecyclerView(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            if (!(view instanceof TNodeRecyclerView)) {
                if ((view instanceof ViewGroup) && (!(view instanceof NestViewPager) || (view = ((TabBarControllerComponent.TabBarControllerPageAdapter) ((NestViewPager) view).getAdapter()).j()) != null)) {
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        if (i >= viewGroup.getChildCount()) {
                            break;
                        }
                        TNodeRecyclerView findTargetRecyclerView = findTargetRecyclerView(viewGroup.getChildAt(i));
                        if (findTargetRecyclerView != null && findTargetRecyclerView.getOrientation() == 1) {
                            return findTargetRecyclerView;
                        }
                        i++;
                    }
                } else {
                    return null;
                }
            } else {
                return (TNodeRecyclerView) view;
            }
        } else {
            return (TNodeRecyclerView) ipChange.ipc$dispatch("e7bdddf5", new Object[]{this, view});
        }
    }

    public int getMaxScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75ac4c88", new Object[]{this})).intValue();
        }
        ScrollViewComponent scrollViewComponent = this.component;
        if (scrollViewComponent == null || scrollViewComponent.getMaxScrollOffsetFromParams() <= 0) {
            return 0;
        }
        return getMaxScrollYOffset(this.component.getMaxScrollOffsetFromParams());
    }

    public int getScrollState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("199fa08", new Object[]{this})).intValue();
        }
        return this.scrollState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.handler.removeCallbacks(this.scrollStateChecker);
        this.lastScrollUp = -1L;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.mHaveHideKeyBoard = false;
        }
        if (!this.scrollHelper.b(motionEvent)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            tfs.d(e.getMessage());
            return false;
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        TNodeRecyclerView findTargetRecyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6d8986", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
            return;
        }
        int maxScrollOffset = getMaxScrollOffset();
        if (i2 > maxScrollOffset) {
            i2 = maxScrollOffset;
        }
        if (getScrollY() != maxScrollOffset || (findTargetRecyclerView = findTargetRecyclerView(this)) == null || !findTargetRecyclerView.canScrollVertically(-1) || i2 >= maxScrollOffset) {
            maxScrollOffset = i2;
        }
        super.scrollTo(i, maxScrollOffset);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        List<ScrollChangeListener> list = this.mScrollChangedListener;
        if (list != null) {
            for (ScrollChangeListener scrollChangeListener : list) {
                scrollChangeListener.onScroll(i, i2, i - i3, i2 - i4);
            }
            if (this.lastScrollUp == -1) {
                this.scrollState = 1;
                for (ScrollChangeListener scrollChangeListener2 : this.mScrollChangedListener) {
                    scrollChangeListener2.onScrollStateChanged(1, 0);
                }
                this.handler.postDelayed(this.scrollStateChecker, 200L);
            } else {
                this.handler.removeCallbacks(this.scrollStateChecker);
                this.handler.postDelayed(this.scrollStateChecker, 200L);
            }
            this.lastScrollUp = System.currentTimeMillis();
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o3g o3gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 2 && "drag".equals(this.keyBoardDismissMode) && !this.mHaveHideKeyBoard && (o3gVar = this.mKeyBoardDismissListener) != null) {
            o3gVar.onKeyBoardNeedDismiss(getContext());
            this.mHaveHideKeyBoard = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeScrollChangedListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d901aaf", new Object[]{this, scrollChangeListener});
            return;
        }
        List<ScrollChangeListener> list = this.mScrollChangedListener;
        if (list != null) {
            list.remove(scrollChangeListener);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2625ad52", new Object[]{this, view, view2});
        }
    }

    public void setKeyBoardDismissListener(o3g o3gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca9ce5b", new Object[]{this, o3gVar});
        } else {
            this.mKeyBoardDismissListener = o3gVar;
        }
    }

    public void setKeyBoardDismissMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a1a8d5", new Object[]{this, str});
        } else {
            this.keyBoardDismissMode = str;
        }
    }

    public void setScrollComponent(ScrollViewComponent scrollViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c45af4", new Object[]{this, scrollViewComponent});
        } else {
            this.component = scrollViewComponent;
        }
    }

    public AbsTNodeScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsTNodeScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
