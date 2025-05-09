package mtopsdk.mtop.cache;

import anetwork.network.cache.RpcCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.cache.domain.ApiCacheDo;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;
import tb.fp;
import tb.h3o;
import tb.inx;
import tb.n41;
import tb.nr2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CacheManagerImpl implements CacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String METHOD_GET = "GET";
    private static final String QUERY_KEY_DATA = "data";
    private static final String QUERY_KEY_WUA = "wua";
    private static final String TAG = "mtopsdk.CacheManagerImpl";
    private nr2 cache;

    static {
        t2o.a(589299861);
        t2o.a(589299860);
    }

    public CacheManagerImpl(nr2 nr2Var) {
        this.cache = nr2Var;
    }

    private RpcCache handleCacheValidation(String str, RpcCache rpcCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcCache) ipChange.ipc$dispatch("7174f5b4", new Object[]{this, str, rpcCache});
        }
        if (rpcCache == null) {
            return rpcCache;
        }
        if (rpcCache.body == null) {
            rpcCache.cacheStatus = RpcCache.CacheStatus.TIMEOUT;
            return rpcCache;
        }
        String str2 = rpcCache.lastModified;
        if (str2 == null && rpcCache.etag == null) {
            if (rpcCache.offline) {
                rpcCache.cacheStatus = RpcCache.CacheStatus.NEED_UPDATE;
            } else {
                rpcCache.cacheStatus = RpcCache.CacheStatus.TIMEOUT;
            }
            return rpcCache;
        }
        if (StringUtils.isNotBlank(str2)) {
            long j = rpcCache.cacheCreateTime;
            long j2 = rpcCache.maxAge;
            long correctionTime = SDKUtils.getCorrectionTime();
            if (correctionTime >= j && correctionTime <= j + j2) {
                rpcCache.cacheStatus = RpcCache.CacheStatus.FRESH;
            } else if (rpcCache.offline) {
                rpcCache.cacheStatus = RpcCache.CacheStatus.NEED_UPDATE;
            } else {
                rpcCache.cacheStatus = RpcCache.CacheStatus.TIMEOUT;
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                StringBuilder sb = new StringBuilder(128);
                sb.append("[handleCacheValidation]cacheStatus=");
                sb.append(rpcCache.cacheStatus);
                sb.append(";lastModifiedStr=");
                sb.append(rpcCache.lastModified);
                sb.append(";lastModified=");
                sb.append(j);
                sb.append(";maxAge=");
                sb.append(j2);
                sb.append(";currentTime=");
                sb.append(correctionTime);
                sb.append(";t_offset=");
                sb.append(inx.b());
                TBSdkLog.i(TAG, str, sb.toString());
            }
        } else if (StringUtils.isNotBlank(rpcCache.etag)) {
            rpcCache.cacheStatus = RpcCache.CacheStatus.NEED_UPDATE;
        }
        return rpcCache;
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public String getBlockName(String str) {
        ApiCacheDo d;
        String str2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62bf19ed", new Object[]{this, str}) : (StringUtils.isBlank(str) || (d = n41.e().d(str)) == null || (str2 = d.blockName) == null) ? "" : str2;
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public RpcCache getCache(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcCache) ipChange.ipc$dispatch("87775", new Object[]{this, str, str2, str3});
        }
        nr2 nr2Var = this.cache;
        if (nr2Var == null) {
            return null;
        }
        RpcCache a2 = ((fp) nr2Var).a(str, str2);
        if (a2 != null) {
            return handleCacheValidation(str3, a2);
        }
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r11.equals("ALL") == false) goto L_0x0053;
     */
    @Override // mtopsdk.mtop.cache.CacheManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getCacheKey(tb.w4j r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.cache.CacheManagerImpl.getCacheKey(tb.w4j):java.lang.String");
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public boolean putCache(String str, String str2, MtopResponse mtopResponse) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae7bb917", new Object[]{this, str, str2, mtopResponse})).booleanValue();
        }
        if (this.cache == null) {
            return false;
        }
        RpcCache rpcCache = new RpcCache();
        rpcCache.header = mtopResponse.getHeaderFields();
        rpcCache.body = mtopResponse.getBytedata();
        if (mtopResponse.getMtopStat() != null) {
            str3 = mtopResponse.getMtopStat().seqNo;
        } else {
            str3 = "";
        }
        return ((fp) this.cache).e(str, str2, handleResponseCacheFlag(str3, rpcCache));
    }

    private RpcCache handleResponseCacheFlag(String str, RpcCache rpcCache) {
        Map<String, List<String>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcCache) ipChange.ipc$dispatch("5d58de42", new Object[]{this, str, rpcCache});
        }
        if (!(rpcCache == null || (map = rpcCache.header) == null)) {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "last-modified");
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "cache-control");
            String singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.MTOP_X_ETAG);
            if (singleHeaderFieldByKey3 == null) {
                singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "etag");
            }
            if (singleHeaderFieldByKey2 == null && singleHeaderFieldByKey == null && singleHeaderFieldByKey3 == null) {
                return rpcCache;
            }
            if (StringUtils.isNotBlank(singleHeaderFieldByKey2) && StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                rpcCache.lastModified = singleHeaderFieldByKey;
                rpcCache.cacheCreateTime = MtopUtils.convertTimeFormatGMT2Long(singleHeaderFieldByKey);
                String[] split = singleHeaderFieldByKey2.split(",");
                if (split != null) {
                    for (String str2 : split) {
                        try {
                            if (str2.contains("max-age=")) {
                                rpcCache.maxAge = Long.parseLong(str2.substring(8));
                            } else if (HttpHeaderConstant.OFFLINE_FLAG_ON.equalsIgnoreCase(str2)) {
                                rpcCache.offline = true;
                            }
                        } catch (Exception unused) {
                            TBSdkLog.w(TAG, str, "[handleResponseCacheFlag] parse cacheControlStr error.".concat(singleHeaderFieldByKey2));
                        }
                    }
                }
            }
            if (StringUtils.isNotBlank(singleHeaderFieldByKey3)) {
                rpcCache.etag = singleHeaderFieldByKey3;
            }
        }
        return rpcCache;
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public boolean isNeedReadCache(h3o h3oVar, MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60d5ebd", new Object[]{this, h3oVar, mtopListener})).booleanValue();
        }
        if (!SwitchConfig.getInstance().isGlobalCacheSwitchOpen()) {
            TBSdkLog.i(TAG, h3oVar.e, "[isNeedReadCache]GlobalCacheSwitch=false,Don't read local cache.");
            return false;
        } else if (h3oVar != null && "GET".equalsIgnoreCase(h3oVar.b)) {
            return !HttpHeaderConstant.NO_CACHE.equalsIgnoreCase(h3oVar.a("cache-control"));
        } else {
            return false;
        }
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    public boolean isNeedWriteCache(h3o h3oVar, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("652c67b2", new Object[]{this, h3oVar, map})).booleanValue();
        }
        if (!SwitchConfig.getInstance().isGlobalCacheSwitchOpen()) {
            TBSdkLog.i(TAG, h3oVar.e, "[isNeedWriteCache]GlobalCacheSwitch=false,Don't write local cache.");
            return false;
        } else if (!"GET".equalsIgnoreCase(h3oVar.b) || map == null) {
            return false;
        } else {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "cache-control");
            if (singleHeaderFieldByKey != null && singleHeaderFieldByKey.contains(HttpHeaderConstant.NO_CACHE)) {
                return false;
            }
            String singleHeaderFieldByKey2 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "last-modified");
            String singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, HttpHeaderConstant.MTOP_X_ETAG);
            if (singleHeaderFieldByKey3 == null) {
                singleHeaderFieldByKey3 = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "etag");
            }
            return (singleHeaderFieldByKey == null && singleHeaderFieldByKey2 == null && singleHeaderFieldByKey3 == null) ? false : true;
        }
    }

    @Override // mtopsdk.mtop.cache.CacheManager
    @Deprecated
    public String getBlockName(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a00da423", new Object[]{this, str, str2}) : getBlockName(StringUtils.concatStr2LowerCase(str, str2));
    }
}
