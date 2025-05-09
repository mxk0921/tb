package com.taobao.taobao.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.hav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CashDeskLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LogEnable f12961a = LogEnable.DebugEnable;
    public static final Map<String, LogEnable> b = new HashMap(5);
    public static volatile LogAdapter c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface LogAdapter {
        public static final int D = 2;
        public static final int E = 16;
        public static final int I = 4;
        public static final int N = 32;
        public static final int V = 1;
        public static final int W = 8;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public @interface Definition {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum LogEnable {
        VerboseEnable("V"),
        DebugEnable(TLogTracker.LEVEL_DEBUG),
        InfoEnable(TLogTracker.LEVEL_INFO),
        WarnEnable("W"),
        ErrorEnable("E"),
        NoneEnable("L");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String logEnable;

        LogEnable(String str) {
            this.logEnable = str;
        }

        public static /* synthetic */ Object ipc$super(LogEnable logEnable, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/utils/CashDeskLog$LogEnable");
        }

        public static LogEnable valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogEnable) ipChange.ipc$dispatch("9b371f1b", new Object[]{str});
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

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface TagLevel {
        public static final String COMMON = "tbPay#common";
        public static final String CORE = "tbPay#core";
        public static final String MONITOR = "tbPay#monitor";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements LogAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b10888a3", new Object[]{this});
            }
            return AdapterForTLog.getLogLevel();
        }

        public final void b(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acc02eb9", new Object[]{this, str, str2, th});
            } else if (th == null) {
                AdapterForTLog.loge(str, str2);
            } else {
                AdapterForTLog.loge(str, str2, th);
            }
        }

        public void c(int i, String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f68329c", new Object[]{this, new Integer(i), str, str2, th});
            } else if (i == 1) {
                AdapterForTLog.logv(str, str2);
            } else if (i == 2) {
                AdapterForTLog.logd(str, str2);
            } else if (i == 4) {
                AdapterForTLog.logi(str, str2);
            } else if (i == 8) {
                AdapterForTLog.logw(str, str2, th);
            } else if (i == 16) {
                b(str, str2, th);
            }
        }
    }

    static {
        LogEnable[] values;
        for (LogEnable logEnable : LogEnable.values()) {
            ((HashMap) b).put(logEnable.getLogEnable(), logEnable);
        }
        f(new a());
    }

    public static String a(String str, String... strArr) {
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

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            c(str, null, str2);
        }
    }

    public static void c(String str, String str2, String str3) {
        LogAdapter logAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d572034a", new Object[]{str, str2, str3});
        } else if (d(LogEnable.ErrorEnable) && (logAdapter = c) != null) {
            ((a) logAdapter).c(16, str, a(str2, str3), null);
        }
    }

    public static boolean d(LogEnable logEnable) {
        LogEnable logEnable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0778ad2", new Object[]{logEnable})).booleanValue();
        }
        LogAdapter logAdapter = c;
        if (!(logAdapter == null || (logEnable2 = (LogEnable) ((HashMap) b).get(((a) logAdapter).a())) == null || f12961a.ordinal() == logEnable2.ordinal())) {
            g(logEnable2);
        }
        if (logEnable.ordinal() >= f12961a.ordinal()) {
            return true;
        }
        return false;
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{str, str2});
        } else {
            hav.d(str, str2);
        }
    }

    public static void f(LogAdapter logAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da730360", new Object[]{logAdapter});
            return;
        }
        if (logAdapter != null) {
            try {
                c = logAdapter;
            } catch (Throwable unused) {
                Log.e("CashDeskLog", "setLogAdapter error");
            }
        }
        if (c == null) {
            Log.e("CashDeskLog", "Invalid log adapter is provided");
        }
        new StringBuilder("[setLogAdapter] logAdapter=").append(logAdapter);
    }

    public static void g(LogEnable logEnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736bd606", new Object[]{logEnable});
        } else if (logEnable != null) {
            f12961a = logEnable;
            new StringBuilder("[setLogEnable] logEnable=").append(logEnable);
        }
    }
}
