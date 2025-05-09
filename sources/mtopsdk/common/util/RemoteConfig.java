package mtopsdk.common.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.pqw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RemoteConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.RemoteConfig";
    public static final String TB_IGNORE_PREFETCH = "mtop_ignorePrefetch";
    public static final String TB_SPEED_TS_ENABLE = "tsEnable";
    public static final String TB_SPEED_U_LAND = "preUland";
    private static RemoteConfig instance;
    private static Map<String, Integer> segmentSizeMap;
    private Map<String, String> configItemsMap = null;
    public boolean enableErrorCodeMapping = true;
    public boolean enableBizErrorCodeMapping = false;
    public long bizErrorMappingCodeLength = 24;
    public boolean enableSpdy = true;
    @Deprecated
    public boolean enableUnit = true;
    public boolean enableSsl = true;
    public boolean enableCache = true;
    public boolean enableProperty = false;
    public boolean degradeToSQLite = false;
    public boolean enableNewExecutor = true;
    public long apiLockInterval = 10;
    public String individualApiLockInterval = "";
    public String degradeApiCacheList = "";
    public String removeCacheBlockList = "";
    public String degradeBizErrorMappingApiList = "";
    public boolean enableLongParamOptimize = true;
    public String allowSwitchToPostApiList = "";
    public String allowPageUrlCutApiList = "";
    public String allowRefererCutApiList = "";
    public long switchToPostThreshold = 8192;
    public int headerCutThreshold = 1024;
    public String allowCustomPrefetchExpiredTimeApiList = "";
    public String errorMappingMsg = "";
    public long antiAttackWaitInterval = 20;
    public int useSecurityAdapter = 6;
    public boolean prefetch = false;
    public int segmentRetryTimes = -1;
    public int uploadThreadNums = -1;
    public boolean processBgMethodNew = true;
    public boolean responseHeader = true;
    public boolean removeDeviceInfo = true;
    public boolean dynamicInjectMtopInstance = false;
    public boolean fetchRemoteMtopInstance = true;
    public boolean removePreLimitOfLogin = true;
    public boolean checkLoginStatus = true;
    public final Set<String> useHttpsBizcodeSets = new HashSet();
    public final Set<String> degradeBizcodeSets = new HashSet();
    public boolean enableArupTlog = true;
    public boolean enableFullTraceId = false;
    public boolean enableFalcoId = true;
    public boolean enableChannelLazy = false;
    public boolean isWidgetUseLocalData = false;
    public boolean enableExtDataAlignIos = true;
    public String signDegradedApiList = "";
    public String jsBridgeTimeoutApiList = "";
    public String cookieDisableApiList = "";
    public String supportZstdApiList = "";
    public String mtopGlobalHeadersList = "";
    public String ssrGlobalHeadersList = "";
    public boolean addRefererField = true;
    public boolean removeWifiInfo = true;
    public String signDegradedApiList2 = "";
    public boolean optH5LoginTimeout = true;
    public boolean uaAddDeviceType = true;
    public boolean unitProtectEnable = true;
    public boolean ssrSupportZstd = false;
    public long unitCalibrationTTL = pqw.DEFAULT_MAX_AGE;
    public boolean unitCalibrationEnable = false;
    public boolean secPipuHeaderEnable = false;
    public boolean xstateOptEnable = false;
    public boolean OverseaStatEnable = false;

    static {
        t2o.a(589299798);
        HashMap hashMap = new HashMap();
        segmentSizeMap = hashMap;
        hashMap.put("2G", 32768);
        segmentSizeMap.put("3G", 65536);
        segmentSizeMap.put("4G", 524288);
        segmentSizeMap.put("WIFI", 524288);
        segmentSizeMap.put("UNKONWN", 131072);
        segmentSizeMap.put("NET_NO", 131072);
    }

    private String getConfigItemByKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1f3faa8", new Object[]{this, str, str2});
        }
        String str3 = null;
        try {
            Map<String, String> map = this.configItemsMap;
            if (map != null) {
                str3 = map.get(str);
            }
        } catch (Exception e) {
            TBSdkLog.w(TAG, "[getConfigItemByKey] get config item error; key=" + str, e);
        }
        return str3 == null ? str2 : str3;
    }

    public static RemoteConfig getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteConfig) ipChange.ipc$dispatch("61224ee5", new Object[0]);
        }
        if (instance == null) {
            synchronized (RemoteConfig.class) {
                try {
                    if (instance == null) {
                        instance = new RemoteConfig();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public Integer getSegmentSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("a31faa16", new Object[]{this, str});
        }
        if (StringUtils.isBlank(str)) {
            return null;
        }
        return segmentSizeMap.get(str);
    }

    public void loadLocalChannelLazyConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d8840d", new Object[]{this, context});
            return;
        }
        String configItem = ConfigStoreManager.getInstance().getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ENABLE_CHANNEL_LAZY);
        if (StringUtils.isNotBlank(configItem)) {
            this.enableChannelLazy = "true".equalsIgnoreCase(configItem);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[setChannelLazyConfig]remote channelLazyConfig=" + configItem + ",enable=" + this.enableChannelLazy);
            }
        }
    }

    public void loadLocalUserAgentConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8471b8a", new Object[]{this, context});
            return;
        }
        String configItem = ConfigStoreManager.getInstance().getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.ADD_DEVICE_TYPE);
        if (StringUtils.isNotBlank(configItem)) {
            this.uaAddDeviceType = Boolean.parseBoolean(configItem);
        }
    }

    public void loadLocalWidgetConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a16a396", new Object[]{this, context});
            return;
        }
        String configItem = ConfigStoreManager.getInstance().getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.WIDGET_USE_LOCAL_DATA);
        if (StringUtils.isNotBlank(configItem)) {
            this.isWidgetUseLocalData = "true".equalsIgnoreCase(configItem);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, "[isWidgetUseLocalData]remote isWidgetUseLocalDataStr=" + configItem + ",isWidgetUseLocalData=" + this.isWidgetUseLocalData);
            }
        }
    }

    public void setSegmentSize(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60423a40", new Object[]{this, str, new Integer(i)});
        } else if (!StringUtils.isBlank(str) && i > 0) {
            segmentSizeMap.put(str, Integer.valueOf(i));
        }
    }

    public void updateGlobalParamsConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c96db", new Object[]{this});
            return;
        }
        Map<String, String> switchConfigByGroupName = SwitchConfigUtil.getSwitchConfigByGroupName(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_PARAMS_SWITCH);
        if (switchConfigByGroupName != null) {
            String str = switchConfigByGroupName.get(SwitchConfigUtil.MTOP_GLOBAL_HEADER_KEY);
            if (StringUtils.isNotBlank(str) && !str.equals(this.mtopGlobalHeadersList)) {
                this.mtopGlobalHeadersList = str;
                Mtop instance2 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance2.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance2.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.MTOP_GLOBAL_HEADER_KEY, str);
                } else {
                    TBSdkLog.e(TAG, "[setGlobalHeadersConfig]context can't be null.wait INNER mtopInstance init.");
                }
            }
            String str2 = switchConfigByGroupName.get(SwitchConfigUtil.SSR_GLOBAL_HEADER_KEY);
            if (StringUtils.isNotBlank(str2) && !str2.equals(this.ssrGlobalHeadersList)) {
                this.ssrGlobalHeadersList = str2;
                Mtop instance3 = Mtop.instance(Mtop.Id.INNER, (Context) null);
                if (instance3.getMtopConfig().context != null) {
                    ConfigStoreManager.getInstance().saveConfigItem(instance3.getMtopConfig().context, ConfigStoreManager.MTOP_CONFIG_STORE, "", SwitchConfigUtil.SSR_GLOBAL_HEADER_KEY, str2);
                } else {
                    TBSdkLog.e(TAG, "[setSSRGlobalHeadersConfig]context can't be null.wait INNER mtopInstance init.");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0c66  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0ce2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0d53  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0e35  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0ea6  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0f17  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0f83  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a03 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x09b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0a53 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0558 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0c17 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0506 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0c8e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0ac2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0944 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0475 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0b33 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0bc1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0869 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x04bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0b7b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:456:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0404  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v41, types: [mtopsdk.mtop.intf.Mtop] */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v19, types: [mtopsdk.common.util.ConfigStoreManager] */
    /* JADX WARN: Type inference failed for: r3v102, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v114, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v126, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v138, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v78, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v90, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r8v122, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v126 */
    /* JADX WARN: Type inference failed for: r8v127 */
    /* JADX WARN: Type inference failed for: r8v128, types: [mtopsdk.mtop.intf.Mtop] */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v130 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v134 */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.String] */
    /* JADX WARN: Unknown variable types count: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateRemoteConfig() {
        /*
            Method dump skipped, instructions count: 4036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.RemoteConfig.updateRemoteConfig():void");
    }

    public void updateUploadRemoteConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a623b3f9", new Object[]{this});
            return;
        }
        Map<String, String> switchConfigByGroupName = SwitchConfigUtil.getSwitchConfigByGroupName(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, "[updateUploadRemoteConfig] uploadConfigItemsMap=" + switchConfigByGroupName);
        }
        if (switchConfigByGroupName != null) {
            String str = switchConfigByGroupName.get(SwitchConfigUtil.SEGMENT_RETRY_TIMES_KEY);
            if (StringUtils.isNotBlank(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    if (parseInt >= 0) {
                        this.segmentRetryTimes = parseInt;
                    }
                } catch (Exception unused) {
                    TBSdkLog.w(TAG, "[updateUploadRemoteConfig]parse segmentRetryTimes error,segmentRetryTimesStr=" + str);
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, "[updateUploadRemoteConfig]remote segmentRetryTimesStr=" + str + ",segmentRetryTimes=" + this.segmentRetryTimes);
                }
            }
            String str2 = switchConfigByGroupName.get(SwitchConfigUtil.UPLOAD_THREAD_NUMS_KEY);
            if (StringUtils.isNotBlank(str)) {
                try {
                    int parseInt2 = Integer.parseInt(str2);
                    if (parseInt2 >= 0) {
                        this.uploadThreadNums = parseInt2;
                    }
                } catch (Exception unused2) {
                    TBSdkLog.w(TAG, "[updateUploadRemoteConfig]parse uploadThreadNums error,uploadThreadNumsStr=" + str2);
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, "[updateUploadRemoteConfig]remote uploadThreadNumsStr=" + str2 + ",uploadThreadNums=" + this.uploadThreadNums);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:122|6|(41:126|7|(2:9|(1:11))|12|(2:14|(1:16))|17|(2:19|(1:21))|22|23|(2:25|(1:27))|28|(2:30|(1:32))|33|(2:35|(1:37))|38|(2:40|(1:42))|43|44|(2:46|(1:48))|49|(2:51|(1:53))|54|(2:56|(1:58))|59|(2:61|(1:63))|64|(2:66|(1:68))|69|(2:71|(1:73))|74|(2:76|(1:78))|79|(2:81|(1:83))|84|(2:86|(1:88))|89|(2:91|(1:93))|94|(2:96|(1:98))|99|(2:101|(1:103)))|124|106|(1:108)|109|(1:111)|112|(1:114)|115|(1:117)|119|120) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x055a, code lost:
        mtopsdk.common.util.TBSdkLog.e(mtopsdk.common.util.RemoteConfig.TAG, "[loadLocalConfig]parse local long_param_optimize error.");
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x049c A[Catch: all -> 0x055a, TryCatch #1 {all -> 0x055a, blocks: (B:106:0x048b, B:108:0x049c, B:109:0x04a2, B:111:0x04b3, B:112:0x04b9, B:114:0x04ca, B:115:0x04d0, B:117:0x050a), top: B:124:0x048b }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04b3 A[Catch: all -> 0x055a, TryCatch #1 {all -> 0x055a, blocks: (B:106:0x048b, B:108:0x049c, B:109:0x04a2, B:111:0x04b3, B:112:0x04b9, B:114:0x04ca, B:115:0x04d0, B:117:0x050a), top: B:124:0x048b }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04ca A[Catch: all -> 0x055a, TryCatch #1 {all -> 0x055a, blocks: (B:106:0x048b, B:108:0x049c, B:109:0x04a2, B:111:0x04b3, B:112:0x04b9, B:114:0x04ca, B:115:0x04d0, B:117:0x050a), top: B:124:0x048b }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x050a A[Catch: all -> 0x055a, TRY_LEAVE, TryCatch #1 {all -> 0x055a, blocks: (B:106:0x048b, B:108:0x049c, B:109:0x04a2, B:111:0x04b3, B:112:0x04b9, B:114:0x04ca, B:115:0x04d0, B:117:0x050a), top: B:124:0x048b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadLocalConfig(android.content.Context r28) {
        /*
            Method dump skipped, instructions count: 1457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.common.util.RemoteConfig.loadLocalConfig(android.content.Context):void");
    }
}
