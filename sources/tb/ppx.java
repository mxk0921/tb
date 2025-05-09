package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OConstant;
import com.taobao.zcache.Environment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ppx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final jpx f26232a = new jpx();

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7765f44c", new Object[0]);
            return;
        }
        yox.u().a(f26232a);
        dpx.f();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[0]);
        } else {
            c(false);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8e3ed2", new Object[0]);
        } else {
            yox.y();
        }
    }

    public static void c(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf98ad0", new Object[]{new Boolean(z)});
            return;
        }
        yox.u().a(f26232a);
        int intValue = ((Integer) hhg.a(OConstant.LAUNCH_ENVINDEX, 0)).intValue();
        if (intValue == 1) {
            yox.w(Environment.Debug);
            str = (String) hhg.a(OConstant.LAUNCH_PREAPPKEY, "");
        } else if (intValue != 2) {
            yox.w(Environment.Release);
            str = (String) hhg.a(OConstant.LAUNCH_ONLINEAPPKEY, "");
        } else {
            yox.w(Environment.Daily);
            str = (String) hhg.a(OConstant.LAUNCH_TESTAPPKEY, "");
        }
        yox.x(LauncherRuntime.g, str, (String) hhg.a("appVersion", ""), z ? 1 : 0);
    }
}
