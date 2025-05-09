package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571205);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{str, str2});
        } else {
            TLog.loge("MmAdBizSDK", str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf83f6", new Object[]{str, str2, th});
            return;
        }
        TLog.loge("MmAdBizSDK", str, str2 + ", error:", th);
    }
}
