package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zn implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32879a;
    public final AtomicInteger b = new AtomicInteger(1);
    public final boolean c;

    static {
        t2o.a(79691932);
    }

    public zn(String str, boolean z) {
        this.f32879a = str;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        if (!this.c) {
            return new Thread(runnable, this.f32879a);
        }
        return new Thread(runnable, this.f32879a + "#" + this.b.getAndIncrement());
    }
}
