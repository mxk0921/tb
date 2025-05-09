package com.taobao.search.searchdoor.activate.hotspot.impl;

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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HotSpotDecoration extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11621a;
    public final int b = o1p.a(62.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793012);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793011);
        int a2 = o1p.a(12.0f);
        c = a2;
        int a3 = o1p.a(16.0f);
        d = a3;
        e = a2;
        f = a3;
    }

    public HotSpotDecoration(boolean z) {
        this.f11621a = z;
    }

    public static /* synthetic */ Object ipc$super(HotSpotDecoration hotSpotDecoration, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/hotspot/impl/HotSpotDecoration");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            return;
        }
        ckf.g(recyclerView, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        if (recyclerView.getChildViewHolder(view) instanceof HotspotFootViewHolder) {
            ckf.d(rect);
            rect.bottom = this.b;
        } else if (this.f11621a) {
            ckf.d(rect);
            rect.left = d;
            rect.right = f;
        } else {
            ckf.d(rect);
            rect.left = c;
            rect.right = e;
        }
    }
}
