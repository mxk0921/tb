package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r0h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355493);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{str, str2});
        } else {
            TLog.logd("live_home_core", str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
        } else {
            TLog.loge("live_home_core", str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{str, str2, th});
            return;
        }
        TLog.loge("live_home_core." + str, str2, th);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{str, str2});
        } else {
            TLog.logi("live_home_core", str, str2);
        }
    }
}
