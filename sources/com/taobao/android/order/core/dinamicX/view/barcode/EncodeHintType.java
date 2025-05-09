package com.taobao.android.order.core.dinamicX.view.barcode;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum EncodeHintType {
    MIN_SIZE,
    MAX_SIZE,
    MARGIN;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(EncodeHintType encodeHintType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/barcode/EncodeHintType");
    }

    public static EncodeHintType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EncodeHintType) ipChange.ipc$dispatch("3aed5d86", new Object[]{str});
        }
        return (EncodeHintType) Enum.valueOf(EncodeHintType.class, str);
    }
}
