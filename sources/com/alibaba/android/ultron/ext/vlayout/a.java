package com.alibaba.android.ultron.ext.vlayout;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import tb.t2o;
import tb.vig;
import tb.zen;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zen<Integer> RANGE_ALL = zen.c(Integer.MIN_VALUE, Integer.MAX_VALUE);
    public static final zen<Integer> RANGE_EMPTY = zen.c(-1, -1);

    /* renamed from: a  reason: collision with root package name */
    public zen<Integer> f2294a = RANGE_EMPTY;

    static {
        t2o.a(156237943);
    }

    public a() {
        new LinkedList();
    }

    public void A(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9230e2", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 < i) {
            throw new IllegalArgumentException("end should be larger or equeal then start position");
        } else if (i == -1 && i2 == -1) {
            this.f2294a = RANGE_EMPTY;
            u(i, i2);
        } else if ((i2 - i) + 1 != m()) {
            throw new MismatchChildCountException("ItemCount mismatch when range: " + this.f2294a.toString() + " childCount: " + m());
        } else if (i != this.f2294a.e().intValue() || i2 != this.f2294a.d().intValue()) {
            this.f2294a = zen.c(Integer.valueOf(i), Integer.valueOf(i2));
            u(i, i2);
        }
    }

    public abstract void f(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, b bVar);

    public abstract void g(RecyclerView.Recycler recycler, RecyclerView.State state, b bVar);

    public void h(RecyclerView.State state, VirtualLayoutManager.d dVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18dda383", new Object[]{this, state, dVar, bVar});
        }
    }

    public abstract void i(b bVar);

    public abstract int j(int i, boolean z, boolean z2, b bVar);

    public abstract void k(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.f fVar, vig vigVar, b bVar);

    public View l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("72e2824c", new Object[]{this});
        }
        return null;
    }

    public abstract int m();

    public final zen<Integer> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zen) ipChange.ipc$dispatch("9e61f991", new Object[]{this});
        }
        return this.f2294a;
    }

    public abstract boolean o();

    public boolean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d623d5e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return !this.f2294a.a(Integer.valueOf(i));
    }

    public boolean q(int i, int i2, int i3, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5786b9d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), bVar, new Boolean(z)})).booleanValue();
        }
        return true;
    }

    public void r(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52dbe72f", new Object[]{this, bVar});
        }
    }

    public void s(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7637a5c", new Object[]{this, new Integer(i), bVar});
        }
    }

    public void t(int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5316410a", new Object[]{this, new Integer(i), bVar});
        }
    }

    public void u(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4958d495", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public void v(RecyclerView.State state, VirtualLayoutManager.d dVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6d99e", new Object[]{this, state, dVar, bVar});
        }
    }

    public void w(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
        }
    }

    public void x(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2496d358", new Object[]{this, bundle});
        }
    }

    public void y(int i, int i2, int i3, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a480a2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), bVar});
        }
    }

    public abstract void z(int i);
}
