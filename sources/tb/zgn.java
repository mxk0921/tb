package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.RateInfoV2;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class zgn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public final JSONObject a(RateInfo rateInfo) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("208e89e5", new Object[]{this, rateInfo});
        }
        JSONObject jSONObject3 = new JSONObject();
        if (rateInfo != null) {
            String valueOf = String.valueOf(rateInfo.getFeedId());
            String itemId = rateInfo.getItemId();
            if (itemId == null) {
                itemId = "";
            }
            String shopId = rateInfo.getShopId();
            if (shopId == null) {
                shopId = "";
            }
            String sellerId = rateInfo.getSellerId();
            if (sellerId == null) {
                sellerId = "";
            }
            String commentCount = rateInfo.getCommentCount();
            if (commentCount == null) {
                commentCount = "0";
            }
            String valueOf2 = String.valueOf(rateInfo.getInvokeSource());
            String valueOf3 = String.valueOf(rateInfo.getFoldFlag());
            String selectTag = rateInfo.getSelectTag();
            if (selectTag == null) {
                selectTag = "";
            }
            String expression = rateInfo.getExpression();
            if (expression == null) {
                expression = "";
            }
            JSONObject detailRate = rateInfo.getDetailRate();
            JSONObject itemInfo = rateInfo.getItemInfo();
            Object json = JSON.toJSON(rateInfo.getRateKeywordList());
            if (!(json instanceof JSONArray)) {
                json = null;
            }
            JSONArray jSONArray2 = (JSONArray) json;
            JSONObject skuInfo = rateInfo.getSkuInfo();
            if (TextUtils.isEmpty(selectTag) || TextUtils.isEmpty(expression)) {
                jSONArray = jSONArray2;
                jSONObject = null;
            } else {
                jSONArray = jSONArray2;
                jSONObject = new JSONObject();
                jSONObject.put(TaoliveSearchHotWords.TYPE_WORD, (Object) selectTag);
                jSONObject.put("attribute", (Object) expression);
            }
            JSONObject jSONObject4 = new JSONObject();
            String questionText = rateInfo.getQuestionText();
            if (questionText == null) {
                questionText = "";
            }
            jSONObject4.put("askText", (Object) questionText);
            String questionIcon = rateInfo.getQuestionIcon();
            if (questionIcon == null) {
                questionIcon = "";
            }
            jSONObject4.put("askIcon", (Object) questionIcon);
            String questionLink = rateInfo.getQuestionLink();
            if (questionLink == null) {
                questionLink = "";
            }
            jSONObject4.put("linkUrl", (Object) questionLink);
            JSONObject exParams = rateInfo.getExParams();
            if (exParams != null) {
                jSONObject2 = detailRate;
            } else {
                exParams = new JSONObject();
                jSONObject2 = detailRate;
                exParams.put(RateInfoV2.KEY_NAV_TIME_MS, (Object) Long.valueOf(rateInfo.getNavTimeMS()));
                exParams.put(RateInfoV2.KEY_CLICK_TIME_MS, (Object) Long.valueOf(rateInfo.getClickTimeMS()));
                String str = rateInfo.openMode;
                if (str == null) {
                    str = "default";
                }
                exParams.put(RateInfoV2.KEY_OPEN_MODE, (Object) str);
            }
            exParams.put(RateInfoV2.KEY_NAV_TIME_MS, (Object) Long.valueOf(rateInfo.getNavTimeMS()));
            exParams.put(RateInfoV2.KEY_CLICK_TIME_MS, (Object) Long.valueOf(rateInfo.getClickTimeMS()));
            String str2 = rateInfo.openMode;
            if (str2 == null) {
                str2 = "default";
            }
            exParams.put(RateInfoV2.KEY_OPEN_MODE, (Object) str2);
            exParams.put("rateType", (Object) qrf.m(exParams, "rateType", ""));
            jSONObject3.put((JSONObject) "feedId", valueOf);
            jSONObject3.put((JSONObject) "itemId", itemId);
            jSONObject3.put((JSONObject) "shopId", shopId);
            jSONObject3.put((JSONObject) "sellerId", sellerId);
            jSONObject3.put((JSONObject) "commentCount", commentCount);
            jSONObject3.put((JSONObject) "itemInfo", (String) itemInfo);
            jSONObject3.put((JSONObject) "keyword", (String) jSONObject);
            jSONObject3.put((JSONObject) "invokeSource", valueOf2);
            jSONObject3.put((JSONObject) "detailRate", (String) jSONObject2);
            jSONObject3.put((JSONObject) "rateKeywordList", (String) jSONArray);
            jSONObject3.put((JSONObject) "skuInfo", (String) skuInfo);
            jSONObject3.put((JSONObject) "askInfo", (String) jSONObject4);
            jSONObject3.put((JSONObject) "exParams", (String) exParams);
            jSONObject3.put((JSONObject) "foldFlag", valueOf3);
            JSONObject rateExtParams = rateInfo.getRateExtParams();
            if (rateExtParams != null) {
                String m = qrf.m(rateExtParams, "invokeSource", "-1");
                if (ckf.b(m, "12") || rateInfo.getInvokeSource() == Integer.parseInt("12")) {
                    for (Map.Entry<String, Object> entry : rateExtParams.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!jSONObject3.containsKey(key) || jSONObject3.get(key) == null) {
                            jSONObject3.put((JSONObject) key, (String) value);
                        }
                    }
                    String m2 = qrf.m(rateExtParams, DXTraceUtil.TYPE_EXPRESSION_STRING, "");
                    String m3 = qrf.m(rateExtParams, "mselectTag", "");
                    if (!TextUtils.isEmpty(m2) && !TextUtils.isEmpty(m3)) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(TaoliveSearchHotWords.TYPE_WORD, (Object) m3);
                        jSONObject5.put("attribute", (Object) m2);
                        jSONObject3.put((JSONObject) "keyword", (String) jSONObject5);
                    }
                } else if (ckf.b(m, "13")) {
                    jSONObject3.put((JSONObject) "invokeSource", valueOf2);
                }
            }
        }
        return jSONObject3;
    }
}
