package com.ali.user.mobile.service;

import android.content.Context;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface LoginService {
    void mobileVerifyLogin(Context context, LoginParam loginParam, CommonCallback commonCallback);

    void onekeyLogin(Context context, Map<String, String> map, CommonCallback commonCallback);

    void pwdLogin(LoginParam loginParam, CommonCallback commonCallback);

    void touristLogin(String str, LoginParam loginParam);
}
