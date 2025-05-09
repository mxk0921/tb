package androidx.recyclerview.widget;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TileList<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Tile<T> mLastAccessedTile;
    public final int mTileSize;
    private final SparseArray<Tile<T>> mTiles = new SparseArray<>(10);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Tile<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mItemCount;
        public final T[] mItems;
        public Tile<T> mNext;
        public int mStartPosition;

        public Tile(Class<T> cls, int i) {
            this.mItems = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        }

        public boolean containsPosition(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("54141bf8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            int i2 = this.mStartPosition;
            if (i2 > i || i >= i2 + this.mItemCount) {
                return false;
            }
            return true;
        }

        public T getByPosition(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("7d2816c", new Object[]{this, new Integer(i)});
            }
            return this.mItems[i - this.mStartPosition];
        }
    }

    public TileList(int i) {
        this.mTileSize = i;
    }

    public Tile<T> addOrReplace(Tile<T> tile) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Tile) ipChange.ipc$dispatch("c93d8cdf", new Object[]{this, tile});
        }
        int indexOfKey = this.mTiles.indexOfKey(tile.mStartPosition);
        if (indexOfKey < 0) {
            this.mTiles.put(tile.mStartPosition, tile);
            return null;
        }
        Tile<T> valueAt = this.mTiles.valueAt(indexOfKey);
        this.mTiles.setValueAt(indexOfKey, tile);
        if (this.mLastAccessedTile == valueAt) {
            this.mLastAccessedTile = tile;
        }
        return valueAt;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mTiles.clear();
        }
    }

    public Tile<T> getAtIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Tile) ipChange.ipc$dispatch("55768752", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.mTiles.size()) {
            return null;
        }
        return this.mTiles.valueAt(i);
    }

    public T getItemAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("29568bf2", new Object[]{this, new Integer(i)});
        }
        Tile<T> tile = this.mLastAccessedTile;
        if (tile == null || !tile.containsPosition(i)) {
            int indexOfKey = this.mTiles.indexOfKey(i - (i % this.mTileSize));
            if (indexOfKey < 0) {
                return null;
            }
            this.mLastAccessedTile = this.mTiles.valueAt(indexOfKey);
        }
        return this.mLastAccessedTile.getByPosition(i);
    }

    public Tile<T> removeAtPos(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Tile) ipChange.ipc$dispatch("af4ba626", new Object[]{this, new Integer(i)});
        }
        Tile<T> tile = this.mTiles.get(i);
        if (this.mLastAccessedTile == tile) {
            this.mLastAccessedTile = null;
        }
        this.mTiles.delete(i);
        return tile;
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.mTiles.size();
    }
}
