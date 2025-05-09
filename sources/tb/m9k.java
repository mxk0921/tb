package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m9k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251197);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("549523d4", new Object[]{str, str2});
        } else {
            TLog.loge(str, str2);
        }
    }
}
