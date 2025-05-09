package com.ali.user.open.core.model;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface RpcRequestCallbackWithCode {
    void onError(String str, RpcResponse rpcResponse);

    void onSuccess(RpcResponse rpcResponse);

    void onSystemError(String str, RpcResponse rpcResponse);
}
