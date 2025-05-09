package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class har {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946341);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2c182a", new Object[]{str, str2});
            return;
        }
        try {
            String str3 = "errorCode:" + str + ",errorMsg:" + str2;
            AppMonitor.Counter.commit("taobaoCompat", "taobaocompatexception", str3, 1.0d);
            TLog.loge("taobaoCompat", "TBCompatMonitor", "count " + str3);
        } catch (Throwable th) {
            TLog.loge("taobaoCompat", "TBCompatMonitor", "count failed", th);
        }
    }
}
