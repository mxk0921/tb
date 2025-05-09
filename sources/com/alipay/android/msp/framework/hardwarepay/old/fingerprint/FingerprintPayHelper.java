package com.alipay.android.msp.framework.hardwarepay.old.fingerprint;

import android.content.Context;
import com.alipay.android.app.hardwarepay.fingerprint.impl.FingerprintPayHelperImpl;
import com.alipay.android.msp.framework.hardwarepay.old.base.BaseCommonPayHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FingerprintPayHelper extends BaseCommonPayHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static FingerprintPayHelper hn;

    public static FingerprintPayHelper getInstance() {
        if (hn == null) {
            synchronized (FingerprintPayHelper.class) {
                try {
                    if (hn == null) {
                        hn = (FingerprintPayHelper) FingerprintPayHelperImpl.class.newInstance();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return hn;
    }

    public static /* synthetic */ Object ipc$super(FingerprintPayHelper fingerprintPayHelper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/old/fingerprint/FingerprintPayHelper");
    }

    public abstract void cancel();

    public abstract int checkUserStatus(String str);

    public abstract String[] getAuthInfo();

    public abstract int initHardwarePay(Context context, int i, String str);

    public abstract String process(int i, String str, int i2);

    public abstract void process(int i, int i2, String str, int i3, Object obj, Context context);

    public abstract int registedFingerPrintNumber();
}
