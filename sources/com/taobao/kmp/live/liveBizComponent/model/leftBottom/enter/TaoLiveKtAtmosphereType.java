package com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/TaoLiveKtAtmosphereType;", "", "<init>", "(Ljava/lang/String;I)V", "Enter", "Trade", "DXAtmosphere", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtAtmosphereType extends Enum<TaoLiveKtAtmosphereType> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveKtAtmosphereType[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TaoLiveKtAtmosphereType Enter = new TaoLiveKtAtmosphereType("Enter", 0);
    public static final TaoLiveKtAtmosphereType Trade = new TaoLiveKtAtmosphereType("Trade", 1);
    public static final TaoLiveKtAtmosphereType DXAtmosphere = new TaoLiveKtAtmosphereType("DXAtmosphere", 2);

    private static final /* synthetic */ TaoLiveKtAtmosphereType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveKtAtmosphereType[]) ipChange.ipc$dispatch("1ea28206", new Object[0]) : new TaoLiveKtAtmosphereType[]{Enter, Trade, DXAtmosphere};
    }

    static {
        TaoLiveKtAtmosphereType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveKtAtmosphereType(String str, int i) {
    }

    public static fg8<TaoLiveKtAtmosphereType> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtAtmosphereType taoLiveKtAtmosphereType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/leftBottom/enter/TaoLiveKtAtmosphereType");
    }

    public static TaoLiveKtAtmosphereType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAtmosphereType) ipChange.ipc$dispatch("3d10a67b", new Object[]{str});
        }
        return (TaoLiveKtAtmosphereType) Enum.valueOf(TaoLiveKtAtmosphereType.class, str);
    }

    public static TaoLiveKtAtmosphereType[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtAtmosphereType[]) ipChange.ipc$dispatch("8c6266aa", new Object[0]);
        }
        return (TaoLiveKtAtmosphereType[]) $VALUES.clone();
    }
}
