package com.alipay.mobile.common.transport.strategy;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.utils.config.ConfigureChangedListener;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetworkTunnelStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TUNNEL_TYPE_AMNET = 3;
    public static final int TUNNEL_TYPE_ORIGINAL = 1;
    public static final int TUNNEL_TYPE_SPDY = 2;
    public static final int TUNNEL_TYPE_UNINIT = -1;
    public static NetworkTunnelStrategy j;

    /* renamed from: a  reason: collision with root package name */
    public NetworkTunnelChangedObservible f4135a;
    public NetworkConfigureChangedListener b;
    public Context g;
    public String h;
    public int c = -1;
    public int d = -1;
    public boolean e = false;
    public boolean f = false;
    public boolean i = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class NetworkConfigureChangedListener implements ConfigureChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public NetworkConfigureChangedListener() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
                return;
            }
            try {
                LogCatUtil.debug("NetworkTunnelStrategy", "update change");
                if (NetworkTunnelStrategy.access$000(NetworkTunnelStrategy.this) == null) {
                    LogCatUtil.error("NetworkTunnelStrategy", "Context is null. so dangerous!!");
                    return;
                }
                NetworkTunnelStrategy.access$100(NetworkTunnelStrategy.this);
                if (NetworkTunnelStrategy.access$200(NetworkTunnelStrategy.this) != NetworkTunnelStrategy.access$300(NetworkTunnelStrategy.this)) {
                    int access$300 = NetworkTunnelStrategy.access$300(NetworkTunnelStrategy.this);
                    NetworkTunnelStrategy networkTunnelStrategy = NetworkTunnelStrategy.this;
                    NetworkTunnelStrategy.access$302(networkTunnelStrategy, NetworkTunnelStrategy.access$200(networkTunnelStrategy));
                    TunnelChangeEventModel tunnelChangeEventModel = new TunnelChangeEventModel();
                    tunnelChangeEventModel.currentTunnelType = access$300;
                    tunnelChangeEventModel.newTunnelType = NetworkTunnelStrategy.access$200(NetworkTunnelStrategy.this);
                    NetworkTunnelStrategy.this.notifyTunnelChanged(tunnelChangeEventModel);
                }
            } catch (Throwable th) {
                LogCatUtil.error("NetworkTunnelStrategy", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class NetworkTunnelChangedObservible extends Observable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public NetworkTunnelChangedObservible() {
        }

        public static /* synthetic */ Object ipc$super(NetworkTunnelChangedObservible networkTunnelChangedObservible, String str, Object... objArr) {
            if (str.hashCode() == -310743881) {
                super.notifyObservers(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/strategy/NetworkTunnelStrategy$NetworkTunnelChangedObservible");
        }

        @Override // java.util.Observable
        public void notifyObservers(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed7a6cb7", new Object[]{this, obj});
                return;
            }
            setChanged();
            super.notifyObservers(obj);
        }
    }

    public NetworkTunnelStrategy() {
        q();
    }

    public static /* synthetic */ Context access$000(NetworkTunnelStrategy networkTunnelStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5974dc1", new Object[]{networkTunnelStrategy});
        }
        return networkTunnelStrategy.g;
    }

    public static /* synthetic */ void access$100(NetworkTunnelStrategy networkTunnelStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3caa72e8", new Object[]{networkTunnelStrategy});
        } else {
            networkTunnelStrategy.f();
        }
    }

    public static /* synthetic */ int access$200(NetworkTunnelStrategy networkTunnelStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("571b6bfa", new Object[]{networkTunnelStrategy})).intValue();
        }
        return networkTunnelStrategy.d;
    }

    public static /* synthetic */ int access$300(NetworkTunnelStrategy networkTunnelStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("718c6519", new Object[]{networkTunnelStrategy})).intValue();
        }
        return networkTunnelStrategy.c;
    }

    public static /* synthetic */ int access$302(NetworkTunnelStrategy networkTunnelStrategy, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e188092", new Object[]{networkTunnelStrategy, new Integer(i)})).intValue();
        }
        networkTunnelStrategy.c = i;
        return i;
    }

    public static final NetworkTunnelStrategy getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkTunnelStrategy) ipChange.ipc$dispatch("68870a22", new Object[0]);
        }
        NetworkTunnelStrategy networkTunnelStrategy = j;
        if (networkTunnelStrategy != null) {
            return networkTunnelStrategy;
        }
        synchronized (NetworkTunnelStrategy.class) {
            try {
                NetworkTunnelStrategy networkTunnelStrategy2 = j;
                if (networkTunnelStrategy2 != null) {
                    return networkTunnelStrategy2;
                }
                NetworkTunnelStrategy networkTunnelStrategy3 = new NetworkTunnelStrategy();
                j = networkTunnelStrategy3;
                return networkTunnelStrategy3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addNetworkTunnelChangedListener(NetworkTunnelChangedListener networkTunnelChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("522581ef", new Object[]{this, networkTunnelChangedListener});
            return;
        }
        LogCatUtil.printInfo("NetworkTunnelStrategy", "addNetworkTunnelChangedListener: ".concat(networkTunnelChangedListener.getClass().getName()));
        r().addObserver(networkTunnelChangedListener);
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        return StrategyUtil.isUse4OperationType(TransportConfigureManager.getInstance().getStringValueList(TransportConfigureItem.OPERATION_TYPE_LIST, ","), str);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        f();
        this.c = this.d;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        int i = this.c;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public ConfigureChangedListener getConfigureChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigureChangedListener) ipChange.ipc$dispatch("e853d663", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new NetworkConfigureChangedListener();
        }
        return this.b;
    }

    public final TransportConfigureManager getConfigureManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportConfigureManager) ipChange.ipc$dispatch("7563e2be", new Object[]{this});
        }
        return TransportConfigureManager.getInstance();
    }

    public int getConnFailMaxTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c5f084b", new Object[]{this})).intValue();
        }
        return TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.CONN_FAIL_MAX_TIMES);
    }

    public int getCurrentDataTunnlType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("385929d2", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (b() && k() && m() && o()) {
            return true;
        }
        return false;
    }

    public void init(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{this, context, str});
        } else if (!this.i) {
            this.i = true;
            this.g = context;
            this.h = str;
            e();
        }
    }

    public boolean isCanUseAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fa6f19b", new Object[]{this})).booleanValue();
        }
        if (this.c == 3) {
            return true;
        }
        return false;
    }

    public boolean isCanUseAmnetOnOnlyPush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6784df20", new Object[]{this})).booleanValue();
        }
        if (TransportStrategy.isEnabledOnlyPush()) {
            return true;
        }
        return isCanUseAmnet();
    }

    public boolean isCanUseSpdy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd76b3be", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean isCanUseSpdyDataTunel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a063c382", new Object[]{this})).booleanValue();
        }
        if (isCanUseSpdy() && this.c == 2) {
            return true;
        }
        return false;
    }

    public boolean isCanUseSpdyForH5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83c7d98e", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean isCanUseSpdyLongLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8583674", new Object[]{this})).booleanValue();
        }
        return TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.SPDY_LONGLINK_SWITCH, "T");
    }

    public boolean isUse4Utdid(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2952e39e", new Object[]{this, str, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return StrategyUtil.grayscaleUtdid(str, new int[]{i, i2});
    }

    public boolean isUseExtTransport(TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3c95ddf", new Object[]{this, transportContext})).booleanValue();
        }
        if (!c(transportContext.api) || !g()) {
            return false;
        }
        return true;
    }

    public final boolean isUseExtTransportForRealtime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51551e7a", new Object[]{this})).booleanValue();
        }
        if (MiscUtils.isPushProcess(this.g)) {
            LogCatUtil.debug("NetworkTunnelStrategy", "===> Rpc push process does not use spdy <===");
            return false;
        } else if (isCanUseAmnet() || isCanUseSpdy()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        TransportConfigureManager instance = TransportConfigureManager.getInstance();
        return d(instance.getStringValue(TransportConfigureItem.SPDY_BLACK_LIST_PHONE_BRAND), instance.getStringValue(TransportConfigureItem.SPDY_BLACK_LIST_PHONE_MODEL), instance.getStringValue(TransportConfigureItem.SPDY_BLACK_LIST_CPU_MODEL));
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        TransportConfigureManager instance = TransportConfigureManager.getInstance();
        return d(instance.getStringValue(TransportConfigureItem.AMNET_BLACK_LIST_PHONE_BRAND), instance.getStringValue(TransportConfigureItem.AMNET_BLACK_LIST_PHONE_MODEL), instance.getStringValue(TransportConfigureItem.AMNET_BLACK_LIST_CPU_MODEL));
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (this.g != null && StrategyUtil.isUse4Net(this.g, TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SPDY_DISABLED_NET_KEY))) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (!StrategyUtil.isUse4SdkVersion(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SPDY_DISABLED_SDK_VERSION))) {
            return false;
        }
        return true;
    }

    public void notifyFirstTunnelChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde58d8c", new Object[]{this});
            return;
        }
        TunnelChangeEventModel tunnelChangeEventModel = new TunnelChangeEventModel();
        tunnelChangeEventModel.currentTunnelType = -1;
        tunnelChangeEventModel.newTunnelType = this.c;
        notifyTunnelChanged(tunnelChangeEventModel);
        LogCatUtil.info("NetworkTunnelStrategy", "notifyFirstTunnelChanged finish.  newTunnelType = " + this.c);
    }

    public void notifyNetworkTunnelChangedEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb917ee9", new Object[]{this, new Integer(i)});
        } else {
            r().notifyObservers(Integer.valueOf(i));
        }
    }

    public void notifyTunnelChanged(TunnelChangeEventModel tunnelChangeEventModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0b7eaa", new Object[]{this, tunnelChangeEventModel});
            return;
        }
        try {
            r().notifyObservers(tunnelChangeEventModel);
            a(tunnelChangeEventModel);
        } catch (Throwable th) {
            LogCatUtil.error("NetworkTunnelStrategy", " notifyTunnelChanged exception ", th);
        }
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (!StrategyUtil.isUse4SdkVersion(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.AMNET_DISABLED_SDK_VERSION))) {
            return false;
        }
        return true;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        String stringValue = getConfigureManager().getStringValue(TransportConfigureItem.SPDY_SWITCH);
        if (TextUtils.isEmpty(stringValue) || !stringValue.startsWith("T")) {
            return false;
        }
        return true;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            TransportConfigureManager.getInstance().addConfigureChangedListener(getConfigureChangedListener());
        }
    }

    public final NetworkTunnelChangedObservible r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkTunnelChangedObservible) ipChange.ipc$dispatch("b7a35f73", new Object[]{this});
        }
        if (this.f4135a == null) {
            this.f4135a = new NetworkTunnelChangedObservible();
        }
        return this.f4135a;
    }

    public void removeNetworkTunnelChangedListener(NetworkTunnelChangedListener networkTunnelChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b2de12", new Object[]{this, networkTunnelChangedListener});
        } else {
            r().deleteObserver(networkTunnelChangedListener);
        }
    }

    public final void a(TunnelChangeEventModel tunnelChangeEventModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde694a8", new Object[]{this, tunnelChangeEventModel});
            return;
        }
        try {
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType(AmnetTunnelManager.LOG_SUBTYPE);
            int i = tunnelChangeEventModel.currentTunnelType;
            String str2 = RPCDataItems.VALUE_NETTUNNEL_SPDY;
            if (i == 3) {
                str = "AMNET";
            } else {
                str = i == 2 ? str2 : "";
            }
            int i2 = tunnelChangeEventModel.newTunnelType;
            if (i2 == 3) {
                str2 = "AMNET";
            } else if (i2 != 2) {
                str2 = "";
            }
            monitorLoggerModel.getExtPramas().put(AmnetTunnelManager.LOG_KEY_OLD_LIB, str);
            monitorLoggerModel.getExtPramas().put(AmnetTunnelManager.LOG_KEY_NEW_LIB, str2);
            monitorLoggerModel.setParam1("1.0");
            monitorLoggerModel.setParam2(str);
            monitorLoggerModel.setParam3(str2);
            LogCatUtil.debug("NetworkTunnelStrategy", "networkTunnel switch perflog:" + monitorLoggerModel.toString());
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
        } catch (Throwable th) {
            LogCatUtil.error("NetworkTunnelStrategy", "perfLog exception", th);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.AMNET_SWITCH);
        if (MiscUtils.grayscaleUtdid(this.h, stringValue)) {
            LogCatUtil.info("NetworkTunnelStrategy", "isEnabledAmnet is true, utdid=" + this.h);
            return true;
        }
        LogCatUtil.info("NetworkTunnelStrategy", "isEnabledAmnet is false, grayscaleValue=" + stringValue + ", utdid=" + this.h);
        return false;
    }

    public final boolean d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (!StrategyUtil.isUse4Brand(str)) {
            LogCatUtil.info("NetworkTunnelStrategy", "isUse4Brand is false. brandBlackList=[" + str + "] ");
            return false;
        } else if (!StrategyUtil.isUse4Model(str2)) {
            LogCatUtil.info("NetworkTunnelStrategy", "isUse4Brand is false. isUse4Model=[" + str2 + "] ");
            return false;
        } else if (StrategyUtil.isUse4Hardware(str3)) {
            return true;
        } else {
            LogCatUtil.info("NetworkTunnelStrategy", "isUse4Hardware is false. cpuModelBackList=[" + str3 + "] ");
            return false;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LogCatUtil.debug("NetworkTunnelStrategy", "updateTunnlType");
        TransportConfigureManager instance = TransportConfigureManager.getInstance();
        this.d = -1;
        if (h()) {
            this.e = true;
            this.d = 2;
            if (instance.equalsString(TransportConfigureItem.H5_SPDY_SWITCH, "T")) {
                this.f = true;
            } else {
                this.f = false;
            }
        } else {
            this.e = false;
            this.f = false;
        }
        if (i()) {
            this.d = 3;
        }
        if (this.d == -1) {
            this.d = 1;
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (!p()) {
            return false;
        }
        if (j()) {
            return l() && n();
        }
        LogCatUtil.debug("NetworkTunnelStrategy", "isUseSpdy4Devices == false");
        return false;
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (this.g != null) {
            return StrategyUtil.isUse4Net(this.g, TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.AMNET_DISABLED_NET_KEY));
        }
        LogCatUtil.error("NetworkTunnelStrategy", "mContext is null. so return false");
        return false;
    }
}
