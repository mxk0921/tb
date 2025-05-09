package com.taobao.ptr.views.recycler.accessories;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.views.recycler.PtrRecyclerView;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class GridSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<PtrRecyclerView> f11490a;
    public final WeakReference<GridLayoutManager> b;
    public final GridLayoutManager.SpanSizeLookup c;

    static {
        t2o.a(632291385);
    }

    public GridSpanSizeLookup(PtrRecyclerView ptrRecyclerView, GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f11490a = new WeakReference<>(ptrRecyclerView);
        this.b = new WeakReference<>(gridLayoutManager);
        this.c = spanSizeLookup;
    }

    public static /* synthetic */ Object ipc$super(GridSpanSizeLookup gridSpanSizeLookup, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1691818968) {
            return new Boolean(super.isSpanIndexCacheEnabled());
        }
        if (hashCode == 743752269) {
            return new Integer(super.getSpanGroupIndex(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
        }
        if (hashCode == 822973068) {
            return new Integer(super.getSpanIndex(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/ptr/views/recycler/accessories/GridSpanSizeLookup");
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public int getSpanGroupIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c54c24d", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.c;
        if (spanSizeLookup != null) {
            return spanSizeLookup.getSpanGroupIndex(i, i2);
        }
        return super.getSpanGroupIndex(i, i2);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public int getSpanIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("310d928c", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.c;
        if (spanSizeLookup != null) {
            return spanSizeLookup.getSpanIndex(i, i2);
        }
        return super.getSpanIndex(i, i2);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public int getSpanSize(int i) {
        WeakReference<GridLayoutManager> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
        }
        WeakReference<PtrRecyclerView> weakReference2 = this.f11490a;
        if (!(weakReference2 == null || weakReference2.get() == null || (weakReference = this.b) == null || weakReference.get() == null)) {
            PtrRecyclerView ptrRecyclerView = this.f11490a.get();
            RecyclerView.Adapter adapter = this.f11490a.get().getAdapter();
            if (adapter != null && (adapter instanceof FixedViewAdapter)) {
                int startViewsCount = ptrRecyclerView.getStartViewsCount() - 1;
                int itemCount = adapter.getItemCount() - ptrRecyclerView.getEndViewsCount();
                if (i >= 0 && (i <= startViewsCount || i >= itemCount)) {
                    return this.b.get().getSpanCount();
                }
            }
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.c;
        if (spanSizeLookup != null) {
            return spanSizeLookup.getSpanSize(i);
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public boolean isSpanIndexCacheEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b28e428", new Object[]{this})).booleanValue();
        }
        GridLayoutManager.SpanSizeLookup spanSizeLookup = this.c;
        if (spanSizeLookup != null) {
            return spanSizeLookup.isSpanIndexCacheEnabled();
        }
        return super.isSpanIndexCacheEnabled();
    }
}
