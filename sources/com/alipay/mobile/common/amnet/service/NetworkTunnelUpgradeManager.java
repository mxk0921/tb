package com.alipay.mobile.common.amnet.service;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetResult;
import com.alipay.mobile.common.amnet.api.model.AskConnStateCallback;
import com.alipay.mobile.common.amnet.service.ipcservice.OutEventListener;
import com.alipay.mobile.common.amnet.service.ipcservice.OutEventNotifyServiceImpl;
import com.alipay.mobile.common.amnet.service.util.AmnetManagerFactory;
import com.alipay.mobile.common.amnet.service.util.PushIpcHelper;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.config.db.NetworkConfigDAO;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.strategy.TunnelChangeEventModel;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.utils.config.ConfigureChangedListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Observable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import tb.a2n;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkTunnelUpgradeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static NetworkTunnelUpgradeManager c = null;
    public static int d = 180000;
    public static int e = 1200000;
    public static int f = 900000;

    /* renamed from: a  reason: collision with root package name */
    public ScheduledFuture<?> f3912a;
    public boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class ActivateAmnetResult implements AmnetResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ActivateAmnetResult() {
        }

        @Override // com.alipay.mobile.common.amnet.api.AmnetResult
        public void notifyResult(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z)});
                return;
            }
            LogCatUtil.info("NetworkTunnelUpgradeManager", "ActivateAmnetResult. amnet activate result: " + z);
            if (z) {
                AmnetManagerFactory.getInstance().shutdownAmnet(new AmnetResult() { // from class: com.alipay.mobile.common.amnet.service.NetworkTunnelUpgradeManager.ActivateAmnetResult.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.common.amnet.api.AmnetResult
                    public void notifyResult(boolean z2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z2)});
                            return;
                        }
                        LogCatUtil.info("NetworkTunnelUpgradeManager", "ActivateAmnetResult. shutdown amnet result: " + z2);
                        NetworkAsyncTaskExecutor.executeIO(new InnerDoUpgradeRunnable());
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class InnerAskConnStateCallback implements AskConnStateCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public InnerAskConnStateCallback() {
        }

        @Override // com.alipay.mobile.common.amnet.api.model.AskConnStateCallback
        public void callback(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5331c237", new Object[]{this, new Integer(i)});
            } else if (NetworkTunnelUpgradeManager.access$300(NetworkTunnelUpgradeManager.this)) {
                LogCatUtil.info("NetworkTunnelUpgradeManager", "InnerActivateAmnetCallback state: " + i);
                if (-1 == i) {
                    AmnetManagerFactory.getInstance().activateAmnet(new ActivateAmnetResult());
                } else {
                    NetworkAsyncTaskExecutor.executeIO(new InnerDoUpgradeRunnable());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class InnerConfigureChangedListener implements ConfigureChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public InnerConfigureChangedListener() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            } else {
                NetworkTunnelUpgradeManager.access$1000(NetworkTunnelUpgradeManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class InnerDoUpgradeRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public InnerDoUpgradeRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (NetworkTunnelUpgradeManager.access$400(NetworkTunnelUpgradeManager.this)) {
                TransportConfigureManager instance = TransportConfigureManager.getInstance();
                TransportConfigureItem transportConfigureItem = TransportConfigureItem.AMNET_SWITCH;
                instance.setValue(transportConfigureItem, a2n.ARCH_BIT64);
                HashMap hashMap = new HashMap(1);
                hashMap.put(transportConfigureItem.getConfigName(), a2n.ARCH_BIT64);
                TransportConfigureManager.getInstance().updateConfig(AmnetEnvHelper.getAppContext(), hashMap, NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
                UpgradeRecordHelper.updateUpgradeRecordInfo();
                NetworkTunnelUpgradeManager.access$500(NetworkTunnelUpgradeManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class InnerNetworkTunnelChangedListener implements NetworkTunnelChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final NetworkTunnelUpgradeManager f3913a;

        public InnerNetworkTunnelChangedListener(NetworkTunnelUpgradeManager networkTunnelUpgradeManager) {
            this.f3913a = networkTunnelUpgradeManager;
        }

        @Override // com.alipay.mobile.common.transport.strategy.NetworkTunnelChangedListener, java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            } else if (!(obj instanceof TunnelChangeEventModel)) {
                LogCatUtil.warn("NetworkTunnelUpgradeManager", "model not instance of TunnelChangeEventModel");
            } else if (((TunnelChangeEventModel) obj).newTunnelType == 3) {
                LogCatUtil.info("NetworkTunnelUpgradeManager", "new tunnel is amnet, don't execute upgrade task.");
            } else {
                NetworkTunnelUpgradeManager.access$200(this.f3913a, NetworkTunnelUpgradeManager.access$100());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class InnerOutEventListener extends OutEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public InnerOutEventListener() {
        }

        public static /* synthetic */ Object ipc$super(InnerOutEventListener innerOutEventListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/service/NetworkTunnelUpgradeManager$InnerOutEventListener");
        }

        @Override // com.alipay.mobile.common.amnet.service.ipcservice.OutEventListener
        public void onAppResumeEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7efc9c52", new Object[]{this});
            } else {
                NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.NetworkTunnelUpgradeManager.InnerOutEventListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        LogCatUtil.info("NetworkTunnelUpgradeManager", "onAppResumeEvent.");
                        NetworkTunnelUpgradeManager.this.startUpgradeTimer();
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class StartUpgradeTimerRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public StartUpgradeTimerRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (NetworkTunnelUpgradeManager.access$300(NetworkTunnelUpgradeManager.this)) {
                AmnetManagerFactory.getInstance().askConnState(new InnerAskConnStateCallback());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class UpgradeRecordHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static final long getNextUpgradeTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("33b0305b", new Object[0])).longValue();
            }
            try {
                String config = NetworkConfigDAO.getInstance().getConfig(NetworkTunnelUpgradeManager.access$900());
                if (TextUtils.isEmpty(config)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    LogCatUtil.info("NetworkTunnelUpgradeManager", "getNextUpgradeTime. upgradeRecordInfoJson is empty, use currentTimeMillis: " + currentTimeMillis);
                    return currentTimeMillis;
                }
                JSONObject jSONObject = new JSONObject(config);
                long optLong = jSONObject.optLong(NetworkTunnelUpgradeManager.access$600());
                long currentTimeMillis2 = System.currentTimeMillis();
                if (optLong > currentTimeMillis2) {
                    LogCatUtil.info("NetworkTunnelUpgradeManager", "getNextUpgradeTime. (lastTimeUpgrade:" + optLong + ") great than (currentTimeMillis:" + currentTimeMillis2 + "). use:" + currentTimeMillis2);
                    return currentTimeMillis2;
                }
                long optLong2 = jSONObject.optLong(NetworkTunnelUpgradeManager.access$700());
                if (optLong2 <= currentTimeMillis2) {
                    LogCatUtil.info("NetworkTunnelUpgradeManager", "getNextUpgradeTime. (nextTime:" + optLong2 + ") less equal than (curTimeMillis:" + currentTimeMillis2 + "), use :" + currentTimeMillis2);
                    return currentTimeMillis2;
                }
                LogCatUtil.info("NetworkTunnelUpgradeManager", "getNextUpgradeTime. nextTime: " + optLong2);
                return optLong2;
            } catch (Throwable th) {
                LogCatUtil.warn("NetworkTunnelUpgradeManager", "getNextUpgradeTime fail", th);
                long currentTimeMillis3 = System.currentTimeMillis();
                LogCatUtil.info("NetworkTunnelUpgradeManager", "getNextUpgradeTime. use curTime:" + currentTimeMillis3);
                return currentTimeMillis3;
            }
        }

        public static final void updateUpgradeRecordInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e41f599", new Object[0]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String str = null;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NetworkTunnelUpgradeManager.access$600(), currentTimeMillis);
                jSONObject.put(NetworkTunnelUpgradeManager.access$700(), currentTimeMillis + NetworkTunnelUpgradeManager.access$800());
                str = jSONObject.toString();
                NetworkConfigDAO.getInstance().saveOrUpdateConfig(NetworkTunnelUpgradeManager.access$900(), str);
                LogCatUtil.info("NetworkTunnelUpgradeManager", "updateUpgradeRecordInfo. update finish, json : " + str);
            } catch (Throwable th) {
                LogCatUtil.warn("NetworkTunnelUpgradeManager", "Update upgrade record fail.  json content: " + str, th);
            }
        }
    }

    public static /* synthetic */ void access$000(NetworkTunnelUpgradeManager networkTunnelUpgradeManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785cb63f", new Object[]{networkTunnelUpgradeManager, new Long(j)});
        } else {
            networkTunnelUpgradeManager.d(j);
        }
    }

    public static /* synthetic */ int access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue();
        }
        return f;
    }

    public static /* synthetic */ void access$1000(NetworkTunnelUpgradeManager networkTunnelUpgradeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c982ad4", new Object[]{networkTunnelUpgradeManager});
        } else {
            networkTunnelUpgradeManager.a();
        }
    }

    public static /* synthetic */ void access$200(NetworkTunnelUpgradeManager networkTunnelUpgradeManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8b0d3c", new Object[]{networkTunnelUpgradeManager, new Integer(i)});
        } else {
            networkTunnelUpgradeManager.b(i);
        }
    }

    public static /* synthetic */ boolean access$300(NetworkTunnelUpgradeManager networkTunnelUpgradeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8bae56c", new Object[]{networkTunnelUpgradeManager})).booleanValue();
        }
        return networkTunnelUpgradeManager.g();
    }

    public static /* synthetic */ boolean access$400(NetworkTunnelUpgradeManager networkTunnelUpgradeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c69102d", new Object[]{networkTunnelUpgradeManager})).booleanValue();
        }
        return networkTunnelUpgradeManager.f();
    }

    public static /* synthetic */ void access$500(NetworkTunnelUpgradeManager networkTunnelUpgradeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40173aea", new Object[]{networkTunnelUpgradeManager});
        } else {
            networkTunnelUpgradeManager.h();
        }
    }

    public static /* synthetic */ String access$600() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("582c4343", new Object[0]);
        }
        return "last_time_upgrade";
    }

    public static /* synthetic */ String access$700() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("542dd222", new Object[0]);
        }
        return "next_time_upgrade";
    }

    public static /* synthetic */ int access$800() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6407e172", new Object[0])).intValue();
        }
        return e;
    }

    public static /* synthetic */ String access$900() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c30efe0", new Object[0]);
        }
        return "record_upgrade_info";
    }

    public static final NetworkTunnelUpgradeManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkTunnelUpgradeManager) ipChange.ipc$dispatch("b308a3f2", new Object[0]);
        }
        NetworkTunnelUpgradeManager networkTunnelUpgradeManager = c;
        if (networkTunnelUpgradeManager != null) {
            return networkTunnelUpgradeManager;
        }
        synchronized (NetworkTunnelUpgradeManager.class) {
            try {
                NetworkTunnelUpgradeManager networkTunnelUpgradeManager2 = c;
                if (networkTunnelUpgradeManager2 != null) {
                    return networkTunnelUpgradeManager2;
                }
                NetworkTunnelUpgradeManager networkTunnelUpgradeManager3 = new NetworkTunnelUpgradeManager();
                c = networkTunnelUpgradeManager3;
                return networkTunnelUpgradeManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void lightUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d3c4658", new Object[0]);
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.NetworkTunnelUpgradeManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!TransportStrategy.isEnabledAutoUpgrade()) {
                        LogCatUtil.info("NetworkTunnelUpgradeManager", "initialized. switch off, don't initialized.");
                    } else {
                        NetworkTunnelUpgradeManager.getInstance().init();
                    }
                }
            });
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.DURATION_PROCESS_SURVIVAL);
        e = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.UPGRADLE_INTERVAL);
        f = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.DOWNGRADE_SCEN_TRIG_UPGRADE_INTERVAL);
        LogCatUtil.info("NetworkTunnelUpgradeManager", "Config update finish. DURATION_PROCESS_SURVIVAL=" + d + ", UPGRADLE_INTERVAL=" + e + ", DOWNGRADE_SCEN_TRIG_UPGRADE_INTERVAL=" + f);
    }

    public final void b(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.NetworkTunnelUpgradeManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NetworkTunnelUpgradeManager.access$000(NetworkTunnelUpgradeManager.this, i);
                    }
                }
            });
        }
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f3912a;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            synchronized (this) {
                try {
                    ScheduledFuture<?> scheduledFuture2 = this.f3912a;
                    if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                        this.f3912a = NetworkAsyncTaskExecutor.schedule(new StartUpgradeTimerRunnable(), j, TimeUnit.MILLISECONDS);
                        LogCatUtil.info("NetworkTunnelUpgradeManager", "doStartUpgradeTimer finish. delay : " + j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void canceUpgradeTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154bfee2", new Object[]{this});
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f3912a;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            try {
                this.f3912a.cancel(true);
            } catch (Throwable th) {
                LogCatUtil.error("NetworkTunnelUpgradeManager", "cancel future error. ", th);
            }
        }
    }

    public final void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else if (e()) {
            c(j);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setBizType(NetworkServiceTracer.REPORT_SUB_NAME_RPC);
            monitorLoggerModel.setSubType("UpgradeAmnet");
            monitorLoggerModel.setParam1(NetworkServiceTracer.REPORT_SUB_NAME_RPC);
            monitorLoggerModel.setParam2("INFO");
            MonitorInfoUtil.record(monitorLoggerModel);
            LogCatUtil.info("UPGRADE_AMNET_PERF", monitorLoggerModel.toString());
        } catch (Throwable th) {
            LogCatUtil.error("NetworkTunnelUpgradeManager", "[perfLog] Excetion: " + th.toString(), th);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (e()) {
            long nextUpgradeTime = UpgradeRecordHelper.getNextUpgradeTime();
            long j = d;
            long currentTimeMillis = System.currentTimeMillis();
            if (nextUpgradeTime > currentTimeMillis) {
                j = nextUpgradeTime - currentTimeMillis;
                LogCatUtil.info("NetworkTunnelUpgradeManager", "innerStartUpgradeTimer. (nextUpgradeTime:" + nextUpgradeTime + ") - (currentTimeMillis:" + currentTimeMillis + ") = (delay:" + j + f7l.BRACKET_END_STR);
                int i = d;
                if (j < i) {
                    j = i;
                    LogCatUtil.info("NetworkTunnelUpgradeManager", "innerStartUpgradeTimer. delay less than DURATION_PROCESS_SURVIVAL, use DURATION_PROCESS_SURVIVAL:" + d);
                }
            } else {
                LogCatUtil.info("NetworkTunnelUpgradeManager", "innerStartUpgradeTimer. (nextUpgradeTime:" + nextUpgradeTime + ") <= (currentTimeMillis:" + currentTimeMillis + ")  use DURATION_PROCESS_SURVIVAL:" + d);
            }
            d(j);
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            ((OutEventNotifyServiceImpl) OutEventNotifyServiceImpl.getInstance()).addOutEventListener(new InnerOutEventListener());
            NetworkTunnelStrategy.getInstance().addNetworkTunnelChangedListener(new InnerNetworkTunnelChangedListener(this));
            TransportConfigureManager.getInstance().addConfigureChangedListener(new InnerConfigureChangedListener());
            a();
            i();
        }
    }

    public void startUpgradeTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb78b12", new Object[]{this});
            return;
        }
        if (!this.b) {
            init();
        }
        i();
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!TransportStrategy.isEnabledAutoUpgrade()) {
            LogCatUtil.info("NetworkTunnelUpgradeManager", "isEnabledUpgradleWithCanUseAmnet. switch off, don't doStartUpgradeTimer.");
            return false;
        } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            return true;
        } else {
            LogCatUtil.info("NetworkTunnelUpgradeManager", "isEnabledUpgradleWithCanUseAmnet. current use amnet, don't doStartUpgradeTimer.");
            return false;
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (TransportStrategy.isEnabledAutoUpgrade()) {
            return g();
        }
        LogCatUtil.info("NetworkTunnelUpgradeManager", "isCanDoUpgrade. switch off, return false.");
        return false;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            LogCatUtil.info("NetworkTunnelUpgradeManager", "preIsCanDoUpgrade. can use amnet, return false.");
            return false;
        } else if (PushIpcHelper.hasRegister()) {
            return true;
        } else {
            LogCatUtil.info("NetworkTunnelUpgradeManager", "preIsCanDoUpgrade. no main proc bind, return false.");
            return false;
        }
    }
}
