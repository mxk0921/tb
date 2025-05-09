package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wan implements fgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<fgd> f30569a = new CopyOnWriteArraySet();

    @Override // tb.fgd
    public void a(xan xanVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8dd4cf", new Object[]{this, xanVar, rSoException});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f30569a).iterator();
        while (it.hasNext()) {
            try {
                ((fgd) it.next()).a(xanVar, rSoException);
            } catch (Throwable th) {
                rbn.g("download->finished,error", th);
            }
        }
        ((CopyOnWriteArraySet) this.f30569a).clear();
    }

    @Override // tb.fgd
    public void b(xan xanVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34782f22", new Object[]{this, xanVar, new Integer(i)});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f30569a).iterator();
        while (it.hasNext()) {
            try {
                ((fgd) it.next()).b(xanVar, i);
            } catch (Throwable th) {
                rbn.g("download->progress,error", th);
            }
        }
    }

    @Override // tb.fgd
    public void c(xan xanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a71c947", new Object[]{this, xanVar});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f30569a).iterator();
        while (it.hasNext()) {
            try {
                ((fgd) it.next()).c(xanVar);
            } catch (Throwable th) {
                rbn.g("download->begin,error", th);
            }
        }
    }

    public void d(fgd fgdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3b92ca", new Object[]{this, fgdVar});
        } else if (fgdVar != null) {
            ((CopyOnWriteArraySet) this.f30569a).add(fgdVar);
        }
    }
}
