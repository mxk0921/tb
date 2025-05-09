package com.alipay.mobile.common.transport;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.netsdkextdependapi.configservice.NwConfigServiceUtil;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.strategy.StrategyUtil;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.util.NetInfoHelper;
import com.alipay.mobile.common.utils.config.ConfigureChangedListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.Arrays;
import java.util.Observable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TransportStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SWITCH_OPEN_STR = "T";
    public static final String TAG = "TransportStrategy";
    public static Pair<Boolean, Long> b;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f4050a = {NetInfoHelper.CMWAP_PROXY_HOST, "10.0.0.200"};
    public static int c = 0;
    public static Boolean d = null;
    public static Boolean e = null;
    public static Boolean f = null;
    public static Boolean g = null;
    public static byte h = -2;
    public static boolean i = true;
    public static String[] j = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class InnerConfigureChangedListener implements ConfigureChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            } else {
                TransportStrategy.access$002(null);
            }
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = new Pair<>(Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis() + 60000));
        }
    }

    public static /* synthetic */ String[] access$002(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("249d4055", new Object[]{strArr});
        }
        j = strArr;
        return strArr;
    }

    public static boolean allowHttpsRetry(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("547d56bb", new Object[]{str})).booleanValue();
        }
        try {
            if (!d()) {
                return false;
            }
            return isApiInList(str, TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.HTTPS_RETRY_RPC_LIST));
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "allowHttpsRetry ex= " + th.toString());
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.GZIP_SWITCH, "T");
    }

    public static String[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("11a28f78", new Object[0]);
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_H2_MULTIPLEX_GW_DOMAIN_WHITE_LIST);
        if (TextUtils.isEmpty(stringValue)) {
            return null;
        }
        return stringValue.split(",");
    }

    public static final boolean checkCanUseExtTransportByURL(URL url, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4becc0b5", new Object[]{url, context})).booleanValue();
        }
        if (isAlipayHost(url.getHost())) {
            return true;
        }
        if (!isEnabledEnhanceNetworkModule()) {
            LogCatUtil.info(TAG, "[checkCanUseExtTransportByURL] Not enabled enhance network module");
            return false;
        }
        URL gWFURLObj = ReadSettingServerUrl.getInstance().getGWFURLObj(context);
        if (TextUtils.equals(url.getHost(), gWFURLObj.getHost())) {
            return true;
        }
        LogCatUtil.info(TAG, "[checkCanUseExtTransportByURL] URL don't support. target url: " + url.getHost() + ", setting gw url: " + gWFURLObj.getHost());
        return false;
    }

    public static void configInit(Context context, String str, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10698aae", new Object[]{context, str, transportContext});
            return;
        }
        try {
            LogCatUtil.debug(TAG, "RPC TRANSPORT CONFIG INIT");
            fillNetTypes(context, transportContext);
            transportContext.reqGzip = b();
            transportContext.api = str;
            transportContext.setInitd(true);
        } catch (Exception e2) {
            LogCatUtil.error(TAG, "RPC网络配置初始时异常", e2);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        try {
            return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.HTTPS_RETRY_RPC_SWITCH));
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "enableRpcHttpsRetry ex= " + th.toString());
            return false;
        }
    }

    public static boolean enableSwitchRpcDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f9a95bd", new Object[0])).booleanValue();
        }
        try {
            String config = NwConfigServiceUtil.getConfig("domain_switch");
            if (config == null) {
                LogCatUtil.info(TAG, "enableSwitchRpcDomain, value null");
                return false;
            }
            boolean grayscaleUtdid = MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), config);
            LogCatUtil.info(TAG, "[enableSwitchRpcDomain] switchValue: " + config + ", result: " + grayscaleUtdid);
            return grayscaleUtdid;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "enableSwitchRpcDomain ex= " + th.toString());
            return false;
        }
    }

    public static void fillCurrentReqInfo(boolean z, String str, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e502c6", new Object[]{new Boolean(z), str, transportContext});
            return;
        }
        TransportContext.SingleRPCReqConfig singleRPCReqConfig = new TransportContext.SingleRPCReqConfig();
        singleRPCReqConfig.use = z;
        singleRPCReqConfig.protocol = str;
        transportContext.currentReqInfo = singleRPCReqConfig;
    }

    public static void fillNetTypes(Context context, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d350045", new Object[]{context, transportContext});
            return;
        }
        try {
            transportContext.net0 = ConnectionUtil.getConnType(context);
            transportContext.net1 = ConnectionUtil.getNetworkType(context);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "fillNetTypes ex= " + th.toString());
        }
    }

    public static Boolean getBooleanFromMetaData(Context context, String str, Boolean bool) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ffa16c6a", new Object[]{context, str, bool});
        }
        if (context != null) {
            Object metaDataVO = MiscUtils.getMetaDataVO(context, str);
            if (metaDataVO != null) {
                try {
                    z = ((Boolean) metaDataVO).booleanValue();
                } catch (Throwable unused) {
                }
                LogCatUtil.info(TAG, "getBooleanFromMetaData. metaDataKey:" + str + ", meta data switch is : " + z);
                return Boolean.valueOf(z);
            }
        } else {
            LogCatUtil.warn(TAG, "getBooleanFromMetaData. Oppps, context is null.");
        }
        return bool;
    }

    public static final TransportConfigureManager getConfigureManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportConfigureManager) ipChange.ipc$dispatch("7563e2be", new Object[0]);
        }
        return TransportConfigureManager.getInstance();
    }

    public static final int getConnTimeout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f389a15", new Object[]{context})).intValue();
        }
        return TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.CONN_TIME_OUT);
    }

    public static final Boolean getEnableOnlyPushStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("1d65b0d5", new Object[0]);
        }
        Pair<Boolean, Long> pair = b;
        if (pair == null || pair.first == null || pair.second == null || System.currentTimeMillis() >= ((Long) b.second).longValue()) {
            return null;
        }
        Boolean bool = (Boolean) b.first;
        bool.booleanValue();
        return bool;
    }

    public static final int getHandshakTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c54d6b17", new Object[0])).intValue();
        }
        return TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.HANDSHAK_TIMEOUT);
    }

    public static final String getStrategyVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e524f6aa", new Object[0]);
        }
        return TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.VERSION);
    }

    public static final void incrementRpcErrorCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc1be84", new Object[0]);
            return;
        }
        LogCatUtil.info(TAG, "incrementRpcErrorCount finish");
        c++;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            TransportConfigureManager.getInstance().addConfigureChangedListener(new InnerConfigureChangedListener());
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[init] Exception = " + th.toString(), th);
        }
    }

    public static final boolean isAlipayHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30c94971", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.contains("alipay")) {
            return true;
        }
        return false;
    }

    public static boolean isAlipayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8846b510", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return isAlipayHost(new URL(str).getHost());
    }

    public static boolean isApiInList(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72b7b732", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            for (String str3 : str2.split(",")) {
                if (TextUtils.equals(str3, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDisableBifrostRpcDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1956d95a", new Object[0])).booleanValue();
        }
        try {
            return MiscUtils.grayscaleUtdidForABTest(TransportConfigureItem.BIFROST_DISABLSE_RPC_DOWNGRADE);
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, th);
            return false;
        }
    }

    public static final boolean isDowngradeToHttps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6af46050", new Object[0])).booleanValue();
        }
        if (c <= 3) {
            return true;
        }
        return false;
    }

    public static boolean isEnableBifrost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2371235b", new Object[0])).booleanValue();
        }
        try {
            if (!MiscUtils.grayscaleUtdidForABTest(TransportConfigureItem.USE_BIFROST)) {
                LogCatUtil.warn(TAG, "isEnableBifrost,switch off");
                return false;
            }
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_BLACK_LIST_BRAND);
            if (!StrategyUtil.isUse4Brand(stringValue)) {
                LogCatUtil.warn(TAG, "isUse4Brand is false. brandBlackList=[" + stringValue + "]");
                return false;
            }
            String stringValue2 = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_BLACK_LIST_MODEL);
            if (!StrategyUtil.isUse4Model(stringValue2)) {
                LogCatUtil.warn(TAG, "isUse4Model is false. modelBlackList=[" + stringValue2 + "]");
                return false;
            }
            String stringValue3 = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_BLACK_LIST_CPU);
            if (!StrategyUtil.isUse4Hardware(stringValue3)) {
                LogCatUtil.warn(TAG, "isUse4Hardware is false. cpuModelBlackList=[" + stringValue3 + "]");
                return false;
            }
            String stringValue4 = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_BLACK_LIST_SDK);
            if (StrategyUtil.isUse4SdkVersion(stringValue4)) {
                return true;
            }
            LogCatUtil.warn(TAG, "isUse4SdkVersion is false. sdkVersionBlackList=[" + stringValue4 + "]");
            return false;
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, th);
            return false;
        }
    }

    public static boolean isEnableIPv6() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aae31d3f", new Object[0])).booleanValue();
        }
        try {
            return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.USE_IPV6));
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isEnableIPv6 ex:" + th.toString());
            return false;
        }
    }

    public static final boolean isEnableInitMergeSyncSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f75563d5", new Object[0])).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.INIT_MERGE_CMD);
        LogCatUtil.debug(TAG, "isEnableInitMergeSyncSwitch=[" + stringValue + "]");
        return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), stringValue);
    }

    public static boolean isEnableMarsMultiLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10c74f3c", new Object[0])).booleanValue();
        }
        if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.MARS_MULTILINK), "T")) {
            return true;
        }
        return false;
    }

    public static final boolean isEnableNBNetDLSwitch() {
        Boolean isEnabledNbnetDownloadSwitch;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9e7de83", new Object[0])).booleanValue();
        }
        if (!MiscUtils.isDebugger(TransportEnvUtil.getContext()) || (isEnabledNbnetDownloadSwitch = ReadSettingServerUrl.getInstance().isEnabledNbnetDownloadSwitch(TransportEnvUtil.getContext())) == null) {
            if (MiscUtils.isOversea() && !MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                LogCatUtil.info(TAG, "isEnableNBNetDLSwitch. Current users are overseas user.");
                if (MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NBNET_DL_OVERSEA_SWITCH))) {
                    LogCatUtil.warn(TAG, "isEnableNBNetDLSwitch. Oversea user disabled nbnet download!");
                    return false;
                }
            }
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NBNET_DL_SWITCH);
            boolean grayscaleUtdid = MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), stringValue);
            LogCatUtil.info(TAG, "[isEnableNBNetDLSwitch] grayscaleResult.  switchValue:" + stringValue + ", grayscaleResult:" + grayscaleUtdid);
            return grayscaleUtdid;
        }
        LogCatUtil.info(TAG, "isEnableNBNetDLSwitch Setting's config: " + isEnabledNbnetDownloadSwitch.booleanValue());
        return isEnabledNbnetDownloadSwitch.booleanValue();
    }

    public static final boolean isEnableOnlyBifrostStdH2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ab9011c", new Object[]{context})).booleanValue();
        }
        Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean booleanFromMetaData = MiscUtils.getBooleanFromMetaData(context, "only_bifrost_std_h2_module");
            if (booleanFromMetaData) {
                f = Boolean.TRUE;
            } else {
                f = Boolean.FALSE;
            }
            LogCatUtil.info(TAG, "[isEnableOnlyBifrostStdH2] only_bifrost_std_h2_module: " + booleanFromMetaData);
            return booleanFromMetaData;
        } catch (Exception e2) {
            LogCatUtil.warn(TAG, "[isEnableOnlyBifrostStdH2] Exception: " + e2.toString());
            Boolean bool2 = Boolean.FALSE;
            f = bool2;
            return bool2.booleanValue();
        }
    }

    public static final boolean isEnabledAutoUpgrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23a4a7c1", new Object[0])).booleanValue();
        }
        Boolean booleanFromMetaData = getBooleanFromMetaData(TransportEnvUtil.getContext(), "auto_upgrade_switch", null);
        if (booleanFromMetaData != null) {
            return booleanFromMetaData.booleanValue();
        }
        boolean grayscaleUtdid = MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SUPPORT_AUTO_UPGRADE_SWITCH));
        LogCatUtil.info(TAG, "isEnabledAutoUpgrade. grayscale switch is: " + grayscaleUtdid);
        return grayscaleUtdid;
    }

    public static boolean isEnabledBifrostH2MultipleSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f79d3f9f", new Object[0])).booleanValue();
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[isEnabledBifrostH2MultipleSwitch] Exception = " + th.toString());
        }
        if (MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.BIFROST_H2_MULTIPLEX_GW_DOMAIN_SWITCH))) {
            return true;
        }
        return false;
    }

    public static boolean isEnabledCacheAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecb06274", new Object[0])).booleanValue();
        }
        return TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.ENABLED_CACHE_ADDRESS, "T");
    }

    public static final boolean isEnabledDjangoSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9a90c51", new Object[0])).booleanValue();
        }
        return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DJG_SWITCH));
    }

    public static final boolean isEnabledEnhanceNetworkModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91695a8e", new Object[0])).booleanValue();
        }
        if (isEnabledOnlyUseBifrostH2(TransportEnvUtil.getContext()) || isUseEnhanceNetworkFromMetaData(TransportEnvUtil.getContext())) {
            return true;
        }
        return false;
    }

    public static final boolean isEnabledOnlyPush() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("238dfac8", new Object[0])).booleanValue();
        }
        Boolean enableOnlyPushStatus = getEnableOnlyPushStatus();
        if (enableOnlyPushStatus != null) {
            return enableOnlyPushStatus.booleanValue();
        }
        synchronized (TransportStrategy.class) {
            try {
                Boolean enableOnlyPushStatus2 = getEnableOnlyPushStatus();
                if (enableOnlyPushStatus2 != null) {
                    return enableOnlyPushStatus2.booleanValue();
                }
                Context context = TransportEnvUtil.getContext();
                if (context != null) {
                    Object metaDataVO = MiscUtils.getMetaDataVO(context, "only_push_switch");
                    if (metaDataVO != null) {
                        try {
                            z = ((Boolean) metaDataVO).booleanValue();
                        } catch (Throwable unused) {
                        }
                        LogCatUtil.info(TAG, "isEnabledOnlyPush. meta data switch is : " + z);
                        a(z);
                        return z;
                    }
                } else {
                    LogCatUtil.warn(TAG, "isEnabledOnlyPush. Oppps, context is null.");
                }
                boolean grayscaleUtdid = MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SUPPORT_ONLY_PUSH_SWITCH));
                LogCatUtil.info(TAG, "isEnabledOnlyPush. grayscale switch is: " + grayscaleUtdid);
                a(grayscaleUtdid);
                return grayscaleUtdid;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final boolean isEnabledOnlyUseBifrostH2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d0e72a2", new Object[]{context})).booleanValue();
        }
        if (isEnabledOnlyUseBifrostH2WithPrivateFrame(context) || isEnableOnlyBifrostStdH2(context)) {
            return true;
        }
        return false;
    }

    public static final boolean isEnabledOnlyUseBifrostH2WithPrivateFrame(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c97618f2", new Object[]{context})).booleanValue();
        }
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean booleanFromMetaData = MiscUtils.getBooleanFromMetaData(context, "only_bifrost_h2_module");
            if (booleanFromMetaData) {
                e = Boolean.TRUE;
            } else {
                e = Boolean.FALSE;
            }
            LogCatUtil.info(TAG, "[isEnabledOnlyUseBifrostH2WithPrivateFrame] only_bifrost_h2_module: " + booleanFromMetaData);
            return booleanFromMetaData;
        } catch (Exception e2) {
            LogCatUtil.warn(TAG, "[isEnabledOnlyUseBifrostH2WithPrivateFrame] Exception: " + e2.toString());
            Boolean bool2 = Boolean.FALSE;
            e = bool2;
            return bool2.booleanValue();
        }
    }

    public static final boolean isEnabledRpcV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cda4655", new Object[0])).booleanValue();
        }
        return TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RPCV2_SWITCH), "T");
    }

    public static final boolean isEnabledTransportByLocalAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea77a15a", new Object[0])).booleanValue();
        }
        if (!i) {
            LogCatUtil.info(TAG, "[isEnabledTransportByLocalAmnet] Cache flag be false.");
            return false;
        }
        if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.TRANSPORT_LOCAL_AMNET)) || !isEnableBifrost()) {
            return false;
        }
        LogCatUtil.info(TAG, "[isEnabledTransportByLocalAmnet] result = true.");
        return true;
    }

    public static final boolean isMobileWapProxyIp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2fdd250", new Object[]{str})).booleanValue();
        }
        String[] strArr = f4050a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (strArr[i2].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNetworkRunInSingleProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d894dc6a", new Object[]{context})).booleanValue();
        }
        Boolean bool = g;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean booleanFromMetaData = MiscUtils.getBooleanFromMetaData(context, "network_run_single_process");
            if (booleanFromMetaData) {
                g = Boolean.TRUE;
            } else {
                g = Boolean.FALSE;
            }
            LogCatUtil.info(TAG, "[isNetworkRunInSingleProcess] network_run_single_process: " + booleanFromMetaData);
            return booleanFromMetaData;
        } catch (Exception e2) {
            LogCatUtil.warn(TAG, "[isNetworkRunInSingleProcess] Exception: " + e2.toString());
            Boolean bool2 = Boolean.FALSE;
            g = bool2;
            return bool2.booleanValue();
        }
    }

    public static final boolean isOpenAmdcSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d210fd7e", new Object[0])).booleanValue();
        }
        byte b2 = h;
        if (b2 >= 0) {
            return b2 == 1;
        }
        if (b2 == -2) {
            Boolean booleanFromMetaData = getBooleanFromMetaData(TransportEnvUtil.getContext(), "use_amdc", null);
            if (booleanFromMetaData != null) {
                h = booleanFromMetaData.booleanValue() ? (byte) 1 : (byte) 0;
                return booleanFromMetaData.booleanValue();
            }
            h = (byte) -1;
        }
        if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DNS_SWITCH), "T")) {
            return true;
        }
        LogCatUtil.debug(TAG, "dnsSwitch is off");
        return false;
    }

    public static final boolean isRpcCdnHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a480d5af", new Object[]{str})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.CDN_URL);
        if (TextUtils.isEmpty(stringValue)) {
            return false;
        }
        try {
            return TextUtils.equals(new URL(stringValue).getHost(), str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean isUseAmnetService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee8e42c", new Object[0])).booleanValue();
        }
        return getBooleanFromMetaData(TransportEnvUtil.getContext(), "use_amnet_service", Boolean.FALSE).booleanValue();
    }

    public static final boolean isUseEnhanceNetworkFromMetaData(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("985d0a2f", new Object[]{context})).booleanValue();
        }
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean booleanFromMetaData = MiscUtils.getBooleanFromMetaData(context, "use_enhance_network");
            if (booleanFromMetaData) {
                d = Boolean.TRUE;
            } else {
                d = Boolean.FALSE;
            }
            LogCatUtil.info(TAG, "[isUseEnhanceNetworkFromMetaData] use_enhance_network: " + booleanFromMetaData);
            return booleanFromMetaData;
        } catch (Exception e2) {
            LogCatUtil.warn(TAG, "[isUseEnhanceNetworkFromMetaData] Exception: " + e2.toString());
            Boolean bool2 = Boolean.FALSE;
            d = bool2;
            return bool2.booleanValue();
        }
    }

    public static boolean isVip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8fd3d9e", new Object[0])).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.WHITE_LIST_USER);
        if (stringValue == null || !TextUtils.equals(stringValue, "T")) {
            return false;
        }
        return true;
    }

    public static boolean loadConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d193625d", new Object[]{context})).booleanValue();
        }
        try {
            TransportConfigureManager configureManager = getConfigureManager();
            if (!configureManager.isLoadedConfig()) {
                if (!configureManager.updateConfig(context)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            LogCatUtil.warn(TAG, e2);
            return false;
        }
    }

    public static final void resetRpcErrorCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c28a4", new Object[0]);
            return;
        }
        if (c > 0) {
            LogCatUtil.info(TAG, "resetRpcErrorCount finish");
        }
        c = 0;
    }

    public static void setEnabledLocamAmnetCacheFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c1dac3", new Object[]{new Boolean(z)});
        } else {
            i = z;
        }
    }

    public static void setUseCookieCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ee6254", new Object[]{new Boolean(z)});
        } else if (z) {
            TransportConfigureManager.getInstance().setValue(TransportConfigureItem.COOKIE_CACHE_SWITCH, "T");
            LogCatUtil.info(TAG, "setUseCookieCache true");
        } else {
            TransportConfigureManager.getInstance().setValue(TransportConfigureItem.COOKIE_CACHE_SWITCH, UTConstant.Args.UT_SUCCESS_F);
            LogCatUtil.info(TAG, "setUseCookieCache false");
        }
    }

    public static void setUseMarsMultiLink(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6c2314", new Object[]{new Boolean(z)});
        } else if (z) {
            TransportConfigureManager.getInstance().setValue(TransportConfigureItem.MARS_MULTILINK, "T");
        } else {
            TransportConfigureManager.getInstance().setValue(TransportConfigureItem.MARS_MULTILINK, UTConstant.Args.UT_SUCCESS_F);
            LogCatUtil.info(TAG, "setUseMarsMultiLink false");
        }
    }

    public static final int getReadTimeout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea2fd77f", new Object[]{context})).intValue();
        }
        TransportConfigureManager instance = TransportConfigureManager.getInstance();
        if (context == null) {
            LogCatUtil.error(TAG, "context is null. reivew code please !");
            return instance.getIntValue(TransportConfigureItem.WIFI_READ_TIMEOUT);
        }
        int networkType = NetworkUtils.getNetworkType(context);
        LogCatUtil.debug(TAG, "getReadTimeout networkType=" + networkType);
        if (networkType == 1) {
            return instance.getIntValue(TransportConfigureItem.SECOND_GEN_READ_TIMEOUT);
        }
        if (networkType != 2) {
            if (networkType == 3) {
                return instance.getIntValue(TransportConfigureItem.WIFI_READ_TIMEOUT);
            }
            if (networkType != 4) {
                return instance.getIntValue(TransportConfigureItem.WIFI_READ_TIMEOUT);
            }
        }
        return instance.getIntValue(TransportConfigureItem.THIRD_GEN_READ_TIMEOUT);
    }

    public static boolean isHitBifrostH2MultiplexByUrl(String str) {
        URL url;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64e71e43", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !isEnabledBifrostH2MultipleSwitch()) {
            return false;
        }
        try {
            url = new URL(str);
        } catch (Throwable unused) {
            LogCatUtil.error(TAG, "[isHitBifrostH2MultiplexByUrl] ");
        }
        if (!url.getProtocol().equalsIgnoreCase("https")) {
            return false;
        }
        String[] strArr = j;
        if (strArr == null || strArr.length <= 0) {
            strArr = c();
            j = strArr;
            if (strArr != null && strArr.length > 0) {
                LogCatUtil.info(TAG, "[isHitBifrostH2MultiplexByUrl] domain list = " + Arrays.toString(strArr));
            }
        }
        String host = url.getHost();
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2) && host.equalsIgnoreCase(str2.trim())) {
                LogCatUtil.info(TAG, "isHitBifrostH2MultiplexByUrl return true,host= " + host);
                return true;
            }
        }
        return false;
    }

    public static boolean isSupportZstd(String str) {
        TransportConfigureManager instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b0c3063", new Object[]{str})).booleanValue();
        }
        try {
            instance = TransportConfigureManager.getInstance();
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "isSupportZstd: " + th.toString());
        }
        if (isApiInList(str, instance.getStringValue(TransportConfigureItem.ZSTD_BLACK_LIST))) {
            LogCatUtil.warn(TAG, str + " in zstd black list.");
            return false;
        } else if (instance.getIntValue(TransportConfigureItem.ZSTD_WHITE_LIST_SWITCH) == 0) {
            return true;
        } else {
            if (isApiInList(str, instance.getStringValue(TransportConfigureItem.ZSTD_WHITE_LIST))) {
                LogCatUtil.info(TAG, str + " in zstd white list.");
                return true;
            }
            return false;
        }
    }
}
