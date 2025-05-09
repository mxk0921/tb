package mtopsdk.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;
import tb.u4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SwitchConfigUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADD_DEVICE_TYPE = "uaAddDeviceType";
    public static final String ADD_REFERER = "addReferer";
    public static final String ALLOW_PAGE_URL_CUT_API_LIST_KEY = "allowPageUrlCutApiList";
    public static final String ALLOW_REFERER_CUT_API_LIST_KEY = "allowRefererCutApiList";
    public static final String ALLOW_REMOVE_DEVICE_INFO = "allowRemoveDeviceInfo";
    public static final String ALLOW_REMOVE_WIFI_INFO = "allowRemoveWifiInfo";
    public static final String ALLOW_SWITCH_TO_POST_API_LIST_KEY = "switchGetToPostApiList";
    public static final String ANTI_ATTACK_WAIT_INTERVAL_KEY = "antiAttackWaitInterval";
    public static final String API_LOCK_INTERVAL_KEY = "apiLockInterval";
    public static final String BIZ_ERROR_MAPPING_CODE_LENGTH_KEY = "bizErrorMappingCodeLength";
    public static final String CHECK_LOGIN_STATUS = "checkLoginStatus";
    public static final String CONFIG_GROUP_MTOPSDK_ANDROID_SWITCH = "mtopsdk_android_switch";
    public static final String CONFIG_GROUP_MTOPSDK_APICACHE_BLOCKINFO_SWITCH = "mtopsdk_apicache_blockinfo";
    public static final String CONFIG_GROUP_MTOPSDK_PARAMS_SWITCH = "mtopsdk_params_switch";
    public static final String CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH = "mtopsdk_upload_switch";
    public static final String COOKIE_DISABLE_API_LIST = "cookieDisableApiList";
    public static final String DEGRADE_API_CACHE_LIST_KEY = "degradeApiCacheList";
    public static final String DEGRADE_BIZCODE_SET_KEY = "degradeBizcodeSet";
    public static final String DEGRADE_BIZ_ERROR_MAPPING_API_LIST_KEY = "degradeBizErrorMappingApiList";
    public static final String DEGRADE_TO_SQLITE_KEY = "degradeToSQLite";
    public static final String DYNAMIC_INJECT_MTOP_INSTANCE = "dynamicInjectMtopInstance";
    public static final String ENABLE_BIZ_ERROR_CODE_MAPPING_KEY = "enableBizErrorCodeMapping";
    public static final String ENABLE_CACHE_KEY = "enableCache";
    public static final String ENABLE_CHANNEL_LAZY = "enableChannelLazy";
    public static final String ENABLE_ERROR_CODE_MAPPING_KEY = "enableErrorCodeMapping";
    public static final String ENABLE_EXTDATA_ALIGIN_IOS = "enableExtDataAlignIos";
    public static final String ENABLE_FALCO_ID = "enableFalcoId";
    public static final String ENABLE_FULL_TRACE_ID = "enableFullTraceId";
    public static final String ENABLE_LONG_PARAM_OPTIMIZE = "enableLongParamOptimize";
    public static final String ENABLE_MTOPSDK_PROPERTY_KEY = "enableProperty";
    public static final String ENABLE_NEW_EXECUTOR = "enableNewExecutor";
    public static final String ENABLE_RESPONSE_HEADER = "responseHeader";
    public static final String ENABLE_SPDY_KEY = "enableSpdy";
    public static final String ENABLE_SSL_KEY = "enableSsl";
    @Deprecated
    public static final String ENABLE_UNIT_KEY = "enableUnit";
    public static final String ERROR_MAPPING_MSG_KEY = "errorMappingMsg";
    public static final String FETCH_REMOTE_MTOP_INSTANCE = "fetchRemoteMtopInstance";
    @Deprecated
    public static final String GZIP_THRESHOLD_KEY = "gzipThresHold";
    public static final String HEADER_CUT_THRESHOLD = "headerCutThreshold";
    public static final String INDIVIDUAL_API_LOCK_INTERVAL_KEY = "individualApiLockInterval";
    public static final String JS_BRIDGE_TIMEOUT_API_LIST = "jsBridgeTimeoutApiList";
    public static final String MTOP_GLOBAL_HEADER_KEY = "mtopGlobalHeaders";
    public static final String OPEN_PREFETCH = "openPrefetch";
    public static final String OPT_H5_LOGIN_TIMEOUT = "opt_h5_login_timeout";
    public static final String OVERSEA_STAT_ENABLE = "overseaStatEnable";
    public static final String PREFETCH_EXPIRED_TIME_API_LIST_KEY = "prefetchExpiredTimeApiList";
    public static final String PROCESS_BG_METHOD = "processBgMethodNew";
    public static final String REMOVE_CACHE_BLOCK_LIST_KEY = "removeCacheBlockList";
    public static final String REMOVE_PRE_LIMIT_OF_LOGIN = "removePrelimitOfLogin";
    public static final String SEC_PIPU_HEADER_ENABLE = "secPipuHeaderEnable";
    public static final String SEGMENT_RETRY_TIMES_KEY = "segmentRetryTimes";
    public static final String SEGMENT_SIZE_MAP_KEY = "segmentSizeMap";
    public static final String SIGN_DEGRADED_API_LIST = "mtopSignDegradedApiList";
    public static final String SIGN_DEGRADED_API_LIST2 = "mtopSignDegradedApiList2";
    public static final String SSR_GLOBAL_HEADER_KEY = "ssrGlobalHeaders";
    public static final String SSR_SUPPORT_ZSTD = "ssrSupportZstd";
    public static final String SUPPORT_ZSTD_API_LIST = "zstdApiList";
    public static final String SWITCH_TO_POST_THRESHOLD = "switchToPostThreshold";
    private static final String TAG = "mtopsdk.SwitchConfigUtil";
    public static final String UNIT_CALIBRATION_ENABLE = "unitCalibrationEnable";
    public static final String UNIT_CALIBRATION_TTL = "unitCalibrationTTL";
    public static final String UNIT_PROTECT_ENABLE = "unitProtectEnable";
    public static final String UPLOAD_THREAD_NUMS_KEY = "uploadThreadNums";
    public static final String USEHTTPS_BIZCODE_SET_KEY = "useHttpsBizcodeSet";
    public static final String USE_SECURITY_ADAPTER = "useSecurityAdapter";
    public static final String WIDGET_USE_LOCAL_DATA = "isWidgetUseLocalData";
    public static final String XSTATE_OPT_ENABLE = "xstateOptEnable";
    private static u4j listener = null;

    static {
        t2o.a(589299800);
    }

    public static String getSwitchConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30c4268f", new Object[]{str, str2, str3});
        }
        u4j u4jVar = listener;
        if (u4jVar != null) {
            return u4jVar.getConfig(str, str2, str3);
        }
        TBSdkLog.w(TAG, "[getSwitchConfig] MtopConfigListener is null");
        return str3;
    }

    public static Map<String, String> getSwitchConfigByGroupName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c438cced", new Object[]{str});
        }
        u4j u4jVar = listener;
        if (u4jVar != null) {
            return u4jVar.b(str);
        }
        TBSdkLog.w(TAG, "[getSwitchConfigByGroupName] MtopConfigListener is null");
        return null;
    }

    public static void setMtopConfigListener(u4j u4jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cc4d52", new Object[]{u4jVar});
        } else if (u4jVar != null) {
            listener = u4jVar;
        }
    }
}
