package mtopsdk.mtop.cache.handler;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ResponseSource;
import mtopsdk.mtop.util.MtopStatistics;
import tb.t2o;
import tb.ui9;
import tb.w4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FreshCacheParser implements ICacheParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.FreshCacheParser";

    static {
        t2o.a(589299872);
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
            TBSdkLog.i(TAG, str, "[parse]FreshCacheParser parse called");
        }
        responseSource.requireConnection = false;
        w4j w4jVar = responseSource.mtopContext;
        MtopRequest mtopRequest = w4jVar.b;
        MtopStatistics mtopStatistics = w4jVar.g;
        mtopStatistics.cacheHitType = 1;
        mtopStatistics.cacheResponseParseStartTime = mtopStatistics.currentTimeMillis();
        MtopResponse initResponseFromCache = CacheStatusHandler.initResponseFromCache(responseSource.rpcCache, mtopRequest);
        initResponseFromCache.setSource(MtopResponse.ResponseSource.FRESH_CACHE);
        mtopStatistics.cacheResponseParseEndTime = mtopStatistics.currentTimeMillis();
        initResponseFromCache.setMtopStat(mtopStatistics);
        responseSource.cacheResponse = initResponseFromCache;
        mtopStatistics.cacheReturnTime = mtopStatistics.currentTimeMillis();
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        if (mtopNetworkProp.forceRefreshCache) {
            responseSource.requireConnection = true;
            final MtopListener mtopListener = w4jVar.e;
            if (mtopListener instanceof MtopCallback.MtopCacheListener) {
                final Object obj = mtopNetworkProp.reqContext;
                final MtopCacheEvent mtopCacheEvent = new MtopCacheEvent(initResponseFromCache);
                mtopCacheEvent.seqNo = str;
                CacheStatusHandler.finishMtopStatisticsOnExpiredCache(mtopStatistics, initResponseFromCache);
                if (!w4jVar.d.skipCacheCallback) {
                    ui9.d(handler, new Runnable() { // from class: mtopsdk.mtop.cache.handler.FreshCacheParser.1
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
                                TBSdkLog.e(FreshCacheParser.TAG, str, "do onCached callback error.", e);
                            }
                        }
                    }, w4jVar.h.hashCode());
                }
                mtopStatistics.cacheHitType = 3;
            }
        }
    }
}
