package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mnl implements l6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<h6d> f24167a = new CopyOnWriteArrayList();

    static {
        t2o.a(486539719);
        t2o.a(488636486);
    }

    @Override // tb.l6d
    public void a(h6d h6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3fcbbce", new Object[]{this, h6dVar});
        } else {
            ((CopyOnWriteArrayList) this.f24167a).add(h6dVar);
        }
    }

    @Override // tb.l6d
    public void b(h6d h6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95eafcb", new Object[]{this, h6dVar});
        } else {
            ((CopyOnWriteArrayList) this.f24167a).remove(h6dVar);
        }
    }

    public void c(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f631c018", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        try {
            Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
            while (it.hasNext()) {
                ((h6d) it.next()).onActivityResult(i, i2, intent);
            }
        } catch (AbstractMethodError e) {
            fve.c("PageLifeCycleRegister", "onActivityResult方法找不到，请使用摩天轮打包", e);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885a088a", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onColdStartResume();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11769759", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onDestroy();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd26a29e", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onDestroyView();
        }
    }

    public void g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fef3b78", new Object[]{this, intent});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onNewIntent(intent);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10bdd555", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onPause();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78682ee", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onRestart();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5c135c", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onResume();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60635dc1", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onStart();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd8ab1", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onStop();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350b9bbf", new Object[]{this});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f24167a).iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).onWillExit();
        }
    }
}
