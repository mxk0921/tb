package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.taobao.mrt.service.LogService;
import com.taobao.mrt.utils.RealtimeDebugLogService;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.tmall.android.dai.internal.util.LogUtil;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f22652a = "MRT";
    public static LogService.LogReceiver b = LogService.LogReceiver.None;
    public static RealtimeDebugLogService c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$mrt$service$LogService$LogLevel;

        static {
            int[] iArr = new int[LogService.LogLevel.values().length];
            $SwitchMap$com$taobao$mrt$service$LogService$LogLevel = iArr;
            try {
                iArr[LogService.LogLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$mrt$service$LogService$LogLevel[LogService.LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$mrt$service$LogService$LogLevel[LogService.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$mrt$service$LogService$LogLevel[LogService.LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(577765442);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            u(str, str2, false);
        }
    }

    @Deprecated
    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaf1d02", new Object[]{str, str2});
        } else {
            l(LogService.LogSource.JAVA, LogService.LogLevel.DEBUG, str, str2, null);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            d(str, str2, null);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            v(LogService.LogSource.JAVA, LogService.LogLevel.ERROR, str, str2, th, true);
        }
    }

    @Deprecated
    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f58c321", new Object[]{str, str2});
        } else {
            f(str, str2, null);
        }
    }

    @Deprecated
    public static void f(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30841f74", new Object[]{str, str2, th});
        } else {
            l(LogService.LogSource.JAVA, LogService.LogLevel.ERROR, str, str2, th);
        }
    }

    public static synchronized void g(String str) {
        synchronized (kgh.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74eccbb6", new Object[]{str});
                return;
            }
            if (c == null) {
                c = new RealtimeDebugLogService();
            }
            c.g(str);
            q(LogService.LogReceiver.All);
            p(true);
        }
    }

    public static String h(String str, String str2, String str3, String str4, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3739c9a", new Object[]{str, str2, str3, str4, th});
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
        sb.append(" ");
        sb.append(str3);
        sb.append(" ");
        if (TextUtils.equals(str2, "WARN")) {
            sb.append(" W");
        } else if (TextUtils.equals(str2, "ERROR")) {
            sb.append(" E");
        } else if (TextUtils.equals(str2, "INFO")) {
            sb.append(" I");
        } else {
            sb.append(" D");
        }
        sb.append("/EC_");
        if (TextUtils.equals(str, "java")) {
            sb.append("J");
        } else if (TextUtils.equals(str, "python")) {
            sb.append("P");
        } else {
            sb.append("C");
        }
        sb.append(" ");
        sb.append(str4);
        if (th != null) {
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
        }
        return sb.toString();
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca26b54b", new Object[]{str});
        }
        return f22652a + "." + str;
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            l(LogService.LogSource.JAVA, LogService.LogLevel.INFO, str, str2, null);
        }
    }

    @Deprecated
    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ff5b9d", new Object[]{str, str2});
        } else {
            l(LogService.LogSource.JAVA, LogService.LogLevel.INFO, str, str2, null);
        }
    }

    public static void l(LogService.LogSource logSource, LogService.LogLevel logLevel, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a365375b", new Object[]{logSource, logLevel, str, str2, th});
        } else {
            v(logSource, logLevel, str, str2, th, false);
        }
    }

    public static void m(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a23353", new Object[]{str, obj});
            return;
        }
        LogService.LogReceiver logReceiver = b;
        if (logReceiver != null && logReceiver != LogService.LogReceiver.None) {
            LogService.LogSource logSource = LogService.LogSource.PYTHON;
            LogService.LogLevel logLevel = LogService.LogLevel.DEBUG;
            String str2 = "";
            if (obj != null) {
                str2 = obj + str2;
            }
            l(logSource, logLevel, str, str2, null);
        }
    }

    public static void n(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a59ad5", new Object[]{str, str2, str3});
        } else if (str2.equals("C")) {
            l(LogService.LogSource.C, r(str), str2, str3, null);
        } else if (str2.equals("P")) {
            l(LogService.LogSource.PYTHON, r(str), str2, str3, null);
        }
    }

    public static void o(LogService.LogSource logSource, LogService.LogLevel logLevel, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a29c8f", new Object[]{logSource, logLevel, str, str2, th});
        } else if (MRT.j() && a.$SwitchMap$com$taobao$mrt$service$LogService$LogLevel[logLevel.ordinal()] == 4) {
            Log.e(str, str2, th);
        }
    }

    public static LogService.LogLevel r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogService.LogLevel) ipChange.ipc$dispatch("757a2cf8", new Object[]{str});
        }
        LogService.LogLevel logLevel = LogService.LogLevel.DEBUG;
        if (str.equals("DEBUG")) {
            return logLevel;
        }
        if (str.equals("INFO")) {
            return LogService.LogLevel.INFO;
        }
        if (str.equals("WARN")) {
            return LogService.LogLevel.WARNING;
        }
        if (str.equals("ERROR")) {
            return LogService.LogLevel.ERROR;
        }
        if (str.equals("CONFIG")) {
            return LogService.LogLevel.CONFIG;
        }
        return logLevel;
    }

    public static void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else {
            x(str, str2, null, false);
        }
    }

    public static void t(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
        } else {
            x(str, str2, th, true);
        }
    }

    public static void u(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ea7435", new Object[]{str, str2, new Boolean(z)});
        } else {
            v(LogService.LogSource.JAVA, LogService.LogLevel.DEBUG, str, str2, null, z);
        }
    }

    public static void v(LogService.LogSource logSource, LogService.LogLevel logLevel, String str, String str2, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94266d9", new Object[]{logSource, logLevel, str, str2, th, new Boolean(z)});
            return;
        }
        Log.e("LogUtil", "log: " + logSource.name + " " + logLevel.name + " " + str + " " + str2 + " " + th);
        if (b != LogService.LogReceiver.None || z) {
            String h = h(logSource.name, logLevel.name, str, str2, th);
            if (!logSource.name.equals("java") && !logSource.name.equals("python")) {
                logSource.name.equals("C");
            }
            if (b == LogService.LogReceiver.Console) {
                o(logSource, logLevel, i(str), h, th);
            } else if (b != LogService.LogReceiver.WorkStation && b == LogService.LogReceiver.All) {
                o(logSource, logLevel, i(str), h, th);
                RealtimeDebugLogService realtimeDebugLogService = c;
                if (realtimeDebugLogService != null) {
                    realtimeDebugLogService.d(logSource, logLevel, i(str), h, th);
                }
            }
            if (z) {
                logLevel = LogService.LogLevel.ERROR;
            }
            w(logSource, logLevel, i(str), h, th);
        }
    }

    public static void x(String str, String str2, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b042a391", new Object[]{str, str2, th, new Boolean(z)});
        } else {
            v(LogService.LogSource.JAVA, LogService.LogLevel.WARNING, str, str2, th, z);
        }
    }

    public static void p(boolean z) {
        try {
            IpChange ipChange = LogUtil.$ipChange;
            Method declaredMethod = LogUtil.class.getDeclaredMethod("setCLoggerEnable", Boolean.TYPE);
            if (declaredMethod != null) {
                declaredMethod.invoke(null, Boolean.valueOf(z));
            }
        } catch (Throwable unused) {
        }
    }

    public static void q(LogService.LogReceiver logReceiver) {
        b = logReceiver;
        try {
            IpChange ipChange = LogUtil.$ipChange;
            Method declaredMethod = LogUtil.class.getDeclaredMethod("setCLoggerReceiver", Integer.TYPE);
            if (declaredMethod != null) {
                declaredMethod.invoke(null, Integer.valueOf(logReceiver.value));
            }
        } catch (Throwable unused) {
        }
    }

    public static void w(LogService.LogSource logSource, LogService.LogLevel logLevel, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf951a6", new Object[]{logSource, logLevel, str, str2, th});
            return;
        }
        Log.e("LogUtillogToTlog", "log: " + logSource.name + " " + logLevel.name + " " + str + " " + str2 + " " + th);
        int i = a.$SwitchMap$com$taobao$mrt$service$LogService$LogLevel[logLevel.ordinal()];
        if (i == 1) {
            AdapterForTLog.logi(str, str2);
        } else if (i == 2) {
            AdapterForTLog.logd(str, str2);
        } else if (i == 3) {
            AdapterForTLog.logw(str, str2, th);
        } else if (i == 4) {
            AdapterForTLog.loge(str, str2, th);
        }
    }
}
