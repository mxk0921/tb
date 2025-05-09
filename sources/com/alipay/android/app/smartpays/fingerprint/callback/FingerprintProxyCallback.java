package com.alipay.android.app.smartpays.fingerprint.callback;

import android.content.Context;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FingerprintProxyCallback implements IFingerprintCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public IFingerprintCallback mCallback;
    public Context mContext;

    public FingerprintProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        this.mContext = context.getApplicationContext();
        this.mCallback = iFingerprintCallback;
        onStart();
    }

    @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
    public void onCallBack(FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646591f4", new Object[]{this, fingerprintResult});
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

    @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
    public void onProgressChanged(boolean z, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b636ace", new Object[]{this, new Boolean(z), fingerprintResult});
            return;
        }
        IFingerprintCallback iFingerprintCallback = this.mCallback;
        if (iFingerprintCallback != null) {
            iFingerprintCallback.onProgressChanged(z, fingerprintResult);
        }
    }

    public abstract void onStart();
}
