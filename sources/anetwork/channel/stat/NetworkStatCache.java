package anetwork.channel.stat;

import anet.channel.util.StringUtils;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkStatCache implements INetworkStat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_SIZE = 100;
    private static final String RESET_STAT = "{\"oneWayTime\" : 0, \"totalSize\" : 0}";
    private Map<String, String> lruCache;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class holder {
        public static NetworkStatCache instance = new NetworkStatCache();

        static {
            t2o.a(607126113);
        }

        private holder() {
        }
    }

    static {
        t2o.a(607126111);
        t2o.a(607126109);
    }

    public static NetworkStatCache getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatCache) ipChange.ipc$dispatch("c4cd6a46", new Object[0]);
        }
        return holder.instance;
    }

    @Override // anetwork.channel.stat.INetworkStat
    public String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        return this.lruCache.get(str);
    }

    @Override // anetwork.channel.stat.INetworkStat
    public void put(String str, StatisticData statisticData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc492bc", new Object[]{this, str, statisticData});
        } else if (!StringUtils.isBlank(str)) {
            StringBuilder sb = new StringBuilder(48);
            sb.append("{\"oneWayTime\" : ");
            sb.append(statisticData.oneWayTime_ANet);
            sb.append(", \"totalSize\" : ");
            sb.append(statisticData.totalSize);
            sb.append("}");
            this.lruCache.put(str, sb.toString());
        }
    }

    @Override // anetwork.channel.stat.INetworkStat
    public void reset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847be2a0", new Object[]{this, str});
        } else if (this.lruCache.containsKey(str)) {
            this.lruCache.put(str, RESET_STAT);
        }
    }

    private NetworkStatCache() {
        this.lruCache = Collections.synchronizedMap(new LinkedHashMap<String, String>() { // from class: anetwork.channel.stat.NetworkStatCache.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anetwork/channel/stat/NetworkStatCache$1");
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, String> entry) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
                }
                if (size() > 100) {
                    return true;
                }
                return false;
            }
        });
    }
}
