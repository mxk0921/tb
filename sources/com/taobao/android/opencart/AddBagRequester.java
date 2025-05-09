package com.taobao.android.opencart;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.accs.common.Constants;
import com.taobao.android.abilityidl.ability.AlertConfirmInfo;
import com.taobao.android.opencart.AddBagModel;
import com.taobao.android.opencart.view.VesselViewWrapper;
import com.taobao.android.opencart.weex.DismissPopWeexModule;
import com.taobao.android.stdpop.api.PopGravity;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a3l;
import tb.ask;
import tb.bii;
import tb.cbo;
import tb.ce0;
import tb.de0;
import tb.f9v;
import tb.g4w;
import tb.hav;
import tb.hij;
import tb.i4w;
import tb.m3q;
import tb.nuv;
import tb.osc;
import tb.p5l;
import tb.plq;
import tb.q2q;
import tb.shv;
import tb.to8;
import tb.wuf;
import tb.wv6;
import tb.xh8;
import tb.xk0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AddBagRequester {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_ADD_CART = "mtop.trade.addBag";
    public static final String CART_REFRESH_DATA = "cartRefreshData";
    public static final String VERSION_ADD_CART = "3.1";
    public static final String sUTPageShoppingCart = "Page_ShoppingCart";

    /* renamed from: a  reason: collision with root package name */
    public Context f9052a;
    public ce0 b;
    public VesselView c;
    public boolean d;
    public long e;
    public boolean f;
    public com.taobao.android.opencart.a g;
    public wuf h;
    public de0 i;
    public static final String ADD_CART_SUCCESS = Localization.q(R.string.taobao_app_cart_addbag_success);
    public static final String ADD_CART_FAILED = Localization.q(R.string.taobao_app_1028_1_21681);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements osc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f9053a;

        public a(JSONObject jSONObject) {
            this.f9053a = jSONObject;
        }

        @Override // tb.cfb
        public void B(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2958b9b", new Object[]{this, alertConfirmInfo});
            }
        }

        @Override // tb.cfb
        public void J(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5529a063", new Object[]{this, alertConfirmInfo});
            } else {
                nuv.a(AddBagRequester.sUTPageShoppingCart, "Page_ShoppingCart_addbagSucessCleanAlert_Cancel_Click", null);
            }
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }

        @Override // tb.cfb
        public void n(AlertConfirmInfo alertConfirmInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a873d70b", new Object[]{this, alertConfirmInfo});
                return;
            }
            nuv.a(AddBagRequester.sUTPageShoppingCart, "Page_ShoppingCart_addbagSucessCleanAlert_BatchCleanup_Click", null);
            JSONObject jSONObject = this.f9053a;
            if (jSONObject != null) {
                AddBagRequester.c(AddBagRequester.this, jSONObject.getJSONObject("popParams"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.ask
        public void onLoadStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f829aa04", new Object[]{this});
            }
        }

        @Override // tb.ask
        public void onDowngrade(g4w g4wVar, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36618407", new Object[]{this, g4wVar, map});
                return;
            }
            AddBagRequester.g(AddBagRequester.this);
            if (AddBagRequester.h(AddBagRequester.this)) {
                AddBagRequester.j(AddBagRequester.this);
                AddBagRequester.i(AddBagRequester.this, false);
            }
            nuv.d("OpenCart_Addbag_VLView_LoadDowngrade", new String[0]);
            shv.c("AddBagRequest", "vlview load onDowngrade, show toast");
        }

        @Override // tb.ask
        public void onLoadError(g4w g4wVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("365c1211", new Object[]{this, g4wVar});
                return;
            }
            AddBagRequester.g(AddBagRequester.this);
            nuv.d("OpenCart_Addbag_VLView_LoadError", new String[0]);
            shv.c("AddBagRequest", "vlview load error");
        }

        @Override // tb.ask
        public void onLoadFinish(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
                return;
            }
            AddBagRequester.e(AddBagRequester.this, true);
            shv.c("AddBagRequest", "weex load finish " + (System.currentTimeMillis() - AddBagRequester.f(AddBagRequester.this)) + "ms");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements i4w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.i4w
        public void u2(Map<String, Object> map, cbo cboVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef7dc0c", new Object[]{this, map, cboVar});
            } else if (map != null && "dismiss".equals(map.get("method"))) {
                AddBagRequester.g(AddBagRequester.this);
            }
        }
    }

    public static /* synthetic */ void a(AddBagRequester addBagRequester, long j, MtopResponse mtopResponse, AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b6cdaf", new Object[]{addBagRequester, new Long(j), mtopResponse, addBagModel});
        } else {
            addBagRequester.t(j, mtopResponse, addBagModel);
        }
    }

    public static /* synthetic */ void b(AddBagRequester addBagRequester, MtopResponse mtopResponse, AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff3f806", new Object[]{addBagRequester, mtopResponse, addBagModel});
        } else {
            addBagRequester.u(mtopResponse, addBagModel);
        }
    }

    public static /* synthetic */ void c(AddBagRequester addBagRequester, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6426a72b", new Object[]{addBagRequester, jSONObject});
        } else {
            addBagRequester.v(jSONObject);
        }
    }

    public static /* synthetic */ boolean d(AddBagRequester addBagRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48870ec8", new Object[]{addBagRequester})).booleanValue();
        }
        return addBagRequester.d;
    }

    public static /* synthetic */ boolean e(AddBagRequester addBagRequester, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f71b816", new Object[]{addBagRequester, new Boolean(z)})).booleanValue();
        }
        addBagRequester.d = z;
        return z;
    }

    public static /* synthetic */ long f(AddBagRequester addBagRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("765fa917", new Object[]{addBagRequester})).longValue();
        }
        return addBagRequester.e;
    }

    public static /* synthetic */ void g(AddBagRequester addBagRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4384382", new Object[]{addBagRequester});
        } else {
            addBagRequester.n();
        }
    }

    public static /* synthetic */ boolean h(AddBagRequester addBagRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d210dde5", new Object[]{addBagRequester})).booleanValue();
        }
        return addBagRequester.f;
    }

    public static /* synthetic */ boolean i(AddBagRequester addBagRequester, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f721cc99", new Object[]{addBagRequester, new Boolean(z)})).booleanValue();
        }
        addBagRequester.f = z;
        return z;
    }

    public static /* synthetic */ void j(AddBagRequester addBagRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe97840", new Object[]{addBagRequester});
        } else {
            addBagRequester.z();
        }
    }

    public static /* synthetic */ VesselView k(AddBagRequester addBagRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("3e165c25", new Object[]{addBagRequester});
        }
        return addBagRequester.c;
    }

    public static /* synthetic */ ce0 l(AddBagRequester addBagRequester) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ce0) ipChange.ipc$dispatch("f2a1fe8f", new Object[]{addBagRequester});
        }
        return addBagRequester.b;
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72815705", new Object[]{this, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        intent.putExtra("stringifyAddCartResult", str);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("cartBroadcastFrom", to8.ADD_CART);
        LocalBroadcastManager.getInstance(this.f9052a).sendBroadcast(intent);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721b28b2", new Object[]{this});
            return;
        }
        VesselView vesselView = this.c;
        if (vesselView != null && vesselView.getParent() != null) {
            ViewParent parent = this.c.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c);
            }
        }
    }

    public final String o(AddBagModel addBagModel, JSONObject jSONObject) {
        AddBagModel.c endRect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63a5fa00", new Object[]{this, addBagModel, jSONObject});
        }
        if (jSONObject == null || (endRect = addBagModel.getEndRect()) == null) {
            return null;
        }
        String str = "https://market.m.taobao.com/app/tb-trade/icart-group-list/detail-pop?wh_weex=true";
        try {
            if (wv6.a()) {
                str = "https://market.wapa.taobao.com/app/tb-trade/icart-group-list/detail-pop?wh_weex=true";
            }
        } catch (Exception unused) {
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        try {
            buildUpon.appendQueryParameter("cartId", jSONObject.getString("cartId"));
            String string = jSONObject.getString("addToGroupExParams");
            if (string != null) {
                buildUpon.appendQueryParameter("exParams", URLEncoder.encode(string, "UTF-8"));
            }
        } catch (Exception unused2) {
        }
        buildUpon.appendQueryParameter("x", String.valueOf(endRect.h() + (endRect.g() / 2.0f)));
        buildUpon.appendQueryParameter("y", String.valueOf(endRect.i() + endRect.f()));
        return buildUpon.build().toString();
    }

    public final String p(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf3ee23b", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(mtopResponse.getBytedata())).getString("data");
        } catch (Throwable unused) {
            return null;
        }
    }

    public final JSONObject q(MtopResponse mtopResponse) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a4395d67", new Object[]{this, mtopResponse});
        }
        JSONObject jSONObject = new JSONObject();
        if (!(mtopResponse.getBytedata() == null || (parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()))) == null)) {
            jSONObject.put("addCartResult", (Object) parseObject.getJSONObject("data"));
        }
        return jSONObject;
    }

    public final void u(MtopResponse mtopResponse, AddBagModel addBagModel) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff37ba4", new Object[]{this, mtopResponse, addBagModel});
        } else if (mtopResponse == null || !mtopResponse.isApiSuccess()) {
            r(mtopResponse, addBagModel);
        } else {
            this.f = true;
            JSONObject q = q(mtopResponse);
            hav.g("AddBagRequest", "Mtop加购成功，", q.toJSONString());
            JSONObject jSONObject = q.getJSONObject("addCartResult");
            this.g.h(jSONObject);
            this.g.i(true);
            try {
                z = JSON.parseObject(addBagModel.getExParams()).getBooleanValue("depressTBCartRefresh");
            } catch (Exception unused) {
            }
            if (!z) {
                m(p(mtopResponse));
            }
            this.i.onSuccess(q);
            if (this.g.g()) {
                s();
            } else if (!y(jSONObject)) {
                z();
            }
        }
    }

    public final void w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3d55b3", new Object[]{this, context});
            return;
        }
        wuf wufVar = this.h;
        if ((wufVar == null || !wufVar.h()) && this.g.g() && (context instanceof Activity)) {
            this.b = new ce0((Activity) context);
            VesselViewWrapper vesselViewWrapper = new VesselViewWrapper(context);
            this.c = vesselViewWrapper;
            vesselViewWrapper.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.c.setAlpha(0.0f);
            this.c.setOnLoadListener(new b());
            this.c.setVesselViewCallback(new c());
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfe6788", new Object[]{this});
        } else if (!this.g.b()) {
            String e = this.g.e();
            Context context = this.f9052a;
            if (TextUtils.isEmpty(e)) {
                e = ADD_CART_SUCCESS;
            }
            m3q.a(context, 2, e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements ce0.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.ce0.h
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7f4973be", new Object[]{this})).booleanValue();
            }
            return AddBagRequester.d(AddBagRequester.this);
        }

        @Override // tb.ce0.h
        public void onAnimationEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            } else if (AddBagRequester.k(AddBagRequester.this) != null) {
                shv.c("AddBagRequest", "onAnimationEnd isWeexLoadSuccess=" + AddBagRequester.d(AddBagRequester.this));
                if (!AddBagRequester.d(AddBagRequester.this)) {
                    nuv.d("OpenCart_Addbag_VLView_DoNotLoadSuccessAfterAnimation", new String[0]);
                    shv.c("AddBagRequest", String.format("vlview do not load success in %d second", Long.valueOf(AddBagRequester.l(AddBagRequester.this).g())));
                    return;
                }
                AddBagRequester.k(AddBagRequester.this).setAlpha(1.0f);
            }
        }
    }

    public final void r(MtopResponse mtopResponse, AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d608996", new Object[]{this, mtopResponse, addBagModel});
            return;
        }
        String str = ADD_CART_FAILED;
        if (mtopResponse != null && !TextUtils.isEmpty(mtopResponse.getRetMsg())) {
            str = mtopResponse.getRetMsg();
        }
        if (mtopResponse != null) {
            try {
                JSONObject jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
                JSONObject jSONObject2 = jSONObject.getJSONObject("addFailedPopParams");
                if (jSONObject2 == null || !"weex2".equals(jSONObject2.getString("popType"))) {
                    String string = jSONObject.getString("addFailedPopUrl");
                    if (!TextUtils.isEmpty(string)) {
                        p5l.a(this.f9052a, string);
                        return;
                    }
                } else {
                    v(jSONObject2);
                    return;
                }
            } catch (Throwable th) {
                hav.b("AddBagRequest", "handleAddCartError", th.getMessage());
            }
        }
        m3q.a(this.f9052a, 3, str);
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c59834", new Object[]{this});
            return;
        }
        wuf wufVar = this.h;
        if (wufVar == null || !wufVar.m()) {
            if (this.c != null) {
                ViewGroup viewGroup = (ViewGroup) ((Activity) this.f9052a).getWindow().getDecorView();
                if (viewGroup.indexOfChild(this.c) == -1) {
                    viewGroup.addView(this.c);
                }
                String o = o(this.g.c(), this.g.d());
                shv.c("AddBagRequest", "vlview start loading url=" + o);
                nuv.d("OpenCart_Addbag_VLView_Loading", new String[0]);
                this.c.loadUrl(o);
                this.e = System.currentTimeMillis();
            }
            ce0 ce0Var = this.b;
            if (ce0Var != null) {
                ce0Var.l(this.g.c(), new d());
            }
        }
    }

    public final void t(long j, MtopResponse mtopResponse, AddBagModel addBagModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("992273ee", new Object[]{this, new Long(j), mtopResponse, addBagModel});
            return;
        }
        this.f = false;
        r(mtopResponse, addBagModel);
        JSONObject q = q(mtopResponse);
        hav.b("AddBagRequest", "Mtop加购失败，", q.toJSONString());
        q.put("MSOAErrorWVUserInfo", (Object) Boolean.TRUE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.KEY_USER_ID, (Object) q);
        this.i.a(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), jSONObject);
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", mtopResponse.getRetCode());
        hashMap.put("errorMsg", mtopResponse.getRetMsg());
        nuv.j(DismissPopWeexModule.MODULE_NAME, "AddBagFail", 19999, hashMap);
        a3l.a("mtop.trade.addBag", j, false, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
    }

    public final void v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c82f4e", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                if (jSONObject.getString("popType") == null) {
                    hav.a("AddBagRequest", "openWithShowStdPop，type为空");
                    return;
                }
                String string = jSONObject.getString("url");
                if (string == null) {
                    hav.a("AddBagRequest", "openWithShowStdPop，url为空");
                    return;
                }
                plq plqVar = new plq();
                plqVar.o(PopGravity.BOTTOM);
                plqVar.r(true);
                Float f = jSONObject.getFloat(hij.KEY_HEIGHT_RATIO);
                if (f != null) {
                    plqVar.q(f.floatValue());
                }
                plqVar.w(this.f9052a.getApplicationContext(), string, null);
            } catch (Throwable unused) {
            }
        }
    }

    public void x(Context context, final AddBagModel addBagModel, de0 de0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203bdaf0", new Object[]{this, context, addBagModel, de0Var});
            return;
        }
        this.f = false;
        this.i = de0Var;
        if (addBagModel != null) {
            com.taobao.android.opencart.a aVar = new com.taobao.android.opencart.a(addBagModel);
            this.g = aVar;
            if (context instanceof Activity) {
                this.h = wuf.Companion.a((Activity) context, aVar);
            }
            try {
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(addBagModel));
                hav.d("AddBagRequest", "加购请求参数：" + parseObject);
                nuv.c("OpenCart_Addbag_Start", nuv.f(parseObject));
            } catch (Exception e) {
                shv.c("AddBagRequest", "toJson error" + e.getMessage());
            }
            this.f9052a = context;
            w(context);
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.trade.addBag");
            mtopRequest.setVersion("3.1");
            mtopRequest.setNeedSession(true);
            mtopRequest.setNeedEcode(true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemId", (Object) addBagModel.getItemId());
            jSONObject.put(q2q.KEY_SKU_ID, (Object) addBagModel.getSkuId());
            jSONObject.put("quantity", (Object) Long.valueOf(addBagModel.getQuantity()));
            jSONObject.put("cartFrom", (Object) addBagModel.getCartFrom());
            String exParams = addBagModel.getExParams();
            if (!TextUtils.isEmpty(exParams)) {
                try {
                    JSONObject parseObject2 = JSON.parseObject(exParams);
                    parseObject2.put("fromOpenCart", (Object) "true");
                    exParams = parseObject2.toJSONString();
                } catch (Exception e2) {
                    f9v.q(xh8.a(DismissPopWeexModule.MODULE_NAME).c(DismissPopWeexModule.MODULE_NAME).message(e2.getMessage()));
                }
                try {
                    jSONObject.put("exParams", (Object) exParams);
                } catch (Exception unused) {
                }
            }
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness build = MtopBusiness.build(mtopRequest);
            build.reqMethod(MethodEnum.POST);
            build.setUnitStrategy("UNIT_TRADE");
            final long currentTimeMillis = System.currentTimeMillis();
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.opencart.AddBagRequester.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        AddBagRequester.a(AddBagRequester.this, currentTimeMillis, mtopResponse, addBagModel);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    String retMsg;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    AddBagRequester.b(AddBagRequester.this, mtopResponse, addBagModel);
                    nuv.j(DismissPopWeexModule.MODULE_NAME, "AddBagSuccess", 19999, null);
                    long j = currentTimeMillis;
                    if (mtopResponse == null) {
                        retMsg = ResultCode.MSG_SUCCESS;
                    } else {
                        retMsg = mtopResponse.getRetMsg();
                    }
                    a3l.a("mtop.trade.addBag", j, true, "", retMsg);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        AddBagRequester.a(AddBagRequester.this, currentTimeMillis, mtopResponse, addBagModel);
                    }
                }
            }).startRequest();
            nuv.j(DismissPopWeexModule.MODULE_NAME, "AddBagRequest", 19999, null);
        }
    }

    public final boolean y(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("204609bc", new Object[]{this, jSONObject})).booleanValue();
        }
        try {
            if (!(this.f9052a instanceof Activity) || jSONObject == null || Localization.o() || (jSONObject2 = jSONObject.getJSONObject("alert")) == null) {
                return false;
            }
            bii a2 = bii.a();
            xk0 a3 = xk0.a();
            a3.f31435a = jSONObject2.getString("title");
            a3.b = jSONObject2.getString("content");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("confirm");
            if (jSONObject3 != null) {
                a3.d = jSONObject3.getString("buttonText");
            }
            JSONObject jSONObject4 = jSONObject2.getJSONObject("cancel");
            if (jSONObject4 != null) {
                a3.e = jSONObject4.getString("buttonText");
            }
            nuv.e(sUTPageShoppingCart, "Page_ShoppingCart_addbagSucessBatchCleanupAlert_Expo", null);
            a2.b((Activity) this.f9052a, a3, new a(jSONObject3));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
