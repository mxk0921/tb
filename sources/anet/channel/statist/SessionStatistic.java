package anet.channel.statist;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnInfo;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.strategy.IConnStrategy;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import anet.channel.util.Utils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
@Monitor(module = "networkPrefer", monitorPoint = MspGlobalDefine.SESSION)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SessionStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Measure
    public long ackTime;
    @Dimension
    public String amdcInfo;
    @Measure(max = 15000.0d)
    public long authTime;
    @Measure
    public long cfRCount;
    @Dimension
    public String closeReason;
    @Dimension
    public int congControlKind;
    @Measure
    public long connRecvSize;
    @Measure
    public long connSendSize;
    @Dimension
    public String connectInfo;
    @Measure(max = 15000.0d, name = "connTime")
    public long connectionTime;
    @Dimension(name = "protocolType")
    public String conntype;
    @Dimension
    public String dcid;
    @Dimension
    public long errorCode;
    @Measure
    public int fecSendCount;
    @Measure
    public int handshakeStat;
    @Dimension
    public String harmonyVersion;
    @Dimension
    public String host;
    @Measure
    public long inceptCount;
    @Dimension
    public String ip;
    @Dimension
    public int ipRefer;
    @Dimension
    public int ipStackType;
    @Dimension
    public int ipType;
    @Dimension
    public boolean isBackground;
    @Dimension
    public String isBg;
    @Dimension
    public boolean isComplex;
    @Dimension
    public boolean isComplexEnable;
    @Dimension
    public int isHarmonyOS;
    @Dimension
    public int isHitTicket;
    @Dimension
    public long isKL;
    @Dimension
    public boolean isTicketStore;
    @Dimension
    public boolean isTunnel;
    @Measure
    public int lastPingInterval;
    @Measure
    public double lossRate;
    public int maxRetryTime;
    @Dimension
    public String mpquicPathInfo;
    @Measure
    public double mpquicRecvWeight;
    @Measure
    public double mpquicSendWeight;
    @Dimension
    public int mpquicStatus;
    @Dimension
    public int mss;
    @Dimension
    public int netSpeed;
    @Dimension
    public String netType;
    @Measure
    public long pRate;
    @Dimension
    public int port;
    @Measure
    public long ppkgCount;
    @Measure
    public int pubkeyRetry;
    @Measure
    public long recvSizeCount;
    @Measure
    public long reliableChannelCount;
    @Dimension
    public int ret;
    @Measure
    public double retransmissionRate;
    @Dimension
    public long retryTimes;
    @Measure
    public int rtoCount;
    @Dimension
    public String scid;
    @Dimension
    public int sdkv;
    @Measure
    public long sendSizeCount;
    @Measure
    public long srtt;
    @Measure(max = 15000.0d)
    public long sslCalTime;
    @Measure(max = 15000.0d)
    public long sslTime;
    @Measure
    public double standbyPathWeight;
    @Measure
    public int ticketSize;
    @Dimension
    public long ticketTime;
    @Measure
    public int tlpCount;
    @Dimension
    public String tunnelInfo;
    @Measure
    public long unreliableChannelCount;
    @Dimension
    public int xqc0RttStatus;
    @Dimension
    public String xqcConnEnv;
    @Dimension
    public int isProxy = 0;
    @Dimension
    public JSONObject extra = null;
    @Dimension
    public int selectSessionType = 0;
    @Dimension
    public int mpquicOpened = 0;
    @Dimension
    public int forceCellular = 0;
    @Dimension
    public int multiNetworkStatus = 0;
    @Dimension
    public boolean isMPQuic = false;
    @Measure(max = 86400.0d)
    public long liveTime = 0;
    @Measure(constantValue = 1.0d)
    public long requestCount = 1;
    @Measure(constantValue = vu3.b.GEO_NOT_SUPPORT)
    public long stdRCount = 1;
    @Measure
    public long sinceInitTime = -1;
    @Measure
    public long bgForbiddenTime = 0;
    public boolean isCommitted = false;
    public boolean isReported = true;

    static {
        t2o.a(607125793);
    }

    public SessionStatistic(ConnInfo connInfo) {
        String str;
        this.ipRefer = 0;
        this.ipType = 1;
        this.amdcInfo = "";
        this.isHarmonyOS = 0;
        if (connInfo != null) {
            this.ip = connInfo.getIp();
            this.port = connInfo.getPort();
            IConnStrategy iConnStrategy = connInfo.strategy;
            if (iConnStrategy != null) {
                this.ipRefer = iConnStrategy.getIpSource();
                this.ipType = connInfo.strategy.getIpType();
            }
            this.pRate = connInfo.getHeartbeat();
            this.conntype = connInfo.getConnType().toString();
            this.retryTimes = connInfo.retryTime;
            this.maxRetryTime = connInfo.maxRetryTime;
            int detectHttp3Status = Http3ConnectionDetector.detectHttp3Status();
            boolean isHttp3Enable = AwcnConfig.isHttp3Enable();
            this.xqcConnEnv = "Orange=" + isHttp3Enable + "-Detect=" + detectHttp3Status + "-AB=" + AwcnConfig.isDetectCenterEnable() + "-Ready=" + Http3ConnectionDetector.isQuicReady();
            if (GlobalAppRuntimeInfo.isAppBackground()) {
                str = "bg";
            } else {
                str = "fg";
            }
            this.isBg = str;
            this.ipStackType = Inet64Util.getStackType();
            this.netSpeed = BandWidthSampler.getInstance().getNetworkSpeed();
            this.isComplexEnable = AwcnConfig.isComplexConnectEnable();
            this.isTicketStore = AwcnConfig.isTicketStoreUpgrade();
            this.amdcInfo = GlobalAppRuntimeInfo.getAmdcInfo();
            if (Utils.isHarmonyOS()) {
                this.isHarmonyOS = 1;
                this.harmonyVersion = Utils.getHarmonyVersion();
            }
        }
    }

    public static /* synthetic */ Object ipc$super(SessionStatistic sessionStatistic, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/statist/SessionStatistic");
    }

    public void putExtra(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a756e", new Object[]{this, str, obj});
            return;
        }
        try {
            if (this.extra == null) {
                this.extra = new JSONObject();
            }
            this.extra.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        if (this.ret == 0 && this.retryTimes != this.maxRetryTime) {
            if (ALog.isPrintLog(1)) {
                ALog.d("SessionStat no need commit", null, "retry:", Long.valueOf(this.retryTimes), "maxRetryTime", Integer.valueOf(this.maxRetryTime), "errorCode", Long.valueOf(this.errorCode));
            }
            return false;
        } else if (this.isCommitted) {
            return false;
        } else {
            this.isCommitted = true;
            return true;
        }
    }

    public AlarmObject getAlarmObject() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AlarmObject) ipChange.ipc$dispatch("bfd3f9ec", new Object[]{this});
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "connect_succ_rate";
        if (this.ret != 0) {
            z = true;
        }
        alarmObject.isSuccess = z;
        if (z) {
            alarmObject.arg = this.closeReason;
        } else {
            alarmObject.errorCode = String.valueOf(this.errorCode);
        }
        return alarmObject;
    }
}
