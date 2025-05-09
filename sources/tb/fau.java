package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fau {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729808932);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd093ed", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(yyj.e().f());
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416ec843", new Object[]{str});
        } else if (a(str)) {
            AppMonitor.Counter.commit("Page_Home", "awesome_loadCacheFailed", str, 1.0d);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f93f5a", new Object[]{str});
        } else if (a(str)) {
            AppMonitor.Counter.commit("Page_Home", "awesome_loadPresetDataFailed", str, 1.0d);
        }
    }
}
