package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f24849a = new ArrayList();
    public static final List<String> b = new ArrayList();
    public static final List<String> c = new ArrayList();
    public static final List<String> d = new ArrayList();
    public static final List<String> e = new ArrayList();
    public static final Map<String, Boolean> f = new HashMap();
    public static final List<String> g = new ArrayList();

    static {
        new ArrayList();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eccf3ef", new Object[]{str});
        } else {
            ((ArrayList) g).add(str);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19457e5e", new Object[]{str});
        } else {
            ((ArrayList) f24849a).add(str);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95380b89", new Object[]{str});
        } else {
            ((ArrayList) c).add(str);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108b0419", new Object[]{str});
        } else {
            ((ArrayList) d).add(str);
        }
    }

    public static void e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81501113", new Object[]{str, new Boolean(z)});
        } else {
            ((HashMap) f).put(str, Boolean.valueOf(z));
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92aacaa5", new Object[]{str});
        } else {
            ((ArrayList) e).add(str);
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be257a08", new Object[]{str});
        } else {
            ((ArrayList) b).add(str);
        }
    }

    public static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0fa377", new Object[]{str})).booleanValue();
        }
        return ((ArrayList) g).contains(str);
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa6d222d", new Object[]{str})).booleanValue();
        }
        return ((ArrayList) f24849a).contains(str);
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aa8cc11", new Object[]{str})).booleanValue();
        }
        return ((ArrayList) c).contains(str);
    }

    public static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("347688a1", new Object[]{str})).booleanValue();
        }
        return ((ArrayList) d).contains(str);
    }

    public static boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f4d1dd7", new Object[]{str})).booleanValue();
        }
        return ((ArrayList) b).contains(str);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdc49d7b", new Object[0])).booleanValue();
        }
        return ((ArrayList) b).isEmpty();
    }

    public static void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a54c21b", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            ((ArrayList) f24849a).remove(str);
        }
    }
}
