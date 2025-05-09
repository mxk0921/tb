package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xrt INSTANCE = new xrt();

    static {
        t2o.a(998244395);
    }

    @JvmStatic
    public static final void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3b02d8", new Object[]{runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        if (ckf.b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
