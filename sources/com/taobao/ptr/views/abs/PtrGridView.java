package com.taobao.ptr.views.abs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.GridView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import tb.t2o;
import tb.v4n;
import tb.vrk;
import tb.xv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PtrGridView extends GridView implements v4n, AbsListView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mLastItemVisible;
    private vrk mOnLastItemVisibleListener;
    private AbsListView.OnScrollListener mOnScrollListener;

    static {
        t2o.a(632291372);
        t2o.a(632291347);
    }

    public PtrGridView(Context context) {
        super(context);
        super.setOnScrollListener(this);
    }

    public static /* synthetic */ Object ipc$super(PtrGridView ptrGridView, String str, Object... objArr) {
        if (str.hashCode() == -1488275586) {
            super.setOnScrollListener((AbsListView.OnScrollListener) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/views/abs/PtrGridView");
    }

    @Override // tb.v4n
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.v4n
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        return xv.b(this);
    }

    @Override // tb.v4n
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        return xv.a(this);
    }

    @Override // tb.v4n
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        }
    }

    @Override // tb.v4n
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.mOnLastItemVisibleListener != null) {
            if (i3 > 0 && i + i2 >= i3 - 1) {
                z = true;
            }
            this.mLastItemVisible = z;
        }
        AbsListView.OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        vrk vrkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
            return;
        }
        if (i == 0 && (vrkVar = this.mOnLastItemVisibleListener) != null && this.mLastItemVisible) {
            vrkVar.a();
        }
        AbsListView.OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
    }

    public final void setOnLastItemVisibleListener(vrk vrkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e24b88", new Object[]{this, vrkVar});
        } else {
            this.mOnLastItemVisibleListener = vrkVar;
        }
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74ab77e", new Object[]{this, onScrollListener});
        } else {
            this.mOnScrollListener = onScrollListener;
        }
    }

    public PtrGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnScrollListener(this);
    }

    public PtrGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setOnScrollListener(this);
    }
}
