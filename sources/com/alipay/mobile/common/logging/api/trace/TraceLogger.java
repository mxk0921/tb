package com.alipay.mobile.common.logging.api.trace;

import com.alipay.mobile.framework.MpaasClassInfo;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface TraceLogger {
    void debug(String str, String str2);

    void error(String str, String str2);

    void error(String str, String str2, Throwable th);

    void error(String str, Throwable th);

    void info(String str, String str2);

    void print(String str, String str2);

    void print(String str, Throwable th);

    void verbose(String str, String str2);

    void warn(String str, String str2);

    void warn(String str, String str2, Throwable th);

    void warn(String str, Throwable th);
}
