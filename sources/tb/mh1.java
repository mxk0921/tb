package tb;

import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mh1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_TRACE = "clickTrace";
    public static final String EXTRA_PARAMS = "extraParams";
    public static final String P4P_CONTENT_URL = "p4pContentUrl";
    public static final String PRD_CREDIT = "ratesum";
    public static final String PRD_H5URL = "h5Url";
    public static final String PRD_ICON_LIST = "iconList";
    public static final String PRD_IS_DYNAMIC_LAND_P4P = "isDynamicLandP4p";
    public static final String PRD_IS_P4P = "isP4p";
    public static final String PRD_ITEM_ID = "item_id";
    public static final String PRD_LOCATION = "location";
    public static final String PRD_NEW_DSR = "newDsr";
    public static final String PRD_NICK = "nick";
    public static final String PRD_O2O_SHOP_ID = "o2oShopId";
    public static final String PRD_P4P_URL = "clickUrl";
    public static final String PRD_PICURL = "pic_path";
    public static final String PRD_POSTFEE = "fastPostFee";
    public static final String PRD_REALSALES = "realSales";
    public static final String PRD_SAME_COUNT = "sameCount";
    public static final String PRD_SELLED = "sold";
    public static final String PRD_SIMILAR_COUNT = "similarCount";
    public static final String PRD_SIMILAR_URL = "similarURL";
    public static final String PRD_SPU_ID = "spuId";
    public static final String PRD_SUMMARY_TIP = "summaryTips";
    public static final String PRD_TITLE = "title";
    public static final String PRD_UNIQPID = "uniqpid";
    public static final String PRD_USERID = "userId";
    public static final String PRD_USER_TYPE = "userType";
    public static final String PRD_WF_PICURL = "uprightImg";
    public static final String PRD_WF_TITLE = "wfTitle";
    public static final String PRE_TITLE_COLOR = "pre_title_color";
    public static final String PRE_TITLE_TEXT = "pre_title";
    public static final String PRICE = "price";
    public static final String PRICE_BLOCK = "priceShow";
    public static final String PRICE_PREFIX = "preText";
    public static final String PRICE_SUFFIX = "suffixText";
    public static final String PRICE_UNIT = "unit";
    public static final String USER_TYPE_MALL = "1";
    public static final String VIDEO_URL = "videoUrl";

    static {
        t2o.a(815792525);
    }

    public static void c(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6380ceb6", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("jarvisData");
        if (optJSONObject != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    hashMap.put(next, optString);
                }
            }
            hashMap.put(CLICK_TRACE, auctionBaseBean.clickTrace);
            auctionBaseBean.jarvisData = hashMap;
        }
    }

    public static void e(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4be80b", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(PRICE_BLOCK);
        if (optJSONObject != null) {
            auctionBaseBean.pricePrefix = optJSONObject.optString(PRICE_PREFIX);
            auctionBaseBean.priceUnit = optJSONObject.optString(PRICE_UNIT);
            auctionBaseBean.price = optJSONObject.optString("price");
        }
        auctionBaseBean.localPrice = jSONObject.optString("localPrice");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("priceShowWithIcon");
        if (optJSONObject2 != null) {
            auctionBaseBean.priceIconUrl = optJSONObject2.optString("iconUrl");
            auctionBaseBean.priceIconWidth = optJSONObject2.optInt("iconWidth");
            auctionBaseBean.priceIconHeight = optJSONObject2.optInt("iconHeight");
            auctionBaseBean.priceColor = optJSONObject2.optString("priceColor");
            auctionBaseBean.priceIconSuffixText = optJSONObject2.optString(PRICE_SUFFIX);
            auctionBaseBean.priceIconSuffixColor = optJSONObject2.optString("suffixColor");
            auctionBaseBean.originPrice = optJSONObject2.optString("originPrice");
            auctionBaseBean.hidePriceUndline = optJSONObject2.optBoolean("hiddenPriceUnderline");
        }
    }

    public static void f(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f054e3de", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("trace");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(optString)) {
                    auctionBaseBean.trace.put(next, optString);
                }
            }
        }
    }

    public static void h(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da23655", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        String optString = jSONObject.optString("imageUrl");
        auctionBaseBean.showVideoIcon = true;
        auctionBaseBean.videoIcon = optString;
    }

    public static AuctionBaseBean a(JSONObject jSONObject, AuctionBaseBean auctionBaseBean, Map<String, SearchDomBean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionBaseBean) ipChange.ipc$dispatch("b99cd0ec", new Object[]{jSONObject, auctionBaseBean, map});
        }
        auctionBaseBean.title = mqq.c(jSONObject.optString("title"));
        auctionBaseBean.wfTitle = jSONObject.optString(PRD_WF_TITLE);
        auctionBaseBean.preTitleText = jSONObject.optString(PRE_TITLE_TEXT);
        auctionBaseBean.preTitleColor = jSONObject.optString(PRE_TITLE_COLOR);
        e(auctionBaseBean, jSONObject);
        auctionBaseBean.postFee = mqq.c(jSONObject.optString(PRD_POSTFEE));
        auctionBaseBean.picUrl = kme.a(mqq.c(jSONObject.optString(PRD_PICURL)));
        auctionBaseBean.wfPicUrl = mqq.c(jSONObject.optString(PRD_WF_PICURL));
        String optString = jSONObject.optString("uprightImgAspectRatio");
        auctionBaseBean.uprightImgAspectRatio = optString;
        if (TextUtils.isEmpty(optString)) {
            auctionBaseBean.uprightImgAspectRatio = "0.66";
        }
        auctionBaseBean.selled = mqq.c(jSONObject.optString(PRD_SELLED));
        auctionBaseBean.realSales = jSONObject.optString(PRD_REALSALES);
        auctionBaseBean.h5Url = mqq.c(jSONObject.optString("h5Url"));
        String c = mqq.c(jSONObject.optString(PRD_ICON_LIST));
        if (!TextUtils.isEmpty(c)) {
            Collections.addAll(auctionBaseBean.iconSet, c.split(","));
        }
        if (map != null) {
            y48.a(jSONObject, auctionBaseBean.titleIconList, auctionBaseBean.listIconArray, auctionBaseBean.waterfallIconArray, auctionBaseBean.videoIconList, map);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("summaryTips");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                if (!optJSONArray.isNull(i)) {
                    String optString2 = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString2)) {
                        arrayList.add(optString2);
                    }
                }
            }
            auctionBaseBean.summaryTipList = arrayList;
        }
        auctionBaseBean.o2oShopId = mqq.c(jSONObject.optString(PRD_O2O_SHOP_ID));
        String optString3 = jSONObject.optString("item_id");
        auctionBaseBean.itemId = optString3;
        if (TextUtils.isEmpty(optString3)) {
            auctionBaseBean.itemId = jSONObject.optString("nid");
        }
        auctionBaseBean.isP4p = jSONObject.optBoolean(PRD_IS_P4P);
        auctionBaseBean.p4pUrl = jSONObject.optString(PRD_P4P_URL);
        auctionBaseBean.p4pContentUrl = jSONObject.optString(P4P_CONTENT_URL);
        auctionBaseBean.ifsUrl = jSONObject.optString("ifsUrl");
        auctionBaseBean.p4pPid = jSONObject.optString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        auctionBaseBean.daySold = jSONObject.optString("daySold");
        auctionBaseBean.shopCoupon = jSONObject.optString("inShopCoupon");
        auctionBaseBean.clickTrace = jSONObject.optString(CLICK_TRACE);
        b(auctionBaseBean, jSONObject);
        g(auctionBaseBean, jSONObject);
        Map<String, String> map2 = auctionBaseBean.utLogMap;
        map2.put("x_object_type", "item");
        map2.put("x_object_type_search", "item");
        map2.put("x_object_id", auctionBaseBean.itemId);
        JSONObject optJSONObject = jSONObject.optJSONObject("utLogMap");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString4 = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString4)) {
                    map2.put(next, optString4);
                }
            }
        }
        f(auctionBaseBean, jSONObject);
        auctionBaseBean.locType = jSONObject.optString(r4p.KEY_LOC_TYPE);
        c(auctionBaseBean, jSONObject);
        auctionBaseBean.prefetchImgRatio = jSONObject.optString("prefetchImgRatio");
        d(auctionBaseBean, jSONObject);
        return auctionBaseBean;
    }

    public static void b(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3624d137", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("extraParams");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("key");
                    String optString2 = optJSONObject.optString("value");
                    if (!TextUtils.isEmpty(optString)) {
                        auctionBaseBean.extraParams.put(optString, optString2);
                    }
                }
            }
        }
    }

    public static void d(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9cb6c3", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("leftSuperScriptInfo");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            auctionBaseBean.showVideoIcon = false;
            auctionBaseBean.videoIcon = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("fieldTemplate");
                    if (!TextUtils.isEmpty(optString)) {
                        optString.hashCode();
                        if (optString.equals("videoIcon")) {
                            h(auctionBaseBean, optJSONObject);
                        }
                    }
                }
            }
        }
    }

    public static void g(AuctionBaseBean auctionBaseBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ff23bc", new Object[]{auctionBaseBean, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject != null) {
            auctionBaseBean.showVideoIcon = optJSONObject.optBoolean("showIcon");
            String optString = optJSONObject.optString("videoUrl");
            String optString2 = optJSONObject.optString("videoDimension");
            String optString3 = optJSONObject.optString("videoId");
            String optString4 = optJSONObject.optString("iconUrl");
            String a2 = kme.a(mqq.c(optJSONObject.optString(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL)));
            optJSONObject.optInt("playTimes");
            if (!TextUtils.isEmpty(optString3) || !TextUtils.isEmpty(optString)) {
                auctionBaseBean.videoIcon = optString4;
                int indexOf = optString2.indexOf(58);
                if (indexOf != -1) {
                    try {
                        int parseInt = Integer.parseInt(optString2.substring(0, indexOf));
                        int parseInt2 = Integer.parseInt(optString2.substring(indexOf + 1, optString2.length()));
                        auctionBaseBean.videoUrl = optString;
                        auctionBaseBean.videoId = optString3;
                        auctionBaseBean.videoWidth = parseInt;
                        auctionBaseBean.videoHeight = parseInt2;
                        auctionBaseBean.videoCover = a2;
                    } catch (Exception unused) {
                        b4p.e("AuctionParser", "videoDimension=".concat(optString2));
                    }
                }
            }
        }
    }
}
