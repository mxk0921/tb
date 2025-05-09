package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dvp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699169);
    }

    public static void b(xea xeaVar, LiveItem liveItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84144b9e", new Object[]{xeaVar, liveItem, new Integer(i)});
            return;
        }
        b2e o = kkr.i().o();
        if (o != null && liveItem != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("item_kind", zha.g(liveItem));
            hashMap.put("item_id", liveItem.itemId + "");
            hashMap.put("position", i + "");
            o.c("Additionitem", hashMap);
        }
    }

    public static void c(xea xeaVar, LiveItem liveItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cd63c4", new Object[]{xeaVar, liveItem, map});
            return;
        }
        b2e o = kkr.i().o();
        if (o != null && liveItem != null) {
            HashMap<String, String> e = zha.e(xeaVar, liveItem);
            if (map != null) {
                e.putAll(map);
            }
            o.c("itemwindowclick", e);
        }
    }

    public static void d(xea xeaVar, LiveItem liveItem, VideoInfo videoInfo, GLRenderType gLRenderType, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16aabfdb", new Object[]{xeaVar, liveItem, videoInfo, gLRenderType, map});
            return;
        }
        b2e o = kkr.i().o();
        if (o != null && liveItem != null && videoInfo != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (videoInfo.broadCaster != null) {
                hashMap.put("item_id", liveItem.itemId + "");
                hashMap.put("feed_id", videoInfo.liveId);
                String str = "1";
                hashMap.put(z9u.KEY_IS_FANS, videoInfo.broadCaster.follow ? str : "0");
                JSONObject jSONObject = liveItem.personalityData;
                if (jSONObject != null) {
                    a(jSONObject, hashMap);
                }
                hashMap.put("itemBizType", liveItem.extendVal.itemBizType);
                hashMap.put("seller_id", videoInfo.broadCaster.accountId);
                if ("secKill".equals(liveItem.extendVal.itemBizType)) {
                    str = "2";
                }
                hashMap.put("bubbleType", str);
                if (gLRenderType != null) {
                    hashMap.put(q0j.BIZ_CONTEXT_KEY_CARD_TYPE, gLRenderType.cpsCode);
                }
                qfa.b(hashMap, liveItem);
                hashMap.putAll(zha.e(xeaVar, liveItem));
                o.b("Show-watchshowdetail", hashMap);
            }
        }
    }

    public static void a(JSONObject jSONObject, HashMap<String, String> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243143f4", new Object[]{jSONObject, hashMap});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(g0h.f19662a);
        if (jSONArray != null && jSONArray.size() > 0 && LiveItem.LiveItemBenefitType.getLiveItemBenefitType(jSONArray.getJSONObject(0).getString("type")) == LiveItem.LiveItemBenefitType.NEW_CUSTOMER_BENEFIT) {
            hashMap.put("newcustomer", "1");
            hashMap.put("is_xxtoubiao", "1");
            hashMap.put("xxc", "tblive");
            hashMap.put("ju_id", jSONObject.getString("juId"));
            if (v2s.o().u() != null) {
                str = v2s.o().u().getUserId();
            } else {
                str = "";
            }
            hashMap.put("visitor_id", str);
        }
    }
}
