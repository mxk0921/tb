package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zdh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(329252898);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "TSchedule_no_tag";
        }
        TLog.loge(str, str2);
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{str, str2, th});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "TSchedule_no_tag";
        }
        TLog.loge(str, str2, th);
    }
}
