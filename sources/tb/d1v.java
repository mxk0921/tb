package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.monitor.UmiPublishMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(867172364);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b94e83", new Object[]{str});
        } else {
            b(str, "");
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f36fd8d", new Object[]{str, str2});
            return;
        }
        UmiPublishMonitor w = UmiPublishMonitor.w();
        if (!TextUtils.isEmpty(str2)) {
            str = str + "_" + str2;
        }
        w.g("stat_code", str, null);
    }
}
