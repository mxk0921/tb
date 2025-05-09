package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FingerprintRetryProxyCallback extends FingerprintCancelableProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c = 0;
    public boolean d = false;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback$2  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus;

        static {
            int[] iArr = new int[FingerprintResult.FingerprintStatus.values().length];
            $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus = iArr;
            try {
                iArr[FingerprintResult.FingerprintStatus.COMMON_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_BUSY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_CANCELED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TO_PWD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_TOPWD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_CANCEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.OEM_NEED_UPGRADE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_VERIFYING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public FingerprintRetryProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintRetryProxyCallback");
    }

    public static /* synthetic */ Object ipc$super(FingerprintRetryProxyCallback fingerprintRetryProxyCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 195948249) {
            super.onFinish();
            return null;
        } else if (hashCode == 1387948631) {
            super.onProgressChanged(((Boolean) objArr[0]).booleanValue(), (FingerprintResult) objArr[1]);
            return null;
        } else if (hashCode == 2133689546) {
            super.onStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/framework/hardwarepay/neo/fingerprint/callback/FingerprintRetryProxyCallback");
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintCancelableProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else {
            super.onFinish();
        }
    }

    public abstract void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus);

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
    public void onProgressChanged(boolean z, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ba6a57", new Object[]{this, new Boolean(z), fingerprintResult});
            return;
        }
        super.onProgressChanged(z, fingerprintResult);
        onStatusChanged(z, fingerprintResult);
    }

    public abstract void onRetry();

    public abstract void onRetryLimit();

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintCancelableProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    public abstract void onStatusChanged(boolean z, FingerprintResult fingerprintResult);

    public final void a(final FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5a6e3a", new Object[]{this, fingerprintResult});
            return;
        }
        LogUtil.record(2, "FingerprintRetryProxyCallback::finish", "result=" + fingerprintResult.toString());
        onFinish();
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback.1
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
                    LogUtil.printExceptionStackTrace(th);
                }
                FingerprintRetryProxyCallback.this.onFinish(fingerprintResult.mStatus);
                IFingerprintCallback iFingerprintCallback = FingerprintRetryProxyCallback.this.mCallback;
                if (iFingerprintCallback != null) {
                    iFingerprintCallback.onCallBack(fingerprintResult);
                }
            }
        });
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
    public void onCallBack(FingerprintResult fingerprintResult) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ff7d", new Object[]{this, fingerprintResult});
        } else if (this.d) {
            LogUtil.record(2, "FingerprintRetryProxyCallback::onCallBack", "mTerminated=true, result=" + fingerprintResult.toString());
        } else {
            switch (AnonymousClass2.$SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[fingerprintResult.mStatus.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            this.d = z;
            int i = this.c + 1;
            this.c = i;
            if (z) {
                onProgressChanged(true, fingerprintResult);
                a(fingerprintResult);
            } else if (i < 3) {
                onStart();
                onProgressChanged(false, fingerprintResult);
                onProgressChanged(false, new FingerprintResult(FingerprintResult.FingerprintStatus.RETRY_ING));
                onRetry();
            } else {
                onProgressChanged(true, new FingerprintResult(FingerprintResult.FingerprintStatus.RETRY_LIMIT));
                onRetryLimit();
                a(fingerprintResult);
            }
        }
    }
}
