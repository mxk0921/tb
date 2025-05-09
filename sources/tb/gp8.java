package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.expose.ExposeChildAttachListener;
import com.taobao.android.dinamicx.widget.recycler.expose.ExposeHelperBuilder;
import com.taobao.android.dinamicx.widget.recycler.expose.ExposeScrollerListener;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f20142a;
    public final g4c b;
    public final f4c c;
    public final hjd d;
    public final long e;
    public ExposeScrollerListener f;
    public ExposeChildAttachListener g;
    public boolean h;
    public List<Object> i;
    public final t96 j;

    static {
        t2o.a(444597547);
    }

    public gp8(RecyclerView recyclerView, ExposeHelperBuilder exposeHelperBuilder) {
        this.f20142a = recyclerView;
        this.c = exposeHelperBuilder.j();
        this.b = exposeHelperBuilder.k();
        this.e = exposeHelperBuilder.e();
        this.j = new t96(recyclerView, exposeHelperBuilder);
        this.d = exposeHelperBuilder.i();
    }

    public void a() {
        ExposeChildAttachListener exposeChildAttachListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ace5d37", new Object[]{this});
        } else if (this.h && (exposeChildAttachListener = this.g) != null) {
            exposeChildAttachListener.b();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
        } else if (!this.h) {
            this.h = true;
            t96 t96Var = this.j;
            if (t96Var != null) {
                t96Var.s();
            }
            if (this.c != null) {
                this.g = new ExposeChildAttachListener(this.f20142a, this.c, this.b, this.e);
                ExposeScrollerListener exposeScrollerListener = new ExposeScrollerListener(this.g);
                this.f = exposeScrollerListener;
                this.f20142a.addOnScrollListener(exposeScrollerListener);
                this.f20142a.addOnChildAttachStateChangeListener(this.g);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        } else if (this.h) {
            this.h = false;
            ExposeChildAttachListener exposeChildAttachListener = this.g;
            if (exposeChildAttachListener != null) {
                exposeChildAttachListener.c();
                this.f20142a.removeOnChildAttachStateChangeListener(this.g);
            }
            ExposeScrollerListener exposeScrollerListener = this.f;
            if (exposeScrollerListener != null) {
                this.f20142a.removeOnScrollListener(exposeScrollerListener);
            }
            if (this.i != null) {
                this.i = null;
            }
            t96 t96Var = this.j;
            if (t96Var != null) {
                t96Var.t();
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf7aba5", new Object[]{this});
            return;
        }
        t96 t96Var = this.j;
        if (t96Var != null) {
            t96Var.u();
        }
    }

    public void e() {
        ExposeChildAttachListener exposeChildAttachListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16d8a0f", new Object[]{this});
        } else if (this.h && (exposeChildAttachListener = this.g) != null) {
            exposeChildAttachListener.f();
        }
    }

    public hjd f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hjd) ipChange.ipc$dispatch("f006cf2d", new Object[]{this});
        }
        return this.d;
    }

    public List<Object> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7ec444a5", new Object[]{this});
        }
        return this.i;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b46366e", new Object[]{this});
            return;
        }
        t96 t96Var = this.j;
        if (t96Var != null) {
            t96Var.l();
        }
    }

    public void i() {
        ExposeChildAttachListener exposeChildAttachListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dcc6bd1", new Object[]{this});
        } else if (this.h && (exposeChildAttachListener = this.g) != null) {
            exposeChildAttachListener.g();
        }
    }

    public void j(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9b365f", new Object[]{this, list});
        } else {
            this.i = list;
        }
    }
}
