package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class c7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f16905a;
    public final ExecutorService b;

    static {
        t2o.a(295699183);
    }

    public c7v(CountDownLatch countDownLatch, ExecutorService executorService) {
        this.f16905a = countDownLatch;
        this.b = executorService;
    }
}
