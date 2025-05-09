package com.alipay.mobile.verifyidentity.module.internal.password.pay.customized;

import android.app.Activity;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.customized.ui.IPaySafeInputWidget;
import com.android.alibaba.ip.runtime.IpChange;
import tb.abk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PwdInputAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public VISafeInputInterface getVISafeInput(Activity activity, boolean z, String str, boolean z2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VISafeInputInterface) ipChange.ipc$dispatch("f607522b", new Object[]{this, activity, new Boolean(z), str, new Boolean(z2), str2});
        }
        if (z || !z2 || !str2.equals(abk.FROM_FULL)) {
            return new VISafeInput(activity, z);
        }
        return new IPaySafeInputWidget(activity);
    }
}
