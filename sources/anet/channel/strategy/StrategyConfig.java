package anet.channel.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StrategyConfig implements Serializable, Parcelable {
    public static final Parcelable.Creator<StrategyConfig> CREATOR = new Parcelable.Creator<StrategyConfig>() { // from class: anet.channel.strategy.StrategyConfig.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyConfig createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyConfig) ipChange.ipc$dispatch("7a1ab09c", new Object[]{this, parcel}) : new StrategyConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StrategyConfig[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StrategyConfig[]) ipChange.ipc$dispatch("52b224c5", new Object[]{this, new Integer(i)}) : new StrategyConfig[i];
        }
    };
    private static final int MAX_CACHE_SIZE = 256;
    public static final String NO_RESULT = "No_Result";
    private static final long serialVersionUID = -7798500032935529499L;
    private SerialLruCache<String, String> schemeMap = null;
    private Map<String, String> unitMap = null;
    private Map<String, String> accessPointMap = null;
    private transient StrategyInfoHolder holder = null;
    private Map<String, String> bssidUniqueIdMap = null;

    static {
        t2o.a(607125855);
    }

    public StrategyConfig() {
    }

    public void checkInit() {
        if (this.schemeMap == null) {
            this.schemeMap = new SerialLruCache<>(256);
        }
        if (this.unitMap == null) {
            this.unitMap = new ConcurrentHashMap();
        }
        if (this.accessPointMap == null) {
            this.accessPointMap = new ConcurrentHashMap();
        }
        if (this.bssidUniqueIdMap == null) {
            this.bssidUniqueIdMap = new ConcurrentHashMap();
        }
    }

    public StrategyConfig createSelf() {
        StrategyConfig strategyConfig = new StrategyConfig();
        synchronized (this) {
            strategyConfig.schemeMap = new SerialLruCache<>(this.schemeMap, 256);
            strategyConfig.unitMap = new ConcurrentHashMap(this.unitMap);
            strategyConfig.accessPointMap = new ConcurrentHashMap(this.accessPointMap);
            strategyConfig.bssidUniqueIdMap = new ConcurrentHashMap(this.bssidUniqueIdMap);
            strategyConfig.holder = this.holder;
        }
        return strategyConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAccessPointByHost(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.accessPointMap.get(str);
        }
        return str2;
    }

    public String getSafeAislesByHost(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str) || !Utils.checkHostValidAndNotIp(str)) {
            return null;
        }
        synchronized (this) {
            try {
                str2 = this.schemeMap.get(str);
                if (str2 == null) {
                    this.schemeMap.put(str, NO_RESULT);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str2 == null) {
            if (z) {
                this.holder.getCellularStrategyTable().sendAmdcRequest(z, str, false);
            } else {
                this.holder.getCurrStrategyTable().sendAmdcRequest(z, str, false);
            }
        } else if (NO_RESULT.equals(str2)) {
            return null;
        }
        return str2;
    }

    public String getUniqueIdByBssid(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.bssidUniqueIdMap.get(str);
    }

    public String getUnitByHost(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            str2 = this.unitMap.get(str);
        }
        return str2;
    }

    public void setHolder(StrategyInfoHolder strategyInfoHolder) {
        this.holder = strategyInfoHolder;
    }

    public void update(StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        synchronized (this) {
            try {
                TreeMap<String, String> updateDns = updateDns(httpDnsResponse.dns, httpDnsResponse.accessPoint);
                if (updateDns != null) {
                    for (Map.Entry<String, String> entry : updateDns.entrySet()) {
                        String value = entry.getValue();
                        if (this.schemeMap.containsKey(value)) {
                            this.schemeMap.put(entry.getKey(), this.schemeMap.get(value));
                        } else {
                            this.schemeMap.put(entry.getKey(), NO_RESULT);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.StrategyConfig", "[smoothSwitch] ", null, "SchemeMap", this.schemeMap.toString());
            ALog.d("awcn.StrategyConfig", "[smoothSwitch] ", null, "UnitMap", this.unitMap.toString());
            ALog.d("awcn.StrategyConfig", "[ap][smoothSwitch] ", null, "accessPointMap", this.accessPointMap.toString());
        }
    }

    public void updateBssidUniqueIdMap(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.bssidUniqueIdMap.put(str, str2);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeMap(this.schemeMap);
        parcel.writeMap(this.unitMap);
        parcel.writeMap(this.accessPointMap);
        parcel.writeMap(this.bssidUniqueIdMap);
    }

    private TreeMap<String, String> updateDns(StrategyResultParser.Dns[] dnsArr, String str) {
        TreeMap<String, String> treeMap = null;
        if (!(dnsArr == null || dnsArr.length == 0)) {
            for (StrategyResultParser.Dns dns : dnsArr) {
                if (dns.clear) {
                    this.schemeMap.remove(dns.host);
                } else if (dns.cname != null) {
                    if (treeMap == null) {
                        treeMap = new TreeMap<>();
                    }
                    treeMap.put(dns.host, dns.cname);
                } else {
                    if ("http".equalsIgnoreCase(dns.safeAisles) || "https".equalsIgnoreCase(dns.safeAisles)) {
                        this.schemeMap.put(dns.host, dns.safeAisles);
                    } else {
                        this.schemeMap.put(dns.host, NO_RESULT);
                    }
                    if (!TextUtils.isEmpty(dns.unit)) {
                        this.unitMap.put(dns.host, dns.unit);
                    } else {
                        this.unitMap.remove(dns.host);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.accessPointMap.put(dns.host, str);
                    } else {
                        this.accessPointMap.remove(dns.host);
                    }
                }
            }
        }
        return treeMap;
    }

    public StrategyConfig(Parcel parcel) {
        int readInt = parcel.readInt();
        checkInit();
        if (readInt == 1) {
            SerialLruCache<String, String> serialLruCache = this.schemeMap;
            parcel.readMap(serialLruCache, serialLruCache.getClass().getClassLoader());
            Map<String, String> map = this.unitMap;
            parcel.readMap(map, map.getClass().getClassLoader());
            Map<String, String> map2 = this.accessPointMap;
            parcel.readMap(map2, map2.getClass().getClassLoader());
            Map<String, String> map3 = this.bssidUniqueIdMap;
            parcel.readMap(map3, map3.getClass().getClassLoader());
            return;
        }
        throw new IllegalArgumentException("StrategyConfig Unsupported Parcelable version: " + readInt + " , cur version=1");
    }
}
