package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Delivery;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import java.util.HashMap;
import java.util.Map;
import tb.hjh;
import tb.hq9;
import tb.ir;
import tb.q2q;
import tb.t2o;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OpenAddressImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openAddress";
    public static final String EVENT_TYPE_ALTERNATIVE = "open_area_chooser";
    public static final String EVENT_TYPE_ALTERNATIVE_BACK_UP = "show_address";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6816a;

    static {
        t2o.a(912261887);
        t2o.a(912261826);
    }

    public OpenAddressImplementor(Context context, ze7 ze7Var) {
        this.f6816a = ze7Var;
    }

    public final String b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1c1bc2f", new Object[]{this, str, map});
        }
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.build().toString();
    }

    public final JSONObject c(ir irVar) {
        String str;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("34ae7c45", new Object[]{this, irVar});
        }
        String encode = Uri.encode(DataUtils.K((Delivery) this.f6816a.e().f(Delivery.class), ""));
        Seller seller = (Seller) this.f6816a.e().f(Seller.class);
        String w = DataUtils.w((Item) this.f6816a.e().f(Item.class), "");
        if (DataUtils.e0(seller)) {
            str = hq9.TMALL;
        } else {
            str = "taobao";
        }
        String E = DataUtils.E(seller, "");
        String l = DataUtils.l((Delivery) this.f6816a.e().f(Delivery.class), "");
        JSONObject a2 = irVar.a();
        if (a2 != null) {
            jSONObject = JSON.parseObject(a2.toJSONString());
        } else {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("itemId", (Object) w);
        jSONObject2.put("itemType", (Object) str);
        jSONObject2.put("sellerId", (Object) E);
        jSONObject2.put(q2q.KEY_AREA_ID, (Object) l);
        jSONObject2.put("sku_token", (Object) this.f6816a.i().b());
        jSONObject2.put("loadUrl", (Object) Uri.encode(g("//market.m.taobao.com/apps/market/detailrax/address-picker.html?spm=a2116h.app.0.0.16d957e9nDYOzv&wh_weex=true", encode)));
        jSONObject.put("queryParams", (Object) jSONObject2);
        jSONObject.put("pageType", (Object) "Native");
        jSONObject.put("url", (Object) e());
        return jSONObject;
    }

    public final JSONObject d(ir irVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2da5ce3c", new Object[]{this, irVar});
        }
        String w = DataUtils.w((Item) this.f6816a.e().f(Item.class), "");
        String l = DataUtils.l((Delivery) this.f6816a.e().f(Delivery.class), "");
        JSONObject a2 = irVar.a();
        if (a2 != null) {
            jSONObject = JSON.parseObject(a2.toJSONString());
        } else {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("targetItemId", (Object) w);
        jSONObject2.put("originalItemId", (Object) w);
        jSONObject2.put(q2q.KEY_AREA_ID, (Object) l);
        jSONObject2.put("token", (Object) this.f6816a.i().b());
        jSONObject.put("queryParams", (Object) jSONObject2);
        return jSONObject;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e972ca6d", new Object[]{this});
        }
        return "https://arealocation.taobao.com/home.htm";
    }

    public final Map<String, String> f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d3a7da2", new Object[]{this, str, str2});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("currentAddress", str2);
        HashMap hashMap2 = new HashMap();
        String w = DataUtils.w((Item) this.f6816a.e().f(Item.class), "");
        hashMap.put("item_id", w);
        hashMap2.put("itemId", w);
        String E = DataUtils.E((Seller) this.f6816a.e().f(Seller.class), "");
        hashMap.put("seller_id", E);
        hashMap2.put("sellerId", E);
        hashMap2.put(q2q.KEY_AREA_ID, DataUtils.l((Delivery) this.f6816a.e().f(Delivery.class), ""));
        if (DataUtils.g0((SkuCore) this.f6816a.e().f(SkuCore.class))) {
            hashMap2.put("itemType", "taobao");
        } else {
            hashMap2.put("itemType", hq9.TMALL);
        }
        hashMap2.put("loadUrl", b(str, hashMap));
        hashMap2.put("sku_token", this.f6816a.i().b());
        return hashMap2;
    }

    public final String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df7d9cd2", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String h = h();
        if (TextUtils.isEmpty(h)) {
            h = str;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return (h + "&currentAddress=" + str2) + "&item_id=" + DataUtils.w((Item) this.f6816a.e().f(Item.class), "") + "&seller_id=" + DataUtils.E((Seller) this.f6816a.e().f(Seller.class), "");
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d62fe44", new Object[]{this});
        }
        Delivery delivery = (Delivery) this.f6816a.e().f(Delivery.class);
        if (delivery != null) {
            return delivery.getAddressWeexUrl();
        }
        return null;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        if (!hjh.c()) {
            hjh.d(true);
            return true;
        }
        if (TextUtils.equals(EVENT_TYPE, irVar.b())) {
            if (i(irVar)) {
                jSONObject = d(irVar);
            } else {
                jSONObject = c(irVar);
            }
            this.f6816a.b().h(new ir(new JSONObject(jSONObject) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor.1
                public final /* synthetic */ JSONObject val$openUrlFields;

                {
                    this.val$openUrlFields = jSONObject;
                    put("type", "openUrl");
                    put("fields", (Object) jSONObject);
                }
            }), runtimeAbilityParamArr);
        } else if (TextUtils.equals(EVENT_TYPE_ALTERNATIVE_BACK_UP, irVar.b())) {
            this.f6816a.b().h(new ir(new JSONObject(c(irVar)) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor.2
                public final /* synthetic */ JSONObject val$openUrlFields;

                {
                    this.val$openUrlFields = r3;
                    put("type", "openUrl");
                    put("fields", (Object) r3);
                }
            }), runtimeAbilityParamArr);
        } else {
            String encode = Uri.encode(DataUtils.K((Delivery) this.f6816a.e().f(Delivery.class), ""));
            String h = h();
            if (TextUtils.isEmpty(h)) {
                h = "//market.m.taobao.com/apps/market/detailrax/address-picker.html?spm=a2116h.app.0.0.16d957e9nDYOzv&wh_weex=true";
            }
            final String b = b(e(), f(h, encode));
            this.f6816a.b().h(new ir(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor.3
                {
                    put("type", "openUrl");
                    put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenAddressImplementor.3.1
                        {
                            put("url", (Object) b);
                        }
                    });
                }
            }), runtimeAbilityParamArr);
        }
        UtUtils.e(EVENT_TYPE, this.f6816a);
        return true;
    }

    public final boolean i(ir irVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c70115ea", new Object[]{this, irVar})).booleanValue();
        }
        JSONObject a2 = irVar.a();
        return a2 != null && !TextUtils.isEmpty(a2.getString("url"));
    }
}
