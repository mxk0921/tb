package com.alipay.android.app.smartpays.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.smartpays.api.callback.IFingerprintCallback;
import com.alipay.android.app.smartpays.api.model.FingerprintRequest;
import com.alipay.android.app.smartpays.api.model.FingerprintResult;
import com.alipay.android.app.smartpays.cons.Constants;
import com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback;
import com.alipay.android.app.smartpays.fingerprint.impl.FingerprintAuthenticator;
import com.alipay.android.app.smartpays.res.IResourceLoader;
import com.alipay.android.app.smartpays.res.loader.ResourceLoader;
import com.alipay.android.app.smartpays.res.provider.ResourceProvider;
import com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog;
import com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener;
import com.alipay.android.app.smartpays.widget.dialog.impl.VerifyEnum;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FingerprintAuthenticator f3497a = new FingerprintAuthenticator();
    public final Context b;
    public ResourceLoader c;

    /* compiled from: Taobao */
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* renamed from: com.alipay.android.app.smartpays.api.FingerprintManager$6  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus;

        static {
            int[] iArr = new int[FingerprintResult.FingerprintStatus.values().length];
            $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus = iArr;
            try {
                iArr[FingerprintResult.FingerprintStatus.COMMON_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_BUSY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_VERIFYING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.RETRY_LIMIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.RETRY_ING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.COMMON_TO_PWD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus[FingerprintResult.FingerprintStatus.DLG_TOPWD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public FingerprintManager(Context context) {
        this.b = context.getApplicationContext();
        HashMap hashMap = new HashMap();
        hashMap.put("action", "FingerprintManagerInit");
        SpOuterUtil.walletEventLog("1010897", "pay", hashMap);
    }

    public static /* synthetic */ Context access$000(FingerprintManager fingerprintManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("561e54c4", new Object[]{fingerprintManager});
        }
        return fingerprintManager.b;
    }

    public static /* synthetic */ FingerprintAuthenticator access$100(FingerprintManager fingerprintManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintAuthenticator) ipChange.ipc$dispatch("6cb89467", new Object[]{fingerprintManager});
        }
        return fingerprintManager.f3497a;
    }

    public static /* synthetic */ void access$200(FingerprintManager fingerprintManager, int i, int i2, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571856b", new Object[]{fingerprintManager, new Integer(i), new Integer(i2), fingerprintRequest, iFingerprintCallback});
        } else {
            fingerprintManager.h(i, i2, fingerprintRequest, iFingerprintCallback);
        }
    }

    public final FingerprintRetryProxyCallback a(final Activity activity, final FingerprintDialog fingerprintDialog, final FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintRetryProxyCallback) ipChange.ipc$dispatch("13411119", new Object[]{this, activity, fingerprintDialog, fingerprintRequest, iFingerprintCallback});
        }
        final IResourceLoader c = c(activity);
        return new FingerprintRetryProxyCallback(activity, iFingerprintCallback) { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/smartpays/api/FingerprintManager$2");
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c6e1c70", new Object[]{this, fingerprintStatus});
                    return;
                }
                FingerprintResult.FingerprintStatus fingerprintStatus2 = FingerprintResult.FingerprintStatus.COMMON_SUCCESS;
                FingerprintDialog fingerprintDialog2 = fingerprintDialog;
                if (fingerprintDialog2 != null) {
                    fingerprintDialog2.dismiss(activity);
                }
                FingerprintManager.this.cancel();
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetry() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2145010", new Object[]{this});
                } else {
                    FingerprintManager.access$200(FingerprintManager.this, Constants.PT_REGISTER, 2, fingerprintRequest, this);
                }
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetryLimit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fda89cb9", new Object[]{this});
                } else {
                    LogUtils.record(2, "FingerprintManager:getOpenCallback", "onRetryLimit");
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onStatusChanged(boolean r7, com.alipay.android.app.smartpays.api.model.FingerprintResult r8) {
                /*
                    r6 = this;
                    r0 = 1
                    r1 = 0
                    com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass2.$ipChange
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
                    java.lang.String r8 = "3fae2213"
                    r2.ipc$dispatch(r8, r7)
                    return
                L_0x001d:
                    int[] r7 = com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass6.$SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus
                    com.alipay.android.app.smartpays.api.model.FingerprintResult$FingerprintStatus r2 = r8.mStatus
                    int r2 = r2.ordinal()
                    r7 = r7[r2]
                    java.lang.String r2 = "safepay_fp_val_failed"
                    r3 = -1
                    r4 = -65536(0xffffffffffff0000, float:NaN)
                    r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    switch(r7) {
                        case 1: goto L_0x0064;
                        case 2: goto L_0x005a;
                        case 3: goto L_0x0053;
                        case 4: goto L_0x0053;
                        case 5: goto L_0x0053;
                        case 6: goto L_0x0049;
                        case 7: goto L_0x003f;
                        case 8: goto L_0x003a;
                        case 9: goto L_0x003a;
                        default: goto L_0x0032;
                    }
                L_0x0032:
                    com.alipay.android.app.smartpays.res.IResourceLoader r7 = r4
                    int r7 = r7.getStringId(r2)
                L_0x0038:
                    r0 = 0
                    goto L_0x006e
                L_0x003a:
                    r7 = -1
                L_0x003b:
                    r0 = 0
                L_0x003c:
                    r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    goto L_0x006e
                L_0x003f:
                    com.alipay.android.app.smartpays.res.IResourceLoader r7 = r4
                    java.lang.String r0 = "safepay_fp_retry_tips"
                    int r7 = r7.getStringId(r0)
                    goto L_0x003b
                L_0x0049:
                    com.alipay.android.app.smartpays.res.IResourceLoader r7 = r4
                    java.lang.String r0 = "safepay_fp_validating"
                    int r7 = r7.getStringId(r0)
                    goto L_0x003b
                L_0x0053:
                    com.alipay.android.app.smartpays.res.IResourceLoader r7 = r4
                    int r7 = r7.getStringId(r2)
                    goto L_0x0038
                L_0x005a:
                    com.alipay.android.app.smartpays.res.IResourceLoader r7 = r4
                    java.lang.String r0 = "safepay_fp_validate_too_often"
                    int r7 = r7.getStringId(r0)
                    goto L_0x0038
                L_0x0064:
                    com.alipay.android.app.smartpays.res.IResourceLoader r7 = r4
                    java.lang.String r2 = "safepay_fp_val_ok"
                    int r7 = r7.getStringId(r2)
                    goto L_0x003c
                L_0x006e:
                    if (r7 == r3) goto L_0x00a0
                    com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog r2 = r5
                    if (r2 == 0) goto L_0x00a0
                    android.app.Activity r2 = r6
                    java.lang.String r7 = r2.getString(r7)
                    int r2 = r8.mResult
                    if (r2 <= 0) goto L_0x009b
                    if (r0 != 0) goto L_0x009b
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r7)
                    java.lang.String r7 = "["
                    r0.append(r7)
                    int r7 = r8.mResult
                    r0.append(r7)
                    java.lang.String r7 = "]"
                    r0.append(r7)
                    java.lang.String r7 = r0.toString()
                L_0x009b:
                    com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog r8 = r5
                    r8.updateMsg(r7, r1, r4)
                L_0x00a0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass2.onStatusChanged(boolean, com.alipay.android.app.smartpays.api.model.FingerprintResult):void");
            }
        };
    }

    public final FingerprintDialog b(Activity activity, FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintDialog) ipChange.ipc$dispatch("2e3abffb", new Object[]{this, activity, fingerprintRequest});
        }
        if (f(fingerprintRequest)) {
            return null;
        }
        return new FingerprintDialog(activity, VerifyEnum.OPEN);
    }

    public final IResourceLoader c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IResourceLoader) ipChange.ipc$dispatch("d8377920", new Object[]{this, context});
        }
        if (this.c == null) {
            this.c = new ResourceLoader(new ResourceProvider(context));
        }
        return this.c;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintManager::cancel", "");
        SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.1
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
        LogUtils.record(2, "FingerprintManager::cancelVerify", "");
        try {
            Intent intent = new Intent();
            intent.setAction("com.alipay.android.app.FINGERPRINT_VERIFY_CHANGED");
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
    }

    public FingerprintResult checkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("f3f55267", new Object[]{this});
        }
        LogUtils.record(2, "FingerprintManager::checkUpdate", "");
        return new FingerprintResult(g(Constants.PT_CHECK_UPDATE, 0, new FingerprintRequest().mData));
    }

    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        LogUtils.record(2, "FingerprintManager::checkUserStatus", "");
        this.f3497a.initHardwarePay(this.b, str);
        return this.f3497a.checkUserStatus(this.b, str);
    }

    public final FingerprintRetryProxyCallback d(final Context context, final FingerprintDialog fingerprintDialog, final FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintRetryProxyCallback) ipChange.ipc$dispatch("d3c356aa", new Object[]{this, context, fingerprintDialog, fingerprintRequest, iFingerprintCallback});
        }
        final IResourceLoader c = c(context);
        return new FingerprintRetryProxyCallback(context, iFingerprintCallback) { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/smartpays/api/FingerprintManager$4");
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onFinish(FingerprintResult.FingerprintStatus fingerprintStatus) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4c6e1c70", new Object[]{this, fingerprintStatus});
                    return;
                }
                FingerprintResult.FingerprintStatus fingerprintStatus2 = FingerprintResult.FingerprintStatus.COMMON_SUCCESS;
                FingerprintDialog fingerprintDialog2 = fingerprintDialog;
                if (fingerprintDialog2 != null) {
                    fingerprintDialog2.dismiss(context);
                }
                FingerprintManager.this.cancel();
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetry() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c2145010", new Object[]{this});
                } else {
                    FingerprintManager.access$200(FingerprintManager.this, 3, 2, fingerprintRequest, this);
                }
            }

            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            public void onRetryLimit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fda89cb9", new Object[]{this});
                } else {
                    LogUtils.record(2, "FingerprintManager:getVerifyCallback", "onRetryLimit");
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintRetryProxyCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onStatusChanged(boolean r8, com.alipay.android.app.smartpays.api.model.FingerprintResult r9) {
                /*
                    r7 = this;
                    r0 = 1
                    r1 = 0
                    com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass4.$ipChange
                    boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r3 == 0) goto L_0x001d
                    java.lang.Boolean r3 = new java.lang.Boolean
                    r3.<init>(r8)
                    r8 = 3
                    java.lang.Object[] r8 = new java.lang.Object[r8]
                    r8[r1] = r7
                    r8[r0] = r3
                    r0 = 2
                    r8[r0] = r9
                    java.lang.String r9 = "3fae2213"
                    r2.ipc$dispatch(r9, r8)
                    return
                L_0x001d:
                    int[] r2 = com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass6.$SwitchMap$com$alipay$android$app$smartpays$api$model$FingerprintResult$FingerprintStatus
                    com.alipay.android.app.smartpays.api.model.FingerprintResult$FingerprintStatus r3 = r9.mStatus
                    int r3 = r3.ordinal()
                    r2 = r2[r3]
                    java.lang.String r3 = "safepay_fp_val_failed"
                    r4 = -1
                    r5 = -65536(0xffffffffffff0000, float:NaN)
                    r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    switch(r2) {
                        case 1: goto L_0x0064;
                        case 2: goto L_0x005a;
                        case 3: goto L_0x0053;
                        case 4: goto L_0x0053;
                        case 5: goto L_0x0053;
                        case 6: goto L_0x0049;
                        case 7: goto L_0x003f;
                        case 8: goto L_0x003a;
                        case 9: goto L_0x003a;
                        case 10: goto L_0x0053;
                        case 11: goto L_0x003a;
                        default: goto L_0x0032;
                    }
                L_0x0032:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    int r0 = r0.getStringId(r3)
                L_0x0038:
                    r2 = 0
                    goto L_0x0070
                L_0x003a:
                    r0 = -1
                L_0x003b:
                    r2 = 0
                L_0x003c:
                    r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                    goto L_0x0070
                L_0x003f:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    java.lang.String r2 = "safepay_fp_retry_tips"
                    int r0 = r0.getStringId(r2)
                    goto L_0x003b
                L_0x0049:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    java.lang.String r2 = "safepay_fp_validating"
                    int r0 = r0.getStringId(r2)
                    goto L_0x003b
                L_0x0053:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    int r0 = r0.getStringId(r3)
                    goto L_0x0038
                L_0x005a:
                    com.alipay.android.app.smartpays.res.IResourceLoader r0 = r4
                    java.lang.String r2 = "safepay_fp_validate_too_often"
                    int r0 = r0.getStringId(r2)
                    goto L_0x0038
                L_0x0064:
                    com.alipay.android.app.smartpays.res.IResourceLoader r2 = r4
                    java.lang.String r3 = "safepay_fp_val_ok"
                    int r2 = r2.getStringId(r3)
                    r0 = r2
                    r2 = 1
                    goto L_0x003c
                L_0x0070:
                    if (r0 == r4) goto L_0x00c9
                    com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog r3 = r5
                    if (r3 == 0) goto L_0x00c9
                    android.content.Context r3 = r6
                    java.lang.String r0 = r3.getString(r0)
                    if (r8 == 0) goto L_0x00a3
                    if (r2 != 0) goto L_0x00a3
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r0)
                    java.lang.String r0 = "\n"
                    r8.append(r0)
                    android.content.Context r0 = r6
                    com.alipay.android.app.smartpays.res.IResourceLoader r3 = r4
                    java.lang.String r4 = "safepay_fp_to_pwd_pay"
                    int r3 = r3.getStringId(r4)
                    java.lang.String r0 = r0.getString(r3)
                    r8.append(r0)
                    java.lang.String r0 = r8.toString()
                L_0x00a3:
                    int r8 = r9.mResult
                    if (r8 <= 0) goto L_0x00c4
                    if (r2 != 0) goto L_0x00c4
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r0)
                    java.lang.String r0 = "["
                    r8.append(r0)
                    int r9 = r9.mResult
                    r8.append(r9)
                    java.lang.String r9 = "]"
                    r8.append(r9)
                    java.lang.String r0 = r8.toString()
                L_0x00c4:
                    com.alipay.android.app.smartpays.widget.dialog.FingerprintDialog r8 = r5
                    r8.updateMsg(r0, r1, r5)
                L_0x00c9:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.smartpays.api.FingerprintManager.AnonymousClass4.onStatusChanged(boolean, com.alipay.android.app.smartpays.api.model.FingerprintResult):void");
            }
        };
    }

    public final FingerprintDialog e(Activity activity, FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintDialog) ipChange.ipc$dispatch("6b7e70aa", new Object[]{this, activity, fingerprintRequest});
        }
        if (fingerprintRequest.mIsSamsung) {
            return null;
        }
        return new FingerprintDialog(activity, VerifyEnum.VERIFY);
    }

    public final boolean f(FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("406a41dc", new Object[]{this, fingerprintRequest})).booleanValue();
        }
        int i = fingerprintRequest.mScanType;
        if (i == 4 || i == 5) {
            return true;
        }
        return false;
    }

    public final String g(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adff5a00", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        return this.f3497a.process(this.b, i, i2, str);
    }

    public String getFpInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c170002b", new Object[]{this});
        }
        LogUtils.record(2, "FingerprintManager::getFpInfo", "");
        return this.f3497a.getFpInfo(this.b);
    }

    public int getRegistedNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27d289ae", new Object[]{this})).intValue();
        }
        LogUtils.record(2, "FingerprintManager::getRegistedNumber", "");
        return this.f3497a.registedFingerPrintNumber(this.b);
    }

    public final void h(int i, int i2, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af3a1de1", new Object[]{this, new Integer(i), new Integer(i2), fingerprintRequest, iFingerprintCallback});
        } else {
            this.f3497a.processAsync(this.b, fingerprintRequest.mUserId, i, i2, fingerprintRequest.mData, iFingerprintCallback);
        }
    }

    public final FingerprintDialog i(Activity activity, FingerprintDialog fingerprintDialog, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintDialog) ipChange.ipc$dispatch("afd3b814", new Object[]{this, activity, fingerprintDialog, iFingerprintCallback});
        }
        if (fingerprintDialog == null) {
            return null;
        }
        IResourceLoader c = c(activity);
        String string = activity.getString(c.getStringId("safepay_fp_open"));
        fingerprintDialog.setResourceLoader(c);
        fingerprintDialog.showDialog(activity, string, new IDialogActionListener() { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener
            public void onAction(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i)});
                } else if (i == 0) {
                    LogUtils.record(2, "FingerprintManager:IDialogActionListener", "ACTION_CANCEL");
                    iFingerprintCallback.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_CANCEL));
                    FingerprintManager.this.cancel();
                }
            }
        });
        return fingerprintDialog;
    }

    public FingerprintResult initHardwarePay(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("67bf3dfe", new Object[]{this, str});
        }
        LogUtils.record(2, "FingerprintManager::initHardwarePay", "");
        int initHardwarePay = this.f3497a.initHardwarePay(this.b, str);
        if (initHardwarePay == 127) {
            initHardwarePay = 106;
        }
        return new FingerprintResult(initHardwarePay, this.f3497a.getAuthInfo(this.b));
    }

    public final FingerprintDialog j(Activity activity, FingerprintDialog fingerprintDialog, FingerprintRequest fingerprintRequest, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintDialog) ipChange.ipc$dispatch("5c51f7f6", new Object[]{this, activity, fingerprintDialog, fingerprintRequest, iFingerprintCallback});
        }
        if (fingerprintDialog == null) {
            return null;
        }
        IResourceLoader c = c(activity);
        String str = fingerprintRequest.mTipsMsg;
        if (TextUtils.isEmpty(str)) {
            str = activity.getString(c.getStringId("safepay_fp_tips"));
        }
        fingerprintDialog.setResourceLoader(c);
        fingerprintDialog.showDialog(activity, str, new IDialogActionListener() { // from class: com.alipay.android.app.smartpays.api.FingerprintManager.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.smartpays.widget.dialog.IDialogActionListener
            public void onAction(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("781efb87", new Object[]{this, new Integer(i)});
                } else if (i == 0) {
                    iFingerprintCallback.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_CANCEL));
                    FingerprintManager.this.cancel();
                } else if (i == 2) {
                    iFingerprintCallback.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.DLG_TOPWD));
                    FingerprintManager.this.cancel();
                }
            }
        });
        return fingerprintDialog;
    }

    public FingerprintResult openFingerprintManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult) ipChange.ipc$dispatch("5de0f085", new Object[]{this});
        }
        LogUtils.record(2, "FingerprintManager::openFingerprintManager", "");
        return new FingerprintResult(g(Constants.PT_OPEN_FP_MANAGER, 0, new FingerprintRequest().mData));
    }

    public void register(FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c697b2b", new Object[]{this, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtils.record(2, "FingerprintManager::register", "");
        h(Constants.PT_REGISTER, 2, fingerprintRequest, iFingerprintCallback);
    }

    public void registerWithDialog(Activity activity, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a9ecb", new Object[]{this, activity, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtils.record(2, "FingerprintManager::registerWithDialog", "");
        FingerprintDialog b = b(activity, fingerprintRequest);
        FingerprintRetryProxyCallback a2 = a(activity, b, fingerprintRequest, iFingerprintCallback);
        i(activity, b, a2);
        h(Constants.PT_REGISTER, 2, fingerprintRequest, a2);
    }

    public void unregister(FingerprintRequest fingerprintRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc70ab8", new Object[]{this, fingerprintRequest});
            return;
        }
        LogUtils.record(2, "FingerprintManager::unregister", "");
        h(Constants.PT_UNREGISTER, 0, fingerprintRequest, null);
    }

    public void verifyWithDialog(Activity activity, FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606ae035", new Object[]{this, activity, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtils.record(2, "FingerprintManager::verifyWithDialog", "");
        FingerprintDialog e = e(activity, fingerprintRequest);
        FingerprintRetryProxyCallback d = d(activity, e, fingerprintRequest, iFingerprintCallback);
        j(activity, e, fingerprintRequest, d);
        h(3, 2, fingerprintRequest, d);
    }

    public void vertify(FingerprintRequest fingerprintRequest, IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90150a3", new Object[]{this, fingerprintRequest, iFingerprintCallback});
            return;
        }
        LogUtils.record(2, "FingerprintManager::vertify", "custom view");
        h(3, 2, fingerprintRequest, d(this.b, null, fingerprintRequest, iFingerprintCallback));
    }

    public void setResourceProvider(IResourceProvider iResourceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e331e4", new Object[]{this, iResourceProvider});
            return;
        }
        LogUtils.record(2, "FingerprintManager::setResourceProvider", "provider:" + iResourceProvider);
        if (iResourceProvider != null) {
            this.c = new ResourceLoader(iResourceProvider);
        }
    }
}
