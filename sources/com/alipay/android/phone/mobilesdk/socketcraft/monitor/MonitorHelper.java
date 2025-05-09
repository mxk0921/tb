package com.alipay.android.phone.mobilesdk.socketcraft.monitor;

import com.alipay.android.phone.mobilesdk.socketcraft.api.DefaultWebSocketClient;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.MonitorPrinterFactory;
import com.alipay.android.phone.mobilesdk.socketcraft.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MonitorHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DefaultWebSocketClient f3758a;
    public SimpleStatistical b;

    public MonitorHelper(DefaultWebSocketClient defaultWebSocketClient) {
        this.f3758a = defaultWebSocketClient;
    }

    public MonitorModel createMonitorModel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("a73762f8", new Object[]{this, str});
        }
        MonitorModel monitorModel = new MonitorModel();
        monitorModel.logTitle = str;
        monitorModel.appendAppId(this.f3758a.getBizUniqId());
        monitorModel.appendUrl(this.f3758a.getUrl());
        return monitorModel;
    }

    public SimpleStatistical getSimpleStatistical() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleStatistical) ipChange.ipc$dispatch("77f4ca08", new Object[]{this});
        }
        SimpleStatistical simpleStatistical = this.b;
        if (simpleStatistical != null) {
            return simpleStatistical;
        }
        SimpleStatistical simpleStatistical2 = new SimpleStatistical();
        this.b = simpleStatistical2;
        return simpleStatistical2;
    }

    public final void noteTraficConsume(DataflowMonitorModel dataflowMonitorModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c77c80", new Object[]{this, dataflowMonitorModel});
        } else {
            MonitorPrinterFactory.getInstance().noteTraficConsume(dataflowMonitorModel);
        }
    }

    public void printConnMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4eb62ea", new Object[]{this});
            return;
        }
        getSimpleStatistical().endConnAllTime = System.currentTimeMillis();
        MonitorModel createMonitorModel = createMonitorModel(MonitorItemConstants.WS_MONITOR_TITLE_CONN);
        createMonitorModel.appendDnsTime(String.valueOf(getSimpleStatistical().dnsTime));
        createMonitorModel.appendTcpTime(String.valueOf(getSimpleStatistical().tcpTime));
        createMonitorModel.appendSSLTime(String.valueOf(getSimpleStatistical().sslTime));
        createMonitorModel.appendWsHsTime(String.valueOf(getSimpleStatistical().wsHsTime));
        createMonitorModel.appendTargetHost(getSimpleStatistical().targetHost);
        createMonitorModel.appendAllTime(String.valueOf(getSimpleStatistical().getConnAllTime()));
        createMonitorModel.appendResult(true);
        MonitorPrinterFactory.getInstance().print(createMonitorModel);
    }

    public void printDisconnMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931b1dbe", new Object[]{this});
            return;
        }
        getSimpleStatistical().disconnectedTime = System.currentTimeMillis();
        MonitorModel createMonitorModel = createMonitorModel(MonitorItemConstants.WS_MONITOR_TITLE_DISCONN);
        createMonitorModel.appendDownMsgCount(String.valueOf(getSimpleStatistical().recvMsgCount));
        createMonitorModel.appendDownMsgLens(String.valueOf(getSimpleStatistical().recvMsgLenArray));
        createMonitorModel.appendUpMsgCount(String.valueOf(getSimpleStatistical().sendMsgCount));
        createMonitorModel.appendUpMsgLens(String.valueOf(getSimpleStatistical().sendMsgLenArray));
        createMonitorModel.appendLiveTime(String.valueOf(getSimpleStatistical().getLinkLiveTime()));
        MonitorPrinterFactory.getInstance().print(createMonitorModel);
        this.b = null;
    }

    public void printErrorMonitorLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc5b8a60", new Object[]{this, str, str2});
            return;
        }
        MonitorModel createMonitorModel = createMonitorModel("error");
        createMonitorModel.appendCode(str);
        createMonitorModel.appendErrMsg(str2);
        MonitorPrinterFactory.getInstance().print(createMonitorModel);
    }

    public void recordConnectedTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd00c6ac", new Object[]{this});
        } else {
            getSimpleStatistical().connectedTime = System.currentTimeMillis();
        }
    }

    public void recordDnsTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b81038", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            getSimpleStatistical().dnsTime = j;
        }
    }

    public void recordMonitorOfRecvMsg(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46eac421", new Object[]{this, new Integer(i)});
            return;
        }
        SimpleStatistical simpleStatistical = getSimpleStatistical();
        simpleStatistical.recvMsgCount++;
        String str = simpleStatistical.recvMsgLenArray;
        if (str == null || str.length() <= 0) {
            simpleStatistical.recvMsgLenArray = String.valueOf(i);
            return;
        }
        simpleStatistical.recvMsgLenArray += "_" + i;
    }

    public void recordMonitorOfSndMsg(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b532964", new Object[]{this, new Integer(i)});
            return;
        }
        SimpleStatistical simpleStatistical = getSimpleStatistical();
        simpleStatistical.sendMsgCount++;
        String str = simpleStatistical.sendMsgLenArray;
        if (str == null || str.length() <= 0) {
            simpleStatistical.sendMsgLenArray = String.valueOf(i);
            return;
        }
        simpleStatistical.sendMsgLenArray += "_" + i;
    }

    public void recordSSLTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1aab5", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            getSimpleStatistical().sslTime = j;
        }
    }

    public void recordStartConnAllTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850a0bf8", new Object[]{this});
        } else {
            getSimpleStatistical().startConnAllTime = System.currentTimeMillis();
        }
    }

    public void recordTargetHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837391b", new Object[]{this, str});
        } else if (!StringUtils.isEmpty(str) && !"null".equals(str)) {
            getSimpleStatistical().targetHost = str;
        }
    }

    public void recordTcpTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf226480", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            getSimpleStatistical().tcpTime = j;
        }
    }

    public void recordWsHsTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9267e58", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            getSimpleStatistical().wsHsTime = j;
        }
    }
}
