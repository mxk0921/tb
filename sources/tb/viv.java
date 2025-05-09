package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class viv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092104);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29e749f", new Object[]{str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("traceStr", Log.getStackTraceString(new Throwable()));
            obu.a(null, "TBLiveHomepageUnusedCode" + str, hashMap);
        } catch (Throwable th) {
            o3s.b("UnusedCodeTrackUtils", "trackUnusedCode error" + th.getMessage());
        }
    }
}
