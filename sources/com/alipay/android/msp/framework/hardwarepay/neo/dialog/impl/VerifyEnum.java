package com.alipay.android.msp.framework.hardwarepay.neo.dialog.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum VerifyEnum {
    OPEN,
    VERIFY;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(VerifyEnum verifyEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/neo/dialog/impl/VerifyEnum");
    }

    public static VerifyEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyEnum) ipChange.ipc$dispatch("38f0f8f5", new Object[]{str});
        }
        return (VerifyEnum) Enum.valueOf(VerifyEnum.class, str);
    }
}
