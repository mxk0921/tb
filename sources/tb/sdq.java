package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sdq implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sdq INSTANCE = new sdq();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f27979a = new AtomicInteger();

    static {
        t2o.a(676331604);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        return new Thread(runnable, "#SplitInstallThread-" + this.f27979a.incrementAndGet());
    }
}
