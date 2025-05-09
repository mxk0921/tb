package com.taobao.kmp.nexus.arch.openArch.definition;

import com.ali.user.mobile.ui.WebConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;
import tb.gyb;
import tb.pg1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/kmp/nexus/arch/openArch/definition/OpenArchBizCode;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode$nexus_release", "()I", pg1.ATOM_EXT_Undefined, "SingleLiveRoomCard", "SingleLiveRoomPublic", "SingleLiveRoomShopTab3", "SingleLiveRoomShopLoft", "WatchLiveRoomPublic", "WatchLiveRoomChanelMix", "WatchLiveRoomAppTab2", "WatchLiveRoomHomeTab", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OpenArchBizCode extends Enum<OpenArchBizCode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ OpenArchBizCode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int code;
    public static final OpenArchBizCode Undefined = new OpenArchBizCode(pg1.ATOM_EXT_Undefined, 0, 0);
    public static final OpenArchBizCode SingleLiveRoomCard = new OpenArchBizCode("SingleLiveRoomCard", 1, 256);
    public static final OpenArchBizCode SingleLiveRoomPublic = new OpenArchBizCode("SingleLiveRoomPublic", 2, 257);
    public static final OpenArchBizCode SingleLiveRoomShopTab3 = new OpenArchBizCode("SingleLiveRoomShopTab3", 3, WebConstant.OPEN_WEB_RESCODE);
    public static final OpenArchBizCode SingleLiveRoomShopLoft = new OpenArchBizCode("SingleLiveRoomShopLoft", 4, gyb.ERROR_MTOP_SERVICE_EXCEPTION);
    public static final OpenArchBizCode WatchLiveRoomPublic = new OpenArchBizCode("WatchLiveRoomPublic", 5, 1);
    public static final OpenArchBizCode WatchLiveRoomChanelMix = new OpenArchBizCode("WatchLiveRoomChanelMix", 6, 2);
    public static final OpenArchBizCode WatchLiveRoomAppTab2 = new OpenArchBizCode("WatchLiveRoomAppTab2", 7, 3);
    public static final OpenArchBizCode WatchLiveRoomHomeTab = new OpenArchBizCode("WatchLiveRoomHomeTab", 8, 5);

    private static final /* synthetic */ OpenArchBizCode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OpenArchBizCode[]) ipChange.ipc$dispatch("a450c977", new Object[0]) : new OpenArchBizCode[]{Undefined, SingleLiveRoomCard, SingleLiveRoomPublic, SingleLiveRoomShopTab3, SingleLiveRoomShopLoft, WatchLiveRoomPublic, WatchLiveRoomChanelMix, WatchLiveRoomAppTab2, WatchLiveRoomHomeTab};
    }

    static {
        OpenArchBizCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OpenArchBizCode(String str, int i, int i2) {
        this.code = i2;
    }

    public static fg8<OpenArchBizCode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(OpenArchBizCode openArchBizCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/definition/OpenArchBizCode");
    }

    public static OpenArchBizCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchBizCode) ipChange.ipc$dispatch("5765b3ac", new Object[]{str});
        }
        return (OpenArchBizCode) Enum.valueOf(OpenArchBizCode.class, str);
    }

    public static OpenArchBizCode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchBizCode[]) ipChange.ipc$dispatch("ec6dc11b", new Object[0]);
        }
        return (OpenArchBizCode[]) $VALUES.clone();
    }

    public final int getCode$nexus_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36faacc0", new Object[]{this})).intValue();
        }
        return this.code;
    }
}
