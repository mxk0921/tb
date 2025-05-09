package com.alipay.mobile.verifyidentity.log;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerifyLogCat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f4302a = "VerifyIdentityForTaobao";

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.debug(f4302a + "," + str, str2);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.error(f4302a + "," + str, str2);
    }

    public static String getExceptionMsg(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ce619ba", new Object[]{th});
        }
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            Throwable cause = th.getCause();
            if (cause == null) {
                th.printStackTrace(printWriter);
            }
            while (cause != null) {
                cause.printStackTrace(printWriter);
                cause = cause.getCause();
            }
            printWriter.close();
            return stringWriter.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info(f4302a + "," + str, str2);
    }

    public static void init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{str});
        } else {
            f4302a = str;
        }
    }

    public static void printStackTraceAndMore(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b81bcc", new Object[]{th});
            return;
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.error(f4302a + ", StackTrace", th);
    }

    public static void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
            return;
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.verbose(f4302a + "," + str, str2);
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.warn(f4302a + "," + str, str2);
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
            return;
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.error(f4302a + "," + str, th);
    }

    public static void w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be68a92d", new Object[]{str, th});
            return;
        }
        VITraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.warn(f4302a + "," + str, th);
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        LoggerFactory.getTraceLogger().error(f4302a + "," + str, str2 + "::" + getExceptionMsg(th));
    }

    public static void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
            return;
        }
        LoggerFactory.getTraceLogger().warn(f4302a + "," + str, str2 + "::" + getExceptionMsg(th));
    }
}
