package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Rate;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.SkuBase;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ein {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(354418768);
    }

    public static JSONObject a(Item item) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("faa7b760", new Object[]{item});
        }
        JSONObject jSONObject = new JSONObject();
        if (item != null) {
            String itemId = item.getItemId();
            String title = item.getTitle();
            String firstImageUrl = item.getFirstImageUrl();
            if (TextUtils.isEmpty(itemId)) {
                itemId = "";
            }
            jSONObject.put("itemId", (Object) itemId);
            if (TextUtils.isEmpty(title)) {
                title = "";
            }
            jSONObject.put("title", (Object) title);
            if (TextUtils.isEmpty(firstImageUrl)) {
                firstImageUrl = "";
            }
            jSONObject.put("image", (Object) firstImageUrl);
            jSONObject.put("exParams", (Object) item.getExParams());
        }
        return jSONObject;
    }

    public static boolean b(JSONObject jSONObject) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8423dfd4", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            z = false;
        } else {
            z = jSONObject.getBooleanValue("enableRateFloat");
        }
        if (!z || !vbl.k0()) {
            return false;
        }
        return true;
    }

    public static JSONObject c(dhn dhnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7857fcbc", new Object[]{dhnVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(RateInfoV2.KEY_OPEN_MODE, (Object) dhnVar.l());
        jSONObject.put(RateInfoV2.KEY_CLICK_TIME_MS, (Object) Long.valueOf(dhnVar.c()));
        jSONObject.put(RateInfoV2.KEY_NAV_TIME_MS, (Object) Long.valueOf(System.currentTimeMillis()));
        return jSONObject;
    }

    public static JSONObject d(ir irVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d62e130", new Object[]{irVar});
        }
        if (irVar == null || (a2 = irVar.a()) == null || a2.isEmpty()) {
            return null;
        }
        return a2;
    }

    public static JSONObject f(RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5d1a5c81", new Object[]{runtimeAbilityParamArr});
        }
        oa4 i = yc4.i(runtimeAbilityParamArr);
        if (i == null || (f = i.getComponentData().f()) == null) {
            return null;
        }
        return f;
    }

    public static String g(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecdb05e5", new Object[]{objArr});
        }
        if (objArr == null || objArr.length < 1) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(JSON.toJSONString(objArr[0]));
            if (parseObject != null) {
                return parseObject.getString("feedId");
            }
            return null;
        } catch (Exception e) {
            tgh.c("RateUtils", "getFeedId exception", e);
            return null;
        }
    }

    public static JSONObject h(dhn dhnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26fc192a", new Object[]{dhnVar});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject e = dhnVar.e();
        if (e != null) {
            jSONObject.putAll(e);
        }
        jSONObject.put("jutrack_Ab", (Object) "true");
        return jSONObject;
    }

    public static Rate.Keywords i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rate.Keywords) ipChange.ipc$dispatch("18541cb9", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return Rate.Keywords.a(jSONObject);
    }

    public static JSONArray j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("57eb0b3", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONArray("keywords");
    }

    public static JSONObject k(ze7 ze7Var) {
        jns jnsVar;
        Vertical.a askAll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("31833990", new Object[]{ze7Var});
        }
        if (ze7Var == null || (jnsVar = (jns) ze7Var.e().e(kns.PARSER_ID)) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Item item = (Item) jnsVar.t(Item.class);
        Seller seller = (Seller) jnsVar.t(Seller.class);
        jSONObject.put("itemId", (Object) DataUtils.w(item, ""));
        jSONObject.put("sellerId", (Object) DataUtils.E(seller, ""));
        jSONObject.put("shopId", (Object) DataUtils.G(seller, ""));
        jSONObject.put("commentCount", (Object) (DataUtils.o(item, 0L) + ""));
        jSONObject.put("itemInfo", (Object) a(item));
        jSONObject.put("skuInfo", (Object) DataUtils.I((SkuBase) jnsVar.t(SkuBase.class), new JSONObject()));
        Vertical vertical = (Vertical) jnsVar.t(Vertical.class);
        if (!(vertical == null || (askAll = vertical.getAskAll()) == null)) {
            jSONObject.put("askInfo", (Object) DataUtils.m(askAll));
        }
        return jSONObject;
    }

    public static List<Rate.Keywords> l(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8f105e08", new Object[]{objArr});
        }
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[1];
        if (!(obj instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        try {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    arrayList.add(Rate.Keywords.a(jSONObject));
                }
            }
        } catch (Exception e) {
            tgh.c("RateUtils", "getMultiLevelKeywords() exception", e);
        }
        return arrayList;
    }

    public static JSONObject m(Rate rate, dhn dhnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("18b6701b", new Object[]{rate, dhnVar});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject z = DataUtils.z(rate);
        if (z != null) {
            jSONObject.putAll(z);
        }
        JSONObject d = dhnVar.d();
        if (d != null) {
            jSONObject.putAll(d);
        }
        return jSONObject;
    }

    public static egn n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egn) ipChange.ipc$dispatch("cd7a00ff", new Object[]{jSONObject});
        }
        egn egnVar = new egn();
        egnVar.h(jSONObject);
        return egnVar;
    }

    public static egn o(ze7 ze7Var, dhn dhnVar) {
        Item item;
        Seller seller;
        Rate rate;
        Vertical.a askAll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egn) ipChange.ipc$dispatch("23beaf37", new Object[]{ze7Var, dhnVar});
        }
        egn egnVar = new egn();
        jns jnsVar = (jns) ze7Var.e().e(kns.PARSER_ID);
        String str = null;
        if (jnsVar != null) {
            item = (Item) jnsVar.t(Item.class);
        } else {
            item = null;
        }
        if (jnsVar != null) {
            seller = (Seller) jnsVar.t(Seller.class);
        } else {
            seller = null;
        }
        if (jnsVar != null) {
            rate = (Rate) jnsVar.t(Rate.class);
        } else {
            rate = null;
        }
        String str2 = "";
        RateInfo.a W = new RateInfo.a().Y(DataUtils.G(seller, str2)).X(str2 + DataUtils.H(seller)).D(str2 + DataUtils.o(item, 0L)).W(DataUtils.E(seller, str2));
        if (vbl.V()) {
            W.L(DataUtils.y(jnsVar, str2));
        } else {
            W.L(DataUtils.w(item, str2));
        }
        W.H(dhnVar.f());
        W.K(dhnVar.g());
        W.a0(dhnVar.o());
        W.J(DataUtils.s(item, str2));
        W.Z(DataUtils.I((SkuBase) ze7Var.e().f(SkuBase.class), new JSONObject()));
        W.M(a(item));
        W.F(h(dhnVar));
        Vertical vertical = (Vertical) ze7Var.e().f(Vertical.class);
        if (!(vertical == null || (askAll = vertical.getAskAll()) == null)) {
            W.P(DataUtils.m(askAll));
        }
        List<Rate.Keywords> k = dhnVar.k();
        if (k == null || k.isEmpty()) {
            if (vbl.a0()) {
                k = DataUtils.A(rate, new ArrayList());
            } else {
                k = null;
            }
        }
        if (dhnVar.p() && (k == null || k.isEmpty())) {
            k = dhnVar.j();
        }
        ArrayList arrayList = new ArrayList();
        if (k != null && !k.isEmpty()) {
            for (Rate.Keywords keywords : k) {
                String d = keywords.d();
                String b = keywords.b();
                String j = keywords.j();
                String e = keywords.e();
                String c = keywords.c();
                RateKeyword rateKeyword = new RateKeyword();
                if (TextUtils.isEmpty(d)) {
                    d = str2;
                }
                rateKeyword.count = d;
                if (TextUtils.isEmpty(b)) {
                    b = str2;
                }
                rateKeyword.attribute = b;
                if (TextUtils.isEmpty(j)) {
                    j = str2;
                }
                rateKeyword.word = j;
                rateKeyword.type = keywords.i().ordinal();
                rateKeyword.status = keywords.g();
                if (TextUtils.isEmpty(e)) {
                    e = str2;
                }
                rateKeyword.level = e;
                if (TextUtils.isEmpty(c)) {
                    c = str2;
                }
                rateKeyword.attributeId = c;
                rateKeyword.subImprList = keywords.h();
                String f = keywords.f();
                if (!TextUtils.isEmpty(f)) {
                    rateKeyword.setRateType(Integer.parseInt(f));
                }
                arrayList.add(rateKeyword);
            }
        }
        W.U(arrayList);
        Rate.Keywords i = dhnVar.i();
        if (i != null) {
            String b2 = i.b();
            if (TextUtils.isEmpty(b2)) {
                b2 = str2;
            }
            W.G(b2);
        }
        W.T(m(rate, dhnVar));
        W.O(dhnVar.l());
        if (i != null) {
            str = i.j();
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        W.V(str2);
        if (dhnVar.p()) {
            W.E(dhnVar.n());
        }
        W.C(dhnVar.c());
        W.N(System.currentTimeMillis());
        egnVar.i(W.z());
        return egnVar;
    }

    public static Uri p(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("79650a93", new Object[]{jSONObject});
        }
        try {
            Uri.Builder path = new Uri.Builder().scheme("https").authority("h5.m.taobao.com").path("/ratedisplay/vivid_ratelist.htm");
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (!TextUtils.equals(entry.getKey(), "rateKeywordList")) {
                    String key = entry.getKey();
                    if (value != null) {
                        str = String.valueOf(value);
                    } else {
                        str = "";
                    }
                    path.appendQueryParameter(key, str);
                }
            }
            return path.build();
        } catch (Exception unused) {
            tgh.b("RateUtils", "getRateFeedsUri Exception");
            return null;
        }
    }

    public static Uri q(ze7 ze7Var, Bundle bundle, dhn dhnVar) {
        Vertical.a askAll;
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("68e3425d", new Object[]{ze7Var, bundle, dhnVar});
        }
        try {
            Seller seller = (Seller) ze7Var.e().f(Seller.class);
            Rate rate = (Rate) ze7Var.e().f(Rate.class);
            Uri.Builder path = new Uri.Builder().scheme("https").authority("h5.m.taobao.com").path("/ratedisplay/vivid_ratelist.htm");
            path.appendQueryParameter("itemId", DataUtils.w((Item) ze7Var.e().f(Item.class), str));
            path.appendQueryParameter("shopId", DataUtils.G(seller, str));
            path.appendQueryParameter("sellerId", DataUtils.E(seller, str));
            path.appendQueryParameter("feedId", String.valueOf(dhnVar.f()));
            path.appendQueryParameter("invokeSource", String.valueOf(dhnVar.g()));
            path.appendQueryParameter("skuvids", dhnVar.o());
            path.appendQueryParameter("exParams", h(dhnVar).toString());
            try {
                path.appendQueryParameter("skuInfo", DataUtils.I((SkuBase) ze7Var.e().f(SkuBase.class), new JSONObject()).toJSONString());
            } catch (Exception unused) {
            }
            Vertical vertical = (Vertical) ze7Var.e().f(Vertical.class);
            if (!(vertical == null || (askAll = vertical.getAskAll()) == null)) {
                path.appendQueryParameter("askInfo", DataUtils.m(askAll).toJSONString());
            }
            List<Rate.Keywords> k = dhnVar.k();
            if (k == null || k.isEmpty()) {
                k = vbl.a0() ? DataUtils.A(rate, new ArrayList()) : null;
            }
            if (dhnVar.p() && (k == null || k.isEmpty())) {
                k = dhnVar.j();
            }
            JSONArray jSONArray = new JSONArray();
            if (k != null && !k.isEmpty()) {
                for (Rate.Keywords keywords : k) {
                    RateKeyword rateKeyword = new RateKeyword();
                    rateKeyword.count = keywords.d();
                    rateKeyword.attribute = keywords.b();
                    rateKeyword.word = keywords.j();
                    rateKeyword.type = keywords.i().ordinal();
                    rateKeyword.status = keywords.g();
                    rateKeyword.level = keywords.e();
                    rateKeyword.attributeId = keywords.c();
                    rateKeyword.subImprList = keywords.h();
                    String f = keywords.f();
                    if (!TextUtils.isEmpty(f)) {
                        rateKeyword.setRateType(Integer.parseInt(f));
                    }
                    jSONArray.add(rateKeyword);
                }
            }
            bundle.putSerializable("rateKeywordList", jSONArray);
            Rate.Keywords i = dhnVar.i();
            if (i != null) {
                String b = i.b();
                if (TextUtils.isEmpty(b)) {
                    b = str;
                }
                path.appendQueryParameter(DXTraceUtil.TYPE_EXPRESSION_STRING, b);
            }
            path.appendQueryParameter("rateExtParams", m(rate, dhnVar).toJSONString());
            String j = i == null ? null : i.j();
            if (!TextUtils.isEmpty(j)) {
                str = j;
            }
            path.appendQueryParameter("selectTag", str);
            return path.build();
        } catch (Exception unused2) {
            tgh.b("RateUtils", "getRateFeedsUri Exception");
            return null;
        }
    }

    public static JSONObject r(ze7 ze7Var, dhn dhnVar, ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("90f8c1e", new Object[]{ze7Var, dhnVar, irVar, runtimeAbilityParamArr});
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject k = k(ze7Var);
        if (k != null) {
            jSONObject2.putAll(k);
        }
        JSONObject f = f(runtimeAbilityParamArr);
        if (f != null) {
            if (dhnVar.p()) {
                jSONObject2.put("detailRate", (Object) f);
                jSONObject2.put("rateKeywordList", (Object) f.getJSONArray("keywords"));
            }
            String string = f.getString("pageTitle");
            boolean booleanValue = f.getBooleanValue("supportFavorableRate");
            dhnVar.v(string);
            dhnVar.t(booleanValue);
        }
        JSONObject d = d(irVar);
        if (d == null) {
            d = new JSONObject();
            jSONObject = null;
        } else {
            jSONObject = d.getJSONObject("exParams");
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            d.put("exParams", (Object) jSONObject);
        }
        jSONObject.putAll(c(dhnVar));
        if (f != null) {
            str = f.getString("enableDataModelOpt");
        } else {
            str = "false";
        }
        jSONObject.put("enableDataModelOpt", (Object) str);
        jSONObject2.putAll(d);
        tgh.b("RateUtils", "getRateInfo eventData=" + d);
        JSONObject e = e(runtimeAbilityParamArr);
        if (e != null) {
            if (e.getJSONObject("exParams") != null) {
                jSONObject.putAll(e.getJSONObject("exParams"));
                e.remove("exParams");
            }
            jSONObject2.putAll(e);
            tgh.b("RateUtils", "getRateInfo dxTapData=" + e);
        }
        return jSONObject2;
    }

    public static boolean u(Context context, ze7 ze7Var, dhn dhnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce83ae2e", new Object[]{context, ze7Var, dhnVar})).booleanValue();
        }
        Bundle bundle = new Bundle();
        Uri q = q(ze7Var, bundle, dhnVar);
        if (q == null) {
            return false;
        }
        jov.j(context, bundle, q.toString());
        return true;
    }

    public static JSONObject e(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1eeff80c", new Object[]{runtimeAbilityParamArr});
        }
        Object[] e = e28.e(runtimeAbilityParamArr);
        JSONObject jSONObject = null;
        if (e == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (e.length >= 1) {
            Object obj = e[0];
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                try {
                    jSONObject = JSON.parseObject(JSON.toJSONString(obj));
                } catch (Exception e2) {
                    tgh.c("RateUtils", "get dx extraArgs exception", e2);
                }
            }
            if (jSONObject != null) {
                jSONObject2.put("feedId", (Object) jSONObject.getString("feedId"));
                if (jSONObject.getJSONArray("keywords") != null) {
                    jSONObject2.put("rateKeywordList", (Object) jSONObject.getJSONArray("keywords"));
                }
                if (jSONObject.getJSONObject("exParams") != null) {
                    jSONObject2.put("exParams", (Object) jSONObject.getJSONObject("exParams"));
                }
                if (!TextUtils.isEmpty(jSONObject.getString("attribute"))) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject.remove("feedId");
                    jSONObject.remove("keywords");
                    jSONObject.remove("exParams");
                    jSONObject3.putAll(jSONObject);
                    jSONObject2.put("keyword", (Object) jSONObject3);
                }
            }
        }
        return jSONObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.dhn s(tb.ir r5, boolean r6, long r7, com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam... r9) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ein.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0028
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r6)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r7)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r5
            r7[r0] = r3
            r5 = 2
            r7[r5] = r6
            r5 = 3
            r7[r5] = r9
            java.lang.String r5 = "554cb011"
            java.lang.Object r5 = r2.ipc$dispatch(r5, r7)
            tb.dhn r5 = (tb.dhn) r5
            return r5
        L_0x0028:
            java.lang.Object[] r2 = tb.e28.e(r9)
            if (r6 == 0) goto L_0x0049
            java.lang.String r6 = g(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x0049
            if (r5 == 0) goto L_0x0049
            com.alibaba.fastjson.JSONObject r3 = r5.a()
            if (r3 == 0) goto L_0x0049
            com.alibaba.fastjson.JSONObject r3 = r5.a()
            java.lang.String r4 = "feedId"
            r3.put(r4, r6)
        L_0x0049:
            r6 = 0
            if (r2 == 0) goto L_0x0073
            int r3 = r2.length
            if (r3 < r0) goto L_0x0073
            r0 = r2[r1]     // Catch: Exception -> 0x0066
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)     // Catch: Exception -> 0x0066
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: Exception -> 0x0066
            if (r0 == 0) goto L_0x0073
            com.taobao.android.detail.ttdetail.data.meta.Rate$Keywords r1 = i(r0)     // Catch: Exception -> 0x0066
            com.alibaba.fastjson.JSONArray r6 = j(r0)     // Catch: Exception -> 0x0064
            goto L_0x0070
        L_0x0064:
            r0 = move-exception
            goto L_0x0068
        L_0x0066:
            r0 = move-exception
            r1 = r6
        L_0x0068:
            java.lang.String r3 = "RateUtils"
            java.lang.String r4 = "parse extraArgs exception"
            tb.tgh.c(r3, r4, r0)
        L_0x0070:
            r0 = r6
            r6 = r1
            goto L_0x0074
        L_0x0073:
            r0 = r6
        L_0x0074:
            if (r6 == 0) goto L_0x007f
            java.util.List r1 = l(r2)
            tb.dhn r6 = tb.dhn.b(r6, r1)
            goto L_0x0087
        L_0x007f:
            com.alibaba.fastjson.JSONObject r6 = r5.a()
            tb.dhn r6 = tb.dhn.a(r6)
        L_0x0087:
            if (r5 == 0) goto L_0x0092
            com.alibaba.fastjson.JSONObject r5 = r5.a()
            if (r5 == 0) goto L_0x0092
            tb.dhn.q(r6, r5)
        L_0x0092:
            tb.oa4 r5 = tb.yc4.i(r9)
            if (r5 == 0) goto L_0x00b9
            tb.nb4 r5 = r5.getComponentData()
            com.alibaba.fastjson.JSONObject r5 = r5.f()
            if (r5 == 0) goto L_0x00b9
            java.lang.String r9 = "pageTitle"
            java.lang.String r9 = r5.getString(r9)
            java.lang.String r1 = "supportFavorableRate"
            boolean r1 = r5.getBooleanValue(r1)
            r6.v(r9)
            r6.t(r1)
            r6.w(r5)
        L_0x00b9:
            r6.r(r7)
            r6.x(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ein.s(tb.ir, boolean, long, com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[]):tb.dhn");
    }

    public static boolean t(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("156109f8", new Object[]{context, jSONObject})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("rateKeywordList", jSONObject.getJSONArray("rateKeywordList"));
            Uri p = p(jSONObject);
            if (p != null) {
                jov.j(context, bundle, p.toString());
                return true;
            }
        }
        return false;
    }
}
