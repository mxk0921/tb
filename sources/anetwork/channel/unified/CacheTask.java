package anetwork.channel.unified;

import anet.channel.bytes.ByteArray;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.entity.RequestConfig;
import anetwork.channel.interceptor.Callback;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CacheTask implements IUnifiedTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.CacheTask";
    private Cache cache;
    private volatile boolean isCanceled = false;
    private RequestContext rc;

    static {
        t2o.a(607126115);
        t2o.a(607126132);
    }

    public CacheTask(RequestContext requestContext, Cache cache) {
        this.rc = null;
        this.cache = null;
        this.rc = requestContext;
        this.cache = cache;
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.isCanceled = true;
        this.rc.config.rs.ret = 2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Cache.Entry entry;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.isCanceled) {
            RequestConfig requestConfig = this.rc.config;
            RequestStatistic requestStatistic = requestConfig.rs;
            if (this.cache != null) {
                String urlString = requestConfig.getUrlString();
                Request awcnRequest = this.rc.config.getAwcnRequest();
                String str = awcnRequest.getHeaders().get(HttpConstant.CACHE_CONTROL);
                boolean equals = "no-store".equals(str);
                long currentTimeMillis = System.currentTimeMillis();
                if (equals) {
                    this.cache.remove(urlString);
                    z = false;
                    entry = null;
                } else {
                    z = HttpHeaderConstant.NO_CACHE.equals(str);
                    entry = this.cache.get(urlString);
                    if (ALog.isPrintLog(2)) {
                        ALog.i(TAG, "read cache", this.rc.seqNum, "hit", Boolean.valueOf(entry != null), "cost", Long.valueOf(requestStatistic.cacheTime), pg1.ATOM_length, Integer.valueOf(entry != null ? entry.data.length : 0), "key", urlString);
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                requestStatistic.cacheTime = currentTimeMillis2 - currentTimeMillis;
                if (entry == null || z || !entry.isFresh()) {
                    Cache cache = null;
                    if (!this.isCanceled) {
                        RequestContext requestContext = this.rc;
                        if (!equals) {
                            cache = this.cache;
                        }
                        NetworkTask networkTask = new NetworkTask(requestContext, cache, entry);
                        this.rc.runningTask = networkTask;
                        networkTask.run();
                    }
                } else if (this.rc.isDone.compareAndSet(false, true)) {
                    this.rc.cancelTimeoutTask();
                    requestStatistic.ret = 1;
                    requestStatistic.statusCode = 200;
                    requestStatistic.msg = "SUCCESS";
                    requestStatistic.protocolType = "cache";
                    requestStatistic.rspEnd = currentTimeMillis2;
                    AnalysisFactory.getV3Instance().log(requestStatistic.span, "netRspRecvEnd", null);
                    requestStatistic.processTime = currentTimeMillis2 - requestStatistic.start;
                    if (ALog.isPrintLog(2)) {
                        RequestContext requestContext2 = this.rc;
                        ALog.i(TAG, "hit fresh cache", requestContext2.seqNum, MonitorItemConstants.KEY_URL, requestContext2.config.getHttpUrl().urlString());
                    }
                    Map<String, List<String>> map = entry.responseHeaders;
                    if (map != null) {
                        map.put(HttpConstant.X_PROTOCOL, Arrays.asList(requestStatistic.protocolType));
                    }
                    this.rc.callback.onResponseCode(200, entry.responseHeaders);
                    Callback callback = this.rc.callback;
                    byte[] bArr = entry.data;
                    callback.onDataReceiveSize(1, bArr.length, ByteArray.wrap(bArr));
                    this.rc.callback.onFinish(new DefaultFinishEvent(200, "SUCCESS", awcnRequest));
                }
            }
        }
    }
}
