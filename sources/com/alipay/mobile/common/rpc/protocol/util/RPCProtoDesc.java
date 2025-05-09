package com.alipay.mobile.common.rpc.protocol.util;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RPCProtoDesc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte PROTO_TYPE_JSON_V1 = 0;
    public static final byte PROTO_TYPE_JSON_V2 = 2;
    public static final byte PROTO_TYPE_PB_V1 = 3;
    public static final byte PROTO_TYPE_SIMPLE_JSON_V1 = 1;
    public static final byte PROTO_TYPE_SIMPLE_PB_V1 = 4;
    public byte protoType;

    public boolean isJsonV1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9daa6558", new Object[]{this})).booleanValue();
        }
        if (this.protoType == 0) {
            return true;
        }
        return false;
    }

    public boolean isJsonV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9db87cd9", new Object[]{this})).booleanValue();
        }
        if (this.protoType == 2) {
            return true;
        }
        return false;
    }

    public boolean isPBV1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c1f5942", new Object[]{this})).booleanValue();
        }
        if (this.protoType == 3) {
            return true;
        }
        return false;
    }

    public boolean isSimpleJsonV1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee6d3d2a", new Object[]{this})).booleanValue();
        }
        if (this.protoType == 1) {
            return true;
        }
        return false;
    }

    public boolean isSimplePBV1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98f9fd94", new Object[]{this})).booleanValue();
        }
        if (this.protoType == 4) {
            return true;
        }
        return false;
    }
}
