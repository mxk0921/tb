package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import tb.xe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class ye<T extends xe> implements w4e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bod f32008a;

    static {
        t2o.a(503316974);
        t2o.a(503316976);
    }

    public static boolean b(Context context, anl anlVar) {
        bod bodVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31abf53", new Object[]{context, anlVar})).booleanValue();
        }
        if (context instanceof bod) {
            bodVar = (bod) context;
        } else {
            bodVar = null;
        }
        if (bodVar == null && (anlVar instanceof bod)) {
            bodVar = (bod) anlVar;
        }
        if (h(bodVar)) {
            return bodVar.findSecPageWrapper().a();
        }
        return false;
    }

    public static bod e(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bod) ipChange.ipc$dispatch("1538a871", new Object[]{jVar});
        }
        if (jVar.f11976a.W() instanceof bod) {
            return (bod) jVar.f11976a.W();
        }
        if (jVar.c() instanceof bod) {
            return (bod) jVar.c();
        }
        return null;
    }

    public static boolean h(bod bodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34852bae", new Object[]{bodVar})).booleanValue();
        }
        if (bodVar == null || bodVar.findSecPageWrapper() == null || !bodVar.findSecPageWrapper().g()) {
            return false;
        }
        return true;
    }

    public abstract boolean a();

    public abstract T c();

    public final bod d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bod) ipChange.ipc$dispatch("d56a43db", new Object[]{this});
        }
        return this.f32008a;
    }

    public abstract View f();

    public abstract boolean g();

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            j();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            i();
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            k();
        }
    }
}
