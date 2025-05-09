package com.taobao.uikit.feature.view;

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
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.callback.FocusCallback;
import com.taobao.uikit.feature.callback.InterceptTouchEventCallback;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.callback.MeasureCallback;
import com.taobao.uikit.feature.callback.RecyclerAdapterCallback;
import com.taobao.uikit.feature.callback.ScrollCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.utils.FeatureList;
import com.taobao.uikit.utils.IFeatureList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TRecyclerView extends RecyclerView implements ViewHelper, ViewGroupHelper, IFeatureList<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ID_FOOTER = 2305843009213693952L;
    public static final long ID_HEADER = 1152921504606846976L;
    public static final int ITEM_VIEW_TYPE_HEADER_FOOTER = Integer.MIN_VALUE;
    private FeatureList<RecyclerView> mFeatureList;
    private ArrayList<View> mFooterViews;
    private GestureDetector mGestureDetector;
    private ArrayList<View> mHeaderViews;
    private OnItemClickListener mItemClickListener;
    private OnItemLongClickListener mItemLongClickListener;
    private List<RecyclerView.OnScrollListener> mOnScrollListeners;
    private RecyclerView.Adapter mRawAdapter;
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
        private final TRecyclerView mRecyclerView;

        public HeaderViewAdapter(ArrayList<View> arrayList, ArrayList<View> arrayList2, RecyclerView.Adapter adapter, TRecyclerView tRecyclerView) {
            this.mAdapter = adapter;
            this.mRecyclerView = tRecyclerView;
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
            if (adapter != null) {
                super.setHasStableIds(adapter.hasStableIds());
            }
        }

        public static /* synthetic */ Object ipc$super(HeaderViewAdapter headerViewAdapter, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1835299728:
                    return new Boolean(super.onFailedToRecycleView((RecyclerView.ViewHolder) objArr[0]));
                case -1614840632:
                    super.setHasStableIds(((Boolean) objArr[0]).booleanValue());
                    return null;
                case 1036956242:
                    super.unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                    return null;
                case 1414446457:
                    super.registerAdapterDataObserver((RecyclerView.AdapterDataObserver) objArr[0]);
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/view/TRecyclerView$HeaderViewAdapter");
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
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            int headersCount = getHeadersCount();
            int footersCount = getFootersCount();
            if (i < headersCount) {
                return i + 1152921504606846976L;
            }
            if (i >= getItemCount() - footersCount) {
                int i4 = i - headersCount;
                RecyclerView.Adapter adapter = this.mAdapter;
                if (adapter != null) {
                    i3 = adapter.getItemCount();
                }
                return (i4 + 2305843009213693952L) - i3;
            }
            RecyclerView.Adapter adapter2 = this.mAdapter;
            if (adapter2 == null || i < headersCount || (i2 = i - headersCount) >= adapter2.getItemCount()) {
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

        public void onAttachedHeaderOrFooter(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df33cbf9", new Object[]{this, viewHolder});
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
                return;
            }
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            int headersCount = getHeadersCount();
            int footersCount = getFootersCount();
            if (i < headersCount || i >= getItemCount() - footersCount) {
                HeaderViewHolder headerViewHolder = (HeaderViewHolder) viewHolder;
                headerViewHolder.mContainer.removeAllViews();
                if (i < headersCount) {
                    View view = this.mHeaderViews.get(i);
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    headerViewHolder.mContainer.addView(view);
                } else {
                    int i4 = i - headersCount;
                    RecyclerView.Adapter adapter = this.mAdapter;
                    if (adapter != null) {
                        i3 = adapter.getItemCount();
                    }
                    View view2 = this.mFooterViews.get(i4 - i3);
                    if (view2.getParent() != null) {
                        ((ViewGroup) view2.getParent()).removeView(view2);
                    }
                    headerViewHolder.mContainer.addView(view2);
                }
                ViewGroup.LayoutParams layoutParams = headerViewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = this.mRecyclerView.getLayoutManager().generateDefaultLayoutParams();
                    headerViewHolder.itemView.setLayoutParams(layoutParams);
                }
                if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                    ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
                } else if (layoutParams instanceof RecyclerView.LayoutParams) {
                    int orientation = this.mRecyclerView.getOrientation();
                    int i5 = -2;
                    if (1 == orientation) {
                        i2 = -1;
                    } else {
                        i2 = -2;
                    }
                    layoutParams.width = i2;
                    if (1 != orientation) {
                        i5 = -1;
                    }
                    layoutParams.height = i5;
                }
            } else {
                int i6 = i - headersCount;
                RecyclerView.Adapter adapter2 = this.mAdapter;
                if (adapter2 != null) {
                    adapter2.onBindViewHolder(viewHolder, i6);
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
        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44f14ed1", new Object[]{this, recyclerView});
                return;
            }
            RecyclerView.Adapter adapter = this.mAdapter;
            if (adapter != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }

        public void onDetachedHeaderOrFooter(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da8bbc7", new Object[]{this, viewHolder});
            }
        }

        public boolean onFailedHeaderOrFooter(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bff1e556", new Object[]{this, viewHolder})).booleanValue();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("929b8c70", new Object[]{this, viewHolder})).booleanValue();
            }
            if (this.mAdapter == null || viewHolder == null) {
                return super.onFailedToRecycleView(viewHolder);
            }
            if (viewHolder.getItemViewType() == Integer.MIN_VALUE) {
                return onFailedHeaderOrFooter(viewHolder);
            }
            return this.mAdapter.onFailedToRecycleView(viewHolder);
        }

        public void onRecycledHeaderOrFooter(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69f66986", new Object[]{this, viewHolder});
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
            } else if (this.mAdapter != null && viewHolder != null) {
                if (viewHolder.getItemViewType() == Integer.MIN_VALUE) {
                    onAttachedHeaderOrFooter(viewHolder);
                } else {
                    this.mAdapter.onViewAttachedToWindow(viewHolder);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
            } else if (this.mAdapter != null && viewHolder != null) {
                if (viewHolder.getItemViewType() == Integer.MIN_VALUE) {
                    onDetachedHeaderOrFooter(viewHolder);
                } else {
                    this.mAdapter.onViewDetachedFromWindow(viewHolder);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
            } else if (this.mAdapter != null && viewHolder != null) {
                if (viewHolder.getItemViewType() == Integer.MIN_VALUE) {
                    onRecycledHeaderOrFooter(viewHolder);
                } else {
                    this.mAdapter.onViewRecycled(viewHolder);
                }
            }
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
        public final FrameLayout mContainer;

        public HeaderViewHolder(View view) {
            super(view);
            this.mContainer = (FrameLayout) view;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class InnerOnScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public InnerOnScrollListener() {
        }

        public static /* synthetic */ Object ipc$super(InnerOnScrollListener innerOnScrollListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/view/TRecyclerView$InnerOnScrollListener");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            for (int size = TRecyclerView.access$000(TRecyclerView.this).size() - 1; size >= 0; size--) {
                RecyclerView.OnScrollListener onScrollListener = (RecyclerView.OnScrollListener) TRecyclerView.access$000(TRecyclerView.this).get(size);
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
            for (int size = TRecyclerView.access$000(TRecyclerView.this).size() - 1; size >= 0; size--) {
                RecyclerView.OnScrollListener onScrollListener = (RecyclerView.OnScrollListener) TRecyclerView.access$000(TRecyclerView.this).get(size);
                if (onScrollListener != null) {
                    onScrollListener.onScrolled(recyclerView, i, i2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class InnerRecyclerListener implements RecyclerView.RecyclerListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public InnerRecyclerListener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.RecyclerListener
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
                return;
            }
            for (int size = TRecyclerView.access$100(TRecyclerView.this).size() - 1; size >= 0; size--) {
                RecyclerView.RecyclerListener recyclerListener = (RecyclerView.RecyclerListener) TRecyclerView.access$100(TRecyclerView.this).get(size);
                if (recyclerListener != null) {
                    recyclerListener.onViewRecycled(viewHolder);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static abstract class ItemClickGestureListener extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final TRecyclerView mHostView;
        private View mTargetChild;

        public ItemClickGestureListener(TRecyclerView tRecyclerView) {
            this.mHostView = tRecyclerView;
        }

        public static /* synthetic */ Object ipc$super(ItemClickGestureListener itemClickGestureListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/view/TRecyclerView$ItemClickGestureListener");
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
            }
            View findChildViewUnder = this.mHostView.findChildViewUnder((int) motionEvent.getX(), (int) motionEvent.getY());
            this.mTargetChild = findChildViewUnder;
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
            View view = this.mTargetChild;
            if (view != null) {
                int childPosition = this.mHostView.getChildPosition(view);
                long itemId = this.mHostView.getAdapter().getItemId(childPosition);
                int headerViewsCount = childPosition - this.mHostView.getHeaderViewsCount();
                if (!TRecyclerView.access$200(this.mHostView, childPosition)) {
                    z = performItemLongClick(this.mHostView, this.mTargetChild, headerViewsCount, itemId);
                } else {
                    z = false;
                }
                if (z) {
                    this.mTargetChild.setPressed(false);
                    this.mTargetChild = null;
                }
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
            }
            View view = this.mTargetChild;
            if (view == null) {
                return false;
            }
            view.setPressed(false);
            this.mTargetChild = null;
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
                return;
            }
            View view = this.mTargetChild;
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
            View view = this.mTargetChild;
            if (view != null) {
                view.setPressed(false);
                int childPosition = this.mHostView.getChildPosition(this.mTargetChild);
                long itemId = this.mHostView.getAdapter().getItemId(childPosition);
                int headerViewsCount = childPosition - this.mHostView.getHeaderViewsCount();
                if (!TRecyclerView.access$200(this.mHostView, childPosition)) {
                    z = performItemClick(this.mHostView, this.mTargetChild, headerViewsCount, itemId);
                }
                this.mTargetChild = null;
            }
            return z;
        }

        public abstract boolean performItemClick(TRecyclerView tRecyclerView, View view, int i, long j);

        public abstract boolean performItemLongClick(TRecyclerView tRecyclerView, View view, int i, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnItemClickListener {
        void onItemClick(TRecyclerView tRecyclerView, View view, int i, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnItemLongClickListener {
        boolean onItemLongClick(TRecyclerView tRecyclerView, View view, int i, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class SpanSizeLookupCompat extends GridLayoutManager.SpanSizeLookup {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final GridLayoutManager.SpanSizeLookup mSpanSizeLookup;

        public SpanSizeLookupCompat(GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.mSpanSizeLookup = spanSizeLookup;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/uikit/feature/view/TRecyclerView$SpanSizeLookupCompat");
            }
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanGroupIndex(int i, int i2) {
            GridLayoutManager.SpanSizeLookup spanSizeLookup;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2c54c24d", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            if (TRecyclerView.access$200(TRecyclerView.this, i) || (spanSizeLookup = this.mSpanSizeLookup) == null) {
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
            if (TRecyclerView.access$200(TRecyclerView.this, i) || (spanSizeLookup = this.mSpanSizeLookup) == null) {
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
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.mSpanSizeLookup;
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
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.mSpanSizeLookup;
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
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.mSpanSizeLookup;
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
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.mSpanSizeLookup;
            if (spanSizeLookup != null) {
                spanSizeLookup.setSpanIndexCacheEnabled(z);
            } else {
                super.setSpanIndexCacheEnabled(z);
            }
        }
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
            return (List) ipChange.ipc$dispatch("d59d8d84", new Object[]{tRecyclerView});
        }
        return tRecyclerView.mOnScrollListeners;
    }

    public static /* synthetic */ List access$100(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b15f0945", new Object[]{tRecyclerView});
        }
        return tRecyclerView.mRecyclerListeners;
    }

    public static /* synthetic */ boolean access$200(TRecyclerView tRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34bd5006", new Object[]{tRecyclerView, new Integer(i)})).booleanValue();
        }
        return tRecyclerView.isHeaderOrFooter(i);
    }

    public static /* synthetic */ OnItemClickListener access$300(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnItemClickListener) ipChange.ipc$dispatch("79b48944", new Object[]{tRecyclerView});
        }
        return tRecyclerView.mItemClickListener;
    }

    public static /* synthetic */ OnItemLongClickListener access$400(TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnItemLongClickListener) ipChange.ipc$dispatch("2124733f", new Object[]{tRecyclerView});
        }
        return tRecyclerView.mItemLongClickListener;
    }

    private void addGestureDetectorIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddf3248", new Object[]{this});
        } else if (this.mGestureDetector == null) {
            this.mGestureDetector = new GestureDetector(getContext(), new ItemClickGestureListener(this) { // from class: com.taobao.uikit.feature.view.TRecyclerView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/view/TRecyclerView$1");
                }

                @Override // com.taobao.uikit.feature.view.TRecyclerView.ItemClickGestureListener
                public boolean performItemClick(TRecyclerView tRecyclerView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("965e37d8", new Object[]{this, tRecyclerView, view, new Integer(i), new Long(j)})).booleanValue();
                    }
                    if (TRecyclerView.access$300(TRecyclerView.this) == null) {
                        return false;
                    }
                    TRecyclerView.access$300(TRecyclerView.this).onItemClick(tRecyclerView, view, i, j);
                    return true;
                }

                @Override // com.taobao.uikit.feature.view.TRecyclerView.ItemClickGestureListener
                public boolean performItemLongClick(TRecyclerView tRecyclerView, View view, int i, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("1d04cdbc", new Object[]{this, tRecyclerView, view, new Integer(i), new Long(j)})).booleanValue();
                    }
                    if (TRecyclerView.access$400(TRecyclerView.this) == null || !TRecyclerView.access$400(TRecyclerView.this).onItemLongClick(tRecyclerView, view, i, j)) {
                        return false;
                    }
                    return true;
                }
            });
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/view/TRecyclerView");
        }
    }

    @Override // com.taobao.uikit.utils.IFeatureList
    public boolean addFeature(AbsFeature<? super RecyclerView> absFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa4ab52", new Object[]{this, absFeature})).booleanValue();
        }
        return this.mFeatureList.addFeature(absFeature);
    }

    public void addFooterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df49456a", new Object[]{this, view});
        } else {
            addFooterView(this.mFooterViews.size(), view);
        }
    }

    public void addHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59909138", new Object[]{this, view});
        } else {
            addHeaderView(this.mHeaderViews.size(), view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67b00fd", new Object[]{this, onScrollListener});
        } else if (onScrollListener != null) {
            if (this.mOnScrollListeners == null) {
                this.mOnScrollListeners = new ArrayList();
            }
            this.mOnScrollListeners.add(onScrollListener);
        }
    }

    @Override // com.taobao.uikit.utils.IFeatureList
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
            AbsFeature absFeature = this.mFeatureList.get(i);
            if (absFeature instanceof ScrollCallback) {
                ((ScrollCallback) absFeature).beforeComputeScroll();
            }
        }
        super.computeScroll();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i2);
            if (absFeature2 instanceof ScrollCallback) {
                ((ScrollCallback) absFeature2).afterComputeScroll();
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
            AbsFeature absFeature = this.mFeatureList.get(i);
            if (absFeature instanceof CanvasCallback) {
                ((CanvasCallback) absFeature).beforeDispatchDraw(canvas);
            }
        }
        super.dispatchDraw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i2);
            if (absFeature2 instanceof CanvasCallback) {
                ((CanvasCallback) absFeature2).afterDispatchDraw(canvas);
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
            AbsFeature absFeature = this.mFeatureList.get(i);
            if (absFeature instanceof TouchEventCallback) {
                ((TouchEventCallback) absFeature).beforeDispatchTouchEvent(motionEvent);
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i2);
            if (absFeature2 instanceof TouchEventCallback) {
                ((TouchEventCallback) absFeature2).afterDispatchTouchEvent(motionEvent);
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
            AbsFeature absFeature = this.mFeatureList.get(i);
            if (absFeature instanceof CanvasCallback) {
                ((CanvasCallback) absFeature).beforeDraw(canvas);
            }
        }
        super.draw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i2);
            if (absFeature2 instanceof CanvasCallback) {
                ((CanvasCallback) absFeature2).afterDraw(canvas);
            }
        }
    }

    @Override // com.taobao.uikit.feature.view.ViewGroupHelper
    public boolean drawChild(Canvas canvas, View view, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9105d4f", new Object[]{this, canvas, view, new Long(j), new Integer(i)})).booleanValue();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // com.taobao.uikit.utils.IFeatureList
    public AbsFeature<? super RecyclerView> findFeature(Class<? extends AbsFeature<? super RecyclerView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsFeature) ipChange.ipc$dispatch("67a9db6f", new Object[]{this, cls});
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

    public RecyclerView.Adapter getRawAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("b097f000", new Object[]{this});
        }
        return this.mRawAdapter;
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

    @Override // com.taobao.uikit.utils.IFeatureList
    public void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
        } else {
            this.mFeatureList.init(context, attributeSet, i);
        }
    }

    @Override // com.taobao.uikit.feature.view.ViewGroupHelper
    public void measureChild(View view, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cbe2b6", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            super.measureChild(view, i, i2);
        }
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
            AbsFeature absFeature = this.mFeatureList.get(i);
            if (absFeature instanceof CanvasCallback) {
                ((CanvasCallback) absFeature).beforeOnDraw(canvas);
            }
        }
        super.onDraw(canvas);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i2);
            if (absFeature2 instanceof CanvasCallback) {
                ((CanvasCallback) absFeature2).afterOnDraw(canvas);
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
            AbsFeature absFeature = this.mFeatureList.get(i2);
            if (absFeature instanceof FocusCallback) {
                ((FocusCallback) absFeature).beforeOnFocusChanged(z, i, rect);
            }
        }
        super.onFocusChanged(z, i, rect);
        for (int i3 = size - 1; i3 >= 0; i3--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i3);
            if (absFeature2 instanceof FocusCallback) {
                ((FocusCallback) absFeature2).afterOnFocusChanged(z, i, rect);
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
            AbsFeature absFeature = this.mFeatureList.get(i3);
            if (absFeature instanceof MeasureCallback) {
                ((MeasureCallback) absFeature).beforeOnMeasure(i, i2);
            }
        }
        super.onMeasure(i, i2);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i4);
            if (absFeature2 instanceof MeasureCallback) {
                ((MeasureCallback) absFeature2).afterOnMeasure(i, i2);
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
            AbsFeature absFeature = this.mFeatureList.get(i);
            if (absFeature instanceof TouchEventCallback) {
                ((TouchEventCallback) absFeature).beforeOnTouchEvent(motionEvent);
            }
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        GestureDetector gestureDetector = this.mGestureDetector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i2);
            if (absFeature2 instanceof TouchEventCallback) {
                ((TouchEventCallback) absFeature2).afterOnTouchEvent(motionEvent);
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
            AbsFeature absFeature = this.mFeatureList.get(i);
            if (absFeature instanceof FocusCallback) {
                ((FocusCallback) absFeature).beforeOnWindowFocusChanged(z);
            }
        }
        super.onWindowFocusChanged(z);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i2);
            if (absFeature2 instanceof FocusCallback) {
                ((FocusCallback) absFeature2).afterOnWindowFocusChanged(z);
            }
        }
    }

    @Override // com.taobao.uikit.utils.IFeatureList
    public boolean removeFeature(Class<? extends AbsFeature<? super RecyclerView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue();
        }
        return this.mFeatureList.removeFeature(cls);
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
        if (adapter instanceof HeaderViewAdapter) {
            this.mRawAdapter = ((HeaderViewAdapter) adapter).getWrappedAdapter();
        } else if (this.mRawAdapter == null) {
            this.mRawAdapter = adapter;
        }
        int size = this.mFeatureList.size();
        for (int i = 0; i < size; i++) {
            AbsFeature absFeature = this.mFeatureList.get(i);
            if (absFeature instanceof RecyclerAdapterCallback) {
                if (adapter instanceof HeaderViewAdapter) {
                    adapter = ((RecyclerAdapterCallback) absFeature).wrapAdapter(((HeaderViewAdapter) adapter).getWrappedAdapter());
                } else {
                    adapter = ((RecyclerAdapterCallback) absFeature).wrapAdapter(adapter);
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

    @Override // com.taobao.uikit.feature.view.ViewHelper
    public void setMeasuredDimension(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926779c5", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            super.setMeasuredDimension((int) j, (int) j2);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c855c5", new Object[]{this, onItemClickListener});
            return;
        }
        this.mItemClickListener = onItemClickListener;
        if (onItemClickListener != null) {
            addGestureDetectorIfNeed();
        }
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f0277d", new Object[]{this, onItemLongClickListener});
            return;
        }
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.mItemLongClickListener = onItemLongClickListener;
        if (onItemLongClickListener != null) {
            addGestureDetectorIfNeed();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Deprecated
    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3771abe", new Object[]{this, onScrollListener});
        } else if (onScrollListener != null) {
            if (this.mOnScrollListeners == null) {
                this.mOnScrollListeners = new ArrayList();
            }
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

    public void addFooterView(int i, View view) {
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

    public void addHeaderView(int i, View view) {
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        for (int size = this.mFeatureList.size() - 1; size >= 0; size--) {
            AbsFeature absFeature = this.mFeatureList.get(size);
            if (absFeature instanceof InterceptTouchEventCallback) {
                onInterceptTouchEvent = ((InterceptTouchEventCallback) absFeature).onInterceptTouchEvent(motionEvent) | onInterceptTouchEvent;
            }
        }
        return onInterceptTouchEvent;
    }

    private boolean isHeaderOrFooter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd2f91ab", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return getAdapter() == null || i < getHeaderViewsCount() || i >= getAdapter().getItemCount() - getFooterViewsCount();
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int size = this.mFeatureList.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbsFeature absFeature = this.mFeatureList.get(i5);
            if (absFeature instanceof LayoutCallback) {
                ((LayoutCallback) absFeature).beforeOnLayout(z, i, i2, i3, i4);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
        for (int i6 = size - 1; i6 >= 0; i6--) {
            AbsFeature absFeature2 = this.mFeatureList.get(i6);
            if (absFeature2 instanceof LayoutCallback) {
                ((LayoutCallback) absFeature2).afterOnLayout(z, i, i2, i3, i4);
            }
        }
    }

    public TRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TRecyclerView(Context context) {
        this(context, null);
    }
}
