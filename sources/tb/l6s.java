package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l6s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093664);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b0ad8ce", new Object[]{str, obj});
        } else {
            TLog.loge("HomePageTab", str, String.valueOf(obj));
        }
    }
}
