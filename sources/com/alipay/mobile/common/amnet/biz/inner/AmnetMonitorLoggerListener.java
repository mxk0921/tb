package com.alipay.mobile.common.amnet.biz.inner;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mars.comm.Alarm;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.amnet.biz.AmnetOperationManager;
import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.monitor.lbs.LBSManager;
import com.alipay.mobile.common.transport.monitor.networkqos.DeviceTrafficManager;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.alipay.mobile.common.transportext.amnet.Linkage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import tb.bmv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetMonitorLoggerListener extends AmnetListenerAdpter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3899a = "";
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public String e = "";
    public DeviceTrafficStateInfo f = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class LogModel {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTIVE_TIME = "active";
        public static final String ACTIVE_TO_INITOK = "active_init";
        public static final String ALIVE_TIMING = "dur";
        public static final String ATTEMP_COUNT = "c_c";
        public static final String ATTEMP_DURATION = "c_t";
        public static final String CHANNEL_SELECT = "CHANNEL_SELECT";
        public static final String CID = "CID";
        public static final String CLIENTIP = "CIP";
        public static final String CONN_LIST = "connlist";
        public static final String CONN_REASON = "reason";
        public static final String CONN_START_TS = "ts";
        public static final String CONN_TIMING = "tcp_c";
        public static final String DNS_TIMING = "dns_c";
        public static final String ERR_CODE = "errcode";
        public static final String ERR_INFO = "errinfo";
        public static final String EVENT_KEY_ERROR = "mmtp_error";
        public static final String EVENT_KEY_ON_CONNECTED = "mmtp_conn";
        public static final String EVENT_KEY_ON_DISCONNECED = "mmtp_close";
        public static final String EVENT_KEY_ON_INTELL_HB = "mmtp_intellhb";
        public static final String EVENT_KEY_ON_MNET_START = "mmtp_start";
        public static final String EVENT_KEY_ON_RETRENCH = "mmtp_retrench";
        public static final String EXTEND_MSG = "ext_msg";
        public static final String FIRST_FRAME = "f_ack";
        public static final String HANDSHAKE_TIMING = "tls_hs";
        public static final String INITOK_TIME = "initok";
        public static final String INIT_TIME = "init";
        public static final String INTELL_HB_COUNT = "ihb_count";
        public static final String INTELL_HB_DATA = "ihb_data";
        public static final String IP_LOCAL = "IL";
        public static final String IP_REMOTE = "IR";
        public static final String IP_SERVER = "IS";
        public static final String IS_FG = "fg";
        public static final String IS_SFC = "sfc";
        public static final String LAST_ALARM_MISS = "last_alarm_miss";
        public static final String MTAG = "MTAG";
        public static final String NETWORK = "network";
        public static final String NETWORK_EXTRA = "network_extra";
        public static final String PORT_LOCAL = "PL";
        public static final String PORT_REMOTE = "PR";
        public static final String PORT_SERVER = "PS";
        public static final String PROXY = "prx";
        public static final String QOE_MAX = "qoe_max";
        public static final String QOE_MIN = "qoe_min";
        public static final String RETRENCH_COUNT = "r_c";
        public static final String ROAM = "ROAM";
        public static final String STD_SSL = "stdssl";
        public static final String USE_TICKET = "tkt";
        public static final String YES_SSL = "yesssl";
        public static final String ZERO_RTT = "tls_0rtt";
        public DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta mDeviceTrafficStateInfoDelta;
        public String ipLocal = "";
        public String portLocal = "";
        public String ipRemote = "";
        public String portRemote = "";
        public String ipServer = "";
        public String portServer = "";
        public String event = "";
        public String dnsTime = "";
        public String connTIme = "";
        public String attempDuration = "";
        public String attempCount = "";
        public String network = "";
        public String network_extra = "";
        public String proxy = "";
        public String isFg = "";
        public String connlist = "";
        public String channelSelect = "";
        public String yesSSL = "";
        public String sslHsTime = "";
        public String connAliveTime = "";
        public String initTime = "";
        public String firstFrameTime = "";
        public String zeroRtt = "";
        public String useTicket = "";
        public String stdSSL = "";
        public String intell_hb_data = "";
        public String intell_hb_count = "";
        public String connStartTime = "";
        public String errCode = "";
        public String errInfo = "";
        public String cntRetrench = "";
        public String sfc = "";
        public String reason = "";
        public String qoeMin = "";
        public String qoeMax = "";
        public String activeTime = "";
        public String initOkTime = "";
        public String activeToInitOk = "";
        public String mtag = "";
        public String cid = "";
        public String clientIp = "";
        public String extMsg = "";
        public String libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
        public String netTunnel = "";
        public String lastAlarmMiss = "";

        public LogModel() {
        }

        public void monitorLog() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab1ee711", new Object[]{this});
                return;
            }
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType("MMTP");
            monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType("MMTP"));
            monitorLoggerModel.setParam2("INFO");
            monitorLoggerModel.setParam3(this.event);
            if (TextUtils.equals(this.event, EVENT_KEY_ERROR)) {
                monitorLoggerModel.getExtPramas().put(ERR_CODE, this.errCode);
                monitorLoggerModel.getExtPramas().put(ERR_INFO, this.errInfo);
                if (this.mDeviceTrafficStateInfoDelta != null) {
                    monitorLoggerModel.getExtPramas().put(RPCDataItems.TRX, String.valueOf(this.mDeviceTrafficStateInfoDelta.mDiffTotalRxBytes));
                    monitorLoggerModel.getExtPramas().put(RPCDataItems.TTX, String.valueOf(this.mDeviceTrafficStateInfoDelta.mDiffTotalTxBytes));
                    monitorLoggerModel.getExtPramas().put(RPCDataItems.TMRX, String.valueOf(this.mDeviceTrafficStateInfoDelta.mDiffMobileRxBytes));
                    monitorLoggerModel.getExtPramas().put(RPCDataItems.TMTX, String.valueOf(this.mDeviceTrafficStateInfoDelta.mDiffMobileTxBytes));
                    monitorLoggerModel.getExtPramas().put(RPCDataItems.TTS, String.valueOf(this.mDeviceTrafficStateInfoDelta.mDeltaTS));
                }
                if (!TextUtils.isEmpty(this.lastAlarmMiss)) {
                    monitorLoggerModel.getExtPramas().put(LAST_ALARM_MISS, this.lastAlarmMiss);
                }
            } else {
                monitorLoggerModel.getExtPramas().put(IP_LOCAL, this.ipLocal);
                monitorLoggerModel.getExtPramas().put(PORT_LOCAL, this.portLocal);
                monitorLoggerModel.getExtPramas().put(IP_REMOTE, this.ipRemote);
                monitorLoggerModel.getExtPramas().put(PORT_REMOTE, this.portRemote);
                monitorLoggerModel.getExtPramas().put(IP_SERVER, this.ipServer);
                monitorLoggerModel.getExtPramas().put(PORT_SERVER, this.portServer);
                if (TextUtils.equals(this.event, EVENT_KEY_ON_CONNECTED)) {
                    monitorLoggerModel.getExtPramas().put(DNS_TIMING, this.dnsTime);
                    monitorLoggerModel.getExtPramas().put(CONN_TIMING, this.connTIme);
                    monitorLoggerModel.getExtPramas().put(ATTEMP_COUNT, this.attempCount);
                    monitorLoggerModel.getExtPramas().put(ATTEMP_DURATION, this.attempDuration);
                    monitorLoggerModel.getExtPramas().put("network", this.network);
                    monitorLoggerModel.getExtPramas().put(NETWORK_EXTRA, this.network_extra);
                    monitorLoggerModel.getExtPramas().put(CONN_LIST, this.connlist);
                    if (!TextUtils.isEmpty(this.reason)) {
                        monitorLoggerModel.getExtPramas().put("reason", this.reason);
                    }
                    if (!TextUtils.isEmpty(this.cid)) {
                        monitorLoggerModel.getExtPramas().put("CID", this.cid);
                    }
                    String reportLBSInfo = LBSManager.getInstance().getReportLBSInfo();
                    if (!TextUtils.isEmpty(reportLBSInfo)) {
                        monitorLoggerModel.getExtPramas().put("LBS", reportLBSInfo);
                    }
                    if (NetworkUtils.isVpnUsed()) {
                        monitorLoggerModel.getExtPramas().put("VPN", "T");
                    }
                    if (!TextUtils.isEmpty(this.channelSelect)) {
                        monitorLoggerModel.getExtPramas().put(CHANNEL_SELECT, this.channelSelect);
                    }
                } else if (TextUtils.equals(this.event, EVENT_KEY_ON_DISCONNECED)) {
                    monitorLoggerModel.getExtPramas().put(DNS_TIMING, this.dnsTime);
                    monitorLoggerModel.getExtPramas().put(CONN_TIMING, this.connTIme);
                    monitorLoggerModel.getExtPramas().put(ATTEMP_COUNT, this.attempCount);
                    monitorLoggerModel.getExtPramas().put(ATTEMP_DURATION, this.attempDuration);
                    monitorLoggerModel.getExtPramas().put("network", this.network);
                    monitorLoggerModel.getExtPramas().put(NETWORK_EXTRA, this.network_extra);
                    monitorLoggerModel.getExtPramas().put(PROXY, this.proxy);
                    monitorLoggerModel.getExtPramas().put("fg", this.isFg);
                    monitorLoggerModel.getExtPramas().put(CONN_LIST, this.connlist);
                    monitorLoggerModel.getExtPramas().put(YES_SSL, this.yesSSL);
                    monitorLoggerModel.getExtPramas().put(HANDSHAKE_TIMING, this.sslHsTime);
                    monitorLoggerModel.getExtPramas().put("dur", this.connAliveTime);
                    monitorLoggerModel.getExtPramas().put("init", this.initTime);
                    monitorLoggerModel.getExtPramas().put(FIRST_FRAME, this.firstFrameTime);
                    monitorLoggerModel.getExtPramas().put(ZERO_RTT, this.zeroRtt);
                    monitorLoggerModel.getExtPramas().put(USE_TICKET, this.useTicket);
                    monitorLoggerModel.getExtPramas().put(STD_SSL, this.stdSSL);
                    monitorLoggerModel.getExtPramas().put(RETRENCH_COUNT, this.cntRetrench);
                    monitorLoggerModel.getExtPramas().put("ts", this.connStartTime);
                    if (!TextUtils.equals(this.errCode, "")) {
                        monitorLoggerModel.getExtPramas().put(ERR_CODE, this.errCode);
                        monitorLoggerModel.getExtPramas().put(ERR_INFO, this.errInfo);
                    }
                    if (!TextUtils.isEmpty(this.mtag)) {
                        monitorLoggerModel.getExtPramas().put("MTAG", this.mtag);
                    }
                    if (!TextUtils.isEmpty(this.cid)) {
                        monitorLoggerModel.getExtPramas().put("CID", this.cid);
                    }
                    if (!TextUtils.isEmpty(this.sfc)) {
                        monitorLoggerModel.getExtPramas().put(IS_SFC, this.sfc);
                    }
                    if (!TextUtils.isEmpty(this.clientIp)) {
                        monitorLoggerModel.getExtPramas().put("CIP", this.clientIp);
                    }
                    if (!TextUtils.isEmpty(this.extMsg)) {
                        monitorLoggerModel.getExtPramas().put(EXTEND_MSG, this.extMsg);
                    }
                    if (!TextUtils.isEmpty(this.activeTime)) {
                        monitorLoggerModel.getExtPramas().put("active", this.activeTime);
                        monitorLoggerModel.getExtPramas().put(INITOK_TIME, this.initOkTime);
                        monitorLoggerModel.getExtPramas().put(ACTIVE_TO_INITOK, this.activeToInitOk);
                    }
                    NetworkInfo activeNetworkInfo = NetworkUtils.getActiveNetworkInfo(AmnetEnvHelper.getAppContext());
                    if (activeNetworkInfo != null) {
                        monitorLoggerModel.getExtPramas().put(ROAM, String.valueOf(activeNetworkInfo.isRoaming()));
                    }
                    String reportLBSInfo2 = LBSManager.getInstance().getReportLBSInfo();
                    if (!TextUtils.isEmpty(reportLBSInfo2)) {
                        monitorLoggerModel.getExtPramas().put("LBS", reportLBSInfo2);
                    }
                    if (NetworkUtils.isVpnUsed()) {
                        monitorLoggerModel.getExtPramas().put("VPN", "T");
                    }
                    if (!TextUtils.isEmpty(this.channelSelect)) {
                        monitorLoggerModel.getExtPramas().put(CHANNEL_SELECT, this.channelSelect);
                    }
                } else if (TextUtils.equals(this.event, EVENT_KEY_ON_INTELL_HB)) {
                    monitorLoggerModel.getExtPramas().put("ts", this.connStartTime);
                    monitorLoggerModel.getExtPramas().put("network", this.network);
                    monitorLoggerModel.getExtPramas().put(NETWORK_EXTRA, this.network_extra);
                    monitorLoggerModel.getExtPramas().put(INTELL_HB_DATA, this.intell_hb_data);
                    monitorLoggerModel.getExtPramas().put(INTELL_HB_COUNT, this.intell_hb_count);
                    if (!TextUtils.isEmpty(this.cid)) {
                        monitorLoggerModel.getExtPramas().put("CID", this.cid);
                    }
                }
            }
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SWITCH_TAG_LOG);
            if (!TextUtils.isEmpty(stringValue)) {
                monitorLoggerModel.getExtPramas().put(bmv.MSGTYPE_START_LOG, stringValue);
            }
            monitorLoggerModel.getExtPramas().put("Ground", String.valueOf(MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext()) ? 1 : 0));
            int connType = ConnectionUtil.getConnType(AmnetEnvHelper.getAppContext());
            int networkType = ConnectionUtil.getNetworkType(AmnetEnvHelper.getAppContext());
            Map<String, String> extPramas = monitorLoggerModel.getExtPramas();
            extPramas.put(RPCDataItems.NETTYPE, connType + "_" + networkType);
            monitorLoggerModel.getExtPramas().put(MonitorLoggerUtils.LIB_VERSION, this.libVersion);
            if (!TextUtils.isEmpty(this.netTunnel)) {
                monitorLoggerModel.getExtPramas().put("NETTUNNEL", this.netTunnel);
            }
            if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.NET_AVAILABLE, UTConstant.Args.UT_SUCCESS_F);
            }
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
            LogCatUtil.debug("AmnetMonitorLoggerListener", monitorLoggerModel.toString());
        }
    }

    public static /* synthetic */ Object ipc$super(AmnetMonitorLoggerListener amnetMonitorLoggerListener, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/inner/AmnetMonitorLoggerListener");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f == null) {
            synchronized (DeviceTrafficManager.class) {
                if (this.f == null) {
                    this.f = DeviceTrafficManager.getInstance().startTrafficMonitor();
                    if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                        LogCatUtil.info("AmnetMonitorLoggerListener", "[startTrafficMonitor] finished.");
                    }
                }
            }
        }
    }

    public final void b(LogModel logModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("139e29fc", new Object[]{this, logModel});
            return;
        }
        try {
            long activateTime = ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getActivateTime();
            if (activateTime != -1) {
                logModel.activeTime = String.valueOf(activateTime);
                logModel.initOkTime = String.valueOf(this.c);
                logModel.activeToInitOk = String.valueOf(this.c - activateTime);
                ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).setActivateTime(-1L);
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetMonitorLoggerListener", th);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f != null) {
            synchronized (DeviceTrafficManager.class) {
                this.f = null;
            }
            if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                LogCatUtil.info("AmnetMonitorLoggerListener", "resetStartDeviceTrafficStateInfo finished.");
            }
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void change(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
            if (1 == i) {
                a();
            } else {
                c();
            }
        }
    }

    public final void d(LogModel logModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb1a03bd", new Object[]{this, logModel});
        } else if (this.f != null && logModel != null) {
            try {
                logModel.mDeviceTrafficStateInfoDelta = DeviceTrafficManager.getInstance().stopTrafficMonitor(this.f);
            } catch (Throwable th) {
                LogCatUtil.warn("AmnetMonitorLoggerListener", "[setDeviceTrafficStateInfoDelta] Exception: " + th.toString());
            }
            c();
        }
    }

    public LogModel getLogModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogModel) ipChange.ipc$dispatch("c84536e8", new Object[]{this});
        }
        return new LogModel();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
            return;
        }
        this.c = System.currentTimeMillis();
        LogCatUtil.info("AmnetMonitorLoggerListener", "get notifyInitOK");
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void notifyInitResponse(Initialization.RspInit rspInit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b845a7ee", new Object[]{this, rspInit});
        } else {
            this.e = rspInit.clientIp;
        }
    }

    public void notifyReportOnConnect(Linkage.Touching touching) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd27281b", new Object[]{this, touching});
            return;
        }
        LogCatUtil.debug("AmnetMonitorLoggerListener", "notifyReportOnConnect");
        oldTouch(touching.ipLocal, touching.ipRemote, touching.portLocal, touching.portRemote);
        LogModel logModel = getLogModel();
        logModel.event = LogModel.EVENT_KEY_ON_CONNECTED;
        logModel.ipLocal = touching.ipLocal;
        logModel.portLocal = touching.portLocal;
        logModel.ipRemote = touching.ipRemote;
        logModel.portRemote = touching.portRemote;
        logModel.ipServer = touching.ipServer;
        logModel.portServer = touching.portServer;
        logModel.connlist = touching.group;
        logModel.attempCount = String.valueOf(touching.cntAttempt);
        logModel.attempDuration = String.valueOf(touching.msAttempt);
        if (!touching.isUseBifrost) {
            logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
        } else if (touching.isUseHttp2) {
            logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2;
            logModel.netTunnel = MonitorLoggerUtils.NETTUNNEL_ULib_h2;
        } else {
            logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST;
        }
        logModel.dnsTime = String.valueOf(touching.msDns);
        logModel.connTIme = String.valueOf(touching.msTcp);
        String str = touching.network;
        if (str != null) {
            logModel.network = str;
        } else {
            logModel.network = "";
        }
        String str2 = touching.netname;
        if (str2 != null) {
            logModel.network_extra = str2;
        } else {
            logModel.network_extra = "";
        }
        int i = touching.reason;
        if (i > 0) {
            logModel.reason = String.valueOf(i);
        }
        logModel.cid = String.valueOf(touching.cid);
        logModel.channelSelect = String.valueOf(touching.channelSelect);
        logModel.monitorLog();
    }

    public void notifyReportOnDisconnect(Linkage.Touching touching, Linkage.Separating separating) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560a27ae", new Object[]{this, touching, separating});
            return;
        }
        if (touching.yesLnk) {
            LogModel logModel = getLogModel();
            logModel.event = LogModel.EVENT_KEY_ON_DISCONNECED;
            logModel.ipLocal = touching.ipLocal;
            logModel.portLocal = touching.portLocal;
            logModel.ipRemote = touching.ipRemote;
            logModel.portRemote = touching.portRemote;
            logModel.ipServer = touching.ipServer;
            logModel.portServer = touching.portServer;
            String str = "0";
            logModel.proxy = touching.proxy ? "1" : str;
            logModel.isFg = touching.foreground ? "1" : str;
            logModel.dnsTime = String.valueOf(touching.msDns);
            logModel.connTIme = String.valueOf(touching.msTcp);
            logModel.attempCount = String.valueOf(touching.cntAttempt);
            logModel.attempDuration = String.valueOf(touching.msAttempt);
            logModel.clientIp = this.e;
            if (!touching.isUseBifrost && !separating.isUseBifrost) {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
            } else if (touching.isUseHttp2 || separating.isUseHttp2) {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2;
                logModel.netTunnel = MonitorLoggerUtils.NETTUNNEL_ULib_h2;
            } else {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST;
            }
            String str2 = touching.network;
            if (str2 != null) {
                logModel.network = str2;
            } else {
                logModel.network = "";
            }
            String str3 = touching.netname;
            if (str3 != null) {
                logModel.network_extra = str3;
            } else {
                logModel.network_extra = "";
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            if (this.d != -1) {
                logModel.connStartTime = simpleDateFormat.format(new Date(this.d));
            } else {
                logModel.connStartTime = "";
            }
            if (this.c != -1) {
                logModel.initTime = simpleDateFormat.format(new Date(this.c));
            } else {
                logModel.initTime = "";
            }
            if (separating.yesSsl) {
                logModel.sslHsTime = String.valueOf(separating.msSsl);
                logModel.zeroRtt = separating.fast ? "1" : str;
                logModel.useTicket = separating.ticket ? "1" : str;
                logModel.stdSSL = separating.standard ? "1" : str;
            } else {
                logModel.sslHsTime = "";
                logModel.zeroRtt = "";
                logModel.useTicket = "";
                logModel.stdSSL = "";
            }
            if (separating.yesSsl) {
                str = "1";
            }
            logModel.yesSSL = str;
            logModel.firstFrameTime = String.valueOf(separating.msFirst);
            logModel.connAliveTime = String.valueOf(separating.msLife);
            logModel.cntRetrench = String.valueOf(separating.cntRetrench);
            int i = separating.qoeMin;
            if (i > 0) {
                logModel.qoeMin = String.valueOf(i);
            }
            int i2 = separating.qoeMax;
            if (i2 > 0) {
                logModel.qoeMax = String.valueOf(i2);
            }
            if (touching.freqConn) {
                logModel.sfc = "T";
            }
            if (!TextUtils.isEmpty(separating.mtag)) {
                logModel.mtag = "";
            }
            logModel.cid = String.valueOf(touching.cid);
            if (separating.yesErr) {
                logModel.errCode = String.valueOf(separating.codeErr);
                logModel.errInfo = separating.infErr;
            } else {
                logModel.errCode = "";
            }
            logModel.extMsg = separating.extMsg;
            logModel.channelSelect = String.valueOf(touching.channelSelect);
            b(logModel);
            logModel.monitorLog();
            int i3 = separating.cntHb;
            if (i3 > 0) {
                notifyReportOnIHB(touching, separating.infHb, i3);
            }
        } else if (separating.yesErr) {
            reportError(separating.codeErr, separating.infErr);
        }
        this.c = -1L;
        this.d = -1L;
    }

    public void notifyReportOnRetrench(Linkage.Touching touching) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bee9728", new Object[]{this, touching});
        } else if (touching != null) {
            LogModel logModel = getLogModel();
            logModel.event = LogModel.EVENT_KEY_ON_RETRENCH;
            logModel.ipLocal = touching.ipLocal;
            logModel.portLocal = touching.portLocal;
            logModel.ipRemote = touching.ipRemote;
            logModel.portRemote = touching.portRemote;
            logModel.ipServer = touching.ipServer;
            logModel.portServer = touching.portServer;
            logModel.monitorLog();
        }
    }

    public void oldTouch(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ac307", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.c = -1L;
        this.d = System.currentTimeMillis();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void panic(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
            return;
        }
        LogCatUtil.info("AmnetMonitorLoggerListener", "Panic errorCode = " + i + "Info: " + str);
        if (67 == i || 69 == i) {
            reportError(i, str);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void report(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
            return;
        }
        LogCatUtil.verbose("AmnetMonitorLoggerListener", "Report =" + str + " " + d);
    }

    public void reportError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f899c272", new Object[]{this, new Integer(i), str});
        } else if (!TextUtils.equals(this.f3899a, LogModel.EVENT_KEY_ERROR) || this.b == -1 || System.currentTimeMillis() > this.b) {
            this.f3899a = LogModel.EVENT_KEY_ERROR;
            this.b = System.currentTimeMillis() + 2000;
            LogModel logModel = getLogModel();
            logModel.event = LogModel.EVENT_KEY_ERROR;
            logModel.errInfo = str;
            logModel.errCode = String.valueOf(i);
            if (AmnetTunnelManager.getInstance().isNowUseBifrost()) {
                if (AmnetTunnelManager.getInstance().isNowUseBifrostH2()) {
                    logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2;
                    logModel.netTunnel = MonitorLoggerUtils.NETTUNNEL_ULib_h2;
                } else {
                    logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST;
                }
                int lastAlarmMiss = Alarm.getLastAlarmMiss();
                if (lastAlarmMiss > 10000) {
                    logModel.lastAlarmMiss = String.valueOf(lastAlarmMiss);
                }
            } else {
                logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
            }
            d(logModel);
            logModel.monitorLog();
        } else {
            LogCatUtil.info("AmnetMonitorLoggerListener", "Repeat the event =" + this.f3899a);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AmnetGeneralListener
    public void touch(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93e466e", new Object[]{this, str, str2, str3, str4});
        }
    }

    public void notifyReportOnIHB(Linkage.Touching touching, Linkage.Keeping[] keepingArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2cf93a", new Object[]{this, touching, keepingArr, new Integer(i)});
            return;
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.AMENT_INTLGNT_HB_PERF);
        if (TextUtils.isEmpty(stringValue) || !stringValue.startsWith("T")) {
            LogCatUtil.debug("AmnetMonitorLoggerListener", "Intelligent Hearbeat data report is off");
            return;
        }
        LogModel logModel = getLogModel();
        logModel.event = LogModel.EVENT_KEY_ON_INTELL_HB;
        logModel.ipLocal = touching.ipLocal;
        logModel.portLocal = touching.portLocal;
        logModel.ipRemote = touching.ipRemote;
        logModel.portRemote = touching.portRemote;
        logModel.ipServer = touching.ipServer;
        logModel.portServer = touching.portServer;
        if (!touching.isUseBifrost) {
            logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_OLD;
        } else if (AmnetTunnelManager.getInstance().isNowUseBifrostH2()) {
            logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2;
            logModel.netTunnel = MonitorLoggerUtils.NETTUNNEL_ULib_h2;
        } else {
            logModel.libVersion = MonitorLoggerUtils.LIB_VERSION_BIFROST;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        if (this.d != -1) {
            logModel.connStartTime = simpleDateFormat.format(new Date(this.d));
        } else {
            logModel.connStartTime = "";
        }
        long j = touching.cid;
        if (j > 0) {
            logModel.cid = String.valueOf(j);
        }
        String str = touching.network;
        if (str != null) {
            logModel.network = str;
        } else {
            logModel.network = "";
        }
        String str2 = touching.netname;
        if (str2 != null) {
            logModel.network_extra = str2;
        } else {
            logModel.network_extra = "";
        }
        logModel.intell_hb_count = String.valueOf(i);
        if (keepingArr == null || i <= 0) {
            logModel.monitorLog();
            return;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i2 = 0; i2 < i; i2++) {
            Linkage.Keeping keeping = keepingArr[i2];
            if (keeping != null) {
                sb.append(keeping.stamp);
                sb.append("_");
                sb.append(keeping.interval);
                sb.append("_");
                sb.append(keeping.rtt);
                sb.append("_");
                sb.append(keeping.sReal);
                if (i2 < i - 1) {
                    sb.append("-");
                }
            }
        }
        logModel.intell_hb_data = sb.toString();
        logModel.monitorLog();
    }
}
