package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface IFingerprintCallback {
    void onCallBack(FingerprintResult fingerprintResult);

    void onProgressChanged(boolean z, FingerprintResult fingerprintResult);
}
