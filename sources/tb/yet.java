package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yet {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<Runnable> f32028a = new ArrayList();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(729809289);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23899bc", new Object[]{runnable});
        } else if (!vxl.b().n()) {
            runnable.run();
        } else if (!b.get()) {
            ((ArrayList) f32028a).add(runnable);
        } else {
            runnable.run();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c916a1", new Object[0]);
        } else if (vxl.b().n() && b.compareAndSet(false, true)) {
            Iterator it = ((ArrayList) f32028a).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            ((ArrayList) f32028a).clear();
        }
    }
}
