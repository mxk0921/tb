package com.alipay.mobile.common.transport.config;

import android.content.Context;
import android.os.FileObserver;
import android.text.TextUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transport.zfeatures.LoginRefreshManager;
import com.alipay.mobile.common.utils.config.ConfigureCtrlManagerImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.a2n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TransportConfigureManager extends ConfigureCtrlManagerImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SDCARD_CONFIG_FILE = "transport_config.json";
    public static final String SDCARD_SRV_CONFIG_FILE = "srv_transport_config.json";
    public static TransportConfigureManager transportConfigureManager;
    public boolean c = false;
    public ConfigFileListener d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ConfigFileListener extends FileObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static byte STATE_BUSY = 2;
        public static byte STATE_IDLE = 1;

        /* renamed from: a  reason: collision with root package name */
        public byte f4055a = STATE_IDLE;

        public ConfigFileListener(String str) {
            super(str);
        }

        public static /* synthetic */ byte access$002(ConfigFileListener configFileListener, byte b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e36fa6df", new Object[]{configFileListener, new Byte(b)})).byteValue();
            }
            configFileListener.f4055a = b;
            return b;
        }

        public static /* synthetic */ Object ipc$super(ConfigFileListener configFileListener, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/config/TransportConfigureManager$ConfigFileListener");
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb74f7cb", new Object[]{this, new Integer(i), str});
            } else if (!TextUtils.isEmpty(str) && str.equals(NwSharedSwitchUtil.SHARED_FILE) && i == 2) {
                LogCatUtil.info("Conf_TransportConfigureManager", "ConfigFileListener. path=[" + str + "]  event=[" + i + "] ");
                byte b = this.f4055a;
                byte b2 = STATE_BUSY;
                if (b == b2) {
                    LogCatUtil.info("Conf_TransportConfigureManager", "ConfigFileListener. state is STATE_BUSY, return.");
                    return;
                }
                this.f4055a = b2;
                try {
                    NetworkAsyncTaskExecutor.executeSerial(new Runnable() { // from class: com.alipay.mobile.common.transport.config.TransportConfigureManager.ConfigFileListener.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                TransportConfigureManager.getInstance().updateConfig(TransportEnvUtil.getContext());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    LogCatUtil.error("Conf_TransportConfigureManager", "ConfigFileListener. executeSerial exception.", th);
                    this.f4055a = STATE_IDLE;
                }
            }
        }
    }

    public TransportConfigureManager() {
        d();
    }

    public static final TransportConfigureManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportConfigureManager) ipChange.ipc$dispatch("6cef96c", new Object[0]);
        }
        TransportConfigureManager transportConfigureManager2 = transportConfigureManager;
        if (transportConfigureManager2 != null) {
            return transportConfigureManager2;
        }
        synchronized (TransportConfigureManager.class) {
            try {
                TransportConfigureManager transportConfigureManager3 = transportConfigureManager;
                if (transportConfigureManager3 != null) {
                    return transportConfigureManager3;
                }
                TransportConfigureManager transportConfigureManager4 = new TransportConfigureManager();
                transportConfigureManager = transportConfigureManager4;
                return transportConfigureManager4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TransportConfigureManager transportConfigureManager2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -548367912:
                return super.parseObject((String) objArr[0]);
            case -490727030:
                super.notifyConfigureChangedEvent();
                return null;
            case -69246850:
                return new Boolean(super.updateFromSharedPref((Context) objArr[0], (String) objArr[1], (String) objArr[2]));
            case 59993334:
                super.clearConfig();
                return null;
            case 1208567045:
                return new Boolean(super.updateFromJsonStrAndSave((Context) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]));
            case 1228393960:
                return new Boolean(super.partialUpdateFromMapAndSave((Context) objArr[0], (Map) objArr[1], (String) objArr[2], (String) objArr[3]));
            case 1686691324:
                return new Boolean(super.isLoadedConfig());
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/config/TransportConfigureManager");
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = TransportEnvUtil.getContext();
        if (context == null) {
            LogCatUtil.error("Conf_TransportConfigureManager", "specialHandle.  context is null. ");
        } else if (MiscUtils.isInAlipayClient(context) && MiscUtils.isPushProcess(context) && !MiscUtils.isRealPushProcess(context) && this.d == null) {
            ConfigFileListener configFileListener = new ConfigFileListener(MiscUtils.getSharedPrefsDir(TransportEnvUtil.getContext()));
            this.d = configFileListener;
            configFileListener.startWatching();
            LogCatUtil.info("Conf_TransportConfigureManager", "configFileListener startWatching");
        }
    }

    public void delayNotifyConfigureChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18cfe787", new Object[]{this});
            return;
        }
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            LogCatUtil.warn("Conf_TransportConfigureManager", "delayNotifyConfigureChangedEvent sleep exception : " + e.toString());
        }
        notifyConfigureChangedEvent();
    }

    public final void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (TransportStrategy.isEnabledOnlyUseBifrostH2(context)) {
            enableOnlyUseBifrostH2();
        }
    }

    public void enableAmnetSetting(Context context, String str, URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3527ade8", new Object[]{this, context, str, url});
            return;
        }
        TransportConfigureManager instance = getInstance();
        instance.setValue(TransportConfigureItem.AMNET_SWITCH, a2n.ARCH_BIT64);
        instance.setValue(TransportConfigureItem.NO_DOWN_HTTPS, "1-1");
        instance.setValue(TransportConfigureItem.RPCV2_SWITCH, "T");
        instance.setValue(TransportConfigureItem.AMNET_BLACK_LIST_PHONE_BRAND, "");
        instance.setValue(TransportConfigureItem.AMNET_BLACK_LIST_PHONE_MODEL, "");
        instance.setValue(TransportConfigureItem.AMNET_BLACK_LIST_CPU_MODEL, "");
        instance.setValue(TransportConfigureItem.AMNET_DISABLED_NET_KEY, "");
        instance.setValue(TransportConfigureItem.AMNET_DISABLED_SDK_VERSION, "");
        if (!setAmnetConfigByDns(context)) {
            setAmnetConfigByGwUrl(context, str, url, instance);
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "enableAmnetSetting done");
    }

    public void enableOnlyUseBifrostH2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a3f936", new Object[]{this});
            return;
        }
        TransportConfigureManager instance = getInstance();
        instance.setValue(TransportConfigureItem.AMNET_SWITCH, a2n.ARCH_BIT64);
        instance.setValue(TransportConfigureItem.USE_BIFROST, a2n.ARCH_BIT64);
        instance.setValue(TransportConfigureItem.BIFROST_USE_H2, a2n.ARCH_BIT64);
        instance.setValue(TransportConfigureItem.INIT_MERGE_CMD, a2n.ARCH_BIT64);
        instance.setValue(TransportConfigureItem.BIFROST_DISABLSE_RPC_DOWNGRADE, a2n.ARCH_BIT64);
        instance.setValue(TransportConfigureItem.SPDY_SWITCH, UTConstant.Args.UT_SUCCESS_F);
        LogCatUtil.info("Conf_TransportConfigureManager", "enableOnlyUseBifrostH2 done");
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transport.config.TransportConfigureManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LogCatUtil.debug("Conf_TransportConfigureManager", "config change,generate new clientABTagValues");
                    }
                }
            }, 1L, TimeUnit.SECONDS);
        }
    }

    public boolean firstUpdateConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("641c9eca", new Object[]{this, context})).booleanValue();
        }
        if (this.c) {
            return true;
        }
        this.c = true;
        LogCatUtil.info("Conf_TransportConfigureManager", "=====> firstUpdateConfig <=====");
        return updateConfig(context);
    }

    public final void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        try {
            String gwfurl = ReadSettingServerUrl.getInstance().getGWFURL(context);
            URL url = new URL(gwfurl);
            LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. gw url: " + gwfurl);
            if (MiscUtils.isOnlineUrl(url)) {
                TransportConfigureItem.SPDY_SWITCH.setValue("T");
                LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. Open online env spdy finish.");
            } else if (MiscUtils.isTestUrl(url)) {
                TransportConfigureItem.SPDY_SWITCH.setValue("T");
                TransportConfigureItem.SPDY_URL.setValue(MiscUtils.getTestGwUrl());
                LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. Open test env spdy finish.");
            } else if (MiscUtils.isSandboxUrl(url)) {
                TransportConfigureItem.SPDY_SWITCH.setValue(UTConstant.Args.UT_SUCCESS_F);
                LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. Close sandbox env spdy finish.");
            } else {
                LogCatUtil.info("Conf_TransportConfigureManager", "initConfigItemsByEnv. Close unknow env amnet and spdy finish.");
                TransportConfigureItem.AMNET_SWITCH.setValue("0,0");
                TransportConfigureItem.SPDY_SWITCH.setValue(UTConstant.Args.UT_SUCCESS_F);
            }
            if (MiscUtils.isDebugger(context)) {
                TransportConfigureItem.DJG_SWITCH.setValue(a2n.ARCH_BIT64);
                LogCatUtil.printInfo("Conf_TransportConfigureManager", "initConfigItemsByEnv. Debug env, default open django switch.");
                TransportConfigureItem.IPRANK_AB_SWITCH.setValue(a2n.ARCH_BIT64);
                TransportConfigureItem.EASTEREGGS.setValue("T");
                TransportConfigureItem.LOGIN_REFRESH_SWITCH.setValue(a2n.ARCH_BIT64);
                LoginRefreshManager.getInstance().enableRefresh();
                TransportConfigureItem.GO_URLCONNECTION_SWITCH.setValue(a2n.ARCH_BIT64);
                TransportConfigureItem transportConfigureItem = TransportConfigureItem.TRANSPORT_LOCAL_AMNET;
                transportConfigureItem.setValue(a2n.ARCH_BIT64);
                getInstance().setValue(transportConfigureItem, a2n.ARCH_BIT64);
            }
        } catch (Throwable th) {
            LogCatUtil.error("Conf_TransportConfigureManager", th);
        }
    }

    @Override // com.alipay.mobile.common.utils.config.ConfigureCtrlManagerImpl, com.alipay.mobile.common.utils.config.ConfigureCtrlManager
    public String getConfgureVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50f418fc", new Object[]{this});
        }
        return getStringValue(TransportConfigureItem.VERSION);
    }

    public int getLatestVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4d4ea95", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(getConfgureVersion()) + getVersionSecond();
        } catch (Throwable th) {
            LogCatUtil.warn("Conf_TransportConfigureManager", "getLatestVersion exception : " + th.toString());
            return 0;
        }
    }

    public int getVersionSecond() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae70c130", new Object[]{this})).intValue();
        }
        return getIntValue(TransportConfigureItem.VERSION2);
    }

    public final void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        loadConfigFromSettingTool(context);
        i(context);
        e(context);
    }

    public final void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        try {
            if (MiscUtils.isDebugger(context)) {
                String configFromSdcard = MiscUtils.getConfigFromSdcard(SDCARD_CONFIG_FILE);
                if (!TextUtils.isEmpty(configFromSdcard)) {
                    LogCatUtil.info("Conf_TransportConfigureManager", "loadConfigFromSdcard: " + configFromSdcard);
                    mergeConfig(super.parseObject(configFromSdcard));
                }
            }
        } catch (Exception e) {
            LogCatUtil.error("Conf_TransportConfigureManager", e);
        }
    }

    public final void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{this, context});
            return;
        }
        g(context);
        e(context);
    }

    @Override // com.alipay.mobile.common.utils.config.ConfigureCtrlManagerImpl, com.alipay.mobile.common.utils.config.ConfigureCtrlManager
    public void notifyConfigureChangedEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c0198a", new Object[]{this});
            return;
        }
        int latestVersion = getLatestVersion();
        LogCatUtil.info("Conf_TransportConfigureManager", "notifyConfigureChangedEvent. currentVersion=[0], latestVersion=[" + latestVersion + "] ");
        super.notifyConfigureChangedEvent();
        getInstance().f();
    }

    public boolean resetConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35bf2954", new Object[]{this, context})).booleanValue();
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "resetConfig");
        return updateConfig(context);
    }

    public void setAmnetConfigByGwUrl(Context context, String str, URL url, TransportConfigureManager transportConfigureManager2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a346af7", new Object[]{this, context, str, url, transportConfigureManager2});
            return;
        }
        if (MiscUtils.isOnlineUrl(url)) {
            if (MiscUtils.isRCVersion(context)) {
                transportConfigureManager2.setValue(TransportConfigureItem.MMTP_URL, "mygwrc.alipay.com:443");
            } else {
                transportConfigureManager2.setValue(TransportConfigureItem.MMTP_URL, "mygw.alipay.com:443");
            }
        } else if (MiscUtils.isPreUrl(url)) {
            transportConfigureManager2.setValue(TransportConfigureItem.MMTP_URL, "mygwpre.alipay.com:443");
        } else if (url.getPort() != -1) {
            TransportConfigureItem transportConfigureItem = TransportConfigureItem.MMTP_URL;
            transportConfigureManager2.setValue(transportConfigureItem, url.getHost() + ":" + url.getPort());
            if (url.getPort() == 8903) {
                transportConfigureManager2.setValue(TransportConfigureItem.AMNET_HS, UTConstant.Args.UT_SUCCESS_F);
            } else {
                transportConfigureManager2.setValue(TransportConfigureItem.AMNET_HS, "T");
            }
        } else {
            TransportConfigureItem transportConfigureItem2 = TransportConfigureItem.MMTP_URL;
            transportConfigureManager2.setValue(transportConfigureItem2, url.getHost() + ":443");
            transportConfigureManager2.setValue(TransportConfigureItem.AMNET_HS, "T");
        }
        LogCatUtil.debug("Conf_TransportConfigureManager", "enableAmnetSetting gw_url=[" + str + "] mapping to amnet_url=" + transportConfigureManager2.getStringValue(TransportConfigureItem.MMTP_URL) + "");
    }

    public boolean updateConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83080b9a", new Object[]{this, context})).booleanValue();
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "updateConfig");
        try {
            j(context);
            super.clearConfig();
            super.updateFromSharedPref(context, NwSharedSwitchUtil.SHARED_FILE_NAME, NwSharedSwitchUtil.KEY_NET_SWITCH_ONE);
            super.updateFromSharedPref(context, NwSharedSwitchUtil.SHARED_FILE_NAME, NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
            h(context);
            return super.isLoadedConfig();
        } catch (Exception e) {
            LogCatUtil.error("Conf_TransportConfigureManager", e);
            return false;
        } finally {
            this.c = true;
            notifyConfigureChangedEvent();
        }
    }

    public boolean loadConfigFromSettingTool(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("856e37cf", new Object[]{this, context})).booleanValue();
        }
        try {
            if (!MiscUtils.isDebugger(context)) {
                return false;
            }
            ReadSettingServerUrl instance = ReadSettingServerUrl.getInstance();
            Boolean isEnableAmnetSetting = instance.isEnableAmnetSetting(context);
            LogCatUtil.debug("Conf_TransportConfigureManager", "enableAmnetSetting=[" + isEnableAmnetSetting + "]");
            if (isEnableAmnetSetting == null) {
                return false;
            }
            String gwfurl = instance.getGWFURL(context);
            URL url = new URL(gwfurl);
            if (isEnableAmnetSetting == Boolean.TRUE) {
                enableAmnetSetting(context, gwfurl, url);
            } else {
                TransportConfigureManager instance2 = getInstance();
                instance2.setValue(TransportConfigureItem.SPDY_SWITCH, UTConstant.Args.UT_SUCCESS_F);
                instance2.setValue(TransportConfigureItem.AMNET_SWITCH, "0,0,0");
                instance2.setValue(TransportConfigureItem.NO_DOWN_HTTPS, "0-1");
                instance2.setValue(TransportConfigureItem.RPCV2_SWITCH, "T");
                LogCatUtil.info("Conf_TransportConfigureManager", "Disable ext transport!");
            }
            LogCatUtil.debug("Conf_TransportConfigureManager", "settings config load finish!");
            return true;
        } catch (Exception e) {
            LogCatUtil.warn("Conf_TransportConfigureManager", e.toString());
            return false;
        }
    }

    public boolean setAmnetConfigByDns(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a803fc4", new Object[]{this, context})).booleanValue();
        }
        TransportConfigureManager instance = getInstance();
        String amnetDnsSetting = ReadSettingServerUrl.getInstance().getAmnetDnsSetting(context);
        if (TextUtils.isEmpty(amnetDnsSetting)) {
            return false;
        }
        String trim = amnetDnsSetting.trim();
        if (TextUtils.isEmpty(trim)) {
            return false;
        }
        instance.setValue(TransportConfigureItem.MMTP_URL, trim);
        if (trim.endsWith(":8903")) {
            LogCatUtil.info("Conf_TransportConfigureManager", "setAmnetConfigByDns port is 8903, don't need to shake hands");
            instance.setValue(TransportConfigureItem.AMNET_HS, UTConstant.Args.UT_SUCCESS_F);
        } else {
            instance.setValue(TransportConfigureItem.AMNET_HS, "T");
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "setAmnetConfigByDns finish,  amnetDnsSetting=[" + trim + "]");
        return true;
    }

    public boolean updateConfig(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2e272f8", new Object[]{this, context, str, new Boolean(z)})).booleanValue();
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "updateConfig json: " + str);
        try {
            if (z) {
                try {
                    super.clearConfig();
                } catch (Exception e) {
                    LogCatUtil.error("Conf_TransportConfigureManager", e);
                    this.c = true;
                    delayNotifyConfigureChangedEvent();
                    return false;
                }
            }
            j(context);
            super.updateFromSharedPref(context, NwSharedSwitchUtil.SHARED_FILE_NAME, NwSharedSwitchUtil.KEY_NET_SWITCH_ONE);
            super.updateFromJsonStrAndSave(context, str, NwSharedSwitchUtil.SHARED_FILE_NAME, NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
            h(context);
            boolean isLoadedConfig = super.isLoadedConfig();
            this.c = true;
            delayNotifyConfigureChangedEvent();
            return isLoadedConfig;
        } catch (Throwable th) {
            this.c = true;
            delayNotifyConfigureChangedEvent();
            throw th;
        }
    }

    public boolean updateConfig(Context context, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ffd4d3d", new Object[]{this, context, map, str})).booleanValue();
        }
        LogCatUtil.info("Conf_TransportConfigureManager", "updateConfig map config: " + map.toString());
        try {
            j(context);
            super.partialUpdateFromMapAndSave(context, map, NwSharedSwitchUtil.SHARED_FILE_NAME, str);
            return super.isLoadedConfig();
        } catch (Exception e) {
            LogCatUtil.error("Conf_TransportConfigureManager", e);
            return false;
        } finally {
            this.c = true;
            delayNotifyConfigureChangedEvent();
        }
    }
}
