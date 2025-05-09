package com.alipay.mobile.common.amnet.biz;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.bifrost.StnLogicICallBackImpl;
import com.alipay.mars.stn.StnLogic;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetLoggerListener;
import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.amnet.api.AmnetResult;
import com.alipay.mobile.common.amnet.api.AmnetSetActivatingParamsEventManager;
import com.alipay.mobile.common.amnet.api.configs.AmnetRpcGlobalParamConfigHelper;
import com.alipay.mobile.common.amnet.api.exception.AmnetException;
import com.alipay.mobile.common.amnet.api.model.ActivatingParams;
import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.amnet.api.model.AppEvent;
import com.alipay.mobile.common.amnet.api.model.AskConnStateCallback;
import com.alipay.mobile.common.amnet.api.model.ResultFeedback;
import com.alipay.mobile.common.amnet.api.monitor.TrafficMonitorService;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.alipay.mobile.common.amnet.biz.inner.AmnetNetInfoReceiver;
import com.alipay.mobile.common.amnet.biz.inner.NetTestAdapter;
import com.alipay.mobile.common.amnet.biz.inner.PermissionBroadcastReceiver;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.config.UserNetworkPreferencesManager;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.httpdns.HttpdnsIPEntry;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.Transport;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.InetAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetOperationManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AMNET_HOST = "mygw.alipay.com";
    public static final String AMNET_HOST_SHORT = "mygwshort.alipay.com";
    public static final String AMNET_PORT = "443";
    public static final String AMNET_PORT_SHORT = "80";
    public static final String AMNET_RC_HOST = "mygwrc.alipay.com";
    public static final String H2_HOST = "myh2.alipay.com";
    public static final String H2_PORT = "443";
    public static boolean e = true;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3896a = false;
    public long b = -1;
    public final Set<Long> c = Collections.synchronizedSet(new HashSet());
    public final StnLogicHttpDnsCallbackImpl d = new StnLogicHttpDnsCallbackImpl();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class StnLogicHttpDnsCallbackImpl implements StnLogicICallBackImpl.HttpDnsCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public StnLogicHttpDnsCallbackImpl() {
        }

        @Override // com.alipay.bifrost.StnLogicICallBackImpl.HttpDnsCallback
        public String httpDns(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("96ecb78e", new Object[]{this, str});
            }
            return AmnetOperationManager.access$100(AmnetOperationManager.this, str);
        }
    }

    public static /* synthetic */ boolean access$002(AmnetOperationManager amnetOperationManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("545f9f7f", new Object[]{amnetOperationManager, new Boolean(z)})).booleanValue();
        }
        amnetOperationManager.f3896a = z;
        return z;
    }

    public static /* synthetic */ String access$100(AmnetOperationManager amnetOperationManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("509f831e", new Object[]{amnetOperationManager, str});
        }
        return amnetOperationManager.c(str);
    }

    public final Transport.Altering a(AppEvent appEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport.Altering) ipChange.ipc$dispatch("97fb8c1c", new Object[]{this, appEvent});
        }
        Transport.Altering altering = new Transport.Altering();
        altering.id = appEvent.id;
        altering.infMinor = appEvent.minor;
        altering.infMajor = appEvent.major;
        altering.status = appEvent.status;
        altering.extMap = appEvent.extMap;
        return altering;
    }

    public final void activateAmnet(final AmnetResult amnetResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0103e7", new Object[]{this, amnetResult});
            return;
        }
        LogCatUtil.info("AmnetOperationManager", " AmnetHelper begin init. activated=" + this.f3896a);
        if (e) {
            e = false;
            TransportConfigureManager.getInstance().addConfigureChangedListener(AmnetSwitchManagerImpl.getInstance().getConfigureChangedListener());
            AmnetTunnelManager.getInstance().procActivateTick();
            ((AmnetGeneralEventManagerImpl) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class)).asyncNotifyBeforeFirstAmnetActivation();
        }
        final boolean canUseBifrost = AmnetTunnelManager.getInstance().canUseBifrost();
        if (this.f3896a) {
            if (amnetResult != null) {
                NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            amnetResult.notifyResult(true);
                        }
                    }
                });
            }
            LogCatUtil.warn("AmnetOperationManager", "activateAmnet break, cause activated is true");
            return;
        }
        Transport.Activating activating = new Transport.Activating();
        if (l(activating, false, canUseBifrost)) {
            AmnetGeneralEventManagerImpl amnetGeneralEventManagerImpl = (AmnetGeneralEventManagerImpl) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class);
            AmnetMonitorLoggerListener amnetMonitorLoggerListener = (AmnetMonitorLoggerListener) NetBeanFactory.getBean(AmnetMonitorLoggerListener.class);
            amnetGeneralEventManagerImpl.removeGeneraEventListener(amnetMonitorLoggerListener);
            amnetGeneralEventManagerImpl.addGeneraEventListener(amnetMonitorLoggerListener);
            PermissionBroadcastReceiver.registerBroadcast(AmnetEnvHelper.getAppContext());
            final AmnetLoggerListener amnetLoggerListener = (AmnetLoggerListener) NetBeanFactory.getBean(AmnetLoggerListener.class);
            if (!amnetLoggerListener.listened) {
                getAmnetTransport().register(amnetLoggerListener, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.common.transportext.Transport.Result
                    public void notify(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        if (z) {
                            amnetLoggerListener.listened = true;
                        }
                        LogCatUtil.debug("AmnetOperationManager", "register  AmnetLoggerListener result=[" + z + "]");
                    }
                });
            }
            try {
                this.b = System.currentTimeMillis();
                getAmnetTransport().activate(activating, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.common.transportext.Transport.Result
                    public void notify(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        if (z) {
                            if (canUseBifrost) {
                                AmnetTunnelManager.getInstance().setState(2);
                            } else {
                                AmnetTunnelManager.getInstance().setState(1);
                            }
                            AmnetOperationManager.access$002(AmnetOperationManager.this, true);
                            LogCatUtil.debug("AmnetOperationManager", "activateAmnet,activated is true");
                            AmnetNetInfoReceiver.start();
                        } else {
                            AmnetTunnelManager.getInstance().setState(0);
                            AmnetOperationManager.access$002(AmnetOperationManager.this, false);
                            LogCatUtil.debug("AmnetOperationManager", "activateAmnet,activated is false");
                        }
                        ((AmnetGeneralEventManagerImpl) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class)).asyncNotifyAfterAmnetActivation(z);
                        amnetResult.notifyResult(z);
                        LogCatUtil.debug("AmnetOperationManager", "Connection result=[" + z + "]");
                    }
                });
                LogCatUtil.info("AmnetOperationManager", " AmnetHelper end init. url = " + activating.domainLongLink);
                TrafficMonitorService.getInstance().setScene(TrafficMonitorService.SCENE_APP_START);
            } catch (Throwable th) {
                LogCatUtil.error("AmnetOperationManager", "activate error", th);
                throw new AmnetException("activate error", th);
            }
        } else if (amnetResult != null) {
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        amnetResult.notifyResult(false);
                    }
                }
            });
        }
    }

    public void askConnState(final AskConnStateCallback askConnStateCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd683056", new Object[]{this, askConnStateCallback});
        } else if (!isActivated()) {
            LogCatUtil.info("AmnetOperationManager", "askConnState. It's not active amnet.");
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (AmnetTunnelManager.getInstance().isStateIdle()) {
                        askConnStateCallback.callback(-1);
                    } else {
                        askConnStateCallback.callback(-2);
                    }
                }
            });
        } else {
            Transport.Asking asking = new Transport.Asking() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass11 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/amnet/biz/AmnetOperationManager$11");
                }

                @Override // com.alipay.mobile.common.transportext.Transport.Asking
                public void answer(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea99665e", new Object[]{this, new Integer(i)});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetOperationManager", "askConnState callbak state=" + i);
                    askConnStateCallback.callback(i);
                }
            };
            asking.id = 1L;
            getAmnetTransport().ask(asking, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                    } else if (!z) {
                        LogCatUtil.printInfo("AmnetOperationManager", "askConnState callbak fail");
                        askConnStateCallback.callback(-1);
                    }
                }
            });
        }
    }

    public final String d(Map<String, String> map) {
        Exception e2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        try {
            str = getAmnetAddress();
        } catch (Exception e3) {
            e2 = e3;
            str = "";
        }
        try {
            k(str.substring(0, str.indexOf(":")), map);
            return str;
        } catch (Exception e4) {
            e2 = e4;
            throw new RuntimeException("amnetAddress=[" + str + "]", e2);
        }
    }

    public void detect(AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63780647", new Object[]{this, amnetNetworkDiagnoseListener});
            return;
        }
        Transport.Detecting detecting = new Transport.Detecting();
        detecting.id = 1L;
        detecting.report = new NetTestAdapter(amnetNetworkDiagnoseListener);
        getAmnetTransport().detect(detecting, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.common.transportext.Transport.Result
            public void notify(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                    return;
                }
                LogCatUtil.info("AmnetOperationManager", "detect result=[" + z + "] ");
            }
        });
    }

    public final void e(ActivatingParams activatingParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c117051c", new Object[]{this, activatingParams});
        } else {
            AmnetSetActivatingParamsEventManager.getInstance().onAfterSetActivatingParamsEvent(activatingParams);
        }
    }

    public final void g(AmnetPost amnetPost, Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268a2776", new Object[]{this, amnetPost, posting});
            return;
        }
        try {
            Map<String, String> map = amnetPost.header;
            if (map != null && !map.isEmpty()) {
                posting.fwdip = amnetPost.header.get(AmnetPost.MMTP_EXT_FORWARD_IP);
                amnetPost.header.remove(AmnetPost.MMTP_EXT_FORWARD_IP);
                o(amnetPost, posting);
                r(amnetPost, posting);
                t(amnetPost, posting);
                j(posting, amnetPost);
                i(posting);
                u(amnetPost, posting);
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "processTransportInnerHeaders ex:" + th.toString());
        }
    }

    public long getActivateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bafba651", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public String getAmnetAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f96ad560", new Object[]{this});
        }
        if (MiscUtils.isSandboxChannel()) {
            return getAmnetAddressForSandbox();
        }
        if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
            return TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.MMTP_URL);
        }
        if (MiscUtils.isRCVersion(AmnetEnvHelper.getAppContext())) {
            return "mygwrc.alipay.com:443";
        }
        return "mygw.alipay.com:443";
    }

    public String getAmnetAddressForSandbox() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7365582", new Object[]{this});
        }
        String amnetServerAddressFromMetaData = MiscUtils.getAmnetServerAddressFromMetaData();
        return !TextUtils.isEmpty(amnetServerAddressFromMetaData) ? amnetServerAddressFromMetaData : "mygw.alipaydev.com:8000";
    }

    public String getAmnetDnsInfoForMultiplex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae09715e", new Object[]{this});
        }
        return c(getH2Host());
    }

    public String getAmnetDnsInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc16dc22", new Object[]{this});
        }
        return c(getAmnetHost());
    }

    public String getAmnetDnsInfosForShort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c14c3af", new Object[]{this});
        }
        return c(AMNET_HOST_SHORT);
    }

    public String getAmnetHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8e11656", new Object[]{this});
        }
        String amnetAddress = getAmnetAddress();
        return amnetAddress.substring(0, amnetAddress.indexOf(":"));
    }

    public String getAmnetShortAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("912d0926", new Object[]{this});
        }
        return "mygwshort.alipay.com:80";
    }

    public String getAmnetShortHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3af2e850", new Object[]{this});
        }
        String amnetShortAddress = getAmnetShortAddress();
        return amnetShortAddress.substring(0, amnetShortAddress.indexOf(":"));
    }

    public final Transport getAmnetTransport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport) ipChange.ipc$dispatch("be8ee7c6", new Object[]{this});
        }
        return Transport.instance();
    }

    public String getH2Address() {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1de2e265", new Object[]{this});
        }
        String str = "";
        try {
            if (!MiscUtils.isInAlipayClient(AmnetEnvHelper.getAppContext()) || TransportStrategy.isEnabledOnlyUseBifrostH2(AmnetEnvHelper.getAppContext())) {
                str = b();
                if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                    String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_H2_URL);
                    if (!TextUtils.isEmpty(stringValue)) {
                        try {
                            LogCatUtil.info("AmnetOperationManager", "[getH2Address] From transport configure url = " + stringValue);
                            return stringValue;
                        } catch (Throwable th2) {
                            th = th2;
                            str = stringValue;
                            LogCatUtil.error("AmnetOperationManager", th);
                            return str;
                        }
                    }
                }
            } else if (!MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                return "myh2.alipay.com:443";
            } else {
                str = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_H2_URL);
                if (TextUtils.isEmpty(str)) {
                    return "myh2.alipay.com:443";
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return str;
    }

    public String getH2Host() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e62af71", new Object[]{this});
        }
        String h2Address = getH2Address();
        return h2Address.substring(0, h2Address.indexOf(":"));
    }

    public Set<Long> getRpcidSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d273a22e", new Object[]{this});
        }
        return this.c;
    }

    public final void h(Transport.Activating activating) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5534303", new Object[]{this, activating});
            return;
        }
        try {
            Context appContext = AmnetEnvHelper.getAppContext();
            AppEvent convert2AppEvent = OutEventNotifyManagerImpl.convert2AppEvent(true, NetworkUtils.getNetworkType(appContext), ConnectionUtil.getConnType(appContext));
            activating.netMajor = convert2AppEvent.major;
            activating.netMinor = convert2AppEvent.minor;
        } catch (Exception e2) {
            LogCatUtil.error("AmnetOperationManager", e2);
        }
    }

    public boolean isActivated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e27854d2", new Object[]{this})).booleanValue();
        }
        return this.f3896a;
    }

    public boolean isInForegound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f46c5923", new Object[]{this})).booleanValue();
        }
        Transport.Activating activating = new Transport.Activating();
        setWalletProcState(activating);
        if (!activating.master || !activating.ground || !activating.screen) {
            return false;
        }
        return true;
    }

    public final void j(Transport.Posting posting, AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3143cea0", new Object[]{this, posting, amnetPost});
            return;
        }
        Map<String, String> map = amnetPost.header;
        if (map != null) {
            String str = map.get(HeaderConstant.HEADER_KEY_OPERATION_TYPE);
            if (AmnetRpcGlobalParamConfigHelper.isIndependentChannel(str)) {
                if (posting.params == null) {
                    posting.params = new HashMap(2);
                }
                posting.multiplex = true;
                LogCatUtil.info("AmnetOperationManager", "[setMultiplexParamByGlobalParamConfig] set post by multiplex,  operationType:" + str);
            }
        }
    }

    public final void k(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            map.put(Baggage.Amnet.CFG_ADDR, c(str));
        }
    }

    public final String m(Map<String, String> map) {
        Exception e2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map});
        }
        try {
            str = getAmnetShortAddress();
        } catch (Exception e3) {
            e2 = e3;
            str = "";
        }
        try {
            k(str.substring(0, str.indexOf(":")), map);
            return str;
        } catch (Exception e4) {
            e2 = e4;
            throw new RuntimeException("amnetShortAddress=[" + str + "]", e2);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            LogCatUtil.debug("AmnetOperationManager", "httpdns die,notifyClearDns");
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AppEvent appEvent = new AppEvent();
                    appEvent.id = 1L;
                    appEvent.status = 8;
                    appEvent.major = Baggage.Amnet.ADDRESS_ALL;
                    appEvent.minor = "";
                    AmnetOperationManager.this.notifyAppEvent(appEvent);
                }
            });
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "notifyClearDns ex:" + th.toString());
        }
    }

    public void notifyAppEvent(AppEvent appEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6869b8", new Object[]{this, appEvent});
        } else if (!isActivated()) {
            LogCatUtil.info("AmnetOperationManager", "notifyAppEvent. It's not active amnet. status=[" + appEvent.status + "]");
        } else {
            final Transport.Altering a2 = a(appEvent);
            try {
                getAmnetTransport().alter(a2, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.common.transportext.Transport.Result
                    public void notify(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        StringBuilder sb = new StringBuilder("notifyAppEvent. result=[");
                        sb.append(z);
                        sb.append("] status=[");
                        sb.append(a2.status);
                        sb.append("] infMajor=[");
                        sb.append(a2.infMajor);
                        sb.append("]  infMinor=[");
                        String str = a2.infMinor;
                        if (str == null) {
                            str = " no exist";
                        }
                        sb.append(str);
                        sb.append("]");
                        LogCatUtil.info("AmnetOperationManager", sb.toString());
                    }
                });
            } catch (Throwable th) {
                if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                    LogCatUtil.error("AmnetOperationManager", "notifyAppEvent error", th);
                }
                throw new AmnetException("notifyAppEvent error", th);
            }
        }
    }

    public final void p(Transport.Activating activating) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5312bb04", new Object[]{this, activating});
            return;
        }
        Map<String, Pair<String, Integer>> allBindHostPairs = UserNetworkPreferencesManager.getInstance().getAllBindHostPairs();
        if (allBindHostPairs != null && !allBindHostPairs.isEmpty()) {
            LogCatUtil.info("AmnetOperationManager", "[setBindedHostsInfo2Activating] allBindHostPairs len : " + allBindHostPairs.size());
            activating.addExtParam(Baggage.Amnet.KEY_BIND_HOSTS, allBindHostPairs);
        }
    }

    public final Map<String, String> postWithResult(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e060064", new Object[]{this, amnetPost});
        }
        post(amnetPost);
        HashMap hashMap = new HashMap(1);
        if (amnetPost.channel == 1) {
            hashMap.put(RPCDataItems.IPC_TIME1, String.valueOf(amnetPost.ipcM2p));
        }
        return hashMap;
    }

    public void preConnect(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42135da", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
        } else if (TextUtils.isEmpty(str)) {
            LogCatUtil.warn("AmnetOperationManager", "preConnect host is null");
        } else {
            getAmnetTransport().preConnect(1L, str, i, z, i2, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z2)});
                        return;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "preConnect result=[" + z2 + "]");
                }
            });
        }
    }

    public final String q(Map<String, String> map) {
        String str;
        Exception e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f46725", new Object[]{this, map});
        }
        try {
            str = getH2Address();
        } catch (Exception e3) {
            e2 = e3;
            str = "";
        }
        try {
            k(str.substring(0, str.indexOf(":")), map);
        } catch (Exception e4) {
            e2 = e4;
            LogCatUtil.error("AmnetOperationManager", "getH2Url error, h2Address=[" + str + "], ", e2);
            return str;
        }
        return str;
    }

    public final void reconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61e9c5e", new Object[]{this});
            return;
        }
        Transport.Activating activating = new Transport.Activating();
        if (l(activating, true, false)) {
            getAmnetTransport().activate(activating, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "ReConnection result=[" + z + "]");
                }
            });
        }
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.MAINLINK_ALLOW_IPV6));
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "allowIPv6MainLink ex:" + th.toString());
            return false;
        }
    }

    public void setActivateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800fa87b", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public void setBindHost(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb73522", new Object[]{this, str, str2});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                LogCatUtil.info("AmnetOperationManager", "[setBindHost] domain si null.");
                return;
            }
            LogCatUtil.info("AmnetOperationManager", "[setBindHost] Enter. domain = " + str + ", hostInfo = " + str2);
            if (!isActivated()) {
                LogCatUtil.info("AmnetOperationManager", "[setBindHost] No activated");
            } else if (!AmnetTunnelManager.getInstance().isNowUseBifrost()) {
                LogCatUtil.info("AmnetOperationManager", "[setBindHost] No activated");
            } else {
                if (str2 == null) {
                    str2 = "";
                }
                StnLogic.setDebugIP(str, str2);
                LogCatUtil.info("AmnetOperationManager", "[setBindHost] Finished. domain = " + str + ", hostInfo = " + str2);
            }
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetOperationManager", "[setBindHost] Exception: " + th.toString(), th);
        }
    }

    public final void shutdownAmnet(final AmnetResult amnetResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d01e3e4", new Object[]{this, amnetResult});
        } else {
            getAmnetTransport().inactivate(1L, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "shutdown amnet result=[" + z + "]");
                    if (z) {
                        AmnetTunnelManager.getInstance().setState(0);
                        AmnetOperationManager.access$002(AmnetOperationManager.this, false);
                        LogCatUtil.debug("AmnetOperationManager", "shutdownAmnet,activated is false");
                        ((AmnetGeneralEventManagerImpl) NetBeanFactory.getBean(AmnetGeneralEventManagerImpl.class)).resetConnState();
                    }
                    amnetResult.notifyResult(z);
                }
            });
        }
    }

    public final void f(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1dd858d", new Object[]{this, amnetPost});
            return;
        }
        try {
            if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_URGENT_CONNECT), "T") && this.f3896a && amnetPost.channel == 1 && AmnetTunnelManager.getInstance().isNowUseBifrost()) {
                if (!amnetPost.isUrgent && !MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext())) {
                    return;
                }
                StnLogic.makesureLongLinkConnected();
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "preProcessBeforePost ex:" + th.toString());
        }
    }

    public final void i(Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8854c8fb", new Object[]{this, posting});
            return;
        }
        try {
            if (AmnetTunnelManager.getInstance().isInBifrostStdH2Model() && TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
                posting.multiplex = true;
                LogCatUtil.info("AmnetOperationManager", "[setMultiplexParam4Taobao] set post by multiplex=============");
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "setMultiplexParam4Taobao ex:" + th.toString());
        }
    }

    public final void o(AmnetPost amnetPost, Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2335595", new Object[]{this, amnetPost, posting});
            return;
        }
        try {
            String str = amnetPost.header.get(HeaderConstant.HEADER_KEY_PARAM_TRACEID);
            if (!TextUtils.isEmpty(str)) {
                LogCatUtil.debug("AmnetOperationManager", "TRACEID:" + str);
                posting.traceid = str;
                if (amnetPost.channel == 1) {
                    amnetPost.header.remove(HeaderConstant.HEADER_KEY_PARAM_TRACEID);
                    this.c.add(Long.valueOf(amnetPost.reqSeqId));
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "processTraceid ex:" + th.toString());
        }
    }

    public final void post(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad854cc", new Object[]{this, amnetPost});
            return;
        }
        f(amnetPost);
        final Transport.Posting posting = new Transport.Posting();
        posting.body = amnetPost.body;
        posting.channel = amnetPost.channel;
        posting.id = 1L;
        posting.receipt = amnetPost.reqSeqId;
        posting.secret = amnetPost.secret;
        posting.important = amnetPost.important;
        posting.nearing = true ^ amnetPost.toBizSys;
        posting.stamp = amnetPost.ts;
        posting.params = amnetPost.params;
        posting.multiplex = amnetPost.multiplex;
        posting.isUrgent = amnetPost.isUrgent;
        g(amnetPost, posting);
        posting.header = amnetPost.header;
        try {
            getAmnetTransport().post(posting, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "post result=[" + z + "] channel=[" + ((int) posting.channel) + "] receipt=[" + posting.receipt + "] important=[" + posting.important + "]");
                }
            });
            LogCatUtil.debug("AmnetOperationManager", "finish post. ");
        } catch (Throwable th) {
            if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                LogCatUtil.error("AmnetOperationManager", "post error", th);
            }
            throw new AmnetException("post error", th);
        }
    }

    public final void r(AmnetPost amnetPost, Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ddc83b4", new Object[]{this, amnetPost, posting});
            return;
        }
        try {
            if (AmnetSwitchManagerImpl.getInstance().isEnableZstd()) {
                String str = amnetPost.header.get(HeaderConstant.HEADER_KEY_OPERATION_TYPE);
                if (!TextUtils.isEmpty(str) && amnetPost.channel == 1 && TransportStrategy.isSupportZstd(str)) {
                    int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.ZSTD_TOPLIMIT);
                    byte[] bArr = posting.body;
                    if (bArr == null || bArr.length <= intValue) {
                        amnetPost.header.put(AmnetConstant.KEY_SUPPORT_ZSTD, AmnetConstant.VAL_SUPPORT_ZSTD);
                    } else {
                        LogCatUtil.warn("AmnetOperationManager", "zstd toplimit:" + intValue + " , now:" + posting.body.length);
                    }
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "processZstd ex:" + th.toString());
        }
    }

    public void setWalletProcState(Transport.Activating activating) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113440c2", new Object[]{this, activating});
            return;
        }
        Map<String, String> walletProcState = MiscUtils.getWalletProcState(AmnetEnvHelper.getAppContext());
        try {
            if (TextUtils.equals(walletProcState.get("top"), "true")) {
                activating.ground = true;
            }
        } catch (Throwable unused) {
        }
        try {
            if (TextUtils.equals(walletProcState.get(MiscUtils.KEY_RUNNING), "true")) {
                activating.master = true;
            }
        } catch (Throwable unused2) {
        }
        if (MiscUtils.isScreenOn(AmnetEnvHelper.getAppContext())) {
            activating.screen = true;
        }
    }

    public final void t(AmnetPost amnetPost, Transport.Posting posting) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5985b1d3", new Object[]{this, amnetPost, posting});
            return;
        }
        try {
            String str = amnetPost.header.get(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK);
            if (!TextUtils.isEmpty(str)) {
                if (TextUtils.equals(str, "1")) {
                    posting.multiplex = true;
                }
                amnetPost.header.remove(HeaderConstant.HEADER_KEY_PARAM_USE_MULTIPLEXLINK);
            }
        } catch (Throwable th) {
            LogCatUtil.error("AmnetOperationManager", "processMultiplexLinkByRequestHeader ex:" + th.toString());
        }
    }

    public final void u(AmnetPost amnetPost, Transport.Posting posting) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152edff2", new Object[]{this, amnetPost, posting});
        } else if (amnetPost != null && posting != null && (map = amnetPost.params) != null) {
            String str = map.get("url");
            if (!TextUtils.isEmpty(str)) {
                posting.multiplex = true;
                posting.params.put("url", str);
                LogCatUtil.info("AmnetOperationManager", "[setPostUrlToPosting] postUrl = " + str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:6:0x0017, B:8:0x0029, B:11:0x003f, B:15:0x004c, B:20:0x0057, B:22:0x005d, B:24:0x006a), top: B:28:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:6:0x0017, B:8:0x0029, B:11:0x003f, B:15:0x004c, B:20:0x0057, B:22:0x005d, B:24:0x006a), top: B:28:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = ""
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.mobile.common.amnet.biz.AmnetOperationManager.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0017
            java.lang.String r2 = "aff6e538"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            java.lang.Object r0 = r3.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0017:
            com.alipay.mobile.common.transport.utils.ReadSettingServerUrl r3 = com.alipay.mobile.common.transport.utils.ReadSettingServerUrl.getInstance()     // Catch: all -> 0x0055
            android.content.Context r4 = com.alipay.mobile.common.amnet.api.AmnetEnvHelper.getAppContext()     // Catch: all -> 0x0055
            java.lang.String r3 = r3.getGWFURL(r4)     // Catch: all -> 0x0055
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: all -> 0x0055
            if (r4 != 0) goto L_0x008a
            java.net.URL r4 = new java.net.URL     // Catch: all -> 0x0055
            r4.<init>(r3)     // Catch: all -> 0x0055
            java.lang.String r3 = r4.getHost()     // Catch: all -> 0x0055
            int r5 = r4.getPort()     // Catch: all -> 0x0055
            java.lang.String r4 = r4.getProtocol()     // Catch: all -> 0x0055
            java.lang.String r6 = "http"
            if (r5 >= 0) goto L_0x004a
            java.lang.String r7 = "https"
            boolean r7 = r7.equals(r4)     // Catch: all -> 0x0055
            if (r7 == 0) goto L_0x004c
            r5 = 443(0x1bb, float:6.21E-43)
        L_0x004a:
            r0 = 1
            goto L_0x0057
        L_0x004c:
            boolean r7 = r6.equals(r4)     // Catch: all -> 0x0055
            if (r7 == 0) goto L_0x0057
            r5 = 80
            goto L_0x004a
        L_0x0055:
            r0 = move-exception
            goto L_0x0085
        L_0x0057:
            boolean r1 = android.text.TextUtils.equals(r4, r6)     // Catch: all -> 0x0055
            if (r1 == 0) goto L_0x0068
            com.alipay.mobile.common.transport.config.TransportConfigureManager r1 = com.alipay.mobile.common.transport.config.TransportConfigureManager.getInstance()     // Catch: all -> 0x0055
            com.alipay.mobile.common.transport.config.TransportConfigureItem r4 = com.alipay.mobile.common.transport.config.TransportConfigureItem.AMNET_HS     // Catch: all -> 0x0055
            java.lang.String r6 = "F"
            r1.setValue(r4, r6)     // Catch: all -> 0x0055
        L_0x0068:
            if (r0 == 0) goto L_0x0083
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0055
            r0.<init>()     // Catch: all -> 0x0055
            r0.append(r3)     // Catch: all -> 0x0055
            java.lang.String r1 = ":"
            r0.append(r1)     // Catch: all -> 0x0055
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch: all -> 0x0055
            r0.append(r1)     // Catch: all -> 0x0055
            java.lang.String r2 = r0.toString()     // Catch: all -> 0x0055
            goto L_0x008a
        L_0x0083:
            r2 = r3
            goto L_0x008a
        L_0x0085:
            java.lang.String r1 = "AmnetOperationManager"
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r1, r0)
        L_0x008a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.b():java.lang.String");
    }

    public final String c(String str) {
        HttpDns.HttpdnsIP queryLocalIPByHost;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        LogCatUtil.info("AmnetOperationManager", "getAmnetDnsInfos host=" + str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
        if (dnsClient == null) {
            LogCatUtil.info("AmnetOperationManager", "getAmnetDnsInfos.host=" + str + ",dnsClient is null.");
            return "";
        }
        try {
            queryLocalIPByHost = dnsClient.queryLocalIPByHost(str);
        } catch (Throwable th) {
            LogCatUtil.warn("AmnetOperationManager", th);
        }
        if (queryLocalIPByHost == null) {
            LogCatUtil.info("AmnetOperationManager", "getAmnetDnsInfos. host=" + str + ",ipInfoByHost is null.");
            if (dnsClient.isHttpdnsDie()) {
                n();
            }
            return "";
        } else if (!TextUtils.isEmpty(queryLocalIPByHost.getCname())) {
            StringBuilder sb = new StringBuilder();
            InetAddress[] allByName = DnsUtil.getAllByName(queryLocalIPByHost.getCname());
            while (i < allByName.length) {
                sb.append(allByName[i].getHostAddress());
                sb.append(":");
                sb.append("443");
                sb.append(",");
                i++;
            }
            LogCatUtil.debug("AmnetOperationManager", "host=" + str + ",cname is available,cname:" + queryLocalIPByHost.getCname() + " ,ips:" + sb.toString());
            return sb.toString();
        } else {
            if (queryLocalIPByHost.getIpEntries() != null) {
                StringBuilder sb2 = new StringBuilder();
                HttpdnsIPEntry[] ipEntries = queryLocalIPByHost.getIpEntries();
                boolean isNowUseBifrost = AmnetTunnelManager.getInstance().isNowUseBifrost();
                boolean s = s();
                if (!isNowUseBifrost || !s) {
                    LogCatUtil.debug("AmnetOperationManager", "filter-out ipv6,isNowUseBifrost= " + isNowUseBifrost + ", allowIPv6= " + s);
                    while (i < ipEntries.length) {
                        HttpdnsIPEntry httpdnsIPEntry = ipEntries[i];
                        if (httpdnsIPEntry.ipType == HttpDns.IP_TYPE_V4) {
                            sb2.append(httpdnsIPEntry.getIpWithPort());
                            sb2.append(",");
                        }
                        i++;
                    }
                } else {
                    boolean z = true;
                    for (HttpdnsIPEntry httpdnsIPEntry2 : ipEntries) {
                        if (httpdnsIPEntry2.ipType != HttpDns.IP_TYPE_V6) {
                            sb2.append(httpdnsIPEntry2.getIpWithPort());
                            sb2.append(",");
                        } else if (z) {
                            sb2.append(httpdnsIPEntry2.getIpWithPort());
                            sb2.append(",");
                            z = false;
                        }
                    }
                }
                LogCatUtil.debug("AmnetOperationManager", "getAmnetDnsInfos2,host:" + str + " ,ips: " + sb2.toString());
                return sb2.toString();
            }
            return "";
        }
    }

    public void notifyRespResult(ResultFeedback resultFeedback) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe0103b", new Object[]{this, resultFeedback});
            return;
        }
        try {
            Transport.Alerting alerting = new Transport.Alerting();
            alerting.id = resultFeedback.id;
            alerting.duration = resultFeedback.duration;
            alerting.receipt = resultFeedback.receipt;
            getAmnetTransport().alert(alerting, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.Transport.Result
                public void notify(boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z2)});
                        return;
                    }
                    LogCatUtil.debug("AmnetOperationManager", "notifyRespResult result=[" + z2 + "]");
                }
            });
            if (alerting.receipt >= 0) {
                AmnetTunnelManager instance = AmnetTunnelManager.getInstance();
                if (alerting.duration >= 0) {
                    z = false;
                }
                instance.processRpcResult(z);
                this.c.remove(Long.valueOf(alerting.receipt));
            }
        } catch (Throwable th) {
            if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                LogCatUtil.error("AmnetOperationManager", "notifyRespResult error", th);
            }
            throw new AmnetException("notifyRespResult error", th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:(4:112|6|7|(9:122|8|9|118|10|(1:12)|13|17|18))|(4:20|110|21|(21:26|(1:28)(1:33)|34|37|38|116|(1:40)(7:44|45|120|46|(1:50)(1:49)|51|(7:53|108|54|57|(4:69|107|70|(7:79|(1:83)|84|85|(2:87|88)|89|100)(4:74|75|(2:77|65)|66))(4:61|62|(2:64|65)|66)|67|68))|41|57|(1:59)|69|107|70|(1:72)|79|(2:81|83)|84|85|(0)|89|100))(1:35)|36|37|38|116|(0)(0)|41|57|(0)|69|107|70|(0)|79|(0)|84|85|(0)|89|100) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:112|6|7|(9:122|8|9|118|10|(1:12)|13|17|18)|(4:20|110|21|(21:26|(1:28)(1:33)|34|37|38|116|(1:40)(7:44|45|120|46|(1:50)(1:49)|51|(7:53|108|54|57|(4:69|107|70|(7:79|(1:83)|84|85|(2:87|88)|89|100)(4:74|75|(2:77|65)|66))(4:61|62|(2:64|65)|66)|67|68))|41|57|(1:59)|69|107|70|(1:72)|79|(2:81|83)|84|85|(0)|89|100))(1:35)|36|37|38|116|(0)(0)|41|57|(0)|69|107|70|(0)|79|(0)|84|85|(0)|89|100) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0159, code lost:
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0231, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c3, code lost:
        r0 = new java.lang.StringBuilder(r6);
        r3 = com.alibaba.fastjson.JSON.toJSONString(r20, com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139 A[Catch: all -> 0x0158, TRY_ENTER, TryCatch #5 {all -> 0x0158, blocks: (B:40:0x0139, B:44:0x015d), top: B:116:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015d A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #5 {all -> 0x0158, blocks: (B:40:0x0139, B:44:0x015d), top: B:116:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:54:0x019c, B:57:0x01a5, B:59:0x01ab, B:61:0x01b1), top: B:108:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fe A[Catch: all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:70:0x01f8, B:72:0x01fe, B:74:0x0204, B:79:0x0234, B:81:0x023a, B:83:0x0244, B:84:0x024f), top: B:107:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023a A[Catch: all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:70:0x01f8, B:72:0x01fe, B:74:0x0204, B:79:0x0234, B:81:0x023a, B:83:0x0244, B:84:0x024f), top: B:107:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(com.alipay.mobile.common.transportext.Transport.Activating r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.amnet.biz.AmnetOperationManager.l(com.alipay.mobile.common.transportext.Transport$Activating, boolean, boolean):boolean");
    }
}
