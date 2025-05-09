package tb;

import com.alibaba.ability.MegaUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class vhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vhz INSTANCE = new vhz();

    /* renamed from: a  reason: collision with root package name */
    public static final eji f30023a = new eji("NanoDownLoader", 5);

    static {
        t2o.a(598737507);
    }

    public static /* synthetic */ void c(vhz vhzVar, Runnable runnable, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebae0d85", new Object[]{vhzVar, runnable, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        vhzVar.b(runnable, j);
    }

    public final eji a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("63abc40f", new Object[]{this});
        }
        return f30023a;
    }

    public final void b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f14c3f2", new Object[]{this, runnable, new Long(j)});
            return;
        }
        ckf.g(runnable, "task");
        MegaUtils.z(runnable, j);
    }
}
