package com.taobao.android.order.bundle;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.order.bundle.base.BaseFragment;
import com.taobao.android.order.bundle.widget.recycle.OrderRecyclerView;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import java.util.HashMap;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.dbl;
import tb.f2u;
import tb.gav;
import tb.kjf;
import tb.ldl;
import tb.mdl;
import tb.pcl;
import tb.t2o;
import tb.u3o;
import tb.wqb;
import tb.ykl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderListFragment extends BaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public u3o j;
    public JSONObject k;
    public String l;
    public String m;
    public int n;
    public int o;
    public com.alibaba.fastjson.JSONObject p;
    public OnScreenChangedListener q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int height = OrderListFragment.u2(OrderListFragment.this).getHeight();
            if (height != OrderListFragment.v2(OrderListFragment.this)) {
                OrderListFragment.z2(OrderListFragment.this, height);
                OrderListFragment.B2(OrderListFragment.this).setPadding(0, 0, 0, Math.min(height, OrderListFragment.A2(OrderListFragment.this)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                OrderListFragment.C2(OrderListFragment.this);
            }
        }
    }

    static {
        t2o.a(713031682);
    }

    public static /* synthetic */ int A2(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cff5edf6", new Object[]{orderListFragment})).intValue();
        }
        return orderListFragment.n;
    }

    public static /* synthetic */ OrderRecyclerView B2(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderRecyclerView) ipChange.ipc$dispatch("62567f1f", new Object[]{orderListFragment});
        }
        return orderListFragment.c;
    }

    public static /* synthetic */ void C2(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d01c41", new Object[]{orderListFragment});
        } else {
            orderListFragment.J2();
        }
    }

    public static /* synthetic */ Object ipc$super(OrderListFragment orderListFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1126882532) {
            return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
        } else {
            if (hashCode == 1860817453) {
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/order/bundle/OrderListFragment");
        }
    }

    public static /* synthetic */ void r2(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c419187", new Object[]{orderListFragment});
        } else {
            orderListFragment.R2();
        }
    }

    public static /* synthetic */ void s2(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292ea8a6", new Object[]{orderListFragment});
        } else {
            orderListFragment.O2();
        }
    }

    public static /* synthetic */ LinearLayout u2(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("334e079c", new Object[]{orderListFragment});
        }
        return orderListFragment.d;
    }

    public static /* synthetic */ int v2(OrderListFragment orderListFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4308d6d7", new Object[]{orderListFragment})).intValue();
        }
        return orderListFragment.o;
    }

    public static /* synthetic */ int z2(OrderListFragment orderListFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("693a8a94", new Object[]{orderListFragment, new Integer(i)})).intValue();
        }
        orderListFragment.o = i;
        return i;
    }

    @Override // tb.pqb
    public void B1(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4f8313", new Object[]{this, jSONObject});
        }
    }

    public final com.alibaba.fastjson.JSONObject E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("fd3403cd", new Object[]{this});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("version", (Object) "1.0.0");
        if (kjf.a()) {
            jSONObject.put("inner", (Object) "1");
        }
        return jSONObject;
    }

    public final void K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8368c920", new Object[]{this});
            return;
        }
        this.g.setLoadMore(false);
        T2(8);
    }

    public final void M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50840244", new Object[]{this});
            return;
        }
        this.h.setVisibility(8);
        S2(0);
        this.c.resetScroll();
        N2();
        JSONObject jSONObject = this.k;
        if (jSONObject != null && !Boolean.parseBoolean(jSONObject.optString("hasMore"))) {
            this.c.removeAllEndViews();
            this.g.enableLoadMore(false);
        }
    }

    public final void N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67279cbe", new Object[]{this});
        } else {
            this.d.post(new a());
        }
    }

    public final void O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838df391", new Object[]{this});
            return;
        }
        com.taobao.android.order.core.a aVar = this.f9105a;
        if (aVar != null) {
            aVar.c().c(127);
        }
    }

    public final void Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57549641", new Object[]{this});
            return;
        }
        this.q = new mdl(this);
        TBAutoSizeConfig.x().d0(this.q);
    }

    public final void R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ee0781", new Object[]{this});
            return;
        }
        int H = TBAutoSizeConfig.x().H(getContext());
        if (!TBAutoSizeConfig.x().T(getContext())) {
            H /= 2;
        }
        int c = DXWidgetNode.DXMeasureSpec.c(H, 1073741824);
        wqb c2 = this.f9105a.c();
        if (c2 instanceof gav) {
            ((gav) c2).getInstance().G().h1(c);
        }
    }

    public final void S2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c602c4c", new Object[]{this, new Integer(i)});
        } else if (this.c.getEndView() != null) {
            this.c.getEndView().setVisibility(i);
        }
    }

    public final void T2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be801b0", new Object[]{this, new Integer(i)});
            return;
        }
        View findViewById = this.i.findViewById(R.id.mask_layout);
        if (findViewById != null) {
            findViewById.setVisibility(i);
            findViewById.bringToFront();
        }
    }

    @Override // tb.pqb
    public void U1(com.alibaba.fastjson.JSONObject jSONObject, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a82554", new Object[]{this, jSONObject, dataStatus, pageStatus});
            return;
        }
        K2();
        try {
            com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("global");
            if (jSONObject2.getJSONObject("pageControl") != null) {
                this.k = new JSONObject(jSONObject2.getJSONObject("pageControl"));
            }
        } catch (Throwable unused) {
        }
        M2();
    }

    public void U2(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27764fd", new Object[]{this, mtopResponse});
            return;
        }
        this.h.setVisibility(0);
        this.h.setButton(TBErrorView.ButtonType.BUTTON_LEFT, Localization.q(R.string.order_biz_refresh), new b());
        if (mtopResponse != null) {
            this.h.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        }
    }

    @Override // tb.pqb
    public void X(String str, MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8b03e2", new Object[]{this, str, mtopResponse, dataStatus, pageStatus});
            return;
        }
        K2();
        U2(mtopResponse);
    }

    @Override // tb.pqb
    public void h2(MtopResponse mtopResponse, DataStatus dataStatus, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329d6593", new Object[]{this, mtopResponse, dataStatus, pageStatus});
            return;
        }
        K2();
        if (!(mtopResponse == null || mtopResponse.getDataJsonObject() == null)) {
            try {
                this.k = mtopResponse.getDataJsonObject().getJSONObject("global").getJSONObject("pageControl");
            } catch (Exception unused) {
            }
        }
        M2();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.q != null) {
            TBAutoSizeConfig.x().h0(this.q);
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.g.enableLoadMore(true);
        S2(4);
        this.n = f2u.f(getContext(), 100.0f);
        if (getActivity() instanceof TBOrderListActivity) {
            ((TBOrderListActivity) getActivity()).u4(this.f9105a);
        }
        if (ykl.a()) {
            R2();
        }
        J2();
    }

    @Override // com.taobao.android.order.bundle.base.BaseFragment
    public OrderConfigs p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrderConfigs) ipChange.ipc$dispatch("1e04643d", new Object[]{this});
        }
        return new OrderConfigs.b(getContext()).x(OrderConfigs.BizNameType.ORDER_LIST).H(D2()).u(this.e, this.c, this.d).B(new JSONArray()).N(this.f).y();
    }

    public final u3o D2() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3o) ipChange.ipc$dispatch("5ffb6168", new Object[]{this});
        }
        u3o u3oVar = this.j;
        if (u3oVar != null) {
            return u3oVar;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(this.m)) {
            str = E2().toJSONString();
        } else {
            str = f2u.a(this.m);
        }
        hashMap.put("condition", str);
        if (!TextUtils.isEmpty(this.l)) {
            hashMap.put("tabCode", this.l);
        }
        hashMap.put("OrderType", "OrderList");
        hashMap.put("page", "1");
        hashMap.put("appName", pcl.a());
        hashMap.put("appVersion", pcl.b());
        u3o A = new u3o(getContext()).a(dbl.B()).I("1.0").G("UNIT_TRADE").B(true).A(hashMap);
        this.j = A;
        return A;
    }

    public final void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[]{this});
        } else if (this.f9105a != null) {
            this.j.j().put("page", "1");
            T2(0);
            this.f9105a.p();
            com.alibaba.fastjson.JSONObject jSONObject = this.p;
            if (jSONObject == null) {
                this.f9105a.g(this);
                return;
            }
            this.f9105a.f(jSONObject, this);
            this.p = null;
        }
    }

    @Override // com.taobao.android.order.bundle.base.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ldl.INSTANCE.f(false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!TextUtils.isEmpty(arguments.getString("url"))) {
                Uri parse = Uri.parse(arguments.getString("url"));
                try {
                    this.m = parse.getQueryParameter("condition");
                    this.l = parse.getQueryParameter("tabCode");
                } catch (UnsupportedOperationException unused) {
                }
            }
            if (arguments.get("firstMtopResultData") instanceof com.alibaba.fastjson.JSONObject) {
                this.p = (com.alibaba.fastjson.JSONObject) arguments.get("firstMtopResultData");
            }
        }
        if (ykl.a()) {
            Q2();
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
