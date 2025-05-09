package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class vto {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vto INSTANCE = new vto();

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f30244a = new Handler(Looper.getMainLooper());
    public static udr b;

    static {
        t2o.a(1031798815);
    }

    public final void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8e0cfe", new Object[]{this, runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        if (Looper.getMainLooper() != Looper.myLooper()) {
            f30244a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void c(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3adda2d4", new Object[]{this, runnable, new Integer(i)});
            return;
        }
        ckf.g(runnable, "runnable");
        f30244a.postDelayed(runnable, i);
    }

    public final void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb32521f", new Object[]{this, runnable});
            return;
        }
        ckf.g(runnable, "runnable");
        f30244a.removeCallbacks(runnable);
    }

    public final synchronized ExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("fe18c4a0", new Object[]{this});
        }
        if (b == null) {
            udr udrVar = new udr(4, 4, 30L, "tbhd");
            b = udrVar;
            udrVar.allowCoreThreadTimeOut(true);
        }
        udr udrVar2 = b;
        ckf.d(udrVar2);
        return udrVar2;
    }
}
