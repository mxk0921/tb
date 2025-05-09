package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iy3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(694157314);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae934c5a", new Object[]{str});
            return;
        }
        try {
            AliUserTrackerInterface c = hr0.c();
            if (c != null) {
                c.a("Page_Detail", 2201, "codeTrack", null, null, "className=" + str);
            }
        } catch (Throwable unused) {
        }
    }
}
