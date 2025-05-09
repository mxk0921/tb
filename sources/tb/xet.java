package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(vct<String, Void> vctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("800ad0a8", new Object[]{vctVar})).booleanValue();
        }
        return LauncherRuntime.b(vctVar);
    }

    public static boolean b(String str, lss lssVar) throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("769e7686", new Object[]{str, lssVar})).booleanValue();
        }
        return false;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5d73d45", new Object[]{str})).booleanValue();
        }
        vh4 vh4Var = LauncherRuntime.j;
        if (vh4Var == null) {
            return false;
        }
        vct<String, Void> a2 = vh4Var.b.a(str);
        if (a2 == null) {
            jdh.i("TaskManager", "task %s not found", str);
            return false;
        }
        a2.g(str);
        vct<String, Void> a3 = ((chg) vh4Var.f30013a).a(a2);
        if (!a3.d(null)) {
            jdh.i("TaskManager", "Execution Skipped for node # %s ", str);
            return false;
        }
        a3.b();
        return true;
    }
}
