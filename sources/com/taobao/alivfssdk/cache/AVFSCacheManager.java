package com.taobao.alivfssdk.cache;

import android.app.Application;
import android.content.Context;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.clf;
import tb.dp;
import tb.np;
import tb.op;
import tb.pp;
import tb.t2o;
import tb.wp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AVFSCacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int AVFS_MAX_CACHE_NUMBER = 5;
    private static final String TAG = "AVFSCacheManager";
    private static volatile AVFSCacheManager sInstance;
    private final LruCache<String, np> mCaches;
    private final ConcurrentHashMap<String, op> mConfigs = new ConcurrentHashMap<>();
    private final Context mContext;

    static {
        t2o.a(374341653);
    }

    public AVFSCacheManager() {
        Application e = dp.h().e();
        Context applicationContext = e.getApplicationContext();
        if (applicationContext == null) {
            this.mContext = e;
        } else {
            this.mContext = applicationContext;
        }
        this.mCaches = new LruCache<String, np>(this, 5) { // from class: com.taobao.alivfssdk.cache.AVFSCacheManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/cache/AVFSCacheManager$1");
            }

            /* renamed from: a */
            public void entryRemoved(boolean z, String str, np npVar, np npVar2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e24bbabb", new Object[]{this, new Boolean(z), str, npVar, npVar2});
                }
            }
        };
    }

    private np createCache(File file, String str) {
        np npVar;
        File file2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np) ipChange.ipc$dispatch("7358c031", new Object[]{this, file, str});
        }
        synchronized (this.mCaches) {
            try {
                npVar = this.mCaches.get(str);
                if (npVar == null) {
                    if (file == null) {
                        file2 = null;
                    } else {
                        file2 = new File(file, str);
                    }
                    npVar = new np(str, file2);
                    op opVar = this.mConfigs.get(str);
                    if (opVar != null) {
                        npVar.L(opVar);
                    }
                    this.mCaches.put(str, npVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return npVar;
    }

    public static AVFSCacheManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AVFSCacheManager) ipChange.ipc$dispatch("71298fbc", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (AVFSCacheManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new AVFSCacheManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public long approximateRemovableSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd4a2943", new Object[]{this})).longValue();
        }
        np defaultCache = defaultCache();
        if (defaultCache == null) {
            return 0L;
        }
        op opVar = defaultCache.e;
        return opVar.b + opVar.f25538a.longValue() + defaultCache.e.c;
    }

    public np cacheForModule(String str) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np) ipChange.ipc$dispatch("dbf8095b", new Object[]{this, str});
        }
        if (str != null) {
            try {
                file = getRootDir();
            } catch (IOException e) {
                pp.d(TAG, e, new Object[0]);
                file = null;
            }
            return createCache(file, str);
        }
        throw new IllegalArgumentException("moduleName cannot be null");
    }

    public np defaultCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np) ipChange.ipc$dispatch("9f58a797", new Object[]{this});
        }
        return cacheForModule("AVFSDefaultModule");
    }

    public LruCache<String, np> getCaches() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("cc41f2f9", new Object[]{this});
        }
        return this.mCaches;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public File getRootDir() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2d7a9c71", new Object[]{this});
        }
        File a2 = wp.a(this.mContext);
        clf.a(a2);
        return a2;
    }

    public void putConfigs(Map<? extends String, ? extends op> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27ffd7c", new Object[]{this, map});
        } else {
            this.mConfigs.putAll(map);
        }
    }

    public void removeCacheForModule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c685e428", new Object[]{this, str});
        } else if (str != null) {
            synchronized (this.mCaches) {
                try {
                    np remove = this.mCaches.remove(str);
                    if (remove != null) {
                        remove.clearAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            throw new IllegalArgumentException("moduleName cannot be null");
        }
    }

    public np cacheForModule(String str, boolean z) {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (np) ipChange.ipc$dispatch("fb94788f", new Object[]{this, str, new Boolean(z)});
        }
        if (str != null) {
            try {
                file = getRootDir();
            } catch (IOException e) {
                pp.d(TAG, e, new Object[0]);
                file = null;
            }
            return createCache(file, str);
        }
        throw new IllegalArgumentException("moduleName cannot be null");
    }
}
