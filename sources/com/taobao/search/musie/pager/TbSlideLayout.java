package com.taobao.search.musie.pager;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.search.musie.pager.TbSlideLayout;
import java.util.List;
import tb.bia;
import tb.ckf;
import tb.hfn;
import tb.mxh;
import tb.t2o;
import tb.xqd;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TbSlideLayout extends FrameLayout implements NestedScrollingParent2, xqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TbSlideAdapter adapter;
    private ValueAnimator bounceAnim;
    private final SlideDivider divider;
    private boolean footerOverInvoke;
    private float footerTranslation;
    private MUSView footerView;
    private final float fraction = 0.3f;
    private boolean hasRequested;
    private MUSDKInstance instance;
    private int invokeDistance;
    private int maxDragDistance;
    private boolean nestedScrolling;
    private TbSlide node;
    private final RecyclerView recyclerView;
    private final SlideSnapHelper snapHelper;
    private boolean touching;

    static {
        t2o.a(815792767);
        t2o.a(815792755);
    }

    public TbSlideLayout(Context context) {
        super(context);
        RecyclerView recyclerView = new RecyclerView(context);
        this.recyclerView = recyclerView;
        SlideSnapHelper slideSnapHelper = new SlideSnapHelper(this);
        this.snapHelper = slideSnapHelper;
        SlideDivider slideDivider = new SlideDivider();
        this.divider = slideDivider;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.addItemDecoration(slideDivider);
        addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        ViewCompat.setNestedScrollingEnabled(recyclerView, true);
        slideSnapHelper.attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.search.musie.pager.TbSlideLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/pager/TbSlideLayout$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView2, new Integer(i), new Integer(i2)});
                } else {
                    TbSlideLayout.access$checkMountState(TbSlideLayout.this);
                }
            }
        });
    }

    public static final /* synthetic */ void access$checkMountState(TbSlideLayout tbSlideLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ed56f5", new Object[]{tbSlideLayout});
        } else {
            tbSlideLayout.checkMountState();
        }
    }

    private final void checkMountState() {
        SlideViewHolder slideViewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86984ba7", new Object[]{this});
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = this.recyclerView.getChildViewHolder(layoutManager.getChildAt(i));
            if (childViewHolder instanceof SlideViewHolder) {
                slideViewHolder = (SlideViewHolder) childViewHolder;
            } else {
                slideViewHolder = null;
            }
            if (slideViewHolder != null) {
                slideViewHolder.c0();
            }
        }
    }

    private final void checkStateChange() {
        TbSlide tbSlide;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b34180", new Object[]{this});
            return;
        }
        if (this.footerTranslation <= (-this.invokeDistance)) {
            z = true;
        }
        if (!(z == this.footerOverInvoke || (tbSlide = this.node) == null)) {
            tbSlide.onStateChange(z);
        }
        this.footerOverInvoke = z;
    }

    private final void consume(int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810077ee", new Object[]{this, new Integer(i), iArr});
            return;
        }
        if (i < 0) {
            i = hfn.f((int) Math.abs(this.footerTranslation / this.fraction), i);
        }
        if (iArr != null) {
            iArr[0] = i;
        }
        float f = this.footerTranslation - (i * this.fraction);
        this.footerTranslation = f;
        int i2 = this.maxDragDistance;
        if (f < (-i2)) {
            this.footerTranslation = -i2;
        } else if (f > 0.0f) {
            this.footerTranslation = 0.0f;
        }
        updateTranslation();
    }

    public static /* synthetic */ Object ipc$super(TbSlideLayout tbSlideLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/pager/TbSlideLayout");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStopNestedScroll$lambda$1(TbSlideLayout tbSlideLayout, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f304edd2", new Object[]{tbSlideLayout, valueAnimator});
            return;
        }
        ckf.g(tbSlideLayout, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        ckf.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        tbSlideLayout.footerTranslation = ((Float) animatedValue).floatValue();
        tbSlideLayout.updateTranslation();
    }

    private final void updateFooter(TbSlideFooter tbSlideFooter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2da2780", new Object[]{this, tbSlideFooter});
        } else if (tbSlideFooter == null) {
            MUSView mUSView = this.footerView;
            if (mUSView != null) {
                mUSView.release(true);
            }
        } else {
            ywh ywhVar = new ywh();
            ywhVar.e(tbSlideFooter);
            MUSView mUSView2 = this.footerView;
            if (mUSView2 != null) {
                mUSView2.setUiNodeTree(ywhVar);
            }
        }
    }

    private final void updateTranslation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc776aaf", new Object[]{this});
            return;
        }
        this.recyclerView.setTranslationX(this.footerTranslation);
        MUSView mUSView = this.footerView;
        if (mUSView != null) {
            mUSView.setTranslationX(this.recyclerView.getMeasuredWidth() + this.footerTranslation);
        }
        checkStateChange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        ckf.d(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touching = true;
        } else if (action == 1 || action == 3) {
            this.touching = false;
        }
        if (this.nestedScrolling) {
            if (!this.hasRequested) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.hasRequested = true;
            }
        } else if (this.hasRequested) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.hasRequested = false;
        }
        return dispatchTouchEvent;
    }

    public final boolean isTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue();
        }
        return this.touching;
    }

    public final void mount(TbSlide tbSlide) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f281e6", new Object[]{this, tbSlide});
            return;
        }
        ckf.g(tbSlide, "node");
        MUSDKInstance instance = tbSlide.getInstance();
        this.instance = instance;
        MUSView a2 = mxh.a(instance);
        this.footerView = a2;
        ckf.d(a2);
        a2.setRoot(false);
        addView(this.footerView);
        MUSDKInstance instance2 = tbSlide.getInstance();
        ckf.f(instance2, "getInstance(...)");
        TbSlideAdapter tbSlideAdapter = new TbSlideAdapter(instance2);
        this.adapter = tbSlideAdapter;
        this.recyclerView.setAdapter(tbSlideAdapter);
        this.node = tbSlide;
    }

    @Override // tb.xqd
    public void onItemSelected(int i) {
        TbSlide tbSlide;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb34d2f", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && (tbSlide = this.node) != null) {
            tbSlide.onItemSelected(i);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        updateTranslation();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(view, "child");
        ckf.g(view2, "target");
    }

    public final void refresh(List<? extends ywh> list, TbSlideFooter tbSlideFooter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce230bf8", new Object[]{this, list, tbSlideFooter});
            return;
        }
        ckf.g(list, bia.UNDER_TAKE_GOODS_LIST);
        TbSlideAdapter tbSlideAdapter = this.adapter;
        if (tbSlideAdapter != null) {
            tbSlideAdapter.P(list);
        }
        updateFooter(tbSlideFooter);
    }

    public final void refreshItems(List<ywh> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa2d49d", new Object[]{this, list});
            return;
        }
        ckf.g(list, "nodeTreeList");
        TbSlideAdapter tbSlideAdapter = this.adapter;
        if (tbSlideAdapter != null) {
            tbSlideAdapter.P(list);
        }
    }

    public final void scrollToPosition(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add7cda9", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (z) {
            this.recyclerView.smoothScrollToPosition(i);
        } else {
            this.recyclerView.scrollToPosition(i);
        }
    }

    public final void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        TbSlideAdapter tbSlideAdapter = this.adapter;
        if (tbSlideAdapter != null) {
            tbSlideAdapter.Q();
        }
        this.recyclerView.setAdapter(null);
        MUSView mUSView = this.footerView;
        if (mUSView != null) {
            mUSView.release(true);
            this.footerView = null;
        }
        this.footerTranslation = 0.0f;
        this.node = null;
    }

    public final void updateInvokeDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8657f366", new Object[]{this, new Integer(i)});
            return;
        }
        this.invokeDistance = i;
        checkStateChange();
    }

    public final void updateItemMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e49d52", new Object[]{this, new Integer(i)});
            return;
        }
        this.divider.c(i);
        this.recyclerView.invalidateItemDecorations();
        this.snapHelper.d(i);
    }

    public final void updateItemSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d76295", new Object[]{this, new Integer(i)});
            return;
        }
        this.divider.d(i);
        this.recyclerView.invalidateItemDecorations();
    }

    public final void updateMaxDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c445c6c", new Object[]{this, new Integer(i)});
            return;
        }
        this.maxDragDistance = i;
        if (this.footerTranslation < (-i)) {
            this.footerTranslation = -i;
            updateTranslation();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        ckf.g(view, "target");
        ckf.g(iArr, "consumed");
        if (this.footerTranslation < 0.0f) {
            ValueAnimator valueAnimator = this.bounceAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            consume(i, iArr);
            this.nestedScrolling = true;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        ckf.g(view, "target");
        if (i3 > 0 || this.footerTranslation < 0.0f) {
            ValueAnimator valueAnimator = this.bounceAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            consume(i3, null);
            this.nestedScrolling = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        ckf.g(view, "target");
        return this.footerTranslation < 0.0f;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ckf.g(view, "child");
        ckf.g(view2, "target");
        if (i != 1) {
            z = false;
        }
        if (z) {
            ValueAnimator valueAnimator = this.bounceAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.bounceAnim = null;
        }
        return z;
    }

    public final void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        ckf.e(layoutManager, "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        SimpleScroller simpleScroller = new SimpleScroller(this.recyclerView.getContext(), this.divider.a());
        simpleScroller.setTargetPosition(i);
        ((LinearLayoutManager) layoutManager).startSmoothScroll(simpleScroller);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
            return;
        }
        ckf.g(view, "target");
        if (this.footerTranslation < 0.0f) {
            ValueAnimator valueAnimator = this.bounceAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.footerTranslation, 0.0f);
            this.bounceAnim = ofFloat;
            ckf.d(ofFloat);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.wqz
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TbSlideLayout.onStopNestedScroll$lambda$1(TbSlideLayout.this, valueAnimator2);
                }
            });
            ValueAnimator valueAnimator2 = this.bounceAnim;
            ckf.d(valueAnimator2);
            valueAnimator2.start();
            TbSlide tbSlide = this.node;
            if (tbSlide != null) {
                if (this.footerTranslation >= (-this.invokeDistance)) {
                    z = false;
                }
                tbSlide.onBounceBack(z);
            }
        }
        this.nestedScrolling = false;
    }
}
