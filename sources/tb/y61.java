package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class y61 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final y61 INSTANCE = new y61();

    static {
        t2o.a(1007681591);
    }

    public static final xhv d(Map map, String str, String str2, f71 f71Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7c589e31", new Object[]{map, str, str2, f71Var});
        }
        ckf.g(f71Var, "$this$alarmFail");
        f71Var.e(map);
        f71Var.f(str);
        f71Var.g(str2);
        return xhv.INSTANCE;
    }

    public static final xhv f(Map map, h71 h71Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("37223820", new Object[]{map, h71Var});
        }
        ckf.g(h71Var, "$this$alarmSuccess");
        h71Var.c(map);
        return xhv.INSTANCE;
    }

    public final void c(String str, String str2, final String str3, final String str4, final Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3df3387", new Object[]{this, str, str2, str3, str4, map});
            return;
        }
        ckf.g(str, "module");
        ckf.g(str2, "monitorPoint");
        x61.INSTANCE.e(str, str2, new g1a() { // from class: tb.u61
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv d;
                d = y61.d(map, str3, str4, (f71) obj);
                return d;
            }
        });
    }

    public final void e(String str, String str2, final Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f15758", new Object[]{this, str, str2, map});
            return;
        }
        ckf.g(str, "module");
        ckf.g(str2, "monitorPoint");
        x61.INSTANCE.h(str, str2, new g1a() { // from class: tb.s61
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv f;
                f = y61.f(map, (h71) obj);
                return f;
            }
        });
    }
}
