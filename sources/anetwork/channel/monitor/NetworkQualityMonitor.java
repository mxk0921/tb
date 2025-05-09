package anetwork.channel.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.monitor.SRttMonitor;
import anet.channel.statist.RumNetworkQualityStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkQualityMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_DOMAINS_COUNT = 64;
    private static final int MAX_LISTENER_COUNT = 16;
    public static final String TAG = "anetwork.NetworkQualityMonitor";
    private static NetworkQualityMonitor instance = new NetworkQualityMonitor();
    private ConcurrentHashMap<String, ArrayList<DomainListenerWrapper>> domainListenerMap = new ConcurrentHashMap<>();
    private ArrayList<GlobalListenerWrapper> globalListeners = new ArrayList<>();
    private HandlerThread handlerThread;
    private Handler notifyHandler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class DomainListenerWrapper implements IListenerWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String domain;
        public IDomainNetworkQualityListener listener;
        private Handler notifyHandler;
        private long preNotifyTimestamp = 0;
        private int preQualityLevel = -1;

        static {
            t2o.a(607126090);
            t2o.a(607126096);
        }

        public DomainListenerWrapper(Handler handler, String str, IDomainNetworkQualityListener iDomainNetworkQualityListener) {
            this.notifyHandler = handler;
            this.listener = iDomainNetworkQualityListener;
            this.domain = str;
        }

        public static /* synthetic */ String access$000(DomainListenerWrapper domainListenerWrapper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("faf76af7", new Object[]{domainListenerWrapper});
            }
            return domainListenerWrapper.domain;
        }

        @Override // anetwork.channel.monitor.NetworkQualityMonitor.IListenerWrapper
        public void updateQualityLevel(final int i, final double d, final long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("673cdb4", new Object[]{this, new Integer(i), new Double(d), new Long(j)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (NetworkQualityMonitor.isNotifyAccepted(this.preQualityLevel, i, this.preNotifyTimestamp, currentTimeMillis)) {
                if (this.listener != null) {
                    this.notifyHandler.post(new Runnable() { // from class: anetwork.channel.monitor.NetworkQualityMonitor.DomainListenerWrapper.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            DomainListenerWrapper domainListenerWrapper = DomainListenerWrapper.this;
                            domainListenerWrapper.listener.onNetworkQualityChanged(DomainListenerWrapper.access$000(domainListenerWrapper), i, d, j);
                        }
                    });
                }
                this.preNotifyTimestamp = currentTimeMillis;
                this.preQualityLevel = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class GlobalListenerWrapper implements IListenerWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public IGlobalNetworkQualityListener listener;
        private Handler notifyHandler;
        private long preNotifyTimestamp = 0;
        private int preQualityLevel = -1;

        static {
            t2o.a(607126092);
            t2o.a(607126096);
        }

        public GlobalListenerWrapper(Handler handler, IGlobalNetworkQualityListener iGlobalNetworkQualityListener) {
            this.notifyHandler = handler;
            this.listener = iGlobalNetworkQualityListener;
        }

        @Override // anetwork.channel.monitor.NetworkQualityMonitor.IListenerWrapper
        public void updateQualityLevel(final int i, final double d, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("673cdb4", new Object[]{this, new Integer(i), new Double(d), new Long(j)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (NetworkQualityMonitor.isNotifyAccepted(this.preQualityLevel, i, this.preNotifyTimestamp, currentTimeMillis)) {
                if (this.listener != null) {
                    this.notifyHandler.post(new Runnable() { // from class: anetwork.channel.monitor.NetworkQualityMonitor.GlobalListenerWrapper.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                GlobalListenerWrapper.this.listener.onNetworkQualityChanged(i, d);
                            }
                        }
                    });
                }
                this.preNotifyTimestamp = currentTimeMillis;
                this.preQualityLevel = i;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface IDomainNetworkQualityListener {
        void onNetworkQualityChanged(String str, int i, double d, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface IGlobalNetworkQualityListener {
        void onNetworkQualityChanged(int i, double d);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface IListenerWrapper {
        void updateQualityLevel(int i, double d, long j);
    }

    static {
        t2o.a(607126089);
    }

    private NetworkQualityMonitor() {
        HandlerThread handlerThread = new HandlerThread("NetworkQualityMonitorThread");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.notifyHandler = new Handler(this.handlerThread.getLooper());
    }

    public static int getDomainNetworkQuality(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5546e58f", new Object[]{str})).intValue();
        }
        return NetworkQoSCenter.getInstance().getQualityLevel(str);
    }

    public static int getGlobalNetworkQuality() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1a24164", new Object[0])).intValue();
        }
        return NetworkQoSCenter.getInstance().getQualityLevel(null);
    }

    public static int getGlobalNetworkQualityByScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f842d6f", new Object[]{str})).intValue();
        }
        return NetworkQoSCenter.getInstance().getQualityLevelByScene(str);
    }

    public static NetworkQualityMonitor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkQualityMonitor) ipChange.ipc$dispatch("c049dacd", new Object[0]);
        }
        return instance;
    }

    public static int getRUMNetworkQualityLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e51c019", new Object[0])).intValue();
        }
        try {
            double[] rumParams = AwcnConfig.getRumParams(NetworkStatusHelper.getStatus().isWifi());
            if (rumParams != null && rumParams.length == 18) {
                double bandwidth = NetworkQoSCenter.getInstance().getBandwidth(0, 0, null);
                if (bandwidth >= rumParams[0] && NetworkMetricsHelper.getFrttAvgIDC() <= rumParams[1] && NetworkMetricsHelper.getFrttMaxIDC() <= rumParams[2] && NetworkMetricsHelper.getSrttMaxIDC() <= rumParams[3] && NetworkMetricsHelper.getLossratioMaxIDC() <= rumParams[4]) {
                    if (bandwidth >= rumParams[5] && NetworkMetricsHelper.getFrttAvgCDN() <= rumParams[6] && NetworkMetricsHelper.getFrttMaxCDN() <= rumParams[7] && NetworkMetricsHelper.getSrttMaxCDN() <= rumParams[8] && NetworkMetricsHelper.getLossratioMaxCDN() <= rumParams[9]) {
                        if (bandwidth <= rumParams[10] && NetworkMetricsHelper.getFrttAvgIDC() >= rumParams[11] && NetworkMetricsHelper.getFrttMaxIDC() >= rumParams[12] && NetworkMetricsHelper.getSrttMaxIDC() >= rumParams[13]) {
                            commitPoorRumStatistic(false, 3, bandwidth, NetworkMetricsHelper.getFrttAvgIDC(), NetworkMetricsHelper.getFrttMaxIDC(), NetworkMetricsHelper.getSrttMaxIDC(), -1.0d);
                            return 1;
                        } else if (bandwidth > rumParams[14] || NetworkMetricsHelper.getFrttAvgCDN() < rumParams[15] || NetworkMetricsHelper.getFrttMaxCDN() < rumParams[16] || NetworkMetricsHelper.getSrttMaxCDN() < rumParams[17]) {
                            commitNormalRumStatistic(0, bandwidth, NetworkMetricsHelper.getFrttAvgIDC(), NetworkMetricsHelper.getFrttMaxIDC(), NetworkMetricsHelper.getSrttMaxIDC(), NetworkMetricsHelper.getLossratioMaxIDC(), NetworkMetricsHelper.getFrttAvgCDN(), NetworkMetricsHelper.getFrttMaxCDN(), NetworkMetricsHelper.getSrttMaxCDN(), NetworkMetricsHelper.getLossratioMaxCDN());
                            return 2;
                        } else {
                            commitPoorRumStatistic(true, 4, bandwidth, NetworkMetricsHelper.getFrttAvgCDN(), NetworkMetricsHelper.getFrttMaxCDN(), NetworkMetricsHelper.getSrttMaxCDN(), -1.0d);
                            return 1;
                        }
                    }
                    commitPoorRumStatistic(true, 2, bandwidth, NetworkMetricsHelper.getFrttAvgCDN(), NetworkMetricsHelper.getFrttMaxCDN(), NetworkMetricsHelper.getSrttMaxCDN(), NetworkMetricsHelper.getLossratioMaxCDN());
                    return 1;
                }
                commitPoorRumStatistic(false, 1, bandwidth, NetworkMetricsHelper.getFrttAvgIDC(), NetworkMetricsHelper.getFrttMaxIDC(), NetworkMetricsHelper.getSrttMaxIDC(), NetworkMetricsHelper.getLossratioMaxIDC());
                return 1;
            }
            return 0;
        } catch (Throwable th) {
            ALog.e(TAG, "[RUM] getRUMNetworkQualityLevel fail!!", null, "error", th);
            return 0;
        }
    }

    public static boolean isNotifyAccepted(int i, int i2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef2ed9c5", new Object[]{new Integer(i), new Integer(i2), new Long(j), new Long(j2)})).booleanValue();
        }
        if (i == i2) {
            return false;
        }
        long j3 = j2 - j;
        if (j3 < 0 || j3 >= AwcnConfig.getQualityNotifyMinInterval()) {
            return true;
        }
        return false;
    }

    public double getDomainCurrentBandwidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfb68411", new Object[]{this, str})).doubleValue();
        }
        return NetworkQoSCenter.getInstance().getBandwidth(1, 0, str);
    }

    public double getDomainPredictBandwidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b1aa0b1", new Object[]{this, str})).doubleValue();
        }
        return NetworkQoSCenter.getInstance().getBandwidth(1, 1, str);
    }

    public double getGlobalCurrentBandwidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8ec77e6", new Object[]{this})).doubleValue();
        }
        return NetworkQoSCenter.getInstance().getBandwidth(0, 0, null);
    }

    public double getGlobalPredictBandWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfbe9c66", new Object[]{this})).doubleValue();
        }
        return NetworkQoSCenter.getInstance().getBandwidth(0, 1, null);
    }

    public synchronized boolean registerDomainNetworkQualityListener(String str, IDomainNetworkQualityListener iDomainNetworkQualityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58b4581c", new Object[]{this, str, iDomainNetworkQualityListener})).booleanValue();
        } else if (str == null || iDomainNetworkQualityListener == null) {
            return false;
        } else {
            ArrayList<DomainListenerWrapper> arrayList = this.domainListenerMap.get(str);
            if (arrayList == null) {
                if (this.domainListenerMap.size() >= 64) {
                    return false;
                }
                arrayList = new ArrayList<>();
                this.domainListenerMap.put(str, arrayList);
            }
            if (arrayList.size() >= 16) {
                return false;
            }
            Iterator<DomainListenerWrapper> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().listener == iDomainNetworkQualityListener) {
                        break;
                    }
                } else {
                    DomainListenerWrapper domainListenerWrapper = new DomainListenerWrapper(this.notifyHandler, str, iDomainNetworkQualityListener);
                    arrayList.add(domainListenerWrapper);
                    domainListenerWrapper.updateQualityLevel(getDomainNetworkQuality(str), getDomainPredictBandwidth(str), SRttMonitor.getDomainSRtt(str));
                    break;
                }
            }
            return true;
        }
    }

    public synchronized boolean registerGlobalNetworkQualityListener(IGlobalNetworkQualityListener iGlobalNetworkQualityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("117a9472", new Object[]{this, iGlobalNetworkQualityListener})).booleanValue();
        } else if (iGlobalNetworkQualityListener == null) {
            return false;
        } else {
            if (this.globalListeners.size() >= 16) {
                return false;
            }
            Iterator<GlobalListenerWrapper> it = this.globalListeners.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().listener == iGlobalNetworkQualityListener) {
                        break;
                    }
                } else {
                    GlobalListenerWrapper globalListenerWrapper = new GlobalListenerWrapper(this.notifyHandler, iGlobalNetworkQualityListener);
                    this.globalListeners.add(globalListenerWrapper);
                    globalListenerWrapper.updateQualityLevel(getGlobalNetworkQuality(), getGlobalPredictBandWidth(), 0L);
                    break;
                }
            }
            return true;
        }
    }

    public synchronized void unregisterDomainNetworkQualityListener(String str, IDomainNetworkQualityListener iDomainNetworkQualityListener) {
        ArrayList<DomainListenerWrapper> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57a2db1", new Object[]{this, str, iDomainNetworkQualityListener});
            return;
        }
        if (str != null && iDomainNetworkQualityListener != null && (arrayList = this.domainListenerMap.get(str)) != null) {
            Iterator<DomainListenerWrapper> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DomainListenerWrapper next = it.next();
                if (next.listener == iDomainNetworkQualityListener) {
                    arrayList.remove(next);
                    break;
                }
            }
        }
    }

    public synchronized void unregisterGlobalNetworkQualityListener(IGlobalNetworkQualityListener iGlobalNetworkQualityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444fce47", new Object[]{this, iGlobalNetworkQualityListener});
            return;
        }
        if (iGlobalNetworkQualityListener != null) {
            Iterator<GlobalListenerWrapper> it = this.globalListeners.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GlobalListenerWrapper next = it.next();
                if (next.listener == iGlobalNetworkQualityListener) {
                    this.globalListeners.remove(next);
                    break;
                }
            }
        }
    }

    public synchronized void updateDomainQualityLevel(String str, int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abb5b3e", new Object[]{this, str, new Integer(i), new Double(d)});
        } else if (str != null) {
            ArrayList<DomainListenerWrapper> arrayList = this.domainListenerMap.get(str);
            if (arrayList != null) {
                long domainSRtt = SRttMonitor.getDomainSRtt(str);
                Iterator<DomainListenerWrapper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().updateQualityLevel(i, d, domainSRtt);
                }
            }
        }
    }

    public synchronized void updateGlobalQualityLevel(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e026553", new Object[]{this, new Integer(i), new Double(d)});
            return;
        }
        Iterator<GlobalListenerWrapper> it = this.globalListeners.iterator();
        while (it.hasNext()) {
            it.next().updateQualityLevel(i, d, 0L);
        }
    }

    private static void commitNormalRumStatistic(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec52a066", new Object[]{new Integer(i), new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5), new Double(d6), new Double(d7), new Double(d8), new Double(d9)});
            return;
        }
        RumNetworkQualityStatistic rumNetworkQualityStatistic = new RumNetworkQualityStatistic(i, d, d2, d3, d4, d5, d6, d7, d8, d9);
        ALog.e(TAG, "[RUM] commitNormalRumStatistic ", null, "type", Integer.valueOf(i), "bandwidth", Double.valueOf(d), "frttAvgIDC", Double.valueOf(d2), "frttMaxIDC", Double.valueOf(d3), "srttMaxIDC", Double.valueOf(d4), "lossratioMaxIDC", Double.valueOf(d5), "frttAvgCDN", Double.valueOf(d6), "frttMaxCDN", Double.valueOf(d7), "srttMaxCDN", Double.valueOf(d8), "lossratioMaxCDN", Double.valueOf(d9));
        AppMonitor.getInstance().commitStat(rumNetworkQualityStatistic);
    }

    private static void commitPoorRumStatistic(boolean z, int i, double d, double d2, double d3, double d4, double d5) {
        RumNetworkQualityStatistic rumNetworkQualityStatistic;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f3d929", new Object[]{new Boolean(z), new Integer(i), new Double(d), new Double(d2), new Double(d3), new Double(d4), new Double(d5)});
            return;
        }
        if (z) {
            rumNetworkQualityStatistic = new RumNetworkQualityStatistic(d, i, d2, d3, d4, d5);
        } else {
            rumNetworkQualityStatistic = new RumNetworkQualityStatistic(i, d, d2, d3, d4, d5);
        }
        ALog.e(TAG, "[RUM] commitPoorRumStatistic ", null, "isCdn", Boolean.valueOf(z), "type", Integer.valueOf(i), "bandwidth", Double.valueOf(d), "frttAvg", Double.valueOf(d2), "frttMax", Double.valueOf(d3), "srttMax", Double.valueOf(d4), "lossratioMax", Double.valueOf(d5));
        AppMonitor.getInstance().commitStat(rumNetworkQualityStatistic);
    }
}
