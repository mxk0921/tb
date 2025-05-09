package anet.channel.detect;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.Ipv6DetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.Utils;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.h1p;
import tb.hxj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Ipv6Detector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AMDC_HOST = "amdc.m.taobao.com";
    private static final int FAILED = 0;
    private static final String IPV6_DETECTOR_NAME = "networksdk_ipv6_history_records";
    private static final int SUCCESS = 1;
    private static final String TAG = "awcn.Ipv6Detector";
    private static final int UNKNOWN = -1;
    private static DetectHistoryRecord detectHistoryRecord;
    private static ConcurrentHashMap<String, Integer> ipStackNetworkMap = new ConcurrentHashMap<>();
    private static AtomicInteger seq = new AtomicInteger(1);
    private static AtomicBoolean isInit = new AtomicBoolean(false);
    public static Random random = new Random();
    private static IStrategyFilter ipv6Filter = new IStrategyFilter() { // from class: anet.channel.detect.Ipv6Detector.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.strategy.IStrategyFilter
        public boolean accept(IConnStrategy iConnStrategy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue();
            }
            if (Utils.isIPV6Address(iConnStrategy.getIp())) {
                return true;
            }
            return false;
        }
    };
    private static NetworkStatusHelper.INetworkStatusChangeListener networkStatusChangeListener = new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anet.channel.detect.Ipv6Detector.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            } else {
                Ipv6Detector.startIpv6Detect();
            }
        }
    };

    static {
        t2o.a(607125602);
    }

    public static /* synthetic */ IStrategyFilter access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStrategyFilter) ipChange.ipc$dispatch("63fd8c51", new Object[0]);
        }
        return ipv6Filter;
    }

    public static /* synthetic */ void access$100(boolean z, Ipv6DetectStat ipv6DetectStat, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a34f7cb", new Object[]{new Boolean(z), ipv6DetectStat, str, new Long(j)});
        } else {
            finish(z, ipv6DetectStat, str, j);
        }
    }

    public static int detectIpv6Status() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b29d7a36", new Object[0])).intValue();
        }
        if (!AwcnConfig.isIpv6DetectEnable()) {
            return 1;
        }
        String uniqueId = NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus());
        DetectHistoryRecord detectHistoryRecord2 = detectHistoryRecord;
        if (detectHistoryRecord2 != null) {
            return detectHistoryRecord2.detectStatus(uniqueId);
        }
        return -1;
    }

    public static void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[0]);
        } else if (isInit.compareAndSet(false, true)) {
            detectHistoryRecord = new DetectHistoryRecord(IPV6_DETECTOR_NAME);
            startIpv6Detect();
            NetworkStatusHelper.addStatusChangeListener(networkStatusChangeListener);
        }
    }

    public static void startIpv6Detect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8db33f3", new Object[0]);
        } else if (!AwcnConfig.isIpv6DetectEnable()) {
            ALog.e(TAG, "ipv6 detect is disable.", null, new Object[0]);
        } else if (!NetworkStatusHelper.isConnected()) {
            ALog.e(TAG, "network is not connected.", null, new Object[0]);
        } else {
            final String uniqueId = NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus());
            if ("error".equalsIgnoreCase(uniqueId)) {
                ALog.e(TAG, "startIpv6Detect uniqueId = error", null, new Object[0]);
                return;
            }
            if (detectHistoryRecord == null) {
                detectHistoryRecord = new DetectHistoryRecord(IPV6_DETECTOR_NAME);
            }
            if (!detectHistoryRecord.isNeedDetect(uniqueId)) {
                ALog.e(TAG, "detectHistoryRecord has ipv6-detect-record.", null, hxj.UNIQID, uniqueId, "status", Integer.valueOf(detectIpv6Status()));
            } else {
                ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.detect.Ipv6Detector.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        String str;
                        int i;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(Ipv6Detector.AMDC_HOST, Ipv6Detector.access$000());
                        StringBuilder sb = new StringBuilder(h1p.HTTP_PREFIX);
                        if (connStrategyListByHost == null || connStrategyListByHost.size() <= 0) {
                            String[] amdcServerFixIpv6 = DispatchConstants.getAmdcServerFixIpv6();
                            str = amdcServerFixIpv6.length > 0 ? amdcServerFixIpv6[Ipv6Detector.random.nextInt(amdcServerFixIpv6.length)] : null;
                            i = 443;
                        } else {
                            str = connStrategyListByHost.get(0).getIp();
                            i = connStrategyListByHost.get(0).getPort();
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb.append("[");
                            sb.append(str);
                            sb.append("]");
                            Ipv6DetectStat ipv6DetectStat = new Ipv6DetectStat(Ipv6Detector.AMDC_HOST);
                            ipv6DetectStat.ip = str;
                            ipv6DetectStat.detectUrl = sb.toString();
                            long currentTimeMillis = System.currentTimeMillis();
                            ALog.e(Ipv6Detector.TAG, "start ipv6 detect.", null, "url", sb);
                            try {
                                new Socket().connect(new InetSocketAddress(str, i), 2000);
                                Ipv6Detector.access$100(true, ipv6DetectStat, uniqueId, currentTimeMillis);
                            } catch (Throwable th) {
                                ALog.e(Ipv6Detector.TAG, "start ipv6 detect isConnectionAvailable error=" + th.toString(), null, hxj.UNIQID, uniqueId);
                                Ipv6Detector.access$100(false, ipv6DetectStat, uniqueId, currentTimeMillis);
                            }
                        }
                    }
                });
            }
        }
    }

    private static void finish(boolean z, Ipv6DetectStat ipv6DetectStat, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0c9529", new Object[]{new Boolean(z), ipv6DetectStat, str, new Long(j)});
            return;
        }
        if (z && Inet64Util.isIPv4OnlyNetwork()) {
            Inet64Util.updateIpStackNetwork(3);
            ALog.e(TAG, "[IpStackOpt] ipv4->6：ipv6 detect is success=" + z, null, hxj.UNIQID, str);
        }
        ipv6DetectStat.cip = StrategyCenter.getInstance().getClientIp();
        ipv6DetectStat.ret = z ? 1 : 0;
        ipv6DetectStat.detectTime = System.currentTimeMillis() - j;
        ALog.e(TAG, "start ipv6 detect finish.", null, hxj.UNIQID, str, "isSucc", Boolean.valueOf(z));
        detectHistoryRecord.update(str, z);
        AppMonitor.getInstance().commitStat(ipv6DetectStat);
    }
}
