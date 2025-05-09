package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class wmh<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f30777a;
    public int b;
    public final int c;
    public int d;
    public int e;

    static {
        t2o.a(961544376);
    }

    public wmh(int i) {
        if (i > 0) {
            this.c = i;
            this.f30777a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V a(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("863f8c73", new Object[]{this, k});
        }
        return null;
    }

    public void b(boolean z, K k, V v, V v2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), k, v, v2});
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e7291f", new Object[]{this});
        } else {
            l(-1);
        }
    }

    public final boolean g(qpm<V> qpmVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c69858b3", new Object[]{this, qpmVar})).booleanValue();
        }
        if (qpmVar == null) {
            return false;
        }
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f30777a.keySet()).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((ho8) qpmVar).a(d(next))) {
                        f(next);
                        z = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final int h(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c71ae057", new Object[]{this, k, v})).intValue();
        }
        int j = j(k, v);
        if (j >= 0) {
            return j;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int j(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, k, v})).intValue();
        }
        return 1;
    }

    public final synchronized Map<K, V> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("72c80b40", new Object[]{this});
        }
        return new LinkedHashMap(this.f30777a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(int r6) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.wmh.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = "bfac4e3e"
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4 = 0
            r6[r4] = r5
            r6[r0] = r3
            r1.ipc$dispatch(r2, r6)
            return
        L_0x001a:
            monitor-enter(r5)
            int r1 = r5.b     // Catch: all -> 0x002c
            if (r1 < 0) goto L_0x006d
            java.util.LinkedHashMap<K, V> r1 = r5.f30777a     // Catch: all -> 0x002c
            boolean r1 = r1.isEmpty()     // Catch: all -> 0x002c
            if (r1 == 0) goto L_0x002e
            int r1 = r5.b     // Catch: all -> 0x002c
            if (r1 != 0) goto L_0x006d
            goto L_0x002e
        L_0x002c:
            r6 = move-exception
            goto L_0x008a
        L_0x002e:
            int r1 = r5.b     // Catch: all -> 0x002c
            if (r1 <= r6) goto L_0x006b
            java.util.LinkedHashMap<K, V> r1 = r5.f30777a     // Catch: all -> 0x002c
            boolean r1 = r1.isEmpty()     // Catch: all -> 0x002c
            if (r1 == 0) goto L_0x003b
            goto L_0x006b
        L_0x003b:
            java.util.LinkedHashMap<K, V> r1 = r5.f30777a     // Catch: all -> 0x002c
            java.util.Set r1 = r1.entrySet()     // Catch: all -> 0x002c
            java.util.Iterator r1 = r1.iterator()     // Catch: all -> 0x002c
            java.lang.Object r1 = r1.next()     // Catch: all -> 0x002c
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: all -> 0x002c
            if (r1 != 0) goto L_0x004f
            monitor-exit(r5)     // Catch: all -> 0x002c
            return
        L_0x004f:
            java.lang.Object r2 = r1.getKey()     // Catch: all -> 0x002c
            java.lang.Object r1 = r1.getValue()     // Catch: all -> 0x002c
            java.util.LinkedHashMap<K, V> r3 = r5.f30777a     // Catch: all -> 0x002c
            r3.remove(r2)     // Catch: all -> 0x002c
            int r3 = r5.b     // Catch: all -> 0x002c
            int r4 = r5.h(r2, r1)     // Catch: all -> 0x002c
            int r3 = r3 - r4
            r5.b = r3     // Catch: all -> 0x002c
            monitor-exit(r5)     // Catch: all -> 0x002c
            r3 = 0
            r5.b(r0, r2, r1, r3)
            goto L_0x001a
        L_0x006b:
            monitor-exit(r5)     // Catch: all -> 0x002c
            return
        L_0x006d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: all -> 0x002c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x002c
            r0.<init>()     // Catch: all -> 0x002c
            java.lang.Class<tb.wmh> r1 = tb.wmh.class
            java.lang.String r1 = r1.getName()     // Catch: all -> 0x002c
            r0.append(r1)     // Catch: all -> 0x002c
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: all -> 0x002c
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x002c
            r6.<init>(r0)     // Catch: all -> 0x002c
            throw r6     // Catch: all -> 0x002c
        L_0x008a:
            monitor-exit(r5)     // Catch: all -> 0x002c
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wmh.l(int):void");
    }

    public final synchronized String toString() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int i2 = this.d;
        int i3 = this.e + i2;
        if (i3 != 0) {
            i = (i2 * 100) / i3;
        } else {
            i = 0;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(i));
    }

    public final V e(K k, V v) {
        V put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
        }
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.b += h(k, v);
                put = this.f30777a.put(k, v);
                if (put != null) {
                    this.b -= h(k, put);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            b(false, k, put, v);
        }
        l(this.c);
        return put;
    }

    public final V f(K k) {
        V remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, k});
        }
        if (k != null) {
            synchronized (this) {
                try {
                    remove = this.f30777a.remove(k);
                    if (remove != null) {
                        this.b -= h(k, remove);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (remove != null) {
                b(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public final V d(K k) {
        V put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, k});
        }
        if (k != null) {
            synchronized (this) {
                try {
                    V v = this.f30777a.get(k);
                    if (v != null) {
                        this.d++;
                        return v;
                    }
                    this.e++;
                    V a2 = a(k);
                    if (a2 == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            put = this.f30777a.put(k, a2);
                            if (put != null) {
                                this.f30777a.put(k, put);
                            } else {
                                this.b += h(k, a2);
                            }
                        } finally {
                        }
                    }
                    if (put != null) {
                        b(false, k, a2, put);
                        return put;
                    }
                    l(this.c);
                    return a2;
                } finally {
                }
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }
}
