package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x1i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Handler f31073a;

    static {
        t2o.a(947912766);
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            if (f31073a == null) {
                f31073a = new Handler(Looper.getMainLooper());
            }
            f31073a.post(runnable);
        }
    }
}
