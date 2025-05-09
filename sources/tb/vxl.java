package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30316a;
    public static final i5b b = new i5b();

    static {
        t2o.a(729809157);
        d(Globals.getApplication());
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4759271f", new Object[0])).booleanValue();
        }
        if (!b.I() || !f4b.b("enableForeignPerformanceOpt", true)) {
            return false;
        }
        return true;
    }

    public static i5b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i5b) ipChange.ipc$dispatch("cf8431ab", new Object[0]);
        }
        return b;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bf22047", new Object[0])).intValue();
        }
        if (i()) {
            return 6;
        }
        return 3;
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9eeb3d", new Object[]{context});
            return;
        }
        f30316a = ABGlobal.isFeatureOpened(context, "welBreak");
        q1r.c(".dag_systrace_x_open");
        if (q1r.c(".dag_report_switch_on")) {
            q1r.c(".report_custom_dag_point");
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64eea3ab", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93703b15", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("430b09b2", new Object[0])).booleanValue();
        }
        String k = yyj.e().k();
        if (!f4b.b("enableNotCheckLaunchType", true)) {
            return j();
        }
        if (!kbq.h(Globals.getApplication()) || !TextUtils.equals(k, yyj.e().k())) {
            return false;
        }
        return true;
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c62d32c", new Object[]{context})).booleanValue();
        }
        return nx9.q(context);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        return m0b.d().equals("l");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6159c502", new Object[0])).booleanValue();
        }
        return g0b.a(yyj.e().k());
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46995284", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5b2c51b", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13d81c2", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, "coldStart");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b1f7d2a", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8a5872f", new Object[0])).booleanValue();
        }
        return i();
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39a87696", new Object[0])).booleanValue();
        }
        return f30316a;
    }
}
