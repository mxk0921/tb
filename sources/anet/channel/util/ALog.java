package anet.channel.util;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ALog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ILog log;
    public static Logcat logcat;
    private static Object LOG_BREAK = "|";
    private static boolean isPrintLog = true;
    private static boolean canUseTlog = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ILog {
        void d(String str, String str2);

        void e(String str, String str2);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2);

        boolean isPrintLog(int i);

        boolean isValid();

        void setLogLevel(int i);

        void w(String str, String str2);

        void w(String str, String str2, Throwable th);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Level {
        public static final int D = 1;
        public static final int E = 4;
        public static final int I = 2;
        public static final int N = 5;
        public static final int V = 0;
        public static final int W = 3;

        static {
            t2o.a(607125927);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Logcat implements ILog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int defaultLevel = 1;

        static {
            t2o.a(607125928);
            t2o.a(607125926);
        }

        @Override // anet.channel.util.ALog.ILog
        public void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            } else {
                Log.e(str, str2);
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void i(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // anet.channel.util.ALog.ILog
        public void setLogLevel(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("addbd37a", new Object[]{this, new Integer(i)});
            } else if (i < 0 || i > 5) {
                this.defaultLevel = 5;
            } else {
                this.defaultLevel = i;
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void w(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eefb3f92", new Object[]{this, str, str2});
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void e(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
            } else {
                Log.e(str, str2, th);
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void w(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isPrintLog(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f917b75f", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return i >= this.defaultLevel;
        }
    }

    private static String buildLogMsg(String str, String str2, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f9d5f55", new Object[]{str, str2, objArr});
        }
        if (str == null && str2 == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(LOG_BREAK);
            sb.append("[seq:");
            sb.append(str2);
            sb.append("]");
        }
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                Object obj = objArr[i];
                if (obj == null) {
                    obj = "";
                }
                sb.append(obj);
                sb.append(":");
                Object obj2 = objArr[i2];
                if (obj2 == null) {
                    obj2 = "";
                }
                sb.append(obj2);
                i += 2;
            }
            if (i < objArr.length) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    private static String buildLogTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774883eb", new Object[]{str});
        }
        return str;
    }

    public static void d(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85ce08", new Object[]{str, str2, str3, objArr});
        } else if (isPrintLog(1) && log != null) {
            log.d(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void e(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66871fa7", new Object[]{str, str2, str3, objArr});
        } else if (isPrintLog(4) && log != null) {
            log.e(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static ILog getLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILog) ipChange.ipc$dispatch("97ddf778", new Object[0]);
        }
        return log;
    }

    public static void i(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8c6623", new Object[]{str, str2, str3, objArr});
        } else if (isPrintLog(2) && log != null) {
            log.i(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void setLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e77c5a", new Object[]{new Integer(i)});
        } else if (log != null) {
            log.setLogLevel(i);
        }
    }

    public static void setLog(ILog iLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b3958a", new Object[]{iLog});
        } else if (iLog != null) {
            if ((canUseTlog || !iLog.getClass().getSimpleName().toLowerCase().contains("tlog")) && iLog.isValid()) {
                log = iLog;
            }
        }
    }

    public static void setPrintLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80ec2f4", new Object[]{new Boolean(z)});
        } else {
            isPrintLog = z;
        }
    }

    @Deprecated
    public static void setUseTlog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac80298", new Object[]{new Boolean(z)});
        }
    }

    public static void w(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289edcd5", new Object[]{str, str2, str3, objArr});
        } else if (isPrintLog(3) && log != null) {
            log.w(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static boolean isPrintLog(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f917b75f", new Object[]{new Integer(i)})).booleanValue();
        }
        if (isPrintLog && log != null) {
            return log.isPrintLog(i);
        }
        return false;
    }

    static {
        t2o.a(607125925);
        Logcat logcat2 = new Logcat();
        logcat = logcat2;
        log = logcat2;
    }

    public static void e(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb4d266", new Object[]{str, str2, str3, th, objArr});
        } else if (isPrintLog(4) && log != null) {
            log.e(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
        }
    }

    public static void w(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ccbdf8", new Object[]{str, str2, str3, th, objArr});
        } else if (isPrintLog(3) && log != null) {
            log.w(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
        }
    }
}
