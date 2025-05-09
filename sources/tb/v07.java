package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v07<ExposeKey, ExposeData> implements n4c<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<m4c<ExposeKey, ExposeData>> f29710a = new HashSet();

    static {
        t2o.a(444597140);
        t2o.a(444597130);
    }

    @Override // tb.n4c
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72620428", new Object[]{this, str});
            return;
        }
        Iterator it = ((HashSet) this.f29710a).iterator();
        while (it.hasNext()) {
            m4c m4cVar = (m4c) it.next();
            if (m4cVar.key().equals(str)) {
                m4cVar.attach();
            }
        }
    }

    @Override // tb.n4c
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec8e3c55", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.f29710a).iterator();
        while (it.hasNext()) {
            o((m4c) it.next());
        }
    }

    @Override // tb.n4c
    public Collection<m4c<ExposeKey, ExposeData>> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("7a6f9e39", new Object[]{this});
        }
        return this.f29710a;
    }

    @Override // tb.n4c
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04edadf", new Object[]{this, str});
            return;
        }
        Iterator it = ((HashSet) this.f29710a).iterator();
        while (it.hasNext()) {
            o((m4c) it.next());
        }
    }

    @Override // tb.n4c
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df2755de", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.f29710a).iterator();
        while (it.hasNext()) {
            n((m4c) it.next());
        }
    }

    @Override // tb.n4c
    public List<m4c<ExposeKey, ExposeData>> l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eade0924", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashSet) this.f29710a).iterator();
        while (it.hasNext()) {
            m4c m4cVar = (m4c) it.next();
            if (m4cVar.key().equals(str)) {
                arrayList.add(m4cVar);
            }
        }
        return arrayList;
    }

    public void m(m4c<ExposeKey, ExposeData> m4cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec5c029", new Object[]{this, m4cVar});
        } else {
            ((HashSet) this.f29710a).add(m4cVar);
        }
    }

    public void n(m4c<ExposeKey, ExposeData> m4cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df1212a", new Object[]{this, m4cVar});
        } else {
            m4cVar.attach();
        }
    }

    public void o(m4c<ExposeKey, ExposeData> m4cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95600161", new Object[]{this, m4cVar});
        } else {
            m4cVar.detach();
        }
    }
}
