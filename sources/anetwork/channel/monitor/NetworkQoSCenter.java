package anetwork.channel.monitor;

import android.net.Network;
import android.os.Handler;
import android.os.HandlerThread;
import anet.channel.AwcnConfig;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anetwork.channel.entity.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NetworkQoSCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final double DEFAULT_DOUBLE_PATH_SLIPDOWN_COEFF = 0.20000000298023224d;
    private static final int DEFAULT_SMOOTH_WINDOW_SIZE = 32;
    public static final String F_PRIORITY_LEVEL_HIGH = "high";
    public static final String F_PRIORITY_LEVEL_LOW = "low";
    public static final int NETWORK_PRIORITY_LEVEL_HIGHEST = 0;
    public static final int NETWORK_PRIORITY_LEVEL_LOWEST = 9;
    public static final int NETWORK_PRIORITY_LEVEL_NORMAL = 4;
    private static final long PRINT_TIME = 5000;
    private static final String TAG = "anet.NetworkQoSCenter";
    private ConcurrentHashMap<String, BWEstimator> domainsCellBWEstimators;
    private ConcurrentHashMap<String, BWEstimator> domainsWiFiBWEstimators;
    private BWEstimator globalBWEstimator;
    private HandlerThread handlerThread;
    private ConcurrentHashMap<String, BWEstimator> sceneBWEstimators;
    private Handler updateHandler;
    private static long lastPrintTime = System.currentTimeMillis();
    private static NetworkQoSCenter instance = new NetworkQoSCenter();
    private SimplePerformanceMonitor cellularPerformanceMonitor = new SimplePerformanceMonitor(true);
    private SimplePerformanceMonitor wifiPerformanceMonitor = new SimplePerformanceMonitor(false);
    private FragmentationRecommender fragmentationRecommender = new FragmentationRecommender();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface BweScopeType {
        public static final int DOMAIN = 1;
        public static final int GLOBAL = 0;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public @interface Definition {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface BweValueType {
        public static final int ACTUAL = 0;
        public static final int PREDICTION = 1;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public @interface Definition {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class FragmentationRecommender {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class Fragment {
            public int index;
            public boolean isMultipath = false;
            public int pathType;
            public long rangeEnd;
            public long rangeStart;

            static {
                t2o.a(607126082);
            }

            public Fragment(long j, long j2, int i) {
                this.rangeStart = j;
                this.rangeEnd = j2;
                this.index = i;
            }
        }

        static {
            t2o.a(607126081);
        }

        private ArrayList<Fragment> allocateFragments(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("e148b87", new Object[]{this, new Long(j), new Long(j2)});
            }
            ArrayList<Fragment> arrayList = new ArrayList<>();
            long j3 = 0;
            int i = 0;
            while (j3 < j) {
                long j4 = j3 + j2;
                long j5 = j4 - 1;
                if (j5 >= j) {
                    j5 = j - 1;
                }
                arrayList.add(new Fragment(j3, j5, i));
                i++;
                j3 = j4;
            }
            ALog.e(NetworkQoSCenter.TAG, "[fragmentation] allocate fragments: c=[" + i + "], fl=[" + j + "], bs=[" + j2 + "]", null, new Object[0]);
            return arrayList;
        }

        private void routingFragments(ArrayList<Fragment> arrayList, boolean z, boolean z2, NetworkStatusHelper.NetworkStatus networkStatus) {
            double d;
            int i = 2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3908c1ef", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2), networkStatus});
            } else if (networkStatus.isMobile() || (networkStatus.isWifi() && !z2)) {
                if (networkStatus.isMobile()) {
                    i = 1;
                }
                ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing fragments to single net, isCellularAvailable=" + z2, null, new Object[0]);
                routingFragmentsSingleNet(arrayList, i, false);
            } else {
                Network cellularNetwork = NetworkStatusHelper.getCellularNetwork();
                NetworkStatusHelper.NetworkStatus networkStatus2 = NetworkStatusHelper.getNetworkStatus(cellularNetwork);
                NetworkQoSCenter instance = NetworkQoSCenter.getInstance();
                double bandwidthPrediction = instance.getBandwidthPrediction(2, z);
                double bandwidthPrediction2 = instance.getBandwidthPrediction(1, z);
                ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing get raw bandwidth: wifi=[" + bandwidthPrediction + "], cellular=[" + bandwidthPrediction2 + "]", null, new Object[0]);
                if (bandwidthPrediction <= Double.MIN_VALUE && bandwidthPrediction2 <= Double.MIN_VALUE) {
                    bandwidthPrediction = 100.0d;
                    bandwidthPrediction2 = 50.0d;
                } else if (bandwidthPrediction2 <= Double.MIN_VALUE && cellularNetwork != null && (networkStatus2 == NetworkStatusHelper.NetworkStatus.G5 || networkStatus2 == NetworkStatusHelper.NetworkStatus.G4)) {
                    bandwidthPrediction2 = bandwidthPrediction * 0.5d;
                    ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing reset cellular as half of wifi[" + bandwidthPrediction2 + "]", null, new Object[0]);
                }
                if (networkStatus2 == NetworkStatusHelper.NetworkStatus.G5) {
                    d = AwcnConfig.getCell5GBandwidthQualityCoeff();
                    ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing adjust cellular ratio coefficient in 5G, coeff=[" + d + "]", null, new Object[0]);
                } else if (networkStatus2 == NetworkStatusHelper.NetworkStatus.G4) {
                    d = AwcnConfig.getCell4GBandwidthQualityCoeff();
                    ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing adjust cellular ratio coefficient in 4G, coeff=[" + d + "]", null, new Object[0]);
                } else {
                    ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing adjust cellular ratio coeff=[0]", null, new Object[0]);
                    d = 0.0d;
                }
                double d2 = bandwidthPrediction2 * d;
                ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing adjust cellular bandwidth with coefficient: [" + d2 + "]", null, new Object[0]);
                double doublePathsSlipdownCoeff = AwcnConfig.getDoublePathsSlipdownCoeff();
                if (doublePathsSlipdownCoeff < vu3.b.GEO_NOT_SUPPORT) {
                    doublePathsSlipdownCoeff = NetworkQoSCenter.DEFAULT_DOUBLE_PATH_SLIPDOWN_COEFF;
                }
                double d3 = bandwidthPrediction + d2;
                double d4 = bandwidthPrediction / d3;
                if (d2 / d3 < doublePathsSlipdownCoeff) {
                    ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing slip down to path of Wi-Fi", null, new Object[0]);
                    routingFragmentsSingleNet(arrayList, 2, false);
                } else if (d4 < doublePathsSlipdownCoeff) {
                    ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing slip down to path of Cellular", null, new Object[0]);
                    routingFragmentsSingleNet(arrayList, 1, true);
                } else {
                    ALog.e(NetworkQoSCenter.TAG, "[fragmentation] routing fragments with DOUBLE network-interface", null, new Object[0]);
                    routingFragmentsDoubleNet(arrayList, d4);
                }
            }
        }

        private void routingFragmentsDoubleNet(ArrayList<Fragment> arrayList, double d) {
            int i;
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88d5eaea", new Object[]{this, arrayList, new Double(d)});
                return;
            }
            int size = arrayList.size();
            int round = Math.round((float) (size * d));
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = arrayList.get(i2);
                if (i2 < round) {
                    i = 2;
                } else {
                    i = 1;
                }
                fragment.pathType = i;
                if (i2 < round) {
                    z = false;
                } else {
                    z = true;
                }
                fragment.isMultipath = z;
            }
        }

        private void routingFragmentsSingleNet(ArrayList<Fragment> arrayList, int i, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1e2893c", new Object[]{this, arrayList, new Integer(i), new Boolean(z)});
                return;
            }
            int size = arrayList.size();
            Math.round(size / 2.0f);
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = arrayList.get(i2);
                fragment.pathType = i;
                fragment.isMultipath = z;
            }
        }

        public ArrayList<Fragment> getFragmentation(long j, boolean z, boolean z2, NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("4f09c7e1", new Object[]{this, new Long(j), new Boolean(z), new Boolean(z2), networkStatus});
            }
            if (networkStatus == null || j <= AwcnConfig.getFragmentFileLengthThreshold()) {
                return null;
            }
            long fragmentSize = AwcnConfig.getFragmentSize();
            if (fragmentSize <= 0 || fragmentSize > j) {
                ALog.i(NetworkQoSCenter.TAG, "[fragmentation] configured fragment size error: bs=[" + fragmentSize + "] + fl=[" + j + "]", null, new Object[0]);
                return null;
            }
            ArrayList<Fragment> allocateFragments = allocateFragments(j, fragmentSize);
            if (allocateFragments == null || allocateFragments.isEmpty()) {
                return null;
            }
            routingFragments(allocateFragments, z, z2, networkStatus);
            return allocateFragments;
        }

        private FragmentationRecommender() {
        }

        private ArrayList<Fragment> allocateFragments(String str) {
            String[] split;
            String[] split2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("cd8d59d1", new Object[]{this, str});
            }
            ArrayList<Fragment> arrayList = null;
            if (!(str == null || str.length() < 5 || (split = str.split(",")) == null || split.length == 0)) {
                arrayList = new ArrayList<>();
                for (String str2 : split) {
                    if (!(str2 == null || (split2 = str2.trim().split("-")) == null || split2.length != 3)) {
                        arrayList.add(new Fragment(Long.parseLong(split2[0]), Long.parseLong(split2[1]), Integer.parseInt(split2[2])));
                    }
                }
            }
            return arrayList;
        }

        public ArrayList<Fragment> getFragmentation(String str, boolean z, boolean z2, NetworkStatusHelper.NetworkStatus networkStatus) {
            ArrayList<Fragment> allocateFragments;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("67956e6f", new Object[]{this, str, new Boolean(z), new Boolean(z2), networkStatus});
            }
            if (str == null || networkStatus == null || (allocateFragments = allocateFragments(str)) == null || allocateFragments.isEmpty()) {
                return null;
            }
            routingFragments(allocateFragments, z, z2, networkStatus);
            return allocateFragments;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface NetworkPathType {
        public static final int CELLULAR = 1;
        public static final int WIFI = 2;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public @interface Definition {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class SimplePerformanceMonitor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private SimpleSmoothWindow bandwidthWindowCDN;
        private SimpleSmoothWindow bandwidthWindowIDC;
        public boolean isMobile;
        private SimpleSmoothWindow srttWindowCDN;
        private SimpleSmoothWindow srttWindowIDC;

        static {
            t2o.a(607126085);
        }

        public SimplePerformanceMonitor(boolean z) {
            this.isMobile = z;
            int access$600 = NetworkQoSCenter.access$600();
            this.bandwidthWindowIDC = new SimpleSmoothWindow(access$600);
            this.bandwidthWindowCDN = new SimpleSmoothWindow(access$600);
            this.srttWindowIDC = new SimpleSmoothWindow(access$600);
            this.srttWindowCDN = new SimpleSmoothWindow(access$600);
        }

        public double getBandwidthPrediction(boolean z) {
            SimpleSmoothWindow simpleSmoothWindow;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("461ba871", new Object[]{this, new Boolean(z)})).doubleValue();
            }
            if (z) {
                simpleSmoothWindow = this.bandwidthWindowCDN;
            } else {
                simpleSmoothWindow = this.bandwidthWindowIDC;
            }
            return simpleSmoothWindow.getAverage();
        }

        public void input(long j, long j2, long j3, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b9fa3e1", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Boolean(z)});
            } else if (z) {
                if (j2 > 0) {
                    this.bandwidthWindowCDN.add(j / j2);
                }
                if (j3 > 0) {
                    this.srttWindowCDN.add(j3);
                }
            } else {
                if (j2 > 0) {
                    this.bandwidthWindowIDC.add(j / j2);
                }
                if (j3 > 0) {
                    this.srttWindowIDC.add(j3);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class SimpleSmoothWindow {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int size;
        private Queue<Double> window = new LinkedList();
        private double sum = vu3.b.GEO_NOT_SUPPORT;

        static {
            t2o.a(607126086);
        }

        public SimpleSmoothWindow(int i) {
            this.size = i;
        }

        private void filter() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35bd3ff", new Object[]{this});
                return;
            }
            int size = this.window.size();
            double[] dArr = new double[size];
            for (int i = 0; i < size; i++) {
                dArr[i] = this.window.poll().doubleValue();
            }
            Arrays.sort(dArr);
            int i2 = size / 2;
            double median = getMedian(Arrays.copyOfRange(dArr, 0, i2));
            double median2 = getMedian(Arrays.copyOfRange(dArr, i2, size));
            double d = (median2 - median) * 1.5d;
            double d2 = median - d;
            double d3 = median2 + d;
            this.sum = vu3.b.GEO_NOT_SUPPORT;
            for (int i3 = 0; i3 < size; i3++) {
                double d4 = dArr[i3];
                if (d4 >= d2 && d4 <= d3) {
                    this.window.offer(Double.valueOf(d4));
                    this.sum += d4;
                }
            }
        }

        private double getMedian(double[] dArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aaeaafe", new Object[]{this, dArr})).doubleValue();
            }
            int length = dArr.length / 2;
            if (dArr.length % 2 == 0) {
                return (dArr[length - 1] + dArr[length]) / 2.0d;
            }
            return dArr[length];
        }

        private boolean isEmpty() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            return this.window.isEmpty();
        }

        public synchronized void add(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3813096", new Object[]{this, new Double(d)});
                return;
            }
            this.window.add(Double.valueOf(d));
            this.sum += d;
            if (this.window.size() > this.size) {
                this.sum -= this.window.remove().doubleValue();
            }
        }

        public synchronized double getAverage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("604252dc", new Object[]{this})).doubleValue();
            } else if (isEmpty()) {
                return vu3.b.GEO_NOT_SUPPORT;
            } else {
                if (this.window.size() > 10) {
                    filter();
                }
                return this.sum / this.window.size();
            }
        }
    }

    static {
        t2o.a(607126075);
    }

    private NetworkQoSCenter() {
        this.handlerThread = null;
        this.updateHandler = null;
        this.globalBWEstimator = null;
        this.domainsWiFiBWEstimators = null;
        this.domainsCellBWEstimators = null;
        this.sceneBWEstimators = null;
        HandlerThread handlerThread = new HandlerThread("BWEstimatorHandlerThread");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.updateHandler = new Handler(this.handlerThread.getLooper());
        this.globalBWEstimator = new BWEstimator();
        this.domainsWiFiBWEstimators = new ConcurrentHashMap<>();
        this.domainsCellBWEstimators = new ConcurrentHashMap<>();
        this.sceneBWEstimators = new ConcurrentHashMap<>();
    }

    public static /* synthetic */ BWEstimator access$100(NetworkQoSCenter networkQoSCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BWEstimator) ipChange.ipc$dispatch("69ae95d3", new Object[]{networkQoSCenter});
        }
        return networkQoSCenter.globalBWEstimator;
    }

    public static /* synthetic */ void access$200(NetworkQoSCenter networkQoSCenter, String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639b735d", new Object[]{networkQoSCenter, str, str2, new Long(j), new Long(j2)});
        } else {
            networkQoSCenter.dueToSceneBWEstimators(str, str2, j, j2);
        }
    }

    public static /* synthetic */ ConcurrentHashMap access$300(NetworkQoSCenter networkQoSCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("26ceb33e", new Object[]{networkQoSCenter});
        }
        return networkQoSCenter.domainsCellBWEstimators;
    }

    public static /* synthetic */ ConcurrentHashMap access$400(NetworkQoSCenter networkQoSCenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("fd6783f", new Object[]{networkQoSCenter});
        }
        return networkQoSCenter.domainsWiFiBWEstimators;
    }

    public static /* synthetic */ long access$500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5552fb0", new Object[0])).longValue();
        }
        return lastPrintTime;
    }

    public static /* synthetic */ long access$502(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8baefba", new Object[]{new Long(j)})).longValue();
        }
        lastPrintTime = j;
        return j;
    }

    public static /* synthetic */ int access$600() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa3b6af0", new Object[0])).intValue();
        }
        return getNetworkQosSmoothWindowSize();
    }

    private void dueToSceneBWEstimators(String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce24f180", new Object[]{this, str, str2, new Long(j), new Long(j2)});
            return;
        }
        try {
            if (this.sceneBWEstimators != null && str != null && str2 != null && AwcnConfig.isHostInBWEstimatorList(str, str2)) {
                BWEstimator bWEstimator = this.sceneBWEstimators.get(str2);
                if (bWEstimator == null) {
                    bWEstimator = new BWEstimator();
                    this.sceneBWEstimators.put(str2, bWEstimator);
                }
                bWEstimator.update(str2, j, j2);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[dueToSceneBWEstimators] error", null, th, new Object[0]);
        }
    }

    public static NetworkQoSCenter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkQoSCenter) ipChange.ipc$dispatch("f89c1824", new Object[0]);
        }
        return instance;
    }

    private static int getNetworkQosSmoothWindowSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("437b9df6", new Object[0])).intValue();
        }
        int networkQosSmoothWindowSize = AwcnConfig.getNetworkQosSmoothWindowSize();
        if (networkQosSmoothWindowSize <= 0) {
            return 32;
        }
        return networkQosSmoothWindowSize;
    }

    public static int getRequestPriority(RequestConfig requestConfig) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("290d475d", new Object[]{requestConfig})).intValue();
        }
        if (requestConfig == null) {
            return 4;
        }
        String flowRefer = requestConfig.getFlowRefer();
        if (flowRefer == null) {
            requestConfig.priority = 4;
            return 4;
        } else if (!AwcnConfig.isSupportQoS(flowRefer)) {
            requestConfig.priority = 4;
            return 4;
        } else {
            ALog.e(TAG, "[QoS] f-refer:" + flowRefer + ", QoS=YES", requestConfig.seqNo, new Object[0]);
            String priorityLevel = requestConfig.getPriorityLevel();
            if (priorityLevel == null) {
                ALog.e(TAG, "[QoS] f-priority-level : null", requestConfig.seqNo, new Object[0]);
                requestConfig.priority = 4;
                return 4;
            }
            if (priorityLevel.equalsIgnoreCase("high")) {
                ALog.e(TAG, "[QoS] f-priority-level : high", requestConfig.seqNo, new Object[0]);
            } else if (priorityLevel.equalsIgnoreCase("low")) {
                ALog.e(TAG, "[QoS] f-priority-level : low", requestConfig.seqNo, new Object[0]);
                i = 9;
            } else {
                ALog.e(TAG, "[QoS] f-priority-level : ".concat(priorityLevel), requestConfig.seqNo, new Object[0]);
                i = 4;
            }
            requestConfig.priority = i;
            return i;
        }
    }

    public double getBandwidth(int i, int i2, String str) {
        int i3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c50fde1a", new Object[]{this, new Integer(i), new Integer(i2), str})).doubleValue();
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status == null) {
            return -1.0d;
        }
        if (status.isMobile()) {
            i3 = 1;
        }
        return getBandwidth(i, i2, str, i3);
    }

    public double getBandwidthPrediction(int i, boolean z) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d526050", new Object[]{this, new Integer(i), new Boolean(z)})).doubleValue();
        }
        if (i == 1) {
            d = this.cellularPerformanceMonitor.getBandwidthPrediction(z);
        } else if (i == 2) {
            d = this.wifiPerformanceMonitor.getBandwidthPrediction(z);
        } else {
            d = vu3.b.GEO_NOT_SUPPORT;
        }
        ALog.e(TAG, "[fragmentation] getBandwidthPrediction(path:" + i + ", isCdn:" + z + ") =>" + d, null, new Object[0]);
        return d;
    }

    public FragmentationRecommender getFragmentationRecommender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentationRecommender) ipChange.ipc$dispatch("c7dda9db", new Object[]{this});
        }
        return this.fragmentationRecommender;
    }

    public int getQualityLevel(String str) {
        BWEstimator bWEstimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b61ad07f", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            return this.globalBWEstimator.getQualityLevel();
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status == null) {
            return 0;
        }
        if (status.isMobile()) {
            bWEstimator = this.domainsCellBWEstimators.get(str);
        } else {
            bWEstimator = this.domainsWiFiBWEstimators.get(str);
        }
        if (bWEstimator != null) {
            return bWEstimator.getQualityLevel();
        }
        return 0;
    }

    public int getQualityLevelByScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86a538be", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            return this.globalBWEstimator.getQualityLevel();
        }
        BWEstimator bWEstimator = this.sceneBWEstimators.get(str);
        if (bWEstimator != null) {
            return bWEstimator.getQualityLevel();
        }
        return 0;
    }

    public void input(long j, long j2, long j3, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8554b42", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Boolean(z), new Integer(i)});
            return;
        }
        ALog.i(TAG, "[fragmentation] input QoS data: traffic=[" + j + "], elapse=[" + j2 + "], srtt=[" + j3 + "] + isCDN=[" + z + "], path=[" + i + "]", null, new Object[0]);
        if (i == 1) {
            this.cellularPerformanceMonitor.input(j, j2, j3, z);
        } else if (i == 2) {
            this.wifiPerformanceMonitor.input(j, j2, j3, z);
        }
    }

    public void update(final String str, final long j, final long j2) {
        final int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ca609a", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status != null) {
            if (status.isMobile()) {
                i = 1;
            } else {
                i = 2;
            }
            this.updateHandler.post(new Runnable() { // from class: anetwork.channel.monitor.NetworkQoSCenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    ConcurrentHashMap concurrentHashMap;
                    BWEstimator bWEstimator;
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    NetworkQoSCenter.access$100(NetworkQoSCenter.this).update("global", j, j2);
                    NetworkQoSCenter.access$200(NetworkQoSCenter.this, str, "video", j, j2);
                    int i2 = i;
                    if (i2 == 1) {
                        concurrentHashMap = NetworkQoSCenter.access$300(NetworkQoSCenter.this);
                    } else {
                        concurrentHashMap = i2 == 2 ? NetworkQoSCenter.access$400(NetworkQoSCenter.this) : null;
                    }
                    if (concurrentHashMap == null || (str2 = str) == null) {
                        bWEstimator = null;
                    } else {
                        bWEstimator = (BWEstimator) concurrentHashMap.get(str2);
                        if (bWEstimator == null) {
                            bWEstimator = new BWEstimator();
                            concurrentHashMap.put(str, bWEstimator);
                        }
                        bWEstimator.update("domain", j, j2);
                    }
                    NetworkQualityMonitor instance2 = NetworkQualityMonitor.getInstance();
                    if (instance2 != null) {
                        instance2.updateGlobalQualityLevel(NetworkQoSCenter.access$100(NetworkQoSCenter.this).getQualityLevel(), NetworkQoSCenter.access$100(NetworkQoSCenter.this).prediction());
                        instance2.updateDomainQualityLevel(str, bWEstimator.getQualityLevel(), bWEstimator.prediction());
                        long currentTimeMillis = System.currentTimeMillis();
                        if (System.currentTimeMillis() - NetworkQoSCenter.access$500() > 5000) {
                            NetworkQoSCenter.access$502(currentTimeMillis);
                            ALog.e("anet.BWEstimator", "[Qos Interval] last window update globalQualityLevel=[" + NetworkQoSCenter.access$100(NetworkQoSCenter.this).getQualityLevel() + "] ,cur prediction=" + NetworkQoSCenter.access$100(NetworkQoSCenter.this).prediction() + " ,cur actual=" + NetworkQoSCenter.access$100(NetworkQoSCenter.this).actual(), null, new Object[0]);
                        }
                    }
                }
            });
        }
    }

    public double getBandwidth(int i, int i2, String str, int i3) {
        BWEstimator bWEstimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcec5a45", new Object[]{this, new Integer(i), new Integer(i2), str, new Integer(i3)})).doubleValue();
        }
        if (i == 0) {
            bWEstimator = this.globalBWEstimator;
        } else {
            if (i == 1 && str != null) {
                if (i3 == 1) {
                    bWEstimator = this.domainsCellBWEstimators.get(str);
                } else if (i3 == 2) {
                    bWEstimator = this.domainsWiFiBWEstimators.get(str);
                }
            }
            bWEstimator = null;
        }
        if (bWEstimator == null) {
            return -1.0d;
        }
        if (i2 == 0) {
            return bWEstimator.actual();
        }
        if (i2 == 1) {
            return bWEstimator.prediction();
        }
        return -1.0d;
    }
}
