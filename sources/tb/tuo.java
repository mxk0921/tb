package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199590);
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c41d8e1", new Object[]{runnable, new Long(j)});
        } else {
            pav.i(runnable, j);
        }
    }

    public static void b(Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4214f1", new Object[]{runnable, new Boolean(z)});
        } else if (z) {
            pav.j(runnable);
        } else {
            a(runnable, 0L);
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b82c6a", new Object[]{runnable});
        } else {
            pav.k(runnable);
        }
    }
}
