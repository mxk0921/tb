package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class s70<RESPONSE> implements Callable<RESPONSE> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile RESPONSE f27838a;
    public final CountDownLatch b = new CountDownLatch(1);

    static {
        t2o.a(993001604);
    }

    public void a(RESPONSE response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f39ef26", new Object[]{this, response});
            return;
        }
        this.f27838a = response;
        this.b.countDown();
    }

    @Override // java.util.concurrent.Callable
    public RESPONSE call() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RESPONSE) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        if (this.f27838a == null) {
            this.b.await();
        }
        return this.f27838a;
    }
}
