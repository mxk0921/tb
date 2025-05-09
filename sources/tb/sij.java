package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sij implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadFactory f28074a = Executors.defaultThreadFactory();
    public final AtomicInteger b = new AtomicInteger(1);
    public final String c;

    static {
        t2o.a(980418682);
    }

    public sij(String str) {
        this.c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        Thread newThread = this.f28074a.newThread(runnable);
        newThread.setName(this.c + "-" + this.b);
        return newThread;
    }
}
