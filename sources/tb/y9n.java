package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class y9n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809631);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (av6.a()) {
            new StringBuilder(av6.LOG_PREFIX).append(str);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d16e309", new Object[]{str});
        } else if (av6.a()) {
            new StringBuilder(av6.LOG_PREFIX).append(str);
        }
    }

    public static void d(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
        } else {
            Log.e("RECSDK_LOG", str, th);
        }
    }
}
