package com.alipay.mobile.verifyidentity.log;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import tb.s4s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VITraceLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile VITraceLogger c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4300a = false;
    public final StringBuffer b = new StringBuffer();

    public VITraceLogger() {
        try {
            LogLevel logLevel = LogLevel.D;
            b("com.taobao.taobao,VIFBUnitedView", logLevel);
            b("com.taobao.taobao,EnvInfoUtil", logLevel);
            b("com.taobao.taobao,FingerprintPlugin", logLevel);
            b("com.taobao.taobao,PasswordInputUnifiedPlugin", logLevel);
            b("com.taobao.taobao,PayPwdDialogActivity", logLevel);
            b("com.taobao.taobao,FingerprintCheckActivity", logLevel);
            b("com.taobao.taobao,ZFaceChecker", logLevel);
            b("com.taobao.taobao,FaceIdChecker", logLevel);
            b("com.taobao.taobao,FpBaseHelper", logLevel);
            b("com.taobao.taobao,DecisonLogBehavior", logLevel);
            b("com.taobao.taobao,SafepayChecker", logLevel);
            b("com.taobao.taobao,ViTbDecisionReceiver", logLevel);
            b("com.taobao.taobao,AIManager", logLevel);
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a15dac4", new Object[]{str, logLevel});
            return;
        }
        try {
            s4s.e().a(str, logLevel);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        try {
            TLog.logw(str, str2, str3);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        try {
            TLog.loge(str, str2, th);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        return false;
    }

    public static boolean f(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe179b07", new Object[]{str, th})).booleanValue();
        }
        return false;
    }

    public static VITraceLogger getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VITraceLogger) ipChange.ipc$dispatch("893bf25e", new Object[0]);
        }
        if (c == null) {
            synchronized (VITraceLogger.class) {
                try {
                    if (c == null) {
                        c = new VITraceLogger();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static String throwableToString(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8235015e", new Object[]{th});
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

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        this.b.setLength(0);
        StringBuffer stringBuffer = this.b;
        stringBuffer.append('[');
        stringBuffer.append(Thread.currentThread().getName());
        stringBuffer.append("] ");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
            return;
        }
        e(str, str2);
        try {
            TLog.logd(str, str, str2);
        } catch (Throwable th) {
            th.getMessage();
        }
        if (this.f4300a) {
            a(str2);
        }
    }

    public void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
            return;
        }
        e(str, str2);
        try {
            TLog.loge(str, str, str2);
        } catch (Throwable th) {
            th.getMessage();
        }
        if (this.f4300a) {
            a(str2);
        }
    }

    public void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
            return;
        }
        e(str, str2);
        try {
            TLog.logi(str, str, str2);
        } catch (Throwable th) {
            th.getMessage();
        }
        if (this.f4300a) {
            a(str2);
        }
    }

    public void print(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20a03c8", new Object[]{this, str, str2});
        } else {
            e(str, str2);
        }
    }

    public void setDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{this, new Boolean(z)});
        } else {
            this.f4300a = z;
        }
    }

    public void verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d919d", new Object[]{this, str, str2});
            return;
        }
        e(str, str2);
        try {
            TLog.logv(str, str, str2);
        } catch (Throwable th) {
            th.getMessage();
        }
        if (this.f4300a) {
            a(str2);
        }
    }

    public void warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b56a1", new Object[]{this, str, str2});
            return;
        }
        e(str, str2);
        c(str, str, str2);
        if (this.f4300a) {
            a(str2);
        }
    }

    public void print(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cbf137", new Object[]{this, str, th});
        } else {
            f(str, th);
        }
    }

    public void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{this, str, th});
            return;
        }
        f(str, th);
        String throwableToString = throwableToString(th);
        c(str, str, throwableToString);
        if (this.f4300a) {
            a(throwableToString);
        }
    }

    public void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
            return;
        }
        f(str, th);
        d(str, str, th);
        String throwableToString = throwableToString(th);
        if (this.f4300a) {
            a(throwableToString);
        }
    }

    public void error(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{this, str, str2, th});
            return;
        }
        d(str, str, th);
        String throwableToString = throwableToString(th);
        if (this.f4300a) {
            a(throwableToString);
            if (str2 != null) {
            }
        }
    }
}
