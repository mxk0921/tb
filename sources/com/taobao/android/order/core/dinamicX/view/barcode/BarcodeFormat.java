package com.taobao.android.order.core.dinamicX.view.barcode;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum BarcodeFormat {
    CODE_128;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(BarcodeFormat barcodeFormat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/barcode/BarcodeFormat");
    }

    public static BarcodeFormat valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BarcodeFormat) ipChange.ipc$dispatch("49b0142", new Object[]{str});
        }
        return (BarcodeFormat) Enum.valueOf(BarcodeFormat.class, str);
    }
}
