package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b565037", new Object[]{str})).booleanValue();
        }
        IpChange ipChange2 = LauncherRuntime.$ipChange;
        return q1r.c(".dag_switch_task_off_" + str);
    }
}
