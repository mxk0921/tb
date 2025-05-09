package com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt;

import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetLocalTunnelManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AmnetLocalTunnelManager d;

    /* renamed from: a  reason: collision with root package name */
    public int f4201a = 0;
    public int b = 0;
    public int c = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class CheckerRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public CheckerRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!ExtTransportStrategy.isEnabledTransportByLocalAmnet()) {
                LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] Local amnet disabled.");
            } else if (!ExtTransportTunnelWatchdog.getInstance().isDowngraded()) {
                LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] Currently not downgraded.");
            } else {
                AmnetLocalTunnelManager.access$004(AmnetLocalTunnelManager.this);
                if (AmnetLocalTunnelManager.access$000(AmnetLocalTunnelManager.this) >= 10) {
                    AmnetLocalTunnelManager.access$100(AmnetLocalTunnelManager.this);
                    LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] check out limit.");
                } else if (AmnetHelper.isAmnetActivite()) {
                    AmnetLocalTunnelManager.access$204(AmnetLocalTunnelManager.this);
                    if (AmnetLocalTunnelManager.access$200(AmnetLocalTunnelManager.this) < 3) {
                        AmnetLocalTunnelManager.access$300(AmnetLocalTunnelManager.this);
                        LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] check success, count = " + AmnetLocalTunnelManager.access$200(AmnetLocalTunnelManager.this));
                        return;
                    }
                    ExtTransportTunnelWatchdog.getInstance().resetDowngradeFlag();
                    AmnetLocalTunnelManager.access$100(AmnetLocalTunnelManager.this);
                    LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] reset downgrade finished.");
                } else if (10 - AmnetLocalTunnelManager.access$000(AmnetLocalTunnelManager.this) < 3) {
                    AmnetLocalTunnelManager.access$100(AmnetLocalTunnelManager.this);
                    LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] Insufficient remaining available.");
                } else {
                    AmnetLocalTunnelManager.access$202(AmnetLocalTunnelManager.this, 0);
                    AmnetLocalTunnelManager.access$300(AmnetLocalTunnelManager.this);
                    LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] check limit.");
                }
            }
        }
    }

    public static /* synthetic */ int access$000(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac0bb363", new Object[]{amnetLocalTunnelManager})).intValue();
        }
        return amnetLocalTunnelManager.c;
    }

    public static /* synthetic */ int access$004(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42b92567", new Object[]{amnetLocalTunnelManager})).intValue();
        }
        int i = amnetLocalTunnelManager.c + 1;
        amnetLocalTunnelManager.c = i;
        return i;
    }

    public static /* synthetic */ void access$100(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451f3b1", new Object[]{amnetLocalTunnelManager});
        } else {
            amnetLocalTunnelManager.b();
        }
    }

    public static /* synthetic */ int access$200(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc9833e5", new Object[]{amnetLocalTunnelManager})).intValue();
        }
        return amnetLocalTunnelManager.b;
    }

    public static /* synthetic */ int access$202(AmnetLocalTunnelManager amnetLocalTunnelManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35ef2482", new Object[]{amnetLocalTunnelManager, new Integer(i)})).intValue();
        }
        amnetLocalTunnelManager.b = i;
        return i;
    }

    public static /* synthetic */ int access$204(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9345a5e9", new Object[]{amnetLocalTunnelManager})).intValue();
        }
        int i = amnetLocalTunnelManager.b + 1;
        amnetLocalTunnelManager.b = i;
        return i;
    }

    public static /* synthetic */ void access$300(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24de7433", new Object[]{amnetLocalTunnelManager});
        } else {
            amnetLocalTunnelManager.a();
        }
    }

    public static final AmnetLocalTunnelManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetLocalTunnelManager) ipChange.ipc$dispatch("1e8ef7fd", new Object[0]);
        }
        AmnetLocalTunnelManager amnetLocalTunnelManager = d;
        if (amnetLocalTunnelManager != null) {
            return amnetLocalTunnelManager;
        }
        synchronized (AmnetLocalTunnelManager.class) {
            try {
                AmnetLocalTunnelManager amnetLocalTunnelManager2 = d;
                if (amnetLocalTunnelManager2 != null) {
                    return amnetLocalTunnelManager2;
                }
                AmnetLocalTunnelManager amnetLocalTunnelManager3 = new AmnetLocalTunnelManager();
                d = amnetLocalTunnelManager3;
                return amnetLocalTunnelManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.schedule(new CheckerRunnable(), 1L, TimeUnit.MINUTES);
        }
    }

    public final synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = 0;
        this.c = 0;
        this.f4201a = 0;
    }

    public boolean isBifrostInDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("490a1288", new Object[]{this})).booleanValue();
        }
        return AmnetTunnelManager.getInstance().isBifrostLocalInDowngrade();
    }

    public void startCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290cf4d", new Object[]{this});
        } else if (!ExtTransportTunnelWatchdog.getInstance().isDowngraded()) {
            LogCatUtil.info("AmnetLocalTunnelManager", "[startCheck] Currently not downgraded.");
        } else if (this.f4201a != 1) {
            synchronized (this) {
                try {
                    if (this.f4201a != 1) {
                        a();
                        this.f4201a = 1;
                        LogCatUtil.info("AmnetLocalTunnelManager", "[startCheck] ");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean isCanLocalAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1369f6b7", new Object[]{this})).booleanValue();
        }
        if (!ExtTransportStrategy.isEnabledTransportByLocalAmnet()) {
            return false;
        }
        if (!isBifrostInDowngrade()) {
            return true;
        }
        TransportStrategy.setEnabledLocamAmnetCacheFlag(false);
        LogCatUtil.debug("AmnetLocalTunnelManager", "isCanLocalAmnet return false,as bifrost in downgrade");
        return false;
    }
}
