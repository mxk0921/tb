package com.taobao.search.searchdoor;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ChildLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView.Recycler f11607a;
    public RecyclerView.State b;

    static {
        t2o.a(815792929);
    }

    public ChildLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public static /* synthetic */ Object ipc$super(ChildLayoutManager childLayoutManager, String str, Object... objArr) {
        if (str.hashCode() == 1027840325) {
            super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/ChildLayoutManager");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
            return;
        }
        super.onLayoutChildren(recycler, state);
        this.f11607a = recycler;
        this.b = state;
    }

    public final int y(int i) {
        RecyclerView.State state;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7846d0a2", new Object[]{this, new Integer(i)})).intValue();
        }
        RecyclerView.Recycler recycler = this.f11607a;
        if (recycler == null || (state = this.b) == null) {
            return 0;
        }
        return scrollVerticallyBy(i, recycler, state);
    }
}
