package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class txk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093042);
    }

    public Map<OpenAbilityCompontentTypeEnum, sxk> a(jbt jbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b5b4399", new Object[]{this, jbtVar});
        }
        HashMap hashMap = new HashMap();
        if (jbtVar != null) {
            Object obj = jbtVar.c;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent;
                JSONObject jSONObject = (JSONObject) map.get(openAbilityCompontentTypeEnum);
                if (!(jSONObject == null || jSONObject.getJSONObject("extConfigMap") == null)) {
                    hashMap.putAll(new sxk(openAbilityCompontentTypeEnum, jSONObject.getBoolean("enable").booleanValue(), jSONObject.getJSONObject("extConfigMap").getJSONObject("json").toJSONString()).a());
                }
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum2 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap;
                JSONObject jSONObject2 = (JSONObject) map.get(openAbilityCompontentTypeEnum2);
                if (!(jSONObject2 == null || jSONObject2.getJSONObject("extConfigMap") == null)) {
                    hashMap.putAll(new sxk(openAbilityCompontentTypeEnum2, jSONObject2.getBoolean("enable").booleanValue(), jSONObject2.getJSONObject("extConfigMap").getJSONObject("json").toJSONString()).a());
                }
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum3 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum3), openAbilityCompontentTypeEnum3, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum4 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Link;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum4), openAbilityCompontentTypeEnum4, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum5 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PaiMai;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum5), openAbilityCompontentTypeEnum5, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum6 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Ubee;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum6), openAbilityCompontentTypeEnum6, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum7 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Goods_Highlight_Frame;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum7), openAbilityCompontentTypeEnum7, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum8 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum8), openAbilityCompontentTypeEnum8, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum9 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PCG;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum9), openAbilityCompontentTypeEnum9, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum10 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Reward;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum10), openAbilityCompontentTypeEnum10, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum11 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_NegativeFeedback;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum11), openAbilityCompontentTypeEnum11, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum12 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideShowVideoError;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum12), openAbilityCompontentTypeEnum12, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum13 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandom;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum13), openAbilityCompontentTypeEnum13, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum14 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideReplayLive;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum14), openAbilityCompontentTypeEnum14, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum15 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideHiglightLive;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum15), openAbilityCompontentTypeEnum15, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum16 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Container_HideCloseICON;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum16), openAbilityCompontentTypeEnum16, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum17 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Hide_Half_Detail;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum17), openAbilityCompontentTypeEnum17, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum18 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_Scrolle;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum18), openAbilityCompontentTypeEnum18, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum19 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_AVATAR_COMMENT_MIX;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum19), openAbilityCompontentTypeEnum19, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum20 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_BackwardTips;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum20), openAbilityCompontentTypeEnum20, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum21 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_RecommendDXCard;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum21), openAbilityCompontentTypeEnum21, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum22 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PV_BYSELF;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum22), openAbilityCompontentTypeEnum22, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum23 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Enable_Perception_Half_Detail_By_Event;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum23), openAbilityCompontentTypeEnum23, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum24 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_EnableResetMuteFromSettingWhenResume;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum24), openAbilityCompontentTypeEnum24, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum25 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_Finish;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum25), openAbilityCompontentTypeEnum25, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum26 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TOP_MASK;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum26), openAbilityCompontentTypeEnum26, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum27 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_AddCustomPageExtParams;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum27), openAbilityCompontentTypeEnum27, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum28 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_SpecialSmallWindow;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum28), openAbilityCompontentTypeEnum28, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum29 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum29), openAbilityCompontentTypeEnum29, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum30 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopLeftOrder;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum30), openAbilityCompontentTypeEnum30, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum31 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopMask;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum31), openAbilityCompontentTypeEnum31, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum32 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TabUnselectedReportLiveEnd;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum32), openAbilityCompontentTypeEnum32, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum33 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandomAndRefreshLiveRoom;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum33), openAbilityCompontentTypeEnum33, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum34 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_ReplayStatusShowLiveEnd;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum34), openAbilityCompontentTypeEnum34, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum35 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_RefreshOrRemoveLiveRoomWhenVisible;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum35), openAbilityCompontentTypeEnum35, hashMap);
                OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum36 = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive;
                b((JSONObject) map.get(openAbilityCompontentTypeEnum36), openAbilityCompontentTypeEnum36, hashMap);
            }
        }
        return hashMap;
    }

    public final void b(JSONObject jSONObject, OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum, Map<OpenAbilityCompontentTypeEnum, sxk> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63563128", new Object[]{this, jSONObject, openAbilityCompontentTypeEnum, map});
        } else if (jSONObject != null) {
            map.putAll(new sxk(openAbilityCompontentTypeEnum, jSONObject.getBoolean("enable").booleanValue(), jSONObject.getJSONObject("extConfigMap")).a());
        } else {
            map.putAll(new sxk(openAbilityCompontentTypeEnum, false, null).a());
        }
    }
}
