package anet.channel.strategy.dispatch;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DispatchCore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHECK_SIGN_FAIL = "-1003";
    public static final String EMPTY_SIGN_ERROR = "-1001";
    public static final int MAX_RETRY_TIMES = 3;
    public static final int NEW_MAX_RETRY_TIMES = 4;
    public static final int NO_RETRY = 2;
    public static final String READ_ANSWER_ERROR = "-1002";
    public static final String REQUEST_EXCEPTION = "-1000";
    public static final String RESOLVE_ANSWER_FAIL = "-1004";
    public static final int RETRY_NORMAL = 1;
    public static final int SUCCESS = 0;
    public static final String TAG = "awcn.DispatchCore";
    public static AtomicInteger seq = new AtomicInteger(0);
    public static HostnameVerifier hostnameVerifier = new HostnameVerifier() { // from class: anet.channel.strategy.dispatch.DispatchCore.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("563b2905", new Object[]{this, str, sSLSession})).booleanValue();
            }
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(DispatchConstants.getAmdcServerDomain(), sSLSession);
        }
    };
    public static Random random = new Random();
    public static AtomicBoolean isFirstAmdcRequest = new AtomicBoolean(false);
    public static List<FirstAmdcTask> firstAmdcTaskList = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class FirstAmdcTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public AmdcStatistic amdcStatistic;
        public String[] ipv6s;
        public boolean isIpv6Fail;
        public Map map;
        public int retry;
        public int status = -1;
        public IConnStrategy connStrategy = null;

        static {
            t2o.a(607125902);
        }

        public FirstAmdcTask(AmdcStatistic amdcStatistic, Map map, int i, String[] strArr, boolean z) {
            this.map = map;
            this.retry = i;
            this.amdcStatistic = amdcStatistic;
            this.ipv6s = strArr;
            this.isIpv6Fail = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.amdcStatistic.seqNo + "_[" + this.retry + "]";
            ALog.e(DispatchCore.TAG, "[ap] FirstAmdcTask run. ", str, new Object[0]);
            if (this.retry == 0) {
                DispatchCore.access$000();
            }
            DispatchCore.access$100(this);
            if (this.retry == 0 || !DispatchCore.access$200(str)) {
                long currentTimeMillis = System.currentTimeMillis();
                String tryStrategyBuildUrl = DispatchCore.tryStrategyBuildUrl(this.map, this.connStrategy, this.retry, this.ipv6s, this.isIpv6Fail, this.amdcStatistic);
                if (tryStrategyBuildUrl == null || tryStrategyBuildUrl.isEmpty()) {
                    ALog.e(DispatchCore.TAG, "[ap] start fail, get urlString null!", str, new Object[0]);
                    return;
                }
                this.amdcStatistic.tryStrategyBuildUrlTime = System.currentTimeMillis() - currentTimeMillis;
                this.amdcStatistic.strategyTime = System.currentTimeMillis() - this.amdcStatistic.buildParamEndTime;
                ALog.e(DispatchCore.TAG, "[ap] start send, urlString=".concat(tryStrategyBuildUrl), str, new Object[0]);
                this.status = DispatchCore.sendOneNetworkRequest(this.amdcStatistic, tryStrategyBuildUrl, this.map, this.retry);
                ALog.e(DispatchCore.TAG, "[ap] end, ret status=" + this.status + " ,urlString=" + tryStrategyBuildUrl, str, new Object[0]);
            }
        }
    }

    static {
        t2o.a(607125900);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            clearFirstAmdcTaskList();
        }
    }

    public static /* synthetic */ void access$100(FirstAmdcTask firstAmdcTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c614fc", new Object[]{firstAmdcTask});
        } else {
            addFirstAmdcTaskList(firstAmdcTask);
        }
    }

    public static /* synthetic */ boolean access$200(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("415b7b87", new Object[]{str})).booleanValue();
        }
        return isExistAmdcTaskReturn(str);
    }

    private static synchronized void addFirstAmdcTaskList(FirstAmdcTask firstAmdcTask) {
        synchronized (DispatchCore.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940b4f70", new Object[]{firstAmdcTask});
                return;
            }
            if (firstAmdcTaskList == null) {
                firstAmdcTaskList = new ArrayList();
            }
            firstAmdcTaskList.add(firstAmdcTask);
        }
    }

    private static synchronized void clearFirstAmdcTaskList() {
        synchronized (DispatchCore.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca411698", new Object[0]);
                return;
            }
            List<FirstAmdcTask> list = firstAmdcTaskList;
            if (list != null && !list.isEmpty()) {
                firstAmdcTaskList.clear();
            }
        }
    }

    public static void commitStatistic(AmdcStatistic amdcStatistic, String str, String str2, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd217f40", new Object[]{amdcStatistic, str, str2, new Integer(i), new Integer(i2), str3});
        } else if ((i2 != 1 || i == 2) && GlobalAppRuntimeInfo.isTargetProcess() && amdcStatistic != null) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                amdcStatistic.totalTime = currentTimeMillis - amdcStatistic.startTime;
                amdcStatistic.requestTime = currentTimeMillis - amdcStatistic.oneStartTime;
                amdcStatistic.errorCode = str;
                amdcStatistic.errorMsg = str2;
                amdcStatistic.retryTimes = i;
                amdcStatistic.accessPoint = str3;
                amdcStatistic.ret = i2;
                AppMonitor.getInstance().commitStat(amdcStatistic);
            } catch (Exception unused) {
            }
        }
    }

    private static String getAccessPoint(DispatchEvent dispatchEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1830887c", new Object[]{dispatchEvent});
        }
        if (dispatchEvent != null) {
            return dispatchEvent.accessPoint;
        }
        return BuildConfig.RPC_TYPE_DEF;
    }

    public static String parseObjectString(Map map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fa6797b", new Object[]{map, str});
        }
        if (map == null || map.isEmpty() || str == null || str.isEmpty() || (obj = map.get(str)) == null || !(obj instanceof String)) {
            return "";
        }
        return (String) obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:146:0x0479
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static int sendOneNetworkRequest(anet.channel.statist.AmdcStatistic r35, java.lang.String r36, java.util.Map r37, int r38) {
        /*
            Method dump skipped, instructions count: 1963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.dispatch.DispatchCore.sendOneNetworkRequest(anet.channel.statist.AmdcStatistic, java.lang.String, java.util.Map, int):int");
    }

    public static void commitFlow(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea915ed6", new Object[]{str, new Long(j), new Long(j2)});
            return;
        }
        try {
            FlowStat flowStat = new FlowStat();
            flowStat.refer = SwitchMonitorLogUtil.SRC_AMDC;
            flowStat.protocoltype = "http";
            flowStat.req_identifier = str;
            flowStat.upstream = j;
            flowStat.downstream = j2;
            NetworkAnalysis.getInstance().commitFlow(flowStat);
        } catch (Exception e) {
            ALog.e(TAG, "commit flow info failed!", null, e, new Object[0]);
        }
    }

    private static synchronized boolean isExistAmdcTaskReturn(String str) {
        boolean z = false;
        synchronized (DispatchCore.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2194a342", new Object[]{str})).booleanValue();
            }
            for (FirstAmdcTask firstAmdcTask : firstAmdcTaskList) {
                int i = firstAmdcTask.status;
                if (!(i == 0 || i == 2)) {
                    firstAmdcTask.connStrategy = null;
                }
                ALog.e(TAG, "[ap] isExistAmdcTaskReturn=true, this task status=" + firstAmdcTask.status + " , end task.", "task[" + firstAmdcTask.retry + "]", str);
                if (firstAmdcTask.connStrategy != null) {
                    ConnEvent connEvent = new ConnEvent();
                    if (firstAmdcTask.status == 0) {
                        z = true;
                    }
                    connEvent.isSuccess = z;
                    StrategyCenter.getInstance().notifyConnEvent(DispatchConstants.getAmdcServerDomain(), firstAmdcTask.connStrategy, connEvent);
                }
                return true;
            }
            return false;
        }
    }

    private static String buildRequestUrl(String str, String str2, int i, Map<String, String> map, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f170cce8", new Object[]{str, str2, new Integer(i), map, new Integer(i2)});
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(DispatchHelper.buildRequestUrl(str, str2, i, DispatchConstants.getAmdcServerDomain(), DispatchConstants.serverPath, i2 == 2));
        TreeMap treeMap = new TreeMap();
        treeMap.put("appkey", map.remove("appkey"));
        treeMap.put("v", map.remove("v"));
        treeMap.put("appVersion", map.remove("appVersion"));
        treeMap.put(DispatchConstants.CONFIG_VERSION, map.remove(DispatchConstants.CONFIG_VERSION));
        sb.append(f7l.CONDITION_IF);
        sb.append(Utils.encodeQueryParams(treeMap, "utf-8"));
        return sb.toString();
    }

    public static void sendRequest(Map map, AmdcStatistic amdcStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126a9179", new Object[]{map, amdcStatistic});
        } else if (map != null && amdcStatistic != null) {
            String[] amdcServerFixIpv6 = Inet64Util.isIPv6OnlyNetwork() ? DispatchConstants.getAmdcServerFixIpv6() : null;
            if (!AwcnConfig.isAllowForceAmdcEnable() || !AwcnConfig.isVpnOptOpened() || !NetworkStatusHelper.isVpn() || (!isFirstAmdcRequest.compareAndSet(false, true) && !amdcStatistic.isVpnProxy)) {
                int i = 0;
                for (int i2 = 4; i < i2; i2 = 4) {
                    HashMap hashMap = new HashMap(map);
                    long currentTimeMillis = System.currentTimeMillis();
                    String tryStrategyBuildUrl = tryStrategyBuildUrl(hashMap, null, i, amdcServerFixIpv6, false, amdcStatistic);
                    amdcStatistic.tryStrategyBuildUrlTime = System.currentTimeMillis() - currentTimeMillis;
                    amdcStatistic.strategyTime = System.currentTimeMillis() - amdcStatistic.buildParamEndTime;
                    int sendOneNetworkRequest = sendOneNetworkRequest(amdcStatistic, tryStrategyBuildUrl, hashMap, i);
                    if (sendOneNetworkRequest == 0 || sendOneNetworkRequest == 2) {
                        ALog.e(TAG, "ret status=" + sendOneNetworkRequest + " ,urlString=" + tryStrategyBuildUrl, amdcStatistic.seqNo, "retry", Integer.valueOf(i));
                        return;
                    }
                    i++;
                }
                return;
            }
            ALog.e(TAG, "[ap]  isFirstAmdcRequest true", amdcStatistic.seqNo, "isVpnOptOpened", Boolean.valueOf(AwcnConfig.isVpnOptOpened()), "isVpnProxy", Boolean.valueOf(amdcStatistic.isVpnProxy));
            HashMap hashMap2 = new HashMap(map);
            FirstAmdcTask firstAmdcTask = new FirstAmdcTask(amdcStatistic, hashMap2, 0, amdcServerFixIpv6, false);
            FirstAmdcTask firstAmdcTask2 = new FirstAmdcTask(amdcStatistic, hashMap2, 1, amdcServerFixIpv6, false);
            FirstAmdcTask firstAmdcTask3 = new FirstAmdcTask(amdcStatistic, hashMap2, 2, amdcServerFixIpv6, false);
            FirstAmdcTask firstAmdcTask4 = new FirstAmdcTask(amdcStatistic, hashMap2, 3, amdcServerFixIpv6, false);
            AmdcThreadPoolExecutor.submitTask(firstAmdcTask);
            AmdcThreadPoolExecutor.scheduleTask(firstAmdcTask2, 250L);
            AmdcThreadPoolExecutor.scheduleTask(firstAmdcTask3, 500L);
            AmdcThreadPoolExecutor.scheduleTask(firstAmdcTask4, 750L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02ce A[Catch: all -> 0x02ca, TryCatch #19 {all -> 0x02ca, blocks: (B:130:0x02c2, B:134:0x02ce, B:136:0x02d8, B:137:0x02e3, B:139:0x02eb, B:140:0x02f4), top: B:165:0x02c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d8 A[Catch: all -> 0x02ca, TryCatch #19 {all -> 0x02ca, blocks: (B:130:0x02c2, B:134:0x02ce, B:136:0x02d8, B:137:0x02e3, B:139:0x02eb, B:140:0x02f4), top: B:165:0x02c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e3 A[Catch: all -> 0x02ca, TryCatch #19 {all -> 0x02ca, blocks: (B:130:0x02c2, B:134:0x02ce, B:136:0x02d8, B:137:0x02e3, B:139:0x02eb, B:140:0x02f4), top: B:165:0x02c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02eb A[Catch: all -> 0x02ca, TryCatch #19 {all -> 0x02ca, blocks: (B:130:0x02c2, B:134:0x02ce, B:136:0x02d8, B:137:0x02e3, B:139:0x02eb, B:140:0x02f4), top: B:165:0x02c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f4 A[Catch: all -> 0x02ca, TRY_LEAVE, TryCatch #19 {all -> 0x02ca, blocks: (B:130:0x02c2, B:134:0x02ce, B:136:0x02d8, B:137:0x02e3, B:139:0x02eb, B:140:0x02f4), top: B:165:0x02c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0327 A[Catch: all -> 0x0322, TryCatch #0 {all -> 0x0322, blocks: (B:147:0x031c, B:152:0x0327, B:154:0x0331, B:155:0x033c, B:157:0x0344, B:158:0x034d), top: B:161:0x031c }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0331 A[Catch: all -> 0x0322, TryCatch #0 {all -> 0x0322, blocks: (B:147:0x031c, B:152:0x0327, B:154:0x0331, B:155:0x033c, B:157:0x0344, B:158:0x034d), top: B:161:0x031c }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x033c A[Catch: all -> 0x0322, TryCatch #0 {all -> 0x0322, blocks: (B:147:0x031c, B:152:0x0327, B:154:0x0331, B:155:0x033c, B:157:0x0344, B:158:0x034d), top: B:161:0x031c }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0344 A[Catch: all -> 0x0322, TryCatch #0 {all -> 0x0322, blocks: (B:147:0x031c, B:152:0x0327, B:154:0x0331, B:155:0x033c, B:157:0x0344, B:158:0x034d), top: B:161:0x031c }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x034d A[Catch: all -> 0x0322, TRY_LEAVE, TryCatch #0 {all -> 0x0322, blocks: (B:147:0x031c, B:152:0x0327, B:154:0x0331, B:155:0x033c, B:157:0x0344, B:158:0x034d), top: B:161:0x031c }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readAnswer(java.io.InputStream r21, boolean r22, anet.channel.strategy.dispatch.DispatchZstdDictEvent r23, int r24, anet.channel.statist.PublicNetworkErrorStatistic r25, java.lang.String r26, anet.channel.statist.AmdcStatistic r27) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.dispatch.DispatchCore.readAnswer(java.io.InputStream, boolean, anet.channel.strategy.dispatch.DispatchZstdDictEvent, int, anet.channel.statist.PublicNetworkErrorStatistic, java.lang.String, anet.channel.statist.AmdcStatistic):java.lang.String");
    }

    public static String tryStrategyBuildUrl(Map map, IConnStrategy iConnStrategy, int i, String[] strArr, boolean z, AmdcStatistic amdcStatistic) {
        IConnStrategy iConnStrategy2;
        String[] amdcServerOverSeaIp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8736400d", new Object[]{map, iConnStrategy, new Integer(i), strArr, new Boolean(z), amdcStatistic});
        }
        String schemeByHost = StrategyCenter.getInstance().getSchemeByHost(DispatchConstants.getAmdcServerDomain(), "http");
        if (i == 0) {
            List<IConnStrategy> prepareConnStrategy = DispatchHelper.prepareConnStrategy(schemeByHost, DispatchConstants.getAmdcServerDomain());
            iConnStrategy2 = (prepareConnStrategy == null || prepareConnStrategy.isEmpty()) ? iConnStrategy : prepareConnStrategy.remove(0);
            if (iConnStrategy2 != null) {
                amdcStatistic.isNotConnStrategy = false;
                amdcStatistic.strategyType = 0;
                String buildRequestUrl = buildRequestUrl(schemeByHost, iConnStrategy2.getIp(), iConnStrategy2.getPort(), map, i);
                ALog.e(TAG, "[amdc] buildRequestUrl use connStrategy!, urlString=" + buildRequestUrl, amdcStatistic.seqNo, "retry", Integer.valueOf(i));
                return buildRequestUrl;
            }
            amdcStatistic.isNotConnStrategy = true;
        } else {
            iConnStrategy2 = iConnStrategy;
        }
        if (i == 0 || !amdcStatistic.isUseLocalStrategy) {
            List<IConnStrategy> localDnsConnStrategyListByHost = StrategyCenter.getInstance().getLocalDnsConnStrategyListByHost(DispatchConstants.getAmdcServerDomain());
            if (localDnsConnStrategyListByHost != null && !localDnsConnStrategyListByHost.isEmpty()) {
                iConnStrategy2 = localDnsConnStrategyListByHost.remove(0);
            }
            amdcStatistic.isUseLocalStrategy = true;
            if (iConnStrategy2 != null) {
                amdcStatistic.strategyType = 1;
                String buildRequestUrl2 = buildRequestUrl(schemeByHost, iConnStrategy2.getIp(), iConnStrategy2.getPort(), map, i);
                ALog.e(TAG, "[amdc] buildRequestUrl use localDnsStrategy!, urlString=" + buildRequestUrl2, amdcStatistic.seqNo, "retry", Integer.valueOf(i));
                return buildRequestUrl2;
            } else if (AwcnConfig.isStrategyRetryEnable()) {
                amdcStatistic.isUseLocalStrategy = false;
            } else {
                amdcStatistic.strategyType = 5;
                String buildRequestUrl3 = buildRequestUrl(schemeByHost, null, 0, map, i);
                ALog.e(TAG, "[amdc] buildRequestUrl, local null, use host!, urlString=" + buildRequestUrl3, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isIpv6Fail", Boolean.valueOf(z));
                return buildRequestUrl3;
            }
        }
        if (!amdcStatistic.isUsePreSetVip) {
            amdcStatistic.isUsePreSetVip = true;
            if (strArr == null || strArr.length <= 0 || z) {
                String[] amdcServerFixIp = DispatchConstants.getAmdcServerFixIp();
                if (amdcServerFixIp == null || amdcServerFixIp.length <= 0) {
                    amdcStatistic.strategyType = 5;
                    String buildRequestUrl4 = buildRequestUrl(schemeByHost, null, 0, map, i);
                    ALog.e(TAG, "[amdc] buildRequestUrl use host!, urlString=" + buildRequestUrl4, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isIpv6Fail", Boolean.valueOf(z));
                    return buildRequestUrl4;
                }
                amdcStatistic.strategyType = 3;
                String buildRequestUrl5 = buildRequestUrl(schemeByHost, amdcServerFixIp[random.nextInt(amdcServerFixIp.length)], 0, map, i);
                ALog.e(TAG, "[amdc] buildRequestUrl use preset v4 ip!, urlString=" + buildRequestUrl5, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isIpv6Fail", Boolean.valueOf(z));
                return buildRequestUrl5;
            }
            amdcStatistic.strategyType = 2;
            String buildRequestUrl6 = buildRequestUrl(schemeByHost, strArr[random.nextInt(strArr.length)], 0, map, i);
            ALog.e(TAG, "[amdc] buildRequestUrl use preset v6 ip!, urlString=" + buildRequestUrl6, amdcStatistic.seqNo, "retry", Integer.valueOf(i));
            return buildRequestUrl6;
        } else if (i != 3 || (amdcServerOverSeaIp = DispatchConstants.getAmdcServerOverSeaIp()) == null || amdcServerOverSeaIp.length <= 0) {
            amdcStatistic.strategyType = 5;
            String buildRequestUrl7 = buildRequestUrl(schemeByHost, null, 0, map, i);
            ALog.e(TAG, "[amdc] buildRequestUrl final use host!, urlString=" + buildRequestUrl7, amdcStatistic.seqNo, "retry", Integer.valueOf(i), "isIpv6Fail", Boolean.valueOf(z));
            return buildRequestUrl7;
        } else {
            amdcStatistic.strategyType = 4;
            String buildRequestUrl8 = buildRequestUrl(schemeByHost, amdcServerOverSeaIp[random.nextInt(amdcServerOverSeaIp.length)], 0, map, i);
            ALog.e(TAG, "[amdc] buildRequestUrl use preset v4 overSea ip!, urlString=" + buildRequestUrl8, amdcStatistic.seqNo, "retry", Integer.valueOf(i));
            return buildRequestUrl8;
        }
    }
}
