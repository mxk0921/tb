package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.Globals;
import com.taobao.weex.ui.component.WXBasicComponentType;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793481);
    }

    public static String a(CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e684812", new Object[]{commonBaseDatasource});
        }
        if (commonBaseDatasource == null) {
            return "all";
        }
        if (r4p.VALUE_TAB_TMALL.equals(commonBaseDatasource.getTab())) {
            return r4p.VALUE_TAB_TMALL;
        }
        if (commonBaseDatasource.C()) {
            return "inshop";
        }
        return "all";
    }

    public static void c(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af482da5", new Object[]{auctionBaseBean});
        } else if (o4p.B1() && !TextUtils.isEmpty(auctionBaseBean.ifsUrl) && !TextUtils.isEmpty(auctionBaseBean.p4pPid)) {
            AlimamaAdvertising.instance().buildIfsExposure(Globals.getApplication(), auctionBaseBean.ifsUrl).withArgNamespace("KGB").withArgPid(auctionBaseBean.p4pPid).commit();
        }
    }

    public static void b(BaseCellBean baseCellBean, AuctionBaseBean auctionBaseBean, JSONObject jSONObject, CommonBaseDatasource commonBaseDatasource, int i, Map<String, String> map, Map<String, String> map2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b278dd1d", new Object[]{baseCellBean, auctionBaseBean, jSONObject, commonBaseDatasource, new Integer(i), map, map2});
        } else if (auctionBaseBean != null && !baseCellBean.isExposed) {
            if (auctionBaseBean.isP4p) {
                c(auctionBaseBean);
            }
            String currentPageName = c2v.getInstance().getCurrentPageName();
            HashMap hashMap = new HashMap();
            hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, auctionBaseBean.rn);
            hashMap.put("item_id", auctionBaseBean.itemId);
            hashMap.put("business", a(commonBaseDatasource));
            hashMap.put("page", String.valueOf(auctionBaseBean.page));
            hashMap.put("query", commonBaseDatasource.getKeyword());
            hashMap.put(yj4.PARAM_SEARCH_KEYWORD_POS, i + "");
            CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
            if (commonSearchResult != null) {
                hashMap.put("sessionid", commonSearchResult.getMainInfo().rn);
                if (commonSearchResult.getMainInfo().pageTraceArgs != null) {
                    String str2 = commonSearchResult.getMainInfo().pageTraceArgs.get("spm-cnt");
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace(".0.0", "");
                        hashMap.put("spm", replace + ".itemlist." + i);
                    }
                }
            }
            if (!TextUtils.isEmpty(auctionBaseBean.videoId)) {
                hashMap.put(xau.PROPERTY_VIDEO_ID, auctionBaseBean.videoId);
            }
            BaseCellBean baseCellBean2 = auctionBaseBean.mOutterBean;
            if (baseCellBean2 != null) {
                hashMap.put("pagePos", String.valueOf(baseCellBean2.pagePos));
                hashMap.put("pageSize", String.valueOf(baseCellBean2.pageSize));
            }
            Map<String, String> map3 = auctionBaseBean.utLogMap;
            if (map3 != null) {
                if (map2 != null) {
                    map3.putAll(map2);
                }
                if (commonSearchResult != null) {
                    map3.put(h1p.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
                }
                map3.put("index", String.valueOf(i));
                map3.put("rainbow", oen.j());
                map3.put(r4p.KEY_EDITION_CODE, k1p.c());
                map3.put("elderHome", String.valueOf(cvr.INSTANCE.c()));
                map3.put(r4p.KEY_GRAY_HAIR, String.valueOf("true".equals(commonBaseDatasource.getParamValue(r4p.KEY_SEARCH_ELDER_HOME_OPEN))));
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!TextUtils.equals(key, "pageName") && !TextUtils.equals(key, "spm") && !TextUtils.isEmpty(key) && value != null) {
                            map3.put(key, value.toString());
                        }
                    }
                }
                hashMap.put("utLogMap", g6p.d(JSON.toJSONString(map3)));
            }
            if (commonBaseDatasource.getUIListStyle() == ListStyle.LIST) {
                hashMap.put("style", "list");
                hashMap.put("longPicture", String.valueOf(false));
            } else {
                hashMap.put("style", WXBasicComponentType.WATERFALL);
                hashMap.put("longPicture", String.valueOf(!TextUtils.isEmpty(auctionBaseBean.wfPicUrl)));
            }
            Map<String, String> map4 = auctionBaseBean.trace;
            if (map4 != null && !map4.isEmpty()) {
                for (String str3 : auctionBaseBean.trace.keySet()) {
                    hashMap.put(str3, auctionBaseBean.trace.get(str3));
                }
            }
            if ("Page_CouponUseSrp".equalsIgnoreCase(currentPageName)) {
                str = "Page_CouponUseSrp_Button-ItemExposure";
            } else {
                str = "Search-ItemExposure";
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(currentPageName, 2201, str, "", "", hashMap).build());
            baseCellBean.isExposed = true;
        }
    }
}
