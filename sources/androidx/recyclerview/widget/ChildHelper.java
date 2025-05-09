package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ChildHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final int REMOVE_STATUS_IN_REMOVE = 1;
    private static final int REMOVE_STATUS_IN_REMOVE_IF_HIDDEN = 2;
    private static final int REMOVE_STATUS_NONE = 0;
    private static final String TAG = "ChildrenHelper";
    public final Callback mCallback;
    private View mViewInRemoveView;
    private int mRemoveStatus = 0;
    public final Bucket mBucket = new Bucket();
    public final List<View> mHiddenViews = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Bucket {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int BITS_PER_WORD = 64;
        public static final long LAST_BIT = Long.MIN_VALUE;
        public long mData = 0;
        public Bucket mNext;

        private void ensureNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba834058", new Object[]{this});
            } else if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        public void clear(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d17cb12f", new Object[]{this, new Integer(i)});
            } else if (i >= 64) {
                Bucket bucket = this.mNext;
                if (bucket != null) {
                    bucket.clear(i - 64);
                }
            } else {
                this.mData &= ~(1 << i);
            }
        }

        public int countOnesBefore(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ec0b9514", new Object[]{this, new Integer(i)})).intValue();
            }
            Bucket bucket = this.mNext;
            if (bucket == null) {
                if (i >= 64) {
                    return Long.bitCount(this.mData);
                }
                return Long.bitCount(this.mData & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.mData & ((1 << i) - 1));
            } else {
                return bucket.countOnesBefore(i - 64) + Long.bitCount(this.mData);
            }
        }

        public boolean get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("72fc15ca", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i >= 64) {
                ensureNext();
                return this.mNext.get(i - 64);
            } else if ((this.mData & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public void insert(int i, boolean z) {
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e98d32f1", new Object[]{this, new Integer(i), new Boolean(z)});
            } else if (i >= 64) {
                ensureNext();
                this.mNext.insert(i - 64, z);
            } else {
                long j = this.mData;
                if ((Long.MIN_VALUE & j) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j2 = (1 << i) - 1;
                this.mData = ((j & (~j2)) << 1) | (j & j2);
                if (z) {
                    set(i);
                } else {
                    clear(i);
                }
                if (z2 || this.mNext != null) {
                    ensureNext();
                    this.mNext.insert(0, z2);
                }
            }
        }

        public boolean remove(int i) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ebab395c", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i >= 64) {
                ensureNext();
                return this.mNext.remove(i - 64);
            }
            long j = 1 << i;
            long j2 = this.mData;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.mData = j3;
            long j4 = j - 1;
            this.mData = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z;
        }

        public void reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("788e6256", new Object[]{this});
                return;
            }
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        public void set(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("518a303a", new Object[]{this, new Integer(i)});
            } else if (i >= 64) {
                ensureNext();
                this.mNext.set(i - 64);
            } else {
                this.mData |= 1 << i;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            return this.mNext.toString() + "xx" + Long.toBinaryString(this.mData);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface Callback {
        void addView(View view, int i);

        void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams);

        void detachViewFromParent(int i);

        View getChildAt(int i);

        int getChildCount();

        RecyclerView.ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i);
    }

    public ChildHelper(Callback callback) {
        this.mCallback = callback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r5.mBucket.get(r3) == false) goto L_0x0044;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int getOffset(int r6) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = androidx.recyclerview.widget.ChildHelper.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0021
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r3 = 0
            r6[r3] = r5
            r6[r0] = r2
            java.lang.String r0 = "23114566"
            java.lang.Object r6 = r1.ipc$dispatch(r0, r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            return r6
        L_0x0021:
            r1 = -1
            if (r6 >= 0) goto L_0x0025
            return r1
        L_0x0025:
            androidx.recyclerview.widget.ChildHelper$Callback r2 = r5.mCallback
            int r2 = r2.getChildCount()
            r3 = r6
        L_0x002c:
            if (r3 >= r2) goto L_0x0047
            androidx.recyclerview.widget.ChildHelper$Bucket r4 = r5.mBucket
            int r4 = r4.countOnesBefore(r3)
            int r4 = r3 - r4
            int r4 = r6 - r4
            if (r4 != 0) goto L_0x0045
        L_0x003a:
            androidx.recyclerview.widget.ChildHelper$Bucket r6 = r5.mBucket
            boolean r6 = r6.get(r3)
            if (r6 == 0) goto L_0x0044
            int r3 = r3 + r0
            goto L_0x003a
        L_0x0044:
            return r3
        L_0x0045:
            int r3 = r3 + r4
            goto L_0x002c
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ChildHelper.getOffset(int):int");
    }

    private void hideViewInternal(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d42f187", new Object[]{this, view});
            return;
        }
        this.mHiddenViews.add(view);
        this.mCallback.onEnteredHiddenState(view);
    }

    private boolean unhideViewInternal(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315418d2", new Object[]{this, view})).booleanValue();
        }
        if (!this.mHiddenViews.remove(view)) {
            return false;
        }
        this.mCallback.onLeftHiddenState(view);
        return true;
    }

    public void addView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd742c2f", new Object[]{this, view, new Boolean(z)});
        } else {
            addView(view, -1, z);
        }
    }

    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dee08be", new Object[]{this, view, new Integer(i), layoutParams, new Boolean(z)});
            return;
        }
        if (i < 0) {
            i2 = this.mCallback.getChildCount();
        } else {
            i2 = getOffset(i);
        }
        this.mBucket.insert(i2, z);
        if (z) {
            hideViewInternal(view);
        }
        this.mCallback.attachViewToParent(view, i2, layoutParams);
    }

    public void detachViewFromParent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b8faf0", new Object[]{this, new Integer(i)});
            return;
        }
        int offset = getOffset(i);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    public View findHiddenNonRemovedView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b29e2883", new Object[]{this, new Integer(i)});
        }
        int size = this.mHiddenViews.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.mHiddenViews.get(i2);
            RecyclerView.ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            if (!(childViewHolder.getLayoutPosition() != i || childViewHolder.isInvalid() || childViewHolder.isRemoved())) {
                return view;
            }
        }
        return null;
    }

    public View getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3d5a645", new Object[]{this, new Integer(i)});
        }
        return this.mCallback.getChildAt(getOffset(i));
    }

    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    public View getUnfilteredChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e2e9a295", new Object[]{this, new Integer(i)});
        }
        return this.mCallback.getChildAt(i);
    }

    public int getUnfilteredChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac484993", new Object[]{this})).intValue();
        }
        return this.mCallback.getChildCount();
    }

    public void hide(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f81969", new Object[]{this, view});
            return;
        }
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.mBucket.set(indexOfChild);
            hideViewInternal(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public int indexOfChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d454f2b", new Object[]{this, view})).intValue();
        }
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild != -1 && !this.mBucket.get(indexOfChild)) {
            return indexOfChild - this.mBucket.countOnesBefore(indexOfChild);
        }
        return -1;
    }

    public boolean isHidden(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9f30efb", new Object[]{this, view})).booleanValue();
        }
        return this.mHiddenViews.contains(view);
    }

    public void removeAllViewsUnfiltered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ddda488", new Object[]{this});
            return;
        }
        this.mBucket.reset();
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            this.mCallback.onLeftHiddenState(this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
        }
        this.mCallback.removeAllViews();
    }

    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        int i = this.mRemoveStatus;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i != 2) {
            try {
                this.mRemoveStatus = 1;
                this.mViewInRemoveView = view;
                int indexOfChild = this.mCallback.indexOfChild(view);
                if (indexOfChild < 0) {
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    return;
                }
                if (this.mBucket.remove(indexOfChild)) {
                    unhideViewInternal(view);
                }
                this.mCallback.removeViewAt(indexOfChild);
                this.mRemoveStatus = 0;
                this.mViewInRemoveView = null;
            } catch (Throwable th) {
                this.mRemoveStatus = 0;
                this.mViewInRemoveView = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public void removeViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be51980", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.mRemoveStatus;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i2 != 2) {
            try {
                int offset = getOffset(i);
                View childAt = this.mCallback.getChildAt(offset);
                if (childAt == null) {
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    return;
                }
                this.mRemoveStatus = 1;
                this.mViewInRemoveView = childAt;
                if (this.mBucket.remove(offset)) {
                    unhideViewInternal(childAt);
                }
                this.mCallback.removeViewAt(offset);
                this.mRemoveStatus = 0;
                this.mViewInRemoveView = null;
            } catch (Throwable th) {
                this.mRemoveStatus = 0;
                this.mViewInRemoveView = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    public boolean removeViewIfHidden(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a23215f", new Object[]{this, view})).booleanValue();
        }
        int i = this.mRemoveStatus;
        if (i == 1) {
            if (this.mViewInRemoveView == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        } else if (i != 2) {
            try {
                this.mRemoveStatus = 2;
                int indexOfChild = this.mCallback.indexOfChild(view);
                if (indexOfChild == -1) {
                    unhideViewInternal(view);
                    return true;
                } else if (!this.mBucket.get(indexOfChild)) {
                    return false;
                } else {
                    this.mBucket.remove(indexOfChild);
                    unhideViewInternal(view);
                    this.mCallback.removeViewAt(indexOfChild);
                    return true;
                }
            } finally {
                this.mRemoveStatus = 0;
            }
        } else {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.mBucket.toString() + ", hidden list:" + this.mHiddenViews.size();
    }

    public void unhide(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4cb330", new Object[]{this, view});
            return;
        }
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.mBucket.get(indexOfChild)) {
            this.mBucket.clear(indexOfChild);
            unhideViewInternal(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public void addView(View view, int i, boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10a5236", new Object[]{this, view, new Integer(i), new Boolean(z)});
            return;
        }
        if (i < 0) {
            i2 = this.mCallback.getChildCount();
        } else {
            i2 = getOffset(i);
        }
        this.mBucket.insert(i2, z);
        if (z) {
            hideViewInternal(view);
        }
        this.mCallback.addView(view, i2);
    }
}
