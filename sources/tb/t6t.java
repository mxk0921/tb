package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t6t {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355862);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{str});
        }
        return z3s.h(str);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("685f8107", new Object[]{str})).booleanValue();
        }
        return z3s.a(str);
    }

    public static int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        return z3s.c(str);
    }

    public static long d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7149c7f7", new Object[]{str})).longValue();
        }
        return z3s.e(str);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306d747d", new Object[]{str, str2});
        } else {
            z3s.m(str, str2);
        }
    }

    public static void f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ae223d", new Object[]{str, new Boolean(z)});
        } else {
            z3s.j(str, z);
        }
    }

    public static void g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131237c5", new Object[]{str, new Integer(i)});
        } else {
            z3s.k(str, i);
        }
    }

    public static void h(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c007ba95", new Object[]{str, new Long(j)});
        } else {
            z3s.l(str, j);
        }
    }
}
