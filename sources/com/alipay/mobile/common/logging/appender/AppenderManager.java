package com.alipay.mobile.common.logging.appender;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppenderManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Appender> f3959a = new HashMap();
    public LogContext b;
    public boolean c;

    public final void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
            LoggerFactory.getTraceLogger().error("AppenderManager", "backupCurrent: no category");
        } else {
            Appender appender = this.f3959a.get(str);
            if (appender == null) {
                LoggerFactory.getTraceLogger().error("AppenderManager", "backupCurrent: no appender");
                return;
            }
            try {
                appender.a(z);
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error("AppenderManager", "backupCurrent", th);
            }
        }
    }

    public AppenderManager(LogContext logContext) {
        this.b = logContext;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        this.f3959a.put(LogCategory.CATEGORY_APPLOG, new ApplogFileAppender(logContext, millis, timeUnit2.toMillis(7L), 15728640L, 65536));
        this.f3959a.put(LogCategory.CATEGORY_TRAFFICLOG, new ExternalFileAppender(logContext, LogCategory.CATEGORY_TRAFFICLOG, timeUnit2.toMillis(1L), timeUnit2.toMillis(30L), 8388608L, 8192));
        this.f3959a.put(LogCategory.CATEGORY_LOGCAT, new ExternalFileAppender(logContext, LogCategory.CATEGORY_LOGCAT, timeUnit.toMillis(1L), timeUnit2.toMillis(1L), 4194304L, 8192));
        this.f3959a.put(LogCategory.CATEGORY_USERBEHAVOR, new MdapFileAppender(logContext, LogCategory.CATEGORY_USERBEHAVOR));
        this.f3959a.put(LogCategory.CATEGORY_AUTOUSERBEHAVOR, new MdapFileAppender(logContext, LogCategory.CATEGORY_AUTOUSERBEHAVOR));
        this.f3959a.put("exception", new MdapFileAppender(logContext, "exception"));
        Map<String, Appender> map = this.f3959a;
        String str = LogCategory.CATEGORY_SDKMONITOR;
        map.put(str, new MdapFileAppender(logContext, str));
        Map<String, Appender> map2 = this.f3959a;
        String str2 = LogCategory.CATEGORY_PERFORMANCE;
        map2.put(str2, new MdapFileAppender(logContext, str2));
        this.f3959a.put(LogCategory.CATEGORY_ROMESYNC, new MdapFileAppender(logContext, LogCategory.CATEGORY_ROMESYNC));
        Map<String, Appender> map3 = this.f3959a;
        String str3 = LogCategory.CATEGORY_NETWORK;
        map3.put(str3, new MdapFileAppender(logContext, str3));
        Map<String, Appender> map4 = this.f3959a;
        String str4 = LogCategory.CATEGORY_WEBAPP;
        map4.put(str4, new MdapFileAppender(logContext, str4));
        Map<String, Appender> map5 = this.f3959a;
        String str5 = LogCategory.CATEGORY_FOOTPRINT;
        map5.put(str5, new MdapFileAppender(logContext, str5));
        Map<String, Appender> map6 = this.f3959a;
        String str6 = LogCategory.CATEGORY_KEYBIZTRACE;
        map6.put(str6, new MdapFileAppender(logContext, str6));
        this.f3959a.put("crash", new MdapFileAppender(logContext, "crash"));
        this.f3959a.put("apm", new MdapFileAppender(logContext, "apm"));
        this.f3959a.put(LogCategory.CATEGORY_DATAFLOW, new MdapFileAppender(logContext, LogCategory.CATEGORY_DATAFLOW));
        this.f3959a.put(LogCategory.CATEGORY_BATTERY, new MdapFileAppender(logContext, LogCategory.CATEGORY_BATTERY));
        this.f3959a.put(LogCategory.CATEGORY_ALIVEREPORT, new MdapFileAppender(logContext, LogCategory.CATEGORY_ALIVEREPORT));
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0131 A[Catch: all -> 0x0017, TryCatch #2 {, blocks: (B:4:0x0002, B:6:0x0008, B:11:0x001c, B:14:0x0024, B:18:0x0038, B:20:0x0040, B:24:0x0059, B:26:0x0067, B:29:0x006c, B:31:0x0078, B:32:0x0086, B:34:0x008c, B:36:0x0094, B:39:0x0099, B:41:0x00a3, B:43:0x00a7, B:44:0x00b1, B:47:0x00b7, B:49:0x00c5, B:51:0x00cb, B:54:0x00d6, B:55:0x00e0, B:57:0x00e6, B:59:0x00f0, B:61:0x0101, B:64:0x010d, B:66:0x0120, B:68:0x0124, B:70:0x0128, B:72:0x0131, B:73:0x0136, B:76:0x0141, B:78:0x014e, B:80:0x0158, B:84:0x0165, B:86:0x016e, B:89:0x0179, B:91:0x0185, B:94:0x0194, B:99:0x01b4, B:105:0x01e0, B:101:0x01c1, B:96:0x01a1), top: B:112:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(com.alipay.mobile.common.logging.api.LogEvent r9) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.appender.AppenderManager.a(com.alipay.mobile.common.logging.api.LogEvent):void");
    }
}
