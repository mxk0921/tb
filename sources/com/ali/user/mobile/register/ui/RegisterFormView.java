package com.ali.user.mobile.register.ui;

import com.ali.user.mobile.base.BaseView;
import com.ali.user.mobile.data.model.SmsApplyResult;
import com.ali.user.mobile.model.LoginParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface RegisterFormView extends BaseView {
    String getRegType();

    void onSendSMSSuccess(LoginParam loginParam, long j, SmsApplyResult smsApplyResult);
}
