package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentDxBizType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "WarningSlogan", "AnchorResponse", "AnchorResponseMe", "TopSelected", "TopAnchorResponse", "LiveCopilot", "LiveAiInteractive", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentDxBizType extends Enum<TaoLiveKtCommentDxBizType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtCommentDxBizType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final TaoLiveKtCommentDxBizType WarningSlogan = new TaoLiveKtCommentDxBizType("WarningSlogan", 0, "warningSlogan");
    public static final TaoLiveKtCommentDxBizType AnchorResponse = new TaoLiveKtCommentDxBizType("AnchorResponse", 1, "anchorResponse");
    public static final TaoLiveKtCommentDxBizType AnchorResponseMe = new TaoLiveKtCommentDxBizType("AnchorResponseMe", 2, "anchorResponseToMe");
    public static final TaoLiveKtCommentDxBizType TopSelected = new TaoLiveKtCommentDxBizType("TopSelected", 3, "topSelectComment");
    public static final TaoLiveKtCommentDxBizType TopAnchorResponse = new TaoLiveKtCommentDxBizType("TopAnchorResponse", 4, "topAnchorResponse");
    public static final TaoLiveKtCommentDxBizType LiveCopilot = new TaoLiveKtCommentDxBizType("LiveCopilot", 5, "liveCopilot");
    public static final TaoLiveKtCommentDxBizType LiveAiInteractive = new TaoLiveKtCommentDxBizType("LiveAiInteractive", 6, "liveAiInteractive");

    private static final /* synthetic */ TaoLiveKtCommentDxBizType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtCommentDxBizType[]) ipChange.ipc$dispatch("de67338d", new Object[0]) : new TaoLiveKtCommentDxBizType[]{WarningSlogan, AnchorResponse, AnchorResponseMe, TopSelected, TopAnchorResponse, LiveCopilot, LiveAiInteractive};
    }

    static {
        TaoLiveKtCommentDxBizType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtCommentDxBizType(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<TaoLiveKtCommentDxBizType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentDxBizType taoLiveKtCommentDxBizType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentDxBizType");
    }

    public static TaoLiveKtCommentDxBizType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentDxBizType) ipChange.ipc$dispatch("7fe36c42", new Object[]{str});
        }
        return (TaoLiveKtCommentDxBizType) Enum.valueOf(TaoLiveKtCommentDxBizType.class, str);
    }

    public static TaoLiveKtCommentDxBizType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentDxBizType[]) ipChange.ipc$dispatch("b12a0d31", new Object[0]);
        }
        return (TaoLiveKtCommentDxBizType[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
