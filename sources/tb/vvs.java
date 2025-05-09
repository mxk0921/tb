package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vvs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356501);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4276057f", new Object[]{str, str2})).booleanValue();
        }
        return b(str, str2, false);
    }

    public static boolean b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4b5cbd", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        return zqq.d(i(str, str2, String.valueOf(z)), z);
    }

    public static float c(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b5130f", new Object[]{str, str2, new Float(f)})).floatValue();
        }
        return zqq.f(i(str, str2, "" + f), f);
    }

    public static int d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9e69dc7", new Object[]{str, str2})).intValue();
        }
        return e(str, str2, 0);
    }

    public static int e(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72ed8fa2", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        return zqq.g(i(str, str2, "" + i), i);
    }

    public static long f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("192c1701", new Object[]{str, str2})).longValue();
        }
        return g(str, str2, 0L);
    }

    public static long g(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c57414b", new Object[]{str, str2, new Long(j)})).longValue();
        }
        return zqq.i(i(str, str2, "" + j), j);
    }

    public static String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        return i(str, str2, "");
    }

    public static String i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a22a2b4", new Object[]{str, str2, str3});
        }
        if (v2s.o().p() == null) {
            return str3;
        }
        return v2s.o().p().b(str, str2, str3);
    }
}
