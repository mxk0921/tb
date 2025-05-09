package com.alipay.mobile.common.logging.impl;

import android.content.Context;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.interceptor.TraceLoggerInterceptor;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.crash.ThrowableListener;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TraceLoggerImpl implements TraceLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LogContext f3978a;
    public final boolean b;
    public StringBuffer c;
    public final TraceLoggerInterceptor d;

    public TraceLoggerImpl(LogContext logContext) {
        Context applicationContext = logContext.getApplicationContext();
        this.f3978a = logContext;
        this.b = LoggingUtil.isDebuggable(applicationContext);
        this.d = logContext.getTraceLoggerInterceptor();
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (this.c == null) {
            this.c = new StringBuffer();
        }
        String name = Thread.currentThread().getName();
        try {
            StringBuffer stringBuffer = this.c;
            stringBuffer.append('[');
            stringBuffer.append(name);
            stringBuffer.append("] ");
            this.c.append(str);
            if (str2 != null) {
                StringBuffer stringBuffer2 = this.c;
                stringBuffer2.append(" ");
                stringBuffer2.append(str2);
            }
        } catch (Throwable unused) {
        }
        String stringBuffer3 = this.c.toString();
        this.c.setLength(0);
        return stringBuffer3;
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
        } else if (this.b) {
            a(str2, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
        } else if (this.b) {
            a(str2, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161e0c9", new Object[]{this, str, str2});
        } else if (this.b) {
            a(str2, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void print(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20a03c8", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921d919d", new Object[]{this, str, str2});
        } else if (this.b) {
            a(str2, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21b56a1", new Object[]{this, str, str2});
        } else if (this.b) {
            a(str2, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void print(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cbf137", new Object[]{this, str, th});
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void error(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{this, str, th});
            return;
        }
        String throwableToString = LoggingUtil.throwableToString(th);
        ThrowableListener.processThrowable(throwableToString);
        if (this.b) {
            a(throwableToString, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void warn(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{this, str, th});
            return;
        }
        String throwableToString = LoggingUtil.throwableToString(th);
        ThrowableListener.processThrowable(throwableToString);
        if (this.b) {
            a(throwableToString, null);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void error(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c88bb2", new Object[]{this, str, str2, th});
            return;
        }
        String throwableToString = LoggingUtil.throwableToString(th);
        ThrowableListener.processThrowable(throwableToString);
        if (this.b) {
            a(str2, throwableToString);
        }
    }

    @Override // com.alipay.mobile.common.logging.api.trace.TraceLogger
    public void warn(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c808bbf4", new Object[]{this, str, str2, th});
            return;
        }
        String throwableToString = LoggingUtil.throwableToString(th);
        ThrowableListener.processThrowable(throwableToString);
        if (this.b) {
            a(str2, throwableToString);
        }
    }
}
