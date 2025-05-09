package com.alipay.android.msp.pay;

import com.alipay.android.app.api.BuildConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GlobalSdkConstant {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_VERSION = "5.7.2";
    public static final String KERNEL_VERSION = "6";
    public static final boolean SDK = true;

    public static String getApiVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44c0ca25", new Object[0]);
        }
        return "5.7.2";
    }

    public static String getKernelVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60491f4", new Object[0]);
        }
        return "6";
    }

    public static String getMspVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62df6f95", new Object[0]);
        }
        return BuildConfig.MSP_VERSION;
    }

    public static boolean getSdkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd5573e9", new Object[0])).booleanValue();
        }
        return true;
    }
}
