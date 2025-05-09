package com.taobao.android.order.bundle.widget.recycle;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.a;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import tb.cjb;
import tb.f2u;
import tb.fzo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScrollListener extends RecyclerView.OnScrollListener implements cjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f9136a;
    public final JSONObject b;
    public final JSONObject c;
    public final a e;
    public final RecyclerView f;
    public final int g;
    public boolean d = true;
    public final String[] h = {"orderdetail_marquee_scroller", "orderdetail_scroller"};

    static {
        t2o.a(713032016);
        t2o.a(713032007);
    }

    public ScrollListener(a aVar, RecyclerView recyclerView) {
        JSONObject jSONObject = new JSONObject();
        this.b = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        this.c = jSONObject2;
        jSONObject.put("type", (Object) "BNDX");
        jSONObject.put("params", (Object) jSONObject2);
        this.e = aVar;
        this.f = recyclerView;
        this.g = f2u.f(recyclerView.getContext(), 1.0f);
    }

    public static /* synthetic */ Object ipc$super(ScrollListener scrollListener, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1177043419) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/widget/recycle/ScrollListener");
        }
    }

    @Override // tb.cjb
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3fb03a3", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            b(fzo.SCROLLING, this.f.computeVerticalScrollOffset());
        } else {
            a aVar = this.e;
            if (aVar != null) {
                aVar.i(null, jSONObject);
            }
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd55234f", new Object[]{this, new Integer(i)});
            return;
        }
        this.f9136a = i;
        b(fzo.SCROLLING, this.f.computeVerticalScrollOffset());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            b("scroll_beigin", this.f.computeVerticalScrollOffset());
        } else if (i == 0) {
            b("scroll_end", this.f.computeVerticalScrollOffset());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (this.d) {
            this.d = false;
            return;
        }
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        if (computeVerticalScrollOffset <= 1000) {
            b(fzo.SCROLLING, computeVerticalScrollOffset);
        }
    }

    public void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("177767ed", new Object[]{this, str, new Integer(i)});
            return;
        }
        this.c.put("offsetY", (Object) Integer.valueOf(i + this.f9136a + this.g));
        this.c.put("action", (Object) str);
        if (this.e != null) {
            for (String str2 : this.h) {
                this.c.put(BaseOuterComponent.b.SOURCE_COMPONENT_ID, (Object) str2);
                this.e.i(null, this.b);
            }
        }
    }
}
