package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintSensorProxyCallback extends FingerprintProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f3615a;

    public FingerprintSensorProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintSensorProxyCallback");
    }

    public static /* synthetic */ Object ipc$super(FingerprintSensorProxyCallback fingerprintSensorProxyCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/neo/fingerprint/callback/FingerprintSensorProxyCallback");
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FingerprintSensorProxyCallback::unregisterFpSensorReceiver", "");
        BroadcastReceiver broadcastReceiver = this.f3615a;
        if (broadcastReceiver != null) {
            try {
                this.mContext.unregisterReceiver(broadcastReceiver);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            this.f3615a = null;
        }
    }

    @Override // com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintProxyCallback
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        LogUtil.record(2, "FingerprintSensorProxyCallback::registerFpSensorReceiver", "");
        if (this.f3615a == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.FingerprintSensorProxyCallback.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/neo/fingerprint/callback/FingerprintSensorProxyCallback$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    int intExtra = intent.getIntExtra("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE", 0);
                    LogUtil.record(2, "FingerprintSensorProxyCallback::registerFpSensorReceiver", "onReceive, status=".concat(String.valueOf(intExtra)));
                    if (intExtra == 2) {
                        FingerprintSensorProxyCallback.this.onProgressChanged(false, new FingerprintResult(FingerprintResult.FingerprintStatus.COMMON_VERIFYING));
                    }
                }
            };
            try {
                IntentFilter intentFilter = new IntentFilter("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_ACTION");
                if (Build.VERSION.SDK_INT >= 33) {
                    this.mContext.registerReceiver(broadcastReceiver, intentFilter, 4);
                } else {
                    this.mContext.registerReceiver(broadcastReceiver, intentFilter);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            this.f3615a = broadcastReceiver;
        }
    }
}
