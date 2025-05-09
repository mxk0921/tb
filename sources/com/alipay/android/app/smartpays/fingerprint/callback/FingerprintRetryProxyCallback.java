package com.alipay.android.app.smartpays.fingerprint.callback;

import android.content.Context;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FingerprintRetryProxyCallback extends FingerprintCanceableProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c = 0;
    public boolean d = false;

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* renamed from: com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus;

        static {
            int[] iArr = new int[FingerprintResult.FingerprintStatus.values().length];
            $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus = iArr;
            try {
                iArr[FingerprintResult.FingerprintStatus.COMMON_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_BUSY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_CANCELED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TO_PWD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_TOPWD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_CANCEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_VERIFYING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public FingerprintRetryProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
    }

    public static /* synthetic */ Object ipc$super(FingerprintRetryProxyCallback fingerprintRetryProxyCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 195948249) {
            super.onFinish();
            return null;
        } else if (hashCode == 1264806606) {
            super.onProgressChanged(((Boolean) objArr[0]).booleanValue(), (FingerprintResult) objArr[1]);
            return null;
        } else if (hashCode == 2133689546) {
            super.onStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/app/smartpays/fingerprint/callback/FingerprintRetryProxyCallback");
        }
    }

    public final boolean c(FingerprintResult.FingerprintStatus fingerprintStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdec908f", new Object[]{this, fingerprintStatus})).booleanValue();
        }
        switch (AnonymousClass2.$SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[fingerprintStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintCanceableProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else {
            super.onFinish();
        }
    }

    public abstract void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus);

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback, com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
    public void onProgressChanged(boolean z, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b636ace", new Object[]{this, new Boolean(z), fingerprintResult});
            return;
        }
        super.onProgressChanged(z, fingerprintResult);
        onStatusChanged(z, fingerprintResult);
    }

    public abstract void onRetry();

    public abstract void onRetryLimit();

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintCanceableProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    public abstract void onStatusChanged(boolean z, FingerprintResult fingerprintResult);

    public final void b(final FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde3df63", new Object[]{this, fingerprintResult});
            return;
        }
        LogUtils.record(2, "FingerprintRetryProxyCallback::finish", "result=" + fingerprintResult.toString());
        onFinish();
        SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Thread.sleep(100L);
                } catch (Throwable th) {
                    LogUtils.printExceptionStackTrace(th);
                }
                FingerprintRetryProxyCallback.this.onFinish(fingerprintResult.mStatus);
                IFingerprintCallback iFingerprintCallback = FingerprintRetryProxyCallback.this.mCallback;
                if (iFingerprintCallback != null) {
                    iFingerprintCallback.onCallBack(fingerprintResult);
                }
            }
        });
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback, com.alipay.android.app.smartpays.api.callback.IFingerprintCallback
    public void onCallBack(FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646591f4", new Object[]{this, fingerprintResult});
        } else if (this.d) {
            LogUtils.record(2, "FingerprintRetryProxyCallback::onCallBack", "mTerminated=true, result=" + fingerprintResult.toString());
        } else {
            boolean c = c(fingerprintResult.mStatus);
            this.d = c;
            int i = this.c + 1;
            this.c = i;
            if (c) {
                onProgressChanged(true, fingerprintResult);
                b(fingerprintResult);
            } else if (i < 3) {
                onStart();
                onProgressChanged(false, fingerprintResult);
                onProgressChanged(false, new FingerprintResult(FingerprintResult.FingerprintStatus.RETRY_ING));
                onRetry();
            } else {
                onProgressChanged(true, new FingerprintResult(FingerprintResult.FingerprintStatus.RETRY_LIMIT));
                onRetryLimit();
                b(fingerprintResult);
            }
        }
    }
}
