package com.alipay.mobile.common.logging.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.BatteryModel;
import com.alipay.mobile.common.logging.api.monitor.DataflowModel;
import com.alipay.mobile.common.logging.api.monitor.ExceptionID;
import com.alipay.mobile.common.logging.api.monitor.MTBizReportFilter;
import com.alipay.mobile.common.logging.api.monitor.MonitorLogger;
import com.alipay.mobile.common.logging.api.monitor.Performance;
import com.alipay.mobile.common.logging.api.monitor.PerformanceID;
import com.alipay.mobile.common.logging.render.BatteryRender;
import com.alipay.mobile.common.logging.render.DataflowRender;
import com.alipay.mobile.common.logging.render.DiagnoseRender;
import com.alipay.mobile.common.logging.render.ExceptionRender;
import com.alipay.mobile.common.logging.render.PendingRender;
import com.alipay.mobile.common.logging.render.PerformanceRender;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.crash.CrashAnalyzer;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MonitorLoggerImpl implements MonitorLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LogContext f3977a;
    public final ExceptionRender b;
    public final PerformanceRender c;
    public final DiagnoseRender d;
    public final DataflowRender e;
    public final BatteryRender f;

    public MonitorLoggerImpl(LogContext logContext) {
        this.f3977a = logContext;
        this.b = new ExceptionRender(logContext);
        this.c = new PerformanceRender(logContext);
        this.d = new DiagnoseRender(logContext);
        this.e = new DataflowRender(logContext);
        this.f = new BatteryRender(logContext);
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void apm(String str, String str2, Throwable th, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6dbca9", new Object[]{this, str, str2, th, map});
        } else {
            this.f3977a.appendLogEvent(new LogEvent("apm", null, LogEvent.Level.INFO, this.d.a(str, str2, th, map)));
        }
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void battery(BatteryModel batteryModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4517c289", new Object[]{this, batteryModel});
        } else {
            this.f3977a.appendLogEvent(new LogEvent(LogCategory.CATEGORY_BATTERY, null, LogEvent.Level.INFO, this.f.a(batteryModel)));
        }
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void crash(Throwable th, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fee6611", new Object[]{this, th, str});
        } else {
            crash(ExceptionID.MONITORPOINT_CRASH, th, str);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void dataflow(DataflowModel dataflowModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23cd3205", new Object[]{this, dataflowModel});
        } else {
            this.f3977a.appendLogEvent(new LogEvent(LogCategory.CATEGORY_DATAFLOW, null, new LogEvent.Level(dataflowModel.getLoggerLevel()), this.e.a(dataflowModel)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void exception(com.alipay.mobile.common.logging.api.monitor.ExceptionID r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.impl.MonitorLoggerImpl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "72c2c632"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r7
            r7 = 2
            r2[r7] = r8
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            if (r8 != 0) goto L_0x001b
            return
        L_0x001b:
            r0 = 0
            com.alipay.mobile.common.logging.api.monitor.ExceptionID r1 = com.alipay.mobile.common.logging.api.monitor.ExceptionID.MONITORPOINT_SUB_THREAD_CRASH     // Catch: all -> 0x002d
            if (r7 == r1) goto L_0x002f
            com.alipay.mobile.common.logging.api.monitor.ExceptionID r1 = com.alipay.mobile.common.logging.api.monitor.ExceptionID.MONITORPOINT_IGNORE_CRASH     // Catch: all -> 0x002d
            if (r7 == r1) goto L_0x002f
            com.alipay.mobile.common.logging.api.monitor.ExceptionID r1 = com.alipay.mobile.common.logging.api.monitor.ExceptionID.MONITORPOINT_INVALID_CRASH     // Catch: all -> 0x002d
            if (r7 == r1) goto L_0x002f
            com.alipay.mobile.common.logging.api.monitor.ExceptionID r1 = com.alipay.mobile.common.logging.api.monitor.ExceptionID.MONITORPOINT_CRASH     // Catch: all -> 0x002d
            if (r7 != r1) goto L_0x0034
            goto L_0x002f
        L_0x002d:
            goto L_0x0034
        L_0x002f:
            java.lang.String r1 = com.alipay.mobile.common.logging.CrashBridge.q()     // Catch: all -> 0x002d
            goto L_0x0035
        L_0x0034:
            r1 = r0
        L_0x0035:
            java.lang.String r2 = "Native_Crash_In_Child_Thread:"
            java.lang.String r3 = r8.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0056
            com.alipay.mobile.common.logging.api.LogContext r2 = r6.f3977a
            com.alipay.mobile.common.logging.api.LogEvent r3 = new com.alipay.mobile.common.logging.api.LogEvent
            com.alipay.mobile.common.logging.api.LogEvent$Level r4 = com.alipay.mobile.common.logging.api.LogEvent.Level.ERROR
            com.alipay.mobile.common.logging.render.ExceptionRender r5 = r6.b
            java.lang.String r7 = r5.a(r7, r8, r1)
            java.lang.String r8 = "crash"
            r3.<init>(r8, r0, r4, r7)
            r2.syncAppendLogEvent(r3)
            return
        L_0x0056:
            com.alipay.mobile.common.logging.api.LogContext r2 = r6.f3977a
            com.alipay.mobile.common.logging.api.LogEvent r3 = new com.alipay.mobile.common.logging.api.LogEvent
            com.alipay.mobile.common.logging.api.LogEvent$Level r4 = com.alipay.mobile.common.logging.api.LogEvent.Level.ERROR
            com.alipay.mobile.common.logging.render.ExceptionRender r5 = r6.b
            java.lang.String r7 = r5.a(r7, r8, r1)
            java.lang.String r8 = "exception"
            r3.<init>(r8, r0, r4, r7)
            r2.appendLogEvent(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.impl.MonitorLoggerImpl.exception(com.alipay.mobile.common.logging.api.monitor.ExceptionID, java.lang.Throwable):void");
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void footprint(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202200d", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        LogContext logContext = this.f3977a;
        String str6 = LogCategory.CATEGORY_FOOTPRINT;
        LogEvent.Level level = LogEvent.Level.INFO;
        PerformanceRender performanceRender = this.c;
        PerformanceID performanceID = PerformanceID.MONITORPOINT_FOOTPRINT;
        logContext.appendLogEvent(new LogEvent(str6, null, level, performanceRender.a(performanceID, str, str2, str3, str4 + str5, map)));
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void keyBizTrace(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0f6bd6f", new Object[]{this, str, str2, str3, map});
        } else {
            this.f3977a.appendLogEvent(new LogEvent(LogCategory.CATEGORY_KEYBIZTRACE, null, LogEvent.Level.INFO, this.c.a(PerformanceID.MONITORPOINT_KEYBIZTRACE, "KeyBiz", str, str2, str3, map)));
        }
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void mtBizReport(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ecf780", new Object[]{this, str, str2, str3, map});
            return;
        }
        try {
            MTBizReportFilter.Entity entity = MTBizReportFilter.getEntity();
            if (entity != null) {
                if (map == null) {
                    map = new HashMap();
                }
                Map<String, String> onBeforeReportForUeo = entity.onBeforeReportForUeo(str, str2, str3, map, null);
                if (onBeforeReportForUeo != null) {
                    "1".equals(onBeforeReportForUeo.get(AgooConstants.MESSAGE_FLAG));
                }
            }
        } catch (Throwable unused) {
        }
        this.f3977a.appendLogEvent(new LogEvent(LogCategory.CATEGORY_HIGHAVAIL, null, LogEvent.Level.INFO, this.c.a(PerformanceID.MONITORPOINT_KEYBIZTRACE, "BizCanNotUse", str, str2, str3, map)));
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void performance(PerformanceID performanceID, Performance performance, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398ea77b", new Object[]{this, performanceID, performance, map});
            return;
        }
        String str = LogCategory.CATEGORY_PERFORMANCE;
        if (performanceID == PerformanceID.MONITORPOINT_NETWORK) {
            str = LogCategory.CATEGORY_NETWORK;
        } else if (performanceID == PerformanceID.MONITORPOINT_WEBAPP) {
            str = LogCategory.CATEGORY_WEBAPP;
        } else if (performanceID == PerformanceID.MONITORPOINT_H5EXCEPTION) {
            str = LogCategory.CATEGORY_H5EXCEPTION;
        } else if (performanceID == PerformanceID.MONITORPOINT_SDKMONITOR) {
            str = LogCategory.CATEGORY_SDKMONITOR;
        } else if (performanceID == PerformanceID.MONITORPOINT_SYNCLINK || performanceID == PerformanceID.MONITORPOINT_SYNCPROTO) {
            str = LogCategory.CATEGORY_ROMESYNC;
        }
        this.f3977a.appendLogEvent(new LogEvent(str, null, new LogEvent.Level(performance.getLoggerLevel()), null, PendingRender.a(this.c, performanceID, performance, map)));
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void setUploadSize(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a5b26e", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str) && i >= 0) {
            this.f3977a.putContextParam(LogContext.STORAGE_LOGCATEGORY_UPLOAD_PERFIX.concat(String.valueOf(str)), String.valueOf(i));
        }
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void crash(ExceptionID exceptionID, Throwable th, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f56b24", new Object[]{this, exceptionID, th, str});
            return;
        }
        try {
            String q = CrashBridge.q();
            if (!TextUtils.isEmpty(q)) {
                str = q;
            }
        } catch (Throwable unused) {
        }
        this.f3977a.syncAppendLogEvent(new LogEvent("crash", null, LogEvent.Level.ERROR, this.b.a(exceptionID, th, str)));
        String str2 = "crash: " + LoggingUtil.throwableToString(th);
        LoggerFactory.getTraceLogger().error("MonitorLogger", str2);
        LoggerFactory.getLogContext().flush(true);
        LoggerFactory.getLogContext().flush(LogCategory.CATEGORY_APPLOG, true);
        LoggerFactory.getLogContext().backupCurrentFile(LogCategory.CATEGORY_APPLOG, false);
        LoggingUtil.reflectErrorLogAutomationCrash(str2);
        CrashAnalyzer.analyzeJavaCrash(this.f3977a.getApplicationContext(), LoggingUtil.throwableToString(th));
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void dangerousUpload(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e2535", new Object[]{this, str, str2, str3, map});
            return;
        }
        String a2 = this.c.a(PerformanceID.MONITORPOINT_KEYBIZTRACE, "KeyBiz", str, str2, str3, map);
        if (a2.getBytes().length <= 10240) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(LogContext.IS_DANGEROUS_UPLOAD, true);
            bundle.putString("content", a2);
            this.f3977a.upload(LogCategory.CATEGORY_KEYBIZTRACE, null, bundle);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void exception(Throwable th, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75513bfc", new Object[]{this, th, str, map});
        } else {
            this.f3977a.appendLogEvent(new LogEvent("exception", null, LogEvent.Level.ERROR, this.b.a(ExceptionID.MONITORPOINT_BIZ_EXCEPTION, LoggingUtil.throwableToString(th), null, false, LoggerFactory.getProcessInfo().getProcessAlias(), Thread.currentThread().getName(), false, str, map)));
        }
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void performance(String str, Performance performance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d38308", new Object[]{this, str, performance});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = LogCategory.CATEGORY_PERFORMANCE;
        }
        this.f3977a.appendLogEvent(new LogEvent(str, null, new LogEvent.Level(performance.getLoggerLevel()), null, PendingRender.a(this.c, str, performance, (Object) null)));
    }

    @Override // com.alipay.mobile.common.logging.api.monitor.MonitorLogger
    public void performance(PerformanceID performanceID, Performance performance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41f86ca", new Object[]{this, performanceID, performance});
        } else {
            performance(performanceID, performance, null);
        }
    }
}
