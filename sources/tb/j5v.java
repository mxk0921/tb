package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(964689932);
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("443f3af0", new Object[]{str, map});
        } else {
            nhh.e(str, map);
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else {
            nhh.f(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else {
            nhh.i(str, objArr);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return nhh.n();
    }

    public static void e(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257aae69", new Object[]{str, objArr});
        } else {
            nhh.v(str, objArr);
        }
    }
}
