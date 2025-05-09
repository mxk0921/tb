package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.scheduler.Priority;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class g49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static g49 b;

    /* renamed from: a  reason: collision with root package name */
    public final o15 f19720a = o15.d();

    static {
        t2o.a(377487419);
    }

    public static guo a(Priority priority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (guo) ipChange.ipc$dispatch("4888c9e2", new Object[]{priority});
        }
        return b().c().e(priority);
    }

    public static g49 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g49) ipChange.ipc$dispatch("6f2fd4d0", new Object[0]);
        }
        if (b == null) {
            synchronized (g49.class) {
                try {
                    if (b == null) {
                        b = new g49();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final o15 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o15) ipChange.ipc$dispatch("4184a812", new Object[]{this});
        }
        return this.f19720a;
    }
}
