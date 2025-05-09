package com.alipay.mobile.common.amnet.biz;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager;
import com.alipay.mobile.common.amnet.api.AmnetGeneralListener;
import com.alipay.mobile.common.amnet.api.model.AppEvent;
import com.alipay.mobile.common.amnet.api.model.DnsAddressInfo;
import com.alipay.mobile.common.amnet.api.model.DnsInfo;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.alipay.mobile.common.transportext.amnet.Initialization;
import com.alipay.mobile.common.transportext.amnet.Linkage;
import com.alipay.mobilegw.amnet.core.linkserver.netmodel.CmdIpAddress;
import com.alipay.mobilegw.amnet.core.linkserver.netmodel.CmdKeyValue;
import com.alipay.mobilegw.amnet.core.linkserver.netmodel.CmdListMessage;
import com.alipay.mobilegw.amnet.core.linkserver.netmodel.CmdMap;
import com.alipay.mobilegw.amnet.core.linkserver.netmodel.CmdMessage;
import com.alipay.mobilegw.amnet.core.linkserver.netmodel.CmdType;
import com.alipay.mobilegw.amnet.core.linkserver.netmodel.DNSResponse;
import com.alipay.mobilegw.amnet.core.linkserver.netmodel.IpListCmdData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okio.ByteString;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetGeneralEventManagerImpl implements AmnetGeneralEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AmnetLinkageListener b;
    public AmnetGeneralListener[] c;
    public final ReentrantReadWriteLock.ReadLock d;
    public final ReentrantReadWriteLock.WriteLock e;

    /* renamed from: a  reason: collision with root package name */
    public final List<AmnetGeneralListener> f3895a = new ArrayList(2);
    public int f = -1;
    public boolean g = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AmnetLinkageListener implements Linkage {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AmnetLinkageListener() {
        }

        public final void a(Map<Byte, Map<String, String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            try {
                LogCatUtil.info("AmnetGeneralEventManager", "all init info = [" + JSON.toJSONString(map) + "]");
            } catch (Exception e) {
                LogCatUtil.error("AmnetGeneralEventManager", e);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public boolean cancelAlarmTimer(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("27142692", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return true;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void change(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
            } else {
                AmnetGeneralEventManagerImpl.this.notifyConnStateChange(i);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void collect(Map<Byte, Map<String, String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c002b4", new Object[]{this, map});
                return;
            }
            AmnetGeneralEventManagerImpl.this.notifyCollectInitInfo(map);
            a(map);
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void command(List<Linkage.Cmd> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63e06f43", new Object[]{this, list});
            } else if (!list.isEmpty()) {
                for (Linkage.Cmd cmd : list) {
                    if (cmd.type == CmdType.ConnectionDowngrade.getValue()) {
                        try {
                            if (cmd.data == null) {
                                LogCatUtil.info("AmnetGeneralEventManager", "command: ConnectionDowngrade. cmd.data is null ");
                            } else {
                                CmdMap cmdMap = (CmdMap) new c(new Class[0]).e(cmd.data, CmdMap.class);
                                List<CmdKeyValue> list2 = cmdMap.map;
                                if (list2 != null && !list2.isEmpty()) {
                                    HashMap hashMap = new HashMap(cmdMap.map.size());
                                    for (CmdKeyValue cmdKeyValue : cmdMap.map) {
                                        hashMap.put(cmdKeyValue.key, cmdKeyValue.value);
                                    }
                                    LogCatUtil.info("AmnetGeneralEventManager", "command: ConnectionDowngrade. config=[" + hashMap.toString() + "]");
                                    AmnetGeneralEventManagerImpl.this.notifyUpdateConfig(hashMap);
                                }
                                return;
                            }
                        } catch (Exception e) {
                            LogCatUtil.error("AmnetGeneralEventManager", "ConnectionDowngrade exception " + e.toString());
                        }
                    } else if (cmd.type == CmdType.ReConnect.getValue()) {
                        LogCatUtil.info("AmnetGeneralEventManager", "command: ReConnect.");
                        AmnetGeneralEventManagerImpl.this.notifyReconnect();
                    } else if (cmd.type == CmdType.IpListUpdate.getValue()) {
                        try {
                            if (cmd.data == null) {
                                LogCatUtil.info("AmnetGeneralEventManager", "command: IpListUpdate. cmd.data is null ");
                            } else {
                                IpListCmdData ipListCmdData = (IpListCmdData) new c(new Class[0]).e(cmd.data, IpListCmdData.class);
                                Integer num = ipListCmdData.code;
                                if (num == null || num.intValue() == 1000) {
                                    List<DNSResponse> list3 = ipListCmdData.dns;
                                    if (list3 != null && !list3.isEmpty()) {
                                        ArrayList arrayList = new ArrayList(ipListCmdData.dns.size());
                                        for (DNSResponse dNSResponse : ipListCmdData.dns) {
                                            List<CmdIpAddress> list4 = dNSResponse.ips;
                                            if (list4 != null && !list4.isEmpty()) {
                                                DnsInfo dnsInfo = new DnsInfo();
                                                dnsInfo.domain = dNSResponse.domain;
                                                dnsInfo.ttl = System.currentTimeMillis() + (dNSResponse.ttl.intValue() * 1000);
                                                dnsInfo.dnsAddressInfoList = new ArrayList(dNSResponse.ips.size());
                                                for (CmdIpAddress cmdIpAddress : dNSResponse.ips) {
                                                    DnsAddressInfo dnsAddressInfo = new DnsAddressInfo();
                                                    dnsAddressInfo.ip = cmdIpAddress.ip;
                                                    dnsAddressInfo.port = cmdIpAddress.port.intValue();
                                                    dnsInfo.dnsAddressInfoList.add(dnsAddressInfo);
                                                }
                                                arrayList.add(dnsInfo);
                                            }
                                        }
                                        if (arrayList.isEmpty()) {
                                            LogCatUtil.info("AmnetGeneralEventManager", "dnsInfos is empty!");
                                            return;
                                        }
                                        LogCatUtil.info("AmnetGeneralEventManager", "command: IpListUpdate. dnsInfos=[" + arrayList.toString() + "]");
                                        AmnetGeneralEventManagerImpl.this.notifyUpdateDnsInfo(arrayList);
                                    }
                                    LogCatUtil.info("AmnetGeneralEventManager", "result dns is empty!");
                                    return;
                                }
                                LogCatUtil.info("AmnetGeneralEventManager", "result code = [" + ipListCmdData.code + "]");
                                return;
                            }
                        } catch (Exception e2) {
                            LogCatUtil.error("AmnetGeneralEventManager", "IpListUpdate exception " + e2.toString());
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void establish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a79fd140", new Object[]{this});
            } else {
                AmnetGeneralEventManagerImpl.this.notifyInitOk();
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void eventTracking(final String str, final String str2, final Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6b13979", new Object[]{this, str, str2, map});
            } else {
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.AmnetLinkageListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
                    @Override // java.lang.Runnable
                    public void run() {
                        Map map2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!TextUtils.isEmpty(str) && (map2 = map) != null && !map2.isEmpty()) {
                            int connType = ConnectionUtil.getConnType(AmnetEnvHelper.getAppContext());
                            int networkType = ConnectionUtil.getNetworkType(AmnetEnvHelper.getAppContext());
                            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
                            monitorLoggerModel.setSubType("MMTP");
                            monitorLoggerModel.setParam1(str2);
                            monitorLoggerModel.setParam2(connType + "_" + networkType);
                            monitorLoggerModel.setParam3(str);
                            for (Map.Entry entry : map.entrySet()) {
                                if (!(entry.getKey() == null || ((String) entry.getKey()).trim().isEmpty() || entry.getValue() == null)) {
                                    monitorLoggerModel.getExtPramas().put(entry.getKey(), entry.getValue());
                                }
                            }
                            int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.LOG_PRIO_SWITCH);
                            if (TextUtils.equals(str, Baggage.Linkage.AMNET_DIAGNOSE_LOGTYPE)) {
                                MonitorLoggerUtils.uploadAutoDiagLog(monitorLoggerModel);
                            } else if (!TextUtils.equals(str, "st")) {
                                MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
                            } else if (intValue >= 3) {
                                MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
                            }
                            LogCatUtil.info("AMNET-LOG", monitorLoggerModel.toString());
                        }
                    }
                });
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void gather(Map<Byte, byte[]> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a52d8a43", new Object[]{this, map});
                return;
            }
            AmnetGeneralEventManagerImpl.this.notifyCollectInitInfoV2(map);
            logInitByteArrayInfo(map);
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void gift(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b062bb4b", new Object[]{this, str, str2});
                return;
            }
            LogCatUtil.debug("AmnetGeneralEventManager", "gift,key= " + str + ",val= " + str2);
            AmnetGeneralEventManagerImpl.this.notifyGift(str, str2);
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void initRsp(Initialization.RspInit rspInit) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66de5ab3", new Object[]{this, rspInit});
            } else {
                AmnetGeneralEventManagerImpl.this.notifyInitResponse(rspInit);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void keep(Linkage.Touching touching, Linkage.Keeping[] keepingArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4cb025c", new Object[]{this, touching, keepingArr, new Integer(i)});
            } else {
                ((AmnetMonitorLoggerListener) NetBeanFactory.getBean(AmnetMonitorLoggerListener.class)).notifyReportOnIHB(touching, keepingArr, i);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public String[] network() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("ce914844", new Object[]{this});
            }
            Context appContext = AmnetEnvHelper.getAppContext();
            if (appContext == null) {
                return null;
            }
            AppEvent convert2AppEvent = OutEventNotifyManagerImpl.convert2AppEvent(NetworkUtils.isNetworkAvailable(appContext), NetworkUtils.getNetworkType(appContext), ConnectionUtil.getConnType(appContext));
            return new String[]{convert2AppEvent.major, convert2AppEvent.minor};
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void panic(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f5029cf", new Object[]{this, new Integer(i), str});
            } else {
                AmnetGeneralEventManagerImpl.this.notifyError(i, str);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void reactivate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("672d01ad", new Object[]{this});
            } else {
                AmnetGeneralEventManagerImpl.this.notifySessionInvalid();
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void report(String str, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b818819", new Object[]{this, str, new Double(d)});
            } else if (!TextUtils.equals(str, Baggage.Linkage.RPT_HEARTBEAT_RTT)) {
                AmnetGeneralEventManagerImpl.this.notifyReport(str, d);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void reportPerfinfo(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea2bf1d3", new Object[]{this, map});
            } else if (map != null) {
                try {
                    if (map.size() > 0) {
                        MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            if (entry.getKey().equalsIgnoreCase("subtype")) {
                                monitorLoggerModel.setSubType(entry.getValue());
                            } else if (entry.getKey().equalsIgnoreCase("param1")) {
                                monitorLoggerModel.setParam1(entry.getValue());
                            } else if (entry.getKey().equalsIgnoreCase("param2")) {
                                monitorLoggerModel.setParam2(entry.getValue());
                            } else if (entry.getKey().equalsIgnoreCase("param3")) {
                                monitorLoggerModel.setParam3(entry.getValue());
                            } else {
                                monitorLoggerModel.getExtPramas().put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (AmnetTunnelManager.getInstance().isNowUseBifrost()) {
                            if (AmnetTunnelManager.getInstance().isNowUseBifrostH2()) {
                                monitorLoggerModel.getExtPramas().put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2);
                                monitorLoggerModel.getExtPramas().put("NETTUNNEL", MonitorLoggerUtils.NETTUNNEL_ULib_h2);
                            } else {
                                monitorLoggerModel.getExtPramas().put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST);
                            }
                        }
                        MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
                        LogCatUtil.debug("AmnetGeneralEventManager", monitorLoggerModel.toString());
                    }
                } catch (Throwable th) {
                    LogCatUtil.error("AmnetGeneralEventManager", "reportPerfinfo ex:" + th.toString());
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void resendSessionid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80e3e1bd", new Object[]{this});
            } else {
                AmnetGeneralEventManagerImpl.this.notifyResendSessionid();
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void restrict(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d5cfbea", new Object[]{this, new Integer(i), str});
            } else {
                AmnetGeneralEventManagerImpl.this.notifyRestrict(i, str);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void retrench(Linkage.Touching touching) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff6296c", new Object[]{this, touching});
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void separate(Linkage.Touching touching, Linkage.Separating separating) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83a04db9", new Object[]{this, touching, separating});
            } else {
                ((AmnetMonitorLoggerListener) NetBeanFactory.getBean(AmnetMonitorLoggerListener.class)).notifyReportOnDisconnect(touching, separating);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void sorry(long j, int i, String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4ae5cb8", new Object[]{this, new Long(j), new Integer(i), str, map});
            } else {
                AmnetGeneralEventManagerImpl.this.notifyFinalError(j, i, str, map);
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public boolean startAlarmTimer(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eba8e7e2", new Object[]{this, new Integer(i), new Long(j)})).booleanValue();
            }
            return true;
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void touch(Linkage.Touching touching) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50713a6c", new Object[]{this, touching});
                return;
            }
            ((AmnetMonitorLoggerListener) NetBeanFactory.getBean(AmnetMonitorLoggerListener.class)).notifyReportOnConnect(touching);
            AmnetGeneralEventManagerImpl.this.notifyReportIpPort(touching.ipLocal, touching.ipRemote, touching.portLocal, touching.portRemote);
        }

        public void logInitByteArrayInfo(Map<Byte, byte[]> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a09201d3", new Object[]{this, map});
            } else if (map != null) {
                LogCatUtil.info("AmnetGeneralEventManager", "all init byte array:");
                for (Map.Entry<Byte, byte[]> entry : map.entrySet()) {
                    byte[] value = entry.getValue();
                    StringBuilder sb = new StringBuilder("init byte channel=[");
                    sb.append(entry.getKey());
                    sb.append("]  len=[");
                    sb.append(value != null ? value.length : 0);
                    sb.append("] ");
                    LogCatUtil.info("AmnetGeneralEventManager", sb.toString());
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.amnet.Linkage
        public void command(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6d2ee99", new Object[]{this, bArr});
                return;
            }
            LogCatUtil.info("AmnetGeneralEventManager", "Bifrost command has got.");
            try {
                LinkedList linkedList = new LinkedList();
                List<CmdMessage> list = ((CmdListMessage) new c(new Class[0]).e(bArr, CmdListMessage.class)).cmdList;
                if (list != null) {
                    for (CmdMessage cmdMessage : list) {
                        if (cmdMessage.cmdType != null) {
                            Linkage.Cmd cmd = new Linkage.Cmd();
                            cmd.type = cmdMessage.cmdType.getValue();
                            ByteString byteString = cmdMessage.cmdData;
                            cmd.data = byteString == null ? null : byteString.toByteArray();
                            linkedList.addLast(cmd);
                        }
                    }
                }
                command(linkedList);
            } catch (Throwable th) {
                LogCatUtil.error("AmnetGeneralEventManager", "command exception: " + th.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public abstract class NotifyTemplete {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public NotifyTemplete() {
        }

        public abstract void doNotify(AmnetGeneralListener amnetGeneralListener);

        public void execute() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
                return;
            }
            AmnetGeneralListener[] access$100 = AmnetGeneralEventManagerImpl.access$100(AmnetGeneralEventManagerImpl.this);
            if (!(access$100 == null || access$100.length == 0)) {
                for (AmnetGeneralListener amnetGeneralListener : access$100) {
                    try {
                        doNotify(amnetGeneralListener);
                    } catch (Exception e) {
                        LogCatUtil.error("AmnetGeneralEventManager", " doNotify Exception ", e);
                    }
                }
            }
        }
    }

    public AmnetGeneralEventManagerImpl() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.d = reentrantReadWriteLock.readLock();
        this.e = reentrantReadWriteLock.writeLock();
    }

    public static /* synthetic */ AmnetGeneralListener[] access$100(AmnetGeneralEventManagerImpl amnetGeneralEventManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetGeneralListener[]) ipChange.ipc$dispatch("660b161f", new Object[]{amnetGeneralEventManagerImpl});
        }
        return amnetGeneralEventManagerImpl.a();
    }

    /* JADX WARN: Finally extract failed */
    public final AmnetGeneralListener[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetGeneralListener[]) ipChange.ipc$dispatch("4e32a04e", new Object[]{this});
        }
        AmnetGeneralListener[] amnetGeneralListenerArr = this.c;
        if (amnetGeneralListenerArr != null) {
            return amnetGeneralListenerArr;
        }
        this.d.lock();
        AmnetGeneralListener[] amnetGeneralListenerArr2 = this.c;
        if (amnetGeneralListenerArr2 != null) {
            return amnetGeneralListenerArr2;
        }
        try {
            if (((ArrayList) this.f3895a).isEmpty()) {
                this.d.unlock();
                return null;
            }
            List<AmnetGeneralListener> list = this.f3895a;
            AmnetGeneralListener[] amnetGeneralListenerArr3 = (AmnetGeneralListener[]) ((ArrayList) list).toArray(new AmnetGeneralListener[((ArrayList) list).size()]);
            this.c = amnetGeneralListenerArr3;
            this.d.unlock();
            return amnetGeneralListenerArr3;
        } catch (Throwable th) {
            this.d.unlock();
            throw th;
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void addGeneraEventListener(AmnetGeneralListener amnetGeneralListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("672f43e5", new Object[]{this, amnetGeneralListener});
            return;
        }
        this.e.lock();
        try {
            ((ArrayList) this.f3895a).add(amnetGeneralListener);
            this.c = null;
        } finally {
            this.e.unlock();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void asyncNotifyAfterAmnetActivation(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4940c3d", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            NetworkAsyncTaskExecutor.executeHighSerial(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AmnetGeneralEventManagerImpl.this.notifyAfterAmnetActivation(z);
                    }
                }
            });
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetGeneralEventManager", "[asyncNotifyAfterAmnetActivation] Exception: " + th.toString());
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void asyncNotifyBeforeFirstAmnetActivation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a73cf02", new Object[]{this});
            return;
        }
        try {
            NetworkAsyncTaskExecutor.executeHighSerial(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AmnetGeneralEventManagerImpl.this.notifyBeforeFirstAmnetActivation();
                    }
                }
            });
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetGeneralEventManager", "[asyncNotifyBeforeFirstAmnetActivation] Exception: " + th.toString());
        }
    }

    public AmnetLinkageListener getAmnetLinkageListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetLinkageListener) ipChange.ipc$dispatch("df026366", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new AmnetLinkageListener();
        }
        return this.b;
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public int getLatestConnState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("881d8b42", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public boolean isNotifyLoginOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3d9e5e3", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyAfterAmnetActivation(boolean z) {
        try {
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetGeneralEventManager", "[notifyBeforeFirstAmnetActivation] MQTTPushStartService Exception: " + th.toString());
        }
        if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            Class<?> cls = Class.forName("com.alipay.mobile.common.mqtt.push.MQTTPushStartService");
            Method declaredMethod = cls.getDeclaredMethod("init", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(cls.newInstance(), new Object[0]);
            LogCatUtil.info("AmnetGeneralEventManager", "[notifyAfterAmnetActivation]  Notify 'MQTTPushStartService' finish.");
            LogCatUtil.info("AmnetGeneralEventManager", "[notifyAfterAmnetActivation] Finished.");
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyBeforeFirstAmnetActivation() {
        try {
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetGeneralEventManager", "[notifyBeforeFirstAmnetActivation] LoggingNetworkReceiver Exception: " + th.toString());
        }
        if (MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
            Class<?> cls = Class.forName("com.alipay.mobile.tianyanadapter.logging.LoggingNetworkReceiver");
            Method declaredMethod = cls.getDeclaredMethod("setupNetworkChangeReceiver", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(cls, new Object[0]);
            LogCatUtil.info("AmnetGeneralEventManager", "[notifyBeforeFirstAmnetActivation] Finished.");
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyCollectInitInfo(final Map<Byte, Map<String, String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c03871f", new Object[]{this, map});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$3");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.collect(map);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyCollectInitInfoV2(final Map<Byte, byte[]> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed222c3", new Object[]{this, map});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$4");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.collectV2(map);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyConnStateChange(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be08b090", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$1");
            }

            @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
            public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                } else {
                    amnetGeneralListener.change(i);
                }
            }
        }.execute();
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyError(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584bc307", new Object[]{this, new Integer(i), str});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$2");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.panic(i, str);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyFinalError(final long j, final int i, final String str, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d2f2fa", new Object[]{this, new Long(j), new Integer(i), str, map});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass14 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$14");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.onFinalErrorEvent(j, i, str, map);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$6");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.notifyInitOk();
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyInitResponse(final Initialization.RspInit rspInit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b845a7ee", new Object[]{this, rspInit});
        } else if (rspInit != null) {
            this.g = rspInit.notifyLoginOut;
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass16 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$16");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.notifyInitResponse(rspInit);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyReconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11421395", new Object[]{this});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass11 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$11");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.notifyReconnect();
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyReport(final String str, final double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b55b150", new Object[]{this, str, new Double(d)});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$5");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.report(str, d);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyReportIpPort(final String str, final String str2, final String str3, final String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1137cb4", new Object[]{this, str, str2, str3, str4});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str5, Object... objArr) {
                    str5.hashCode();
                    int hashCode = str5.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str5 + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$7");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.touch(str, str2, str3, str4);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyResendSessionid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c8d3b4", new Object[]{this});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$10");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.notifyResendSessionid();
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyRestrict(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cbb361", new Object[]{this, new Integer(i), str});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass8 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$8");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.restrict(i, str);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifySessionInvalid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db91e1b1", new Object[]{this});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass9 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$9");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.listenSessionInvalid();
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyUpdateConfig(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f2dc4a", new Object[]{this, map});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass12 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$12");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.notifyUpdateConfigInfo(map);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyUpdateDnsInfo(final List<DnsInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf63929d", new Object[]{this, list});
        } else {
            new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass13 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$13");
                }

                @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
                public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                    } else {
                        amnetGeneralListener.notifyUpdateDnsInfo(list);
                    }
                }
            }.execute();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void removeGeneraEventListener(AmnetGeneralListener amnetGeneralListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ba05c8", new Object[]{this, amnetGeneralListener});
            return;
        }
        this.e.lock();
        try {
            ((ArrayList) this.f3895a).remove(amnetGeneralListener);
            this.c = null;
        } finally {
            this.e.unlock();
        }
    }

    public void resetConnState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc2c5bd", new Object[]{this});
        } else {
            this.f = 0;
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetGeneralEventManager
    public void notifyGift(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ee1d34", new Object[]{this, str, str2});
            return;
        }
        if (TextUtils.equals(Baggage.Linkage.GIFT_NOTIFYLOGINOUT, str)) {
            LogCatUtil.debug("AmnetGeneralEventManager", "notifyGift,key=[notifyLoginOut] value=[" + str2 + "]");
            if (TextUtils.equals(str2, "true")) {
                this.g = true;
            } else if (TextUtils.equals(str2, "false")) {
                this.g = false;
            }
        }
        new NotifyTemplete() { // from class: com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass15 r2, String str3, Object... objArr) {
                str3.hashCode();
                int hashCode = str3.hashCode();
                throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetGeneralEventManagerImpl$15");
            }

            @Override // com.alipay.mobile.common.amnet.biz.AmnetGeneralEventManagerImpl.NotifyTemplete
            public void doNotify(AmnetGeneralListener amnetGeneralListener) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("71a35d7a", new Object[]{this, amnetGeneralListener});
                } else {
                    amnetGeneralListener.notifyGift(str, str2);
                }
            }
        }.execute();
    }
}
