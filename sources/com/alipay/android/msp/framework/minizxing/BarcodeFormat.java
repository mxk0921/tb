package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum BarcodeFormat {
    CODE_128,
    QR_CODE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(BarcodeFormat barcodeFormat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/minizxing/BarcodeFormat");
    }

    public static BarcodeFormat valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BarcodeFormat) ipChange.ipc$dispatch("d13a81c4", new Object[]{str});
        }
        return (BarcodeFormat) Enum.valueOf(BarcodeFormat.class, str);
    }
}
