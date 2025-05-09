package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i6b<K, V> implements vmh<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21124a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final HashMap<K, dnh<K, V>> f = new HashMap<>();
    public dnh<K, V> g;
    public dnh<K, V> h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    static {
        t2o.a(620757029);
        t2o.a(620757030);
    }

    public i6b(int i, float f) {
        b(i, f);
    }

    public final boolean A(dnh<K, V> dnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1bce93", new Object[]{this, dnhVar})).booleanValue();
        }
        return B(dnhVar, false);
    }

    public final boolean B(dnh<K, V> dnhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("585eb629", new Object[]{this, dnhVar, new Boolean(z)})).booleanValue();
        }
        this.h = dnhVar;
        if (dnhVar == null || this.g == dnhVar) {
            return false;
        }
        if (!z && !dnhVar.g) {
            this.e -= dnhVar.c;
        }
        dnhVar.g = true;
        return true;
    }

    public final void C(dnh<K, V> dnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fd6344", new Object[]{this, dnhVar});
        } else {
            D(dnhVar, false);
        }
    }

    public final void D(dnh<K, V> dnhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65afb810", new Object[]{this, dnhVar, new Boolean(z)});
            return;
        }
        if (dnhVar != null) {
            if (z || dnhVar.g) {
                this.e += dnhVar.c;
            }
            dnhVar.g = false;
        }
        this.g = dnhVar;
    }

    public synchronized void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa1611e", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        j();
        w(true);
    }

    @Override // tb.vmh
    public final boolean a(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66d7df43", new Object[]{this, new Integer(i)})).booleanValue();
        }
        dnh<K, V> dnhVar = null;
        while (true) {
            synchronized (this) {
                try {
                    if (this.d <= i) {
                        break;
                    }
                    while (true) {
                        dnhVar = this.g.e;
                        if (dnhVar.d < 2) {
                            break;
                        }
                        dnhVar.d = 1;
                        C(dnhVar);
                        while (true) {
                            int i2 = this.b;
                            if (i2 <= 0 || this.e <= i2 || !A(this.h.e)) {
                            }
                        }
                    }
                    this.f.remove(dnhVar.f17966a);
                    y(dnhVar);
                    this.l++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            t(false, dnhVar, true);
        }
        if (dnhVar == null) {
            z = false;
        }
        return z;
    }

    @Override // tb.vmh
    public void b(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695f1998", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        fiv.c("Phenix", "HotEndLruCache resize: maxSize = " + i + ", hotPercent = " + f, new Object[0]);
        if (i < 2 || f < 0.0f || f >= 1.0f) {
            throw new RuntimeException("HotEndLruCache size parameters error");
        }
        synchronized (this) {
            try {
                this.f21124a = i;
                int i2 = (int) (i * f);
                this.b = i2;
                if (i2 < 1) {
                    this.b = 1;
                } else if (i - i2 < 1) {
                    this.b = i - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j();
        a(this.f21124a);
    }

    public void c(boolean z, K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e8e7a6", new Object[]{this, new Boolean(z), k, v});
        }
    }

    @Override // tb.vmh
    public synchronized void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f.clear();
        C(null);
        A(null);
        this.d = 0;
        this.e = 0;
        this.i = 0;
        this.m = 0;
    }

    @Override // tb.vmh
    public final synchronized int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8be17f", new Object[]{this})).intValue();
        }
        return this.f21124a;
    }

    @Override // tb.vmh
    public boolean f(int i, K k, V v) {
        dnh<K, V> put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5affebe9", new Object[]{this, new Integer(i), k, v})).booleanValue();
        }
        if (k == null || v == null) {
            return false;
        }
        dnh<K, V> dnhVar = new dnh<>(k, v, m(v));
        if (i == 34) {
            dnhVar.d = 2;
        }
        if (dnhVar.c > this.f21124a) {
            return false;
        }
        synchronized (this) {
            try {
                put = this.f.put(k, dnhVar);
                if (put != null) {
                    int i2 = put.d;
                    y(put);
                    dnhVar.d = i2 + 1;
                }
            } finally {
            }
        }
        if (put != null) {
            t(true, put, true);
        }
        boolean a2 = a(this.f21124a - dnhVar.c);
        synchronized (this) {
            try {
                if (!(this.g == null || this.h == null || !a2)) {
                    o(dnhVar);
                    r(dnhVar);
                }
                p(dnhVar);
                r(dnhVar);
                if (this.h == null && this.d > this.b) {
                    A(this.g.e);
                }
            } finally {
            }
        }
        w(a2);
        return true;
    }

    @Override // tb.vmh
    public V get(K k) {
        dnh<K, V> dnhVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, k});
        }
        synchronized (this) {
            try {
                dnhVar = this.f.get(k);
                if (dnhVar != null) {
                    int i2 = dnhVar.d;
                    if (i2 < 0) {
                        i = 1;
                    } else {
                        i = i2 + 1;
                    }
                    dnhVar.d = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dnhVar != null) {
            i(dnhVar, false, true, false);
            this.j++;
            return dnhVar.b;
        }
        this.k++;
        return null;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7d58f7", new Object[]{this, str});
        } else if (xv8.g(3)) {
            Integer valueOf = Integer.valueOf(this.d);
            Integer valueOf2 = Integer.valueOf(this.e);
            Integer valueOf3 = Integer.valueOf(this.f21124a);
            Integer valueOf4 = Integer.valueOf(this.i);
            Integer valueOf5 = Integer.valueOf(this.c);
            int i = this.j;
            fiv.a(str, "%K(%K)/%K, pre-evicted:%K/%K, rate:%.1f%%, count:%d, hits:%d, misses:%d, evicts:%d", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, Float.valueOf((i * 100.0f) / (i + this.k)), Integer.valueOf(l()), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l));
        }
    }

    public final void i(dnh<K, V> dnhVar, boolean z, boolean z2, boolean z3) {
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8999abec", new Object[]{this, dnhVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        synchronized (this) {
            try {
                if (z == dnhVar.h) {
                    z4 = false;
                }
                if (z4) {
                    dnhVar.h = z;
                    if (z) {
                        this.i += dnhVar.c;
                    } else {
                        this.i -= dnhVar.c;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4 && z2) {
            u(z, dnhVar.f17966a, dnhVar.b, z3);
        }
    }

    public final void j() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2597443d", new Object[]{this});
            return;
        }
        if (this.c < this.f21124a) {
            z = true;
        }
        fpm.b(z, "MAX_PRE_EVICTED_SIZE(" + this.c + ") must lower than MAX_LIMIT_SIZE(" + this.f21124a + f7l.BRACKET_END_STR);
    }

    public final synchronized boolean k(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, k})).booleanValue();
        }
        return this.f.containsKey(k);
    }

    public final synchronized int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue();
        }
        return this.f.size();
    }

    public int m(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534785cd", new Object[]{this, v})).intValue();
        }
        return 1;
    }

    public final synchronized float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("656a8faf", new Object[]{this})).floatValue();
        }
        return this.b / this.f21124a;
    }

    public final void o(dnh<K, V> dnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8587ec", new Object[]{this, dnhVar});
            return;
        }
        dnh<K, V> dnhVar2 = this.h;
        if (dnhVar2 != null) {
            dnhVar.a(dnhVar2);
        }
        B(dnhVar, true);
    }

    public final void p(dnh<K, V> dnhVar) {
        dnh<K, V> dnhVar2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f88a47", new Object[]{this, dnhVar});
            return;
        }
        dnh<K, V> dnhVar3 = this.g;
        if (dnhVar3 != null) {
            dnhVar.a(dnhVar3);
        } else {
            dnhVar.e = dnhVar;
            dnhVar.f = dnhVar;
        }
        if (this.h == this.g) {
            z = true;
        }
        D(dnhVar, true);
        int i = this.e;
        if (i > this.b && (dnhVar2 = this.h) != null) {
            if (z && dnhVar2.e != dnhVar2) {
                this.e = i - dnhVar2.c;
                dnhVar2.g = true;
            }
            A(dnhVar2.e);
        }
    }

    public final synchronized int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc81b224", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final void r(dnh<K, V> dnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08ec8e2", new Object[]{this, dnhVar});
        } else if (dnhVar != null) {
            this.d += dnhVar.c;
        }
    }

    @Override // tb.vmh
    public final V remove(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, k});
        }
        return x(k, true);
    }

    @Override // tb.vmh
    public final synchronized int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final void t(boolean z, dnh<K, V> dnhVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d68b2b9", new Object[]{this, new Boolean(z), dnhVar, new Boolean(z2)});
            return;
        }
        i(dnhVar, false, z2, true);
        c(z, dnhVar.f17966a, dnhVar.b);
    }

    public void u(boolean z, K k, V v, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acb90c", new Object[]{this, new Boolean(z), k, v, new Boolean(z2)});
        }
    }

    public final void v(dnh<K, V> dnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7deb3d", new Object[]{this, dnhVar});
        } else if (dnhVar != null) {
            int i = this.d;
            int i2 = dnhVar.c;
            this.d = i - i2;
            if (!dnhVar.g) {
                this.e -= i2;
            }
        }
    }

    public final synchronized void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574b0da8", new Object[]{this, new Boolean(z)});
            return;
        }
        dnh<K, V> dnhVar = this.g;
        if (dnhVar != null && (z || this.d > this.m)) {
            dnh<K, V> dnhVar2 = dnhVar.e;
            dnh<K, V> dnhVar3 = dnhVar2;
            while (this.i < this.c) {
                if (dnhVar3.d < 2) {
                    i(dnhVar3, true, true, false);
                }
                dnhVar3 = dnhVar3.e;
                if (dnhVar3 == dnhVar2) {
                    break;
                }
            }
            this.m = this.d;
        }
    }

    public V x(K k, boolean z) {
        dnh<K, V> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("b5f4945", new Object[]{this, k, new Boolean(z)});
        }
        synchronized (this) {
            try {
                remove = this.f.remove(k);
                if (remove != null) {
                    remove.d = -1;
                    if (remove.e != null) {
                        y(remove);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove == null) {
            return null;
        }
        t(false, remove, z);
        return remove.b;
    }

    public final void y(dnh<K, V> dnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45f3d1fe", new Object[]{this, dnhVar});
            return;
        }
        dnh<K, V> dnhVar2 = dnhVar.f;
        if (dnhVar2 == dnhVar) {
            C(null);
            A(null);
        } else {
            dnhVar2.e = dnhVar.e;
            dnhVar.e.f = dnhVar2;
            if (this.g == dnhVar) {
                C(dnhVar.f);
            }
            if (this.h == dnhVar) {
                A(dnhVar.f);
            }
        }
        v(dnhVar);
    }

    public synchronized String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("109fe245", new Object[]{this});
        }
        return String.format(Locale.getDefault(), "[HotEndLruCache] %d/%d, hotSize:%d, preEvicted:%d, count:%d, hits:%d, misses:%d, evicts:%d", Integer.valueOf(this.d), Integer.valueOf(this.f21124a), Integer.valueOf(this.e), Integer.valueOf(this.i), Integer.valueOf(l()), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l));
    }
}
