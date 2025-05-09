package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Looper f29625a;
    public static final Handler b;

    static {
        t2o.a(745537625);
        Looper mainLooper = Looper.getMainLooper();
        f29625a = mainLooper;
        b = new Handler(mainLooper);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{runnable});
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            b.post(runnable);
        } else {
            runnable.run();
        }
    }
}
