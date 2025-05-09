package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.context.NCBusinessContext;
import java.lang.ref.WeakReference;
import tb.phz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class qgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737283);
    }

    public qgz(NCBusinessContext nCBusinessContext) {
        ckf.g(nCBusinessContext, "businessContext");
        new WeakReference(nCBusinessContext);
    }

    public final void a(phz phzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d709e83", new Object[]{this, phzVar});
            return;
        }
        ckf.g(phzVar, "event");
        byte f = phzVar.f();
        if (phz.c.b(f, phz.c.a((byte) 0))) {
            ugz.INSTANCE.a(phzVar);
        } else if (phz.c.b(f, phz.c.a((byte) 2))) {
            if (b()) {
                ugz.INSTANCE.a(phzVar);
                return;
            }
            throw new IllegalStateException("MainThreadEventPoster is null");
        } else if (phz.c.b(f, phz.c.a((byte) 2))) {
            throw new IllegalStateException("MainThreadEventPoster is null");
        } else if (phz.c.b(f, phz.c.a((byte) 3))) {
            throw new IllegalStateException("BackgroundEventPoster is null");
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
