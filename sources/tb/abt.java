package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.H5PlatfomListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class abt extends bbt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String n = abt.class.getSimpleName();
    public JSONObject b;
    public final String c = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"HideHiglightLive\":{\"enable\":true,\"identifer\":\"HideHiglightLive\"}},{\"HideFandom\":{\"enable\":true,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":true,\"identifer\":\"HideReplayLive\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"HideVideoShowError\":{\"enable\":true,\"identifer\":\"HideVideoShowError\"}},{\"Link\":{\"enable\":false,\"identifer\":\"Link\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"PaiMai\":{\"enable\":false,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":false,\"identifer\":\"Ubee\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"WatchNum\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"},{\"cName\":\"FansPush\"},{\"cName\":\"LeftNotice\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"}]},{\"cName\":\"BCLinkWatch\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}}]}";
    public final String d = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}]}";
    public final String e = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":true,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":true,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":true,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"AccountInfo\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"ReportLiveRoom\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"},{\"cName\":\"FansPush\"},{\"cName\":\"LeftNotice\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":true,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}}]}";
    public final String f = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":true,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":true,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":true,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"WatchNum\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"ReportLiveRoom\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"},{\"cName\":\"FansPush\"},{\"cName\":\"LeftNotice\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":true,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}}]}";
    public final String g = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":false,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":false,\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":true,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":true,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":true,\"identifer\":\"HorizontalScrolle\"}}]}";
    public final String h = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":false,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":true,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"AccountInfo\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"InteractionEntrance\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":true,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":true,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":true,\"identifer\":\"HorizontalScrolle\"}}]}";
    public final String i = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":false,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":false,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":false,\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":false,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":true,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":true,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":true,\"identifer\":\"HorizontalScrolle\"}}]}";
    public final String j = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":false,\"identifer\":\"MiniPlayer\"},\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"}]},{\"cName\":\"BottomGroup\",\"cList\":[]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"CleanScreen\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":false,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":false,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":true,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":false,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":false,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":false,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":true,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":false,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":false,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":false,\"identifer\":\"HorizontalScrolle\"}},{\"LRCommentFeatMap\": {\"enable\": true,\"extConfigMap\": {\"json\": {\"disableShopAtmosphere\":true,\"disableFusionComment\":true,\"disableAiResp\":true,\"disableCommentButton\":true,\"disableCommentInteraction\":true,\"disableAtmosphere\":true}}, \"identifer\": \"LRCommentFeatMap\"}},{\"CustomizedSimpleLive\":{\"enable\":true,\"identifer\":\"CustomizedSimpleLive\"}},{\"ReplayStatusShowLiveEnd\":{\"enable\":true,\"identifer\":\"ReplayStatusShowLiveEnd\"}}]}";
    public final String k = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":false,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"AccountInfo\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"},{\"cName\":\"FansPush\"},{\"cName\":\"LeftNotice\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":false,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"HorizontalScrolle\":{\"enable\":false,\"identifer\":\"HorizontalScrolle\"}}]}";
    public final String l = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"EnablePerceptionHalfDetailByEvent\":{\"enable\":true,\"identifer\":\"EnablePerceptionHalfDetailByEvent\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":false,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"AccountInfo\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"ReportLiveRoom\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"},{\"cName\":\"FansPush\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"},{\"cName\":\"Tab2LiveMoreEntrance\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":false,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"DisableFinish\":{\"enable\":true,\"identifer\":\"DisableFinish\"}},{\"EnableResetMuteFromSettingWhenResume\":{\"enable\":true,\"identifer\":\"EnableResetMuteFromSettingWhenResume\"}},{\"HorizontalScrolle\":{\"enable\":false,\"identifer\":\"HorizontalScrolle\"}},{\"AddCustomPageExtParams\":{\"enable\":true,\"identifer\":\"AddCustomPageExtParams\"}},{\"SpecialSmallWindow\":{\"enable\":true,\"identifer\":\"SpecialSmallWindow\"}},{\"CustomizedToast\":{\"enable\":true,\"identifer\":\"CustomizedToast\"}},{\"CustomizedTopLeftOrder\":{\"enable\":true,\"identifer\":\"CustomizedTopLeftOrder\"}},{\"CustomizedTopMask\":{\"enable\":true,\"identifer\":\"CustomizedTopMask\"}},{\"TabUnselectedReportLiveEnd\":{\"enable\":true,\"identifer\":\"TabUnselectedReportLiveEnd\"}},{\"HideFandomAndRefreshLiveRoom\":{\"enable\":true,\"identifer\":\"HideFandomAndRefreshLiveRoom\"}},{\"ReplayStatusShowLiveEnd\":{\"enable\":true,\"identifer\":\"ReplayStatusShowLiveEnd\"}},{\"RefreshOrRemoveLiveRoomWhenVisible\":{\"enable\":true,\"identifer\":\"RefreshOrRemoveLiveRoomWhenVisible\"}}]}";
    public final String m = "{\"invokeConfig\":[{\"Create_OpenLiveRoomView\":{\"eventChannel\":[\"platform\"]}}],\"abilityConfig\":[{\"EnableTopMask\":{\"enable\":false,\"identifer\":\"EnableTopMask\"}},{\"PvBySelf\":{\"enable\":false,\"identifer\":\"PvBySelf\"}},{\"EnablePerceptionHalfDetailByEvent\":{\"enable\":true,\"identifer\":\"EnablePerceptionHalfDetailByEvent\"}},{\"HideContainerCloseICON\":{\"enable\":true,\"identifer\":\"HideContainerCloseICON\"}},{\"HideHalfDetail\":{\"enable\":false,\"identifer\":\"HideHalfDetail\"}},{\"MiniPlayer\":{\"enable\":false,\"identifer\":\"MiniPlayer\"}},{\"LRComponent\":{\"enable\":true,\"extConfigMap\":{\"json\":{\"cList\":[{\"cName\":\"TopGroup\",\"cList\":[{\"cName\":\"WatchNum\"},{\"cName\":\"IntimacyEntrance\"}]},{\"cName\":\"BottomGroup\",\"cList\":[{\"cName\":\"CommentInputButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"MoreButton\"},{\"cName\":\"LikeButton\"},{\"cName\":\"GoodEntrance\"},{\"cName\":\"ShareButton\"},{\"cName\":\"RewardButton\"},{\"cName\":\"BackLivingButton\"},{\"cName\":\"ReportLiveRoom\"}]},{\"cName\":\"LeftSideGroup\",\"cList\":[{\"cName\":\"LeftTopEntrance\"},{\"cName\":\"LiveQABiz\"},{\"cName\":\"LeftBanner\"}]},{\"cName\":\"LeftBottomGroup\",\"cList\":[{\"cName\":\"Comments\"},{\"cName\":\"GiftShow\"},{\"cName\":\"ImportantNotice\"},{\"cName\":\"AtmosEnter\"}]},{\"cName\":\"RightSideGroup\",\"cList\":[{\"cName\":\"VirtualHostTag\"},{\"cName\":\"InteractionEntrance\"},{\"cName\":\"LiveWaterMark\"},{\"cName\":\"Tab2LiveMoreEntrance\"}]},{\"cName\":\"RightBottomGroup\",\"cList\":[{\"cName\":\"RightGoodsCard\"}]},{\"cName\":\"NonFirstScreenGroup\",\"cList\":[{\"cName\":\"DoubleLike\"},{\"cName\":\"CleanScreen\"},{\"cName\":\"TopNotice\"},{\"cName\":\"LinkWatchGroup\",\"cList\":[{\"cName\":\"MultiBBLinkWatch\"},{\"cName\":\"BCLinkWatch\"}]},{\"cName\":\"LiveAnchorPage\"},{\"cName\":\"LiveBCLinkBiz\"}]},{\"cName\":\"LiveAbilityGroup\",\"cList\":[{\"cName\":\"LiveFeedback\"},{\"cName\":\"MuteWatchTrack\"}]}]}},\"identifer\":\"LRComponent\"}},{\"Goods_Highlight_Frame\":{\"enable\":true,\"identifer\":\"Goods_Highlight_Frame\"}},{\"DisableAVATARCOMMENTMIX\":{\"enable\":false,\"identifer\":\"DisableAVATARCOMMENTMIX\"}},{\"NegativeFeedback\":{\"enable\":true,\"identifer\":\"NegativeFeedback\"}},{\"DisableBackwardTips\":{\"enable\":false,\"identifer\":\"DisableBackwardTips\"}},{\"TLOAI_RecommendDXCard\":{\"enable\":true,\"identifer\":\"TLOAI_RecommendDXCard\"}},{\"Link\":{\"enable\":true,\"identifer\":\"Link\"}},{\"PaiMai\":{\"enable\":true,\"identifer\":\"PaiMai\"}},{\"Ubee\":{\"enable\":true,\"identifer\":\"Ubee\"}},{\"Horizontal_live_rotate\":{\"enable\":false,\"identifer\":\"Horizontal_live_rotate\"}},{\"Reward\":{\"enable\":true,\"identifer\":\"Reward\"}},{\"PCG\":{\"enable\":true,\"identifer\":\"PCG\"}},{\"HideVideoShowError\":{\"enable\":false,\"identifer\":\"HideVideoShowError\"}},{\"HideFandom\":{\"enable\":false,\"identifer\":\"HideFandom\"}},{\"HideReplayLive\":{\"enable\":false,\"identifer\":\"HideReplayLive\"}},{\"HideHiglightLive\":{\"enable\":false,\"identifer\":\"HideHiglightLive\"}},{\"DisableFinish\":{\"enable\":true,\"identifer\":\"DisableFinish\"}},{\"EnableResetMuteFromSettingWhenResume\":{\"enable\":true,\"identifer\":\"EnableResetMuteFromSettingWhenResume\"}},{\"HorizontalScrolle\":{\"enable\":false,\"identifer\":\"HorizontalScrolle\"}},{\"AddCustomPageExtParams\":{\"enable\":true,\"identifer\":\"AddCustomPageExtParams\"}},{\"SpecialSmallWindow\":{\"enable\":true,\"identifer\":\"SpecialSmallWindow\"}},{\"CustomizedToast\":{\"enable\":true,\"identifer\":\"CustomizedToast\"}},{\"CustomizedTopLeftOrder\":{\"enable\":true,\"identifer\":\"CustomizedTopLeftOrder\"}},{\"CustomizedTopMask\":{\"enable\":true,\"identifer\":\"CustomizedTopMask\"}},{\"TabUnselectedReportLiveEnd\":{\"enable\":true,\"identifer\":\"TabUnselectedReportLiveEnd\"}},{\"HideFandomAndRefreshLiveRoom\":{\"enable\":true,\"identifer\":\"HideFandomAndRefreshLiveRoom\"}},{\"ReplayStatusShowLiveEnd\":{\"enable\":true,\"identifer\":\"ReplayStatusShowLiveEnd\"}},{\"RefreshOrRemoveLiveRoomWhenVisible\":{\"enable\":true,\"identifer\":\"RefreshOrRemoveLiveRoomWhenVisible\"}}]}";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$room$openarchitecture$gateway$command$type$TaoliveGatewayEnum;

        static {
            int[] iArr = new int[TaoliveGatewayEnum.values().length];
            $SwitchMap$com$taobao$taolive$room$openarchitecture$gateway$command$type$TaoliveGatewayEnum = iArr;
            try {
                iArr[TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$gateway$command$type$TaoliveGatewayEnum[TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveRoomView.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$room$openarchitecture$gateway$command$type$TaoliveGatewayEnum[TaoliveGatewayEnum.TaoliveGateway_Create_OpenLiveCompontent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(779093026);
    }

    public static /* synthetic */ Object ipc$super(abt abtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/gateway/handler/impl/TaoliveGatewayAuthwayHandler");
    }

    public final Integer e(String str, String str2, jbt jbtVar) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("83f9c29", new Object[]{this, str, str2, jbtVar});
        }
        if (!(this.b == null || jbtVar == null || TextUtils.isEmpty(jbtVar.b) || (jSONObject = this.b.getJSONObject(jbtVar.b)) == null || (jSONArray = jSONObject.getJSONArray("invokeConfig")) == null)) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject(str)) != null) {
                    if (jSONObject2.getJSONArray("eventChannel").contains(str2)) {
                        return -1;
                    } else {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7cb252c7", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString(), (Object) JSON.parseObject(this.c));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_H5VideoCard.toString(), (Object) JSON.parseObject(this.d));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString(), (Object) JSON.parseObject(this.e));
            if (g()) {
                jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString(), (Object) JSON.parseObject(this.h));
            } else {
                jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString(), (Object) JSON.parseObject(this.g));
            }
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_HomeTab.toString(), (Object) JSON.parseObject(this.k));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), (Object) JSON.parseObject(this.l));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.toString(), (Object) JSON.parseObject(this.i));
            jSONObject.put(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_NewShop.toString(), (Object) JSON.parseObject(this.j));
        } catch (Exception e) {
            String str2 = n;
            o3s.b(str2, "createLocalRules error" + e);
            e.printStackTrace();
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AuthConfig_" + str, (Object) jSONObject);
        return jSONObject2.toJSONString();
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeed94ec", new Object[]{this})).booleanValue();
        }
        if (qvs.J0() == 5) {
            return true;
        }
        return false;
    }

    public final JSONObject h(String str) {
        JSONObject d;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("af9729fd", new Object[]{this, str});
        }
        String f = f(str);
        String customConfig = OrangeConfig.getInstance().getCustomConfig("tbliveOpenConfig", f);
        String str2 = "AuthConfig_" + str;
        if (!TextUtils.isEmpty(customConfig) && (d = fkx.d(customConfig)) != null) {
            JSONObject jSONObject2 = d.getJSONObject(str2);
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            JSONObject d2 = fkx.d(f);
            if (!(d2 == null || (jSONObject = d2.getJSONObject(str2)) == null)) {
                return jSONObject;
            }
        }
        return JSON.parseObject(customConfig);
    }

    public zyd i(jbt jbtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zyd) ipChange.ipc$dispatch("e062c57c", new Object[]{this, jbtVar});
        }
        this.b = h("2.1");
        j(jbtVar);
        return this;
    }

    public void j(jbt jbtVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c46ffba", new Object[]{this, jbtVar});
            return;
        }
        String str2 = null;
        if (jbtVar != null && !TextUtils.isEmpty(jbtVar.b)) {
            TaoliveOpenBizCodeEnum taoliveOpenBizCodeEnum = TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch;
            if (taoliveOpenBizCodeEnum.toString().equals(jbtVar.b)) {
                Map<String, Object> map = jbtVar.f;
                if (map == null || map.get("liveHomePageType") == null) {
                    str = null;
                } else if ("mixLiveAndTab".equals(String.valueOf(jbtVar.f.get("liveHomePageType")))) {
                    str = b4l.a("2.1", this.f);
                } else {
                    str = b4l.b("2.1", this.e);
                }
                if (this.b != null && !TextUtils.isEmpty(str)) {
                    this.b.put(taoliveOpenBizCodeEnum.toString(), (Object) fkx.d(str));
                }
            }
        }
        if (jbtVar != null && !TextUtils.isEmpty(jbtVar.b)) {
            TaoliveOpenBizCodeEnum taoliveOpenBizCodeEnum2 = TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2;
            if (taoliveOpenBizCodeEnum2.toString().equals(jbtVar.b)) {
                Map<String, Object> map2 = jbtVar.f;
                if (!(map2 == null || map2.get("liveHomePageType") == null)) {
                    if ("mixLiveAndTab".equals(String.valueOf(jbtVar.f.get("liveHomePageType")))) {
                        str2 = b4l.a("2.1", this.m);
                    } else {
                        str2 = b4l.b("2.1", this.l);
                    }
                }
                if (this.b != null && !TextUtils.isEmpty(str2)) {
                    this.b.put(taoliveOpenBizCodeEnum2.toString(), (Object) fkx.d(str2));
                }
            }
        }
    }

    public final Integer l(jbt jbtVar) {
        JSONObject jSONObject;
        int i;
        String str;
        String str2 = "CustomizedSimpleLive";
        IpChange ipChange = $ipChange;
        String str3 = "LRCommentFeatMap";
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a3d09305", new Object[]{this, jbtVar});
        }
        if (jbtVar == null || TextUtils.isEmpty(jbtVar.b) || (jSONObject = this.b.getJSONObject(jbtVar.b)) == null) {
            return -1;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("abilityConfig");
        if (jSONArray == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (i2 < jSONArray.size()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            if (jSONObject2.getJSONObject("LRComponent") != null) {
                i = i2;
                hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent, jSONObject2.getJSONObject("LRComponent"));
            } else {
                i = i2;
                if (jSONObject2.getJSONObject("Goods_Highlight_Frame") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Goods_Highlight_Frame, jSONObject2.getJSONObject("Goods_Highlight_Frame"));
                } else if (jSONObject2.getJSONObject("Link") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Link, jSONObject2.getJSONObject("Link"));
                } else if (jSONObject2.getJSONObject("MiniPlayer") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer, jSONObject2.getJSONObject("MiniPlayer"));
                } else if (jSONObject2.getJSONObject("PaiMai") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PaiMai, jSONObject2.getJSONObject("PaiMai"));
                } else if (jSONObject2.getJSONObject("Ubee") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Ubee, jSONObject2.getJSONObject("Ubee"));
                } else if (jSONObject2.getJSONObject("Horizontal_live_rotate") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate, jSONObject2.getJSONObject("Horizontal_live_rotate"));
                } else if (jSONObject2.getJSONObject("Reward") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Reward, jSONObject2.getJSONObject("Reward"));
                } else if (jSONObject2.getJSONObject("PCG") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PCG, jSONObject2.getJSONObject("PCG"));
                } else if (jSONObject2.getJSONObject("NegativeFeedback") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_NegativeFeedback, jSONObject2.getJSONObject("NegativeFeedback"));
                } else if (jSONObject2.getJSONObject("HideVideoShowError") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideShowVideoError, jSONObject2.getJSONObject("HideVideoShowError"));
                } else if (jSONObject2.getJSONObject("HideFandom") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandom, jSONObject2.getJSONObject("HideFandom"));
                } else if (jSONObject2.getJSONObject("HideReplayLive") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideReplayLive, jSONObject2.getJSONObject("HideReplayLive"));
                } else if (jSONObject2.getJSONObject("HideHiglightLive") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideHiglightLive, jSONObject2.getJSONObject("HideHiglightLive"));
                } else if (jSONObject2.getJSONObject("HideContainerCloseICON") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Container_HideCloseICON, jSONObject2.getJSONObject("HideContainerCloseICON"));
                } else if (jSONObject2.getJSONObject("HideHalfDetail") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Hide_Half_Detail, jSONObject2.getJSONObject("HideHalfDetail"));
                } else if (jSONObject2.getJSONObject("HorizontalScrolle") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_Scrolle, jSONObject2.getJSONObject("HorizontalScrolle"));
                } else if (jSONObject2.getJSONObject("DisableAVATARCOMMENTMIX") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_AVATAR_COMMENT_MIX, jSONObject2.getJSONObject("DisableAVATARCOMMENTMIX"));
                } else if (jSONObject2.getJSONObject("DisableBackwardTips") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_BackwardTips, jSONObject2.getJSONObject("DisableBackwardTips"));
                } else if (jSONObject2.getJSONObject("TLOAI_RecommendDXCard") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_RecommendDXCard, jSONObject2.getJSONObject("TLOAI_RecommendDXCard"));
                } else if (jSONObject2.getJSONObject("PvBySelf") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_PV_BYSELF, jSONObject2.getJSONObject("PvBySelf"));
                } else if (jSONObject2.getJSONObject("EnablePerceptionHalfDetailByEvent") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Enable_Perception_Half_Detail_By_Event, jSONObject2.getJSONObject("EnablePerceptionHalfDetailByEvent"));
                } else if (jSONObject2.getJSONObject("EnableResetMuteFromSettingWhenResume") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_EnableResetMuteFromSettingWhenResume, jSONObject2.getJSONObject("EnableResetMuteFromSettingWhenResume"));
                } else if (jSONObject2.getJSONObject("EnableTopMask") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TOP_MASK, jSONObject2.getJSONObject("EnableTopMask"));
                } else if (jSONObject2.getJSONObject("DisableFinish") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_Finish, jSONObject2.getJSONObject("DisableFinish"));
                } else if (jSONObject2.getJSONObject("AddCustomPageExtParams") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_AddCustomPageExtParams, jSONObject2.getJSONObject("AddCustomPageExtParams"));
                } else if (jSONObject2.getJSONObject("SpecialSmallWindow") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_SpecialSmallWindow, jSONObject2.getJSONObject("SpecialSmallWindow"));
                } else if (jSONObject2.getJSONObject("CustomizedTopLeftOrder") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopLeftOrder, jSONObject2.getJSONObject("CustomizedTopLeftOrder"));
                } else if (jSONObject2.getJSONObject("CustomizedToast") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedToast, jSONObject2.getJSONObject("CustomizedToast"));
                } else if (jSONObject2.getJSONObject("CustomizedTopMask") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopMask, jSONObject2.getJSONObject("CustomizedTopMask"));
                } else if (jSONObject2.getJSONObject("TabUnselectedReportLiveEnd") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_TabUnselectedReportLiveEnd, jSONObject2.getJSONObject("TabUnselectedReportLiveEnd"));
                } else if (jSONObject2.getJSONObject("HideFandomAndRefreshLiveRoom") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandomAndRefreshLiveRoom, jSONObject2.getJSONObject("HideFandomAndRefreshLiveRoom"));
                } else if (jSONObject2.getJSONObject("ReplayStatusShowLiveEnd") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_ReplayStatusShowLiveEnd, jSONObject2.getJSONObject("ReplayStatusShowLiveEnd"));
                } else if (jSONObject2.getJSONObject("RefreshOrRemoveLiveRoomWhenVisible") != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_RefreshOrRemoveLiveRoomWhenVisible, jSONObject2.getJSONObject("RefreshOrRemoveLiveRoomWhenVisible"));
                } else if (jSONObject2.getJSONObject(str3) != null) {
                    hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap, jSONObject2.getJSONObject(str3));
                    str3 = str3;
                } else {
                    str = str2;
                    str3 = str3;
                    if (jSONObject2.getJSONObject(str) != null) {
                        hashMap.put(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive, jSONObject2.getJSONObject(str));
                    }
                    i2 = i + 1;
                    str2 = str;
                    jSONArray = jSONArray;
                }
            }
            str = str2;
            i2 = i + 1;
            str2 = str;
            jSONArray = jSONArray;
        }
        jbtVar.c = hashMap;
        return null;
    }

    public final Integer d(jbt jbtVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d3c2fd91", new Object[]{this, jbtVar, objArr});
        }
        Object obj = objArr[1];
        if (obj instanceof AccessListenerEnum) {
            return e(((AccessListenerEnum) obj).toString(), "accessor", jbtVar);
        }
        if (obj instanceof PlatformListenerEnum) {
            return e(((PlatformListenerEnum) obj).toString(), "platform", jbtVar);
        }
        if (obj instanceof H5PlatfomListenerEnum) {
            return e(((H5PlatfomListenerEnum) obj).toString(), "platform", jbtVar);
        }
        if (obj instanceof WatchPlatformListenerEnum) {
            return e(((WatchPlatformListenerEnum) obj).toString(), "platform", jbtVar);
        }
        return null;
    }

    public final Integer k(jbt jbtVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("f566ffbd", new Object[]{this, jbtVar});
        }
        if (!(jbtVar == null || TextUtils.isEmpty(jbtVar.b) || (jSONObject = this.b) == null || (jSONObject2 = jSONObject.getJSONObject(jbtVar.b)) == null || (jSONArray = jSONObject2.getJSONArray("invokeConfig")) == null)) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                if (!(jSONObject4 == null || (jSONObject3 = jSONObject4.getJSONObject("Create_OpenLiveRoomView")) == null)) {
                    return jSONObject3.getJSONArray("eventChannel").contains("platform") ? null : -1;
                }
            }
        }
        return -1;
    }

    @Override // tb.bbt
    public Object c(TaoliveGatewayEnum taoliveGatewayEnum, jbt jbtVar, Object... objArr) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ba6be387", new Object[]{this, taoliveGatewayEnum, jbtVar, objArr});
        }
        String obj2 = (objArr == null || objArr.length <= 1 || (obj = objArr[1]) == null) ? null : obj.toString();
        TLog.logi("TaoliveOpen-2.1", "Gateway", " gatewayEnum: " + taoliveGatewayEnum + " invockHandleCommand: " + obj2);
        int i = a.$SwitchMap$com$taobao$taolive$room$openarchitecture$gateway$command$type$TaoliveGatewayEnum[taoliveGatewayEnum.ordinal()];
        if (i == 1) {
            return l(jbtVar);
        }
        if (i == 2) {
            return k(jbtVar);
        }
        if (i != 3 || objArr == null || objArr.length <= 1 || objArr[1] == null) {
            return null;
        }
        Integer d = d(jbtVar, objArr);
        if (d != null && d.intValue() == -1) {
            Log.e(n + "没有权限:", objArr[1].toString());
        }
        return d;
    }
}
