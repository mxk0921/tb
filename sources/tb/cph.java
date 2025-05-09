package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538194);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d572034a", new Object[]{str, str2, str3});
            return;
        }
        TLog.loge(u3j.b, str, str2 + " " + str3);
    }
}
