package com.taobao.ptr.views.recycler;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PtrLayout;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import com.taobao.ptr.views.recycler.accessories.GridSpanSizeLookup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.jk9;
import tb.l2n;
import tb.m2n;
import tb.n2n;
import tb.snf;
import tb.t2o;
import tb.v4n;
import tb.vrk;
import tb.vsn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PtrRecyclerView extends RecyclerView implements v4n, com.taobao.ptr.a, n2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.Adapter mAdapter;
    private l2n mDelegate;
    private boolean mEdgeViewSafeMode;
    private View mEndView;
    private GestureDetector mGestureDetector;
    private boolean mIsDisable;
    private c mItemClickListener;
    private d mItemLongClickListener;
    private Drawable mLoadingDrawable;
    private m2n mLoadingHelper;
    private vrk mOnLastItemVisibleListener;
    private ColorStateList mTextColor;
    private RecyclerView.OnScrollListener onScrollListener;
    private ArrayList<jk9> mStartViewInfos = new ArrayList<>();
    private ArrayList<jk9> mEndViewInfos = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends snf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(RecyclerView recyclerView) {
            super(recyclerView);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/views/recycler/PtrRecyclerView$1");
        }

        @Override // tb.snf
        public boolean a(RecyclerView recyclerView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12e612bb", new Object[]{this, recyclerView, view, new Integer(i), new Long(j)})).booleanValue();
            }
            if (PtrRecyclerView.access$000(PtrRecyclerView.this) == null || !PtrRecyclerView.access$000(PtrRecyclerView.this).a(recyclerView, view, i, j)) {
                return false;
            }
            return true;
        }

        @Override // tb.snf
        public boolean b(RecyclerView recyclerView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c540d19f", new Object[]{this, recyclerView, view, new Integer(i), new Long(j)})).booleanValue();
            }
            if (PtrRecyclerView.access$100(PtrRecyclerView.this) == null || !PtrRecyclerView.access$100(PtrRecyclerView.this).a(recyclerView, view, i, j)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$ptr$PullBase$Mode;

        static {
            int[] iArr = new int[PullBase.Mode.values().length];
            $SwitchMap$com$taobao$ptr$PullBase$Mode = iArr;
            try {
                iArr[PullBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        boolean a(RecyclerView recyclerView, View view, int i, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        boolean a(RecyclerView recyclerView, View view, int i, long j);
    }

    static {
        t2o.a(632291376);
        t2o.a(632291347);
        t2o.a(632291341);
        t2o.a(632291346);
    }

    public PtrRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ c access$000(PtrRecyclerView ptrRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("b77e6a87", new Object[]{ptrRecyclerView});
        }
        return ptrRecyclerView.mItemClickListener;
    }

    public static /* synthetic */ d access$100(PtrRecyclerView ptrRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("758f7382", new Object[]{ptrRecyclerView});
        }
        return ptrRecyclerView.mItemLongClickListener;
    }

    public static /* synthetic */ RecyclerView.Adapter access$200(PtrRecyclerView ptrRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("93f6176d", new Object[]{ptrRecyclerView});
        }
        return ptrRecyclerView.mAdapter;
    }

    public static /* synthetic */ vrk access$300(PtrRecyclerView ptrRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrk) ipChange.ipc$dispatch("6013adeb", new Object[]{ptrRecyclerView});
        }
        return ptrRecyclerView.mOnLastItemVisibleListener;
    }

    private void addGestureDetectorIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddf3248", new Object[]{this});
        } else if (this.mGestureDetector == null) {
            this.mGestureDetector = new GestureDetector(getContext(), new a(this));
        }
    }

    private void addScrollDetectorIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37be2e", new Object[]{this});
        } else if (this.onScrollListener == null) {
            RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.ptr.views.recycler.PtrRecyclerView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r5, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1177043419) {
                        super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                        return null;
                    } else if (hashCode == 1361287682) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/ptr/views/recycler/PtrRecyclerView$2");
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0 && PtrRecyclerView.access$200(PtrRecyclerView.this) != null && PtrRecyclerView.access$200(PtrRecyclerView.this).getItemCount() > 0 && PtrRecyclerView.access$300(PtrRecyclerView.this) != null && vsn.b(PtrRecyclerView.this) == PtrRecyclerView.access$200(PtrRecyclerView.this).getItemCount() - 1) {
                        PtrRecyclerView.access$300(PtrRecyclerView.this).a();
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    } else {
                        super.onScrolled(recyclerView, i, i2);
                    }
                }
            };
            this.onScrollListener = onScrollListener;
            addOnScrollListener(onScrollListener);
        }
    }

    private void applyStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7640f9ea", new Object[]{this});
        } else if (getLayoutManager() != null) {
            setEndLoadingTextColor(this.mTextColor);
            setEndLoadingDrawable(this.mLoadingDrawable);
            setEndLoadingDelegate(this.mDelegate);
        }
    }

    private int indexOfFixedInfos(List<jk9> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c08fb73", new Object[]{this, list, view})).intValue();
        }
        if (list == null || view == null) {
            return 0;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).a() == view.hashCode()) {
                return i;
            }
        }
        return 0;
    }

    public static /* synthetic */ Object ipc$super(PtrRecyclerView ptrRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 1480138640) {
            super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
            return null;
        } else if (hashCode == 1978689528) {
            super.setAdapter((RecyclerView.Adapter) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/ptr/views/recycler/PtrRecyclerView");
        }
    }

    private boolean removeFixedViewInfo(View view, ArrayList<jk9> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee1c5f86", new Object[]{this, view, arrayList})).booleanValue();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jk9 jk9Var = arrayList.get(i);
            if (jk9Var.b() == view) {
                if (view.getParent() == this) {
                    removeView(view);
                }
                if (arrayList.remove(i) == jk9Var) {
                    return true;
                }
            }
        }
        return false;
    }

    private void spanStaggeredGridStartEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7420474", new Object[]{this});
            return;
        }
        spanStaggeredGridViews(this.mStartViewInfos);
        spanStaggeredGridViews(this.mEndViewInfos);
    }

    private void spanStaggeredGridViews(List<jk9> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb6fc7e", new Object[]{this, list});
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (list != null && (layoutManager instanceof StaggeredGridLayoutManager)) {
            for (jk9 jk9Var : list) {
                View b2 = jk9Var.b();
                if (b2 != null) {
                    ViewGroup.LayoutParams layoutParams = b2.getLayoutParams();
                    if (layoutParams == null || !(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                        StaggeredGridLayoutManager.LayoutParams layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-2, -2);
                        layoutParams2.setFullSpan(true);
                        b2.setLayoutParams(layoutParams2);
                    } else {
                        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
                    }
                }
            }
        }
    }

    public void addEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749bffcc", new Object[]{this, view});
        } else if (view != null) {
            jk9 jk9Var = new jk9(view);
            int max = Math.max(this.mEndViewInfos.size(), 0);
            if (this.mEndView != null) {
                max = Math.max(max - 1, 0);
            }
            this.mEndViewInfos.add(max, jk9Var);
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof FixedViewAdapter)) {
                FixedViewAdapter W = new FixedViewAdapter(this.mStartViewInfos, this.mEndViewInfos, this.mAdapter).W(this.mEdgeViewSafeMode);
                this.mAdapter = W;
                super.setAdapter(W);
                return;
            }
            int itemCount = adapter.getItemCount();
            int i = itemCount - 1;
            if (this.mEndView != null) {
                i = Math.max(itemCount - 2, 0);
            }
            this.mAdapter.notifyItemInserted(i);
        }
    }

    public void addStartView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf378ba5", new Object[]{this, view});
        } else if (view != null) {
            this.mStartViewInfos.add(new jk9(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof FixedViewAdapter)) {
                FixedViewAdapter W = new FixedViewAdapter(this.mStartViewInfos, this.mEndViewInfos, this.mAdapter).W(this.mEdgeViewSafeMode);
                this.mAdapter = W;
                super.setAdapter(W);
                return;
            }
            adapter.notifyItemInserted(this.mStartViewInfos.size() - 1);
        }
    }

    public final void disableEndPullFeature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a378d3cf", new Object[]{this, new Boolean(z)});
        } else if (z) {
            onDisable();
        } else {
            onEnable();
        }
    }

    public void enableSafeModeWhenAddEdgeViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512f8104", new Object[]{this});
        } else {
            this.mEdgeViewSafeMode = true;
        }
    }

    public final View getEndView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16948b73", new Object[]{this});
        }
        return this.mEndView;
    }

    public int getEndViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5305840", new Object[]{this})).intValue();
        }
        return this.mEndViewInfos.size();
    }

    @Override // tb.v4n
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        if (vsn.c(this) != 0) {
            return 0;
        }
        return 1;
    }

    @Override // com.taobao.ptr.a
    public int getReadyToRefreshingValue(PtrBase ptrBase, PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d985a7f7", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue();
        }
        if (b.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()] == 1) {
            if (i != 1) {
                View view = this.mEndView;
                if (view != null) {
                    return view.getHeight();
                }
            } else {
                View view2 = this.mEndView;
                if (view2 != null) {
                    return view2.getWidth();
                }
            }
        }
        return -1;
    }

    @Override // com.taobao.ptr.a
    public int getReleaseTargetValue(PtrBase ptrBase, PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c4b782a", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue();
        }
        if (b.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()] != 1) {
            return -1;
        }
        return 0;
    }

    public int getStartViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("126b107", new Object[]{this})).intValue();
        }
        return this.mStartViewInfos.size();
    }

    public boolean hasEndView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86952009", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<jk9> it = this.mEndViewInfos.iterator();
        while (it.hasNext()) {
            jk9 next = it.next();
            if (next != null && view == next.b()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStartView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("476981a2", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Iterator<jk9> it = this.mStartViewInfos.iterator();
        while (it.hasNext()) {
            jk9 next = it.next();
            if (next != null && view == next.b()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue();
        }
        return this.mIsDisable;
    }

    public boolean isDisableIntrinsicPullFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155fa1b5", new Object[]{this})).booleanValue();
        }
        return isDisable();
    }

    @Override // tb.v4n
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        return vsn.i(this);
    }

    @Override // tb.v4n
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        return vsn.h(this);
    }

    @Override // tb.n2n
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onCompleteUpdate(charSequence);
        }
    }

    @Override // tb.n2n
    public void onDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d267c10", new Object[]{this});
            return;
        }
        this.mIsDisable = true;
        removeEndView(this.mEndView);
        this.mEndView = null;
    }

    @Override // tb.n2n
    public void onEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e38fc9", new Object[]{this});
            return;
        }
        this.mIsDisable = false;
        onUpdateDirection(getPullDirection());
    }

    @Override // tb.n2n
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onFreeze(z, charSequence);
        }
    }

    @Override // tb.n2n
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onPull(f);
        }
    }

    @Override // tb.v4n
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        } else if (pullBase instanceof PtrBase) {
            PtrBase ptrBase = (PtrBase) pullBase;
            ptrBase.addEndPtrProxy(this);
            PtrLayout endLayout = ptrBase.getEndLayout();
            if (endLayout != null) {
                endLayout.disableIntrinsicPullFeature(true);
            }
            if (pullBase.getMode() == PullBase.Mode.PULL_FROM_START || pullBase.getMode() == PullBase.Mode.DISABLED) {
                this.mIsDisable = true;
            }
            this.mLoadingHelper = new m2n(endLayout);
            applyStyle();
        }
    }

    @Override // tb.v4n
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        } else if (pullBase instanceof PtrBase) {
            PtrBase ptrBase = (PtrBase) pullBase;
            ptrBase.removeEndPtrProxy(this);
            removeEndView(this.mEndView);
            this.mEndView = null;
            this.mLoadingHelper = null;
            this.mIsDisable = true;
            ptrBase.getEndLayout().disableIntrinsicPullFeature(false);
        }
    }

    @Override // tb.n2n
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onRefreshing();
        }
    }

    @Override // tb.n2n
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onRelease(f);
        }
    }

    @Override // tb.n2n
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onReset();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            return gestureDetector.onTouchEvent(motionEvent);
        }
        return onTouchEvent;
    }

    @Override // tb.n2n
    public void onUpdateDirection(int i) {
        m2n m2nVar;
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
        } else if (getLayoutManager() != null && (m2nVar = this.mLoadingHelper) != null) {
            if (m2nVar != null) {
                m2nVar.onUpdateDirection(i);
            }
            if (!isDisable()) {
                removeEndView(this.mEndView);
                this.mEndView = null;
                m2n m2nVar2 = this.mLoadingHelper;
                if (m2nVar2 != null && (a2 = m2nVar2.a(this)) != null) {
                    addEndView(a2);
                    this.mEndView = a2;
                }
            }
        }
    }

    public boolean removeAllEndViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a9a07b", new Object[]{this})).booleanValue();
        }
        int size = this.mEndViewInfos.size();
        if (size <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((FixedViewAdapter) this.mAdapter).S()) {
                this.mAdapter.notifyItemRangeRemoved(itemCount - size, size);
                Iterator<jk9> it = this.mEndViewInfos.iterator();
                while (it.hasNext()) {
                    jk9 next = it.next();
                    if (!(next == null || next.b() == null || next.b().getParent() != this)) {
                        removeView(next.b());
                    }
                }
            }
        }
        this.mEndViewInfos.clear();
        return true;
    }

    public boolean removeAllStartViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22d71994", new Object[]{this})).booleanValue();
        }
        int size = this.mStartViewInfos.size();
        if (size <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null && ((FixedViewAdapter) adapter).T()) {
            this.mAdapter.notifyItemRangeRemoved(0, size);
            Iterator<jk9> it = this.mStartViewInfos.iterator();
            while (it.hasNext()) {
                jk9 next = it.next();
                if (!(next == null || next.b() == null || next.b().getParent() != this)) {
                    removeView(next.b());
                }
            }
        }
        this.mStartViewInfos.clear();
        return true;
    }

    public boolean removeEndView(View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ce6d073", new Object[]{this, view})).booleanValue();
        }
        if (this.mEndViewInfos.size() <= 0 || view == null) {
            return false;
        }
        int size = this.mEndViewInfos.size();
        int indexOfFixedInfos = indexOfFixedInfos(this.mEndViewInfos, view);
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (((FixedViewAdapter) this.mAdapter).U(view)) {
                this.mAdapter.notifyItemRemoved(itemCount - (size - indexOfFixedInfos));
                if (view.getParent() == this) {
                    removeView(view);
                }
                return removeFixedViewInfo(view, this.mEndViewInfos) | z;
            }
        }
        z = false;
        return removeFixedViewInfo(view, this.mEndViewInfos) | z;
    }

    public boolean removeStartView(View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d010bf8c", new Object[]{this, view})).booleanValue();
        }
        if (this.mStartViewInfos.size() <= 0 || view == null) {
            return false;
        }
        int indexOfFixedInfos = indexOfFixedInfos(this.mStartViewInfos, view);
        RecyclerView.Adapter adapter = this.mAdapter;
        if (adapter == null || !((FixedViewAdapter) adapter).V(view)) {
            z = false;
        } else {
            this.mAdapter.notifyItemRemoved(indexOfFixedInfos);
            if (view.getParent() == this) {
                removeView(view);
            }
        }
        return removeFixedViewInfo(view, this.mStartViewInfos) | z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f067f8", new Object[]{this, adapter});
            return;
        }
        FixedViewAdapter W = new FixedViewAdapter(this.mStartViewInfos, this.mEndViewInfos, adapter).W(this.mEdgeViewSafeMode);
        this.mAdapter = W;
        super.setAdapter(W);
    }

    public final void setEndLoadingDelegate(l2n l2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea2efcb", new Object[]{this, l2nVar});
            return;
        }
        this.mDelegate = l2nVar;
        m2n m2nVar = this.mLoadingHelper;
        if (m2nVar != null) {
            m2nVar.e(l2nVar);
            onUpdateDirection(getPullDirection());
        }
    }

    public final void setEndLoadingDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba8e6cc", new Object[]{this, drawable});
            return;
        }
        this.mLoadingDrawable = drawable;
        m2n m2nVar = this.mLoadingHelper;
        if (m2nVar != null) {
            m2nVar.f(drawable);
        }
    }

    public final void setEndLoadingTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1eb5018", new Object[]{this, colorStateList});
            return;
        }
        this.mTextColor = colorStateList;
        m2n m2nVar = this.mLoadingHelper;
        if (m2nVar != null) {
            m2nVar.g(colorStateList);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58391f90", new Object[]{this, layoutManager});
            return;
        }
        if (layoutManager != null) {
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.setSpanSizeLookup(new GridSpanSizeLookup(this, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                spanStaggeredGridStartEndViews();
            }
        }
        super.setLayoutManager(layoutManager);
        applyStyle();
        onUpdateDirection(getPullDirection());
    }

    public final void setOnItemClickListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0414d5", new Object[]{this, cVar});
            return;
        }
        this.mItemClickListener = cVar;
        if (cVar != null) {
            addGestureDetectorIfNeed();
        }
    }

    public final void setOnItemLongClickListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1cf678d", new Object[]{this, dVar});
            return;
        }
        this.mItemLongClickListener = dVar;
        if (dVar != null) {
            addGestureDetectorIfNeed();
        }
    }

    public final void setOnLastItemVisibleListener(vrk vrkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e24b88", new Object[]{this, vrkVar});
            return;
        }
        this.mOnLastItemVisibleListener = vrkVar;
        if (vrkVar != null) {
            addScrollDetectorIfNeed();
        }
    }

    public PtrRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
