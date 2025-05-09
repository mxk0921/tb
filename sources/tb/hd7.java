package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hd7 implements ntc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f20559a;
    public final HashMap<Integer, wyb> b = new HashMap<>();
    public final HashMap<Integer, wyb> c = new HashMap<>();
    public int d = -1;
    public final i7m f = new a();
    public final ArrayList<Integer> e = new ArrayList<>(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements i7m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.i7m
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bad0a3d9", new Object[]{this, new Integer(i)});
            } else {
                hd7.this.o(-1);
            }
        }

        @Override // tb.i7m
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab599da", new Object[]{this, new Integer(i)});
            } else {
                hd7.b(hd7.this, i);
            }
        }

        @Override // tb.i7m
        public void c(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d5ffab8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            if (!(hd7.this.d() == -1 || hd7.this.d() == i)) {
                ((wyb) hd7.a(hd7.this).get(Integer.valueOf(hd7.this.d()))).a();
            }
            hd7.this.o(i);
        }
    }

    static {
        t2o.a(912262282);
        t2o.a(912261362);
    }

    public hd7(Context context) {
        this.f20559a = context;
        m();
    }

    public static /* synthetic */ HashMap a(hd7 hd7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6132cbee", new Object[]{hd7Var});
        }
        return hd7Var.c;
    }

    public static /* synthetic */ void b(hd7 hd7Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b289b877", new Object[]{hd7Var, new Integer(i)});
        } else {
            hd7Var.l(i);
        }
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    public final boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b50a0a0a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        wyb wybVar = this.b.get(Integer.valueOf(i));
        if (!wybVar.c()) {
            return false;
        }
        wybVar.b(0);
        return true;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public wyb e(kd7 kd7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wyb) ipChange.ipc$dispatch("c12f25c5", new Object[]{this, kd7Var});
        }
        if (kd7Var == null || !(kd7Var instanceof wyb)) {
            return null;
        }
        return (wyb) kd7Var;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        p();
        this.b.clear();
        this.c.clear();
    }

    public void h(int i, kd7 kd7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8dc7828", new Object[]{this, new Integer(i), kd7Var});
            return;
        }
        wyb e = e(kd7Var);
        if (e != null) {
            this.e.add(Integer.valueOf(i));
            e.e(this.f);
            this.b.put(Integer.valueOf(i), e);
            this.c.put(Integer.valueOf(i), e);
            tgh.b("desc video", "onItemVisible" + i + "|" + e);
            if ((d() != -1 || !e.c()) && d() != -1 && d() == i) {
                e.l();
            }
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            q84.i(this.f20559a, p6m.class, this);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b01c1f", new Object[]{this});
            return;
        }
        wyb wybVar = this.c.get(Integer.valueOf(d()));
        if (wybVar != null) {
            wybVar.k();
        }
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a303f68", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap<Integer, wyb> hashMap = this.b;
        if (!(hashMap == null || hashMap.isEmpty())) {
            Object[] array = this.b.keySet().toArray();
            Arrays.sort(array);
            List asList = Arrays.asList(array);
            int indexOf = asList.indexOf(Integer.valueOf(i));
            for (int i2 = indexOf + 1; i2 < asList.size(); i2++) {
                if (c(((Integer) asList.get(i2)).intValue())) {
                    return;
                }
            }
            for (int i3 = 0; i3 < indexOf; i3++) {
                if (c(((Integer) asList.get(i3)).intValue())) {
                    return;
                }
            }
            o(-1);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f9d2be", new Object[]{this});
            return;
        }
        q84.i(this.f20559a, p6m.class, this);
        q84.i(this.f20559a, sgm.class, this);
        q84.i(this.f20559a, l9w.class, this);
        q84.i(this.f20559a, k9w.class, this);
        q84.i(this.f20559a, j9w.class, this);
        q84.i(this.f20559a, nvl.class, this);
        q84.i(this.f20559a, dw3.class, this);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a07056", new Object[]{this});
            return;
        }
        wyb wybVar = this.c.get(Integer.valueOf(d()));
        if (wybVar != null) {
            wybVar.l();
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed9025c", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74be925", new Object[]{this});
            return;
        }
        q84.l(this.f20559a, p6m.class);
        q84.l(this.f20559a, sgm.class);
        q84.l(this.f20559a, l9w.class);
        q84.l(this.f20559a, k9w.class);
        q84.l(this.f20559a, j9w.class);
        q84.l(this.f20559a, nvl.class);
        q84.l(this.f20559a, dw3.class);
    }

    @Override // tb.ntc
    public boolean y1(dtc dtcVar) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7cc73d0", new Object[]{this, dtcVar})).booleanValue();
        }
        if (dtcVar instanceof k9w) {
            k();
            return true;
        } else if (dtcVar instanceof l9w) {
            n();
            return true;
        } else if (dtcVar instanceof nvl) {
            k();
            return true;
        } else if (dtcVar instanceof sgm) {
            return true;
        } else {
            if (!(dtcVar instanceof dw3)) {
                return false;
            }
            HashMap<Integer, wyb> hashMap = this.b;
            if (hashMap != null && !hashMap.isEmpty()) {
                int d = d();
                if (d != -1 && this.b.get(Integer.valueOf(d)) != null) {
                    h(d, (kd7) this.b.get(Integer.valueOf(d)));
                } else if (d == -1 && (num = this.e.get(0)) != null) {
                    h(num.intValue(), (kd7) this.b.get(num));
                }
            }
            return true;
        }
    }

    public void g(int i, boolean z, kd7 kd7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc7023f", new Object[]{this, new Integer(i), new Boolean(z), kd7Var});
            return;
        }
        wyb e = e(kd7Var);
        if (e != null) {
            this.e.remove(Integer.valueOf(i));
            this.b.remove(Integer.valueOf(i));
            tgh.b("desc video", "onItemInvisible" + i + "|" + e);
            if (d() != -1) {
                e.d(true, z);
            }
        }
    }
}
