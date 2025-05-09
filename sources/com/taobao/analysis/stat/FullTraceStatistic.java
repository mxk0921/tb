package com.taobao.analysis.stat;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.ryi;

/* compiled from: Taobao */
@Monitor(module = "networkAnalysis", monitorPoint = "full_trace")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FullTraceStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String afcId;
    @Dimension
    public String afcType;
    @Dimension
    public long appLaunch;
    @Dimension
    public String bizErrorCode;
    @Measure
    public long bizFirstChunkInflateSize;
    @Dimension
    public long bizFirstChunkTime;
    @Dimension
    public String bizId;
    @Dimension
    public long bizReqProcessStart;
    @Dimension
    public long bizReqStart;
    @Dimension
    public long bizRspCbDispatch;
    @Dimension
    public long bizRspCbEnd;
    @Dimension
    public long bizRspCbStart;
    @Dimension
    public long bizRspProcessStart;
    public final long createTimestamp;
    @Measure
    public long deserializeTime;
    @Dimension
    public int deviceLevel;
    @Dimension
    public String deviceType;
    @Dimension
    public String envFalcoId;
    @Dimension
    public String extra;
    @Dimension
    public String falcoId;
    @Measure
    public long firstDataTime;
    @Dimension
    public String format;
    @Dimension
    public String hitServerCache;
    @Dimension
    public long homeCreate;
    @Dimension
    public String host;
    @Dimension
    public String installation;
    @Dimension
    public int isBg;
    @Dimension
    public int isCbMain;
    public boolean isFalcoExtendCommit;
    @Dimension
    public int isFromExternal;
    @Dimension
    public int isLoginRedo;
    @Dimension
    public int isReqMain;
    @Dimension
    public int isReqSync;
    @Dimension
    public int isStreamMode;
    public boolean isTargetFinished;
    @Dimension
    public long landingCompletion;
    @Dimension
    public long landingCreate;
    @Dimension
    public String landingUrl;
    @Dimension
    public long lastAppLaunch;
    @Dimension
    public long launchStart;
    @Dimension
    public int launchStatus;
    @Dimension
    public String launchType;
    @Dimension
    public String loadFalcoId;
    @Dimension
    public int lowBuyer;
    @Dimension
    public int lowPowerMode;
    @Dimension
    public String moduleTrace;
    public Map<String, ryi> modules;
    @Dimension
    public int multiNetworkStatus;
    @Dimension
    public String netErrorCode;
    @Dimension
    public int netQualityLevel;
    @Dimension
    public long netReqProcessStart;
    @Dimension
    public long netReqSendStart;
    @Dimension
    public long netReqServiceBindEnd;
    @Dimension
    public long netReqStart;
    @Dimension
    public long netRspCbDispatch;
    @Dimension
    public long netRspCbEnd;
    @Dimension
    public long netRspCbStart;
    @Dimension
    public long netRspRecvEnd;
    @Dimension
    public String netType;
    @Dimension
    public String pTraceId;
    @Dimension
    public long pageCreateTime;
    @Dimension
    public int pageIndex;
    @Dimension
    public String pageName;
    @Dimension
    public String pageReferer;
    @Dimension
    public long pageResumeTime;
    @Dimension
    public String pageUrl;
    @Dimension
    public long postProcessEnd;
    @Dimension
    public long preProcessStart;
    @Dimension
    public int processId;
    @Dimension
    public long processStart;
    @Dimension
    public String processType;
    @Dimension
    public String protocolType;
    @Measure
    public long recvDataTime;
    @Measure
    public long reqDeflateSize;
    @Dimension
    public int reqFrom;
    @Measure
    public long reqInflateSize;
    @Dimension
    public String reqType;
    @Dimension
    public int ret;
    @Dimension
    public int retryTimes;
    @Measure
    public long rspDeflateSize;
    @Measure
    public long rspInflateSize;
    @Measure
    public long sendDataTime;
    @Measure
    public long serverBizRT;
    @Dimension
    public int serverCrossUnit;
    @Measure
    public long serverRT;
    @Dimension
    public String serverTraceId;
    @Measure
    public long signTime;
    @Dimension
    public String speedBucket;
    @Dimension
    public int startType;
    @Dimension
    public int temperature;
    public Runnable timeoutRunnable;
    @Dimension
    public String topic;
    @Dimension
    public String url;
    @Dimension
    public int useMultiPath;
    @Dimension
    public int userType;

    public FullTraceStatistic(String str) {
        this.reqFrom = -1;
        this.processId = -1;
        this.modules = new HashMap();
        this.isTargetFinished = false;
        this.isFalcoExtendCommit = false;
        this.reqType = str;
        this.createTimestamp = System.currentTimeMillis();
    }

    public static /* synthetic */ Object ipc$super(FullTraceStatistic fullTraceStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/stat/FullTraceStatistic");
    }

    public String buildModuleTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99ee90ee", new Object[]{this});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, ryi> entry : this.modules.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue().e());
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FullTraceStatistic|" + this.falcoId + "|" + this.url + "|" + this.host + "|" + this.reqType + "|" + this.bizId + "|" + this.netType + "|" + this.protocolType + "|" + this.retryTimes + "|" + this.ret + "|" + this.serverTraceId + "|" + this.isCbMain + "|" + this.isReqSync + "|" + this.isReqMain + "|" + this.isStreamMode + "|" + this.startType + "|" + this.isFromExternal + "|" + this.appLaunch + "|" + this.lastAppLaunch + "|" + this.homeCreate + "|" + this.deviceLevel + "|" + this.pageName + "|" + this.pageResumeTime + "|" + this.isBg + "|" + this.speedBucket + "|" + this.bizReqStart + "|" + this.bizReqProcessStart + "|" + this.netReqStart + "|" + this.netReqServiceBindEnd + "|" + this.netReqProcessStart + "|" + this.netReqSendStart + "|" + this.netRspRecvEnd + "|" + this.netRspCbDispatch + "|" + this.netRspCbStart + "|" + this.netRspCbEnd + "|" + this.bizRspProcessStart + "|" + this.bizRspCbDispatch + "|" + this.bizRspCbStart + "|" + this.bizRspCbEnd + "|" + this.reqInflateSize + "|" + this.reqDeflateSize + "|" + this.rspDeflateSize + "|" + this.rspInflateSize + "|" + this.serverRT + "|" + this.sendDataTime + "|" + this.firstDataTime + "|" + this.recvDataTime + "|" + this.deserializeTime + "|" + this.signTime + "|" + this.landingUrl + "|" + this.landingCreate + "|" + this.landingCompletion + "|" + this.extra + "|" + this.netErrorCode + "|" + this.bizErrorCode + "|" + this.pageCreateTime + "|" + this.moduleTrace + "|" + this.userType + "|" + this.serverBizRT + "|" + this.serverCrossUnit + "|" + this.reqFrom + "|" + this.preProcessStart + "|" + this.postProcessEnd + "|" + this.hitServerCache;
    }

    public String toTraceLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8876bdf", new Object[]{this});
        }
        return "pTraceId=" + this.pTraceId + "|falcoId=" + this.falcoId + "serverTraceId=" + this.serverTraceId + "|url=" + this.url + "|retryTimes=" + this.retryTimes + "|bizId=" + this.bizId + "|netType=" + this.netType + "|protocolType=" + this.protocolType + "|ret=" + this.ret + "|netErrorCode=" + this.netErrorCode + "|bizErrorCode=" + this.bizErrorCode + "|reqType=" + this.reqType + "|isReqSync=" + this.isReqSync + "|isReqMain=" + this.isReqMain + "|isCbMain=" + this.isCbMain + "|pageName=" + this.pageName + "|isBg=" + this.isBg + "|speedBucket=" + this.speedBucket + "|bizReqStart=" + this.bizReqStart + "|bizReqProcessStart=" + this.bizReqProcessStart + "|netReqStart=" + this.netReqStart + "|netReqProcessStart=" + this.netReqProcessStart + "|netReqSendStart=" + this.netReqSendStart + "|netRspRecvEnd=" + this.netRspRecvEnd + "|netRspCbDispatch=" + this.netRspCbDispatch + "|netRspCbStart=" + this.netRspCbStart + "|netRspCbEnd=" + this.netRspCbEnd + "|bizRspCbDispatch=" + this.bizRspCbDispatch + "|bizRspCbStart=" + this.bizRspCbStart + "|bizRspCbEnd=" + this.bizRspCbEnd + "|reqInflateSize=" + this.reqInflateSize + "|reqDeflateSize=" + this.reqDeflateSize + "|rspInflateSize=" + this.rspInflateSize + "|rspDeflateSize=" + this.rspDeflateSize + "|serverRT=" + this.serverRT + "|sendDataTime=" + this.sendDataTime + "|firstDataTime=" + this.firstDataTime + "|recvDataTime=" + this.recvDataTime + "|deserializeTime=" + this.deserializeTime + "|signTime=" + this.signTime + "|moduleTrace=" + this.moduleTrace + "|isStreamMode=" + this.isStreamMode + "|hitServerCache=" + this.hitServerCache;
    }

    public FullTraceStatistic(FullTraceStatistic fullTraceStatistic) {
        this(fullTraceStatistic.reqType);
        this.pTraceId = fullTraceStatistic.pTraceId;
        this.falcoId = fullTraceStatistic.falcoId;
        this.reqType = fullTraceStatistic.reqType;
        this.url = fullTraceStatistic.url;
        this.host = fullTraceStatistic.host;
        this.retryTimes = fullTraceStatistic.retryTimes;
        this.bizId = fullTraceStatistic.bizId;
        this.protocolType = fullTraceStatistic.protocolType;
        this.ret = fullTraceStatistic.ret;
        this.serverTraceId = fullTraceStatistic.serverTraceId;
        this.isCbMain = fullTraceStatistic.isCbMain;
        this.netErrorCode = fullTraceStatistic.netErrorCode;
        this.bizErrorCode = fullTraceStatistic.bizErrorCode;
        this.topic = fullTraceStatistic.topic;
        this.pageIndex = fullTraceStatistic.pageIndex;
        this.multiNetworkStatus = fullTraceStatistic.multiNetworkStatus;
        this.useMultiPath = fullTraceStatistic.useMultiPath;
        this.isStreamMode = fullTraceStatistic.isStreamMode;
        this.reqFrom = fullTraceStatistic.reqFrom;
        this.serverCrossUnit = fullTraceStatistic.serverCrossUnit;
        this.format = fullTraceStatistic.format;
        this.hitServerCache = fullTraceStatistic.hitServerCache;
        this.startType = fullTraceStatistic.startType;
        this.isFromExternal = fullTraceStatistic.isFromExternal;
        this.appLaunch = fullTraceStatistic.appLaunch;
        this.lastAppLaunch = fullTraceStatistic.lastAppLaunch;
        this.homeCreate = fullTraceStatistic.homeCreate;
        this.pageName = fullTraceStatistic.pageName;
        this.pageUrl = fullTraceStatistic.pageUrl;
        this.pageReferer = fullTraceStatistic.pageReferer;
        this.isBg = fullTraceStatistic.isBg;
        this.pageResumeTime = fullTraceStatistic.pageResumeTime;
        this.speedBucket = fullTraceStatistic.speedBucket;
        this.landingUrl = fullTraceStatistic.landingUrl;
        this.landingCreate = fullTraceStatistic.landingCreate;
        this.landingCompletion = fullTraceStatistic.landingCompletion;
        this.extra = fullTraceStatistic.extra;
        this.userType = fullTraceStatistic.userType;
        this.processId = fullTraceStatistic.processId;
        this.processType = fullTraceStatistic.processType;
        this.lowBuyer = fullTraceStatistic.lowBuyer;
        this.envFalcoId = fullTraceStatistic.envFalcoId;
        this.afcId = fullTraceStatistic.afcId;
        this.afcType = fullTraceStatistic.afcType;
        this.processStart = fullTraceStatistic.processStart;
        this.launchStart = fullTraceStatistic.launchStart;
        this.launchType = fullTraceStatistic.launchType;
        this.installation = fullTraceStatistic.installation;
        this.launchStatus = fullTraceStatistic.launchStatus;
        this.lowPowerMode = fullTraceStatistic.lowPowerMode;
        this.temperature = fullTraceStatistic.temperature;
        this.netType = fullTraceStatistic.netType;
        this.netQualityLevel = fullTraceStatistic.netQualityLevel;
        this.deviceLevel = fullTraceStatistic.deviceLevel;
        this.deviceType = fullTraceStatistic.deviceType;
        this.bizReqStart = fullTraceStatistic.bizReqStart;
        this.bizReqProcessStart = fullTraceStatistic.bizReqProcessStart;
        this.netReqStart = fullTraceStatistic.netReqStart;
        this.netReqServiceBindEnd = fullTraceStatistic.netReqServiceBindEnd;
        this.netReqProcessStart = fullTraceStatistic.netReqProcessStart;
        this.netReqSendStart = fullTraceStatistic.netReqSendStart;
        this.netRspRecvEnd = fullTraceStatistic.netRspRecvEnd;
        this.netRspCbDispatch = fullTraceStatistic.netRspCbDispatch;
        this.netRspCbStart = fullTraceStatistic.netRspCbStart;
        this.netRspCbEnd = fullTraceStatistic.netRspCbEnd;
        this.bizRspProcessStart = fullTraceStatistic.bizRspProcessStart;
        this.bizRspCbDispatch = fullTraceStatistic.bizRspCbDispatch;
        this.bizRspCbStart = fullTraceStatistic.bizRspCbStart;
        this.bizRspCbEnd = fullTraceStatistic.bizRspCbEnd;
        this.moduleTrace = fullTraceStatistic.moduleTrace;
        this.preProcessStart = fullTraceStatistic.preProcessStart;
        this.postProcessEnd = fullTraceStatistic.postProcessEnd;
        this.reqInflateSize = fullTraceStatistic.reqInflateSize;
        this.reqDeflateSize = fullTraceStatistic.reqDeflateSize;
        this.rspDeflateSize = fullTraceStatistic.rspDeflateSize;
        this.rspInflateSize = fullTraceStatistic.rspInflateSize;
        this.serverRT = fullTraceStatistic.serverRT;
        this.serverBizRT = fullTraceStatistic.serverBizRT;
        this.sendDataTime = fullTraceStatistic.sendDataTime;
        this.firstDataTime = fullTraceStatistic.firstDataTime;
        this.recvDataTime = fullTraceStatistic.recvDataTime;
        this.deserializeTime = fullTraceStatistic.deserializeTime;
        this.signTime = fullTraceStatistic.signTime;
        this.bizFirstChunkTime = fullTraceStatistic.bizFirstChunkTime;
        this.bizFirstChunkInflateSize = fullTraceStatistic.bizFirstChunkInflateSize;
        this.isLoginRedo = fullTraceStatistic.isLoginRedo;
    }
}
