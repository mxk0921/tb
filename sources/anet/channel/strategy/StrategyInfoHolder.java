package anet.channel.strategy;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.HttpStrategyDetector;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.statist.StrategyFileStatistic;
import anet.channel.statist.StrategyStatObject;
import anet.channel.statist.StrategyStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.StringUtils;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyInfoHolder implements NetworkStatusHelper.INetworkStatusChangeListener, NetworkStatusHelper.IVpnProxyStatusChangeListener, AppLifecycle.AppLifecycleListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_FILE = "StrategyConfig";
    private static final String DEFAULT_BSSID = "02:00:00:00:00:00";
    public static final int HOT_SEND_AMDC = 1;
    public static final int LUNCH_AFTER_SEND_AMDC = 0;
    public static final int MAX_TABLE_NUM_IN_MEM = 3;
    private static final String TAG = "awcn.StrategyInfoHolder";
    private volatile NetworkStatusHelper.NetworkStatus currentNetworkStatus;
    private String defaultUniqueId;
    public static String NEW_CONFIG_FILE = "NewStrategyConfig_version_" + Build.VERSION.SDK_INT;
    public static Map<String, String> strategyClientIpMap = null;
    private static volatile AtomicLong lastSendAmdcTime = new AtomicLong(-1);
    public Map<String, StrategyTable> strategyTableMap = new LruStrategyMap();
    public volatile StrategyConfig strategyConfig = null;
    public final LocalDnsStrategyTable localDnsStrategyTable = new LocalDnsStrategyTable();
    private final StrategyTable unknownStrategyTable = new StrategyTable("Unknown");
    private final Set<String> loadingFiles = new HashSet();
    private volatile String uniqueId = "";
    private volatile boolean isSendAMDCEnable = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class LruStrategyMap extends SerialLruCache<String, StrategyTable> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 1866478394612290927L;

        static {
            t2o.a(607125866);
        }

        public LruStrategyMap() {
            super(3);
        }

        public static /* synthetic */ Object ipc$super(LruStrategyMap lruStrategyMap, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/strategy/StrategyInfoHolder$LruStrategyMap");
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(final Map.Entry<String, StrategyTable> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d28ca266", new Object[]{this, entry})).booleanValue();
            }
            AmdcThreadPoolExecutor.submitTask(new Runnable() { // from class: anet.channel.strategy.StrategyInfoHolder.LruStrategyMap.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    StrategyTable strategyTable = (StrategyTable) entry.getValue();
                    if (strategyTable.isChanged) {
                        StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                        strategyStatObject.strategyType = AwcnConfig.isAmdcParcelableEnable() ? 1 : 0;
                        strategyStatObject.writeStrategyFileId = strategyTable.uniqueId;
                        strategyTable.lastModified = System.currentTimeMillis();
                        StrategySerializeHelper.persist((Serializable) entry.getValue(), strategyTable.uniqueId, strategyStatObject);
                        strategyTable.isChanged = false;
                    }
                }
            });
            return true;
        }
    }

    static {
        t2o.a(607125862);
        t2o.a(607125819);
        t2o.a(607125820);
        t2o.a(607125932);
    }

    private StrategyInfoHolder() {
        try {
            init();
            restore();
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void access$000(StrategyInfoHolder strategyInfoHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e9ba5c", new Object[]{strategyInfoHolder});
        } else {
            strategyInfoHolder.loadUniqueId();
        }
    }

    public static /* synthetic */ String access$100(StrategyInfoHolder strategyInfoHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc5845e3", new Object[]{strategyInfoHolder});
        }
        return strategyInfoHolder.uniqueId;
    }

    private void checkInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
            return;
        }
        synchronized (this.strategyTableMap) {
            try {
                for (Map.Entry<String, StrategyTable> entry : this.strategyTableMap.entrySet()) {
                    entry.getValue().checkInit();
                }
            } finally {
            }
        }
        synchronized (this) {
            try {
                if (this.strategyConfig == null) {
                    StrategyConfig strategyConfig = new StrategyConfig();
                    strategyConfig.checkInit();
                    strategyConfig.setHolder(this);
                    this.strategyConfig = strategyConfig;
                }
            } finally {
            }
        }
    }

    private String getLastUniqueId(String str) {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c9b0f37", new Object[]{this, str});
        }
        File[] sortedFiles = StrategySerializeHelper.getSortedFiles();
        if (sortedFiles == null) {
            return this.defaultUniqueId;
        }
        while (true) {
            if (i >= sortedFiles.length) {
                str2 = "";
                break;
            }
            File file = sortedFiles[i];
            if (!file.isDirectory()) {
                str2 = file.getName();
                if (str2.startsWith(str)) {
                    break;
                }
            }
            i++;
        }
        if (TextUtils.isEmpty(str2)) {
            return this.defaultUniqueId;
        }
        return str2;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        NetworkStatusHelper.addStatusChangeListener(this);
        NetworkStatusHelper.registerVpnProxyStatusListener(this);
        AppLifecycle.registerLifecycleListener(this);
        this.currentNetworkStatus = NetworkStatusHelper.getStatus();
        if (AwcnConfig.isVpnOptOpened()) {
            StringBuilder sb = new StringBuilder(NetworkStatusHelper.getMcc() + "WIFI.");
            sb.append(GlobalAppRuntimeInfo.getUtdid());
            this.defaultUniqueId = sb.toString();
            return;
        }
        this.defaultUniqueId = "WIFI$" + GlobalAppRuntimeInfo.getUtdid();
    }

    public static StrategyInfoHolder newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyInfoHolder) ipChange.ipc$dispatch("68ab075f", new Object[0]);
        }
        return new StrategyInfoHolder();
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void background() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550392b5", new Object[]{this});
        } else {
            StrategySerializeHelper.clearOtherVersionStrategy();
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        NetworkStatusHelper.removeStatusChangeListener(this);
        NetworkStatusHelper.unregisterVpnProxyStatusListener(this);
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void forground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5402817", new Object[]{this});
        } else if (AwcnConfig.isAllowForceFgAmdcEnable() && AppLifecycle.lastEnterBackgroundTime != 0) {
            if (lastSendAmdcTime.get() == -1 || System.currentTimeMillis() - lastSendAmdcTime.get() > AwcnConfig.getFgSendAmdcIntervalTime()) {
                sendAmdcHotDomainRequest("([bg_to_fg_cell] backgroundToForegroundChanged)", 1, HttpDispatcher.AmdcConditionType.BG_TO_FG_AMDC.ordinal(), false, true);
            }
        }
    }

    public StrategyTable getCurrStrategyTable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyTable) ipChange.ipc$dispatch("693b718d", new Object[]{this});
        }
        StrategyTable strategyTable = this.unknownStrategyTable;
        String str = this.uniqueId;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.strategyTableMap) {
                ALog.d(TAG, "[uniqueId] cur uniqueId=" + this.uniqueId, null, new Object[0]);
                StrategyTable strategyTable2 = this.strategyTableMap.get(str);
                if (strategyTable2 == null) {
                    strategyTable2 = new StrategyTable(str);
                    this.strategyTableMap.put(str, strategyTable2);
                }
                strategyTable = strategyTable2;
            }
        }
        return strategyTable;
    }

    public String getUniqueId(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75163034", new Object[]{this, networkStatus});
        }
        if (!AwcnConfig.isVpnOptOpened()) {
            String str = "";
            if (networkStatus.isWifi()) {
                String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
                if (this.strategyConfig != null && !TextUtils.isEmpty(wifiBSSID) && !DEFAULT_BSSID.equals(wifiBSSID)) {
                    str = this.strategyConfig.getUniqueIdByBssid(StringUtils.md5ToHex(wifiBSSID));
                }
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
                this.isSendAMDCEnable = true;
                return getLastUniqueId("WIFI");
            } else if (!networkStatus.isMobile()) {
                return str;
            } else {
                return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
            }
        } else {
            this.isSendAMDCEnable = true;
            String str2 = NetworkStatusHelper.getMcc() + networkStatus.getType();
            if (!AwcnConfig.isUniqueIdEnable() || this.uniqueId == null || this.uniqueId.isEmpty() || this.uniqueId.equalsIgnoreCase(this.defaultUniqueId) || !this.uniqueId.contains(str2)) {
                return getLastUniqueId(str2);
            }
            ALog.e(TAG, "[uniqueId] get new uniqueId=", null, new Object[0]);
            return this.uniqueId;
        }
    }

    public void loadFile(String str, boolean z) {
        StrategyStatObject strategyStatObject;
        StrategyTable strategyTable;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d7aca1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        synchronized (this.loadingFiles) {
            if (!this.loadingFiles.contains(str)) {
                this.loadingFiles.add(str);
                boolean isAmdcParcelableEnable = AwcnConfig.isAmdcParcelableEnable();
                if (z) {
                    strategyStatObject = new StrategyStatObject(0);
                    strategyStatObject.strategyType = isAmdcParcelableEnable ? 1 : 0;
                    strategyStatObject.readStrategyFileId = str;
                } else {
                    strategyStatObject = null;
                }
                if (isAmdcParcelableEnable) {
                    strategyTable = createStrategyTable(str, strategyStatObject);
                } else {
                    strategyTable = (StrategyTable) StrategySerializeHelper.restore(str, strategyStatObject);
                }
                if (strategyTable != null) {
                    strategyTable.checkInit();
                    strategyTable.parseStrategyData();
                    synchronized (this.strategyTableMap) {
                        ALog.e(TAG, "[amdc_file] FILEIO loadFile uniqueId:" + strategyTable.uniqueId, null, new Object[0]);
                        this.strategyTableMap.put(strategyTable.uniqueId, strategyTable);
                    }
                }
                synchronized (this.loadingFiles) {
                    this.loadingFiles.remove(str);
                }
                if (z) {
                    if (strategyTable == null) {
                        i = 0;
                    }
                    strategyStatObject.isSucceed = i;
                    AppMonitor.getInstance().commitStat(strategyStatObject);
                    return;
                }
                return;
            }
            ALog.e(TAG, "[amdc_file] FILEIO loadFile contains(filename)", null, new Object[0]);
        }
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(final NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            return;
        }
        this.currentNetworkStatus = networkStatus;
        loadUniqueId();
        final String str = this.uniqueId;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.strategyTableMap) {
                try {
                    if (!this.strategyTableMap.containsKey(str)) {
                        AmdcThreadPoolExecutor.submitTask(new Runnable() { // from class: anet.channel.strategy.StrategyInfoHolder.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (AwcnConfig.isVpnOptOpened()) {
                                    StrategyInfoHolder.this.sendAmdcHotDomainRequest("(onNetworkStatusChanged)", 1, HttpDispatcher.AmdcConditionType.NETWORK_CHANGE_AMDC.ordinal(), false, true);
                                }
                                ALog.e(StrategyInfoHolder.TAG, "[amdc_file] onNetworkStatusChanged loadFile, filename= " + StrategyInfoHolder.access$100(StrategyInfoHolder.this), null, new Object[0]);
                                StrategyInfoHolder.this.loadFile(str, true);
                                if (!AwcnConfig.isVpnChangeDetectOpened()) {
                                    Http3ConnectionDetector.startDetect(networkStatus);
                                }
                                HttpStrategyDetector.startHttpDetect();
                                StrategyInfoHolder.this.clearStrategy(str);
                                StrategyInfoHolder.this.commitStrategyMonitor();
                            }
                        });
                    } else {
                        if (!AwcnConfig.isVpnChangeDetectOpened()) {
                            Http3ConnectionDetector.startDetect(networkStatus);
                        }
                        HttpStrategyDetector.startHttpDetect();
                        AmdcThreadPoolExecutor.submitTask(new Runnable() { // from class: anet.channel.strategy.StrategyInfoHolder.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                StrategyInfoHolder.this.clearStrategy(str);
                                StrategyInfoHolder.this.commitStrategyMonitor();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // anet.channel.status.NetworkStatusHelper.IVpnProxyStatusChangeListener
    public void onVpnProxyStatusChanged(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd51090", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (AwcnConfig.isVpnOptOpened()) {
            this.currentNetworkStatus = NetworkStatusHelper.getStatus();
            loadUniqueId();
            String str = this.uniqueId;
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.strategyTableMap) {
                    try {
                        if (!this.strategyTableMap.containsKey(str)) {
                            ALog.e(TAG, "[amdc_file] onVpnProxyStatusChanged loadFile, filename= " + this.uniqueId, null, new Object[0]);
                            loadFile(str, true);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            sendAmdcHotDomainRequest("(onVpnProxyStatusChanged)", 1, HttpDispatcher.AmdcConditionType.VPN_AMDC.ordinal(), true, true);
        }
    }

    public void saveData() {
        String str;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b9e7ce", new Object[]{this});
            return;
        }
        try {
            synchronized (this.strategyTableMap) {
                boolean isAmdcParcelableEnable = AwcnConfig.isAmdcParcelableEnable();
                StrategyFileStatistic strategyFileStatistic = new StrategyFileStatistic(2, isAmdcParcelableEnable);
                long currentTimeMillis = System.currentTimeMillis();
                for (StrategyTable strategyTable : this.strategyTableMap.values()) {
                    if (strategyTable.isChanged) {
                        Map<String, String> map = strategyClientIpMap;
                        if (map == null || map.isEmpty() || strategyTable.clientIp == null || strategyTable.clientIp.isEmpty() || (str = strategyClientIpMap.get(strategyTable.clientIp)) == null || str.isEmpty() || !str.equalsIgnoreCase(strategyTable.uniqueId)) {
                            strategyTable.lastModified = System.currentTimeMillis();
                            StrategyStatObject strategyStatObject = new StrategyStatObject(i);
                            strategyStatObject.strategyType = isAmdcParcelableEnable ? 1 : 0;
                            String str2 = strategyTable.uniqueId;
                            strategyStatObject.writeStrategyFileId = str2;
                            ALog.e(TAG, "[amdc_file][strategy opt] persist saveData.", null, "file", str2, "lastModified", Long.valueOf(strategyTable.lastModified));
                            if (isAmdcParcelableEnable) {
                                StrategySerializeHelper.persistParcelable(strategyTable, strategyTable.uniqueId, strategyStatObject);
                            } else {
                                StrategySerializeHelper.persist(strategyTable, strategyTable.uniqueId, strategyStatObject);
                            }
                            strategyTable.isChanged = false;
                        } else {
                            String str3 = strategyTable.uniqueId;
                            String str4 = strategyTable.clientIp;
                            Object[] objArr = new Object[4];
                            objArr[0] = "file";
                            objArr[i] = str3;
                            objArr[2] = "clientIp";
                            objArr[3] = str4;
                            ALog.e(TAG, "[amdc_file] not need persist saveData.", null, objArr);
                        }
                    }
                    i = 1;
                }
                if (isAmdcParcelableEnable) {
                    StrategySerializeHelper.persistParcelable(this.strategyConfig.createSelf(), NEW_CONFIG_FILE, null);
                } else {
                    StrategySerializeHelper.persist(this.strategyConfig.createSelf(), CONFIG_FILE, null);
                }
                strategyFileStatistic.costTime = System.currentTimeMillis() - currentTimeMillis;
                AppMonitor.getInstance().commitStat(strategyFileStatistic);
                ALog.e(TAG, "[amdc_file] end loading strategy files", null, AmnetMonitorLoggerListener.LogModel.IS_SFC, strategyFileStatistic.toString());
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[amdc_file] saveData fail!", null, "e", th);
        }
    }

    public void sendAmdcHotDomainRequest(String str, int i, int i2, boolean z, boolean z2) {
        CopyOnWriteArraySet<String> lunchAfterAmdcList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ee4702", new Object[]{this, str, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
            return;
        }
        lastSendAmdcTime.set(System.currentTimeMillis());
        if (i == 1) {
            Set<String> initHosts = HttpDispatcher.getInstance().getInitHosts();
            if (initHosts != null && !initHosts.isEmpty()) {
                AwcnConfig.initSetAccessPointStatus(true);
                getCurrStrategyTable().sendAmdcRequest(initHosts, i2, z, z2);
                ALog.e(TAG, "[ap][VPN] sendAmdcRequest forceSend! " + str, null, "amdcList", initHosts);
            }
        } else if (i == 0 && (lunchAfterAmdcList = AwcnConfig.getLunchAfterAmdcList()) != null && !lunchAfterAmdcList.isEmpty()) {
            getCurrStrategyTable().sendAmdcRequest((Set<String>) lunchAfterAmdcList, false, true);
            ALog.e(TAG, "[ap][VPN] sendAmdcRequest isLunchAfterAmdc=true " + str, null, "amdcList", lunchAfterAmdcList);
        }
    }

    public void startHttp3Detect(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff04c787", new Object[]{this, str, str2});
        } else if (AwcnConfig.isVpnChangeDetectOpened() && NetworkStatusHelper.isAccessPointChange(str, str2, this.uniqueId)) {
            Http3ConnectionDetector.startDetect(this.currentNetworkStatus);
        }
    }

    public void update(boolean z, StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        StrategyTable strategyTable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b33129", new Object[]{this, new Boolean(z), httpDnsResponse});
            return;
        }
        int i = httpDnsResponse.fcLevel;
        if (i != 0) {
            AmdcRuntimeInfo.updateAmdcLimit(i, httpDnsResponse.fcTime);
        }
        updateUniqueId(httpDnsResponse.accessPoint, httpDnsResponse.clientIp);
        if (z) {
            strategyTable = getCellularStrategyTable();
        } else {
            strategyTable = getCurrStrategyTable();
        }
        strategyTable.update(httpDnsResponse);
        this.strategyConfig.update(httpDnsResponse);
    }

    public synchronized void clearStrategy(String str) {
        StrategyTable value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb87371", new Object[]{this, str});
            return;
        }
        try {
            if ("com.taobao.taobao:channel".equals(GlobalAppRuntimeInfo.getCurrentProcess())) {
                for (Map.Entry<String, StrategyTable> entry : this.strategyTableMap.entrySet()) {
                    if (!entry.getKey().equals(str) && (value = entry.getValue()) != null) {
                        value.clearStrategy();
                        saveData(value);
                    }
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "[channel process] clear not uniqueId=[" + str + "] strategy, error=" + e.toString(), null, new Object[0]);
        }
    }

    public void commitStrategyMonitor() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d680b7", new Object[]{this});
            return;
        }
        try {
            for (Map.Entry<String, StrategyTable> entry : this.strategyTableMap.entrySet()) {
                StrategyStatistic strategyStatistic = new StrategyStatistic();
                strategyStatistic.netType = NetworkStatusHelper.getNetworkSubType();
                if (GlobalAppRuntimeInfo.isChannelProcess()) {
                    str = "channel";
                } else {
                    str = "main";
                }
                strategyStatistic.process = str;
                strategyStatistic.hostStrategyMapSize = this.strategyTableMap.entrySet().size();
                strategyStatistic.nameType = entry.getKey();
                entry.getValue().commitStrategyMonitor(strategyStatistic);
            }
        } catch (Exception e) {
            ALog.e(TAG, "[StrategyStatistic] commitStrategyMonitor fail ! e = " + e.toString(), null, new Object[0]);
        }
    }

    public StrategyTable getCellularStrategyTable() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyTable) ipChange.ipc$dispatch("e1e63c55", new Object[]{this});
        }
        StrategyTable strategyTable = this.unknownStrategyTable;
        NetworkStatusHelper.NetworkStatus networkStatus = NetworkStatusHelper.getNetworkStatus(NetworkStatusHelper.getCellularNetwork());
        if (networkStatus == null) {
            str = this.uniqueId;
        } else {
            str = getUniqueId(networkStatus);
        }
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.strategyTableMap) {
                ALog.d(TAG, "[uniqueId] cellular uniqueId=" + this.uniqueId, null, new Object[0]);
                strategyTable = this.strategyTableMap.get(str);
                if (strategyTable == null) {
                    strategyTable = new StrategyTable(str);
                    this.strategyTableMap.put(str, strategyTable);
                }
            }
        }
        return strategyTable;
    }

    private void loadUniqueId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7611359", new Object[]{this});
            return;
        }
        this.uniqueId = getUniqueId(this.currentNetworkStatus);
        if (this.currentNetworkStatus.isWifi() && this.isSendAMDCEnable) {
            getCurrStrategyTable().sendAmdcRequest(DispatchConstants.getAmdcServerDomain(), true);
            this.isSendAMDCEnable = false;
        }
    }

    private void restore() {
        StrategyConfig strategyConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13986015", new Object[]{this});
            return;
        }
        ALog.i(TAG, "restore", null, new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        final boolean isAmdcParcelableEnable = AwcnConfig.isAmdcParcelableEnable();
        final StrategyFileStatistic strategyFileStatistic = new StrategyFileStatistic(1, isAmdcParcelableEnable);
        if (!AwcnConfig.isAsyncLoadStrategyEnable()) {
            if (isAmdcParcelableEnable) {
                strategyConfig = createStrategyConfig(NEW_CONFIG_FILE, null);
            } else {
                strategyConfig = (StrategyConfig) StrategySerializeHelper.restore(CONFIG_FILE, null);
            }
            this.strategyConfig = strategyConfig;
            if (this.strategyConfig != null) {
                this.strategyConfig.checkInit();
                this.strategyConfig.setHolder(this);
            }
            loadUniqueId();
            String str = this.uniqueId;
            if (!TextUtils.isEmpty(str)) {
                ALog.e(TAG, "[amdc_file] restore loadFile 1, filename= " + str, null, new Object[0]);
                loadFile(str, true);
            }
        }
        final long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        AmdcThreadPoolExecutor.submitTask(new Runnable() { // from class: anet.channel.strategy.StrategyInfoHolder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                String str2;
                StrategyConfig strategyConfig2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ALog.i(StrategyInfoHolder.TAG, "start loading strategy files", null, new Object[0]);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (AwcnConfig.isAsyncLoadStrategyEnable()) {
                        ALog.i(StrategyInfoHolder.TAG, "load strategy async", null, new Object[0]);
                        if (isAmdcParcelableEnable) {
                            strategyConfig2 = StrategyInfoHolder.this.createStrategyConfig(StrategyInfoHolder.NEW_CONFIG_FILE, null);
                        } else {
                            strategyConfig2 = (StrategyConfig) StrategySerializeHelper.restore(StrategyInfoHolder.CONFIG_FILE, null);
                        }
                        if (strategyConfig2 != null) {
                            strategyConfig2.checkInit();
                            strategyConfig2.setHolder(StrategyInfoHolder.this);
                            synchronized (StrategyInfoHolder.this) {
                                StrategyInfoHolder.this.strategyConfig = strategyConfig2;
                            }
                        }
                        StrategyInfoHolder.access$000(StrategyInfoHolder.this);
                        String access$100 = StrategyInfoHolder.access$100(StrategyInfoHolder.this);
                        if (!TextUtils.isEmpty(access$100)) {
                            ALog.e(StrategyInfoHolder.TAG, "[amdc_file] restore loadFile 2, filename= " + access$100, null, new Object[0]);
                            StrategyInfoHolder.this.loadFile(access$100, true);
                        }
                    }
                    File[] sortedFiles = StrategySerializeHelper.getSortedFiles();
                    if (sortedFiles != null) {
                        int i = 0;
                        for (int i2 = 0; i2 < sortedFiles.length && i < 2; i2++) {
                            File file = sortedFiles[i2];
                            if (!file.isDirectory()) {
                                String name = file.getName();
                                if (isAmdcParcelableEnable) {
                                    str2 = StrategyInfoHolder.NEW_CONFIG_FILE;
                                } else {
                                    str2 = StrategyInfoHolder.CONFIG_FILE;
                                }
                                if (!name.equals(StrategyInfoHolder.access$100(StrategyInfoHolder.this)) && !name.startsWith(str2)) {
                                    ALog.e(StrategyInfoHolder.TAG, "[amdc_file] restore loadFile 3, filename= " + name, null, new Object[0]);
                                    StrategyInfoHolder.this.loadFile(name, false);
                                    i++;
                                }
                            }
                        }
                        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                        StrategyFileStatistic strategyFileStatistic2 = strategyFileStatistic;
                        long j = currentTimeMillis2;
                        if (j >= 0 && j < Long.MAX_VALUE) {
                            currentTimeMillis4 += j;
                        }
                        strategyFileStatistic2.costTime = currentTimeMillis4;
                        AppMonitor.getInstance().commitStat(strategyFileStatistic);
                        ALog.e(StrategyInfoHolder.TAG, "[amdc_file] end loading strategy files", null, AmnetMonitorLoggerListener.LogModel.IS_SFC, strategyFileStatistic.toString());
                    }
                } catch (Throwable th) {
                    ALog.e(StrategyInfoHolder.TAG, "[amdc_file] restore fail!", null, "e", th);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r8 != null) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        r8.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r8 == null) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anet.channel.strategy.StrategyConfig createStrategyConfig(java.lang.String r8, anet.channel.statist.StrategyStatObject r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = anet.channel.strategy.StrategyInfoHolder.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "4dfc1552"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r7
            r5[r1] = r8
            r5[r0] = r9
            java.lang.Object r8 = r3.ipc$dispatch(r4, r5)
            anet.channel.strategy.StrategyConfig r8 = (anet.channel.strategy.StrategyConfig) r8
            return r8
        L_0x001b:
            r3 = 0
            android.os.Parcel r8 = anet.channel.strategy.StrategySerializeHelper.restoreParcelable(r8, r9)     // Catch: all -> 0x0034
            if (r8 == 0) goto L_0x002e
            android.os.Parcelable$Creator<anet.channel.strategy.StrategyConfig> r4 = anet.channel.strategy.StrategyConfig.CREATOR     // Catch: all -> 0x002c
            java.lang.Object r4 = r4.createFromParcel(r8)     // Catch: all -> 0x002c
            anet.channel.strategy.StrategyConfig r4 = (anet.channel.strategy.StrategyConfig) r4     // Catch: all -> 0x002c
            r3 = r4
            goto L_0x002e
        L_0x002c:
            r4 = move-exception
            goto L_0x0036
        L_0x002e:
            if (r8 == 0) goto L_0x0054
        L_0x0030:
            r8.recycle()
            goto L_0x0054
        L_0x0034:
            r4 = move-exception
            r8 = r3
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            java.lang.String r5 = "createStrategyConfig"
            r9.appendErrorTrace(r5, r4)     // Catch: all -> 0x003f
            goto L_0x0041
        L_0x003f:
            r9 = move-exception
            goto L_0x0055
        L_0x0041:
            java.lang.String r9 = "awcn.StrategyInfoHolder"
            java.lang.String r5 = "[new][amdc_file] createStrategyConfig fail."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x003f
            java.lang.String r6 = "error"
            r0[r2] = r6     // Catch: all -> 0x003f
            r0[r1] = r4     // Catch: all -> 0x003f
            anet.channel.util.ALog.e(r9, r5, r3, r0)     // Catch: all -> 0x003f
            if (r8 == 0) goto L_0x0054
            goto L_0x0030
        L_0x0054:
            return r3
        L_0x0055:
            if (r8 == 0) goto L_0x005a
            r8.recycle()
        L_0x005a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyInfoHolder.createStrategyConfig(java.lang.String, anet.channel.statist.StrategyStatObject):anet.channel.strategy.StrategyConfig");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r8 != null) goto L_0x0030;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        r8.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r8 == null) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public anet.channel.strategy.StrategyTable createStrategyTable(java.lang.String r8, anet.channel.statist.StrategyStatObject r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = anet.channel.strategy.StrategyInfoHolder.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "14e6a866"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r7
            r5[r1] = r8
            r5[r0] = r9
            java.lang.Object r8 = r3.ipc$dispatch(r4, r5)
            anet.channel.strategy.StrategyTable r8 = (anet.channel.strategy.StrategyTable) r8
            return r8
        L_0x001b:
            r3 = 0
            android.os.Parcel r8 = anet.channel.strategy.StrategySerializeHelper.restoreParcelable(r8, r9)     // Catch: all -> 0x0034
            if (r8 == 0) goto L_0x002e
            android.os.Parcelable$Creator<anet.channel.strategy.StrategyTable> r4 = anet.channel.strategy.StrategyTable.CREATOR     // Catch: all -> 0x002c
            java.lang.Object r4 = r4.createFromParcel(r8)     // Catch: all -> 0x002c
            anet.channel.strategy.StrategyTable r4 = (anet.channel.strategy.StrategyTable) r4     // Catch: all -> 0x002c
            r3 = r4
            goto L_0x002e
        L_0x002c:
            r4 = move-exception
            goto L_0x0036
        L_0x002e:
            if (r8 == 0) goto L_0x0054
        L_0x0030:
            r8.recycle()
            goto L_0x0054
        L_0x0034:
            r4 = move-exception
            r8 = r3
        L_0x0036:
            if (r9 == 0) goto L_0x0041
            java.lang.String r5 = "createStrategyTable"
            r9.appendErrorTrace(r5, r4)     // Catch: all -> 0x003f
            goto L_0x0041
        L_0x003f:
            r9 = move-exception
            goto L_0x0055
        L_0x0041:
            java.lang.String r9 = "awcn.StrategyInfoHolder"
            java.lang.String r5 = "[new][amdc_file] createStrategyTable fail."
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x003f
            java.lang.String r6 = "error"
            r0[r2] = r6     // Catch: all -> 0x003f
            r0[r1] = r4     // Catch: all -> 0x003f
            anet.channel.util.ALog.e(r9, r5, r3, r0)     // Catch: all -> 0x003f
            if (r8 == 0) goto L_0x0054
            goto L_0x0030
        L_0x0054:
            return r3
        L_0x0055:
            if (r8 == 0) goto L_0x005a
            r8.recycle()
        L_0x005a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyInfoHolder.createStrategyTable(java.lang.String, anet.channel.statist.StrategyStatObject):anet.channel.strategy.StrategyTable");
    }

    public void updateUniqueId(String str, String str2) {
        boolean z;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4e51d0", new Object[]{this, str, str2});
        } else if (AwcnConfig.isVpnOptOpened()) {
            String str3 = NetworkStatusHelper.getMcc() + this.currentNetworkStatus.getType() + ".";
            if (str != null && !str.isEmpty()) {
                if (str.lastIndexOf("_") != -1) {
                    str3 = str3 + str.substring(0, lastIndexOf);
                }
            } else if (str2 == null || str2.isEmpty()) {
                str3 = str3 + "default";
            } else {
                if (strategyClientIpMap == null) {
                    strategyClientIpMap = new ConcurrentHashMap();
                }
                String str4 = strategyClientIpMap.get(str2);
                if (str4 == null || str4.isEmpty()) {
                    str4 = StringUtils.md5ToHex(str2);
                    strategyClientIpMap.put(str2, str3 + str4);
                    ALog.e(TAG, "[amdc_file] parseAccessPointClientIp, clientIpMd5Str not exist!!! put clientIp= ".concat(str2), null, "m5(clientIp)", str4);
                } else {
                    ALog.e(TAG, "[amdc_file] parseAccessPointClientIp, clientIpMd5Str exist!!! clientIp= ".concat(str2), null, "m5(clientIp)", str4);
                }
                str3 = str3 + str4;
                z = true;
                if (!z && str3 != null && !str3.equals(this.uniqueId)) {
                    this.uniqueId = str3;
                    synchronized (this.strategyTableMap) {
                        try {
                            if (!this.strategyTableMap.containsKey(this.uniqueId)) {
                                ALog.e(TAG, "[amdc_file] updateUniqueId loadFile 2, filename= " + this.uniqueId, null, new Object[0]);
                                loadFile(this.uniqueId, true);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            }
            z = false;
            if (!z) {
            }
        } else if (this.currentNetworkStatus.isWifi()) {
            String str5 = "WIFI$" + str;
            if (TextUtils.isEmpty(str)) {
                str5 = this.defaultUniqueId;
            }
            if (!str5.equals(this.uniqueId)) {
                ALog.i(TAG, "update uniqueId old uniqueId :" + this.uniqueId, str5, new Object[0]);
                this.uniqueId = str5;
                String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
                if (!TextUtils.isEmpty(wifiBSSID) && !DEFAULT_BSSID.equals(wifiBSSID) && !this.uniqueId.equals(this.defaultUniqueId)) {
                    this.strategyConfig.updateBssidUniqueIdMap(StringUtils.md5ToHex(wifiBSSID), this.uniqueId);
                }
                synchronized (this.strategyTableMap) {
                    try {
                        if (!this.strategyTableMap.containsKey(this.uniqueId)) {
                            ALog.e(TAG, "[amdc_file] updateUniqueId loadFile 1, filename= " + this.uniqueId, null, new Object[0]);
                            loadFile(this.uniqueId, true);
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public synchronized void saveData(StrategyTable strategyTable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c67b5", new Object[]{this, strategyTable});
            return;
        }
        if (strategyTable.isChanged) {
            StrategyStatObject strategyStatObject = new StrategyStatObject(1);
            boolean isAmdcParcelableEnable = AwcnConfig.isAmdcParcelableEnable();
            strategyStatObject.strategyType = isAmdcParcelableEnable ? 1 : 0;
            String str = strategyTable.uniqueId;
            strategyStatObject.writeStrategyFileId = str;
            StrategySerializeHelper.persist(strategyTable, str, strategyStatObject);
            strategyTable.isChanged = false;
            strategyTable.lastModified = System.currentTimeMillis();
            if (isAmdcParcelableEnable) {
                StrategySerializeHelper.persistParcelable(this.strategyConfig.createSelf(), NEW_CONFIG_FILE, null);
            } else {
                StrategySerializeHelper.persist(this.strategyConfig.createSelf(), CONFIG_FILE, null);
            }
        }
    }
}
