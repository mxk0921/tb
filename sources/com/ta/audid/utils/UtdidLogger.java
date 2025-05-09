package com.ta.audid.utils;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UtdidLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG_LOG_PREFIX = "Utdid.";
    private static boolean isDebug = false;
    private static boolean isSDebug = false;

    static {
        t2o.a(966787098);
    }

    private static String buildLogMsg(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe17598b", new Object[]{str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb.append("[" + str + "] ");
        if (objArr != null) {
            int length = objArr.length;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(formatKv(objArr[i], objArr[i2]));
                if (i2 < length - 1) {
                    sb.append(",");
                }
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    private static String buildLogTag() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c2bdbb5", new Object[0]);
        }
        StackTraceElement stackTrace = getStackTrace();
        if (stackTrace != null) {
            String className = stackTrace.getClassName();
            if (!TextUtils.isEmpty(className)) {
                str = className.substring(className.lastIndexOf(46) + 1);
            } else {
                str = "";
            }
            str2 = stackTrace.getMethodName();
        } else {
            str2 = "";
            str = str2;
        }
        return TAG_LOG_PREFIX + str + "." + str2 + "." + String.valueOf(Process.myPid()) + "." + (Thread.currentThread().getId() + "") + "." + (Thread.currentThread().getName() + "");
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (isDebug) {
            buildLogTag();
            buildLogMsg((String) null, new Object[0]);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (isDebug) {
            Log.e(buildLogTag(), buildLogMsg((String) null, new Object[0]));
        }
    }

    private static String formatKv(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4425a33f", new Object[]{obj, obj2});
        }
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }

    private static StackTraceElement getStackTrace() {
        StackTraceElement[] stackTrace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement) ipChange.ipc$dispatch("62bf0b00", new Object[0]);
        }
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(UtdidLogger.class.getName())) {
                    return stackTraceElement;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
        } else if (isDebug) {
            buildLogTag();
            buildLogMsg((String) null, new Object[0]);
        }
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return isDebug;
    }

    public static void sd(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955c7dcf", new Object[]{str, objArr});
        } else if (isSDebug) {
            buildLogTag();
            buildLogMsg(str, objArr);
        }
    }

    public static void se(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc1b2ee", new Object[]{str, objArr});
        } else if (isSDebug) {
            Log.e(buildLogTag(), buildLogMsg(str, objArr));
        }
    }

    public static void setDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{new Boolean(z)});
            return;
        }
        new StringBuilder("setDebug:").append(z);
        isDebug = z;
    }

    public static void w(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257aae69", new Object[]{str, objArr});
        } else if (isDebug) {
            buildLogTag();
            buildLogMsg(str, objArr);
        }
    }

    public static void d(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443f3af0", new Object[]{str, map});
        } else if (isDebug) {
            buildLogTag();
            buildLogMsg(str, map);
        }
    }

    public static void e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else if (isDebug) {
            Log.e(buildLogTag(), buildLogMsg(str, objArr));
        }
    }

    public static void i(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1c6b7", new Object[]{str, objArr});
        } else if (isDebug) {
            buildLogTag();
            buildLogMsg(str, objArr);
        }
    }

    public static void se(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fae17f", new Object[]{str, th, objArr});
        } else if (isSDebug) {
            Log.e(buildLogTag(), buildLogMsg(str, objArr), th);
        }
    }

    public static void w(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317d70e4", new Object[]{str, th, objArr});
        } else if (isDebug) {
            buildLogTag();
            buildLogMsg(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else if (isDebug) {
            buildLogTag();
            buildLogMsg(str, objArr);
        }
    }

    public static void e(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11662452", new Object[]{str, th, objArr});
        } else if (isDebug) {
            Log.e(buildLogTag(), buildLogMsg(str, objArr), th);
        }
    }

    private static String buildLogMsg(String str, Map<String, String> map) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ce719b7", new Object[]{str, map});
        }
        if (str == null && map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb.append("[" + str + "] ");
        int size = map.size();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey() + " : " + entry.getValue());
            i++;
            if (i < size) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
