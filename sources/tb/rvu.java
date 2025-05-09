package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f27643a = new Handler(Looper.getMainLooper());

    static {
        t2o.a(1032847391);
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f55df7d", new Object[]{runnable, new Long(j)});
        } else {
            f27643a.postDelayed(runnable, j);
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8e0cfe", new Object[]{runnable});
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            f27643a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270f6c2f", new Object[]{runnable});
        } else {
            f27643a.removeCallbacks(runnable);
        }
    }
}
