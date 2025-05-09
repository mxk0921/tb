package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.tracelog.HomeApmTraceUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782536);
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819e6fa0", new Object[]{str, str2, map});
        } else {
            f0b.j(str).d(str2, map);
        }
    }

    public static void b(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4b2b91", new Object[]{str, new Boolean(z), new Boolean(z2)});
        } else {
            mxl.l(str, z, z2);
        }
    }

    public static void c(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4918a9a5", new Object[]{str, str2, new Integer(i)});
        } else {
            f0b.j(str).p(str2, i);
        }
    }

    public static void d(String str, String str2, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab61340", new Object[]{str, str2, new Integer(i), map});
        } else {
            f0b.j(str).q(str2, i, map);
        }
    }

    public static void e(String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fca135", new Object[]{str, new Boolean(z), str2, str3});
        } else {
            HomeApmTraceUtils.a(str, z, str2, str3);
        }
    }

    public static void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d09b2e", new Object[]{str, str2, str3});
        } else {
            HomeApmTraceUtils.b(str, str2, str3);
        }
    }
}
