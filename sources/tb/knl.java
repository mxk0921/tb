package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class knl implements j6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<IPageLifeCycle> f22782a = new CopyOnWriteArrayList();

    static {
        t2o.a(729810218);
        t2o.a(729810230);
    }

    @Override // tb.j6d
    public void a(IPageLifeCycle iPageLifeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41c5a74", new Object[]{this, iPageLifeCycle});
        } else {
            ((CopyOnWriteArrayList) this.f22782a).add(iPageLifeCycle);
        }
    }

    @Override // tb.j6d
    public void b(IPageLifeCycle iPageLifeCycle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fef3631", new Object[]{this, iPageLifeCycle});
        } else {
            ((CopyOnWriteArrayList) this.f22782a).remove(iPageLifeCycle);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((CopyOnWriteArrayList) this.f22782a).clear();
        }
    }

    public void d(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f631c018", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onActivityResult(i, i2, intent);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2cecab", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onCreate();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812dfef0", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onCreateView();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11769759", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onDestroy();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab482053", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onLazyInit();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bdd555", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onPause();
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9d9e26", new Object[]{this, str});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onResume(str);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60635dc1", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onStart();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd8ab1", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onStop();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350b9bbf", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f22782a).iterator();
        while (it.hasNext()) {
            ((IPageLifeCycle) it.next()).onWillExit();
        }
    }
}
