package com.taobao.android.searchbaseframe.xsl.section.refact;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.util.ListStyle;
import tb.dod;
import tb.rtg;
import tb.t2o;
import tb.t7p;
import tb.vdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ListBackgroundDecoration extends RecyclerView.ItemDecoration implements vdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public dod f9366a;
    public t7p.a b;
    public boolean c = false;

    static {
        t2o.a(993002107);
        t2o.a(993002095);
    }

    public static /* synthetic */ Object ipc$super(ListBackgroundDecoration listBackgroundDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/section/refact/ListBackgroundDecoration");
    }

    public void a(RecyclerView recyclerView, dod dodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926e46fd", new Object[]{this, recyclerView, dodVar});
            return;
        }
        this.f9366a = dodVar;
        if (!this.c) {
            this.c = true;
            recyclerView.addItemDecoration(this);
        }
    }

    public final rtg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rtg) ipChange.ipc$dispatch("fa02add4", new Object[]{this});
        }
        t7p.a aVar = this.b;
        if (aVar == null) {
            return null;
        }
        return aVar.Z();
    }

    public void c(t7p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf2cbb4", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        rtg b = b();
        if (b != null && b.c() > 0) {
            boolean z = recyclerView instanceof PartnerRecyclerView;
            if (z) {
                i = ((PartnerRecyclerView) recyclerView).getHeaderViewsCount();
            } else {
                i = 0;
            }
            if (z) {
                i2 = ((PartnerRecyclerView) recyclerView).getFooterViewsCount();
            } else {
                i2 = 0;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition >= i && childAdapterPosition < recyclerView.getAdapter().getItemCount() - i2) {
                int i3 = childAdapterPosition - i;
                ListStyle g = this.f9366a.g();
                if (i3 == 0 || (g == ListStyle.WATERFALL && i3 == 1 && !this.f9366a.k(0))) {
                    rect.set(0, b.c(), 0, 0);
                }
            }
        }
    }
}
