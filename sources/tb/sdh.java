package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sdh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(447741956);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb86b2a", new Object[]{str, str2, str3});
            return;
        }
        TLog.loge("dojoAbility", str, str2 + ", " + str3);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa338564", new Object[]{str, str2});
        } else {
            TLog.loge("dojoAbility", str, str2);
        }
    }
}
