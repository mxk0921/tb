package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.weex.common.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ1\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\b\u0010\u0017\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001a\u0010\u000fJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u001fJ\u0019\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010+R \u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010+R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010+R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010+R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010+¨\u00062"}, d2 = {"Landroidx/collection/LruCache;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "key", "value", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "Ltb/xhv;", Constants.Name.RESIZE, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "evictAll", "()V", "size", "()I", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", TLogTracker.LEVEL_INFO, "Landroidx/collection/internal/LruHashMap;", "map", "Landroidx/collection/internal/LruHashMap;", "Landroidx/collection/internal/Lock;", OConstant.DIMEN_FILE_LOCK, "Landroidx/collection/internal/Lock;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LruCache<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        this.maxSize = i;
        if (!(i > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        this.map = new LruHashMap<>(0, 0.75f);
        this.lock = new Lock();
    }

    private final int safeSizeOf(K k, V v) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c71ae057", new Object[]{this, k, v})).intValue();
        }
        int sizeOf = sizeOf(k, v);
        if (sizeOf < 0) {
            z = false;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalStateException("Negative size: " + k + '=' + v);
        }
        return sizeOf;
    }

    public V create(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("863f8c73", new Object[]{this, k});
        }
        ckf.g(k, "key");
        return null;
    }

    public final int createCount() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f92b906d", new Object[]{this})).intValue();
        }
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean z, K k, V v, V v2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), k, v, v2});
            return;
        }
        ckf.g(k, "key");
        ckf.g(v, "oldValue");
    }

    public final void evictAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e7291f", new Object[]{this});
        } else {
            trimToSize(-1);
        }
    }

    public final int evictionCount() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89ea21aa", new Object[]{this})).intValue();
        }
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final int hitCount() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab3197b6", new Object[]{this})).intValue();
        }
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8be17f", new Object[]{this})).intValue();
        }
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d528c6d", new Object[]{this})).intValue();
        }
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final int putCount() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e37723ba", new Object[]{this})).intValue();
        }
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final int size() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("72c80b40", new Object[]{this});
        }
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.getEntries().size());
            Iterator<T> it = this.map.getEntries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        synchronized (this.lock) {
            try {
                int i2 = this.hitCount;
                int i3 = this.missCount + i2;
                if (i3 != 0) {
                    i = (i2 * 100) / i3;
                }
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:8:0x001d, B:10:0x0021, B:12:0x0029, B:20:0x0035, B:21:0x003a, B:23:0x003e, B:26:0x0047, B:30:0x0057), top: B:36:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:8:0x001d, B:10:0x0021, B:12:0x0029, B:20:0x0035, B:21:0x003a, B:23:0x003e, B:26:0x0047, B:30:0x0057), top: B:36:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.collection.LruCache.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.String r3 = "bfac4e3e"
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r8)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            r8[r0] = r4
            r2.ipc$dispatch(r3, r8)
            return
        L_0x001a:
            androidx.collection.internal.Lock r2 = r7.lock
            monitor-enter(r2)
            int r3 = r7.size     // Catch: all -> 0x002e
            if (r3 < 0) goto L_0x0032
            androidx.collection.internal.LruHashMap<K, V> r3 = r7.map     // Catch: all -> 0x002e
            boolean r3 = r3.isEmpty()     // Catch: all -> 0x002e
            if (r3 == 0) goto L_0x0030
            int r3 = r7.size     // Catch: all -> 0x002e
            if (r3 != 0) goto L_0x0032
            goto L_0x0030
        L_0x002e:
            r8 = move-exception
            goto L_0x007a
        L_0x0030:
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 != 0) goto L_0x003a
            java.lang.String r3 = "LruCache.sizeOf() is reporting inconsistent results!"
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalStateException(r3)     // Catch: all -> 0x002e
        L_0x003a:
            int r3 = r7.size     // Catch: all -> 0x002e
            if (r3 <= r8) goto L_0x0078
            androidx.collection.internal.LruHashMap<K, V> r3 = r7.map     // Catch: all -> 0x002e
            boolean r3 = r3.isEmpty()     // Catch: all -> 0x002e
            if (r3 == 0) goto L_0x0047
            goto L_0x0078
        L_0x0047:
            androidx.collection.internal.LruHashMap<K, V> r3 = r7.map     // Catch: all -> 0x002e
            java.util.Set r3 = r3.getEntries()     // Catch: all -> 0x002e
            java.lang.Object r3 = tb.i04.b0(r3)     // Catch: all -> 0x002e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: all -> 0x002e
            if (r3 != 0) goto L_0x0057
            monitor-exit(r2)
            return
        L_0x0057:
            java.lang.Object r4 = r3.getKey()     // Catch: all -> 0x002e
            java.lang.Object r3 = r3.getValue()     // Catch: all -> 0x002e
            androidx.collection.internal.LruHashMap<K, V> r5 = r7.map     // Catch: all -> 0x002e
            r5.remove(r4)     // Catch: all -> 0x002e
            int r5 = r7.size     // Catch: all -> 0x002e
            int r6 = r7.safeSizeOf(r4, r3)     // Catch: all -> 0x002e
            int r5 = r5 - r6
            r7.size = r5     // Catch: all -> 0x002e
            int r5 = r7.evictionCount     // Catch: all -> 0x002e
            int r5 = r5 + r0
            r7.evictionCount = r5     // Catch: all -> 0x002e
            monitor-exit(r2)
            r2 = 0
            r7.entryRemoved(r0, r4, r3, r2)
            goto L_0x001a
        L_0x0078:
            monitor-exit(r2)
            return
        L_0x007a:
            monitor-exit(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }

    public final V remove(K k) {
        V remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("5a7e4beb", new Object[]{this, k});
        }
        ckf.g(k, "key");
        synchronized (this.lock) {
            try {
                remove = this.map.remove(k);
                if (remove != null) {
                    this.size -= safeSizeOf(k, remove);
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            entryRemoved(false, k, remove, null);
        }
        return remove;
    }

    public int sizeOf(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, k, v})).intValue();
        }
        ckf.g(k, "key");
        ckf.g(v, "value");
        return 1;
    }

    public final V get(K k) {
        V put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, k});
        }
        ckf.g(k, "key");
        synchronized (this.lock) {
            V v = this.map.get(k);
            if (v != null) {
                this.hitCount++;
                return v;
            }
            this.missCount++;
            V create = create(k);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    put = this.map.put(k, create);
                    if (put != null) {
                        this.map.put(k, put);
                    } else {
                        this.size += safeSizeOf(k, create);
                        xhv xhvVar = xhv.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                entryRemoved(false, k, create, put);
                return put;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final V put(K k, V v) {
        V put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("dbe24724", new Object[]{this, k, v});
        }
        ckf.g(k, "key");
        ckf.g(v, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(k, v);
                put = this.map.put(k, v);
                if (put != null) {
                    this.size -= safeSizeOf(k, put);
                }
                xhv xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            entryRemoved(false, k, put, v);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public void resize(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c997b328", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0) {
            z = false;
        }
        if (!z) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i;
            xhv xhvVar = xhv.INSTANCE;
        }
        trimToSize(i);
    }
}
