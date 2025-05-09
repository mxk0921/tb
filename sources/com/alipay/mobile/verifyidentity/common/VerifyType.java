package com.alipay.mobile.verifyidentity.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum VerifyType {
    TOKEN,
    VERIFYID,
    FAST_INIT,
    FAST_DIRECT,
    VERIFY;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(VerifyType verifyType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/common/VerifyType");
    }

    public static VerifyType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyType) ipChange.ipc$dispatch("a8228537", new Object[]{str});
        }
        return (VerifyType) Enum.valueOf(VerifyType.class, str);
    }
}
