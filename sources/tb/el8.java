package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class el8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321627);
    }

    public static void a(bxj bxjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e8a84a", new Object[]{bxjVar, str});
            return;
        }
        rj8.a(bxjVar).a();
        rj8.e(bxjVar);
        if (bxjVar != null) {
            rj8.a(bxjVar.getNewDetailContext()).a();
            rj8.e(bxjVar.getNewDetailContext());
        }
        rj8.b(str).a();
        rj8.f(str);
    }

    public static void b(bxj bxjVar, String str, int i, rl8 rl8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8788bc", new Object[]{bxjVar, str, new Integer(i), rl8Var});
            return;
        }
        rj8.a(bxjVar).j(i, rl8Var);
        if (bxjVar != null) {
            rj8.a(bxjVar.getNewDetailContext()).j(i, rl8Var);
        }
        rj8.b(str).j(i, rl8Var);
    }

    public static void c(bxj bxjVar, String str, int i, rl8 rl8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d75f315", new Object[]{bxjVar, str, new Integer(i), rl8Var});
            return;
        }
        rj8.a(bxjVar).m(i, rl8Var);
        if (bxjVar != null) {
            rj8.a(bxjVar.getNewDetailContext()).m(i, rl8Var);
        }
        rj8.b(str).l(i);
    }
}
