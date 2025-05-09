package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewInfoStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean DEBUG = false;
    public final SimpleArrayMap<RecyclerView.ViewHolder, InfoRecord> mLayoutHolderMap = new SimpleArrayMap<>();
    public final LongSparseArray<RecyclerView.ViewHolder> mOldChangedHolders = new LongSparseArray<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class InfoRecord {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int FLAG_APPEAR = 2;
        public static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        public static final int FLAG_APPEAR_PRE_AND_POST = 14;
        public static final int FLAG_DISAPPEARED = 1;
        public static final int FLAG_POST = 8;
        public static final int FLAG_PRE = 4;
        public static final int FLAG_PRE_AND_POST = 12;
        public static Pools.Pool<InfoRecord> sPool = new Pools.SimplePool(20);
        public int flags;
        public RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
        public RecyclerView.ItemAnimator.ItemHolderInfo preInfo;

        private InfoRecord() {
        }

        public static void drainCache() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb07fff1", new Object[0]);
            } else {
                do {
                } while (sPool.acquire() != null);
            }
        }

        public static InfoRecord obtain() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InfoRecord) ipChange.ipc$dispatch("c4248802", new Object[0]);
            }
            InfoRecord acquire = sPool.acquire();
            if (acquire == null) {
                return new InfoRecord();
            }
            return acquire;
        }

        public static void recycle(InfoRecord infoRecord) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19b7418c", new Object[]{infoRecord});
                return;
            }
            infoRecord.flags = 0;
            infoRecord.preInfo = null;
            infoRecord.postInfo = null;
            sPool.release(infoRecord);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ProcessCallback {
        void processAppeared(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processDisappeared(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void processPersistent(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        void unused(RecyclerView.ViewHolder viewHolder);
    }

    private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder viewHolder, int i) {
        InfoRecord valueAt;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemAnimator.ItemHolderInfo) ipChange.ipc$dispatch("37815efb", new Object[]{this, viewHolder, new Integer(i)});
        }
        int indexOfKey = this.mLayoutHolderMap.indexOfKey(viewHolder);
        if (indexOfKey >= 0 && (valueAt = this.mLayoutHolderMap.valueAt(indexOfKey)) != null) {
            int i2 = valueAt.flags;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                valueAt.flags = i3;
                if (i == 4) {
                    itemHolderInfo = valueAt.preInfo;
                } else if (i == 8) {
                    itemHolderInfo = valueAt.postInfo;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.mLayoutHolderMap.removeAt(indexOfKey);
                    InfoRecord.recycle(valueAt);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    public void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0c704a", new Object[]{this, viewHolder, itemHolderInfo});
            return;
        }
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.flags |= 2;
        infoRecord.preInfo = itemHolderInfo;
    }

    public void addToDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cffdc60", new Object[]{this, viewHolder});
            return;
        }
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.flags |= 1;
    }

    public void addToOldChangeHolders(long j, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c0ed5", new Object[]{this, new Long(j), viewHolder});
        } else {
            this.mOldChangedHolders.put(j, viewHolder);
        }
    }

    public void addToPostLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2c6e73", new Object[]{this, viewHolder, itemHolderInfo});
            return;
        }
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.postInfo = itemHolderInfo;
        infoRecord.flags |= 8;
    }

    public void addToPreLayout(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f5a7c8", new Object[]{this, viewHolder, itemHolderInfo});
            return;
        }
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.preInfo = itemHolderInfo;
        infoRecord.flags |= 4;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.clear();
    }

    public RecyclerView.ViewHolder getFromOldChangeHolders(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("eaf4824d", new Object[]{this, new Long(j)});
        }
        return this.mOldChangedHolders.get(j);
    }

    public boolean isDisappearing(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeed4158", new Object[]{this, viewHolder})).booleanValue();
        }
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null || (infoRecord.flags & 1) == 0) {
            return false;
        }
        return true;
    }

    public boolean isInPreLayout(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d50d05ed", new Object[]{this, viewHolder})).booleanValue();
        }
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null || (infoRecord.flags & 4) == 0) {
            return false;
        }
        return true;
    }

    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            InfoRecord.drainCache();
        }
    }

    public void onViewDetached(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df1e9421", new Object[]{this, viewHolder});
        } else {
            removeFromDisappearedInLayout(viewHolder);
        }
    }

    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemAnimator.ItemHolderInfo) ipChange.ipc$dispatch("70953904", new Object[]{this, viewHolder});
        }
        return popFromLayoutStep(viewHolder, 8);
    }

    public RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemAnimator.ItemHolderInfo) ipChange.ipc$dispatch("202cc171", new Object[]{this, viewHolder});
        }
        return popFromLayoutStep(viewHolder, 4);
    }

    public void process(ProcessCallback processCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d36b26d", new Object[]{this, processCallback});
            return;
        }
        for (int size = this.mLayoutHolderMap.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder keyAt = this.mLayoutHolderMap.keyAt(size);
            InfoRecord removeAt = this.mLayoutHolderMap.removeAt(size);
            int i = removeAt.flags;
            if ((i & 3) == 3) {
                processCallback.unused(keyAt);
            } else if ((i & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = removeAt.preInfo;
                if (itemHolderInfo == null) {
                    processCallback.unused(keyAt);
                } else {
                    processCallback.processDisappeared(keyAt, itemHolderInfo, removeAt.postInfo);
                }
            } else if ((i & 14) == 14) {
                processCallback.processAppeared(keyAt, removeAt.preInfo, removeAt.postInfo);
            } else if ((i & 12) == 12) {
                processCallback.processPersistent(keyAt, removeAt.preInfo, removeAt.postInfo);
            } else if ((i & 4) != 0) {
                processCallback.processDisappeared(keyAt, removeAt.preInfo, null);
            } else if ((i & 8) != 0) {
                processCallback.processAppeared(keyAt, removeAt.preInfo, removeAt.postInfo);
            }
            InfoRecord.recycle(removeAt);
        }
    }

    public void removeFromDisappearedInLayout(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76a1e4e", new Object[]{this, viewHolder});
            return;
        }
        InfoRecord infoRecord = this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord != null) {
            infoRecord.flags &= -2;
        }
    }

    public void removeViewHolder(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a856300", new Object[]{this, viewHolder});
            return;
        }
        int size = this.mOldChangedHolders.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (viewHolder == this.mOldChangedHolders.valueAt(size)) {
                this.mOldChangedHolders.removeAt(size);
                break;
            } else {
                size--;
            }
        }
        InfoRecord remove = this.mLayoutHolderMap.remove(viewHolder);
        if (remove != null) {
            InfoRecord.recycle(remove);
        }
    }
}
