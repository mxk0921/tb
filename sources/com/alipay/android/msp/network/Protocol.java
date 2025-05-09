package com.alipay.android.msp.network;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum Protocol {
    HTTP("http"),
    RPC_V1("rpc_v1"),
    RPC_V2("rpc_v2"),
    RPC_SDK_V3("rpc_sdk_v3"),
    RPC_V3("RPC_V3");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String protocol;

    Protocol(String str) {
        this.protocol = str;
    }

    public static Protocol get(String str) throws EnumConstantNotPresentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Protocol) ipChange.ipc$dispatch("702c7e23", new Object[]{str});
        }
        Protocol protocol = HTTP;
        if (str.equals(protocol.protocol)) {
            return protocol;
        }
        Protocol protocol2 = RPC_V1;
        if (str.equals(protocol2.protocol)) {
            return protocol2;
        }
        Protocol protocol3 = RPC_V2;
        if (str.equals(protocol3.protocol)) {
            return protocol3;
        }
        Protocol protocol4 = RPC_SDK_V3;
        if (str.equals(protocol4.protocol)) {
            return protocol4;
        }
        Protocol protocol5 = RPC_V3;
        if (str.equals(protocol5.protocol)) {
            return protocol5;
        }
        throw new EnumConstantNotPresentException(Protocol.class, str);
    }

    public static /* synthetic */ Object ipc$super(Protocol protocol, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/Protocol");
    }

    public static Protocol valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Protocol) ipChange.ipc$dispatch("651c2e75", new Object[]{str});
        }
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    @Override // java.lang.Enum
    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.protocol;
    }
}
