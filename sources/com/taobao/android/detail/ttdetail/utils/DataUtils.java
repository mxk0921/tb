package com.taobao.android.detail.ttdetail.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter;
import com.taobao.android.detail.ttdetail.data.meta.CommonDialog;
import com.taobao.android.detail.ttdetail.data.meta.Delivery;
import com.taobao.android.detail.ttdetail.data.meta.DetailClientData;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Rate;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.data.meta.SkuBase;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.ju.track.server.JTrackParams;
import com.ut.share.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.a4o;
import tb.bq6;
import tb.d1i;
import tb.e1i;
import tb.eos;
import tb.ir;
import tb.jns;
import tb.lba;
import tb.nb4;
import tb.oa4;
import tb.oc4;
import tb.t2o;
import tb.tgh;
import tb.tua;
import tb.tx9;
import tb.vbl;
import tb.w7j;
import tb.wua;
import tb.xi2;
import tb.xka;
import tb.yns;
import tb.ywk;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DataUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262771);
    }

    public static List<Rate.Keywords> A(Rate rate, List<Rate.Keywords> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8abc10f4", new Object[]{rate, list});
        }
        if (rate == null) {
            return list;
        }
        List<Rate.Keywords> keywords = rate.getKeywords();
        if (keywords == null) {
            return list;
        }
        return keywords;
    }

    public static String B(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68f255be", new Object[]{str, jSONObject});
        }
        JSONObject f = DynamicMergeUtils.f(jSONObject);
        if (f != null) {
            jSONObject2 = f.getJSONObject("meta");
        } else {
            jSONObject2 = null;
        }
        String L = L(jSONObject);
        if (TextUtils.isEmpty(L)) {
            L = L(jSONObject2);
        }
        if (TextUtils.isEmpty(L)) {
            L = M(str, jSONObject);
        }
        if (TextUtils.isEmpty(L)) {
            L = M(str, jSONObject2);
        }
        if (DetailV3Converter.A(f)) {
            return L;
        }
        if (!f0(f)) {
            if (TextUtils.isEmpty(L)) {
                L = J(str, jSONObject);
            }
            if (TextUtils.isEmpty(L)) {
                L = J(str, jSONObject2);
            }
            if (TextUtils.isEmpty(L)) {
                return q(str);
            }
            return L;
        } else if (P(jSONObject) || P(jSONObject2) || S(jSONObject) || S(jSONObject2) || O(jSONObject) || O(jSONObject2)) {
            return L;
        } else {
            if (TextUtils.isEmpty(L)) {
                L = r(str, jSONObject);
            }
            if (TextUtils.isEmpty(L)) {
                L = r(str, jSONObject2);
            }
            if (TextUtils.isEmpty(L)) {
                return q(str);
            }
            return L;
        }
    }

    public static String C(Item item, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f02f6c98", new Object[]{item, str});
        }
        if (item == null) {
            return str;
        }
        String rootCategoryId = item.getRootCategoryId();
        if (rootCategoryId == null) {
            return str;
        }
        return rootCategoryId;
    }

    public static Map<String, String> D(Resource resource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d2f64d9", new Object[]{resource});
        }
        if (resource == null) {
            return null;
        }
        return resource.getRsExtParams();
    }

    public static String E(Seller seller, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d8f8e03", new Object[]{seller, str});
        }
        if (seller == null) {
            return str;
        }
        String userId = seller.getUserId();
        if (userId == null) {
            return str;
        }
        return userId;
    }

    public static long F(Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b3e6055", new Object[]{params})).longValue();
        }
        if (params == null) {
            return 0L;
        }
        try {
            return params.getTrackParams().getLongValue("serverStableTotalRt");
        } catch (Exception unused) {
            tgh.a("serverStableTotalRt parse error");
            return 0L;
        }
    }

    public static String G(Seller seller, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f57a5cba", new Object[]{seller, str});
        }
        if (seller == null) {
            return str;
        }
        String shopId = seller.getShopId();
        if (shopId == null) {
            return str;
        }
        return shopId;
    }

    public static int H(Seller seller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cd46b90", new Object[]{seller})).intValue();
        }
        if (seller == null) {
            return 1;
        }
        return seller.getShopType();
    }

    public static JSONObject I(SkuBase skuBase, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("16ed68ae", new Object[]{skuBase, jSONObject});
        }
        if (skuBase == null) {
            return jSONObject;
        }
        JSONObject data = skuBase.getData();
        if (data == null) {
            return jSONObject;
        }
        return data;
    }

    public static String J(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5fe0e3d", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !jSONObject2.getBooleanValue("tcloudToH5") || (jSONObject3 = jSONObject.getJSONObject("item")) == null) {
            return null;
        }
        String string = jSONObject3.getString("h5ItemUrl");
        return TextUtils.isEmpty(string) ? q(str) : string;
    }

    public static String K(Delivery delivery, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42b989be", new Object[]{delivery, str});
        }
        if (delivery == null) {
            return str;
        }
        String completedTo = delivery.getCompletedTo();
        if (TextUtils.isEmpty(completedTo)) {
            completedTo = delivery.getTo();
        }
        if (completedTo == null) {
            return str;
        }
        return completedTo;
    }

    public static String L(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dea79e1c", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(DnsPreference.KEY_TRADE)) == null) {
            return null;
        }
        return jSONObject2.getString(Constants.WEIBO_REDIRECTURL_KEY);
    }

    public static String M(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42287073", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !jSONObject2.getBooleanValue("biz_degrade") || jSONObject2.getBooleanValue("tmallHKDirectSaleDetail") || (jSONObject3 = jSONObject.getJSONObject("params")) == null || (jSONObject4 = jSONObject3.getJSONObject(JTrackParams.TRACK_PARAMS)) == null || !"ali.china.lease".equalsIgnoreCase(jSONObject4.getString("aliBizCode"))) {
            return null;
        }
        return Uri.parse("https://main.m.taobao.com/detail/index.html").buildUpon().appendQueryParameter("id", str).appendQueryParameter("bizCode", "ali.china.lease").appendQueryParameter("hybrid", "true").build().toString();
    }

    public static boolean N(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e6bc4c5", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !Boolean.parseBoolean(jSONObject2.getString("degradeToOldMtop"))) {
            return false;
        }
        return true;
    }

    public static boolean P(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71a874d5", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !jSONObject2.getBooleanValue("detail3")) {
            return false;
        }
        return true;
    }

    public static boolean R(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c05d3b5a", new Object[]{feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isHeaderPicFlow();
    }

    public static boolean S(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("464559cd", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !jSONObject2.getBooleanValue("finalUltron")) {
            return false;
        }
        return true;
    }

    public static boolean T(ze7 ze7Var) {
        Feature feature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("768b0ac9", new Object[]{ze7Var})).booleanValue();
        }
        if (ze7Var == null || (feature = (Feature) ze7Var.e().f(Feature.class)) == null) {
            return false;
        }
        return feature.isGuessYouLikeNewStyle();
    }

    public static boolean U(ze7 ze7Var) {
        DetailClientData detailClientData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7641ab4", new Object[]{ze7Var})).booleanValue();
        }
        if (ze7Var == null || (detailClientData = (DetailClientData) ze7Var.e().f(DetailClientData.class)) == null) {
            return false;
        }
        return detailClientData.isGuessYouLikeServerless();
    }

    public static boolean V(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8984f82", new Object[]{feature})).booleanValue();
        }
        if (feature == null || !feature.isHeaderPicScrollCycle()) {
            return false;
        }
        return true;
    }

    public static boolean W(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89c1cc4d", new Object[]{feature})).booleanValue();
        }
        if (feature == null || !feature.isHideMainPicLocator()) {
            return false;
        }
        return true;
    }

    public static boolean X(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6676ec7b", new Object[]{feature})).booleanValue();
        }
        if (feature == null || !feature.isMainPicHideLocator()) {
            return false;
        }
        return true;
    }

    public static boolean Y(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65696fc", new Object[]{feature})).booleanValue();
        }
        if (feature == null || !feature.isMainPicGifAutoPlay()) {
            return false;
        }
        return true;
    }

    public static JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2c8b4b9c", new Object[]{jSONObject});
        }
        return jSONObject;
    }

    public static JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d45a74c9", new Object[]{jSONObject});
        }
        JSONObject f = DynamicMergeUtils.f(jSONObject);
        if (f != null) {
            for (Map.Entry<String, Object> entry : f.entrySet()) {
                String key = entry.getKey();
                if (d1i.KEY_LAYOUT_INFO.equalsIgnoreCase(key) && (jSONObject2 = f.getJSONObject(key)) != null) {
                    Iterator<Map.Entry<String, Object>> it = jSONObject2.entrySet().iterator();
                    while (it.hasNext()) {
                        String key2 = it.next().getKey();
                        if (yns.KEY_DIVISION_DESC.equalsIgnoreCase(key2) || "description".equalsIgnoreCase(key2) || yns.KEY_DIVISION_RECOMMEND.equalsIgnoreCase(key2) || "recommend".equalsIgnoreCase(key2)) {
                            it.remove();
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean b0(bq6 bq6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fc62c85", new Object[]{bq6Var})).booleanValue();
        }
        if (bq6Var == null) {
            return false;
        }
        return bq6Var.o();
    }

    public static JSONObject c(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4ea4f67f", new Object[]{jSONObject});
        }
        JSONObject f = DynamicMergeUtils.f(jSONObject);
        if (f != null) {
            Iterator<Map.Entry<String, Object>> it = f.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (!"global".equalsIgnoreCase(key) && !"components".equalsIgnoreCase(key) && !"meta".equalsIgnoreCase(key)) {
                    if (d1i.KEY_LAYOUT_INFO.equalsIgnoreCase(key)) {
                        JSONObject jSONObject2 = f.getJSONObject(key);
                        if (jSONObject2 != null) {
                            Iterator<Map.Entry<String, Object>> it2 = jSONObject2.entrySet().iterator();
                            while (it2.hasNext()) {
                                String key2 = it2.next().getKey();
                                if (!"navBar".equalsIgnoreCase(key2) && !"headerPic".equalsIgnoreCase(key2)) {
                                    if ("mainScreen".equalsIgnoreCase(key2)) {
                                        JSONObject jSONObject3 = jSONObject2.getJSONObject(key2);
                                        if (!(jSONObject3 == null || (jSONArray = jSONObject3.getJSONArray("children")) == null)) {
                                            jSONArray.clear();
                                        }
                                    } else {
                                        it2.remove();
                                    }
                                }
                            }
                        }
                    } else if ("model".equalsIgnoreCase(key)) {
                        JSONObject jSONObject4 = f.getJSONObject(key);
                        if (jSONObject4 != null) {
                            Iterator<Map.Entry<String, Object>> it3 = jSONObject4.entrySet().iterator();
                            while (it3.hasNext()) {
                                String key3 = it3.next().getKey();
                                if (!TBBuyPreloadScene.NAV.equalsIgnoreCase(key3)) {
                                    if ("headerPic".equalsIgnoreCase(key3)) {
                                        JSONObject jSONObject5 = jSONObject4.getJSONObject(key3);
                                        if (jSONObject5 != null) {
                                            a(jSONObject5);
                                        }
                                    } else {
                                        it3.remove();
                                    }
                                }
                            }
                        }
                    } else {
                        it.remove();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a294521d", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject f = DynamicMergeUtils.f(jSONObject.getJSONObject("data"));
        if (f == null) {
            return jSONObject;
        }
        for (Map.Entry<String, Object> entry : f.entrySet()) {
            String key = entry.getKey();
            if ("model".equalsIgnoreCase(key) && (jSONObject2 = f.getJSONObject(key)) != null) {
                for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                    String key2 = entry2.getKey();
                    if (!(!"headerPic".equalsIgnoreCase(key2) || (jSONObject3 = jSONObject2.getJSONObject(key2)) == null || (jSONArray = jSONObject3.getJSONArray(wua.KEY_SMALL_WINDOW)) == null)) {
                        jSONArray.clear();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean d0(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b9dad2", new Object[]{feature})).booleanValue();
        }
        if (feature == null || !feature.isSupportPresent()) {
            return false;
        }
        return true;
    }

    public static oa4 e(yns ynsVar, oc4 oc4Var) {
        xi2 o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("c1f577c5", new Object[]{ynsVar, oc4Var});
        }
        if (oc4Var == null || ynsVar == null || (o = ynsVar.o()) == null) {
            return null;
        }
        return o.f(oc4Var);
    }

    public static boolean e0(Seller seller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67eefd16", new Object[]{seller})).booleanValue();
        }
        if (seller != null && H(seller) == 2) {
            return true;
        }
        return false;
    }

    public static Map<String, ComponentViewMeta> f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9dc875e7", new Object[]{jSONObject});
        }
        HashMap hashMap = null;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("components")) == null) {
            return null;
        }
        for (String str : jSONObject2.keySet()) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, new ComponentViewMeta(jSONObject2.getJSONObject(str)));
        }
        hashMap.put("native$_tt_detail_header_frame_", new ComponentViewMeta(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.utils.DataUtils.1
            {
                put("name", "_tt_detail_header_frame_");
                put("type", "native");
                put("version", "0");
                put("url", "");
            }
        }));
        return hashMap;
    }

    public static List<oa4<nb4>> g(yns ynsVar, oc4 oc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f65f14e0", new Object[]{ynsVar, oc4Var});
        }
        ArrayList arrayList = null;
        if (!(oc4Var == null || ynsVar == null || ynsVar.t() == null)) {
            eos t = ynsVar.t();
            if (t.l() <= 0) {
                return null;
            }
            arrayList = new ArrayList(1);
            int l = t.l();
            for (int i = 0; i < l; i++) {
                oa4 f = t.k(i).f(oc4Var);
                if (f != null) {
                    arrayList.add(f);
                }
            }
        }
        return arrayList;
    }

    public static boolean g0(SkuCore skuCore) {
        SkuCore.c skuItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be094d1f", new Object[]{skuCore})).booleanValue();
        }
        if (skuCore == null || (skuItem = skuCore.getSkuItem()) == null) {
            return false;
        }
        return skuItem.g();
    }

    public static List<tx9> h(wua wuaVar) {
        List<xka> z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f9d65486", new Object[]{wuaVar});
        }
        if (wuaVar == null || (z = wuaVar.z()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (xka xkaVar : z) {
            if (xkaVar.t() != null) {
                arrayList.addAll(xkaVar.t());
            }
        }
        return arrayList;
    }

    public static String h0(MtopInfo mtopInfo) {
        Resource resource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db69f1aa", new Object[]{mtopInfo});
        }
        if (!a4o.k(mtopInfo)) {
            return null;
        }
        JSONObject a2 = w7j.a(mtopInfo);
        if (Z(a2)) {
            return null;
        }
        JSONObject j = DynamicMergeUtils.j(a2);
        if (!DetailV3Converter.B(j) || (resource = (Resource) lba.a(j, Resource.class)) == null) {
            return null;
        }
        return resource.getPageKey();
    }

    public static List<oa4> i(yns ynsVar, oc4 oc4Var) {
        tua tuaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2e4d56b5", new Object[]{ynsVar, oc4Var});
        }
        ArrayList arrayList = null;
        if (!(oc4Var == null || ynsVar == null || ynsVar.q() == null)) {
            e1i q = ynsVar.q();
            if (q.l() <= 0 && ynsVar.p() == null) {
                return null;
            }
            arrayList = new ArrayList(1);
            int l = q.l();
            for (int i = 0; i < l; i++) {
                oa4 f = q.k(i).f(oc4Var);
                if (f != null) {
                    arrayList.add(f);
                }
            }
            if (!(ynsVar.p() == null || (tuaVar = (tua) ynsVar.p().f(oc4Var)) == null)) {
                arrayList.add(0, tuaVar);
            }
        }
        return arrayList;
    }

    public static boolean i0(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55e2e65c", new Object[]{feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isSceneMatchingPurchase();
    }

    public static List<tx9> j(wua wuaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("737d4b9c", new Object[]{wuaVar});
        }
        if (wuaVar == null) {
            return null;
        }
        return wuaVar.x();
    }

    public static boolean j0(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b56db26a", new Object[]{feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isSelectedBundleTab();
    }

    public static String k(Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8dcf320", new Object[]{params});
        }
        if (params == null) {
            return null;
        }
        return params.getUtParams();
    }

    public static boolean k0(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec8a4601", new Object[]{feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isUseMtopPost();
    }

    public static String l(Delivery delivery, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21cb73c6", new Object[]{delivery, str});
        }
        if (delivery == null) {
            return str;
        }
        String areaId = delivery.getAreaId();
        if (areaId == null) {
            return str;
        }
        return areaId;
    }

    public static JSONObject m(Vertical.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("635f0d60", new Object[]{aVar});
        }
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }

    public static String n(Item item, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("278a7b96", new Object[]{item, str});
        }
        if (item == null) {
            return str;
        }
        String categoryId = item.getCategoryId();
        if (categoryId == null) {
            return str;
        }
        return categoryId;
    }

    public static long o(Item item, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9dd8daef", new Object[]{item, new Long(j)})).longValue();
        }
        if (item == null) {
            return j;
        }
        return item.getCommentCount();
    }

    public static JSONObject p(ze7 ze7Var) {
        CommonDialog commonDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bfc7521f", new Object[]{ze7Var});
        }
        if (ze7Var == null || (commonDialog = (CommonDialog) ze7Var.e().f(CommonDialog.class)) == null) {
            return null;
        }
        return commonDialog.getBizData();
    }

    public static String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e27bf047", new Object[]{str});
        }
        if (vbl.n0()) {
            return vbl.P0() + str;
        }
        return "https://new.m.taobao.com/detail.htm?id=" + str + "&hybrid=true";
    }

    public static String r(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fc3baca", new Object[]{str, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("feature")) == null || !jSONObject2.getBooleanValue("disableDetail1") || (jSONObject3 = jSONObject.getJSONObject("item")) == null) {
            return null;
        }
        String string = jSONObject3.getString("h5ItemUrl");
        if (TextUtils.isEmpty(string)) {
            return q(str);
        }
        return string;
    }

    public static String s(Item item, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c1ad46b", new Object[]{item, str});
        }
        if (item == null) {
            return str;
        }
        String groupId = item.getGroupId();
        if (groupId == null) {
            return str;
        }
        return groupId;
    }

    public static String t(Item item, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f2c81c2", new Object[]{item, str});
        }
        if (item == null) {
            return str;
        }
        String firstImageUrl = item.getFirstImageUrl();
        if (firstImageUrl == null) {
            return str;
        }
        return firstImageUrl;
    }

    public static String u(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f7cffb", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("item")) == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("feature");
        if (jSONObject3 == null) {
            return jSONObject2.getString("itemId");
        }
        if (jSONObject3.getBooleanValue("oneProductMM")) {
            String string = jSONObject2.getString("platformItemId");
            if (vbl.b() && !TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return jSONObject2.getString("itemId");
    }

    public static String v(Item item) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad1c22f5", new Object[]{item});
        }
        return w(item, null);
    }

    public static String w(Item item, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57ed7b2b", new Object[]{item, str});
        }
        if (item == null) {
            return str;
        }
        String itemId = item.getItemId();
        if (itemId == null) {
            return str;
        }
        return itemId;
    }

    public static String x(Item item, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5d99936", new Object[]{item, str});
        }
        if (item == null) {
            return str;
        }
        String title = item.getTitle();
        if (title == null) {
            return str;
        }
        return title;
    }

    public static String y(jns jnsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da7cdeaf", new Object[]{jnsVar, str});
        }
        if (jnsVar == null) {
            return str;
        }
        if (ywk.g(jnsVar)) {
            return ywk.d(jnsVar);
        }
        return w((Item) jnsVar.t(Item.class), str);
    }

    public static JSONObject z(Rate rate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("641a1cd1", new Object[]{rate});
        }
        if (rate == null) {
            return null;
        }
        return rate.getRateExtParams();
    }

    public static boolean Z(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13b2ab0", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null) {
            return false;
        }
        return jSONObject2.getBooleanValue("preload");
    }

    public static boolean a0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6aa9fb24", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.getBooleanValue("preload");
    }

    public static boolean O(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1055d836", new Object[]{jSONObject})).booleanValue();
        }
        return jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("bizData")) != null && !jSONObject2.isEmpty() && jSONObject2.getBooleanValue("useClientEngine") && (jSONObject3 = jSONObject2.getJSONObject("template")) != null && !jSONObject3.isEmpty() && (jSONObject4 = jSONObject.getJSONObject("componentsVO")) != null && !jSONObject4.isEmpty();
    }

    public static boolean Q(Map<String, List<ir>> map) {
        ir next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7a5442e", new Object[]{map})).booleanValue();
        }
        if (map == null) {
            return true;
        }
        for (String str : map.keySet()) {
            List<ir> list = map.get(str);
            if (list != null) {
                Iterator<ir> it = list.iterator();
                boolean z = false;
                while (it.hasNext() && ((next = it.next()) == null || !(z = "userTrack".equals(next.b())))) {
                }
                if (z) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean c0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6bc3e33", new Object[]{jSONObject})).booleanValue();
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("skuCore").getJSONObject("skuItem");
        } catch (Exception e) {
            tgh.a("isUpdateSkuDataValid parse skuItem exception:" + e);
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObject2.getString("skuWeexUrl")) && TextUtils.isEmpty(jSONObject2.getString("skuV3WeexUrl"));
    }

    public static boolean f0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d87c304f", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.containsKey(AURASubmitEvent.RPC_ENDPOINT) || jSONObject.containsKey("version");
    }
}
