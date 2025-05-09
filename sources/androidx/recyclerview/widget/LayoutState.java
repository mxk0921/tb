package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LayoutState {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
    public static final int ITEM_DIRECTION_HEAD = -1;
    public static final int ITEM_DIRECTION_TAIL = 1;
    public static final int LAYOUT_END = 1;
    public static final int LAYOUT_START = -1;
    public int mAvailable;
    public int mCurrentPosition;
    public boolean mInfinite;
    public int mItemDirection;
    public int mLayoutDirection;
    public boolean mStopInFocusable;
    public boolean mRecycle = true;
    public int mStartLine = 0;
    public int mEndLine = 0;

    public boolean hasMore(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c25e7f8", new Object[]{this, state})).booleanValue();
        }
        int i = this.mCurrentPosition;
        if (i < 0 || i >= state.getItemCount()) {
            return false;
        }
        return true;
    }

    public View next(RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("57332bd2", new Object[]{this, recycler});
        }
        View viewForPosition = recycler.getViewForPosition(this.mCurrentPosition);
        this.mCurrentPosition += this.mItemDirection;
        return viewForPosition;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LayoutState{mAvailable=" + this.mAvailable + ", mCurrentPosition=" + this.mCurrentPosition + ", mItemDirection=" + this.mItemDirection + ", mLayoutDirection=" + this.mLayoutDirection + ", mStartLine=" + this.mStartLine + ", mEndLine=" + this.mEndLine + '}';
    }
}
