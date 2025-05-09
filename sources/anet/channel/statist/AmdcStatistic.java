package anet.channel.statist;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import tb.t2o;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = SwitchMonitorLogUtil.SRC_AMDC)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AmdcStatistic extends StatObject {
    @Dimension
    public String accessPoint;
    @Dimension
    public String contentEncode;
    @Dimension
    public String errorCode;
    @Dimension
    public String errorMsg;
    @Dimension
    public String host;
    @Dimension
    public String ip;
    @Dimension
    public boolean isForceCellular;
    @Dimension
    public boolean isForceSend;
    @Dimension
    public boolean isForceUpdate;
    @Dimension
    public boolean isVpnProxy;
    @Dimension
    public String locationUrl;
    @Dimension
    public int port;
    @Dimension
    public String priority;
    @Dimension
    public int ret;
    @Dimension
    public int retryTimes;
    @Dimension
    public String trace;
    @Dimension
    public String url;
    @Dimension
    public String version;
    @Dimension
    public int amdcType = 0;
    @Dimension
    public int realDecompressType = -1;
    @Dimension
    public int strategyType = -1;
    @Dimension
    public int statusChangeType = -1;
    @Dimension
    public int launchCacheFlag = -1;
    @Measure
    public long totalTime = 0;
    @Measure
    public long requestTime = 0;
    @Measure
    public int domainCount = 0;
    @Measure
    public long buildParamTime = 0;
    @Measure
    public long strategyTime = 0;
    @Measure
    public long tryStrategyBuildUrlTime = 0;
    @Measure
    public long onePreParamTime = 0;
    @Measure
    public long oneAcceptEncodeTime = 0;
    @Measure
    public long onePostTime = 0;
    @Measure
    public long onePostGetStreamTime = 0;
    @Measure
    public long onePostEncodeParamTime = 0;
    @Measure
    public long onePostWriteTime = 0;
    @Measure
    public long oneResponseTime = 0;
    @Measure
    public long oneResponseHeaderTime = 0;
    @Measure
    public long oneInputStreamTime = 0;
    @Measure
    public long oneReceiveDataTime = 0;
    @Measure
    public long oneCheckSignTime = 0;
    @Measure
    public long oneStrategyParseTime = 0;
    @Measure
    public long responseResultParseTime = 0;
    @Measure
    public long responseUpdateTime = 0;
    @Measure
    public long responseSaveDataTime = 0;
    @Measure
    public long responseH3DetectTime = 0;
    @Measure
    public long responseListenerTime = 0;
    @Measure
    public long deflateSize = 0;
    @Measure
    public long inflateSize = 0;
    public long onePreParamStartTime = 0;
    public long oneAcceptEncodeStartTime = 0;
    public long onePostStartTime = 0;
    public long onePostGetStreamStartTime = 0;
    public long onePostEncodeParamStartTime = 0;
    public long onePostWriteStartTime = 0;
    public long oneResponseStartTime = 0;
    public long oneResponseHeaderStartTime = 0;
    public long oneReceiveDataStartTime = 0;
    public long oneCheckSignStartTime = 0;
    public long oneStrategyParseStartTime = 0;
    public long startTime = 0;
    public long oneStartTime = 0;
    public long buildParamEndTime = 0;
    public long eventStartTime = 0;
    public long responseResultParseTimeEnd = 0;
    public long responseUpdateTimeEnd = 0;
    public long responseSaveDataTimeEnd = 0;
    public long responseH3DetectTimeEnd = 0;
    public long responseListenerTimeEnd = 0;
    public String st = "";
    public String rm = "";
    public boolean isNotConnStrategy = false;
    public boolean isUseLocalStrategy = false;
    public boolean isUsePreSetVip = false;
    public String seqNo = "";
    @Dimension
    public String netType = NetworkStatusHelper.getStatus().toString();
    @Dimension
    public String proxyType = NetworkStatusHelper.getProxyType();
    @Dimension
    public String ttid = GlobalAppRuntimeInfo.getTtid();

    static {
        t2o.a(607125747);
    }
}
