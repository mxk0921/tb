package com.taobao.android.detail.industry.hourlydelivery;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXViewPager;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.ScrollListener;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tbicontext.TBILifecycleManager;
import com.taobao.tbicontext.ThreadMode;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a07;
import tb.a1v;
import tb.agr;
import tb.bgr;
import tb.cc4;
import tb.ckf;
import tb.cpj;
import tb.dq6;
import tb.e6j;
import tb.e6z;
import tb.fdc;
import tb.ggr;
import tb.h55;
import tb.ism;
import tb.jd2;
import tb.k55;
import tb.kfr;
import tb.kjz;
import tb.ksd;
import tb.lb4;
import tb.mb4;
import tb.mw5;
import tb.na4;
import tb.nfr;
import tb.nmz;
import tb.nv;
import tb.ofr;
import tb.qc4;
import tb.qd2;
import tb.qfr;
import tb.t2o;
import tb.tb7;
import tb.ub7;
import tb.ug5;
import tb.uj3;
import tb.vfr;
import tb.wfr;
import tb.wg5;
import tb.xa6;
import tb.xb7;
import tb.xfr;
import tb.xob;
import tb.z3o;
import tb.zfr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DeliveryBiz extends jd2<xfr> implements qfr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSETS_SEARCH_BOX_DATA = "hourdelivery/search_box_default_data.json";
    public static final b Companion = new b(null);
    public static final String DELIVERY_DX_DATA = "deliveryDXTemplateItemData";
    public static final String DELIVERY_SEARCH_DATA = "deliverySearchBoxData";
    public DXRootView c;
    public DXRecyclerLayout d;
    public int e;
    public boolean f;
    public final d g = new d();
    public final nv h;
    public final fdc i;
    public final nfr j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements vfr {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public nmz b;

        public a() {
        }

        @Override // tb.vfr
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
            } else {
                vfr.a.j(this);
            }
        }

        @Override // tb.vfr
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9e81b03", new Object[]{this, obj});
            } else {
                vfr.a.p(this, obj);
            }
        }

        @Override // tb.vfr
        public void c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("714b8e70", new Object[]{this, obj});
            } else {
                vfr.a.o(this, obj);
            }
        }

        @Override // tb.vfr
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e353ddcf", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.add("same-hour-delivery-store");
            jSONArray.add("tb-store-core-modules");
            jSONArray.add("tb-store-txd-modules");
            jSONObject.put((JSONObject) "prefetchList", (String) jSONArray);
            DeliveryBiz.this.b().a().a("zcache", jSONObject, null);
        }

        @Override // tb.vfr
        public void e(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33545dd4", new Object[]{this, obj});
            } else {
                vfr.a.l(this, obj);
            }
        }

        @Override // tb.vfr
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42936e64", new Object[]{this});
            } else {
                vfr.a.f(this);
            }
        }

        @Override // tb.vfr
        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37cad717", new Object[]{this});
            } else {
                vfr.a.b(this);
            }
        }

        @Override // tb.vfr
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2df9a19", new Object[]{this});
            } else {
                vfr.a.m(this);
            }
        }

        @Override // tb.vfr
        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e3e836a", new Object[]{this});
            } else {
                vfr.a.k(this);
            }
        }

        @Override // tb.vfr
        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c078d8ac", new Object[]{this});
            } else {
                vfr.a.c(this);
            }
        }

        @Override // tb.vfr
        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("472467df", new Object[]{this});
            } else {
                vfr.a.g(this);
            }
        }

        @Override // tb.vfr
        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c654be94", new Object[]{this});
            } else {
                vfr.a.h(this);
            }
        }

        @Override // tb.vfr
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ae051af", new Object[]{this});
            } else {
                vfr.a.i(this);
            }
        }

        @Override // tb.vfr
        public void onActivityResult(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e486ce2e", new Object[]{this, obj});
            } else {
                vfr.a.a(this, obj);
            }
        }

        @Override // tb.vfr
        public void onCreate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
                return;
            }
            xob<?> c = DeliveryBiz.this.b().b().c("dx");
            if (c instanceof wg5) {
                wg5 wg5Var = (wg5) c;
                wg5Var.d(ub7.DATA_PARSER_ROCKET, new ub7(DeliveryBiz.i(DeliveryBiz.this)));
                wg5Var.d(tb7.DX_PARSER_HOURCITYINFOCALLBACK, new tb7(DeliveryBiz.i(DeliveryBiz.this)));
                wg5Var.c(ism.AK_ABILITY_DELIVERY_PRELOAD, new ism.b(DeliveryBiz.i(DeliveryBiz.this)));
            }
            DeliveryBiz.this.b().h().c("refreshState", DeliveryBiz.l(DeliveryBiz.this));
            DeliveryBiz.this.b().h().c("locationInfo", DeliveryBiz.l(DeliveryBiz.this));
            DeliveryBiz.this.b().h().c("enableRefresh", DeliveryBiz.l(DeliveryBiz.this));
            DeliveryBiz.this.b().h().c("showRocket", DeliveryBiz.l(DeliveryBiz.this));
            this.b = new nmz(DeliveryBiz.this.b());
        }

        @Override // tb.vfr
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            nmz nmzVar = this.b;
            if (nmzVar != null) {
                nmzVar.b();
            }
            this.b = null;
            DeliveryBiz.s(DeliveryBiz.this, true);
        }

        @Override // tb.vfr
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                vfr.a.e(this);
            }
        }

        @Override // tb.vfr
        public void onRestart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            } else {
                vfr.a.n(this);
            }
        }

        @Override // tb.vfr
        public void onResume() {
            qc4 a2;
            String a3;
            na4<?> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                return;
            }
            xb7 xb7Var = (xb7) DeliveryBiz.this.b().d().b();
            if (xb7Var != null && (a2 = xb7Var.a()) != null && (a3 = a2.a()) != null && (b = DeliveryBiz.this.b().b().b(a3)) != null) {
                b.a();
            }
        }

        @Override // tb.vfr
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else {
                vfr.a.q(this);
            }
        }

        @Override // tb.vfr
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            } else {
                vfr.a.r(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        static {
            t2o.a(440401968);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d implements ksd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.ksd
        public void a(String str, Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b85634ab", new Object[]{this, str, obj, obj2});
                return;
            }
            ckf.g(str, "name");
            switch (str.hashCode()) {
                case -2090050600:
                    if (!str.equals("enableRefresh")) {
                        return;
                    }
                    if (obj2 != null) {
                        DeliveryBiz.j(DeliveryBiz.this).y(DeliveryBiz.m(DeliveryBiz.this), ((Boolean) obj2).booleanValue());
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                case -58616317:
                    if (str.equals("locationInfo")) {
                        DeliveryBiz.j(DeliveryBiz.this).A(DeliveryBiz.m(DeliveryBiz.this), (Map) obj2);
                        return;
                    }
                    return;
                case -57290122:
                    if (!str.equals("refreshState")) {
                        return;
                    }
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    } else if (((Boolean) obj2).booleanValue()) {
                        DeliveryBiz.j(DeliveryBiz.this).u(DeliveryBiz.m(DeliveryBiz.this));
                        return;
                    } else {
                        return;
                    }
                case 749411377:
                    if (!str.equals("showRocket")) {
                        return;
                    }
                    if (obj2 != null) {
                        DeliveryBiz.j(DeliveryBiz.this).w(DeliveryBiz.m(DeliveryBiz.this), ((Boolean) obj2).booleanValue());
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                default:
                    return;
            }
        }
    }

    static {
        t2o.a(440401966);
        t2o.a(803209252);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryBiz(nv nvVar, fdc fdcVar, nfr nfrVar, zfr<xfr> zfrVar) {
        super(nfrVar, zfrVar);
        ckf.g(nvVar, "tabController");
        ckf.g(fdcVar, "callback");
        ckf.g(nfrVar, "baseContext");
        ckf.g(zfrVar, "pageManager");
        this.h = nvVar;
        this.i = fdcVar;
        this.j = nfrVar;
        b().a().b("PageRefresh", new kjz(b(), zfrVar));
        b().e().b(e6z.EVENT_ERROR_RETRY, this);
        b().e().b("eventDxRender", this);
        b().g().a(new a());
    }

    public static final /* synthetic */ void h(DeliveryBiz deliveryBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8202a4d6", new Object[]{deliveryBiz});
        } else {
            deliveryBiz.o();
        }
    }

    public static final /* synthetic */ nfr i(DeliveryBiz deliveryBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfr) ipChange.ipc$dispatch("b57c5a76", new Object[]{deliveryBiz});
        }
        return deliveryBiz.j;
    }

    public static /* synthetic */ Object ipc$super(DeliveryBiz deliveryBiz, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/hourlydelivery/DeliveryBiz");
    }

    public static final /* synthetic */ fdc j(DeliveryBiz deliveryBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdc) ipChange.ipc$dispatch("855e2d49", new Object[]{deliveryBiz});
        }
        return deliveryBiz.i;
    }

    public static final /* synthetic */ int k(DeliveryBiz deliveryBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58c603bd", new Object[]{deliveryBiz})).intValue();
        }
        return deliveryBiz.e;
    }

    public static final /* synthetic */ d l(DeliveryBiz deliveryBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("5fa642ec", new Object[]{deliveryBiz});
        }
        return deliveryBiz.g;
    }

    public static final /* synthetic */ nv m(DeliveryBiz deliveryBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nv) ipChange.ipc$dispatch("6362fac0", new Object[]{deliveryBiz});
        }
        return deliveryBiz.h;
    }

    public static final /* synthetic */ void n(DeliveryBiz deliveryBiz, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38a07ed", new Object[]{deliveryBiz, new Integer(i)});
        } else {
            deliveryBiz.e = i;
        }
    }

    public static final /* synthetic */ boolean q(DeliveryBiz deliveryBiz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60630e67", new Object[]{deliveryBiz})).booleanValue();
        }
        return deliveryBiz.f;
    }

    public static final /* synthetic */ void s(DeliveryBiz deliveryBiz, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63cd319", new Object[]{deliveryBiz, new Boolean(z)});
        } else {
            deliveryBiz.f = z;
        }
    }

    public final xb7 A(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xb7) ipChange.ipc$dispatch("2a637a3f", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("name");
        Long l = jSONObject.getLong("version");
        long longValue = l != null ? l.longValue() : 0L;
        String string2 = jSONObject.getString("url");
        if (string == null || longValue == 0 || string2 == null) {
            return null;
        }
        qc4 qc4Var = new qc4(string, "dx", string2, longValue);
        String string3 = jSONObject.getString("updatePageName");
        String string4 = jSONObject.getString("updatePageUtParam");
        JSONObject jSONObject2 = jSONObject.getJSONObject(a1v.UPDATE_PAGE_PROPERTIES);
        xb7 xb7Var = new xb7();
        xb7Var.p(string4);
        xb7Var.n(string3);
        HashMap hashMap = new HashMap();
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                ckf.f(key, "entry.key");
                Object value = entry.getValue();
                if (value == null || (str = value.toString()) == null) {
                    str = "";
                }
                hashMap.put(key, str);
            }
        }
        xb7Var.o(hashMap);
        xb7Var.h(qc4Var);
        return xb7Var;
    }

    public final void C(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc9a57c", new Object[]{this, dXRecyclerLayout});
            return;
        }
        ScrollListener l0 = dXRecyclerLayout.l0();
        if (l0 != null) {
            l0.v();
        }
        RecyclerView j0 = dXRecyclerLayout.j0();
        if (j0 != null) {
            j0.scrollToPosition(0);
        }
    }

    @Override // tb.qfr
    public ThreadMode a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("b9ca4b4", new Object[]{this});
        }
        return qfr.a.a(this);
    }

    @Override // tb.jd2
    public void f(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd44c4", new Object[]{this, bundle});
            return;
        }
        b().g().b(TBILifecycleManager.TBILifeCycleEnum.OnPreloadStart, null);
        agr agrVar = agr.INSTANCE;
        String a2 = agrVar.a(b().c(), DELIVERY_DX_DATA, null);
        xb7 xb7Var = (xb7) b().d().b();
        if (xb7Var != null) {
            if (a2 != null) {
                JSONObject parseObject = JSON.parseObject(a2);
                ckf.f(parseObject, "JSON.parseObject(dxData)");
                xb7 A = A(parseObject);
                if (A != null) {
                    wfr.INSTANCE.a("DeliveryContext", "preload: has data");
                    xb7Var.i(A.a());
                    xb7Var.j(A.d());
                    xb7Var.k(A.e());
                    xb7Var.m(A.f());
                    c().r(p(A));
                } else {
                    return;
                }
            }
            String a3 = agrVar.a(b().c(), DELIVERY_SEARCH_DATA, null);
            if (a3 != null) {
                JSONObject parseObject2 = JSON.parseObject(a3);
                this.i.t(this.h, parseObject2);
                xb7Var.l(parseObject2);
            } else {
                xb7Var.l(v());
            }
            b().g().b(TBILifecycleManager.TBILifeCycleEnum.OnPreloadFinish, null);
        }
    }

    @Override // tb.jd2
    public void g(Bundle bundle, final z3o z3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea3c5a37", new Object[]{this, bundle, z3oVar});
            return;
        }
        ckf.g(z3oVar, "callback");
        new e6j.a("mtop.taobao.hourly.delivery.config.dx", "1.0").m(MethodEnum.POST).n(true).a().a(new IRemoteListener() { // from class: com.taobao.android.detail.industry.hourlydelivery.DeliveryBiz$requestData$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str;
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (DeliveryBiz.q(DeliveryBiz.this)) {
                    wfr.INSTANCE.b("DeliveryContext", "requestData success, state is destroyed");
                } else {
                    z3o z3oVar2 = z3oVar;
                    if (mtopResponse == null || (str = mtopResponse.getRetCode()) == null) {
                        str = String.valueOf(i);
                    }
                    if (mtopResponse == null || (str2 = mtopResponse.getRetMsg()) == null) {
                        str2 = "";
                    }
                    z3oVar2.a(new dq6(str, str2, null));
                    wfr wfrVar = wfr.INSTANCE;
                    StringBuilder sb = new StringBuilder("requestData failed ");
                    sb.append(i);
                    sb.append(' ');
                    sb.append(mtopResponse != null ? mtopResponse.getRetCode() : null);
                    sb.append('.');
                    wfrVar.b("DeliveryContext", sb.toString());
                    if (mtopResponse != null) {
                        AppMonitor.Alarm.commitFail("Industry_Scene", "Monitor_Page_error", mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    }
                    xb7 xb7Var = (xb7) DeliveryBiz.this.b().d().b();
                    if ((xb7Var != null ? xb7Var.b() : null) == null) {
                        DeliveryBiz.this.c().b().removeAllViews();
                        DeliveryBiz.this.b().a().a("error", new JSONObject(), null);
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (DeliveryBiz.q(DeliveryBiz.this)) {
                    wfr.INSTANCE.b("DeliveryContext", "requestData success, state is destroyed");
                    onError(i, mtopResponse, obj);
                } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                    wfr.INSTANCE.b("DeliveryContext", "requestData success, data error");
                    onError(i, mtopResponse, obj);
                } else {
                    wfr.INSTANCE.b("DeliveryContext", "requestData success");
                    byte[] bytedata = mtopResponse.getBytedata();
                    ckf.f(bytedata, "response.bytedata");
                    String str = new String(bytedata, uj3.UTF_8);
                    String retCode = mtopResponse.getRetCode();
                    ckf.f(retCode, "response.retCode");
                    z3oVar.b(new qd2(str, retCode, mtopResponse.getRetMsg()));
                }
            }
        });
    }

    @Override // tb.qfr
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "name");
        int hashCode = str.hashCode();
        if (hashCode != -819744335) {
            if (hashCode != 2144016388 || !str.equals("eventDxRender")) {
                return;
            }
            if (obj != null) {
                xa6 xa6Var = (xa6) obj;
                this.e = 0;
                if (!xa6Var.b()) {
                    b().h().d("enableRefresh", Boolean.FALSE);
                    c().b().removeAllViews();
                    b().a().a("error", new JSONObject(), null);
                    return;
                }
                this.c = xa6Var.a();
                t(xa6Var);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.industry.tbiunicontainer.core.event.DXRenderResult");
        } else if (str.equals(e6z.EVENT_ERROR_RETRY)) {
            g(null, new z3o() { // from class: com.taobao.android.detail.industry.hourlydelivery.DeliveryBiz$onEvent$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.z3o
                public void a(dq6 dq6Var) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("de567a88", new Object[]{this, dq6Var});
                        return;
                    }
                    ckf.g(dq6Var, "error");
                    DeliveryBiz.this.c().b().removeAllViews();
                    DeliveryBiz.this.b().a().a("error", new JSONObject(), null);
                }

                @Override // tb.z3o
                public void b(qd2 qd2Var) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("de5157b", new Object[]{this, qd2Var});
                        return;
                    }
                    ckf.g(qd2Var, "bizData");
                    xfr a2 = DeliveryBiz.this.b().d().a(qd2Var);
                    if (a2 != null) {
                        DeliveryBiz.this.c().r(a2);
                    }
                }
            });
        }
    }

    public final xfr p(xb7 xb7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfr) ipChange.ipc$dispatch("3ef10e9", new Object[]{this, xb7Var});
        }
        kfr<xfr> d2 = b().d();
        if (d2 != null) {
            return ((ofr) d2).e(xb7Var);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.detail.industry.hourlydelivery.TBIDeliveryDataEngine");
    }

    public final ug5 r() {
        qc4 a2;
        String a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ug5) ipChange.ipc$dispatch("d3a1c068", new Object[]{this});
        }
        xb7 xb7Var = (xb7) b().d().b();
        if (!(xb7Var == null || (a2 = xb7Var.a()) == null || (a3 = a2.a()) == null)) {
            na4<?> b2 = b().b().b(a3);
            if (b2 instanceof ug5) {
                return (ug5) b2;
            }
        }
        return null;
    }

    public final void t(xa6 xa6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c60bcee", new Object[]{this, xa6Var});
            return;
        }
        DXRootView a2 = xa6Var.a();
        ckf.d(a2);
        DXWidgetNode queryWidgetNodeByUserId = a2.getExpandWidgetNode().queryWidgetNodeByUserId(WXBasicComponentType.RECYCLER);
        if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
            DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) queryWidgetNodeByUserId;
            this.d = dXRecyclerLayout;
            RecyclerView j0 = dXRecyclerLayout.j0();
            if (j0 != null) {
                j0.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.detail.industry.hourlydelivery.DeliveryBiz$setupRecyclerView$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(DeliveryBiz$setupRecyclerView$1 deliveryBiz$setupRecyclerView$1, String str, Object... objArr) {
                        if (str.hashCode() == -1177043419) {
                            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                            return null;
                        }
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/hourlydelivery/DeliveryBiz$setupRecyclerView$1");
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                            return;
                        }
                        super.onScrolled(recyclerView, i, i2);
                        DeliveryBiz deliveryBiz = DeliveryBiz.this;
                        DeliveryBiz.n(deliveryBiz, DeliveryBiz.k(deliveryBiz) + i2);
                        DeliveryBiz.h(DeliveryBiz.this);
                    }
                });
            }
        }
    }

    public final JSONObject u() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("686759be", new Object[]{this});
        }
        xb7 xb7Var = (xb7) b().d().b();
        if (xb7Var != null) {
            jSONObject = xb7Var.g();
        } else {
            jSONObject = null;
        }
        B();
        if (jSONObject != null) {
            return jSONObject;
        }
        if (xb7Var != null) {
            return xb7Var.c();
        }
        return null;
    }

    public final JSONObject v() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1d96dea1", new Object[]{this});
        }
        String b2 = ggr.INSTANCE.b(b().c(), ASSETS_SEARCH_BOX_DATA);
        if (b2 == null || (jSONObject = JSON.parseObject(b2).getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("module")) == null) {
            return null;
        }
        return jSONObject2.getJSONObject(cpj.SEARCH_BOX);
    }

    public final void w(Uri uri) {
        qc4 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c03117b", new Object[]{this, uri});
            return;
        }
        ckf.g(uri, "outLinkUri");
        wfr wfrVar = wfr.INSTANCE;
        wfrVar.a("DeliveryContext", "notifyOutLinkParams: " + uri);
        xb7 xb7Var = (xb7) b().d().b();
        String a3 = (xb7Var == null || (a2 = xb7Var.a()) == null) ? null : a2.a();
        if (a3 == null || b().b().b(a3) == null) {
            wfrVar.a("DeliveryContext", "save out link");
            b().h().d("outLinkUri", uri);
            return;
        }
        na4<?> b2 = b().b().b(a3);
        if (b2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "type", "paramsTransfer");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(k55.a(uri));
            jSONObject.put((JSONObject) "data", (String) jSONObject2);
            wfrVar.d("DeliveryContext", "sendOutLinkParamsMessage " + jSONObject);
            ((ug5) b2).m("hourDeliveryHomePostMessageFromNative", jSONObject);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.industry.tbiunicontainer.core.component.DXComponent");
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        ug5 r = r();
        if (r != null) {
            b().h().d("refreshState", Boolean.FALSE);
            DXEvent dXEvent = new DXEvent(5288680013941347641L);
            HashMap hashMap = new HashMap();
            mw5 O = mw5.O("true");
            ckf.f(O, "DXExprVar.ofString(\"true\")");
            hashMap.put("pullDown", O);
            dXEvent.setArgs(hashMap);
            r.n(dXEvent, WXBasicComponentType.RECYCLER);
        }
    }

    /* renamed from: z */
    public List<na4<?>> e(xfr xfrVar) {
        lb4 lb4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a8e51820", new Object[]{this, xfrVar});
        }
        ckf.g(xfrVar, "tbiMeta");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = xfrVar.b().iterator();
        while (it.hasNext()) {
            String next = it.next();
            qc4 qc4Var = xfrVar.a().get(next);
            if (!(qc4Var == null || (lb4Var = xfrVar.c().get(next)) == null)) {
                cc4 cc4Var = new cc4();
                cc4Var.e(qc4Var.a());
                cc4Var.f(qc4Var.b());
                cc4Var.g(qc4Var.c());
                cc4Var.h(qc4Var.d());
                mb4 mb4Var = new mb4();
                mb4Var.b(lb4Var.a());
                mb4Var.c(next);
                mb4Var.d(cc4Var.b());
                na4<?> a2 = this.j.b().a(cc4Var, mb4Var);
                if (a2 != null) {
                    this.j.b().d(qc4Var.a(), a2);
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc281c6c", new Object[]{this});
        } else if (this.f) {
            wfr.INSTANCE.b("DeliveryContext", "requestSearchInfo, state is destroyed");
        } else {
            e6j.a aVar = new e6j.a("mtop.xsd.searchbar.info.get", "1.0");
            Map map = (Map) b().h().a("locationInfo");
            if (map != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "extendMap", JSON.toJSONString(map));
                String jSONString = jSONObject.toJSONString();
                ckf.f(jSONString, "requestData.toJSONString()");
                aVar.l(jSONString);
            }
            aVar.m(MethodEnum.POST).n(true).a().a(new IRemoteListener() { // from class: com.taobao.android.detail.industry.hourlydelivery.DeliveryBiz$requestSearchInfo$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    wfr wfrVar = wfr.INSTANCE;
                    wfrVar.b("DeliveryContext", "requestSearchBoxData onError : " + mtopResponse);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject jSONObject2;
                    JSONObject jSONObject3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (DeliveryBiz.q(DeliveryBiz.this)) {
                        wfr.INSTANCE.b("DeliveryContext", "requestSearchInfo, state is destroyed");
                    } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                        wfr.INSTANCE.b("DeliveryContext", "requestSearchInfo, data error");
                    } else {
                        wfr.INSTANCE.b("DeliveryContext", "requestSearchInfo success");
                        xb7 xb7Var = (xb7) DeliveryBiz.this.b().d().b();
                        byte[] bytedata = mtopResponse.getBytedata();
                        ckf.f(bytedata, "response.bytedata");
                        JSONObject jSONObject4 = JSON.parseObject(new String(bytedata, uj3.UTF_8)).getJSONObject("data");
                        if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("module")) != null && (jSONObject3 = jSONObject2.getJSONObject(cpj.SEARCH_BOX)) != null) {
                            agr agrVar = agr.INSTANCE;
                            Context c = DeliveryBiz.this.b().c();
                            String jSONString2 = jSONObject3.toJSONString();
                            ckf.f(jSONString2, "searchBox.toJSONString()");
                            agrVar.b(c, DeliveryBiz.DELIVERY_SEARCH_DATA, jSONString2);
                            if (xb7Var != null) {
                                xb7Var.q(jSONObject3);
                            }
                            DeliveryBiz.j(DeliveryBiz.this).t(DeliveryBiz.m(DeliveryBiz.this), jSONObject3);
                        }
                    }
                }
            });
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        if (ckf.b((Boolean) b().h().a("showRocket"), Boolean.FALSE)) {
            this.i.z(this.h);
        }
        DXRecyclerLayout dXRecyclerLayout = this.d;
        if (dXRecyclerLayout != null) {
            this.e = 0;
            ckf.d(dXRecyclerLayout);
            dXRecyclerLayout.c1(false, 0);
            DXRootView dXRootView = this.c;
            ckf.d(dXRootView);
            DXViewPager dXViewPager = (DXViewPager) dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId(OrderConfigs.VIEWPAGER);
            if (dXViewPager == null) {
                h55.c("DeliveryContext", "view pager is null");
                return;
            }
            List<DXWidgetNode> y = dXViewPager.y();
            if (y == null || y.isEmpty()) {
                h55.c("DeliveryContext", "view pager widget nodes is empty");
                return;
            }
            for (DXWidgetNode dXWidgetNode : y) {
                if (dXWidgetNode instanceof DXRecyclerLayout) {
                    C((DXRecyclerLayout) dXWidgetNode);
                } else if (!(dXWidgetNode == null || dXWidgetNode.getChildren() == null)) {
                    List<DXWidgetNode> children = dXWidgetNode.getChildren();
                    ckf.f(children, "node.children");
                    if (!children.isEmpty()) {
                        for (DXWidgetNode dXWidgetNode2 : dXWidgetNode.getChildren()) {
                            if (dXWidgetNode2 instanceof DXRecyclerLayout) {
                                C((DXRecyclerLayout) dXWidgetNode2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void o() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8676b0", new Object[]{this});
            return;
        }
        b().h().d("enableRefresh", Boolean.valueOf(this.e < 10));
        bgr h = b().h();
        if (this.e > 200) {
            z = true;
        }
        h.d("showRocket", Boolean.valueOf(z));
    }
}
