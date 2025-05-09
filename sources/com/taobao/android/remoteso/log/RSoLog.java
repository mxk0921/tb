package com.taobao.android.remoteso.log;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.j27;
import tb.jgd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class RSoLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RemoteSo";

    /* renamed from: a  reason: collision with root package name */
    public static final j27 f9261a;
    public static volatile jgd b;
    public static LogLevel c = LogLevel.DEBUG;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum LogLevel {
        DEBUG,
        INFO,
        WARN,
        ERROR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LogLevel logLevel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remoteso/log/RSoLog$LogLevel");
        }

        public static LogLevel valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogLevel) ipChange.ipc$dispatch("c4e0ca61", new Object[]{str});
            }
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        public boolean shouldLog(LogLevel logLevel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e1ff2e4", new Object[]{this, logLevel})).booleanValue();
            }
            if (compareTo(logLevel) <= 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f9262a;

        public a(String str) {
            this.f9262a = str;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
                return;
            }
            RSoLog.d(this.f9262a + "-> " + str);
        }
    }

    static {
        j27 j27Var = new j27("RemoteSo.default");
        f9261a = j27Var;
        b = j27Var;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966c00a4", new Object[]{str});
            return;
        }
        try {
            if (c.shouldLog(LogLevel.DEBUG)) {
                b.debug(str);
            }
        } catch (Throwable th) {
            f9261a.error("sLog.debug(msg);", th);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{str});
            return;
        }
        try {
            b.error(str);
        } catch (Throwable th) {
            f9261a.error("sLog.error(msg);", th);
        }
    }

    public static void c(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b012e6fc", new Object[]{str, th});
            return;
        }
        try {
            b.error(str, th);
        } catch (Throwable th2) {
            f9261a.error("sLog.error(msg, throwable);", th2);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dfc8bf", new Object[]{str});
            return;
        }
        try {
            if (c.shouldLog(LogLevel.INFO)) {
                b.info(str);
            }
        } catch (Throwable th) {
            f9261a.error("sLog.info(msg);", th);
        }
    }

    public static a e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5f35683", new Object[]{str});
        }
        return new a(str);
    }

    public static void f(LogLevel logLevel, jgd jgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfb51f8", new Object[]{logLevel, jgdVar});
            return;
        }
        b = jgdVar;
        c = logLevel;
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32f8497", new Object[]{str});
            return;
        }
        try {
            if (c.shouldLog(LogLevel.WARN)) {
                b.d(str);
            }
        } catch (Throwable th) {
            f9261a.error("sLog.warn(msg);", th);
        }
    }

    public static void h(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c403be", new Object[]{str, th});
            return;
        }
        try {
            if (c.shouldLog(LogLevel.WARN)) {
                b.warn(str, th);
            }
        } catch (Throwable th2) {
            f9261a.error("sLog.warn(msg, throwable);", th2);
        }
    }
}
