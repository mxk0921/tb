package com.alipay.android.msp.utils;

import android.text.TextUtils;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEBUG = 1;
    public static final int ERROR = 8;
    public static final int INFO = 2;
    private static final int MAX_LOG_LENGTH = 512000;
    public static final int VERBOSE = 0;
    public static final int WARNING = 4;

    public static void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bc3689", new Object[]{str, str2, str3});
        } else {
            record(1, str, str2, str3);
        }
    }

    public static void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d572034a", new Object[]{str, str2, str3});
        } else {
            record(8, str, str2, str3);
        }
    }

    public static void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1849364e", new Object[]{str, str2, str3});
        } else {
            record(2, str, str2, str3);
        }
    }

    @Deprecated
    public static void printExceptionStackTrace(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fab54f", new Object[]{th});
        } else {
            PhoneCashierMspEngine.getMspUtils().onException("", th);
        }
    }

    @Deprecated
    public static synchronized void record(int i, String str, String str2) {
        synchronized (LogUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ba4193f", new Object[]{new Integer(i), str, str2});
            } else {
                record(i, "", str, str2);
            }
        }
    }

    public static String shortRpcLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fe93314", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str) && str.contains("RPC_PERF")) {
            str = str.substring(0, str.indexOf("RPC_PERF"));
        }
        if (!TextUtils.isEmpty(str) && str.contains("errorCode")) {
            str = str.substring(str.indexOf("errorCode"));
        }
        if (!TextUtils.isEmpty(str)) {
            return str.trim();
        }
        return str;
    }

    public static void v(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1849c1b", new Object[]{str, str2, str3});
        } else {
            record(0, str, str2, str3);
        }
    }

    public static void w(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a68dc", new Object[]{str, str2, str3});
        } else {
            record(4, str, str2, str3);
        }
    }

    private static void log(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81cd7ace", new Object[]{str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.length() > MAX_LOG_LENGTH) {
                str = str.substring(0, MAX_LOG_LENGTH);
            }
            if (str.toLowerCase().contains("cvv2") || str.toLowerCase().contains("validate")) {
                str = "*********";
            }
            try {
                PhoneCashierMspEngine.getMspUtils().printLog(str, i);
            } catch (Throwable unused) {
            }
        }
    }

    public static void printExceptionStackTrace(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77010fbb", new Object[]{str, str2, th});
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("[");
        sb.append(str);
        sb.append("][");
        sb.append(str2);
        sb.append("]");
        PhoneCashierMspEngine.getMspUtils().onException(sb.toString(), th);
    }

    public static void record(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de31149", new Object[]{new Integer(i), str, str2, str3});
        } else if (i != 0 || GlobalConstant.DEBUG) {
            StringBuilder sb = new StringBuilder(256);
            sb.append("[");
            sb.append(str);
            sb.append("][");
            sb.append(str2);
            sb.append("][");
            sb.append(str3);
            sb.append("]");
            log(sb.toString(), i);
        }
    }
}
