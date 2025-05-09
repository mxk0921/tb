package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class usw implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f29591a = new AtomicInteger(1);
    public final String b;

    static {
        t2o.a(989856412);
    }

    public usw(String str) {
        this.b = str + "-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        Thread thread = new Thread(runnable, this.b + this.f29591a.getAndIncrement());
        thread.setPriority(5);
        return thread;
    }
}
