package com.alibaba.ability.impl.memkvstorage;

import android.os.SystemClock;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import tb.ckf;
import tb.eji;
import tb.njg;
import tb.t2o;
import tb.uj3;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class MemStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final MemStorage INSTANCE;
    public static final int MAX_LRU_CACHE_SIZE = 1048576;
    public static final int MAX_TTL = 100000;

    /* renamed from: a  reason: collision with root package name */
    public static final eji f1972a = new eji("mega-mem-storage", 1);
    public static final Object b = new Object();
    public static final Map<String, a> c = new LinkedHashMap();
    public static final njg d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Future<Object> f1973a;
        private long b;
        private final String c;
        private final Object d;
        private final boolean e;

        static {
            t2o.a(117440516);
        }

        public a(String str, Object obj, boolean z) {
            ckf.g(str, "key");
            ckf.g(obj, "value");
            this.c = str;
            this.d = obj;
            this.e = z;
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
                return;
            }
            Future<Object> future = this.f1973a;
            if (future != null) {
                future.cancel(true);
            }
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7906fbc3", new Object[]{this})).booleanValue();
            }
            return this.e;
        }

        public final long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("219ac31", new Object[]{this})).longValue();
            }
            return this.b - SystemClock.elapsedRealtime();
        }

        public final Object d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
            }
            return this.d;
        }

        public final void e(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bd4b333", new Object[]{this, new Long(j)});
                return;
            }
            this.b = SystemClock.elapsedRealtime() + j;
            this.f1973a = eji.j(MemStorage.c(MemStorage.INSTANCE), this, j, null, 4, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MemStorage memStorage = MemStorage.INSTANCE;
            synchronized (MemStorage.a(memStorage)) {
                try {
                    if (SystemClock.elapsedRealtime() >= this.b) {
                        MemStorage.b(memStorage).remove(this.c);
                    }
                    xhv xhvVar = xhv.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final /* synthetic */ Object a(MemStorage memStorage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("775f59c0", new Object[]{memStorage});
        }
        return b;
    }

    public static final /* synthetic */ Map b(MemStorage memStorage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da3f19ac", new Object[]{memStorage});
        }
        return c;
    }

    public static final /* synthetic */ eji c(MemStorage memStorage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("67b4889d", new Object[]{memStorage});
        }
        return f1972a;
    }

    public static /* synthetic */ Object f(MemStorage memStorage, String str, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("12d0fdb2", new Object[]{memStorage, str, new Boolean(z), new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return memStorage.e(str, z);
    }

    public final int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd1d33d2", new Object[]{this, str})).intValue();
        }
        ckf.g(str, "data");
        byte[] bytes = str.getBytes(uj3.UTF_8);
        ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes.length;
    }

    public final Object e(String str, boolean z) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5f9ae5b8", new Object[]{this, str, new Boolean(z)});
        }
        ckf.g(str, "key");
        synchronized (b) {
            try {
                Map<String, a> map = c;
                a aVar = (a) ((LinkedHashMap) map).get(str);
                if (aVar != null) {
                    if (!z && aVar.b()) {
                        map.remove(str);
                    }
                    obj = aVar.d();
                    if (obj != null) {
                    }
                }
                obj = INSTANCE.h().get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final long g(String str) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9472d7e8", new Object[]{this, str})).longValue();
        }
        ckf.g(str, "key");
        synchronized (b) {
            a aVar = (a) ((LinkedHashMap) c).get(str);
            if (aVar != null) {
                j = aVar.c();
            } else {
                j = 0;
            }
        }
        return j;
    }

    public final LruCache<String, Object> h() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("1c91885b", new Object[]{this});
        } else {
            value = d.getValue();
        }
        return (LruCache) value;
    }

    public final boolean i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a837f542", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j <= 0) {
            return true;
        }
        return false;
    }

    public final boolean j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64a649da", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (j > 100000) {
            return true;
        }
        return false;
    }

    public final Object k(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96bdbb2a", new Object[]{this, str});
        }
        ckf.g(str, "key");
        synchronized (b) {
            try {
                a remove = c.remove(str);
                if (remove != null) {
                    remove.a();
                    obj = remove.d();
                    if (obj != null) {
                    }
                }
                obj = INSTANCE.h().remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean m(String str, long j) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0056d60", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        ckf.g(str, "key");
        if (i(j)) {
            return false;
        }
        synchronized (b) {
            MemStorage memStorage = INSTANCE;
            if (memStorage.j(j)) {
                Map<String, a> map = c;
                a aVar2 = (a) ((LinkedHashMap) map).get(str);
                if (aVar2 == null) {
                    return false;
                }
                memStorage.h().put(str, aVar2.d());
                aVar2.a();
                map.remove(str);
            } else {
                Map<String, a> map2 = c;
                a aVar3 = (a) ((LinkedHashMap) map2).get(str);
                if (aVar3 != null) {
                    aVar3.e(j);
                    aVar = aVar3;
                } else {
                    Object obj = memStorage.h().get(str);
                    if (obj != null) {
                        a aVar4 = new a(str, obj, false);
                        map2.put(str, aVar4);
                        aVar4.e(j);
                        memStorage.h().remove(str);
                        aVar = obj;
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean l(String str, Object obj, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4e065d6", new Object[]{this, str, obj, new Long(j), new Boolean(z)})).booleanValue();
        }
        ckf.g(str, "key");
        ckf.g(obj, "value");
        if (i(j)) {
            return false;
        }
        synchronized (b) {
            try {
                MemStorage memStorage = INSTANCE;
                if (memStorage.j(j)) {
                    Map<String, a> map = c;
                    a aVar = (a) ((LinkedHashMap) map).get(str);
                    if (aVar != null) {
                        aVar.a();
                        map.remove(str);
                    }
                    memStorage.h().put(str, obj);
                } else {
                    if (memStorage.h().get(str) != null) {
                        memStorage.h().remove(str);
                    }
                    a aVar2 = new a(str, obj, z);
                    Map<String, a> map2 = c;
                    a aVar3 = (a) ((LinkedHashMap) map2).get(str);
                    if (aVar3 != null) {
                        aVar3.a();
                    }
                    map2.put(str, aVar2);
                    aVar2.e(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    static {
        t2o.a(117440515);
        MemStorage memStorage = new MemStorage();
        INSTANCE = memStorage;
        d = kotlin.a.b(new MemStorage$lruMap$2(memStorage));
    }
}
