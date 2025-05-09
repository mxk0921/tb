package com.alipay.android.phone.seauthenticator.iotauth.authmanager;

import android.content.Context;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IAuthenticatorManager {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Callback {
        void onResult(AuthenticatorResponse authenticatorResponse);
    }

    String getSecData();

    int startAuth(Context context, String str, Callback callback);

    boolean startBIOManager(int i);

    int startDeReg(String str, int i, Callback callback);

    int startReg(Context context, String str, int i, Callback callback);

    void stopAuth(int i);
}
