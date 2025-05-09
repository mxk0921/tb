package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mv3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(664797281);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5ebbdb", new Object[]{str, str2});
        } else {
            TLog.logd(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afee6dc", new Object[]{str, str2});
        } else {
            TLog.loge(str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7f92e0", new Object[]{str, str2});
        } else {
            TLog.logi(str, str2);
        }
    }
}
