package com.taobao.tao.recommend4.manager;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend4.manager.a;
import com.taobao.tao.recommend4.recyclerview.a;
import java.util.List;
import java.util.Map;
import tb.d11;
import tb.f4b;
import tb.fve;
import tb.khd;
import tb.mh0;
import tb.mhd;
import tb.nhd;
import tb.oh0;
import tb.rjj;
import tb.t2o;
import tb.z4a;
import tb.zn4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d implements nhd, a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_INFO = "apiInfo";
    public static final String NATIVE_CUSTOM_PARAMS = "nativeCustomParams";
    public static final String RMD_CONTAINER = "rmd_container";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f12682a = false;

    static {
        t2o.a(729809970);
        t2o.a(729809942);
        t2o.a(729809943);
    }

    public static d t(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6ecefb8d", new Object[]{z4aVar});
        }
        return v(z4aVar, "", null);
    }

    public static d u(z4a z4aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ff20a603", new Object[]{z4aVar, str});
        }
        return v(z4aVar, str, null);
    }

    public static d w(z4a z4aVar, List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c6b20f7c", new Object[]{z4aVar, list});
        }
        return v(z4aVar, "", list);
    }

    public static void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda55c2c", new Object[]{map});
        } else {
            mh0.b(map);
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7e486c", new Object[]{this});
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73a1e84", new Object[]{this});
        }
    }

    public void C(d11 d11Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984c3ee", new Object[]{this, d11Var, jSONObject});
        }
    }

    public void D(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340f8e2", new Object[]{this, jSONObject});
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419fa3d3", new Object[]{this});
        }
    }

    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a291138d", new Object[]{this, str});
        }
    }

    public void G(a.AbstractC0720a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb83085e", new Object[]{this, aVar});
        }
    }

    public void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c14273c", new Object[]{this, new Integer(i)});
        }
    }

    public void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c782b44", new Object[]{this, new Integer(i)});
        }
    }

    public void J(a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129092a0", new Object[]{this, eVar});
        }
    }

    public void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
        }
    }

    public void L(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5469b0", new Object[]{this, jSONObject, jSONObject2});
        }
    }

    public void M(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb065cc3", new Object[]{this, z4aVar});
        }
    }

    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bf5038", new Object[]{this});
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9c5abf", new Object[]{this});
        }
    }

    @Override // tb.nhd
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fecb010", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.nhd
    public void b(khd khdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c035d38", new Object[]{this, khdVar});
        }
    }

    @Override // tb.nhd
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e268c27", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.nhd
    public ViewGroup d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6cc4cd67", new Object[]{this, context, new Boolean(z)});
        }
        return null;
    }

    public RecyclerView e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("ef4e8da7", new Object[]{this, context});
        }
        return null;
    }

    public DinamicXEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        fve.e("RecommendManagerImpl", "illegal invoke, getDinamicXEngine");
        return new DinamicXEngine(new DXEngineConfig("afterbuy"));
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f9d31c7", new Object[]{this})).intValue();
        }
        return 2;
    }

    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return null;
    }

    public z4a getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("acca2aa6", new Object[]{this});
        }
        return null;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return null;
    }

    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return null;
    }

    public AwesomeGetPageData getPageParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetPageData) ipChange.ipc$dispatch("8667d832", new Object[]{this});
        }
        return null;
    }

    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return null;
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0b739e", new Object[]{this, jSONObject});
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2889a22", new Object[]{this});
        }
    }

    public boolean isAdaptHudScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isLastPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3afa9a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e389cb4e", new Object[]{this, jSONObject});
        }
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73b2f286", new Object[]{this})).intValue();
        }
        return -1;
    }

    public void l(rjj rjjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe22137a", new Object[]{this, rjjVar, jSONObject});
        }
    }

    public d11 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d11) ipChange.ipc$dispatch("4332921f", new Object[]{this});
        }
        return null;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6fd718", new Object[]{this});
        }
    }

    public List<SectionModel> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a50ccf7e", new Object[]{this});
        }
        return null;
    }

    public mhd p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mhd) ipChange.ipc$dispatch("38ecf3b8", new Object[]{this});
        }
        return null;
    }

    public void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed34e23e", new Object[]{this, jSONObject});
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public String s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f316ffc", new Object[]{this, str, str2});
        }
        return null;
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f3aa2a", new Object[]{this});
        }
    }

    public void y(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20cc848", new Object[]{this, map});
        }
    }

    public static d v(z4a z4aVar, String str, List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("90bc0df2", new Object[]{z4aVar, str, list});
        }
        if (z4aVar == null) {
            return null;
        }
        if (TextUtils.equals("tmallhk_ds_native_taobao", str)) {
            z4aVar = z4a.REC_DIRECT_SALE_CART;
        }
        if (f4b.b("disableAfterBuyFramework", false) || !zn4.a(z4aVar.f32522a) || !oh0.a(z4aVar.f32522a)) {
            f12682a = false;
        } else {
            f12682a = true;
        }
        if (zn4.c(z4aVar.b())) {
            f12682a = true;
        } else if (TextUtils.equals(z4aVar.f32522a, z4a.REC_MY_TAO.b())) {
            f12682a = true;
        }
        if (f12682a) {
            return new b(z4aVar, list);
        }
        return new OldRecommendManagerImpl(z4aVar);
    }
}
