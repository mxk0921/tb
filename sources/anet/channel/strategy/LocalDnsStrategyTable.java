package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.entity.SessionType;
import anet.channel.statist.LocalDnsLookupStatistic;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import tb.r5q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LocalDnsStrategyTable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.LocalDnsStrategyTable";
    public final ConcurrentHashMap<String, List<IPConnStrategy>> localStrategyMap = new ConcurrentHashMap<>();
    public final HashMap<String, Object> lockObjMap = new HashMap<>();

    static {
        t2o.a(607125841);
    }

    public static /* synthetic */ void access$000(LocalDnsStrategyTable localDnsStrategyTable, LocalDnsLookupStatistic localDnsLookupStatistic, String str, String str2, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fdb0457", new Object[]{localDnsStrategyTable, localDnsLookupStatistic, str, str2, new Integer(i), new Integer(i2), str3});
        } else {
            localDnsStrategyTable.buildConnProtocol(localDnsLookupStatistic, str, str2, i, i2, str3);
        }
    }

    private void startLocalDnsLookup(String str, String str2, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06d405f", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        synchronized (this.lockObjMap) {
            try {
                if (!this.lockObjMap.containsKey(str)) {
                    Object obj = new Object();
                    this.lockObjMap.put(str, obj);
                    startLocalDnsLookup(str, obj, str2, i, i2, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        List<IPConnStrategy> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46e0d0", new Object[]{this, str, iConnStrategy, connEvent});
        } else if (!connEvent.isSuccess && !TextUtils.isEmpty(str) && !connEvent.isAccs && (list = this.localStrategyMap.get(str)) != null && list != Collections.EMPTY_LIST) {
            Iterator<IPConnStrategy> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == iConnStrategy) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                this.localStrategyMap.remove(str);
            }
        }
    }

    public List queryIpv4ByHost(String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d655a7fb", new Object[]{this, str, new Boolean(z), new Integer(i)});
        }
        List queryByHost = queryByHost(str);
        ListIterator listIterator = queryByHost.listIterator();
        while (listIterator.hasNext()) {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) listIterator.next();
            if (Utils.isIPV6Address(iPConnStrategy.getIp())) {
                listIterator.remove();
            } else {
                ConnType valueOf = ConnType.valueOf(iPConnStrategy.getProtocol());
                if (valueOf == null) {
                    listIterator.remove();
                } else if (!(valueOf.isSSL() == z && (i == SessionType.ALL || valueOf.getType() == i))) {
                    listIterator.remove();
                }
            }
        }
        return queryByHost;
    }

    public ConnProtocol setHTTP3ProtocolForHost(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnProtocol) ipChange.ipc$dispatch("6aa2210c", new Object[]{this, str, str2, new Integer(i)});
        }
        List<IPConnStrategy> list = this.localStrategyMap.get(str);
        if (list == null || list.isEmpty()) {
            ALog.e(TAG, "[setHTTP3ProtocolForHost] localStrategyList is null,  setHTTP3ProtocolForHost  host= " + str, null, new Object[0]);
            startLocalDnsLookup(str, str2, StrategyTemplate.LocalDnsSessionType.USE_HTT3.ordinal(), i, true);
        }
        return ConnProtocol.valueOf(ConnType.HTTP3, "", "");
    }

    private boolean isSSL(ConnProtocol connProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("428b953b", new Object[]{this, connProtocol})).booleanValue();
        }
        return connProtocol.protocol.equalsIgnoreCase("https") || connProtocol.protocol.equalsIgnoreCase(ConnType.H2S) || !TextUtils.isEmpty(connProtocol.publicKey);
    }

    public List queryByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f68c7a6f", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !Utils.checkHostValidAndNotIp(str)) {
            return Collections.EMPTY_LIST;
        }
        if (ALog.isPrintLog(1)) {
            ALog.d(TAG, "try resolve ip with local dns", null, "host", str);
        }
        List<IPConnStrategy> list = Collections.EMPTY_LIST;
        if (!this.localStrategyMap.containsKey(str)) {
            startLocalDnsLookup(str, null, StrategyTemplate.LocalDnsSessionType.SHORT_LINK.ordinal(), 0, false);
        }
        List<IPConnStrategy> list2 = this.localStrategyMap.get(str);
        if (!(list2 == null || list2 == list)) {
            list = new ArrayList<>(list2);
        }
        ALog.e(TAG, "get local strategy", null, "strategyList", list2, "host", str);
        return list;
    }

    public void queryLocalDnsByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73a41b6", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && Utils.checkHostValidAndNotIp(str) && !DispatchConstants.getAmdcServerDomain().equalsIgnoreCase(str)) {
            if (!this.localStrategyMap.containsKey(str)) {
                startLocalDnsLookup(str, null, StrategyTemplate.LocalDnsSessionType.SHORT_LINK.ordinal(), 0, false);
                ALog.e(TAG, "[queryLocalDnsByHost] localStrategyMap not contains host, startLocalDnsLookup", null, "host", str);
                return;
            }
            ALog.e(TAG, "[queryLocalDnsByHost] localStrategyMap contains host", null, "strategyList", this.localStrategyMap.get(str));
        }
    }

    public List<IConnStrategy> queryWithoutWait(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("49dff441", new Object[]{this, str});
        }
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        List<IPConnStrategy> list2 = this.localStrategyMap.get(str);
        if (!(list2 == null || list2.size() == 0)) {
            list = new ArrayList<>(list2);
        }
        ALog.i(TAG, "queryWithoutWait local strategy", null, "strategyList", list2);
        return list;
    }

    private void executeNowStartLocalDns(String str, String str2, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8743a7a", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        synchronized (this.lockObjMap) {
            try {
                if (!this.lockObjMap.containsKey(str)) {
                    Object obj = new Object();
                    this.lockObjMap.put(str, obj);
                    ALog.e(TAG, "[Ipv6_H3] executeNowStartLocalDns start ", null, "host", str);
                    startLocalDnsLookup(str, obj, str2, i, i2, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void localDnsLookupByHost(String str, String str2, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba58c82", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        boolean checkHostValidAndNotIp = Utils.checkHostValidAndNotIp(str);
        boolean z2 = !checkHostValidAndNotIp;
        if (TextUtils.isEmpty(str) || !checkHostValidAndNotIp) {
            ALog.e(TAG, "[Ipv6_H3] localDnsLookupByHost executeNowStartLocalDns isEmpty or checkHostValidAndNotIp", null, "host", str, "checkHostValidAndNotIp", Boolean.valueOf(z2));
        } else if (!this.localStrategyMap.containsKey(str)) {
            executeNowStartLocalDns(str, str2, i, i2, z);
        }
    }

    private void startLocalDnsLookup(final String str, final Object obj, final String str2, final int i, final int i2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7658dec3", new Object[]{this, str, obj, str2, new Integer(i), new Integer(i2), new Boolean(z)});
        } else {
            AmdcThreadPoolExecutor.submitLocalDnsTask(new Runnable() { // from class: anet.channel.strategy.LocalDnsStrategyTable.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:108:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0187  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 640
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.LocalDnsStrategyTable.AnonymousClass1.run():void");
                }
            });
        }
    }

    public void setProtocolForHost(String str, ConnProtocol connProtocol, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b0c4e0", new Object[]{this, str, connProtocol, str2});
            return;
        }
        List<IPConnStrategy> list = this.localStrategyMap.get(str);
        if (list == null || list.isEmpty()) {
            ALog.e(TAG, "[setProtocolForHost] localStrategyList is null,  startLocalDnsLookup  host= " + str, null, "publicKey", str2);
            startLocalDnsLookup(str, str2, StrategyTemplate.LocalDnsSessionType.USE_HTT2.ordinal(), 0, true);
            return;
        }
        for (IPConnStrategy iPConnStrategy : list) {
            if (iPConnStrategy.getProtocol().equals(connProtocol)) {
                ALog.e(TAG, "setProtocolForHost localStrategyMap already exist", null, "strategyList", list);
                return;
            }
        }
        list.add(IPConnStrategy.create(list.get(0).getIp(), !isSSL(connProtocol) ? 80 : 443, connProtocol, 0, 0, 1, r5q.FOREGROUND_INTERVAL, null, null, null));
        ALog.i(TAG, "[setProtocolForHost]", null, "strategyList", list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x014a, code lost:
        r5 = 80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void buildConnProtocol(anet.channel.statist.LocalDnsLookupStatistic r24, java.lang.String r25, java.lang.String r26, int r27, int r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.LocalDnsStrategyTable.buildConnProtocol(anet.channel.statist.LocalDnsLookupStatistic, java.lang.String, java.lang.String, int, int, java.lang.String):void");
    }
}
