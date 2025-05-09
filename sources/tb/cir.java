package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093540);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36ff92", new Object[]{str, obj});
        } else if (v2s.o().A() != null) {
            v2s.o().A().c(str, obj);
        } else if (obj instanceof String) {
            TLog.loge(cwd.LOG_TAG, str, (String) obj);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{str, str2, th});
        } else {
            TLog.loge(str, str2, th);
        }
    }
}
