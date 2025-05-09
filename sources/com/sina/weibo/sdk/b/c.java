package com.sina.weibo.sdk.b;

import android.util.Log;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class c {
    private static boolean ai = false;

    static {
        t2o.a(988807213);
    }

    public static void a(String str, String str2) {
        if (ai) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            StringBuilder sb = new StringBuilder();
            sb.append(stackTraceElement.getFileName() + f7l.BRACKET_START_STR + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName());
            sb.append(": ");
            sb.append(str2);
        }
    }

    public static void b(String str, String str2) {
        if (ai) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.e(str, (stackTraceElement.getFileName() + f7l.BRACKET_START_STR + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ": " + str2);
        }
    }

    public static void setLoggerEnable(boolean z) {
        ai = z;
    }
}
