package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v71 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_HOME = "Page_Home";

    static {
        t2o.a(729809627);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4512f038", new Object[]{str});
            return;
        }
        try {
            AppMonitor.Counter.commit(str, "recommendAD", 1.0d);
        } catch (Throwable th) {
            y9n.d("App Monitor Exception.", th);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9d17f2", new Object[]{str});
            return;
        }
        try {
            AppMonitor.Counter.commit(str, "guessYouLikeHot", 1.0d);
        } catch (Throwable th) {
            y9n.d("App Monitor Exception.", th);
        }
    }
}
