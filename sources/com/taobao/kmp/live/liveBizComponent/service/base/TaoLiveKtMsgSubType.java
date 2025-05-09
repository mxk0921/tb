package com.taobao.kmp.live.liveBizComponent.service.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.z9u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/base/TaoLiveKtMsgSubType;", "", "value", "", "<init>", "(Ljava/lang/String;IJ)V", "getValue", "()J", "Normal", "UserAction", "System", z9u.SEARCH_ANCHOR_FEED, "CommonBiz", "CommentCritical", "DTSpecialMsg", "AddOneOpen", "CommentBizOpen", "EnterLiveRoom", "EnterDTRoom", "EnterDXAtmosphere", "EnterTradeAtmosphere", "NormalLikeCountUpdate", "OfficialMainRoomInfoChange", "RoomWatchNumPv", "OldOfficialRoomWatchNumPv", "UpdateFansClubState", "JoinFansNotify", "NormalNotice", "DXNotice", "ActivityMessage", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtMsgSubType extends Enum<TaoLiveKtMsgSubType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtMsgSubType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long value;
    public static final TaoLiveKtMsgSubType Normal = new TaoLiveKtMsgSubType("Normal", 0, 881000048);
    public static final TaoLiveKtMsgSubType UserAction = new TaoLiveKtMsgSubType("UserAction", 1, 881000259);
    public static final TaoLiveKtMsgSubType System = new TaoLiveKtMsgSubType("System", 2, 881000260);
    public static final TaoLiveKtMsgSubType Anchor = new TaoLiveKtMsgSubType(z9u.SEARCH_ANCHOR_FEED, 3, 880000267);
    public static final TaoLiveKtMsgSubType CommonBiz = new TaoLiveKtMsgSubType("CommonBiz", 4, 881000244);
    public static final TaoLiveKtMsgSubType CommentCritical = new TaoLiveKtMsgSubType("CommentCritical", 5, 10110);
    public static final TaoLiveKtMsgSubType DTSpecialMsg = new TaoLiveKtMsgSubType("DTSpecialMsg", 6, 100000010);
    public static final TaoLiveKtMsgSubType AddOneOpen = new TaoLiveKtMsgSubType("AddOneOpen", 7, 880000269);
    public static final TaoLiveKtMsgSubType CommentBizOpen = new TaoLiveKtMsgSubType("CommentBizOpen", 8, 880000202);
    public static final TaoLiveKtMsgSubType EnterLiveRoom = new TaoLiveKtMsgSubType("EnterLiveRoom", 9, 10031);
    public static final TaoLiveKtMsgSubType EnterDTRoom = new TaoLiveKtMsgSubType("EnterDTRoom", 10, 100000000);
    public static final TaoLiveKtMsgSubType EnterDXAtmosphere = new TaoLiveKtMsgSubType("EnterDXAtmosphere", 11, 11015);
    public static final TaoLiveKtMsgSubType EnterTradeAtmosphere = new TaoLiveKtMsgSubType("EnterTradeAtmosphere", 12, 10010);
    public static final TaoLiveKtMsgSubType NormalLikeCountUpdate = new TaoLiveKtMsgSubType("NormalLikeCountUpdate", 13, 10104);
    public static final TaoLiveKtMsgSubType OfficialMainRoomInfoChange = new TaoLiveKtMsgSubType("OfficialMainRoomInfoChange", 14, 888000112);
    public static final TaoLiveKtMsgSubType RoomWatchNumPv = new TaoLiveKtMsgSubType("RoomWatchNumPv", 15, 200001);
    public static final TaoLiveKtMsgSubType OldOfficialRoomWatchNumPv = new TaoLiveKtMsgSubType("OldOfficialRoomWatchNumPv", 16, 40002);
    public static final TaoLiveKtMsgSubType UpdateFansClubState = new TaoLiveKtMsgSubType("UpdateFansClubState", 17, 880000272);
    public static final TaoLiveKtMsgSubType JoinFansNotify = new TaoLiveKtMsgSubType("JoinFansNotify", 18, 10103);
    public static final TaoLiveKtMsgSubType NormalNotice = new TaoLiveKtMsgSubType("NormalNotice", 19, 20002);
    public static final TaoLiveKtMsgSubType DXNotice = new TaoLiveKtMsgSubType("DXNotice", 20, 880000253);
    public static final TaoLiveKtMsgSubType ActivityMessage = new TaoLiveKtMsgSubType("ActivityMessage", 21, 10015);

    private static final /* synthetic */ TaoLiveKtMsgSubType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtMsgSubType[]) ipChange.ipc$dispatch("da9a1bdf", new Object[0]) : new TaoLiveKtMsgSubType[]{Normal, UserAction, System, Anchor, CommonBiz, CommentCritical, DTSpecialMsg, AddOneOpen, CommentBizOpen, EnterLiveRoom, EnterDTRoom, EnterDXAtmosphere, EnterTradeAtmosphere, NormalLikeCountUpdate, OfficialMainRoomInfoChange, RoomWatchNumPv, OldOfficialRoomWatchNumPv, UpdateFansClubState, JoinFansNotify, NormalNotice, DXNotice, ActivityMessage};
    }

    static {
        TaoLiveKtMsgSubType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtMsgSubType(String str, int i, long j) {
        this.value = j;
    }

    public static fg8<TaoLiveKtMsgSubType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtMsgSubType taoLiveKtMsgSubType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/service/base/TaoLiveKtMsgSubType");
    }

    public static TaoLiveKtMsgSubType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtMsgSubType) ipChange.ipc$dispatch("79500114", new Object[]{str});
        }
        return (TaoLiveKtMsgSubType) Enum.valueOf(TaoLiveKtMsgSubType.class, str);
    }

    public static TaoLiveKtMsgSubType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtMsgSubType[]) ipChange.ipc$dispatch("49a72f83", new Object[0]);
        }
        return (TaoLiveKtMsgSubType[]) $VALUES.clone();
    }

    public final long getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1b766b6", new Object[]{this})).longValue();
        }
        return this.value;
    }
}
