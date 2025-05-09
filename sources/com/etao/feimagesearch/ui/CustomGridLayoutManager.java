package com.etao.feimagesearch.ui;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mzu;
import tb.p73;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CustomGridLayoutManager extends GridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297537);
    }

    public CustomGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public static /* synthetic */ Object ipc$super(CustomGridLayoutManager customGridLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1027840325) {
            super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
            return null;
        } else if (hashCode == 1951908722) {
            return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/ui/CustomGridLayoutManager");
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e) {
            mzu.n(p73.f25916a, "AlbumCrash", 19999, "exceptionType", e.getClass().getName(), "triggerType", "onLayout");
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (Exception e) {
            mzu.n(p73.f25916a, "AlbumCrash", 19999, "exceptionType", e.getClass().getName(), "triggerType", "scrollVerticallyBy");
            return 0;
        }
    }
}
