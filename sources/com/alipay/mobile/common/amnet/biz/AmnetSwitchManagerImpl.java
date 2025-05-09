package com.alipay.mobile.common.amnet.biz;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnetcore.AmnetSwitchManager;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.config.UserNetworkPreferencesManager;
import com.alipay.mobile.common.transport.strategy.StrategyUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transportext.Transport;
import com.alipay.mobile.common.utils.config.ConfigureChangedListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetSwitchManagerImpl implements AmnetSwitchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AmnetSwitchManagerImpl c;
    public static final Map<String, AmnetConfigureItem> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final AmnetSwitchChangedListener f3897a = new AmnetSwitchChangedListener();
    public Boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AmnetSwitchChangedListener implements ConfigureChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AmnetSwitchChangedListener() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
                return;
            }
            LogCatUtil.info("AMNET-SW", "switch update");
            if (((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).isActivated()) {
                Transport.Altering altering = new Transport.Altering();
                altering.id = 1L;
                altering.status = 12;
                Transport.instance().alter(altering, new Transport.Result() { // from class: com.alipay.mobile.common.amnet.biz.AmnetSwitchManagerImpl.AmnetSwitchChangedListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.common.transportext.Transport.Result
                    public void notify(boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("954c4d84", new Object[]{this, new Boolean(z)});
                            return;
                        }
                        LogCatUtil.info("AMNET-SW", "notify amnet update switch, result=" + z);
                    }
                });
                AmnetTunnelManager.getInstance().updateBifrostSwitch();
                AmnetTunnelManager.getInstance().considerTunnelChange();
                AmnetSwitchManagerImpl.access$000(AmnetSwitchManagerImpl.this);
            }
        }
    }

    static {
        AmnetConfigureItem[] values;
        for (AmnetConfigureItem amnetConfigureItem : AmnetConfigureItem.values()) {
            d.put(amnetConfigureItem.getConfigName(), amnetConfigureItem);
        }
    }

    public static /* synthetic */ void access$000(AmnetSwitchManagerImpl amnetSwitchManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9f61fa", new Object[]{amnetSwitchManagerImpl});
        } else {
            amnetSwitchManagerImpl.a();
        }
    }

    public static AmnetSwitchManagerImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetSwitchManagerImpl) ipChange.ipc$dispatch("9e075093", new Object[0]);
        }
        AmnetSwitchManagerImpl amnetSwitchManagerImpl = c;
        if (amnetSwitchManagerImpl != null) {
            return amnetSwitchManagerImpl;
        }
        synchronized (AmnetSwitchManagerImpl.class) {
            try {
                AmnetSwitchManagerImpl amnetSwitchManagerImpl2 = c;
                if (amnetSwitchManagerImpl2 != null) {
                    return amnetSwitchManagerImpl2;
                }
                AmnetSwitchManagerImpl amnetSwitchManagerImpl3 = new AmnetSwitchManagerImpl();
                c = amnetSwitchManagerImpl3;
                return amnetSwitchManagerImpl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Pair<String, Integer> value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (MiscUtils.isDebugger(AmnetEnvHelper.getAppContext())) {
                LogCatUtil.info("AMNET-SW", "[updateBindedHostInfos] Enter.");
            }
            UserNetworkPreferencesManager.getInstance().forceLoadLocalBindHosts();
            Map<String, Pair<String, Integer>> allBindHostPairs = UserNetworkPreferencesManager.getInstance().getAllBindHostPairs();
            if (allBindHostPairs != null && !allBindHostPairs.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                AmnetOperationManager amnetOperationManager = (AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class);
                for (Map.Entry<String, Pair<String, Integer>> entry : allBindHostPairs.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && (value = entry.getValue()) != null) {
                        if (value == UserNetworkPreferencesManager.EMPTY_PAIR) {
                            amnetOperationManager.setBindHost(entry.getKey(), "");
                        } else {
                            String str = ((String) value.first) + ":" + value.second;
                            amnetOperationManager.setBindHost(entry.getKey(), str);
                            sb.append(entry.getKey());
                            sb.append("=");
                            sb.append(str);
                            sb.append(",");
                        }
                    }
                }
                if (sb.length() > 0) {
                    LogCatUtil.info("AMNET-SW", "[updateBindedHostInfos] Host infos = " + sb.toString());
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("AMNET-SW", "[updateBindedHostInfos] Exception: " + th.toString(), th);
        }
    }

    public final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("T")) {
            return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), str2);
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("B")) {
            if (TextUtils.isEmpty(str2) || !str2.startsWith("T")) {
                return false;
            }
            return true;
        } else if (TextUtils.isEmpty(str2)) {
            return true;
        } else {
            return StrategyUtil.isUse4Model(str2.trim().toLowerCase().replaceAll("\\s+", "_"));
        }
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public long downgradePeriod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("666af011", new Object[]{this})).longValue();
        }
        try {
            long longValue = TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.ZSTD_DOWNGRADE_PERIOD);
            if (longValue < 0) {
                return 7200L;
            }
            return longValue;
        } catch (Throwable th) {
            LogCatUtil.warn("AMNET-SW", "downgradePeriod: " + th.toString());
            return 7200L;
        }
    }

    public boolean enableBifrostDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c8c84c6", new Object[]{this})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_DOWNGRADE_ENABLE);
        if (TextUtils.isEmpty(stringValue) || !"0".equals(stringValue)) {
            return true;
        }
        return false;
    }

    public boolean enableBifrostHttp2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d824d7b", new Object[]{this})).booleanValue();
        }
        return MiscUtils.grayscaleUtdidForABTest(TransportConfigureItem.BIFROST_USE_H2);
    }

    public boolean enableBifrostLocalDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51ffd24f", new Object[]{this})).booleanValue();
        }
        if (MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_LOCAL_DOWNGRADE_ENABLE))) {
            return true;
        }
        LogCatUtil.info("AMNET-SW", "[enableBifrostLocalDowngrade] No downgrade.");
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean enableBifrostUseWakeLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c136de7", new Object[]{this})).booleanValue();
        }
        try {
            String stringValue = TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_WAKELOCK_SWITCH);
            if (!TextUtils.isEmpty(stringValue)) {
                if ("1".equals(stringValue)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("AMNET-SW", "enableBifrostUseWakeLock error:", th);
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean enableListenNetworkSignalStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b826bd8", new Object[]{this})).booleanValue();
        }
        try {
            String stringValue = TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_LISTEN_SIGNAL_STRENGTH);
            LogCatUtil.info("AMNET-SW", "enableNetworkSignalStrengthListen b_lss=" + stringValue);
            if (!TextUtils.isEmpty(stringValue)) {
                if ("T".equals(stringValue)) {
                    return true;
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error("AMNET-SW", "enableListenNetworkSignalStrength error:", th);
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean forceTlsVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38f002b4", new Object[]{this})).booleanValue();
        }
        if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.AMNET_FORCE_TLS_VERIFY), "T")) {
            return true;
        }
        return false;
    }

    public ConfigureChangedListener getConfigureChangedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigureChangedListener) ipChange.ipc$dispatch("e853d663", new Object[]{this});
        }
        return this.f3897a;
    }

    public int getDynamicLibDownloadInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81433343", new Object[]{this})).intValue();
        }
        return TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.BIFROST_DYNAMIC_LIB_DOWNLOAD_INTERVAL);
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public int getLonglinkConnMax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3677d86", new Object[]{this})).intValue();
        }
        try {
            int intValue = TransportConfigureManager.getInstance().getIntValue(AmnetConfigureItem.LONGLINK_CONN_MAX);
            LogCatUtil.debug("AMNET-SW", "getLonglinkConnMax value:" + intValue);
            return intValue;
        } catch (Throwable th) {
            LogCatUtil.error("AMNET-SW", "enableBifrostUseWakeLock error:", th);
            return 1;
        }
    }

    public boolean isCanStartMainProcDispatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7008b630", new Object[]{this})).booleanValue();
        }
        return TransportConfigureManager.getInstance().equalsString(AmnetConfigureItem.START_MAIN_PROC_DISPATCH_SWITCH, "T");
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableInitMergeSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a3fbb01", new Object[]{this})).booleanValue();
        }
        return TransportStrategy.isEnableInitMergeSyncSwitch();
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableSFC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29ea4ee", new Object[]{this})).booleanValue();
        }
        return MiscUtils.grayscaleUtdidForABTest(AmnetConfigureItem.AMNET_SHORT_FREQ_CONN);
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableST() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2c1ff9", new Object[]{this})).booleanValue();
        }
        return MiscUtils.grayscaleUtdidForABTest(AmnetConfigureItem.AMNET_ST_TO);
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableShortLink(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25e17b08", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return MiscUtils.grayscaleUtdidForABTest(AmnetConfigureItem.BIFROST_SHORT_LINK);
        }
        return MiscUtils.grayscaleUtdidForABTest(AmnetConfigureItem.AMNET_SHORT_LINK);
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableZstd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb6fb9e1", new Object[]{this})).booleanValue();
        }
        return MiscUtils.grayscaleUtdidForABTest(TransportConfigureItem.ZSTD_GRAY);
    }

    public boolean isEnabledBifrostDynamicLib() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70b33117", new Object[]{this})).booleanValue();
        }
        return MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(AmnetConfigureItem.BIFROST_DYNAMIC_LIB_FEATURE_SWITCH));
    }

    public boolean isForceSSLHandshake(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ec58ed9", new Object[]{this, context})).booleanValue();
        }
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        this.b = Boolean.valueOf(MiscUtils.getBooleanFromMetaData(context, "is_force_ssl_handshake"));
        LogCatUtil.info("AMNET-SW", "[isForceSSLHandshake] forceSSLHandshake = " + this.b.booleanValue());
        return this.b.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence, T, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T pullSwitch(java.lang.String r6, T r7) {
        /*
            r5 = this;
            java.lang.String r0 = "AMNET-SW"
            java.lang.String r1 = "pullSwitch, key="
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.amnet.biz.AmnetSwitchManagerImpl.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001e
            java.lang.String r0 = "721ebeec"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r5
            r3 = 1
            r1[r3] = r6
            r6 = 2
            r1[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r0, r1)
            return r6
        L_0x001e:
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x003b
            if (r2 != 0) goto L_0x00c6
            java.util.Map<java.lang.String, com.alipay.mobile.common.amnet.biz.AmnetConfigureItem> r2 = com.alipay.mobile.common.amnet.biz.AmnetSwitchManagerImpl.d     // Catch: all -> 0x003b
            if (r2 != 0) goto L_0x002a
            goto L_0x00c6
        L_0x002a:
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: all -> 0x003b
            java.lang.Object r2 = r2.get(r6)     // Catch: all -> 0x003b
            com.alipay.mobile.common.amnet.biz.AmnetConfigureItem r2 = (com.alipay.mobile.common.amnet.biz.AmnetConfigureItem) r2     // Catch: all -> 0x003b
            if (r2 != 0) goto L_0x003e
            java.lang.String r6 = "pullSwitch item is null."
            com.alipay.mobile.common.transport.utils.LogCatUtil.warn(r0, r6)     // Catch: all -> 0x003b
            return r7
        L_0x003b:
            r6 = move-exception
            goto L_0x00cd
        L_0x003e:
            com.alipay.mobile.common.transport.config.TransportConfigureManager r3 = com.alipay.mobile.common.transport.config.TransportConfigureManager.getInstance()     // Catch: all -> 0x003b
            java.lang.String r3 = r3.getStringValue(r2)     // Catch: all -> 0x003b
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: all -> 0x003b
            if (r4 == 0) goto L_0x0053
            java.lang.String r6 = "pullSwitch value is null."
            com.alipay.mobile.common.transport.utils.LogCatUtil.warn(r0, r6)     // Catch: all -> 0x003b
            return r7
        L_0x0053:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x003b
            r4.<init>(r1)     // Catch: all -> 0x003b
            r4.append(r6)     // Catch: all -> 0x003b
            java.lang.String r6 = ",value="
            r4.append(r6)     // Catch: all -> 0x003b
            r4.append(r3)     // Catch: all -> 0x003b
            java.lang.String r6 = r4.toString()     // Catch: all -> 0x003b
            com.alipay.mobile.common.transport.utils.LogCatUtil.debug(r0, r6)     // Catch: all -> 0x003b
            boolean r6 = r7 instanceof java.lang.Boolean     // Catch: all -> 0x003b
            if (r6 == 0) goto L_0x007b
            java.lang.String r6 = r2.getType()     // Catch: all -> 0x003b
            boolean r6 = r5.b(r6, r3)     // Catch: all -> 0x003b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch: all -> 0x003b
            goto L_0x00c5
        L_0x007b:
            boolean r6 = r7 instanceof java.lang.String[]     // Catch: all -> 0x003b
            if (r6 == 0) goto L_0x008c
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: all -> 0x003b
            if (r6 != 0) goto L_0x00c5
            java.lang.String r6 = ","
            java.lang.String[] r7 = r3.split(r6)     // Catch: all -> 0x003b
            goto L_0x00c5
        L_0x008c:
            boolean r6 = r7 instanceof java.lang.Integer     // Catch: all -> 0x003b
            if (r6 == 0) goto L_0x0099
            int r6 = java.lang.Integer.parseInt(r3)     // Catch: all -> 0x003b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch: all -> 0x003b
            goto L_0x00c5
        L_0x0099:
            boolean r6 = r7 instanceof java.lang.String     // Catch: all -> 0x003b
            if (r6 == 0) goto L_0x009f
            r7 = r3
            goto L_0x00c5
        L_0x009f:
            boolean r6 = r7 instanceof java.lang.Long     // Catch: all -> 0x003b
            if (r6 == 0) goto L_0x00ac
            long r1 = java.lang.Long.parseLong(r3)     // Catch: all -> 0x003b
            java.lang.Long r7 = java.lang.Long.valueOf(r1)     // Catch: all -> 0x003b
            goto L_0x00c5
        L_0x00ac:
            boolean r6 = r7 instanceof java.lang.Float     // Catch: all -> 0x003b
            if (r6 == 0) goto L_0x00b9
            float r6 = java.lang.Float.parseFloat(r3)     // Catch: all -> 0x003b
            java.lang.Float r7 = java.lang.Float.valueOf(r6)     // Catch: all -> 0x003b
            goto L_0x00c5
        L_0x00b9:
            boolean r6 = r7 instanceof java.lang.Double     // Catch: all -> 0x003b
            if (r6 == 0) goto L_0x00c5
            double r1 = java.lang.Double.parseDouble(r3)     // Catch: all -> 0x003b
            java.lang.Double r7 = java.lang.Double.valueOf(r1)     // Catch: all -> 0x003b
        L_0x00c5:
            return r7
        L_0x00c6:
            java.lang.String r6 = "pullSwitch input is null or map is null."
            com.alipay.mobile.common.transport.utils.LogCatUtil.warn(r0, r6)     // Catch: all -> 0x003b
            return r7
        L_0x00cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "pullSwitch"
            r1.<init>(r2)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.alipay.mobile.common.transport.utils.LogCatUtil.warn(r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.amnet.biz.AmnetSwitchManagerImpl.pullSwitch(java.lang.String, java.lang.Object):java.lang.Object");
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean useBifrost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d782ce1", new Object[]{this})).booleanValue();
        }
        return TransportStrategy.isEnableBifrost();
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean needCheckSpannerZstd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7864c33", new Object[]{this})).booleanValue();
        }
        try {
            return TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.ZSTD_SPANNER_SWITCH) != 0;
        } catch (Throwable th) {
            LogCatUtil.warn("AMNET-SW", "needCheckSpannerZstd: " + th.toString());
            return true;
        }
    }
}
