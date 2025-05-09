package com.alipay.mobile.common.logging.api.monitor;

import com.alipay.mobile.framework.MpaasClassInfo;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface MonitorLogger {
    void apm(String str, String str2, Throwable th, Map<String, String> map);

    void battery(BatteryModel batteryModel);

    void crash(ExceptionID exceptionID, Throwable th, String str);

    void crash(Throwable th, String str);

    void dangerousUpload(String str, String str2, String str3, Map<String, String> map);

    void dataflow(DataflowModel dataflowModel);

    void exception(ExceptionID exceptionID, Throwable th);

    void exception(Throwable th, String str, Map<String, String> map);

    void footprint(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    void keyBizTrace(String str, String str2, String str3, Map<String, String> map);

    void mtBizReport(String str, String str2, String str3, Map<String, String> map);

    void performance(PerformanceID performanceID, Performance performance);

    void performance(PerformanceID performanceID, Performance performance, Map<String, String> map);

    void performance(String str, Performance performance);

    void setUploadSize(String str, int i);
}
