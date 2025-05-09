package com.alipay.mobile.common.rpc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DefaultRpcMgwEnvConfig extends RpcMgwEnvConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DefaultRpcMgwEnvConfig defaultRpcMgwEnvConfig, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/rpc/DefaultRpcMgwEnvConfig");
    }

    @Override // com.alipay.mobile.common.rpc.RpcMgwEnvConfig
    public String getMgwUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d4c6af1", new Object[]{this});
        }
        return getUserMgwUrl();
    }

    public String getUserMgwUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ceeb26", new Object[]{this});
        }
        return "";
    }
}
