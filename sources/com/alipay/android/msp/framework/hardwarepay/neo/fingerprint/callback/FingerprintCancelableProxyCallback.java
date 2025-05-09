package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintCancelableProxyCallback extends FingerprintSensorProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BroadcastReceiver b;

    public FingerprintCancelableProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintCancelableProxyCallback");
    }

    public static /* synthetic */ Object ipc$super(FingerprintCancelableProxyCallback fingerprintCancelableProxyCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 195948249) {
            super.onFinish();
            return null;
        } else if (hashCode == 2133689546) {
            super.onStart();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/framework/hardwarepay/neo/fingerprint/callback/FingerprintCancelableProxyCallback");
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        super.onFinish();
        LogUtil.record(2, "FingerprintCancelableProxyCallback::unregisterCancelReceiver", "");
        if (this.b != null) {
            try {
                LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.b);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            this.b = null;
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback, com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        LogUtil.record(2, "FingerprintCancelableProxyCallback::registerCancelReceiver", "");
        if (this.b == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintCancelableProxyCallback.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/neo/fingerprint/callback/FingerprintCancelableProxyCallback$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    LogUtil.record(2, "FingerprintCancelableProxyCallback::registerCancelReceiver", "onReceive Broadcast");
                    FingerprintCancelableProxyCallback.this.onCallBack(new FingerprintResult(FingerprintResult.FingerprintStatus.COMMON_TIMEOUT));
                }
            };
            try {
                LocalBroadcastManager.getInstance(this.mContext).registerReceiver(broadcastReceiver, new IntentFilter("com.alipay.android.app.FINGERPRINT_VERIFY_CHANGED"));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            this.b = broadcastReceiver;
        }
    }
}
