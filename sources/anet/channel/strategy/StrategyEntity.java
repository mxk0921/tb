package anet.channel.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ConnType;
import anet.channel.statist.AmdcResultStat;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import tb.lca;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyEntity implements Serializable, Parcelable {
    public static final Parcelable.Creator<StrategyEntity> CREATOR = new Parcelable.Creator<StrategyEntity>() { // from class: anet.channel.strategy.StrategyEntity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyEntity createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyEntity) ipChange.ipc$dispatch("e288641b", new Object[]{this, parcel}) : new StrategyEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyEntity[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyEntity[]) ipChange.ipc$dispatch("bb1fd844", new Object[]{this, new Integer(i)}) : new StrategyEntity[i];
        }
    };
    private static final String TAG = "awcn.StrategyEntity";
    private static final long serialVersionUID = 5740869364580937958L;
    private transient AmdcResultStat amdcResultStat;
    private boolean containsStaticIp;
    private transient Comparator<IPConnStrategy> defaultComparator;
    private Map<Integer, ConnHistoryItem> historyItemMap;
    private List<IPConnStrategy> ipStrategyList;
    protected transient boolean isChanged;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface Predicate<T> {
        boolean apply(T t);
    }

    static {
        t2o.a(607125857);
    }

    public StrategyEntity() {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.defaultComparator = null;
        this.amdcResultStat = new AmdcResultStat();
        this.isChanged = false;
    }

    private List<ProxyStrategy> convertProxyStrategy(StrategyResultParser.ProxyServer[] proxyServerArr) {
        StrategyResultParser.ProxyServer[] proxyServerArr2 = proxyServerArr;
        if (proxyServerArr2 == null || proxyServerArr2.length <= 0) {
            return Collections.EMPTY_LIST;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = proxyServerArr2.length;
            int i = 0;
            while (i < length) {
                StrategyResultParser.Channel[] channelArr = proxyServerArr2[i].proxyChannel;
                if (channelArr != null && channelArr.length > 0) {
                    for (StrategyResultParser.Channel channel : channelArr) {
                        String[] strArr = channel.ips;
                        StrategyResultParser.ChannelAttribute[] channelAttributeArr = channel.attributes;
                        if (!(channelAttributeArr == null || channelAttributeArr.length == 0 || strArr == null || strArr.length == 0)) {
                            for (StrategyResultParser.ChannelAttribute channelAttribute : channelAttributeArr) {
                                if (channelAttribute != null && !TextUtils.isEmpty(channelAttribute.protocol)) {
                                    for (String str : strArr) {
                                        if (!TextUtils.isEmpty(str)) {
                                            arrayList.add(ProxyStrategy.create(str, channelAttribute.port, channelAttribute.protocol));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i++;
                proxyServerArr2 = proxyServerArr;
            }
            return arrayList;
        } catch (Exception unused) {
            ALog.e(TAG, "[convertProxyStrategy]error", null, new Object[0]);
            return Collections.EMPTY_LIST;
        }
    }

    private static <T> int find(Collection<T> collection, Predicate<T> predicate) {
        if (collection == null) {
            return -1;
        }
        Iterator<T> it = collection.iterator();
        int i = 0;
        while (it.hasNext() && !predicate.apply(it.next())) {
            i++;
        }
        if (i == collection.size()) {
            return -1;
        }
        return i;
    }

    private void handleUpdate(final String str, int i, final StrategyResultParser.ChannelAttribute channelAttribute, StrategyResultParser.ProxyServer[] proxyServerArr) {
        final ConnProtocol valueOf = ConnProtocol.valueOf(channelAttribute);
        final List<ProxyStrategy> convertProxyStrategy = convertProxyStrategy(proxyServerArr);
        int find = find(this.ipStrategyList, new Predicate<IPConnStrategy>() { // from class: anet.channel.strategy.StrategyEntity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public boolean apply(IPConnStrategy iPConnStrategy) {
                List list;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("a49d31a5", new Object[]{this, iPConnStrategy})).booleanValue();
                }
                boolean z = iPConnStrategy.getPort() == channelAttribute.port && iPConnStrategy.getIp().equals(str) && iPConnStrategy.protocol.equals(valueOf);
                if (iPConnStrategy.proxyStrategies == null || iPConnStrategy.proxyStrategies.isEmpty() ? !(!z || ((list = convertProxyStrategy) != null && !list.isEmpty())) : !(!z || !iPConnStrategy.proxyStrategies.equals(convertProxyStrategy))) {
                    if (iPConnStrategy.supportMultiPath == iPConnStrategy.supportMultiPath) {
                        return true;
                    }
                }
                return false;
            }
        });
        if (find != -1) {
            IPConnStrategy iPConnStrategy = this.ipStrategyList.get(find);
            iPConnStrategy.cto = channelAttribute.cto;
            iPConnStrategy.rto = channelAttribute.rto;
            iPConnStrategy.heartbeat = channelAttribute.heartbeat;
            iPConnStrategy.ipType = i;
            iPConnStrategy.ipSource = 0;
            iPConnStrategy.isToRemove = false;
            iPConnStrategy.proxyStrategies = convertProxyStrategy;
            iPConnStrategy.supportMultiPath = channelAttribute.supportMultiPath;
            iPConnStrategy.unit = channelAttribute.unit;
            iPConnStrategy.accessPoint = channelAttribute.accessPoint;
            if (!this.historyItemMap.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.historyItemMap.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
            if (iPConnStrategy.commonInfo != null) {
                iPConnStrategy.commonInfo.remove("isStrategyInvalid");
                return;
            }
            return;
        }
        IPConnStrategy create = IPConnStrategy.create(str, channelAttribute);
        if (create != null) {
            create.ipType = i;
            create.ipSource = 0;
            create.proxyStrategies = convertProxyStrategy;
            create.supportMultiPath = channelAttribute.supportMultiPath;
            if (!this.historyItemMap.containsKey(Integer.valueOf(create.getUniqueId()))) {
                this.historyItemMap.put(Integer.valueOf(create.getUniqueId()), new ConnHistoryItem());
            }
            create.unit = channelAttribute.unit;
            create.accessPoint = channelAttribute.accessPoint;
            this.ipStrategyList.add(create);
        }
        if (Utils.isIPV6Address(str)) {
            this.amdcResultStat.isContainIpv6 = true;
        }
        if (ConnType.HTTP3.equals(valueOf.protocol) || ConnType.HTTP3_PLAIN.equals(valueOf.protocol)) {
            this.amdcResultStat.isContainHttp3 = true;
        }
    }

    public void checkInit() {
        if (this.ipStrategyList == null) {
            this.ipStrategyList = new ArrayList();
        }
        if (this.historyItemMap == null) {
            this.historyItemMap = new SerialLruCache(40);
        }
        Iterator<Map.Entry<Integer, ConnHistoryItem>> it = this.historyItemMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().isExpire()) {
                it.remove();
            }
        }
        for (IPConnStrategy iPConnStrategy : this.ipStrategyList) {
            if (!this.historyItemMap.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.historyItemMap.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
        }
        Collections.sort(this.ipStrategyList, getDefaultComparator());
    }

    public synchronized boolean clearStrategy(StrategyList strategyList) {
        ALog.e(TAG, "[channel process] clearStrategy", null, new Object[0]);
        this.isChanged = false;
        synchronized (this.ipStrategyList) {
            Iterator<IPConnStrategy> it = this.ipStrategyList.iterator();
            int i = 0;
            while (it.hasNext()) {
                IPConnStrategy next = it.next();
                ConnHistoryItem connHistoryItem = this.historyItemMap.get(Integer.valueOf(next.getUniqueId()));
                if (connHistoryItem != null) {
                    if (connHistoryItem.isUsed() && (!connHistoryItem.isUsed() || connHistoryItem.isExpireStrategy())) {
                        it.remove();
                        this.historyItemMap.remove(Integer.valueOf(next.getUniqueId()));
                        this.isChanged = true;
                        if (strategyList != null) {
                            strategyList.clearIpStrategyList(next);
                        }
                        ALog.e(TAG, "[channel process] clearIpStrategyList 2，remove ipStrategy=" + next.toString(), null, new Object[0]);
                    }
                    i++;
                    if (i > 2) {
                        it.remove();
                        this.historyItemMap.remove(Integer.valueOf(next.getUniqueId()));
                        this.isChanged = true;
                        if (strategyList != null) {
                            strategyList.clearIpStrategyList(next);
                        }
                        ALog.e(TAG, "[channel process] clearIpStrategyList 1，remove ipStrategy=" + next.toString(), null, new Object[0]);
                    }
                }
            }
        }
        return this.isChanged;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Comparator getDefaultComparator() {
        if (this.defaultComparator == null) {
            this.defaultComparator = new Comparator<IPConnStrategy>() { // from class: anet.channel.strategy.StrategyEntity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Number) ipChange.ipc$dispatch("242794b7", new Object[]{this, iPConnStrategy, iPConnStrategy2})).intValue();
                    }
                    ConnHistoryItem connHistoryItem = (ConnHistoryItem) StrategyEntity.this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
                    ConnHistoryItem connHistoryItem2 = (ConnHistoryItem) StrategyEntity.this.historyItemMap.get(Integer.valueOf(iPConnStrategy2.getUniqueId()));
                    if (connHistoryItem == null) {
                        connHistoryItem = new ConnHistoryItem();
                        StrategyEntity.this.historyItemMap.put(Integer.valueOf(iPConnStrategy.getUniqueId()), connHistoryItem);
                    }
                    if (connHistoryItem2 == null) {
                        connHistoryItem2 = new ConnHistoryItem();
                        StrategyEntity.this.historyItemMap.put(Integer.valueOf(iPConnStrategy2.getUniqueId()), connHistoryItem2);
                    }
                    if (AwcnConfig.isReplaceStrategyOpened()) {
                        int countFail = connHistoryItem.countFail();
                        int countFail2 = connHistoryItem2.countFail();
                        if (!GlobalAppRuntimeInfo.isAppBackground()) {
                            Map map = connHistoryItem.fgHistoryItemMap;
                            Map map2 = connHistoryItem2.fgHistoryItemMap;
                            if (map == null) {
                                map = new SerialLruCache(5);
                            }
                            if (map2 == null) {
                                map2 = new SerialLruCache(5);
                            }
                            ConnHistoryItem connHistoryItem3 = (ConnHistoryItem) map.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
                            ConnHistoryItem connHistoryItem4 = (ConnHistoryItem) map2.get(Integer.valueOf(iPConnStrategy2.getUniqueId()));
                            if (connHistoryItem3 == null) {
                                connHistoryItem3 = new ConnHistoryItem();
                                map.put(Integer.valueOf(iPConnStrategy.getUniqueId()), connHistoryItem3);
                            }
                            if (connHistoryItem4 == null) {
                                connHistoryItem4 = new ConnHistoryItem();
                                map2.put(Integer.valueOf(iPConnStrategy2.getUniqueId()), connHistoryItem4);
                            }
                            int countFail3 = connHistoryItem3.countFail();
                            int countFail4 = connHistoryItem4.countFail();
                            ALog.e(StrategyEntity.TAG, "[bg strategy opt][getDefaultComparator]", null, lca.STAGE_T1, iPConnStrategy.toString() + "_sum1= " + countFail + " _fg1= " + countFail3, lca.STAGE_T2, iPConnStrategy2.toString() + "_sum2= " + countFail2 + "_fg2= " + countFail4);
                            countFail = countFail3;
                            countFail2 = countFail4;
                        }
                        if (countFail2 > countFail) {
                            ALog.e(StrategyEntity.TAG, "[Ipv6_H3] [getDefaultComparator]", null, lca.STAGE_T1, iPConnStrategy.toString() + "_" + countFail, lca.STAGE_T2, iPConnStrategy2.toString() + "_" + countFail2);
                            return -1;
                        }
                    } else {
                        int countFail5 = connHistoryItem.countFail();
                        int countFail6 = connHistoryItem2.countFail();
                        if (countFail6 > countFail5) {
                            ALog.e(StrategyEntity.TAG, "[Ipv6_H3] [getDefaultComparator]", null, lca.STAGE_T1, iPConnStrategy.toString() + "_" + countFail5, lca.STAGE_T2, iPConnStrategy2.toString() + "_" + countFail6);
                            return -1;
                        }
                    }
                    if (Inet64Util.getStackType() == 3 && Utils.isIPV4Address(iPConnStrategy2.getIp()) && Utils.isIPV6Address(iPConnStrategy.getIp())) {
                        return -1;
                    }
                    if (!Inet64Util.isHttp3(iPConnStrategy2) && Inet64Util.isHttp3(iPConnStrategy)) {
                        return -1;
                    }
                    if (iPConnStrategy2.ipType == 1 && iPConnStrategy.ipType == 0) {
                        return -1;
                    }
                    return (!Inet64Util.isHttp(iPConnStrategy2) || Inet64Util.isHttp(iPConnStrategy)) ? 0 : -1;
                }
            };
        }
        return this.defaultComparator;
    }

    public Map<Integer, ConnHistoryItem> getHistoryItemMap() {
        return this.historyItemMap;
    }

    public List<IPConnStrategy> getIpStrategyList() {
        return this.ipStrategyList;
    }

    public List<IConnStrategy> getStrategyList() {
        return getStrategyList("", false, "", null);
    }

    public boolean isContainsStaticIp() {
        return this.containsStaticIp;
    }

    public boolean shouldRefresh() {
        boolean z = true;
        boolean z2 = true;
        for (IPConnStrategy iPConnStrategy : this.ipStrategyList) {
            if (!this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())).latestFail()) {
                if (iPConnStrategy.ipType == 0) {
                    z = false;
                }
                z2 = false;
            }
        }
        if ((!this.containsStaticIp || !z) && !z2) {
            return false;
        }
        return true;
    }

    public String toString() {
        return new ArrayList(this.ipStrategyList).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeList(this.ipStrategyList);
        parcel.writeMap(this.historyItemMap);
        parcel.writeInt(this.containsStaticIp ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
        r4 = new java.util.LinkedList();
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<anet.channel.strategy.IConnStrategy> getStrategyList(java.lang.String r20, boolean r21, java.lang.String r22, anet.channel.strategy.StrategyCollection.StrategyTypeStat r23) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.StrategyEntity.getStrategyList(java.lang.String, boolean, java.lang.String, anet.channel.strategy.StrategyCollection$StrategyTypeStat):java.util.List");
    }

    private void updateFgHistoryItem(IPConnStrategy iPConnStrategy, ConnEvent connEvent) {
        Map<Integer, ConnHistoryItem> map;
        if (!AwcnConfig.isReplaceStrategyOpened() || GlobalAppRuntimeInfo.isAppBackground()) {
            ALog.e(TAG, "[fg strategy opt] not allow updateFgHistoryItem!", null, "isReplaceStrategyOpened", Boolean.valueOf(AwcnConfig.isReplaceStrategyOpened()), "isAppBackground", Boolean.valueOf(GlobalAppRuntimeInfo.isAppBackground()));
        } else if (iPConnStrategy == null || connEvent == null || (map = this.historyItemMap) == null) {
            ALog.e(TAG, "[fg strategy opt] updateFgHistoryItem fail!", null, new Object[0]);
        } else {
            ConnHistoryItem connHistoryItem = map.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
            if (connHistoryItem == null) {
                connHistoryItem = new ConnHistoryItem();
            }
            if (connHistoryItem.fgHistoryItemMap == null) {
                connHistoryItem.fgHistoryItemMap = new SerialLruCache(5);
            }
            synchronized (connHistoryItem.fgHistoryItemMap) {
                try {
                    if (connHistoryItem.fgHistoryItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())) == null) {
                        ConnHistoryItem connHistoryItem2 = new ConnHistoryItem();
                        connHistoryItem2.update(connEvent.isSuccess);
                        connHistoryItem.fgHistoryItemMap.put(Integer.valueOf(iPConnStrategy.getUniqueId()), connHistoryItem2);
                    } else {
                        connHistoryItem.fgHistoryItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())).update(connEvent.isSuccess);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ALog.e(TAG, "[fg strategy opt] ", null, "isSuccess", Boolean.valueOf(connEvent.isSuccess));
        }
    }

    public void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        try {
            if ((iConnStrategy instanceof IPConnStrategy) && this.ipStrategyList.indexOf(iConnStrategy) != -1) {
                IPConnStrategy iPConnStrategy = (IPConnStrategy) iConnStrategy;
                if (connEvent.isTunnel && connEvent.useProxyStrategy != null) {
                    ConnHistoryItem connHistoryItem = this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
                    if (connHistoryItem.proxyHistoryItemMap == null) {
                        connHistoryItem.proxyHistoryItemMap = new SerialLruCache(5);
                    }
                    connEvent.useProxyStrategy.status = connEvent.isSuccess ? 1 : 0;
                    connEvent.useProxyStrategy.connHistoryItem.update(connEvent.isSuccess);
                    ConnHistoryItem connHistoryItem2 = connHistoryItem.proxyHistoryItemMap.get(Integer.valueOf(connEvent.useProxyStrategy.hashCode()));
                    synchronized (connHistoryItem.proxyHistoryItemMap) {
                        if (connHistoryItem2 == null) {
                            connHistoryItem.proxyHistoryItemMap.put(Integer.valueOf(connEvent.useProxyStrategy.hashCode()), connEvent.useProxyStrategy.connHistoryItem);
                        }
                    }
                    ALog.e(TAG, "[tunnel_opt]", null, "useProxyStrategy", connEvent.useProxyStrategy, "isSuccess", Boolean.valueOf(connEvent.isSuccess));
                } else if (!AwcnConfig.isWifiUnavailableUseCellOptOpened() || !connEvent.isForceCell) {
                    iPConnStrategy.status = connEvent.isSuccess ? 1 : 0;
                    this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())).update(connEvent.isSuccess);
                    ALog.e(TAG, "[tunnel_opt]", null, "ipConnStrategy", iPConnStrategy, "isSuccess", Boolean.valueOf(connEvent.isSuccess));
                } else {
                    updateForceCellHistoryItem(iPConnStrategy, connEvent);
                }
                updateFgHistoryItem(iPConnStrategy, connEvent);
                Collections.sort(this.ipStrategyList, getDefaultComparator());
            }
        } catch (Exception unused) {
        }
    }

    public void update(StrategyResultParser.Dns dns, String str, String str2) {
        String str3;
        int i;
        int i2;
        for (IPConnStrategy iPConnStrategy : this.ipStrategyList) {
            iPConnStrategy.isToRemove = true;
        }
        ALog.e(TAG, "[strategy opt] update ipStrategyList, isToRemove!", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", dns.host, "ipStrategyList", this.ipStrategyList);
        this.amdcResultStat = new AmdcResultStat();
        int i3 = 0;
        while (true) {
            StrategyResultParser.Server[] serverArr = dns.servers;
            if (i3 >= serverArr.length) {
                break;
            }
            StrategyResultParser.Server server = serverArr[i3];
            boolean z = server.isStaticBgp;
            StrategyResultParser.Channel[] channelArr = server.channels;
            StrategyResultParser.ProxyServer[] proxyServerArr = server.proxies;
            if (channelArr == null || channelArr.length == 0) {
                i2 = 1;
            } else {
                int length = channelArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    StrategyResultParser.Channel channel = channelArr[i4];
                    StrategyResultParser.ChannelAttribute[] channelAttributeArr = channel.attributes;
                    String[] strArr = channel.ips;
                    if (!(channelAttributeArr == null || channelAttributeArr.length == 0 || strArr == null || strArr.length == 0)) {
                        int length2 = channelAttributeArr.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            StrategyResultParser.ChannelAttribute channelAttribute = channelAttributeArr[i5];
                            channelAttribute.unit = dns.unit;
                            channelAttribute.accessPoint = str;
                            channelAttribute.clientIp = str2;
                            int length3 = strArr.length;
                            int i6 = 0;
                            while (i6 < length3) {
                                handleUpdate(strArr[i6], !z ? 1 : 0, channelAttribute, proxyServerArr);
                                i6++;
                                channelAttributeArr = channelAttributeArr;
                                length3 = length3;
                                strArr = strArr;
                            }
                            i5++;
                            channelArr = channelArr;
                            length = length;
                            length2 = length2;
                            strArr = strArr;
                        }
                    }
                }
                i2 = 1;
                if (z) {
                    this.containsStaticIp = true;
                }
            }
            i3 += i2;
        }
        ListIterator<IPConnStrategy> listIterator = this.ipStrategyList.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().isToRemove) {
                listIterator.remove();
            }
        }
        try {
            Collections.sort(this.ipStrategyList, getDefaultComparator());
            ALog.e(TAG, "[strategy opt] update ipStrategyList! ", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", dns.host, "ipStrategyList", this.ipStrategyList);
            i = 0;
            str3 = null;
        } catch (Exception e) {
            this.amdcResultStat.code = -100;
            i = 0;
            str3 = null;
            ALog.e(TAG, "strategy sort error!", null, e, new Object[0]);
        }
        AmdcResultStat amdcResultStat = this.amdcResultStat;
        amdcResultStat.host = dns.host;
        amdcResultStat.trace = TAG;
        ALog.d(TAG, amdcResultStat.toString(), str3, new Object[i]);
        AppMonitor.getInstance().commitStat(this.amdcResultStat);
    }

    public StrategyEntity(List<IPConnStrategy> list) {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.defaultComparator = null;
        this.amdcResultStat = new AmdcResultStat();
        this.isChanged = false;
        this.ipStrategyList = list;
    }

    private void updateForceCellHistoryItem(IPConnStrategy iPConnStrategy, ConnEvent connEvent) {
        if (iPConnStrategy == null || connEvent == null) {
            ALog.e(TAG, "[wifi fg detect opt] updateForceCellHistoryItem fail!", null, new Object[0]);
            return;
        }
        ConnHistoryItem connHistoryItem = this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
        if (connHistoryItem.forceCellHistoryItemMap == null) {
            connHistoryItem.forceCellHistoryItemMap = new SerialLruCache(5);
        }
        if (connHistoryItem.forceCellHistoryItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())) == null) {
            synchronized (connHistoryItem.forceCellHistoryItemMap) {
                ConnHistoryItem connHistoryItem2 = new ConnHistoryItem();
                connHistoryItem2.update(connEvent.isSuccess);
                connHistoryItem.forceCellHistoryItemMap.put(Integer.valueOf(iPConnStrategy.getUniqueId()), connHistoryItem2);
            }
        } else {
            connHistoryItem.forceCellHistoryItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())).update(connEvent.isSuccess);
        }
        ALog.e(TAG, "[wifi fg detect opt] ", null, "isForceCell", Boolean.valueOf(connEvent.isForceCell), "isSuccess", Boolean.valueOf(connEvent.isSuccess));
    }

    public StrategyEntity(List<IPConnStrategy> list, Map<Integer, ConnHistoryItem> map, boolean z) {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.defaultComparator = null;
        this.amdcResultStat = new AmdcResultStat();
        this.isChanged = false;
        this.ipStrategyList = list;
        this.historyItemMap = map;
        this.containsStaticIp = z;
    }

    public StrategyEntity(Parcel parcel) {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        boolean z = false;
        this.containsStaticIp = false;
        this.defaultComparator = null;
        this.amdcResultStat = new AmdcResultStat();
        this.isChanged = false;
        int readInt = parcel.readInt();
        if (readInt == 1) {
            parcel.readList(this.ipStrategyList, IPConnStrategy.class.getClassLoader());
            parcel.readMap(this.historyItemMap, ConnHistoryItem.class.getClassLoader());
            this.containsStaticIp = parcel.readInt() == 1 ? true : z;
            return;
        }
        throw new IllegalArgumentException("StrategyEntity Unsupported Parcelable version: " + readInt);
    }
}
