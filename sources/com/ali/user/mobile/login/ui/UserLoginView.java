package com.ali.user.mobile.login.ui;

import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface UserLoginView extends BaseLoginView {
    void clearPasswordInput();

    void onPwdError();

    void showFindPasswordAlert(LoginParam loginParam, RpcResponse<LoginReturnData> rpcResponse);
}
