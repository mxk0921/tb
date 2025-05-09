package tb;

import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.expose.ExposeHelperBuilder;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.xsn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t96 extends aa6 implements qp8<Integer, WeakReference<View>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ExposeHelperBuilder i;
    public final j4c<Integer, WeakReference<View>> j;
    public final HashSet<String> k = new HashSet<>();
    public final HashSet<String> l = new HashSet<>();
    public final RecyclerView m;

    static {
        t2o.a(444597545);
        t2o.a(444597132);
    }

    public static /* synthetic */ Object ipc$super(t96 t96Var, String str, Object... objArr) {
        if (str.hashCode() == 1400294264) {
            super.b((h4c) objArr[0], (String) objArr[1], (RecyclerView) objArr[2], (View) objArr[3]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/expose/DXRecyclerExposeAdapter");
    }

    @Override // tb.aa6, com.taobao.android.dinamicx.videoc.expose.impl.RecyclerViewZone.b
    public void a(h4c<Integer, WeakReference<View>> h4cVar, String str, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84f2e5e", new Object[]{this, h4cVar, str, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            m();
        }
    }

    @Override // tb.aa6, com.taobao.android.dinamicx.videoc.expose.impl.RecyclerViewZone.b
    public void b(h4c<Integer, WeakReference<View>> h4cVar, String str, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5376cb78", new Object[]{this, h4cVar, str, recyclerView, view});
            return;
        }
        super.b(h4cVar, str, recyclerView, view);
        if (this.i.i() != null) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            HashSet<String> hashSet = this.l;
            hashSet.remove(childAdapterPosition + "");
            this.i.i().b(childAdapterPosition);
        }
    }

    @Override // tb.gqk
    public void e(List<Pair<Integer, WeakReference<View>>> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2559b8b", new Object[]{this, list, str});
            return;
        }
        for (Pair<Integer, WeakReference<View>> pair : list) {
            c((Integer) pair.first, (WeakReference) pair.second, str);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95ccfca0", new Object[]{this});
            return;
        }
        this.k.clear();
        this.l.clear();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf7aba5", new Object[]{this});
            return;
        }
        j4c<Integer, WeakReference<View>> j4cVar = this.j;
        if (j4cVar != null) {
            j4cVar.d();
        }
    }

    /* renamed from: n */
    public void d(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe5d41d", new Object[]{this, num, weakReference, str});
        }
    }

    /* renamed from: o */
    public boolean f(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a71fdc8", new Object[]{this, num, weakReference, str})).booleanValue();
        }
        ExposeHelperBuilder exposeHelperBuilder = this.i;
        if (exposeHelperBuilder == null || exposeHelperBuilder.h() == null) {
            return false;
        }
        return this.i.h().a(num.intValue());
    }

    /* renamed from: p */
    public void c(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411f3de5", new Object[]{this, num, weakReference, str});
        } else if (this.i == null) {
        } else {
            if (zg5.v4()) {
                String a2 = this.i.f().a(num.intValue());
                if (!this.k.contains(a2)) {
                    if (this.i.g() != null) {
                        this.i.g().a(num.intValue());
                    }
                    this.k.add(a2);
                    this.l.add(a2);
                } else if (!this.l.contains(a2) || !this.i.o()) {
                    if (this.i.i() != null) {
                        this.i.i().a(num.intValue());
                    }
                    this.l.add(a2);
                }
            } else if (this.i.g() != null) {
                this.i.g().a(num.intValue());
            }
        }
    }

    public final boolean q(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf362133", new Object[]{this, new Integer(i), view})).booleanValue();
        }
        ExposeHelperBuilder exposeHelperBuilder = this.i;
        if (exposeHelperBuilder == null || view == null) {
            return false;
        }
        d4c f = exposeHelperBuilder.f();
        g4c k = this.i.k();
        if (f != null) {
            if (this.l.contains(f.a(i)) && this.i.o()) {
                return false;
            }
            if (k != null) {
                return lp8.b(view, k.a());
            }
            return true;
        } else if (k != null) {
            return lp8.b(view, k.a());
        } else {
            return true;
        }
    }

    /* renamed from: r */
    public boolean g(Integer num, WeakReference<View> weakReference, String str, Map<Integer, WeakReference<View>> map) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75a2348e", new Object[]{this, num, weakReference, str, map})).booleanValue();
        }
        if (zg5.v4()) {
            return q(num.intValue(), this.m.getLayoutManager().findViewByPosition(num.intValue()));
        }
        ExposeHelperBuilder exposeHelperBuilder = this.i;
        if (exposeHelperBuilder == null) {
            return false;
        }
        if (exposeHelperBuilder.f() == null) {
            return true;
        }
        if (this.k.contains(String.valueOf(num)) || (findViewByPosition = this.m.getLayoutManager().findViewByPosition(num.intValue())) == null || this.i.k() == null) {
            return false;
        }
        boolean b = lp8.b(findViewByPosition, this.i.k().a());
        if (b) {
            this.k.add(String.valueOf(num));
        }
        return b;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        j4c<Integer, WeakReference<View>> j4cVar = this.j;
        if (j4cVar != null) {
            j4cVar.j();
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        j4c<Integer, WeakReference<View>> j4cVar = this.j;
        if (j4cVar != null) {
            j4cVar.f();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce68223", new Object[]{this});
            return;
        }
        j4c<Integer, WeakReference<View>> j4cVar = this.j;
        if (j4cVar != null) {
            j4cVar.d();
            this.j.g();
        }
    }

    public t96(RecyclerView recyclerView, ExposeHelperBuilder exposeHelperBuilder) {
        super(null, "dinamicx");
        this.i = exposeHelperBuilder;
        this.m = recyclerView;
        xsn.b bVar = new xsn.b(recyclerView, this);
        long e = exposeHelperBuilder.e();
        this.j = bVar.c(this, e, "recyclerLayoutExpose" + recyclerView.hashCode()).a();
    }
}
