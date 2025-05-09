package com.alipay.mobile.common.transport.monitor;

import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.PerformanceDataCallback;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.lbs.LBSManager;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RPCDataParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BOUND_SYMBOL = ",";
    public static final String PLACE_HOLDER = "-";
    public static final String TIME_MS = "ms";

    public static void a(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84505d7a", new Object[]{monitorLoggerModel});
            return;
        }
        try {
            i(monitorLoggerModel);
            if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.NET_AVAILABLE, UTConstant.Args.UT_SUCCESS_F);
            }
        } catch (Throwable th) {
            LogCatUtil.error("RPCDataParser", "addGlobalLog ex:" + th.toString());
        }
    }

    public static void b(MonitorLoggerModel monitorLoggerModel, String str, DataContainer dataContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216c2cc5", new Object[]{monitorLoggerModel, str, dataContainer});
        } else if (ExtTransportStrategy.EXT_PROTO_MRPC.equals(str)) {
            String dataItem = dataContainer.getDataItem(MonitorLoggerUtils.LIB_VERSION);
            if (!TextUtils.isEmpty(dataItem)) {
                monitorLoggerModel.getExtPramas().put(MonitorLoggerUtils.LIB_VERSION, dataItem);
            }
        }
    }

    public static void buildAndWriteLog(TransportContext transportContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc832c5c", new Object[]{transportContext, str});
            return;
        }
        DataContainer dataContainer = transportContext.dcList.get(str);
        if (dataContainer != null) {
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            n(transportContext, monitorLoggerModel);
            monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType(monitorLoggerModel.getSubType()));
            monitorLoggerModel.setParam2("INFO");
            if ("https".equals(str) && !TextUtils.isEmpty(transportContext.url)) {
                try {
                    str = new URL(transportContext.url).getProtocol();
                } catch (Throwable th) {
                    LogCatUtil.info("RPCDataParser", "Create URL object exception: " + th.toString());
                }
            }
            monitorLoggerModel.setParam3(str);
            monitorLoggerModel.getExtPramas().put(RPCDataItems.NETTYPE, transportContext.getNetType());
            g(monitorLoggerModel.getExtPramas(), "DNS_TIME", dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), "TCP_TIME", dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), "SSL_TIME", dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), "ALL_TIME", dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.REQ_SIZE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.RES_SIZE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.DOWN_TRAFFIC, dataContainer, false);
            monitorLoggerModel.getExtPramas().put(TransportConstants.KEY_UUID, transportContext.rpcUUID);
            byte b = transportContext.bizType;
            if (b == 2 || b == 3 || b == 4 || b == 5 || b == 1) {
                monitorLoggerModel.getExtPramas().put("API", transportContext.api);
                l(transportContext, monitorLoggerModel);
            } else if (!TextUtils.isEmpty(transportContext.api)) {
                monitorLoggerModel.getExtPramas().put("API", transportContext.api);
                if (MiscUtils.isMdapApi(transportContext.api)) {
                    monitorLoggerModel.setSubType("LOG");
                }
            } else {
                l(transportContext, monitorLoggerModel);
            }
            if (TextUtils.isEmpty(dataContainer.getDataItem("ERROR"))) {
                monitorLoggerModel.getExtPramas().put("RESULT", "T");
                f(dataContainer, monitorLoggerModel);
            } else {
                monitorLoggerModel.getExtPramas().put("RESULT", UTConstant.Args.UT_SUCCESS_F);
                monitorLoggerModel.setParam2("FATAL");
            }
            g(monitorLoggerModel.getExtPramas(), "ERROR", dataContainer, false);
            if (TextUtils.isEmpty(dataContainer.getDataItem(RPCDataItems.DOWN))) {
                monitorLoggerModel.getExtPramas().put("EXT1", UTConstant.Args.UT_SUCCESS_F);
            } else {
                monitorLoggerModel.getExtPramas().put("EXT1", "T");
            }
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.ATLS_DOWN, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.STALLED_TIME, dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.SENT_TIME, dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.WAIT_TIME, dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.PROXY, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), "TARGET_HOST", dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.TARGET_HOST_SHORT, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.RESET_COOKIE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.READ_TIME, dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.SA_TIME, dataContainer, true);
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.ADVANCED_NET_PERF_PROFILING);
            if (TextUtils.isEmpty(stringValue) || !stringValue.startsWith("T")) {
                LogCatUtil.debug("RPCDataParser", "Advanced NetPerf Profiling is off");
            } else {
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.IPC_TIME1, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.IPC_TIME2, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.AW_TIME, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.AMNET_STALLED_TIME, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.AIR_TIME, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.UTC_TIME, dataContainer, true);
            }
            if (!TextUtils.isEmpty(dataContainer.getDataItem("RETRY"))) {
                monitorLoggerModel.getExtPramas().put("RETRY", "T");
            }
            if (TextUtils.equals(dataContainer.getDataItem(RPCDataItems.ORIGHC), "T")) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.ORIGHC, "T");
            }
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.HRC, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.SWITCH_TAG_LOG, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.PRIO, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.DT, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.CDN_VIA, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.CDN_EAGLEID, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.RPCID, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.ONSHORT, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), "MTAG", dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.QOE_CUR, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.NTCP_TIME, dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.NSSL_TIME, dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.CPS, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.IMGDOWNGRADE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), "CANCEL", dataContainer, false);
            if (TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.LOG_PRIO_SWITCH) >= 3) {
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.JTC_TIME, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.AMNET_QUENE, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.AMNET_ST, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.CTJ_OUT_TIME, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.NT_IO_TIME, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.QUEUE_OUT_TIME, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.AMNET_HUNG_TIME, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.AMNET_ENCODE_TIME, dataContainer, true);
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.AMNET_ALL_TIME, dataContainer, true);
            }
            g(monitorLoggerModel.getExtPramas(), "CID", dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.FLEXIBLE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), "bizId", dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), "CIP", dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.REQUSET_BODY_RAW_SIZE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.GROUND, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.IP_STACK, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.RETRYCOUNT, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.QOS, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.IGN_ERR, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.MULTI_MAIN, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.DWN_GZIP, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.UP_ZIP_TYPE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.DOWN_ZIP_TYPE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.DJG_INNER_BIZ, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.UP_MEDIA_TYPE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), "NETTUNNEL", dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.PROTOCOL, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.SUB_TYPE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.H5_LDCID_LEVEL, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.REQUEST_METHOD, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.USE_SELF_ENCODE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.RADICAL_STRATEGY, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.THREAD_POOL_ALL_TASK_COUNT, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.THREAD_POOL_ACTIVE_COUNT, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.CP_TIME, dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.MULTIPLEX_LINK, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.H5_RESPONSE_SOURCE, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.H5_CACHE_SETUP_TIME, dataContainer, true);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.MOBILEGW_RESULT_STATUS, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.H5_MAIN_DOC, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.JUMP_SRC_APPID, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.BIZ_FLAG, dataContainer, false);
            g(monitorLoggerModel.getExtPramas(), RPCDataItems.H5_PAGE_TRACE_ID, dataContainer, false);
            if (transportContext.transportByLocalAmnet) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.LOCAL_AMNET, "T");
            }
            if (transportContext.printUrlToMonitorLog) {
                g(monitorLoggerModel.getExtPramas(), RPCDataItems.REDIRECT_URL, dataContainer, false);
            }
            if (transportContext.urgentFlag) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.URGENT, "T");
            }
            b(monitorLoggerModel, str, dataContainer);
            a(monitorLoggerModel);
            m(transportContext, monitorLoggerModel);
            e(transportContext, dataContainer, monitorLoggerModel);
            k(transportContext, monitorLoggerModel);
            if (!TextUtils.isEmpty(transportContext.targetSpi)) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.TARGET_SPI, transportContext.targetSpi);
            }
            if (transportContext.tcpCount > 1) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.TCP_COUNT, String.valueOf(transportContext.tcpCount));
            }
            if (transportContext.sslCount > 1) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.SSL_COUNT, String.valueOf(transportContext.sslCount));
            }
            j(transportContext, monitorLoggerModel);
            d(transportContext, monitorLoggerModel);
            String str2 = monitorLoggerModel.getSubType() + "_PERF";
            String dataItem = dataContainer.getDataItem("ERROR");
            if (TextUtils.isEmpty(dataContainer.getDataItem(RPCDataItems.IGN_ERR)) || TextUtils.isEmpty(dataItem)) {
                MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel, transportContext);
            } else {
                LogCatUtil.debug(str2, "ignErr don't upload");
            }
            PerformanceDataCallback performanceDataCallback = transportContext.mPerformanceDataCallback;
            if (performanceDataCallback != null) {
                try {
                    performanceDataCallback.callback(Collections.unmodifiableMap(monitorLoggerModel.getExtPramas()));
                } catch (Throwable th2) {
                    LogCatUtil.warn("RPCDataParser", "[buildAndWriteLog] PerformanceDataCallback Exception = " + th2.toString());
                }
            }
            transportContext.perfLog = str2 + ":" + monitorLoggerModel.toString();
            StringBuilder sb = new StringBuilder();
            sb.append(transportContext.perfLog);
            sb.append("\n");
            LogCatUtil.debug(str2, sb.toString());
        }
    }

    public static void c(TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550fcf9f", new Object[]{transportContext});
            return;
        }
        try {
            buildAndWriteLog(transportContext, "spdy");
        } catch (Exception e) {
            LogCatUtil.warn("RPCDataParser", e);
        }
        try {
            buildAndWriteLog(transportContext, ExtTransportStrategy.EXT_PROTO_MRPC);
        } catch (Exception e2) {
            LogCatUtil.warn("RPCDataParser", e2);
        }
        try {
            buildAndWriteLog(transportContext, "https");
        } catch (Exception e3) {
            LogCatUtil.warn("RPCDataParser", e3);
        }
    }

    public static void d(TransportContext transportContext, MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6bc6e31", new Object[]{transportContext, monitorLoggerModel});
        } else if (transportContext == null) {
            LogCatUtil.warn("RPCDataParser", "[putBizLog] TransportContext is null.");
        } else if (!TextUtils.isEmpty(transportContext.bizLog)) {
            if (transportContext.bizLog.length() <= 128) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.BIZ_LOG, transportContext.bizLog);
                return;
            }
            try {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.BIZ_LOG, transportContext.bizLog.substring(0, 128) + "...");
            } catch (Throwable th) {
                LogCatUtil.warn("RPCDataParser", "[putBizLog] Put biz log exception = " + th.toString());
            }
        }
    }

    public static void e(TransportContext transportContext, DataContainer dataContainer, MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876b84f2", new Object[]{transportContext, dataContainer, monitorLoggerModel});
            return;
        }
        try {
            String dataItem = dataContainer.getDataItem("ALL_TIME");
            String dataItem2 = dataContainer.getDataItem(RPCDataItems.STALLED_TIME);
            if (!TextUtils.isEmpty(dataItem) && !TextUtils.isEmpty(dataItem2)) {
                long parseLong = Long.parseLong(dataItem) + Long.parseLong(dataItem2);
                Map<String, String> extPramas = monitorLoggerModel.getExtPramas();
                extPramas.put(RPCDataItems.OLD_RPC_ALL_TIME, parseLong + "ms");
            }
            String dataItem3 = dataContainer.getDataItem(RPCDataItems.RPC_ALL_TIME);
            if (!TextUtils.isEmpty(dataItem3) && !TextUtils.isEmpty(dataItem2)) {
                long j = transportContext.taskFinishedTimeMillis;
                if (j < 0) {
                    j = System.currentTimeMillis();
                }
                long parseLong2 = (j - Long.parseLong(dataItem3)) + Long.parseLong(dataItem2);
                Map<String, String> extPramas2 = monitorLoggerModel.getExtPramas();
                extPramas2.put(RPCDataItems.RPC_ALL_TIME, parseLong2 + "ms");
            }
        } catch (Exception e) {
            LogCatUtil.error("RPCDataParser", "addRpcAllTime exception", e);
        }
    }

    public static void f(DataContainer dataContainer, MonitorLoggerModel monitorLoggerModel) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53e16fb", new Object[]{dataContainer, monitorLoggerModel});
            return;
        }
        try {
            String dataItem = dataContainer.getDataItem(RPCDataItems.REQ_SIZE);
            if (!TextUtils.isEmpty(dataItem)) {
                d = Double.valueOf(dataItem).doubleValue();
            } else {
                d = -1.0d;
            }
            String dataItem2 = dataContainer.getDataItem(RPCDataItems.RES_SIZE);
            if (!TextUtils.isEmpty(dataItem2)) {
                d += Double.valueOf(dataItem2).doubleValue();
            }
            if (d > vu3.b.GEO_NOT_SUPPORT) {
                String dataItem3 = dataContainer.getDataItem("ALL_TIME");
                if (!TextUtils.isEmpty(dataItem3)) {
                    Double valueOf = Double.valueOf(dataItem3);
                    if (valueOf.doubleValue() > vu3.b.GEO_NOT_SUPPORT) {
                        monitorLoggerModel.getExtPramas().put(RPCDataItems.BAND_WIDTH, String.format("%.4f", Double.valueOf((((d / (valueOf.doubleValue() / 1000.0d)) * 8.0d) / 1024.0d) / 1024.0d)));
                    }
                }
            }
        } catch (Exception e) {
            LogCatUtil.error("RPCDataParser", e);
        }
    }

    public static void g(Map<String, String> map, String str, DataContainer dataContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703e2ec", new Object[]{map, str, dataContainer, new Boolean(z)});
            return;
        }
        String dataItem = dataContainer.getDataItem(str);
        if (!TextUtils.isEmpty(dataItem)) {
            if (z) {
                dataItem = dataItem + "ms";
            }
            map.put(str, dataItem);
        }
    }

    public static void h(Map<String, String> map, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8610c43", new Object[]{map, str, str2, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str2)) {
            if (z) {
                str2 = str2 + "ms";
            }
            map.put(str, str2);
        }
    }

    public static void i(MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c9b37b", new Object[]{monitorLoggerModel});
            return;
        }
        try {
            String reportLBSInfo = LBSManager.getInstance().getReportLBSInfo();
            if (!TextUtils.isEmpty(reportLBSInfo)) {
                monitorLoggerModel.getExtPramas().put("LBS", reportLBSInfo);
            }
        } catch (Throwable th) {
            LogCatUtil.error("RPCDataParser", "addLbsLog ex:" + th.toString());
        }
    }

    public static void m(TransportContext transportContext, MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64fd4ad", new Object[]{transportContext, monitorLoggerModel});
            return;
        }
        try {
            DeviceTrafficStateInfo deviceTrafficStateInfo = transportContext.deviceTrafficStateInfo;
            if (deviceTrafficStateInfo != null) {
                DeviceTrafficStateInfo.DeviceTrafficStateInfoDelta stopTrafficMonitor = AlipayQosService.getInstance().stopTrafficMonitor(deviceTrafficStateInfo);
                monitorLoggerModel.getExtPramas().put(RPCDataItems.TRX, String.valueOf(stopTrafficMonitor.mDiffTotalRxBytes));
                monitorLoggerModel.getExtPramas().put(RPCDataItems.TTX, String.valueOf(stopTrafficMonitor.mDiffTotalTxBytes));
                monitorLoggerModel.getExtPramas().put(RPCDataItems.TMRX, String.valueOf(stopTrafficMonitor.mDiffMobileRxBytes));
                monitorLoggerModel.getExtPramas().put(RPCDataItems.TMTX, String.valueOf(stopTrafficMonitor.mDiffMobileTxBytes));
                monitorLoggerModel.getExtPramas().put(RPCDataItems.TTS, String.valueOf(stopTrafficMonitor.mDeltaTS));
                monitorLoggerModel.getExtPramas().put(RPCDataItems.SPEED, String.format("%.4f", Double.valueOf(AlipayQosService.getInstance().getSpeed())));
                monitorLoggerModel.getExtPramas().put(RPCDataItems.BAND_WIDTH_WESTWOOD, String.format("%.4f", Double.valueOf(AlipayQosService.getInstance().getBandwidth())));
            }
        } catch (Throwable th) {
            LogCatUtil.error("RPCDataParser", "addTrafficLog ex:" + th.toString());
        }
    }

    public static final void monitorLog(TransportContext transportContext) {
        Map<String, DataContainer> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b074596", new Object[]{transportContext});
        } else if (transportContext != null && (map = transportContext.dcList) != null && !map.isEmpty()) {
            try {
                parserContext(transportContext);
            } catch (Exception e) {
                LogCatUtil.error("RPCDataParser", "RPC监控日志统计异常", e);
            }
        }
    }

    public static void n(TransportContext transportContext, MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1634ae4c", new Object[]{transportContext, monitorLoggerModel});
            return;
        }
        byte b = transportContext.bizType;
        if (b == 2) {
            monitorLoggerModel.setSubType("H5");
        } else if (b == 3) {
            monitorLoggerModel.setSubType(NetworkServiceTracer.REPORT_SUB_NAME_DJG);
        } else if (b == 4) {
            monitorLoggerModel.setSubType(NetworkServiceTracer.REPORT_SUB_NAME_RSRC);
        } else if (b == 5) {
            monitorLoggerModel.setSubType("LOG");
        } else if (!TextUtils.isEmpty(transportContext.api)) {
            monitorLoggerModel.setSubType(NetworkServiceTracer.REPORT_SUB_NAME_RPC);
        } else {
            monitorLoggerModel.setSubType(NetworkServiceTracer.REPORT_SUB_NAME_RSRC);
        }
    }

    public static void parserContext(TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49cc4d50", new Object[]{transportContext});
        } else if (TextUtils.isEmpty(transportContext.api)) {
            buildAndWriteLog(transportContext, "https");
        } else {
            c(transportContext);
        }
    }

    public static void j(TransportContext transportContext, MonitorLoggerModel monitorLoggerModel) {
        HttpUrlRequest httpUrlRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a147d0", new Object[]{transportContext, monitorLoggerModel});
        } else if (transportContext != null && (httpUrlRequest = transportContext.originRequest) != null) {
            h(monitorLoggerModel.getExtPramas(), RPCDataItems.SIGN_TIME, httpUrlRequest.getTag(TransportConstants.KEY_SIGN_TIME), true);
        }
    }

    public static void k(TransportContext transportContext, MonitorLoggerModel monitorLoggerModel) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c686216f", new Object[]{transportContext, monitorLoggerModel});
        } else if (monitorLoggerModel != null && transportContext != null && (map = transportContext.logAttachmentMap) != null && !map.isEmpty()) {
            try {
                StringBuilder sb = new StringBuilder("Attachment logs: {");
                for (Map.Entry<String, String> entry : transportContext.logAttachmentMap.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        monitorLoggerModel.getExtPramas().put(entry.getKey(), entry.getValue());
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(entry.getValue());
                        sb.append(',');
                    }
                }
                sb.append("}");
                LogCatUtil.info("RPCDataParser", "[logAttachmentToMonitorLogger] " + sb.toString());
                sb.delete(0, sb.length());
            } catch (Throwable th) {
                LogCatUtil.error("RPCDataParser", "[logAttachmentToMonitorLogger] Exception: " + th.toString());
            }
        }
    }

    public static void l(TransportContext transportContext, MonitorLoggerModel monitorLoggerModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366afb0e", new Object[]{transportContext, monitorLoggerModel});
        } else if (transportContext.printUrlToMonitorLog) {
            String str = transportContext.url;
            if (TextUtils.isEmpty(str)) {
                monitorLoggerModel.getExtPramas().put(MonitorItemConstants.KEY_URL, "None");
            } else if (str.length() <= 2048) {
                monitorLoggerModel.getExtPramas().put(MonitorItemConstants.KEY_URL, str);
            } else {
                try {
                    str = str.substring(0, 2048).concat("...");
                    monitorLoggerModel.getExtPramas().put(RPCDataItems.URL_TRUNCATED, "T");
                } catch (Throwable th) {
                    LogCatUtil.error("RPCDataParser", "[putURLToExtPramas] substring Exception: " + th.toString(), th);
                }
                monitorLoggerModel.getExtPramas().put(MonitorItemConstants.KEY_URL, str);
            }
        }
    }
}
