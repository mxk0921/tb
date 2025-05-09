package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.session.dns.DnsNavConfigTask;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.dispatch.AmdcPriorityHelper;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.Utils;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ABSwitchUtils;
import anet.channel.util.ALog;
import anet.channel.util.SharePreferencesUtils;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.pqw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AwcnConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_KEY = "ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_KEY";
    private static final int AMDC_LIGHT_TIME = 15000;
    private static final int AMDC_TIMEOUT = 3000;
    private static final int CHANNEL_AMDC_TTL = 2;
    private static final long DEFAULT_FG_SEND_AMDC_INTERVAL_TIME = 60000;
    private static final boolean DEFAULT_NETWORK_ACCESS_POINT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_ALLOW_FORCE_AMDC_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_ALLOW_NET_FULL_LOW_LATENCY_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_AMDC_LOCATION_RETRY_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_AMDC_PARCELBALE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_AMDC_STRATEGY_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_AMDC_STRATEGY_UPDATE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_BG_NOT_FORCE_CELL_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_BG_SOCKET_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_CANCEL_HARD_EXPIRY_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_COOKIE_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_COOKIE_OPT_V2_OPENED = true;
    private static final long DEFAULT_NETWORK_COOKIE_RETRY_TIME = 10;
    private static final boolean DEFAULT_NETWORK_DECOMPRESS_OPENED = false;
    private static final boolean DEFAULT_NETWORK_FG_AMDC_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_FIX_WRITE_STREAM_ERROR_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_H3_STRATEGY_FILTER_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_HANDOVER_SIGNAL_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_HEADER_IGNORE_CASE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_HTTP3_PRE_HOST_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_HTTP3_RECONNECT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_INFO_ENABLE = false;
    private static final long DEFAULT_NETWORK_INTERCEPTOR_OPT_TYPE = 0;
    private static final boolean DEFAULT_NETWORK_IPV6_DETECT_OPT_OPENED = false;
    private static final boolean DEFAULT_NETWORK_IPV6_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_IP_STACK_UNKNOWN_BUILD_STRATEGY_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_LAST_STATUS_NONE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_LAUNCH_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_LAUNCH_OPT_OPENED = true;
    private static final boolean DEFAULT_NETWORK_LAUNCH_OPT_V1_OPENED = true;
    private static final boolean DEFAULT_NETWORK_LAUNCH_OPT_V2_OPENED = true;
    private static final boolean DEFAULT_NETWORK_LIMIT_AMDC_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_MTU_CONNECT_UPDATE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_MTU_WIFI_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_PRE_HOST_MCC_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_PRE_SESSION_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_PRIORITY_UPDATE_AMDC_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_PROCESS_NAME_UPDATE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_REMOTE_CRITICAL_PLAN_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_REPLACE_STRATEGY_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_REQ_CONFIG_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_REQ_FEC_SIZE_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_REQ_FORCE_CELL_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_RETRY_USE_LONG_LINK_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_SESSION_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_SHORT_LINK_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_SMOOTH_RECONNECT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_SMOOTH_RECONNECT_OPT_OPENED = false;
    private static final boolean DEFAULT_NETWORK_SPDY_OFFLINE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_SSL_SP_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_STRATEGY_COMPARE_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_STRATEGY_RETRY_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_STRATEGY_TIMELY_UPDATE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_SUPPORT_SET_WAIT_TIME_OUT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_TNET_FORCE_PUBKEY_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_UNIQUE_ID_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_UPLINK_ENCODE_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_UPLINK_ENCODE_UPDATE_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_VPN_CHANGE_DETECT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_VPN_DETECT_RACING_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_VPN_OPT_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_WIFI_DETECT_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_XQUIC_REMOTE_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE = true;
    private static final boolean DEFAULT_NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE = false;
    private static final boolean DEFAULT_NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE = false;
    private static final boolean DEFAULT_VPN_FAST_DEGRADE_ENABLE = true;
    public static final String DETECT_CENTER_ENABLE = "DETECT_CENTER_ENABLE";
    private static final String FG_SEND_AMDC_INTERVAL_TIME = "FG_SEND_AMDC_INTERVAL_TIME";
    public static final String FRAGMENT_FILE_LENGTH_THRESHOLD_KEY = "fragment_file_length_threshold";
    public static final String FRAGMENT_SIZE_KEY = "fragment_size";
    public static final String HTTP3_0RTT_WHITE_LIST_KEY = "network_http3_0rtt_write_list";
    public static final String HTTP3_1RTT_WHITE_LIST_KEY = "network_http3_1rtt_write_list";
    public static final String HTTP3_BLACK_LIST_KEY = "network_http3_black_list";
    public static final String HTTP3_ENABLE = "HTTP3_ENABLE";
    public static final String HTTP3_NETWORK_CHANGE_WHITE_LIST_KEY = "network_change_http3_white_list";
    public static final String HTTP3_OPT_WHITE_LIST_KEY = "network_http3_opt_white_list";
    public static final String HTTP3_VIP_BLACK_LIST_KEY = "network_http3_vip_black_list";
    public static final String IPV6_DETECT_KEY = "network_ipv6_detect";
    public static final String IPV6_RECTIFICATION_KEY = "network_ipv6_rectification";
    private static final long LAZY_LOAD_TNET_SECURITY_TIME = 15000;
    private static final int MAX_ACCS_RECONNECT_PERIOD = 600000;
    public static final String MULTI_PATH_HARMONY_WHITE_LIST = "multi_path_harmony_white_list";
    public static final String MULTI_PATH_MONITOR_KEY = "multi_path_monitor";
    public static final String NETWORK_ACCEPT_ENCODE_WHITE_LIST_KEY = "network_accept_encode_domain_write_list";
    private static final String NETWORK_ACCESS_POINT_ENABLE = "NETWORK_ACCESS_POINT_ENABLE";
    private static final String NETWORK_ALLOW_FORCE_AMDC_ENABLE = "NETWORK_ALLOW_FORCE_AMDC_ENABLE";
    private static final String NETWORK_ALLOW_NET_FULL_LOW_LATENCY_ENABLE = "NETWORK_ALLOW_NET_FULL_LOW_LATENCY_ENABLE";
    public static final String NETWORK_ALLOW_NO_COOKIE_WHITE_LIST_KEY = "network_url_allow_no_cookie_white_list";
    public static final String NETWORK_AMDC_LIGHT_TIME_KEY = "network_amdc_light_time_key";
    private static final String NETWORK_AMDC_LOCATION_RETRY_ENABLE = "NETWORK_AMDC_LOCATION_RETRY_ENABLE";
    public static final String NETWORK_AMDC_PARCELBALE_ENABLE = "network_amdc_parcelable_key";
    private static final String NETWORK_AMDC_STRATEGY_OPT_ENABLE = "NETWORK_AMDC_STRATEGY_OPT_ENABLE";
    public static final String NETWORK_AMDC_STRATEGY_THRESHOLD_KEY = "network_amdc_strategy_threshold_list";
    private static final String NETWORK_AMDC_STRATEGY_UPDATE_ENABLE = "NETWORK_AMDC_STRATEGY_UPDATE_ENABLE";
    public static final String NETWORK_AMDC_TIMEOUT_KEY = "network_amdc_timeout_key";
    private static final String NETWORK_BG_NOT_FORCE_CELL_OPT_ENABLE = "NETWORK_BG_NOT_FORCE_CELL_OPT_ENABLE";
    public static final String NETWORK_BG_SOCKET_ENABLE = "NETWORK_BG_SOCKET_ENABLE";
    public static final String NETWORK_CANCEL_HARD_EXPIRY_ENABLE = "network_cancel_hard_expiry_enable_key";
    public static final String NETWORK_CHANNEL_AMDC_TTL_KEY = "network_channel_amdc_ttl_key";
    public static final String NETWORK_COOKIE_LOG_HOST_WHITE_LIST_KEY = "network_cookie_log_domain_write_list";
    private static final String NETWORK_COOKIE_OPT_ENABLE = "NETWORK_COOKIE_OPT_ENABLE";
    private static final String NETWORK_COOKIE_OPT_V2_OPENED = "NETWORK_COOKIE_OPT_V2_OPENED";
    private static final String NETWORK_COOKIE_RETRY_TIME = "NETWORK_COOKIE_RETRY_TIME";
    private static final String NETWORK_DECOMPRESS_ENABLE = "NETWORK_DECOMPRESS_ENABLE";
    public static final String NETWORK_DETECT_H3_HOST_WHITE_LIST_KEY = "network_h3_detect_domain_write_list";
    public static final String NETWORK_DNS_OPT_WHITE_LIST = "network_dns_opt_white_list";
    public static final String NETWORK_DOWNLOAD_ASYNC_RATIO = "network_download_async_ratio";
    public static final String NETWORK_FG_AMDC_ENABLE = "NETWORK_FG_AMDC_ENABLE";
    public static final String NETWORK_FIX_WRITE_STREAM_ERROR_ENABLE = "network_fix_write_stream_error_enable_key";
    private static final String NETWORK_GZIP_DECOMPRESS_ENABLE = "NETWORK_GZIP_CLOSE_DECOMPRESS_ENABLE";
    public static final String NETWORK_H3_STRATEGY_FILTER_ENABLE = "network_h3_strategy_filter_enable_key";
    private static final String NETWORK_HANDOVER_SIGNAL_ENABLE = "NETWORK_HANDOVER_SIGNAL_ENABLE";
    private static final String NETWORK_HEADER_IGNORE_CASE_ENABLE = "NETWORK_HEADER_IGNORE_CASE_ENABLE";
    public static final String NETWORK_HTTP3_DISABLE_HOST_WHITE_LIST_KEY = "network_http3_disable_host_white_list_key";
    private static final String NETWORK_HTTP3_PRE_HOST_ENABLE = "NETWORK_HTTP3_PRE_HOST_ENABLE";
    private static final String NETWORK_HTTP3_RECONNECT_ENABLE = "NETWORK_HTTP3_RECONNECT_ENABLE";
    public static final String NETWORK_INFO_ENABLE = "network_info_enable_key";
    private static final String NETWORK_INTERCEPTOR_OPT_TYPE = "NETWORK_INTERCEPTOR_OPT_TYPE";
    private static final String NETWORK_IPV6_DETECT_OPT_OPENED = "NETWORK_IPV6_DETECT_OPT_OPENED";
    public static final String NETWORK_IPV6_DOWN_GRADE_HOST_WHITE_LIST_KEY = "network_ipv6_down_grade_host_white_list_key";
    private static final String NETWORK_IPV6_ENABLE = "NETWORK_IPV6_ENABLE";
    private static final String NETWORK_LAST_STATUS_NONE_ENABLE = "NETWORK_LAST_STATUS_NONE_ENABLE";
    private static final String NETWORK_LAUNCH_OPT_ENABLE = "NETWORK_LAUNCH_OPT_ENABLE";
    private static final String NETWORK_LAUNCH_OPT_OPENED = "network_launch_opt_open";
    private static final String NETWORK_LAUNCH_OPT_V1_OPENED = "network_launch_opt_v1_open";
    private static final String NETWORK_LAUNCH_OPT_V2_OPENED = "network_launch_opt_v2_open";
    public static final String NETWORK_LAZY_LOAD_TNET_SECURITY_TIME_KEY = "network_amdc_lazy_load_tnet_sec_key";
    public static final String NETWORK_LIMIT_AMDC_ENABLE = "NETWORK_LIMIT_AMDC_ENABLE";
    public static final String NETWORK_LONG_AMDC_WHITE_LIST_KEY = "network_long_amdc_white_list";
    public static final String NETWORK_LOW_LATENCY_WHITE_LIST_KEY = "network_low_latency_url_white_list_key";
    public static final String NETWORK_LUNCH_AFTER_AMDC_WHITE_LIST_KEY = "network_lunch_after_amdc_white_list";
    public static final String NETWORK_METRICS_TIME_KEY = "metrics_time_config_key";
    public static final String NETWORK_MTOP_AMDC_WHITE_LIST_KEY = "network_mtop_amdc_white_list";
    public static final String NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_KEY = "network_mtop_interceptor_host_white_list";
    public static final String NETWORK_MTU_CONNECT_UPDATE_ENABLE = "NETWORK_MTU_CONNECT_UPDATE_ENABLE";
    public static final String NETWORK_MTU_WHITE_LIST_KEY = "network_mtu_white_list_key";
    private static final String NETWORK_MTU_WIFI_OPT_ENABLE = "NETWORK_MTU_WIFI_OPT_ENABLE";
    private static final String NETWORK_MULTI_CONNECT_ENABLE = "NETWORK_MULTI_CONNECT_ENABLE";
    public static final String NETWORK_MULTI_CONNECT_WHITE_LIST_KEY = "network_multi_connect_white_list";
    public static final String NETWORK_OKHTTP_KEY = "network_okhttp_key";
    public static final String NETWORK_PRE_HOST_HTTP2_WHITE_LIST_KEY = "network_pre_host_http2_white_list";
    public static final String NETWORK_PRE_HOST_HTTP3_WHITE_LIST_KEY = "network_pre_host_http3_white_list";
    private static final String NETWORK_PRE_HOST_MCC_ENABLE = "NETWORK_PRE_HOST_MCC_ENABLE";
    public static final String NETWORK_PRE_HOST_WHITE_LIST_KEY = "network_pre_host_white_list";
    private static final String NETWORK_PRE_HOT_STR = "network_pre_hot_str";
    private static final String NETWORK_PRE_SESSION_OPT_ENABLE = "NETWORK_PRE_SESSION_OPT_ENABLE";
    public static final String NETWORK_PRE_SESSION_WHITE_LIST_KEY = "network_pre_session_white_list_key";
    private static final String NETWORK_PRIORITY_UPDATE_AMDC_ENABLE = "NETWORK_PRIORITY_UPDATE_AMDC_ENABLE";
    private static final String NETWORK_PROCESS_NAME_UPDATE_ENABLE = "NETWORK_PROCESS_NAME_UPDATE_ENABLE";
    public static final String NETWORK_QOS_SMOOTH_WINDOW_SIZE_KEY = "network_qos_smooth_window_size";
    private static final String NETWORK_RANGE_BOOST_OPEN = "NETWORK_RANGE_BOOST_OPEN";
    public static final String NETWORK_RECENT_WIN_TIME_KEY = "network_recent_win_time_key";
    public static final String NETWORK_REDUNDANT_SESSION_FIX = "network_redundant_session_fix";
    public static final String NETWORK_REMOTE_CRITICAL_PLAN_ENABLE = "NETWORK_REMOTE_CRITICAL_PLAN_ENABLE";
    private static final String NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE = "NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE";
    private static final String NETWORK_REPLACE_STRATEGY_ENABLE = "NETWORK_REPLACE_STRATEGY_ENABLE";
    public static final String NETWORK_REQ_CONFIG_ENABLE = "NETWORK_REQ_CONFIG_ENABLE";
    private static final String NETWORK_REQ_FEC_SIZE_OPT_ENABLE = "NETWORK_REQ_FEC_SIZE_OPT_ENABLE";
    public static final String NETWORK_REQ_FEC_SIZE_WHITE_LIST_KEY = "network_req_fec_size_white_list";
    private static final String NETWORK_REQ_FORCE_CELL_ENABLE = "NETWORK_REQ_FORCE_CELL_ENABLE";
    public static final String NETWORK_REQ_UP_FEC_SIZE_WHITE_LIST_KEY = "network_req_fec_up_size_white_list";
    private static final String NETWORK_RETRY_USE_LONG_LINK_ENABLE = "NETWORK_RETRY_USE_LONG_LINK_ENABLE";
    public static final String NETWORK_RUM_PARAM_LIST_KEY = "network_rum_params_list_key";
    public static final String NETWORK_SAVE_POWER_TIME_KEY = "network_save_power_time_key";
    public static final String NETWORK_SCENE_BWE_ESTIMATOR_LIST_KEY = "network_scene_bwe_estimator_list_key";
    private static final String NETWORK_SESSION_OPT_ENABLE = "NETWORK_SESSION_OPT_ENABLE";
    private static final String NETWORK_SHORT_LINK_ENABLE = "NETWORK_SHORT_LINK_ENABLE";
    private static final String NETWORK_SMOOTH_RECONNECT_ENABLE = "NETWORK_SMOOTH_RECONNECT_ENABLE";
    private static final String NETWORK_SMOOTH_RECONNECT_OPT_OPENED = "NETWORK_SMOOTH_RECONNECT_OPT_OPENED";
    private static final String NETWORK_SPDY_OFFLINE_ENABLE = "NETWORK_SPDY_OFFLINE_ENABLE";
    private static final String NETWORK_SSL_SP_OPT_ENABLE = "NETWORK_SSL_SP_OPT_ENABLE";
    public static final String NETWORK_STACK_UNKNOWN_BUILD_STRATEGY_ENABLE = "network_stack_unknown_build_strategy_enable_key";
    private static final String NETWORK_STRATEGY_COMPARE_ENABLE = "NETWORK_STRATEGY_COMPARE_ENABLE";
    public static final String NETWORK_STRATEGY_RETRY_ENABLE = "network_strategy_retry_enable_key";
    public static final String NETWORK_STRATEGY_TIMELY_UPDATE_ENABLE = "network_strategy_timely_update_enable_key";
    public static final String NETWORK_STRATEGY_TIMELY_UPDATE_HOST_WHITE_LIST_KEY = "network_strategy_timely_update_domain_write_list";
    private static final String NETWORK_SUPPORT_SET_WAIT_TIME_OUT_ENABLE = "NETWORK_SUPPORT_SET_WAIT_TIME_OUT_ENABLE";
    public static final String NETWORK_SUPPORT_STREAMING_PARSER_WHITE_LIST_KEY = "network_support_stream_parser_white_list_key";
    private static final String NETWORK_TNET_FORCE_PUBKEY_ENABLE = "NETWORK_TNET_FORCE_PUBKEY_ENABLE";
    public static final String NETWORK_TUNNEL_KEY = "network_tunnel_enable";
    public static final String NETWORK_UNIQUE_ID_ENABLE = "network_unique_id_enable_key";
    public static final String NETWORK_UPLINK_COMPRESS_HOST_WHITE_LIST_KEY = "network_uplink_compress_host_white_list";
    public static final String NETWORK_UPLINK_COMPRESS_URL_WHITE_LIST_KEY = "network_uplink_compress_url_white_list";
    private static final String NETWORK_UPLINK_ENCODE_ENABLE = "NETWORK_UPLINK_ENCODE_ENABLE";
    private static final String NETWORK_UPLINK_ENCODE_UPDATE_ENABLE = "NETWORK_UPLINK_ENCODE_UPDATE_ENABLE";
    public static final String NETWORK_URL_MONITOR_REQUEST_WHITE_LIST_KEY = "network_url_monitor_request_white_list";
    private static final String NETWORK_VPN_CHANGE_DETECT_ENABLE = "NETWORK_VPN_CHANGE_DETECT_ENABLE";
    private static final String NETWORK_VPN_DETECT_RACING_ENABLE = "NETWORK_VPN_DETECT_RACING_ENABLE";
    private static final String NETWORK_VPN_FAST_DEGRADE_ENABLE = "NETWORK_VPN_FAST_DEGRADE_ENABLE";
    private static final String NETWORK_VPN_OPT_ENABLE = "NETWORK_VPN_OPT_ENABLE";
    public static final String NETWORK_WAIT_THREAD_COUNT_KEY = "NETWORK_WAIT_THREAD_COUNT_NEW_KEY";
    private static final String NETWORK_WIFI_DETECT_OPT_ENABLE = "NETWORK_WIFI_DETECT_OPT_ENABLE";
    public static final String NETWORK_WIFI_FG_FORCE_CELL_CONFIG_LIST_KEY = "network_wifi_fg_force_cell_config_list";
    private static final String NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE = "NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE";
    public static final String NETWORK_WIFI_FG_FORCE_CELL_WHITE_LIST_KEY = "network_wifi_fg_force_cell_white_list";
    private static final String NETWORK_XQUIC_REMOTE_ENABLE = "NETWORK_XQUIC_REMOTE_ENABLE";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE = "NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE = "NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE = "NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE";
    public static final String NETWORK_ZSTD_DICT_WHITE_LIST_KEY = "network_zstd_dict_white_list";
    private static final String NETWORK_ZSTD_STREAM_DECOMPRESS_ENABLE = "NETWORK_ZSTD_STREAM_DECOMPRESS_ENABLE";
    public static final String NEXT_LAUNCH_FORBID = "NEXT_LAUNCH_FORBID";
    public static final String OKHTTP_H2_PRE_BUILD_LIST_KEY = "network_okhttp_pre_build_list";
    public static final String OKHTTP_H2_WHITE_LIST_KEY = "network_okhttp_white_list";
    public static final String QOS_BIZ_WHITE_LIST_KEY = "network_qos_biz_white_list";
    public static final String QOS_HOST_WHITE_LIST_KEY = "network_qos_host_white_list";
    public static final String REQ_FORCE_CELL_WHITE_LIST_KEY = "network_req_force_cell_write_list";
    private static final int SAVE_POWER_TIME = 60000;
    private static final String TAG = "awcn.AwcnConfig";
    public static final String VPN_FAST_DEGRADE_BIZID_WHITE_LIST_KEY = "network_vpn_fast_degrade_biz_id_write_list";
    public static final String VPN_FAST_DEGRADE_HOST_WHITE_LIST_KEY = "network_vpn_fast_degrade_host_write_list";
    public static final String VPN_PROXY_SESSION_WHITE_LIST_KEY = "network_vpn_proxy_session_write_list";
    public static final String ZSTD_DICT_FAIL_CONFIG = "zstd_dict_fail_config";
    public static final String ZSTD_DICT_FAIL_CONFIG_KEY = "zstd_dict_fail_config_key";
    public static final String ZSTD_DICT_THRESHOLD = "zstd_dict_threshold_key";
    public static final String ZSTD_DICT_THRESHOLD_KEY = "zstd_dict_threshold";
    private static final CopyOnWriteArrayList<String> ALLOW_ALL_PATH = new CopyOnWriteArrayList<>();
    private static volatile boolean isAccsSessionCreateForbiddenInBg = false;
    private static volatile boolean isHttpsSniEnable = true;
    private static volatile boolean isHorseRaceEnable = true;
    private static volatile boolean ipv6Enable = true;
    private static volatile boolean isIpv6OnlyEnable = true;
    private static volatile boolean isAllowConvertIPv4ToIPv6 = false;
    private static volatile boolean isIpv6RectificationEnable = true;
    private static boolean isAsyncLoadStrategyEnable = false;
    private static boolean isAsyncIpStackDetect = false;
    private static volatile boolean isTbNextLaunch = false;
    private static volatile boolean isNetworkDetectEnable = false;
    private static volatile boolean isMTUDetectEnable = false;
    private static volatile boolean isMTUConnectOptimize = false;
    private static volatile int accsReconnectionDelayPeriod = 10000;
    private static volatile boolean isHttp3Enable = true;
    private static volatile int xquicCongControl = -1;
    private static volatile boolean isCookieHeaderRedundantFix = true;
    private static volatile boolean isSendConnectInfoByService = true;
    private static volatile CopyOnWriteArrayList<String> httpDnsNotifyWhiteList = null;
    private static CopyOnWriteArrayList<String> http3BlackList = null;
    private static CopyOnWriteArrayList<String> http3WhiteList = null;
    private static CopyOnWriteArrayList<String> http3VipBlackList = null;
    private static CopyOnWriteArraySet<String> lunchAfterAmdcList = null;
    private static volatile boolean isHttp3DefaultEnable = true;
    private static CopyOnWriteArrayList<String> http3DefaultWhiteList = null;
    private static CopyOnWriteArrayList<String> http3_1RttWhiteList = null;
    private static CopyOnWriteArrayList<String> http3_0RttWhiteList = null;
    private static CopyOnWriteArrayList<String> http3DisabledWhiteList = null;
    private static CopyOnWriteArrayList<String> qosBizWhiteList = null;
    private static CopyOnWriteArrayList<String> qosHostWhiteList = null;
    private static boolean isLastStatusNoneOpt = false;
    private static CopyOnWriteArrayList<String> http3NetworkChangeWhiteList = null;
    private static boolean isPreSessionOptEnable = true;
    private static CopyOnWriteArrayList<String> preSessionWhiteList = null;
    private static ConcurrentHashMap<String, Integer> usePreSessionMap = null;
    private static boolean isStrategyCompareEnable = true;
    private static volatile boolean isHttp3PreHostEnable = true;
    private static volatile boolean isPreHostMccNotUseEnable = false;
    private static volatile boolean isHttp3ReconnectEnable = true;
    private static volatile boolean isReqFecSizeOptEnable = false;
    private static ConcurrentHashMap<String, List<String>> reqFecUpSizeWhiteList = null;
    private static ConcurrentHashMap<String, List<String>> reqFecSizeWhiteList = null;
    private static volatile boolean isAllowNetFullLowLatencyEnable = false;
    private static volatile long pingTime = 200;
    private static ConcurrentHashMap<String, List<String>> allowFullLowLatencyUrlWhiteList = null;
    private static ConcurrentHashMap<String, List<String>> mtuWhiteList = null;
    private static long fgSendAmdcIntervalTime = 60000;
    private static long lazyLoadTnetSecTime = 15000;
    private static boolean isLaunchOptEnable = false;
    private static boolean isAmdcStrategyOptEnable = true;
    private static long mtopAmdcThreshold = 604800000;
    private static long otherAmdcThreshold = AuthenticatorCache.MAX_CACHE_TIME;
    private static long amdcClearThreshold = AmdcPriorityHelper.AMDC_PRIORITY_MAX_TIME;
    private static long longAmdcThreshold = pqw.DEFAULT_MAX_AGE;
    private static volatile CopyOnWriteArrayList<String> mtopAmdcWhiteList = null;
    private static volatile CopyOnWriteArrayList<String> longAmdcWhiteList = null;
    private static boolean isAmdcStrategyUpdateEnable = false;
    private static volatile String multiPathUserToastText = null;
    private static final int DEFAULT_MULTI_PATH_TOAST_TIRE_TIME = 168;
    private static volatile int multiPathToastTireTime = DEFAULT_MULTI_PATH_TOAST_TIRE_TIME;
    private static boolean isZstdDictDecompressMtopEnable = false;
    private static String preHotStr = null;
    private static boolean isLaunchOptOpened = true;
    private static boolean isLaunchOptV1Opened = true;
    private static boolean isLaunchOptV2Opened = true;
    private static boolean isNotAllowCookieOpened = true;
    public static long cookieRetryTime = 10;
    private static boolean isAmdcPriorityUpdateEnable = false;
    private static boolean isCookieOptEnable = false;
    private static volatile int waitThreadCount = 8;
    private static volatile long recentWinTime = 15000;
    private static volatile long updateMetricsTime = 5000;
    private static volatile CopyOnWriteArrayList<String> exceptionDetectUrlList = null;
    private static volatile CopyOnWriteArrayList<String> httpDetectWhiteList = null;
    private static volatile boolean isHttpDetectEnable = true;
    private static volatile boolean isDetectCenterEnable = true;
    private static volatile boolean isMultiPathMonitorEnable = true;
    private static CopyOnWriteArrayList<String> multiPathHarmonyWhiteList = null;
    private static AtomicBoolean initialized = new AtomicBoolean(false);
    private static AtomicBoolean initializedAsync = new AtomicBoolean(false);
    private static volatile boolean isIpv6DetectEnable = true;
    private static volatile boolean isTicketStoreUpgrade = true;
    private static volatile boolean isTunnelEnable = true;
    private static volatile boolean isOkHttpEnable = true;
    private static CopyOnWriteArrayList<String> okhttpHostWhiteList = null;
    private static CopyOnWriteArrayList<String> okhttpPreBuildList = null;
    private static CopyOnWriteArrayList<String> socketBoostHostWhiteList = null;
    private static volatile boolean isRTTDetectEnable = true;
    private static volatile boolean isSessionReuseOptimized = false;
    private static volatile boolean isMPQuicConfigSwitch = true;
    private static volatile boolean isMPQuicUserSwitch = false;
    private static volatile boolean isComplexConnectEnable = true;
    private static volatile CopyOnWriteArrayList<String> complexConnectWhiteList = null;
    private static volatile long complexConnectDelayTime = 250;
    private static volatile boolean isEagainOptimizeEnable = true;
    private static volatile long channelAmdcTtl = 2;
    private static boolean isDecompressOpened = false;
    private static boolean isIpv6DetectOptEnable = false;
    private static boolean isSessionOptEnable = false;
    private static boolean isShortLinkConnectEnable = true;
    private static boolean isUplinkEncodeOpened = true;
    private static boolean isUplinkEncodeUpdateOpened = false;
    private static volatile boolean isSmoothReconnectEnable = true;
    private static volatile boolean isSmoothReconnectOptOpened = false;
    private static boolean isWifiUnavailableUseCellOptOpened = false;
    private static boolean isBgNotForceCellOptOpened = false;
    private static boolean isReplaceStrategyOpened = false;
    private static boolean isVpnDetectRacingOpened = false;
    private static boolean isWifiDetectOptOpened = false;
    private static CopyOnWriteArrayList<String> wifiFgForceCellWhiteList = null;
    private static volatile int continueTimeoutCount = 6;
    private static volatile int periodTimeoutCount = 3;
    private static volatile long periodTime = 5;
    private static volatile long detectIntervalTime = 60;
    private static volatile int detectReadTimeOut = 2000;
    private static volatile long allowUseCellFlowSize = 50;
    private static volatile CopyOnWriteArrayList<String> urlMonitorRequestList = null;
    private static volatile CopyOnWriteArrayList<String> supportStreamingParserList = null;
    private static volatile CopyOnWriteArrayList<String> allowNoCookieList = null;
    private static long interceptorOptType = 0;
    private static boolean isGzipDecompressOpend = false;
    private static boolean isZstdStreamDecompressOpened = true;
    private static boolean isMultiConnectOpened = true;
    private static boolean isAccessPointStatus = false;
    private static volatile ConcurrentHashMap<String, List<String>> accessPointWhiteList = null;
    private static boolean isVpnChangeDetectOpened = true;
    private static boolean isXquicRemoteEnable = true;
    private static boolean isHandoverSignalOpened = false;
    private static boolean isZstdDictDecompressOpened = false;
    private static ConcurrentHashMap<String, List<String>> zstdDictDecompressWhiteList = null;
    private static boolean isZstdDictDecompressChannelEnable = true;
    private static boolean isAmdcLocationRetryEnable = true;
    private static int zstdFileMaxCount = 10;
    private static int zstdDictMaxCount = 10;
    private static long zstdDictMaxLength = 4194304;
    private static long zstdPerDictMaxLength = 256000;
    private static long zstdDictProtectUpdateTime = 3600000;
    private static long zstdLinkDictIntervalTime = 300000;
    private static long zstdDictFailIntervalTime = 300000;
    private static long zstdDictFailCount = 5;
    private static boolean isAccessPointOpened = false;
    private static boolean isTnetForcePubKey = false;
    private static boolean isSslSpOptEnable = false;
    private static boolean isReqForceCellEnable = false;
    private static boolean isVpnOptOpened = true;
    private static volatile boolean isVpnFastDegradeEnable = true;
    private static volatile boolean isVpnFastDegradeABEnable = true;
    private static volatile ConcurrentHashMap<String, List<String>> vpnFastDegradeHostWhiteList = null;
    private static volatile CopyOnWriteArrayList<String> vpnFastDegradBizIdWhiteList = null;
    private static volatile CopyOnWriteArrayList<String> reqForceCellWhiteList = null;
    private static long vpnListenTimeInterval = 1500;
    private static long vpnFastDegradTime = 1200;
    private static int amdcTimeout = 3000;
    private static long amdcLightTime = 15000;
    private static long vpnFgChangeCount = 5;
    private static volatile CopyOnWriteArrayList<String> vpnProxySessionWhiteList = null;
    private static volatile CopyOnWriteArrayList<String> multiConnectWhiteList = null;
    private static volatile CopyOnWriteArrayList<String> uplinkEncodeHostWhiteList = null;
    private static volatile ConcurrentHashMap<String, List<String>> uplinkEncodeUrlWhiteList = null;
    private static volatile CopyOnWriteArrayList<String> ipv6DowngradeWhiteList = null;
    private static volatile ConcurrentHashMap<String, List<String>> presetHostHttp3WhiteList = null;
    private static volatile ConcurrentHashMap<String, List<String>> presetHostHttp2WhiteList = null;
    private static volatile ConcurrentHashMap<String, List<String>> presetHostWhiteList = null;
    private static volatile ConcurrentHashMap<String, Integer> mtopInterceptorWhiteList = null;
    private static volatile ConcurrentHashMap<String, List<String>> sceneBWEstimatorListList = null;
    private static long savePowerTimeInterval = 60000;
    private static volatile CopyOnWriteArrayList<String> detectHostWhiteList = null;
    private static volatile CopyOnWriteArrayList<String> cookiePrintLogWhiteList = null;
    private static volatile CopyOnWriteArrayList<String> acceptEncodeWhiteList = null;
    private static boolean isDownloadAsyncSwitch = false;
    public static boolean isQoSQueueABSwitch = false;
    public static boolean isQoSPacingABSwitch = true;
    public static boolean isQoSRecvWndABSwitch = false;
    private static volatile ConcurrentHashMap<String, List<String>> rumParamsMap = null;
    private static double[] THV_WIFI = {39.0d, 950.0d, 2954.0d, 892.0d, 0.5d, 63.0d, 318.0d, 783.0d, 379.0d, 0.5d, 4575.0d, 110.0d, 229.0d, 97.0d, 10223.0d, 36.0d, 68.0d, 50.0d};
    private static double[] THV_CELL = {51.0d, 2009.0d, 4552.0d, 1624.0d, 0.56d, 67.0d, 587.0d, 1317.0d, 598.0d, 0.5d, 5606.0d, 154.0d, 305.0d, 158.0d, 11864.0d, 65.0d, 105.0d, 77.0d};
    private static CopyOnWriteArrayList<String> qosReferList = null;
    private static int qosDelayUnit = 100;
    private static boolean rangeBoostOpen = true;
    private static long fragmentFileLengthThreshold = 3145728;
    private static long fragmentSize = 1048576;
    private static int networkQosSmoothWindowSize = 32;
    private static double cell5GBandwidthQualityCoeff = 1.0d;
    private static double cell4GBandwidthQualityCoeff = 1.0d;
    private static double doublePathsSlipdownCoeff = 0.20000000298023224d;
    private static int recvBpsLimitation = 1048576;
    private static double robustSpeedThreshold = 1250.0d;
    private static double poorSpeedThreshold = 100.0d;
    private static long qualityNotifyMinInterval = 5000;
    private static volatile boolean isSpdyOfflineEnable = false;
    private static boolean isRepeatThreadUseVirtualThread = true;
    private static volatile boolean isAllowForceAmdcEnable = true;
    private static volatile boolean isAllowForceFgAmdcEnable = false;
    private static boolean isAmdcLimitEnable = false;
    private static double amdcLimitRate = 0.5d;
    private static boolean isReqConfigEnable = false;
    private static boolean isNetworkInfoEnable = false;
    private static boolean isBgSocketEnable = true;
    private static boolean isMTUConnectUpdate = false;
    private static boolean isRemoteCriticalPlan = false;
    private static volatile ArrayList<DnsNavConfigTask> dnsNavTasksList = null;
    private static boolean isAmdcParcelableOrangeEnable = false;
    private static boolean isAmdcParcelableABEnable = false;
    public static AtomicBoolean firstSetAmdcParcelable = new AtomicBoolean(true);
    private static boolean isAmdcParcelableEnable = false;
    private static boolean isLaunchStrategyABEnable = false;
    private static boolean isH3DetectStrategyFilterEnable = false;
    private static boolean isStackUnknownBuildStrategyEnable = false;
    private static boolean isStrategyRetryEnable = false;
    private static boolean isStrategyTimelyUpdateEnable = false;
    private static volatile CopyOnWriteArrayList<String> strategyTimelyUpdateHostWhiteList = null;
    private static boolean isStrategyOptABEnable = false;
    private static boolean isCancelHardExpiryEnable = false;
    private static boolean isAllowRetryUseLongLinkEnable = false;
    private static CopyOnWriteArrayList<String> allowRetryUseLongLinkWhiteList = null;
    private static boolean isUniqueIdEnable = false;
    private static boolean isFixWriteStreamErrorEnable = true;
    private static boolean isSupportSetWaitTimeout = false;
    private static boolean isMTUWifiOptEnable = false;
    private static boolean isProcessNameUpdateEnable = false;
    private static boolean isHeaderIgnoreCaseEnable = false;

    static {
        t2o.a(607125507);
    }

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            doInitTask(context);
        }
    }

    public static int getAccsReconnectionDelayPeriod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bb1f465", new Object[0])).intValue();
        }
        return accsReconnectionDelayPeriod;
    }

    public static long getAllowUseCellFlowSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a537c0e0", new Object[0])).longValue();
        }
        return allowUseCellFlowSize;
    }

    public static long getAmdcClearThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6aea161a", new Object[0])).longValue();
        }
        return amdcClearThreshold;
    }

    public static long getAmdcLightTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34bc935d", new Object[0])).longValue();
        }
        return amdcLightTime;
    }

    public static double getAmdcLimitRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b5fed8f", new Object[0])).doubleValue();
        }
        return amdcLimitRate;
    }

    public static int getAmdcTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28ec4c7a", new Object[0])).intValue();
        }
        return amdcTimeout;
    }

    private static CopyOnWriteArrayList<String> getArrayList(JSONArray jSONArray) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("b0938d2f", new Object[]{jSONArray});
        }
        try {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList.add(string);
                    }
                } catch (Exception e2) {
                    e = e2;
                    ALog.e(TAG, "[getArrayList] error", null, e, new Object[0]);
                    return copyOnWriteArrayList;
                }
            }
        } catch (Exception e3) {
            e = e3;
            copyOnWriteArrayList = null;
        }
        return copyOnWriteArrayList;
    }

    public static double getCell4GBandwidthQualityCoeff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d420055", new Object[0])).doubleValue();
        }
        return cell4GBandwidthQualityCoeff;
    }

    public static double getCell5GBandwidthQualityCoeff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46931116", new Object[0])).doubleValue();
        }
        return cell5GBandwidthQualityCoeff;
    }

    public static long getChannelAmdcTtl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66f1012f", new Object[0])).longValue();
        }
        return channelAmdcTtl;
    }

    public static long getComplexConnectDelayTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2196a3b", new Object[0])).longValue();
        }
        return complexConnectDelayTime;
    }

    public static int getContinueTimeoutCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf6d9e5", new Object[0])).intValue();
        }
        return continueTimeoutCount;
    }

    public static long getCookieRetryTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1250c56", new Object[0])).longValue();
        }
        return cookieRetryTime;
    }

    public static long getDetectIntervalTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad949866", new Object[0])).longValue();
        }
        return detectIntervalTime;
    }

    public static int getDetectReadTimeOut() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11f34eec", new Object[0])).intValue();
        }
        return detectReadTimeOut;
    }

    public static double getDoublePathsSlipdownCoeff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f75f6885", new Object[0])).doubleValue();
        }
        return doublePathsSlipdownCoeff;
    }

    public static CopyOnWriteArrayList<String> getExceptionDetectUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("9691c7e7", new Object[0]);
        }
        if (exceptionDetectUrlList == null) {
            exceptionDetectUrlList = new CopyOnWriteArrayList<>();
        }
        return exceptionDetectUrlList;
    }

    public static long getFgSendAmdcIntervalTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f0ce1f7", new Object[0])).longValue();
        }
        return fgSendAmdcIntervalTime;
    }

    public static long getFragmentFileLengthThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db6e785e", new Object[0])).longValue();
        }
        return fragmentFileLengthThreshold;
    }

    public static long getFragmentSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("791fd9e2", new Object[0])).longValue();
        }
        return fragmentSize;
    }

    public static int getHostMtu(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4627055c", new Object[]{str, str2, new Boolean(z)})).intValue();
        }
        return getMtuVal(str, str2, z);
    }

    public static long getInterceptorOptType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30bbd619", new Object[0])).longValue();
        }
        return interceptorOptType;
    }

    public static String getKeyInArrayList(String str, ConcurrentHashMap<String, List<String>> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f20636", new Object[]{str, concurrentHashMap});
        }
        if (!(str == null || TextUtils.isEmpty(str) || concurrentHashMap == null)) {
            for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                for (String str2 : entry.getValue()) {
                    if ("*".equalsIgnoreCase(str2)) {
                        return entry.getKey();
                    }
                    if (str.startsWith(str2)) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public static long getLongAmdcThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7e70ea9", new Object[0])).longValue();
        }
        return longAmdcThreshold;
    }

    public static CopyOnWriteArraySet<String> getLunchAfterAmdcList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArraySet) ipChange.ipc$dispatch("2cf16f71", new Object[0]);
        }
        return lunchAfterAmdcList;
    }

    public static long getMtopAmdcThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("117488dd", new Object[0])).longValue();
        }
        return mtopAmdcThreshold;
    }

    public static int getMultiPathToastTireTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b33d9eae", new Object[0])).intValue();
        }
        return multiPathToastTireTime;
    }

    public static String getMultiPathUserToastText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee60d298", new Object[0]);
        }
        return multiPathUserToastText;
    }

    public static int getNetworkQosSmoothWindowSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("437b9df6", new Object[0])).intValue();
        }
        return networkQosSmoothWindowSize;
    }

    public static List<String> getOkhttpPreBuildList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("15d88bd", new Object[0]);
        }
        return okhttpPreBuildList;
    }

    public static long getOtherAmdcThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0a7b541", new Object[0])).longValue();
        }
        return otherAmdcThreshold;
    }

    public static long getPeriodTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6c3fe9f", new Object[0])).longValue();
        }
        return periodTime;
    }

    public static int getPeriodTimeoutCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7af9947f", new Object[0])).intValue();
        }
        return periodTimeoutCount;
    }

    public static long getPingTime() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7858ed0", new Object[0])).longValue();
        }
        try {
            concurrentHashMap = allowFullLowLatencyUrlWhiteList;
        } catch (Throwable th) {
            ALog.e(TAG, "[getFullLowLatencyPingTime] error", null, th, new Object[0]);
            pingTime = 200L;
        }
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            List<String> list = allowFullLowLatencyUrlWhiteList.get("ping");
            if (list == null) {
                return pingTime;
            }
            pingTime = Long.parseLong(list.get(0));
            return pingTime;
        }
        return pingTime;
    }

    public static double getPoorSpeedThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff41d11", new Object[0])).doubleValue();
        }
        return poorSpeedThreshold;
    }

    public static ConcurrentHashMap<String, List<String>> getPresetHostHttp2WhiteList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("7b485fe5", new Object[0]);
        }
        return presetHostHttp2WhiteList;
    }

    public static ConcurrentHashMap<String, List<String>> getPresetHostHttp3WhiteList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("8831166", new Object[0]);
        }
        return presetHostHttp3WhiteList;
    }

    public static ConcurrentHashMap<String, List<String>> getPresetHostWhiteList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("ed59ef75", new Object[0]);
        }
        return presetHostWhiteList;
    }

    public static int getQoSRecvSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d19897c", new Object[0])).intValue();
        }
        return recvBpsLimitation;
    }

    public static int getQosDelayUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("70e21202", new Object[0])).intValue();
        }
        return qosDelayUnit;
    }

    public static long getQualityNotifyMinInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e126e60", new Object[0])).longValue();
        }
        return qualityNotifyMinInterval;
    }

    public static boolean getRangeBoostOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91d1ae51", new Object[0])).booleanValue();
        }
        return rangeBoostOpen;
    }

    public static long getRecentWinTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bc22eb3", new Object[0])).longValue();
        }
        return recentWinTime;
    }

    public static int getReqDownFecSize(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e07f6f29", new Object[]{str, str2})).intValue();
        }
        return getReqFecSize(reqFecSizeWhiteList, str, str2);
    }

    public static int getReqUpFecSize(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f309d610", new Object[]{str, str2})).intValue();
        }
        return getReqFecSize(reqFecUpSizeWhiteList, str, str2);
    }

    public static double getRobustSpeedThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5486f360", new Object[0])).doubleValue();
        }
        return robustSpeedThreshold;
    }

    public static long getSavePowerTimeInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37f0691f", new Object[0])).longValue();
        }
        return savePowerTimeInterval;
    }

    public static double getSceneSpeedThreshold(String str) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86525b59", new Object[]{str})).doubleValue();
        }
        try {
            if (!(sceneBWEstimatorListList == null || sceneBWEstimatorListList.isEmpty() || str == null || (list = sceneBWEstimatorListList.get(str)) == null || list.size() < 1)) {
                return Double.parseDouble(list.get(0));
            }
            return 500.0d;
        } catch (Throwable th) {
            ALog.e(TAG, "[getSceneSpeedThreshold] error", null, th, new Object[0]);
            return 500.0d;
        }
    }

    public static long getUpdateMetricsTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d29de0ec", new Object[0])).longValue();
        }
        return updateMetricsTime;
    }

    public static String getUplinkEncodeByUrlWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5e4021f", new Object[]{str});
        }
        String keyInArrayList = getKeyInArrayList(str, uplinkEncodeUrlWhiteList);
        return (keyInArrayList == null || keyInArrayList.isEmpty()) ? "gzip" : keyInArrayList;
    }

    public static long getVpnFastDegradTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6dd61211", new Object[0])).longValue();
        }
        return vpnFastDegradTime;
    }

    public static long getVpnFgChangeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b932131b", new Object[0])).longValue();
        }
        return vpnFgChangeCount;
    }

    public static long getVpnListenTimeInterval() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41cd6172", new Object[0])).longValue();
        }
        return vpnListenTimeInterval;
    }

    public static int getVpnMtu(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc21a346", new Object[]{str, new Boolean(z)})).intValue();
        }
        return getMtuVal(str, "vpnMtu", z);
    }

    public static int getWaitThreadCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6403db4", new Object[0])).intValue();
        }
        return waitThreadCount;
    }

    public static int getXquicCongControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3716bdd2", new Object[0])).intValue();
        }
        return xquicCongControl;
    }

    private static long getZstdDictAttributes(String str, int i) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        List<String> list;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e9cd59a", new Object[]{str, new Integer(i)})).longValue();
        }
        try {
            concurrentHashMap = zstdDictDecompressWhiteList;
        } catch (Throwable th) {
            ALog.e(TAG, "[getZstdDictAttributes] error", null, th, new Object[0]);
        }
        if (str != null && !TextUtils.isEmpty(str) && concurrentHashMap != null && i >= 0) {
            Iterator<Map.Entry<String, List<String>>> it = concurrentHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    list = null;
                    break;
                }
                Map.Entry<String, List<String>> next = it.next();
                if (str.startsWith(next.getKey())) {
                    list = concurrentHashMap.get(next.getKey());
                    break;
                }
            }
            if (list != null && !list.isEmpty() && list.size() > 0 && list.size() > i && (str2 = list.get(i)) != null && !str2.isEmpty()) {
                return Long.parseLong(str2);
            }
            return -1L;
        }
        return -1L;
    }

    public static long getZstdDictFailCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("299f7a57", new Object[0])).longValue();
        }
        return zstdDictFailCount;
    }

    public static long getZstdDictFailIntervalTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("619197c0", new Object[0])).longValue();
        }
        return zstdDictFailIntervalTime;
    }

    public static int getZstdDictMaxCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4041c1da", new Object[0])).intValue();
        }
        return zstdDictMaxCount;
    }

    public static long getZstdDictMaxLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d9f4ab0", new Object[0])).longValue();
        }
        return zstdDictMaxLength;
    }

    public static long getZstdDictProtectUpdateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("754cd82b", new Object[0])).longValue();
        }
        return zstdDictProtectUpdateTime;
    }

    public static int getZstdFileMaxCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa8432a0", new Object[0])).intValue();
        }
        return zstdFileMaxCount;
    }

    public static long getZstdLinkDictIntervalTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fef769c", new Object[0])).longValue();
        }
        return zstdLinkDictIntervalTime;
    }

    public static long getZstdPerDictMaxLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c657c3b1", new Object[0])).longValue();
        }
        return zstdPerDictMaxLength;
    }

    public static long getZstdTtl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73711052", new Object[]{str})).longValue();
        }
        return getZstdDictAttributes(str, 0);
    }

    public static boolean inVpnFastDegradBizIdWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ff85828", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, vpnFastDegradBizIdWhiteList);
    }

    public static boolean inVpnFastDegradeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab7be09", new Object[]{str})).booleanValue();
        }
        return isPrefixInArrayList(str, vpnFastDegradeHostWhiteList);
    }

    public static void initAsync(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac695955", new Object[]{context});
        } else if (!initializedAsync.compareAndSet(false, true)) {
        } else {
            if (isLaunchOptV1Opened()) {
                ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.AwcnConfig.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AwcnConfig.access$000(context);
                        }
                    }
                });
            } else {
                doInitTask(context);
            }
        }
    }

    public static synchronized void initSetAccessPointStatus(boolean z) {
        synchronized (AwcnConfig.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fc1e021", new Object[]{new Boolean(z)});
                return;
            }
            isAccessPointStatus = z;
            accessPointWhiteList = setArrayListAllMatch("{\"guide-acs.m.taobao.com\":[\"0\"], \"trade-acs.m.taobao.com\":[\"0\"],\"heic.alicdn.com\":[\"0\"],\"img.alicdn.com\":[\"0\"], \"g.alicdn.com\":[\"0\"], \"gw.alicdn.com\":[\"0\"],\"msgacs.m.taobao.com\":[\"0\"],\"market.m.taobao.com\":[\"0\"],\"video-zb.cloudvideocdn.taobao.com\":[\"0\"],\"video-sh.cloudvideocdn.taobao.com\":[\"0\"],\"guangguang.cloudvideocdn.taobao.com\":[\"0\"],\"umsgacs.m.taobao.com\":[\"0\"],\"mtlexternal.alibabausercontent.com\":[\"0\"],\"mtop-dict.m.taobao.com\":[\"0\"],\"wh-ssr-base-biz5-guide.taobao.com\":[\"0\"],\"pages-fast.m.taobao.com\":[\"0\"],\"pages-g.m.taobao.com\":[\"0\"],\"wh-ssr-base-trade1.taobao.com\":[\"0\"]}");
        }
    }

    public static boolean isAccessPointOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90dc7d16", new Object[0])).booleanValue();
        }
        return isAccessPointOpened;
    }

    public static boolean isAccsSessionCreateForbiddenInBg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f838a158", new Object[0])).booleanValue();
        }
        return isAccsSessionCreateForbiddenInBg;
    }

    public static boolean isAllowAccessPoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f20ced8", new Object[0])).booleanValue();
        }
        if (isAccessPointStatus && accessPointWhiteList != null) {
            for (Map.Entry<String, List<String>> entry : accessPointWhiteList.entrySet()) {
                List<String> value = entry.getValue();
                if (value == null || value.isEmpty()) {
                    new ArrayList().add("0");
                    return true;
                } else if ("0".equalsIgnoreCase(value.get(0))) {
                    return true;
                }
            }
            isAccessPointStatus = false;
        }
        return false;
    }

    public static boolean isAllowComplexConnect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c828a20e", new Object[]{str})).booleanValue();
        }
        return isHostInArrayListAllMatch(str, complexConnectWhiteList);
    }

    public static boolean isAllowConvertIPv4ToIPv6() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99f587a6", new Object[0])).booleanValue();
        }
        return isAllowConvertIPv4ToIPv6;
    }

    public static boolean isAllowCookieOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74446057", new Object[0])).booleanValue();
        }
        if (cookieRetryTime == -1 || !GlobalAppRuntimeInfo.isNotPhone()) {
            return false;
        }
        return true;
    }

    public static boolean isAllowForceAmdcEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71d89a5", new Object[0])).booleanValue();
        }
        return isAllowForceAmdcEnable;
    }

    public static boolean isAllowForceFgAmdcEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e0869c6", new Object[0])).booleanValue();
        }
        return isAllowForceFgAmdcEnable;
    }

    public static boolean isAllowHttpDetect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39808dff", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, httpDetectWhiteList);
    }

    public static boolean isAllowHttpDnsNotify(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7a86c80", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, httpDnsNotifyWhiteList);
    }

    public static boolean isAllowNetFullLowLatencyEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a76cb65", new Object[0])).booleanValue();
        }
        return isAllowNetFullLowLatencyEnable;
    }

    public static boolean isAllowNoCookieList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af53fcb7", new Object[]{str})).booleanValue();
        }
        return isUrlInArrayList(str, allowNoCookieList);
    }

    public static boolean isAllowRetryUseLongLinkEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b86d582", new Object[0])).booleanValue();
        }
        if (!isAllowRetryUseLongLinkEnable || !isStrategyOptABEnable) {
            return false;
        }
        return true;
    }

    public static boolean isAllowUsePreSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51c2d1b0", new Object[]{str})).booleanValue();
        }
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (usePreSessionMap == null) {
            usePreSessionMap = new ConcurrentHashMap<>();
        }
        if (!usePreSessionMap.containsKey(str)) {
            usePreSessionMap.put(str, -1);
            return true;
        } else if (usePreSessionMap.get(str).intValue() == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAmdcLimitEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("468e7ff4", new Object[0])).booleanValue();
        }
        return isAmdcLimitEnable;
    }

    public static boolean isAmdcLocationRetryEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0c1ef2c", new Object[0])).booleanValue();
        }
        return isAmdcLocationRetryEnable;
    }

    public static boolean isAmdcPriorityUpdateEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cfd0310", new Object[0])).booleanValue();
        }
        return isAmdcPriorityUpdateEnable;
    }

    public static boolean isAmdcStrategyOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cf927f9", new Object[0])).booleanValue();
        }
        return isAmdcStrategyOptEnable;
    }

    public static boolean isAmdcStrategyUpdateEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cecaedf", new Object[0])).booleanValue();
        }
        return isAmdcStrategyUpdateEnable;
    }

    public static boolean isAsyncIpStackDetect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("234fb0dd", new Object[0])).booleanValue();
        }
        return isAsyncIpStackDetect;
    }

    public static boolean isAsyncLoadStrategyEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("112ce9f9", new Object[0])).booleanValue();
        }
        return isAsyncLoadStrategyEnable;
    }

    public static boolean isBgNotForceCellOptOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b08147fe", new Object[0])).booleanValue();
        }
        return isBgNotForceCellOptOpened;
    }

    public static boolean isBgSocketEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11257190", new Object[0])).booleanValue();
        }
        return isBgSocketEnable;
    }

    public static boolean isCancelHardExpiryEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d799bf90", new Object[0])).booleanValue();
        }
        return isCancelHardExpiryEnable && isStrategyOptABEnable;
    }

    public static boolean isComplexConnectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15628d92", new Object[0])).booleanValue();
        }
        return isComplexConnectEnable;
    }

    public static boolean isCookieHeaderRedundantFix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8c96eee", new Object[0])).booleanValue();
        }
        return isCookieHeaderRedundantFix;
    }

    public static boolean isCookieOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7c72613", new Object[0])).booleanValue();
        }
        return isCookieOptEnable;
    }

    public static boolean isDecompressOpend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d90f9b8", new Object[0])).booleanValue();
        }
        return isDecompressOpened;
    }

    public static boolean isDetectCenterEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebaa1550", new Object[0])).booleanValue();
        }
        return isDetectCenterEnable;
    }

    public static boolean isDnsOptWhiteList(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43cca951", new Object[]{uri})).booleanValue();
        }
        ArrayList<DnsNavConfigTask> arrayList = dnsNavTasksList;
        if (!(arrayList == null || arrayList.isEmpty() || uri == null)) {
            Iterator<DnsNavConfigTask> it = arrayList.iterator();
            while (it.hasNext()) {
                DnsNavConfigTask next = it.next();
                if (isMatchUrl(uri.toString(), uri.getPath(), uri.getHost(), next.getMatchKey(), next.getMatchType())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDownloaderAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51e1c7c8", new Object[0])).booleanValue();
        }
        return isDownloadAsyncSwitch;
    }

    public static boolean isEagainOptimizeEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c77b3810", new Object[0])).booleanValue();
        }
        return isEagainOptimizeEnable;
    }

    public static boolean isFixWriteStreamErrorEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5668962", new Object[0])).booleanValue();
        }
        return isFixWriteStreamErrorEnable;
    }

    public static boolean isGzipDecompressOpend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92aaaafe", new Object[0])).booleanValue();
        }
        return isGzipDecompressOpend;
    }

    public static boolean isH3DetectStrategyFilterEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a442271", new Object[0])).booleanValue();
        }
        if (!isH3DetectStrategyFilterEnable || !isLaunchStrategyABEnable) {
            return false;
        }
        return true;
    }

    public static boolean isHandoverSignalOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d1b6869", new Object[0])).booleanValue();
        }
        return isHandoverSignalOpened;
    }

    public static boolean isHeaderIgnoreCaseEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("130bf547", new Object[0])).booleanValue();
        }
        return isHeaderIgnoreCaseEnable;
    }

    public static boolean isHorseRaceEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("578e8df2", new Object[0])).booleanValue();
        }
        return isHorseRaceEnable;
    }

    public static boolean isHostIn0RttHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb7348a", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, http3_0RttWhiteList);
    }

    public static boolean isHostIn1RttHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d52569", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, http3_1RttWhiteList);
    }

    public static boolean isHostInAcceptEncodeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d0b8367", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, acceptEncodeWhiteList);
    }

    public static boolean isHostInAllowRetryUseLongLinkWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4192b055", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, allowRetryUseLongLinkWhiteList);
    }

    public static boolean isHostInArrayList(String str, CopyOnWriteArrayList<String> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70496b30", new Object[]{str, copyOnWriteArrayList})).booleanValue();
        }
        if (str == null || TextUtils.isEmpty(str) || copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.contains(str);
    }

    public static boolean isHostInArrayListAllMatch(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ce104ea", new Object[]{str, list})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        if (list.contains("*") || list.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean isHostInBWEstimatorList(String str, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4dabc71", new Object[]{str, str2})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            ALog.e(TAG, "[isHostInBWEstimatorList] error", null, th, new Object[0]);
        }
        if (!(sceneBWEstimatorListList == null || sceneBWEstimatorListList.isEmpty() || str == null || str2 == null || (list = sceneBWEstimatorListList.get(str2)) == null || list.size() < 1)) {
            for (int i = 1; i < list.size(); i++) {
                if (str.equalsIgnoreCase(list.get(i))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean isHostInCookiePrintLogWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c36d32ea", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, cookiePrintLogWhiteList);
    }

    public static boolean isHostInDetectHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33ac1e5a", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, detectHostWhiteList);
    }

    public static boolean isHostInHttp3BlackList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d6c813e", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, http3BlackList);
    }

    public static boolean isHostInHttp3DefaultWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad61628f", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, http3DefaultWhiteList);
    }

    public static boolean isHostInHttp3DisabledWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32fecc", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, http3DisabledWhiteList);
    }

    public static boolean isHostInHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("124c7ce8", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, http3WhiteList);
    }

    public static boolean isHostInLongAmdcWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea8c0dbe", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, longAmdcWhiteList);
    }

    public static boolean isHostInMtopAmdcWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40ae2f2", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, mtopAmdcWhiteList);
    }

    public static boolean isHostInMtuWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f710a745", new Object[]{str})).booleanValue();
        }
        return isPrefixInArrayList(str, mtuWhiteList);
    }

    public static boolean isHostInMultiConnectWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c5d9cd4", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, multiConnectWhiteList);
    }

    public static boolean isHostInStrategyTimelyUpdateHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("693ad6c7", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, strategyTimelyUpdateHostWhiteList);
    }

    public static boolean isHostInUplinkEncodeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b86cf1b2", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, uplinkEncodeHostWhiteList);
    }

    public static boolean isHostInVpnProxySessionWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79654757", new Object[]{str})).booleanValue();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(HttpDispatcher.getInstance().getInitHosts());
        if (isHostInArrayList(str, vpnProxySessionWhiteList) || isHostInArrayList(str, copyOnWriteArrayList)) {
            return true;
        }
        return false;
    }

    public static boolean isHostInWifiFgForceCellWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b605e7c", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, wifiFgForceCellWhiteList);
    }

    public static boolean isHttp3DefaultEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2f5260e", new Object[0])).booleanValue();
        }
        return isHttp3DefaultEnable;
    }

    public static boolean isHttp3Enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa6ed0f", new Object[0])).booleanValue();
        }
        return isHttp3Enable;
    }

    public static boolean isHttp3NetworkChangeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78defc9f", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, http3NetworkChangeWhiteList);
    }

    public static boolean isHttp3PreHostEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35991638", new Object[0])).booleanValue();
        }
        return isHttp3PreHostEnable;
    }

    public static boolean isHttp3ReconnectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9c46be4", new Object[0])).booleanValue();
        }
        return isHttp3ReconnectEnable;
    }

    public static boolean isHttp3VipBlackList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("463591b6", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, http3VipBlackList);
    }

    public static boolean isHttpDetectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b220c883", new Object[0])).booleanValue();
        }
        return isHttpDetectEnable;
    }

    public static boolean isHttpsSniEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d9283b", new Object[0])).booleanValue();
        }
        return isHttpsSniEnable;
    }

    public static boolean isInHarmonyWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a0a8aa5", new Object[]{str})).booleanValue();
        }
        return isHostInArrayListAllMatch(str, multiPathHarmonyWhiteList);
    }

    public static boolean isInOkhttpWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c86f009", new Object[]{str})).booleanValue();
        }
        return isHostInArrayListAllMatch(str, okhttpHostWhiteList);
    }

    public static boolean isIpv6DetectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5c08fe2", new Object[0])).booleanValue();
        }
        return isIpv6DetectEnable;
    }

    public static boolean isIpv6DetectOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43dca7cd", new Object[0])).booleanValue();
        }
        return isIpv6DetectOptEnable;
    }

    public static boolean isIpv6DowngradeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92fff9d8", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, ipv6DowngradeWhiteList);
    }

    public static boolean isIpv6Enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fae0d9f", new Object[0])).booleanValue();
        }
        return ipv6Enable;
    }

    public static boolean isIpv6OnlyEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60ba71eb", new Object[0])).booleanValue();
        }
        return isIpv6OnlyEnable;
    }

    public static boolean isIpv6RectificationEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76f17fb7", new Object[0])).booleanValue();
        }
        return isIpv6RectificationEnable;
    }

    public static boolean isLastStatusNoneOpt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fafb514", new Object[0])).booleanValue();
        }
        return isLastStatusNoneOpt;
    }

    public static boolean isLaunchOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65efe524", new Object[0])).booleanValue();
        }
        return isLaunchOptEnable;
    }

    public static boolean isLaunchOptOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27a6a50a", new Object[0])).booleanValue();
        }
        return isLaunchOptOpened;
    }

    public static boolean isLaunchOptV1Opened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6862465", new Object[0])).booleanValue();
        }
        return isLaunchOptV1Opened;
    }

    public static boolean isLaunchOptV2Opened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b6ad726", new Object[0])).booleanValue();
        }
        return isLaunchOptV2Opened;
    }

    public static boolean isMPQuicEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e68a2f19", new Object[0])).booleanValue();
        }
        return isMPQuicConfigSwitch && isMPQuicUserSwitch;
    }

    public static boolean isMPQuicUserSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f08f5", new Object[0])).booleanValue();
        }
        return isMPQuicUserSwitch;
    }

    public static boolean isMTUConnectOptimize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ea4f62e", new Object[0])).booleanValue();
        }
        return isMTUConnectOptimize;
    }

    public static boolean isMTUConnectUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5ff9f9a", new Object[0])).booleanValue();
        }
        return isMTUConnectUpdate;
    }

    public static boolean isMTUDetectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("866115d5", new Object[0])).booleanValue();
        }
        return isMTUDetectEnable;
    }

    public static boolean isMTUWifiOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8e858c8", new Object[0])).booleanValue();
        }
        return isMTUWifiOptEnable;
    }

    public static boolean isMultiConnectOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3afa2a8f", new Object[0])).booleanValue();
        }
        return isMultiConnectOpened;
    }

    public static boolean isMultiPathMonitorEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a95bcf4", new Object[0])).booleanValue();
        }
        return isMultiPathMonitorEnable;
    }

    public static boolean isNetworkDetectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("122fa155", new Object[0])).booleanValue();
        }
        return isNetworkDetectEnable;
    }

    public static boolean isNetworkInfoEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e49aea0", new Object[0])).booleanValue();
        }
        return isNetworkInfoEnable;
    }

    public static boolean isNotAllowCookieOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a442e998", new Object[0])).booleanValue();
        }
        return isNotAllowCookieOpened;
    }

    public static boolean isOkHttpEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c2317c", new Object[0])).booleanValue();
        }
        return isOkHttpEnable;
    }

    public static boolean isPreHostMccNotUseEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aba60ee", new Object[0])).booleanValue();
        }
        return isPreHostMccNotUseEnable;
    }

    public static boolean isPreSessionOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23151b64", new Object[0])).booleanValue();
        }
        return isPreSessionOptEnable;
    }

    public static boolean isPreSessionWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c43830bf", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, preSessionWhiteList);
    }

    public static boolean isPrefixInArrayList(String str, CopyOnWriteArrayList<String> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b22c9e9a", new Object[]{str, copyOnWriteArrayList})).booleanValue();
        }
        if (str != null && !TextUtils.isEmpty(str) && copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<String> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPrefixUrlInArrayList(String str, ConcurrentHashMap<String, List<String>> concurrentHashMap, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdfa906e", new Object[]{str, concurrentHashMap, str2})).booleanValue();
        }
        if (!(str == null || TextUtils.isEmpty(str) || concurrentHashMap == null || str2 == null || (list = concurrentHashMap.get(str2)) == null || list.isEmpty())) {
            for (String str3 : list) {
                if (str.startsWith(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isProcessNameUpdateEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5b49c67", new Object[0])).booleanValue();
        }
        return isProcessNameUpdateEnable;
    }

    public static boolean isQosBizWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c023f214", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, qosBizWhiteList);
    }

    public static boolean isQosHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b89d6069", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, qosHostWhiteList);
    }

    public static boolean isRTTDetectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a0b2099", new Object[0])).booleanValue();
        }
        return isRTTDetectEnable;
    }

    public static boolean isRemoteCriticalPlan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82642e23", new Object[0])).booleanValue();
        }
        return isRemoteCriticalPlan;
    }

    public static boolean isReplaceStrategyOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a463c11", new Object[0])).booleanValue();
        }
        return isReplaceStrategyOpened;
    }

    public static boolean isReqConfigEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dd6aca4", new Object[0])).booleanValue();
        }
        return isReqConfigEnable;
    }

    public static boolean isReqFecSizeOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43e90b30", new Object[0])).booleanValue();
        }
        return isReqFecSizeOptEnable;
    }

    public static boolean isReqForceCellEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ec29fa7", new Object[0])).booleanValue();
        }
        return isReqForceCellEnable;
    }

    public static boolean isSendConnectInfoByService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4820003", new Object[0])).booleanValue();
        }
        return isSendConnectInfoByService;
    }

    public static boolean isSessionOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cbc50f5", new Object[0])).booleanValue();
        }
        return isSessionOptEnable;
    }

    public static boolean isSessionReuseOptimized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc29634a", new Object[0])).booleanValue();
        }
        return isSessionReuseOptimized;
    }

    public static boolean isShortLinkConnectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("637705ec", new Object[0])).booleanValue();
        }
        return isShortLinkConnectEnable;
    }

    public static boolean isSmoothReconnectEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("580224ad", new Object[0])).booleanValue();
        }
        return isSmoothReconnectEnable;
    }

    public static boolean isSmoothReconnectOptOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3559b08", new Object[0])).booleanValue();
        }
        return isSmoothReconnectOptOpened;
    }

    public static boolean isSocketBoostHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dda8ab43", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, socketBoostHostWhiteList);
    }

    public static boolean isSpdyOfflineEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bbebe35", new Object[0])).booleanValue();
        }
        return isSpdyOfflineEnable;
    }

    public static boolean isSslSpOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d09b8b62", new Object[0])).booleanValue();
        }
        return isSslSpOptEnable;
    }

    public static boolean isStackUnknownBuildStrategyEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a30182e3", new Object[0])).booleanValue();
        }
        if (!isStackUnknownBuildStrategyEnable || !isLaunchStrategyABEnable) {
            return false;
        }
        return true;
    }

    public static boolean isStrategyCompareEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97665616", new Object[0])).booleanValue();
        }
        return isStrategyCompareEnable;
    }

    public static boolean isStrategyRetryEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d9ff8d9", new Object[0])).booleanValue();
        }
        if (!isStrategyRetryEnable || !isLaunchStrategyABEnable) {
            return false;
        }
        return true;
    }

    public static boolean isStrategyTimelyUpdateEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8cea8e", new Object[0])).booleanValue();
        }
        if (!isStrategyTimelyUpdateEnable || !isLaunchStrategyABEnable) {
            return false;
        }
        return true;
    }

    public static boolean isSupportQoS(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7292bb05", new Object[]{str})).booleanValue();
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = qosReferList;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty() || str == null) {
            return false;
        }
        return qosReferList.contains(str);
    }

    public static boolean isSupportSetWaitTimeoutOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b626ece3", new Object[0])).booleanValue();
        }
        return isSupportSetWaitTimeout;
    }

    public static boolean isSupportStreamingParserList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("646d7eef", new Object[]{str})).booleanValue();
        }
        return isUrlInArrayList(str, supportStreamingParserList);
    }

    public static boolean isTbNextLaunch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db7ce969", new Object[0])).booleanValue();
        }
        return isTbNextLaunch;
    }

    public static boolean isTicketStoreUpgrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a192edfc", new Object[0])).booleanValue();
        }
        return isTicketStoreUpgrade;
    }

    public static boolean isTnetForcePubKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b48ce985", new Object[0])).booleanValue();
        }
        return isTnetForcePubKey;
    }

    public static boolean isTunnelEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c0bf860", new Object[0])).booleanValue();
        }
        return isTunnelEnable;
    }

    public static boolean isUniqueIdEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17aaf544", new Object[0])).booleanValue();
        }
        return isUniqueIdEnable;
    }

    public static boolean isUplinkEncodeOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4307829", new Object[0])).booleanValue();
        }
        return isUplinkEncodeOpened;
    }

    public static boolean isUplinkEncodeUpdateOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5738a12", new Object[0])).booleanValue();
        }
        return isUplinkEncodeUpdateOpened;
    }

    public static boolean isUrlInLowLatencyWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95fc688", new Object[]{str})).booleanValue();
        }
        return isPrefixUrlInArrayList(str, allowFullLowLatencyUrlWhiteList, "url");
    }

    public static boolean isUrlInMonitorRequestList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13984e72", new Object[]{str})).booleanValue();
        }
        return isUrlInArrayList(str, urlMonitorRequestList);
    }

    public static boolean isUrlInReqForceCellWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6783b83", new Object[]{str})).booleanValue();
        }
        return isPrefixInArrayList(str, reqForceCellWhiteList);
    }

    public static boolean isVpnChangeDetectOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c9e5751", new Object[0])).booleanValue();
        }
        return isVpnChangeDetectOpened;
    }

    public static boolean isVpnDetectRacingOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98ee5b2f", new Object[0])).booleanValue();
        }
        return isVpnDetectRacingOpened;
    }

    public static boolean isVpnFastDegradeABEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d77a99bf", new Object[0])).booleanValue();
        }
        return isVpnFastDegradeABEnable;
    }

    public static boolean isVpnFastDegradeEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9e252de", new Object[0])).booleanValue();
        }
        return isVpnFastDegradeEnable;
    }

    public static boolean isVpnOptOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1987483d", new Object[0])).booleanValue();
        }
        return isVpnOptOpened;
    }

    public static boolean isWifiDetectOptOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2500bc5", new Object[0])).booleanValue();
        }
        return isWifiDetectOptOpened;
    }

    public static boolean isWifiUnavailableUseCellOptOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b684b8f", new Object[0])).booleanValue();
        }
        return isWifiUnavailableUseCellOptOpened && "com.taobao.taobao".equalsIgnoreCase(GlobalAppRuntimeInfo.getCurrentProcess());
    }

    public static boolean isXquicRemoteEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acae2540", new Object[0])).booleanValue();
        }
        return isXquicRemoteEnable;
    }

    public static boolean isZstdDictDecompressChannelEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b7ae985", new Object[0])).booleanValue();
        }
        if (GlobalAppRuntimeInfo.isChannelProcess(GlobalAppRuntimeInfo.getContext())) {
            return isZstdDictDecompressChannelEnable;
        }
        return true;
    }

    public static boolean isZstdDictDecompressMtopEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ec8162", new Object[0])).booleanValue();
        }
        return isZstdDictDecompressMtopEnable;
    }

    public static boolean isZstdDictDecompressOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("856c0760", new Object[0])).booleanValue();
        }
        return isZstdDictDecompressOpened;
    }

    public static boolean isZstdDictDecompressWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f14c50", new Object[]{str})).booleanValue();
        }
        return isPrefixInArrayList(str, zstdDictDecompressWhiteList);
    }

    public static boolean isZstdStreamDecompressOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956d196a", new Object[0])).booleanValue();
        }
        return isZstdStreamDecompressOpened;
    }

    public static void set0RttHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c58331", new Object[]{str});
        } else {
            http3_0RttWhiteList = setArrayList(str);
        }
    }

    public static void set1RttHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be37410", new Object[]{str});
        } else {
            http3_1RttWhiteList = setArrayList(str);
        }
    }

    public static void setAcceptEncodeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecfee10", new Object[]{str});
        } else {
            acceptEncodeWhiteList = setArrayList(str);
        }
    }

    public static void setAccessPointOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4691cd3a", new Object[]{new Boolean(z)});
        } else {
            isAccessPointOpened = setConfigSpOpenBool(z, NETWORK_ACCESS_POINT_ENABLE);
        }
    }

    public static void setAccsReconnectionDelayPeriod(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcb609dd", new Object[]{new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i > 600000) {
            i = 600000;
        }
        accsReconnectionDelayPeriod = i;
    }

    public static void setAccsSessionCreateForbiddenInBg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9881c8", new Object[]{new Boolean(z)});
        } else {
            isAccsSessionCreateForbiddenInBg = z;
        }
    }

    public static void setAllowForceAmdcEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670fbd1b", new Object[]{new Boolean(z)});
        } else {
            isAllowForceAmdcEnable = setCoreConfigSpOpenBool(z, NETWORK_ALLOW_FORCE_AMDC_ENABLE);
        }
    }

    public static void setAllowForceFgAmdcEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c280f1a", new Object[]{new Boolean(z)});
        } else {
            isAllowForceFgAmdcEnable = setCoreConfigSpOpenBool(z, NETWORK_FG_AMDC_ENABLE);
        }
    }

    public static void setAllowFullLowLatencyUrlWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b5ab49", new Object[]{str});
        } else {
            allowFullLowLatencyUrlWhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setAllowNetFullLowLatencyEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be866b5b", new Object[]{new Boolean(z)});
        } else {
            isAllowNetFullLowLatencyEnable = setConfigSpOpenBool(z, NETWORK_ALLOW_NET_FULL_LOW_LATENCY_ENABLE);
        }
    }

    public static void setAllowNoCookieList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26681e7b", new Object[]{str});
        } else {
            allowNoCookieList = setArrayList(str);
        }
    }

    public static void setAllowRetryUseLongLinkWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d021567c", new Object[]{str});
        } else {
            allowRetryUseLongLinkWhiteList = setArrayList(str);
        }
    }

    public static void setAmdcLightTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa01d287", new Object[]{new Long(j)});
        } else {
            amdcLightTime = j;
        }
    }

    public static void setAmdcLimitEnable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cf8182", new Object[]{str});
            return;
        }
        try {
            CopyOnWriteArrayList<String> arrayList = setArrayList(str);
            if (arrayList != null && arrayList.size() == 2) {
                isAmdcLimitEnable = Boolean.parseBoolean(arrayList.get(0));
                amdcLimitRate = Double.parseDouble(arrayList.get(1));
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[setAmdcLimitEnable] error", null, th, new Object[0]);
            isAmdcLimitEnable = false;
            amdcLimitRate = 0.5d;
        }
    }

    public static void setAmdcLocationRetryEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2abd3e4", new Object[]{new Boolean(z)});
        } else {
            isAmdcLocationRetryEnable = setConfigSpOpenBool(z, NETWORK_AMDC_LOCATION_RETRY_ENABLE);
        }
    }

    public static void setAmdcParcelableABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c74cb9", new Object[]{new Boolean(z)});
        } else {
            isAmdcParcelableABEnable = z;
        }
    }

    public static void setAmdcParcelableOrangeEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2118c6c", new Object[]{new Boolean(z)});
        } else {
            isAmdcParcelableOrangeEnable = setCoreConfigSpOpenBool(z, NETWORK_AMDC_PARCELBALE_ENABLE);
        }
    }

    public static void setAmdcPriorityUpdateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d5a4d10", new Object[]{new Boolean(z)});
        } else {
            isAmdcPriorityUpdateEnable = setConfigSpOpenBool(z, NETWORK_PRIORITY_UPDATE_AMDC_ENABLE);
        }
    }

    public static void setAmdcStrategyOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871d22b7", new Object[]{new Boolean(z)});
        } else {
            isAmdcStrategyOptEnable = setCoreConfigSpOpenBool(z, NETWORK_AMDC_STRATEGY_OPT_ENABLE);
        }
    }

    public static void setAmdcStrategyUpdateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb601b21", new Object[]{new Boolean(z)});
        } else {
            isAmdcStrategyUpdateEnable = setCoreConfigSpOpenBool(z, NETWORK_AMDC_STRATEGY_UPDATE_ENABLE);
        }
    }

    public static void setAmdcTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989a4c68", new Object[]{new Integer(i)});
        } else {
            amdcTimeout = i;
        }
    }

    private static CopyOnWriteArrayList<String> setArrayListCheckIp(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("489db548", new Object[]{jSONArray});
        }
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (Utils.checkHostValidAndNotIp(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            return copyOnWriteArrayList;
        } catch (Exception e) {
            ALog.e(TAG, "[setArrayListCheckIp] error", null, e, new Object[0]);
            return null;
        }
    }

    public static void setAsyncLoadStrategyEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa032b7", new Object[]{new Boolean(z)});
        } else {
            isAsyncLoadStrategyEnable = z;
        }
    }

    public static void setBgNotForceCellOptOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead79552", new Object[]{new Boolean(z)});
        } else {
            isBgNotForceCellOptOpened = setConfigSpOpenBool(z, NETWORK_BG_NOT_FORCE_CELL_OPT_ENABLE);
        }
    }

    public static void setBgSocketEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36da4890", new Object[]{new Boolean(z)});
        } else {
            isBgSocketEnable = setCoreConfigSpOpenBool(z, NETWORK_BG_SOCKET_ENABLE);
        }
    }

    public static void setCell4GBandwidthQualityCoeff(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2769c3", new Object[]{new Double(d)});
        } else {
            cell4GBandwidthQualityCoeff = d;
        }
    }

    public static void setCell5GBandwidthQualityCoeff(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df87122", new Object[]{new Double(d)});
        } else {
            cell5GBandwidthQualityCoeff = d;
        }
    }

    public static void setChannelAmdcTtl(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5745c5d", new Object[]{new Long(j)});
        } else {
            channelAmdcTtl = j;
        }
    }

    public static void setComplexConnectDelayTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bfdb869", new Object[]{new Long(j)});
        } else {
            complexConnectDelayTime = j;
        }
    }

    public static void setComplexConnectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16b36ce", new Object[]{new Boolean(z)});
        } else {
            isComplexConnectEnable = z;
        }
    }

    public static void setComplexConnectWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378af0fc", new Object[]{str});
        } else {
            complexConnectWhiteList = setArrayList(str);
        }
    }

    public static void setCookieHeaderRedundantFix(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1b5cf2", new Object[]{new Boolean(z)});
        } else {
            isCookieHeaderRedundantFix = z;
        }
    }

    public static void setCookieOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e831dd", new Object[]{new Boolean(z)});
        } else {
            isCookieOptEnable = setCoreConfigSpOpenBool(z, NETWORK_COOKIE_OPT_ENABLE);
        }
    }

    public static void setCookiePrintLogHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe93ad3", new Object[]{str});
        } else {
            cookiePrintLogWhiteList = setArrayList(str);
        }
    }

    public static void setDecompressOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310bfa3f", new Object[]{new Boolean(z)});
        } else {
            isDecompressOpened = setConfigSpOpenBool(z, NETWORK_DECOMPRESS_ENABLE);
        }
    }

    public static void setDetectCenterEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4979f8d0", new Object[]{new Boolean(z)});
        } else {
            isDetectCenterEnable = z;
        }
    }

    public static void setDetectHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff67a50b", new Object[]{str});
        } else {
            detectHostWhiteList = setArrayList(str);
        }
    }

    public static void setDoublePathsSlipdownCoeff(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d108fb", new Object[]{new Double(d)});
        } else {
            doublePathsSlipdownCoeff = d;
        }
    }

    public static void setEagainOptimizeEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7267dc10", new Object[]{new Boolean(z)});
        } else {
            isEagainOptimizeEnable = z;
        }
    }

    public static void setExceptionDetectUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b88d90", new Object[]{str});
        } else {
            exceptionDetectUrlList = setArrayList(str);
        }
    }

    public static void setFgSendAmdcIntervalTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa7e095", new Object[]{new Long(j)});
        } else {
            fgSendAmdcIntervalTime = setCoreConfigSpOpenLong(j, FG_SEND_AMDC_INTERVAL_TIME);
        }
    }

    public static void setFragmentFileLengthThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648a08a6", new Object[]{new Long(j)});
        } else {
            fragmentFileLengthThreshold = j;
        }
    }

    public static void setFragmentSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8671e70a", new Object[]{new Long(j)});
        } else {
            fragmentSize = j;
        }
    }

    public static void setGzipDecompressOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e874e05", new Object[]{new Boolean(z)});
        } else {
            isGzipDecompressOpend = setConfigSpOpenBool(z, NETWORK_GZIP_DECOMPRESS_ENABLE);
        }
    }

    public static void setH3DetectStrategyFilterEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c863f5cf", new Object[]{new Boolean(z)});
        } else {
            isH3DetectStrategyFilterEnable = setCoreConfigSpOpenBool(z, NETWORK_H3_STRATEGY_FILTER_ENABLE);
        }
    }

    public static void setHandoverSignalOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cdb6d7", new Object[]{new Boolean(z)});
        } else {
            isHandoverSignalOpened = setConfigSpOpenBool(z, NETWORK_HANDOVER_SIGNAL_ENABLE);
        }
    }

    public static void setHarmonyWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed3e4d4", new Object[]{str});
        } else {
            multiPathHarmonyWhiteList = setArrayList(str);
        }
    }

    private static ConcurrentHashMap<String, Integer> setHashMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("1c497109", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    concurrentHashMap.put(string, Integer.valueOf(i));
                }
            }
            return concurrentHashMap;
        } catch (Exception e) {
            ALog.e(TAG, "[setHashMap] error", null, e, new Object[0]);
            return null;
        }
    }

    public static void setHeaderIgnoreCaseEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e795f3b9", new Object[]{new Boolean(z)});
        } else {
            isHeaderIgnoreCaseEnable = setConfigSpOpenBool(z, NETWORK_HEADER_IGNORE_CASE_ENABLE);
        }
    }

    public static void setHorseRaceEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10dc5de", new Object[]{new Boolean(z)});
        } else {
            isHorseRaceEnable = z;
        }
    }

    public static void setHttp3BlackList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9faadd65", new Object[]{str});
        } else {
            http3BlackList = setArrayList(str);
        }
    }

    public static void setHttp3DefaultEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b90ffd2", new Object[]{new Boolean(z)});
        } else {
            isHttp3DefaultEnable = z;
        }
    }

    public static void setHttp3Enable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec23a661", new Object[]{new Boolean(z)});
        } else {
            isHttp3Enable = z;
        }
    }

    public static void setHttp3NetworkChangeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a98463", new Object[]{str});
        } else {
            http3NetworkChangeWhiteList = setArrayList(str);
        }
    }

    public static void setHttp3OptWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f275ce", new Object[]{str});
        } else {
            http3DefaultWhiteList = setArrayList(str);
        }
    }

    public static void setHttp3PreHostEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6b14e8", new Object[]{new Boolean(z)});
        } else {
            isHttp3PreHostEnable = setConfigSpOpenBool(z, NETWORK_HTTP3_PRE_HOST_ENABLE);
        }
    }

    public static void setHttp3ReconnectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94522bc", new Object[]{new Boolean(z)});
        } else {
            isHttp3ReconnectEnable = setConfigSpOpenBool(z, NETWORK_HTTP3_RECONNECT_ENABLE);
        }
    }

    public static void setHttp3VipBlackList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd49b37a", new Object[]{str});
        } else {
            http3VipBlackList = setArrayList(str);
        }
    }

    public static void setHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448ad90f", new Object[]{str});
        } else {
            http3WhiteList = setArrayList(str);
        }
    }

    public static void setHttpDetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246b7dfd", new Object[]{new Boolean(z)});
        } else {
            isHttpDetectEnable = z;
        }
    }

    public static void setHttpDetectWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b6caab", new Object[]{str});
        } else {
            httpDetectWhiteList = setArrayList(str);
        }
    }

    public static void setHttpDnsNotifyWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21259b0", new Object[]{str});
        } else {
            httpDnsNotifyWhiteList = setArrayList(str);
        }
    }

    public static void setHttpsSniEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca9d6745", new Object[]{new Boolean(z)});
        } else {
            isHttpsSniEnable = z;
        }
    }

    private static ConcurrentHashMap<String, Integer> setIntegerHashMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("c53d5223", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (!TextUtils.isEmpty(next)) {
                    int i = -1;
                    if (obj instanceof Integer) {
                        i = (Integer) obj;
                    }
                    concurrentHashMap.put(next, i);
                }
            }
            return concurrentHashMap;
        } catch (Throwable th) {
            ALog.e(TAG, "[setIntegerHashMap] error ", null, th, new Object[0]);
            return null;
        }
    }

    public static void setInterceptorOptType(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcef4ab3", new Object[]{new Long(j)});
        } else {
            interceptorOptType = setConfigSpOpenLong(j, NETWORK_INTERCEPTOR_OPT_TYPE);
        }
    }

    public static void setIpv6DetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c4a27e", new Object[]{new Boolean(z)});
        } else {
            isIpv6DetectEnable = z;
        }
    }

    public static void setIpv6DetectOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73ee8b63", new Object[]{new Boolean(z)});
        } else {
            isIpv6DetectOptEnable = setConfigSpOpenBool(z, NETWORK_IPV6_DETECT_OPT_OPENED);
        }
    }

    public static void setIpv6DowngradeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da1b50c", new Object[]{str});
        } else {
            ipv6DowngradeWhiteList = setArrayList(str);
        }
    }

    public static void setIpv6Enable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62875261", new Object[]{new Boolean(z)});
        } else {
            ipv6Enable = setConfigSpOpenBool(z, NETWORK_IPV6_ENABLE);
        }
    }

    public static void setIpv6OnlyEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e55395", new Object[]{new Boolean(z)});
        } else {
            isIpv6OnlyEnable = z;
        }
    }

    public static void setIpv6RectificationEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26e54b9", new Object[]{new Boolean(z)});
        } else {
            isIpv6RectificationEnable = z;
        }
    }

    public static void setIsAllowConvertIPv4ToIPv6(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36810630", new Object[]{new Boolean(z)});
        } else {
            isAllowConvertIPv4ToIPv6 = z;
        }
    }

    public static void setLastStatusNoneOpt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922594fc", new Object[]{new Boolean(z)});
        } else {
            isLastStatusNoneOpt = setConfigSpOpenBool(z, NETWORK_LAST_STATUS_NONE_ENABLE);
        }
    }

    public static void setLaunchOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed754ec", new Object[]{new Boolean(z)});
        } else {
            isLaunchOptEnable = setCoreConfigSpOpenBool(z, NETWORK_LAUNCH_OPT_ENABLE);
        }
    }

    public static void setLaunchStrategyABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a75c61", new Object[]{new Boolean(z)});
        } else {
            isLaunchStrategyABEnable = z;
        }
    }

    public static void setLazyLoadTnetSecTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47eaf784", new Object[]{new Long(j)});
        } else {
            lazyLoadTnetSecTime = j;
        }
    }

    public static void setLongAmdcWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d173bdaf", new Object[]{str});
        } else {
            longAmdcWhiteList = setArrayList(str);
        }
    }

    public static void setMPQuicConfigSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10d3a0b4", new Object[]{new Boolean(z)});
        } else {
            isMPQuicConfigSwitch = z;
        }
    }

    public static void setMPQuicUserSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e54bcb", new Object[]{new Boolean(z)});
        } else {
            isMPQuicUserSwitch = z;
        }
    }

    public static void setMTUConnectOptimize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15db33b2", new Object[]{new Boolean(z)});
        } else {
            isMTUConnectOptimize = z;
        }
    }

    public static void setMTUConnectUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6789c6", new Object[]{new Boolean(z)});
        } else {
            isMTUConnectUpdate = setCoreConfigSpOpenBool(z, NETWORK_MTU_CONNECT_UPDATE_ENABLE);
        }
    }

    public static void setMTUDetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8c3a5b", new Object[]{new Boolean(z)});
        } else {
            isMTUDetectEnable = z;
        }
    }

    public static void setMTUWifiOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b695f658", new Object[]{new Boolean(z)});
        } else {
            isMTUWifiOptEnable = setConfigSpOpenBool(z, NETWORK_MTU_WIFI_OPT_ENABLE);
        }
    }

    public static void setMtopAmdcWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf292e3", new Object[]{str});
        } else {
            mtopAmdcWhiteList = setArrayList(str);
        }
    }

    public static void setMtopInterceptorWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa3a1bd", new Object[]{str});
        } else {
            mtopInterceptorWhiteList = setHashMap(str);
        }
    }

    public static void setMtuWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efe122c", new Object[]{str});
        } else {
            mtuWhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setMultiConnectOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42c8b71", new Object[]{new Boolean(z)});
        } else {
            isMultiConnectOpened = setConfigSpOpenBool(z, NETWORK_MULTI_CONNECT_ENABLE);
        }
    }

    public static void setMultiConnectWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57524a45", new Object[]{str});
        } else {
            multiConnectWhiteList = setArrayList(str);
        }
    }

    public static void setMultiNetworkMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae8a4667", new Object[]{new Boolean(z)});
        } else {
            isMultiPathMonitorEnable = z;
        }
    }

    public static void setMultiPathToastTireTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8eb71c", new Object[]{new Integer(i)});
        } else if (i >= 0) {
            multiPathToastTireTime = i;
        }
    }

    public static void setMultiPathUserToastText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433d5de", new Object[]{str});
        } else {
            multiPathUserToastText = str;
        }
    }

    public static void setNetworkDetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffac2db", new Object[]{new Boolean(z)});
        } else {
            isNetworkDetectEnable = z;
        }
    }

    public static void setNetworkInfoEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76caccf0", new Object[]{new Boolean(z)});
        } else {
            isNetworkInfoEnable = setCoreConfigSpOpenBool(z, NETWORK_INFO_ENABLE);
        }
    }

    public static void setNetworkMetricsTimeConfig(String str) {
        CopyOnWriteArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98aecd97", new Object[]{str});
        } else if (str != null) {
            try {
                if (!str.isEmpty() && (arrayList = setArrayList(str)) != null && arrayList.size() == 2) {
                    recentWinTime = Long.parseLong(arrayList.get(0));
                    updateMetricsTime = Long.parseLong(arrayList.get(1));
                }
            } catch (Throwable th) {
                ALog.e(TAG, "[setNetworkMetricsTimeConfig] error", null, th, new Object[0]);
                recentWinTime = 5000L;
                updateMetricsTime = 5000L;
            }
        }
    }

    public static void setNetworkQosSmoothWindowSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975c6d4", new Object[]{new Integer(i)});
        } else {
            networkQosSmoothWindowSize = i;
        }
    }

    public static void setNotAllowCookieOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e965b88", new Object[]{new Boolean(z)});
        } else {
            isNotAllowCookieOpened = setCoreConfigSpOpenBool(z, NETWORK_COOKIE_OPT_V2_OPENED);
        }
    }

    public static void setOkHttpEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b205824", new Object[]{new Boolean(z)});
        } else {
            isOkHttpEnable = z;
        }
    }

    public static void setOkhttpHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f0e3aa", new Object[]{str});
        } else {
            okhttpHostWhiteList = setArrayList(str);
        }
    }

    public static void setOkhttpPreBuildList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909088a0", new Object[]{str});
        } else {
            okhttpPreBuildList = setArrayList(str);
        }
    }

    public static void setPoorSpeedThreshold(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14bfccef", new Object[]{new Double(d)});
        } else {
            poorSpeedThreshold = d;
        }
    }

    public static void setPreHostMccNotUseEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b4fcf2", new Object[]{new Boolean(z)});
        } else {
            isPreHostMccNotUseEnable = setConfigSpOpenBool(z, NETWORK_PRE_HOST_MCC_ENABLE);
        }
    }

    public static void setPreHotOptOpened(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9b8f41", new Object[]{str});
            return;
        }
        preHotStr = setCoreConfigSpOpenString(str, NETWORK_PRE_HOT_STR);
        initPreHotStr();
    }

    public static void setPreSessionOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc48aac", new Object[]{new Boolean(z)});
        } else {
            isPreSessionOptEnable = setConfigSpOpenBool(z, NETWORK_PRE_SESSION_OPT_ENABLE);
        }
    }

    public static void setPreSessionWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cb0083", new Object[]{str});
        } else {
            preSessionWhiteList = setArrayList(str);
        }
    }

    public static void setPresetHostHttp2WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96811077", new Object[]{str});
        } else {
            presetHostHttp2WhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setPresetHostHttp3WhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb15056", new Object[]{str});
        } else {
            presetHostHttp3WhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setPresetHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6349f4f", new Object[]{str});
        } else {
            presetHostWhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setProcessNameUpdateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0ece09", new Object[]{new Boolean(z)});
        } else {
            isProcessNameUpdateEnable = setConfigSpOpenBool(z, NETWORK_PROCESS_NAME_UPDATE_ENABLE);
        }
    }

    public static void setQoSPacingABSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb039c55", new Object[]{new Boolean(z)});
        } else {
            isQoSPacingABSwitch = z;
        }
    }

    public static void setQoSQueueABSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5d87ba", new Object[]{new Boolean(z)});
        } else {
            isQoSQueueABSwitch = z;
        }
    }

    public static void setQoSRecvWndABSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827ca324", new Object[]{new Boolean(z)});
        } else {
            isQoSRecvWndABSwitch = z;
        }
    }

    public static void setQosBizWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe5e5d8", new Object[]{str});
        } else {
            qosBizWhiteList = setArrayList(str);
        }
    }

    public static void setQosConf(CopyOnWriteArrayList<String> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c1241f", new Object[]{copyOnWriteArrayList});
        } else {
            qosReferList = copyOnWriteArrayList;
        }
    }

    public static void setQosDelayUnit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f6af48", new Object[]{new Integer(i)});
        } else {
            qosDelayUnit = i;
        }
    }

    public static void setQosHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5119e59d", new Object[]{str});
        } else {
            qosHostWhiteList = setArrayList(str);
        }
    }

    public static void setQosRecvSpeed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1b6f2e", new Object[]{new Integer(i)});
        } else {
            recvBpsLimitation = i;
        }
    }

    public static void setQualityNotifyMinInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67ed44c", new Object[]{new Long(j)});
        } else {
            qualityNotifyMinInterval = j;
        }
    }

    public static void setRTTDetectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e238817", new Object[]{new Boolean(z)});
        } else {
            isRTTDetectEnable = z;
        }
    }

    public static void setRangeBoostOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a98d9b", new Object[]{new Boolean(z)});
        } else {
            rangeBoostOpen = setConfigSpOpenBool(z, NETWORK_RANGE_BOOST_OPEN);
        }
    }

    public static void setRemoteCriticalPlan(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a02fa5d", new Object[]{new Boolean(z)});
        } else {
            isRemoteCriticalPlan = setCoreConfigSpOpenBool(z, NETWORK_REMOTE_CRITICAL_PLAN_ENABLE);
        }
    }

    public static void setRepeatThreadUseVirtualThread(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d7ae78", new Object[]{new Boolean(z)});
        } else {
            isRepeatThreadUseVirtualThread = setCoreConfigSpOpenBool(z, NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE);
        }
    }

    public static void setReplaceStrategyOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2372919f", new Object[]{new Boolean(z)});
        } else {
            isReplaceStrategyOpened = setConfigSpOpenBool(z, NETWORK_REPLACE_STRATEGY_ENABLE);
        }
    }

    public static void setReqConfigEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c97d6c", new Object[]{new Boolean(z)});
        } else {
            isReqConfigEnable = setCoreConfigSpOpenBool(z, NETWORK_REQ_CONFIG_ENABLE);
        }
    }

    public static void setReqFecSizeOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756e9460", new Object[]{new Boolean(z)});
        } else {
            isReqFecSizeOptEnable = setConfigSpOpenBool(z, NETWORK_REQ_FEC_SIZE_OPT_ENABLE);
        }
    }

    public static void setReqFecSizeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de7154f", new Object[]{str});
        } else {
            reqFecSizeWhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setReqFecUpSizeWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f95ab4", new Object[]{str});
        } else {
            reqFecUpSizeWhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setReqForceCellEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5972b959", new Object[]{new Boolean(z)});
        } else {
            isReqForceCellEnable = setConfigSpOpenBool(z, NETWORK_REQ_FORCE_CELL_ENABLE);
        }
    }

    public static void setReqForceCellWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cac007", new Object[]{str});
        } else {
            reqForceCellWhiteList = setArrayList(str);
        }
    }

    public static void setRobustSpeedThreshold(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86243380", new Object[]{new Double(d)});
        } else {
            robustSpeedThreshold = d;
        }
    }

    public static void setRumParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a8d67f", new Object[]{str});
        } else {
            rumParamsMap = setArrayListAllMatch(str);
        }
    }

    public static void setSavePowerTimeInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5dbe905", new Object[]{new Long(j)});
        } else {
            savePowerTimeInterval = j;
        }
    }

    public static void setSceneBWEstimatorList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8882b0", new Object[]{str});
        } else {
            sceneBWEstimatorListList = setArrayListAllMatch(str);
        }
    }

    public static void setSendConnectInfoByService(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6674ee7d", new Object[]{new Boolean(z)});
        } else {
            isSendConnectInfoByService = z;
        }
    }

    public static void setSessionOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4103cb", new Object[]{new Boolean(z)});
        } else {
            isSessionOptEnable = setConfigSpOpenBool(z, NETWORK_SESSION_OPT_ENABLE);
        }
    }

    public static void setSessionReuseOptimized(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df45186", new Object[]{new Boolean(z)});
        } else {
            isSessionReuseOptimized = z;
        }
    }

    public static void setShortLinkConnectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48cf7b4", new Object[]{new Boolean(z)});
        } else {
            isShortLinkConnectEnable = setConfigSpOpenBool(z, NETWORK_SHORT_LINK_ENABLE);
        }
    }

    public static void setSmoothReconnectEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad33bc83", new Object[]{new Boolean(z)});
        } else {
            isSmoothReconnectEnable = setConfigSpOpenBool(z, NETWORK_SMOOTH_RECONNECT_ENABLE);
        }
    }

    public static void setSmoothReconnectOptOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6214b418", new Object[]{new Boolean(z)});
        } else {
            isSmoothReconnectOptOpened = setConfigSpOpenBool(z, NETWORK_SMOOTH_RECONNECT_OPT_OPENED);
        }
    }

    public static void setSocketBoostHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d6a9f07", new Object[]{str});
        } else {
            socketBoostHostWhiteList = setArrayList(str);
        }
    }

    public static void setSpdyOfflineEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7affb", new Object[]{new Boolean(z)});
        } else {
            isSpdyOfflineEnable = setConfigSpOpenBool(z, NETWORK_SPDY_OFFLINE_ENABLE);
        }
    }

    public static void setSslSpOptEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("662768fe", new Object[]{new Boolean(z)});
        } else {
            isSslSpOptEnable = setCoreConfigSpOpenBool(z, NETWORK_SSL_SP_OPT_ENABLE);
        }
    }

    public static void setStackUnknownBuildStrategyEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96fbff0d", new Object[]{new Boolean(z)});
        } else {
            isStackUnknownBuildStrategyEnable = setCoreConfigSpOpenBool(z, NETWORK_STACK_UNKNOWN_BUILD_STRATEGY_ENABLE);
        }
    }

    public static void setStrategyCompareEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a55b83a", new Object[]{new Boolean(z)});
        } else {
            isStrategyCompareEnable = setCoreConfigSpOpenBool(z, NETWORK_STRATEGY_COMPARE_ENABLE);
        }
    }

    public static void setStrategyOptABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0e8ceb", new Object[]{new Boolean(z)});
        } else {
            isStrategyOptABEnable = z;
        }
    }

    public static void setStrategyRetryEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2955bd7", new Object[]{new Boolean(z)});
        } else {
            isStrategyRetryEnable = setCoreConfigSpOpenBool(z, NETWORK_STRATEGY_RETRY_ENABLE);
        }
    }

    public static void setStrategyTimelyUpdateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc278352", new Object[]{new Boolean(z)});
        } else {
            isStrategyTimelyUpdateEnable = setCoreConfigSpOpenBool(z, NETWORK_STRATEGY_TIMELY_UPDATE_ENABLE);
        }
    }

    public static void setStrategyTimelyUpdateWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5407d380", new Object[]{str});
        } else {
            strategyTimelyUpdateHostWhiteList = setArrayList(str);
        }
    }

    public static void setSupportSetWaitTimeoutOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6e310d", new Object[]{new Boolean(z)});
        } else {
            isSupportSetWaitTimeout = setConfigSpOpenBool(z, NETWORK_SUPPORT_SET_WAIT_TIME_OUT_ENABLE);
        }
    }

    public static void setSupportStreamingParserList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cede23", new Object[]{str});
        } else {
            supportStreamingParserList = setArrayList(str);
        }
    }

    public static void setTbNextLaunch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fbc9dd7", new Object[]{new Boolean(z)});
        } else {
            isTbNextLaunch = z;
        }
    }

    public static void setTicketStoreUpgrade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ac35a4", new Object[]{new Boolean(z)});
        } else {
            isTicketStoreUpgrade = z;
        }
    }

    public static void setTnetForcePubKey(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23dadcab", new Object[]{new Boolean(z)});
        } else {
            isTnetForcePubKey = setConfigSpOpenBool(z, NETWORK_TNET_FORCE_PUBKEY_ENABLE);
        }
    }

    public static void setTunnelEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10f6dc0", new Object[]{new Boolean(z)});
        } else {
            isTunnelEnable = z;
        }
    }

    public static void setUniqueIdEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1053b5c", new Object[]{new Boolean(z)});
        } else {
            isUniqueIdEnable = setCoreConfigSpOpenBool(z, NETWORK_UNIQUE_ID_ENABLE);
        }
    }

    public static void setUplinkEncodeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b3dca3", new Object[]{str});
        } else {
            uplinkEncodeHostWhiteList = setArrayList(str);
        }
    }

    public static void setUplinkEncodeOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bff117", new Object[]{new Boolean(z)});
        } else {
            isUplinkEncodeOpened = setConfigSpOpenBool(z, NETWORK_UPLINK_ENCODE_ENABLE);
        }
    }

    public static void setUplinkEncodeUpdateOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b4a64e", new Object[]{new Boolean(z)});
        } else {
            isUplinkEncodeUpdateOpened = setConfigSpOpenBool(z, NETWORK_UPLINK_ENCODE_UPDATE_ENABLE);
        }
    }

    public static void setUplinkEncodeUrlWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9ba236", new Object[]{str});
        } else {
            uplinkEncodeUrlWhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setUrlMonitorRequestList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9177d131", new Object[]{str});
        } else {
            urlMonitorRequestList = setArrayList(str);
        }
    }

    public static void setVpnChangeDetectOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1dde5f", new Object[]{new Boolean(z)});
        } else {
            isVpnChangeDetectOpened = setConfigSpOpenBool(z, NETWORK_VPN_CHANGE_DETECT_ENABLE);
        }
    }

    public static void setVpnDetectRacingOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ce5641", new Object[]{new Boolean(z)});
        } else {
            isVpnDetectRacingOpened = setConfigSpOpenBool(z, NETWORK_VPN_DETECT_RACING_ENABLE);
        }
    }

    public static void setVpnFastDegradBizIdWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84131e87", new Object[]{str});
        } else {
            vpnFastDegradBizIdWhiteList = setArrayList(str);
        }
    }

    public static void setVpnFastDegradTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f304453", new Object[]{new Long(j)});
        } else {
            vpnFastDegradTime = j;
        }
    }

    public static void setVpnFastDegradeABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0fbde41", new Object[]{new Boolean(z)});
        } else {
            isVpnFastDegradeABEnable = z;
        }
    }

    public static void setVpnFastDegradeEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c037c14", new Object[]{new Boolean(z)});
        } else {
            isVpnFastDegradeEnable = setConfigSpOpenBool(z, NETWORK_VPN_FAST_DEGRADE_ENABLE);
        }
    }

    public static void setVpnFastDegradeHostWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed28468", new Object[]{str});
        } else {
            vpnFastDegradeHostWhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setVpnFgChangeCount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d237af1", new Object[]{new Long(j)});
        } else {
            vpnFgChangeCount = j;
        }
    }

    public static void setVpnListenTimeInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79dfb12", new Object[]{new Long(j)});
        } else {
            vpnListenTimeInterval = j;
        }
    }

    public static void setVpnOptOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2fe1983", new Object[]{new Boolean(z)});
        } else {
            isVpnOptOpened = setConfigSpOpenBool(z, NETWORK_VPN_OPT_ENABLE);
        }
    }

    public static void setVpnProxySessionWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8caa9be", new Object[]{str});
        } else {
            vpnProxySessionWhiteList = setArrayList(str);
        }
    }

    public static void setWaitThreadCountConfig(String str) {
        CopyOnWriteArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694ae321", new Object[]{str});
        } else if (str != null) {
            try {
                if (!str.isEmpty() && (arrayList = setArrayList(str)) != null && arrayList.size() == 1) {
                    waitThreadCount = Integer.parseInt(arrayList.get(0));
                }
            } catch (Throwable th) {
                ALog.e(TAG, "[setZstdDictThreshold] error", null, th, new Object[0]);
                waitThreadCount = 8;
            }
        }
    }

    public static void setWifiDetectOptOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e7a66b", new Object[]{new Boolean(z)});
        } else {
            isWifiDetectOptOpened = setConfigSpOpenBool(z, NETWORK_WIFI_DETECT_OPT_ENABLE);
        }
    }

    public static void setWifiFgForceCellConfigList(String str) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a22dc6", new Object[]{str});
        } else if (str != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() == 6) {
                    String string6 = jSONArray.getString(0);
                    if (string6 == null) {
                        if (!string6.isEmpty()) {
                        }
                        string = jSONArray.getString(1);
                        if (string == null || !string.isEmpty()) {
                            periodTimeoutCount = Integer.parseInt(string);
                        }
                        string2 = jSONArray.getString(2);
                        if (string2 == null || !string2.isEmpty()) {
                            periodTime = Long.parseLong(string2);
                        }
                        string3 = jSONArray.getString(3);
                        if (string3 == null || !string3.isEmpty()) {
                            detectIntervalTime = Long.parseLong(string3);
                        }
                        string4 = jSONArray.getString(4);
                        if (string4 == null || !string4.isEmpty()) {
                            allowUseCellFlowSize = Long.parseLong(string4);
                        }
                        string5 = jSONArray.getString(5);
                        if (string5 == null || !string5.isEmpty()) {
                            detectReadTimeOut = Integer.parseInt(string5);
                        }
                        return;
                    }
                    continueTimeoutCount = Integer.parseInt(string6);
                    string = jSONArray.getString(1);
                    if (string == null) {
                    }
                    periodTimeoutCount = Integer.parseInt(string);
                    string2 = jSONArray.getString(2);
                    if (string2 == null) {
                    }
                    periodTime = Long.parseLong(string2);
                    string3 = jSONArray.getString(3);
                    if (string3 == null) {
                    }
                    detectIntervalTime = Long.parseLong(string3);
                    string4 = jSONArray.getString(4);
                    if (string4 == null) {
                    }
                    allowUseCellFlowSize = Long.parseLong(string4);
                    string5 = jSONArray.getString(5);
                    if (string5 == null) {
                    }
                    detectReadTimeOut = Integer.parseInt(string5);
                }
            } catch (Throwable th) {
                ALog.e(TAG, "[setWifiFgForceCellConfigList] error", null, th, new Object[0]);
            }
        }
    }

    public static void setWifiFgForceCellWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac5c0e3", new Object[]{str});
        } else {
            wifiFgForceCellWhiteList = setArrayList(str);
        }
    }

    public static void setWifiUnavailableUseCellOptOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6e4be1", new Object[]{new Boolean(z)});
        } else {
            isWifiUnavailableUseCellOptOpened = setConfigSpOpenBool(z, NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE);
        }
    }

    public static void setXquicCongControl(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd42378", new Object[]{new Integer(i)});
        } else if (i >= 0) {
            xquicCongControl = i;
        }
    }

    public static void setXquicRemoteEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4f52a50", new Object[]{new Boolean(z)});
        } else {
            isXquicRemoteEnable = setConfigSpOpenBool(z, NETWORK_XQUIC_REMOTE_ENABLE);
        }
    }

    public static void setZstdDictDecompressChannelEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adaf6cab", new Object[]{new Boolean(z)});
        } else {
            isZstdDictDecompressChannelEnable = setConfigSpOpenBool(z, NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE);
        }
    }

    public static void setZstdDictDecompressMtopEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c774fe", new Object[]{new Boolean(z)});
        } else {
            isZstdDictDecompressMtopEnable = setConfigSpOpenBool(z, NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE);
        }
    }

    public static void setZstdDictDecompressOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbd2c0", new Object[]{new Boolean(z)});
        } else {
            isZstdDictDecompressOpened = setConfigSpOpenBool(z, NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE);
        }
    }

    public static void setZstdDictDecompressWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fbbd414", new Object[]{str});
        } else {
            zstdDictDecompressWhiteList = setArrayListAllMatch(str);
        }
    }

    public static void setZstdDictFailConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7067f2", new Object[]{str});
            return;
        }
        try {
            CopyOnWriteArrayList<String> arrayList = setArrayList(str);
            if (arrayList != null && arrayList.size() == 2) {
                zstdDictFailIntervalTime = Long.parseLong(arrayList.get(0));
                zstdDictFailCount = Long.parseLong(arrayList.get(1));
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[setZstdDictFailConfig] error", null, th, new Object[0]);
            zstdDictFailIntervalTime = 300000L;
            zstdDictFailCount = 5L;
        }
    }

    public static void setZstdDictThreshold(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6b473b", new Object[]{str});
            return;
        }
        try {
            CopyOnWriteArrayList<String> arrayList = setArrayList(str);
            if (arrayList != null && arrayList.size() == 6) {
                zstdFileMaxCount = Integer.parseInt(arrayList.get(0));
                zstdDictMaxCount = Integer.parseInt(arrayList.get(1));
                zstdDictMaxLength = Long.parseLong(arrayList.get(2));
                zstdPerDictMaxLength = Long.parseLong(arrayList.get(3));
                zstdDictProtectUpdateTime = Long.parseLong(arrayList.get(4));
                zstdLinkDictIntervalTime = Long.parseLong(arrayList.get(5));
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[setZstdDictThreshold] error", null, th, new Object[0]);
            zstdFileMaxCount = 10;
            zstdDictMaxCount = 10;
            zstdDictMaxLength = 4194304L;
            zstdPerDictMaxLength = 256000L;
            zstdDictProtectUpdateTime = 3600000L;
            zstdLinkDictIntervalTime = 300000L;
        }
    }

    public static void setZstdStreamDecompressOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e4d2ff6", new Object[]{new Boolean(z)});
        } else {
            isZstdStreamDecompressOpened = setConfigSpOpenBool(z, NETWORK_ZSTD_STREAM_DECOMPRESS_ENABLE);
        }
    }

    public static void updateUsePreSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20404ce2", new Object[]{str});
            return;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = usePreSessionMap;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            usePreSessionMap.remove(str);
            usePreSessionMap.put(str, 1);
        }
    }

    public static List<String> getMatchHostListByOption(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("10dd1b3e", new Object[]{uri, str});
        }
        ArrayList<DnsNavConfigTask> arrayList = dnsNavTasksList;
        if (arrayList != null && !arrayList.isEmpty() && uri != null) {
            try {
                String path = uri.getPath();
                String host = uri.getHost();
                String uri2 = uri.toString();
                if (path != null && !path.isEmpty() && host != null && !host.isEmpty() && uri2 != null && !uri2.isEmpty()) {
                    Iterator<DnsNavConfigTask> it = arrayList.iterator();
                    while (it.hasNext()) {
                        DnsNavConfigTask next = it.next();
                        String matchKey = next.getMatchKey();
                        String matchType = next.getMatchType();
                        if (next.getMatchKey() == null || matchKey == null || matchKey.isEmpty() || matchType == null || matchType.isEmpty()) {
                            break;
                        } else if ("domain".equalsIgnoreCase(matchType) && matchKey.equalsIgnoreCase(host)) {
                            return next.getHostListByOption(str);
                        } else {
                            if (DnsNavConfigTask.PathPrefix.equalsIgnoreCase(matchType) && path.startsWith(matchKey)) {
                                return next.getHostListByOption(str);
                            }
                            if (DnsNavConfigTask.PathComplete.equalsIgnoreCase(matchType) && path.equalsIgnoreCase(matchKey)) {
                                return next.getHostListByOption(str);
                            }
                            if (DnsNavConfigTask.URLPrefix.equalsIgnoreCase(matchType) && uri2.startsWith(matchKey)) {
                                return next.getHostListByOption(str);
                            }
                            if (DnsNavConfigTask.URLComplete.equalsIgnoreCase(matchType) && uri2.equalsIgnoreCase(matchKey)) {
                                return next.getHostListByOption(str);
                            }
                        }
                    }
                }
                return null;
            } catch (Exception e) {
                ALog.e(TAG, "[getMatchHostListByOption] error", null, e, new Object[0]);
            }
        }
        return null;
    }

    public static boolean isAmdcParcelableEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9a3766", new Object[0])).booleanValue();
        }
        if (firstSetAmdcParcelable.compareAndSet(true, false)) {
            isAmdcParcelableEnable = isAmdcParcelableOrangeEnable && isAmdcParcelableABEnable;
            ALog.e(TAG, "[new][amdc] AwcnConfig isAmdcParcelableEnable = " + isAmdcParcelableEnable, null, "isAmdcParcelableOrangeEnable", Boolean.valueOf(isAmdcParcelableOrangeEnable), "isAmdcParcelableABEnable", Boolean.valueOf(isAmdcParcelableABEnable));
        }
        return isAmdcParcelableEnable;
    }

    private static boolean isMatchUrl(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("176cb771", new Object[]{str, str2, str3, str4, str5})).booleanValue();
        }
        try {
        } catch (Exception e) {
            ALog.e(TAG, "[isMatchUrl] error", null, e, new Object[0]);
        }
        if ("domain".equalsIgnoreCase(str5) && str3 != null && !str3.isEmpty()) {
            return str4.equalsIgnoreCase(str3);
        }
        if (DnsNavConfigTask.PathPrefix.equalsIgnoreCase(str5) && str2 != null && !str2.isEmpty()) {
            return str2.startsWith(str4);
        }
        if (DnsNavConfigTask.PathComplete.equalsIgnoreCase(str5) && str2 != null && !str2.isEmpty()) {
            return str2.equalsIgnoreCase(str4);
        }
        if (DnsNavConfigTask.URLPrefix.equalsIgnoreCase(str5) && str != null && !str.isEmpty()) {
            return str.startsWith(str4);
        }
        if (DnsNavConfigTask.URLComplete.equalsIgnoreCase(str5) && str != null && !str.isEmpty()) {
            return str.equalsIgnoreCase(str4);
        }
        return false;
    }

    public static boolean isTnetLazyLoadSecEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("887e2032", new Object[0])).booleanValue();
        }
        if (lazyLoadTnetSecTime <= 0 || !"com.taobao.taobao".equalsIgnoreCase(GlobalAppRuntimeInfo.getCurrentProcess()) || GlobalAppRuntimeInfo.getInitTime() == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - GlobalAppRuntimeInfo.getInitTime();
        ALog.e(TAG, "[LazyLoadTnetSec] isLazyLoadTnetSecTime, intervalTime=" + currentTimeMillis, null, "lazyLoadTnetSecTime", Long.valueOf(lazyLoadTnetSecTime));
        return currentTimeMillis <= lazyLoadTnetSecTime;
    }

    public static boolean isUseVirtualThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9648c883", new Object[0])).booleanValue();
        }
        String str = Build.BRAND;
        boolean z = (SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str) || SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str)) && Build.VERSION.SDK_INT <= 28;
        boolean is32Bit = GlobalAppRuntimeInfo.is32Bit();
        ALog.e(TAG, "[is32Bit] bitRet= " + is32Bit, null, "condition1", Boolean.valueOf(z), "isRepeatThreadUseVirtualThread", Boolean.valueOf(isRepeatThreadUseVirtualThread));
        return isRepeatThreadUseVirtualThread && (z || is32Bit);
    }

    public static void setAmdcPresetHosts(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70dd1e10", new Object[]{str});
        } else if (GlobalAppRuntimeInfo.isTargetProcess() && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                HttpDispatcher.getInstance().clearInitHost();
                HttpDispatcher.getInstance().addHosts(setArrayListCheckIp(jSONArray));
            } catch (JSONException e) {
                ALog.e(TAG, "setAmdcPresetHosts failed", null, e, new Object[0]);
            }
        }
    }

    public static CopyOnWriteArrayList<String> setArrayList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("e991e4d3", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return getArrayList(new JSONArray(str));
        } catch (Exception e) {
            ALog.e(TAG, "[seArraytList] error", null, e, new Object[0]);
            return null;
        }
    }

    public static void setCancelHardExpiryEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c17290", new Object[]{new Boolean(z)});
            return;
        }
        isCancelHardExpiryEnable = setCoreConfigSpOpenBool(z, NETWORK_CANCEL_HARD_EXPIRY_ENABLE);
        ALog.e(TAG, "[test] AwcnConfig isCancelHardExpiryEnable = " + z, null, new Object[0]);
    }

    private static boolean setConfigSpOpenBool(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3749f4e6", new Object[]{new Boolean(z), str})).booleanValue();
        }
        try {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            edit.putBoolean(str, z);
            edit.apply();
            return z;
        } catch (Exception e) {
            ALog.e(TAG, "setConfigSpOpenBool error " + e.toString(), null, new Object[0]);
            return z;
        }
    }

    private static long setConfigSpOpenLong(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3aad2cf4", new Object[]{new Long(j), str})).longValue();
        }
        try {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            edit.putLong(str, j);
            edit.apply();
            return j;
        } catch (Exception e) {
            ALog.e(TAG, "setConfigSpOpenLong error " + e.toString(), null, new Object[0]);
            return j;
        }
    }

    public static void setCookieRetryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd021ed", new Object[]{new Integer(i)});
            return;
        }
        cookieRetryTime = setCoreConfigSpOpenLong(i, NETWORK_COOKIE_RETRY_TIME);
        ALog.e(TAG, "setCookieRetryTime  time=" + i, null, new Object[0]);
    }

    private static boolean setCoreConfigSpOpenBool(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8774947", new Object[]{new Boolean(z), str})).booleanValue();
        }
        try {
            SharedPreferences.Editor edit = SharePreferencesUtils.getCorePreferences(GlobalAppRuntimeInfo.getContext()).edit();
            edit.putBoolean(str, z);
            edit.apply();
            return z;
        } catch (Throwable th) {
            ALog.e(TAG, "setCoreConfigSpOpenBool error " + th.toString(), null, new Object[0]);
            return z;
        }
    }

    private static long setCoreConfigSpOpenLong(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbda8155", new Object[]{new Long(j), str})).longValue();
        }
        try {
            SharedPreferences.Editor edit = SharePreferencesUtils.getCorePreferences(GlobalAppRuntimeInfo.getContext()).edit();
            edit.putLong(str, j);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("CookiePatch", "setPatchCookieOpened sp error " + th.toString(), null, new Object[0]);
        }
        return j;
    }

    private static String setCoreConfigSpOpenString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81b1a5aa", new Object[]{str, str2});
        }
        try {
            SharedPreferences.Editor edit = SharePreferencesUtils.getCorePreferences(GlobalAppRuntimeInfo.getContext()).edit();
            edit.putString(str2, str);
            edit.apply();
            return str;
        } catch (Exception e) {
            ALog.e(TAG, "setCoreConfigSpOpenString error " + e.toString(), null, new Object[0]);
            return str;
        }
    }

    public static void setDownloadAsync(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9268db", new Object[]{new Boolean(z)});
            return;
        }
        ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsync： " + z, null, new Object[0]);
        isDownloadAsyncSwitch = z;
    }

    public static void setFixWriteStreamErrorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737c926e", new Object[]{new Boolean(z)});
            return;
        }
        isFixWriteStreamErrorEnable = setCoreConfigSpOpenBool(z, NETWORK_FIX_WRITE_STREAM_ERROR_ENABLE);
        ALog.e(TAG, "[test] AwcnConfig isFixWriteStreamErrorEnable = " + z, null, new Object[0]);
    }

    private static void doInitTask(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15037cc1", new Object[]{context});
            return;
        }
        setHarmonyWhiteList(SharePreferencesUtils.getCorePreferences(context).getString(MULTI_PATH_HARMONY_WHITE_LIST, "[\"2.0.0\",\"3.0.0\"]"));
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        isMultiPathMonitorEnable = defaultSharedPreferences.getBoolean(MULTI_PATH_MONITOR_KEY, true);
        setOkhttpHostWhiteList(defaultSharedPreferences.getString(OKHTTP_H2_WHITE_LIST_KEY, null));
        setOkhttpPreBuildList(defaultSharedPreferences.getString(OKHTTP_H2_PRE_BUILD_LIST_KEY, null));
        isIpv6RectificationEnable = defaultSharedPreferences.getBoolean(IPV6_RECTIFICATION_KEY, true);
        isTunnelEnable = defaultSharedPreferences.getBoolean(NETWORK_TUNNEL_KEY, true);
        isOkHttpEnable = defaultSharedPreferences.getBoolean(NETWORK_OKHTTP_KEY, true);
        isDecompressOpened = defaultSharedPreferences.getBoolean(NETWORK_DECOMPRESS_ENABLE, false);
        isMTUWifiOptEnable = defaultSharedPreferences.getBoolean(NETWORK_MTU_WIFI_OPT_ENABLE, false);
        isProcessNameUpdateEnable = defaultSharedPreferences.getBoolean(NETWORK_PROCESS_NAME_UPDATE_ENABLE, false);
        isHeaderIgnoreCaseEnable = defaultSharedPreferences.getBoolean(NETWORK_HEADER_IGNORE_CASE_ENABLE, false);
        isSupportSetWaitTimeout = defaultSharedPreferences.getBoolean(NETWORK_SUPPORT_SET_WAIT_TIME_OUT_ENABLE, false);
        isIpv6DetectOptEnable = defaultSharedPreferences.getBoolean(NETWORK_IPV6_DETECT_OPT_OPENED, false);
        isSessionOptEnable = defaultSharedPreferences.getBoolean(NETWORK_SESSION_OPT_ENABLE, false);
        isAllowNetFullLowLatencyEnable = defaultSharedPreferences.getBoolean(NETWORK_ALLOW_NET_FULL_LOW_LATENCY_ENABLE, false);
        isShortLinkConnectEnable = defaultSharedPreferences.getBoolean(NETWORK_SHORT_LINK_ENABLE, true);
        isUplinkEncodeOpened = defaultSharedPreferences.getBoolean(NETWORK_UPLINK_ENCODE_ENABLE, true);
        isUplinkEncodeUpdateOpened = defaultSharedPreferences.getBoolean(NETWORK_UPLINK_ENCODE_UPDATE_ENABLE, false);
        isSmoothReconnectEnable = defaultSharedPreferences.getBoolean(NETWORK_SMOOTH_RECONNECT_ENABLE, true);
        isSmoothReconnectOptOpened = defaultSharedPreferences.getBoolean(NETWORK_SMOOTH_RECONNECT_OPT_OPENED, false);
        isWifiUnavailableUseCellOptOpened = defaultSharedPreferences.getBoolean(NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE, false);
        isBgNotForceCellOptOpened = defaultSharedPreferences.getBoolean(NETWORK_BG_NOT_FORCE_CELL_OPT_ENABLE, false);
        isReplaceStrategyOpened = defaultSharedPreferences.getBoolean(NETWORK_REPLACE_STRATEGY_ENABLE, false);
        isVpnDetectRacingOpened = defaultSharedPreferences.getBoolean(NETWORK_VPN_DETECT_RACING_ENABLE, false);
        isWifiDetectOptOpened = defaultSharedPreferences.getBoolean(NETWORK_WIFI_DETECT_OPT_ENABLE, false);
        interceptorOptType = defaultSharedPreferences.getLong(NETWORK_INTERCEPTOR_OPT_TYPE, 0L);
        isSpdyOfflineEnable = defaultSharedPreferences.getBoolean(NETWORK_SPDY_OFFLINE_ENABLE, false);
        isLastStatusNoneOpt = defaultSharedPreferences.getBoolean(NETWORK_LAST_STATUS_NONE_ENABLE, false);
        isPreSessionOptEnable = defaultSharedPreferences.getBoolean(NETWORK_PRE_SESSION_OPT_ENABLE, true);
        isHttp3PreHostEnable = defaultSharedPreferences.getBoolean(NETWORK_HTTP3_PRE_HOST_ENABLE, true);
        isAllowRetryUseLongLinkEnable = defaultSharedPreferences.getBoolean(NETWORK_RETRY_USE_LONG_LINK_ENABLE, false);
        isHttp3ReconnectEnable = defaultSharedPreferences.getBoolean(NETWORK_HTTP3_RECONNECT_ENABLE, true);
        isReqFecSizeOptEnable = defaultSharedPreferences.getBoolean(NETWORK_REQ_FEC_SIZE_OPT_ENABLE, false);
        isAccessPointOpened = defaultSharedPreferences.getBoolean(NETWORK_ACCESS_POINT_ENABLE, false);
        rangeBoostOpen = defaultSharedPreferences.getBoolean(NETWORK_RANGE_BOOST_OPEN, true);
        isReqForceCellEnable = defaultSharedPreferences.getBoolean(NETWORK_REQ_FORCE_CELL_ENABLE, false);
        isTnetForcePubKey = defaultSharedPreferences.getBoolean(NETWORK_TNET_FORCE_PUBKEY_ENABLE, false);
        ipv6Enable = defaultSharedPreferences.getBoolean(NETWORK_IPV6_ENABLE, true);
        isVpnOptOpened = defaultSharedPreferences.getBoolean(NETWORK_VPN_OPT_ENABLE, true);
        isVpnFastDegradeEnable = defaultSharedPreferences.getBoolean(NETWORK_VPN_FAST_DEGRADE_ENABLE, true);
        isVpnChangeDetectOpened = defaultSharedPreferences.getBoolean(NETWORK_VPN_CHANGE_DETECT_ENABLE, true);
        isHandoverSignalOpened = defaultSharedPreferences.getBoolean(NETWORK_HANDOVER_SIGNAL_ENABLE, false);
        isZstdDictDecompressOpened = defaultSharedPreferences.getBoolean(NETWORK_ZSTD_DICT_DECOMPRESS_ENABLE, false);
        isAmdcPriorityUpdateEnable = defaultSharedPreferences.getBoolean(NETWORK_PRIORITY_UPDATE_AMDC_ENABLE, false);
        isZstdDictDecompressMtopEnable = defaultSharedPreferences.getBoolean(NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_ENABLE, false);
        isZstdDictDecompressChannelEnable = defaultSharedPreferences.getBoolean(NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_ENABLE, true);
        isAmdcLocationRetryEnable = defaultSharedPreferences.getBoolean(NETWORK_AMDC_LOCATION_RETRY_ENABLE, true);
        isXquicRemoteEnable = defaultSharedPreferences.getBoolean(NETWORK_XQUIC_REMOTE_ENABLE, true);
        isPreHostMccNotUseEnable = defaultSharedPreferences.getBoolean(NETWORK_PRE_HOST_MCC_ENABLE, false);
        set1RttHttp3WhiteList(defaultSharedPreferences.getString(HTTP3_1RTT_WHITE_LIST_KEY, null));
        setDetectHostWhiteList(defaultSharedPreferences.getString(NETWORK_DETECT_H3_HOST_WHITE_LIST_KEY, null));
        setStrategyTimelyUpdateWhiteList(defaultSharedPreferences.getString(NETWORK_STRATEGY_TIMELY_UPDATE_HOST_WHITE_LIST_KEY, null));
        setCookiePrintLogHostWhiteList(defaultSharedPreferences.getString(NETWORK_COOKIE_LOG_HOST_WHITE_LIST_KEY, null));
        setAcceptEncodeHostWhiteList(defaultSharedPreferences.getString(NETWORK_ACCEPT_ENCODE_WHITE_LIST_KEY, null));
        setMultiConnectWhiteList(defaultSharedPreferences.getString(NETWORK_MULTI_CONNECT_WHITE_LIST_KEY, null));
        setMtopAmdcWhiteList(defaultSharedPreferences.getString(NETWORK_MTOP_AMDC_WHITE_LIST_KEY, null));
        setLongAmdcWhiteList(defaultSharedPreferences.getString(NETWORK_LONG_AMDC_WHITE_LIST_KEY, null));
        setMtopInterceptorWhiteList(defaultSharedPreferences.getString(NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_KEY, null));
        setMtopInterceptorWhiteList(defaultSharedPreferences.getString(NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_KEY, null));
        setUplinkEncodeHostWhiteList(defaultSharedPreferences.getString(NETWORK_UPLINK_COMPRESS_HOST_WHITE_LIST_KEY, null));
        setAllowFullLowLatencyUrlWhiteList(defaultSharedPreferences.getString(NETWORK_LOW_LATENCY_WHITE_LIST_KEY, null));
        setMtuWhiteList(defaultSharedPreferences.getString(NETWORK_MTU_WHITE_LIST_KEY, null));
        setUplinkEncodeUrlWhiteList(defaultSharedPreferences.getString(NETWORK_UPLINK_COMPRESS_URL_WHITE_LIST_KEY, null));
        setRumParams(defaultSharedPreferences.getString(NETWORK_RUM_PARAM_LIST_KEY, null));
        setSceneBWEstimatorList(defaultSharedPreferences.getString(NETWORK_SCENE_BWE_ESTIMATOR_LIST_KEY, null));
        setPresetHostWhiteList(defaultSharedPreferences.getString(NETWORK_PRE_HOST_WHITE_LIST_KEY, null));
        setVpnProxySessionWhiteList(defaultSharedPreferences.getString(VPN_PROXY_SESSION_WHITE_LIST_KEY, null));
        setVpnFastDegradeHostWhiteList(defaultSharedPreferences.getString(VPN_FAST_DEGRADE_HOST_WHITE_LIST_KEY, null));
        setReqFecSizeWhiteList(defaultSharedPreferences.getString(NETWORK_REQ_FEC_SIZE_WHITE_LIST_KEY, null));
        setReqFecUpSizeWhiteList(defaultSharedPreferences.getString(NETWORK_REQ_UP_FEC_SIZE_WHITE_LIST_KEY, null));
        setVpnFastDegradBizIdWhiteList(defaultSharedPreferences.getString(VPN_FAST_DEGRADE_BIZID_WHITE_LIST_KEY, null));
        setReqForceCellWhiteList(defaultSharedPreferences.getString(REQ_FORCE_CELL_WHITE_LIST_KEY, null));
        setZstdDictDecompressWhiteList(defaultSharedPreferences.getString(NETWORK_ZSTD_DICT_WHITE_LIST_KEY, null));
        setLunchAfterAmdcList(defaultSharedPreferences.getString(NETWORK_LUNCH_AFTER_AMDC_WHITE_LIST_KEY, null));
        setAmdcStrategyThreshold(defaultSharedPreferences.getString(NETWORK_AMDC_STRATEGY_THRESHOLD_KEY, null));
        setZstdDictThreshold(defaultSharedPreferences.getString(ZSTD_DICT_THRESHOLD, null));
        setZstdDictFailConfig(defaultSharedPreferences.getString(ZSTD_DICT_FAIL_CONFIG_KEY, null));
        setWifiFgForceCellWhiteList(defaultSharedPreferences.getString(NETWORK_WIFI_FG_FORCE_CELL_WHITE_LIST_KEY, null));
        setUrlMonitorRequestList(defaultSharedPreferences.getString(NETWORK_URL_MONITOR_REQUEST_WHITE_LIST_KEY, null));
        setSupportStreamingParserList(defaultSharedPreferences.getString(NETWORK_SUPPORT_STREAMING_PARSER_WHITE_LIST_KEY, null));
        setAllowNoCookieList(defaultSharedPreferences.getString(NETWORK_ALLOW_NO_COOKIE_WHITE_LIST_KEY, null));
        setWifiFgForceCellConfigList(defaultSharedPreferences.getString(NETWORK_WIFI_FG_FORCE_CELL_CONFIG_LIST_KEY, null));
        setHttp3NetworkChangeWhiteList(defaultSharedPreferences.getString(HTTP3_NETWORK_CHANGE_WHITE_LIST_KEY, null));
        setPreSessionWhiteList(defaultSharedPreferences.getString(NETWORK_PRE_SESSION_WHITE_LIST_KEY, null));
        setAmdcTimeout(defaultSharedPreferences.getInt(NETWORK_AMDC_TIMEOUT_KEY, 3000));
        setAmdcLightTime(defaultSharedPreferences.getInt(NETWORK_AMDC_LIGHT_TIME_KEY, 15000));
        setLazyLoadTnetSecTime(defaultSharedPreferences.getLong(NETWORK_LAZY_LOAD_TNET_SECURITY_TIME_KEY, 15000L));
        setSavePowerTimeInterval(defaultSharedPreferences.getInt(NETWORK_SAVE_POWER_TIME_KEY, 60000));
        setChannelAmdcTtl(defaultSharedPreferences.getInt(NETWORK_CHANNEL_AMDC_TTL_KEY, 2));
        setHttp3OptWhiteList(defaultSharedPreferences.getString(HTTP3_OPT_WHITE_LIST_KEY, null));
        setWaitThreadCountConfig(defaultSharedPreferences.getString(NETWORK_WAIT_THREAD_COUNT_KEY, null));
        setNetworkMetricsTimeConfig(defaultSharedPreferences.getString(NETWORK_RECENT_WIN_TIME_KEY, null));
        String string = defaultSharedPreferences.getString(NETWORK_DOWNLOAD_ASYNC_RATIO, null);
        if (string == null) {
            setDownloadAsyncRatio(1, null, context);
        } else {
            try {
                setDownloadAsyncRatio(Integer.parseInt(string), null, context);
            } catch (Exception e) {
                ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig exception :" + e, null, new Object[0]);
            }
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("download_remoteso");
        copyOnWriteArrayList.add("download_splitdownload");
        copyOnWriteArrayList.add("download_featurepreload");
        copyOnWriteArrayList.add("download_remoteso_preload");
        qosReferList = copyOnWriteArrayList;
        CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList2.add("guangguang.cloudvideocdn.taobao.com");
        copyOnWriteArrayList2.add("tbm-auth.alicdn.com");
        copyOnWriteArrayList2.add("pingjia.alicdn.com");
        copyOnWriteArrayList2.add("daren-auth.alicdn.com");
        copyOnWriteArrayList2.add("tbsvideo.cloudvideocdn.taobao.com");
        copyOnWriteArrayList2.add("bizsec-auth.alicdn.com");
        qosHostWhiteList = copyOnWriteArrayList2;
        CopyOnWriteArrayList<String> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList3.add("ggpick_preload");
        qosBizWhiteList = copyOnWriteArrayList3;
    }

    private static int getReqFecSize(ConcurrentHashMap<String, List<String>> concurrentHashMap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cefbc3fb", new Object[]{concurrentHashMap, str, str2})).intValue();
        }
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
                        for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                            List<String> value = entry.getValue();
                            if (value != null && !value.isEmpty()) {
                                int parseInt = Integer.parseInt(entry.getKey());
                                for (String str3 : value) {
                                    if (str.contains(str3)) {
                                        return parseInt * 1024;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                    return 1;
                }
            } catch (Throwable th) {
                ALog.e(TAG, "[getReqFecSize] error", str2, th, new Object[0]);
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
        return anet.channel.AwcnConfig.THV_WIFI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
        return anet.channel.AwcnConfig.THV_WIFI;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double[] getRumParams(boolean r7) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = anet.channel.AwcnConfig.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r3
            java.lang.String r0 = "c834c5cc"
            java.lang.Object r7 = r2.ipc$dispatch(r0, r7)
            double[] r7 = (double[]) r7
            return r7
        L_0x001a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r2 = anet.channel.AwcnConfig.rumParamsMap     // Catch: all -> 0x0035
            if (r2 == 0) goto L_0x006c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r2 = anet.channel.AwcnConfig.rumParamsMap     // Catch: all -> 0x0035
            boolean r2 = r2.isEmpty()     // Catch: all -> 0x0035
            if (r2 == 0) goto L_0x0027
            goto L_0x006c
        L_0x0027:
            if (r7 == 0) goto L_0x0037
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r2 = anet.channel.AwcnConfig.rumParamsMap     // Catch: all -> 0x0035
            java.lang.String r3 = "wifi"
            java.lang.Object r2 = r2.get(r3)     // Catch: all -> 0x0035
        L_0x0032:
            java.util.List r2 = (java.util.List) r2     // Catch: all -> 0x0035
            goto L_0x0041
        L_0x0035:
            r1 = move-exception
            goto L_0x0074
        L_0x0037:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r2 = anet.channel.AwcnConfig.rumParamsMap     // Catch: all -> 0x0035
            java.lang.String r3 = "cell"
            java.lang.Object r2 = r2.get(r3)     // Catch: all -> 0x0035
            goto L_0x0032
        L_0x0041:
            if (r2 == 0) goto L_0x0064
            int r3 = r2.size()     // Catch: all -> 0x0035
            r4 = 18
            if (r3 == r4) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            double[] r3 = new double[r4]     // Catch: all -> 0x0035
            r4 = 0
        L_0x004f:
            int r5 = r2.size()     // Catch: all -> 0x0035
            if (r4 >= r5) goto L_0x0063
            java.lang.Object r5 = r2.get(r4)     // Catch: all -> 0x0035
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x0035
            double r5 = java.lang.Double.parseDouble(r5)     // Catch: all -> 0x0035
            r3[r4] = r5     // Catch: all -> 0x0035
            int r4 = r4 + r1
            goto L_0x004f
        L_0x0063:
            return r3
        L_0x0064:
            if (r7 == 0) goto L_0x0069
            double[] r7 = anet.channel.AwcnConfig.THV_WIFI     // Catch: all -> 0x0035
            goto L_0x006b
        L_0x0069:
            double[] r7 = anet.channel.AwcnConfig.THV_CELL     // Catch: all -> 0x0035
        L_0x006b:
            return r7
        L_0x006c:
            if (r7 == 0) goto L_0x0071
            double[] r7 = anet.channel.AwcnConfig.THV_WIFI     // Catch: all -> 0x0035
            goto L_0x0073
        L_0x0071:
            double[] r7 = anet.channel.AwcnConfig.THV_CELL     // Catch: all -> 0x0035
        L_0x0073:
            return r7
        L_0x0074:
            r2 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "awcn.AwcnConfig"
            java.lang.String r4 = "[getRumParams] error"
            anet.channel.util.ALog.e(r3, r4, r2, r1, r0)
            if (r7 == 0) goto L_0x0083
            double[] r7 = anet.channel.AwcnConfig.THV_WIFI
            goto L_0x0085
        L_0x0083:
            double[] r7 = anet.channel.AwcnConfig.THV_CELL
        L_0x0085:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.AwcnConfig.getRumParams(boolean):double[]");
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (initialized.compareAndSet(false, true)) {
            Boolean isABGlobalFeatureOpened = ABSwitchUtils.isABGlobalFeatureOpened(context, "Amdc_Parcelable_Enable_AB");
            if (isABGlobalFeatureOpened != null) {
                setAmdcParcelableABEnable(isABGlobalFeatureOpened.booleanValue());
            }
            Boolean isABGlobalFeatureOpened2 = ABSwitchUtils.isABGlobalFeatureOpened(context, "Amdc_Launch_Strategy_Enable_AB");
            if (isABGlobalFeatureOpened2 != null) {
                setLaunchStrategyABEnable(isABGlobalFeatureOpened2.booleanValue());
            }
            Boolean isABGlobalFeatureOpened3 = ABSwitchUtils.isABGlobalFeatureOpened(context, "Strategy_Opt_Enable_AB");
            if (isABGlobalFeatureOpened2 != null) {
                setStrategyOptABEnable(isABGlobalFeatureOpened3.booleanValue());
            }
            SharedPreferences corePreferences = SharePreferencesUtils.getCorePreferences(context);
            preHotStr = corePreferences.getString(NETWORK_PRE_HOT_STR, null);
            initPreHotStr();
            initCoreSp(corePreferences, context);
            boolean z = isLaunchOptV1Opened;
            isAsyncIpStackDetect = z;
            isAsyncLoadStrategyEnable = z;
        }
    }

    private static void initPreHotStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6f28fe", new Object[0]);
            return;
        }
        try {
            String str = preHotStr;
            if (str != null && !str.isEmpty()) {
                JSONObject jSONObject = new JSONObject(preHotStr);
                isLaunchOptOpened = jSONObject.optBoolean(NETWORK_LAUNCH_OPT_OPENED);
                isLaunchOptV1Opened = jSONObject.optBoolean(NETWORK_LAUNCH_OPT_V1_OPENED);
                isLaunchOptV2Opened = jSONObject.optBoolean(NETWORK_LAUNCH_OPT_V2_OPENED);
            }
        } catch (Throwable th) {
            isLaunchOptOpened = true;
            isLaunchOptV1Opened = true;
            isLaunchOptV2Opened = true;
            ALog.e(TAG, "AwcnConfig initPreHotStr fail! ", null, "t", th);
        }
    }

    public static boolean isHostInMtopInterceptorWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d03e3f56", new Object[]{str})).booleanValue();
        }
        return (str == null || TextUtils.isEmpty(str) || mtopInterceptorWhiteList == null || mtopInterceptorWhiteList.get(str) == null) ? false : true;
    }

    public static boolean isMncBlack(String str, String str2) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9a68ca6", new Object[]{str, str2})).booleanValue();
        }
        try {
            concurrentHashMap = allowFullLowLatencyUrlWhiteList;
        } catch (Throwable th) {
            ALog.e(TAG, "[isMncBlack] error", str, th, new Object[0]);
        }
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            List<String> list = allowFullLowLatencyUrlWhiteList.get("mncBlack");
            if (!(str2 == null || list == null || list.isEmpty())) {
                for (String str3 : list) {
                    if (str2.equalsIgnoreCase(str3)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static boolean isUrlInArrayList(String str, CopyOnWriteArrayList<String> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f30d64a3", new Object[]{str, copyOnWriteArrayList})).booleanValue();
        }
        if (str != null && !TextUtils.isEmpty(str) && copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<String> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void registerPresetSessions(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37aa3370", new Object[]{str});
        } else if (GlobalAppRuntimeInfo.isTargetProcess() && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("host");
                    if (Utils.checkHostValidAndNotIp(string)) {
                        String string2 = jSONObject.getString("protocol");
                        String string3 = jSONObject.getString("rtt");
                        String string4 = jSONObject.getString("publicKey");
                        StrategyTemplate.getInstance().registerConnProtocol(GlobalAppRuntimeInfo.getContext(), string, ConnProtocol.valueOf(string2, string3, string4), string4);
                        if (jSONObject.getBoolean("isKeepAlive")) {
                            SessionCenter.getInstance().registerSessionInfo(SessionInfo.create(string, true, false, (IAuth) null, (IHeartbeat) null, (CustomDataFrameCb) null));
                        }
                    } else {
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void setAllowRetryUseLongLinkEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a20b5c4e", new Object[]{new Boolean(z)});
            return;
        }
        boolean configSpOpenBool = setConfigSpOpenBool(z, NETWORK_RETRY_USE_LONG_LINK_ENABLE);
        isAllowRetryUseLongLinkEnable = configSpOpenBool;
        ALog.e(TAG, "[setAllowRetryUseLongLinkEnable]", null, "isAllowRetryUseLongLinkEnable", Boolean.valueOf(configSpOpenBool));
    }

    public static void setAmdcStrategyThreshold(String str) {
        String string;
        String string2;
        String string3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e800b4dc", new Object[]{str});
        } else if (str != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() == 4) {
                    String string4 = jSONArray.getString(0);
                    if (string4 == null) {
                        if (!string4.isEmpty()) {
                        }
                        string = jSONArray.getString(1);
                        if (string == null || !string.isEmpty()) {
                            otherAmdcThreshold = Long.parseLong(string);
                        }
                        string2 = jSONArray.getString(2);
                        if (string2 == null || !string2.isEmpty()) {
                            longAmdcThreshold = Long.parseLong(string2);
                        }
                        string3 = jSONArray.getString(3);
                        if (string3 == null || !string3.isEmpty()) {
                            amdcClearThreshold = Long.parseLong(string3);
                        }
                        return;
                    }
                    mtopAmdcThreshold = Long.parseLong(string4);
                    string = jSONArray.getString(1);
                    if (string == null) {
                    }
                    otherAmdcThreshold = Long.parseLong(string);
                    string2 = jSONArray.getString(2);
                    if (string2 == null) {
                    }
                    longAmdcThreshold = Long.parseLong(string2);
                    string3 = jSONArray.getString(3);
                    if (string3 == null) {
                    }
                    amdcClearThreshold = Long.parseLong(string3);
                }
            } catch (Throwable th) {
                ALog.e(TAG, "[setAmdcStrategyThreshold] error", null, th, new Object[0]);
            }
        }
    }

    private static ConcurrentHashMap<String, List<String>> setArrayListAllMatch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("d7dc4abc", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                try {
                    if ("*".equals(obj)) {
                        concurrentHashMap.put(next, ALLOW_ALL_PATH);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i = 0; i < length; i++) {
                            Object obj2 = jSONArray.get(i);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e) {
            ALog.e(TAG, "setArrayListAllMatch failed", null, e, new Object[0]);
        }
        return concurrentHashMap;
    }

    private static ArrayList<DnsNavConfigTask> setArrayListMatchUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("666f3a0a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList<DnsNavConfigTask> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    arrayList.add(new DnsNavConfigTask(jSONObject.get(DnsNavConfigTask.MatchKey).toString(), jSONObject.get(DnsNavConfigTask.MatchType).toString(), setArrayList(jSONObject.get(DnsNavConfigTask.PreCONN).toString()), setArrayList(jSONObject.get(DnsNavConfigTask.PreDNS).toString())));
                }
            }
            return arrayList;
        } catch (Exception e) {
            ALog.e(TAG, "[setArrayListMatchUrl] error", null, e, new Object[0]);
            return null;
        }
    }

    public static void setDownloadAsyncRatio(int i, SharedPreferences.Editor editor, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9336e10a", new Object[]{new Integer(i), editor, context});
            return;
        }
        if (editor != null) {
            try {
                String valueOf = String.valueOf(i);
                if (valueOf != null) {
                    editor.putString(NETWORK_DOWNLOAD_ASYNC_RATIO, valueOf).apply();
                }
            } catch (Exception e) {
                ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsyncRatio exp1 :" + e, null, new Object[0]);
            }
        }
        if (i <= 0) {
            ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsyncRatio( 0 )", null, new Object[0]);
            isDownloadAsyncSwitch = false;
        } else if (context != null) {
            try {
                String deviceId = anet.channel.util.Utils.getDeviceId(context);
                ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsync get utdid: " + deviceId, null, new Object[0]);
                if (deviceId != null) {
                    int abs = Math.abs(deviceId.hashCode());
                    if (abs % i == 0) {
                        ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsync(true), deviceHash=" + abs, null, new Object[0]);
                        isDownloadAsyncSwitch = true;
                    }
                }
            } catch (Exception e2) {
                ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsyncRatio exp2 :" + e2, null, new Object[0]);
            }
        } else {
            ALog.e(TAG, "[RemoteFeatureQoS] AwcnConfig setDownloadAsync( false ) with context null", null, new Object[0]);
            isDownloadAsyncSwitch = false;
        }
    }

    public static void setHttp3DisabledWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd3fff3", new Object[]{str});
            return;
        }
        CopyOnWriteArrayList<String> arrayList = setArrayList(str);
        http3DisabledWhiteList = arrayList;
        ALog.e(TAG, "[setHttp3DisabledWhiteList]", null, "http3DisabledWhiteList", arrayList);
    }

    public static void setLunchAfterAmdcList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ac6eae", new Object[]{str});
        } else if (str != null && !str.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                lunchAfterAmdcList = new CopyOnWriteArraySet<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        lunchAfterAmdcList.add(string);
                    }
                }
            } catch (Exception e) {
                ALog.e(TAG, "[setLunchAfterAmdcList] error", null, e, new Object[0]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r6 != false) goto L_0x0050;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void updateAccessPointStatus(java.lang.String r8) {
        /*
            r0 = 1
            r1 = 0
            java.lang.Class<anet.channel.AwcnConfig> r2 = anet.channel.AwcnConfig.class
            monitor-enter(r2)
            com.android.alibaba.ip.runtime.IpChange r3 = anet.channel.AwcnConfig.$ipChange     // Catch: all -> 0x0016
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x0016
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "24ab20a6"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0016
            r0[r1] = r8     // Catch: all -> 0x0016
            r3.ipc$dispatch(r4, r0)     // Catch: all -> 0x0016
            monitor-exit(r2)
            return
        L_0x0016:
            r8 = move-exception
            goto L_0x0090
        L_0x0019:
            if (r8 == 0) goto L_0x008e
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch: all -> 0x0016
            if (r3 != 0) goto L_0x008e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r3 = anet.channel.AwcnConfig.accessPointWhiteList     // Catch: all -> 0x0016
            if (r3 != 0) goto L_0x0026
            goto L_0x008e
        L_0x0026:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r3 = anet.channel.AwcnConfig.accessPointWhiteList     // Catch: all -> 0x0016
            java.util.Set r3 = r3.entrySet()     // Catch: all -> 0x0016
            java.util.Iterator r3 = r3.iterator()     // Catch: all -> 0x0016
        L_0x0030:
            boolean r4 = r3.hasNext()     // Catch: all -> 0x0016
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r3.next()     // Catch: all -> 0x0016
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: all -> 0x0016
            java.lang.Object r5 = r4.getKey()     // Catch: all -> 0x0016
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x0016
            java.lang.Object r4 = r4.getValue()     // Catch: all -> 0x0016
            java.util.List r4 = (java.util.List) r4     // Catch: all -> 0x0016
            if (r4 == 0) goto L_0x0050
            boolean r6 = r4.isEmpty()     // Catch: all -> 0x0016
            if (r6 == 0) goto L_0x005a
        L_0x0050:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: all -> 0x0016
            r4.<init>()     // Catch: all -> 0x0016
            java.lang.String r6 = "0"
            r4.add(r6)     // Catch: all -> 0x0016
        L_0x005a:
            java.lang.Object r6 = r4.get(r1)     // Catch: all -> 0x0016
            java.lang.String r6 = (java.lang.String) r6     // Catch: all -> 0x0016
            boolean r7 = r8.equalsIgnoreCase(r5)     // Catch: all -> 0x0016
            if (r7 == 0) goto L_0x0030
            java.lang.String r7 = "0"
            boolean r6 = r7.equalsIgnoreCase(r6)     // Catch: all -> 0x0016
            if (r6 == 0) goto L_0x0030
            java.lang.String r8 = "1"
            r4.set(r1, r8)     // Catch: all -> 0x0016
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r8 = anet.channel.AwcnConfig.accessPointWhiteList     // Catch: all -> 0x0016
            r8.put(r5, r4)     // Catch: all -> 0x0016
            java.lang.String r8 = "awcn.AwcnConfig"
            java.lang.String r3 = "[handleSession] updateAccessPointStatus: 0->1"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: all -> 0x0016
            java.lang.String r6 = "host"
            r4[r1] = r6     // Catch: all -> 0x0016
            r4[r0] = r5     // Catch: all -> 0x0016
            r0 = 0
            anet.channel.util.ALog.e(r8, r3, r0, r4)     // Catch: all -> 0x0016
            monitor-exit(r2)
            return
        L_0x008c:
            monitor-exit(r2)
            return
        L_0x008e:
            monitor-exit(r2)
            return
        L_0x0090:
            monitor-exit(r2)     // Catch: all -> 0x0016
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.AwcnConfig.updateAccessPointStatus(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    private static int getMtuVal(String str, String str2, boolean z) {
        List<String> list;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4009fea3", new Object[]{str, str2, new Boolean(z)})).intValue();
        }
        try {
            ConcurrentHashMap<String, List<String>> concurrentHashMap = mtuWhiteList;
            if (concurrentHashMap != null && !concurrentHashMap.isEmpty() && (list = mtuWhiteList.get(str2)) != null && list.size() == 2) {
                if (z) {
                    str3 = list.get(1);
                } else {
                    str3 = list.get(0);
                }
                str = Integer.parseInt(str3);
                return str;
            }
            return -1;
        } catch (Throwable th) {
            ALog.e(TAG, "[getMtuVal] error", str, th, "host", str2);
            return -1;
        }
    }

    private static void initCoreSp(SharedPreferences sharedPreferences, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d4a0f7", new Object[]{sharedPreferences, context});
            return;
        }
        if (sharedPreferences == null) {
            try {
                sharedPreferences = SharePreferencesUtils.getCorePreferences(context);
            } catch (Throwable th) {
                isLaunchOptEnable = false;
                isCookieOptEnable = false;
                isRepeatThreadUseVirtualThread = true;
                isAmdcStrategyOptEnable = true;
                isNotAllowCookieOpened = true;
                isSslSpOptEnable = false;
                isAmdcStrategyUpdateEnable = false;
                cookieRetryTime = 10L;
                isStrategyCompareEnable = true;
                isAllowForceAmdcEnable = true;
                fgSendAmdcIntervalTime = 60000L;
                isAmdcLimitEnable = false;
                amdcLimitRate = 0.5d;
                isReqConfigEnable = false;
                isAllowForceFgAmdcEnable = false;
                isBgSocketEnable = true;
                isMTUConnectUpdate = false;
                isRemoteCriticalPlan = false;
                isAmdcParcelableOrangeEnable = false;
                isNetworkInfoEnable = false;
                isH3DetectStrategyFilterEnable = false;
                isStackUnknownBuildStrategyEnable = false;
                isStrategyRetryEnable = false;
                isStrategyTimelyUpdateEnable = false;
                isFixWriteStreamErrorEnable = true;
                isCancelHardExpiryEnable = false;
                isUniqueIdEnable = false;
                ALog.e(TAG, "AwcnConfig initCoreSp fail! ", null, "t", th);
                return;
            }
        }
        isLaunchOptEnable = sharedPreferences.getBoolean(NETWORK_LAUNCH_OPT_ENABLE, false);
        isCookieOptEnable = sharedPreferences.getBoolean(NETWORK_COOKIE_OPT_ENABLE, false);
        isRepeatThreadUseVirtualThread = sharedPreferences.getBoolean(NETWORK_REPEAT_THREAD_VIRTUAL_ENABLE, true);
        isAmdcStrategyOptEnable = sharedPreferences.getBoolean(NETWORK_AMDC_STRATEGY_OPT_ENABLE, true);
        isNotAllowCookieOpened = sharedPreferences.getBoolean(NETWORK_COOKIE_OPT_V2_OPENED, true);
        isSslSpOptEnable = sharedPreferences.getBoolean(NETWORK_SSL_SP_OPT_ENABLE, false);
        setAllowRetryUseLongLinkWhiteList(sharedPreferences.getString(ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_KEY, null));
        isAmdcStrategyUpdateEnable = sharedPreferences.getBoolean(NETWORK_AMDC_STRATEGY_UPDATE_ENABLE, false);
        set0RttHttp3WhiteList(sharedPreferences.getString(HTTP3_0RTT_WHITE_LIST_KEY, null));
        cookieRetryTime = sharedPreferences.getInt(NETWORK_COOKIE_RETRY_TIME, 10);
        isStrategyCompareEnable = sharedPreferences.getBoolean(NETWORK_STRATEGY_COMPARE_ENABLE, true);
        isAllowForceAmdcEnable = sharedPreferences.getBoolean(NETWORK_ALLOW_FORCE_AMDC_ENABLE, true);
        fgSendAmdcIntervalTime = sharedPreferences.getLong(FG_SEND_AMDC_INTERVAL_TIME, 60000L);
        setAmdcLimitEnable(sharedPreferences.getString(NETWORK_LIMIT_AMDC_ENABLE, null));
        isReqConfigEnable = sharedPreferences.getBoolean(NETWORK_REQ_CONFIG_ENABLE, false);
        isAllowForceFgAmdcEnable = sharedPreferences.getBoolean(NETWORK_FG_AMDC_ENABLE, false);
        isBgSocketEnable = sharedPreferences.getBoolean(NETWORK_BG_SOCKET_ENABLE, true);
        isMTUConnectUpdate = sharedPreferences.getBoolean(NETWORK_MTU_CONNECT_UPDATE_ENABLE, false);
        isRemoteCriticalPlan = sharedPreferences.getBoolean(NETWORK_REMOTE_CRITICAL_PLAN_ENABLE, false);
        setPresetHostHttp3WhiteList(sharedPreferences.getString(NETWORK_PRE_HOST_HTTP3_WHITE_LIST_KEY, null));
        setPresetHostHttp2WhiteList(sharedPreferences.getString(NETWORK_PRE_HOST_HTTP2_WHITE_LIST_KEY, null));
        setIpv6DowngradeWhiteList(sharedPreferences.getString(NETWORK_IPV6_DOWN_GRADE_HOST_WHITE_LIST_KEY, null));
        setHttp3DisabledWhiteList(sharedPreferences.getString(NETWORK_HTTP3_DISABLE_HOST_WHITE_LIST_KEY, null));
        isAmdcParcelableOrangeEnable = sharedPreferences.getBoolean(NETWORK_AMDC_PARCELBALE_ENABLE, false);
        isNetworkInfoEnable = sharedPreferences.getBoolean(NETWORK_INFO_ENABLE, false);
        isH3DetectStrategyFilterEnable = sharedPreferences.getBoolean(NETWORK_H3_STRATEGY_FILTER_ENABLE, false);
        isStackUnknownBuildStrategyEnable = sharedPreferences.getBoolean(NETWORK_STACK_UNKNOWN_BUILD_STRATEGY_ENABLE, false);
        isStrategyRetryEnable = sharedPreferences.getBoolean(NETWORK_STRATEGY_RETRY_ENABLE, false);
        isStrategyTimelyUpdateEnable = sharedPreferences.getBoolean(NETWORK_STRATEGY_TIMELY_UPDATE_ENABLE, false);
        isFixWriteStreamErrorEnable = sharedPreferences.getBoolean(NETWORK_FIX_WRITE_STREAM_ERROR_ENABLE, true);
        isCancelHardExpiryEnable = sharedPreferences.getBoolean(NETWORK_CANCEL_HARD_EXPIRY_ENABLE, false);
        isUniqueIdEnable = sharedPreferences.getBoolean(NETWORK_UNIQUE_ID_ENABLE, false);
    }

    public static boolean isPrefixInArrayList(String str, ConcurrentHashMap<String, List<String>> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32f4e3db", new Object[]{str, concurrentHashMap})).booleanValue();
        }
        if (!(str == null || TextUtils.isEmpty(str) || concurrentHashMap == null)) {
            for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                if (str.startsWith(entry.getKey())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void setDnsOptWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6828a4c", new Object[]{str});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "setDnsOptWhiteBiz", null, "White List", str);
        }
        dnsNavTasksList = setArrayListMatchUrl(str);
    }
}
