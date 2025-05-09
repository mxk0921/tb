package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wko extends riw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f30749a;
    public final String b;
    public final int c;

    static {
        t2o.a(973078540);
    }

    public wko(String str) {
        this(str, 5);
    }

    public static /* synthetic */ Object ipc$super(wko wkoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/RxVirtualThreadFactory");
    }

    @Override // tb.riw
    public VirtualThread newVirtualThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VirtualThread) ipChange.ipc$dispatch("61b40e34", new Object[]{this, runnable});
        }
        VirtualThread virtualThread = new VirtualThread(runnable, this.b + '-' + this.f30749a.incrementAndGet());
        virtualThread.setPriority(this.c);
        virtualThread.setDaemon(true);
        return virtualThread;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RxThreadFactory[" + this.b + "]";
    }

    public wko(String str, int i) {
        this.f30749a = new AtomicLong(0L);
        this.b = str;
        this.c = i;
    }
}
