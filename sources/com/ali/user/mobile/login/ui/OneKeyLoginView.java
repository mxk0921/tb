package com.ali.user.mobile.login.ui;

import com.ali.user.mobile.model.LoginParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface OneKeyLoginView extends BaseLoginView {
    void onGetAccessTokenFail(LoginParam loginParam);

    void onNeedVerifyMobile(String str, String str2);
}
