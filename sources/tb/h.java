package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933214);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bc11aca", new Object[]{str})).booleanValue();
        }
        return c0.e(str);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea9aab8e", new Object[0])).booleanValue();
        }
        return a("anr_normal_change");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3da2e522", new Object[0])).booleanValue();
        }
        return e();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e4cf4f2", new Object[0])).booleanValue();
        }
        return a("delay_call_main");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cc7c961", new Object[0])).booleanValue();
        }
        return a("main_binder");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd0260f1", new Object[0])).booleanValue();
        }
        return e();
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81791b35", new Object[0])).booleanValue();
        }
        if (a("accs_none_service")) {
            return true;
        }
        if (cp.j() || !m8l.n()) {
            return false;
        }
        return true;
    }
}
