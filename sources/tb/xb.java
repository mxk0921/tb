package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import anetwork.channel.Header;
import anetwork.channel.Request;
import anetwork.channel.entity.BasicHeader;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.statist.StatisticData;
import anetwork.channel.util.RequestConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.network.domain.NetworkStats;
import mtopsdk.network.domain.ParcelableRequestBodyImpl;
import mtopsdk.network.impl.ParcelableRequestBodyEntry;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class xb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589300060);
    }

    public static NetworkStats a(StatisticData statisticData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStats) ipChange.ipc$dispatch("bb71659a", new Object[]{statisticData});
        }
        if (statisticData == null) {
            return null;
        }
        NetworkStats networkStats = new NetworkStats();
        networkStats.resultCode = statisticData.resultCode;
        networkStats.isRequestSuccess = statisticData.isRequestSuccess;
        networkStats.host = statisticData.host;
        networkStats.ip_port = statisticData.ip_port;
        networkStats.connectionType = statisticData.connectionType;
        networkStats.isSSL = statisticData.isSSL;
        networkStats.oneWayTime_ANet = statisticData.oneWayTime_ANet;
        networkStats.processTime = statisticData.processTime;
        networkStats.firstDataTime = statisticData.firstDataTime;
        networkStats.sendWaitTime = statisticData.sendBeforeTime;
        networkStats.recDataTime = statisticData.recDataTime;
        networkStats.sendSize = statisticData.sendSize;
        networkStats.recvSize = statisticData.totalSize;
        networkStats.serverRT = statisticData.serverRT;
        networkStats.dataSpeed = statisticData.dataSpeed;
        networkStats.retryTimes = statisticData.retryTime;
        return networkStats;
    }

    public static Request b(h3o h3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("74ba5934", new Object[]{h3oVar});
        }
        RequestImpl requestImpl = new RequestImpl(h3oVar.f20395a);
        requestImpl.setSeqNo(h3oVar.e);
        requestImpl.setRetryTime(h3oVar.j);
        requestImpl.setConnectTimeout(h3oVar.f);
        requestImpl.setReadTimeout(h3oVar.g);
        if (!TextUtils.isEmpty(h3oVar.l)) {
            requestImpl.setBizId(h3oVar.l);
        } else {
            requestImpl.setBizId(h3oVar.k);
        }
        if (!TextUtils.isEmpty(h3oVar.m)) {
            requestImpl.setExtProperty("biz-topic", h3oVar.m);
        }
        requestImpl.setExtProperty(RequestConstant.KEY_PARENT_TRACE_ID, h3oVar.o);
        requestImpl.setMethod(h3oVar.b);
        requestImpl.setHeaders(c(h3oVar.c));
        requestImpl.setExtProperty("APPKEY", h3oVar.n);
        requestImpl.setExtProperty(RequestConstant.AUTH_CODE, h3oVar.p);
        requestImpl.setFollowRedirects(h3oVar.v);
        if (!TextUtils.isEmpty(h3oVar.t)) {
            requestImpl.setExtProperty(RequestConstant.KEY_TRACE_ID, h3oVar.t);
        }
        Map<String, String> map = h3oVar.u;
        if (map != null && !map.isEmpty()) {
            requestImpl.setTraceContext(h3oVar.u);
        }
        if (h3oVar.w) {
            requestImpl.setExtProperty("zstd", "enable");
        }
        if (h3oVar.x) {
            requestImpl.setExtProperty("zstd-d", "enable");
        }
        if (h3oVar.B) {
            requestImpl.setExtProperty(RequestConstant.UPLINK_ENCODE, "enable");
        }
        if (h3oVar.z && SwitchConfig.getInstance().isStreamJsonEnable()) {
            requestImpl.setExtProperty(HttpConstant.STREAMING_PARSER, "open");
        }
        if (h3oVar.C) {
            requestImpl.setExtProperty(RequestConstant.ENABLE_COOKIE, "false");
        }
        if (h3oVar.D) {
            requestImpl.setExtProperty(RequestConstant.FORCE_CELLULAR, "true");
        }
        int i = h3oVar.q;
        if (i == 0) {
            requestImpl.setExtProperty(RequestConstant.ENVIRONMENT, "online");
        } else if (i == 1) {
            requestImpl.setExtProperty(RequestConstant.ENVIRONMENT, "pre");
        } else if (i == 2) {
            requestImpl.setExtProperty(RequestConstant.ENVIRONMENT, "test");
        }
        if ("POST".equalsIgnoreCase(h3oVar.b)) {
            ParcelableRequestBodyImpl parcelableRequestBodyImpl = (ParcelableRequestBodyImpl) h3oVar.d;
            requestImpl.setBodyEntry(new ParcelableRequestBodyEntry(parcelableRequestBodyImpl));
            requestImpl.addHeader("Content-Type", parcelableRequestBodyImpl.contentType());
            long contentLength = parcelableRequestBodyImpl.contentLength();
            if (contentLength > 0) {
                requestImpl.addHeader("Content-Length", String.valueOf(contentLength));
            }
        }
        return requestImpl;
    }

    public static List<Header> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("23349fbc", new Object[]{map});
        }
        if (map == null || map.size() < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null && StringUtils.isNotBlank(entry.getKey())) {
                arrayList.add(new BasicHeader(entry.getKey(), entry.getValue()));
            }
        }
        return arrayList;
    }
}
