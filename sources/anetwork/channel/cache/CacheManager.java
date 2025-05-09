package anetwork.channel.cache;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static List<CacheItem> cacheList = new ArrayList();
    private static final ReentrantReadWriteLock lock;
    private static final ReentrantReadWriteLock.ReadLock readLock;
    private static final ReentrantReadWriteLock.WriteLock writeLock;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class CacheItem implements Comparable<CacheItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Cache cache;
        public final CachePrediction prediction;
        public final int priority;

        static {
            t2o.a(607126028);
        }

        public CacheItem(Cache cache, CachePrediction cachePrediction, int i) {
            this.cache = cache;
            this.prediction = cachePrediction;
            this.priority = i;
        }

        public int compareTo(CacheItem cacheItem) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e4fb7f6", new Object[]{this, cacheItem})).intValue() : this.priority - cacheItem.priority;
        }
    }

    static {
        t2o.a(607126027);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        lock = reentrantReadWriteLock;
        readLock = reentrantReadWriteLock.readLock();
        writeLock = reentrantReadWriteLock.writeLock();
    }

    public static void addCache(Cache cache, CachePrediction cachePrediction, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b0c1fa", new Object[]{cache, cachePrediction, new Integer(i)});
            return;
        }
        try {
            if (cache == null) {
                throw new IllegalArgumentException("cache is null");
            } else if (cachePrediction != null) {
                ReentrantReadWriteLock.WriteLock writeLock2 = writeLock;
                writeLock2.lock();
                cacheList.add(new CacheItem(cache, cachePrediction, i));
                Collections.sort(cacheList);
                writeLock2.unlock();
            } else {
                throw new IllegalArgumentException("prediction is null");
            }
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    public static void clearAllCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4208d55", new Object[0]);
            return;
        }
        ALog.w("anet.CacheManager", "clearAllCache", null, new Object[0]);
        for (CacheItem cacheItem : cacheList) {
            try {
                cacheItem.cache.clear();
            } catch (Exception unused) {
            }
        }
    }

    public static Cache getCache(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cache) ipChange.ipc$dispatch("fec52236", new Object[]{str, map});
        }
        try {
            readLock.lock();
            for (CacheItem cacheItem : cacheList) {
                if (cacheItem.prediction.handleCache(str, map)) {
                    return cacheItem.cache;
                }
            }
            readLock.unlock();
            return null;
        } finally {
            readLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        r0.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void removeCache(anetwork.channel.cache.Cache r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = anetwork.channel.cache.CacheManager.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "8cef9e0d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = anetwork.channel.cache.CacheManager.writeLock     // Catch: all -> 0x0031
            r0.lock()     // Catch: all -> 0x0031
            java.util.List<anetwork.channel.cache.CacheManager$CacheItem> r0 = anetwork.channel.cache.CacheManager.cacheList     // Catch: all -> 0x0031
            java.util.ListIterator r0 = r0.listIterator()     // Catch: all -> 0x0031
        L_0x001d:
            boolean r1 = r0.hasNext()     // Catch: all -> 0x0031
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()     // Catch: all -> 0x0031
            anetwork.channel.cache.CacheManager$CacheItem r1 = (anetwork.channel.cache.CacheManager.CacheItem) r1     // Catch: all -> 0x0031
            anetwork.channel.cache.Cache r1 = r1.cache     // Catch: all -> 0x0031
            if (r1 != r4) goto L_0x001d
            r0.remove()     // Catch: all -> 0x0031
            goto L_0x0033
        L_0x0031:
            r4 = move-exception
            goto L_0x0039
        L_0x0033:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = anetwork.channel.cache.CacheManager.writeLock
            r4.unlock()
            return
        L_0x0039:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = anetwork.channel.cache.CacheManager.writeLock
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.cache.CacheManager.removeCache(anetwork.channel.cache.Cache):void");
    }
}
