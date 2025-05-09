package com.taobao.android.icart.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.icart.widget.refresh.CartGridSpanSizeLookup;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PtrLayout;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.views.recycler.accessories.FixedViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bd4;
import tb.cb4;
import tb.jk9;
import tb.kmb;
import tb.l2n;
import tb.lu;
import tb.n2n;
import tb.t2o;
import tb.v4n;
import tb.vsn;
import tb.xc3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartRecyclerView extends ParentRecyclerView implements v4n, com.taobao.ptr.a, n2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView.Adapter mAdapter;
    private kmb mCartPresenter;
    private lu mCartRecommend;
    private View mCushionView;
    private l2n mDelegate;
    private View mEndView;
    public ViewGroup mFooterView;
    private boolean mIsDisable;
    private xc3 mLoadingHelper;
    private c mOnEndViewExposure;
    private PtrBase mParent;
    private ColorStateList mTextColor;
    private ArrayList<jk9> mStartViewInfos = new ArrayList<>();
    private ArrayList<jk9> mEndViewInfos = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int G = cb4.G(CartRecyclerView.access$000(CartRecyclerView.this));
            if (!this.b) {
                G += CartRecyclerView.access$000(CartRecyclerView.this).e().d0(63.0f);
            }
            ViewGroup.LayoutParams layoutParams = CartRecyclerView.access$100(CartRecyclerView.this).getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = G;
                CartRecyclerView.access$100(CartRecyclerView.this).setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int recyclerViewPaddingBottom = CartRecyclerView.this.getRecyclerViewPaddingBottom();
            CartRecyclerView cartRecyclerView = CartRecyclerView.this;
            cartRecyclerView.setPadding(cartRecyclerView.getPaddingLeft(), CartRecyclerView.this.getPaddingTop(), CartRecyclerView.this.getPaddingRight(), recyclerViewPaddingBottom);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class d {
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

    static {
        t2o.a(478151065);
        t2o.a(632291347);
        t2o.a(632291341);
        t2o.a(632291346);
    }

    public CartRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ kmb access$000(CartRecyclerView cartRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("494f07d9", new Object[]{cartRecyclerView});
        }
        return cartRecyclerView.mCartPresenter;
    }

    public static /* synthetic */ View access$100(CartRecyclerView cartRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("77434193", new Object[]{cartRecyclerView});
        }
        return cartRecyclerView.mCushionView;
    }

    private void applyStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7640f9ea", new Object[]{this});
        } else if (getLayoutManager() != null) {
            setEndLoadingTextColor(this.mTextColor);
            setEndLoadingDelegate(this.mDelegate);
        }
    }

    private PtrLayout disableIntrinsicPull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PtrLayout) ipChange.ipc$dispatch("1429f4d8", new Object[]{this});
        }
        PtrBase ptrBase = this.mParent;
        if (ptrBase == null) {
            return null;
        }
        PtrLayout endLayout = ptrBase.getEndLayout();
        if (endLayout != null) {
            endLayout.disableIntrinsicPullFeature(true);
        }
        return endLayout;
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

    public static /* synthetic */ Object ipc$super(CartRecyclerView cartRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1480138640:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 1978689528:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/CartRecyclerView");
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
            this.mEndViewInfos.add(new jk9(view));
            spanStaggeredGridStartEndViews();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null) {
                return;
            }
            if (!(adapter instanceof FixedViewAdapter)) {
                FixedViewAdapter fixedViewAdapter = new FixedViewAdapter(this.mStartViewInfos, this.mEndViewInfos, this.mAdapter);
                this.mAdapter = fixedViewAdapter;
                super.setAdapter(fixedViewAdapter);
                return;
            }
            adapter.notifyItemInserted(adapter.getItemCount() - 1);
        }
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
        if (d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()] == 1) {
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
        if (d.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()] != 1) {
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

    public void hideCushionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe21e8b", new Object[]{this});
            return;
        }
        View view = this.mCushionView;
        if (view != null) {
            removeEndView(view);
        }
    }

    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue();
        }
        return this.mIsDisable;
    }

    public boolean isEndViewExists(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669eab1d", new Object[]{this, view})).booleanValue();
        }
        ArrayList<jk9> arrayList = this.mEndViewInfos;
        if (!(arrayList == null || view == null)) {
            Iterator<jk9> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().b() == view) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // tb.v4n
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        if (!isAttachedToWindow() || this.mDisabledDirection <= 0) {
            return false;
        }
        return true;
    }

    @Override // tb.v4n
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        if (!isAttachedToWindow() || this.mDisabledDirection >= 0) {
            return false;
        }
        return true;
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
        disableIntrinsicPull();
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        lu luVar = this.mCartRecommend;
        if (luVar == null || !luVar.f()) {
            updatePaddingBottom();
        } else {
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i, i2);
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
            this.mParent = ptrBase;
            ptrBase.addEndPtrProxy(this);
            PtrLayout disableIntrinsicPull = disableIntrinsicPull();
            if (pullBase.getMode() == PullBase.Mode.PULL_FROM_START || pullBase.getMode() == PullBase.Mode.DISABLED) {
                this.mIsDisable = true;
            }
            this.mLoadingHelper = new xc3(disableIntrinsicPull);
            applyStyle();
        }
    }

    @Override // tb.v4n
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        } else if (pullBase instanceof PtrBase) {
            this.mParent = null;
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

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (getLayoutManager() instanceof LinearLayoutManager) {
            i5 = ((LinearLayoutManager) getLayoutManager()).findLastVisibleItemPosition();
        } else {
            i5 = -1;
        }
        if (i5 != -1 && getLayoutManager().findViewByPosition(i5) == this.mEndView && (cVar = this.mOnEndViewExposure) != null) {
            cVar.a();
        }
    }

    @Override // tb.n2n
    public void onUpdateDirection(int i) {
        xc3 xc3Var;
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
        } else if (getLayoutManager() != null && (xc3Var = this.mLoadingHelper) != null) {
            if (xc3Var != null) {
                xc3Var.onUpdateDirection(i);
            }
            if (!isDisable()) {
                removeEndView(this.mEndView);
                this.mEndView = null;
                xc3 xc3Var2 = this.mLoadingHelper;
                if (xc3Var2 != null && (a2 = xc3Var2.a(this)) != null) {
                    addEndView(a2);
                    this.mEndView = a2;
                }
            }
        }
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

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f067f8", new Object[]{this, adapter});
            return;
        }
        FixedViewAdapter fixedViewAdapter = new FixedViewAdapter(this.mStartViewInfos, this.mEndViewInfos, adapter);
        this.mAdapter = fixedViewAdapter;
        super.setAdapter(fixedViewAdapter);
    }

    public void setCartPresenter(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8a7e4c", new Object[]{this, kmbVar});
        } else {
            this.mCartPresenter = kmbVar;
        }
    }

    public void setCartRecommend(lu luVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79765b8a", new Object[]{this, luVar});
        } else {
            this.mCartRecommend = luVar;
        }
    }

    public final void setEndLoadingDelegate(l2n l2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea2efcb", new Object[]{this, l2nVar});
            return;
        }
        this.mDelegate = l2nVar;
        xc3 xc3Var = this.mLoadingHelper;
        if (xc3Var != null) {
            xc3Var.g(l2nVar);
            onUpdateDirection(getPullDirection());
        }
    }

    public final void setEndLoadingTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1eb5018", new Object[]{this, colorStateList});
            return;
        }
        this.mTextColor = colorStateList;
        xc3 xc3Var = this.mLoadingHelper;
        if (xc3Var != null) {
            xc3Var.h(colorStateList);
        }
    }

    public void setFooterView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98ea9a8", new Object[]{this, viewGroup});
        } else {
            this.mFooterView = viewGroup;
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
                gridLayoutManager.setSpanSizeLookup(new CartGridSpanSizeLookup(this, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                spanStaggeredGridStartEndViews();
            }
        }
        super.setLayoutManager(layoutManager);
        applyStyle();
        onUpdateDirection(getPullDirection());
    }

    public void setOnEndViewExposure(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6094a2", new Object[]{this, cVar});
        } else {
            this.mOnEndViewExposure = cVar;
        }
    }

    public void showCushionView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e28d64", new Object[]{this, new Boolean(z)});
        } else if (this.mCartPresenter != null) {
            if (!DataBizContext.ShareContext.needShowCushionView()) {
                View view = this.mCushionView;
                if (view != null) {
                    removeEndView(view);
                    this.mCushionView = null;
                    return;
                }
                return;
            }
            if (this.mCushionView == null) {
                this.mCushionView = new View(this.mCartPresenter.getContext());
                this.mCushionView.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            }
            this.mFooterView.post(new a(z));
            if (!hasEndView(this.mCushionView)) {
                addEndView(this.mCushionView);
            }
        }
    }

    public void updatePaddingBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50409a5a", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.mFooterView;
        if (viewGroup != null) {
            viewGroup.post(new b());
        }
    }

    public int getRecyclerViewPaddingBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d1f513c", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.mFooterView;
        if (viewGroup == null) {
            return 0;
        }
        DXRootView c2 = bd4.c(viewGroup, "submit");
        int measuredHeight = c2 != null ? c2.getMeasuredHeight() : 0;
        if (!DataBizContext.ShareContext.needShowCushionView()) {
            return Math.max(cb4.G(this.mCartPresenter) + measuredHeight, 0);
        }
        if (c2 != null) {
            return c2.getMeasuredHeight();
        }
        return 0;
    }

    public CartRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
