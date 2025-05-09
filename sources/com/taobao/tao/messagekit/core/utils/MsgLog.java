package com.taobao.tao.messagekit.core.utils;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appfrmbundle.mkt.MKTHandler;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.ikl;
import tb.p2j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MsgLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f12542a;
    public static volatile boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/messagekit/core/utils/MsgLog$Level");
        }

        public static Level valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("427d76b9", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Level.class, str);
            }
            return (Level) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    static {
        t2o.a(628097172);
        b = false;
        try {
            IpChange ipChange = AdapterForTLog.$ipChange;
            b = true;
        } catch (ClassNotFoundException unused) {
            b = false;
        }
    }

    public static String a(Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a18de64", new Object[]{th, objArr});
        }
        return b(objArr) + '\n' + Log.getStackTraceString(th);
    }

    public static void c(String str, Throwable th, Object... objArr) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd6a011", new Object[]{str, th, objArr});
        } else if (j() && (aVar = f12542a) != null) {
            ((MKTHandler.b) aVar).a("PMMESSAGES_" + str, a(th, objArr));
        }
    }

    public static void e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else {
            h(str, null, objArr);
        }
    }

    public static void f(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11662452", new Object[]{str, th, objArr});
            return;
        }
        a aVar = f12542a;
        if (aVar != null) {
            ((MKTHandler.b) aVar).b("PMMESSAGES_" + str, a(th, objArr));
        }
    }

    public static void g(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else {
            f(str, null, objArr);
        }
    }

    public static void h(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa43556", new Object[]{str, th, objArr});
        } else if (f12542a != null && k(Level.I)) {
            a aVar = f12542a;
            ((MKTHandler.b) aVar).c("PMMESSAGES_" + str, a(th, objArr));
        }
    }

    public static void i(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1c6b7", new Object[]{str, objArr});
        } else {
            h(str, null, objArr);
        }
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean k(Level level) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ac2d2ac", new Object[]{level})).booleanValue();
        }
        if (p2j.g() || !b) {
            return true;
        }
        Level level2 = Level.L;
        try {
            level2 = Level.valueOf(AdapterForTLog.getLogLevel());
        } catch (Exception unused) {
        }
        if (level.ordinal() >= level2.ordinal()) {
            return true;
        }
        return false;
    }

    public static void l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02cb08a", new Object[]{aVar});
        } else {
            f12542a = aVar;
        }
    }

    public static String b(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e7dbb5", new Object[]{objArr});
        }
        StringBuilder sb = new StringBuilder();
        if (objArr != null) {
            for (Object obj : objArr) {
                sb.append("|");
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static void d(String str, ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613ce7b4", new Object[]{str, iklVar});
        } else {
            c(str, null, "msg:", Integer.valueOf(iklVar.b), "biz:", Integer.valueOf(iklVar.f21366a.bizCode()), "topic:", iklVar.f21366a.topic(), "mqtt:", Integer.valueOf(iklVar.f21366a.msgType()), "type:", Integer.valueOf(iklVar.f21366a.type()), "subType:", Integer.valueOf(iklVar.f21366a.subType()), "ack:", Boolean.valueOf(iklVar.f21366a.needACK()), "router:", iklVar.f21366a.routerId(), "usr", iklVar.f21366a.userId(), "qos", Byte.valueOf(iklVar.f21366a.qosLevel()), "tag", iklVar.e, "mid:", iklVar.f21366a.getID(), "dataid", iklVar.c, "source", Integer.valueOf(iklVar.d));
        }
    }
}
