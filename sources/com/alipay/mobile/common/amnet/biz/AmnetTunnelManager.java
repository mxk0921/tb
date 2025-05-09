package com.alipay.mobile.common.amnet.biz;

import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetResult;
import com.alipay.mobile.common.amnet.api.AmnetStorageListener;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transportext.amnet.AmnetUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetTunnelManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_KEY_ACTIVATE_NUM = "activate_fc";
    public static final String LOG_KEY_IS_PUSH_PROC = "isPush";
    public static final String LOG_KEY_NEW_LIB = "newTun";
    public static final String LOG_KEY_OLD_LIB = "oldTun";
    public static final String LOG_KEY_REASON = "reason";
    public static final String LOG_KEY_RPC_FAILED_NUM = "rpc_fc";
    public static final String LOG_PARAM3 = "soLib";
    public static final String LOG_REASON_ACTIVATE_COUNT = "ACTIVATE_COUNT_LIMIT";
    public static final String LOG_REASON_RPC_FAILED = "RPC_FAILED_LIMIT";
    public static final String LOG_REASON_RPC_FAILED_TO_SUCCESS = "RPC_FAILED_TO_SUCCESS";
    public static final String LOG_REASON_SWITCH = "SWITCH_CHANGE";
    public static final String LOG_SUBTYPE = "TunnelChange";
    public static final String LOG_VAL_BIFROST_LIB = "BIFROST";
    public static final String LOG_VAL_NO_LIB = "NOLIB";
    public static final String LOG_VAL_OLD_LIB = "OLDLIB";
    public static final int PROTOCOL_BIFROST_HTTP2 = 1;
    public static final int PROTOCOL_BIFROST_MMTP = 0;
    public static final int PROTOCOL_BIFROST_MQTT = 2;
    public static final int STATE_BIFROST_LIB = 2;
    public static final int STATE_NO_LIB = 0;
    public static final int STATE_OLD_LIB = 1;
    public static final int ST_DOWNGRADE = 99;
    public static final int ST_IDLE = 0;
    public static final int ST_UPGRADE = 98;
    public static AmnetTunnelManager p = null;
    public static boolean q = true;
    public static long r = 7200;
    public static long s = 1000;
    public static long t = 30;
    public static int u = 3;
    public static int v = 6;
    public static boolean w;
    public static boolean x;
    public static boolean y;
    public static boolean z;

    /* renamed from: a  reason: collision with root package name */
    public volatile int f3898a = 0;
    public volatile int b = 0;
    public volatile int c = 0;
    public int d = 0;
    public int e = 0;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public boolean j = false;
    public boolean k = false;
    public boolean l = true;
    public Boolean m = null;
    public boolean n;
    public boolean o;

    public AmnetTunnelManager() {
        this.n = false;
        this.o = false;
        h();
        this.n = TransportStrategy.isEnabledOnlyUseBifrostH2(AmnetEnvHelper.getAppContext());
        this.o = TransportStrategy.isEnableOnlyBifrostStdH2(AmnetEnvHelper.getAppContext());
    }

    public static /* synthetic */ int access$000(AmnetTunnelManager amnetTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("671d5161", new Object[]{amnetTunnelManager})).intValue();
        }
        return amnetTunnelManager.b;
    }

    public static /* synthetic */ int access$102(AmnetTunnelManager amnetTunnelManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e508148b", new Object[]{amnetTunnelManager, new Integer(i)})).intValue();
        }
        amnetTunnelManager.c = i;
        return i;
    }

    public static /* synthetic */ void access$200(AmnetTunnelManager amnetTunnelManager, String str, String str2, String str3, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d3aa8a", new Object[]{amnetTunnelManager, str, str2, str3, new Boolean(z2)});
        } else {
            amnetTunnelManager.b(str, str2, str3, z2);
        }
    }

    public static AmnetTunnelManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetTunnelManager) ipChange.ipc$dispatch("ee4ed007", new Object[0]);
        }
        AmnetTunnelManager amnetTunnelManager = p;
        if (amnetTunnelManager != null) {
            return amnetTunnelManager;
        }
        synchronized (AmnetTunnelManager.class) {
            try {
                AmnetTunnelManager amnetTunnelManager2 = p;
                if (amnetTunnelManager2 != null) {
                    return amnetTunnelManager2;
                }
                AmnetTunnelManager amnetTunnelManager3 = new AmnetTunnelManager();
                p = amnetTunnelManager3;
                return amnetTunnelManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, String str2, String str3, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfeb4e", new Object[]{this, str, str2, str3, new Boolean(z2)});
            return;
        }
        try {
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType(LOG_SUBTYPE);
            monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType(LOG_SUBTYPE));
            monitorLoggerModel.setParam2("INFO");
            monitorLoggerModel.setParam3(LOG_PARAM3);
            monitorLoggerModel.getExtPramas().put(LOG_KEY_OLD_LIB, str2);
            monitorLoggerModel.getExtPramas().put(LOG_KEY_NEW_LIB, str3);
            monitorLoggerModel.getExtPramas().put("reason", str);
            monitorLoggerModel.getExtPramas().put(LOG_KEY_ACTIVATE_NUM, String.valueOf(this.e));
            monitorLoggerModel.getExtPramas().put(LOG_KEY_RPC_FAILED_NUM, String.valueOf(this.d));
            if (isNowUseBifrostH2()) {
                monitorLoggerModel.getExtPramas().put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST_HTTP2);
                monitorLoggerModel.getExtPramas().put("NETTUNNEL", MonitorLoggerUtils.NETTUNNEL_ULib_h2);
            } else {
                monitorLoggerModel.getExtPramas().put(MonitorLoggerUtils.LIB_VERSION, MonitorLoggerUtils.LIB_VERSION_BIFROST);
            }
            monitorLoggerModel.getExtPramas().put(LOG_KEY_IS_PUSH_PROC, String.valueOf(z2));
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
            LogCatUtil.info("AMNETTunnelManager", "networkTunnel switch perflog:" + monitorLoggerModel.toString());
        } catch (Throwable th) {
            LogCatUtil.error("AMNETTunnelManager", "perfLog exception", th);
        }
    }

    public boolean canUseBifrost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17fc8cd1", new Object[]{this})).booleanValue();
        }
        if (this.n || (w && !isBifrostInDowngrade() && this.c != 99)) {
            return true;
        }
        return false;
    }

    public boolean canUseBifrostH2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37f9173b", new Object[]{this})).booleanValue();
        }
        if (this.n || (x && !isBifrostInDowngrade())) {
            return true;
        }
        return false;
    }

    public final synchronized void d(boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z2), str});
        } else if (y) {
            if (isNowUseBifrost()) {
                if (getState() != 0 && this.c == 0) {
                    b(str, LOG_VAL_BIFROST_LIB, LOG_VAL_OLD_LIB, MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext()));
                    ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getRpcidSet().clear();
                    this.d = 0;
                    this.e = 0;
                    this.f = 0L;
                    this.h = 0L;
                    this.g = 0L;
                    if (z2) {
                        this.g = System.currentTimeMillis();
                        this.k = false;
                    }
                    e(true, true);
                    this.i = System.currentTimeMillis();
                    if (this.n) {
                        LogCatUtil.warn("AMNETTunnelManager", "Do not downgrade, because of onlyUseBifrostH2.");
                        return;
                    }
                    this.c = 99;
                    ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).shutdownAmnet(new AmnetResult() { // from class: com.alipay.mobile.common.amnet.biz.AmnetTunnelManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.common.amnet.api.AmnetResult
                        public void notifyResult(boolean z3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z3)});
                                return;
                            }
                            LogCatUtil.info("AMNETTunnelManager", "downgrade bifrost " + AmnetTunnelManager.access$000(AmnetTunnelManager.this) + ", first shutdown, reuslt=" + z3);
                            if (AmnetTunnelManager.this.getState() != 0) {
                                AmnetTunnelManager.access$102(AmnetTunnelManager.this, 0);
                                return;
                            }
                            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).activateAmnet(new AmnetResult() { // from class: com.alipay.mobile.common.amnet.biz.AmnetTunnelManager.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.mobile.common.amnet.api.AmnetResult
                                public void notifyResult(boolean z4) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z4)});
                                        return;
                                    }
                                    LogCatUtil.info("AMNETTunnelManager", "downgrade bifrost, second activate, result=" + z4);
                                }
                            });
                            AmnetTunnelManager.access$102(AmnetTunnelManager.this, 0);
                        }
                    });
                    LogCatUtil.info("AMNETTunnelManager", "downgrade bifrost done.");
                }
            }
        }
    }

    public final void e(boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z2), new Boolean(z3)});
            return;
        }
        if (z2) {
            try {
                AmnetStorageListener.getInstance().putCommon("bifrost_dg_tm", AmnetUtil.convert(String.valueOf(this.g)));
            } catch (Throwable th) {
                LogCatUtil.error("AMNETTunnelManager", "saveStorageTickTime error: ", th);
                return;
            }
        }
        if (z3) {
            AmnetStorageListener.getInstance().putCommon("bifrost_start_tm", AmnetUtil.convert(String.valueOf(this.h)));
            AmnetStorageListener.getInstance().putCommon("bifrost_start_num", AmnetUtil.convert(String.valueOf(this.e)));
        }
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.g <= 0 || this.n) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.g) {
            this.g = currentTimeMillis;
            e(true, false);
        }
        if (currentTimeMillis - this.g <= r * 1000) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext())) {
            if (TransportStrategy.isDisableBifrostRpcDowngrade() || !y) {
                return false;
            }
        } else if (!z) {
            return false;
        }
        return true;
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.f3898a;
    }

    public boolean isBifrostInDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("490a1288", new Object[]{this})).booleanValue();
        }
        if (y && !TransportStrategy.isDisableBifrostRpcDowngrade()) {
            return f();
        }
        return false;
    }

    public boolean isBifrostLocalInDowngrade() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbaa0963", new Object[]{this})).booleanValue();
        }
        if (this.l) {
            updateBifrostSwitch();
        }
        if (!AmnetSwitchManagerImpl.getInstance().enableBifrostLocalDowngrade()) {
            return false;
        }
        boolean f = f();
        Boolean bool2 = this.m;
        if (bool2 == null || bool2.booleanValue() != f) {
            if (f) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            this.m = bool;
            LogCatUtil.info("AMNETTunnelManager", "[isBifrostLocalInDowngrade] Downgrade state change to " + f);
        }
        return f;
    }

    public boolean isInBifrostStdH2Model() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93fc2f5", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean isNowUseBifrost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a128e14d", new Object[]{this})).booleanValue();
        }
        if (2 == this.f3898a) {
            return true;
        }
        return false;
    }

    public boolean isNowUseBifrostH2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27623cb7", new Object[]{this})).booleanValue();
        }
        if (!isNowUseBifrost() || 1 != this.b) {
            return false;
        }
        return true;
    }

    public boolean isStateIdle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c49e1906", new Object[]{this})).booleanValue();
        }
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public void setBifrostProtocol(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4802d369", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void setState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i)});
        } else {
            this.f3898a = i;
        }
    }

    public final synchronized void c(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
            return;
        }
        if (z2 && isBifrostInDowngrade() && !this.k) {
            this.k = true;
            if (System.currentTimeMillis() - this.g >= 20000) {
                LogCatUtil.warn("AMNETTunnelManager", "rpc success's time bigger than 20000");
            } else {
                b(LOG_REASON_RPC_FAILED_TO_SUCCESS, LOG_VAL_BIFROST_LIB, LOG_VAL_OLD_LIB, MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext()));
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (!this.j) {
                byte[] common = AmnetStorageListener.getInstance().getCommon("bifrost_dg_tm");
                byte[] common2 = AmnetStorageListener.getInstance().getCommon("bifrost_start_tm");
                byte[] common3 = AmnetStorageListener.getInstance().getCommon("bifrost_start_num");
                if (common != null && common.length > 0) {
                    this.g = Long.parseLong(AmnetUtil.convert(common));
                }
                if (common2 != null && common2.length > 0) {
                    this.h = Long.parseLong(AmnetUtil.convert(common2));
                }
                if (common3 != null && common3.length > 0) {
                    this.e = Integer.parseInt(AmnetUtil.convert(common3));
                }
                LogCatUtil.info("AMNETTunnelManager", "stampDownGrade=" + this.g + ", stampActivateAmnet=" + this.h + ", cntActivateAmnetNum=" + this.e);
                this.j = true;
            }
        } catch (Throwable th) {
            LogCatUtil.error("AMNETTunnelManager", th);
        }
    }

    public void updateBifrostSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1b26af", new Object[]{this});
            return;
        }
        try {
            if (this.l) {
                this.l = false;
            }
            this.n = TransportStrategy.isEnabledOnlyUseBifrostH2(AmnetEnvHelper.getAppContext());
            this.o = TransportStrategy.isEnableOnlyBifrostStdH2(AmnetEnvHelper.getAppContext());
            w = AmnetSwitchManagerImpl.getInstance().useBifrost();
            x = AmnetSwitchManagerImpl.getInstance().enableBifrostHttp2();
            y = AmnetSwitchManagerImpl.getInstance().enableBifrostDowngrade();
            z = AmnetSwitchManagerImpl.getInstance().enableBifrostLocalDowngrade();
            r = TransportConfigureManager.getInstance().getLongValue(AmnetConfigureItem.BIFROST_DOWNGRADE_PERIOD);
            s = TransportConfigureManager.getInstance().getLongValue(AmnetConfigureItem.BIFROST_IGNORE_FAILED_RPC_TIME);
            t = TransportConfigureManager.getInstance().getLongValue(AmnetConfigureItem.BIFROST_ACTIVATE_TIME);
            u = TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.BIFROST_ACTIVATE_NUM);
            v = TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.BIFROST_FAILED_RPC_NUM);
            int intValue = TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.LONGLINK_CONN_MAX);
            boolean isNetworkRunInSingleProcess = TransportStrategy.isNetworkRunInSingleProcess(AmnetEnvHelper.getAppContext());
            LogCatUtil.info("AMNETTunnelManager", "updateBifrostSwitch ok, enableBifrost:" + w + ", bifrost_http2:" + x + ", am_bde:" + y + ", b_dp:" + r + ", b_ift:" + s + ", b_at:" + t + ", b_an:" + u + ", b_frn:" + v + ",longconnmax:" + intValue + ", isOnlyUseBifrostH2:" + this.n + ", isNetworkRunSingleProcess:" + isNetworkRunInSingleProcess);
        } catch (Throwable th) {
            LogCatUtil.error("AMNETTunnelManager", "updateBifrostSwitch ", th);
        }
    }

    public final synchronized void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (1 == getState()) {
            if (((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).isInForegound()) {
                LogCatUtil.info("AMNETTunnelManager", "in foregound, do not to upgrade bifrost.");
                return;
            }
            int size = ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getRpcidSet().size();
            if (size > 0) {
                LogCatUtil.warn("AMNETTunnelManager", "there is rpc on road,do not upgrade bifrost,size: " + size);
            } else if (canUseBifrost()) {
                if (getState() != 0 && this.c == 0) {
                    if (System.currentTimeMillis() - this.i < 3000) {
                        LogCatUtil.warn("AMNETTunnelManager", "time limit, do not upgrade");
                        return;
                    }
                    this.d = 0;
                    this.e = 0;
                    this.f = 0L;
                    this.h = 0L;
                    this.g = 0L;
                    e(true, true);
                    this.c = 98;
                    ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).shutdownAmnet(new AmnetResult() { // from class: com.alipay.mobile.common.amnet.biz.AmnetTunnelManager.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.mobile.common.amnet.api.AmnetResult
                        public void notifyResult(boolean z2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z2)});
                                return;
                            }
                            LogCatUtil.info("AMNETTunnelManager", "upgrade bifrost, first shutdown, reuslt=" + z2);
                            if (AmnetTunnelManager.this.getState() != 0) {
                                AmnetTunnelManager.access$102(AmnetTunnelManager.this, 0);
                                return;
                            }
                            ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).activateAmnet(new AmnetResult() { // from class: com.alipay.mobile.common.amnet.biz.AmnetTunnelManager.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.mobile.common.amnet.api.AmnetResult
                                public void notifyResult(boolean z3) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("be5d5a27", new Object[]{this, new Boolean(z3)});
                                        return;
                                    }
                                    LogCatUtil.info("AMNETTunnelManager", "upgrade bifrost " + AmnetTunnelManager.access$000(AmnetTunnelManager.this) + ", second activate, result=" + z3);
                                    AnonymousClass2 r5 = AnonymousClass2.this;
                                    AmnetTunnelManager.access$200(AmnetTunnelManager.this, str, AmnetTunnelManager.LOG_VAL_OLD_LIB, AmnetTunnelManager.LOG_VAL_BIFROST_LIB, MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext()));
                                }
                            });
                            AmnetTunnelManager.access$102(AmnetTunnelManager.this, 0);
                        }
                    });
                    LogCatUtil.info("AMNETTunnelManager", "upgrade bifrost done.");
                }
            }
        }
    }

    public void considerTunnelChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5766ea98", new Object[]{this});
        } else if (getState() == 0) {
            LogCatUtil.warn("AMNETTunnelManager", "now no lib, do not consider change tunnel");
        } else if (isNowUseBifrost() && !w) {
            LogCatUtil.warn("AMNETTunnelManager", "The bifrost switch is off, consider to downgrade.");
            d(false, LOG_REASON_SWITCH);
        } else if (isNowUseBifrostH2() && !x) {
            LogCatUtil.warn("AMNETTunnelManager", "The bifrost http2 switch is off, consider to downgrade.");
            d(false, LOG_REASON_SWITCH);
        } else if (1 != getState() || !w || isBifrostInDowngrade()) {
            LogCatUtil.info("AMNETTunnelManager", "considerTunnelChange end.");
        } else {
            LogCatUtil.warn("AMNETTunnelManager", "The bifrost switch is on, consider to upgrade.");
            a(LOG_REASON_SWITCH);
        }
    }

    public void procActivateTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cad12d", new Object[]{this});
            return;
        }
        boolean z2 = q;
        if (z2) {
            if (z2) {
                q = false;
            }
            updateBifrostSwitch();
            if (g() && w) {
                if (!this.j) {
                    h();
                }
                boolean isRealPushProcess = MiscUtils.isRealPushProcess(AmnetEnvHelper.getAppContext());
                if (isRealPushProcess) {
                    if (isBifrostInDowngrade()) {
                        LogCatUtil.warn("AMNETTunnelManager", "[procActivateTick] bifrost is in downgrade period, do not use.");
                        return;
                    }
                } else if (isBifrostLocalInDowngrade()) {
                    LogCatUtil.warn("AMNETTunnelManager", "[procActivateTick] bifrost is in downgrade period, do not use.");
                    return;
                }
                this.g = 0L;
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.h;
                long j2 = t * 1000;
                LogCatUtil.info("AMNETTunnelManager", "procActivateTick, now = " + currentTimeMillis + ", diffDate = " + j + ", activateTimeLimit = " + j2);
                if (j > j2) {
                    this.e = 0;
                    this.h = currentTimeMillis;
                } else {
                    this.e++;
                }
                if (this.e >= u) {
                    LogCatUtil.warn("AMNETTunnelManager", "AMNET active times overflow. consider downgrade to use old amnet lib");
                    b(LOG_REASON_ACTIVATE_COUNT, LOG_VAL_BIFROST_LIB, LOG_VAL_NO_LIB, isRealPushProcess);
                    this.e = 0;
                    this.h = 0L;
                    this.g = currentTimeMillis;
                }
                e(true, true);
            }
        }
    }

    public synchronized void processRpcResult(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c053a5a", new Object[]{this, new Boolean(z2)});
            return;
        }
        if (isNowUseBifrost() && !isBifrostInDowngrade()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (z2) {
                this.d = 0;
                this.f = 0L;
                return;
            }
            long j = this.f;
            if (currentTimeMillis < j) {
                currentTimeMillis = j;
            }
            if (currentTimeMillis - j >= s) {
                if (NetworkUtils.isNetworkAvailable(AmnetEnvHelper.getAppContext())) {
                    this.d++;
                    this.f = currentTimeMillis;
                    LogCatUtil.warn("AMNETTunnelManager", "add rpc failed num, num=" + this.d);
                    if (this.d >= v) {
                        LogCatUtil.warn("AMNETTunnelManager", "the continuous failed rpc is out of range, num=" + this.d);
                        if (TransportStrategy.isDisableBifrostRpcDowngrade()) {
                            this.d = 0;
                            this.f = 0L;
                            LogCatUtil.warn("AMNETTunnelManager", "DisableBifrostRpcDowngrade, reset the failed num, continue to count");
                            return;
                        }
                        d(true, LOG_REASON_RPC_FAILED);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        c(z2);
    }
}
