package com.ali.user.mobile.callback;

import com.ali.user.mobile.rpc.RpcResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface RpcRequestCallbackWithCode {
    void onError(String str, RpcResponse rpcResponse);

    void onSuccess(RpcResponse rpcResponse);

    void onSystemError(String str, RpcResponse rpcResponse);
}
