package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.neo.SmartPayConstants;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.FingerprintDialog;
import com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl.VerifyEnum;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintRequest;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.framework.smartpay.fingerprint.impl.FingerprintAuthenticator;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FingerprintAuthenticator f3613a = new FingerprintAuthenticator();
    public final Context b;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager$6  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus;

        static {
            int[] iArr = new int[FingerprintResult.FingerprintStatus.values().length];
            $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus = iArr;
            try {
                iArr[FingerprintResult.FingerprintStatus.COMMON_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_BUSY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_VERIFYING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.RETRY_LIMIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.RETRY_ING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TO_PWD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_TOPWD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public FingerprintManager(Context context) {
        this.b = context.getApplicationContext();
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintManager");
    }

    public static /* synthetic */ Context access$000(FingerprintManager fingerprintManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a47be49b", new Object[]{fingerprintManager});
        }
        return fingerprintManager.b;
    }

    public static /* synthetic */ FingerprintAuthenticator access$100(FingerprintManager fingerprintManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintAuthenticator) ipChange.ipc$dispatch("4a111603", new Object[]{fingerprintManager});
        }
        return fingerprintManager.f3613a;
    }

    public static /* synthetic */ void access$200(FingerprintManager fingerprintManager, int i, int i2, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd933d4", new Object[]{fingerprintManager, new Integer(i), new Integer(i2), fingerprintRequest, iFingerprintCallback});
        } else {
            fingerprintManager.c(i, i2, fingerprintRequest, iFingerprintCallback);
        }
    }

    public final FingerprintRetryProxyCallback a(final Context context, final FingerprintDialog fingerprintDialog, final FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintRetryProxyCallback) ipChange.ipc$dispatch("bfb2cb7a", new Object[]{this, context, fingerprintDialog, fingerprintRequest, iFingerprintCallback});
        }
        return new FingerprintRetryProxyCallback(context, iFingerprintCallback) { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/neo/fingerprint/FingerprintManager$4");
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("86b82fb9", new Object[]{this, fingerprintStatus});
                    return;
                }
                FingerprintDialog fingerprintDialog2 = fingerprintDialog;
                if (fingerprintDialog2 != null) {
                    fingerprintDialog2.dismiss();
                }
                FingerprintManager.this.cancel();
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetry() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2145010", new Object[]{this});
                } else {
                    FingerprintManager.access$200(FingerprintManager.this, 3, 2, fingerprintRequest, this);
                }
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetryLimit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fda89cb9", new Object[]{this});
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
            /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onStatusChanged(boolean r7, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult r8) {
                /*
                    r6 = this;
                    r0 = 1
                    r1 = 0
                    com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.AnonymousClass4.$ipChange
                    boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r3 == 0) goto L_0x001d
                    java.lang.Boolean r3 = new java.lang.Boolean
                    r3.<init>(r7)
                    r7 = 3
                    java.lang.Object[] r7 = new java.lang.Object[r7]
                    r7[r1] = r6
                    r7[r0] = r3
                    r0 = 2
                    r7[r0] = r8
                    java.lang.String r8 = "b114e29c"
                    r2.ipc$dispatch(r8, r7)
                    return
                L_0x001d:
                    int[] r2 = com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.AnonymousClass6.$SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus
                    com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult$FingerprintStatus r3 = r8.mStatus
                    int r3 = r3.ordinal()
                    r2 = r2[r3]
                    java.lang.String r3 = "flybird_fp_val_failed"
                    r4 = -65536(0xffffffffffff0000, float:NaN)
                    r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    switch(r2) {
                        case 1: goto L_0x0087;
                        case 2: goto L_0x0076;
                        case 3: goto L_0x0067;
                        case 4: goto L_0x0067;
                        case 5: goto L_0x0067;
                        case 6: goto L_0x0056;
                        case 7: goto L_0x0045;
                        case 8: goto L_0x0040;
                        case 9: goto L_0x0040;
                        case 10: goto L_0x0067;
                        case 11: goto L_0x0040;
                        default: goto L_0x0030;
                    }
                L_0x0030:
                    android.content.Context r0 = r4
                    int r2 = com.taobao.taobao.R.string.flybird_fp_val_failed
                    java.lang.String r0 = r0.getString(r2)
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r0 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r3, r0, r2)
                L_0x003e:
                    r2 = 0
                    goto L_0x009a
                L_0x0040:
                    r0 = 0
                L_0x0041:
                    r2 = 0
                L_0x0042:
                    r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    goto L_0x009a
                L_0x0045:
                    android.content.Context r0 = r4
                    int r2 = com.taobao.taobao.R.string.flybird_fp_retry_tips
                    java.lang.String r0 = r0.getString(r2)
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r3 = "flybird_fp_retry_tips"
                    java.lang.String r0 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r3, r0, r2)
                    goto L_0x0041
                L_0x0056:
                    android.content.Context r0 = r4
                    int r2 = com.taobao.taobao.R.string.flybird_fp_validating
                    java.lang.String r0 = r0.getString(r2)
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r3 = "flybird_fp_validating"
                    java.lang.String r0 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r3, r0, r2)
                    goto L_0x0041
                L_0x0067:
                    android.content.Context r0 = r4
                    int r2 = com.taobao.taobao.R.string.flybird_fp_val_failed
                    java.lang.String r0 = r0.getString(r2)
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r0 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r3, r0, r2)
                    goto L_0x003e
                L_0x0076:
                    android.content.Context r0 = r4
                    int r2 = com.taobao.taobao.R.string.flybird_fp_validate_too_often
                    java.lang.String r0 = r0.getString(r2)
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r3 = "flybird_fp_validate_too_often"
                    java.lang.String r0 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r3, r0, r2)
                    goto L_0x003e
                L_0x0087:
                    android.content.Context r2 = r4
                    int r3 = com.taobao.taobao.R.string.flybird_fp_val_ok
                    java.lang.String r2 = r2.getString(r3)
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    java.lang.String r4 = "flybird_fp_val_ok"
                    java.lang.String r2 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r4, r2, r3)
                    r0 = r2
                    r2 = 1
                    goto L_0x0042
                L_0x009a:
                    if (r0 == 0) goto L_0x00d0
                    com.alipay.android.msp.framework.hardwarepay.neo.dialog.FingerprintDialog r3 = r5
                    if (r3 == 0) goto L_0x00d0
                    if (r7 == 0) goto L_0x00aa
                    if (r2 != 0) goto L_0x00aa
                    java.lang.String r7 = "\n转密码支付"
                    java.lang.String r0 = r0.concat(r7)
                L_0x00aa:
                    int r7 = r8.mResult
                    if (r7 <= 0) goto L_0x00cb
                    if (r2 != 0) goto L_0x00cb
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r0)
                    java.lang.String r0 = "["
                    r7.append(r0)
                    int r8 = r8.mResult
                    r7.append(r8)
                    java.lang.String r8 = "]"
                    r7.append(r8)
                    java.lang.String r0 = r7.toString()
                L_0x00cb:
                    com.alipay.android.msp.framework.hardwarepay.neo.dialog.FingerprintDialog r7 = r5
                    r7.updateMsg(r0, r1, r4)
                L_0x00d0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.AnonymousClass4.onStatusChanged(boolean, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult):void");
            }
        };
    }

    public final String b(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7529d04e", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        return this.f3613a.process(this.b, i, i2, str);
    }

    public final void c(int i, int i2, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c55a2d", new Object[]{this, new Integer(i), new Integer(i2), fingerprintRequest, iFingerprintCallback});
        } else {
            this.f3613a.processAsync(this.b, fingerprintRequest.mUserId, i, i2, fingerprintRequest.mData, iFingerprintCallback);
        }
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FingerprintManager::cancel", "");
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    FingerprintManager.access$100(FingerprintManager.this).cancel(FingerprintManager.access$000(FingerprintManager.this));
                }
            }
        });
    }

    public void cancelVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a442e29a", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FingerprintManager::cancelVerify", "");
        try {
            Intent intent = new Intent();
            intent.setAction("com.alipay.android.app.FINGERPRINT_VERIFY_CHANGED");
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public FingerprintResult checkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("1cba8e30", new Object[]{this});
        }
        LogUtil.record(2, "FingerprintManager::checkUpdate", "");
        return new FingerprintResult(b(SmartPayConstants.PT_CHECK_UPDATE, 0, new FingerprintRequest().mData));
    }

    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        LogUtil.record(2, "FingerprintManager::checkUserStatus", "");
        this.f3613a.initHardwarePay(this.b, str);
        return this.f3613a.checkUserStatus(this.b, str);
    }

    public int getRegisteredNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("150b8fdb", new Object[]{this})).intValue();
        }
        LogUtil.record(2, "FingerprintManager::getRegisteredNumber", "");
        return this.f3613a.registeredFingerPrintNumber(this.b);
    }

    public FingerprintResult initHardwarePay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("54b0e4c7", new Object[]{this, str});
        }
        LogUtil.record(2, "FingerprintManager:initHardwarePay", "");
        int initHardwarePay = this.f3613a.initHardwarePay(this.b, str);
        if (initHardwarePay == 127) {
            initHardwarePay = 106;
        }
        return new FingerprintResult(initHardwarePay, this.f3613a.getAuthInfo(this.b));
    }

    public FingerprintResult openFingerprintManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("82d5324e", new Object[]{this});
        }
        LogUtil.record(2, "FingerprintManager::openFingerprintManager", "");
        return new FingerprintResult(b(SmartPayConstants.PT_OPEN_FP_MANAGER, 0, new FingerprintRequest().mData));
    }

    public void register(FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0bac0b", new Object[]{this, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtil.record(2, "FingerprintManager::register", "");
        c(SmartPayConstants.PT_REGISTER, 2, fingerprintRequest, iFingerprintCallback);
    }

    public void registerWithDialog(Activity activity, final FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        final FingerprintDialog fingerprintDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11b0fab", new Object[]{this, activity, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtil.record(2, "FingerprintManager::registerWithDialog", "");
        int i = fingerprintRequest.mScanType;
        if (i == 4 || i == 5) {
            fingerprintDialog = null;
        } else {
            fingerprintDialog = new FingerprintDialog(activity, VerifyEnum.OPEN);
        }
        final Context applicationContext = activity.getApplicationContext();
        final FingerprintRetryProxyCallback fingerprintRetryProxyCallback = new FingerprintRetryProxyCallback(applicationContext, iFingerprintCallback) { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/neo/fingerprint/FingerprintManager$2");
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetry() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2145010", new Object[]{this});
                } else {
                    FingerprintManager.access$200(FingerprintManager.this, SmartPayConstants.PT_REGISTER, 2, fingerprintRequest, this);
                }
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetryLimit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fda89cb9", new Object[]{this});
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onStatusChanged(boolean r6, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult r7) {
                /*
                    r5 = this;
                    r0 = 1
                    r1 = 0
                    com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.AnonymousClass2.$ipChange
                    boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r3 == 0) goto L_0x001d
                    java.lang.Boolean r3 = new java.lang.Boolean
                    r3.<init>(r6)
                    r6 = 3
                    java.lang.Object[] r6 = new java.lang.Object[r6]
                    r6[r1] = r5
                    r6[r0] = r3
                    r0 = 2
                    r6[r0] = r7
                    java.lang.String r7 = "b114e29c"
                    r2.ipc$dispatch(r7, r6)
                    return
                L_0x001d:
                    int[] r6 = com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.AnonymousClass6.$SwitchMap$com$alipay$android$msp$framework$hardwarepay$neo$fingerprint$model$FingerprintResult$FingerprintStatus
                    com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult$FingerprintStatus r2 = r7.mStatus
                    int r2 = r2.ordinal()
                    r6 = r6[r2]
                    java.lang.String r2 = "flybird_fp_val_failed"
                    r3 = -65536(0xffffffffffff0000, float:NaN)
                    r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    switch(r6) {
                        case 1: goto L_0x0087;
                        case 2: goto L_0x0076;
                        case 3: goto L_0x0067;
                        case 4: goto L_0x0067;
                        case 5: goto L_0x0067;
                        case 6: goto L_0x0056;
                        case 7: goto L_0x0045;
                        case 8: goto L_0x0040;
                        case 9: goto L_0x0040;
                        default: goto L_0x0030;
                    }
                L_0x0030:
                    android.content.Context r6 = r4
                    int r0 = com.taobao.taobao.R.string.flybird_fp_val_failed
                    java.lang.String r6 = r6.getString(r0)
                    java.lang.Object[] r0 = new java.lang.Object[r1]
                    java.lang.String r6 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r2, r6, r0)
                L_0x003e:
                    r0 = 0
                    goto L_0x0098
                L_0x0040:
                    r6 = 0
                L_0x0041:
                    r0 = 0
                L_0x0042:
                    r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    goto L_0x0098
                L_0x0045:
                    android.content.Context r6 = r4
                    int r0 = com.taobao.taobao.R.string.flybird_fp_retry_tips
                    java.lang.String r6 = r6.getString(r0)
                    java.lang.Object[] r0 = new java.lang.Object[r1]
                    java.lang.String r2 = "flybird_fp_retry_tips"
                    java.lang.String r6 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r2, r6, r0)
                    goto L_0x0041
                L_0x0056:
                    android.content.Context r6 = r4
                    int r0 = com.taobao.taobao.R.string.flybird_fp_validating
                    java.lang.String r6 = r6.getString(r0)
                    java.lang.Object[] r0 = new java.lang.Object[r1]
                    java.lang.String r2 = "flybird_fp_validating"
                    java.lang.String r6 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r2, r6, r0)
                    goto L_0x0041
                L_0x0067:
                    android.content.Context r6 = r4
                    int r0 = com.taobao.taobao.R.string.flybird_fp_val_failed
                    java.lang.String r6 = r6.getString(r0)
                    java.lang.Object[] r0 = new java.lang.Object[r1]
                    java.lang.String r6 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r2, r6, r0)
                    goto L_0x003e
                L_0x0076:
                    android.content.Context r6 = r4
                    int r0 = com.taobao.taobao.R.string.flybird_fp_validate_too_often
                    java.lang.String r6 = r6.getString(r0)
                    java.lang.Object[] r0 = new java.lang.Object[r1]
                    java.lang.String r2 = "flybird_fp_validate_too_often"
                    java.lang.String r6 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r2, r6, r0)
                    goto L_0x003e
                L_0x0087:
                    android.content.Context r6 = r4
                    int r2 = com.taobao.taobao.R.string.flybird_fp_val_ok
                    java.lang.String r6 = r6.getString(r2)
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r3 = "flybird_fp_val_ok"
                    java.lang.String r6 = com.alipay.android.msp.language.LanguageHelper.localizedStringForKey(r3, r6, r2)
                    goto L_0x0042
                L_0x0098:
                    if (r6 == 0) goto L_0x00c4
                    com.alipay.android.msp.framework.hardwarepay.neo.dialog.FingerprintDialog r2 = r5
                    if (r2 == 0) goto L_0x00c4
                    int r2 = r7.mResult
                    if (r2 <= 0) goto L_0x00bf
                    if (r0 != 0) goto L_0x00bf
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r6)
                    java.lang.String r6 = "["
                    r0.append(r6)
                    int r6 = r7.mResult
                    r0.append(r6)
                    java.lang.String r6 = "]"
                    r0.append(r6)
                    java.lang.String r6 = r0.toString()
                L_0x00bf:
                    com.alipay.android.msp.framework.hardwarepay.neo.dialog.FingerprintDialog r7 = r5
                    r7.updateMsg(r6, r1, r3)
                L_0x00c4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.AnonymousClass2.onStatusChanged(boolean, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult):void");
            }

            @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintRetryProxyCallback
            public void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("86b82fb9", new Object[]{this, fingerprintStatus});
                    return;
                }
                LogUtil.record(2, "FingerprintManager:getOpenCallback", "onFinish, status=".concat(String.valueOf(fingerprintStatus)));
                FingerprintDialog fingerprintDialog2 = fingerprintDialog;
                if (fingerprintDialog2 != null) {
                    fingerprintDialog2.dismiss();
                }
                if (fingerprintStatus == FingerprintResult.FingerprintStatus.OEM_NEED_UPGRADE) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                Context context = applicationContext;
                                Toast.makeText(context, LanguageHelper.localizedStringForKey("flybird_fp_oem_need_upgrade", context.getString(R.string.flybird_fp_oem_need_upgrade), new Object[0]), 1).show();
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                        }
                    });
                }
                FingerprintManager.this.cancel();
            }
        };
        if (fingerprintDialog != null) {
            fingerprintDialog.showDialog(activity, LanguageHelper.localizedStringForKey("flybird_fp_open", activity.getString(R.string.flybird_fp_open), new Object[0]), new IDialogActionListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener
                public void onDialogAction(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d7a4c5f", new Object[]{this, new Integer(i2)});
                    } else if (i2 == 0) {
                        fingerprintRetryProxyCallback.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_CANCEL));
                    }
                }
            });
        }
        c(SmartPayConstants.PT_REGISTER, 2, fingerprintRequest, fingerprintRetryProxyCallback);
    }

    public void unregister(FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6547564f", new Object[]{this, fingerprintRequest});
            return;
        }
        LogUtil.record(2, "FingerprintManager::unregister", "");
        c(SmartPayConstants.PT_UNREGISTER, 0, fingerprintRequest, null);
    }

    public void verifyWithDialog(Activity activity, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        FingerprintDialog fingerprintDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f1515", new Object[]{this, activity, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtil.record(2, "FingerprintManager::verifyWithDialog", "");
        if (fingerprintRequest.mIsSamsung) {
            fingerprintDialog = null;
        } else {
            fingerprintDialog = new FingerprintDialog(activity, VerifyEnum.VERIFY);
        }
        final FingerprintRetryProxyCallback a2 = a(activity.getApplicationContext(), fingerprintDialog, fingerprintRequest, iFingerprintCallback);
        if (fingerprintDialog != null) {
            fingerprintDialog.showDialog(activity, LanguageHelper.localizedStringForKey("flybird_fp_tips", activity.getString(R.string.flybird_fp_tips), new Object[0]), new IDialogActionListener() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.FingerprintManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener
                public void onDialogAction(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2d7a4c5f", new Object[]{this, new Integer(i)});
                    } else if (i == 0) {
                        a2.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_CANCEL));
                    } else if (i == 2) {
                        a2.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_TOPWD));
                    }
                }
            });
        }
        c(3, 2, fingerprintRequest, a2);
    }

    public void vertify(FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e245b183", new Object[]{this, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtil.record(2, "FingerprintManager::vertify", "custom view");
        c(3, 2, fingerprintRequest, a(this.b, null, fingerprintRequest, iFingerprintCallback));
    }
}
