package com.alipay.mobile.common.netsdkextdependapi.logger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface LoggerManager {
    void debug(String str, String str2);

    void error(String str, String str2);

    void error(String str, String str2, Throwable th);

    void error(String str, Throwable th);

    void info(String str, String str2);

    void printError(String str, Throwable th);

    void printInfo(String str, String str2);

    void verbose(String str, String str2);

    void warn(String str, String str2);

    void warn(String str, String str2, Throwable th);

    void warn(String str, Throwable th);
}
