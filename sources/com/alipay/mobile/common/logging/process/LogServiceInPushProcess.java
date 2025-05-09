package com.alipay.mobile.common.logging.process;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogServiceInPushProcess extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public LogServiceInPushProcess() {
        super("LogServiceInPushProcess");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if ("channelId".equals(str)) {
            LoggerFactory.getLogContext().setChannelIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_RELEASETYPE.equals(str)) {
            LoggerFactory.getLogContext().setReleaseTypeNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_RELEASECODE.equals(str)) {
            LoggerFactory.getLogContext().setReleaseCodeNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_PRODUCTID.equals(str)) {
            LoggerFactory.getLogContext().setProductIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_PRODUCTVERSION.equals(str)) {
            LoggerFactory.getLogContext().setProductVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_USERID.equals(str)) {
            LoggerFactory.getLogContext().setUserIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_CLIENTID.equals(str)) {
            LoggerFactory.getLogContext().setClientIdNoCommit(str2);
        } else if ("utdid".equals(str)) {
            LoggerFactory.getLogContext().setDeviceIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_LANGUAGE.equals(str)) {
            LoggerFactory.getLogContext().setLanguageNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_HOTPATCHVERSION.equals(str)) {
            LoggerFactory.getLogContext().setHotpatchVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_HOTPATCHDESC.equals(str)) {
            LoggerFactory.getLogContext().setHotpatchDescNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_HOTPATCHBUNDLEVERSION.equals(str)) {
            LoggerFactory.getLogContext().setHotpatchBundleVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_BUNDLEVERSION.equals(str)) {
            LoggerFactory.getLogContext().setBundleVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_BIRDNESTVERSION.equals(str)) {
            LoggerFactory.getLogContext().setBirdNestVersionNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_PACKAGEID.equals(str)) {
            LoggerFactory.getLogContext().setPackageIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_USERSESSIONID.equals(str)) {
            LoggerFactory.getLogContext().setUserIdNoCommit(str2);
        } else if (LoggingSPCache.STORAGE_LOGHOST.equals(str)) {
            LoggerFactory.getLogContext().setLogHostNoCommit(str2);
        } else {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            traceLogger.error("LogServiceInPushProcess", "not mapping, type: " + str + ", value: " + str2);
        }
    }

    public static /* synthetic */ Object ipc$super(LogServiceInPushProcess logServiceInPushProcess, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 1270686685) {
            super.onLowMemory();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/common/logging/process/LogServiceInPushProcess");
        }
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

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            super.onLowMemory();
        }
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
                        traceLogger.error("LogServiceInPushProcess", "ACTION_UPLOAD_MDAPLOG: " + th.toString());
                    }
                    LoggerFactory.getLogContext().upload(extras.getString("logCategory"), extras.getString("uploadUrl"), extras);
                    VariableStoreInToolsProcess.f3979a = true;
                    VariableStoreInToolsProcess.b = true;
                    VariableStoreInToolsProcess.c = true;
                    VariableStoreInToolsProcess.d = null;
                    return;
                }
                if (action.equals(getPackageName() + LogContext.ACTION_UPDATE_LOG_STRATEGY)) {
                    LoggerFactory.getLogContext().updateLogStrategyCfg(extras.getString("strategy"));
                    return;
                }
                if (action.equals(getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT)) {
                    String string = extras.getString("type");
                    String string2 = extras.getString("value");
                    TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                    traceLogger2.info("LogServiceInPushProcess", action + ", type: " + string);
                    a(string, string2);
                    return;
                }
                if (action.equals(getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT_BATCH)) {
                    TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                    traceLogger3.info("LogServiceInPushProcess", action + ", size: " + extras.size());
                    for (String str : extras.keySet()) {
                        a(str, extras.getString(str));
                    }
                    LoggerFactory.getLogContext().resetExtrasToSet();
                    return;
                }
                if (action.equals(getPackageName() + LogContext.ACTION_TRACE_NATIVECRASH)) {
                    LoggerFactory.getLogContext().traceNativeCrash(extras.getString("filePath"), extras.getString("callStack"), extras.getBoolean("isBoot"));
                } else {
                    LoggerFactory.getTraceLogger().error("LogServiceInPushProcess", "no such action: ".concat(action));
                }
            }
        }
    }
}
