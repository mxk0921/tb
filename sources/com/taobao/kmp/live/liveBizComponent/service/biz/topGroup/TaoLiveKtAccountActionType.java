package com.taobao.kmp.live.liveBizComponent.service.biz.topGroup;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.to8;
import tb.z9u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtAccountActionType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", z9u.SEARCH_ACCOUNT_LIVE_FOLLOW, "UnFollow", "Favor", "UnFavor", "AddFansClub", "SubscribeWidget", "SubscribeLive", "Intimacy", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtAccountActionType extends Enum<TaoLiveKtAccountActionType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtAccountActionType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final TaoLiveKtAccountActionType Follow = new TaoLiveKtAccountActionType(z9u.SEARCH_ACCOUNT_LIVE_FOLLOW, 0, "follow");
    public static final TaoLiveKtAccountActionType UnFollow = new TaoLiveKtAccountActionType("UnFollow", 1, "unFollow");
    public static final TaoLiveKtAccountActionType Favor = new TaoLiveKtAccountActionType("Favor", 2, to8.FAVOR);
    public static final TaoLiveKtAccountActionType UnFavor = new TaoLiveKtAccountActionType("UnFavor", 3, "unFavor");
    public static final TaoLiveKtAccountActionType AddFansClub = new TaoLiveKtAccountActionType("AddFansClub", 4, "addFansClub");
    public static final TaoLiveKtAccountActionType SubscribeWidget = new TaoLiveKtAccountActionType("SubscribeWidget", 5, "subscribeWidget");
    public static final TaoLiveKtAccountActionType SubscribeLive = new TaoLiveKtAccountActionType("SubscribeLive", 6, "subscribeLive");
    public static final TaoLiveKtAccountActionType Intimacy = new TaoLiveKtAccountActionType("Intimacy", 7, "intimacy");

    private static final /* synthetic */ TaoLiveKtAccountActionType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtAccountActionType[]) ipChange.ipc$dispatch("f1bf1296", new Object[0]) : new TaoLiveKtAccountActionType[]{Follow, UnFollow, Favor, UnFavor, AddFansClub, SubscribeWidget, SubscribeLive, Intimacy};
    }

    static {
        TaoLiveKtAccountActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtAccountActionType(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<TaoLiveKtAccountActionType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtAccountActionType taoLiveKtAccountActionType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtAccountActionType");
    }

    public static TaoLiveKtAccountActionType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAccountActionType) ipChange.ipc$dispatch("a1157cc1", new Object[]{str});
        }
        return (TaoLiveKtAccountActionType) Enum.valueOf(TaoLiveKtAccountActionType.class, str);
    }

    public static TaoLiveKtAccountActionType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAccountActionType[]) ipChange.ipc$dispatch("3bfbc272", new Object[0]);
        }
        return (TaoLiveKtAccountActionType[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
