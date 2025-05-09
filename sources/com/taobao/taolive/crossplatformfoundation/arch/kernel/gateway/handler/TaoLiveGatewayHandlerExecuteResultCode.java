package com.taobao.taolive.crossplatformfoundation.arch.kernel.gateway.handler;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.enums.a;
import tb.fg8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/kernel/gateway/handler/TaoLiveGatewayHandlerExecuteResultCode;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PASSED", "SUCCESSFULLY", "FAILURE", "AUTHENTICATIONFAUILURE", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TaoLiveGatewayHandlerExecuteResultCode extends Enum<TaoLiveGatewayHandlerExecuteResultCode> {
    private static final /* synthetic */ fg8 $ENTRIES;
    private static final /* synthetic */ TaoLiveGatewayHandlerExecuteResultCode[] $VALUES;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TaoLiveGatewayHandlerExecuteResultCode PASSED = new TaoLiveGatewayHandlerExecuteResultCode("PASSED", 0, "PASSED");
    public static final TaoLiveGatewayHandlerExecuteResultCode SUCCESSFULLY = new TaoLiveGatewayHandlerExecuteResultCode("SUCCESSFULLY", 1, "SUCCESSFULLY");
    public static final TaoLiveGatewayHandlerExecuteResultCode FAILURE = new TaoLiveGatewayHandlerExecuteResultCode("FAILURE", 2, "FAILURE");
    public static final TaoLiveGatewayHandlerExecuteResultCode AUTHENTICATIONFAUILURE = new TaoLiveGatewayHandlerExecuteResultCode("AUTHENTICATIONFAUILURE", 3, "AUTHENTICATIONFAUILURE");

    private static final /* synthetic */ TaoLiveGatewayHandlerExecuteResultCode[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoLiveGatewayHandlerExecuteResultCode[]) ipChange.ipc$dispatch("8533aa84", new Object[0]) : new TaoLiveGatewayHandlerExecuteResultCode[]{PASSED, SUCCESSFULLY, FAILURE, AUTHENTICATIONFAUILURE};
    }

    static {
        TaoLiveGatewayHandlerExecuteResultCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TaoLiveGatewayHandlerExecuteResultCode(String str, int i, String str2) {
    }

    public static fg8<TaoLiveGatewayHandlerExecuteResultCode> getEntries() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fg8) ipChange.ipc$dispatch("24e60520", new Object[0]);
        }
        return $ENTRIES;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveGatewayHandlerExecuteResultCode taoLiveGatewayHandlerExecuteResultCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/crossplatformfoundation/arch/kernel/gateway/handler/TaoLiveGatewayHandlerExecuteResultCode");
    }

    public static TaoLiveGatewayHandlerExecuteResultCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveGatewayHandlerExecuteResultCode) ipChange.ipc$dispatch("ee8976b9", new Object[]{str});
        }
        return (TaoLiveGatewayHandlerExecuteResultCode) Enum.valueOf(TaoLiveGatewayHandlerExecuteResultCode.class, str);
    }

    public static TaoLiveGatewayHandlerExecuteResultCode[] values() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveGatewayHandlerExecuteResultCode[]) ipChange.ipc$dispatch("1d0d4a28", new Object[0]);
        }
        return (TaoLiveGatewayHandlerExecuteResultCode[]) $VALUES.clone();
    }
}
