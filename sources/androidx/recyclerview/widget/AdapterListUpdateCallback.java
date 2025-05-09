package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AdapterListUpdateCallback implements ListUpdateCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final RecyclerView.Adapter mAdapter;

    public AdapterListUpdateCallback(RecyclerView.Adapter adapter) {
        this.mAdapter = adapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onChanged(int i, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bdc6818", new Object[]{this, new Integer(i), new Integer(i2), obj});
        } else {
            this.mAdapter.notifyItemRangeChanged(i, i2, obj);
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b59fe", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mAdapter.notifyItemRangeInserted(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbec943b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mAdapter.notifyItemMoved(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11dc13e8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mAdapter.notifyItemRangeRemoved(i, i2);
        }
    }
}
