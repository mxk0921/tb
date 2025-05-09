package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ght extends bx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<e3b> f20012a = new HashSet(8);

    static {
        t2o.a(491782610);
    }

    public static /* synthetic */ Object ipc$super(ght ghtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/pop/lifecycle/TbPopPageLifeCycle");
    }

    @Override // tb.bx
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37bc9d", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.f20012a).iterator();
        while (it.hasNext()) {
            ((e3b) it.next()).j().d();
        }
    }

    @Override // tb.bx
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbcebe0", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.f20012a).iterator();
        while (it.hasNext()) {
            ((e3b) it.next()).j().q();
        }
    }

    @Override // tb.bx
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.f20012a).iterator();
        while (it.hasNext()) {
            ((e3b) it.next()).j().r();
        }
    }

    @Override // tb.bx
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.f20012a).iterator();
        while (it.hasNext()) {
            ((e3b) it.next()).j().v();
        }
    }

    @Override // tb.bx
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.f20012a).iterator();
        while (it.hasNext()) {
            ((e3b) it.next()).j().x();
        }
    }

    @Override // tb.bx
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.f20012a).iterator();
        while (it.hasNext()) {
            ((e3b) it.next()).j().y();
        }
    }

    @Override // tb.bx
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f591da", new Object[]{this});
            return;
        }
        Iterator it = ((HashSet) this.f20012a).iterator();
        while (it.hasNext()) {
            ((e3b) it.next()).j().m();
        }
    }

    public void u(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30978b00", new Object[]{this, e3bVar});
        } else if (e3bVar != null) {
            ((HashSet) this.f20012a).add(e3bVar);
        }
    }

    public void v(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef7aef63", new Object[]{this, e3bVar});
        } else if (e3bVar != null) {
            ((HashSet) this.f20012a).remove(e3bVar);
        }
    }
}
