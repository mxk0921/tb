package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class pw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger THREAD_COUNT = new AtomicInteger(0);

    static {
        t2o.a(481297275);
    }

    public pw(String str) {
        AtomicInteger atomicInteger = THREAD_COUNT;
        atomicInteger.set(atomicInteger.incrementAndGet() % 100);
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad138c26", new Object[]{this});
        }
    }
}
