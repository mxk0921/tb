package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ygj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, a> f32078a = new HashMap<>();
    public static final HashMap<String, ue7> b = new HashMap<>();
    public static final HashMap<String, ue7> c = new HashMap<>();
    public static final HashMap<String, otm> d = new HashMap<>();

    static {
        t2o.a(352321777);
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b2db6115", new Object[]{str});
        }
        return f32078a.remove(str);
    }

    public static ue7 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ue7) ipChange.ipc$dispatch("282a55ff", new Object[]{str});
        }
        return c.remove(str);
    }

    public static ue7 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ue7) ipChange.ipc$dispatch("acd0d70", new Object[]{str});
        }
        return b.remove(str);
    }

    public static otm d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (otm) ipChange.ipc$dispatch("565c55ae", new Object[]{str});
        }
        return d.remove(str);
    }

    public static void e(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a2ada8", new Object[]{str, aVar});
        } else {
            f32078a.put(str, aVar);
        }
    }

    public static void f(String str, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c49d370", new Object[]{str, ue7Var});
        } else {
            c.put(str, ue7Var);
        }
    }

    public static void g(String str, ue7 ue7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fc521", new Object[]{str, ue7Var});
        } else {
            b.put(str, ue7Var);
        }
    }

    public static void h(String str, otm otmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1de649", new Object[]{str, otmVar});
        } else {
            d.put(str, otmVar);
        }
    }
}
