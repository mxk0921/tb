package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class jr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355083);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{runnable});
        } else {
            ADaemon.postMainLooper(runnable, new long[0]);
        }
    }

    public static void b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f55df7d", new Object[]{runnable, new Long(j)});
        } else {
            ADaemon.postMainLooper(runnable, j);
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270f6c2f", new Object[]{runnable});
        } else {
            ADaemon.removeMainLooperCallback(runnable);
        }
    }
}
