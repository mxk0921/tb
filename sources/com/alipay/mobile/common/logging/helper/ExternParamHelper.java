package com.alipay.mobile.common.logging.helper;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExternParamHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f3971a = new HashMap(4);

    static {
        new HashMap();
    }

    public static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        try {
            Map<String, String> map = f3971a;
            if (map != null && ((HashMap) map).size() > 0) {
                return map;
            }
            ((HashMap) map).put("NumCoresOfCPU", String.valueOf(DeviceHWRenderHelper.a()));
            ((HashMap) map).put("CPUMaxFreq", String.valueOf(DeviceHWRenderHelper.c()));
            ((HashMap) map).put("TotalMem", String.valueOf(DeviceHWRenderHelper.a(LoggerFactory.getLogContext().getApplicationContext())));
            return map;
        } catch (Throwable th) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("ExternParamHelper", "getDeviceInfos ex= " + th.toString());
            return Collections.emptyMap();
        }
    }
}
