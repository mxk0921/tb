package com.alipay.mobile.common.logging.appender;

import android.taobao.windvane.jsbridge.api.WVFile;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.interceptor.TraceLoggerInterceptor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ApplogFileAppender extends ExternalFileAppender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ApplogFileAppender(LogContext logContext, long j, long j2, long j3, int i) {
        super(logContext, LogCategory.CATEGORY_APPLOG, j, j2, j3, i);
    }

    public static /* synthetic */ Object ipc$super(ApplogFileAppender applogFileAppender, String str, Object... objArr) {
        if (str.hashCode() == 792744592) {
            super.a((LogEvent) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/appender/ApplogFileAppender");
    }

    @Override // com.alipay.mobile.common.logging.appender.ExternalFileAppender, com.alipay.mobile.common.logging.appender.Appender
    public final synchronized void a(LogEvent logEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f405290", new Object[]{this, logEvent});
            return;
        }
        TraceLoggerInterceptor traceLoggerInterceptor = this.f3958a.getTraceLoggerInterceptor();
        if (!(traceLoggerInterceptor == null || traceLoggerInterceptor.getAppendType() == 1 || this.o.length() > WVFile.FILE_MAX_SIZE)) {
            if (traceLoggerInterceptor.getAppendType() != 2) {
                traceLoggerInterceptor.getAppendType();
                return;
            } else if (logEvent != null) {
                String logEvent2 = logEvent.toString();
                if (!TextUtils.isEmpty(logEvent2)) {
                    a(logEvent2);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        super.a(logEvent);
    }
}
