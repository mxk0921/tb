package com.alipay.android.app.smartpays.fingerprint.callback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
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
public class FingerprintCanceableProxyCallback extends FingerprintSensorProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BroadcastReceiver b;

    public FingerprintCanceableProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
    }

    public static /* synthetic */ Object ipc$super(FingerprintCanceableProxyCallback fingerprintCanceableProxyCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 195948249) {
            super.onFinish();
            return null;
        } else if (hashCode == 2133689546) {
            super.onStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/app/smartpays/fingerprint/callback/FingerprintCanceableProxyCallback");
        }
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        super.onFinish();
        unregisterCancelReceiver();
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        registerCancelReceiver();
    }

    public void registerCancelReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307b2293", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintCanceableProxyCallback::registerCancelReceiver", "");
        if (this.b == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.app.smartpays.fingerprint.callback.FingerprintCanceableProxyCallback.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/smartpays/fingerprint/callback/FingerprintCanceableProxyCallback$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    LogUtils.record(2, "FingerprintCanceableProxyCallback::registerCancelReceiver", "onReceive Broadcast");
                    FingerprintCanceableProxyCallback.this.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.COMMON_TIMEOUT));
                }
            };
            try {
                LocalBroadcastManager.getInstance(this.mContext).registerReceiver(broadcastReceiver, new IntentFilter("com.alipay.android.app.FINGERPRINT_VERIFY_CHANGED"));
            } catch (Throwable th) {
                LogUtils.printExceptionStackTrace(th);
            }
            this.b = broadcastReceiver;
        }
    }

    public void unregisterCancelReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0d8b3ec", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintCanceableProxyCallback::unregisterCancelReceiver", "");
        if (this.b != null) {
            try {
                LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.b);
            } catch (Throwable th) {
                LogUtils.printExceptionStackTrace(th);
            }
            this.b = null;
        }
    }
}
