package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.NestedAdapterWrapper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StableIdStorage;
import androidx.recyclerview.widget.ViewTypeStorage;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ConcatAdapterController implements NestedAdapterWrapper.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ConcatAdapter mConcatAdapter;
    private final ConcatAdapter.Config.StableIdMode mStableIdMode;
    private final StableIdStorage mStableIdStorage;
    private final ViewTypeStorage mViewTypeStorage;
    private List<WeakReference<RecyclerView>> mAttachedRecyclerViews = new ArrayList();
    private final IdentityHashMap<RecyclerView.ViewHolder, NestedAdapterWrapper> mBinderLookup = new IdentityHashMap<>();
    private List<NestedAdapterWrapper> mWrappers = new ArrayList();
    private WrapperAndLocalPosition mReusableHolder = new WrapperAndLocalPosition();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class WrapperAndLocalPosition {
        public boolean mInUse;
        public int mLocalPosition;
        public NestedAdapterWrapper mWrapper;
    }

    public ConcatAdapterController(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.mConcatAdapter = concatAdapter;
        if (config.isolateViewTypes) {
            this.mViewTypeStorage = new ViewTypeStorage.IsolatedViewTypeStorage();
        } else {
            this.mViewTypeStorage = new ViewTypeStorage.SharedIdRangeViewTypeStorage();
        }
        ConcatAdapter.Config.StableIdMode stableIdMode = config.stableIdMode;
        this.mStableIdMode = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.mStableIdStorage = new StableIdStorage.NoStableIdStorage();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.mStableIdStorage = new StableIdStorage.IsolatedStableIdStorage();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
            this.mStableIdStorage = new StableIdStorage.SharedPoolStableIdStorage();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    private void calculateAndUpdateStateRestorationPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e924f840", new Object[]{this});
            return;
        }
        RecyclerView.Adapter.StateRestorationPolicy computeStateRestorationPolicy = computeStateRestorationPolicy();
        if (computeStateRestorationPolicy != this.mConcatAdapter.getStateRestorationPolicy()) {
            this.mConcatAdapter.internalSetStateRestorationPolicy(computeStateRestorationPolicy);
        }
    }

    private RecyclerView.Adapter.StateRestorationPolicy computeStateRestorationPolicy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter.StateRestorationPolicy) ipChange.ipc$dispatch("58ac09ba", new Object[]{this});
        }
        for (NestedAdapterWrapper nestedAdapterWrapper : this.mWrappers) {
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = nestedAdapterWrapper.adapter.getStateRestorationPolicy();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy == stateRestorationPolicy2) {
                return stateRestorationPolicy2;
            }
            if (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && nestedAdapterWrapper.getCachedItemCount() == 0) {
                return stateRestorationPolicy2;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    private int countItemsBefore(NestedAdapterWrapper nestedAdapterWrapper) {
        NestedAdapterWrapper next;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("817da9bc", new Object[]{this, nestedAdapterWrapper})).intValue();
        }
        Iterator<NestedAdapterWrapper> it = this.mWrappers.iterator();
        while (it.hasNext() && (next = it.next()) != nestedAdapterWrapper) {
            i += next.getCachedItemCount();
        }
        return i;
    }

    private WrapperAndLocalPosition findWrapperAndLocalPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WrapperAndLocalPosition) ipChange.ipc$dispatch("8afc2443", new Object[]{this, new Integer(i)});
        }
        WrapperAndLocalPosition wrapperAndLocalPosition = this.mReusableHolder;
        if (wrapperAndLocalPosition.mInUse) {
            wrapperAndLocalPosition = new WrapperAndLocalPosition();
        } else {
            wrapperAndLocalPosition.mInUse = true;
        }
        Iterator<NestedAdapterWrapper> it = this.mWrappers.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NestedAdapterWrapper next = it.next();
            if (next.getCachedItemCount() > i2) {
                wrapperAndLocalPosition.mWrapper = next;
                wrapperAndLocalPosition.mLocalPosition = i2;
                break;
            }
            i2 -= next.getCachedItemCount();
        }
        if (wrapperAndLocalPosition.mWrapper != null) {
            return wrapperAndLocalPosition;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    private NestedAdapterWrapper findWrapperFor(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NestedAdapterWrapper) ipChange.ipc$dispatch("e0b28066", new Object[]{this, adapter});
        }
        int indexOfWrapper = indexOfWrapper(adapter);
        if (indexOfWrapper == -1) {
            return null;
        }
        return this.mWrappers.get(indexOfWrapper);
    }

    private NestedAdapterWrapper getWrapper(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NestedAdapterWrapper) ipChange.ipc$dispatch("ccb4ac78", new Object[]{this, viewHolder});
        }
        NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper != null) {
            return nestedAdapterWrapper;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    private int indexOfWrapper(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76a189ce", new Object[]{this, adapter})).intValue();
        }
        int size = this.mWrappers.size();
        for (int i = 0; i < size; i++) {
            if (this.mWrappers.get(i).adapter == adapter) {
                return i;
            }
        }
        return -1;
    }

    private boolean isAttachedTo(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c720d66b", new Object[]{this, recyclerView})).booleanValue();
        }
        for (WeakReference<RecyclerView> weakReference : this.mAttachedRecyclerViews) {
            if (weakReference.get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    private void releaseWrapperAndLocalPosition(WrapperAndLocalPosition wrapperAndLocalPosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb447982", new Object[]{this, wrapperAndLocalPosition});
            return;
        }
        wrapperAndLocalPosition.mInUse = false;
        wrapperAndLocalPosition.mWrapper = null;
        wrapperAndLocalPosition.mLocalPosition = -1;
        this.mReusableHolder = wrapperAndLocalPosition;
    }

    public boolean addAdapter(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4720affb", new Object[]{this, adapter})).booleanValue() : addAdapter(this.mWrappers.size(), adapter);
    }

    public boolean canRestoreState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb56099e", new Object[]{this})).booleanValue();
        }
        for (NestedAdapterWrapper nestedAdapterWrapper : this.mWrappers) {
            if (!nestedAdapterWrapper.adapter.canRestoreState()) {
                return false;
            }
        }
        return true;
    }

    public RecyclerView.Adapter<? extends RecyclerView.ViewHolder> getBoundAdapter(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("14eda30e", new Object[]{this, viewHolder});
        }
        NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            return null;
        }
        return nestedAdapterWrapper.adapter;
    }

    public List<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> getCopyOfAdapters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c8c530da", new Object[]{this});
        }
        if (this.mWrappers.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.mWrappers.size());
        for (NestedAdapterWrapper nestedAdapterWrapper : this.mWrappers) {
            arrayList.add(nestedAdapterWrapper.adapter);
        }
        return arrayList;
    }

    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        WrapperAndLocalPosition findWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        long itemId = findWrapperAndLocalPosition.mWrapper.getItemId(findWrapperAndLocalPosition.mLocalPosition);
        releaseWrapperAndLocalPosition(findWrapperAndLocalPosition);
        return itemId;
    }

    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        WrapperAndLocalPosition findWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        int itemViewType = findWrapperAndLocalPosition.mWrapper.getItemViewType(findWrapperAndLocalPosition.mLocalPosition);
        releaseWrapperAndLocalPosition(findWrapperAndLocalPosition);
        return itemViewType;
    }

    public int getLocalAdapterPosition(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter, RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9362bef0", new Object[]{this, adapter, viewHolder, new Integer(i)})).intValue();
        }
        NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper == null) {
            return -1;
        }
        int countItemsBefore = i - countItemsBefore(nestedAdapterWrapper);
        int itemCount = nestedAdapterWrapper.adapter.getItemCount();
        if (countItemsBefore >= 0 && countItemsBefore < itemCount) {
            return nestedAdapterWrapper.adapter.findRelativeAdapterPositionIn(adapter, viewHolder, countItemsBefore);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + countItemsBefore + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + viewHolder + "adapter:" + adapter);
    }

    public int getTotalCount() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue();
        }
        for (NestedAdapterWrapper nestedAdapterWrapper : this.mWrappers) {
            i += nestedAdapterWrapper.getCachedItemCount();
        }
        return i;
    }

    public Pair<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>, Integer> getWrappedAdapterAndPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("aea5cea6", new Object[]{this, new Integer(i)});
        }
        WrapperAndLocalPosition findWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        Pair<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>, Integer> pair = new Pair<>(findWrapperAndLocalPosition.mWrapper.adapter, Integer.valueOf(findWrapperAndLocalPosition.mLocalPosition));
        releaseWrapperAndLocalPosition(findWrapperAndLocalPosition);
        return pair;
    }

    public boolean hasStableIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue();
        }
        if (this.mStableIdMode != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            return true;
        }
        return false;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
        } else if (!isAttachedTo(recyclerView)) {
            this.mAttachedRecyclerViews.add(new WeakReference<>(recyclerView));
            for (NestedAdapterWrapper nestedAdapterWrapper : this.mWrappers) {
                nestedAdapterWrapper.adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        WrapperAndLocalPosition findWrapperAndLocalPosition = findWrapperAndLocalPosition(i);
        this.mBinderLookup.put(viewHolder, findWrapperAndLocalPosition.mWrapper);
        findWrapperAndLocalPosition.mWrapper.onBindViewHolder(viewHolder, findWrapperAndLocalPosition.mLocalPosition);
        releaseWrapperAndLocalPosition(findWrapperAndLocalPosition);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onChanged(NestedAdapterWrapper nestedAdapterWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485e6f24", new Object[]{this, nestedAdapterWrapper});
            return;
        }
        this.mConcatAdapter.notifyDataSetChanged();
        calculateAndUpdateStateRestorationPolicy();
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return this.mViewTypeStorage.getWrapperForGlobalType(i).onCreateViewHolder(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14ed1", new Object[]{this, recyclerView});
            return;
        }
        int size = this.mAttachedRecyclerViews.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.mAttachedRecyclerViews.get(size);
            if (weakReference.get() == null) {
                this.mAttachedRecyclerViews.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.mAttachedRecyclerViews.remove(size);
                break;
            }
            size--;
        }
        for (NestedAdapterWrapper nestedAdapterWrapper : this.mWrappers) {
            nestedAdapterWrapper.adapter.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929b8c70", new Object[]{this, viewHolder})).booleanValue();
        }
        NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper != null) {
            boolean onFailedToRecycleView = nestedAdapterWrapper.adapter.onFailedToRecycleView(viewHolder);
            this.mBinderLookup.remove(viewHolder);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeChanged(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b2770", new Object[]{this, nestedAdapterWrapper, new Integer(i), new Integer(i2)});
        } else {
            this.mConcatAdapter.notifyItemRangeChanged(i + countItemsBefore(nestedAdapterWrapper), i2);
        }
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeInserted(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85f2d516", new Object[]{this, nestedAdapterWrapper, new Integer(i), new Integer(i2)});
        } else {
            this.mConcatAdapter.notifyItemRangeInserted(i + countItemsBefore(nestedAdapterWrapper), i2);
        }
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeMoved(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52187311", new Object[]{this, nestedAdapterWrapper, new Integer(i), new Integer(i2)});
            return;
        }
        int countItemsBefore = countItemsBefore(nestedAdapterWrapper);
        this.mConcatAdapter.notifyItemMoved(i + countItemsBefore, i2 + countItemsBefore);
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeRemoved(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f79b44", new Object[]{this, nestedAdapterWrapper, new Integer(i), new Integer(i2)});
        } else {
            this.mConcatAdapter.notifyItemRangeRemoved(i + countItemsBefore(nestedAdapterWrapper), i2);
        }
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onStateRestorationPolicyChanged(NestedAdapterWrapper nestedAdapterWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bed1c8a3", new Object[]{this, nestedAdapterWrapper});
        } else {
            calculateAndUpdateStateRestorationPolicy();
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
        } else {
            getWrapper(viewHolder).adapter.onViewAttachedToWindow(viewHolder);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
        } else {
            getWrapper(viewHolder).adapter.onViewDetachedFromWindow(viewHolder);
        }
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
            return;
        }
        NestedAdapterWrapper nestedAdapterWrapper = this.mBinderLookup.get(viewHolder);
        if (nestedAdapterWrapper != null) {
            nestedAdapterWrapper.adapter.onViewRecycled(viewHolder);
            this.mBinderLookup.remove(viewHolder);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    public boolean removeAdapter(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f088349e", new Object[]{this, adapter})).booleanValue();
        }
        int indexOfWrapper = indexOfWrapper(adapter);
        if (indexOfWrapper == -1) {
            return false;
        }
        NestedAdapterWrapper nestedAdapterWrapper = this.mWrappers.get(indexOfWrapper);
        int countItemsBefore = countItemsBefore(nestedAdapterWrapper);
        this.mWrappers.remove(indexOfWrapper);
        this.mConcatAdapter.notifyItemRangeRemoved(countItemsBefore, nestedAdapterWrapper.getCachedItemCount());
        for (WeakReference<RecyclerView> weakReference : this.mAttachedRecyclerViews) {
            RecyclerView recyclerView = weakReference.get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        nestedAdapterWrapper.dispose();
        calculateAndUpdateStateRestorationPolicy();
        return true;
    }

    public boolean addAdapter(int i, RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bbe7fa2", new Object[]{this, new Integer(i), adapter})).booleanValue();
        }
        if (i < 0 || i > this.mWrappers.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.mWrappers.size() + ". Given:" + i);
        }
        if (hasStableIds()) {
            Preconditions.checkArgument(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            adapter.hasStableIds();
        }
        if (findWrapperFor(adapter) != null) {
            return false;
        }
        NestedAdapterWrapper nestedAdapterWrapper = new NestedAdapterWrapper(adapter, this, this.mViewTypeStorage, this.mStableIdStorage.createStableIdLookup());
        this.mWrappers.add(i, nestedAdapterWrapper);
        for (WeakReference<RecyclerView> weakReference : this.mAttachedRecyclerViews) {
            RecyclerView recyclerView = weakReference.get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (nestedAdapterWrapper.getCachedItemCount() > 0) {
            this.mConcatAdapter.notifyItemRangeInserted(countItemsBefore(nestedAdapterWrapper), nestedAdapterWrapper.getCachedItemCount());
        }
        calculateAndUpdateStateRestorationPolicy();
        return true;
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeChanged(NestedAdapterWrapper nestedAdapterWrapper, int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94e1b4c", new Object[]{this, nestedAdapterWrapper, new Integer(i), new Integer(i2), obj});
        } else {
            this.mConcatAdapter.notifyItemRangeChanged(i + countItemsBefore(nestedAdapterWrapper), i2, obj);
        }
    }
}
