package com.alibaba.android.aura.service.render.layout;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.service.render.AURARecyclerViewProvider;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.fjg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class AURAVlayoutManager extends VirtualLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean K = false;
    public a L;
    public RecyclerView M;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(80740567);
    }

    public AURAVlayoutManager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(AURAVlayoutManager aURAVlayoutManager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -579854207:
                super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                return null;
            case 1463889841:
                super.w0((List) objArr[0]);
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 1951908722:
                return new Integer(super.scrollVerticallyBy(((Number) objArr[0]).intValue(), (RecyclerView.Recycler) objArr[1], (RecyclerView.State) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/AURAVlayoutManager");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd702081", new Object[]{this, state});
            return;
        }
        super.onLayoutCompleted(state);
        a aVar = this.L;
        if (aVar != null) {
            ((AURARecyclerViewProvider) aVar).l(state);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else if (this.K) {
            super.requestLayout();
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7457c372", new Object[]{this, new Integer(i), recycler, state})).intValue();
        }
        RecyclerView recyclerView = this.M;
        if (recyclerView == null) {
            return super.scrollVerticallyBy(i, recycler, state);
        }
        boolean a2 = fjg.a(recyclerView);
        int scrollVerticallyBy = super.scrollVerticallyBy(i, recycler, state);
        fjg.b(this.M, i, scrollVerticallyBy, a2);
        if (fjg.c(this.M, i, scrollVerticallyBy) != 0) {
            return 0;
        }
        return scrollVerticallyBy;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager
    public void w0(List<com.alibaba.android.ultron.ext.vlayout.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57412fb1", new Object[]{this, list});
            return;
        }
        this.K = false;
        super.w0(list);
        this.K = true;
    }

    public void y0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b33f195", new Object[]{this, aVar});
        } else {
            this.L = aVar;
        }
    }

    public AURAVlayoutManager z0(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAVlayoutManager) ipChange.ipc$dispatch("ddc6c67a", new Object[]{this, recyclerView});
        }
        this.M = recyclerView;
        return this;
    }
}
