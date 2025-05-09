package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.translateUtils.OpenBizcodeTranslateBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ze2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355762);
    }

    public static OpenBizcodeTranslateBean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenBizcodeTranslateBean) ipChange.ipc$dispatch("80c5688", new Object[]{obj});
        }
        OpenBizcodeTranslateBean openBizcodeTranslateBean = new OpenBizcodeTranslateBean();
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            openBizcodeTranslateBean.liveId = jSONObject.getString("liveId");
            openBizcodeTranslateBean.coverPicUrl = jSONObject.getString("coverPicUrl");
            openBizcodeTranslateBean.roomStatus = jSONObject.getString("roomStatus");
            openBizcodeTranslateBean.livesource = jSONObject.getString("livesource");
            openBizcodeTranslateBean.sjsdItemId = jSONObject.getString(yj4.PARAM_SJSD_ITEM_ID);
            openBizcodeTranslateBean.spm = jSONObject.getString("spm");
            openBizcodeTranslateBean.entrySpm = jSONObject.getString("entrySpm");
            openBizcodeTranslateBean.highPriorityBizCode = jSONObject.getString(yj4.PARAM_HIGH_PRIORITY_BIZ_CODE);
            openBizcodeTranslateBean.isLiveMute = jSONObject.getString(yj4.PARAM_IS_LIVE_MUTE);
            openBizcodeTranslateBean.itemHoldType = jSONObject.getString(yj4.PARAM_ITEM_HOLD_TYPE);
            openBizcodeTranslateBean.holdItemIds = jSONObject.getString(yj4.PARAM_ITEM_IDS);
            openBizcodeTranslateBean.defaultCategoryId = jSONObject.getString(yj4.PARAM_CATEGORY_ID);
            openBizcodeTranslateBean.playerViewToken = jSONObject.getString("playerViewToken");
            openBizcodeTranslateBean.timeMoveId = jSONObject.getString("timeMoveId");
            openBizcodeTranslateBean.accountId = jSONObject.getString("accountId");
            openBizcodeTranslateBean.ignorePv = jSONObject.getString(yj4.PARAM_IGNORE_PV);
            openBizcodeTranslateBean.spmCnt = jSONObject.getString("spmCnt");
            openBizcodeTranslateBean.Shop2FEntryBizScene = jSONObject.getString("livePointTab3");
            openBizcodeTranslateBean.shop2fSkipTab3Url = jSONObject.getString("shop2fSkipTab3Url");
            openBizcodeTranslateBean.entryByShop2F = jSONObject.getString("entryByShop2F");
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParam");
            if (jSONObject2 != null) {
                openBizcodeTranslateBean.queryParam = jSONObject2.toJSONString();
                openBizcodeTranslateBean.coverImg = jSONObject2.getString(yj4.PARAM_COVER_IMG);
                openBizcodeTranslateBean.feedId = jSONObject2.getString("feedId");
                openBizcodeTranslateBean.accountId = jSONObject2.getString("accountId");
            }
        }
        return openBizcodeTranslateBean;
    }

    public static OpenBizcodeTranslateBean b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenBizcodeTranslateBean) ipChange.ipc$dispatch("652af73e", new Object[]{obj});
        }
        OpenBizcodeTranslateBean openBizcodeTranslateBean = new OpenBizcodeTranslateBean();
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            openBizcodeTranslateBean.liveId = jSONObject.getString("liveId");
            openBizcodeTranslateBean.coverPicUrl = jSONObject.getString("coverPicUrl");
            openBizcodeTranslateBean.roomStatus = jSONObject.getString("roomStatus");
            openBizcodeTranslateBean.livesource = jSONObject.getString("livesource");
            openBizcodeTranslateBean.sjsdItemId = jSONObject.getString(yj4.PARAM_SJSD_ITEM_ID);
            openBizcodeTranslateBean.spm = jSONObject.getString("spm");
            openBizcodeTranslateBean.entrySpm = jSONObject.getString("entrySpm");
            openBizcodeTranslateBean.highPriorityBizCode = jSONObject.getString(yj4.PARAM_HIGH_PRIORITY_BIZ_CODE);
            openBizcodeTranslateBean.isLiveMute = jSONObject.getString(yj4.PARAM_IS_LIVE_MUTE);
            openBizcodeTranslateBean.itemHoldType = jSONObject.getString(yj4.PARAM_ITEM_HOLD_TYPE);
            openBizcodeTranslateBean.holdItemIds = jSONObject.getString(yj4.PARAM_ITEM_IDS);
            openBizcodeTranslateBean.defaultCategoryId = jSONObject.getString(yj4.PARAM_CATEGORY_ID);
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParam");
            if (jSONObject2 != null) {
                openBizcodeTranslateBean.queryParam = jSONObject2.toJSONString();
                openBizcodeTranslateBean.coverImg = jSONObject2.getString(yj4.PARAM_COVER_IMG);
                openBizcodeTranslateBean.feedId = jSONObject2.getString("feedId");
                openBizcodeTranslateBean.accountId = jSONObject2.getString("accountId");
            }
        }
        return openBizcodeTranslateBean;
    }

    public static OpenBizcodeTranslateBean c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenBizcodeTranslateBean) ipChange.ipc$dispatch("99602d43", new Object[]{str, obj});
        }
        OpenBizcodeTranslateBean openBizcodeTranslateBean = new OpenBizcodeTranslateBean();
        if (d4s.e("enbaleMapToBean", true)) {
            if (!(obj instanceof JSONObject)) {
                return openBizcodeTranslateBean;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.get("queryParam") instanceof JSONObject) {
                jSONObject.putAll((JSONObject) jSONObject.get("queryParam"));
            }
            try {
                return (OpenBizcodeTranslateBean) JSON.parseObject(jSONObject.toJSONString(), OpenBizcodeTranslateBean.class);
            } catch (Exception e) {
                o3s.c("BizcodeTranslateUtils", "mapToBean error", e);
                e.printStackTrace();
                return openBizcodeTranslateBean;
            }
        } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(str)) {
            return b(obj);
        } else {
            return (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.toString().equals(str) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.toString().equals(str)) ? a(obj) : openBizcodeTranslateBean;
        }
    }
}
