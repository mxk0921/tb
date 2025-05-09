package com.alipay.mobile.verifyidentity.module.fingerprint.proxy;

import com.alipay.android.app.smartpays.api.FingerprintManager;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintRequest;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.mobile.verifyidentity.sentry.ASProxy;
import com.alipay.mobile.verifyidentity.sentry.SentryDelegate;
import com.alipay.mobile.verifyidentity.sentry.SentryHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ApiFingerprintManagerProxy implements ASProxy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SentryDelegate delegate;
    private FingerprintManager fingerprintManager;

    public ApiFingerprintManagerProxy(FingerprintManager fingerprintManager) {
        this.fingerprintManager = fingerprintManager;
    }

    public static /* synthetic */ SentryDelegate access$000(ApiFingerprintManagerProxy apiFingerprintManagerProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SentryDelegate) ipChange.ipc$dispatch("5465d745", new Object[]{apiFingerprintManagerProxy});
        }
        return apiFingerprintManagerProxy.delegate;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        this.delegate = new SentryDelegate();
        return this.fingerprintManager.checkUserStatus(str);
    }

    public FingerprintResult initHardwarePay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("67bf3dfe", new Object[]{this, str});
        }
        this.delegate = new SentryDelegate();
        FingerprintResult initHardwarePay = this.fingerprintManager.initHardwarePay(str);
        SentryHelper.a(initHardwarePay);
        return initHardwarePay;
    }

    public void vertify(FingerprintRequest fingerprintRequest, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90150a3", new Object[]{this, fingerprintRequest, iFingerprintCallback});
            return;
        }
        this.delegate = new SentryDelegate();
        SentryHelper.a(fingerprintRequest);
        this.fingerprintManager.vertify(fingerprintRequest, new IFingerprintCallback() { // from class: com.alipay.mobile.verifyidentity.module.fingerprint.proxy.ApiFingerprintManagerProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
            public void onCallBack(FingerprintResult fingerprintResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("646591f4", new Object[]{this, fingerprintResult});
                    return;
                }
                if (ApiFingerprintManagerProxy.access$000(ApiFingerprintManagerProxy.this).f4450a) {
                    if (fingerprintResult == null) {
                        ApiFingerprintManagerProxy.access$000(ApiFingerprintManagerProxy.this);
                    } else if (fingerprintResult.mStatus == FingerprintResult.FingerprintStatus.DLG_CANCEL) {
                        ApiFingerprintManagerProxy.access$000(ApiFingerprintManagerProxy.this);
                    } else {
                        ApiFingerprintManagerProxy.access$000(ApiFingerprintManagerProxy.this);
                        SentryHelper.a(fingerprintResult);
                    }
                }
                IFingerprintCallback iFingerprintCallback2 = iFingerprintCallback;
                if (iFingerprintCallback2 != null) {
                    iFingerprintCallback2.onCallBack(fingerprintResult);
                }
            }

            @Override // com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
            public void onProgressChanged(boolean z, FingerprintResult fingerprintResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b636ace", new Object[]{this, new Boolean(z), fingerprintResult});
                    return;
                }
                IFingerprintCallback iFingerprintCallback2 = iFingerprintCallback;
                if (iFingerprintCallback2 != null) {
                    iFingerprintCallback2.onProgressChanged(z, fingerprintResult);
                }
            }
        });
    }
}
