package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ekh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Looper> f18641a;
    public static final WeakHashMap<Thread, Looper> b = new WeakHashMap<>();

    public static void a(Thread thread) {
        Looper looper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e2a38e", new Object[]{thread});
            return;
        }
        ThreadLocal<Looper> threadLocal = f18641a;
        if (threadLocal != null && (looper = threadLocal.get()) != null) {
            WeakHashMap<Thread, Looper> weakHashMap = b;
            synchronized (weakHashMap) {
                weakHashMap.put(thread, looper);
                threadLocal.remove();
            }
        }
    }

    public static void b(Thread thread) {
        ThreadLocal<Looper> threadLocal;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70f2351", new Object[]{thread});
            return;
        }
        WeakHashMap<Thread, Looper> weakHashMap = b;
        synchronized (weakHashMap) {
            try {
                Looper looper = weakHashMap.get(thread);
                if (!(looper == null || (threadLocal = f18641a) == null)) {
                    threadLocal.set(looper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static {
        t2o.a(969932804);
        ThreadLocal<Looper> threadLocal = null;
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod.setAccessible(true);
            Field field = (Field) declaredMethod.invoke(Looper.class, "sThreadLocal");
            field.setAccessible(true);
            threadLocal = (ThreadLocal) field.get(threadLocal);
        } catch (Throwable th) {
            try {
                ghh.c(th);
            } finally {
                f18641a = threadLocal;
            }
        }
    }
}
