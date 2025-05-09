package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.builder;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/builder/TaoLiveKtCommentConfigBiz;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TopWelcome", "HotSale", "AIResponse", "CommentButton", "PlaybackOpen", "EnterAtmosphere", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentConfigBiz extends Enum<TaoLiveKtCommentConfigBiz> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtCommentConfigBiz[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String value;
    public static final TaoLiveKtCommentConfigBiz TopWelcome = new TaoLiveKtCommentConfigBiz("TopWelcome", 0, "disableFusionComment");
    public static final TaoLiveKtCommentConfigBiz HotSale = new TaoLiveKtCommentConfigBiz("HotSale", 1, "disableShopAtmosphere");
    public static final TaoLiveKtCommentConfigBiz AIResponse = new TaoLiveKtCommentConfigBiz("AIResponse", 2, "disableAiResp");
    public static final TaoLiveKtCommentConfigBiz CommentButton = new TaoLiveKtCommentConfigBiz("CommentButton", 3, "disableCommentButton");
    public static final TaoLiveKtCommentConfigBiz PlaybackOpen = new TaoLiveKtCommentConfigBiz("PlaybackOpen", 4, "disablePlaybackComment");
    public static final TaoLiveKtCommentConfigBiz EnterAtmosphere = new TaoLiveKtCommentConfigBiz("EnterAtmosphere", 5, "disableAtmosphere");

    private static final /* synthetic */ TaoLiveKtCommentConfigBiz[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtCommentConfigBiz[]) ipChange.ipc$dispatch("8c2d4e3", new Object[0]) : new TaoLiveKtCommentConfigBiz[]{TopWelcome, HotSale, AIResponse, CommentButton, PlaybackOpen, EnterAtmosphere};
    }

    static {
        TaoLiveKtCommentConfigBiz[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtCommentConfigBiz(String str, int i, String str2) {
        this.value = str2;
    }

    public static fg8<TaoLiveKtCommentConfigBiz> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentConfigBiz taoLiveKtCommentConfigBiz, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/builder/TaoLiveKtCommentConfigBiz");
    }

    public static TaoLiveKtCommentConfigBiz valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentConfigBiz) ipChange.ipc$dispatch("3c13b458", new Object[]{str});
        }
        return (TaoLiveKtCommentConfigBiz) Enum.valueOf(TaoLiveKtCommentConfigBiz.class, str);
    }

    public static TaoLiveKtCommentConfigBiz[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentConfigBiz[]) ipChange.ipc$dispatch("3635d587", new Object[0]);
        }
        return (TaoLiveKtCommentConfigBiz[]) $VALUES.clone();
    }

    public final String getValue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
        }
        return this.value;
    }
}
