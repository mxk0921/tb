package com.huawei.hms.framework.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Logger {
    private static final boolean DEBUG = false;
    private static final int MAX_STACK_DEEP_LENGTH = 20;
    private static final int MAX_STACK_DEEP_LENGTH_NORMAL = 8;
    private static final String SPLIT = "|";
    private static final String TAG = "NetworkKit_Logger";
    private static final String TAG_NETWORKKIT_PRE = "NetworkKit_";
    private static final String TAG_NETWORK_SDK_PRE = "NetworkSdk_";
    private static ExtLogger extLogger = null;
    private static boolean kitPrint = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private String message;
        private Throwable ownerThrowable;
        private Throwable thisCause;

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void setCause(Throwable th) {
            this.thisCause = th;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable getCause() {
            Throwable th;
            th = this.thisCause;
            if (th == this) {
                th = null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.ownerThrowable;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.message == null) {
                return name;
            }
            String concat = name.concat(": ");
            if (this.message.startsWith(concat)) {
                return this.message;
            }
            return concat + this.message;
        }

        private ThrowableWrapper(Throwable th) {
            this.ownerThrowable = th;
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th.getMessage()));
        }
    }

    private static String complexAppTag(String str) {
        return TAG_NETWORK_SDK_PRE + str;
    }

    private static String complexMsg(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return getCallMethodInfo(i);
        }
        return getCallMethodInfo(i) + "|" + str;
    }

    private static String complexTag(String str) {
        return TAG_NETWORKKIT_PRE + str;
    }

    public static void d(String str, Object obj) {
        println(3, str, obj);
    }

    public static void e(String str, Object obj) {
        println(6, str, obj);
    }

    private static void extLogPrintln(int i, String str, String str2) {
        if (i == 2) {
            extLogger.v(str, str2);
        } else if (i == 3) {
            extLogger.d(str, str2);
        } else if (i == 4) {
            extLogger.i(str, str2);
        } else if (i == 5) {
            extLogger.w(str, str2);
        } else if (i == 6) {
            extLogger.e(str, str2);
        }
    }

    private static String getCallMethodInfo(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return Thread.currentThread().getName() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
    }

    private static Throwable getNewThrowable(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th);
        Throwable cause = th.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause);
            throwableWrapper2.setCause(throwableWrapper3);
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    private static boolean isAPPLoggable(int i) {
        if (extLogger == null || i < 3) {
            return false;
        }
        return true;
    }

    private static boolean isKitLoggable(int i) {
        if (!kitPrint || !isLoggable(i)) {
            return false;
        }
        return true;
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(TAG_NETWORKKIT_PRE, i);
    }

    private static int logPrintln(int i, String str, String str2) {
        if (isAPPLoggable(i)) {
            extLogPrintln(i, complexAppTag(str), complexMsg(str2, 7));
        }
        if (isKitLoggable(i)) {
            return Log.println(i, complexTag(str), complexMsg(str2, 7));
        }
        return 1;
    }

    public static void println(int i, String str, Object obj) {
        if (i >= 3) {
            logPrintln(i, str, obj == null ? "null" : obj.toString());
        }
    }

    public static void setExtLogger(ExtLogger extLogger2, boolean z) {
        extLogger = extLogger2;
        kitPrint = z;
        i(TAG, "logger = " + extLogger2 + z);
    }

    public static void v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    public static void w(String str, Object obj) {
        println(5, str, obj);
    }

    public static void d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static void println(int i, String str, String str2, Object... objArr) {
        if (i >= 3 && str2 != null) {
            try {
                logPrintln(i, str, StringUtils.format(str2, objArr));
            } catch (IllegalFormatException e) {
                w(TAG, "log format error".concat(str2), e);
            }
        }
    }

    public static void v(String str, Object obj) {
        println(2, str, obj);
    }

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    public static void e(String str, String str2, Throwable th) {
        if (isAPPLoggable(6)) {
            extLogger.e(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (kitPrint) {
            Log.e(complexTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (isAPPLoggable(5)) {
            extLogger.w(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (kitPrint) {
            complexTag(str);
            complexMsg(str2, 5);
            getNewThrowable(th);
        }
    }
}
