package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mhg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f60ef54", new Object[0])).longValue();
        }
        return q1r.a(".dag_switch_idle_delay", 0L);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de4fa702", new Object[0])).booleanValue();
        }
        IpChange ipChange2 = LauncherRuntime.$ipChange;
        return q1r.c(".dag_report_switch_on");
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ecd1f9c", new Object[]{str})).booleanValue();
        }
        IpChange ipChange2 = LauncherRuntime.$ipChange;
        return q1r.c(".dag_switch_stage_off_" + str);
    }
}
