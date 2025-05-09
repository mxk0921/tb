package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FormatException extends ReaderException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final FormatException instance = new FormatException();

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FormatException) ipChange.ipc$dispatch("278abff3", new Object[0]);
        }
        return instance;
    }

    public static /* synthetic */ Object ipc$super(FormatException formatException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/minizxing/FormatException");
    }
}
