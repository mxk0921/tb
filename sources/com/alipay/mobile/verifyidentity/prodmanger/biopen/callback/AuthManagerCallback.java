package com.alipay.mobile.verifyidentity.prodmanger.biopen.callback;

import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthManagerCallback implements AuthenticatorManager.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager.Callback
    public void onResult(AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688a9824", new Object[]{this, authenticatorResponse});
        }
    }
}
