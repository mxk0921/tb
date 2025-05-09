package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class q5g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f26516a;

    static {
        t2o.a(1029701658);
    }

    public q5g(int i) {
        if (i > 0) {
            this.f26516a = new CountDownLatch(i);
            return;
        }
        throw new IllegalArgumentException("Count must be greater than 0");
    }

    public final boolean a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17e24a21", new Object[]{this, new Long(j)})).booleanValue();
        }
        return this.f26516a.await(j, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea0be58", new Object[]{this});
        } else {
            this.f26516a.countDown();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }
}
