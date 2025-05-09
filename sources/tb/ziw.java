package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ziw implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ThreadLocal<Looper> b;

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f32800a;

    public ziw(Runnable runnable) {
        this.f32800a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper looper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        ThreadLocal<Looper> threadLocal = b;
        if (threadLocal != null) {
            looper = threadLocal.get();
            threadLocal.set(Looper.getMainLooper());
        } else {
            looper = null;
        }
        this.f32800a.run();
        if (threadLocal != null) {
            threadLocal.set(looper);
        }
    }

    static {
        t2o.a(974127126);
        ThreadLocal<Looper> threadLocal = null;
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            threadLocal = (ThreadLocal) declaredField.get(threadLocal);
        } catch (Throwable th) {
            try {
                ghh.d(th);
            } finally {
                b = threadLocal;
            }
        }
    }
}
