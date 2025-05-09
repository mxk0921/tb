package com.alipay.mobile.common.logging.helper;

import android.content.Context;
import com.alipay.mobile.common.logging.api.DeviceHWInfo;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DevicePerformanceScoreHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static DevicePerformanceScoreHelper b;

    /* renamed from: a  reason: collision with root package name */
    public LogContext.DevicePerformanceScore f3970a;

    public DevicePerformanceScoreHelper(Context context) {
        LogContext.DevicePerformanceScore devicePerformanceScore = LogContext.DevicePerformanceScore.LOW;
        this.f3970a = devicePerformanceScore;
        long totalMemory = DeviceHWInfo.getTotalMemory(context);
        if (totalMemory == -1) {
            this.f3970a = devicePerformanceScore;
        } else if (totalMemory < 3670016000L) {
            this.f3970a = devicePerformanceScore;
        } else {
            this.f3970a = LogContext.DevicePerformanceScore.HIGH;
        }
    }

    public static DevicePerformanceScoreHelper a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DevicePerformanceScoreHelper) ipChange.ipc$dispatch("3a58de5c", new Object[]{context});
        }
        if (b == null) {
            synchronized (DevicePerformanceScoreHelper.class) {
                try {
                    if (b == null) {
                        b = new DevicePerformanceScoreHelper(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }
}
