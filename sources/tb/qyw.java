package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qyw implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Runnable> f27009a;

    static {
        t2o.a(87031837);
    }

    public qyw(Runnable runnable) {
        this.f27009a = new WeakReference<>(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Runnable runnable = this.f27009a.get();
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                gfh.b(th.getMessage());
            }
        }
    }
}
