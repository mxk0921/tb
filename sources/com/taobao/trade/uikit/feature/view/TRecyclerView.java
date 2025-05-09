package com.taobao.trade.uikit.feature.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trade.uikit.feature.utils.FeatureList;
import java.util.ArrayList;
import java.util.List;
import tb.a33;
import tb.csn;
import tb.h5u;
import tb.hv;
import tb.kbi;
import tb.ps9;
import tb.qif;
import tb.qxo;
import tb.rig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ITEM_VIEW_TYPE_HEADER_FOOTER = Integer.MIN_VALUE;
    private FeatureList<RecyclerView> mFeatureList;
    private ArrayList<View> mFooterViews;
    private GestureDetector mGestureDetector;
    private ArrayList<View> mHeaderViews;
    private c mItemClickListener;
    private d mItemLongClickListener;
    private List<RecyclerView.OnScrollListener> mOnScrollListeners;
    private List<RecyclerView.RecyclerListener> mRecyclerListeners;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class HeaderViewAdapter extends RecyclerView.Adapter implements Filterable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final ArrayList<View> EMPTY_INFO_LIST = new ArrayList<>();
        private final RecyclerView.Adapter mAdapter;
        public ArrayList<View> mFooterViews;
        public ArrayList<View> mHeaderViews;
        private final boolean mIsFilterable;
        private final RecyclerView mRecyclerView;

        static {
            t2o.a(724566100);
        }

        public HeaderViewAdapter(ArrayList<View> arrayList, ArrayList<View> arrayList2, RecyclerView.Adapter adapter, RecyclerView recyclerView) {
            this.mAdapter = adapter;
            this.mRecyclerView = recyclerView;
            this.mIsFilterable = adapter instanceof Filterable;
            if (arrayList == null) {
                this.mHeaderViews = EMPTY_INFO_LIST;
            } else {
                this.mHeaderViews = arrayList;
            }
            if (arrayList2 == null) {
                this.mFooterViews = EMPTY_INFO_LIST;
            } else {
                this.mFooterViews = arrayList2;
            }
        }

        public static /* synthetic */ Object ipc$super(HeaderViewAdapter headerViewAdapter, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 1036956242) {
                super.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                return null;
            } else if (hashCode == 1414446457) {
                super.registerAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/trade/uikit/feature/view/TRecyclerView$HeaderViewAdapter");
            }
        }

        @Override // android.widget.Filterable
        public Filter getFilter() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Filter) ipChange.ipc$dispatch("2ce20823", new Object[]{this});
            }
            if (this.mIsFilterable) {
                return ((Filterable) this.mAdapter).getFilter();
            }
            return null;
        }

        public int getFootersCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c80be27", new Object[]{this})).intValue();
            }
            return this.mFooterViews.size();
        }

        public int getHeadersCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5ac0e499", new Object[]{this})).intValue();
            }
            return this.mHeaderViews.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            if (this.mAdapter != null) {
                return getFootersCount() + getHeadersCount() + this.mAdapter.getItemCount();
            }
            return getFootersCount() + getHeadersCount();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            int headersCount = getHeadersCount();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null || i < headersCount || (i2 = i - headersCount) >= adapter.getItemCount()) {
                return -1L;
            }
            return this.mAdapter.getItemId(i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
            }
            int headersCount = getHeadersCount();
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null || i < headersCount || (i2 = i - headersCount) >= adapter.getItemCount()) {
                return Integer.MIN_VALUE;
            }
            return this.mAdapter.getItemViewType(i2);
        }

        public RecyclerView.Adapter getWrappedAdapter() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.Adapter) ipChange.ipc$dispatch("389785c3", new Object[]{this});
            }
            return this.mAdapter;
        }

        public boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter == null || adapter.getItemCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            int headersCount = getHeadersCount();
            int footersCount = getFootersCount();
            if (i < headersCount || i >= getItemCount() - footersCount) {
                HeaderViewHolder headerViewHolder = (HeaderViewHolder) viewHolder;
                headerViewHolder.f13843a.removeAllViews();
                if (i < headersCount) {
                    View view = this.mHeaderViews.get(i);
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    headerViewHolder.f13843a.addView(view);
                } else {
                    int i3 = i - headersCount;
                    RecyclerView.Adapter adapter = this.mAdapter;
                    if (adapter != null) {
                        i2 = adapter.getItemCount();
                    }
                    View view2 = this.mFooterViews.get(i3 - i2);
                    if (view2.getParent() != null) {
                        ((ViewGroup) view2.getParent()).removeView(view2);
                    }
                    headerViewHolder.f13843a.addView(view2);
                }
                ViewGroup.LayoutParams layoutParams = headerViewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = this.mRecyclerView.getLayoutManager().generateDefaultLayoutParams();
                    headerViewHolder.itemView.setLayoutParams(layoutParams);
                }
                if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                    ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
                } else if (layoutParams instanceof RecyclerView.LayoutParams) {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
            } else {
                int i4 = i - headersCount;
                RecyclerView.Adapter adapter2 = this.mAdapter;
                if (adapter2 != null) {
                    adapter2.onBindViewHolder(viewHolder, i4);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            if (i == Integer.MIN_VALUE) {
                return new HeaderViewHolder(new FrameLayout(this.mRecyclerView.getContext()));
            }
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter != null) {
                return adapter.onCreateViewHolder(viewGroup, i);
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("544ebd79", new Object[]{this, adapterDataObserver});
                return;
            }
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter != null) {
                adapter.registerAdapterDataObserver(adapterDataObserver);
            }
            super.registerAdapterDataObserver(adapterDataObserver);
        }

        public boolean removeFooter(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5285e2d0", new Object[]{this, view})).booleanValue();
            }
            int size = this.mFooterViews.size();
            for (int i = 0; i < size; i++) {
                if (this.mFooterViews.get(i) == view) {
                    this.mFooterViews.remove(i);
                    return true;
                }
            }
            return false;
        }

        public boolean removeHeader(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fcf7459e", new Object[]{this, view})).booleanValue();
            }
            int size = this.mHeaderViews.size();
            for (int i = 0; i < size; i++) {
                if (this.mHeaderViews.get(i) == view) {
                    this.mHeaderViews.remove(i);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dceb252", new Object[]{this, adapterDataObserver});
                return;
            }
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(adapterDataObserver);
            }
            super.unregisterAdapterDataObserver(adapterDataObserver);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class HeaderViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final FrameLayout f13843a;

        static {
            t2o.a(724566101);
        }

        public HeaderViewHolder(View view) {
            super(view);
            this.f13843a = (FrameLayout) view;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class InnerOnScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(724566102);
        }

        public InnerOnScrollListener() {
        }

        public static /* synthetic */ Object ipc$super(InnerOnScrollListener innerOnScrollListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/uikit/feature/view/TRecyclerView$InnerOnScrollListener");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            int size = TRecyclerView.access$000(TRecyclerView.this).size();
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.OnScrollListener onScrollListener = (RecyclerView.OnScrollListener) TRecyclerView.access$000(TRecyclerView.this).get(i2);
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(recyclerView, i);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            int size = TRecyclerView.access$000(TRecyclerView.this).size();
            for (int i3 = 0; i3 < size; i3++) {
                ((RecyclerView.OnScrollListener) TRecyclerView.access$000(TRecyclerView.this).get(i3)).onScrolled(recyclerView, i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class InnerRecyclerListener implements RecyclerView.RecyclerListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(724566103);
        }

        public InnerRecyclerListener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.RecyclerListener
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
                return;
            }
            int size = TRecyclerView.access$100(TRecyclerView.this).size();
            for (int i = 0; i < size; i++) {
                RecyclerView.RecyclerListener recyclerListener = (RecyclerView.RecyclerListener) TRecyclerView.access$100(TRecyclerView.this).get(i);
                if (recyclerListener != null) {
                    recyclerListener.onViewRecycled(viewHolder);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class SpanSizeLookupCompat extends GridLayoutManager.SpanSizeLookup {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final GridLayoutManager.SpanSizeLookup f13846a;

        static {
            t2o.a(724566107);
        }

        public SpanSizeLookupCompat(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.f13846a = spanSizeLookup;
        }

        public static /* synthetic */ Object ipc$super(SpanSizeLookupCompat spanSizeLookupCompat, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1691818968) {
                return new Boolean(super.isSpanIndexCacheEnabled());
            }
            if (hashCode == -823858072) {
                super.setSpanIndexCacheEnabled(((Boolean) objArr[0]).booleanValue());
                return null;
            } else if (hashCode == 418174172) {
                super.invalidateSpanIndexCache();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/trade/uikit/feature/view/TRecyclerView$SpanSizeLookupCompat");
            }
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanGroupIndex(int i, int i2) {
            GridLayoutManager.SpanSizeLookup spanSizeLookup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c54c24d", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            if (TRecyclerView.access$200(TRecyclerView.this, i) || (spanSizeLookup = this.f13846a) == null) {
                return 0;
            }
            return spanSizeLookup.getSpanGroupIndex(i - TRecyclerView.this.getHeaderViewsCount(), i2);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanIndex(int i, int i2) {
            GridLayoutManager.SpanSizeLookup spanSizeLookup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("310d928c", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            if (TRecyclerView.access$200(TRecyclerView.this, i) || (spanSizeLookup = this.f13846a) == null) {
                return 0;
            }
            return spanSizeLookup.getSpanIndex(i - TRecyclerView.this.getHeaderViewsCount(), i2);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
            }
            if (TRecyclerView.access$200(TRecyclerView.this, i)) {
                return ((GridLayoutManager) TRecyclerView.this.getLayoutManager()).getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f13846a;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i - TRecyclerView.this.getHeaderViewsCount());
            }
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public void invalidateSpanIndexCache() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18ecd4dc", new Object[]{this});
                return;
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f13846a;
            if (spanSizeLookup != null) {
                spanSizeLookup.invalidateSpanIndexCache();
            } else {
                super.invalidateSpanIndexCache();
            }
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public boolean isSpanIndexCacheEnabled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9b28e428", new Object[]{this})).booleanValue();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f13846a;
            if (spanSizeLookup != null) {
                return spanSizeLookup.isSpanIndexCacheEnabled();
            }
            return super.isSpanIndexCacheEnabled();
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public void setSpanIndexCacheEnabled(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cee4ec68", new Object[]{this, new Boolean(z)});
                return;
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.f13846a;
            if (spanSizeLookup != null) {
                spanSizeLookup.setSpanIndexCacheEnabled(z);
            } else {
                super.setSpanIndexCacheEnabled(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(TRecyclerView tRecyclerView) {
            super(tRecyclerView);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/uikit/feature/view/TRecyclerView$1");
        }

        @Override // com.taobao.trade.uikit.feature.view.TRecyclerView.b
        public boolean a(TRecyclerView tRecyclerView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4a04a63", new Object[]{this, tRecyclerView, view, new Integer(i), new Long(j)})).booleanValue();
            }
            if (TRecyclerView.access$300(TRecyclerView.this) == null) {
                return false;
            }
            TRecyclerView.access$300(TRecyclerView.this).a(tRecyclerView, view, i, j);
            return true;
        }

        @Override // com.taobao.trade.uikit.feature.view.TRecyclerView.b
        public boolean b(TRecyclerView tRecyclerView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("544fe547", new Object[]{this, tRecyclerView, view, new Integer(i), new Long(j)})).booleanValue();
            }
            if (TRecyclerView.access$400(TRecyclerView.this) == null || !TRecyclerView.access$400(TRecyclerView.this).a(tRecyclerView, view, i, j)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class b extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TRecyclerView f13847a;
        public View b;

        static {
            t2o.a(724566104);
        }

        public b(TRecyclerView tRecyclerView) {
            this.f13847a = tRecyclerView;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/uikit/feature/view/TRecyclerView$ItemClickGestureListener");
        }

        public abstract boolean a(TRecyclerView tRecyclerView, View view, int i, long j);

        public abstract boolean b(TRecyclerView tRecyclerView, View view, int i, long j);

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
            }
            View findChildViewUnder = this.f13847a.findChildViewUnder((int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = findChildViewUnder;
            if (findChildViewUnder != null) {
                return true;
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            View view = this.b;
            if (view != null) {
                int childPosition = this.f13847a.getChildPosition(view);
                long itemId = this.f13847a.getAdapter().getItemId(childPosition);
                int headerViewsCount = childPosition - this.f13847a.getHeaderViewsCount();
                if (!TRecyclerView.access$200(this.f13847a, childPosition)) {
                    z = b(this.f13847a, this.b, headerViewsCount, itemId);
                } else {
                    z = false;
                }
                if (z) {
                    this.b.setPressed(false);
                    this.b = null;
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            View view = this.b;
            if (view == null) {
                return false;
            }
            view.setPressed(false);
            this.b = null;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
                return;
            }
            View view = this.b;
            if (view != null) {
                view.setPressed(true);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            View view = this.b;
            if (view != null) {
                view.setPressed(false);
                int childPosition = this.f13847a.getChildPosition(this.b);
                long itemId = this.f13847a.getAdapter().getItemId(childPosition);
                int headerViewsCount = childPosition - this.f13847a.getHeaderViewsCount();
                if (!TRecyclerView.access$200(this.f13847a, childPosition)) {
                    z = a(this.f13847a, this.b, headerViewsCount, itemId);
                }
                this.b = null;
            }
            return z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a(TRecyclerView tRecyclerView, View view, int i, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        boolean a(TRecyclerView tRecyclerView, View view, int i, long j);
    }

    static {
        t2o.a(724566098);
        t2o.a(724566110);
        t2o.a(724566109);
        t2o.a(724566095);
    }

    public TRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFeatureList = new FeatureList<>(this);
        this.mOnScrollListeners = new ArrayList();
        this.mRecyclerListeners = new ArrayList();
        this.mHeaderViews = new ArrayList<>();
        this.mFooterViews = new ArrayList<>();
        super.setOnScrollListener(new InnerOnScrollListener());
        super.setRecyclerListener(new InnerRecyclerListener());
        this.mFeatureList.init(context, attributeSet, i);
    }

    public static /* synthetic */ List access$000(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8e285f4f", new Object[]{tRecyclerView});
        }
        return tRecyclerView.mOnScrollListeners;
    }

    public static /* synthetic */ List access$100(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("55344650", new Object[]{tRecyclerView});
        }
        return tRecyclerView.mRecyclerListeners;
    }

    public static /* synthetic */ boolean access$200(TRecyclerView tRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21a68791", new Object[]{tRecyclerView, new Integer(i)})).booleanValue();
        }
        return tRecyclerView.isHeaderOrFooter(i);
    }

    public static /* synthetic */ c access$300(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("f32a2cae", new Object[]{tRecyclerView});
        }
        return tRecyclerView.mItemClickListener;
    }

    public static /* synthetic */ d access$400(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("8011fb29", new Object[]{tRecyclerView});
        }
        return tRecyclerView.mItemLongClickListener;
    }

    private void addGestureDetectorIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddf3248", new Object[]{this});
        } else if (this.mGestureDetector == null) {
            this.mGestureDetector = new GestureDetector(getContext(), new a(this));
        }
    }

    public static /* synthetic */ Object ipc$super(TRecyclerView tRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1952076612:
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            case -1838743131:
                super.setMeasuredDimension(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1284040002:
                super.setOnScrollListener((RecyclerView.OnScrollListener) objArr[0]);
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case -894236565:
                super.computeScroll();
                return null;
            case -777715234:
                super.setRecyclerListener((RecyclerView.RecyclerListener) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 320377877:
                return new Integer(super.computeHorizontalScrollOffset());
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 678958088:
                super.onFocusChanged(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (Rect) objArr[2]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1480138640:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 1545798951:
                return new Integer(super.computeVerticalScrollOffset());
            case 1560169965:
                super.measureChild((View) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 1978689528:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            case 2017727115:
                super.swapAdapter((RecyclerView.Adapter) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/uikit/feature/view/TRecyclerView");
        }
    }

    private boolean isHeaderOrFooter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd2f91ab", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = getFooterViewsCount();
        if (getAdapter() == null || i < headerViewsCount || i >= getAdapter().getItemCount() - footerViewsCount) {
            return true;
        }
        return false;
    }

    private void removeFixedViewInfo(View view, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1c5f82", new Object[]{this, view, arrayList});
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == view) {
                arrayList.remove(i);
                return;
            }
        }
    }

    public boolean addFeature(hv<? super RecyclerView> hvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86bfac9d", new Object[]{this, hvVar})).booleanValue();
        }
        return this.mFeatureList.addFeature(hvVar);
    }

    public final void addFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df49456a", new Object[]{this, view});
        } else {
            addFooterView(this.mFooterViews.size(), view);
        }
    }

    public final void addHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59909138", new Object[]{this, view});
        } else {
            addHeaderView(this.mHeaderViews.size(), view);
        }
    }

    public void clearFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed050131", new Object[]{this});
        } else {
            this.mFeatureList.clearFeatures();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof qxo) {
                ((qxo) hvVar).beforeComputeScroll();
            }
        }
        super.computeScroll();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof qxo) {
                ((qxo) hvVar2).afterComputeScroll();
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
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof a33) {
                ((a33) hvVar).beforeDispatchDraw(canvas);
            }
        }
        super.dispatchDraw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof a33) {
                ((a33) hvVar2).afterDispatchDraw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof h5u) {
                ((h5u) hvVar).beforeDispatchTouchEvent(motionEvent);
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof h5u) {
                ((h5u) hvVar2).afterDispatchTouchEvent(motionEvent);
            }
        }
        return dispatchTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof a33) {
                ((a33) hvVar).beforeDraw(canvas);
            }
        }
        super.draw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof a33) {
                ((a33) hvVar2).afterDraw(canvas);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9105d4f", new Object[]{this, canvas, view, new Long(j), new Integer(i)})).booleanValue();
        }
        return super.drawChild(canvas, view, j);
    }

    public hv<? super RecyclerView> findFeature(Class<? extends hv<? super RecyclerView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hv) ipChange.ipc$dispatch("265698fa", new Object[]{this, cls});
        }
        return this.mFeatureList.findFeature(cls);
    }

    public int getFooterViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68376a2c", new Object[]{this})).intValue();
        }
        return this.mFooterViews.size();
    }

    public int getHeaderViewsCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("643b079e", new Object[]{this})).intValue();
        }
        return this.mHeaderViews.size();
    }

    public int getHorizontalScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2638e274", new Object[]{this})).intValue();
        }
        return super.computeHorizontalScrollOffset();
    }

    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return (getTotalCount() - getHeaderViewsCount()) - getFooterViewsCount();
    }

    public int getOrientation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad9ae414", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        }
        return 1;
    }

    public int getTotalCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue();
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getItemCount();
    }

    public int getVerticalScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89715f46", new Object[]{this})).intValue();
        }
        return super.computeVerticalScrollOffset();
    }

    public void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
        } else {
            this.mFeatureList.init(context, attributeSet, i);
        }
    }

    public void measureChild(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cbe2b6", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            super.measureChild(view, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
        this.mItemClickListener = null;
        this.mItemLongClickListener = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof a33) {
                ((a33) hvVar).beforeOnDraw(canvas);
            }
        }
        super.onDraw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof a33) {
                ((a33) hvVar2).afterOnDraw(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28781408", new Object[]{this, new Boolean(z), new Integer(i), rect});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hv hvVar = this.mFeatureList.get(i2);
            if (hvVar instanceof ps9) {
                ((ps9) hvVar).beforeOnFocusChanged(z, i, rect);
            }
        }
        super.onFocusChanged(z, i, rect);
        for (int i3 = size - 1; i3 >= 0; i3--) {
            hv hvVar2 = this.mFeatureList.get(i3);
            if (hvVar2 instanceof ps9) {
                ((ps9) hvVar2).afterOnFocusChanged(z, i, rect);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            hv hvVar = this.mFeatureList.get(size);
            if (hvVar instanceof qif) {
                onInterceptTouchEvent = ((qif) hvVar).onInterceptTouchEvent(motionEvent) | onInterceptTouchEvent;
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i5 = 0; i5 < size; i5++) {
            hv hvVar = this.mFeatureList.get(i5);
            if (hvVar instanceof rig) {
                ((rig) hvVar).beforeOnLayout(z, i, i2, i3, i4);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        for (int i6 = size - 1; i6 >= 0; i6--) {
            hv hvVar2 = this.mFeatureList.get(i6);
            if (hvVar2 instanceof rig) {
                ((rig) hvVar2).afterOnLayout(z, i, i2, i3, i4);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i3 = 0; i3 < size; i3++) {
            hv hvVar = this.mFeatureList.get(i3);
            if (hvVar instanceof kbi) {
                ((kbi) hvVar).beforeOnMeasure(i, i2);
            }
        }
        super.onMeasure(i, i2);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            hv hvVar2 = this.mFeatureList.get(i4);
            if (hvVar2 instanceof kbi) {
                ((kbi) hvVar2).afterOnMeasure(i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof h5u) {
                ((h5u) hvVar).beforeOnTouchEvent(motionEvent);
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof h5u) {
                ((h5u) hvVar2).afterOnTouchEvent(motionEvent);
            }
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof ps9) {
                ((ps9) hvVar).beforeOnWindowFocusChanged(z);
            }
        }
        super.onWindowFocusChanged(z);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            hv hvVar2 = this.mFeatureList.get(i2);
            if (hvVar2 instanceof ps9) {
                ((ps9) hvVar2).afterOnWindowFocusChanged(z);
            }
        }
    }

    public boolean removeFeature(Class<? extends hv<? super RecyclerView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue();
        }
        return this.mFeatureList.removeFeature(cls);
    }

    public final boolean removeFooterView(View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9968deb", new Object[]{this, view})).booleanValue();
        }
        if (this.mFooterViews.size() <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null || !((HeaderViewAdapter) adapter).removeFooter(view)) {
            z = false;
        } else {
            adapter.notifyDataSetChanged();
        }
        removeFixedViewInfo(view, this.mFooterViews);
        return z;
    }

    public final boolean removeHeaderView(View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ddd9b9", new Object[]{this, view})).booleanValue();
        }
        if (this.mHeaderViews.size() <= 0) {
            return false;
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null || !((HeaderViewAdapter) adapter).removeHeader(view)) {
            z = false;
        } else {
            adapter.notifyDataSetChanged();
        }
        removeFixedViewInfo(view, this.mHeaderViews);
        return z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, com.alilive.adapter.uikit.a
    public void removeOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4205c2e0", new Object[]{this, onScrollListener});
        } else if (onScrollListener != null) {
            this.mOnScrollListeners.remove(onScrollListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void removeRecyclerListener(RecyclerView.RecyclerListener recyclerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6033aa00", new Object[]{this, recyclerListener});
        } else if (recyclerListener != null) {
            this.mRecyclerListeners.remove(recyclerListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f067f8", new Object[]{this, adapter});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            hv hvVar = this.mFeatureList.get(i);
            if (hvVar instanceof csn) {
                if (adapter instanceof HeaderViewAdapter) {
                    adapter = ((csn) hvVar).wrapAdapter(((HeaderViewAdapter) adapter).getWrappedAdapter());
                } else {
                    adapter = ((csn) hvVar).wrapAdapter(adapter);
                }
            }
        }
        if (adapter == null || (adapter instanceof HeaderViewAdapter) || (this.mHeaderViews.size() <= 0 && this.mFooterViews.size() <= 0)) {
            super.setAdapter(adapter);
        } else {
            super.setAdapter(new HeaderViewAdapter(this.mHeaderViews, this.mFooterViews, adapter, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        GridLayoutManager gridLayoutManager;
        GridLayoutManager.SpanSizeLookup spanSizeLookup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58391f90", new Object[]{this, layoutManager});
            return;
        }
        if ((layoutManager instanceof GridLayoutManager) && ((this.mHeaderViews.size() > 0 || this.mFooterViews.size() > 0) && ((spanSizeLookup = (gridLayoutManager = (GridLayoutManager) layoutManager).getSpanSizeLookup()) == null || !(spanSizeLookup instanceof SpanSizeLookupCompat)))) {
            gridLayoutManager.setSpanSizeLookup(new SpanSizeLookupCompat(spanSizeLookup));
        }
        super.setLayoutManager(layoutManager);
    }

    public void setMeasuredDimension(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926779c5", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            super.setMeasuredDimension((int) j, (int) j2);
        }
    }

    public void setOnItemClickListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f7f4da", new Object[]{this, cVar});
            return;
        }
        this.mItemClickListener = cVar;
        if (cVar != null) {
            addGestureDetectorIfNeed();
        }
    }

    public void setOnItemLongClickListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620f12", new Object[]{this, dVar});
            return;
        }
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.mItemLongClickListener = dVar;
        if (dVar != null) {
            addGestureDetectorIfNeed();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3771abe", new Object[]{this, onScrollListener});
        } else {
            this.mOnScrollListeners.add(onScrollListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(RecyclerView.RecyclerListener recyclerListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a501de", new Object[]{this, recyclerListener});
        } else {
            this.mRecyclerListeners.add(recyclerListener);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void swapAdapter(RecyclerView.Adapter adapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7844128b", new Object[]{this, adapter, new Boolean(z)});
        } else if (adapter == null || (adapter instanceof HeaderViewAdapter) || (this.mHeaderViews.size() <= 0 && this.mFooterViews.size() <= 0)) {
            super.swapAdapter(adapter, z);
        } else {
            super.swapAdapter(new HeaderViewAdapter(this.mHeaderViews, this.mFooterViews, adapter, this), z);
        }
    }

    public final void addFooterView(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7ef57", new Object[]{this, new Integer(i), view});
            return;
        }
        this.mFooterViews.add(i, view);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            if (!(adapter instanceof HeaderViewAdapter)) {
                setAdapter(new HeaderViewAdapter(this.mHeaderViews, this.mFooterViews, adapter, this));
            } else {
                adapter.notifyDataSetChanged();
            }
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null) {
            setLayoutManager(layoutManager);
        }
    }

    public final void addHeaderView(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5a1d49", new Object[]{this, new Integer(i), view});
            return;
        }
        this.mHeaderViews.add(i, view);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            if (!(adapter instanceof HeaderViewAdapter)) {
                setAdapter(new HeaderViewAdapter(this.mHeaderViews, this.mFooterViews, adapter, this));
            } else {
                adapter.notifyDataSetChanged();
            }
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null) {
            setLayoutManager(layoutManager);
        }
    }

    public TRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TRecyclerView(Context context) {
        this(context, null);
    }
}
