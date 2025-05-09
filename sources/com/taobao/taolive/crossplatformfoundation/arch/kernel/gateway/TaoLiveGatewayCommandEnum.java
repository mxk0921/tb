package com.taobao.taolive.crossplatformfoundation.arch.kernel.gateway;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.pg1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/kernel/gateway/TaoLiveGatewayCommandEnum;", "", "<init>", "(Ljava/lang/String;I)V", pg1.ATOM_EXT_Undefined, "CreateOpenLiveRoomContext", "CreateOpenLiveRoomEntity", "PerformOpenLiveRoomLifecycle", "PerformIntent", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TaoLiveGatewayCommandEnum extends Enum<TaoLiveGatewayCommandEnum> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveGatewayCommandEnum[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TaoLiveGatewayCommandEnum Undefined = new TaoLiveGatewayCommandEnum(pg1.ATOM_EXT_Undefined, 0);
    public static final TaoLiveGatewayCommandEnum CreateOpenLiveRoomContext = new TaoLiveGatewayCommandEnum("CreateOpenLiveRoomContext", 1);
    public static final TaoLiveGatewayCommandEnum CreateOpenLiveRoomEntity = new TaoLiveGatewayCommandEnum("CreateOpenLiveRoomEntity", 2);
    public static final TaoLiveGatewayCommandEnum PerformOpenLiveRoomLifecycle = new TaoLiveGatewayCommandEnum("PerformOpenLiveRoomLifecycle", 3);
    public static final TaoLiveGatewayCommandEnum PerformIntent = new TaoLiveGatewayCommandEnum("PerformIntent", 4);

    private static final /* synthetic */ TaoLiveGatewayCommandEnum[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveGatewayCommandEnum[]) ipChange.ipc$dispatch("9b6068ac", new Object[0]) : new TaoLiveGatewayCommandEnum[]{Undefined, CreateOpenLiveRoomContext, CreateOpenLiveRoomEntity, PerformOpenLiveRoomLifecycle, PerformIntent};
    }

    static {
        TaoLiveGatewayCommandEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveGatewayCommandEnum(String str, int i) {
    }

    public static fg8<TaoLiveGatewayCommandEnum> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveGatewayCommandEnum taoLiveGatewayCommandEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/crossplatformfoundation/arch/kernel/gateway/TaoLiveGatewayCommandEnum");
    }

    public static TaoLiveGatewayCommandEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveGatewayCommandEnum) ipChange.ipc$dispatch("87cfc557", new Object[]{str});
        }
        return (TaoLiveGatewayCommandEnum) Enum.valueOf(TaoLiveGatewayCommandEnum.class, str);
    }

    public static TaoLiveGatewayCommandEnum[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveGatewayCommandEnum[]) ipChange.ipc$dispatch("15c9ca88", new Object[0]);
        }
        return (TaoLiveGatewayCommandEnum[]) $VALUES.clone();
    }
}
