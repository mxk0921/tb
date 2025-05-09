package anet.channel.util;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.flow.FlowManager;
import anet.channel.flow.FlowStatHelper;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.monitor.caton.CatonStatHelper;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.AmdcPriorityHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c21;
import tb.t2o;
import tb.u11;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class GlobalAppListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.GlobalAppListener";
    public static GlobalAppLifecycleListener globalAppListener = new GlobalAppLifecycleListener();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class GlobalAppLifecycleListener implements NetworkStatusHelper.INetworkStatusChangeListener, GlobalListener, NetworkStatusHelper.IVpnProxyStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(607125940);
            t2o.a(607125819);
            t2o.a(607125941);
            t2o.a(607125820);
        }

        @Override // anet.channel.util.GlobalAppListener.GlobalListener
        public void background() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("550392b5", new Object[]{this});
                return;
            }
            ALog.e(GlobalAppListener.TAG, "GlobalAppListener, enter background", null, new Object[0]);
            AmdcPriorityHelper.updateFile("bg");
            FlowStatHelper.dueToBackgroundFlowStat();
            CatonStatHelper.shutdownThread();
            CatonStatHelper.commitFgCatonStat();
            NetworkStatusHelper.curVpnChangeCount.set(0);
            FlowManager.commitWifiFgUseCellReqStatic(null, FlowManager.curUseCellFlow, 0);
        }

        @Override // anet.channel.util.GlobalAppListener.GlobalListener
        public void forground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5402817", new Object[]{this});
                return;
            }
            ALog.e(GlobalAppListener.TAG, "GlobalAppListener, enter forground", null, new Object[0]);
            FlowStatHelper.dueToForgroundFlowStat();
            CatonStatHelper.commitCatonStat();
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                return;
            }
            ALog.e(GlobalAppListener.TAG, "GlobalAppListener，onNetworkStatusChanged. networkStatus=" + networkStatus, null, new Object[0]);
            CatonStatHelper.updateNetworkChange(true);
            FlowStatHelper.dueToNetworkChangedFlowStat(networkStatus);
            long currentTimeMillis = System.currentTimeMillis();
            GlobalAppRuntimeInfo.setNetworkStatusChangedTime(currentTimeMillis);
            GlobalAppRuntimeInfo.setStatusChangedTime(currentTimeMillis);
        }

        @Override // anet.channel.status.NetworkStatusHelper.IVpnProxyStatusChangeListener
        public void onVpnProxyStatusChanged(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd51090", new Object[]{this, new Boolean(z), new Boolean(z2)});
                return;
            }
            ALog.e(GlobalAppListener.TAG, "GlobalAppListener,onVpnProxyStatusChanged", null, new Object[0]);
            GlobalAppRuntimeInfo.setStatusChangedTime(System.currentTimeMillis());
        }

        public void registerAll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0db8185", new Object[]{this});
                return;
            }
            NetworkStatusHelper.addStatusChangeListener(this);
            NetworkStatusHelper.registerVpnProxyStatusListener(this);
        }

        public void unRegisterAll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fbe05ac", new Object[]{this});
                return;
            }
            NetworkStatusHelper.removeStatusChangeListener(this);
            NetworkStatusHelper.unregisterVpnProxyStatusListener(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface GlobalListener {
        void background();

        void forground();
    }

    static {
        t2o.a(607125937);
    }

    public static /* synthetic */ void access$000(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb9a3d", new Object[]{new Boolean(z)});
        } else {
            notifyApmListener(z);
        }
    }

    private static void notifyApmListener(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18618ae4", new Object[]{new Boolean(z)});
            return;
        }
        String str = "foreground";
        ALog.e(TAG, "GlobalAppListener, notifyListener", null, str, Boolean.valueOf(z));
        IFullTraceAnalysisV3 v3Instance = AnalysisFactory.getV3Instance();
        if (!z) {
            str = "background";
        }
        v3Instance.recordAppStatus("ApmLifecycle", str);
        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.util.GlobalAppListener.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (z) {
                        GlobalAppListener.globalAppListener.forground();
                    } else {
                        GlobalAppListener.globalAppListener.background();
                    }
                } catch (Exception e) {
                    ALog.e(GlobalAppListener.TAG, "GlobalAppListener, notifyListener exception.", null, e, new Object[0]);
                }
            }
        });
    }

    public static void registerApmGlobalAppEventListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dea87f2", new Object[0]);
            return;
        }
        if (globalAppListener == null) {
            globalAppListener = new GlobalAppLifecycleListener();
        }
        globalAppListener.registerAll();
        c21.c(new u11() { // from class: anet.channel.util.GlobalAppListener.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.u11, com.taobao.application.common.IApmEventListener
            public void onEvent(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                } else if (i == 1) {
                    GlobalAppListener.access$000(false);
                } else if (i == 2) {
                    GlobalAppListener.access$000(true);
                }
            }
        });
        ALog.e(TAG, "GlobalAppListener, register globalAppListener success! ", null, new Object[0]);
    }
}
