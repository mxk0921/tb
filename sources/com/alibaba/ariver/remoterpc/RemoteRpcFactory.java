package com.alibaba.ariver.remoterpc;

import com.alipay.mobile.common.rpc.Config;
import com.alipay.mobile.common.rpc.RpcFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RemoteRpcFactory extends RpcFactory {
    public RemoteRpcFactory(Config config) {
        super(config);
        this.mRpcInvoker = new RemoteRpcCallClientInvoker(this);
    }
}
