package mtopsdk.common.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.log.LogAdapter;
import tb.n4s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBSdkLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.TBSdkLog";
    private static boolean printLog = true;
    private static boolean tLogEnabled = true;
    private static LogEnable logEnable = LogEnable.DebugEnable;
    private static Map<String, LogEnable> logEnabaleMap = new HashMap(5);
    private static volatile LogAdapter mLogAdapter = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum LogEnable {
        VerboseEnable("V"),
        DebugEnable(TLogTracker.LEVEL_DEBUG),
        InfoEnable(TLogTracker.LEVEL_INFO),
        WarnEnable("W"),
        ErrorEnable("E"),
        NoneEnable("L");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String logEnable;

        LogEnable(String str) {
            this.logEnable = str;
        }

        public static /* synthetic */ Object ipc$super(LogEnable logEnable, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/common/util/TBSdkLog$LogEnable");
        }

        public static LogEnable valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogEnable) ipChange.ipc$dispatch("10b9d1ab", new Object[]{str});
            }
            return (LogEnable) Enum.valueOf(LogEnable.class, str);
        }

        public String getLogEnable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bb6d2468", new Object[]{this});
            }
            return this.logEnable;
        }
    }

    static {
        LogEnable[] values;
        t2o.a(589299802);
        for (LogEnable logEnable2 : LogEnable.values()) {
            logEnabaleMap.put(logEnable2.getLogEnable(), logEnable2);
        }
    }

    private static String append(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387920c", new Object[]{str, strArr});
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("[seq:");
            sb.append(str);
            sb.append("]|");
        }
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i < strArr.length - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            d(str, (String) null, str2);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            e(str, (String) null, str2);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            i(str, (String) null, str2);
        }
    }

    public static boolean isLogEnable(LogEnable logEnable2) {
        LogAdapter logAdapter;
        LogEnable logEnable3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93ab5d6", new Object[]{logEnable2})).booleanValue();
        }
        if (!(!tLogEnabled || (logAdapter = mLogAdapter) == null || (logEnable3 = logEnabaleMap.get(((n4s) logAdapter).a())) == null || logEnable.ordinal() == logEnable3.ordinal())) {
            setLogEnable(logEnable3);
        }
        if (logEnable2.ordinal() >= logEnable.ordinal()) {
            return true;
        }
        return false;
    }

    public static boolean isPrintLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef42d0ac", new Object[0])).booleanValue();
        }
        return printLog;
    }

    public static void logTraceId(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2ff377", new Object[]{str, str2});
            return;
        }
        try {
            if (mLogAdapter != null) {
                ((n4s) mLogAdapter).d(str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setLogAdapter(LogAdapter logAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212cabf0", new Object[]{logAdapter});
            return;
        }
        if (logAdapter != null) {
            try {
                mLogAdapter = logAdapter;
            } catch (Throwable unused) {
                Log.e(TAG, "setLogAdapter error");
            }
        }
        if (mLogAdapter == null) {
            Log.e(TAG, "Invalid log adapter is provided");
        }
        new StringBuilder("[setLogAdapter] logAdapter=").append(logAdapter);
    }

    public static void setLogEnable(LogEnable logEnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c199a", new Object[]{logEnable2});
        } else if (logEnable2 != null) {
            logEnable = logEnable2;
            new StringBuilder("[setLogEnable] logEnable=").append(logEnable2);
        }
    }

    public static void setPrintLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80ec2f4", new Object[]{new Boolean(z)});
            return;
        }
        printLog = z;
        new StringBuilder("[setPrintLog] printLog=").append(z);
    }

    public static void setTLogEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d334835e", new Object[]{new Boolean(z)});
            return;
        }
        tLogEnabled = z;
        new StringBuilder("[setTLogEnabled] tLogEnabled=").append(z);
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else {
            w(str, (String) null, str2);
        }
    }

    public static void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bc3689", new Object[]{str, str2, str3});
        } else if (!isLogEnable(LogEnable.DebugEnable)) {
        } else {
            if (tLogEnabled) {
                LogAdapter logAdapter = mLogAdapter;
                if (logAdapter != null) {
                    ((n4s) logAdapter).c(2, str, append(str2, str3), null);
                }
            } else if (printLog) {
                append(str2, str3);
            }
        }
    }

    public static void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d572034a", new Object[]{str, str2, str3});
        } else if (!isLogEnable(LogEnable.ErrorEnable)) {
        } else {
            if (tLogEnabled) {
                LogAdapter logAdapter = mLogAdapter;
                if (logAdapter != null) {
                    ((n4s) logAdapter).c(16, str, append(str2, str3), null);
                }
            } else if (printLog) {
                Log.e(str, append(str2, str3));
            }
        }
    }

    public static void i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1849364e", new Object[]{str, str2, str3});
        } else if (!isLogEnable(LogEnable.InfoEnable)) {
        } else {
            if (tLogEnabled) {
                LogAdapter logAdapter = mLogAdapter;
                if (logAdapter != null) {
                    ((n4s) logAdapter).c(4, str, append(str2, str3), null);
                }
            } else if (printLog) {
                append(str2, str3);
            }
        }
    }

    public static void w(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a68dc", new Object[]{str, str2, str3});
        } else if (!isLogEnable(LogEnable.WarnEnable)) {
        } else {
            if (tLogEnabled) {
                LogAdapter logAdapter = mLogAdapter;
                if (logAdapter != null) {
                    ((n4s) logAdapter).c(8, str, append(str2, str3), null);
                }
            } else if (printLog) {
                append(str2, str3);
            }
        }
    }

    public static void d(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5559d040", new Object[]{str, str2, strArr});
        } else if (!isLogEnable(LogEnable.DebugEnable)) {
        } else {
            if (tLogEnabled) {
                LogAdapter logAdapter = mLogAdapter;
                if (logAdapter != null) {
                    ((n4s) logAdapter).c(2, str, append(str2, strArr), null);
                }
            } else if (printLog) {
                append(str2, strArr);
            }
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            e(str, null, str2, th);
        }
    }

    public static void i(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736cc91b", new Object[]{str, str2, strArr});
        } else if (!isLogEnable(LogEnable.InfoEnable)) {
        } else {
            if (tLogEnabled) {
                LogAdapter logAdapter = mLogAdapter;
                if (logAdapter != null) {
                    ((n4s) logAdapter).c(4, str, append(str2, strArr), null);
                }
            } else if (printLog) {
                append(str2, strArr);
            }
        }
    }

    public static void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
        } else {
            w(str, null, str2, th);
        }
    }

    public static void e(String str, String str2, String str3, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1dc2eb", new Object[]{str, str2, str3, th});
        } else if (!isLogEnable(LogEnable.ErrorEnable)) {
        } else {
            if (tLogEnabled) {
                LogAdapter logAdapter = mLogAdapter;
                if (logAdapter != null) {
                    ((n4s) logAdapter).c(16, str, append(str2, str3), th);
                }
            } else if (printLog) {
                Log.e(str, append(str2, str3), th);
            }
        }
    }

    public static void w(String str, String str2, String str3, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893aec99", new Object[]{str, str2, str3, th});
        } else if (!isLogEnable(LogEnable.WarnEnable)) {
        } else {
            if (tLogEnabled) {
                LogAdapter logAdapter = mLogAdapter;
                if (logAdapter != null) {
                    ((n4s) logAdapter).c(8, str, append(str2, str3), th);
                }
            } else if (printLog) {
                append(str2, str3);
            }
        }
    }
}
