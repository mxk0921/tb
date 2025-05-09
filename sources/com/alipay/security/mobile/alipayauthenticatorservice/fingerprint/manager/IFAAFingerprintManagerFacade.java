package com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
interface IFAAFingerprintManagerFacade {
    void authenticate(IFAAFingerprintCallback iFAAFingerprintCallback);

    void cancel();

    boolean hasEnrolledFingerprints();

    boolean isHardwareDetected();
}
