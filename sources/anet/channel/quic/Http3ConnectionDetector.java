package anet.channel.quic;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.detect.DetectHistoryRecord;
import anet.channel.detect.Ipv6Detector;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventCb;
import anet.channel.session.TnetSpdySession;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.ProxyStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.utils.Utils;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.spdy.IPluginFetchCallback;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tb.h1p;
import tb.hxj;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Http3ConnectionDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_DETECT_HOST_COUNT = 2;
    private static final long DEFAULT_DETECT_VALID_TIME = 21600000;
    public static final int FAILED = 0;
    private static final String MTOP_HOST = "https://guide-acs.m.taobao.com";
    private static final String SP_HISTORY_RECORDS = "networksdk_http3_history_records";
    private static final String SP_HTTP3_DETECTOR_HOSTS = "http3_detector_hosts";
    public static final int SUCCESS = 1;
    private static final String TAG = "awcn.Http3ConnDetector";
    public static final int UNKNOWN = -1;
    private static DetectHistoryRecord detectHistoryRecord;
    private static SharedPreferences sharedPreferences;
    private static CopyOnWriteArraySet<String> hostList = new CopyOnWriteArraySet<>();
    private static AtomicBoolean isInit = new AtomicBoolean(false);
    private static AtomicBoolean isCertInit = new AtomicBoolean(false);
    private static AtomicBoolean haveTnetException = new AtomicBoolean(false);
    private static long detectValidTime = 21600000;
    private static boolean isWaitForegroundDetect = false;
    private static IStrategyFilter http3Filter = new IStrategyFilter() { // from class: anet.channel.quic.Http3ConnectionDetector.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.strategy.IStrategyFilter
        public boolean accept(IConnStrategy iConnStrategy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue();
            }
            String str = iConnStrategy.getProtocol().protocol;
            boolean z = Inet64Util.isIPv6OnlyNetwork() && Ipv6Detector.detectIpv6Status() == 1;
            if (!ConnType.HTTP3.equals(str) && !ConnType.HTTP3_PLAIN.equals(str) && !ConnType.HTTP3_1RTT.equals(str)) {
                return false;
            }
            if (AwcnConfig.isH3DetectStrategyFilterEnable()) {
                if (Ipv6Detector.detectIpv6Status() == 0 && Utils.isIPV6Address(iConnStrategy.getIp())) {
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] [DetectOpt] not use v6! ", "", iConnStrategy, "connStrategy");
                    return false;
                } else if (z && Utils.isIPV4Address(iConnStrategy.getIp())) {
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] [DetectOpt] not use v4! ", "", iConnStrategy, "connStrategy");
                    return false;
                }
            }
            return true;
        }
    };
    private static AtomicInteger seq = new AtomicInteger(1);
    private static IStrategyListener strategyListener = new IStrategyListener() { // from class: anet.channel.quic.Http3ConnectionDetector.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void access$000(AnonymousClass2 r4, StrategyResultParser.Dns[] dnsArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c809b74", new Object[]{r4, dnsArr});
            } else {
                r4.updateDnsByHosts(dnsArr);
            }
        }

        @Override // anet.channel.strategy.IStrategyListener
        public void onStrategyUpdated(final StrategyResultParser.HttpDnsResponse httpDnsResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c33e6115", new Object[]{this, httpDnsResponse});
            } else if (httpDnsResponse != null) {
                ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.quic.Http3ConnectionDetector.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AnonymousClass2.access$000(AnonymousClass2.this, httpDnsResponse.dns);
                        }
                    }
                });
            }
        }

        private void updateDnsByHosts(StrategyResultParser.Dns[] dnsArr) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30152778", new Object[]{this, dnsArr});
            } else if (dnsArr != null && dnsArr.length != 0) {
                ArrayList arrayList = null;
                for (StrategyResultParser.Dns dns : dnsArr) {
                    String str = dns.host;
                    if (!AwcnConfig.isHostInHttp3BlackList(str) && dns.servers != null) {
                        int i = 0;
                        while (true) {
                            StrategyResultParser.Server[] serverArr = dns.servers;
                            if (i < serverArr.length) {
                                StrategyResultParser.Channel[] channelArr = serverArr[i].channels;
                                if (!(channelArr == null || channelArr.length == 0)) {
                                    for (StrategyResultParser.Channel channel : channelArr) {
                                        StrategyResultParser.ChannelAttribute[] channelAttributeArr = channel.attributes;
                                        if (!(channelAttributeArr == null || channelAttributeArr.length == 0)) {
                                            for (StrategyResultParser.ChannelAttribute channelAttribute : channelAttributeArr) {
                                                String str2 = channelAttribute.protocol;
                                                if ((ConnType.HTTP3.equals(str2) || ConnType.HTTP3_PLAIN.equals(str2)) && !Http3ConnectionDetector.access$100().contains(str)) {
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                    }
                                                    if (!arrayList.contains(str)) {
                                                        arrayList.add(str);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i++;
                            }
                        }
                    }
                }
                if (!(arrayList == null || arrayList.isEmpty())) {
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] updateDnsByHosts ", null, "tmp1HostList", arrayList, "hostList", Http3ConnectionDetector.access$100());
                    ArrayList arrayList2 = new ArrayList();
                    ListIterator listIterator = arrayList.listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            z = false;
                            break;
                        }
                        String str3 = (String) listIterator.next();
                        if (AwcnConfig.isHostInDetectHostWhiteList(str3)) {
                            arrayList2.add(str3);
                            listIterator.remove();
                            if (arrayList2.size() >= 2) {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (!z) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            }
                            arrayList2.add(arrayList.get(i2));
                            if (arrayList2.size() >= 2) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (!z) {
                        Iterator it = Http3ConnectionDetector.access$100().iterator();
                        while (it.hasNext()) {
                            arrayList2.add((String) it.next());
                            if (arrayList2.size() >= 2) {
                                break;
                            }
                        }
                    }
                    Http3ConnectionDetector.access$100().clear();
                    Http3ConnectionDetector.access$100().addAll(arrayList2);
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] dueToH3Detect ", null, "hostList", Http3ConnectionDetector.access$100());
                    SharedPreferences.Editor edit = Http3ConnectionDetector.access$200().edit();
                    edit.putStringSet(Http3ConnectionDetector.SP_HTTP3_DETECTOR_HOSTS, Http3ConnectionDetector.access$100());
                    edit.apply();
                    Http3ConnectionDetector.startDetect(NetworkStatusHelper.getStatus());
                }
            }
        }
    };
    private static NetworkStatusHelper.INetworkStatusChangeListener networkStatusChangeListener = new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anet.channel.quic.Http3ConnectionDetector.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            }
        }
    };
    private static AppLifecycle.AppLifecycleListener appLifecycleListener = new AppLifecycle.AppLifecycleListener() { // from class: anet.channel.quic.Http3ConnectionDetector.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("550392b5", new Object[]{this});
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5402817", new Object[]{this});
            } else if (Http3ConnectionDetector.access$300()) {
                Http3ConnectionDetector.startDetect(NetworkStatusHelper.getStatus());
            }
        }
    };

    static {
        t2o.a(607125682);
    }

    public static /* synthetic */ CopyOnWriteArraySet access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("8bd08291", new Object[0]);
        }
        return hostList;
    }

    public static /* synthetic */ SharedPreferences access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3847708d", new Object[0]);
        }
        return sharedPreferences;
    }

    public static /* synthetic */ boolean access$300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue();
        }
        return isWaitForegroundDetect;
    }

    public static /* synthetic */ boolean access$302(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f8d21c", new Object[]{new Boolean(z)})).booleanValue();
        }
        isWaitForegroundDetect = z;
        return z;
    }

    public static /* synthetic */ void access$400(NetworkStatusHelper.NetworkStatus networkStatus, String str, String str2, List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ae86e4", new Object[]{networkStatus, str, str2, list, new Integer(i)});
        } else {
            startOneDetect(networkStatus, str, str2, list, i);
        }
    }

    public static /* synthetic */ DetectHistoryRecord access$500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetectHistoryRecord) ipChange.ipc$dispatch("d401a818", new Object[0]);
        }
        return detectHistoryRecord;
    }

    public static int detectHttp3Status() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3896d54", new Object[0])).intValue();
        }
        DetectHistoryRecord detectHistoryRecord2 = detectHistoryRecord;
        if (detectHistoryRecord2 != null) {
            return detectHistoryRecord2.detectStatus(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()));
        }
        return -1;
    }

    public static boolean isHttp3Enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa6ed0f", new Object[0])).booleanValue();
        }
        if (detectHttp3Status() == 1) {
            return true;
        }
        return false;
    }

    public static boolean isQuicReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddbcf06", new Object[0])).booleanValue();
        }
        try {
            return SpdyAgent.isQuicReady();
        } catch (Exception e) {
            ALog.e(TAG, "[xquic remote] isQuicReady fail, error=" + e.toString(), null, new Object[0]);
            return false;
        }
    }

    private static IConnStrategy makeConnStrategy(final IConnStrategy iConnStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConnStrategy) ipChange.ipc$dispatch("d3e1ecc8", new Object[]{iConnStrategy});
        }
        return new IConnStrategy() { // from class: anet.channel.quic.Http3ConnectionDetector.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.strategy.IConnStrategy
            public String getAccessPoint() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("7a134b63", new Object[]{this});
                }
                return IConnStrategy.this.getAccessPoint();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public Map<String, Object> getCommonInfo() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("6eaa1deb", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getConnectionTimeout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("3af0dde7", new Object[]{this})).intValue();
                }
                return IConnStrategy.this.getConnectionTimeout();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getHeartbeat() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("5d15d3c0", new Object[]{this})).intValue();
                }
                return IConnStrategy.this.getHeartbeat();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public String getIp() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("d02517fc", new Object[]{this});
                }
                return IConnStrategy.this.getIp();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getIpSource() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("e15dde12", new Object[]{this})).intValue();
                }
                return IConnStrategy.this.getIpSource();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getIpType() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("d9c8f8f1", new Object[]{this})).intValue();
                }
                return IConnStrategy.this.getIpType();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getPort() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
                }
                return IConnStrategy.this.getPort();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public ConnProtocol getProtocol() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ConnProtocol) ipChange2.ipc$dispatch("f3fe3d0f", new Object[]{this});
                }
                return ConnProtocol.valueOf(ConnType.HTTP3_1RTT, null, null);
            }

            @Override // anet.channel.strategy.IConnStrategy
            public List<ProxyStrategy> getProxyStrategies() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (List) ipChange2.ipc$dispatch("69e2ba17", new Object[]{this});
                }
                return null;
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getReadTimeout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("4db89faf", new Object[]{this})).intValue();
                }
                return IConnStrategy.this.getReadTimeout();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getRetryTimes() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("58b4bfee", new Object[]{this})).intValue();
                }
                return IConnStrategy.this.getRetryTimes();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public int getStatus() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
                }
                return IConnStrategy.this.getStatus();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public String getUnit() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("9e7fcd3f", new Object[]{this});
                }
                return IConnStrategy.this.getUnit();
            }

            @Override // anet.channel.strategy.IConnStrategy
            public boolean isSupportMultiPath() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("43485f44", new Object[]{this})).booleanValue();
                }
                return false;
            }
        };
    }

    public static void registerQuicListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81fea55c", new Object[0]);
        } else if (AwcnConfig.isXquicRemoteEnable()) {
            try {
                SpdyAgent.registerQuicListener(new IPluginFetchCallback() { // from class: anet.channel.quic.Http3ConnectionDetector.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // org.android.spdy.IPluginFetchCallback
                    public void onFetchFinished(boolean z, Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1d759e5", new Object[]{this, new Boolean(z), map});
                            return;
                        }
                        ALog.e(Http3ConnectionDetector.TAG, "[xquic remote] onFetchFinished，isQuicReady=" + z, null, new Object[0]);
                        if (z) {
                            Http3ConnectionDetector.startDetect(NetworkStatusHelper.getStatus());
                            SpdyAgent.unregisterQuicListener(this);
                        }
                    }
                });
            } catch (Exception e) {
                ALog.e(TAG, "[xquic remote] registerQuicListener fail, error=" + e.toString(), null, new Object[0]);
            }
        }
    }

    public static void setDetectValidTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5b8d9", new Object[]{new Long(j)});
        } else if (j >= 0) {
            detectValidTime = j;
        }
    }

    private static boolean startDetectHosts(final NetworkStatusHelper.NetworkStatus networkStatus, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a73ec56", new Object[]{networkStatus, str})).booleanValue();
        }
        ThreadPoolExecutorFactory.submitDetectTask(new Runnable() { // from class: anet.channel.quic.Http3ConnectionDetector.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (Http3ConnectionDetector.access$100() == null || Http3ConnectionDetector.access$100().isEmpty()) {
                    ALog.e(Http3ConnectionDetector.TAG, "[h3 detect opt] startDetectHosts", null, "hostList is null");
                } else {
                    ArrayList arrayList = new ArrayList();
                    int size = Http3ConnectionDetector.access$100().size();
                    Iterator it = Http3ConnectionDetector.access$100().iterator();
                    while (it.hasNext()) {
                        Http3ConnectionDetector.access$400(NetworkStatusHelper.NetworkStatus.this, str, (String) it.next(), arrayList, size);
                    }
                }
            }
        });
        return true;
    }

    public static void updateHttp3Status(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0df7b9", new Object[]{new Boolean(z)});
            return;
        }
        DetectHistoryRecord detectHistoryRecord2 = detectHistoryRecord;
        if (detectHistoryRecord2 != null) {
            detectHistoryRecord2.update(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()), z);
        }
    }

    public static void registerListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[0]);
            return;
        }
        try {
            if (isInit.compareAndSet(false, true)) {
                ALog.e(TAG, "registerListener", null, "http3Enable", Boolean.valueOf(AwcnConfig.isHttp3Enable()));
                registerQuicListener();
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
                sharedPreferences = defaultSharedPreferences;
                Set<String> stringSet = defaultSharedPreferences.getStringSet(SP_HTTP3_DETECTOR_HOSTS, null);
                hostList = new CopyOnWriteArraySet<>();
                if (stringSet != null && stringSet.size() > 0) {
                    hostList.addAll(stringSet);
                }
                ALog.e(TAG, "[h3 detect opt] registerListener hostList :" + hostList.toString(), null, new Object[0]);
                startDetect(NetworkStatusHelper.getStatus());
                NetworkStatusHelper.addStatusChangeListener(networkStatusChangeListener);
                AppLifecycle.registerLifecycleListener(appLifecycleListener);
                StrategyCenter.getInstance().registerListener(strategyListener);
            }
        } catch (Exception e) {
            ALog.e(TAG, "[registerListener]error", null, e, new Object[0]);
        }
    }

    public static boolean startDetect(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f6ebcad", new Object[]{networkStatus})).booleanValue();
        }
        ALog.e(TAG, "[h3 detect opt][DetectOpt] startDetect!! ", null, new Object[0]);
        if (AwcnConfig.isXquicRemoteEnable()) {
            ALog.e(TAG, "[h3 detect opt][xquic remote] startDetect，isQuicReady=" + isQuicReady(), null, new Object[0]);
            if (!isQuicReady()) {
                ALog.e(TAG, "[h3 detect opt][xquic remote] tnet xquic not ready.", null, new Object[0]);
                return false;
            }
        }
        if (haveTnetException.get()) {
            ALog.e(TAG, "[h3 detect opt]tnet exception.", null, new Object[0]);
            return false;
        } else if (!NetworkStatusHelper.isConnected()) {
            return false;
        } else {
            if (isCertInit.compareAndSet(false, true)) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).InitializeSecurityStuff();
                    ALog.e(TAG, "[h3 detect opt]tnet init http3.", null, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable th) {
                    ALog.e(TAG, "[h3 detect opt]tnet init http3 error.", null, th, new Object[0]);
                    haveTnetException.set(true);
                    return false;
                }
            }
            if (detectHistoryRecord == null) {
                detectHistoryRecord = new DetectHistoryRecord(SP_HISTORY_RECORDS);
            }
            String uniqueId = NetworkStatusHelper.getUniqueId(networkStatus);
            if ("error".equalsIgnoreCase(uniqueId)) {
                ALog.e(TAG, "[h3 detect opt]startIpv6Detect uniqueId = error", null, new Object[0]);
                return false;
            } else if (!detectHistoryRecord.isNeedDetect(uniqueId)) {
                ALog.e(TAG, "[h3 detect opt][DetectOpt] not need detect!! ", null, hxj.UNIQID, uniqueId);
                return false;
            } else {
                ALog.e(TAG, "[h3 detect opt][DetectOpt] need detect!! ", null, hxj.UNIQID, uniqueId);
                return startDetectHosts(networkStatus, uniqueId);
            }
        }
    }

    private static void startOneDetect(final NetworkStatusHelper.NetworkStatus networkStatus, String str, final String str2, final List<DetectHistoryRecord.DetectRecord> list, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e51957", new Object[]{networkStatus, str, str2, list, new Integer(i)});
            return;
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str2, http3Filter);
        if (connStrategyListByHost.isEmpty()) {
            ALog.e(TAG, "[h3 detect opt] startOneDetect", null, "http3 strategy is null.");
            return;
        }
        final IConnStrategy iConnStrategy = connStrategyListByHost.get(0);
        final String str3 = "Http3Detect" + seq.getAndIncrement();
        ConnInfo connInfo = new ConnInfo(h1p.HTTPS_PREFIX + str2, str3, makeConnStrategy(iConnStrategy));
        ALog.e(TAG, "[h3 detect opt] [DetectOpt] enable http3", str3, hxj.UNIQID, str, "strategy", iConnStrategy);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(GlobalAppRuntimeInfo.getContext(), connInfo);
        tnetSpdySession.registerEventcb(257, new EventCb() { // from class: anet.channel.quic.Http3ConnectionDetector.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [int, boolean] */
            /* JADX WARN: Type inference failed for: r14v10 */
            /* JADX WARN: Type inference failed for: r14v11 */
            /* JADX WARN: Unknown variable types count: 1 */
            @Override // anet.channel.entity.EventCb
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onEvent(anet.channel.Session r13, int r14, anet.channel.entity.Event r15) {
                /*
                    Method dump skipped, instructions count: 303
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: anet.channel.quic.Http3ConnectionDetector.AnonymousClass7.onEvent(anet.channel.Session, int, anet.channel.entity.Event):void");
            }
        });
        tnetSpdySession.mSessionStat.isCommitted = true;
        tnetSpdySession.connect();
    }
}
