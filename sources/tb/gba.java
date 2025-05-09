package tb;

import com.alibaba.analytics.AnalyticsMgr;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gba {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String cold_start_id;
    public static String session_id;

    static {
        t2o.a(962593210);
    }

    public static String getUserid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ee0635d", new Object[0]);
        }
        return AnalyticsMgr.L();
    }
}
