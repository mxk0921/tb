package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f28975a = new Handler(Looper.getMainLooper());

    static {
        t2o.a(793772126);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{runnable});
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            f28975a.post(runnable);
        } else {
            runnable.run();
        }
    }
}
