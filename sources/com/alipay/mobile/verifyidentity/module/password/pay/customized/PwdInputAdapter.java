package com.alipay.mobile.verifyidentity.module.password.pay.customized;

import android.app.Activity;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.LongPwdInputWidget;
import com.alipay.mobile.verifyidentity.module.password.pay.customized.ui.SafeInputWidget;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PwdInputAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static VISafeInputInterface a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VISafeInputInterface) ipChange.ipc$dispatch("a0fdc408", new Object[]{activity, new Boolean(z)});
        }
        VerifyLogCat.d("PwdInputAdapter", "MYBANK:" + z);
        return new SafeInputWidget(activity, z);
    }

    public VISafeInputInterface getVISafeInput(Activity activity, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VISafeInputInterface) ipChange.ipc$dispatch("743c0b91", new Object[]{this, activity, new Boolean(z), str});
        }
        if ("myBank".equalsIgnoreCase(str)) {
            return a(activity, z);
        }
        return new VISafeInput(activity, z);
    }

    public VISafeInputInterface getVISafeInputForNew(Activity activity, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VISafeInputInterface) ipChange.ipc$dispatch("e4a28308", new Object[]{this, activity, new Boolean(z), str});
        }
        if ("myBank".equalsIgnoreCase(str)) {
            return a(activity, z);
        }
        if (!z) {
            return new LongPwdInputWidget(activity);
        }
        return new VISafeInput(activity, z);
    }
}
