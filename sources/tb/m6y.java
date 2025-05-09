package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tao.reactivex.d.h.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class m6y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097491);
    }

    public static <T> void a(cyx<? super T> cyxVar, T t, AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26d9904b", new Object[]{cyxVar, t, atomicInteger, cVar});
        } else if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            cyxVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a2 = cVar.a();
                if (a2 != null) {
                    cyxVar.onError(a2);
                } else {
                    cyxVar.onComplete();
                }
            }
        }
    }

    public static void b(cyx<?> cyxVar, Throwable th, AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9089b22c", new Object[]{cyxVar, th, atomicInteger, cVar});
        } else if (!cVar.a(th)) {
            oux.a(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            cyxVar.onError(cVar.a());
        }
    }

    public static void c(cyx<?> cyxVar, AtomicInteger atomicInteger, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491a9f6f", new Object[]{cyxVar, atomicInteger, cVar});
        } else if (atomicInteger.getAndIncrement() == 0) {
            Throwable a2 = cVar.a();
            if (a2 != null) {
                cyxVar.onError(a2);
            } else {
                cyxVar.onComplete();
            }
        }
    }
}
