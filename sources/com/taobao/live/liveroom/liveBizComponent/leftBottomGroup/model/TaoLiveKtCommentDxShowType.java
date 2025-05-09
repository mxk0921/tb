package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentDxShowType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Normal", "Bottom", "AnchorResponse", "WarnTips", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentDxShowType extends Enum<TaoLiveKtCommentDxShowType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtCommentDxShowType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final TaoLiveKtCommentDxShowType Normal = new TaoLiveKtCommentDxShowType("Normal", 0, "commentNormal");
    public static final TaoLiveKtCommentDxShowType Bottom = new TaoLiveKtCommentDxShowType("Bottom", 1, "commentBottom");
    public static final TaoLiveKtCommentDxShowType AnchorResponse = new TaoLiveKtCommentDxShowType("AnchorResponse", 2, "anchorResponse");
    public static final TaoLiveKtCommentDxShowType WarnTips = new TaoLiveKtCommentDxShowType("WarnTips", 3, "warnTips");

    private static final /* synthetic */ TaoLiveKtCommentDxShowType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtCommentDxShowType[]) ipChange.ipc$dispatch("52f96285", new Object[0]) : new TaoLiveKtCommentDxShowType[]{Normal, Bottom, AnchorResponse, WarnTips};
    }

    static {
        TaoLiveKtCommentDxShowType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtCommentDxShowType(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<TaoLiveKtCommentDxShowType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentDxShowType taoLiveKtCommentDxShowType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentDxShowType");
    }

    public static TaoLiveKtCommentDxShowType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentDxShowType) ipChange.ipc$dispatch("e1044070", new Object[]{str});
        }
        return (TaoLiveKtCommentDxShowType) Enum.valueOf(TaoLiveKtCommentDxShowType.class, str);
    }

    public static TaoLiveKtCommentDxShowType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentDxShowType[]) ipChange.ipc$dispatch("d891bd61", new Object[0]);
        }
        return (TaoLiveKtCommentDxShowType[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
