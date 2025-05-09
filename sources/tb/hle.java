package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hle implements g5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ile f20727a;
    public final /* synthetic */ CountDownLatch b;

    public hle(ile ileVar, CountDownLatch countDownLatch) {
        this.f20727a = ileVar;
        this.b = countDownLatch;
    }

    @Override // tb.g5c
    public void a(ix8 ix8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27956d0f", new Object[]{this, ix8Var});
            return;
        }
        ckf.g(ix8Var, "result");
        ile.o(this.f20727a, ix8Var);
        this.b.countDown();
    }
}
