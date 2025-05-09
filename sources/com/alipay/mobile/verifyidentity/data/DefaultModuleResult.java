package com.alipay.mobile.verifyidentity.data;

import com.alipay.mobileic.core.model.rpc.MICRpcResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DefaultModuleResult extends ModuleExecuteResult {
    public DefaultModuleResult(String str) {
        MICRpcResponse mICRpcResponse = new MICRpcResponse();
        this.mMICRpcResponse = mICRpcResponse;
        mICRpcResponse.success = true;
        mICRpcResponse.finish = true;
        if ("1003".equalsIgnoreCase(str) || "1000".equalsIgnoreCase(str)) {
            this.mMICRpcResponse.verifySuccess = true;
        }
        this.mMICRpcResponse.finishCode = str;
    }
}
