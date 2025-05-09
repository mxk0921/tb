package com.taobao.tao.log;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.utils.MainAnrOptThreadPool;
import tb.e6s;
import tb.j5s;
import tb.odh;
import tb.q4s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LogLevel f12492a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;

        public a(LogLevel logLevel, String str, String str2, String str3, long j) {
            this.f12492a = logLevel;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TLogNative.writeCodeLog(this.f12492a, this.b, this.c, this.d, true, this.e);
            }
        }
    }

    static {
        t2o.a(767557642);
    }

    private static String getExceptionMsg(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533fe44", new Object[]{str, th});
        }
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\r\n");
        Throwable th2 = th;
        do {
            sb.append(th2.getClass().getName());
            sb.append(": ");
            sb.append(th2.getMessage());
            sb.append("\r\n");
            StackTraceElement[] stackTrace = th.getStackTrace();
            StackTraceElement[] stackTrace2 = th.getStackTrace();
            int length = stackTrace2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace2[i];
                if (sb.length() >= 51200) {
                    sb.append(String.format("\t... total %d.\r\n", Integer.valueOf(stackTrace.length)));
                    break;
                }
                sb.append("\tat ");
                sb.append(stackTraceElement);
                sb.append("\r\n");
                i++;
            }
            th2 = th2.getCause();
            if (th2 != null) {
                sb.append("Caused by: ");
                continue;
            }
        } while (th2 != null);
        return sb.toString();
    }

    public static void logd(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939ab8c5", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.D, str, str2, str3);
        }
    }

    public static void loge(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4508586", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.E, str, str2, str3);
        }
    }

    public static void logi(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e727b88a", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.I, str, str2, str3);
        }
    }

    public static void logv(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0631e57", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.V, str, str2, str3);
        }
    }

    public static void logw(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d118eb18", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.W, str, str2, str3);
        }
    }

    @Deprecated
    public static void logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{str, str2});
        } else {
            logd("", str, str2);
        }
    }

    @Deprecated
    public static void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
        } else {
            loge("", str, str2);
        }
    }

    @Deprecated
    public static void logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{str, str2});
        } else {
            logi("", str, str2);
        }
    }

    @Deprecated
    public static void logv(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2eedcd", new Object[]{str, str2});
        } else {
            logv("", str, str2);
        }
    }

    @Deprecated
    public static void logw(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf18ce", new Object[]{str, str2});
        } else {
            logw("", str, str2);
        }
    }

    private static void log(LogLevel logLevel, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb58f69", new Object[]{logLevel, str, str2, str3});
        } else if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str2)) {
                    str = "module";
                } else if (str2.contains(".")) {
                    String substring = str2.substring(0, str2.indexOf("."));
                    str2 = str2.substring(str2.indexOf(".") + 1);
                    str = substring;
                } else {
                    str = str2;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "tag";
            }
            if (q4s.j()) {
                a aVar = new a(logLevel, str, str2, str3, System.currentTimeMillis());
                if (q4s.n()) {
                    MainAnrOptThreadPool.execute(aVar);
                } else {
                    e6s.d().f(aVar);
                }
            } else {
                TLogNative.writeCodeLog(logLevel, str, str2, str3, false, 0L);
            }
            if (j5s.j().u()) {
                odh.a(logLevel, str, str2, str3);
            }
        }
    }

    @Deprecated
    public static void logd(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e420454e", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                logd("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            logd("", str, sb.toString());
        }
    }

    @Deprecated
    public static void loge(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb857a6d", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                loge("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            loge("", str, sb.toString());
        }
    }

    @Deprecated
    public static void logi(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a4ee9", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                logi("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            logi("", str, sb.toString());
        }
    }

    @Deprecated
    public static void logv(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693e017c", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                logv("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            logv("", str, sb.toString());
        }
    }

    @Deprecated
    public static void logw(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a3369b", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                logw("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            logw("", str, sb.toString());
        }
    }

    @Deprecated
    public static void loge(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{str, str2, th});
        } else {
            loge("", str, str2, th);
        }
    }

    @Deprecated
    public static void logw(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192407e7", new Object[]{str, str2, th});
        } else {
            logw("", str, str2, th);
        }
    }

    public static void loge(String str, String str2, String str3, Throwable th) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261c3e2f", new Object[]{str, str2, str3, th});
            return;
        }
        if (th == null) {
            str4 = str3 + "******* NULL == e *******";
        } else {
            str4 = getExceptionMsg(str3, th);
        }
        log(LogLevel.E, str, str2, str4);
    }

    public static void logw(String str, String str2, String str3, Throwable th) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13967dd", new Object[]{str, str2, str3, th});
            return;
        }
        if (th == null) {
            str4 = str3 + "******* NULL == e *******";
        } else {
            str4 = getExceptionMsg(str3, th);
        }
        log(LogLevel.W, str, str2, str4);
    }
}
