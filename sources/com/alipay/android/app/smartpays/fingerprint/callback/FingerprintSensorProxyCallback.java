package com.alipay.android.app.smartpays.fingerprint.callback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
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
public class FingerprintSensorProxyCallback extends FingerprintProxyCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FP_SENSOR_STATUS_INTENT = "com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_ACTION";
    public static final String FP_SENSOR_STATUS_VALUE = "com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE";

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f3499a;

    public FingerprintSensorProxyCallback(Context context, IFingerprintCallback iFingerprintCallback) {
        super(context, iFingerprintCallback);
    }

    public static /* synthetic */ Object ipc$super(FingerprintSensorProxyCallback fingerprintSensorProxyCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/smartpays/fingerprint/callback/FingerprintSensorProxyCallback");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b367d3", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintSensorProxyCallback::registerFpSensorReceiver", "");
        if (this.f3499a == null) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alipay.android.app.smartpays.fingerprint.callback.FingerprintSensorProxyCallback.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/app/smartpays/fingerprint/callback/FingerprintSensorProxyCallback$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    int intExtra = intent.getIntExtra("com.alipay.security.mobile.alipayauthenticatorservice.broadcast.FINGERPRINTSENSOR_STATUS_VALUE", 0);
                    LogUtils.record(2, "FingerprintSensorProxyCallback::registerFpSensorReceiver", "onReceive, status=" + intExtra);
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
                LogUtils.printExceptionStackTrace(th);
            }
            this.f3499a = broadcastReceiver;
        }
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else {
            unregisterSensorReceiver();
        }
    }

    @Override // com.alipay.android.app.smartpays.fingerprint.callback.FingerprintProxyCallback
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            a();
        }
    }

    public void unregisterSensorReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7410f92c", new Object[]{this});
            return;
        }
        LogUtils.record(2, "FingerprintSensorProxyCallback::unregisterFpSensorReceiver", "");
        BroadcastReceiver broadcastReceiver = this.f3499a;
        if (broadcastReceiver != null) {
            try {
                this.mContext.unregisterReceiver(broadcastReceiver);
            } catch (Throwable th) {
                LogUtils.printExceptionStackTrace(th);
            }
            this.f3499a = null;
        }
    }
}
