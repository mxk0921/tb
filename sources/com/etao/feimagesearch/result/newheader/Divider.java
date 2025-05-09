package com.etao.feimagesearch.result.newheader;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Divider extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final int f4866a = o1p.a(9.0f);
    public static final int b = o1p.a(44.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297448);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297447);
    }

    public static /* synthetic */ Object ipc$super(Divider divider, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/result/newheader/Divider");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        ckf.g(rect, "outRect");
        ckf.g(view, "view");
        ckf.g(recyclerView, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(state, "state");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Integer valueOf = adapter == null ? null : Integer.valueOf(adapter.getItemCount());
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (valueOf != null) {
            int i = f4866a;
            int intValue = (valueOf.intValue() * b) + ((valueOf.intValue() - 1) * i);
            if (childAdapterPosition > 0) {
                rect.left = i;
            } else if (intValue > recyclerView.getWidth()) {
                rect.left = 0;
            } else {
                rect.left = (recyclerView.getWidth() - intValue) / 2;
            }
        }
    }
}
