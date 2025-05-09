package anet.channel.strategy.dispatch;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AmdcTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "awcn.AmdcThreadPoolExecutor";
    private static Random random = new Random();
    private Map<String, Object> cachedParams;
    private AtomicBoolean firstRequest = new AtomicBoolean(true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class AmdcTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Map<String, Object> params;
        private AtomicBoolean isForceCellular = new AtomicBoolean();
        public AtomicBoolean isVpnProxy = new AtomicBoolean();
        public AtomicBoolean isForceSend = new AtomicBoolean();
        public AtomicBoolean isForceUpdate = new AtomicBoolean();
        public AtomicInteger statusChangeType = new AtomicInteger();
        public AtomicInteger cacheFlag = new AtomicInteger();

        static {
            t2o.a(607125898);
        }

        public AmdcTask(boolean z, Map<String, Object> map, int i) {
            this.params = map;
            this.isForceCellular.set(z);
            this.cacheFlag.set(i);
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, Object> access$000;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ALog.e(AmdcTaskExecutor.TAG, "[ap] amdc task run, isVpnProxy=" + this.isVpnProxy.get(), null, new Object[0]);
                Map<String, Object> map = this.params;
                if (map == null) {
                    synchronized (AmdcTaskExecutor.class) {
                        access$000 = AmdcTaskExecutor.access$000(AmdcTaskExecutor.this);
                        AmdcTaskExecutor.access$002(AmdcTaskExecutor.this, null);
                    }
                    map = access$000;
                }
                if (!NetworkStatusHelper.isConnected()) {
                    ALog.e(AmdcTaskExecutor.TAG, "amdc task not isConnected", null, new Object[0]);
                } else if (GlobalAppRuntimeInfo.getEnv() != map.get("Env")) {
                    ALog.w(AmdcTaskExecutor.TAG, "task's env changed", null, new Object[0]);
                } else {
                    AmdcStatistic amdcStatistic = new AmdcStatistic();
                    amdcStatistic.startTime = System.currentTimeMillis();
                    amdcStatistic.seqNo = "AMDC" + DispatchCore.seq.incrementAndGet();
                    amdcStatistic.launchCacheFlag = this.cacheFlag.get();
                    Map buildParamMap = DispatchParamBuilder.buildParamMap(map, amdcStatistic);
                    amdcStatistic.buildParamEndTime = System.currentTimeMillis();
                    amdcStatistic.buildParamTime = System.currentTimeMillis() - amdcStatistic.startTime;
                    amdcStatistic.isForceCellular = this.isForceCellular.get();
                    amdcStatistic.isVpnProxy = this.isVpnProxy.get();
                    amdcStatistic.isForceSend = this.isForceSend.get();
                    amdcStatistic.isForceUpdate = this.isForceUpdate.get();
                    amdcStatistic.statusChangeType = this.statusChangeType.get();
                    DispatchCore.sendRequest(buildParamMap, amdcStatistic);
                }
            } catch (Exception e) {
                ALog.e(AmdcTaskExecutor.TAG, "[ap] exec amdc task failed.", null, e, new Object[0]);
            }
        }

        public AmdcTask(boolean z, int i) {
            this.isForceCellular.set(z);
            this.cacheFlag.set(i);
        }
    }

    static {
        t2o.a(607125897);
    }

    public static /* synthetic */ Map access$000(AmdcTaskExecutor amdcTaskExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3ce6e24", new Object[]{amdcTaskExecutor});
        }
        return amdcTaskExecutor.cachedParams;
    }

    public static /* synthetic */ Map access$002(AmdcTaskExecutor amdcTaskExecutor, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("658efcad", new Object[]{amdcTaskExecutor, map});
        }
        amdcTaskExecutor.cachedParams = map;
        return map;
    }

    public void addTask(boolean z, Map<String, Object> map, int i, boolean z2, boolean z3, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("181f0b1e", new Object[]{this, new Boolean(z), map, new Integer(i), new Boolean(z2), new Boolean(z3), new Integer(i2)});
            return;
        }
        try {
            map.put("Env", GlobalAppRuntimeInfo.getEnv());
            synchronized (this) {
                boolean isAllowForceAmdcEnable = AwcnConfig.isAllowForceAmdcEnable();
                if (isAllowForceAmdcEnable) {
                    if (!z2 && !z3 && !this.firstRequest.compareAndSet(true, false)) {
                    }
                    AmdcTask amdcTask = new AmdcTask(z, map, i2);
                    amdcTask.isVpnProxy.set(z2);
                    amdcTask.isForceSend.set(z3);
                    amdcTask.statusChangeType.set(i);
                    amdcTask.isForceUpdate.set(true);
                    AmdcThreadPoolExecutor.submitTask(amdcTask);
                    ALog.e(TAG, "[ap] addTask, first or vpn amdc request! ", null, "params", map, "isVpnProxy", Boolean.valueOf(z2), "isForceSend", Boolean.valueOf(z3), "isAllowForceAmdc", Boolean.valueOf(isAllowForceAmdcEnable), "cacheFlag", Integer.valueOf(i2));
                }
                if (isAllowForceAmdcEnable || !z3 || !(i == HttpDispatcher.AmdcConditionType.LAUNCH_AMDC.ordinal() || i == HttpDispatcher.AmdcConditionType.NETWORK_CHANGE_AMDC.ordinal() || i == HttpDispatcher.AmdcConditionType.VPN_AMDC.ordinal())) {
                    Map<String, Object> map2 = this.cachedParams;
                    if (map2 == null) {
                        this.cachedParams = map;
                        AmdcTask amdcTask2 = new AmdcTask(z, i2);
                        amdcTask2.statusChangeType.set(i);
                        if (!isAllowForceAmdcEnable || !this.firstRequest.compareAndSet(true, false)) {
                            i3 = random.nextInt(3000) + 2000;
                        } else {
                            amdcTask2.isForceUpdate.set(true);
                            i3 = 0;
                        }
                        ALog.e(TAG, "[ap] merge amdc first amdc request", null, "delay", Integer.valueOf(i3), "isAllowForceAmdc", Boolean.valueOf(isAllowForceAmdcEnable), "cacheFlag", Integer.valueOf(i2));
                        AmdcThreadPoolExecutor.scheduleTask(amdcTask2, i3);
                    } else {
                        Set set = (Set) map2.get("hosts");
                        Set set2 = (Set) map.get("hosts");
                        if (map.get("Env") != this.cachedParams.get("Env")) {
                            this.cachedParams = map;
                        } else if (set.size() + set2.size() <= 40) {
                            set2.addAll(set);
                            this.cachedParams = map;
                        } else {
                            ALog.e(TAG, "[ap] merge amdc not first amdc request", null, "isAllowForceAmdc", Boolean.valueOf(isAllowForceAmdcEnable), "cacheFlag", Integer.valueOf(i2));
                            AmdcThreadPoolExecutor.submitTask(new AmdcTask(z, map, i2));
                        }
                    }
                }
                AmdcTask amdcTask3 = new AmdcTask(z, map, i2);
                amdcTask3.isVpnProxy.set(z2);
                amdcTask3.isForceSend.set(z3);
                amdcTask3.statusChangeType.set(i);
                amdcTask3.isForceUpdate.set(true);
                AmdcThreadPoolExecutor.submitTask(amdcTask3);
                ALog.e(TAG, "[ap] addTask, first or vpn amdc request! ", null, "params", map, "isVpnProxy", Boolean.valueOf(z2), "isForceSend", Boolean.valueOf(z3), "isAllowForceAmdc", Boolean.valueOf(isAllowForceAmdcEnable), "cacheFlag", Integer.valueOf(i2));
            }
        } catch (Exception unused) {
        }
    }
}
