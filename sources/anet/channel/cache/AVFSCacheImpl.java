package anet.channel.cache;

import android.taobao.windvane.jsbridge.api.WVFile;
import android.text.TextUtils;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.cache.Cache;
import anetwork.channel.cache.CacheConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import tb.fdb;
import tb.np;
import tb.op;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AVFSCacheImpl implements Cache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.AVFSCacheImpl";
    private static boolean isAvfsCacheExist;
    private static Object nullAllObjectRemoveCallback;
    private static Object nullObjectRemoveCallback;
    private static Object nullObjectSetCallback;
    private fdb avfsCacheOperator;
    private final CacheConfig cacheConfig;
    private final String moduleName;

    public AVFSCacheImpl() {
        this(null);
    }

    private fdb getFileCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("fb72b3d7", new Object[]{this});
        }
        return this.avfsCacheOperator;
    }

    public void initialize() {
        np cacheForModule;
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        } else if (isAvfsCacheExist && (cacheForModule = AVFSCacheManager.getInstance().cacheForModule(this.moduleName)) != null) {
            if (this.cacheConfig.getCacheSize() <= 0 || this.cacheConfig.getCacheSize() >= 104857600) {
                j = WVFile.FILE_MAX_SIZE;
            } else {
                j = this.cacheConfig.getCacheSize();
            }
            op opVar = new op();
            opVar.f25538a = Long.valueOf(j);
            opVar.b = 1048576L;
            cacheForModule.L(opVar);
            this.avfsCacheOperator = cacheForModule.w();
        }
    }

    public AVFSCacheImpl(CacheConfig cacheConfig) {
        cacheConfig = cacheConfig == null ? CacheConfig.create("", WVFile.FILE_MAX_SIZE) : cacheConfig;
        this.cacheConfig = cacheConfig;
        String str = "networksdk.httpcache";
        this.moduleName = !TextUtils.isEmpty(cacheConfig.getBizName()) ? StringUtils.concatString(str, ".", cacheConfig.getBizName()) : str;
    }

    @Override // anetwork.channel.cache.Cache
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else if (isAvfsCacheExist) {
            try {
                fdb fileCache = getFileCache();
                if (fileCache != null) {
                    fileCache.E((fdb.a) nullAllObjectRemoveCallback);
                }
            } catch (Exception e) {
                ALog.e(TAG, "clear cache failed", null, e, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public Cache.Entry get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cache.Entry) ipChange.ipc$dispatch("9b1dbdc9", new Object[]{this, str});
        }
        if (!isAvfsCacheExist) {
            return null;
        }
        try {
            fdb fileCache = getFileCache();
            if (fileCache != null) {
                return (Cache.Entry) fileCache.d0(StringUtils.md5ToHex(str));
            }
        } catch (Exception e) {
            ALog.e(TAG, "get cache failed", null, e, new Object[0]);
        }
        return null;
    }

    @Override // anetwork.channel.cache.Cache
    public void put(String str, Cache.Entry entry) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f226c8da", new Object[]{this, str, entry});
        } else if (isAvfsCacheExist) {
            try {
                fdb fileCache = getFileCache();
                if (fileCache != null) {
                    fileCache.m0(StringUtils.md5ToHex(str), entry, (fdb.i) nullObjectSetCallback);
                }
            } catch (Exception e) {
                ALog.e(TAG, "put cache failed", null, e, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.cache.Cache
    public void remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
        } else if (isAvfsCacheExist) {
            try {
                fdb fileCache = getFileCache();
                if (fileCache != null) {
                    fileCache.D(StringUtils.md5ToHex(str), (fdb.g) nullObjectRemoveCallback);
                }
            } catch (Exception e) {
                ALog.e(TAG, "remove cache failed", null, e, new Object[0]);
            }
        }
    }

    static {
        t2o.a(607125571);
        t2o.a(607126022);
        isAvfsCacheExist = true;
        nullObjectSetCallback = null;
        nullObjectRemoveCallback = null;
        nullAllObjectRemoveCallback = null;
        try {
            IpChange ipChange = AVFSCacheManager.$ipChange;
            nullObjectSetCallback = new fdb.i() { // from class: anet.channel.cache.AVFSCacheImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fdb.i
                public void onObjectSetCallback(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1c2b525a", new Object[]{this, str, new Boolean(z)});
                    } else {
                        ALog.i(AVFSCacheImpl.TAG, "[onObjectSetCallback]", null, "key", str, "result", Boolean.valueOf(z));
                    }
                }
            };
            nullObjectRemoveCallback = new fdb.g() { // from class: anet.channel.cache.AVFSCacheImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fdb.g
                public void onObjectRemoveCallback(String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dbe537fc", new Object[]{this, str, new Boolean(z)});
                    } else {
                        ALog.i(AVFSCacheImpl.TAG, "[onObjectRemoveCallback]", null, "key", str, "result", Boolean.valueOf(z));
                    }
                }
            };
            nullAllObjectRemoveCallback = new fdb.a() { // from class: anet.channel.cache.AVFSCacheImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fdb.a
                public void onAllObjectRemoveCallback(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a8993103", new Object[]{this, new Boolean(z)});
                    } else {
                        ALog.i(AVFSCacheImpl.TAG, "[onAllObjectRemoveCallback]", null, "result", Boolean.valueOf(z));
                    }
                }
            };
        } catch (ClassNotFoundException unused) {
            isAvfsCacheExist = false;
            ALog.w(TAG, "no alivfs sdk!", null, new Object[0]);
        }
    }
}
