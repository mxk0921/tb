package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j6b<K, V> implements umh<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21792a;
    public int b;
    public int c;
    public int d;
    public final HashMap<K, enh<K, V>> e = new HashMap<>();
    public enh<K, V> f;
    public enh<K, V> g;
    public int h;
    public int i;

    static {
        t2o.a(374341666);
        t2o.a(374341682);
    }

    public j6b(int i, float f) {
        v(i, f);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2597443d", new Object[]{this});
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.e.clear();
        t(null);
        r(null);
        this.c = 0;
        this.d = 0;
        this.h = 0;
        this.i = 0;
    }

    public V c(K k) {
        enh<K, V> enhVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, k});
        }
        synchronized (this) {
            try {
                enhVar = this.e.get(k);
                if (enhVar != null) {
                    int i2 = enhVar.d;
                    if (i2 < 0) {
                        i = 1;
                    } else {
                        i = i2 + 1;
                    }
                    enhVar.d = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (enhVar == null) {
            return null;
        }
        k(false, enhVar, true);
        return enhVar.b;
    }

    public int d(V v) {
        throw null;
    }

    public final void e(enh<K, V> enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc166775", new Object[]{this, enhVar});
            return;
        }
        enh<K, V> enhVar2 = this.g;
        if (enhVar2 != null) {
            enhVar.a(enhVar2);
        }
        s(enhVar, true);
    }

    public final void f(enh<K, V> enhVar) {
        enh<K, V> enhVar2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd5833a", new Object[]{this, enhVar});
            return;
        }
        enh<K, V> enhVar3 = this.f;
        if (enhVar3 != null) {
            enhVar.a(enhVar3);
        } else {
            enhVar.e = enhVar;
            enhVar.f = enhVar;
        }
        if (this.g == this.f) {
            z = true;
        }
        u(enhVar, true);
        int i = this.d;
        if (i > this.b && (enhVar2 = this.g) != null) {
            if (z && enhVar2.e != enhVar2) {
                this.d = i - enhVar2.c;
                enhVar2.g = true;
            }
            r(enhVar2.e);
        }
    }

    public final void g(enh<K, V> enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef4fabf", new Object[]{this, enhVar});
        } else if (enhVar != null) {
            this.c += enhVar.c;
        }
    }

    public void h(boolean z, K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e8e7a6", new Object[]{this, new Boolean(z), k, v});
        }
    }

    public final void i(boolean z, enh<K, V> enhVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50db420e", new Object[]{this, new Boolean(z), enhVar, new Boolean(z2)});
            return;
        }
        k(false, enhVar, z2);
        h(z, enhVar.f18697a, enhVar.b);
    }

    public void j(boolean z, K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1e52c8", new Object[]{this, new Boolean(z), k, v});
        }
    }

    public final void k(boolean z, enh<K, V> enhVar, boolean z2) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e533b2c", new Object[]{this, new Boolean(z), enhVar, new Boolean(z2)});
            return;
        }
        synchronized (this) {
            try {
                if (z == enhVar.h) {
                    z3 = false;
                }
                if (z3) {
                    enhVar.h = z;
                    if (z) {
                        this.h += enhVar.c;
                    } else {
                        this.h -= enhVar.c;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3 && z2) {
            j(z, enhVar.f18697a, enhVar.b);
        }
    }

    public final void l(enh<K, V> enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4943f684", new Object[]{this, enhVar});
        } else if (enhVar != null) {
            int i = this.c;
            int i2 = enhVar.c;
            this.c = i - i2;
            if (!enhVar.g) {
                this.d -= i2;
            }
        }
    }

    public final synchronized void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574b0da8", new Object[]{this, new Boolean(z)});
            return;
        }
        enh<K, V> enhVar = this.f;
        if (enhVar != null && (z || this.c > this.i)) {
            enh<K, V> enhVar2 = enhVar.e;
            enh<K, V> enhVar3 = enhVar2;
            while (this.h < 0) {
                if (enhVar3.d < 2) {
                    k(true, enhVar3, true);
                }
                enhVar3 = enhVar3.e;
                if (enhVar3 == enhVar2) {
                    break;
                }
            }
            this.i = this.c;
        }
    }

    public boolean n(int i, K k, V v) {
        enh<K, V> put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5affebe9", new Object[]{this, new Integer(i), k, v})).booleanValue();
        }
        if (k == null || v == null) {
            return false;
        }
        enh<K, V> enhVar = new enh<>(k, v, d(v));
        if (i == 34) {
            enhVar.d = 2;
        }
        if (enhVar.c > this.f21792a) {
            return false;
        }
        synchronized (this) {
            try {
                put = this.e.put(k, enhVar);
                if (put != null) {
                    int i2 = put.d;
                    q(put);
                    enhVar.d = i2 + 1;
                }
            } finally {
            }
        }
        if (put != null) {
            i(true, put, true);
        }
        boolean w = w(this.f21792a - enhVar.c);
        synchronized (this) {
            try {
                if (!(this.f == null || this.g == null || !w)) {
                    e(enhVar);
                    g(enhVar);
                }
                f(enhVar);
                g(enhVar);
                if (this.g == null && this.c > this.b) {
                    r(this.f.e);
                }
            } finally {
            }
        }
        m(w);
        return true;
    }

    public final V o(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, k});
        }
        return p(k, true);
    }

    public V p(K k, boolean z) {
        enh<K, V> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("b5f4945", new Object[]{this, k, new Boolean(z)});
        }
        synchronized (this) {
            try {
                remove = this.e.remove(k);
                if (remove != null) {
                    remove.d = -1;
                    if (remove.e != null) {
                        q(remove);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove == null) {
            return null;
        }
        i(false, remove, z);
        return remove.b;
    }

    @Override // tb.umh
    public boolean put(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("360f65d2", new Object[]{this, k, v})).booleanValue();
        }
        return n(17, k, v);
    }

    public final void q(enh<K, V> enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7940c23", new Object[]{this, enhVar});
            return;
        }
        enh<K, V> enhVar2 = enhVar.f;
        if (enhVar2 == enhVar) {
            t(null);
            r(null);
        } else {
            enhVar2.e = enhVar.e;
            enhVar.e.f = enhVar2;
            if (this.f == enhVar) {
                t(enhVar.f);
            }
            if (this.g == enhVar) {
                r(enhVar.f);
            }
        }
        l(enhVar);
    }

    public final boolean r(enh<K, V> enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fdc79f6", new Object[]{this, enhVar})).booleanValue();
        }
        return s(enhVar, false);
    }

    public final boolean s(enh<K, V> enhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbb37726", new Object[]{this, enhVar, new Boolean(z)})).booleanValue();
        }
        this.g = enhVar;
        if (enhVar == null || this.f == enhVar) {
            return false;
        }
        if (!z && !enhVar.g) {
            this.d -= enhVar.c;
        }
        enhVar.g = true;
        return true;
    }

    public final void t(enh<K, V> enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf4ad1d", new Object[]{this, enhVar});
        } else {
            u(enhVar, false);
        }
    }

    public final void u(enh<K, V> enhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a1a957", new Object[]{this, enhVar, new Boolean(z)});
            return;
        }
        if (enhVar != null) {
            if (z || enhVar.g) {
                this.d += enhVar.c;
            }
            enhVar.g = false;
        }
        this.f = enhVar;
    }

    public void v(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695f1998", new Object[]{this, new Integer(i), new Float(f)});
        } else if (i < 2 || f < 0.0f || f >= 1.0f) {
            throw new RuntimeException("HotEndLruCache size parameters error");
        } else {
            synchronized (this) {
                try {
                    this.f21792a = i;
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
            a();
            w(this.f21792a);
        }
    }

    public final boolean w(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66d7df43", new Object[]{this, new Integer(i)})).booleanValue();
        }
        enh<K, V> enhVar = null;
        while (true) {
            synchronized (this) {
                try {
                    if (this.c <= i) {
                        break;
                    }
                    while (true) {
                        enhVar = this.f.e;
                        if (enhVar.d < 2) {
                            break;
                        }
                        enhVar.d = 1;
                        t(enhVar);
                        while (true) {
                            int i2 = this.b;
                            if (i2 <= 0 || this.d <= i2 || !r(this.g.e)) {
                            }
                        }
                    }
                    this.e.remove(enhVar.f18697a);
                    q(enhVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            i(false, enhVar, true);
        }
        if (enhVar == null) {
            z = false;
        }
        return z;
    }
}
