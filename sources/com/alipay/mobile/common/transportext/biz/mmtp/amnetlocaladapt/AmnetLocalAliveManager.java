package com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetLocalAliveManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AmnetLocalAliveManager b;

    /* renamed from: a  reason: collision with root package name */
    public int f4198a = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class CheckRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public CheckRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!AmnetClientLocalAdapter.getInstance().isCanShutdown()) {
                NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                LogCatUtil.info("AmnetLocalAliveManager", "[CheckRunnable] Can't shutdown , continue to the next check.");
            } else if (MRpcConnection.getInstance().hasLocalAmnetStream()) {
                NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                LogCatUtil.info("AmnetLocalAliveManager", "[CheckRunnable] Continue to the next check.");
            } else {
                AmnetLocalAliveManager.this.asyncShutdownAmnet();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class ShutdownAmnetRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ShutdownAmnetRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!ExtTransportStrategy.isEnabledTransportByLocalAmnet()) {
                AmnetClientLocalAdapter.getInstance().forceShutdownAmnet();
                LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Switch off, forceShutdownAmnet.");
            } else if (!AmnetClientLocalAdapter.getInstance().isCanShutdown()) {
                NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Can't shutdown , continue to the next check.");
            } else if (MRpcConnection.getInstance().hasLocalAmnetStream()) {
                NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Continue to the next check.");
            } else {
                synchronized (AmnetClientLocalAdapter.getInstance()) {
                    try {
                        if (!AmnetClientLocalAdapter.getInstance().shutdownAmnet()) {
                            NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                            LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Shutdown failed.");
                            return;
                        }
                        LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Shutdown finished.");
                        AmnetLocalAliveManager.access$102(AmnetLocalAliveManager.this, AmnetLocalAliveManager.access$200());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return 2;
    }

    public static /* synthetic */ int access$102(AmnetLocalAliveManager amnetLocalAliveManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d91617e", new Object[]{amnetLocalAliveManager, new Integer(i)})).intValue();
        }
        amnetLocalAliveManager.f4198a = i;
        return i;
    }

    public static /* synthetic */ int access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue();
        }
        return 0;
    }

    public static final AmnetLocalAliveManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetLocalAliveManager) ipChange.ipc$dispatch("3bc07bf4", new Object[0]);
        }
        AmnetLocalAliveManager amnetLocalAliveManager = b;
        if (amnetLocalAliveManager != null) {
            return amnetLocalAliveManager;
        }
        synchronized (AmnetLocalAliveManager.class) {
            try {
                if (b == null) {
                    b = new AmnetLocalAliveManager();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public void asyncShutdownAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af2126", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new ShutdownAmnetRunnable());
        }
    }

    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        if (this.f4198a == 1) {
            return true;
        }
        return false;
    }

    public void startTimerCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d9a58cc", new Object[]{this});
        } else if (this.f4198a != 1) {
            NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), 2, TimeUnit.MINUTES);
            this.f4198a = 1;
            LogCatUtil.info("AmnetLocalAliveManager", "[startTimerCheck] Start finished.");
        }
    }
}
