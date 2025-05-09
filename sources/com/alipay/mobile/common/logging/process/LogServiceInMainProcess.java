package com.alipay.mobile.common.logging.process;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.util.avail.ExceptionCollector;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogServiceInMainProcess extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public LogServiceInMainProcess() {
        super("LogServiceInMainProcess");
    }

    public static /* synthetic */ Object ipc$super(LogServiceInMainProcess logServiceInMainProcess, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/process/LogServiceInMainProcess");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LoggerFactory.getLogContext().flush(LogCategory.CATEGORY_APPLOG, false);
        LoggerFactory.getLogContext().flush(null, false);
        super.onDestroy();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
        } else if (intent != null) {
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            if (!TextUtils.isEmpty(action) && extras != null) {
                if (action.equals(getPackageName() + LogContext.ACTION_UPLOAD_MDAPLOG)) {
                    try {
                        VariableStoreInToolsProcess.f3979a = extras.getBoolean("isMonitorBackground");
                        VariableStoreInToolsProcess.b = extras.getBoolean("isStrictBackground");
                        VariableStoreInToolsProcess.c = extras.getBoolean("isRelaxedBackground");
                        VariableStoreInToolsProcess.d = extras.getString("invokerProcessAlias");
                    } catch (Throwable th) {
                        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                        traceLogger.error("LogServiceInMainProcess", "ACTION_UPLOAD_MDAPLOG: " + th.toString());
                    }
                    LoggerFactory.getLogContext().adjustUploadCoreByCategoryDirectly(extras.getString("logCategory"), extras.getString("uploadUrl"), extras);
                    VariableStoreInToolsProcess.f3979a = true;
                    VariableStoreInToolsProcess.b = true;
                    VariableStoreInToolsProcess.c = true;
                    VariableStoreInToolsProcess.d = null;
                } else if (action.equals("ExceptionCollector_recordException")) {
                    try {
                        String string = extras.getString("exceptionType");
                        long j = extras.getLong("crashLaunchTime");
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        if (j > 0) {
                            ExceptionCollector.getInstance(getApplicationContext()).recordException(string, j);
                        } else {
                            ExceptionCollector.getInstance(getApplicationContext()).recordException(string);
                        }
                    } catch (Throwable th2) {
                        LoggerFactory.getTraceLogger().warn("LogServiceInMainProcess", th2);
                    }
                } else {
                    LoggerFactory.getTraceLogger().error("LogServiceInMainProcess", "no such action: ".concat(action));
                }
            }
        }
    }
}
