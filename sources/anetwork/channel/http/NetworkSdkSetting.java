package anetwork.channel.http;

import android.app.Application;
import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.DetectorCenter;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.detect.NetworkDetector;
import anet.channel.entity.ENV;
import anet.channel.session.dns.NavigationHelper;
import anet.channel.status.HandoverSignalMonitor;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.GlobalAppListener;
import anet.channel.util.Utils;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.monitor.Monitor;
import anetwork.channel.monitor.WifiFgDetector;
import anetwork.channel.unified.QosTaskQueue;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkSdkSetting implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.NetworkSdkSetting";
    private static Context context;
    public static ENV CURRENT_ENV = ENV.ONLINE;
    private static AtomicBoolean isInit = new AtomicBoolean(false);
    private static AtomicBoolean isInitAsync = new AtomicBoolean(false);
    private static HashMap<String, Object> initParams = null;
    private static final Object sLock = new Object();
    private static boolean sInitialized = false;

    static {
        t2o.a(607126060);
    }

    public static /* synthetic */ void access$000(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context2});
        } else {
            initAsyncConfig(context2);
        }
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return context;
    }

    public static void init(final Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context2});
        } else if (context2 != null) {
            try {
                if (isInit.compareAndSet(false, true)) {
                    ALog.e(TAG, "[Launcher] NetworkSdkSetting init start!!!", null, new Object[0]);
                    context = context2;
                    GlobalAppRuntimeInfo.setLaunchTime();
                    GlobalAppRuntimeInfo.setInitTime(System.currentTimeMillis());
                    GlobalAppRuntimeInfo.setContext(context2);
                    AwcnConfig.init(context2);
                    StrategyTemplate.getInstance().loadStrategyInit();
                    initTaobaoAdapter();
                    if (AwcnConfig.isLaunchOptEnable()) {
                        ALog.e(TAG, "[Launcher] NetworkSdkSetting init CookieManager start [1] !!! ", null, "isTbNextLaunch", Boolean.valueOf(AwcnConfig.isTbNextLaunch()), "isLaunchOptV2Opened", Boolean.valueOf(AwcnConfig.isLaunchOptV2Opened()));
                        if (!AwcnConfig.isNotAllowCookieOpened() && !AwcnConfig.isTbNextLaunch()) {
                            CookieManager.setup(context2);
                        }
                        initAsync(context2);
                    } else {
                        if (!AwcnConfig.isLaunchOptOpened()) {
                            initAsync(context2);
                        }
                        if (NetworkConfigCenter.isInitConfigAsync()) {
                            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.http.NetworkSdkSetting.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    Monitor.init();
                                    ALog.e(NetworkSdkSetting.TAG, "[Launcher] NetworkSdkSetting init CookieManager start [2] !!!", null, "isTbNextLaunch", Boolean.valueOf(AwcnConfig.isTbNextLaunch()), "isLaunchOptV2Opened", Boolean.valueOf(AwcnConfig.isLaunchOptV2Opened()));
                                    if (!AwcnConfig.isNotAllowCookieOpened() && !AwcnConfig.isTbNextLaunch()) {
                                        CookieManager.setup(context2);
                                    }
                                    DetectorCenter.init();
                                    NetworkSdkSetting.initAsync(context2);
                                }
                            });
                        } else {
                            Monitor.init();
                            ALog.e(TAG, "[Launcher] NetworkSdkSetting init CookieManager start [3] !!!", null, "isTbNextLaunch", Boolean.valueOf(AwcnConfig.isTbNextLaunch()), "isLaunchOptV2Opened", Boolean.valueOf(AwcnConfig.isLaunchOptV2Opened()));
                            if (!AwcnConfig.isNotAllowCookieOpened() && !AwcnConfig.isTbNextLaunch()) {
                                CookieManager.setup(context2);
                            }
                            DetectorCenter.init();
                            initAsync(context2);
                        }
                    }
                    SessionCenter.init(context2);
                    ALog.e(TAG, "[Launcher] NetworkSdkSetting init end!!!", null, new Object[0]);
                }
            } catch (Throwable th) {
                ALog.e(TAG, "[Launcher] NetworkSdkSetting initial failed!", null, th, new Object[0]);
            }
        }
    }

    public static void initAsync(final Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac695955", new Object[]{context2});
        } else if (isInitAsync.compareAndSet(false, true)) {
            ALog.e(TAG, "[Launcher] NetworkSdkSetting initAsync start!!!", null, new Object[0]);
            NetworkConfigCenter.init();
            AwcnConfig.initAsync(context2);
            initTaobaoAdapterAsync();
            ThreadPoolExecutorFactory.submitHRTask(new Runnable() { // from class: anetwork.channel.http.NetworkSdkSetting.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NetworkSdkSetting.loadTNet(context2);
                    }
                }
            });
            if (NetworkConfigCenter.isInitConfigAsync()) {
                ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.http.NetworkSdkSetting.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NetworkSdkSetting.access$000(context2);
                        }
                    }
                });
            } else {
                initAsyncConfig(context2);
            }
            ALog.e(TAG, "[Launcher] NetworkSdkSetting initAsync end!!!", null, new Object[0]);
        }
    }

    private static void initAsyncConfig(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde00633", new Object[]{context2});
            return;
        }
        if (context2 == null) {
            context2 = GlobalAppRuntimeInfo.getContext();
        }
        if (context2 != null) {
            Monitor.init();
            if (!AwcnConfig.isNotAllowCookieOpened() && !AwcnConfig.isTbNextLaunch()) {
                CookieManager.setup(context2);
            }
            DetectorCenter.init();
            GlobalAppListener.registerApmGlobalAppEventListener();
            HandoverSignalMonitor.initialize(context2);
            if (GlobalAppRuntimeInfo.getCurrentProcess() != null && "com.taobao.taobao".equals(GlobalAppRuntimeInfo.getCurrentProcess())) {
                WifiFgDetector.registerListener();
            }
            NetworkStatusHelper.startListener(context2);
            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                NetworkDetector.registerListener();
            }
        }
    }

    public static void loadTNet(final Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0238f2", new Object[]{context2});
        } else if (AwcnConfig.isLaunchOptV2Opened()) {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anetwork.channel.http.NetworkSdkSetting.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        SpdyAgent.getInstance(context2, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        } else {
            SpdyAgent.getInstance(context2, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        }
    }

    public static void setTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{str});
        } else {
            GlobalAppRuntimeInfo.setTtid(str);
        }
    }

    private static void initTaobaoAdapterAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764abcf2", new Object[0]);
            return;
        }
        try {
            Utils.invokeStaticMethodThrowException("anet.channel.TaobaoNetworkAdapter", "initAsync", new Class[]{Context.class}, context);
            ALog.i(TAG, "init async taobao adapter success", null, new Object[0]);
        } catch (Throwable th) {
            ALog.e(TAG, "initTaobaoAdapterAsync failed. maybe not taobao app", null, th, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:8:0x001b, B:12:0x0025, B:14:0x0035, B:16:0x0039, B:19:0x0046, B:21:0x004a, B:25:0x0055, B:27:0x005e, B:28:0x0065, B:30:0x0098, B:31:0x009b, B:32:0x00b3), top: B:36:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void initInner(android.app.Application r6, java.util.HashMap<java.lang.String, java.lang.Object> r7) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = anetwork.channel.http.NetworkSdkSetting.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = "fa348da1"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0016:
            java.lang.String r2 = "anet.NetworkSdkSetting"
            r3 = 0
            if (r7 == 0) goto L_0x00b3
            boolean r4 = r7.isEmpty()     // Catch: Exception -> 0x0044
            if (r4 != 0) goto L_0x00b3
            if (r6 != 0) goto L_0x0025
            goto L_0x00b3
        L_0x0025:
            java.lang.String r4 = "[Launcher] Network SDK init start"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: Exception -> 0x0044
            anet.channel.util.ALog.e(r2, r4, r3, r5)     // Catch: Exception -> 0x0044
            java.lang.String r4 = "envIndex"
            java.lang.Object r4 = r7.get(r4)     // Catch: Exception -> 0x0044
            if (r4 == 0) goto L_0x0051
            boolean r5 = r4 instanceof java.lang.String     // Catch: Exception -> 0x0044
            if (r5 == 0) goto L_0x0046
            java.lang.String r4 = (java.lang.String) r4     // Catch: Exception -> 0x0044
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: Exception -> 0x0044
            int r4 = r4.intValue()     // Catch: Exception -> 0x0044
            goto L_0x0052
        L_0x0044:
            r6 = move-exception
            goto L_0x00bb
        L_0x0046:
            boolean r5 = r4 instanceof java.lang.Number     // Catch: Exception -> 0x0044
            if (r5 == 0) goto L_0x0051
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: Exception -> 0x0044
            int r4 = r4.intValue()     // Catch: Exception -> 0x0044
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == r0) goto L_0x0055
            goto L_0x0065
        L_0x0055:
            java.lang.String r0 = "isNextLaunch"
            boolean r0 = r7.containsKey(r0)     // Catch: Exception -> 0x0044
            if (r0 == 0) goto L_0x0065
            anet.channel.entity.ENV r0 = anet.channel.entity.ENV.PREPARE     // Catch: Exception -> 0x0044
            anetwork.channel.http.NetworkSdkSetting.CURRENT_ENV = r0     // Catch: Exception -> 0x0044
            anet.channel.GlobalAppRuntimeInfo.setEnv(r0)     // Catch: Exception -> 0x0044
        L_0x0065:
            java.lang.String r0 = "onlineAppKey"
            java.lang.Object r0 = r7.get(r0)     // Catch: Exception -> 0x0044
            java.lang.String r0 = (java.lang.String) r0     // Catch: Exception -> 0x0044
            anet.channel.GlobalAppRuntimeInfo.setAppkey(r0)     // Catch: Exception -> 0x0044
            java.lang.String r0 = "ttid"
            java.lang.Object r0 = r7.get(r0)     // Catch: Exception -> 0x0044
            java.lang.String r0 = (java.lang.String) r0     // Catch: Exception -> 0x0044
            anet.channel.GlobalAppRuntimeInfo.setTtid(r0)     // Catch: Exception -> 0x0044
            java.lang.String r0 = "deviceId"
            java.lang.Object r0 = r7.get(r0)     // Catch: Exception -> 0x0044
            java.lang.String r0 = (java.lang.String) r0     // Catch: Exception -> 0x0044
            anet.channel.GlobalAppRuntimeInfo.setUtdid(r0)     // Catch: Exception -> 0x0044
            java.lang.String r0 = "process"
            java.lang.Object r0 = r7.get(r0)     // Catch: Exception -> 0x0044
            java.lang.String r0 = (java.lang.String) r0     // Catch: Exception -> 0x0044
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: Exception -> 0x0044
            if (r4 != 0) goto L_0x009b
            anet.channel.GlobalAppRuntimeInfo.setCurrentProcess(r0)     // Catch: Exception -> 0x0044
        L_0x009b:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: Exception -> 0x0044
            r0.<init>(r7)     // Catch: Exception -> 0x0044
            anetwork.channel.http.NetworkSdkSetting.initParams = r0     // Catch: Exception -> 0x0044
            android.content.Context r6 = r6.getApplicationContext()     // Catch: Exception -> 0x0044
            init(r6)     // Catch: Exception -> 0x0044
            anetwork.channel.http.NetworkSdkSetting.initParams = r3     // Catch: Exception -> 0x0044
            java.lang.String r6 = "[Launcher] Network SDK init end"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: Exception -> 0x0044
            anet.channel.util.ALog.e(r2, r6, r3, r7)     // Catch: Exception -> 0x0044
            goto L_0x00c2
        L_0x00b3:
            java.lang.String r6 = "[Launcher] Network SDK init failed! params null, application null! "
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: Exception -> 0x0044
            anet.channel.util.ALog.e(r2, r6, r3, r7)     // Catch: Exception -> 0x0044
            return
        L_0x00bb:
            java.lang.String r7 = "[Launcher] Network SDK initial failed!"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            anet.channel.util.ALog.e(r2, r7, r3, r6, r0)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.http.NetworkSdkSetting.initInner(android.app.Application, java.util.HashMap):void");
    }

    private static void initTaobaoAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8374318", new Object[0]);
            return;
        }
        try {
            Utils.invokeStaticMethodThrowException("anet.channel.TaobaoNetworkAdapter", "init", new Class[]{Context.class, HashMap.class}, context, initParams);
            if (GlobalAppRuntimeInfo.getCurrentProcess() != null && "com.taobao.taobao".equals(GlobalAppRuntimeInfo.getCurrentProcess())) {
                NavigationHelper.setup(QosTaskQueue.getInstance());
            }
            ALog.i(TAG, "init taobao adapter success", null, new Object[0]);
        } catch (Throwable th) {
            ALog.e(TAG, "initTaobaoAdapter failed. maybe not taobao app", null, th, new Object[0]);
        }
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        Object obj = sLock;
        synchronized (obj) {
            try {
                if (!sInitialized) {
                    if (hashMap == null && application == null) {
                        application = GlobalAppRuntimeInfo.getApplication();
                        hashMap = GlobalAppRuntimeInfo.getBasicParams();
                        ALog.e(TAG, "[Launcher] Launch use basic application or params!", null, new Object[0]);
                        if (hashMap == null || hashMap.isEmpty() || application == null) {
                            ALog.e(TAG, "[Launcher] Launch basic application or params is null!", null, new Object[0]);
                            return;
                        }
                    }
                    initInner(application, hashMap);
                    sInitialized = true;
                    obj.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
