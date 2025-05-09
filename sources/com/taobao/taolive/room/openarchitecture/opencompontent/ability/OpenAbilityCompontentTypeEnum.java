package com.taobao.taolive.room.openarchitecture.opencompontent.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum OpenAbilityCompontentTypeEnum {
    TLOAbilityIdentifer_LRComponent,
    TLOAbilityIdentifer_MiniPlayer,
    TLOAbilityIdentifer_Link,
    TLOAbilityIdentifer_PaiMai,
    TLOAbilityIdentifer_Ubee,
    TLOAbilityIdentifer_Goods_Highlight_Frame,
    TLOAbilityIdentifer_Horizontal_live_rotate,
    TLOAbilityIdentifer_Reward,
    TLOAbilityIdentifer_PCG,
    TLOAbilityIdentifer_NegativeFeedback,
    TLOAbilityIdentifer_HideShowVideoError,
    TLOAbilityIdentifer_HideFandom,
    TLOAbilityIdentifer_HideReplayLive,
    TLOAbilityIdentifer_HideHiglightLive,
    TLOAbilityIdentifer_Container_HideCloseICON,
    TLOAbilityIdentifer_Hide_Half_Detail,
    TLOAbilityIdentifer_Horizontal_Scrolle,
    TLOAbilityIdentifer_Disable_AVATAR_COMMENT_MIX,
    TLOAbilityIdentifer_Disable_BackwardTips,
    TLOAbilityIdentifer_PV_BYSELF,
    TLOAbilityIdentifer_TOP_MASK,
    TLOAbilityIdentifer_Disable_RecommendDXCard,
    TLOAbilityIdentifer_Enable_Perception_Half_Detail_By_Event,
    TLOAbilityIdentifer_EnableResetMuteFromSettingWhenResume,
    TLOAbilityIdentifer_Disable_Finish,
    TLOAbilityIdentifer_AddCustomPageExtParams,
    TLOAbilityIdentifer_SpecialSmallWindow,
    TLOAbilityIdentifer_CustomizedToast,
    TLOAbilityIdentifer_CustomizedTopLeftOrder,
    TLOAbilityIdentifer_CustomizedTopMask,
    TLOAbilityIdentifer_TabUnselectedReportLiveEnd,
    TLOAbilityIdentifer_ReplayStatusShowLiveEnd,
    TLOAbilityIdentifer_HideFandomAndRefreshLiveRoom,
    TLOAbilityIdentifer_CustomizedMoreLive,
    TLOAbilityIdentifer_RefreshOrRemoveLiveRoomWhenVisible,
    TLOAbilityIdentifer_LRCommentFeatMap,
    TLOAbilityIdentifer_CustomizedSimpleLive;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/opencompontent/ability/OpenAbilityCompontentTypeEnum");
    }

    public static OpenAbilityCompontentTypeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenAbilityCompontentTypeEnum) ipChange.ipc$dispatch("1868d8dd", new Object[]{str});
        }
        return (OpenAbilityCompontentTypeEnum) Enum.valueOf(OpenAbilityCompontentTypeEnum.class, str);
    }
}
