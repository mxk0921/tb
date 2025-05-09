package com.taobao.android.sku;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.tao.TaoApplication;
import com.ut.share.utils.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.cjz;
import tb.m0u;
import tb.mb3;
import tb.mfb;
import tb.nr0;
import tb.o2q;
import tb.t2o;
import tb.xv6;
import tb.yo0;
import tb.yv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuCore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SKU_MODE_NATIVE = 1;
    public static final int SKU_MODE_WEB = 2;
    public static final int SKU_MODE_WEEX = 3;
    public static final int SKU_MODE_WEEX_SKU_V3 = 4;
    public static volatile boolean l = false;

    /* renamed from: a  reason: collision with root package name */
    public final JSCore f9426a;
    public final H5Core b;
    public final WeexCore c;
    public final WeexCore d;
    public final AliXSkuCore e;
    public final nr0 f;
    public final boolean i;
    public final boolean j;
    public int g = 1;
    public boolean h = true;
    public String k = "sku_native_mode";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements AliXSkuPresenterEngine.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.sku.presenter.AliXSkuPresenterEngine.b
        public boolean onBackPressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
            }
            int a2 = SkuCore.a(SkuCore.this);
            if (a2 == 3) {
                return SkuCore.b(SkuCore.this).F();
            }
            if (a2 != 4) {
                return false;
            }
            return SkuCore.c(SkuCore.this).F();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements AliXSkuPresenterEngine.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public JSONObject a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("30df8b9b", new Object[]{this});
            }
            SkuCore skuCore = SkuCore.this;
            final String f = SkuCore.f(skuCore, SkuCore.d(skuCore), SkuCore.e(SkuCore.this));
            return new JSONObject(f) { // from class: com.taobao.android.sku.SkuCore$2$1
                public final /* synthetic */ String val$skuPageUrl;

                {
                    this.val$skuPageUrl = f;
                    put("url", (Object) f);
                }
            };
        }
    }

    static {
        t2o.a(442499117);
    }

    public static /* synthetic */ int a(SkuCore skuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42d3a422", new Object[]{skuCore})).intValue();
        }
        return skuCore.g;
    }

    public static /* synthetic */ WeexCore b(SkuCore skuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCore) ipChange.ipc$dispatch("3fd419dc", new Object[]{skuCore});
        }
        return skuCore.c;
    }

    public static /* synthetic */ WeexCore c(SkuCore skuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCore) ipChange.ipc$dispatch("22ffcd1d", new Object[]{skuCore});
        }
        return skuCore.d;
    }

    public static /* synthetic */ nr0 d(SkuCore skuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nr0) ipChange.ipc$dispatch("327bbfd4", new Object[]{skuCore});
        }
        return skuCore.f;
    }

    public static /* synthetic */ boolean e(SkuCore skuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66d78137", new Object[]{skuCore})).booleanValue();
        }
        return skuCore.h;
    }

    public static /* synthetic */ String f(SkuCore skuCore, nr0 nr0Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3350754a", new Object[]{skuCore, nr0Var, new Boolean(z)});
        }
        return skuCore.O(nr0Var, z);
    }

    public static /* synthetic */ String g(SkuCore skuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39b1458b", new Object[]{skuCore});
        }
        return skuCore.q();
    }

    public static /* synthetic */ void h(SkuCore skuCore, String str, AliXSkuCore.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("217a843", new Object[]{skuCore, str, hVar});
        } else {
            skuCore.J(str, hVar);
        }
    }

    public static /* synthetic */ AliXSkuCore i(SkuCore skuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuCore) ipChange.ipc$dispatch("e3eb5151", new Object[]{skuCore});
        }
        return skuCore.e;
    }

    public static /* synthetic */ String j(SkuCore skuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d543e28", new Object[]{skuCore});
        }
        return skuCore.k;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66ec3e7", new Object[]{this});
            return;
        }
        int i = this.g;
        if (i == 2) {
            this.b.m();
        } else if (i == 3) {
            this.c.p("TEST", "");
            this.e.V(-700003, "sku前端主动降级");
        } else if (i != 4) {
            m0u.a(this.e.y(), "当前已经是Native模式，无法降级");
        } else {
            this.d.p("TEST", "");
            this.e.V(-700004, "sku前端主动降级");
        }
    }

    public void B(nr0 nr0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1ad3b1", new Object[]{this, nr0Var});
        } else {
            G(r(nr0Var, this.h));
        }
    }

    public void C(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98de7839", new Object[]{this, jSONObject});
            return;
        }
        int i = this.g;
        if (i == 2) {
            this.b.A(jSONObject);
        } else if (i == 3) {
            this.c.G(jSONObject);
        } else if (i == 4) {
            this.d.G(jSONObject);
        } else if (cjz.a()) {
            SkuLogUtils.x("SkuCore.onReceiveNextPageData");
        } else {
            this.f9426a.i(jSONObject);
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f1544b", new Object[]{this});
            return;
        }
        int i = this.g;
        if (i == 2) {
            this.b.B();
        } else if (i == 3) {
            this.c.H();
        } else if (i == 4) {
            this.d.H();
        } else if (cjz.a()) {
            SkuLogUtils.x("SkuCore.onSkuPanelDismiss");
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d42c4", new Object[]{this});
            return;
        }
        SkuLogUtils.i("Touchdown check before preShowSku mSkuMode:" + this.g);
        if (this.g == 3) {
            this.c.J(this.h);
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e89b1f", new Object[]{this});
            return;
        }
        try {
            ((com.taobao.android.sku.presenter.a) this.e.I().n()).D(new View.OnClickListener() { // from class: com.taobao.android.sku.SkuCore.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        SkuCore.this.A();
                    }
                }
            });
        } catch (Throwable th) {
            SkuLogUtils.i(th.toString());
        }
    }

    public void H(final String str, String str2, a.h hVar, final AliXSkuCore.h hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fa09c9", new Object[]{this, str, str2, hVar, hVar2});
            return;
        }
        boolean z = this.h;
        this.h = false;
        t();
        int i = this.g;
        float f = 0.9f;
        if (i == 2) {
            this.b.D(hVar2);
            SkuLogUtils.p(false);
            SkuLogUtils.o(false);
        } else if (i == 3) {
            if (this.c.D()) {
                f = 1.0f;
            }
            this.c.Q(z, str, str2, hVar, hVar2);
            SkuLogUtils.p(true);
            SkuLogUtils.o(false);
        } else if (i == 4) {
            if (this.d.D()) {
                f = 1.0f;
            }
            this.d.Q(z, str, str2, hVar, hVar2);
            SkuLogUtils.p(false);
            SkuLogUtils.o(true);
        } else if (cjz.a()) {
            SkuLogUtils.x("SkuCore.showSku");
            G(2);
            H(str, str2, hVar, hVar2);
            return;
        } else {
            this.f9426a.k(str, str2, hVar, new AliXSkuCore.h() { // from class: com.taobao.android.sku.SkuCore.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.AliXSkuCore.h
                public void a() {
                    boolean z2 = false;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fa861863", new Object[]{this});
                        return;
                    }
                    String g = SkuCore.g(SkuCore.this);
                    if (TextUtils.isEmpty(g)) {
                        g = SkuCore.this.p();
                        z2 = true;
                    }
                    String str3 = "degradeSkuH5Url";
                    if (TextUtils.isEmpty(g) || H5Core.TOKEN_FROM_DOWNGRADE_SKUH5URL.equals(str)) {
                        AliXSkuCore.h hVar3 = hVar2;
                        if (hVar3 != null) {
                            hVar3.a();
                        }
                        JSONObject E = SkuCore.i(SkuCore.this).E();
                        if (E != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("item_id", SkuCore.i(SkuCore.this).B());
                            hashMap.put("reason", SkuCore.j(SkuCore.this));
                            if ("sku_native_mode".equals(SkuCore.j(SkuCore.this))) {
                                JSONObject jSONObject = E.getJSONObject("skuCore");
                                JSONObject jSONObject2 = E.getJSONObject("item");
                                JSONObject jSONObject3 = E.getJSONObject(DnsPreference.KEY_TRADE);
                                hashMap.put("skuCore", JSON.toJSONString(jSONObject));
                                hashMap.put("item", JSON.toJSONString(jSONObject2));
                                hashMap.put("containSkuV3Data", JSON.toJSONString(Boolean.valueOf(E.containsKey("skuV3Data"))));
                                hashMap.put("containNewBuyData", JSON.toJSONString(Boolean.valueOf(E.containsKey("newBuyData"))));
                                hashMap.put(str3, SkuCore.d(SkuCore.this).d());
                                hashMap.put("isFirstShow", String.valueOf(SkuCore.e(SkuCore.this)));
                                hashMap.put("isNewBuyBroken", String.valueOf(SkuCore.b(SkuCore.this).C()));
                                hashMap.put("isSkuV3Broken", String.valueOf(SkuCore.c(SkuCore.this).C()));
                                hashMap.put("utParams", String.valueOf(SkuCore.i(SkuCore.this).M()));
                                if (jSONObject3 != null) {
                                    hashMap.put(Constants.WEIBO_REDIRECTURL_KEY, jSONObject3.getString(Constants.WEIBO_REDIRECTURL_KEY));
                                }
                                if (jSONObject == null || jSONObject.isEmpty() || jSONObject2 == null || jSONObject2.isEmpty()) {
                                    SkuLogUtils.k("Open_Sku_Native originalData:" + JSON.toJSONString(E));
                                }
                                SkuLogUtils.k("Open_Sku_Native utArgs:" + JSON.toJSONString(hashMap));
                            }
                            SkuLogUtils.d(19999, "Open_Sku_Native", hashMap);
                            return;
                        }
                        return;
                    }
                    SkuCore.h(SkuCore.this, g, hVar2);
                    if (z2) {
                        SkuLogUtils.d(19999, "Open_DegradeSkuH5Url", new HashMap<String, String>() { // from class: com.taobao.android.sku.SkuCore.4.1
                            {
                                put("id", SkuCore.i(SkuCore.this).B());
                            }
                        });
                        SkuCore.i(SkuCore.this).V(-700007, "SKUShowDegradeSkuH5Url");
                    }
                    if (!z2) {
                        str3 = "skuH5Url";
                    }
                    String concat = "native 跳转至 ".concat(str3);
                    m0u.a(SkuCore.i(SkuCore.this).y(), concat);
                    SkuLogUtils.j("webMode", concat);
                }
            });
            SkuLogUtils.p(false);
            SkuLogUtils.o(false);
        }
        k(f, false);
        if (xv6.b()) {
            F();
        }
    }

    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac206471", new Object[]{this, str});
            return;
        }
        G(1);
        this.k = "h5_downgrade";
        t();
        H(str, null, null, null);
    }

    public final void J(String str, AliXSkuCore.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8e7b28", new Object[]{this, str, hVar});
            return;
        }
        G(2);
        t();
        this.b.E(str, hVar);
    }

    public void K(String str, String str2, a.h hVar, AliXSkuCore.h hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7c6b594", new Object[]{this, str, str2, hVar, hVar2});
            return;
        }
        G(4);
        t();
        H(str, str2, hVar, hVar2);
    }

    public void N(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a89f92a", new Object[]{this, str, str2});
            return;
        }
        SkuLogUtils.k("onUpdateDetail SkuCore.updateDataWithError errorMsg:" + str2);
        this.c.U(str2);
        this.d.U(str2);
    }

    public final String O(nr0 nr0Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a47abe", new Object[]{this, nr0Var, new Boolean(z)});
        }
        int r = r(nr0Var, z);
        if (r == 2) {
            return this.b.H();
        }
        if (r == 3) {
            return this.c.V();
        }
        if (r != 4) {
            return "";
        }
        return this.d.V();
    }

    public void P(String str, String str2, a.h hVar, AliXSkuCore.h hVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff074ec6", new Object[]{this, str, str2, hVar, hVar2});
            return;
        }
        G(2);
        t();
        H(str, str2, hVar, hVar2);
    }

    public final void k(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("194124cc", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        try {
            ((com.taobao.android.sku.presenter.a) this.e.I().n()).o(f, z);
        } catch (Throwable th) {
            SkuLogUtils.i(th.toString());
        }
    }

    public Map l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2cd42203", new Object[]{this, str});
        }
        JSONObject u = this.f.u();
        if (u == null) {
            return new HashMap<String, String>(str) { // from class: com.taobao.android.sku.SkuCore.5
                public final /* synthetic */ String val$skuType;

                {
                    this.val$skuType = str;
                    put("skuType", str);
                }
            };
        }
        u.put("skuType", (Object) str);
        return u.getInnerMap();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa47067", new Object[]{this});
        } else {
            this.f.a();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b.i();
        this.c.o();
        this.d.o();
        if (cjz.b()) {
            this.f9426a.d();
        }
    }

    public String o() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9df6315", new Object[]{this});
        }
        JSONObject e = this.f.e();
        if (!(e == null || (jSONObject = e.getJSONObject("id_biz_bottom")) == null)) {
            String string = jSONObject.getString("bottomMode");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return "ADDCART_AND_BUYNOW";
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c473df4", new Object[]{this});
        }
        nr0 nr0Var = this.f;
        if (nr0Var == null) {
            return "";
        }
        String d = nr0Var.d();
        if (cjz.a() && TextUtils.isEmpty(d)) {
            SkuLogUtils.y(SkuLogUtils.UM_SKU2_DOWNGRADEH5URL_EMPTY, "DegradeH5UrlEmpty");
            if (o2q.c("enable_downgrade_sku_h5_url_prefix")) {
                String b2 = o2q.b("downgrade_sku_h5_url_prefix", "https://web.m.taobao.com/app/detail-project/sku2H5/home");
                if (!TextUtils.isEmpty(this.e.B())) {
                    Uri.Builder buildUpon = Uri.parse(b2).buildUpon();
                    buildUpon.appendQueryParameter("id", this.e.B());
                    d = buildUpon.toString();
                } else {
                    SkuLogUtils.y(SkuLogUtils.UM_SKU2_ITEM_ID_EMPTY, "DegradeItemIdEmpty");
                }
            }
        }
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        Uri.Builder buildUpon2 = Uri.parse(d).buildUpon();
        buildUpon2.appendQueryParameter("bottom_mode", o());
        buildUpon2.appendQueryParameter("ttid", TaoApplication.getTTID());
        return buildUpon2.build().toString();
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9e33711", new Object[]{this});
        }
        JSONObject l2 = this.f.l();
        if (l2 == null) {
            return "";
        }
        if (mb3.a(this.e.t())) {
            if (!l2.getBooleanValue("optionalDowngrade")) {
                return "";
            }
            String string = l2.getString("optionalUrl");
            return TextUtils.isEmpty(string) ? this.f.h(this.e.t()) : string;
        } else if (!l2.getBooleanValue("downgrade")) {
            return "";
        } else {
            String string2 = l2.getString("url");
            return TextUtils.isEmpty(string2) ? this.f.g() : string2;
        }
    }

    public final int r(nr0 nr0Var, boolean z) {
        int i = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d0f1746", new Object[]{this, nr0Var, new Boolean(z)})).intValue();
        }
        String x = nr0Var.x();
        String s = nr0Var.s();
        boolean equalsIgnoreCase = "BUYNOW".equalsIgnoreCase(o());
        if (TextUtils.isEmpty(x) || !this.i || !equalsIgnoreCase || this.c.C()) {
            if (!TextUtils.isEmpty(s) && this.j && ((!equalsIgnoreCase || WeexCore.q(x, s)) && !this.d.C())) {
                i = 4;
            } else if ((TextUtils.isEmpty(nr0Var.h(this.e.t())) || this.b.w()) && !cjz.a()) {
                if (!cjz.b()) {
                    SkuLogUtils.x("SkuCore.getSkuMode");
                }
                i = 1;
            } else {
                i = 2;
            }
        }
        if (!cjz.b() || !z || i != 2) {
            return i;
        }
        return 1;
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b89b787f", new Object[]{this});
            return;
        }
        if (cjz.b()) {
            this.f9426a.e();
        }
        this.b.q();
        this.c.w();
        this.d.w();
    }

    public void v(nr0 nr0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e34c0f1", new Object[]{this, nr0Var});
            return;
        }
        G(r(nr0Var, this.h));
        this.b.r();
        this.c.x();
        this.d.x();
    }

    public void w(nr0 nr0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ed45cf", new Object[]{this, nr0Var});
            return;
        }
        G(r(nr0Var, this.h));
        if (cjz.b()) {
            this.f9426a.f(nr0Var.w(), nr0Var.v(), nr0Var.k(), nr0Var.j());
        }
    }

    public final void x(AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c8ba23", new Object[]{this, aliXSkuPresenterEngine});
            return;
        }
        aliXSkuPresenterEngine.y(new a());
        aliXSkuPresenterEngine.B(new b());
    }

    public void y(AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f2461d2", new Object[]{this, aliXSkuPresenterEngine});
            return;
        }
        mfb n = aliXSkuPresenterEngine.n();
        if (n instanceof yv) {
            if (cjz.b()) {
                this.f9426a.g(((yv) n).f());
            }
            yv yvVar = (yv) n;
            this.b.s(yvVar.e());
            this.c.z(yvVar.h());
            this.d.z(yvVar.g());
        }
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("229949a8", new Object[]{this})).booleanValue();
        }
        AliConfigInterface b2 = yo0.b();
        if (b2 != null) {
            return Boolean.parseBoolean(b2.getConfig("android_sku", "is_newbuy_open", "true"));
        }
        return false;
    }

    public final boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("179f1bb3", new Object[]{this})).booleanValue();
        }
        AliConfigInterface b2 = yo0.b();
        if (b2 != null) {
            return Boolean.parseBoolean(b2.getConfig("android_sku", "is_sku3_open", "true"));
        }
        return false;
    }

    public final void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94c347e", new Object[]{this, new Integer(i)});
        } else if (i == 2) {
            SkuLogUtils.j("webMode", "enter webview mode");
            if (this.b.w()) {
                if (cjz.a()) {
                    SkuLogUtils.y(SkuLogUtils.UM_SKU2_H5_BROKEN, "H5CoreBroken");
                    SkuLogUtils.j("webMode", "webview is broken,maybe need to switch to downgradeSkuH5Url");
                } else {
                    this.k = "h5_broken";
                    SkuLogUtils.j("webMode", "webview is broken, now switch to native");
                    i = 1;
                }
            }
            this.g = i;
        } else if (i != 3) {
            if (i != 4) {
                SkuLogUtils.j("nativeMode", "enter native mode");
                if (cjz.a()) {
                    SkuLogUtils.x("SkuCore.setSkuMode");
                }
            } else {
                SkuLogUtils.j("weexMode", "enter sku3.0 mode");
                if (this.d.C()) {
                    if (cjz.a()) {
                        SkuLogUtils.j("weexMode", "sku3.0 is broken, now switch to web");
                        i = 2;
                    } else {
                        this.k = "skuV3_broken";
                        SkuLogUtils.j("weexMode", "sku3.0 is broken, now switch to native");
                    }
                }
                this.g = i;
            }
            i = 1;
            this.g = i;
        } else {
            SkuLogUtils.j("weexMode", "enter newbuy mode");
            if (this.c.C()) {
                if (cjz.a()) {
                    SkuLogUtils.j("weexMode", "newbuy is broken, now switch to web");
                    i = 2;
                } else {
                    this.k = "newbuy_broken";
                    SkuLogUtils.j("weexMode", "newbuy is broken, now switch to native");
                    i = 1;
                }
            }
            this.g = i;
        }
    }

    public void L(int i, String str, String str2, a.h hVar, AliXSkuCore.h hVar2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb3fe508", new Object[]{this, new Integer(i), str, str2, hVar, hVar2});
            return;
        }
        G(1);
        if (i == 3) {
            str3 = "newbuy";
        } else {
            str3 = "skuV3";
        }
        this.k = str3.concat("_downgrade");
        if (i == 3) {
            this.c.w();
        } else {
            this.d.w();
        }
        t();
        H(str, str2, hVar, hVar2);
    }

    public String s(nr0 nr0Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60bab567", new Object[]{this, nr0Var, new Boolean(z)});
        }
        int r = r(nr0Var, z);
        if (r == 2) {
            return "web";
        }
        if (r == 3) {
            return "newbuy";
        }
        if (r == 4) {
            return SkuLogUtils.TYPE_SKU_V3;
        }
        if (!cjz.a()) {
            return "native";
        }
        SkuLogUtils.x("SkuCore.getSkuTypeValue");
        return "native";
    }

    public SkuCore(AliXSkuCore aliXSkuCore, Context context, com.alibaba.android.ultron.vfw.instance.a aVar, nr0 nr0Var, AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        this.e = aliXSkuCore;
        if (cjz.b()) {
            this.f9426a = new JSCore(this, aliXSkuCore, aVar, nr0Var);
        }
        this.b = new H5Core(this, aliXSkuCore, context, nr0Var, aliXSkuPresenterEngine);
        this.c = new WeexCore(this, aliXSkuCore, context, nr0Var, aliXSkuPresenterEngine, 3);
        this.d = new WeexCore(this, aliXSkuCore, context, nr0Var, aliXSkuPresenterEngine, 4);
        this.f = nr0Var;
        this.i = u();
        this.j = z();
        xv6.a(context);
        x(aliXSkuPresenterEngine);
    }

    public void M(String str, nr0 nr0Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf94006", new Object[]{this, str, nr0Var, new Boolean(z)});
            return;
        }
        int i = this.g;
        G(r(nr0Var, this.h));
        boolean z2 = i != this.g;
        boolean z3 = !this.c.E() || z2;
        boolean z4 = !this.d.E() || z2;
        SkuLogUtils.k("onUpdateDetail SkuCore.updateData needDestroyBeforeUpdate:" + z3 + " keepAlive:" + z);
        if (cjz.b()) {
            this.f9426a.l(str);
        }
        this.b.G();
        if (z3) {
            this.c.o();
        }
        if (z4) {
            this.d.o();
        }
        this.c.T(z);
        this.d.T(z);
        if (!o2q.c("enableWeexSilentTraverseOpt") || this.e.I().o() || !this.e.q()) {
            t();
            int i2 = this.g;
            float f = 0.9f;
            if (i2 == 2) {
                this.b.C();
                SkuLogUtils.p(false);
                SkuLogUtils.o(false);
            } else if (i2 == 3) {
                if (this.c.D()) {
                    f = 1.0f;
                }
                if (z3) {
                    this.c.S();
                } else {
                    this.c.R();
                }
                SkuLogUtils.p(true);
                SkuLogUtils.o(false);
            } else if (i2 != 4) {
                if (cjz.b()) {
                    this.f9426a.j();
                }
                SkuLogUtils.p(false);
                SkuLogUtils.o(false);
            } else {
                if (this.d.D()) {
                    f = 1.0f;
                }
                if (z4) {
                    this.d.S();
                } else {
                    this.d.R();
                }
                SkuLogUtils.p(false);
                SkuLogUtils.o(true);
            }
            k(f, false);
            if (z2) {
                this.e.r();
            }
        }
    }
}
