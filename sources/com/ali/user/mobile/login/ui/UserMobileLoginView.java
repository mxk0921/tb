package com.ali.user.mobile.login.ui;

import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.RpcResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface UserMobileLoginView extends BaseLoginView {
    String getCountryCode();

    String getPhoneCode();

    void onCheckCodeError();

    void onSMSOverLimit(LoginParam loginParam, RpcResponse rpcResponse);

    void onSMSSendFail(LoginParam loginParam, RpcResponse rpcResponse);

    void onSendSMSSuccess(LoginParam loginParam, long j, boolean z);
}
