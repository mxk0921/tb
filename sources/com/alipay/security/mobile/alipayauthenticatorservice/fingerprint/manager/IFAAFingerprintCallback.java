package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IFAAFingerprintCallback {
    void onAuthenticationError(int i, CharSequence charSequence);

    void onAuthenticationFailed();

    void onAuthenticationSucceeded();
}
