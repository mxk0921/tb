package anet.channel.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.statist.StrategyStatistic;
import anet.channel.strategy.StrategyCollection;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import tb.hxj;
import tb.t2o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyTable implements Serializable, Parcelable {
    private static final long FRESH_TTL = 30000;
    private static final int MAX_HOST_COUNT_IN_ONCE_UPDATE = 40;
    private static final int MAX_HOST_SIZE = 256;
    public static final int PARCELABLE_VERSION_ONE = 1;
    private static final String TAG = "awcn.StrategyTable";
    private static final long serialVersionUID = 6044722613437834958L;
    protected volatile String clientIp;
    private volatile transient int configVersion;
    private HostLruCache hostStrategyMap;
    protected transient boolean isChanged;
    protected volatile long lastModified;
    protected String uniqueId;
    protected static Comparator<StrategyCollection> comparator = new Comparator<StrategyCollection>() { // from class: anet.channel.strategy.StrategyTable.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff11fca1", new Object[]{this, strategyCollection, strategyCollection2})).intValue();
            }
            if (strategyCollection.ttl != strategyCollection2.ttl) {
                return strategyCollection.ttl - strategyCollection2.ttl > 0 ? 1 : -1;
            }
            return strategyCollection.host.compareTo(strategyCollection2.host);
        }
    };
    public static final Parcelable.Creator<StrategyTable> CREATOR = new Parcelable.Creator<StrategyTable>() { // from class: anet.channel.strategy.StrategyTable.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyTable createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyTable) ipChange.ipc$dispatch("93c4fa6a", new Object[]{this, parcel}) : new StrategyTable(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyTable[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyTable[]) ipChange.ipc$dispatch("bbc9dd21", new Object[]{this, new Integer(i)}) : new StrategyTable[i];
        }
    };

    static {
        t2o.a(607125885);
    }

    public StrategyTable(Parcel parcel) {
        this.lastModified = 0L;
        this.isChanged = false;
        int readInt = parcel.readInt();
        if (readInt == 1) {
            this.uniqueId = parcel.readString();
            this.clientIp = parcel.readString();
            this.lastModified = parcel.readLong();
            if (this.hostStrategyMap == null) {
                this.hostStrategyMap = GlobalAppRuntimeInfo.isChannelProcess() ? new HostLruCache(128) : new HostLruCache(256);
            }
            parcel.readMap(this.hostStrategyMap, StrategyCollection.class.getClassLoader());
            return;
        }
        throw new IllegalArgumentException("StrategyTable Unsupported Parcelable version: " + readInt);
    }

    private void fillUpdateHosts(Set<String> set) {
        TreeSet treeSet = new TreeSet(comparator);
        synchronized (this.hostStrategyMap) {
            treeSet.addAll(this.hostStrategyMap.values());
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            StrategyCollection strategyCollection = (StrategyCollection) it.next();
            if (strategyCollection.isExpired() && set.size() < 40) {
                if (strategyCollection.isAllowUpdate(false)) {
                    strategyCollection.ttl = 30000 + currentTimeMillis;
                    set.add(strategyCollection.host);
                }
            } else {
                return;
            }
        }
    }

    private void initStrategy() {
        if (HttpDispatcher.getInstance().isInitHostsChanged(this.uniqueId)) {
            for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                ALog.e(TAG, "[strategy opt] initStrategy, new sc", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, hxj.UNIQID, this.uniqueId);
                this.hostStrategyMap.put(str, new StrategyCollection(str));
            }
        }
    }

    private void sendAmdcRequest(String str) {
        sendAmdcRequest(false, str);
    }

    public void clearStrategy() {
        try {
            synchronized (this.hostStrategyMap) {
                Iterator<Map.Entry<String, StrategyCollection>> it = this.hostStrategyMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, StrategyCollection> next = it.next();
                    String key = next.getKey();
                    StrategyCollection value = next.getValue();
                    if (value != null && !DispatchConstants.isAmdcServerChannelDomain(key)) {
                        if (value.isExpiredStrategy()) {
                            if (!value.isFixed) {
                                ALog.e(TAG, "[channel process] clearStrategy，hostStrategyMap remove host=" + key, null, new Object[0]);
                                it.remove();
                                this.isChanged = true;
                            }
                        } else if (value.clearStrategy()) {
                            this.isChanged = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "[channel process] clearStrategy，error=" + e.toString(), null, new Object[0]);
        }
    }

    public void commitStrategyMonitor(StrategyStatistic strategyStatistic) {
        if (strategyStatistic != null) {
            strategyStatistic.hostStrategyMapSize = this.hostStrategyMap.size();
            for (Map.Entry<String, StrategyCollection> entry : this.hostStrategyMap.entrySet()) {
                entry.getValue().commitStrategyMonitor(strategyStatistic);
            }
            strategyStatistic.hour = Math.ceil((((System.currentTimeMillis() - GlobalAppRuntimeInfo.getInitTime()) / 1000) * 1.0d) / 3600.0d);
            ALog.e(TAG, "[StrategyStatistic] commitStrategyMonitor =" + strategyStatistic.toString(), null, new Object[0]);
            AppMonitor.getInstance().commitStat(strategyStatistic);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean getAbStrategyStatusByHost(String str, String str2) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        synchronized (this.hostStrategyMap) {
            strategyCollection = this.hostStrategyMap.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0) {
            sendAmdcRequest(str);
        }
        if (strategyCollection != null) {
            return strategyCollection.getAbStrategyStatus(str2);
        }
        return false;
    }

    public String getCnameByHost(String str) {
        return getCnameByHost(str, false);
    }

    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyCollection strategyCollection;
        if (ALog.isPrintLog(1)) {
            ALog.d(TAG, "[notifyConnEvent]", null, HttpConstant.HOST, str, "IConnStrategy", iConnStrategy, "ConnEvent", connEvent);
        }
        synchronized (this.hostStrategyMap) {
            strategyCollection = this.hostStrategyMap.get(str);
        }
        if (strategyCollection != null) {
            ConnType valueOf = ConnType.valueOf(iConnStrategy.getProtocol());
            if (!GlobalAppRuntimeInfo.isAppBackground() || valueOf == null || !valueOf.isHTTP3() || connEvent.isSuccess) {
                strategyCollection.notifyConnEvent(iConnStrategy, connEvent);
            }
        }
    }

    public void parseStrategyData() {
        try {
            HostLruCache hostLruCache = this.hostStrategyMap;
            if (hostLruCache != null) {
                for (Map.Entry<String, StrategyCollection> entry : hostLruCache.entrySet()) {
                    StrategyCollection value = entry.getValue();
                    if (value != null && value.parseStrategyData()) {
                        this.isChanged = true;
                    }
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "parseStrategyData error !", null, e, new Object[0]);
        }
    }

    public List<IConnStrategy> queryByHost(String str) {
        return queryByHost(str, false);
    }

    public void update(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        ALog.e(TAG, "update strategyTable with httpDns response", this.uniqueId, new Object[0]);
        try {
            if (!TextUtils.isEmpty(httpDnsResponse.clientIp) && !httpDnsResponse.clientIp.equalsIgnoreCase(this.clientIp)) {
                AnalysisFactory.getV3Instance().recordAppStatus("Client_IP", httpDnsResponse.clientIp);
            }
            this.clientIp = httpDnsResponse.clientIp;
            if (Inet64Util.isIPv4OnlyNetwork() && Utils.isIPV6Address(this.clientIp)) {
                Inet64Util.updateIpStackNetwork(3);
                ALog.e(TAG, "[IpStackOpt] ipv4->6：clientIp=" + this.clientIp, null, new Object[0]);
            }
            if (Inet64Util.isIPv6OnlyNetwork() && Utils.isIPV4Address(this.clientIp)) {
                Inet64Util.updateIpStackNetwork(3);
                ALog.e(TAG, "[IpStackOpt] ipv6->4：clientIp=" + this.clientIp, null, new Object[0]);
            }
            this.configVersion = httpDnsResponse.configVersion;
            updateDns(httpDnsResponse);
        } catch (Throwable th) {
            ALog.e(TAG, "fail to update strategyTable", this.uniqueId, th, new Object[0]);
        }
        this.isChanged = true;
        if (ALog.isPrintLog(1)) {
            StringBuilder sb = new StringBuilder("uniqueId : ");
            sb.append(this.uniqueId);
            sb.append("\n-------------------------domains:------------------------------------");
            ALog.d(TAG, sb.toString(), null, new Object[0]);
            synchronized (this.hostStrategyMap) {
                try {
                    for (Map.Entry<String, StrategyCollection> entry : this.hostStrategyMap.entrySet()) {
                        sb.setLength(0);
                        sb.append(entry.getKey());
                        sb.append(" = ");
                        sb.append(entry.getValue().toString());
                        ALog.e(TAG, sb.toString(), null, new Object[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeString(this.uniqueId);
        parcel.writeString(this.clientIp);
        parcel.writeLong(this.lastModified);
        parcel.writeMap(this.hostStrategyMap);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class HostLruCache extends SerialLruCache<String, StrategyCollection> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = -4001655685948369525L;

        static {
            t2o.a(607125888);
        }

        public HostLruCache(int i) {
            super(i);
        }

        public static /* synthetic */ Object ipc$super(HostLruCache hostLruCache, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/strategy/StrategyTable$HostLruCache");
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyCollection> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d28ca266", new Object[]{this, entry})).booleanValue();
            }
            if (!entry.getValue().isFixed) {
                return true;
            }
            Iterator<Map.Entry<String, StrategyCollection>> it = entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!it.next().getValue().isFixed) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            return false;
        }
    }

    private void checkInitHost() {
        TreeSet treeSet;
        try {
            if (HttpDispatcher.getInstance().isInitHostsChanged(this.uniqueId)) {
                synchronized (this.hostStrategyMap) {
                    treeSet = null;
                    for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                        if (!this.hostStrategyMap.containsKey(str)) {
                            ALog.e(TAG, "[strategy opt] initStrategy, new sc", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, hxj.UNIQID, this.uniqueId);
                            this.hostStrategyMap.put(str, new StrategyCollection(str));
                            if (treeSet == null) {
                                treeSet = new TreeSet();
                            }
                            treeSet.add(str);
                        }
                    }
                }
                if (treeSet != null) {
                    sendAmdcRequest(treeSet);
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "checkInitHost failed", this.uniqueId, e, new Object[0]);
        }
    }

    public void checkInit() {
        int i = 0;
        if (this.hostStrategyMap == null) {
            if (GlobalAppRuntimeInfo.isChannelProcess()) {
                this.hostStrategyMap = new HostLruCache(128);
            } else {
                this.hostStrategyMap = new HostLruCache(256);
            }
            initStrategy();
        }
        for (StrategyCollection strategyCollection : this.hostStrategyMap.values()) {
            strategyCollection.checkInit();
        }
        ALog.i(TAG, "strategy map", null, "size", Integer.valueOf(this.hostStrategyMap.size()));
        if (!GlobalAppRuntimeInfo.isTargetProcess()) {
            i = -1;
        }
        this.configVersion = i;
    }

    public String getCnameByHost(String str, boolean z) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.hostStrategyMap) {
            strategyCollection = this.hostStrategyMap.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0) {
            sendAmdcRequest(z, str);
        }
        if (strategyCollection != null) {
            return strategyCollection.cname;
        }
        return null;
    }

    public List<IConnStrategy> queryByHost(String str, boolean z) {
        StrategyCollection strategyCollection;
        StrategyCollection.StrategyTypeStat expireType;
        boolean z2;
        boolean z3;
        if (TextUtils.isEmpty(str) || !Utils.checkHostValidAndNotIp(str)) {
            ALog.e(TAG, "[strategy opt] queryByHost, host null or valid or not ip", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, hxj.UNIQID, this.uniqueId);
            return Collections.EMPTY_LIST;
        }
        checkInitHost();
        synchronized (this.hostStrategyMap) {
            try {
                strategyCollection = this.hostStrategyMap.get(str);
                if (strategyCollection == null) {
                    strategyCollection = new StrategyCollection(str);
                    ALog.e(TAG, "[strategy opt] queryByHost, sc null", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, hxj.UNIQID, this.uniqueId);
                    this.hostStrategyMap.put(str, strategyCollection);
                }
            } finally {
            }
        }
        if (strategyCollection.ttl == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
            sendAmdcRequest(z, str);
        }
        synchronized (this.hostStrategyMap) {
            try {
                expireType = strategyCollection.getExpireType(" queryByHost ", this.lastModified);
                if (!AwcnConfig.isCancelHardExpiryEnable()) {
                    z3 = AwcnConfig.isAmdcStrategyUpdateEnable() && expireType != null && expireType.strategyClear == StrategyCollection.StrategyClear.YES;
                    if (!AwcnConfig.isAmdcStrategyUpdateEnable() && expireType != null && expireType.strategyValid == StrategyCollection.StrategyValid.INVALID) {
                        z2 = true;
                        if (!z3 || z2) {
                            strategyCollection = new StrategyCollection(str, strategyCollection.ttl);
                            this.hostStrategyMap.put(str, strategyCollection);
                            ALog.e(TAG, "[cancel hard expiry][strategy opt] queryByHost, clear strategy!", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, "isScNull", false, "strategyType", expireType.strategyType, "strategyValid", expireType.strategyValid, hxj.UNIQID, this.uniqueId, "isAmdcStrategyUpdateEnable", Boolean.valueOf(AwcnConfig.isAmdcStrategyUpdateEnable()), "isClearStrategy1", Boolean.valueOf(z3), "isClearStrategy2", Boolean.valueOf(z2), "isCancelHardExpiry", Boolean.valueOf(AwcnConfig.isCancelHardExpiryEnable()));
                        }
                    }
                } else {
                    z3 = false;
                }
                z2 = false;
                if (!z3) {
                }
                strategyCollection = new StrategyCollection(str, strategyCollection.ttl);
                this.hostStrategyMap.put(str, strategyCollection);
                ALog.e(TAG, "[cancel hard expiry][strategy opt] queryByHost, clear strategy!", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, "isScNull", false, "strategyType", expireType.strategyType, "strategyValid", expireType.strategyValid, hxj.UNIQID, this.uniqueId, "isAmdcStrategyUpdateEnable", Boolean.valueOf(AwcnConfig.isAmdcStrategyUpdateEnable()), "isClearStrategy1", Boolean.valueOf(z3), "isClearStrategy2", Boolean.valueOf(z2), "isCancelHardExpiry", Boolean.valueOf(AwcnConfig.isCancelHardExpiryEnable()));
            } finally {
            }
        }
        return strategyCollection.queryStrategyList(str, z, this.uniqueId, expireType);
    }

    public void sendAmdcRequest(boolean z, String str) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        sendAmdcRequest(z, treeSet);
    }

    public void sendAmdcRequest(String str, boolean z) {
        sendAmdcRequest(false, str, z);
    }

    public void sendAmdcRequest(boolean z, String str, boolean z2) {
        StrategyCollection strategyCollection;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.hostStrategyMap) {
                try {
                    strategyCollection = this.hostStrategyMap.get(str);
                    if (strategyCollection == null) {
                        ALog.e(TAG, "[strategy opt] sendAmdcRequest, sc null", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, hxj.UNIQID, this.uniqueId);
                        strategyCollection = new StrategyCollection(str);
                        this.hostStrategyMap.put(str, strategyCollection);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2 || strategyCollection.ttl == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
                sendAmdcRequest(z, str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
        r14 = r2.ttl;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateDns(anet.channel.strategy.StrategyResultParser.HttpDnsResponse r24) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyTable.updateDns(anet.channel.strategy.StrategyResultParser$HttpDnsResponse):void");
    }

    public StrategyTable(String str) {
        this.lastModified = 0L;
        this.isChanged = false;
        this.uniqueId = str;
        checkInit();
    }

    public void sendAmdcRequest(Set<String> set) {
        sendAmdcRequest(false, set, HttpDispatcher.AmdcConditionType.DEFAULT_AMDC.ordinal(), false, false);
    }

    public void sendAmdcRequest(Set<String> set, int i, boolean z, boolean z2) {
        sendAmdcRequest(false, set, i, z, z2);
    }

    public void sendAmdcRequest(Set<String> set, boolean z, boolean z2) {
        sendAmdcRequest(false, set, HttpDispatcher.AmdcConditionType.DEFAULT_AMDC.ordinal(), z, z2);
    }

    private void sendAmdcRequest(boolean z, Set<String> set) {
        sendAmdcRequest(z, set, HttpDispatcher.AmdcConditionType.DEFAULT_AMDC.ordinal(), false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void sendAmdcRequest(boolean r17, java.util.Set<java.lang.String> r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyTable.sendAmdcRequest(boolean, java.util.Set, int, boolean, boolean):void");
    }
}
