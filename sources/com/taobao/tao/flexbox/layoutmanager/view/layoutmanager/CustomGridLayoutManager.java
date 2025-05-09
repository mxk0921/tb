package com.taobao.tao.flexbox.layoutmanager.view.layoutmanager;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CustomGridLayoutManager extends GridLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f12401a = 1.0f;
    public boolean b = true;

    static {
        t2o.a(503317513);
    }

    public CustomGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public static /* synthetic */ Object ipc$super(CustomGridLayoutManager customGridLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -574012007) {
            return new Boolean(super.canScrollHorizontally());
        }
        if (hashCode == 514551467) {
            return new Boolean(super.canScrollVertically());
        }
        if (hashCode == 1027840325) {
            super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/view/layoutmanager/CustomGridLayoutManager");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        if (this.b) {
            return super.canScrollHorizontally();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
        }
        if (this.b) {
            return super.canScrollVertically();
        }
        return false;
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
            tfs.e("ListViewComponent", "CustomGridLayoutManager:" + e.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        CustomLinearSmoothScroller.f12403a = this.f12401a;
        CustomLinearSmoothScroller customLinearSmoothScroller = new CustomLinearSmoothScroller(recyclerView.getContext());
        this.f12401a = 1.0f;
        CustomLinearSmoothScroller.f12403a = 1.0f;
        customLinearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(customLinearSmoothScroller);
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc9cad2", new Object[]{this, new Float(f)});
        } else {
            this.f12401a = f;
        }
    }
}
