package com.taobao.android.sku;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.hybrid.SkuWebView;
import com.taobao.android.sku.hybrid.a;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.cjz;
import tb.e2q;
import tb.g3q;
import tb.go2;
import tb.k3q;
import tb.m0u;
import tb.m9b;
import tb.my;
import tb.n3q;
import tb.nr0;
import tb.q2q;
import tb.q3q;
import tb.t2o;
import tb.to8;
import tb.vkb;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class H5Core extends my {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TOKEN_FROM_DOWNGRADE_SKUH5URL = "isFromDowngradeSkuH5Url";

    /* renamed from: a  reason: collision with root package name */
    public final Context f9422a;
    public final SkuCore b;
    public final AliXSkuCore c;
    public final nr0 d;
    public final AliXSkuPresenterEngine e;
    public String h;
    public volatile SkuWebView i;
    public ViewGroup j;
    public final m9b k;
    public volatile boolean l;
    public boolean n;
    public String o;
    public String f = "";
    public String g = "ADDCART_AND_BUYNOW";
    public final List<a.C0485a> m = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(H5Core h5Core) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Log.e("H5 SKU", "H5 SKU Container Clicked");
            }
        }
    }

    static {
        t2o.a(442499102);
    }

    public H5Core(SkuCore skuCore, AliXSkuCore aliXSkuCore, Context context, nr0 nr0Var, AliXSkuPresenterEngine aliXSkuPresenterEngine) {
        this.b = skuCore;
        this.c = aliXSkuCore;
        this.f9422a = context;
        if (context == null) {
            this.f9422a = q3q.b();
        }
        this.e = aliXSkuPresenterEngine;
        this.d = nr0Var;
        this.k = new m9b();
    }

    public static /* synthetic */ AliXSkuCore b(H5Core h5Core) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuCore) ipChange.ipc$dispatch("26207caf", new Object[]{h5Core});
        }
        return h5Core.c;
    }

    public static /* synthetic */ void c(H5Core h5Core, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43c2c16", new Object[]{h5Core, str, str2, str3});
        } else {
            h5Core.y(str, str2, str3);
        }
    }

    public static /* synthetic */ void d(H5Core h5Core, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc8366b", new Object[]{h5Core, str, str2});
        } else {
            h5Core.z(str, str2);
        }
    }

    public static /* synthetic */ String e(H5Core h5Core) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22fcd1ea", new Object[]{h5Core});
        }
        return h5Core.g;
    }

    public static /* synthetic */ String f(H5Core h5Core) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c51272b", new Object[]{h5Core});
        }
        return h5Core.f;
    }

    public static /* synthetic */ Object ipc$super(H5Core h5Core, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/H5Core");
    }

    public void A(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98de7839", new Object[]{this, jSONObject});
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f1544b", new Object[]{this});
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3596d0a8", new Object[]{this});
        } else {
            D(null);
        }
    }

    public void E(String str, AliXSkuCore.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18fd1572", new Object[]{this, str, hVar});
            return;
        }
        g();
        t();
        F();
        x(str);
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (hVar != null) {
            hVar.a();
        }
    }

    public final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa73f6e", new Object[]{this});
        } else if (!this.l) {
            g3q g3qVar = new g3q();
            g3qVar.b(this);
            a.C0485a aVar = new a.C0485a(g3qVar);
            ((ArrayList) this.m).add(aVar);
            com.taobao.android.sku.hybrid.a.b(aVar);
            this.l = true;
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6e531a", new Object[]{this});
        } else {
            g();
        }
    }

    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.my
    public String a(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa7d85e6", new Object[]{this, new Integer(i), map});
        }
        if (i == 7) {
            return new JSONObject() { // from class: com.taobao.android.sku.H5Core.2
                {
                    put("extInput", (Object) H5Core.b(H5Core.this).z().e());
                }
            }.toJSONString();
        }
        if (i != 10) {
            return null;
        }
        JSONObject n = this.c.z().n();
        if (n == null || n.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mtopStr", (Object) n.toJSONString());
        return jSONObject.toJSONString();
    }

    public final void g() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7e946", new Object[]{this});
            return;
        }
        this.f = this.d.i();
        this.h = this.d.h(this.c.t());
        if (cjz.a() && TextUtils.isEmpty(this.h)) {
            this.h = this.b.p();
        }
        JSONObject e = this.d.e();
        if (e != null && (jSONObject = e.getJSONObject("id_biz_bottom")) != null) {
            String string = jSONObject.getString("bottomMode");
            if (TextUtils.isEmpty(string)) {
                string = "ADDCART_AND_BUYNOW";
            }
            this.g = string;
        }
    }

    public final void h() {
        vkb w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d3aec4", new Object[]{this});
            return;
        }
        if (!this.n && (w = this.c.w()) != null) {
            w.a(p("CLOSE_BTN", null, null, null, null, null, null, null, null));
        }
        this.e.j();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.m).iterator();
        while (it.hasNext()) {
            com.taobao.android.sku.hybrid.a.c((a.C0485a) it.next());
        }
        if (this.i != null) {
            this.i.destroy();
            this.o = null;
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aade01dd", new Object[]{this});
            return;
        }
        String str = this.f;
        final String valueOf = String.valueOf(this.k.b);
        m9b m9bVar = this.k;
        final String str2 = m9bVar.f23862a;
        k3q k3qVar = new k3q(this.f9422a, new e2q(str, str2, valueOf, o(m9bVar.d), this.c.s()));
        k3qVar.b(new IRemoteBaseListener() { // from class: com.taobao.android.sku.H5Core.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    H5Core.c(H5Core.this, str2, valueOf, mtopResponse.getRetMsg());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    H5Core.d(H5Core.this, str2, valueOf);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    H5Core.c(H5Core.this, str2, valueOf, mtopResponse.getRetMsg());
                }
            }
        });
        k3qVar.a();
    }

    public final String n(Map<String, String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53f23238", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        JSONObject e = this.d.e();
        if (!(e == null || (jSONObject = e.getJSONObject("storedData")) == null || (jSONObject2 = jSONObject.getJSONObject("transparent_map")) == null || jSONObject2.isEmpty())) {
            hashMap.putAll(jSONObject2);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        JSONObject n = this.d.n();
        if (n != null) {
            try {
                JSONObject jSONObject3 = n.getJSONObject(DnsPreference.KEY_TRADE).getJSONObject("buyParam");
                if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                    hashMap.putAll(jSONObject3);
                }
            } catch (Throwable unused) {
            }
            try {
                String string = n.getJSONObject("delivery").getString("addressId");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put("addressId", string);
                }
            } catch (Throwable unused2) {
            }
        }
        return JSON.toJSONString(hashMap);
    }

    public final String o(Map<String, String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96b2efe", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        JSONObject e = this.d.e();
        if (!(e == null || (jSONObject = e.getJSONObject("storedData")) == null || (jSONObject2 = jSONObject.getJSONObject("transparent_map")) == null || jSONObject2.isEmpty())) {
            hashMap.putAll(jSONObject2);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        hashMap.put("serviceId", this.k.c);
        JSONObject n = this.d.n();
        if (n != null) {
            try {
                JSONObject jSONObject3 = n.getJSONObject(DnsPreference.KEY_TRADE).getJSONObject("cartParam");
                if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                    hashMap.putAll(jSONObject3);
                }
            } catch (Throwable unused) {
            }
            try {
                String string = n.getJSONObject("delivery").getString(q2q.KEY_AREA_ID);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put("divisionId", string);
                }
            } catch (Throwable unused2) {
            }
        }
        return JSON.toJSONString(hashMap);
    }

    @Override // tb.sqd
    public boolean onEvent(int i, Map<String, String> map) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f16fb528", new Object[]{this, new Integer(i), map})).booleanValue();
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                if (!TextUtils.isEmpty(this.g)) {
                    boolean equals = "ADDCART".equals(this.g);
                    z = "BUYNOW".equals(this.g);
                    z3 = equals;
                    if ("CONFIRM".equals(this.g)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    z = false;
                }
                HashMap hashMap = (HashMap) this.k.d;
                if (hashMap.containsKey("forceBuyNow")) {
                    try {
                        if (Boolean.parseBoolean((String) hashMap.get("forceBuyNow"))) {
                            z = true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (z) {
                    k();
                } else if (z3) {
                    j();
                } else if (z2) {
                    l();
                }
                h();
                return true;
            case 4:
                h();
                return true;
            case 5:
            case 6:
                if (map != null) {
                    this.k.c(map);
                    break;
                } else {
                    return false;
                }
            case 8:
                this.k.b();
                break;
            case 9:
                m();
                return true;
        }
        return true;
    }

    public final JSONObject p(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("18503273", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9});
        }
        return new JSONObject(str, str2, str3, str4, str5, str6, str7, str8, str9) { // from class: com.taobao.android.sku.H5Core.4
            public final /* synthetic */ String val$actionFrom;
            public final /* synthetic */ String val$addCartExParams;
            public final /* synthetic */ String val$bookingDate;
            public final /* synthetic */ String val$entranceDate;
            public final /* synthetic */ String val$exParams;
            public final /* synthetic */ String val$quantity;
            public final /* synthetic */ String val$serviceId;
            public final /* synthetic */ String val$skuId;
            public final /* synthetic */ String val$tgKey;

            {
                this.val$actionFrom = str;
                this.val$skuId = str2;
                this.val$quantity = str3;
                this.val$serviceId = str4;
                this.val$tgKey = str5;
                this.val$bookingDate = str6;
                this.val$entranceDate = str7;
                this.val$exParams = str8;
                this.val$addCartExParams = str9;
                put("actionFrom", (Object) (TextUtils.isEmpty(str) ? "NULL" : str));
                put("inputMode", (Object) H5Core.e(H5Core.this));
                put(go2.EVENT_TYPE, (Object) new JSONObject() { // from class: com.taobao.android.sku.H5Core.4.1
                    {
                        put("itemId", (Object) H5Core.f(H5Core.this));
                        put(q2q.KEY_SKU_ID, (Object) AnonymousClass4.this.val$skuId);
                        put("quantity", (Object) AnonymousClass4.this.val$quantity);
                        String str10 = "";
                        put("serviceId", (Object) (!TextUtils.isEmpty(AnonymousClass4.this.val$serviceId) ? AnonymousClass4.this.val$serviceId : str10));
                        put("tgKey", (Object) (!TextUtils.isEmpty(AnonymousClass4.this.val$tgKey) ? AnonymousClass4.this.val$tgKey : str10));
                        put("bookingDate", (Object) (!TextUtils.isEmpty(AnonymousClass4.this.val$bookingDate) ? AnonymousClass4.this.val$bookingDate : str10));
                        put("entranceDate", (Object) (!TextUtils.isEmpty(AnonymousClass4.this.val$entranceDate) ? AnonymousClass4.this.val$entranceDate : str10));
                        put("exParams", (Object) (!TextUtils.isEmpty(AnonymousClass4.this.val$exParams) ? AnonymousClass4.this.val$exParams : str10));
                    }
                });
                put(to8.ADD_CART, (Object) new JSONObject() { // from class: com.taobao.android.sku.H5Core.4.2
                    {
                        String str10;
                        put("itemId", (Object) H5Core.f(H5Core.this));
                        put(q2q.KEY_SKU_ID, (Object) AnonymousClass4.this.val$skuId);
                        put("quantity", (Object) AnonymousClass4.this.val$quantity);
                        if (!TextUtils.isEmpty(AnonymousClass4.this.val$addCartExParams)) {
                            str10 = AnonymousClass4.this.val$addCartExParams;
                        } else {
                            str10 = "";
                        }
                        put("exParams", (Object) str10);
                    }
                });
            }
        };
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758c77b", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
        } else {
            g();
        }
    }

    public void s(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5600888b", new Object[]{this, linearLayout});
        } else if (linearLayout != null) {
            this.j = linearLayout;
            linearLayout.setClickable(true);
            this.j.setBackgroundColor(-1);
            this.j.setOnClickListener(new a(this));
        }
    }

    public final synchronized void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407bf8f0", new Object[]{this});
            return;
        }
        if (this.i == null) {
            this.i = new SkuWebView(this.f9422a);
            ViewGroup viewGroup = this.j;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                View view = new View(this.f9422a);
                view.setBackgroundColor(-45055);
                this.j.addView(view, -1, 2);
                this.j.addView(this.i, -1, -1);
            }
        }
    }

    public final boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b309595e", new Object[]{this, str})).booleanValue();
        }
        if (str == null || !str.equals(this.o)) {
            return true;
        }
        return false;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("438cef4a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a611d2", new Object[]{this, str});
            return;
        }
        boolean u = u(str);
        boolean v = v(str);
        if ((!u || v) && this.i != null) {
            this.i.loadUrl(str);
            this.o = str;
        }
    }

    public void D(AliXSkuCore.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a21bc", new Object[]{this, hVar});
        } else if (!cjz.a() || !TextUtils.isEmpty(this.h)) {
            E(this.h, hVar);
        } else {
            SkuLogUtils.y(SkuLogUtils.UM_SKU2_FINAL_H5URL_EMPTY, "H5CoreFinalEmptyUrl");
            this.c.p();
            m0u.b(this.f9422a, "当前商品火爆，请稍后再试~", 1);
        }
    }

    public final void k() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671eb902", new Object[]{this});
            return;
        }
        String str2 = this.f;
        String valueOf = String.valueOf(this.k.b);
        m9b m9bVar = this.k;
        String str3 = m9bVar.f23862a;
        String str4 = m9bVar.c;
        String n = n(m9bVar.d);
        String str5 = (String) ((HashMap) this.k.d).get("tgKey");
        String str6 = (String) ((HashMap) this.k.d).get("bookingDate");
        String str7 = (String) ((HashMap) this.k.d).get("entranceDate");
        HashMap hashMap = new HashMap();
        hashMap.put(go2.EVENT_TYPE, "true");
        hashMap.put("itemId", str2);
        hashMap.put(q2q.KEY_SKU_ID, str3);
        hashMap.put("quantity", valueOf);
        hashMap.put("serviceId", str4);
        hashMap.put("tgKey", str5);
        hashMap.put("bookingDate", str6);
        hashMap.put("entranceDate", str7);
        hashMap.put("exParams", n);
        Bundle bundle = new Bundle();
        bundle.putInt("purchase_from", 2);
        bundle.putSerializable("buildOrderParams", hashMap);
        AliNavServiceInterface c = xq0.c();
        if (c != null) {
            c.a(this.f9422a).d(bundle).c("https://h5.m.taobao.com/awp/base/buy.htm?preBizName=taobao_sku");
        }
        this.n = true;
        vkb w = this.c.w();
        if (w != null) {
            if ("CONFIRM".equals(this.g)) {
                str = "CONFIRM_DISMISS";
            } else {
                str = "BUY_NOW";
            }
            w.a(p(str, str3, valueOf, str4, str5, str6, str7, n, null));
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840a1b5b", new Object[]{this});
        } else if (cjz.a()) {
            SkuLogUtils.y(SkuLogUtils.UM_SKU2_H52NATIVE, "H5CoreNothingDowngrade");
            m0u.b(this.f9422a, "当前商品火爆，请稍后再试~", 1);
            h();
        } else {
            this.b.I(TOKEN_FROM_DOWNGRADE_SKUH5URL);
            m0u.a(this.c.y(), "degradeSkuH5Url 降级至 native");
            SkuLogUtils.j("nativeMode", "degradeSkuH5Url 降级至 native");
            this.c.X(2, 1);
            this.c.V(-700008, "DegradeSkuH5UrlDowngrade");
        }
    }

    public final boolean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9ac0253", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(Uri.parse(str).getQueryParameter("sku_keep_alive"));
        } catch (Exception unused) {
            return false;
        }
    }

    public final void y(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0423dc4", new Object[]{this, str, str2, str3});
            return;
        }
        this.n = true;
        if (TextUtils.isEmpty(str3)) {
            str3 = "小二很忙，系统很累，请稍后重试!";
        }
        n3q.a(this.f9422a, 3, str3, "");
        vkb w = this.c.w();
        if (w != null) {
            w.a(p("ADD_CART_FAILED", str, str2, null, null, null, null, null, null));
        }
    }

    public final void z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b03e3c", new Object[]{this, str, str2});
            return;
        }
        this.n = true;
        n3q.a(this.f9422a, 2, "添加成功，在购物车等亲~", "");
        vkb w = this.c.w();
        if (w != null) {
            w.a(p("ADD_CART_SUCCESS", str, str2, null, null, null, null, null, null));
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f913f1bc", new Object[]{this});
            return;
        }
        String str = this.f;
        String valueOf = String.valueOf(this.k.b);
        m9b m9bVar = this.k;
        String str2 = m9bVar.f23862a;
        String str3 = m9bVar.c;
        String n = n(m9bVar.d);
        String o = o(this.k.d);
        String str4 = (String) ((HashMap) this.k.d).get("tgKey");
        String str5 = (String) ((HashMap) this.k.d).get("bookingDate");
        String str6 = (String) ((HashMap) this.k.d).get("entranceDate");
        HashMap hashMap = new HashMap();
        hashMap.put(go2.EVENT_TYPE, "true");
        hashMap.put("itemId", str);
        hashMap.put(q2q.KEY_SKU_ID, str2);
        hashMap.put("quantity", valueOf);
        hashMap.put("serviceId", str3);
        hashMap.put("tgKey", str4);
        hashMap.put("bookingDate", str5);
        hashMap.put("entranceDate", str6);
        hashMap.put("exParams", n);
        Bundle bundle = new Bundle();
        bundle.putInt("purchase_from", 2);
        bundle.putSerializable("buildOrderParams", hashMap);
        this.n = true;
        vkb w = this.c.w();
        if (w != null) {
            w.a(p("CONFIRM_DISMISS", str2, valueOf, str3, str4, str5, str6, n, o));
        }
    }
}
