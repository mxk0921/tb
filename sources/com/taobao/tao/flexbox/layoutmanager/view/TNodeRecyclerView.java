package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaFlexDirection;
import com.taobao.tao.flexbox.layoutmanager.component.ListViewComponent;
import com.taobao.tao.flexbox.layoutmanager.module.element.ScrollChangeListener;
import com.taobao.tao.flexbox.layoutmanager.uikit.pullrefresh.FakeHeaderView;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.ArrayList;
import java.util.List;
import tb.akt;
import tb.azo;
import tb.bk2;
import tb.i5c;
import tb.nwv;
import tb.o3g;
import tb.s6o;
import tb.t2o;
import tb.w2w;
import tb.ytn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TNodeRecyclerView extends TRecyclerView implements View.OnTouchListener, i5c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEYBOARD_DISMISS_MODE_DRAG = "drag";
    public static final int RECYCLER_MOVE_OFFSET_FLAG = 16;
    private boolean disableTouch;
    private String keyBoardDismissMode;
    private ListViewComponent listViewComponent;
    private int mDownRawX;
    private int mDownRawY;
    public boolean mEnableNestedSlide;
    private o3g mKeyBoardDismissListener;
    public float mLastDispatchDownX;
    public float mLastDispatchDownY;
    private boolean needResetOffsetInWindow;
    private float fadingEdgeStart = 0.0f;
    private float fadingEdgeEnd = 0.0f;
    private float mX = 0.0f;
    private float mY = 0.0f;
    private float lastX = 0.0f;
    private float lastY = 0.0f;
    private float mDy = 0.0f;
    private float mMoveY = 0.0f;
    private float mDx = 0.0f;
    private boolean inTouch = false;
    private boolean isScrollUp = false;
    private boolean isScrolling = false;
    private int totalY = 0;
    private int totalX = 0;
    private boolean isInSlowScroll = true;
    private boolean hookTouchEvent = true;
    private boolean enableEdgeEffect = false;
    private boolean firstOnScrollIgnored = false;
    private List<ScrollChangeListener> scrollListeners = new ArrayList();
    private List<w2w> velocityTrackListeners = new ArrayList();
    private boolean mHaveHideKeyBoard = false;
    private int minScrollY = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final azo f12399a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements w2w {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(TNodeRecyclerView tNodeRecyclerView) {
            }

            @Override // tb.w2w
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b7bea48f", new Object[]{this});
                    return;
                }
                TNodeRecyclerView.access$102(TNodeRecyclerView.this, false);
                TNodeRecyclerView.access$200(TNodeRecyclerView.this);
            }

            @Override // tb.w2w
            public void d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3d695bb4", new Object[]{this});
                    return;
                }
                TNodeRecyclerView.access$102(TNodeRecyclerView.this, true);
                TNodeRecyclerView.access$300(TNodeRecyclerView.this);
            }

            @Override // tb.w2w
            public void g(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e1a47724", new Object[]{this, new Integer(i)});
                } else {
                    TNodeRecyclerView.access$000(TNodeRecyclerView.this, i);
                }
            }
        }

        static {
            t2o.a(503317510);
            t2o.a(503317522);
        }

        public ScrollListener() {
            this.f12399a = new azo(TNodeRecyclerView.this.getContext());
            b(new a(TNodeRecyclerView.this));
        }

        public static /* synthetic */ Object ipc$super(ScrollListener scrollListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/TNodeRecyclerView$ScrollListener");
        }

        public void b(w2w w2wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21c96325", new Object[]{this, w2wVar});
            } else {
                this.f12399a.h(w2wVar);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            if (i == 1) {
                TNodeRecyclerView.access$402(TNodeRecyclerView.this, true);
            } else if (i == 0) {
                this.f12399a.d();
                TNodeRecyclerView.access$402(TNodeRecyclerView.this, false);
                TNodeRecyclerView.access$502(TNodeRecyclerView.this, 0.0f);
                TNodeRecyclerView.access$602(TNodeRecyclerView.this, 0.0f);
            }
            if (TNodeRecyclerView.access$700(TNodeRecyclerView.this) != null) {
                TNodeRecyclerView.access$700(TNodeRecyclerView.this).F1(i);
                if (!TNodeRecyclerView.access$800(TNodeRecyclerView.this) && i == 0) {
                    TNodeRecyclerView.access$700(TNodeRecyclerView.this).G1();
                }
            }
            if (akt.E()) {
                if (TNodeRecyclerView.access$700(TNodeRecyclerView.this).getViewParams().v != YogaFlexDirection.ROW ? TNodeRecyclerView.this.computeVerticalScrollOffset() > 0 : TNodeRecyclerView.this.computeHorizontalScrollOffset() > 0) {
                    i2 = 16;
                }
                for (ScrollChangeListener scrollChangeListener : TNodeRecyclerView.access$900(TNodeRecyclerView.this)) {
                    scrollChangeListener.onScrollStateChanged(i, i2);
                }
                return;
            }
            for (ScrollChangeListener scrollChangeListener2 : TNodeRecyclerView.access$900(TNodeRecyclerView.this)) {
                scrollChangeListener2.onScrollStateChanged(i, 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            View M1;
            int i3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            if (i2 == 1 && !TNodeRecyclerView.access$1000(TNodeRecyclerView.this) && akt.K0()) {
                View childAt = recyclerView.getChildAt(0);
                if ((childAt instanceof ViewGroup) && (((ViewGroup) childAt).getChildAt(0) instanceof FakeHeaderView)) {
                    TNodeRecyclerView.access$1002(TNodeRecyclerView.this, true);
                    return;
                }
            }
            this.f12399a.c(i2);
            TNodeRecyclerView tNodeRecyclerView = TNodeRecyclerView.this;
            if (i2 > 0) {
                z = true;
            } else {
                z = false;
            }
            TNodeRecyclerView.access$1102(tNodeRecyclerView, z);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int[] findVisibleItemPositionRange = TNodeRecyclerView.this.findVisibleItemPositionRange(true);
            int i4 = findVisibleItemPositionRange[0];
            int i5 = findVisibleItemPositionRange[1];
            TNodeRecyclerView tNodeRecyclerView2 = TNodeRecyclerView.this;
            TNodeRecyclerView.access$1202(tNodeRecyclerView2, TNodeRecyclerView.access$1200(tNodeRecyclerView2) + i);
            TNodeRecyclerView tNodeRecyclerView3 = TNodeRecyclerView.this;
            TNodeRecyclerView.access$1302(tNodeRecyclerView3, TNodeRecyclerView.access$1300(tNodeRecyclerView3) + i2);
            if (TNodeRecyclerView.access$1200(TNodeRecyclerView.this) < 0) {
                TNodeRecyclerView.access$1202(TNodeRecyclerView.this, 0);
            } else if (i4 == 0 && layoutManager.getChildCount() > 0) {
                TRecyclerView tRecyclerView = (TRecyclerView) recyclerView;
                if (tRecyclerView.getHeaderViewsCount() > 0) {
                    i3 = tRecyclerView.getHeaderViewsCount();
                } else {
                    i3 = 0;
                }
                if (layoutManager.getChildCount() > i3 && layoutManager.getChildAt(i3).getLeft() > 0) {
                    TNodeRecyclerView.access$1202(TNodeRecyclerView.this, 0);
                }
            }
            if (TNodeRecyclerView.access$1300(TNodeRecyclerView.this) < 0) {
                TNodeRecyclerView.access$1302(TNodeRecyclerView.this, 0);
            } else if (i4 == 0 && TNodeRecyclerView.access$700(TNodeRecyclerView.this) != null && (M1 = TNodeRecyclerView.access$700(TNodeRecyclerView.this).M1(0)) != null && M1.getTop() >= 0) {
                TNodeRecyclerView.access$1302(TNodeRecyclerView.this, 0);
            }
            if (TNodeRecyclerView.access$700(TNodeRecyclerView.this) != null) {
                TNodeRecyclerView.access$700(TNodeRecyclerView.this).E1(i4, i5, i2, TNodeRecyclerView.access$1400(TNodeRecyclerView.this), recyclerView.getScrollState(), TNodeRecyclerView.access$1500(TNodeRecyclerView.this));
            }
            for (ScrollChangeListener scrollChangeListener : TNodeRecyclerView.access$900(TNodeRecyclerView.this)) {
                scrollChangeListener.onScroll(TNodeRecyclerView.access$1200(TNodeRecyclerView.this), TNodeRecyclerView.access$1300(TNodeRecyclerView.this), i, i2);
            }
        }
    }

    static {
        t2o.a(503317509);
        t2o.a(503316910);
    }

    public TNodeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public static /* synthetic */ void access$000(TNodeRecyclerView tNodeRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327b4a52", new Object[]{tNodeRecyclerView, new Integer(i)});
        } else {
            tNodeRecyclerView.fireVelocityChanged(i);
        }
    }

    public static /* synthetic */ boolean access$1000(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("286e3406", new Object[]{tNodeRecyclerView})).booleanValue();
        }
        return tNodeRecyclerView.firstOnScrollIgnored;
    }

    public static /* synthetic */ boolean access$1002(TNodeRecyclerView tNodeRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cdbf698", new Object[]{tNodeRecyclerView, new Boolean(z)})).booleanValue();
        }
        tNodeRecyclerView.firstOnScrollIgnored = z;
        return z;
    }

    public static /* synthetic */ boolean access$102(TNodeRecyclerView tNodeRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db50112a", new Object[]{tNodeRecyclerView, new Boolean(z)})).booleanValue();
        }
        tNodeRecyclerView.isInSlowScroll = z;
        return z;
    }

    public static /* synthetic */ boolean access$1102(TNodeRecyclerView tNodeRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e2d8619", new Object[]{tNodeRecyclerView, new Boolean(z)})).booleanValue();
        }
        tNodeRecyclerView.isScrollUp = z;
        return z;
    }

    public static /* synthetic */ int access$1200(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("614a2cb3", new Object[]{tNodeRecyclerView})).intValue();
        }
        return tNodeRecyclerView.totalX;
    }

    public static /* synthetic */ int access$1202(TNodeRecyclerView tNodeRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f7ed5b8", new Object[]{tNodeRecyclerView, new Integer(i)})).intValue();
        }
        tNodeRecyclerView.totalX = i;
        return i;
    }

    public static /* synthetic */ int access$1300(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdb82912", new Object[]{tNodeRecyclerView})).intValue();
        }
        return tNodeRecyclerView.totalY;
    }

    public static /* synthetic */ int access$1302(TNodeRecyclerView tNodeRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70d06539", new Object[]{tNodeRecyclerView, new Integer(i)})).intValue();
        }
        tNodeRecyclerView.totalY = i;
        return i;
    }

    public static /* synthetic */ float access$1400(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a26256e", new Object[]{tNodeRecyclerView})).floatValue();
        }
        return tNodeRecyclerView.mDy;
    }

    public static /* synthetic */ float access$1500(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("369421cd", new Object[]{tNodeRecyclerView})).floatValue();
        }
        return tNodeRecyclerView.mMoveY;
    }

    public static /* synthetic */ void access$200(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d117b8f", new Object[]{tNodeRecyclerView});
        } else {
            tNodeRecyclerView.fireScrollFast();
        }
    }

    public static /* synthetic */ void access$300(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297f77ee", new Object[]{tNodeRecyclerView});
        } else {
            tNodeRecyclerView.fireScrollSlow();
        }
    }

    public static /* synthetic */ boolean access$402(TNodeRecyclerView tNodeRecyclerView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af44bfad", new Object[]{tNodeRecyclerView, new Boolean(z)})).booleanValue();
        }
        tNodeRecyclerView.isScrolling = z;
        return z;
    }

    public static /* synthetic */ float access$502(TNodeRecyclerView tNodeRecyclerView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0960406", new Object[]{tNodeRecyclerView, new Float(f)})).floatValue();
        }
        tNodeRecyclerView.lastX = f;
        return f;
    }

    public static /* synthetic */ float access$602(TNodeRecyclerView tNodeRecyclerView, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91e79387", new Object[]{tNodeRecyclerView, new Float(f)})).floatValue();
        }
        tNodeRecyclerView.lastY = f;
        return f;
    }

    public static /* synthetic */ ListViewComponent access$700(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListViewComponent) ipChange.ipc$dispatch("ba390e7c", new Object[]{tNodeRecyclerView});
        }
        return tNodeRecyclerView.listViewComponent;
    }

    public static /* synthetic */ boolean access$800(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37a565cd", new Object[]{tNodeRecyclerView})).booleanValue();
        }
        return tNodeRecyclerView.inTouch;
    }

    public static /* synthetic */ List access$900(TNodeRecyclerView tNodeRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("79ccdb1f", new Object[]{tNodeRecyclerView});
        }
        return tNodeRecyclerView.scrollListeners;
    }

    private boolean checkCanScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("704f3883", new Object[]{this})).booleanValue();
        }
        if (!(getLayoutManager() instanceof LinearLayoutManager) || !getLayoutManager().canScrollVertically()) {
            return false;
        }
        return true;
    }

    private boolean checkSlideEndVertically(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e335588", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (!(getLayoutManager() instanceof LinearLayoutManager) || getLayoutManager().getChildCount() == 0) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0 && canScrollVertically(1) && f > this.mLastDispatchDownY) {
            return true;
        }
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1 || !canScrollVertically(-1) || f >= this.mLastDispatchDownY) {
            return false;
        }
        return true;
    }

    private void fireScrollFast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b89a8a6", new Object[]{this});
            return;
        }
        for (w2w w2wVar : this.velocityTrackListeners) {
            w2wVar.c();
        }
    }

    private void fireScrollSlow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21345fcb", new Object[]{this});
            return;
        }
        for (w2w w2wVar : this.velocityTrackListeners) {
            w2wVar.d();
        }
    }

    private void fireVelocityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacbcdfb", new Object[]{this, new Integer(i)});
            return;
        }
        for (w2w w2wVar : this.velocityTrackListeners) {
            w2wVar.g(i);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setOnTouchListener(this);
        addOnScrollListener(new ScrollListener());
        ytn.f(RecyclerView.class, "mMaxFlingVelocity", this, Integer.valueOf(s6o.c(getContext(), 4000)));
    }

    public static /* synthetic */ Object ipc$super(TNodeRecyclerView tNodeRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1770652179:
                return new Float(super.getTopFadingEdgeStrength());
            case -1708092539:
                return new Boolean(super.dispatchNestedPreScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (int[]) objArr[2], (int[]) objArr[3], ((Number) objArr[4]).intValue()));
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1228744384:
                return new Boolean(super.canScrollVertically(((Number) objArr[0]).intValue()));
            case -886384698:
                return new Boolean(super.dispatchNestedPreScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (int[]) objArr[2], (int[]) objArr[3]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 316357487:
                return new Float(super.getBottomFadingEdgeStrength());
            case 570946804:
                return new Float(super.getRightFadingEdgeStrength());
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1162030921:
                super.setClipToPadding(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 2041665995:
                return new Float(super.getLeftFadingEdgeStrength());
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/view/TNodeRecyclerView");
        }
    }

    public void addScrollChangeListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb3f78a", new Object[]{this, scrollChangeListener});
        } else if (scrollChangeListener != null && !this.scrollListeners.contains(scrollChangeListener)) {
            this.scrollListeners.add(scrollChangeListener);
        }
    }

    public void addVelocityChangeListener(w2w w2wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7218ba", new Object[]{this, w2wVar});
        } else if (w2wVar != null && !this.velocityTrackListeners.contains(w2wVar)) {
            this.velocityTrackListeners.add(w2wVar);
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        boolean canScrollVertically = super.canScrollVertically(i);
        if (!canScrollVertically && (i2 = this.minScrollY) > 0 && i < 0) {
            scrollBy(0, i2);
        }
        return canScrollVertically;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb2ad7c6", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2})).booleanValue();
        }
        boolean dispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        if (iArr2 != null && this.needResetOffsetInWindow) {
            iArr2[1] = 0;
        }
        return dispatchNestedPreScroll;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r3 != 3) goto L_0x0086;
     */
    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "7bb68bd5"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            boolean r3 = r5.mEnableNestedSlide
            if (r3 == 0) goto L_0x0086
            boolean r3 = tb.akt.U0()
            if (r3 == 0) goto L_0x0086
            boolean r3 = r5.checkCanScrollVertically()
            if (r3 == 0) goto L_0x0086
            int r3 = r6.getAction()
            if (r3 == 0) goto L_0x007a
            if (r3 == r0) goto L_0x0072
            if (r3 == r2) goto L_0x003a
            r0 = 3
            if (r3 == r0) goto L_0x0072
            goto L_0x0086
        L_0x003a:
            float r2 = r6.getY()
            float r3 = r6.getX()
            float r4 = r5.mLastDispatchDownY
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            float r4 = r5.mLastDispatchDownX
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            float r3 = java.lang.Math.abs(r3)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            float r2 = r6.getY()
            boolean r2 = r5.checkSlideEndVertically(r2)
            if (r2 == 0) goto L_0x006a
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0086
        L_0x006a:
            android.view.ViewParent r1 = r5.getParent()
            r1.requestDisallowInterceptTouchEvent(r0)
            goto L_0x0086
        L_0x0072:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0086
        L_0x007a:
            float r0 = r6.getX()
            r5.mLastDispatchDownX = r0
            float r0 = r6.getY()
            r5.mLastDispatchDownY = r0
        L_0x0086:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void enableEdgeEffect(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9adc66b", new Object[]{this, new Integer(i)});
            return;
        }
        this.enableEdgeEffect = true;
        ListViewComponent listViewComponent = this.listViewComponent;
        if (listViewComponent != null) {
            try {
                if (nwv.W(listViewComponent.getNode().P())) {
                    if (i != 1) {
                        z = false;
                    }
                    bk2.a(this, z);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void enableNestedSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4507e27e", new Object[]{this});
        } else {
            this.mEnableNestedSlide = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] findVisibleItemPositionRange(boolean r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001d
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r10)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r0] = r9
            r10[r2] = r4
            java.lang.String r0 = "66daff1f"
            java.lang.Object r10 = r3.ipc$dispatch(r0, r10)
            int[] r10 = (int[]) r10
            return r10
        L_0x001d:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r9.getLayoutManager()
            boolean r4 = r3 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r4 == 0) goto L_0x0032
            androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
            int r4 = r3.findFirstVisibleItemPosition()
            if (r10 == 0) goto L_0x0076
            int r10 = r3.findLastVisibleItemPosition()
            goto L_0x0077
        L_0x0032:
            boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0043
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            int r4 = r3.findFirstVisibleItemPosition()
            if (r10 == 0) goto L_0x0076
            int r10 = r3.findLastVisibleItemPosition()
            goto L_0x0077
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r3
            r4 = 0
            int[] r5 = r3.findFirstVisibleItemPositions(r4)
            r6 = r5[r0]
            r7 = 1
        L_0x004d:
            int r8 = r3.getSpanCount()
            if (r7 >= r8) goto L_0x005b
            r8 = r5[r7]
            int r6 = java.lang.Math.min(r6, r8)
            int r7 = r7 + r2
            goto L_0x004d
        L_0x005b:
            if (r10 == 0) goto L_0x0075
            int[] r10 = r3.findLastVisibleItemPositions(r4)
            r4 = r10[r0]
            r5 = 1
        L_0x0064:
            int r7 = r3.getSpanCount()
            if (r5 >= r7) goto L_0x0072
            r7 = r10[r5]
            int r4 = java.lang.Math.max(r4, r7)
            int r5 = r5 + r2
            goto L_0x0064
        L_0x0072:
            r10 = r4
            r4 = r6
            goto L_0x0077
        L_0x0075:
            r4 = r6
        L_0x0076:
            r10 = 0
        L_0x0077:
            int[] r1 = new int[r1]
            r1[r0] = r4
            r1[r2] = r10
            int r10 = r9.getHeaderViewsCount()
            if (r10 <= 0) goto L_0x0095
            r3 = r1[r0]
            if (r3 <= 0) goto L_0x0090
            int r3 = r3 - r10
            r1[r0] = r3
            r0 = r1[r2]
            int r0 = r0 - r10
            r1[r2] = r0
            goto L_0x0095
        L_0x0090:
            r0 = r1[r2]
            int r0 = r0 - r10
            r1[r2] = r0
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView.findVisibleItemPositionRange(boolean):int[]");
    }

    public void fireNestScrollEvent(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64ebc06", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        for (ScrollChangeListener scrollChangeListener : this.scrollListeners) {
            scrollChangeListener.onNestScroll(i, i2, i3, i4);
        }
        this.listViewComponent.D1(i2, i4);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12db3b6f", new Object[]{this})).floatValue();
        }
        if (this.fadingEdgeEnd > 0.0f) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79b159cb", new Object[]{this})).floatValue();
        }
        if (this.fadingEdgeStart > 0.0f) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2207f4f4", new Object[]{this})).floatValue();
        }
        if (this.fadingEdgeEnd > 0.0f) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9675fded", new Object[]{this})).floatValue();
        }
        if (this.fadingEdgeStart > 0.0f) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    public int getTotalX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3b1e004", new Object[]{this})).intValue();
        }
        return this.totalX;
    }

    public int getTotalY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3bff785", new Object[]{this})).intValue();
        }
        return this.totalY;
    }

    public boolean isFirstItemFullVisible() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb7d0d5", new Object[]{this})).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (findVisibleItemPositionRange(false)[0] != 0 || layoutManager.getChildCount() <= 0) {
            return false;
        }
        if (getHeaderViewsCount() > 0) {
            i = getHeaderViewsCount();
        } else {
            i = 0;
        }
        if (layoutManager.getChildCount() <= i || layoutManager.getChildAt(i).getTop() < 0) {
            return false;
        }
        return true;
    }

    public boolean isInSLowScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbdb9768", new Object[]{this})).booleanValue();
        }
        return this.isInSlowScroll;
    }

    public boolean isScrollUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9a9851d", new Object[]{this})).booleanValue();
        }
        return this.isScrollUp;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        ListViewComponent listViewComponent = this.listViewComponent;
        if (listViewComponent != null) {
            listViewComponent.W1();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        o3g o3gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disableTouch) {
            return false;
        }
        if (this.hookTouchEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mHaveHideKeyBoard = false;
                this.mDownRawX = (int) motionEvent.getRawX();
                this.mDownRawY = (int) motionEvent.getRawY();
                if ("drag".equals(this.keyBoardDismissMode) && !akt.u() && (o3gVar = this.mKeyBoardDismissListener) != null) {
                    o3gVar.onKeyBoardNeedDismiss(getContext());
                }
            } else if (action == 2) {
                int rawY = (int) motionEvent.getRawY();
                int rawX = (int) motionEvent.getRawX();
                if (getOrientation() == 1 && Math.abs(rawX - this.mDownRawX) > Math.abs(Math.abs(rawY - this.mDownRawY))) {
                    return false;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.enableEdgeEffect) {
            enableEdgeEffect(getOrientation());
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        ListViewComponent listViewComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        this.mX = motionEvent.getRawX();
        this.mY = motionEvent.getRawY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 2) {
            z = true;
        } else {
            z = false;
        }
        this.inTouch = z;
        int action = motionEvent.getAction();
        if (action == 1) {
            this.mDx = 0.0f;
            this.mDy = 0.0f;
            this.lastY = 0.0f;
            this.lastX = 0.0f;
            this.mMoveY = 0.0f;
            if (getScrollState() == 0) {
                this.listViewComponent.G1();
            }
        } else if (action == 2) {
            if (this.lastX == 0.0f) {
                this.lastX = this.mX;
            }
            if (this.lastY == 0.0f) {
                this.lastY = this.mY;
            }
            float f = this.mX;
            this.mDx = f - this.lastX;
            float f2 = this.mY;
            this.mDy = f2 - this.lastY;
            this.mMoveY = f2 - this.mDownRawY;
            this.lastX = f;
            this.lastY = f2;
            if (getOrientation() == 1 && !canScrollVertically(-1)) {
                float f3 = this.mDy;
                if (f3 > 0.0f && (listViewComponent = this.listViewComponent) != null) {
                    listViewComponent.H1(f3);
                }
            }
        }
        return false;
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o3g o3gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disableTouch) {
            return false;
        }
        if (motionEvent.getAction() == 2 && "drag".equals(this.keyBoardDismissMode) && akt.u() && !this.mHaveHideKeyBoard && (o3gVar = this.mKeyBoardDismissListener) != null) {
            o3gVar.onKeyBoardNeedDismiss(getContext());
            this.mHaveHideKeyBoard = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeScrollChangeListener(ScrollChangeListener scrollChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8526ad", new Object[]{this, scrollChangeListener});
        } else {
            this.scrollListeners.remove(scrollChangeListener);
        }
    }

    public void removeVelocityChangeListener(w2w w2wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dff74dd", new Object[]{this, w2wVar});
        } else {
            this.velocityTrackListeners.remove(w2wVar);
        }
    }

    public void resetTotal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7bba93c", new Object[]{this});
            return;
        }
        this.totalX = 0;
        this.totalY = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45432f49", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setClipToPadding(z);
        if (this.enableEdgeEffect) {
            enableEdgeEffect(getOrientation());
        }
    }

    public void setComponent(ListViewComponent listViewComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38953d92", new Object[]{this, listViewComponent});
        } else {
            this.listViewComponent = listViewComponent;
        }
    }

    public void setDisableTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b3a014", new Object[]{this, new Boolean(z)});
        } else {
            this.disableTouch = z;
        }
    }

    @Override // tb.i5c
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
        } else if (iArr != null) {
            float f = iArr[0];
            this.fadingEdgeStart = f;
            float f2 = iArr[1];
            this.fadingEdgeEnd = f2;
            int max = (int) Math.max(f, f2);
            if (max > 0) {
                setFadingEdgeLength(max);
                if (getOrientation() == 1) {
                    setVerticalFadingEdgeEnabled(true);
                } else {
                    setHorizontalFadingEdgeEnabled(true);
                }
            }
        }
    }

    public void setHookTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42dbea0d", new Object[]{this, new Boolean(z)});
        } else {
            this.hookTouchEvent = z;
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

    public void setMinScrollY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ee2260", new Object[]{this, new Integer(i)});
        } else {
            this.minScrollY = i;
        }
    }

    public void setNeedResetOffsetInWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4760136e", new Object[]{this, new Boolean(z)});
        } else {
            this.needResetOffsetInWindow = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a309385", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2, new Integer(i3)})).booleanValue();
        }
        boolean dispatchNestedPreScroll = super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        if (iArr2 != null && this.needResetOffsetInWindow) {
            iArr2[1] = 0;
        }
        return dispatchNestedPreScroll;
    }

    public TNodeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TNodeRecyclerView(Context context) {
        super(context);
        init();
    }
}
