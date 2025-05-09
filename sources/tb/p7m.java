package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class p7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297425);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{str, str2});
        } else {
            TLog.loge("PaiLiTaoLog", str, str2);
        }
    }
}
