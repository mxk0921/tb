package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.ParameterizedType;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class w3o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger j = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f30433a;
    public int b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile int e;
    public ybj f;
    public Set<p3o> g;
    public mzm h;
    public final boolean i;

    public w3o(boolean z) {
        this.b = 2;
        AtomicInteger atomicInteger = j;
        synchronized (atomicInteger) {
            try {
                if (atomicInteger.get() < 0) {
                    atomicInteger.set(1);
                }
                this.f30433a = atomicInteger.getAndIncrement();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = z;
    }

    public final void a() {
        HashSet<p3o> hashSet;
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75dbbae", new Object[]{this});
            return;
        }
        synchronized (this) {
            try {
                Set<p3o> set = this.g;
                if (set == null || (size = ((HashSet) set).size()) <= 0) {
                    hashSet = null;
                } else {
                    hashSet = new HashSet(size);
                    hashSet.addAll(this.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hashSet != null) {
            for (p3o p3oVar : hashSet) {
                p3oVar.b(this);
            }
            hashSet.clear();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.d = true;
        ybj ybjVar = this.f;
        if (ybjVar != null) {
            ((a5o) ybjVar).T(this);
        }
        if (!k()) {
            c(true);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a1d6e4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        if (z) {
            a();
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return this.f30433a;
    }

    public abstract String e();

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2f1f4ee", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public mzm g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mzm) ipChange.ipc$dispatch("75a6afe4", new Object[]{this});
        }
        return this.h;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76bc04cb", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ce60987", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("109223ab", new Object[]{this})).booleanValue();
        }
        if (this.e == this.f30433a) {
            return true;
        }
        return false;
    }

    public synchronized void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.e = 0;
        Set<p3o> set = this.g;
        if (set != null) {
            ((HashSet) set).clear();
        }
    }

    public void n(ybj ybjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4d726f", new Object[]{this, ybjVar});
        } else {
            this.f = ybjVar;
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd90b974", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void p(mzm mzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9c8882", new Object[]{this, mzmVar});
        } else {
            this.h = mzmVar;
        }
    }

    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d7bb9f", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public abstract void r(w3o w3oVar);

    public synchronized boolean s(p3o p3oVar) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4eb51082", new Object[]{this, p3oVar})).booleanValue();
            }
            Set<p3o> set = this.g;
            if (set == null || !((HashSet) set).remove(p3oVar)) {
                z = false;
            }
            return z;
        }
    }

    public boolean l(p3o p3oVar) {
        boolean add;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1f5f2e9", new Object[]{this, p3oVar})).booleanValue();
        }
        if (this.i) {
            Class cls = (Class) ((ParameterizedType) p3oVar.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
            if (!cls.isInstance(this)) {
                throw new RuntimeException("this[" + getClass() + "] CANNOT be assigned to generic[" + cls + "] of RequestCancelListener");
            }
        }
        synchronized (this) {
            try {
                if (this.g == null) {
                    this.g = new HashSet();
                }
                add = this.g.add(p3oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return add;
    }

    public w3o() {
        this(true);
    }
}
