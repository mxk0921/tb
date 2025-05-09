package com.alipay.mobile.common.logging.helper;

import android.os.SystemClock;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.MTBizReportName;
import com.alipay.mobile.common.logging.util.LoggingAsyncTaskExecutor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BugReportAnalyzer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static BugReportAnalyzer b;

    /* renamed from: a  reason: collision with root package name */
    public long f3968a = 0;

    public static /* synthetic */ String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : b(i);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f3968a >= 1000) {
            this.f3968a = elapsedRealtime;
            LoggingAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.logging.helper.BugReportAnalyzer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ int f3969a = 1500;
                public final /* synthetic */ boolean b = false;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String a2 = BugReportAnalyzer.a(this.f3969a);
                        HashMap hashMap = new HashMap();
                        hashMap.put(LogCategory.CATEGORY_LOGCAT, a2);
                        LoggerFactory.getMonitorLogger().mtBizReport(MTBizReportName.MTBIZ_FRAME, "FRAME_LOGCAT_REPORT", "0", hashMap);
                        LoggerFactory.getLogContext().flush(null, this.b);
                        LoggerFactory.getLogContext().uploadAfterSync(null);
                    } catch (Throwable th) {
                        LoggerFactory.getTraceLogger().warn("BugReportAnalyzer", th);
                    }
                }
            });
        }
    }

    public static synchronized BugReportAnalyzer a() {
        synchronized (BugReportAnalyzer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BugReportAnalyzer) ipChange.ipc$dispatch("eb0316ee", new Object[0]);
            }
            if (b == null) {
                b = new BugReportAnalyzer();
            }
            return b;
        }
    }

    public static String b(int i) {
        Process process;
        BufferedReader bufferedReader;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)});
        }
        LoggerFactory.getTraceLogger().info("BugReportAnalyzer", "start getLogcat for " + i + " lines.");
        try {
            process = Runtime.getRuntime().exec("logcat -v time -d -t ".concat(String.valueOf(i)));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            process = null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
                stringBuffer.append("\n");
            }
            String stringBuffer2 = stringBuffer.toString();
            try {
                process.destroy();
            } catch (Throwable th4) {
                LoggerFactory.getTraceLogger().warn("BugReportAnalyzer", "close logcatProc", th4);
            }
            try {
                bufferedReader.close();
            } catch (Throwable th5) {
                LoggerFactory.getTraceLogger().warn("BugReportAnalyzer", "close bufferedReader", th5);
            }
            return stringBuffer2;
        } catch (Throwable th6) {
            th = th6;
            try {
                LoggerFactory.getTraceLogger().error("BugReportAnalyzer", "getLogcat", th);
                if (process != null) {
                    try {
                        process.destroy();
                    } catch (Throwable th7) {
                        LoggerFactory.getTraceLogger().warn("BugReportAnalyzer", "close logcatProc", th7);
                    }
                }
                if (bufferedReader == null) {
                    return "";
                }
                try {
                    bufferedReader.close();
                    return "";
                } catch (Throwable th8) {
                    LoggerFactory.getTraceLogger().warn("BugReportAnalyzer", "close bufferedReader", th8);
                    return "";
                }
            } catch (Throwable th9) {
                if (process != null) {
                    try {
                        process.destroy();
                    } catch (Throwable th10) {
                        LoggerFactory.getTraceLogger().warn("BugReportAnalyzer", "close logcatProc", th10);
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th11) {
                        LoggerFactory.getTraceLogger().warn("BugReportAnalyzer", "close bufferedReader", th11);
                    }
                }
                throw th9;
            }
        }
    }
}
