package tb;

import android.content.Context;
import com.ali.user.mobile.rpc.filter.FilterManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.cache.CacheManager;
import mtopsdk.mtop.cache.CacheManagerImpl;
import mtopsdk.mtop.cache.domain.ApiCacheDo;
import mtopsdk.mtop.cache.handler.CacheStatusHandler;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.global.SwitchConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ds2 implements yib, reb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<nr2, CacheManager> f18036a = new ConcurrentHashMap(2);

    static {
        t2o.a(589299829);
        t2o.a(589299813);
        t2o.a(589299812);
    }

    @Override // tb.yib
    public String a(w4j w4jVar) {
        ResponseSource responseSource;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8127648a", new Object[]{this, w4jVar});
        }
        if (SwitchConfig.getInstance().degradeApiCacheSet != null) {
            String key = w4jVar.b.getKey();
            if (SwitchConfig.getInstance().degradeApiCacheSet.contains(key)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.CacheDuplexFilter", w4jVar.h, "apiKey in degradeApiCacheList,apiKey=" + key);
                }
                return "CONTINUE";
            }
        }
        if (w4jVar.d.streamMode) {
            return "CONTINUE";
        }
        w4jVar.g.cacheSwitch = 1;
        nr2 nr2Var = w4jVar.f30449a.getMtopConfig().cacheImpl;
        if (nr2Var == null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d("mtopsdk.CacheDuplexFilter", w4jVar.h, " CacheImpl is null. instanceId=" + w4jVar.f30449a.getInstanceId());
            }
            return "CONTINUE";
        }
        Map<nr2, CacheManager> map = f18036a;
        CacheManager cacheManager = (CacheManager) ((ConcurrentHashMap) map).get(nr2Var);
        if (cacheManager == null) {
            synchronized (map) {
                try {
                    cacheManager = (CacheManager) ((ConcurrentHashMap) map).get(nr2Var);
                    if (cacheManager == null) {
                        cacheManager = new CacheManagerImpl(nr2Var);
                        ((ConcurrentHashMap) map).put(nr2Var, cacheManager);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ResponseSource responseSource2 = null;
        try {
        } catch (Exception e2) {
            responseSource = null;
            e = e2;
        }
        if (cacheManager.isNeedReadCache(w4jVar.k, w4jVar.e)) {
            responseSource = new ResponseSource(w4jVar, cacheManager);
            try {
                w4jVar.j = responseSource;
                responseSource.rpcCache = cacheManager.getCache(responseSource.getCacheKey(), responseSource.getCacheBlock(), w4jVar.h);
                CacheStatusHandler.handleCacheStatus(responseSource, w4jVar.d.handler);
            } catch (Exception e3) {
                e = e3;
                TBSdkLog.e("mtopsdk.CacheDuplexFilter", w4jVar.h, "[initResponseSource] initResponseSource error,apiKey=" + w4jVar.b.getKey(), e);
                responseSource2 = responseSource;
                if (responseSource2 != null) {
                }
                return "CONTINUE";
            }
            responseSource2 = responseSource;
        }
        if (responseSource2 != null || responseSource2.requireConnection) {
            return "CONTINUE";
        }
        w4jVar.c = responseSource2.cacheResponse;
        ui9.b(w4jVar);
        return FilterManager.STOP;
    }

    @Override // tb.reb
    public String c(w4j w4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9fc1c03", new Object[]{this, w4jVar});
        }
        if (SwitchConfig.getInstance().degradeApiCacheSet != null) {
            String key = w4jVar.b.getKey();
            if (SwitchConfig.getInstance().degradeApiCacheSet.contains(key)) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    String str = w4jVar.h;
                    TBSdkLog.i("mtopsdk.CacheDuplexFilter", str, "apiKey in degradeApiCacheList,apiKey=" + key);
                }
                return "CONTINUE";
            }
        }
        if (w4jVar.d.streamMode) {
            return "CONTINUE";
        }
        MtopResponse mtopResponse = w4jVar.c;
        ResponseSource responseSource = w4jVar.j;
        if (mtopResponse.isApiSuccess() && responseSource != null) {
            Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
            CacheManager cacheManager = responseSource.cacheManager;
            if (cacheManager.isNeedWriteCache(w4jVar.k, headerFields)) {
                cacheManager.putCache(responseSource.getCacheKey(), responseSource.getCacheBlock(), mtopResponse);
                e(w4jVar, mtopResponse, responseSource.getCacheBlock(), headerFields);
            }
        }
        return "CONTINUE";
    }

    public final void e(w4j w4jVar, MtopResponse mtopResponse, String str, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccc455", new Object[]{this, w4jVar, mtopResponse, str, map});
            return;
        }
        String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(map, "cache-control");
        if (!StringUtils.isBlank(singleHeaderFieldByKey)) {
            n41 e = n41.e();
            String api = mtopResponse.getApi();
            String v = mtopResponse.getV();
            String concatStr2LowerCase = StringUtils.concatStr2LowerCase(api, v);
            ApiCacheDo d = e.d(concatStr2LowerCase);
            Context context = w4jVar.f30449a.getMtopConfig().context;
            if (d == null) {
                ApiCacheDo apiCacheDo = new ApiCacheDo(api, v, str);
                e.h(singleHeaderFieldByKey, apiCacheDo);
                e.c(concatStr2LowerCase, apiCacheDo);
                e.j(context, w4jVar.h);
            } else if (!singleHeaderFieldByKey.equals(d.cacheControlHeader)) {
                e.h(singleHeaderFieldByKey, d);
                e.j(context, w4jVar.h);
            }
        }
    }

    @Override // tb.fwc
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "mtopsdk.CacheDuplexFilter";
    }
}
