package com.ali.user.mobile.callback;

import com.ali.user.mobile.rpc.RpcResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface RpcRequestCallback<T> {
    void onError(RpcResponse<T> rpcResponse);

    void onSuccess(RpcResponse<T> rpcResponse);
}
