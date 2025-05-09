package com.ali.user.mobile.callback;

import com.ali.user.mobile.exception.LoginException;
import com.ali.user.mobile.rpc.RpcResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface LoginTasksCallback<T> {
    void onCancel();

    void onFail(LoginException<T> loginException);

    void onSuccess(RpcResponse<T> rpcResponse);
}
