package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DiffUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Comparator<Diagonal> DIAGONAL_COMPARATOR = new Comparator<Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int compare(Diagonal diagonal, Diagonal diagonal2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e7d61ae5", new Object[]{this, diagonal, diagonal2})).intValue() : diagonal.x - diagonal2.x;
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("2951e5e3", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class CenteredArray {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int[] mData;
        private final int mMid;

        public CenteredArray(int i) {
            int[] iArr = new int[i];
            this.mData = iArr;
            this.mMid = iArr.length / 2;
        }

        public int[] backingData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("3a248078", new Object[]{this});
            }
            return this.mData;
        }

        public void fill(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("baa783b9", new Object[]{this, new Integer(i)});
            } else {
                Arrays.fill(this.mData, i);
            }
        }

        public int get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("72fc15b9", new Object[]{this, new Integer(i)})).intValue();
            }
            return this.mData[i + this.mMid];
        }

        public void set(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfbc4a09", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                this.mData[i + this.mMid] = i2;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Diagonal {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final int size;
        public final int x;
        public final int y;

        public Diagonal(int i, int i2, int i3) {
            this.x = i;
            this.y = i2;
            this.size = i3;
        }

        public int endX() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("665660d7", new Object[]{this})).intValue();
            }
            return this.x + this.size;
        }

        public int endY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("66647858", new Object[]{this})).intValue();
            }
            return this.y + this.size;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class DiffResult {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final List<Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        public DiffResult(Callback callback, List<Diagonal> list, int[] iArr, int[] iArr2, boolean z) {
            this.mDiagonals = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            Diagonal diagonal;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efa6ab07", new Object[]{this});
                return;
            }
            if (this.mDiagonals.isEmpty()) {
                diagonal = null;
            } else {
                diagonal = this.mDiagonals.get(0);
            }
            if (!(diagonal != null && diagonal.x == 0 && diagonal.y == 0)) {
                this.mDiagonals.add(0, new Diagonal(0, 0, 0));
            }
            this.mDiagonals.add(new Diagonal(this.mOldListSize, this.mNewListSize, 0));
        }

        private void findMatchingAddition(int i) {
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("645c40aa", new Object[]{this, new Integer(i)});
                return;
            }
            int size = this.mDiagonals.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Diagonal diagonal = this.mDiagonals.get(i4);
                while (i3 < diagonal.y) {
                    if (this.mNewItemStatuses[i3] != 0 || !this.mCallback.areItemsTheSame(i, i3)) {
                        i3++;
                    } else {
                        if (this.mCallback.areContentsTheSame(i, i3)) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        this.mOldItemStatuses[i] = (i3 << 4) | i2;
                        this.mNewItemStatuses[i3] = (i << 4) | i2;
                        return;
                    }
                }
                i3 = diagonal.endY();
            }
        }

        private void findMatchingItems() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43c78011", new Object[]{this});
                return;
            }
            for (Diagonal diagonal : this.mDiagonals) {
                for (int i2 = 0; i2 < diagonal.size; i2++) {
                    int i3 = diagonal.x + i2;
                    int i4 = diagonal.y + i2;
                    if (this.mCallback.areContentsTheSame(i3, i4)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.mOldItemStatuses[i3] = (i4 << 4) | i;
                    this.mNewItemStatuses[i4] = (i3 << 4) | i;
                }
            }
            if (this.mDetectMoves) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b5544b0", new Object[]{this});
                return;
            }
            for (Diagonal diagonal : this.mDiagonals) {
                while (i < diagonal.x) {
                    if (this.mOldItemStatuses[i] == 0) {
                        findMatchingAddition(i);
                    }
                    i++;
                }
                i = diagonal.endX();
            }
        }

        private static PostponedUpdate getPostponedUpdate(Collection<PostponedUpdate> collection, int i, boolean z) {
            PostponedUpdate postponedUpdate;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PostponedUpdate) ipChange.ipc$dispatch("46b3017b", new Object[]{collection, new Integer(i), new Boolean(z)});
            }
            Iterator<PostponedUpdate> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    postponedUpdate = null;
                    break;
                }
                postponedUpdate = it.next();
                if (postponedUpdate.posInOwnerList == i && postponedUpdate.removal == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate next = it.next();
                if (z) {
                    next.currentPos--;
                } else {
                    next.currentPos++;
                }
            }
            return postponedUpdate;
        }

        public int convertNewPositionToOld(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("85843cf9", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i < 0 || i >= this.mNewListSize) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", new list size = " + this.mNewListSize);
            }
            int i2 = this.mNewItemStatuses[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        public int convertOldPositionToNew(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea2415e7", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i < 0 || i >= this.mOldListSize) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.mOldListSize);
            }
            int i2 = this.mOldItemStatuses[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        public void dispatchUpdatesTo(RecyclerView.Adapter adapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46f3a93a", new Object[]{this, adapter});
            } else {
                dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
            }
        }

        public void dispatchUpdatesTo(ListUpdateCallback listUpdateCallback) {
            BatchingListUpdateCallback batchingListUpdateCallback;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3099dfd", new Object[]{this, listUpdateCallback});
                return;
            }
            if (listUpdateCallback instanceof BatchingListUpdateCallback) {
                batchingListUpdateCallback = (BatchingListUpdateCallback) listUpdateCallback;
            } else {
                batchingListUpdateCallback = new BatchingListUpdateCallback(listUpdateCallback);
            }
            int i = this.mOldListSize;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i2 = this.mOldListSize;
            int i3 = this.mNewListSize;
            for (int size = this.mDiagonals.size() - 1; size >= 0; size--) {
                Diagonal diagonal = this.mDiagonals.get(size);
                int endX = diagonal.endX();
                int endY = diagonal.endY();
                while (i2 > endX) {
                    i2--;
                    int i4 = this.mOldItemStatuses[i2];
                    if ((i4 & 12) != 0) {
                        int i5 = i4 >> 4;
                        PostponedUpdate postponedUpdate = getPostponedUpdate(arrayDeque, i5, false);
                        if (postponedUpdate != null) {
                            int i6 = (i - postponedUpdate.currentPos) - 1;
                            batchingListUpdateCallback.onMoved(i2, i6);
                            if ((i4 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i6, 1, this.mCallback.getChangePayload(i2, i5));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i2, (i - i2) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i2, 1);
                        i--;
                    }
                }
                while (i3 > endY) {
                    i3--;
                    int i7 = this.mNewItemStatuses[i3];
                    if ((i7 & 12) != 0) {
                        int i8 = i7 >> 4;
                        PostponedUpdate postponedUpdate2 = getPostponedUpdate(arrayDeque, i8, true);
                        if (postponedUpdate2 == null) {
                            arrayDeque.add(new PostponedUpdate(i3, i - i2, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i - postponedUpdate2.currentPos) - 1, i2);
                            if ((i7 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i2, 1, this.mCallback.getChangePayload(i8, i3));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i2, 1);
                        i++;
                    }
                }
                int i9 = diagonal.x;
                int i10 = diagonal.y;
                for (int i11 = 0; i11 < diagonal.size; i11++) {
                    if ((this.mOldItemStatuses[i9] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i9, 1, this.mCallback.getChangePayload(i9, i10));
                    }
                    i9++;
                    i10++;
                }
                i2 = diagonal.x;
                i3 = diagonal.y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class ItemCallback<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("ad13dc4b", new Object[]{this, t, t2});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class PostponedUpdate {
        public int currentPos;
        public int posInOwnerList;
        public boolean removal;

        public PostponedUpdate(int i, int i2, boolean z) {
            this.posInOwnerList = i;
            this.currentPos = i2;
            this.removal = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Range {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int newListEnd;
        public int newListStart;
        public int oldListEnd;
        public int oldListStart;

        public Range() {
        }

        public int newSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7d51e9bb", new Object[]{this})).intValue();
            }
            return this.newListEnd - this.newListStart;
        }

        public int oldSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bf247742", new Object[]{this})).intValue();
            }
            return this.oldListEnd - this.oldListStart;
        }

        public Range(int i, int i2, int i3, int i4) {
            this.oldListStart = i;
            this.oldListEnd = i2;
            this.newListStart = i3;
            this.newListEnd = i4;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Snake {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        public int diagonalSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("26fc5750", new Object[]{this})).intValue();
            }
            return Math.min(this.endX - this.startX, this.endY - this.startY);
        }

        public boolean hasAdditionOrRemoval() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f866547e", new Object[]{this})).booleanValue();
            }
            if (this.endY - this.startY != this.endX - this.startX) {
                return true;
            }
            return false;
        }

        public boolean isAddition() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ab0a53d1", new Object[]{this})).booleanValue();
            }
            if (this.endY - this.startY > this.endX - this.startX) {
                return true;
            }
            return false;
        }

        public Diagonal toDiagonal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Diagonal) ipChange.ipc$dispatch("f289c3a2", new Object[]{this});
            }
            if (!hasAdditionOrRemoval()) {
                int i = this.startX;
                return new Diagonal(i, this.startY, this.endX - i);
            } else if (this.reverse) {
                return new Diagonal(this.startX, this.startY, diagonalSize());
            } else {
                if (isAddition()) {
                    return new Diagonal(this.startX, this.startY + 1, diagonalSize());
                }
                return new Diagonal(this.startX + 1, this.startY, diagonalSize());
            }
        }
    }

    private DiffUtil() {
    }

    private static Snake backward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Snake) ipChange.ipc$dispatch("754ecfa7", new Object[]{range, callback, centeredArray, centeredArray2, new Integer(i)});
        }
        if ((range.oldSize() - range.newSize()) % 2 == 0) {
            z = true;
        }
        int oldSize = range.oldSize() - range.newSize();
        int i6 = -i;
        for (int i7 = i6; i7 <= i; i7 += 2) {
            if (i7 == i6 || (i7 != i && centeredArray2.get(i7 + 1) < centeredArray2.get(i7 - 1))) {
                i3 = centeredArray2.get(i7 + 1);
                i2 = i3;
            } else {
                i3 = centeredArray2.get(i7 - 1);
                i2 = i3 - 1;
            }
            int i8 = range.newListEnd - ((range.oldListEnd - i2) - i7);
            if (i == 0 || i2 != i3) {
                i4 = i8;
            } else {
                i4 = i8 + 1;
            }
            while (i2 > range.oldListStart && i8 > range.newListStart && callback.areItemsTheSame(i2 - 1, i8 - 1)) {
                i2--;
                i8--;
            }
            centeredArray2.set(i7, i2);
            if (z && (i5 = oldSize - i7) >= i6 && i5 <= i && centeredArray.get(i5) >= i2) {
                Snake snake = new Snake();
                snake.startX = i2;
                snake.startY = i8;
                snake.endX = i3;
                snake.endY = i4;
                snake.reverse = true;
                return snake;
            }
        }
        return null;
    }

    public static DiffResult calculateDiff(Callback callback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DiffResult) ipChange.ipc$dispatch("18ef6387", new Object[]{callback}) : calculateDiff(callback, true);
    }

    private static Snake forward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i) {
        boolean z;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Snake) ipChange.ipc$dispatch("af755889", new Object[]{range, callback, centeredArray, centeredArray2, new Integer(i)});
        }
        if (Math.abs(range.oldSize() - range.newSize()) % 2 == 1) {
            z = true;
        } else {
            z = false;
        }
        int oldSize = range.oldSize() - range.newSize();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 == i4 || (i5 != i && centeredArray.get(i5 + 1) > centeredArray.get(i5 - 1))) {
                i3 = centeredArray.get(i5 + 1);
                i2 = i3;
            } else {
                i3 = centeredArray.get(i5 - 1);
                i2 = i3 + 1;
            }
            int i6 = (range.newListStart + (i2 - range.oldListStart)) - i5;
            int i7 = (i == 0 || i2 != i3) ? i6 : i6 - 1;
            while (i2 < range.oldListEnd && i6 < range.newListEnd && callback.areItemsTheSame(i2, i6)) {
                i2++;
                i6++;
            }
            centeredArray.set(i5, i2);
            if (z) {
                int i8 = oldSize - i5;
                if (i8 >= i4 + 1 && i8 <= i - 1 && centeredArray2.get(i8) <= i2) {
                    Snake snake = new Snake();
                    snake.startX = i3;
                    snake.startY = i7;
                    snake.endX = i2;
                    snake.endY = i6;
                    snake.reverse = false;
                    return snake;
                }
            }
        }
        return null;
    }

    private static Snake midPoint(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Snake) ipChange.ipc$dispatch("84ac14c7", new Object[]{range, callback, centeredArray, centeredArray2});
        }
        if (range.oldSize() >= 1 && range.newSize() >= 1) {
            int oldSize = ((range.oldSize() + range.newSize()) + 1) / 2;
            centeredArray.set(1, range.oldListStart);
            centeredArray2.set(1, range.oldListEnd);
            for (int i = 0; i < oldSize; i++) {
                Snake forward = forward(range, callback, centeredArray, centeredArray2, i);
                if (forward != null) {
                    return forward;
                }
                Snake backward = backward(range, callback, centeredArray, centeredArray2, i);
                if (backward != null) {
                    return backward;
                }
            }
        }
        return null;
    }

    public static DiffResult calculateDiff(Callback callback, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiffResult) ipChange.ipc$dispatch("dd4f7a5d", new Object[]{callback, new Boolean(z)});
        }
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        CenteredArray centeredArray = new CenteredArray(i);
        CenteredArray centeredArray2 = new CenteredArray(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake midPoint = midPoint(range, callback, centeredArray, centeredArray2);
            if (midPoint != null) {
                if (midPoint.diagonalSize() > 0) {
                    arrayList.add(midPoint.toDiagonal());
                }
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                range2.oldListEnd = midPoint.startX;
                range2.newListEnd = midPoint.startY;
                arrayList2.add(range2);
                range.oldListEnd = range.oldListEnd;
                range.newListEnd = range.newListEnd;
                range.oldListStart = midPoint.endX;
                range.newListStart = midPoint.endY;
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, DIAGONAL_COMPARATOR);
        return new DiffResult(callback, arrayList, centeredArray.backingData(), centeredArray2.backingData(), z);
    }
}
