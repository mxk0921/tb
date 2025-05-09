package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lio implements Iterable<cio> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<cio> f23360a;

    static {
        t2o.a(615514194);
    }

    public lio(Collection<cio> collection) {
        this.f23360a = new CopyOnWriteArrayList(collection);
    }

    public cio a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cio) ipChange.ipc$dispatch("a7a3d7ac", new Object[]{this, str});
        }
        Iterator it = ((CopyOnWriteArrayList) this.f23360a).iterator();
        while (it.hasNext()) {
            cio cioVar = (cio) it.next();
            if (cioVar.e().equals(str)) {
                return cioVar;
            }
        }
        return null;
    }

    public void b(cio... cioVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e127e4b9", new Object[]{this, cioVarArr});
        } else if (cioVarArr != null) {
            for (cio cioVar : cioVarArr) {
                if (cioVar != null) {
                    this.f23360a.add(cioVar);
                }
            }
        }
    }

    public void c(cio... cioVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d126ab52", new Object[]{this, cioVarArr});
        } else if (cioVarArr != null) {
            for (cio cioVar : cioVarArr) {
                if (cioVar != null) {
                    this.f23360a.remove(cioVar);
                }
            }
        }
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.f23360a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<cio> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return this.f23360a.iterator();
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.f23360a.size();
    }

    public lio(cio... cioVarArr) {
        this.f23360a = new CopyOnWriteArrayList(cioVarArr);
    }
}
