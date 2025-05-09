package com.alipay.mobile.verifyidentity.log;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LoggerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static VITraceLogger getTraceLogger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VITraceLogger) ipChange.ipc$dispatch("81308fea", new Object[0]);
        }
        return VITraceLogger.getInstance();
    }
}
