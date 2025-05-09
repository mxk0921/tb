package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mvr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991609);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            TLog.loge("[TBSR]:", "TBSR", str);
        }
    }

    public static void b(Throwable th, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e37e93", new Object[]{th, str});
        } else {
            TLog.loge("TBSR", str, th);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
            return;
        }
        TLog.loge("[TBSR]:", "TBSR", str);
        pdv.c("TBSR_I", "", "", str);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
            return;
        }
        TLog.loge("[TBSR]:", "TBSR", str);
        pdv.c("TBSR_E", "other_error", "", str);
    }
}
