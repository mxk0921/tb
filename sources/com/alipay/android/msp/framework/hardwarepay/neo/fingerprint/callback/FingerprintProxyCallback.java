package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.utils.EventLogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FingerprintProxyCallback implements IFingerprintCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IFingerprintCallback mCallback;
    public Context mContext;

    public FingerprintProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        this.mContext = context.getApplicationContext();
        this.mCallback = iFingerprintCallback;
        onStart();
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintProxyCallback");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
    public void onCallBack(FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ff7d", new Object[]{this, fingerprintResult});
            return;
        }
        onProgressChanged(true, fingerprintResult);
        IFingerprintCallback iFingerprintCallback = this.mCallback;
        if (iFingerprintCallback != null) {
            iFingerprintCallback.onCallBack(fingerprintResult);
        }
        onFinish();
    }

    public abstract void onFinish();

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
    public void onProgressChanged(boolean z, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba6a57", new Object[]{this, new Boolean(z), fingerprintResult});
            return;
        }
        IFingerprintCallback iFingerprintCallback = this.mCallback;
        if (iFingerprintCallback != null) {
            iFingerprintCallback.onProgressChanged(z, fingerprintResult);
        }
    }

    public abstract void onStart();
}
