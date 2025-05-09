package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AsyncListUtil<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncListUtil";
    public boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    public final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    public final DataCallback<T> mDataCallback;
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    public final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    public final Class<T> mTClass;
    public final TileList<T> mTileList;
    public final int mTileSize;
    public final ViewCallback mViewCallback;
    public final int[] mTmpRange = new int[2];
    public final int[] mPrevRange = new int[2];
    public final int[] mTmpRangeExtended = new int[2];
    private int mScrollHint = 0;
    public int mItemCount = 0;
    public int mDisplayedGeneration = 0;
    public int mRequestedGeneration = 0;
    public final SparseIntArray mMissingPositions = new SparseIntArray();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class DataCallback<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void fillData(T[] tArr, int i, int i2);

        public int getMaxCachedTiles() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f922c26f", new Object[]{this})).intValue();
            }
            return 10;
        }

        public void recycleData(T[] tArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("345996d6", new Object[]{this, tArr, new Integer(i)});
            }
        }

        public abstract int refreshData();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class ViewCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        public void extendRangeInto(int[] iArr, int[] iArr2, int i) {
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9aa77bdd", new Object[]{this, iArr, iArr2, new Integer(i)});
                return;
            }
            int i3 = iArr[1];
            int i4 = iArr[0];
            int i5 = (i3 - i4) + 1;
            int i6 = i5 / 2;
            if (i == 1) {
                i2 = i5;
            } else {
                i2 = i6;
            }
            iArr2[0] = i4 - i2;
            if (i != 2) {
                i5 = i6;
            }
            iArr2[1] = i3 + i5;
        }

        public abstract void getItemRangeInto(int[] iArr);

        public abstract void onDataRefresh();

        public abstract void onItemLoaded(int i);
    }

    public AsyncListUtil(Class<T> cls, int i, DataCallback<T> dataCallback, ViewCallback viewCallback) {
        ThreadUtil.MainThreadCallback<T> mainThreadCallback = new ThreadUtil.MainThreadCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private boolean isRequestedGeneration(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f13f2f44", new Object[]{this, new Integer(i2)})).booleanValue();
                }
                if (i2 == AsyncListUtil.this.mRequestedGeneration) {
                    return true;
                }
                return false;
            }

            private void recycleAllTiles() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2f73ab1e", new Object[]{this});
                    return;
                }
                for (int i2 = 0; i2 < AsyncListUtil.this.mTileList.size(); i2++) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mBackgroundProxy.recycleTile(asyncListUtil.mTileList.getAtIndex(i2));
                }
                AsyncListUtil.this.mTileList.clear();
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void addTile(int i2, TileList.Tile<T> tile) {
                int i3 = 0;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("867aa9fc", new Object[]{this, new Integer(i2), tile});
                } else if (!isRequestedGeneration(i2)) {
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                } else {
                    TileList.Tile<T> addOrReplace = AsyncListUtil.this.mTileList.addOrReplace(tile);
                    if (addOrReplace != null) {
                        Log.e(AsyncListUtil.TAG, "duplicate tile @" + addOrReplace.mStartPosition);
                        AsyncListUtil.this.mBackgroundProxy.recycleTile(addOrReplace);
                    }
                    int i4 = tile.mStartPosition + tile.mItemCount;
                    while (i3 < AsyncListUtil.this.mMissingPositions.size()) {
                        int keyAt = AsyncListUtil.this.mMissingPositions.keyAt(i3);
                        if (tile.mStartPosition > keyAt || keyAt >= i4) {
                            i3++;
                        } else {
                            AsyncListUtil.this.mMissingPositions.removeAt(i3);
                            AsyncListUtil.this.mViewCallback.onItemLoaded(keyAt);
                        }
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void removeTile(int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c1b4f6f9", new Object[]{this, new Integer(i2), new Integer(i3)});
                } else if (isRequestedGeneration(i2)) {
                    TileList.Tile<T> removeAtPos = AsyncListUtil.this.mTileList.removeAtPos(i3);
                    if (removeAtPos == null) {
                        Log.e(AsyncListUtil.TAG, "tile not found @" + i3);
                        return;
                    }
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(removeAtPos);
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("61582fda", new Object[]{this, new Integer(i2), new Integer(i3)});
                } else if (isRequestedGeneration(i2)) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mItemCount = i3;
                    asyncListUtil.mViewCallback.onDataRefresh();
                    AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
                    asyncListUtil2.mDisplayedGeneration = asyncListUtil2.mRequestedGeneration;
                    recycleAllTiles();
                    AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
                    asyncListUtil3.mAllowScrollHints = false;
                    asyncListUtil3.updateRange();
                }
            }
        };
        this.mMainThreadCallback = mainThreadCallback;
        ThreadUtil.BackgroundCallback<T> backgroundCallback = new ThreadUtil.BackgroundCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int mFirstRequiredTileStart;
            private int mGeneration;
            private int mItemCount;
            private int mLastRequiredTileStart;
            public final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
            private TileList.Tile<T> mRecycledRoot;

            private TileList.Tile<T> acquireTile() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (TileList.Tile) ipChange.ipc$dispatch("d756c1fa", new Object[]{this});
                }
                TileList.Tile<T> tile = this.mRecycledRoot;
                if (tile != null) {
                    this.mRecycledRoot = tile.mNext;
                    return tile;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                return new TileList.Tile<>(asyncListUtil.mTClass, asyncListUtil.mTileSize);
            }

            private void addTile(TileList.Tile<T> tile) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9361d6a5", new Object[]{this, tile});
                    return;
                }
                this.mLoadedTiles.put(tile.mStartPosition, true);
                AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
            }

            private void flushTileCache(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f622ce8c", new Object[]{this, new Integer(i2)});
                    return;
                }
                int maxCachedTiles = AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
                while (this.mLoadedTiles.size() >= maxCachedTiles) {
                    int keyAt = this.mLoadedTiles.keyAt(0);
                    SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                    int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i3 = this.mFirstRequiredTileStart - keyAt;
                    int i4 = keyAt2 - this.mLastRequiredTileStart;
                    if (i3 > 0 && (i3 >= i4 || i2 == 2)) {
                        removeTile(keyAt);
                    } else if (i4 <= 0) {
                        return;
                    } else {
                        if (i3 < i4 || i2 == 1) {
                            removeTile(keyAt2);
                        } else {
                            return;
                        }
                    }
                }
            }

            private int getTileStart(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("2e392271", new Object[]{this, new Integer(i2)})).intValue();
                }
                return i2 - (i2 % AsyncListUtil.this.mTileSize);
            }

            private boolean isTileLoaded(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a03c7863", new Object[]{this, new Integer(i2)})).booleanValue();
                }
                return this.mLoadedTiles.get(i2);
            }

            private void log(String str, Object... objArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5242d63c", new Object[]{this, str, objArr});
                } else {
                    "[BKGR] ".concat(String.format(str, objArr));
                }
            }

            private void removeTile(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4850254a", new Object[]{this, new Integer(i2)});
                    return;
                }
                this.mLoadedTiles.delete(i2);
                AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, i2);
            }

            private void requestTiles(int i2, int i3, int i4, boolean z) {
                int i5;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("47241dce", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
                    return;
                }
                int i6 = i2;
                while (i6 <= i3) {
                    if (z) {
                        i5 = (i3 + i2) - i6;
                    } else {
                        i5 = i6;
                    }
                    AsyncListUtil.this.mBackgroundProxy.loadTile(i5, i4);
                    i6 += AsyncListUtil.this.mTileSize;
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void loadTile(int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2da30db", new Object[]{this, new Integer(i2), new Integer(i3)});
                } else if (!isTileLoaded(i2)) {
                    TileList.Tile<T> acquireTile = acquireTile();
                    acquireTile.mStartPosition = i2;
                    int min = Math.min(AsyncListUtil.this.mTileSize, this.mItemCount - i2);
                    acquireTile.mItemCount = min;
                    AsyncListUtil.this.mDataCallback.fillData(acquireTile.mItems, acquireTile.mStartPosition, min);
                    flushTileCache(i3);
                    addTile(acquireTile);
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void recycleTile(TileList.Tile<T> tile) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("698d1b97", new Object[]{this, tile});
                    return;
                }
                AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
                tile.mNext = this.mRecycledRoot;
                this.mRecycledRoot = tile;
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void refresh(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fa697d61", new Object[]{this, new Integer(i2)});
                    return;
                }
                this.mGeneration = i2;
                this.mLoadedTiles.clear();
                int refreshData = AsyncListUtil.this.mDataCallback.refreshData();
                this.mItemCount = refreshData;
                AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, refreshData);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void updateRange(int i2, int i3, int i4, int i5, int i6) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a061e6a8", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
                } else if (i2 <= i3) {
                    int tileStart = getTileStart(i2);
                    int tileStart2 = getTileStart(i3);
                    this.mFirstRequiredTileStart = getTileStart(i4);
                    int tileStart3 = getTileStart(i5);
                    this.mLastRequiredTileStart = tileStart3;
                    if (i6 == 1) {
                        requestTiles(this.mFirstRequiredTileStart, tileStart2, i6, true);
                        requestTiles(tileStart2 + AsyncListUtil.this.mTileSize, this.mLastRequiredTileStart, i6, false);
                        return;
                    }
                    requestTiles(tileStart, tileStart3, i6, false);
                    requestTiles(this.mFirstRequiredTileStart, tileStart - AsyncListUtil.this.mTileSize, i6, true);
                }
            }
        };
        this.mBackgroundCallback = backgroundCallback;
        this.mTClass = cls;
        this.mTileSize = i;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new TileList<>(i);
        MessageThreadUtil messageThreadUtil = new MessageThreadUtil();
        this.mMainThreadProxy = messageThreadUtil.getMainThreadProxy(mainThreadCallback);
        this.mBackgroundProxy = messageThreadUtil.getBackgroundProxy(backgroundCallback);
        refresh();
    }

    private boolean isRefreshPending() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19b84b91", new Object[]{this})).booleanValue();
        }
        if (this.mRequestedGeneration != this.mDisplayedGeneration) {
            return true;
        }
        return false;
    }

    public T getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.mItemCount) {
            throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.mItemCount);
        }
        T itemAt = this.mTileList.getItemAt(i);
        if (itemAt == null && !isRefreshPending()) {
            this.mMissingPositions.put(i, 0);
        }
        return itemAt;
    }

    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.mItemCount;
    }

    public void log(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5242d63c", new Object[]{this, str, objArr});
        } else {
            "[MAIN] ".concat(String.format(str, objArr));
        }
    }

    public void onRangeChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f2757bd", new Object[]{this});
        } else if (!isRefreshPending()) {
            updateRange();
            this.mAllowScrollHints = true;
        }
    }

    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
            return;
        }
        this.mMissingPositions.clear();
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int i = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = i;
        backgroundCallback.refresh(i);
    }

    public void updateRange() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb907b", new Object[]{this});
            return;
        }
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (i2 <= i3 && i2 >= 0 && i3 < this.mItemCount) {
            if (!this.mAllowScrollHints) {
                this.mScrollHint = 0;
            } else {
                int[] iArr2 = this.mPrevRange;
                if (i2 > iArr2[1] || (i = iArr2[0]) > i3) {
                    this.mScrollHint = 0;
                } else if (i2 < i) {
                    this.mScrollHint = 1;
                } else if (i2 > i) {
                    this.mScrollHint = 2;
                }
            }
            int[] iArr3 = this.mPrevRange;
            iArr3[0] = i2;
            iArr3[1] = i3;
            this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
            int[] iArr4 = this.mTmpRangeExtended;
            iArr4[0] = Math.min(this.mTmpRange[0], Math.max(iArr4[0], 0));
            int[] iArr5 = this.mTmpRangeExtended;
            iArr5[1] = Math.max(this.mTmpRange[1], Math.min(iArr5[1], this.mItemCount - 1));
            ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
            int[] iArr6 = this.mTmpRange;
            int i4 = iArr6[0];
            int i5 = iArr6[1];
            int[] iArr7 = this.mTmpRangeExtended;
            backgroundCallback.updateRange(i4, i5, iArr7[0], iArr7[1], this.mScrollHint);
        }
    }
}
