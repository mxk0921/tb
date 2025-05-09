package com.taobao.taolive.movehighlight.dx.widget.scrollerLayout;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DXHighlightGrideLayoutmanager extends GridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092648);
    }

    public DXHighlightGrideLayoutmanager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public static /* synthetic */ Object ipc$super(DXHighlightGrideLayoutmanager dXHighlightGrideLayoutmanager, String str, Object... objArr) {
        if (str.hashCode() == 2087983122) {
            super.collectAdjacentPrefetchPositions(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (RecyclerView.State) objArr[2], (RecyclerView.LayoutManager.LayoutPrefetchRegistry) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/dx/widget/scrollerLayout/DXHighlightGrideLayoutmanager");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c741812", new Object[]{this, new Integer(i), new Integer(i2), state, layoutPrefetchRegistry});
            return;
        }
        try {
            super.collectAdjacentPrefetchPositions(i, i2, state, layoutPrefetchRegistry);
        } catch (Exception unused) {
        }
    }

    public DXHighlightGrideLayoutmanager(Context context, int i) {
        super(context, i);
    }
}
