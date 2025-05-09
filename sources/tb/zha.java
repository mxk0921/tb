package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.ButtonStateHelper;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699259);
    }

    public static void a(xea xeaVar, HashMap<String, String> hashMap) {
        ItemCategory itemCategory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c78f08a", new Object[]{xeaVar, hashMap});
        } else if (hashMap != null && xeaVar != null && (itemCategory = xeaVar.L) != null) {
            String str = itemCategory.categoryId;
            hashMap.put("categoryId", str);
            hashMap.put("categoryName", xeaVar.L.name);
            List<ItemCategory> f = jga.f(xeaVar);
            if (f == null || f.isEmpty() || TextUtils.isEmpty(str)) {
                hashMap.put("class_number", "0");
                hashMap.put("class_total", "0");
                return;
            }
            for (int i = 0; i < f.size(); i++) {
                if (TextUtils.equals(f.get(i).categoryId, str)) {
                    hashMap.put("class_number", String.valueOf(i));
                }
            }
            hashMap.put("class_total", String.valueOf(f.size()));
        }
    }

    public static HashMap<String, String> c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f1fea922", new Object[]{jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                if (!jSONObject.keySet().isEmpty()) {
                    for (String str : jSONObject.keySet()) {
                        String valueOf = String.valueOf(str);
                        Object obj = jSONObject.get(valueOf);
                        if (obj instanceof String) {
                            hashMap.put(valueOf, (String) obj);
                        } else {
                            hashMap.put(valueOf, URLEncoder.encode(JSON.toJSONString(obj), "utf-8"));
                        }
                    }
                }
            } catch (Exception e) {
                hha.b(b.f2661a, e.getMessage());
            }
        }
        return hashMap;
    }

    public static String d(JSONArray jSONArray, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6891a121", new Object[]{jSONArray, str, str2, new Integer(i)});
        }
        if (jSONArray == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < jSONArray.size() && i2 < i; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            if (jSONObject != null) {
                String string = jSONObject.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append(str2);
                    }
                    sb.append(string);
                }
            }
        }
        return sb.toString();
    }

    public static String f(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96c55695", new Object[]{liveItem});
        }
        JSONObject jSONObject = liveItem.liveItemStatusData;
        if (jSONObject != null && (jSONObject.getBooleanValue("isGray") || liveItem.liveItemStatusData.getBooleanValue("isDownShelf"))) {
            return "1";
        }
        JSONObject jSONObject2 = liveItem.itemExtData;
        if (jSONObject2 != null) {
            if (TextUtils.equals("0", jSONObject2.getString("timingUpShelfStatus"))) {
                return "6";
            }
            String string = liveItem.itemExtData.getString("preSaleStatus");
            if (TextUtils.equals("0", string)) {
                if (TextUtils.equals("1", liveItem.itemExtData.getString("subscribeStatus"))) {
                    return "3";
                }
                return "2";
            } else if (TextUtils.equals("1", string)) {
                return "4";
            }
        }
        return "0";
    }

    public static String g(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8e4f102", new Object[]{liveItem});
        }
        ArrayList arrayList = new ArrayList();
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext != null) {
            if ("secKill".equals(ext.itemBizType)) {
                arrayList.add("2");
            }
            if (TextUtils.equals("1", liveItem.extendVal.isYanxuan)) {
                arrayList.add("6");
            }
            if (pfa.H(liveItem)) {
                arrayList.add("8");
            }
            if (pfa.I(liveItem)) {
                arrayList.add("9");
            }
        }
        JSONObject jSONObject = liveItem.liveItemStatusData;
        if (jSONObject != null) {
            if (jSONObject.getBooleanValue("isTop")) {
                arrayList.add("5");
            }
            if (TextUtils.equals("true", liveItem.liveItemStatusData.getString("isYanXuanHot"))) {
                arrayList.add("7");
            }
            if (liveItem.liveItemStatusData.getBooleanValue("isPreHeat")) {
                arrayList.add("10");
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("1");
        }
        return zqq.b(arrayList, '@');
    }

    public static List<String> h(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("17cf1d4c", new Object[]{jSONObject});
        }
        ArrayList arrayList = null;
        if (jSONObject != null && jSONObject.containsKey("topRightEntranceList") && (jSONArray = jSONObject.getJSONArray("topRightEntranceList")) != null && !jSONArray.isEmpty()) {
            arrayList = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("type");
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a34a1c0", new Object[]{str});
            return;
        }
        hha.b("GoodsTrackUtils", "trackDataOptError | reason=" + str);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("reason", str);
        if (kkr.i().o() != null) {
            kkr.i().o().c("gl_dataopt", hashMap);
        }
    }

    public static void l(DXRuntimeContext dXRuntimeContext, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53bd4ff", new Object[]{dXRuntimeContext, str, str2});
            return;
        }
        hha.b("GoodsTrackUtils", "trackGLHandlerContextError | reason=" + str + " className=" + str2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("reason", str);
        hashMap.put("className", str2);
        if (dXRuntimeContext == null || dXRuntimeContext.p() == null) {
            str3 = "no";
        } else {
            str3 = dXRuntimeContext.p().e();
        }
        hashMap.put("template", str3);
        if (kkr.i().o() != null) {
            kkr.i().o().c("gl_dataopt", hashMap);
        }
    }

    public static void m(xea xeaVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cff0cec", new Object[]{xeaVar, str, map});
        } else if (!TextUtils.isEmpty(str) && kkr.i().o() != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            if (map != null) {
                hashMap.putAll(map);
            }
            kkr.i().o().c("gl_error", hashMap);
        }
    }

    public static void n(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6211678a", new Object[]{str, jSONObject});
        } else if (jSONObject != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("scene_code", jSONObject.getString("popId"));
            hashMap.put("link_node_key", "halfscreen_detail_page_show");
            hashMap.put("status", str);
            hashMap.put("data", jSONObject.toJSONString());
            if ("fail".equals(str)) {
                hashMap.put("errorCode", "request_error");
                hashMap.put("errorMessage", "request_error");
            }
            if (kkr.i().o() != null) {
                kkr.i().o().c("full_link_monitoring", hashMap);
            }
        }
    }

    public static void b(JSONObject jSONObject, List<String> list, HashMap<String, String> hashMap) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d680f53", new Object[]{jSONObject, list, hashMap});
        } else if (jSONObject != null && list != null && hashMap != null && (jSONArray = jSONObject.getJSONArray("topRightEntranceList")) != null && !jSONArray.isEmpty()) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("type");
                    if (!TextUtils.isEmpty(string) && list.contains(string)) {
                        String string2 = jSONObject2.getString("count");
                        if (!TextUtils.isEmpty(string2)) {
                            hashMap.put(string + "_count", string2);
                        }
                    }
                }
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("broadCaster");
            JSONArray jSONArray2 = jSONObject.getJSONArray("extraGoodsTabList");
            if (jSONObject3 != null && !jSONObject3.isEmpty() && jSONArray2 != null && jSONArray2.size() == 1) {
                hashMap.put("entrance_type", jSONObject3.getString("type"));
            }
        }
    }

    public static boolean i(LiveItem liveItem) {
        boolean z;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70034048", new Object[]{liveItem})).booleanValue();
        }
        if (!(liveItem == null || (jSONObject2 = liveItem.itemExtData) == null || !jSONObject2.containsKey("itemSellingTotal"))) {
            String string = liveItem.itemExtData.getString("itemSellingTotal");
            if (!TextUtils.equals(string, "0") && !TextUtils.isEmpty(string)) {
                z = true;
                return z && (liveItem == null && (jSONObject = liveItem.liveItemStatusData) != null && jSONObject.containsKey("isSpeaking") && TextUtils.equals(liveItem.liveItemStatusData.getString("isSpeaking"), "true"));
            }
        }
        z = false;
        if (z) {
            return false;
        }
    }

    public static void j(JSONObject jSONObject, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e848b1c", new Object[]{jSONObject, new Boolean(z)});
            return;
        }
        List<String> h = h(jSONObject);
        if (h != null && !h.isEmpty()) {
            HashMap<String, String> hashMap = new HashMap<>();
            if (!z) {
                if (h.size() > 2) {
                    h = h.subList(0, 2);
                    str = zqq.b(h, '@') + "&more";
                } else {
                    str = zqq.b(h, '@');
                }
                b(jSONObject, h, hashMap);
            } else {
                str = zqq.b(h.subList(2, h.size()), '@');
            }
            hashMap.put("types", str);
            if (z) {
                str2 = "pop";
            } else {
                str2 = "top";
            }
            hashMap.put("gl_scene", str2);
            if (kkr.i().o() != null) {
                kkr.i().o().b("Show-gl_entry", hashMap);
            }
        }
    }

    public static void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839fd3ba", new Object[]{jSONObject});
        } else if (jSONObject == null) {
            hha.b("GoodsTrackUtils", "handleTopOperate resultData  is null.");
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("carouselListV2");
            if (jSONArray == null || jSONArray.isEmpty()) {
                o3s.b("GoodsTrackUtils", "handleTopOperate resultDataJsonObj  is null.");
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("type");
                    if (!TextUtils.isEmpty(string)) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        hashMap.put("type", string);
                        if (kkr.i().o() != null) {
                            kkr.i().o().b("Show-GoodList_New", hashMap);
                        }
                    }
                }
            }
        }
    }

    public static HashMap<String, String> e(xea xeaVar, LiveItem liveItem) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        JSONObject d;
        JSONObject jSONObject;
        String str2;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("47bcd21e", new Object[]{xeaVar, liveItem});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (liveItem == null) {
            return hashMap;
        }
        JSONObject jSONObject4 = liveItem.liveItemStatusData;
        if (jSONObject4 != null) {
            z2 = jSONObject4.getBooleanValue("isSpeaking");
            z = liveItem.liveItemStatusData.getBooleanValue("isHotItemPreheat");
        } else {
            z2 = false;
            z = false;
        }
        String str3 = "0";
        hashMap.put("if_explaining", z2 ? "1" : str3);
        if (z) {
            hashMap.put("liveItemTags", "hotItemPreheat01");
        }
        LiveItem.Ext ext = liveItem.extendVal;
        if (ext != null) {
            hashMap.put("if_anchorbenefit", TextUtils.isEmpty(ext.customizedItemRights) ? str3 : "1");
        }
        hashMap.put("item_kind", g(liveItem));
        hashMap.put("button_status", f(liveItem));
        if (liveItem.itemExtData != null && TextUtils.equals(liveItem.native_buttonStatus, ButtonStateHelper.ButtonState.SINGLE_DEFAULT_NEWBUY.getValue())) {
            String concat = "addCart_".concat(TextUtils.equals(liveItem.itemExtData.getString("enableCart"), "true") ? "1" : str3);
            boolean equals = TextUtils.equals(liveItem.itemExtData.getString("enableBuy"), "true");
            StringBuilder sb = new StringBuilder();
            sb.append(concat);
            sb.append("@buyNow_");
            sb.append(equals ? "1" : str3);
            hashMap.put("buttonclickstatus", sb.toString());
        }
        hashMap.put("item_wyswyg", kkr.i().n(xeaVar) == liveItem.itemId ? "1" : str3);
        hashMap.put("item_id", Long.toString(liveItem.itemId));
        if (i(liveItem)) {
            hashMap.put("item_atmospheretype", "hot");
        }
        JSONObject jSONObject5 = liveItem.itemExtData;
        if (jSONObject5 != null) {
            hashMap.put("hidePrice", jSONObject5.getBooleanValue("hidePrice") ? "1" : str3);
            if (!liveItem.itemExtData.containsKey("giftActivityInfo") || liveItem.itemExtData.getJSONObject("giftActivityInfo") == null) {
                z4 = false;
            }
            if (liveItem.itemExtData.containsKey("itemBenefitLabels") && (jSONArray = liveItem.itemExtData.getJSONArray("itemBenefitLabels")) != null && !jSONArray.isEmpty() && (jSONObject3 = jSONArray.getJSONObject(0)) != null && jSONObject3.containsKey("type")) {
                hashMap.put("benefitType", jSONObject3.getString("type"));
            }
        } else {
            z4 = false;
        }
        if (z4) {
            hashMap.put("is_bogo", "1");
        }
        String p = pfa.p(liveItem);
        if (!TextUtils.isEmpty(p)) {
            hashMap.put("scene", p);
        }
        Map<String, String> map = liveItem.extraUTParams;
        if (map != null && !map.isEmpty()) {
            String str4 = liveItem.extraUTParams.get("aggregation_type");
            String str5 = liveItem.extraUTParams.get("aggregation_id");
            String str6 = liveItem.extraUTParams.get("aggregation_source");
            if (!TextUtils.isEmpty(str5)) {
                hashMap.put("aggregation_id", str5);
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put("aggregation_type", str4);
            }
            if (!TextUtils.isEmpty(str6)) {
                hashMap.put("aggregation_source", str6);
            }
        }
        hashMap.put("itemSourceType", qfa.f(liveItem) ? "1" : str3);
        JSONObject jSONObject6 = liveItem.personalityData;
        if (jSONObject6 != null) {
            if (jSONObject6.getJSONArray("itemGifts") != null && !liveItem.personalityData.getJSONArray("itemGifts").isEmpty()) {
                hashMap.put("gift_id", liveItem.personalityData.getJSONArray("itemGifts").getJSONObject(0).getString(yj4.PARAM_OPEN_REWARD_GIFT_ID));
            }
            z3 = TextUtils.equals(liveItem.personalityData.getString("subscribeStatus"), "1");
            if (!TextUtils.isEmpty(liveItem.personalityData.getString("priceTip"))) {
                hashMap.put("priceTip", liveItem.personalityData.getString("priceTip"));
            }
            if (liveItem.personalityData.getJSONArray("itemPriceCompetitiveDesc") != null && !liveItem.personalityData.getJSONArray("itemPriceCompetitiveDesc").isEmpty() && (jSONObject2 = liveItem.personalityData.getJSONArray("itemPriceCompetitiveDesc").getJSONObject(0)) != null && jSONObject2.containsKey("text")) {
                hashMap.put("itemPriceCompetitiveDesc", jSONObject2.getString("text"));
            }
            if (liveItem.personalityData.getJSONArray("itemServiceTagDTOList") != null) {
                String d2 = d(liveItem.personalityData.getJSONArray("itemServiceTagDTOList"), "bizType", "&", 2);
                if (!TextUtils.isEmpty(d2)) {
                    hashMap.put("serviceTypes", d2);
                }
            }
            if (liveItem.personalityData.getJSONObject("vipCardInfo") != null) {
                hashMap.put("vipAmount", liveItem.personalityData.getJSONObject("vipCardInfo").getString("vipCardAmount"));
            }
        } else {
            z3 = false;
        }
        hashMap.put("subscribe", "1_".concat(z3 ? "1" : str3));
        JSONObject jSONObject7 = liveItem.itemExtData;
        if (jSONObject7 != null) {
            hashMap.put("if_price", urf.c(jSONObject7, "hidePrice", false) ? str3 : "1");
            JSONObject jSONObject8 = liveItem.itemExtData.getJSONObject("itemListTrackData");
            if (jSONObject8 != null) {
                if (!(xeaVar == null || xeaVar.q() == null || !jSONObject8.containsKey("isStressShow"))) {
                    if (xeaVar.q().Q) {
                        str2 = "N";
                    } else {
                        str2 = "Y";
                    }
                    jSONObject8.put("isStressShow", (Object) str2);
                }
                HashMap<String, String> c = c(jSONObject8);
                if (c != null && !c.isEmpty()) {
                    hashMap.putAll(c);
                }
            }
        }
        JSONArray jSONArray2 = liveItem.native_itemBenefits;
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            if (liveItem.native_itemBenefits.getJSONObject(0) != null) {
                hashMap.put("sellatmosphere_type", liveItem.native_itemBenefits.getJSONObject(0).getString("type"));
                if (liveItem.native_itemBenefits.getJSONObject(0).getBooleanValue("needServiceTag")) {
                    str3 = "1";
                }
                hashMap.put("sellatmosphere_servicetag", str3);
            } else {
                o3s.b("GoodsTrackUtils", "native_itemBenefits is empty");
            }
        }
        JSONArray jSONArray3 = liveItem.picTopLabels;
        if (!(jSONArray3 == null || jSONArray3.isEmpty() || (jSONObject = liveItem.picTopLabels.getJSONObject(0)) == null)) {
            hashMap.put("picTopLabel", jSONObject.getString("labelType"));
        }
        String d3 = d(liveItem.itemIcons, "bizType", "&", 2);
        if (!TextUtils.isEmpty(d3)) {
            hashMap.put("nameIconTypes", d3);
        }
        hashMap.put("isNewGLPage", "1");
        LiveItem.Ext ext2 = liveItem.extendVal;
        if (!(ext2 == null || TextUtils.isEmpty(ext2.secKillInfo) || (d = fkx.d(liveItem.extendVal.secKillInfo)) == null)) {
            hashMap.put("activityType", d.getString("activityType"));
        }
        hashMap.put("showPrice", pfa.o(liveItem));
        String n = pfa.n(liveItem);
        if (!TextUtils.isEmpty(n)) {
            hashMap.put("itemPriceDesc", n);
        }
        JSONObject jSONObject9 = liveItem.nativeConfigInfos;
        if (jSONObject9 == null || !jSONObject9.containsKey("dataScene")) {
            str = "mtop";
        } else {
            str = liveItem.nativeConfigInfos.getString("dataScene");
        }
        hashMap.put("dataScene", str);
        hashMap.put("gl_version", "1");
        a(xeaVar, hashMap);
        if (!(xeaVar == null || xeaVar.H() == null)) {
            hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(xeaVar.H().status));
        }
        return hashMap;
    }
}
