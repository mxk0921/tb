package com.alipay.android.phone.iifaa.did.rpc.service;

import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcRequest;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcResponse;
import com.alipay.android.phone.iifaa.did.rpc.model.DidIdpRpcRequest;
import com.alipay.android.phone.iifaa.did.rpc.model.DidIdpRpcResponse;
import com.alipay.android.phone.iifaa.did.rpc.model.IifaaClientRequest;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IifaaDidService {
    @OperationType("alipay.iifaa.did.client.dispatch")
    boolean clientLogDispatch(IifaaClientRequest iifaaClientRequest);

    @OperationType("alipay.iifaa.did.credential.tb.dispatch")
    @SignCheck
    CredentialRpcResponse credentialDispatch(CredentialRpcRequest credentialRpcRequest);

    @OperationType("alipay.iifaa.did.idp.tb.dispatch")
    @SignCheck
    DidIdpRpcResponse idpDispatch(DidIdpRpcRequest didIdpRpcRequest);
}
