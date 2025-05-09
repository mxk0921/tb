package com.taobao.orange;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OConstant {
    public static final String AB_ANR_SWITCH_1 = "AB_ANR_ORANGE_SWITCH_1";
    public static final String AB_ANR_SWITCH_2 = "AB_ANR_ORANGE_SWITCH_2";
    public static final String AB_CONTENT_MD5 = "OrangeContentMd5";
    public static final String AB_LAUNCH_OPTIMIZE_ENABLE = "OrangeLaunchOptimizeEnable";
    public static final String CANDIDATE_APPVER = "app_ver";
    public static final String CANDIDATE_BRAND = "m_brand";
    public static final String CANDIDATE_DIDHASH = "did_hash";
    public static final String CANDIDATE_MANUFACTURER = "m_fac";
    public static final String CANDIDATE_MODEL = "m_model";
    public static final String CANDIDATE_OSVER = "os_ver";
    public static final String CANDIDATE_SPNAME = "orange_candidate";
    public static final String CODE_POINT_EXP_BIND_SERVICE = "101";
    public static final String CODE_POINT_EXP_CREATE_TARGET_DIR = "104";
    public static final String CODE_POINT_EXP_GET_TARGET_DIR = "103";
    public static final String CODE_POINT_EXP_LOAD_CACHE = "102";
    public static final String CODE_POINT_EXP_SERVICE_DISABLED = "105";
    public static final String CRITICAL_QUERY_PATH = "/api/config";
    public static final int DIFF_INDEX_APPEND = 1;
    public static final int DIFF_INDEX_CLOSE = 0;
    public static final int DIFF_INDEX_STABLE = 2;
    public static final String DIMEN_ACCS_DATA_ID = "dataId";
    public static final String DIMEN_ACCS_DONE_TIME = "accsDoneTime";
    public static final String DIMEN_ACCS_START_TIME = "accsStartTime";
    public static final String DIMEN_COMMIT_TIME = "commitTime";
    public static final String DIMEN_CONFIG_BG = "isbg";
    public static final String DIMEN_CONFIG_CHANGE_VERSION = "changeVersion";
    public static final String DIMEN_CONFIG_ENABLE_CHANGE_VERSION = "enableChangeVersion";
    public static final String DIMEN_CONFIG_HTTP_STATUS = "httpStatus";
    public static final String DIMEN_CONFIG_KEY = "configKey";
    public static final String DIMEN_CONFIG_LOAD_STATUS = "loadStatus";
    public static final String DIMEN_CONFIG_NAME = "configName";
    public static final String DIMEN_CONFIG_RESOURCE_ID = "configResourceId";
    public static final String DIMEN_CONFIG_VERSION = "configVersion";
    public static final String DIMEN_CONTENT_LENGTH = "contentLength";
    public static final String DIMEN_CONTENT_MD5_VALUE = "contentMd5";
    public static final String DIMEN_CONTENT_REAL_LENGTH = "contentRealLen";
    public static final String DIMEN_CRITICAL_ACCS_STATUS = "criticalAccsStatus";
    public static final String DIMEN_CRITICAL_CONFIGS_VERSION = "criticalConfigsVersion";
    public static final String DIMEN_CRITICAL_FETCH_STATUS = "criticalFetchStatus";
    public static final String DIMEN_EAGLE_EYE_TRACE_ID = "eagleEyeTraceId";
    public static final String DIMEN_ENV = "env";
    public static final String DIMEN_ERROR_CODE = "errCode";
    public static final String DIMEN_FETCH_CRITICAL_END_TIME = "fetchCriticalEndTime";
    public static final String DIMEN_FETCH_CRITICAL_START_TIME = "fetchCriticalStartTime";
    public static final String DIMEN_FILE_LOCK = "lock";
    public static final String DIMEN_FILE_SUCCESS = "success";
    public static final String DIMEN_FILE_TYPE = "type";
    public static final String DIMEN_HIT_NET_STRATEGY = "hitNetStrategyCallback";
    public static final String DIMEN_INDEX_UPDATE_APP_INDEX_VERSION = "appIndexVersion";
    public static final String DIMEN_INDEX_UPDATE_BASE_VERSION = "indexBaseVersion";
    public static final String DIMEN_INDEX_UPDATE_DIFF_SWITCH = "indexDiff";
    public static final String DIMEN_INDEX_UPDATE_RESPONSE_HEADER = "responseHeader";
    public static final String DIMEN_IS_CHANNEL_PROCESS = "isChannelProcess";
    public static final String DIMEN_IS_COLD_STARTUP = "isColdStartup";
    public static final String DIMEN_IS_CRITICAL = "isCritical";
    public static final String DIMEN_NET_CONNECT_COST_TIME = "netConnectCostTime";
    public static final String DIMEN_NET_REQUEST_START_TIME = "netRequestStartTime";
    public static final String DIMEN_NET_RESPONSE_COST_TIME = "netResponseCostTime";
    public static final String DIMEN_PARSE_COST_TIME = "parseCostTime";
    public static final String DIMEN_PARSE_DONE_TIME = "parseDoneTime";
    public static final String DIMEN_PARSE_START_TIME = "parseStartTime";
    public static final String DIMEN_PROCESS = "process";
    public static final String DIMEN_PROCESS_ISOLATED = "processIsolated";
    public static final String DIMEN_PROCESS_START_TIME = "processStartTime";
    public static final String DIMEN_REPLACE_SERVICE_STATUS = "replaceServiceStatus";
    public static final String DIMEN_REPLACE_SERVICE_TYPE = "replaceServiceType";
    public static final String DIMEN_REPLACE_TO_BIND_TIME = "replaceToBindTime";
    public static final String DIMEN_REPLACE_TO_LOCAL_TIME = "replaceToLocalTime";
    public static final String DIMEN_SERVER_ERROR = "serverError";
    public static final int DOWN_GRADE_CLOSE = 0;
    public static final int DOWN_GRADE_ORANGE = 2;
    public static final int DOWN_GRADE_TB_SPEED = 1;
    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final long IDLE_LAZY_LOAD_CONFIG = -1;
    public static final String KEY_APPKEY = "appKey";
    public static final String KEY_APPVERSION = "appVersion";
    public static final String KEY_CLIENTAPPINDEXVERSION = "clientAppIndexVersion";
    public static final String KEY_CLIENTVERSIONINDEXVERSION = "clientVersionIndexVersion";
    public static final String LAUNCH_APPVERSION = "appVersion";
    public static final String LAUNCH_ENVINDEX = "envIndex";
    public static final String LAUNCH_KEY_USERID = "userId";
    public static final String LAUNCH_ONLINEAPPKEY = "onlineAppKey";
    public static final String LAUNCH_PREAPPKEY = "preAppKey";
    public static final String LAUNCH_PROCESS = "process";
    public static final String LAUNCH_TESTAPPKEY = "dailyAppkey";
    @Deprecated
    public static final String LISTENERKEY_CONFIG_VERSION = "configVersion";
    @Deprecated
    public static final String LISTENERKEY_FROM_CACHE = "fromCache";
    public static final String MEASURE_FILE_COST_TIME = "cost";
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";
    public static final String MONITOR_MODULE = "OrangeConfig";
    public static final String MONITOR_PRIVATE_MODULE = "private_orange";
    public static final String ORANGE = "orange";
    @Deprecated
    public static final String ORANGE_LOCAL_FILE = "orange.local.file";
    public static final String POINT_ABTEST_DIDHASH = "did_hash";
    public static final String POINT_BIND_CHANNEL_SERVICE = "bind_channel_service";
    public static final String POINT_BOOT_PERF = "orange_boot_performance";
    public static final String POINT_CFG_RATE = "config_rate";
    public static final String POINT_CHANNEL_CONFIG_USE = "channel_config_use";
    public static final String POINT_CONFIG_ACK = "config_ack";
    public static final String POINT_CONFIG_LOAD = "config_load";
    public static final String POINT_CONFIG_MISS_CHECK_COUNTS = "config_miss_check_counts";
    public static final String POINT_CONFIG_NOTMATCH_COUNTS = "config_notmatch_counts";
    public static final String POINT_CONFIG_REMOVE_COUNTS = "config_remove_counts";
    public static final String POINT_CONFIG_UPDATE = "config_update";
    public static final String POINT_CONFIG_UPDATE_FAIL_COUNTS = "config_update_fail_counts";
    public static final String POINT_CONFIG_USE = "config_use";
    public static final String POINT_CONTENT_MD5 = "content_md5";
    public static final String POINT_CRITICAL_ACCS_UPDATE = "critical_accs_update";
    public static final String POINT_DIFF_INDEX_UPDATE = "diff_index_update";
    public static final String POINT_DOWNGRADE = "getConfigDowngrade";
    public static final String POINT_EXCEPTION = "other_exception";
    public static final String POINT_EXT_CFG_CHECK = "ext_config_check";
    public static final String POINT_FALLBACK_AVOID = "fallback_avoid";
    public static final String POINT_FETCH_CRITICAL_CONFIG = "fetch_critical_config";
    public static final String POINT_FILE_STAT = "file_stat";
    public static final String POINT_INDEX_ACK = "index_ack";
    public static final String POINT_INDEX_EXCEPTION_RECOVERY_COUNTS = "index_exception_recovery_counts";
    public static final String POINT_INDEX_NAMESPACE_SIZE_COUNTS = "index_namespace_size_counts";
    public static final String POINT_INDEX_RATE = "index_rate";
    public static final String POINT_PERSIST_FAIL_COUNTS = "persist_fail_counts";
    public static final String POINT_PROCESS_BIND_MODE = "process_bind_mode";
    public static final String POINT_REPLACE_SERVICE = "replace_service";
    public static final String POINT_RESTORE_FAIL_COUNTS = "restore_fail_counts";
    public static final String POINT_SERVICE_ENABLED = "service_enabled";
    public static final String POINT_UNBIND_CHANNEL_SERVICE = "unbind_channel_service";
    @Deprecated
    public static final String PROCESS_ISOLATED_LOCAL_CONFIG = ".processIsolated";
    public static final String PROCESS_QUERY_SENT_COUNT = "keyQuerySentCount";
    public static final String PROCESS_QUERY_SENT_LAST_TIME_SECONDS = "keyQuerySentLastTimeSeconds";
    public static final String REFLECT_APPMONITOR = "com.alibaba.mtl.appmonitor.AppMonitor";
    public static final String REFLECT_NETWORKSDK = "anetwork.channel.degrade.DegradableNetwork";
    public static final String REFLECT_NETWORK_INTERCEPTOR = "anetwork.channel.interceptor.Interceptor";
    public static final String REFLECT_NETWORK_INTERCEPTORMANAGER = "anetwork.channel.interceptor.InterceptorManager";
    public static final String REFLECT_SECURITYGUARD = "com.alibaba.wireless.security.open.SecurityGuardManager";
    public static final String REFLECT_TLOG = "com.taobao.tlog.adapter.AdapterForTLog";
    public static final String REFLECT_UTDID = "com.ta.utdid2.device.UTDevice";
    public static final String REQTYPE_ACK_CONFIG_UPDATE = "/batchNamespaceUpdateAck";
    public static final String REQTYPE_ACK_INDEX_UPDATE = "/indexUpdateAck";
    public static final String REQTYPE_DOWNLOAD_RESOURCE = "/downloadResource";
    public static final String REQTYPE_INDEX_UPDATE = "/checkUpdate";
    public static final String REQTYPE_PROBE_UPDATE = "/checkProbe";
    public static final String SDK_VERSION = "1.6.53";
    public static final String SP_KEY_USED_LIST = "key_used_list";
    public static final String SUB_PROCESS_INDEX_QUERY_URL = "/gw/mtop.taobao.aserver.concurrent.count/2.0";
    public static final String SYSKEY_ACKVIPS = "ackVips";
    public static final String SYSKEY_APP_VERSION = "appVersion";
    public static final String SYSKEY_BIND_TIMEOUT = "bindTimeout";
    public static final String SYSKEY_CHANNEL_CONFIGS = "channelProcessConfigs";
    public static final String SYSKEY_DCVIPS = "dcVips";
    public static final String SYSKEY_DOWNGRADE = "downgrade";
    public static final String SYSKEY_ENABLE_FETCH_CRITICAL_CONFIGS = "enableFetchCriticalConfigs";
    public static final String SYSKEY_ENABLE_I18n = "enableI18n";
    public static final String SYSKEY_ENABLE_LAUNCH_OPTIMIZE = "enableLaunchOptimize";
    public static final String SYSKEY_FALLBACK_AVOID = "fallbackAvoid";
    public static final String SYSKEY_INDEXUPD_MODE = "indexUpdateMode";
    public static final String SYSKEY_INDEX_CHECK_ENABLE = "indexCheckEnable";
    public static final String SYSKEY_INDEX_ENV_CHECK = "indexEnvCheck";
    public static final String SYSKEY_OS_VERSION = "osVersion";
    public static final String SYSKEY_PROBE_HOSTS = "hosts";
    @Deprecated
    public static final String SYSKEY_PROCESS_ISOLATED = "processIsolated";
    public static final String SYSKEY_PROCESS_MEMORY_OPTIMIZE = "processMemoryOptimizeV2";
    @Deprecated
    public static final String SYSKEY_PROCESS_QUERY = "processQuery";
    @Deprecated
    public static final String SYSKEY_PROCESS_QUERY_FORBID_TIME = "processQueryForbidTime";
    @Deprecated
    public static final String SYSKEY_PROCESS_QUERY_STRATEGY = "processQueryStrategy";
    public static final String SYSKEY_RECOVERY_SERVICE_STATE = "recoveryServiceState";
    public static final String SYSKEY_REQ_RETRY_NUM = "reqRetryNum";
    public static final String UTF_8 = "utf-8";
    public static final String[] DC_TAOBAO_HOSTS = {"orange-dc.alibaba.com", "orange-dc-pre.alibaba.com", "orange-dc-daily.alibaba.net"};
    public static final String[] ACK_TAOBAO_HOSTS = {"orange-ack.alibaba.com", "orange-ack-pre.alibaba.com", "orange-ack-daily.alibaba.net"};
    public static final String[] DC_YOUKU_HOSTS = {"orange-dc.youku.com", "orange-dc-pre.youku.com", "orange-dc-daily.heyi.test"};
    public static final String[] ACK_YOUKU_HOSTS = {"orange-ack.youku.com", "orange-ack-pre.youku.com", "orange-ack-daily.heyi.test"};
    public static final String[][] PROBE_HOSTS = {new String[]{MtopUnitStrategy.CENTER_ONLINE_DOMAIN}, new String[]{MtopUnitStrategy.CENTER_PRE_DOMAIN}, new String[]{MtopUnitStrategy.CENTER_DAILY_DOMAIN}};
    public static final String[] SUB_PROCESS_INDEX_QUERY_HOSTS = {"channel-acs.m.taobao.com", "channel-acs.wapa.taobao.com", "channel-acs.waptest.taobao.com"};
    public static final String[] CRITICAL_TAOBAO_HOSTS = {"orange-dc.m.taobao.com", "pre-orange-dc.m.taobao.com", ""};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum ENV {
        ONLINE(0, "online"),
        PREPARE(1, "pre"),
        TEST(2, "test");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String des;
        private int envMode;

        ENV(int i, String str) {
            this.envMode = i;
            this.des = str;
        }

        public static /* synthetic */ Object ipc$super(ENV env, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/OConstant$ENV");
        }

        public static ENV valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ENV) ipChange.ipc$dispatch("a36b8f5c", new Object[]{str}) : (ENV) Enum.valueOf(ENV.class, str);
        }

        public String getDes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b97db9d", new Object[]{this});
            }
            return this.des;
        }

        public int getEnvMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c6022b74", new Object[]{this})).intValue();
            }
            return this.envMode;
        }

        public static ENV valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ENV) ipChange.ipc$dispatch("d56328d7", new Object[]{new Integer(i)});
            }
            if (i == 0) {
                return ONLINE;
            }
            if (i == 1) {
                return PREPARE;
            }
            if (i != 2) {
                return ONLINE;
            }
            return TEST;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum SERVER {
        TAOBAO,
        YOUKU;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SERVER server, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/OConstant$SERVER");
        }

        public static SERVER valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SERVER) ipChange.ipc$dispatch("36f0784a", new Object[]{str}) : (SERVER) Enum.valueOf(SERVER.class, str);
        }

        public static SERVER valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SERVER) ipChange.ipc$dispatch("f35e28ef", new Object[]{new Integer(i)});
            }
            if (i == 0) {
                return TAOBAO;
            }
            if (i != 1) {
                return TAOBAO;
            }
            return YOUKU;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum UPDMODE {
        O_XMD,
        O_EVENT,
        O_ALL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(UPDMODE updmode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/OConstant$UPDMODE");
        }

        public static UPDMODE valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (UPDMODE) ipChange.ipc$dispatch("a46722dd", new Object[]{str}) : (UPDMODE) Enum.valueOf(UPDMODE.class, str);
        }

        public static UPDMODE valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UPDMODE) ipChange.ipc$dispatch("75af86d8", new Object[]{new Integer(i)});
            }
            if (i == 0) {
                return O_XMD;
            }
            if (i == 1) {
                return O_EVENT;
            }
            if (i != 2) {
                return O_XMD;
            }
            return O_ALL;
        }
    }

    static {
        t2o.a(613416996);
    }
}
