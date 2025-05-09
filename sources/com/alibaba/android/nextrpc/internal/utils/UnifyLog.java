package com.alibaba.android.nextrpc.internal.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import java.util.Map;
import tb.icn;
import tb.lcn;
import tb.w2k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UnifyLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f2223a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Level {
        V,
        D,
        I,
        W,
        E,
        L;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Level level, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/nextrpc/internal/utils/UnifyLog$Level");
        }

        public static Level valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Level) ipChange.ipc$dispatch("98be8717", new Object[]{str});
            }
            return (Level) Enum.valueOf(Level.class, str);
        }
    }

    static {
        try {
            IpChange ipChange = AdapterForTLog.$ipChange;
            f2223a = true;
        } catch (ClassNotFoundException unused) {
            f2223a = false;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774883eb", new Object[]{str});
        }
        return "NextRpc." + str;
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (!g(Level.D)) {
            i(str, str2);
        } else if (f2223a) {
            AdapterForTLog.logd(b(str), a(str2, objArr));
        } else {
            b(str);
            a(str2, objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else if (!g(Level.E)) {
            i(str, str2);
        } else if (f2223a) {
            AdapterForTLog.loge(b(str), a(str2, objArr));
        } else {
            Log.e(b(str), a(str2, objArr));
        }
    }

    public static String e(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4425a33f", new Object[]{obj, obj2});
        }
        StringBuilder sb = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb.append(obj2);
        return sb.toString();
    }

    public static void f(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
        } else if (!g(Level.I)) {
            i(str, str2);
        } else if (f2223a) {
            AdapterForTLog.logi(b(str), a(str2, objArr));
        } else {
            b(str);
            a(str2, objArr);
        }
    }

    public static boolean g(Level level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f4b418a", new Object[]{level})).booleanValue();
        }
        return !w2k.a();
    }

    public static void h(String str, String str2, long j, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0137a0", new Object[]{str, str2, new Long(j), map});
            return;
        }
        try {
            RVLLevel rVLLevel = RVLLevel.Error;
            icn l = lcn.a(rVLLevel, "NextRpc/" + str).l(rVLLevel);
            if (j <= 0) {
                l.n(System.currentTimeMillis());
            } else {
                l.n(j);
            }
            l.a("message", str2);
            l.b(map);
            l.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33cc548a", new Object[]{str, str2});
        } else if (w2k.a()) {
            h(str, str2, -1L, new HashMap());
        }
    }

    public static void j(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
        } else if (!g(Level.W)) {
            i(str, str2);
        } else if (f2223a) {
            AdapterForTLog.logw(b(str), a(str2, objArr));
        } else {
            b(str);
            a(str2, objArr);
        }
    }

    public static String a(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe17598b", new Object[]{str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
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
                sb.append(e(objArr[i], objArr[i2]));
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }
}
