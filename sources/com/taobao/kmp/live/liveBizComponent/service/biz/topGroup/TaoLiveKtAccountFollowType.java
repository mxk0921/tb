package com.taobao.kmp.live.liveBizComponent.service.biz.topGroup;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtAccountFollowType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "None", "UnFollow", "UnFavor", "JoinedFansClub", "JoinedFansClubWithUnFavor", "Intimacy", "IntimacyWithUnFavor", "WidgetSubscribed", "Unsubscribed", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtAccountFollowType extends Enum<TaoLiveKtAccountFollowType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtAccountFollowType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final TaoLiveKtAccountFollowType None = new TaoLiveKtAccountFollowType("None", 0, "none");
    public static final TaoLiveKtAccountFollowType UnFollow = new TaoLiveKtAccountFollowType("UnFollow", 1, "unFollow");
    public static final TaoLiveKtAccountFollowType UnFavor = new TaoLiveKtAccountFollowType("UnFavor", 2, "unFavor");
    public static final TaoLiveKtAccountFollowType JoinedFansClub = new TaoLiveKtAccountFollowType("JoinedFansClub", 3, "joinedFansClub");
    public static final TaoLiveKtAccountFollowType JoinedFansClubWithUnFavor = new TaoLiveKtAccountFollowType("JoinedFansClubWithUnFavor", 4, "joinedFansClubWithUnFavor");
    public static final TaoLiveKtAccountFollowType Intimacy = new TaoLiveKtAccountFollowType("Intimacy", 5, "intimacy");
    public static final TaoLiveKtAccountFollowType IntimacyWithUnFavor = new TaoLiveKtAccountFollowType("IntimacyWithUnFavor", 6, "intimacyWithUnFavor");
    public static final TaoLiveKtAccountFollowType WidgetSubscribed = new TaoLiveKtAccountFollowType("WidgetSubscribed", 7, "widgetSubscribed");
    public static final TaoLiveKtAccountFollowType Unsubscribed = new TaoLiveKtAccountFollowType("Unsubscribed", 8, "unsubscribed");

    private static final /* synthetic */ TaoLiveKtAccountFollowType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtAccountFollowType[]) ipChange.ipc$dispatch("f28389fb", new Object[0]) : new TaoLiveKtAccountFollowType[]{None, UnFollow, UnFavor, JoinedFansClub, JoinedFansClubWithUnFavor, Intimacy, IntimacyWithUnFavor, WidgetSubscribed, Unsubscribed};
    }

    static {
        TaoLiveKtAccountFollowType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtAccountFollowType(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<TaoLiveKtAccountFollowType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtAccountFollowType taoLiveKtAccountFollowType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/service/biz/topGroup/TaoLiveKtAccountFollowType");
    }

    public static TaoLiveKtAccountFollowType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAccountFollowType) ipChange.ipc$dispatch("a1d9f426", new Object[]{str});
        }
        return (TaoLiveKtAccountFollowType) Enum.valueOf(TaoLiveKtAccountFollowType.class, str);
    }

    public static TaoLiveKtAccountFollowType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAccountFollowType[]) ipChange.ipc$dispatch("3cc039d7", new Object[0]);
        }
        return (TaoLiveKtAccountFollowType[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
