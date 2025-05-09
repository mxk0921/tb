package com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentType;", "", "<init>", "(Ljava/lang/String;I)V", "Normal", "Notice", "DXContent", "TopWelcome", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentType extends Enum<TaoLiveKtCommentType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtCommentType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TaoLiveKtCommentType Normal = new TaoLiveKtCommentType("Normal", 0);
    public static final TaoLiveKtCommentType Notice = new TaoLiveKtCommentType("Notice", 1);
    public static final TaoLiveKtCommentType DXContent = new TaoLiveKtCommentType("DXContent", 2);
    public static final TaoLiveKtCommentType TopWelcome = new TaoLiveKtCommentType("TopWelcome", 3);

    private static final /* synthetic */ TaoLiveKtCommentType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtCommentType[]) ipChange.ipc$dispatch("19b67ec2", new Object[0]) : new TaoLiveKtCommentType[]{Normal, Notice, DXContent, TopWelcome};
    }

    static {
        TaoLiveKtCommentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtCommentType(String str, int i) {
    }

    public static fg8<TaoLiveKtCommentType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentType taoLiveKtCommentType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentType");
    }

    public static TaoLiveKtCommentType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentType) ipChange.ipc$dispatch("f16777ad", new Object[]{str});
        }
        return (TaoLiveKtCommentType) Enum.valueOf(TaoLiveKtCommentType.class, str);
    }

    public static TaoLiveKtCommentType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentType[]) ipChange.ipc$dispatch("6fd5759e", new Object[0]);
        }
        return (TaoLiveKtCommentType[]) $VALUES.clone();
    }
}
