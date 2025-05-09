package tb;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.util.SearchContext;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.defaultshop.DefaultShopCellBean;
import com.taobao.tao.UrlNavStartMode;
import com.taobao.tao.util.NavUrls;
import com.ut.mini.UTAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ayf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792578);
    }

    public static String c(String str, AuctionBaseBean auctionBaseBean, Activity activity, CommonBaseDatasource commonBaseDatasource, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b930c27", new Object[]{str, auctionBaseBean, activity, commonBaseDatasource, str2});
        }
        Map<String, String> g = f6p.g(str);
        g.put("sid", Login.getSid());
        g.put("from", "shopsearch");
        String keyword = commonBaseDatasource.getKeyword();
        if (!TextUtils.isEmpty(keyword)) {
            try {
                g.put("shopsearchq", URLEncoder.encode(keyword, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        g.put("spm", str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", (Object) "shopsearch");
        if (!TextUtils.isEmpty(keyword)) {
            jSONObject.put("shopsearchq", (Object) keyword);
        }
        if (!TextUtils.isEmpty(auctionBaseBean.rn)) {
            jSONObject.put(yj4.PARAM_SEARCH_KEYWORD_RN, (Object) auctionBaseBean.rn);
        }
        jSONObject.put("bucket_id", (Object) auctionBaseBean.abtest);
        jSONObject.put("sort_tag", (Object) commonBaseDatasource.getParamValue("sort"));
        if (activity instanceof InshopResultActivity) {
            str3 = "search";
        } else {
            str3 = "allauc";
        }
        jSONObject.put("inshops", (Object) str3);
        if (!TextUtils.isEmpty(SearchContext.compassTitleForUT)) {
            jSONObject.put("reckey", (Object) SearchContext.compassTitleForUT);
        }
        g.put("track_params", jSONObject.toString());
        if (!auctionBaseBean.extraParams.isEmpty()) {
            for (Map.Entry<String, String> entry : auctionBaseBean.extraParams.entrySet()) {
                String key = entry.getKey();
                if (!g.containsKey(key)) {
                    g.put(key, entry.getValue());
                }
            }
        }
        if (!TextUtils.isEmpty(auctionBaseBean.prefetchImgRatio)) {
            g.put("prefetchImgRatio", auctionBaseBean.prefetchImgRatio);
            if (TextUtils.equals("1:1", auctionBaseBean.prefetchImgRatio)) {
                g.put("prefetchImg", auctionBaseBean.picUrl);
            } else {
                g.put("prefetchImg", auctionBaseBean.wfPicUrl);
            }
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.isUpdateUtparam) {
            g.put(yj4.PARAM_UT_PARAMS, JSON.toJSONString(auctionBaseBean.utLogMap));
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(auctionBaseBean.utLogMap));
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.clearQuery();
        for (Map.Entry<String, String> entry2 : g.entrySet()) {
            String key2 = entry2.getKey();
            String value = entry2.getValue();
            if (!TextUtils.isEmpty(key2) && !TextUtils.isEmpty(value)) {
                buildUpon.appendQueryParameter(key2, value);
            }
        }
        return buildUpon.toString();
    }

    public static String d(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb664d8", new Object[]{auctionBaseBean});
        }
        if (auctionBaseBean == null) {
            return "";
        }
        String str = auctionBaseBean.h5Url;
        if (TextUtils.isEmpty(str)) {
            return String.format(NavUrls.nav_urls_detail[1], auctionBaseBean.itemId);
        }
        return str;
    }

    public static String e(Activity activity, CommonBaseDatasource commonBaseDatasource, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb88000", new Object[]{activity, commonBaseDatasource, new Integer(i)});
        }
        if (!(activity instanceof InshopResultActivity)) {
            if (TextUtils.equals(OrangeConfig.getInstance().getConfig(o4p.SEARCH_BIZ_NAME, "enableNewAllItemSpm", "true"), "true")) {
                str = commonBaseDatasource.getParamValue("shopAuctionSpmCnt");
                new StringBuilder("Trigger Spm: ").append(str);
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                str = "a2141.7631671";
            }
            return str + ".itemlist." + i;
        } else if ("category".equals(commonBaseDatasource.getParamValue("from"))) {
            return "a2141.7631684.itemlist." + i;
        } else {
            return "a2141.11319901.itemlist." + i;
        }
    }

    public static void i(CommonBaseDatasource commonBaseDatasource, AuctionBaseBean auctionBaseBean, Map<String, String> map, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682ddf2c", new Object[]{commonBaseDatasource, auctionBaseBean, map, activity});
        } else if (commonBaseDatasource != null && (commonBaseDatasource instanceof g1i)) {
            qkn.b(auctionBaseBean.clickTrace, map, activity, -1, ((g1i) commonBaseDatasource).u());
        }
    }

    public static void j(CommonBaseDatasource commonBaseDatasource, String str, Map<String, String> map, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dcf9027", new Object[]{commonBaseDatasource, str, map, activity});
        } else if (commonBaseDatasource != null && (commonBaseDatasource instanceof g1i)) {
            qkn.b(str, map, activity, -1, ((g1i) commonBaseDatasource).u());
        }
    }

    public static void a(Activity activity, int i, DefaultShopCellBean defaultShopCellBean, org.json.JSONObject jSONObject, CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6bbff5", new Object[]{activity, new Integer(i), defaultShopCellBean, jSONObject, commonBaseDatasource});
        } else if (jSONObject != null) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
            boolean z = commonSearchResult != null && commonSearchResult.isUpdateUtparam;
            String optString = jSONObject.optString("nid");
            if (!TextUtils.isEmpty(optString)) {
                String format = String.format(NavUrls.nav_urls_detail[1], optString);
                HashMap hashMap = new HashMap();
                hashMap.put(h1p.LIST_PARAM_KEY, commonBaseDatasource.getKeyword() + "_" + defaultShopCellBean.abtest + "_" + defaultShopCellBean.rn);
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("utLogMap");
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            String optString2 = optJSONObject.optString(next);
                            if (!TextUtils.isEmpty(optString2)) {
                                hashMap.put(next, optString2);
                            }
                        }
                    }
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("s_utmap", defaultShopCellBean.getUTParams(commonBaseDatasource, i));
                if (!z) {
                    hashMap.put(yj4.PARAM_UT_PARAMS, JSON.toJSONString(hashMap2));
                } else {
                    UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
                }
                hashMap.put("spm", defaultShopCellBean.getCellSpm(commonBaseDatasource, i));
                Nav.from(activity).toUri(f6p.c(format, hashMap));
            }
        }
    }

    public static void b(Activity activity, int i, DefaultShopCellBean defaultShopCellBean, CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f0e3d6", new Object[]{activity, new Integer(i), defaultShopCellBean, commonBaseDatasource});
        } else if (defaultShopCellBean != null && !TextUtils.isEmpty(defaultShopCellBean.getSellerId())) {
            String format = String.format(NavUrls.nav_urls_shop[0], defaultShopCellBean.getSellerId());
            HashMap hashMap = new HashMap();
            hashMap.put("shopId", defaultShopCellBean.getShopId());
            hashMap.put(ShopRenderActivity.SHOP_NAVI, "allitems");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("s_utmap", defaultShopCellBean.getUTParams(commonBaseDatasource, i));
            hashMap.put(yj4.PARAM_UT_PARAMS, JSON.toJSONString(hashMap2));
            hashMap.put("spm", defaultShopCellBean.getCellSpm(commonBaseDatasource, i));
            Nav.from(activity).toUri(f6p.c(format, hashMap));
        }
    }

    public static void f(AuctionBaseBean auctionBaseBean, Activity activity, CommonBaseDatasource commonBaseDatasource, ListStyle listStyle, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403e5574", new Object[]{auctionBaseBean, activity, commonBaseDatasource, listStyle, str});
            return;
        }
        String d = d(auctionBaseBean);
        if (d != null && d.length() != 0) {
            g(auctionBaseBean, activity, commonBaseDatasource, listStyle, str);
            if (UrlNavStartMode.checkDetailMode()) {
                UrlNavStartMode.startDetailActivity(d);
                return;
            }
            String paramValue = commonBaseDatasource.getParamValue(r4p.KEY_MINI_APP_DETAIL_URL);
            if (!"true".equals(commonBaseDatasource.getParamValue(r4p.KEY_MINI_APP)) || TextUtils.isEmpty(paramValue)) {
                z = false;
            }
            b4p.a("searchminiapp", "url: " + paramValue + " isMiniApp:" + z);
            if (z) {
                String b = f6p.b(f6p.f(paramValue, "_wml_path"), "id", auctionBaseBean.itemId);
                HashMap hashMap = new HashMap();
                hashMap.put("_wml_path", b);
                hashMap.put("spm", str);
                Nav.from(activity).toUri(f6p.c(paramValue, hashMap));
                return;
            }
            String c = c(d, auctionBaseBean, activity, commonBaseDatasource, str);
            Bundle bundle = new Bundle();
            bundle.putString("item_id", auctionBaseBean.itemId);
            Nav.from(activity).withExtras(bundle).toUri(c);
        }
    }

    public static void g(AuctionBaseBean auctionBaseBean, Activity activity, CommonBaseDatasource commonBaseDatasource, ListStyle listStyle, String str) {
        String str2;
        String str3;
        String str4;
        Map<String, String> map;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f79814", new Object[]{auctionBaseBean, activity, commonBaseDatasource, listStyle, str});
            return;
        }
        if (listStyle != null) {
            str3 = auctionBaseBean.picUrl;
            if (listStyle == ListStyle.WATERFALL) {
                str2 = "wf";
                if (!TextUtils.isEmpty(auctionBaseBean.wfPicUrl) && TextUtils.isEmpty(auctionBaseBean.videoUrl)) {
                    str3 = auctionBaseBean.wfPicUrl;
                }
            } else {
                str2 = "list";
            }
        } else {
            str3 = "";
            str2 = str3;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (!TextUtils.isEmpty(str2)) {
            arrayMap.put("style", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayMap.put(mh1.PRD_PICURL, str3);
        }
        arrayMap.put("itemId", auctionBaseBean.itemId);
        if (o4p.T0() && (map = auctionBaseBean.extraParams) != null && !map.isEmpty()) {
            arrayMap.putAll(auctionBaseBean.extraParams);
        }
        i(commonBaseDatasource, auctionBaseBean, arrayMap, activity);
        ArrayMap arrayMap2 = new ArrayMap();
        if (!TextUtils.isEmpty(str2)) {
            arrayMap2.put("style", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayMap2.put(mh1.PRD_PICURL, str3);
        }
        String paramValue = commonBaseDatasource.getParamValue(r4p.KEY_MINI_APP_DETAIL_URL);
        if (!"true".equals(commonBaseDatasource.getParamValue(r4p.KEY_MINI_APP)) || TextUtils.isEmpty(paramValue)) {
            z = false;
        }
        arrayMap2.put("item_id", auctionBaseBean.itemId);
        String paramValue2 = commonBaseDatasource.getParamValue("sellerId");
        arrayMap2.put("seller_Id", paramValue2);
        arrayMap2.put("sellerId", paramValue2);
        arrayMap2.put("bucket_id", auctionBaseBean.abtest);
        arrayMap2.put(r4p.KEY_MINI_APP, String.valueOf(z));
        if (activity instanceof InshopResultActivity) {
            str4 = "search";
        } else {
            str4 = "allauc";
        }
        arrayMap2.put("inshops", str4);
        arrayMap2.put("spm", str);
        arrayMap2.put("utLogMap", f6p.d(JSON.toJSONString(auctionBaseBean.utLogMap)));
        CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        if (commonSearchResult != null) {
            arrayMap2.put("pageid", commonSearchResult.getMainInfo().rn);
        }
        sen.f("Item", arrayMap2);
    }

    public static void h(JSONObject jSONObject, Activity activity, CommonBaseDatasource commonBaseDatasource, ListStyle listStyle, Map<String, String> map, String str) {
        String str2;
        Object obj;
        boolean z;
        Object obj2;
        JSONArray jSONArray;
        boolean z2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85a662d", new Object[]{jSONObject, activity, commonBaseDatasource, listStyle, map, str});
            return;
        }
        Bundle bundle = new Bundle();
        String string = jSONObject.getString("item_id");
        if (TextUtils.isEmpty(string)) {
            string = jSONObject.getString("nid");
        }
        bundle.putString("item_id", string);
        CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        boolean z3 = commonSearchResult != null && commonSearchResult.isUpdateUtparam;
        String format = String.format(NavUrls.nav_urls_detail[1], string);
        String string2 = jSONObject.getString("h5Url");
        if (!TextUtils.isEmpty(string2)) {
            format = string2;
        }
        if (!(format == null || format.length() == 0)) {
            if (UrlNavStartMode.checkDetailMode()) {
                UrlNavStartMode.startDetailActivity(format);
                return;
            }
            String sid = Login.getSid();
            if (sid != null) {
                format = format + "&sid=" + sid;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("from", "shopsearch");
            String str5 = format + "&from=shopsearch";
            String keyword = commonBaseDatasource.getKeyword();
            if (!TextUtils.isEmpty(keyword)) {
                try {
                    str5 = str5 + "&shopsearchq=" + URLEncoder.encode(keyword, "UTF-8");
                    hashMap.put("shopsearchq", keyword);
                } catch (UnsupportedEncodingException unused) {
                }
            }
            if (map != null) {
                String str6 = map.get(yj4.PARAM_SEARCH_KEYWORD_RN);
                if (!TextUtils.isEmpty(str6)) {
                    hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, str6);
                }
                str2 = map.get(TBSearchChiTuJSBridge.ABTEST);
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("bucket_id", str2);
                }
            } else {
                str2 = "";
            }
            String str7 = "";
            hashMap.put("sort_tag", commonBaseDatasource.getParamValue("sort"));
            b4p.a("ShopGoodsContentController", "埋点：" + commonBaseDatasource.getParamValue("sort"));
            boolean z4 = activity instanceof InshopResultActivity;
            String str8 = "allauc";
            if (z4) {
                str8 = "search";
                str3 = str8;
            } else {
                str3 = "search";
            }
            hashMap.put("inshops", str8);
            if (!TextUtils.isEmpty(SearchContext.compassTitleForUT)) {
                obj = "inshops";
                hashMap.put("reckey", SearchContext.compassTitleForUT);
            } else {
                obj = "inshops";
            }
            JSONObject jSONObject2 = new JSONObject(hashMap);
            String str9 = str5 + "&track_params=" + jSONObject2.toString();
            if (!TextUtils.isEmpty(str)) {
                str9 = str9 + "&spm=" + str;
            }
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            if (listStyle != null) {
                String string3 = jSONObject.getString(mh1.PRD_PICURL);
                if (!TextUtils.isEmpty(string3)) {
                    str7 = kme.a(mqq.c(string3));
                }
                z = z4;
                if (listStyle == ListStyle.WATERFALL) {
                    String string4 = jSONObject.getString(mh1.PRD_WF_PICURL);
                    String string5 = jSONObject.getString("videoUrl");
                    str4 = "wf";
                    if (!TextUtils.isEmpty(string4) && TextUtils.isEmpty(string5)) {
                        str7 = mqq.c(string4);
                    }
                } else {
                    str4 = "list";
                }
                obj2 = "bucket_id";
                arrayMap2.put("style", str4);
                arrayMap2.put(mh1.PRD_PICURL, str7);
                arrayMap.put("style", str4);
                arrayMap.put(mh1.PRD_PICURL, str7);
            } else {
                obj2 = "bucket_id";
                z = z4;
            }
            arrayMap.put("itemId", string);
            j(commonBaseDatasource, jSONObject.getString(mh1.CLICK_TRACE), arrayMap, activity);
            try {
                jSONArray = jSONObject.getJSONArray("extraParams");
            } catch (Exception unused2) {
                jSONArray = null;
            }
            if (jSONArray == null || jSONArray.isEmpty()) {
                z2 = true;
            } else {
                Map<String, String> g = f6p.g(str9);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    if (jSONObject3 == null) {
                        jSONArray = jSONArray;
                    } else {
                        jSONArray = jSONArray;
                        String string6 = jSONObject3.getString("key");
                        if (!g.containsKey(string6)) {
                            size = size;
                            g.put(string6, jSONObject3.getString("value"));
                        }
                    }
                    size = size;
                }
                z2 = true;
                Uri.Builder buildUpon = Uri.parse(str9).buildUpon();
                buildUpon.clearQuery();
                for (Map.Entry<String, String> entry : g.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                str9 = buildUpon.toString();
            }
            HashMap hashMap2 = new HashMap();
            String string7 = jSONObject.getString("prefetchImgRatio");
            if (!TextUtils.isEmpty(string7)) {
                hashMap2.put("prefetchImgRatio", string7);
                if (TextUtils.equals("1:1", string7)) {
                    String string8 = jSONObject.getString(mh1.PRD_PICURL);
                    if (!TextUtils.isEmpty(string8)) {
                        hashMap2.put("prefetchImg", kme.a(mqq.c(string8)));
                    }
                } else {
                    String string9 = jSONObject.getString(mh1.PRD_WF_PICURL);
                    if (!TextUtils.isEmpty(string9)) {
                        hashMap2.put("prefetchImg", mqq.c(string9));
                    }
                }
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("utLogMap");
            if (!z3 && map != null) {
                jSONObject4.put("srp_seq", (Object) String.valueOf(map.get(ls7.INFO_PAGE_NUMBER)));
                jSONObject4.put("srp_pos", (Object) String.valueOf(map.get("pagePos")));
                hashMap2.put(yj4.PARAM_UT_PARAMS, JSON.toJSONString(jSONObject4));
            }
            String c = f6p.c(str9, hashMap2);
            String paramValue = commonBaseDatasource.getParamValue(r4p.KEY_MINI_APP_DETAIL_URL);
            if (!"true".equals(commonBaseDatasource.getParamValue(r4p.KEY_MINI_APP)) || TextUtils.isEmpty(paramValue)) {
                z2 = false;
            }
            b4p.a("searchminiapp", "url: " + paramValue + " isMiniApp:" + z2);
            arrayMap2.put("item_id", string);
            String paramValue2 = commonBaseDatasource.getParamValue("sellerId");
            arrayMap2.put("seller_Id", paramValue2);
            arrayMap2.put("sellerId", paramValue2);
            arrayMap2.put(obj2, str2);
            arrayMap2.put(r4p.KEY_MINI_APP, String.valueOf(z2));
            if (!z) {
                str3 = str8;
            }
            arrayMap2.put(obj, str3);
            arrayMap2.put("spm", str);
            arrayMap2.put("utLogMap", f6p.d(JSON.toJSONString(jSONObject4)));
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
            if (commonSearchResult2 != null) {
                arrayMap2.put("pageid", commonSearchResult2.getMainInfo().rn);
            }
            sen.f("Item", arrayMap2);
            if (z3) {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(jSONObject4));
            }
            if (z2) {
                String b = f6p.b(f6p.b(paramValue, "_wml_path", f6p.b(f6p.f(paramValue, "_wml_path"), "id", string)), "spm", str);
                b4p.a("searchminiapp", "final url: " + b);
                Nav.from(activity).toUri(b);
                return;
            }
            Nav.from(activity).withExtras(bundle).toUri(c);
        }
    }
}
