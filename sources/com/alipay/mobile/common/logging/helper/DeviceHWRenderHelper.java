package com.alipay.mobile.common.logging.helper;

import android.content.Context;
import com.alipay.mobile.common.logging.api.DeviceHWInfo;
import com.alipay.mobile.common.logging.api.utils.LoggingUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DeviceHWRenderHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (LoggingUtils.isMainProcStartupFinishOrTimeout()) {
            return DeviceHWInfo.getNumberOfCPUCores();
        }
        return -1;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : DeviceHWInfo.getNumberOfCPUCores();
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        if (LoggingUtils.isMainProcStartupFinishOrTimeout()) {
            return d();
        }
        return -1;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        int cPUMaxFreqKHz = DeviceHWInfo.getCPUMaxFreqKHz();
        if (cPUMaxFreqKHz == -1 || cPUMaxFreqKHz <= 0) {
            return -1;
        }
        return cPUMaxFreqKHz / 1000;
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff3", new Object[]{context})).longValue();
        }
        long totalMemory = DeviceHWInfo.getTotalMemory(context);
        if (totalMemory == -1 || totalMemory <= 0) {
            return -1L;
        }
        return totalMemory / 1048576;
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        if (LoggingUtils.isMainProcStartupFinishOrTimeout()) {
            return b(context);
        }
        return -1L;
    }
}
