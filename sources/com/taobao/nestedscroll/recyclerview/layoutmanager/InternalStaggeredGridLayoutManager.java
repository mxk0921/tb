package com.taobao.nestedscroll.recyclerview.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fjg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class InternalStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f11362a;

    public InternalStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public static /* synthetic */ Object ipc$super(InternalStaggeredGridLayoutManager internalStaggeredGridLayoutManager, String str, Object... objArr) {
        if (str.hashCode() == 1951908722) {
            return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nestedscroll/recyclerview/layoutmanager/InternalStaggeredGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        boolean a2 = fjg.a(this.f11362a);
        int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
        fjg.b(this.f11362a, i, scrollVerticallyBy, a2);
        if (fjg.c(this.f11362a, i, scrollVerticallyBy) != 0) {
            return 0;
        }
        return scrollVerticallyBy;
    }

    public InternalStaggeredGridLayoutManager y(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InternalStaggeredGridLayoutManager) ipChange.ipc$dispatch("81b8cd4e", new Object[]{this, recyclerView});
        }
        this.f11362a = recyclerView;
        return this;
    }

    public InternalStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
    }
}
