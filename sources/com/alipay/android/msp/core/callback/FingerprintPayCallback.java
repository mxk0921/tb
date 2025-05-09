package com.alipay.android.msp.core.callback;

import com.alipay.android.msp.plugin.model.FingerprintPayResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface FingerprintPayCallback {
    void onCallback(FingerprintPayResult fingerprintPayResult);

    void onProgressChanged(boolean z, FingerprintPayResult fingerprintPayResult);
}
