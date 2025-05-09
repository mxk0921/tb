package mtopsdk.mtop.cache.handler;

import android.os.Handler;
import anetwork.network.cache.RpcCache;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.util.MtopStatistics;
import tb.h3o;
import tb.t2o;
import tb.ui9;
import tb.w4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ExpiredCacheParser implements ICacheParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.ExpiredCacheParser";

    static {
        t2o.a(589299870);
        t2o.a(589299874);
    }

    @Override // mtopsdk.mtop.cache.handler.ICacheParser
    public void parse(ResponseSource responseSource, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0249bc", new Object[]{this, responseSource, handler});
            return;
        }
        final String str = responseSource.seqNo;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, str, "[parse]ExpiredCacheParser parse called");
        }
        w4j w4jVar = responseSource.mtopContext;
        MtopStatistics mtopStatistics = w4jVar.g;
        mtopStatistics.cacheHitType = 2;
        mtopStatistics.cacheResponseParseStartTime = mtopStatistics.currentTimeMillis();
        RpcCache rpcCache = responseSource.rpcCache;
        MtopResponse initResponseFromCache = CacheStatusHandler.initResponseFromCache(rpcCache, w4jVar.b);
        initResponseFromCache.setSource(MtopResponse.ResponseSource.EXPIRED_CACHE);
        mtopStatistics.cacheResponseParseEndTime = mtopStatistics.currentTimeMillis();
        initResponseFromCache.setMtopStat(mtopStatistics);
        final MtopListener mtopListener = w4jVar.e;
        final Object obj = w4jVar.d.reqContext;
        if (mtopListener instanceof MtopCallback.MtopCacheListener) {
            final MtopCacheEvent mtopCacheEvent = new MtopCacheEvent(initResponseFromCache);
            mtopCacheEvent.seqNo = str;
            mtopStatistics.cacheReturnTime = mtopStatistics.currentTimeMillis();
            CacheStatusHandler.finishMtopStatisticsOnExpiredCache(mtopStatistics, initResponseFromCache);
            if (!w4jVar.d.skipCacheCallback) {
                ui9.d(handler, new Runnable() { // from class: mtopsdk.mtop.cache.handler.ExpiredCacheParser.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            ((MtopCallback.MtopCacheListener) mtopListener).onCached(mtopCacheEvent, obj);
                        } catch (Exception e) {
                            TBSdkLog.e(ExpiredCacheParser.TAG, str, "do onCached callback error.", e);
                        }
                    }
                }, w4jVar.h.hashCode());
            }
        }
        mtopStatistics.cacheHitType = 3;
        h3o h3oVar = w4jVar.k;
        if (h3oVar != null) {
            if (StringUtils.isNotBlank(rpcCache.lastModified)) {
                h3oVar.c(HttpHeaderConstant.IF_MODIFIED_SINCE, rpcCache.lastModified);
            }
            if (StringUtils.isNotBlank(rpcCache.etag)) {
                h3oVar.c(HttpHeaderConstant.IF_NONE_MATCH, rpcCache.etag);
            }
        }
        responseSource.cacheResponse = initResponseFromCache;
    }
}
