package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import tb.r0h;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HomeMainRecyclerDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_SPAN = 2;
    public static final String e = HomeMainRecyclerDecoration.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final int f8843a;
    public final int b;
    public final int c;
    public final boolean d;

    static {
        t2o.a(310378792);
    }

    public HomeMainRecyclerDecoration(int i, int i2, int i3, boolean z) {
        this.f8843a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public static /* synthetic */ Object ipc$super(HomeMainRecyclerDecoration homeMainRecyclerDecoration, String str, Object... objArr) {
        if (str.hashCode() == -2066002230) {
            super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/view/HomeMainRecyclerDecoration");
    }

    public final int a(View view, RecyclerView recyclerView) {
        DinamicDataObject f0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82cbfd79", new Object[]{this, view, recyclerView})).intValue();
        }
        if (view == null || recyclerView == null || !(recyclerView.getChildViewHolder(view) instanceof HomeMainListViewHolder) || (f0 = ((HomeMainListViewHolder) recyclerView.getChildViewHolder(view)).f0()) == null) {
            return 1;
        }
        return f0.span;
    }

    public final boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93aac16b", new Object[]{this, view})).booleanValue();
        }
        try {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                return true;
            }
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).getSpanIndex() == 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            r0h.c(e, "isLeftItem exp.", e2);
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        int a2 = a(view, recyclerView);
        if (this.d) {
            if (a2 == 2) {
                rect.top = 0;
            } else {
                rect.top = this.c;
            }
            rect.bottom = 0;
        } else {
            rect.bottom = this.c;
            rect.top = 0;
        }
        if (a2 == 2) {
            rect.left = 0;
            rect.right = 0;
        } else if (b(view)) {
            rect.left = this.f8843a;
            rect.right = this.b;
        } else {
            rect.left = this.b;
            rect.right = this.f8843a;
        }
    }
}
