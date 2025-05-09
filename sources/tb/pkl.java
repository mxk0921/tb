package tb;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pkl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(737149026);
    }

    public static long a() {
        long startUptimeMillis;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21cdd53a", new Object[0])).longValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            startUptimeMillis = Process.getStartUptimeMillis();
            return startUptimeMillis;
        }
        try {
            File file = new File("/proc/" + Process.myPid() + "/comm");
            if (file.exists()) {
                return file.lastModified();
            }
            return -1L;
        } catch (Throwable th) {
            TLog.loge(yr2.MODULE, "PackageUtil", "getAppSetupTime: get setup time with exception " + th);
            return -1L;
        }
    }
}
