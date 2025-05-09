package com.taobao.kmp.live.liveBizComponent.model.topGroup;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/topGroup/TaoLiveKtNoticeEntityType;", "", "<init>", "(Ljava/lang/String;I)V", "NormalNotice", "DXNotice", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtNoticeEntityType extends Enum<TaoLiveKtNoticeEntityType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtNoticeEntityType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TaoLiveKtNoticeEntityType NormalNotice = new TaoLiveKtNoticeEntityType("NormalNotice", 0);
    public static final TaoLiveKtNoticeEntityType DXNotice = new TaoLiveKtNoticeEntityType("DXNotice", 1);

    private static final /* synthetic */ TaoLiveKtNoticeEntityType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtNoticeEntityType[]) ipChange.ipc$dispatch("306ea23e", new Object[0]) : new TaoLiveKtNoticeEntityType[]{NormalNotice, DXNotice};
    }

    static {
        TaoLiveKtNoticeEntityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtNoticeEntityType(String str, int i) {
    }

    public static fg8<TaoLiveKtNoticeEntityType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtNoticeEntityType taoLiveKtNoticeEntityType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/topGroup/TaoLiveKtNoticeEntityType");
    }

    public static TaoLiveKtNoticeEntityType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtNoticeEntityType) ipChange.ipc$dispatch("339a8273", new Object[]{str});
        }
        return (TaoLiveKtNoticeEntityType) Enum.valueOf(TaoLiveKtNoticeEntityType.class, str);
    }

    public static TaoLiveKtNoticeEntityType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtNoticeEntityType[]) ipChange.ipc$dispatch("528fd1e2", new Object[0]);
        }
        return (TaoLiveKtNoticeEntityType[]) $VALUES.clone();
    }
}
