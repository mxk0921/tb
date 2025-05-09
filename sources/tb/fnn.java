package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend4.manager.a;
import com.taobao.tao.recommend4.manager.d;
import com.taobao.tao.recommend4.recyclerview.a;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fnn implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final d f19423a;

    static {
        t2o.a(729809934);
        t2o.a(729809943);
    }

    public fnn(z4a z4aVar) {
        this.f19423a = d.t(z4aVar);
        gh0.j().p(z4aVar.f32522a);
    }

    public static fnn e(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnn) ipChange.ipc$dispatch("c8dcd71b", new Object[]{z4aVar});
        }
        if (z4aVar == null) {
            return null;
        }
        return new fnn(z4aVar);
    }

    public static fnn q(z4a z4aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fnn) ipChange.ipc$dispatch("bd94fd11", new Object[]{z4aVar, str});
        }
        if (z4aVar == null) {
            return null;
        }
        if (TextUtils.equals("tmallhk_ds_native_taobao", str)) {
            return new fnn(z4a.REC_DIRECT_SALE_CART);
        }
        return new fnn(z4aVar);
    }

    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29247c64", new Object[]{this, str});
        } else {
            this.f19423a.F(str);
        }
    }

    public void B(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c14273c", new Object[]{this, new Integer(i)});
        } else {
            this.f19423a.H(i);
        }
    }

    public void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e267d4f5", new Object[]{this, new Integer(i)});
        } else {
            this.f19423a.I(i);
        }
    }

    public void D(a.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("129092a0", new Object[]{this, eVar});
        } else {
            this.f19423a.J(eVar);
        }
    }

    public void E(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
            return;
        }
        hrg.e("scaleScene", "RecommendContainer", "setScrollEnabled : " + z);
        this.f19423a.K(z);
    }

    public void F(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5469b0", new Object[]{this, jSONObject, jSONObject2});
        } else {
            this.f19423a.L(jSONObject, jSONObject2);
        }
    }

    public void G(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb065cc3", new Object[]{this, z4aVar});
            return;
        }
        this.f19423a.M(z4aVar);
        sfh.f("real_time_rec", hashCode() + "updateGatewayContainerType: " + z4aVar.f32522a);
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47bf5038", new Object[]{this});
        } else {
            this.f19423a.N();
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9c5abf", new Object[]{this});
        } else {
            this.f19423a.O();
        }
    }

    public RecyclerView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("ef4e8da7", new Object[]{this, context});
        }
        hrg.e("scaleScene", "RecommendContainer", "createRecommendContainer");
        return this.f19423a.e(context);
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed34e23e", new Object[]{this, jSONObject});
        } else {
            this.f19423a.q(jSONObject);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f19423a.r();
        }
    }

    public String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f316ffc", new Object[]{this, str, str2});
        }
        return this.f19423a.s(str, str2);
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public DinamicXEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        return this.f19423a.f();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f9d31c7", new Object[]{this})).intValue();
        }
        return this.f19423a.g();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        return this.f19423a.getContainerId();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public z4a getContainerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("acca2aa6", new Object[]{this});
        }
        return this.f19423a.getContainerType();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f19423a.getContext();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return this.f19423a.getExt();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public AwesomeGetPageData getPageParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetPageData) ipChange.ipc$dispatch("8667d832", new Object[]{this});
        }
        return this.f19423a.getPageParams();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.f19423a.getRecyclerView();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0b739e", new Object[]{this, jSONObject});
        } else {
            this.f19423a.h(jSONObject);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2889a22", new Object[]{this});
        } else {
            this.f19423a.i();
        }
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public boolean isAdaptHudScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        return this.f19423a.isAdaptHudScreen();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public boolean isLastPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f3afa9a", new Object[]{this})).booleanValue();
        }
        return this.f19423a.isLastPage();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e389cb4e", new Object[]{this, jSONObject});
        } else {
            this.f19423a.j(jSONObject);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73b2f286", new Object[]{this})).intValue();
        }
        return this.f19423a.k();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public void l(rjj rjjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe22137a", new Object[]{this, rjjVar, jSONObject});
            return;
        }
        hrg.e("scaleScene", "RecommendContainer", "replaceRequest");
        this.f19423a.l(rjjVar, jSONObject);
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public d11 m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d11) ipChange.ipc$dispatch("4332921f", new Object[]{this});
        }
        return this.f19423a.m();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af6fd718", new Object[]{this});
        } else {
            this.f19423a.n();
        }
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public List<SectionModel> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a50ccf7e", new Object[]{this});
        }
        return this.f19423a.o();
    }

    @Override // com.taobao.tao.recommend4.manager.a
    public mhd p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mhd) ipChange.ipc$dispatch("38ecf3b8", new Object[]{this});
        }
        return this.f19423a.p();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f3aa2a", new Object[]{this});
        } else {
            this.f19423a.x();
        }
    }

    public void s(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20cc848", new Object[]{this, map});
            return;
        }
        hrg.e("scaleScene", "RecommendContainer", Constant.KEY_PAGEBACK);
        this.f19423a.y(map);
    }

    public void t(d11 d11Var, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf276b71", new Object[]{this, d11Var, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder("preRequestData apiInfo : ");
        if (d11Var == null || d11Var.c()) {
            str = "";
        } else {
            str = d11Var.a() + " - " + d11Var.b();
        }
        sb.append(str);
        hrg.e("scaleScene", "RecommendContainer", sb.toString());
        if (d11Var == null || d11Var.c()) {
            this.f19423a.a(jSONObject);
        } else {
            this.f19423a.C(d11Var, jSONObject);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b73a1e84", new Object[]{this});
            return;
        }
        hrg.e("scaleScene", "RecommendContainer", "requestCacheData");
        this.f19423a.B();
    }

    public void v(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fecb010", new Object[]{this, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder("requestData bizParams : ");
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.toJSONString();
        }
        sb.append(str);
        hrg.e("scaleScene", "RecommendContainer", sb.toString());
        this.f19423a.a(jSONObject);
        this.f19423a.E();
    }

    public void w(d11 d11Var, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984c3ee", new Object[]{this, d11Var, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder("requestData apiInfo : ");
        if (d11Var == null || d11Var.c()) {
            str = "";
        } else {
            str = d11Var.a() + " - " + d11Var.b();
        }
        sb.append(str);
        hrg.e("scaleScene", "RecommendContainer", sb.toString());
        this.f19423a.C(d11Var, jSONObject);
        this.f19423a.E();
    }

    public void x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340f8e2", new Object[]{this, jSONObject});
            return;
        }
        hrg.e("scaleScene", "RecommendContainer", "requestPullRefresh");
        this.f19423a.D(jSONObject);
        this.f19423a.E();
    }

    public void y(khd khdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c035d38", new Object[]{this, khdVar});
            return;
        }
        hrg.e("scaleScene", "RecommendContainer", "resigsterCallback");
        this.f19423a.b(khdVar);
    }

    public void z(a.AbstractC0720a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb83085e", new Object[]{this, aVar});
            return;
        }
        hrg.e("scaleScene", "RecommendContainer", "setAnimationResponseListener");
        this.f19423a.G(aVar);
    }
}
