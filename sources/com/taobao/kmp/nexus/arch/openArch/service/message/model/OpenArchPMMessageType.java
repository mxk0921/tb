package com.taobao.kmp.nexus.arch.openArch.service.message.model;

import com.alibaba.security.realidentity.ui.activity.BaseBioNavigatorActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.io.Serializable;
import kotlin.Metadata;
import tb.a07;
import tb.cdw;
import tb.fg8;
import tb.t2o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\bL\b\u0087\u0081\u0002\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bO¨\u0006P"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchPMMessageType;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", TLogTracker.LEVEL_INFO, "getValue", "()I", "Companion", "a", "TbliveMessageSubTypeNone", "TbliveMessageSubTypeSystemMsg", "TbliveMessageSubTypeNewSystemMsg", "TbliveMessageSubTypeShareMessage", "TbliveMessageSubTypeJoinNotify", "TbliveMessageSubTypeDigMessage", "TbliveMessageSubTypeShareGoodsList", "TbliveMessageSubTypeCloseGoodsShowCase", "TbliveMessageSubTypeTradeShow", "TbliveMessageSubTypeEndEditItem", "TbliveMessageSubTypeGiveVote", "TbliveMessageSubTypeRunloopUpdateBroadCasterScore", "TbliveMessageSubTypeActivityMsg", "TbliveMessageSubTypeTbtvChangeProgramMsg", "TbliveMessageSubTypePointsActivitySyncMsg", "TbliveMessageSubTypeEnterLiveRoom", "TbliveMessageSubTypeUserLevelUp", "TbliveMessageSubTypeInfoCardMsg", "TbliveMessageSubTypeCommonTipsMessage", "TbliveMessageSubTypeCustomerAnswer", "TbliveMessageSubTypeCustomerAddAsk", "TbliveMessageSubTypeCustomerExitRoom", "StepGrouponSuccess", "TbliveMessageSubTypeCommentCrit", "TbliveMessageSubTypeAddGroupSuccess", "TbliveMessageSubTypeInteractive", "TbliveMessageSubTypeChatTopBroadcast", "TbliveMessageSubTypeLinkLive", "TbliveMessageSubTypeLinkLivePKScore", "TbliveMessageSubTypeLinkLivePKAmbience", "TbliveMessageSubTypeLinkLivePKRank", "TbliveMessageSubTypeJumpH5URL", "TbliveMessageSubTypeInteractiveMsg", "TbliveMessageSubTypeH265Down", "TbliveMessageSubTypeGiftAnimation", "TbliveMessageSubTypeGlobalNotice", "TbliveMessageSubTypeBarrage", "TbliveMessageSubTypeLikeCombo", "TbliveMessageSubTypeJiuGongGe", "TbliveMessageSubTypeCredibleActivityMsg", "TbliveMessageSubTypeMediaDataMsg", "TbliveMessageSubTypeAnthorResponse", "TbliveMessageSubTypeSmartPoint", "TbliveMessageSubTypeNewEnterLiveRoom", "TbliveMessageSubTypeRankChange", "TbliveMessageSubTypeSpecialComment", "TbliveMessageSubTypeSwitchStation", "TbliveMessageSubTypeTopAtmosphere", "TbliveMessageSubTypeRoomSwitch", "TbliveMessageSubTypeTaoLivePV", "ChatRoomPVUpdate", "ChatRoomFavUpdate", "ChatRoomStartLive", "NormalComment", "EndSmartPoint", "InteractTypes", "SecKillSoldOut", "CancelTopHotGoods", "newSmartPoint", "TbliveMessageSubTypeGift", "TbliveMessageRewardRankRefresh", "TaoliveMessageBizCommonPM", "TaoliveMessageRewardSmallCardRefresh", "TaoliveMessageSubTypeLeftBanner", "TaoliveMessageRewardTopNotice", "TaoliveMessageDebug", "TaoliveMessageFansClubUpdate", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchPMMessageType extends Enum<OpenArchPMMessageType> implements Serializable {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchPMMessageType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int value;
    public static final OpenArchPMMessageType TbliveMessageSubTypeNone = new OpenArchPMMessageType("TbliveMessageSubTypeNone", 0, 0);
    public static final OpenArchPMMessageType TbliveMessageSubTypeSystemMsg = new OpenArchPMMessageType("TbliveMessageSubTypeSystemMsg", 1, 10001);
    public static final OpenArchPMMessageType TbliveMessageSubTypeNewSystemMsg = new OpenArchPMMessageType("TbliveMessageSubTypeNewSystemMsg", 2, 10002);
    public static final OpenArchPMMessageType TbliveMessageSubTypeShareMessage = new OpenArchPMMessageType("TbliveMessageSubTypeShareMessage", 3, 10003);
    public static final OpenArchPMMessageType TbliveMessageSubTypeJoinNotify = new OpenArchPMMessageType("TbliveMessageSubTypeJoinNotify", 4, 10103);
    public static final OpenArchPMMessageType TbliveMessageSubTypeDigMessage = new OpenArchPMMessageType("TbliveMessageSubTypeDigMessage", 5, 10104);
    public static final OpenArchPMMessageType TbliveMessageSubTypeShareGoodsList = new OpenArchPMMessageType("TbliveMessageSubTypeShareGoodsList", 6, 10101);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCloseGoodsShowCase = new OpenArchPMMessageType("TbliveMessageSubTypeCloseGoodsShowCase", 7, 10009);
    public static final OpenArchPMMessageType TbliveMessageSubTypeTradeShow = new OpenArchPMMessageType("TbliveMessageSubTypeTradeShow", 8, 10010);
    public static final OpenArchPMMessageType TbliveMessageSubTypeEndEditItem = new OpenArchPMMessageType("TbliveMessageSubTypeEndEditItem", 9, 10011);
    public static final OpenArchPMMessageType TbliveMessageSubTypeGiveVote = new OpenArchPMMessageType("TbliveMessageSubTypeGiveVote", 10, 10012);
    public static final OpenArchPMMessageType TbliveMessageSubTypeRunloopUpdateBroadCasterScore = new OpenArchPMMessageType("TbliveMessageSubTypeRunloopUpdateBroadCasterScore", 11, 10013);
    public static final OpenArchPMMessageType TbliveMessageSubTypeActivityMsg = new OpenArchPMMessageType("TbliveMessageSubTypeActivityMsg", 12, 10015);
    public static final OpenArchPMMessageType TbliveMessageSubTypeTbtvChangeProgramMsg = new OpenArchPMMessageType("TbliveMessageSubTypeTbtvChangeProgramMsg", 13, 10016);
    public static final OpenArchPMMessageType TbliveMessageSubTypePointsActivitySyncMsg = new OpenArchPMMessageType("TbliveMessageSubTypePointsActivitySyncMsg", 14, cdw.T_CORNER_RADIUS);
    public static final OpenArchPMMessageType TbliveMessageSubTypeEnterLiveRoom = new OpenArchPMMessageType("TbliveMessageSubTypeEnterLiveRoom", 15, PowerMsgType.userLevelEnter);
    public static final OpenArchPMMessageType TbliveMessageSubTypeUserLevelUp = new OpenArchPMMessageType("TbliveMessageSubTypeUserLevelUp", 16, PowerMsgType.fansLevelUpgrade);
    public static final OpenArchPMMessageType TbliveMessageSubTypeInfoCardMsg = new OpenArchPMMessageType("TbliveMessageSubTypeInfoCardMsg", 17, PowerMsgType.infoCardMsg);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCommonTipsMessage = new OpenArchPMMessageType("TbliveMessageSubTypeCommonTipsMessage", 18, PowerMsgType.commonTipsMsg);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCustomerAnswer = new OpenArchPMMessageType("TbliveMessageSubTypeCustomerAnswer", 19, PowerMsgType.customServGoodIntro);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCustomerAddAsk = new OpenArchPMMessageType("TbliveMessageSubTypeCustomerAddAsk", 20, 10057);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCustomerExitRoom = new OpenArchPMMessageType("TbliveMessageSubTypeCustomerExitRoom", 21, 10058);
    public static final OpenArchPMMessageType StepGrouponSuccess = new OpenArchPMMessageType("StepGrouponSuccess", 22, 10119);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCommentCrit = new OpenArchPMMessageType("TbliveMessageSubTypeCommentCrit", 23, 10110);
    public static final OpenArchPMMessageType TbliveMessageSubTypeAddGroupSuccess = new OpenArchPMMessageType("TbliveMessageSubTypeAddGroupSuccess", 24, 10035);
    public static final OpenArchPMMessageType TbliveMessageSubTypeInteractive = new OpenArchPMMessageType("TbliveMessageSubTypeInteractive", 25, 10021);
    public static final OpenArchPMMessageType TbliveMessageSubTypeChatTopBroadcast = new OpenArchPMMessageType("TbliveMessageSubTypeChatTopBroadcast", 26, 11015);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLinkLive = new OpenArchPMMessageType("TbliveMessageSubTypeLinkLive", 27, PowerMsgType.interactiveMsg);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLinkLivePKScore = new OpenArchPMMessageType("TbliveMessageSubTypeLinkLivePKScore", 28, PowerMsgType.pkHotMsg);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLinkLivePKAmbience = new OpenArchPMMessageType("TbliveMessageSubTypeLinkLivePKAmbience", 29, PowerMsgType.pkAssistMsg);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLinkLivePKRank = new OpenArchPMMessageType("TbliveMessageSubTypeLinkLivePKRank", 30, PowerMsgType.DUKE_GIFT_PK_RANKING_MSG);
    public static final OpenArchPMMessageType TbliveMessageSubTypeJumpH5URL = new OpenArchPMMessageType("TbliveMessageSubTypeJumpH5URL", 31, 10098);
    public static final OpenArchPMMessageType TbliveMessageSubTypeInteractiveMsg = new OpenArchPMMessageType("TbliveMessageSubTypeInteractiveMsg", 32, 10086);
    public static final OpenArchPMMessageType TbliveMessageSubTypeH265Down = new OpenArchPMMessageType("TbliveMessageSubTypeH265Down", 33, 10099);
    public static final OpenArchPMMessageType TbliveMessageSubTypeGiftAnimation = new OpenArchPMMessageType("TbliveMessageSubTypeGiftAnimation", 34, 20001);
    public static final OpenArchPMMessageType TbliveMessageSubTypeGlobalNotice = new OpenArchPMMessageType("TbliveMessageSubTypeGlobalNotice", 35, 20002);
    public static final OpenArchPMMessageType TbliveMessageSubTypeBarrage = new OpenArchPMMessageType("TbliveMessageSubTypeBarrage", 36, BaseBioNavigatorActivity.p);
    public static final OpenArchPMMessageType TbliveMessageSubTypeLikeCombo = new OpenArchPMMessageType("TbliveMessageSubTypeLikeCombo", 37, BaseBioNavigatorActivity.q);
    public static final OpenArchPMMessageType TbliveMessageSubTypeJiuGongGe = new OpenArchPMMessageType("TbliveMessageSubTypeJiuGongGe", 38, 20005);
    public static final OpenArchPMMessageType TbliveMessageSubTypeCredibleActivityMsg = new OpenArchPMMessageType("TbliveMessageSubTypeCredibleActivityMsg", 39, PowerMsgType.reliableMediaPlatformMsg);
    public static final OpenArchPMMessageType TbliveMessageSubTypeMediaDataMsg = new OpenArchPMMessageType("TbliveMessageSubTypeMediaDataMsg", 40, PowerMsgType.mmediaDataMsg);
    public static final OpenArchPMMessageType TbliveMessageSubTypeAnthorResponse = new OpenArchPMMessageType("TbliveMessageSubTypeAnthorResponse", 41, 70008);
    public static final OpenArchPMMessageType TbliveMessageSubTypeSmartPoint = new OpenArchPMMessageType("TbliveMessageSubTypeSmartPoint", 42, 30005);
    public static final OpenArchPMMessageType TbliveMessageSubTypeNewEnterLiveRoom = new OpenArchPMMessageType("TbliveMessageSubTypeNewEnterLiveRoom", 43, 100000000);
    public static final OpenArchPMMessageType TbliveMessageSubTypeRankChange = new OpenArchPMMessageType("TbliveMessageSubTypeRankChange", 44, 100000011);
    public static final OpenArchPMMessageType TbliveMessageSubTypeSpecialComment = new OpenArchPMMessageType("TbliveMessageSubTypeSpecialComment", 45, PowerMsgType.DUKE_COMMON_COMMENT_MSG);
    public static final OpenArchPMMessageType TbliveMessageSubTypeSwitchStation = new OpenArchPMMessageType("TbliveMessageSubTypeSwitchStation", 46, PowerMsgType.SWITCH_OFFICIAL_MSG);
    public static final OpenArchPMMessageType TbliveMessageSubTypeTopAtmosphere = new OpenArchPMMessageType("TbliveMessageSubTypeTopAtmosphere", 47, PowerMsgType.topAtmosphereMsgType);
    public static final OpenArchPMMessageType TbliveMessageSubTypeRoomSwitch = new OpenArchPMMessageType("TbliveMessageSubTypeRoomSwitch", 48, 40001);
    public static final OpenArchPMMessageType TbliveMessageSubTypeTaoLivePV = new OpenArchPMMessageType("TbliveMessageSubTypeTaoLivePV", 49, 40002);
    public static final OpenArchPMMessageType ChatRoomPVUpdate = new OpenArchPMMessageType("ChatRoomPVUpdate", 50, 200001);
    public static final OpenArchPMMessageType ChatRoomFavUpdate = new OpenArchPMMessageType("ChatRoomFavUpdate", 51, 200002);
    public static final OpenArchPMMessageType ChatRoomStartLive = new OpenArchPMMessageType("ChatRoomStartLive", 52, 200003);
    public static final OpenArchPMMessageType NormalComment = new OpenArchPMMessageType("NormalComment", 53, PowerMsgType.commentMsg);
    public static final OpenArchPMMessageType EndSmartPoint = new OpenArchPMMessageType("EndSmartPoint", 54, PowerMsgType.endOfeEplanation);
    public static final OpenArchPMMessageType InteractTypes = new OpenArchPMMessageType("InteractTypes", 55, PowerMsgType.goods_simple_rights);
    public static final OpenArchPMMessageType SecKillSoldOut = new OpenArchPMMessageType("SecKillSoldOut", 56, PowerMsgType.seckill_sellout);
    public static final OpenArchPMMessageType CancelTopHotGoods = new OpenArchPMMessageType("CancelTopHotGoods", 57, PowerMsgType.PRODUCT_HOT);
    public static final OpenArchPMMessageType newSmartPoint = new OpenArchPMMessageType("newSmartPoint", 58, PowerMsgType.PRODUCT_EXPLAIN_NEW);
    public static final OpenArchPMMessageType TbliveMessageSubTypeGift = new OpenArchPMMessageType("TbliveMessageSubTypeGift", 59, PowerMsgType.CHEER_BUY_GIFT_MSG);
    public static final OpenArchPMMessageType TbliveMessageRewardRankRefresh = new OpenArchPMMessageType("TbliveMessageRewardRankRefresh", 60, PowerMsgType.RANK_USER_MSG);
    public static final OpenArchPMMessageType TaoliveMessageBizCommonPM = new OpenArchPMMessageType("TaoliveMessageBizCommonPM", 61, PowerMsgType.CHAT_COMMENT_DYNAMIC_MSG);
    public static final OpenArchPMMessageType TaoliveMessageRewardSmallCardRefresh = new OpenArchPMMessageType("TaoliveMessageRewardSmallCardRefresh", 62, PowerMsgType.REWARD_ACTIVITY);
    public static final OpenArchPMMessageType TaoliveMessageSubTypeLeftBanner = new OpenArchPMMessageType("TaoliveMessageSubTypeLeftBanner", 63, PowerMsgType.ASIAN_GAMES_BADGE_MSG);
    public static final OpenArchPMMessageType TaoliveMessageRewardTopNotice = new OpenArchPMMessageType("TaoliveMessageRewardTopNotice", 64, PowerMsgType.NOTICE_DX);
    public static final OpenArchPMMessageType TaoliveMessageDebug = new OpenArchPMMessageType("TaoliveMessageDebug", 65, 888888888);
    public static final OpenArchPMMessageType TaoliveMessageFansClubUpdate = new OpenArchPMMessageType("TaoliveMessageFansClubUpdate", 66, PowerMsgType.FANS_CLUB_MSG);
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1004536586);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private static final /* synthetic */ OpenArchPMMessageType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchPMMessageType[]) ipChange.ipc$dispatch("8009271f", new Object[0]) : new OpenArchPMMessageType[]{TbliveMessageSubTypeNone, TbliveMessageSubTypeSystemMsg, TbliveMessageSubTypeNewSystemMsg, TbliveMessageSubTypeShareMessage, TbliveMessageSubTypeJoinNotify, TbliveMessageSubTypeDigMessage, TbliveMessageSubTypeShareGoodsList, TbliveMessageSubTypeCloseGoodsShowCase, TbliveMessageSubTypeTradeShow, TbliveMessageSubTypeEndEditItem, TbliveMessageSubTypeGiveVote, TbliveMessageSubTypeRunloopUpdateBroadCasterScore, TbliveMessageSubTypeActivityMsg, TbliveMessageSubTypeTbtvChangeProgramMsg, TbliveMessageSubTypePointsActivitySyncMsg, TbliveMessageSubTypeEnterLiveRoom, TbliveMessageSubTypeUserLevelUp, TbliveMessageSubTypeInfoCardMsg, TbliveMessageSubTypeCommonTipsMessage, TbliveMessageSubTypeCustomerAnswer, TbliveMessageSubTypeCustomerAddAsk, TbliveMessageSubTypeCustomerExitRoom, StepGrouponSuccess, TbliveMessageSubTypeCommentCrit, TbliveMessageSubTypeAddGroupSuccess, TbliveMessageSubTypeInteractive, TbliveMessageSubTypeChatTopBroadcast, TbliveMessageSubTypeLinkLive, TbliveMessageSubTypeLinkLivePKScore, TbliveMessageSubTypeLinkLivePKAmbience, TbliveMessageSubTypeLinkLivePKRank, TbliveMessageSubTypeJumpH5URL, TbliveMessageSubTypeInteractiveMsg, TbliveMessageSubTypeH265Down, TbliveMessageSubTypeGiftAnimation, TbliveMessageSubTypeGlobalNotice, TbliveMessageSubTypeBarrage, TbliveMessageSubTypeLikeCombo, TbliveMessageSubTypeJiuGongGe, TbliveMessageSubTypeCredibleActivityMsg, TbliveMessageSubTypeMediaDataMsg, TbliveMessageSubTypeAnthorResponse, TbliveMessageSubTypeSmartPoint, TbliveMessageSubTypeNewEnterLiveRoom, TbliveMessageSubTypeRankChange, TbliveMessageSubTypeSpecialComment, TbliveMessageSubTypeSwitchStation, TbliveMessageSubTypeTopAtmosphere, TbliveMessageSubTypeRoomSwitch, TbliveMessageSubTypeTaoLivePV, ChatRoomPVUpdate, ChatRoomFavUpdate, ChatRoomStartLive, NormalComment, EndSmartPoint, InteractTypes, SecKillSoldOut, CancelTopHotGoods, newSmartPoint, TbliveMessageSubTypeGift, TbliveMessageRewardRankRefresh, TaoliveMessageBizCommonPM, TaoliveMessageRewardSmallCardRefresh, TaoliveMessageSubTypeLeftBanner, TaoliveMessageRewardTopNotice, TaoliveMessageDebug, TaoliveMessageFansClubUpdate};
    }

    static {
        OpenArchPMMessageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private OpenArchPMMessageType(String str, int i, int i2) {
        this.value = i2;
    }

    public static fg8<OpenArchPMMessageType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchPMMessageType openArchPMMessageType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/service/message/model/OpenArchPMMessageType");
    }

    public static OpenArchPMMessageType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMMessageType) ipChange.ipc$dispatch("e2594d8a", new Object[]{str});
        }
        return (OpenArchPMMessageType) Enum.valueOf(OpenArchPMMessageType.class, str);
    }

    public static OpenArchPMMessageType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchPMMessageType[]) ipChange.ipc$dispatch("a20debfb", new Object[0]);
        }
        return (OpenArchPMMessageType[]) $VALUES.clone();
    }

    public final int getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
        }
        return this.value;
    }
}
