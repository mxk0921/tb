package anet.channel.config;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.statist.OrangeConfigStatistic;
import anet.channel.strategy.SchemeGuesser;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.SharePreferencesUtils;
import anetwork.channel.config.IRemoteConfig;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.http.NetworkSdkSetting;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import tb.t2o;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OrangeConfigImpl implements IRemoteConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AMDC_CONTROL_LIST = "amdc_control_list";
    private static final String AMDC_CONTROL_MODE = "amdc_control_mode";
    private static final String AMDC_GROUP = "amdc";
    private static final String AMDC_UPDATE_MODE_ENABLE_SWITCH = "amdc_update_mode_enable_switch";
    public static final String NETWORK_ACCEPT_ENCODE_WHITE_LIST_SWITCH = "network_accept_encode_domain_write_switch";
    private static final String NETWORK_ACCESS_POINT_SWITCH = "network_access_point_switch";
    private static final String NETWORK_ACCS_SESSION_BG_SWITCH = "network_accs_session_bg_switch";
    private static final String NETWORK_ALLOW_ADD_AB_HEADER_IN_MTOP = "network_allow_add_ab_header_in_mtop";
    private static final String NETWORK_ALLOW_CONVERT_IPV4_TO_IPV6_ENABLE_SWITCH = "network_allow_convert_ipv4_to_ipv6_enable_switch";
    private static final String NETWORK_ALLOW_FORCE_AMDC_SWITCH = "network_allow_force_amdc_switch";
    private static final String NETWORK_ALLOW_NET_FULL_LOW_LATENCY_SWITCH = "network_allow_net_full_low_latency_switch";
    public static final String NETWORK_ALLOW_NO_COOKIE_WHITE_LIST_SWITCH = "network_allow_no_cookie_white_list_switch";
    private static final String NETWORK_ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_SWITCH = "network_allow_retry_use_long_link_white_list_switch";
    private static final String NETWORK_ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED = "network_allow_spdy_when_bind_service_failed";
    private static final String NETWORK_AMDC_LIGHT_TIME_SWITCH = "network_amdc_light_time_switch";
    private static final String NETWORK_AMDC_LOCATION_RETRY_ENABLE_SWITCH = "network_amdc_location_retry_switch";
    public static final String NETWORK_AMDC_PARCELBALE_ENABLE_SWITCH = "network_amdc_parcelable_switch";
    private static final String NETWORK_AMDC_PRESET_HOSTS = "network_amdc_preset_hosts";
    private static final String NETWORK_AMDC_STRATEGY_OPT_SWITCH = "network_amdc_stategy_opt_switch";
    private static final String NETWORK_AMDC_STRATEGY_THRESHOLD_SWITCH = "network_amdc_strategy_threshold_switch";
    private static final String NETWORK_AMDC_STRATEGY_UPDATE_SWITCH = "network_amdc_strategy_update_switch";
    private static final String NETWORK_AMDC_TIMEOUT_SWITCH = "network_amdc_timeout_switch";
    private static final String NETWORK_ANALYSIS_MONITOR = "network_analysis_monitor_switch";
    private static final String NETWORK_BG_NOT_FORCE_CELL_OPT_ENABLE_SWITCH = "network_bg_not_force_cell_opt_switch";
    private static final String NETWORK_BG_SOCKET_ENABLE_SWITCH = "network_bg_socket_switch";
    private static final String NETWORK_BIND_SERVICE_OPTIMISE = "network_bind_service_optimize";
    private static final String NETWORK_BIZ_MONITOR_REQUESTS = "network_biz_monitor_requests";
    private static final String NETWORK_BIZ_WHITE_LIST_BG = "network_biz_white_list_bg";
    public static final String NETWORK_CANCEL_HARD_EXPIRY_ENABLE_SWITCH = "network_cancel_hard_expiry_enable_switch";
    private static final String NETWORK_CHANGE_HTTP3_WHITE_LIST_SWITCH = "network_change_http3_white_list_switch";
    private static final String NETWORK_CHANGE_THRESHOLD_TIME = "network_change_threshold_time";
    private static final String NETWORK_CHANNEL_AMDC_TTL_KEY_SWITCH = "network_channel_amdc_ttl_switch";
    private static final String NETWORK_CHANNEL_LOCAL_INSTANCE_ENABLE_SWITCH = "network_channel_local_instance_enable_switch";
    private static final String NETWORK_COMPLEX_CONNECT_ENABLE_SWITCH = "network_complex_connect_enable_switch";
    private static final String NETWORK_COMPLEX_CONNECT_WHITE_LIST = "network_complex_connect_white_list";
    private static final String NETWORK_COOKIE_HEADER_REDUNDANT_FIX = "network_cookie_header_redundant_fix";
    public static final String NETWORK_COOKIE_LOG_HOST_WHITE_LIST_SWITCH = "network_cookie_log_domain_write_list_switch";
    private static final String NETWORK_COOKIE_OPT_SWITCH = "network_cookie_opt_switch";
    private static final String NETWORK_COOKIE_RETRY_TIME_SWITCH = "network_cookie_retry_time_switch";
    private static final String NETWORK_DECOMPRESS_SWITCH = "network_decompress_switch";
    private static final String NETWORK_DELAY_COMPLEX_CONNECT = "network_delay_complex_connect";
    private static final String NETWORK_DELAY_RETRY_REQUEST_NO_NETWORK = "network_delay_retry_request_no_network";
    private static final String NETWORK_DETECT_CENTER_ENABLE_SWITCH = "network_detect_center_enable_switch";
    private static final String NETWORK_DETECT_ENABLE_SWITCH = "network_detect_enable_switch";
    public static final String NETWORK_DETECT_H3_HOST_WHITE_LIST_SWITCH = "network_h3_detect_domain_write_list_switch";
    private static final String NETWORK_DIAGNOSIS_ENABLE_SWITCH = "network_diagnosis_enable";
    private static final String NETWORK_DNS_WHITE_LIST = "network_dns_biz_white_list";
    private static final String NETWORK_EAGAGIN_OPTIMIZE_SWITCH = "network_eagain_enable_switch";
    private static final String NETWORK_EMPTY_SCHEME_HTTPS_SWITCH = "network_empty_scheme_https_switch";
    private static final String NETWORK_EXCEPTION_DETECT_URL = "network_exception_detect_url";
    private static final String NETWORK_FALCO_ID_ENABLE_SWITCH = "network_falco_id_enable_switch";
    private static final String NETWORK_FALCO_ID_WHITE_LIST = "network_falco_id_white_list";
    private static final String NETWORK_FAST_DEGRADE_WHITE_LIST = "network_fast_degrade_white_list";
    private static final String NETWORK_FG_AMDC_SWITCH = "network_fg_amdc_switch";
    private static final String NETWORK_FG_SEND_AMDC_INTERVAL_TIME_SWITCH = "network_fg_send_amdc_interval_time_switch";
    public static final String NETWORK_FIX_WRITE_STREAM_ERROR_ENABLE_SWITCH = "network_fix_write_stream_error_enable_switch";
    private static final String NETWORK_FORBID_NEXT_LUANCH_OPTIMIZE = "network_forbid_next_launch_optimize";
    private static final String NETWORK_GET_SESSION_ASYNC_SWITCH = "network_get_session_async_switch";
    private static final String NETWORK_GZIP_DECOMPRESS_SWITCH = "network_gzip_close_decompress_switch";
    public static final String NETWORK_H3_STRATEGY_FILTER_ENABLE_SWITCH = "network_h3_strategy_filter_enable";
    private static final String NETWORK_HANDOVER_SIGNAL_SWITCH = "network_handover_signal_switch";
    private static final String NETWORK_HEADER_IGNORE_CASE_ENABLE_SWITCH = "network_header_ignore_case_enable_switch";
    private static final String NETWORK_HORSE_RACE_SWITCH = "network_horse_race_switch";
    private static final String NETWORK_HTTP3_0RTT_WHITE_LIST_SWITCH = "network_http3_0rtt_white_list_switch";
    private static final String NETWORK_HTTP3_1RTT_WHITE_LIST_SWITCH = "network_http3_1rtt_white_list_switch";
    private static final String NETWORK_HTTP3_BLACK_LIST_SWITCH = "network_http3_black_list_switch";
    private static final String NETWORK_HTTP3_DETECT_VALID_TIME = "network_http3_detect_valid_time";
    public static final String NETWORK_HTTP3_DISABLE_HOST_WHITE_LIST_SWITCH = "network_http3_disable_host_white_list";
    private static final String NETWORK_HTTP3_ENABLE_SWITCH = "network_http3_enable_switch";
    private static final String NETWORK_HTTP3_OPT_WHITE_LIST_SWITCH = "network_http3_opt_white_list_switch";
    private static final String NETWORK_HTTP3_PRE_HOST_ENABLE_SWITCH = "network_http3_pre_host_enable_switch";
    private static final String NETWORK_HTTP3_RECONNECT_ENABLE_SWITCH = "network_http3_reconnect_enable_switch";
    private static final String NETWORK_HTTP3_VIP_BLACK_LIST_SWITCH = "network_http3_vip_black_list_switch";
    private static final String NETWORK_HTTP3_WHITE_LIST_SWITCH = "network_http3_white_list_switch";
    private static final String NETWORK_HTTPS_SNI_ENABLE_SWITCH = "network_https_sni_enable_switch";
    private static final String NETWORK_HTTP_CACHE_CONFIG = "network_http_cache_config";
    private static final String NETWORK_HTTP_CACHE_FLAG = "network_http_cache_flag";
    private static final String NETWORK_HTTP_CACHE_SWITCH = "network_http_cache_switch";
    private static final String NETWORK_HTTP_DETECT_WHITE_LIST = "network_http_detect_white_list";
    private static final String NETWORK_HTTP_DNS_NOTIFY_WHITE_LIST = "network_http_dns_notify_white_list";
    private static final String NETWORK_HTTP_SESSION_WAIT_TIME = "network_http_session_wait_time";
    public static final String NETWORK_INFO_ENABLE_SWITCH = "network_info_enable_switch";
    private static final String NETWORK_INTERCEPTOR_OPT_SWITCH = "network_interceptor_opt_switch";
    private static final String NETWORK_IPV6_DETECT_ENABLE_SWITCH = "network_ipv6_detect_enable_switch";
    private static final String NETWORK_IPV6_DETECT_OPT_SWITCH = "network_ipv6_detect_opt_switch";
    public static final String NETWORK_IPV6_DOWN_GRADE_HOST_WHITE_LIST_SWITCH = "network_ipv6_down_grade_host_white_list";
    private static final String NETWORK_IPV6_GLOBAL_ENABLE_SWITCH = "network_ipv6_global_enable_swtich";
    private static final String NETWORK_IPV6_ONLY_ENABLE_SWITCH = "network_ipv6_only_enable_switch";
    private static final String NETWORK_IPV6_STACK_RECTIFICATION_ENABLE_SWITCH = "network_ipv6_rectification_enable_switch";
    private static final String NETWORK_LAST_STATUS_NONE_SWITCH = "network_last_status_none_opt_switch";
    private static final String NETWORK_LAUNCH_OPT_SWITCH = "network_launsh_opt_switch";
    private static final String NETWORK_LAZY_LOAD_TNET_SECURITY_TIME_SWITCH = "network_lazy_load_tnet_sec_time_switch";
    private static final String NETWORK_LIMIT_AMDC_SWITCH = "network_limit_amdc_switch";
    public static final String NETWORK_LONG_AMDC_WHITE_LIST_SWITCH = "network_long_amdc_white_list_switch";
    private static final String NETWORK_LONG_REQUEST_MONITOR_ENABLE_SWITCH = "network_long_request_monitor_enable_switch";
    private static final String NETWORK_LOW_LATENCY_WHITE_LIST_SWITCH = "network_low_latency_url_white_list";
    public static final String NETWORK_LUNCH_AFTER_AMDC_WHITE_LIST_SWITCH = "network_lunch_after_amdc_white_list_switch";
    private static final String NETWORK_METRICS_TIME_KEY_SWITCH = "network_metrics_time_config_switch";
    private static final String NETWORK_MONITOR_REQUESTS = "network_monitor_requests";
    private static final String NETWORK_MPQUIC_ENABLE_SWITCH = "network_mpquic_enable_switch";
    public static final String NETWORK_MTOP_AMDC_WHITE_LIST_SWITCH = "network_mtop_amdc_white_list_switch";
    private static final String NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_SWITCH = "network_mtop_interceptor_host_white_list_switch";
    private static final String NETWORK_MTU_CONNECT_UPDATE_ENABLE_SWITCH = "network_mtu_connect_update_switch";
    private static final String NETWORK_MTU_DETECT_ENABLE_SWITCH = "network_mtu_detect_enable_switch";
    private static final String NETWORK_MTU_WHITE_LIST_SWITCH = "network_mtu_white_list";
    private static final String NETWORK_MTU_WIFI_OPT_ENABLE_SWITCH = "network_mtu_wifi_opt_enable_switch";
    private static final String NETWORK_MULTI_CONNECT_SWITCH = "network_multi_connect_switch";
    private static final String NETWORK_MULTI_CONNECT_WHITE_LIST_SWITCH = "network_multi_connect_white_list_switch";
    private static final String NETWORK_MULTI_PATH_AB_WHITE_LIST = "network_multi_path_ab_white_list";
    private static final String NETWORK_MULTI_PATH_BIZ_WHITE_LIST = "network_multi_path_biz_white_list";
    private static final String NETWORK_MULTI_PATH_HARMONY_WHITE_LIST = "network_multi_path_harmony_white_list";
    private static final String NETWORK_MULTI_PATH_MONITOR_ENABLE_SWITCH = "network_multi_path_monitor_enable_switch";
    private static final String NETWORK_MULTI_PATH_TOAST_TIRE_TIME = "network_multi_path_toast_tire_time";
    private static final String NETWORK_MULTI_PATH_TRIGGER_TIME = "network_multi_path_trigger_time";
    private static final String NETWORK_MULTI_PATH_URL_WHITE_LIST = "network_multi_path_url_white_list";
    private static final String NETWORK_MULTI_PATH_USER_TOAST_TEXT = "network_multi_path_user_toast_text";
    private static final String NETWORK_NAVIGATOR_TASK_GROUP = "network_navigator_task";
    private static final String NETWORK_NORMAL_THREAD_POOL_EXECUTOR_SIZE = "network_normal_thread_pool_executor_size";
    private static final String NETWORK_NOT_ALLOW_COOKIE_OPT_V2_SWITCH = "network_not_allow_cookie_opt_v2_switch";
    private static final String NETWORK_OKHTTP_HOST_WHITE_LIST = "network_okhttp_host_white_list";
    private static final String NETWORK_OKHTTP_PRE_BUILD_LIST = "network_okhttp_pre_build_list";
    private static final String NETWORK_OKHTTP_SWITCH = "network_okhttp_switch";
    public static final String NETWORK_PRE_HOST_HTTP2_WHITE_LIST_SWITCH = "network_pre_host_HTTP2_white_list_switch";
    public static final String NETWORK_PRE_HOST_HTTP3_WHITE_LIST_SWITCH = "network_pre_host_HTTP3_white_list_switch";
    private static final String NETWORK_PRE_HOST_MCC_ENABLE_SWITCH = "network_pre_host_mcc_enable_switch";
    public static final String NETWORK_PRE_HOST_WHITE_LIST_SWITCH = "network_pre_host_white_list_switch";
    private static final String NETWORK_PRE_HOT_OPT_SWITCH = "network_pre_hot_opt_switch";
    private static final String NETWORK_PRE_SESSION_OPT_SWITCH = "network_pre_session_opt_switch";
    private static final String NETWORK_PRE_SESSION_WHITE_LIST_SWITCH = "network_pre_session_white_list_switch";
    private static final String NETWORK_PRIORITY_UPDATE_AMDC_SWITCH = "network_priority_update_amdc_switch";
    private static final String NETWORK_PROCESS_NAME_UPDATE_ENABLE_SWITCH = "network_process_name_update_enable_switch";
    private static final String NETWORK_QOS_BIZ_WHITE_LIST = "network_qos_biz_white_list";
    private static final String NETWORK_QOS_HOST_WHITE_LIST = "network_qos_host_white_list";
    private static final String NETWORK_RANGE_BOOST_SWITCH = "network_range_boost_switch";
    private static final String NETWORK_REDUNDANT_SESSION_FIX_ENABLE = "network_redundant_session_fix_switch";
    private static final String NETWORK_REMOTE_CRITICAL_PLAN_SWITCH = "network_remote_critical_plan_switch";
    private static final String NETWORK_REPEAT_THREAD_VIRTUAL_SWITCH = "network_repeat_thread_virtual_switch";
    private static final String NETWORK_REPLACE_STRATEGY_ENABLE_SWITCH = "network_replace_strategy_opt_switch";
    private static final String NETWORK_REQUEST_FORBIDDEN_BG = "network_request_forbidden_bg";
    private static final String NETWORK_REQUEST_STATISTIC_SAMPLE_RATE = "network_request_statistic_sample_rate";
    private static final String NETWORK_REQ_CONFIG_ENABLE_SWITCH = "network_req_config_switch";
    private static final String NETWORK_REQ_FEC_SIZE_OPT_SWITCH = "network_req_fec_size_opt_enable_switch";
    public static final String NETWORK_REQ_FEC_SIZE_WHITE_LIST_SWITCH = "network_req_fec_size_white_list_switch";
    private static final String NETWORK_REQ_FORCE_CELL_ENABLE_SWITCH = "network_req_force_cell_switch";
    private static final String NETWORK_REQ_FORCE_CELL_WHITE_LIST_SWITCH = "network_req_force_cell_write_list_switch";
    public static final String NETWORK_REQ_UP_FEC_SIZE_WHITE_LIST_SWITCH = "network_req_fec_up_size_white_list_switch";
    private static final String NETWORK_RESPONSE_BUFFER_SWITCH = "network_response_buffer_switch";
    private static final String NETWORK_RETRY_USE_LONG_LINK_SWITCH = "network_retry_use_long_link_enable_switch";
    private static final String NETWORK_RTT_DETECTOR_ENABLE_SWITCH = "network_rtt_detector_enable_switch";
    private static final String NETWORK_RUM_PARAM_LIST_SWITCH = "network_rum_params_list";
    private static final String NETWORK_SAVE_POWER_TIME_SWITCH = "network_save_power_time_switch";
    public static final String NETWORK_SCENE_BWE_ESTIMATOR_LIST_SWITCH = "network_scene_bwe_estimator_list_switch";
    private static final String NETWORK_SDK_GROUP = "networkSdk";
    private static final String NETWORK_SEND_CONNECT_INFO_BY_SERVICE = "network_send_connect_info_by_service";
    private static final String NETWORK_SESSION_OPT_SWITCH = "network_session_opt_switch";
    private static final String NETWORK_SESSION_PRESET_HOSTS = "network_session_preset_hosts";
    private static final String NETWORK_SESSION_WAIT_TIME = "network_session_wait_time";
    private static final String NETWORK_SHORT_LINK_ENABLE_SWITCH = "network_short_link_opt_switch";
    private static final String NETWORK_SMOOTH_RECONNECT_OPT_SWITCH = "network_smooth_reconnect_opt_switch";
    private static final String NETWORK_SMOOTH_RECONNECT_SWITCH = "network_smooth_reconnect_switch";
    private static final String NETWORK_SOCKET_BOOST_HOST_LIST = "network_socket_boost_host_list";
    private static final String NETWORK_SPDY_ENABLE_SWITCH = "network_spdy_enable_switch";
    private static final String NETWORK_SPDY_OFFLINE_SWITCH = "network_spdy_offline_switch";
    private static final String NETWORK_SSL_SP_OPT_SWITCH = "network_ssl_sp_opt_switch";
    public static final String NETWORK_STACK_UNKNOWN_BUILD_STRATEGY_ENABLE_SWITCH = "network_stack_unknown_build_strategy_enable_switch";
    private static final String NETWORK_STRATEGY_COMPARE_ENABLE_SWITCH = "network_strategy_compare_enable_switch";
    public static final String NETWORK_STRATEGY_RETRY_ENABLE_SWITCH = "network_strategy_retry_enable_switch";
    public static final String NETWORK_STRATEGY_TIMELY_UPDATE_ENABLE_SWITCH = "network_strategy_timely_update_enable_switch";
    public static final String NETWORK_STRATEGY_TIMELY_UPDATE_HOST_WHITE_LIST_SWITCH = "network_strategy_timely_update_write_list";
    private static final String NETWORK_SUPPORT_SET_WAIT_TIME_OUT_SWITCH = "network_support_set_wait_timeout_switch";
    public static final String NETWORK_SUPPORT_STREAMING_PARSER_WHITE_LIST = "network_support_stream_parser_white_list";
    private static final String NETWORK_TNET_FORCE_PUBKEY_SWITCH = "network_tnet_force_pubkey_switch";
    private static final String NETWORK_TUNNEL_ENABLE_SWITCH = "network_tunnel_enable_switch";
    public static final String NETWORK_UNIQUE_ID_ENABLE_SWITCH = "network_unique_id_enable_switch";
    private static final String NETWORK_UPLINK_COMPRESS_HOST_WHITE_LIST_SWITCH = "network_uplink_compress_host_white_list";
    private static final String NETWORK_UPLINK_COMPRESS_URL_WHITE_LIST_SWITCH = "network_uplink_compress_url_white_list";
    private static final String NETWORK_UPLINK_ENCODE_SWITCH = "network_uplink_encode_switch";
    private static final String NETWORK_UPLINK_ENCODE_UPDATE_SWITCH = "network_uplink_encode_update_switch";
    private static final String NETWORK_URL_DEGRADE_LIST = "network_url_degrade_list";
    public static final String NETWORK_URL_MONITOR_REQUEST_WHITE_LIST_SWITCH = "network_url_monitor_request_white_list_switch";
    private static final String NETWORK_URL_WHITE_LIST_BG = "network_url_white_list_bg";
    private static final String NETWORK_VPN_CHANGE_DETECT_ENABLE_SWITCH = "network_vpn_change_detect_switch";
    private static final String NETWORK_VPN_DETECT_RACING_ENABLE_SWITCH = "network_vpn_detect_racing_switch";
    private static final String NETWORK_VPN_FAST_DEGRADE_BIZID_WHITE_LIST_SWITCH = "network_vpn_fast_degrade_bizid_white_list_switch";
    private static final String NETWORK_VPN_FAST_DEGRADE_HOST_WHITE_LIST_SWITCH = "network_vpn_fast_degrade_host_white_list_switch";
    private static final String NETWORK_VPN_FAST_DEGRADE_SWITCH = "network_vpn_fast_degrade_switch";
    private static final String NETWORK_VPN_FAST_DEGRADE_TIME_SWITCH = "network_vpn_fast_degrade_time_switch";
    private static final String NETWORK_VPN_FG_CHANGE_COUNT_SWITCH = "network_vpn_fg_change_count_switch";
    private static final String NETWORK_VPN_LISTEN_TIME_INTERVAL_SWITCH = "network_vpn_listen_time_interval_switch";
    private static final String NETWORK_VPN_OPT_ENABLE_SWITCH = "network_vpn_opt_switch";
    private static final String NETWORK_VPN_PROXY_SESSION_WHITE_LIST_SWITCH = "network_vpn_proxy_session_white_list_switch";
    private static final String NETWORK_WAIT_THREAD_COUNT_CONFIG_SWITCH = "network_wait_thread_count_config_new_switch";
    private static final String NETWORK_WIDGET_LOCAL_INSTANCE_ENABLE_SWITCH = "network_widget_local_instance_enable_switch";
    private static final String NETWORK_WIFI_DETECT_OPT_ENABLE_SWITCH = "network_wifi_detect_opt_switch";
    public static final String NETWORK_WIFI_FG_FORCE_CELL_CONFIG_LIST_SWITCH = "network_wifi_fg_force_cell_config_list_switch";
    private static final String NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE_SWITCH = "network_wifi_fg_force_cell_opt_switch";
    public static final String NETWORK_WIFI_FG_FORCE_CELL_WHITE_LIST_SWITCH = "network_wifi_fg_force_cell_white_list_switch";
    private static final String NETWORK_XQUIC_CONG_CONTROL = "network_xquic_cong_control";
    private static final String NETWORK_XQUIC_REMOTE_SWITCH = "network_xquic_remote_switch";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_SWITCH = "network_zstd_dict_decompress_channel_switch";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_SWITCH = "network_zstd_dict_decompress_mtop_switch";
    private static final String NETWORK_ZSTD_DICT_DECOMPRESS_SWITCH = "network_zstd_dict_decompress_switch";
    private static final String NETWORK_ZSTD_DICT_WHITE_LIST_SWITCH = "network_zstd_dict_decompress_white_list";
    private static final String NETWORK_ZSTD_STREAM_DECOMPRESS_SWITCH = "network_zstd_stream_decompress_switch";
    private static final String NETWOTK_BG_FORBID_REQUEST_THRESHOLD = "network_bg_forbid_request_threshold";
    private static final String TAG = "awcn.OrangeConfigImpl";
    private static boolean mOrangeValid;

    static {
        t2o.a(607125575);
        t2o.a(607126030);
        mOrangeValid = false;
        try {
            IpChange ipChange = OrangeConfig.$ipChange;
            mOrangeValid = true;
        } catch (Exception unused) {
            mOrangeValid = false;
        }
    }

    private void updateNetworkConfig(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60;
        String str61;
        String str62;
        String str63;
        String str64;
        String str65;
        String str66;
        String str67;
        String str68;
        String str69;
        String str70;
        String str71;
        String str72;
        String str73;
        String str74;
        String str75;
        String str76;
        String str77;
        String str78;
        String str79;
        String str80;
        String str81;
        String str82;
        String str83;
        String str84;
        String str85;
        String str86;
        String str87;
        String str88;
        String str89;
        String str90;
        String str91;
        String str92;
        String str93;
        String str94;
        String str95;
        String str96;
        String str97;
        String str98;
        String str99;
        String str100;
        String str101;
        String str102;
        String str103;
        String str104;
        String str105;
        String str106;
        String str107;
        String str108;
        String str109;
        String str110;
        String str111;
        String str112;
        String str113;
        String str114;
        String str115;
        String str116;
        String str117;
        String str118;
        String str119;
        String str120;
        String str121;
        String str122;
        String str123;
        String str124;
        String str125;
        String str126;
        String str127;
        String str128;
        String str129;
        String str130;
        String str131;
        String str132;
        String str133;
        String str134;
        String str135;
        String str136;
        String str137;
        String str138;
        String str139;
        String str140;
        String str141;
        String str142;
        String str143;
        String str144;
        String str145;
        String str146;
        String str147;
        String str148;
        String str149;
        String str150;
        String str151;
        String str152;
        String str153;
        String str154;
        String str155;
        String str156;
        String str157;
        String str158;
        String str159;
        String str160;
        String str161;
        String str162;
        String str163;
        String str164;
        String str165;
        String str166;
        String str167;
        String str168;
        String str169;
        String str170;
        String str171;
        String str172;
        String str173;
        String str174;
        String str175;
        String str176;
        String str177;
        String str178;
        String str179;
        String str180;
        String str181;
        String str182;
        String str183;
        String str184;
        String str185;
        String str186;
        String str187;
        String str188;
        String str189;
        String str190;
        String str191;
        String str192;
        String str193;
        String str194;
        String str195;
        String str196;
        String str197;
        String str198;
        String str199;
        String str200;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae09018", new Object[]{this, str});
            return;
        }
        try {
            SchemeGuesser.getInstance().setEnabled(Boolean.valueOf(getConfig(str, NETWORK_EMPTY_SCHEME_HTTPS_SWITCH, "true")).booleanValue());
            str2 = AwcnConfig.VPN_FAST_DEGRADE_BIZID_WHITE_LIST_KEY;
            str3 = AwcnConfig.REQ_FORCE_CELL_WHITE_LIST_KEY;
        } catch (Exception e) {
            str2 = AwcnConfig.VPN_FAST_DEGRADE_BIZID_WHITE_LIST_KEY;
            str3 = AwcnConfig.REQ_FORCE_CELL_WHITE_LIST_KEY;
            ALog.e(TAG, "setEnabled fail", null, "e", e);
        }
        try {
            NetworkConfigCenter.setSpdyEnabled(Boolean.valueOf(getConfig(str, NETWORK_SPDY_ENABLE_SWITCH, "true")).booleanValue());
        } catch (Exception e2) {
            ALog.e(TAG, "setSpdyEnabled fail", null, "e", e2);
        }
        try {
            NetworkConfigCenter.setHttpCacheEnable(Boolean.valueOf(getConfig(str, NETWORK_HTTP_CACHE_SWITCH, "true")).booleanValue());
            str4 = null;
        } catch (Exception e3) {
            str4 = null;
            ALog.e(TAG, "setHttpCacheEnable fail", null, "e", e3);
        }
        try {
            String config = getConfig(str, NETWORK_HTTP_CACHE_FLAG, str4);
            if (config != null) {
                NetworkConfigCenter.setCacheFlag(Long.valueOf(config).longValue());
            }
        } catch (Exception e4) {
            ALog.e(TAG, "setCacheFlag fail", null, "e", e4);
        }
        try {
            AwcnConfig.setHttpsSniEnable(Boolean.valueOf(getConfig(str, NETWORK_HTTPS_SNI_ENABLE_SWITCH, "true")).booleanValue());
            str5 = null;
        } catch (Exception e5) {
            str5 = null;
            ALog.e(TAG, "setHttpsSniEnable fail", null, "e", e5);
        }
        try {
            String config2 = getConfig(str, NETWORK_ACCS_SESSION_BG_SWITCH, str5);
            if (!TextUtils.isEmpty(config2)) {
                AwcnConfig.setAccsSessionCreateForbiddenInBg(Boolean.valueOf(config2).booleanValue());
            }
        } catch (Exception e6) {
            ALog.e(TAG, "setAccsSessionCreateForbiddenInBg fail", null, "e", e6);
        }
        try {
            NetworkConfigCenter.setRequestStatisticSampleRate(Integer.valueOf(getConfig(str, NETWORK_REQUEST_STATISTIC_SAMPLE_RATE, "10000")).intValue());
            str6 = null;
        } catch (Exception e7) {
            str6 = null;
            ALog.e(TAG, "setRequestStatisticSampleRate fail", null, "e", e7);
        }
        try {
            String config3 = getConfig(str, NETWORK_REQUEST_FORBIDDEN_BG, str6);
            if (!TextUtils.isEmpty(config3)) {
                NetworkConfigCenter.setBgRequestForbidden(Boolean.valueOf(config3).booleanValue());
            }
            str7 = null;
        } catch (Exception e8) {
            str7 = null;
            ALog.e(TAG, "setBgRequestForbidden fail", null, "e", e8);
        }
        try {
            NetworkConfigCenter.updateWhiteListMap(getConfig(str, NETWORK_URL_WHITE_LIST_BG, str7));
            str8 = null;
        } catch (Exception e9) {
            str8 = null;
            ALog.e(TAG, "updateWhiteListMap fail", null, "e", e9);
        }
        try {
            String config4 = getConfig(str, NETWORK_BIZ_WHITE_LIST_BG, str8);
            if (!TextUtils.isEmpty(config4)) {
                NetworkConfigCenter.updateBizWhiteList(config4);
            }
            str9 = null;
        } catch (Exception e10) {
            str9 = null;
            ALog.e(TAG, "updateBizWhiteList fail", null, "e", e10);
        }
        try {
            String config5 = getConfig(str, NETWORK_AMDC_PRESET_HOSTS, str9);
            if (!TextUtils.isEmpty(config5)) {
                AwcnConfig.setAmdcPresetHosts(config5);
            }
        } catch (Exception e11) {
            ALog.e(TAG, "setAmdcPresetHosts fail", null, "e", e11);
        }
        try {
            AwcnConfig.setHorseRaceEnable(Boolean.valueOf(getConfig(str, NETWORK_HORSE_RACE_SWITCH, "true")).booleanValue());
            str10 = null;
        } catch (Exception e12) {
            str10 = null;
            ALog.e(TAG, "setHorseRaceEnable fail", null, "e", e12);
        }
        try {
            String config6 = getConfig(str, NETWORK_HTTP3_ENABLE_SWITCH, str10);
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config6)) {
                boolean booleanValue = Boolean.valueOf(config6).booleanValue();
                edit.putBoolean(AwcnConfig.HTTP3_ENABLE, booleanValue);
                edit.apply();
                AwcnConfig.setHttp3Enable(booleanValue);
            } else {
                edit.remove(AwcnConfig.HTTP3_ENABLE);
                edit.apply();
            }
        } catch (Exception e13) {
            ALog.e(TAG, "setHttp3Enable fail", null, "e", e13);
        }
        try {
            NetworkConfigCenter.setResponseBufferEnable(Boolean.valueOf(getConfig(str, NETWORK_RESPONSE_BUFFER_SWITCH, "true")).booleanValue());
            str11 = null;
        } catch (Exception e14) {
            str11 = null;
            ALog.e(TAG, "setResponseBufferEnable fail", null, "e", e14);
        }
        try {
            String config7 = getConfig(str, NETWORK_GET_SESSION_ASYNC_SWITCH, str11);
            if (!TextUtils.isEmpty(config7)) {
                boolean booleanValue2 = Boolean.valueOf(config7).booleanValue();
                SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
                edit2.putBoolean(NetworkConfigCenter.SESSION_ASYNC_OPTIMIZE, booleanValue2);
                edit2.apply();
            }
            str12 = null;
        } catch (Exception e15) {
            str12 = null;
            ALog.e(TAG, "network_get_session_async_switch fail", null, "e", e15);
        }
        try {
            String config8 = getConfig(str, NETWOTK_BG_FORBID_REQUEST_THRESHOLD, str12);
            if (!TextUtils.isEmpty(config8)) {
                int intValue = Integer.valueOf(config8).intValue();
                if (intValue < 0) {
                    intValue = 0;
                }
                NetworkConfigCenter.setBgForbidRequestThreshold(intValue);
            }
            str13 = null;
        } catch (Exception e16) {
            str13 = null;
            ALog.e(TAG, "setBgForbidRequestThreshold fail", null, "e", e16);
        }
        try {
            String config9 = getConfig(str, NETWORK_NORMAL_THREAD_POOL_EXECUTOR_SIZE, str13);
            if (!TextUtils.isEmpty(config9)) {
                ThreadPoolExecutorFactory.setNormalExecutorPoolSize(Integer.valueOf(config9).intValue());
            }
            str14 = null;
        } catch (Exception e17) {
            str14 = null;
            ALog.e(TAG, "setNormalExecutorPoolSize fail", null, "e", e17);
        }
        try {
            String config10 = getConfig(str, NETWORK_MONITOR_REQUESTS, str14);
            if (!TextUtils.isEmpty(config10)) {
                NetworkConfigCenter.setMonitorRequestList(config10);
            }
            str15 = null;
        } catch (Exception e18) {
            str15 = null;
            ALog.e(TAG, "setMonitorRequestList fail", null, "e", e18);
        }
        try {
            String config11 = getConfig(str, NETWORK_BIZ_MONITOR_REQUESTS, str15);
            if (!TextUtils.isEmpty(config11)) {
                NetworkConfigCenter.setMonitorRequestBizList(config11);
            }
            str16 = null;
        } catch (Exception e19) {
            str16 = null;
            ALog.e(TAG, "setMonitorRequestBizList fail", null, "e", e19);
        }
        try {
            String config12 = getConfig(str, NETWORK_SESSION_PRESET_HOSTS, str16);
            if (!TextUtils.isEmpty(config12)) {
                AwcnConfig.registerPresetSessions(config12);
            }
            str17 = null;
        } catch (Exception e20) {
            str17 = null;
            ALog.e(TAG, "registerPresetSessions fail", null, "e", e20);
        }
        try {
            String config13 = getConfig(str, NETWORK_URL_DEGRADE_LIST, str17);
            if (!TextUtils.isEmpty(config13)) {
                NetworkConfigCenter.setDegradeRequestList(config13);
            }
            str18 = null;
        } catch (Exception e21) {
            str18 = null;
            ALog.e(TAG, "setDegradeRequestList fail", null, "e", e21);
        }
        try {
            String config14 = getConfig(str, NETWORK_DELAY_RETRY_REQUEST_NO_NETWORK, str18);
            if (!TextUtils.isEmpty(config14)) {
                NetworkConfigCenter.setRequestDelayRetryForNoNetwork(Boolean.valueOf(config14).booleanValue());
            }
            str19 = null;
        } catch (Exception e22) {
            str19 = null;
            ALog.e(TAG, "setRequestDelayRetryForNoNetwork fail", null, "e", e22);
        }
        try {
            String config15 = getConfig(str, NETWORK_BIND_SERVICE_OPTIMISE, str19);
            if (!TextUtils.isEmpty(config15)) {
                boolean booleanValue3 = Boolean.valueOf(config15).booleanValue();
                SharedPreferences.Editor edit3 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
                edit3.putBoolean(NetworkConfigCenter.SERVICE_OPTIMIZE, booleanValue3);
                edit3.apply();
            }
            str20 = null;
        } catch (Exception e23) {
            str20 = null;
            ALog.e(TAG, "network_bind_service_optimize fail", null, "e", e23);
        }
        try {
            String config16 = getConfig(str, NETWORK_FORBID_NEXT_LUANCH_OPTIMIZE, str20);
            if (!TextUtils.isEmpty(config16)) {
                boolean booleanValue4 = Boolean.valueOf(config16).booleanValue();
                SharedPreferences.Editor edit4 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
                edit4.putBoolean(AwcnConfig.NEXT_LAUNCH_FORBID, booleanValue4);
                edit4.apply();
            }
            str21 = null;
        } catch (Exception e24) {
            str21 = null;
            ALog.e(TAG, "network_forbid_next_launch_optimize fail", null, "e", e24);
        }
        try {
            String config17 = getConfig(str, NETWORK_DETECT_ENABLE_SWITCH, str21);
            if (!TextUtils.isEmpty(config17)) {
                AwcnConfig.setNetworkDetectEnable(Boolean.valueOf(config17).booleanValue());
            }
            str22 = null;
        } catch (Exception e25) {
            str22 = null;
            ALog.e(TAG, "setNetworkDetectEnable fail", null, "e", e25);
        }
        try {
            String config18 = getConfig(str, NETWORK_IPV6_GLOBAL_ENABLE_SWITCH, str22);
            if (!TextUtils.isEmpty(config18)) {
                AwcnConfig.setIpv6Enable(Boolean.valueOf(config18).booleanValue());
            }
            str23 = null;
        } catch (Exception e26) {
            str23 = null;
            ALog.e(TAG, "setIpv6Enable fail", null, "e", e26);
        }
        try {
            String config19 = getConfig(str, NETWORK_XQUIC_CONG_CONTROL, str23);
            if (!TextUtils.isEmpty(config19)) {
                AwcnConfig.setXquicCongControl(Integer.valueOf(config19).intValue());
            }
            str24 = null;
        } catch (Exception e27) {
            str24 = null;
            ALog.e(TAG, "setXquicCongControl fail", null, "e", e27);
        }
        try {
            String config20 = getConfig(str, NETWORK_HTTP3_DETECT_VALID_TIME, str24);
            if (!TextUtils.isEmpty(config20)) {
                Http3ConnectionDetector.setDetectValidTime(Long.valueOf(config20).longValue());
            }
            str25 = null;
        } catch (Exception e28) {
            str25 = null;
            ALog.e(TAG, "setDetectValidTime fail", null, "e", e28);
        }
        try {
            String config21 = getConfig(str, NETWORK_COOKIE_HEADER_REDUNDANT_FIX, str25);
            if (!TextUtils.isEmpty(config21)) {
                AwcnConfig.setCookieHeaderRedundantFix(Boolean.valueOf(config21).booleanValue());
            }
            str26 = null;
        } catch (Exception e29) {
            str26 = null;
            ALog.e(TAG, "setCookieHeaderRedundantFix fail", null, "e", e29);
        }
        try {
            String config22 = getConfig(str, NETWORK_CHANNEL_LOCAL_INSTANCE_ENABLE_SWITCH, str26);
            if (!TextUtils.isEmpty(config22)) {
                NetworkConfigCenter.setChannelLocalInstanceEnable(Boolean.valueOf(config22).booleanValue());
            }
            str27 = null;
        } catch (Exception e30) {
            str27 = null;
            ALog.e(TAG, "setChannelLocalInstanceEnable fail", null, "e", e30);
        }
        try {
            String config23 = getConfig(str, NETWORK_WIDGET_LOCAL_INSTANCE_ENABLE_SWITCH, str27);
            if (!TextUtils.isEmpty(config23)) {
                NetworkConfigCenter.setWidgetLocalInstanceEnable(Boolean.valueOf(config23).booleanValue());
            }
            str28 = null;
        } catch (Exception e31) {
            str28 = null;
            ALog.e(TAG, "setWidgetLocalInstanceEnable fail", null, "e", e31);
        }
        try {
            String config24 = getConfig(str, NETWORK_ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED, str28);
            if (!TextUtils.isEmpty(config24)) {
                NetworkConfigCenter.setAllowSpdyWhenBindServiceFailed(Boolean.valueOf(config24).booleanValue());
            }
            str29 = null;
        } catch (Exception e32) {
            str29 = null;
            ALog.e(TAG, "setAllowSpdyWhenBindServiceFailed fail", null, "e", e32);
        }
        try {
            String config25 = getConfig(str, NETWORK_SEND_CONNECT_INFO_BY_SERVICE, str29);
            if (!TextUtils.isEmpty(config25)) {
                AwcnConfig.setSendConnectInfoByService(Boolean.valueOf(config25).booleanValue());
            }
            str30 = null;
        } catch (Exception e33) {
            str30 = null;
            ALog.e(TAG, "setSendConnectInfoByService fail", null, "e", e33);
        }
        try {
            String config26 = getConfig(str, NETWORK_HTTP_DNS_NOTIFY_WHITE_LIST, str30);
            if (!TextUtils.isEmpty(config26)) {
                AwcnConfig.setHttpDnsNotifyWhiteList(config26);
            }
            str31 = null;
        } catch (Exception e34) {
            str31 = null;
            ALog.e(TAG, "setHttpDnsNotifyWhiteList fail", null, "e", e34);
        }
        try {
            String config27 = getConfig(str, NETWORK_LONG_REQUEST_MONITOR_ENABLE_SWITCH, str31);
            if (!TextUtils.isEmpty(config27)) {
                NetworkConfigCenter.setLongRequestMonitorEnable(Boolean.valueOf(config27).booleanValue());
            }
            str32 = null;
        } catch (Exception e35) {
            str32 = null;
            ALog.e(TAG, "setLongRequestMonitorEnable fail", null, "e", e35);
        }
        try {
            String config28 = getConfig(str, NETWORK_ALLOW_ADD_AB_HEADER_IN_MTOP, str32);
            if (!TextUtils.isEmpty(config28)) {
                NetworkConfigCenter.setAllowAddABHeaderInMtop(Boolean.valueOf(config28).booleanValue());
            }
            str33 = null;
        } catch (Exception e36) {
            str33 = null;
            ALog.e(TAG, "setAllowAddABHeaderInMtop fail", null, "e", e36);
        }
        try {
            String config29 = getConfig(str, NETWORK_DECOMPRESS_SWITCH, str33);
            if (!TextUtils.isEmpty(config29)) {
                AwcnConfig.setDecompressOpened(Boolean.valueOf(config29).booleanValue());
            }
            str34 = null;
        } catch (Exception e37) {
            str34 = null;
            ALog.e(TAG, "setDecompressOpened fail", null, "e", e37);
        }
        try {
            String config30 = getConfig(str, NETWORK_SUPPORT_SET_WAIT_TIME_OUT_SWITCH, str34);
            if (!TextUtils.isEmpty(config30)) {
                AwcnConfig.setSupportSetWaitTimeoutOpened(Boolean.valueOf(config30).booleanValue());
            }
            str35 = null;
        } catch (Exception e38) {
            str35 = null;
            ALog.e(TAG, "setSupportSetWaitTimeoutOpened fail", null, "e", e38);
        }
        try {
            String config31 = getConfig(str, NETWORK_MTU_WIFI_OPT_ENABLE_SWITCH, str35);
            if (!TextUtils.isEmpty(config31)) {
                AwcnConfig.setMTUWifiOptEnable(Boolean.valueOf(config31).booleanValue());
            }
            str36 = null;
        } catch (Exception e39) {
            str36 = null;
            ALog.e(TAG, "setMTUWifiOptEnable fail", null, "e", e39);
        }
        try {
            String config32 = getConfig(str, NETWORK_PROCESS_NAME_UPDATE_ENABLE_SWITCH, str36);
            if (!TextUtils.isEmpty(config32)) {
                AwcnConfig.setProcessNameUpdateEnable(Boolean.valueOf(config32).booleanValue());
            }
            str37 = null;
        } catch (Exception e40) {
            str37 = null;
            ALog.e(TAG, "setProcessNameUpdateEnable fail", null, "e", e40);
        }
        try {
            String config33 = getConfig(str, NETWORK_HEADER_IGNORE_CASE_ENABLE_SWITCH, str37);
            if (!TextUtils.isEmpty(config33)) {
                AwcnConfig.setHeaderIgnoreCaseEnable(Boolean.valueOf(config33).booleanValue());
            }
            str38 = null;
        } catch (Exception e41) {
            str38 = null;
            ALog.e(TAG, "setHeaderIgnoreCaseEnable fail", null, "e", e41);
        }
        try {
            String config34 = getConfig(str, NETWORK_PRE_HOT_OPT_SWITCH, str38);
            if (!TextUtils.isEmpty(config34)) {
                AwcnConfig.setPreHotOptOpened(config34);
            }
            str39 = null;
        } catch (Exception e42) {
            str39 = null;
            ALog.e(TAG, "setLaunchOptOpened fail", null, "e", e42);
        }
        try {
            String config35 = getConfig(str, NETWORK_IPV6_DETECT_OPT_SWITCH, str39);
            if (!TextUtils.isEmpty(config35)) {
                AwcnConfig.setIpv6DetectOptEnable(Boolean.valueOf(config35).booleanValue());
            }
            str40 = null;
        } catch (Exception e43) {
            str40 = null;
            ALog.e(TAG, "setIpv6DetectOptEnable fail", null, "e", e43);
        }
        try {
            String config36 = getConfig(str, NETWORK_AMDC_STRATEGY_OPT_SWITCH, str40);
            if (!TextUtils.isEmpty(config36)) {
                AwcnConfig.setAmdcStrategyOptEnable(Boolean.valueOf(config36).booleanValue());
            }
            str41 = null;
        } catch (Exception e44) {
            str41 = null;
            ALog.e(TAG, "setAmdcStrategyOptEnable fail", null, "e", e44);
        }
        try {
            String config37 = getConfig(str, NETWORK_SESSION_OPT_SWITCH, str41);
            if (!TextUtils.isEmpty(config37)) {
                AwcnConfig.setSessionOptEnable(Boolean.valueOf(config37).booleanValue());
            }
            str42 = null;
        } catch (Exception e45) {
            str42 = null;
            ALog.e(TAG, "setSessionOptEnable fail", null, "e", e45);
        }
        try {
            String config38 = getConfig(str, NETWORK_SHORT_LINK_ENABLE_SWITCH, str42);
            if (!TextUtils.isEmpty(config38)) {
                AwcnConfig.setShortLinkConnectEnable(Boolean.valueOf(config38).booleanValue());
            }
            str43 = null;
        } catch (Exception e46) {
            str43 = null;
            ALog.e(TAG, "setShortLinkConnectEnable fail", null, "e", e46);
        }
        try {
            String config39 = getConfig(str, NETWORK_NOT_ALLOW_COOKIE_OPT_V2_SWITCH, str43);
            if (!TextUtils.isEmpty(config39)) {
                AwcnConfig.setNotAllowCookieOpened(Boolean.valueOf(config39).booleanValue());
            }
            str44 = null;
        } catch (Exception e47) {
            str44 = null;
            ALog.e(TAG, "setNotAllowCookieOpened fail", null, "e", e47);
        }
        try {
            String config40 = getConfig(str, NETWORK_SSL_SP_OPT_SWITCH, str44);
            if (!TextUtils.isEmpty(config40)) {
                AwcnConfig.setSslSpOptEnable(Boolean.valueOf(config40).booleanValue());
            }
            str45 = null;
        } catch (Exception e48) {
            str45 = null;
            ALog.e(TAG, "setSslSpOptEnable fail", null, "e", e48);
        }
        try {
            String config41 = getConfig(str, NETWORK_COOKIE_RETRY_TIME_SWITCH, str45);
            if (!TextUtils.isEmpty(config41)) {
                AwcnConfig.setCookieRetryTime(Integer.valueOf(config41).intValue());
            }
            str46 = null;
        } catch (Exception e49) {
            str46 = null;
            ALog.e(TAG, "setCookieRetryTime fail", null, "e", e49);
        }
        try {
            String config42 = getConfig(str, NETWORK_FG_SEND_AMDC_INTERVAL_TIME_SWITCH, str46);
            if (!TextUtils.isEmpty(config42)) {
                AwcnConfig.setFgSendAmdcIntervalTime(Long.parseLong(config42));
            }
            str47 = null;
        } catch (Exception e50) {
            str47 = null;
            ALog.e(TAG, "setFgSendAmdcIntervalTime fail", null, "e", e50);
        }
        try {
            String config43 = getConfig(str, NETWORK_AMDC_STRATEGY_UPDATE_SWITCH, str47);
            if (!TextUtils.isEmpty(config43)) {
                AwcnConfig.setAmdcStrategyUpdateEnable(Boolean.valueOf(config43).booleanValue());
            }
            str48 = null;
        } catch (Exception e51) {
            str48 = null;
            ALog.e(TAG, "setAmdcStrategyUpdateEnable fail", null, "e", e51);
        }
        try {
            String config44 = getConfig(str, NETWORK_LAUNCH_OPT_SWITCH, str48);
            if (!TextUtils.isEmpty(config44)) {
                AwcnConfig.setLaunchOptEnable(Boolean.valueOf(config44).booleanValue());
            }
            str49 = null;
        } catch (Exception e52) {
            str49 = null;
            ALog.e(TAG, "setLaunchOptEnable fail", null, "e", e52);
        }
        try {
            String config45 = getConfig(str, NETWORK_COOKIE_OPT_SWITCH, str49);
            if (!TextUtils.isEmpty(config45)) {
                AwcnConfig.setCookieOptEnable(Boolean.valueOf(config45).booleanValue());
            }
            str50 = null;
        } catch (Exception e53) {
            str50 = null;
            ALog.e(TAG, "setCookieOptEnable fail", null, "e", e53);
        }
        try {
            String config46 = getConfig(str, NETWORK_UPLINK_ENCODE_SWITCH, str50);
            if (!TextUtils.isEmpty(config46)) {
                AwcnConfig.setUplinkEncodeOpened(Boolean.valueOf(config46).booleanValue());
            }
            str51 = null;
        } catch (Exception e54) {
            str51 = null;
            ALog.e(TAG, "setUplinkEncodeOpened fail", null, "e", e54);
        }
        try {
            String config47 = getConfig(str, NETWORK_UPLINK_ENCODE_UPDATE_SWITCH, str51);
            if (!TextUtils.isEmpty(config47)) {
                AwcnConfig.setUplinkEncodeUpdateOpened(Boolean.valueOf(config47).booleanValue());
            }
            str52 = null;
        } catch (Exception e55) {
            str52 = null;
            ALog.e(TAG, "setUplinkEncodeUpdateOpened fail", null, "e", e55);
        }
        try {
            String config48 = getConfig(str, "network_uplink_compress_host_white_list", str52);
            SharedPreferences.Editor edit5 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config48)) {
                AwcnConfig.setUplinkEncodeHostWhiteList(config48);
                edit5.putString("network_uplink_compress_host_white_list", config48);
                edit5.apply();
            } else {
                edit5.remove("network_uplink_compress_host_white_list");
                edit5.apply();
            }
            str53 = null;
        } catch (Exception e56) {
            str53 = null;
            ALog.e(TAG, "setUplinkEncodeHostWhiteList fail", null, "e", e56);
        }
        try {
            String config49 = getConfig(str, NETWORK_IPV6_DOWN_GRADE_HOST_WHITE_LIST_SWITCH, str53);
            SharedPreferences.Editor edit6 = SharePreferencesUtils.getCorePreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config49)) {
                AwcnConfig.setIpv6DowngradeWhiteList(config49);
                edit6.putString(AwcnConfig.NETWORK_IPV6_DOWN_GRADE_HOST_WHITE_LIST_KEY, config49);
                edit6.apply();
            } else {
                edit6.remove(AwcnConfig.NETWORK_IPV6_DOWN_GRADE_HOST_WHITE_LIST_KEY);
                edit6.apply();
            }
            str54 = null;
        } catch (Exception e57) {
            str54 = null;
            ALog.e(TAG, "setIpv6DowngradeWhiteList fail", null, "e", e57);
        }
        try {
            String config50 = getConfig(str, NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_SWITCH, str54);
            SharedPreferences.Editor edit7 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config50)) {
                AwcnConfig.setMtopInterceptorWhiteList(config50);
                edit7.putString(AwcnConfig.NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_KEY, config50);
                edit7.apply();
            } else {
                edit7.remove(AwcnConfig.NETWORK_MTOP_INTERCEPTOR_WHITE_LIST_KEY);
                edit7.apply();
            }
            str55 = null;
        } catch (Exception e58) {
            str55 = null;
            ALog.e(TAG, "setMtopInterceptorWhiteList fail", null, "e", e58);
        }
        try {
            String config51 = getConfig(str, NETWORK_INTERCEPTOR_OPT_SWITCH, str55);
            if (!TextUtils.isEmpty(config51)) {
                AwcnConfig.setInterceptorOptType(Long.valueOf(config51).longValue());
            }
            str56 = null;
        } catch (Exception e59) {
            str56 = null;
            ALog.e(TAG, "setInterceptorOptType fail", null, "e", e59);
        }
        try {
            String config52 = getConfig(str, "network_uplink_compress_url_white_list", str56);
            SharedPreferences.Editor edit8 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config52)) {
                AwcnConfig.setUplinkEncodeUrlWhiteList(config52);
                edit8.putString("network_uplink_compress_url_white_list", config52);
                edit8.apply();
            } else {
                edit8.remove("network_uplink_compress_url_white_list");
                edit8.apply();
            }
            str57 = null;
        } catch (Exception e60) {
            str57 = null;
            ALog.e(TAG, "setUplinkEncodeUrlWhiteList fail", null, "e", e60);
        }
        try {
            String config53 = getConfig(str, NETWORK_LOW_LATENCY_WHITE_LIST_SWITCH, str57);
            SharedPreferences.Editor edit9 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config53)) {
                AwcnConfig.setAllowFullLowLatencyUrlWhiteList(config53);
                edit9.putString(AwcnConfig.NETWORK_LOW_LATENCY_WHITE_LIST_KEY, config53);
                edit9.apply();
            } else {
                edit9.remove(AwcnConfig.NETWORK_LOW_LATENCY_WHITE_LIST_KEY);
                edit9.apply();
            }
            str58 = null;
        } catch (Exception e61) {
            str58 = null;
            ALog.e(TAG, "setAllowFullLowLatencyUrlWhiteList fail", null, "e", e61);
        }
        try {
            String config54 = getConfig(str, NETWORK_MTU_WHITE_LIST_SWITCH, str58);
            SharedPreferences.Editor edit10 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config54)) {
                AwcnConfig.setMtuWhiteList(config54);
                edit10.putString(AwcnConfig.NETWORK_MTU_WHITE_LIST_KEY, config54);
                edit10.apply();
            } else {
                edit10.remove(AwcnConfig.NETWORK_MTU_WHITE_LIST_KEY);
                edit10.apply();
            }
            str59 = null;
        } catch (Exception e62) {
            str59 = null;
            ALog.e(TAG, "setMtuWhiteList fail", null, "e", e62);
        }
        try {
            String config55 = getConfig(str, NETWORK_RUM_PARAM_LIST_SWITCH, str59);
            SharedPreferences.Editor edit11 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config55)) {
                AwcnConfig.setRumParams(config55);
                edit11.putString(AwcnConfig.NETWORK_RUM_PARAM_LIST_KEY, config55);
                edit11.apply();
            } else {
                edit11.remove(AwcnConfig.NETWORK_RUM_PARAM_LIST_KEY);
                edit11.apply();
            }
            str60 = null;
        } catch (Exception e63) {
            str60 = null;
            ALog.e(TAG, "setRumParams fail", null, "e", e63);
        }
        try {
            String config56 = getConfig(str, NETWORK_PRE_HOST_WHITE_LIST_SWITCH, str60);
            SharedPreferences.Editor edit12 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config56)) {
                AwcnConfig.setPresetHostWhiteList(config56);
                edit12.putString(AwcnConfig.NETWORK_PRE_HOST_WHITE_LIST_KEY, config56);
                edit12.apply();
            } else {
                edit12.remove(AwcnConfig.NETWORK_PRE_HOST_WHITE_LIST_KEY);
                edit12.apply();
            }
            str61 = null;
        } catch (Exception e64) {
            str61 = null;
            ALog.e(TAG, "setPresetHostWhiteList fail", null, "e", e64);
        }
        try {
            String config57 = getConfig(str, NETWORK_SCENE_BWE_ESTIMATOR_LIST_SWITCH, str61);
            SharedPreferences.Editor edit13 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config57)) {
                AwcnConfig.setSceneBWEstimatorList(config57);
                edit13.putString(AwcnConfig.NETWORK_SCENE_BWE_ESTIMATOR_LIST_KEY, config57);
                edit13.apply();
            } else {
                edit13.remove(AwcnConfig.NETWORK_SCENE_BWE_ESTIMATOR_LIST_KEY);
                edit13.apply();
            }
            str62 = null;
        } catch (Exception e65) {
            str62 = null;
            ALog.e(TAG, "setSceneBWEstimatorList fail", null, "e", e65);
        }
        try {
            String config58 = getConfig(str, NETWORK_PRE_HOST_HTTP3_WHITE_LIST_SWITCH, str62);
            SharedPreferences.Editor edit14 = SharePreferencesUtils.getCorePreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config58)) {
                AwcnConfig.setPresetHostHttp3WhiteList(config58);
                edit14.putString(AwcnConfig.NETWORK_PRE_HOST_HTTP3_WHITE_LIST_KEY, config58);
                edit14.apply();
            } else {
                edit14.remove(AwcnConfig.NETWORK_PRE_HOST_HTTP3_WHITE_LIST_KEY);
                edit14.apply();
            }
            str63 = null;
        } catch (Exception e66) {
            str63 = null;
            ALog.e(TAG, "setPresetHostHttp3WhiteList fail", null, "e", e66);
        }
        try {
            String config59 = getConfig(str, NETWORK_PRE_HOST_HTTP2_WHITE_LIST_SWITCH, str63);
            SharedPreferences.Editor edit15 = SharePreferencesUtils.getCorePreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config59)) {
                AwcnConfig.setPresetHostHttp2WhiteList(config59);
                edit15.putString(AwcnConfig.NETWORK_PRE_HOST_HTTP2_WHITE_LIST_KEY, config59);
                edit15.apply();
            } else {
                edit15.remove(AwcnConfig.NETWORK_PRE_HOST_HTTP2_WHITE_LIST_KEY);
                edit15.apply();
            }
            str64 = null;
        } catch (Exception e67) {
            str64 = null;
            ALog.e(TAG, "setPresetHostHttp2WhiteList fail", null, "e", e67);
        }
        try {
            String config60 = getConfig(str, NETWORK_SMOOTH_RECONNECT_SWITCH, str64);
            if (!TextUtils.isEmpty(config60)) {
                AwcnConfig.setSmoothReconnectEnable(Boolean.valueOf(config60).booleanValue());
            }
            str65 = null;
        } catch (Exception e68) {
            str65 = null;
            ALog.e(TAG, "setSmoothReconnectEnable fail", null, "e", e68);
        }
        try {
            String config61 = getConfig(str, NETWORK_SMOOTH_RECONNECT_OPT_SWITCH, str65);
            if (!TextUtils.isEmpty(config61)) {
                AwcnConfig.setSmoothReconnectOptOpened(Boolean.valueOf(config61).booleanValue());
            }
            str66 = null;
        } catch (Exception e69) {
            str66 = null;
            ALog.e(TAG, "setSmoothReconnectOptOpened fail", null, "e", e69);
        }
        try {
            String config62 = getConfig(str, NETWORK_WIFI_FG_FORCE_CELL_OPT_ENABLE_SWITCH, str66);
            if (!TextUtils.isEmpty(config62)) {
                AwcnConfig.setWifiUnavailableUseCellOptOpened(Boolean.valueOf(config62).booleanValue());
            }
            str67 = null;
        } catch (Exception e70) {
            str67 = null;
            ALog.e(TAG, "setWifiUnavailableUseCellOptOpened fail", null, "e", e70);
        }
        try {
            String config63 = getConfig(str, NETWORK_BG_NOT_FORCE_CELL_OPT_ENABLE_SWITCH, str67);
            if (!TextUtils.isEmpty(config63)) {
                AwcnConfig.setBgNotForceCellOptOpened(Boolean.valueOf(config63).booleanValue());
            }
            str68 = null;
        } catch (Exception e71) {
            str68 = null;
            ALog.e(TAG, "setBgNotForceCellOptOpened fail", null, "e", e71);
        }
        try {
            String config64 = getConfig(str, NETWORK_REPLACE_STRATEGY_ENABLE_SWITCH, str68);
            if (!TextUtils.isEmpty(config64)) {
                AwcnConfig.setReplaceStrategyOpened(Boolean.valueOf(config64).booleanValue());
            }
            str69 = null;
        } catch (Exception e72) {
            str69 = null;
            ALog.e(TAG, "setReplaceStrategyOpened fail", null, "e", e72);
        }
        try {
            String config65 = getConfig(str, NETWORK_VPN_DETECT_RACING_ENABLE_SWITCH, str69);
            if (!TextUtils.isEmpty(config65)) {
                AwcnConfig.setVpnDetectRacingOpened(Boolean.valueOf(config65).booleanValue());
            }
            str70 = null;
        } catch (Exception e73) {
            str70 = null;
            ALog.e(TAG, "setVpnDetectRacingOpened fail", null, "e", e73);
        }
        try {
            String config66 = getConfig(str, NETWORK_WIFI_DETECT_OPT_ENABLE_SWITCH, str70);
            if (!TextUtils.isEmpty(config66)) {
                AwcnConfig.setWifiDetectOptOpened(Boolean.valueOf(config66).booleanValue());
            }
            str71 = null;
        } catch (Exception e74) {
            str71 = null;
            ALog.e(TAG, "setWifiDetectOptOpened fail", null, "e", e74);
        }
        try {
            String config67 = getConfig(str, NETWORK_WIFI_FG_FORCE_CELL_WHITE_LIST_SWITCH, str71);
            SharedPreferences.Editor edit16 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config67)) {
                AwcnConfig.setWifiFgForceCellWhiteList(config67);
                edit16.putString(AwcnConfig.NETWORK_WIFI_FG_FORCE_CELL_WHITE_LIST_KEY, config67);
                edit16.apply();
            } else {
                edit16.remove(AwcnConfig.NETWORK_WIFI_FG_FORCE_CELL_WHITE_LIST_KEY);
                edit16.apply();
            }
            str72 = null;
        } catch (Exception e75) {
            str72 = null;
            ALog.e(TAG, "setWifiFgForceCellWhiteList fail", null, "e", e75);
        }
        try {
            String config68 = getConfig(str, NETWORK_URL_MONITOR_REQUEST_WHITE_LIST_SWITCH, str72);
            SharedPreferences.Editor edit17 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config68)) {
                AwcnConfig.setUrlMonitorRequestList(config68);
                edit17.putString(AwcnConfig.NETWORK_URL_MONITOR_REQUEST_WHITE_LIST_KEY, config68);
                edit17.apply();
            } else {
                edit17.remove(AwcnConfig.NETWORK_URL_MONITOR_REQUEST_WHITE_LIST_KEY);
                edit17.apply();
            }
            str73 = null;
        } catch (Exception e76) {
            str73 = null;
            ALog.e(TAG, "setUrlMonitorRequestList fail", null, "e", e76);
        }
        try {
            String config69 = getConfig(str, NETWORK_SUPPORT_STREAMING_PARSER_WHITE_LIST, str73);
            SharedPreferences.Editor edit18 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config69)) {
                AwcnConfig.setSupportStreamingParserList(config69);
                edit18.putString(AwcnConfig.NETWORK_SUPPORT_STREAMING_PARSER_WHITE_LIST_KEY, config69);
                edit18.apply();
            } else {
                edit18.remove(AwcnConfig.NETWORK_SUPPORT_STREAMING_PARSER_WHITE_LIST_KEY);
                edit18.apply();
            }
            str74 = null;
        } catch (Exception e77) {
            str74 = null;
            ALog.e(TAG, "setSupportStreamingParserList fail", null, "e", e77);
        }
        try {
            String config70 = getConfig(str, NETWORK_ALLOW_NO_COOKIE_WHITE_LIST_SWITCH, str74);
            SharedPreferences.Editor edit19 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config70)) {
                AwcnConfig.setAllowNoCookieList(config70);
                edit19.putString(AwcnConfig.NETWORK_ALLOW_NO_COOKIE_WHITE_LIST_KEY, config70);
                edit19.apply();
            } else {
                edit19.remove(AwcnConfig.NETWORK_ALLOW_NO_COOKIE_WHITE_LIST_KEY);
                edit19.apply();
            }
            str75 = null;
        } catch (Exception e78) {
            str75 = null;
            ALog.e(TAG, "setAllowNoCookieList fail", null, "e", e78);
        }
        try {
            String config71 = getConfig(str, NETWORK_WIFI_FG_FORCE_CELL_CONFIG_LIST_SWITCH, str75);
            SharedPreferences.Editor edit20 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config71)) {
                AwcnConfig.setWifiFgForceCellConfigList(config71);
                edit20.putString(AwcnConfig.NETWORK_WIFI_FG_FORCE_CELL_CONFIG_LIST_KEY, config71);
                edit20.apply();
            } else {
                edit20.remove(AwcnConfig.NETWORK_WIFI_FG_FORCE_CELL_CONFIG_LIST_KEY);
                edit20.apply();
            }
            str76 = null;
        } catch (Exception e79) {
            str76 = null;
            ALog.e(TAG, "setWifiFgForceCellConfigList fail", null, "e", e79);
        }
        try {
            String config72 = getConfig(str, NETWORK_GZIP_DECOMPRESS_SWITCH, str76);
            if (!TextUtils.isEmpty(config72)) {
                AwcnConfig.setGzipDecompressOpened(Boolean.valueOf(config72).booleanValue());
            }
            str77 = null;
        } catch (Exception e80) {
            str77 = null;
            ALog.e(TAG, "setGzipDecompressOpened fail", null, "e", e80);
        }
        try {
            String config73 = getConfig(str, NETWORK_ACCESS_POINT_SWITCH, str77);
            if (!TextUtils.isEmpty(config73)) {
                AwcnConfig.setAccessPointOpened(Boolean.valueOf(config73).booleanValue());
            }
            str78 = null;
        } catch (Exception e81) {
            str78 = null;
            ALog.e(TAG, "setAccessPointOpened fail", null, "e", e81);
        }
        try {
            String config74 = getConfig(str, NETWORK_VPN_OPT_ENABLE_SWITCH, str78);
            if (!TextUtils.isEmpty(config74)) {
                AwcnConfig.setVpnOptOpened(Boolean.valueOf(config74).booleanValue());
            }
            str79 = null;
        } catch (Exception e82) {
            str79 = null;
            ALog.e(TAG, "setVpnOptOpened fail", null, "e", e82);
        }
        try {
            String config75 = getConfig(str, NETWORK_REQ_FORCE_CELL_ENABLE_SWITCH, str79);
            if (!TextUtils.isEmpty(config75)) {
                AwcnConfig.setReqForceCellEnable(Boolean.valueOf(config75).booleanValue());
            }
            str80 = null;
        } catch (Exception e83) {
            str80 = null;
            ALog.e(TAG, "setReqForceCellEnable fail", null, "e", e83);
        }
        try {
            String config76 = getConfig(str, NETWORK_REPEAT_THREAD_VIRTUAL_SWITCH, str80);
            if (!TextUtils.isEmpty(config76)) {
                AwcnConfig.setRepeatThreadUseVirtualThread(Boolean.valueOf(config76).booleanValue());
            }
            str81 = null;
        } catch (Exception e84) {
            str81 = null;
            ALog.e(TAG, "setRepeatThreadUseVirtualThread fail", null, "e", e84);
        }
        try {
            String config77 = getConfig(str, NETWORK_ALLOW_FORCE_AMDC_SWITCH, str81);
            if (!TextUtils.isEmpty(config77)) {
                AwcnConfig.setAllowForceAmdcEnable(Boolean.valueOf(config77).booleanValue());
            }
            str82 = null;
        } catch (Exception e85) {
            str82 = null;
            ALog.e(TAG, "setAllowForceAmdcEnable fail", null, "e", e85);
        }
        try {
            String config78 = getConfig(str, NETWORK_FG_AMDC_SWITCH, str82);
            if (!TextUtils.isEmpty(config78)) {
                AwcnConfig.setAllowForceFgAmdcEnable(Boolean.valueOf(config78).booleanValue());
            }
            str83 = null;
        } catch (Exception e86) {
            str83 = null;
            ALog.e(TAG, "setAllowForceFgAmdcEnable fail", null, "e", e86);
        }
        try {
            String config79 = getConfig(str, NETWORK_REQ_CONFIG_ENABLE_SWITCH, str83);
            if (!TextUtils.isEmpty(config79)) {
                AwcnConfig.setReqConfigEnable(Boolean.valueOf(config79).booleanValue());
            }
            str84 = null;
        } catch (Exception e87) {
            str84 = null;
            ALog.e(TAG, "setReqConfigEnable fail", null, "e", e87);
        }
        try {
            String config80 = getConfig(str, NETWORK_INFO_ENABLE_SWITCH, str84);
            if (!TextUtils.isEmpty(config80)) {
                AwcnConfig.setNetworkInfoEnable(Boolean.valueOf(config80).booleanValue());
            }
            str85 = null;
        } catch (Exception e88) {
            str85 = null;
            ALog.e(TAG, "setNetworkInfoEnable fail", null, "e", e88);
        }
        try {
            String config81 = getConfig(str, NETWORK_H3_STRATEGY_FILTER_ENABLE_SWITCH, str85);
            if (!TextUtils.isEmpty(config81)) {
                AwcnConfig.setH3DetectStrategyFilterEnable(Boolean.valueOf(config81).booleanValue());
            }
            str86 = null;
        } catch (Exception e89) {
            str86 = null;
            ALog.e(TAG, "setH3DetectStrategyFilterEnable fail", null, "e", e89);
        }
        try {
            String config82 = getConfig(str, NETWORK_STACK_UNKNOWN_BUILD_STRATEGY_ENABLE_SWITCH, str86);
            if (!TextUtils.isEmpty(config82)) {
                AwcnConfig.setStackUnknownBuildStrategyEnable(Boolean.valueOf(config82).booleanValue());
            }
            str87 = null;
        } catch (Exception e90) {
            str87 = null;
            ALog.e(TAG, "setStackUnknownBuildStrategyEnable fail", null, "e", e90);
        }
        try {
            String config83 = getConfig(str, NETWORK_STRATEGY_RETRY_ENABLE_SWITCH, str87);
            if (!TextUtils.isEmpty(config83)) {
                AwcnConfig.setStrategyRetryEnable(Boolean.valueOf(config83).booleanValue());
            }
            str88 = null;
        } catch (Exception e91) {
            str88 = null;
            ALog.e(TAG, "setStrategyRetryEnable fail", null, "e", e91);
        }
        try {
            String config84 = getConfig(str, NETWORK_STRATEGY_TIMELY_UPDATE_ENABLE_SWITCH, str88);
            if (!TextUtils.isEmpty(config84)) {
                AwcnConfig.setStrategyTimelyUpdateEnable(Boolean.valueOf(config84).booleanValue());
            }
            str89 = null;
        } catch (Exception e92) {
            str89 = null;
            ALog.e(TAG, "setStrategyTimelyUpdateEnable fail", null, "e", e92);
        }
        try {
            String config85 = getConfig(str, NETWORK_FIX_WRITE_STREAM_ERROR_ENABLE_SWITCH, str89);
            if (!TextUtils.isEmpty(config85)) {
                AwcnConfig.setFixWriteStreamErrorEnable(Boolean.valueOf(config85).booleanValue());
            }
            str90 = null;
        } catch (Exception e93) {
            str90 = null;
            ALog.e(TAG, "setFixWriteStreamErrorEnable fail", null, "e", e93);
        }
        try {
            String config86 = getConfig(str, NETWORK_CANCEL_HARD_EXPIRY_ENABLE_SWITCH, str90);
            if (!TextUtils.isEmpty(config86)) {
                AwcnConfig.setCancelHardExpiryEnable(Boolean.valueOf(config86).booleanValue());
            }
            str91 = null;
        } catch (Exception e94) {
            str91 = null;
            ALog.e(TAG, "setCancelHardExpiryEnable fail", null, "e", e94);
        }
        try {
            String config87 = getConfig(str, NETWORK_UNIQUE_ID_ENABLE_SWITCH, str91);
            if (!TextUtils.isEmpty(config87)) {
                AwcnConfig.setUniqueIdEnable(Boolean.valueOf(config87).booleanValue());
            }
            str92 = null;
        } catch (Exception e95) {
            str92 = null;
            ALog.e(TAG, "setUniqueIdEnable fail", null, "e", e95);
        }
        try {
            String config88 = getConfig(str, NETWORK_BG_SOCKET_ENABLE_SWITCH, str92);
            if (!TextUtils.isEmpty(config88)) {
                AwcnConfig.setBgSocketEnable(Boolean.valueOf(config88).booleanValue());
            }
            str93 = null;
        } catch (Exception e96) {
            str93 = null;
            ALog.e(TAG, "setBgSocketEnable fail", null, "e", e96);
        }
        try {
            String config89 = getConfig(str, NETWORK_MTU_CONNECT_UPDATE_ENABLE_SWITCH, str93);
            if (!TextUtils.isEmpty(config89)) {
                AwcnConfig.setMTUConnectUpdate(Boolean.valueOf(config89).booleanValue());
            }
            str94 = null;
        } catch (Exception e97) {
            str94 = null;
            ALog.e(TAG, "setMTUConnectUpdate fail", null, "e", e97);
        }
        try {
            String config90 = getConfig(str, NETWORK_REMOTE_CRITICAL_PLAN_SWITCH, str94);
            if (!TextUtils.isEmpty(config90)) {
                AwcnConfig.setRemoteCriticalPlan(Boolean.valueOf(config90).booleanValue());
            }
            str95 = null;
        } catch (Exception e98) {
            str95 = null;
            ALog.e(TAG, "setRemoteCriticalPlan fail", null, "e", e98);
        }
        try {
            String config91 = getConfig(str, NETWORK_AMDC_PARCELBALE_ENABLE_SWITCH, str95);
            if (!TextUtils.isEmpty(config91)) {
                AwcnConfig.setAmdcParcelableOrangeEnable(Boolean.valueOf(config91).booleanValue());
            }
            str96 = null;
        } catch (Exception e99) {
            str96 = null;
            ALog.e(TAG, "setAmdcParcelableEnable fail", null, "e", e99);
        }
        try {
            String config92 = getConfig(str, NETWORK_TNET_FORCE_PUBKEY_SWITCH, str96);
            if (!TextUtils.isEmpty(config92)) {
                AwcnConfig.setTnetForcePubKey(Boolean.valueOf(config92).booleanValue());
            }
            str97 = null;
        } catch (Exception e100) {
            str97 = null;
            ALog.e(TAG, "setTnetForcePubKey fail", null, "e", e100);
        }
        try {
            String config93 = getConfig(str, NETWORK_VPN_FAST_DEGRADE_SWITCH, str97);
            if (!TextUtils.isEmpty(config93)) {
                AwcnConfig.setVpnFastDegradeEnabled(Boolean.valueOf(config93).booleanValue());
            }
            str98 = null;
        } catch (Exception e101) {
            str98 = null;
            ALog.e(TAG, "setVpnFastDegradeEnabled fail", null, "e", e101);
        }
        try {
            String config94 = getConfig(str, NETWORK_VPN_FAST_DEGRADE_HOST_WHITE_LIST_SWITCH, str98);
            SharedPreferences.Editor edit21 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config94)) {
                AwcnConfig.setVpnFastDegradeHostWhiteList(config94);
                edit21.putString(AwcnConfig.VPN_FAST_DEGRADE_HOST_WHITE_LIST_KEY, config94);
                edit21.apply();
            } else {
                edit21.remove(AwcnConfig.VPN_FAST_DEGRADE_HOST_WHITE_LIST_KEY);
                edit21.apply();
            }
            str99 = null;
        } catch (Exception e102) {
            str99 = null;
            ALog.e(TAG, "setVpnFastDegradeHostWhiteList fail", null, "e", e102);
        }
        try {
            String config95 = getConfig(str, NETWORK_VPN_FAST_DEGRADE_BIZID_WHITE_LIST_SWITCH, str99);
            SharedPreferences.Editor edit22 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config95)) {
                AwcnConfig.setVpnFastDegradBizIdWhiteList(config95);
                edit22.putString(str2, config95);
                edit22.apply();
            } else {
                edit22.remove(str2);
                edit22.apply();
            }
            str100 = null;
        } catch (Exception e103) {
            str100 = null;
            ALog.e(TAG, "setVpnFastDegradBizIdWhiteList fail", null, "e", e103);
        }
        try {
            String config96 = getConfig(str, NETWORK_REQ_FORCE_CELL_WHITE_LIST_SWITCH, str100);
            SharedPreferences.Editor edit23 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config96)) {
                AwcnConfig.setReqForceCellWhiteList(config96);
                edit23.putString(str3, config96);
                edit23.apply();
            } else {
                edit23.remove(str3);
                edit23.apply();
            }
            str101 = null;
        } catch (Exception e104) {
            str101 = null;
            ALog.e(TAG, "setReqForceCellWhiteList fail", null, "e", e104);
        }
        try {
            String config97 = getConfig(str, NETWORK_VPN_FAST_DEGRADE_TIME_SWITCH, str101);
            if (!TextUtils.isEmpty(config97)) {
                AwcnConfig.setVpnFastDegradTime(Long.valueOf(config97).longValue());
            }
            str102 = null;
        } catch (Exception e105) {
            str102 = null;
            ALog.e(TAG, "setVpnFastDegradTime fail", null, "e", e105);
        }
        try {
            String config98 = getConfig(str, NETWORK_VPN_PROXY_SESSION_WHITE_LIST_SWITCH, str102);
            SharedPreferences.Editor edit24 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config98)) {
                AwcnConfig.setVpnProxySessionWhiteList(config98);
                edit24.putString(AwcnConfig.VPN_PROXY_SESSION_WHITE_LIST_KEY, config98);
                edit24.apply();
            } else {
                edit24.remove(AwcnConfig.VPN_PROXY_SESSION_WHITE_LIST_KEY);
                edit24.apply();
            }
            str103 = null;
        } catch (Exception e106) {
            str103 = null;
            ALog.e(TAG, "setVpnProxySessionWhiteList fail", null, "e", e106);
        }
        try {
            String config99 = getConfig(str, NETWORK_VPN_LISTEN_TIME_INTERVAL_SWITCH, str103);
            if (!TextUtils.isEmpty(config99)) {
                AwcnConfig.setVpnListenTimeInterval(Long.valueOf(config99).longValue());
            }
            str104 = null;
        } catch (Exception e107) {
            str104 = null;
            ALog.e(TAG, "setVpnListenTimeInterval fail", null, "e", e107);
        }
        try {
            String config100 = getConfig(str, NETWORK_VPN_FG_CHANGE_COUNT_SWITCH, str104);
            if (!TextUtils.isEmpty(config100)) {
                AwcnConfig.setVpnFgChangeCount(Long.valueOf(config100).longValue());
            }
            str105 = null;
        } catch (Exception e108) {
            str105 = null;
            ALog.e(TAG, "setVpnFgChangeCount fail", null, "e", e108);
        }
        try {
            String config101 = getConfig(str, NETWORK_AMDC_TIMEOUT_SWITCH, str105);
            SharedPreferences.Editor edit25 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config101)) {
                int parseInt = Integer.parseInt(config101);
                AwcnConfig.setAmdcTimeout(parseInt);
                edit25.putInt(AwcnConfig.NETWORK_AMDC_TIMEOUT_KEY, parseInt);
                edit25.apply();
            } else {
                edit25.remove(AwcnConfig.NETWORK_AMDC_TIMEOUT_KEY);
                edit25.apply();
            }
            str106 = null;
        } catch (Exception e109) {
            str106 = null;
            ALog.e(TAG, "setAmdcTimeout fail", null, "e", e109);
        }
        try {
            String config102 = getConfig(str, NETWORK_AMDC_LIGHT_TIME_SWITCH, str106);
            SharedPreferences.Editor edit26 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config102)) {
                int parseInt2 = Integer.parseInt(config102);
                AwcnConfig.setAmdcLightTime(parseInt2);
                edit26.putInt(AwcnConfig.NETWORK_AMDC_LIGHT_TIME_KEY, parseInt2);
                edit26.apply();
            } else {
                edit26.remove(AwcnConfig.NETWORK_AMDC_LIGHT_TIME_KEY);
                edit26.apply();
            }
            str107 = null;
        } catch (Exception e110) {
            str107 = null;
            ALog.e(TAG, "setAmdcLightTime fail", null, "e", e110);
        }
        try {
            String config103 = getConfig(str, NETWORK_LAZY_LOAD_TNET_SECURITY_TIME_SWITCH, str107);
            SharedPreferences.Editor edit27 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config103)) {
                long parseLong = Long.parseLong(config103);
                AwcnConfig.setLazyLoadTnetSecTime(parseLong);
                edit27.putLong(AwcnConfig.NETWORK_LAZY_LOAD_TNET_SECURITY_TIME_KEY, parseLong);
                edit27.apply();
            } else {
                edit27.remove(AwcnConfig.NETWORK_LAZY_LOAD_TNET_SECURITY_TIME_KEY);
                edit27.apply();
            }
            str108 = null;
        } catch (Exception e111) {
            str108 = null;
            ALog.e(TAG, "setLunchSecurityTime", null, "error", e111);
        }
        try {
            String config104 = getConfig(str, NETWORK_SAVE_POWER_TIME_SWITCH, str108);
            SharedPreferences.Editor edit28 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config104)) {
                int intValue2 = Integer.valueOf(config104).intValue();
                AwcnConfig.setSavePowerTimeInterval(intValue2);
                edit28.putInt(AwcnConfig.NETWORK_SAVE_POWER_TIME_KEY, intValue2);
                edit28.apply();
            } else {
                edit28.remove(AwcnConfig.NETWORK_SAVE_POWER_TIME_KEY);
                edit28.apply();
            }
            str109 = null;
        } catch (Exception e112) {
            str109 = null;
            ALog.e(TAG, "setSavePowerTimeInterval fail", null, "e", e112);
        }
        try {
            String config105 = getConfig(str, NETWORK_CHANNEL_AMDC_TTL_KEY_SWITCH, str109);
            SharedPreferences.Editor edit29 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config105)) {
                int parseInt3 = Integer.parseInt(config105);
                AwcnConfig.setChannelAmdcTtl(parseInt3);
                edit29.putInt(AwcnConfig.NETWORK_CHANNEL_AMDC_TTL_KEY, parseInt3);
                edit29.apply();
            } else {
                edit29.remove(AwcnConfig.NETWORK_CHANNEL_AMDC_TTL_KEY);
                edit29.apply();
            }
            str110 = null;
        } catch (Exception e113) {
            str110 = null;
            ALog.e(TAG, "setChannelAmdcTtl fail! ", null, "e", e113);
        }
        try {
            String config106 = getConfig(str, NETWORK_DETECT_H3_HOST_WHITE_LIST_SWITCH, str110);
            SharedPreferences.Editor edit30 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config106)) {
                AwcnConfig.setDetectHostWhiteList(config106);
                edit30.putString(AwcnConfig.NETWORK_DETECT_H3_HOST_WHITE_LIST_KEY, config106);
                edit30.apply();
            } else {
                edit30.remove(AwcnConfig.NETWORK_DETECT_H3_HOST_WHITE_LIST_KEY);
                edit30.apply();
            }
            str111 = null;
        } catch (Exception e114) {
            str111 = null;
            ALog.e(TAG, "setDetectHostWhiteList fail", null, "e", e114);
        }
        try {
            String config107 = getConfig(str, NETWORK_STRATEGY_TIMELY_UPDATE_HOST_WHITE_LIST_SWITCH, str111);
            SharedPreferences.Editor edit31 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config107)) {
                AwcnConfig.setStrategyTimelyUpdateWhiteList(config107);
                edit31.putString(AwcnConfig.NETWORK_STRATEGY_TIMELY_UPDATE_HOST_WHITE_LIST_KEY, config107);
                edit31.apply();
            } else {
                edit31.remove(AwcnConfig.NETWORK_STRATEGY_TIMELY_UPDATE_HOST_WHITE_LIST_KEY);
                edit31.apply();
            }
            str112 = null;
        } catch (Exception e115) {
            str112 = null;
            ALog.e(TAG, "setStrategyTimelyUpdateWhiteList fail", null, "e", e115);
        }
        try {
            String config108 = getConfig(str, NETWORK_COOKIE_LOG_HOST_WHITE_LIST_SWITCH, str112);
            SharedPreferences.Editor edit32 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config108)) {
                AwcnConfig.setCookiePrintLogHostWhiteList(config108);
                edit32.putString(AwcnConfig.NETWORK_COOKIE_LOG_HOST_WHITE_LIST_KEY, config108);
                edit32.apply();
            } else {
                edit32.remove(AwcnConfig.NETWORK_COOKIE_LOG_HOST_WHITE_LIST_KEY);
                edit32.apply();
            }
            str113 = null;
        } catch (Exception e116) {
            str113 = null;
            ALog.e(TAG, "setCookiePrintLogHostWhiteList fail", null, "e", e116);
        }
        try {
            String config109 = getConfig(str, NETWORK_ACCEPT_ENCODE_WHITE_LIST_SWITCH, str113);
            SharedPreferences.Editor edit33 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config109)) {
                AwcnConfig.setAcceptEncodeHostWhiteList(config109);
                edit33.putString(AwcnConfig.NETWORK_ACCEPT_ENCODE_WHITE_LIST_KEY, config109);
                edit33.apply();
            } else {
                edit33.remove(AwcnConfig.NETWORK_ACCEPT_ENCODE_WHITE_LIST_KEY);
                edit33.apply();
            }
            str114 = null;
        } catch (Exception e117) {
            str114 = null;
            ALog.e(TAG, "setAcceptEncodeHostWhiteList fail", null, "e", e117);
        }
        try {
            String config110 = getConfig(str, NETWORK_MULTI_CONNECT_WHITE_LIST_SWITCH, str114);
            SharedPreferences.Editor edit34 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config110)) {
                AwcnConfig.setMultiConnectWhiteList(config110);
                edit34.putString(AwcnConfig.NETWORK_MULTI_CONNECT_WHITE_LIST_KEY, config110);
                edit34.apply();
            } else {
                edit34.remove(AwcnConfig.NETWORK_MULTI_CONNECT_WHITE_LIST_KEY);
                edit34.apply();
            }
            str115 = null;
        } catch (Exception e118) {
            str115 = null;
            ALog.e(TAG, "setMultiConnectWhiteList fail", null, "e", e118);
        }
        try {
            String config111 = getConfig(str, NETWORK_MTOP_AMDC_WHITE_LIST_SWITCH, str115);
            SharedPreferences.Editor edit35 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config111)) {
                AwcnConfig.setMtopAmdcWhiteList(config111);
                edit35.putString(AwcnConfig.NETWORK_MTOP_AMDC_WHITE_LIST_KEY, config111);
                edit35.apply();
            } else {
                edit35.remove(AwcnConfig.NETWORK_MTOP_AMDC_WHITE_LIST_KEY);
                edit35.apply();
            }
            str116 = null;
        } catch (Exception e119) {
            str116 = null;
            ALog.e(TAG, "setMtopAmdcWhiteList fail", null, "e", e119);
        }
        try {
            String config112 = getConfig(str, NETWORK_LONG_AMDC_WHITE_LIST_SWITCH, str116);
            SharedPreferences.Editor edit36 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config112)) {
                AwcnConfig.setLongAmdcWhiteList(config112);
                edit36.putString(AwcnConfig.NETWORK_LONG_AMDC_WHITE_LIST_KEY, config112);
                edit36.apply();
            } else {
                edit36.remove(AwcnConfig.NETWORK_LONG_AMDC_WHITE_LIST_KEY);
                edit36.apply();
            }
            str117 = null;
        } catch (Exception e120) {
            str117 = null;
            ALog.e(TAG, "setLongAmdcWhiteList fail", null, "e", e120);
        }
        try {
            String config113 = getConfig(str, NETWORK_MULTI_CONNECT_SWITCH, str117);
            if (!TextUtils.isEmpty(config113)) {
                AwcnConfig.setMultiConnectOpened(Boolean.valueOf(config113).booleanValue());
            }
            str118 = null;
        } catch (Exception e121) {
            str118 = null;
            ALog.e(TAG, "setMultiConnectOpened fail", null, "e", e121);
        }
        try {
            String config114 = getConfig(str, NETWORK_ZSTD_STREAM_DECOMPRESS_SWITCH, str118);
            if (!TextUtils.isEmpty(config114)) {
                AwcnConfig.setZstdStreamDecompressOpened(Boolean.valueOf(config114).booleanValue());
            }
            str119 = null;
        } catch (Exception e122) {
            str119 = null;
            ALog.e(TAG, "setZstdStreamDecompressOpened fail", null, "e", e122);
        }
        try {
            String config115 = getConfig(str, NETWORK_VPN_CHANGE_DETECT_ENABLE_SWITCH, str119);
            if (!TextUtils.isEmpty(config115)) {
                AwcnConfig.setVpnChangeDetectOpened(Boolean.valueOf(config115).booleanValue());
            }
            str120 = null;
        } catch (Exception e123) {
            str120 = null;
            ALog.e(TAG, "setVpnChangeDetectOpened fail", null, "e", e123);
        }
        try {
            String config116 = getConfig(str, NETWORK_XQUIC_REMOTE_SWITCH, str120);
            if (!TextUtils.isEmpty(config116)) {
                AwcnConfig.setXquicRemoteEnable(Boolean.valueOf(config116).booleanValue());
            }
            str121 = null;
        } catch (Exception e124) {
            str121 = null;
            ALog.e(TAG, "setXquicRemoteEnable fail", null, "e", e124);
        }
        try {
            String config117 = getConfig(str, NETWORK_HANDOVER_SIGNAL_SWITCH, str121);
            if (!TextUtils.isEmpty(config117)) {
                AwcnConfig.setHandoverSignalOpened(Boolean.valueOf(config117).booleanValue());
            }
            str122 = null;
        } catch (Exception e125) {
            str122 = null;
            ALog.e(TAG, "setHandoverSignalOpened fail", null, "e", e125);
        }
        try {
            String config118 = getConfig(str, NETWORK_AMDC_LOCATION_RETRY_ENABLE_SWITCH, str122);
            if (!TextUtils.isEmpty(config118)) {
                AwcnConfig.setAmdcLocationRetryEnable(Boolean.valueOf(config118).booleanValue());
            }
            str123 = null;
        } catch (Exception e126) {
            str123 = null;
            ALog.e(TAG, "setAmdcLocationRetryEnable fail", null, "e", e126);
        }
        try {
            String config119 = getConfig(str, NETWORK_LIMIT_AMDC_SWITCH, str123);
            SharedPreferences.Editor edit37 = SharePreferencesUtils.getCorePreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config119)) {
                AwcnConfig.setAmdcLimitEnable(config119);
                edit37.putString(AwcnConfig.NETWORK_LIMIT_AMDC_ENABLE, config119);
                edit37.apply();
            } else {
                edit37.remove(AwcnConfig.NETWORK_LIMIT_AMDC_ENABLE);
                edit37.apply();
            }
            str124 = null;
        } catch (Exception e127) {
            str124 = null;
            ALog.e(TAG, "setAmdcLimitEnable fail", null, "e", e127);
        }
        try {
            String config120 = getConfig(str, NETWORK_PRIORITY_UPDATE_AMDC_SWITCH, str124);
            if (!TextUtils.isEmpty(config120)) {
                AwcnConfig.setAmdcPriorityUpdateEnable(Boolean.valueOf(config120).booleanValue());
            }
            str125 = null;
        } catch (Exception e128) {
            str125 = null;
            ALog.e(TAG, "setAmdcPriorityUpdateEnable fail", null, "e", e128);
        }
        try {
            String config121 = getConfig(str, NETWORK_ZSTD_DICT_DECOMPRESS_SWITCH, str125);
            if (!TextUtils.isEmpty(config121)) {
                AwcnConfig.setZstdDictDecompressOpened(Boolean.valueOf(config121).booleanValue());
            }
            str126 = null;
        } catch (Exception e129) {
            str126 = null;
            ALog.e(TAG, "setZstdDictDecompressOpened fail", null, "e", e129);
        }
        try {
            String config122 = getConfig(str, NETWORK_ZSTD_DICT_DECOMPRESS_MTOP_SWITCH, str126);
            if (!TextUtils.isEmpty(config122)) {
                AwcnConfig.setZstdDictDecompressMtopEnable(Boolean.valueOf(config122).booleanValue());
            }
            str127 = null;
        } catch (Exception e130) {
            str127 = null;
            ALog.e(TAG, "setZstdDictDecompressMtopEnable fail", null, "e", e130);
        }
        try {
            String config123 = getConfig(str, NETWORK_ZSTD_DICT_DECOMPRESS_CHANNEL_SWITCH, str127);
            if (!TextUtils.isEmpty(config123)) {
                AwcnConfig.setZstdDictDecompressChannelEnable(Boolean.valueOf(config123).booleanValue());
            }
            str128 = null;
        } catch (Exception e131) {
            str128 = null;
            ALog.e(TAG, "setZstdDictDecompressChannelEnable fail", null, "e", e131);
        }
        try {
            String config124 = getConfig(str, NETWORK_SPDY_OFFLINE_SWITCH, str128);
            if (!TextUtils.isEmpty(config124)) {
                AwcnConfig.setSpdyOfflineEnable(Boolean.valueOf(config124).booleanValue());
            }
            str129 = null;
        } catch (Exception e132) {
            str129 = null;
            ALog.e(TAG, "setSpdyOfflineEnable fail", null, "e", e132);
        }
        try {
            String config125 = getConfig(str, NETWORK_LAST_STATUS_NONE_SWITCH, str129);
            if (!TextUtils.isEmpty(config125)) {
                AwcnConfig.setLastStatusNoneOpt(Boolean.valueOf(config125).booleanValue());
            }
            str130 = null;
        } catch (Exception e133) {
            str130 = null;
            ALog.e(TAG, "setLastStatusNoneOpt fail", null, "e", e133);
        }
        try {
            String config126 = getConfig(str, NETWORK_PRE_SESSION_OPT_SWITCH, str130);
            if (!TextUtils.isEmpty(config126)) {
                AwcnConfig.setPreSessionOptEnable(Boolean.valueOf(config126).booleanValue());
            }
            str131 = null;
        } catch (Exception e134) {
            str131 = null;
            ALog.e(TAG, "setPreSessionOptEnable fail", null, "e", e134);
        }
        try {
            String config127 = getConfig(str, NETWORK_CHANGE_HTTP3_WHITE_LIST_SWITCH, str131);
            if (!TextUtils.isEmpty(config127)) {
                AwcnConfig.setHttp3NetworkChangeWhiteList(config127);
            }
            str132 = null;
        } catch (Exception e135) {
            str132 = null;
            ALog.e(TAG, "setHttp3NetworkChangeWhiteList fail", null, "e", e135);
        }
        try {
            String config128 = getConfig(str, NETWORK_PRE_SESSION_WHITE_LIST_SWITCH, str132);
            if (!TextUtils.isEmpty(config128)) {
                AwcnConfig.setPreSessionWhiteList(config128);
            }
            str133 = null;
        } catch (Exception e136) {
            str133 = null;
            ALog.e(TAG, "setPreSessionWhiteList fail", null, "e", e136);
        }
        try {
            String config129 = getConfig(str, NETWORK_RANGE_BOOST_SWITCH, str133);
            if (!TextUtils.isEmpty(config129)) {
                AwcnConfig.setRangeBoostOpen(Boolean.valueOf(config129).booleanValue());
            }
            str134 = null;
        } catch (Exception e137) {
            str134 = null;
            ALog.e(TAG, "setRangeBoostOpen fail", null, "e", e137);
        }
        try {
            String config130 = getConfig(str, AwcnConfig.FRAGMENT_FILE_LENGTH_THRESHOLD_KEY, str134);
            if (!TextUtils.isEmpty(config130)) {
                AwcnConfig.setFragmentFileLengthThreshold(Long.valueOf(config130).longValue());
            }
            str135 = null;
        } catch (Exception e138) {
            str135 = null;
            ALog.e(TAG, "setFragmentFileLengthThreshold fail", null, "e", e138);
        }
        try {
            String config131 = getConfig(str, AwcnConfig.ZSTD_DICT_THRESHOLD_KEY, str135);
            SharedPreferences.Editor edit38 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config131)) {
                AwcnConfig.setZstdDictThreshold(config131);
                edit38.putString(AwcnConfig.ZSTD_DICT_THRESHOLD, config131);
                edit38.apply();
            } else {
                edit38.remove(AwcnConfig.ZSTD_DICT_THRESHOLD);
                edit38.apply();
            }
            str136 = null;
        } catch (Exception e139) {
            str136 = null;
            ALog.e(TAG, "setZstdDictThreshold fail", null, "e", e139);
        }
        try {
            String config132 = getConfig(str, AwcnConfig.ZSTD_DICT_FAIL_CONFIG, str136);
            SharedPreferences.Editor edit39 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config132)) {
                AwcnConfig.setZstdDictFailConfig(config132);
                edit39.putString(AwcnConfig.ZSTD_DICT_FAIL_CONFIG_KEY, config132);
                edit39.apply();
            } else {
                edit39.remove(AwcnConfig.ZSTD_DICT_FAIL_CONFIG_KEY);
                edit39.apply();
            }
            str137 = null;
        } catch (Exception e140) {
            str137 = null;
            ALog.e(TAG, "setZstdDictFailConfig fail", null, "e", e140);
        }
        try {
            String config133 = getConfig(str, NETWORK_AMDC_STRATEGY_THRESHOLD_SWITCH, str137);
            SharedPreferences.Editor edit40 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config133)) {
                AwcnConfig.setAmdcStrategyThreshold(config133);
                edit40.putString(AwcnConfig.NETWORK_AMDC_STRATEGY_THRESHOLD_KEY, config133);
                edit40.apply();
            } else {
                edit40.remove(AwcnConfig.NETWORK_AMDC_STRATEGY_THRESHOLD_KEY);
                edit40.apply();
            }
            str138 = null;
        } catch (Exception e141) {
            str138 = null;
            ALog.e(TAG, "setAmdcStrategyThreshold fail", null, "e", e141);
        }
        try {
            String config134 = getConfig(str, AwcnConfig.FRAGMENT_SIZE_KEY, str138);
            if (!TextUtils.isEmpty(config134)) {
                AwcnConfig.setFragmentSize(Long.valueOf(config134).longValue());
            }
            str139 = null;
        } catch (Exception e142) {
            str139 = null;
            ALog.e(TAG, "setFragmentSize fail", null, "e", e142);
        }
        try {
            String config135 = getConfig(str, AwcnConfig.NETWORK_QOS_SMOOTH_WINDOW_SIZE_KEY, str139);
            if (!TextUtils.isEmpty(config135)) {
                AwcnConfig.setNetworkQosSmoothWindowSize(Integer.valueOf(config135).intValue());
            }
            str140 = null;
        } catch (Exception e143) {
            str140 = null;
            ALog.e(TAG, "setNetworkQosSmoothWindowSize fail", null, "e", e143);
        }
        try {
            String config136 = getConfig(str, NETWORK_IPV6_ONLY_ENABLE_SWITCH, str140);
            if (!TextUtils.isEmpty(config136)) {
                AwcnConfig.setIpv6OnlyEnable(Boolean.valueOf(config136).booleanValue());
            }
            str141 = null;
        } catch (Exception e144) {
            str141 = null;
            ALog.e(TAG, "setIpv6OnlyEnable fail", null, "e", e144);
        }
        try {
            String config137 = getConfig(str, NETWORK_ALLOW_CONVERT_IPV4_TO_IPV6_ENABLE_SWITCH, str141);
            if (!TextUtils.isEmpty(config137)) {
                AwcnConfig.setIsAllowConvertIPv4ToIPv6(Boolean.valueOf(config137).booleanValue());
            }
            str142 = null;
        } catch (Exception e145) {
            str142 = null;
            ALog.e(TAG, "setIsAllowConvertIPv4ToIPv6 fail", null, "e", e145);
        }
        try {
            String config138 = getConfig(str, NETWORK_HTTP3_PRE_HOST_ENABLE_SWITCH, str142);
            if (!TextUtils.isEmpty(config138)) {
                AwcnConfig.setHttp3PreHostEnable(Boolean.valueOf(config138).booleanValue());
            }
            str143 = null;
        } catch (Exception e146) {
            str143 = null;
            ALog.e(TAG, "setHttp3PreHostEnable fail", null, "e", e146);
        }
        try {
            String config139 = getConfig(str, NETWORK_RETRY_USE_LONG_LINK_SWITCH, str143);
            if (!TextUtils.isEmpty(config139)) {
                AwcnConfig.setAllowRetryUseLongLinkEnable(Boolean.valueOf(config139).booleanValue());
            }
            str144 = null;
        } catch (Exception e147) {
            str144 = null;
            ALog.e(TAG, "setAllowRetryUseLongLinkEnable fail", null, "e", e147);
        }
        try {
            String config140 = getConfig(str, NETWORK_ALLOW_NET_FULL_LOW_LATENCY_SWITCH, str144);
            if (!TextUtils.isEmpty(config140)) {
                AwcnConfig.setAllowNetFullLowLatencyEnable(Boolean.valueOf(config140).booleanValue());
            }
            str145 = null;
        } catch (Exception e148) {
            str145 = null;
            ALog.e(TAG, "setAllowNetFullLowLatencyEnable fail", null, "e", e148);
        }
        try {
            String config141 = getConfig(str, NETWORK_STRATEGY_COMPARE_ENABLE_SWITCH, str145);
            if (!TextUtils.isEmpty(config141)) {
                AwcnConfig.setStrategyCompareEnable(Boolean.valueOf(config141).booleanValue());
            }
            str146 = null;
        } catch (Exception e149) {
            str146 = null;
            ALog.e(TAG, "setStrategyCompareEnable fail", null, "e", e149);
        }
        try {
            String config142 = getConfig(str, NETWORK_PRE_HOST_MCC_ENABLE_SWITCH, str146);
            if (!TextUtils.isEmpty(config142)) {
                AwcnConfig.setPreHostMccNotUseEnable(Boolean.valueOf(config142).booleanValue());
            }
            str147 = null;
        } catch (Exception e150) {
            str147 = null;
            ALog.e(TAG, "setPreHostMccNotUseEnable fail", null, "e", e150);
        }
        try {
            String config143 = getConfig(str, NETWORK_HTTP3_RECONNECT_ENABLE_SWITCH, str147);
            if (!TextUtils.isEmpty(config143)) {
                AwcnConfig.setHttp3ReconnectEnable(Boolean.valueOf(config143).booleanValue());
            }
            str148 = null;
        } catch (Exception e151) {
            str148 = null;
            ALog.e(TAG, "setHttp3ReconnectEnable fail", null, "e", e151);
        }
        try {
            String config144 = getConfig(str, NETWORK_REQ_FEC_SIZE_OPT_SWITCH, str148);
            if (!TextUtils.isEmpty(config144)) {
                AwcnConfig.setReqFecSizeOptEnable(Boolean.valueOf(config144).booleanValue());
            }
            str149 = null;
        } catch (Exception e152) {
            str149 = null;
            ALog.e(TAG, "setReqFecSizeOptEnable fail", null, "e", e152);
        }
        try {
            String config145 = getConfig(str, NETWORK_REQ_FEC_SIZE_WHITE_LIST_SWITCH, str149);
            SharedPreferences.Editor edit41 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config145)) {
                AwcnConfig.setReqFecSizeWhiteList(config145);
                edit41.putString(AwcnConfig.NETWORK_REQ_FEC_SIZE_WHITE_LIST_KEY, config145);
                edit41.apply();
            } else {
                edit41.remove(AwcnConfig.NETWORK_REQ_FEC_SIZE_WHITE_LIST_KEY);
                edit41.apply();
            }
            str150 = null;
        } catch (Exception e153) {
            str150 = null;
            ALog.e(TAG, "setReqFecSizeWhiteList fail", null, "e", e153);
        }
        try {
            String config146 = getConfig(str, NETWORK_REQ_UP_FEC_SIZE_WHITE_LIST_SWITCH, str150);
            SharedPreferences.Editor edit42 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config146)) {
                AwcnConfig.setReqFecUpSizeWhiteList(config146);
                edit42.putString(AwcnConfig.NETWORK_REQ_UP_FEC_SIZE_WHITE_LIST_KEY, config146);
                edit42.apply();
            } else {
                edit42.remove(AwcnConfig.NETWORK_REQ_UP_FEC_SIZE_WHITE_LIST_KEY);
                edit42.apply();
            }
            str151 = null;
        } catch (Exception e154) {
            str151 = null;
            ALog.e(TAG, "setReqFecUpSizeWhiteList fail", null, "e", e154);
        }
        try {
            SharedPreferences.Editor edit43 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config147 = getConfig(str, NETWORK_WAIT_THREAD_COUNT_CONFIG_SWITCH, str151);
            if (!TextUtils.isEmpty(config147)) {
                AwcnConfig.setWaitThreadCountConfig(config147);
                edit43.putString(AwcnConfig.NETWORK_WAIT_THREAD_COUNT_KEY, config147).apply();
            } else {
                edit43.remove(AwcnConfig.NETWORK_WAIT_THREAD_COUNT_KEY).apply();
            }
            str152 = null;
        } catch (Exception e155) {
            str152 = null;
            ALog.e(TAG, "setWaitThreadCountConfig fail", null, "e", e155);
        }
        try {
            SharedPreferences.Editor edit44 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config148 = getConfig(str, NETWORK_METRICS_TIME_KEY_SWITCH, str152);
            if (!TextUtils.isEmpty(config148)) {
                AwcnConfig.setNetworkMetricsTimeConfig(config148);
                edit44.putString(AwcnConfig.NETWORK_METRICS_TIME_KEY, config148).apply();
            } else {
                edit44.remove(AwcnConfig.NETWORK_METRICS_TIME_KEY).apply();
            }
            str153 = null;
        } catch (Exception e156) {
            str153 = null;
            ALog.e(TAG, "setWaitThreadCountConfig fail", null, "e", e156);
        }
        try {
            SharedPreferences.Editor edit45 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config149 = getConfig(str, NETWORK_MULTI_PATH_TRIGGER_TIME, str153);
            if (!TextUtils.isEmpty(config149)) {
                long longValue = Long.valueOf(config149).longValue();
                NetworkConfigCenter.setMultiPathTriggerTime(longValue);
                edit45.putLong(NetworkConfigCenter.MULTI_PATH_TRIGGER_TIME, longValue).apply();
            } else {
                edit45.remove(NetworkConfigCenter.MULTI_PATH_TRIGGER_TIME).apply();
            }
            str154 = null;
        } catch (Exception e157) {
            str154 = null;
            ALog.e(TAG, "setMultiPathTriggerTime fail", null, "e", e157);
        }
        try {
            SharedPreferences.Editor edit46 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config150 = getConfig(str, NETWORK_CHANGE_THRESHOLD_TIME, str154);
            if (!TextUtils.isEmpty(config150)) {
                long longValue2 = Long.valueOf(config150).longValue();
                NetworkConfigCenter.setNetworkChangeThresholdTime(longValue2);
                edit46.putLong(NetworkConfigCenter.NETWORK_CHANGE_THRESHOLD_TIME, longValue2).apply();
            } else {
                edit46.remove(NetworkConfigCenter.NETWORK_CHANGE_THRESHOLD_TIME).apply();
            }
            str155 = null;
        } catch (Exception e158) {
            str155 = null;
            ALog.e(TAG, "setNetworkChangeThresholdTime fail", null, "e", e158);
        }
        try {
            SharedPreferences.Editor edit47 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config151 = getConfig(str, NETWORK_MULTI_PATH_BIZ_WHITE_LIST, str155);
            if (!TextUtils.isEmpty(config151)) {
                NetworkConfigCenter.setMultiPathWhiteBiz(config151);
                edit47.putString(NetworkConfigCenter.MULTI_PATH_WHITE_BIZ, config151).apply();
            } else {
                edit47.remove(NetworkConfigCenter.MULTI_PATH_WHITE_BIZ).apply();
            }
            str156 = null;
        } catch (Exception e159) {
            str156 = null;
            ALog.e(TAG, "setMultiPathWhiteBiz fail", null, "e", e159);
        }
        try {
            SharedPreferences.Editor edit48 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config152 = getConfig(str, NETWORK_MULTI_PATH_URL_WHITE_LIST, str156);
            if (!TextUtils.isEmpty(config152)) {
                NetworkConfigCenter.setMultiPathWhiteURL(config152);
                edit48.putString(NetworkConfigCenter.MULTI_PATH_WHITE_URL, config152).apply();
            } else {
                edit48.remove(NetworkConfigCenter.MULTI_PATH_WHITE_URL).apply();
            }
            str157 = null;
        } catch (Exception e160) {
            str157 = null;
            ALog.e(TAG, "setMultiPathWhiteURL fail", null, "e", e160);
        }
        try {
            SharedPreferences.Editor edit49 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config153 = getConfig(str, NETWORK_MULTI_PATH_AB_WHITE_LIST, str157);
            if (!TextUtils.isEmpty(config153)) {
                NetworkConfigCenter.setMultiPathAbWhiteList(config153);
                edit49.putString(NetworkConfigCenter.MULTI_PATH_WHITE_AB, config153).apply();
            } else {
                edit49.remove(NetworkConfigCenter.MULTI_PATH_WHITE_AB).apply();
            }
            str158 = null;
        } catch (Exception e161) {
            str158 = null;
            ALog.e(TAG, "setMultiPathAbWhiteList fail", null, "e", e161);
        }
        try {
            SharedPreferences.Editor edit50 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config154 = getConfig(str, NETWORK_MULTI_PATH_MONITOR_ENABLE_SWITCH, str158);
            if (!TextUtils.isEmpty(config154)) {
                boolean booleanValue5 = Boolean.valueOf(config154).booleanValue();
                AwcnConfig.setMultiNetworkMonitorEnable(booleanValue5);
                edit50.putBoolean(AwcnConfig.MULTI_PATH_MONITOR_KEY, booleanValue5).apply();
            } else {
                edit50.remove(AwcnConfig.MULTI_PATH_MONITOR_KEY).apply();
            }
            str159 = null;
        } catch (Exception e162) {
            str159 = null;
            ALog.e(TAG, "setMultiNetworkMonitorEnable fail", null, "e", e162);
        }
        try {
            SharedPreferences.Editor edit51 = SharePreferencesUtils.getCorePreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config155 = getConfig(str, NETWORK_MULTI_PATH_HARMONY_WHITE_LIST, str159);
            if (!TextUtils.isEmpty(config155)) {
                AwcnConfig.setHarmonyWhiteList(config155);
                edit51.putString(AwcnConfig.MULTI_PATH_HARMONY_WHITE_LIST, config155).apply();
            } else {
                edit51.remove(AwcnConfig.MULTI_PATH_HARMONY_WHITE_LIST).apply();
            }
            str160 = null;
        } catch (Exception e163) {
            str160 = null;
            ALog.e(TAG, "setHarmonyWhiteList fail", null, "e", e163);
        }
        try {
            String config156 = getConfig(str, NETWORK_MULTI_PATH_USER_TOAST_TEXT, str160);
            if (!TextUtils.isEmpty(config156)) {
                AwcnConfig.setMultiPathUserToastText(config156);
            }
            str161 = null;
        } catch (Exception e164) {
            str161 = null;
            ALog.e(TAG, "setMultiPathUserToastText fail", null, "e", e164);
        }
        try {
            String config157 = getConfig(str, NETWORK_MULTI_PATH_TOAST_TIRE_TIME, str161);
            if (!TextUtils.isEmpty(config157)) {
                AwcnConfig.setMultiPathToastTireTime(Integer.parseInt(config157));
            }
            str162 = null;
        } catch (Exception e165) {
            str162 = null;
            ALog.e(TAG, "setMultiPathToastTireTime fail", null, "e", e165);
        }
        try {
            String config158 = getConfig(str, NETWORK_HTTP3_BLACK_LIST_SWITCH, str162);
            SharedPreferences.Editor edit52 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config158)) {
                AwcnConfig.setHttp3BlackList(config158);
                edit52.putString(AwcnConfig.HTTP3_BLACK_LIST_KEY, config158);
                edit52.apply();
            } else {
                edit52.remove(AwcnConfig.HTTP3_BLACK_LIST_KEY);
                edit52.apply();
            }
            str163 = null;
        } catch (Exception e166) {
            str163 = null;
            ALog.e(TAG, "setHttp3BlackList fail", null, "e", e166);
        }
        try {
            String config159 = getConfig(str, NETWORK_HTTP3_VIP_BLACK_LIST_SWITCH, str163);
            SharedPreferences.Editor edit53 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config159)) {
                AwcnConfig.setHttp3VipBlackList(config159);
                edit53.putString(AwcnConfig.HTTP3_VIP_BLACK_LIST_KEY, config159);
                edit53.apply();
            } else {
                edit53.remove(AwcnConfig.HTTP3_VIP_BLACK_LIST_KEY);
                edit53.apply();
            }
            str164 = null;
        } catch (Exception e167) {
            str164 = null;
            ALog.e(TAG, "setHttp3VipBlackList fail", null, "e", e167);
        }
        try {
            String config160 = getConfig(str, NETWORK_HTTP3_WHITE_LIST_SWITCH, str164);
            if (!TextUtils.isEmpty(config160)) {
                AwcnConfig.setHttp3WhiteList(config160);
            }
            str165 = null;
        } catch (Exception e168) {
            str165 = null;
            ALog.e(TAG, "setHttp3WhiteList fail", null, "e", e168);
        }
        try {
            String config161 = getConfig(str, NETWORK_ZSTD_DICT_WHITE_LIST_SWITCH, str165);
            SharedPreferences.Editor edit54 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config161)) {
                AwcnConfig.setZstdDictDecompressWhiteList(config161);
                edit54.putString(AwcnConfig.NETWORK_ZSTD_DICT_WHITE_LIST_KEY, config161);
                edit54.apply();
            } else {
                edit54.remove(AwcnConfig.NETWORK_ZSTD_DICT_WHITE_LIST_KEY);
                edit54.apply();
            }
            str166 = null;
        } catch (Exception e169) {
            str166 = null;
            ALog.e(TAG, "setZstdDictDecompressWhiteList fail", null, "e", e169);
        }
        try {
            String config162 = getConfig(str, NETWORK_LUNCH_AFTER_AMDC_WHITE_LIST_SWITCH, str166);
            SharedPreferences.Editor edit55 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config162)) {
                AwcnConfig.setLunchAfterAmdcList(config162);
                edit55.putString(AwcnConfig.NETWORK_LUNCH_AFTER_AMDC_WHITE_LIST_KEY, config162);
                edit55.apply();
            } else {
                edit55.remove(AwcnConfig.NETWORK_LUNCH_AFTER_AMDC_WHITE_LIST_KEY);
                edit55.apply();
            }
            str167 = null;
        } catch (Exception e170) {
            str167 = null;
            ALog.e(TAG, "setLunchAfterAmdcList fail", null, "e", e170);
        }
        try {
            String config163 = getConfig(str, NETWORK_HTTP3_1RTT_WHITE_LIST_SWITCH, str167);
            SharedPreferences.Editor edit56 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config163)) {
                AwcnConfig.set1RttHttp3WhiteList(config163);
                edit56.putString(AwcnConfig.HTTP3_1RTT_WHITE_LIST_KEY, config163);
                edit56.apply();
            } else {
                edit56.remove(AwcnConfig.HTTP3_1RTT_WHITE_LIST_KEY);
                edit56.apply();
            }
            str168 = null;
        } catch (Exception e171) {
            str168 = null;
            ALog.e(TAG, "set1RttHttp3WhiteList fail", null, "e", e171);
        }
        try {
            String config164 = getConfig(str, NETWORK_HTTP3_DISABLE_HOST_WHITE_LIST_SWITCH, str168);
            SharedPreferences.Editor edit57 = SharePreferencesUtils.getCorePreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config164)) {
                AwcnConfig.setHttp3DisabledWhiteList(config164);
                edit57.putString(AwcnConfig.NETWORK_HTTP3_DISABLE_HOST_WHITE_LIST_KEY, config164);
                edit57.apply();
            } else {
                edit57.remove(AwcnConfig.NETWORK_HTTP3_DISABLE_HOST_WHITE_LIST_KEY);
                edit57.apply();
            }
            str169 = null;
        } catch (Exception e172) {
            str169 = null;
            ALog.e(TAG, "setHttp3DisabledWhiteList fail", null, "e", e172);
        }
        try {
            String config165 = getConfig(str, NETWORK_HTTP3_0RTT_WHITE_LIST_SWITCH, str169);
            SharedPreferences.Editor edit58 = SharePreferencesUtils.getCorePreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config165)) {
                AwcnConfig.set0RttHttp3WhiteList(config165);
                edit58.putString(AwcnConfig.HTTP3_0RTT_WHITE_LIST_KEY, config165);
                edit58.apply();
            } else {
                edit58.remove(AwcnConfig.HTTP3_0RTT_WHITE_LIST_KEY);
                edit58.apply();
            }
            str170 = null;
        } catch (Exception e173) {
            str170 = null;
            ALog.e(TAG, "set0RttHttp3WhiteList fail", null, "e", e173);
        }
        try {
            String config166 = getConfig(str, NETWORK_ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_SWITCH, str170);
            SharedPreferences.Editor edit59 = SharePreferencesUtils.getCorePreferences(NetworkSdkSetting.getContext()).edit();
            if (!TextUtils.isEmpty(config166)) {
                AwcnConfig.setAllowRetryUseLongLinkWhiteList(config166);
                edit59.putString(AwcnConfig.ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_KEY, config166);
                edit59.apply();
            } else {
                edit59.remove(AwcnConfig.ALLOW_RETRY_USE_LONG_LINK_WHITE_LIST_KEY);
                edit59.apply();
            }
            str171 = null;
        } catch (Exception e174) {
            str171 = null;
            ALog.e(TAG, "setAllowRetryUseLongLinkWhiteList fail", null, "e", e174);
        }
        try {
            SharedPreferences.Editor edit60 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config167 = getConfig(str, "network_qos_biz_white_list", str171);
            if (!TextUtils.isEmpty(config167)) {
                AwcnConfig.setQosBizWhiteList(config167);
                edit60.putString("network_qos_biz_white_list", config167).apply();
            } else {
                edit60.remove("network_qos_biz_white_list").apply();
            }
            str172 = null;
        } catch (Exception e175) {
            str172 = null;
            ALog.e(TAG, "setQosBizWhiteList fail", null, "e", e175);
        }
        try {
            SharedPreferences.Editor edit61 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config168 = getConfig(str, "network_qos_host_white_list", str172);
            if (!TextUtils.isEmpty(config168)) {
                AwcnConfig.setQosHostWhiteList(config168);
                edit61.putString("network_qos_host_white_list", config168).apply();
            } else {
                edit61.remove("network_qos_host_white_list").apply();
            }
            str173 = null;
        } catch (Exception e176) {
            str173 = null;
            ALog.e(TAG, "setQosHostWhiteList fail", null, "e", e176);
        }
        try {
            String config169 = getConfig(str, AwcnConfig.NETWORK_DOWNLOAD_ASYNC_RATIO, str173);
            if (!TextUtils.isEmpty(config169)) {
                AwcnConfig.setDownloadAsyncRatio(Integer.parseInt(config169), PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit(), GlobalAppRuntimeInfo.getContext());
            }
            str174 = null;
        } catch (Exception e177) {
            str174 = null;
            ALog.e(TAG, "setDownloadAsyncRatio fail", null, "e", e177);
        }
        try {
            SharedPreferences.Editor edit62 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config170 = getConfig(str, NETWORK_HTTP3_OPT_WHITE_LIST_SWITCH, str174);
            if (!TextUtils.isEmpty(config170)) {
                AwcnConfig.setHttp3OptWhiteList(config170);
                edit62.putString(AwcnConfig.HTTP3_OPT_WHITE_LIST_KEY, config170).apply();
            } else {
                edit62.remove(AwcnConfig.HTTP3_OPT_WHITE_LIST_KEY).apply();
            }
            str175 = null;
        } catch (Exception e178) {
            str175 = null;
            ALog.e(TAG, "setHttp3OptWhiteList fail", null, "e", e178);
        }
        try {
            String config171 = getConfig(str, NETWORK_DIAGNOSIS_ENABLE_SWITCH, str175);
            if (!TextUtils.isEmpty(config171)) {
                NetworkConfigCenter.setNetworkDiagnosisOpened(Boolean.valueOf(config171).booleanValue());
            }
            str176 = null;
        } catch (Exception e179) {
            str176 = null;
            ALog.e(TAG, "setNetworkDiagnosisOpened fail", null, "e", e179);
        }
        try {
            String config172 = getConfig(str, NETWORK_EXCEPTION_DETECT_URL, str176);
            if (!TextUtils.isEmpty(config172)) {
                AwcnConfig.setExceptionDetectUrl(config172);
            }
            str177 = null;
        } catch (Exception e180) {
            str177 = null;
            ALog.e(TAG, "setExceptionDetectUrl fail", null, "e", e180);
        }
        try {
            String config173 = getConfig(str, NETWORK_HTTP_DETECT_WHITE_LIST, str177);
            if (!TextUtils.isEmpty(config173)) {
                AwcnConfig.setHttpDetectWhiteList(config173);
            }
            str178 = null;
        } catch (Exception e181) {
            str178 = null;
            ALog.e(TAG, "setHttpDetectWhiteList fail", null, "e", e181);
        }
        try {
            String config174 = getConfig(str, NETWORK_DETECT_CENTER_ENABLE_SWITCH, str178);
            SharedPreferences.Editor edit63 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            if (!TextUtils.isEmpty(config174)) {
                boolean booleanValue6 = Boolean.valueOf(config174).booleanValue();
                edit63.putBoolean(AwcnConfig.DETECT_CENTER_ENABLE, booleanValue6);
                AwcnConfig.setDetectCenterEnable(booleanValue6);
            } else {
                edit63.remove(AwcnConfig.DETECT_CENTER_ENABLE);
            }
            edit63.apply();
            str179 = null;
        } catch (Exception e182) {
            str179 = null;
            ALog.e(TAG, "setDetectCenterEnable fail", null, "e", e182);
        }
        try {
            String config175 = getConfig(str, NETWORK_COMPLEX_CONNECT_ENABLE_SWITCH, str179);
            if (!TextUtils.isEmpty(config175)) {
                AwcnConfig.setComplexConnectEnable(Boolean.valueOf(config175).booleanValue());
            }
            str180 = null;
        } catch (Exception e183) {
            str180 = null;
            ALog.e(TAG, "setComplexConnectEnable fail", null, "e", e183);
        }
        try {
            String config176 = getConfig(str, NETWORK_COMPLEX_CONNECT_WHITE_LIST, str180);
            if (!TextUtils.isEmpty(config176)) {
                AwcnConfig.setComplexConnectWhiteList(config176);
            }
            str181 = null;
        } catch (Exception e184) {
            str181 = null;
            ALog.e(TAG, "setComplexConnectWhiteList fail", null, "e", e184);
        }
        try {
            String config177 = getConfig(str, NETWORK_DELAY_COMPLEX_CONNECT, str181);
            if (!TextUtils.isEmpty(config177)) {
                AwcnConfig.setComplexConnectDelayTime(Long.valueOf(config177).longValue());
            }
            str182 = null;
        } catch (Exception e185) {
            str182 = null;
            ALog.e(TAG, "setComplexConnectDelayTime fail", null, "e", e185);
        }
        try {
            String config178 = getConfig(str, NETWORK_FAST_DEGRADE_WHITE_LIST, str182);
            if (!TextUtils.isEmpty(config178)) {
                NetworkConfigCenter.setAllowFastDegradeUrlList(config178);
            }
            str183 = null;
        } catch (Exception e186) {
            str183 = null;
            ALog.e(TAG, "setAllowFastDegradeUrlList fail", null, "e", e186);
        }
        try {
            String config179 = getConfig(str, NETWORK_IPV6_DETECT_ENABLE_SWITCH, str183);
            SharedPreferences.Editor edit64 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            if (!TextUtils.isEmpty(config179)) {
                boolean booleanValue7 = Boolean.valueOf(config179).booleanValue();
                AwcnConfig.setIpv6DetectEnable(booleanValue7);
                edit64.putBoolean(AwcnConfig.IPV6_DETECT_KEY, booleanValue7);
            } else {
                edit64.remove(AwcnConfig.IPV6_DETECT_KEY);
            }
            edit64.apply();
            str184 = null;
        } catch (Exception e187) {
            str184 = null;
            ALog.e(TAG, "setIpv6DetectEnable fail", null, "e", e187);
        }
        try {
            String config180 = getConfig(str, NETWORK_MTU_DETECT_ENABLE_SWITCH, str184);
            if (!TextUtils.isEmpty(config180)) {
                AwcnConfig.setMTUDetectEnable(Boolean.valueOf(config180).booleanValue());
            }
            str185 = null;
        } catch (Exception e188) {
            str185 = null;
            ALog.e(TAG, "setMTUDetectEnable fail", null, "e", e188);
        }
        try {
            String config181 = getConfig(str, NETWORK_IPV6_STACK_RECTIFICATION_ENABLE_SWITCH, str185);
            SharedPreferences.Editor edit65 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            if (!TextUtils.isEmpty(config181)) {
                boolean booleanValue8 = Boolean.valueOf(config181).booleanValue();
                AwcnConfig.setIpv6RectificationEnable(booleanValue8);
                edit65.putBoolean(AwcnConfig.IPV6_RECTIFICATION_KEY, booleanValue8);
            } else {
                edit65.remove(AwcnConfig.IPV6_RECTIFICATION_KEY);
            }
            edit65.apply();
            str186 = null;
        } catch (Exception e189) {
            str186 = null;
            ALog.e(TAG, "setIpv6RectificationEnable fail", null, "e", e189);
        }
        try {
            String config182 = getConfig(str, NETWORK_OKHTTP_SWITCH, str186);
            SharedPreferences.Editor edit66 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            if (!TextUtils.isEmpty(config182)) {
                boolean booleanValue9 = Boolean.valueOf(config182).booleanValue();
                AwcnConfig.setOkHttpEnable(booleanValue9);
                edit66.putBoolean(AwcnConfig.NETWORK_OKHTTP_KEY, booleanValue9);
            } else {
                edit66.remove(AwcnConfig.NETWORK_OKHTTP_KEY);
            }
            edit66.apply();
            str187 = null;
        } catch (Exception e190) {
            str187 = null;
            ALog.e(TAG, "setOkHttpEnable fail", null, "e", e190);
        }
        try {
            String config183 = getConfig(str, NETWORK_TUNNEL_ENABLE_SWITCH, str187);
            SharedPreferences.Editor edit67 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            if (!TextUtils.isEmpty(config183)) {
                boolean booleanValue10 = Boolean.valueOf(config183).booleanValue();
                AwcnConfig.setTunnelEnable(booleanValue10);
                edit67.putBoolean(AwcnConfig.NETWORK_TUNNEL_KEY, booleanValue10);
            } else {
                edit67.remove(AwcnConfig.NETWORK_TUNNEL_KEY);
            }
            edit67.apply();
            str188 = null;
        } catch (Exception e191) {
            str188 = null;
            ALog.e(TAG, "setTunnelEnable fail", null, "e", e191);
        }
        try {
            SharedPreferences.Editor edit68 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config184 = getConfig(str, NETWORK_OKHTTP_HOST_WHITE_LIST, str188);
            if (!TextUtils.isEmpty(config184)) {
                AwcnConfig.setOkhttpHostWhiteList(config184);
                edit68.putString(AwcnConfig.OKHTTP_H2_WHITE_LIST_KEY, config184).apply();
            } else {
                edit68.remove(AwcnConfig.OKHTTP_H2_WHITE_LIST_KEY).apply();
            }
            str189 = null;
        } catch (Exception e192) {
            str189 = null;
            ALog.e(TAG, "setOkhttpHostWhiteList fail", null, "e", e192);
        }
        try {
            SharedPreferences.Editor edit69 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config185 = getConfig(str, "network_okhttp_pre_build_list", str189);
            if (!TextUtils.isEmpty(config185)) {
                AwcnConfig.setOkhttpPreBuildList(config185);
                edit69.putString("network_okhttp_pre_build_list", config185).apply();
            } else {
                edit69.remove("network_okhttp_pre_build_list").apply();
            }
            str190 = null;
        } catch (Exception e193) {
            str190 = null;
            ALog.e(TAG, "setOkhttpPreBuildList fail", null, "e", e193);
        }
        try {
            String config186 = getConfig(str, NETWORK_RTT_DETECTOR_ENABLE_SWITCH, str190);
            if (!TextUtils.isEmpty(config186)) {
                AwcnConfig.setRTTDetectEnable(Boolean.valueOf(config186).booleanValue());
            }
            str191 = null;
        } catch (Exception e194) {
            str191 = null;
            ALog.e(TAG, "setRTTDetectEnable fail", null, "e", e194);
        }
        try {
            String config187 = getConfig(str, NETWORK_FALCO_ID_ENABLE_SWITCH, str191);
            if (!TextUtils.isEmpty(config187)) {
                NetworkConfigCenter.setFalcoIdEnable(Boolean.valueOf(config187).booleanValue());
            }
            str192 = null;
        } catch (Exception e195) {
            str192 = null;
            ALog.e(TAG, "setFalcoIdEnable fail", null, "e", e195);
        }
        try {
            String config188 = getConfig(str, NETWORK_ANALYSIS_MONITOR, str192);
            if (!TextUtils.isEmpty(config188)) {
                NetworkConfigCenter.setNetworkAnalysisMonitor(Boolean.valueOf(config188).booleanValue());
            }
            str193 = null;
        } catch (Exception e196) {
            str193 = null;
            ALog.e(TAG, "setNetworkAnalysisMonitor fail", null, "e", e196);
        }
        try {
            SharedPreferences.Editor edit70 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config189 = getConfig(str, "network_falco_id_white_list", str193);
            if (!TextUtils.isEmpty(config189)) {
                NetworkConfigCenter.setFalcoIdWhiteList(config189);
                edit70.putString("network_falco_id_white_list", config189).apply();
            } else {
                edit70.remove("network_falco_id_white_list").apply();
            }
            str194 = null;
        } catch (Exception e197) {
            str194 = null;
            ALog.e(TAG, "setFalcoIdWhiteList fail", null, "e", e197);
        }
        try {
            String config190 = getConfig(str, NETWORK_SESSION_WAIT_TIME, str194);
            if (!TextUtils.isEmpty(config190)) {
                NetworkConfigCenter.setSessionConnectWaitTime(Integer.valueOf(config190).intValue());
            }
            str195 = null;
        } catch (Exception e198) {
            str195 = null;
            ALog.e(TAG, "setSessionConnectWaitTime fail", null, "e", e198);
        }
        try {
            String config191 = getConfig(str, NETWORK_HTTP_SESSION_WAIT_TIME, str195);
            if (!TextUtils.isEmpty(config191)) {
                NetworkConfigCenter.setHttpSessionConnectWaitTime(Integer.valueOf(config191).intValue());
            }
            str196 = null;
        } catch (Exception e199) {
            str196 = null;
            ALog.e(TAG, "setHttpSessionConnectWaitTime fail", null, "e", e199);
        }
        try {
            String config192 = getConfig(str, NETWORK_SOCKET_BOOST_HOST_LIST, str196);
            if (!TextUtils.isEmpty(config192)) {
                AwcnConfig.setSocketBoostHost(config192);
            }
            str197 = null;
        } catch (Exception e200) {
            str197 = null;
            ALog.e(TAG, "setSocketBoostHost fail", null, "e", e200);
        }
        try {
            SharedPreferences.Editor edit71 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config193 = getConfig(str, "network_http_cache_config", str197);
            if (!TextUtils.isEmpty(config193)) {
                NetworkConfigCenter.setHttpCacheConfigs(config193);
                edit71.putString("network_http_cache_config", config193).apply();
            } else {
                edit71.remove("network_http_cache_config").apply();
            }
            str198 = null;
        } catch (Exception e201) {
            str198 = null;
            ALog.e(TAG, "setHttpCacheConfigs fail", null, "e", e201);
        }
        try {
            String config194 = getConfig(str, NETWORK_MPQUIC_ENABLE_SWITCH, str198);
            if (!TextUtils.isEmpty(config194)) {
                AwcnConfig.setMPQuicConfigSwitch(Boolean.valueOf(config194).booleanValue());
            }
            str199 = null;
        } catch (Exception e202) {
            str199 = null;
            ALog.e(TAG, "setMPQuicConfigSwitch fail", null, "e", e202);
        }
        try {
            String config195 = getConfig(str, NETWORK_EAGAGIN_OPTIMIZE_SWITCH, str199);
            if (!TextUtils.isEmpty(config195)) {
                AwcnConfig.setEagainOptimizeEnable(Boolean.valueOf(config195).booleanValue());
            }
            str200 = null;
        } catch (Exception e203) {
            str200 = null;
            ALog.e(TAG, "setEagainOptimizeEnable fail", null, "e", e203);
        }
        try {
            SharedPreferences.Editor edit72 = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config196 = getConfig(str, NETWORK_REDUNDANT_SESSION_FIX_ENABLE, str200);
            if (!TextUtils.isEmpty(config196)) {
                edit72.putBoolean(AwcnConfig.NETWORK_REDUNDANT_SESSION_FIX, Boolean.valueOf(config196).booleanValue()).apply();
            } else {
                edit72.remove(AwcnConfig.NETWORK_REDUNDANT_SESSION_FIX).apply();
            }
        } catch (Exception e204) {
            ALog.e(TAG, "network_redundant_session_fix_switch fail", null, "e", e204);
        }
    }

    @Override // anetwork.channel.config.IRemoteConfig
    public void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
        } else if (!mOrangeValid) {
            ALog.w(TAG, "no orange sdk", null, new Object[0]);
        } else {
            try {
                OrangeConfig.getInstance().registerListener(new String[]{NETWORK_SDK_GROUP, "amdc", NETWORK_NAVIGATOR_TASK_GROUP}, new z8l() { // from class: anet.channel.config.OrangeConfigImpl.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.z8l
                    public void onConfigUpdate(String str, boolean z) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                        } else {
                            OrangeConfigImpl.this.onConfigUpdate(str);
                        }
                    }
                });
                getConfig(NETWORK_SDK_GROUP, NETWORK_EMPTY_SCHEME_HTTPS_SWITCH, "true");
                getConfig("amdc", AMDC_CONTROL_MODE, null);
            } catch (Exception e) {
                ALog.e(TAG, "register fail", null, e, new Object[0]);
            }
        }
    }

    @Override // anetwork.channel.config.IRemoteConfig
    public void unRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a98eee3", new Object[]{this});
        } else if (!mOrangeValid) {
            ALog.w(TAG, "no orange sdk", null, new Object[0]);
        } else {
            OrangeConfig.getInstance().unregisterListener(new String[]{NETWORK_SDK_GROUP});
        }
    }

    private void updateAmdcConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb27cc87", new Object[]{this, str});
            return;
        }
        try {
            String config = getConfig(str, AMDC_CONTROL_MODE, null);
            String config2 = getConfig(str, AMDC_CONTROL_LIST, null);
            if (!TextUtils.isEmpty(config) && !TextUtils.isEmpty(config2)) {
                int intValue = Integer.valueOf(config).intValue();
                JSONArray jSONArray = new JSONArray(config2);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                AmdcRuntimeInfo.setControlMode(intValue, arrayList);
            }
        } catch (Exception e) {
            ALog.e(TAG, "[updateAmdcConfig]", null, e, new Object[0]);
        }
        try {
            String config3 = getConfig(str, AMDC_UPDATE_MODE_ENABLE_SWITCH, null);
            if (!TextUtils.isEmpty(config3)) {
                AmdcRuntimeInfo.setUpdateModeEnable(Boolean.parseBoolean(config3));
            }
        } catch (Exception e2) {
            ALog.e(TAG, "setUpdateModeEnable fail", null, "e", e2);
        }
    }

    private void updateNetworkDnsConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7d5037", new Object[]{this, str});
            return;
        }
        try {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext()).edit();
            String config = getConfig(str, NETWORK_DNS_WHITE_LIST, null);
            if (!TextUtils.isEmpty(config)) {
                AwcnConfig.setDnsOptWhiteList(config);
                edit.putString(AwcnConfig.NETWORK_DNS_OPT_WHITE_LIST, config).apply();
            } else {
                edit.remove(AwcnConfig.NETWORK_DNS_OPT_WHITE_LIST).apply();
            }
        } catch (Exception e) {
            ALog.e(TAG, "setDnsOptWhiteList fail", null, "e", e);
        }
    }

    @Override // anetwork.channel.config.IRemoteConfig
    public String getConfig(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81adcca0", new Object[]{this, strArr});
        }
        if (!mOrangeValid) {
            ALog.w(TAG, "no orange sdk", null, new Object[0]);
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig(strArr[0], strArr[1], strArr[2]);
        } catch (Exception e) {
            ALog.e(TAG, "get config failed!", null, e, new Object[0]);
            return null;
        }
    }

    @Override // anetwork.channel.config.IRemoteConfig
    public void onConfigUpdate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
            return;
        }
        ALog.i(TAG, "onConfigUpdate", null, "namespace", str);
        try {
            if (NETWORK_SDK_GROUP.equals(str)) {
                updateNetworkConfig(str);
            } else if ("amdc".equals(str)) {
                updateAmdcConfig(str);
            } else if (NETWORK_NAVIGATOR_TASK_GROUP.equals(str)) {
                updateNetworkDnsConfig(str);
            }
        } catch (Throwable th) {
            AppMonitor.getInstance().commitStat(new OrangeConfigStatistic(str, th.getCause().toString()));
            ALog.e(TAG, "onConfigUpdate error=" + th.toString(), null, "namespace", str);
        }
    }
}
