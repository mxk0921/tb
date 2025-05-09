package com.taobao.search.musie.pager;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SlideDivider extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f11590a;
    public int b;

    static {
        t2o.a(815792757);
    }

    public static /* synthetic */ Object ipc$super(SlideDivider slideDivider, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/pager/SlideDivider");
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a22b91", new Object[]{this})).intValue();
        }
        return this.f11590a;
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7a5499", new Object[]{this, new Integer(i)});
        } else {
            this.f11590a = i;
        }
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f8942e", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
        } else if (rect != null && recyclerView != null) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            if (childLayoutPosition == 0) {
                rect.left = this.f11590a;
                rect.right = this.b;
            } else if (childLayoutPosition == recyclerView.getAdapter().getItemCount() - 1) {
                rect.right = this.f11590a;
            } else {
                rect.right = this.b;
            }
        }
    }
}
