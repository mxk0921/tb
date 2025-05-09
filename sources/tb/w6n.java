package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w6n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(634388486);
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb857a6d", new Object[]{str, strArr});
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append("\t");
        }
        TLog.loge(uur.MODULE_NAME, str, sb.toString());
    }
}
