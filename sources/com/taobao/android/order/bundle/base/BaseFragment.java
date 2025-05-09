package com.taobao.android.order.bundle.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.UemAnalysis;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.a;
import com.taobao.nestedscroll.recyclerview.layoutmanager.InternalLinearLayoutManager;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.lor;
import tb.pqb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BaseFragment extends Fragment implements pqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f9105a;
    public OrderRecyclerView c;
    public LinearLayout d;
    public LinearLayout e;
    public String f;
    public TBSwipeRefreshLayout g;
    public TBErrorView h;
    public View i;

    static {
        t2o.a(713031735);
        t2o.a(297795600);
    }

    public static /* synthetic */ Object ipc$super(BaseFragment baseFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/base/BaseFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_list_container, viewGroup, false);
        this.i = inflate;
        this.g = (TBSwipeRefreshLayout) inflate.findViewById(R.id.order_list_uikit);
        OrderRecyclerView orderRecyclerView = (OrderRecyclerView) this.i.findViewById(R.id.recycler_view);
        this.c = orderRecyclerView;
        orderRecyclerView.setLayoutManager(new InternalLinearLayoutManager(getContext()).y(this.c));
        this.d = (LinearLayout) this.i.findViewById(R.id.bottom_layout);
        this.e = (LinearLayout) this.i.findViewById(R.id.top_layout);
        ViewStub viewStub = (ViewStub) this.i.findViewById(R.id.order_list_view_stub);
        if (viewStub == null) {
            this.h = (TBErrorView) this.i.findViewById(R.id.order_list_layout_to_inflate).findViewById(R.id.tb_order_error_view);
        } else {
            this.h = (TBErrorView) viewStub.inflate().findViewById(R.id.tb_order_error_view);
        }
        this.f = UemAnalysis.getTraceId();
        return this.i;
    }

    public abstract OrderConfigs p2();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (p2() != null) {
            a a2 = a.a(p2());
            this.f9105a = a2;
            if (a2 != null) {
                a2.e();
                lor.c("BaseFragment", "onCreate", new String[0]);
            }
        }
    }
}
