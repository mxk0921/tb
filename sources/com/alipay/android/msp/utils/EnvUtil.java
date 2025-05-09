package com.alipay.android.msp.utils;

import com.alipay.android.msp.api.MspEnvProvider;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EnvUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static MspEnvProvider sCashierProvider;

    public static MspEnvProvider getsCashierProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspEnvProvider) ipChange.ipc$dispatch("d86b87aa", new Object[0]);
        }
        return sCashierProvider;
    }

    public static void setsCashierProvider(MspEnvProvider mspEnvProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48cce72", new Object[]{mspEnvProvider});
        } else {
            sCashierProvider = mspEnvProvider;
        }
    }
}
