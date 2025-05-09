package com.alipay.android.msp.framework.hardwarepay.neo.api;

import android.app.Activity;
import com.alipay.android.msp.core.callback.FingerprintPayCallback;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintRequest;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.plugin.IFingerprintPlugin;
import com.alipay.android.msp.plugin.model.FingerprintPayRequest;
import com.alipay.android.msp.plugin.model.FingerprintPayResult;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintPayEngine implements IFingerprintPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FingerprintManager mManager = new FingerprintManager(MspContextUtil.getContext());

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.hardwarepay.neo.api.FingerprintPayEngine$2  reason: invalid class name */
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
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_BUSY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_VERIFYING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_CANCEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TIMEOUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TO_PWD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_TOPWD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.RETRY_ING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.RETRY_LIMIT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public FingerprintPayEngine() {
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintPayEngine");
    }

    public static /* synthetic */ FingerprintPayResult access$000(FingerprintPayEngine fingerprintPayEngine, boolean z, boolean z2, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintPayResult) ipChange.ipc$dispatch("6e032d10", new Object[]{fingerprintPayEngine, new Boolean(z), new Boolean(z2), fingerprintResult});
        }
        return fingerprintPayEngine.adapterResult(z, z2, fingerprintResult);
    }

    private IFingerprintCallback adapterCallback(final boolean z, final FingerprintPayCallback fingerprintPayCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFingerprintCallback) ipChange.ipc$dispatch("2b675690", new Object[]{this, new Boolean(z), fingerprintPayCallback});
        }
        return new IFingerprintCallback() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.api.FingerprintPayEngine.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
            public void onCallBack(FingerprintResult fingerprintResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a2ff7d", new Object[]{this, fingerprintResult});
                    return;
                }
                FingerprintPayCallback fingerprintPayCallback2 = fingerprintPayCallback;
                if (fingerprintPayCallback2 != null) {
                    fingerprintPayCallback2.onCallback(FingerprintPayEngine.access$000(FingerprintPayEngine.this, z, false, fingerprintResult));
                }
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback
            public void onProgressChanged(boolean z2, FingerprintResult fingerprintResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52ba6a57", new Object[]{this, new Boolean(z2), fingerprintResult});
                    return;
                }
                FingerprintPayCallback fingerprintPayCallback2 = fingerprintPayCallback;
                if (fingerprintPayCallback2 != null) {
                    fingerprintPayCallback2.onProgressChanged(z2, FingerprintPayEngine.access$000(FingerprintPayEngine.this, z, true, fingerprintResult));
                }
            }
        };
    }

    private FingerprintPayResult.FingerprintPayStatus adapterPayStatus(FingerprintResult.FingerprintStatus fingerprintStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintPayResult.FingerprintPayStatus) ipChange.ipc$dispatch("7d215ab0", new Object[]{this, fingerprintStatus});
        }
        switch (AnonymousClass2.$SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[fingerprintStatus.ordinal()]) {
            case 1:
                return FingerprintPayResult.FingerprintPayStatus.SUCCESS;
            case 2:
                return FingerprintPayResult.FingerprintPayStatus.FAILED;
            case 3:
                return FingerprintPayResult.FingerprintPayStatus.BUSY;
            case 4:
            default:
                return FingerprintPayResult.FingerprintPayStatus.FAILED;
            case 5:
            case 6:
                return FingerprintPayResult.FingerprintPayStatus.CANCELED;
            case 7:
                return FingerprintPayResult.FingerprintPayStatus.TIMEOUT;
            case 8:
            case 9:
                return FingerprintPayResult.FingerprintPayStatus.TOPWD;
        }
    }

    private FingerprintPayResult.FingerprintProgressStatus adapterProgressStatus(FingerprintResult.FingerprintStatus fingerprintStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintPayResult.FingerprintProgressStatus) ipChange.ipc$dispatch("17f0f12a", new Object[]{this, fingerprintStatus});
        }
        switch (AnonymousClass2.$SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[fingerprintStatus.ordinal()]) {
            case 1:
                return FingerprintPayResult.FingerprintProgressStatus.SUCCESS;
            case 2:
                return FingerprintPayResult.FingerprintProgressStatus.FAILED;
            case 3:
                return FingerprintPayResult.FingerprintProgressStatus.BUSY;
            case 4:
                return FingerprintPayResult.FingerprintProgressStatus.VERIFYING;
            case 5:
            case 6:
                return FingerprintPayResult.FingerprintProgressStatus.CANCELED;
            case 7:
                return FingerprintPayResult.FingerprintProgressStatus.TIMEOUT;
            case 8:
            case 9:
                return FingerprintPayResult.FingerprintProgressStatus.TOPWD;
            case 10:
                return FingerprintPayResult.FingerprintProgressStatus.RETRY_ING;
            case 11:
                return FingerprintPayResult.FingerprintProgressStatus.RETRY_LIMIT;
            default:
                return FingerprintPayResult.FingerprintProgressStatus.FAILED;
        }
    }

    private FingerprintPayResult.FingerprintRegStatus adapterRegStatus(FingerprintResult.FingerprintStatus fingerprintStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintPayResult.FingerprintRegStatus) ipChange.ipc$dispatch("3450b930", new Object[]{this, fingerprintStatus});
        }
        int i = AnonymousClass2.$SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[fingerprintStatus.ordinal()];
        if (i == 1) {
            return FingerprintPayResult.FingerprintRegStatus.SUCCESS;
        }
        if (i == 2) {
            return FingerprintPayResult.FingerprintRegStatus.FAILED;
        }
        if (i == 3) {
            return FingerprintPayResult.FingerprintRegStatus.BUSY;
        }
        if (i == 5 || i == 6) {
            return FingerprintPayResult.FingerprintRegStatus.CANCELED;
        }
        if (i != 7) {
            return FingerprintPayResult.FingerprintRegStatus.FAILED;
        }
        return FingerprintPayResult.FingerprintRegStatus.TIMEOUT;
    }

    private FingerprintRequest adapterRequest(FingerprintPayRequest fingerprintPayRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintRequest) ipChange.ipc$dispatch("4d4750d7", new Object[]{this, fingerprintPayRequest});
        }
        FingerprintRequest fingerprintRequest = new FingerprintRequest();
        fingerprintRequest.mData = fingerprintPayRequest.mData;
        fingerprintRequest.mUserId = fingerprintPayRequest.mUserId;
        fingerprintRequest.mScanType = fingerprintPayRequest.mScanType;
        fingerprintRequest.mTipsMsg = fingerprintPayRequest.mTipsMsg;
        fingerprintPayRequest.mIsSamsung = fingerprintPayRequest.mIsSamsung;
        return fingerprintRequest;
    }

    private FingerprintPayResult adapterResult(FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintPayResult) ipChange.ipc$dispatch("4df62539", new Object[]{this, fingerprintResult});
        }
        if (fingerprintResult == null) {
            return null;
        }
        FingerprintPayResult fingerprintPayResult = new FingerprintPayResult();
        fingerprintPayResult.mData = fingerprintResult.mData;
        fingerprintPayResult.mMessage = fingerprintResult.mMessage;
        fingerprintPayResult.mResult = fingerprintResult.mResult;
        fingerprintPayResult.mType = fingerprintResult.mType;
        fingerprintPayResult.mTokenId = fingerprintResult.mTokenId;
        fingerprintPayResult.mPayStatus = null;
        return fingerprintPayResult;
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.mManager.cancel();
        }
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public void cancelVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a442e29a", new Object[]{this});
        } else {
            this.mManager.cancelVerify();
        }
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public FingerprintPayResult checkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintPayResult) ipChange.ipc$dispatch("73d6db06", new Object[]{this});
        }
        return adapterResult(this.mManager.checkUpdate());
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public int checkUserStatus(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        return this.mManager.checkUserStatus(str);
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public int getRegisteredNumber() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("150b8fdb", new Object[]{this})).intValue();
        }
        return this.mManager.getRegisteredNumber();
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public FingerprintPayResult initHardwarePay(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintPayResult) ipChange.ipc$dispatch("f79c2a1d", new Object[]{this, str});
        }
        return adapterResult(this.mManager.initHardwarePay(str));
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public FingerprintPayResult openFingerprintManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintPayResult) ipChange.ipc$dispatch("d3123824", new Object[]{this});
        }
        return adapterResult(this.mManager.openFingerprintManager());
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public void register(FingerprintPayRequest fingerprintPayRequest, FingerprintPayCallback fingerprintPayCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ad10d0", new Object[]{this, fingerprintPayRequest, fingerprintPayCallback});
        } else {
            this.mManager.register(adapterRequest(fingerprintPayRequest), adapterCallback(true, fingerprintPayCallback));
        }
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public void registerWithDialog(Activity activity, FingerprintPayRequest fingerprintPayRequest, FingerprintPayCallback fingerprintPayCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dfdf130", new Object[]{this, activity, fingerprintPayRequest, fingerprintPayCallback});
        } else {
            this.mManager.registerWithDialog(activity, adapterRequest(fingerprintPayRequest), adapterCallback(true, fingerprintPayCallback));
        }
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public void unregister(FingerprintPayRequest fingerprintPayRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49051db9", new Object[]{this, fingerprintPayRequest});
        } else {
            this.mManager.unregister(adapterRequest(fingerprintPayRequest));
        }
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public void verify(FingerprintPayRequest fingerprintPayRequest, FingerprintPayCallback fingerprintPayCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50065a6", new Object[]{this, fingerprintPayRequest, fingerprintPayCallback});
        } else {
            this.mManager.vertify(adapterRequest(fingerprintPayRequest), adapterCallback(false, fingerprintPayCallback));
        }
    }

    @Override // com.alipay.android.msp.plugin.IFingerprintPlugin
    public void verifyWithDialog(Activity activity, FingerprintPayRequest fingerprintPayRequest, FingerprintPayCallback fingerprintPayCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf586e06", new Object[]{this, activity, fingerprintPayRequest, fingerprintPayCallback});
        } else {
            this.mManager.verifyWithDialog(activity, adapterRequest(fingerprintPayRequest), adapterCallback(false, fingerprintPayCallback));
        }
    }

    private FingerprintPayResult adapterResult(boolean z, boolean z2, FingerprintResult fingerprintResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintPayResult) ipChange.ipc$dispatch("235e7b79", new Object[]{this, new Boolean(z), new Boolean(z2), fingerprintResult});
        }
        if (fingerprintResult == null) {
            return null;
        }
        FingerprintPayResult fingerprintPayResult = new FingerprintPayResult();
        fingerprintPayResult.mData = fingerprintResult.mData;
        fingerprintPayResult.mMessage = fingerprintResult.mMessage;
        fingerprintPayResult.mResult = fingerprintResult.mResult;
        fingerprintPayResult.mType = fingerprintResult.mType;
        fingerprintPayResult.mTokenId = fingerprintResult.mTokenId;
        if (z2) {
            fingerprintPayResult.mProgressStatus = adapterProgressStatus(fingerprintResult.mStatus);
        } else if (z) {
            fingerprintPayResult.mRegStatus = adapterRegStatus(fingerprintResult.mStatus);
        } else {
            fingerprintPayResult.mPayStatus = adapterPayStatus(fingerprintResult.mStatus);
        }
        return fingerprintPayResult;
    }
}
