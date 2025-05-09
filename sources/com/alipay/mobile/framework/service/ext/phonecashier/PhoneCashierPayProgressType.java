package com.alipay.mobile.framework.service.ext.phonecashier;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum PhoneCashierPayProgressType {
    payenter,
    paying,
    payfinish,
    payexit;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(PhoneCashierPayProgressType phoneCashierPayProgressType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/framework/service/ext/phonecashier/PhoneCashierPayProgressType");
    }

    public static PhoneCashierPayProgressType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhoneCashierPayProgressType) ipChange.ipc$dispatch("77248cbd", new Object[]{str});
        }
        return (PhoneCashierPayProgressType) Enum.valueOf(PhoneCashierPayProgressType.class, str);
    }
}
