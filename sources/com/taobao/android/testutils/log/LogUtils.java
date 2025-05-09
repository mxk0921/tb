package com.taobao.android.testutils.log;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.weex.common.WXConfig;
import tb.jvm;
import tb.qv6;
import tb.t2o;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LogUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BEHAVIR_FIND_SOLUTION = "find_solution";
    public static final String BEHAVIR_FIND_SOLUTION_ERROR = "find_solution_error";
    public static final String BEHAVIR_TASK_EXECUTE = "task_execute";
    public static final String BEHAVIR_TASK_GET_INPUT = "task_get_input";
    public static final String BR_BIZ_NAME = "behaviR";
    public static final String BX_BIZ_NAME = "behaviX";
    public static final String UCP = "UCP";
    public static final String UPP_RUNNABLE_SUB_STEP = "upp_runnable";

    /* renamed from: a  reason: collision with root package name */
    public static int f9638a = BHXLogLevel.LOG_LEVEL_WARNING.ordinal();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum BHXLogLevel {
        LOG_LEVEL_OFF,
        LOG_LEVEL_ERROR,
        LOG_LEVEL_WARNING,
        LOG_LEVEL_INFO,
        LOG_LEVEL_DEBUG,
        LOG_LEVEL_TRACE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(BHXLogLevel bHXLogLevel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/testutils/log/LogUtils$BHXLogLevel");
        }

        public static BHXLogLevel valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BHXLogLevel) ipChange.ipc$dispatch("8cdd07c1", new Object[]{str});
            }
            return (BHXLogLevel) Enum.valueOf(BHXLogLevel.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9639a;

        static {
            int[] iArr = new int[BHXLogLevel.values().length];
            f9639a = iArr;
            try {
                iArr[BHXLogLevel.LOG_LEVEL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9639a[BHXLogLevel.LOG_LEVEL_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9639a[BHXLogLevel.LOG_LEVEL_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9639a[BHXLogLevel.LOG_LEVEL_OFF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9639a[BHXLogLevel.LOG_LEVEL_DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9639a[BHXLogLevel.LOG_LEVEL_TRACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        t2o.a(404750700);
    }

    public static String a(BHXLogLevel bHXLogLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bf645b0", new Object[]{bHXLogLevel});
        }
        int i = a.f9639a[bHXLogLevel.ordinal()];
        if (i == 1) {
            return "E";
        }
        if (i == 2) {
            return "W";
        }
        if (i == 3) {
            return TLogTracker.LEVEL_INFO;
        }
        if (i == 5) {
            return TLogTracker.LEVEL_DEBUG;
        }
        if (i != 6) {
            return "";
        }
        return "T";
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        BHXLogLevel[] values = BHXLogLevel.values();
        if (i >= 0 && i < values.length) {
            f9638a = i;
        }
    }

    public static void d(BHXLogLevel bHXLogLevel, String str, Object[] objArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0a9237", new Object[]{bHXLogLevel, str, objArr});
        } else if (objArr != null && objArr.length != 0) {
            if (objArr.length > 1) {
                str2 = TextUtils.join(" ", objArr);
            } else {
                str2 = String.valueOf(objArr[0]);
            }
            c(bHXLogLevel, str + "_J", str2);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
            return;
        }
        BHXLogLevel bHXLogLevel = BHXLogLevel.LOG_LEVEL_DEBUG;
        d(bHXLogLevel, str + "." + str2, objArr);
    }

    public static void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
            return;
        }
        BHXLogLevel bHXLogLevel = BHXLogLevel.LOG_LEVEL_ERROR;
        d(bHXLogLevel, str + "." + str2, objArr);
    }

    public static void g(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
            return;
        }
        BHXLogLevel bHXLogLevel = BHXLogLevel.LOG_LEVEL_INFO;
        d(bHXLogLevel, str + "." + str2, objArr);
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f348fb07", new Object[0]);
        } else {
            b(v82.k(WXConfig.logLevel, BHXLogLevel.LOG_LEVEL_WARNING.ordinal()));
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
        } else {
            d(BHXLogLevel.LOG_LEVEL_WARNING, str2, objArr);
        }
    }

    private static void logForNative(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a015f694", new Object[]{new Integer(i), str, str2});
            return;
        }
        BHXLogLevel[] values = BHXLogLevel.values();
        if (i >= 0 && i < values.length) {
            c(values[i], str, str2);
        }
    }

    public static void c(BHXLogLevel bHXLogLevel, String str, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b18aa04", new Object[]{bHXLogLevel, str, str2});
            return;
        }
        if (bHXLogLevel.ordinal() > f9638a && !Debuggable.isDebug()) {
            z = false;
        }
        boolean b = jvm.b();
        if (z || b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis % 1000;
            long j2 = currentTimeMillis / 1000;
            long j3 = j2 % 60;
            long j4 = j2 / 60;
            String a2 = a(bHXLogLevel);
            String str3 = (((j4 / 60) + 8) % 24) + ":" + (j4 % 60) + ":" + j3 + "." + j + " " + a2 + "/" + str + " " + str2;
            if (Debuggable.isDebug()) {
                Log.e("BehaviX", str3);
            } else if (z) {
                TLog.loge("BehaviX", "BehaviX", str3);
            }
            if (bHXLogLevel == BHXLogLevel.LOG_LEVEL_ERROR) {
                UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", str, null, str, str3);
            }
            if (b && bHXLogLevel != BHXLogLevel.LOG_LEVEL_TRACE) {
                qv6.f(str, a2, "", str3);
            }
        }
    }
}
