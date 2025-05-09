package com.taobao.android.dinamicx.widget.recycler;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f7471a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    static {
        t2o.a(444597530);
    }

    public SpaceItemDecoration(int i, int i2, int i3, int i4, boolean z) {
        this.f7471a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public static /* synthetic */ Object ipc$super(SpaceItemDecoration spaceItemDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/SpaceItemDecoration");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (layoutParams2.isFullSpan()) {
                if (this.e) {
                    rect.left = this.b;
                    rect.right = this.c;
                }
            } else if (this.d > 0) {
                int width = recyclerView.getWidth();
                int i = this.d;
                int i2 = width / i;
                int i3 = (((width - ((i - 1) * this.f7471a)) - this.b) - this.c) / i;
                int spanIndex = layoutParams2.getSpanIndex();
                if (spanIndex == 0) {
                    rect.left = this.b;
                } else if (spanIndex == this.d - 1) {
                    rect.left = (i2 - this.c) - i3;
                } else {
                    int i4 = this.f7471a;
                    rect.left = i4 - ((((i2 - i3) * spanIndex) - ((spanIndex - 1) * i4)) - this.b);
                }
            }
        }
    }
}
