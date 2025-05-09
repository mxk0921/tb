package anetwork.channel.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ABSwitchUtils;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.Utils;
import anetwork.channel.cache.CacheConfig;
import anetwork.channel.cache.CacheManager;
import anetwork.channel.http.NetworkSdkSetting;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkConfigCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ALLOW_ADD_AB_HEADER_IN_MTOP = "ALLOW_ADD_AB_HEADER_IN_MTOP";
    private static final String ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED = "ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED";
    private static final String CACHE_FLAG = "Cache.Flag";
    private static final String CHANNEL_LOCAL_INSTANCE_ENABLE = "CHANNEL_LOCAL_INSTANCE_ENABLE";
    private static final boolean DEFAULT_FALCO_ID_ENABLE = true;
    private static final int DEFAULT_HTTP_SESSION_CONNECT_WAIT_TIME = 1000;
    private static final boolean DEFAULT_MP_NETWORK_OPENED = true;
    private static final boolean DEFAULT_MULTI_PATH_OPENED = true;
    private static final long DEFAULT_MULTI_PATH_TRIGGER_TIME = 1500;
    private static final boolean DEFAULT_NETWORK_ANALYSIS_MONITOR_OPENED = true;
    private static final long DEFAULT_NETWORK_CHANGE_THRESHOLD_TIME = 30000;
    private static final boolean DEFAULT_NETWORK_DIAGNOSIS_OPENED = true;
    private static final int DEFAULT_SESSION_CONNECT_WAIT_TIME = 3000;
    private static final String MULTI_PATH_ENABLE = "MULTI_PATH_ENABLE";
    public static final String MULTI_PATH_TRIGGER_TIME = "MULTI_PATH_TRIGGER_TIME";
    public static final String MULTI_PATH_WHITE_AB = "MULTI_PATH_WHITE_AB";
    public static final String MULTI_PATH_WHITE_BIZ = "MULTI_PATH_WHITE_BIZ";
    public static final String MULTI_PATH_WHITE_URL = "MULTI_PATH_WHITE_URL";
    public static final String NETWORK_ANALYSIS_MONITOR = "NETWORK_ANALYSIS_MONITOR";
    public static final String NETWORK_CHANGE_THRESHOLD_TIME = "NETWORK_CHANGE_THRESHOLD_TIME";
    private static final String NETWORK_DIAGNOSIS_ENABLE = "NETWORK_DIAGNOSIS_ENABLE";
    public static final String NETWORK_FALCO_ID_ENABLE = "network_falco_id_enable";
    public static final String NETWORK_FALCO_ID_WHITE_LIST = "network_falco_id_white_list";
    public static final String NETWORK_HTTP_CACHE_CONFIG = "network_http_cache_config";
    private static final String NETWORK_HTTP_SESSION_WAIT_TIME = "network_http_session_wait_time";
    public static final String NETWORK_MP_QUIC_ENABLE = "NETWORK_MP_QUIC_ENABLE";
    private static final String NETWORK_SESSION_WAIT_TIME = "network_session_wait_time";
    public static final String SERVICE_OPTIMIZE = "SERVICE_OPTIMIZE";
    public static final String SESSION_ASYNC_OPTIMIZE = "SESSION_ASYNC_OPTIMIZE";
    private static final String TAG = "anet.NetworkConfigCenter";
    private static final String WIDGET_LOCAL_INSTANCE_ENABLE = "WIDGET_LOCAL_INSTANCE_ENABLE";
    private static volatile IRemoteConfig iRemoteConfig;
    private static volatile boolean isSSLEnabled = true;
    private static volatile boolean isSpdyEnabled = true;
    private static volatile boolean isRemoteNetworkServiceEnable = true;
    private static volatile int serviceBindWaitTime = 5;
    private static volatile boolean isHttpSessionEnable = true;
    private static volatile boolean isHttpCacheEnable = true;
    private static volatile List<CacheConfig> httpCacheConfigs = new CopyOnWriteArrayList();
    private static volatile boolean isAllowHttpIpRetry = false;
    private static volatile long cacheFlag = 0;
    private static volatile boolean isBgRequestForbidden = false;
    private static volatile ConcurrentHashMap<String, List<String>> urlWhiteListMap = null;
    private static volatile CopyOnWriteArrayList<String> bizWhiteList = null;
    private static final List<String> ALLOW_ALL_PATH = new ArrayList();
    private static volatile int requestStatisticSampleRate = 10000;
    private static volatile boolean isResponseBufferEnable = true;
    private static volatile boolean isGetSessionAsyncEnable = false;
    private static volatile int bgForbidRequestThreshold = 60000;
    private static volatile CopyOnWriteArrayList<String> monitorRequestList = null;
    private static volatile CopyOnWriteArrayList<String> monitorRequestBizList = null;
    private static volatile ConcurrentHashMap<String, List<String>> degradeListMap = null;
    private static volatile ConcurrentHashMap<String, List<String>> allowFastDegradeUrlList = null;
    private static volatile boolean isFastDegradeEnable = true;
    private static volatile boolean isRequestDelayRetryForNoNetwork = true;
    private static volatile boolean isBindServiceOptimize = false;
    private static volatile boolean isChannelLocalInstanceEnable = false;
    private static volatile boolean isWidgetLocalInstanceEnable = false;
    private static volatile boolean isAllowSpdyWhenBindServiceFailed = true;
    private static volatile boolean isLongRequestMonitorEnable = true;
    private static volatile boolean isAllowAddABHeaderInMtop = false;
    private static volatile long multiPathTriggerTime = 1500;
    private static volatile CopyOnWriteArrayList<String> multiPathWhiteBiz = null;
    private static volatile ConcurrentHashMap<String, List<String>> multiPathWhiteURL = null;
    private static volatile CopyOnWriteArrayList<Pair<String, String>> multiPathWhiteBizAb = null;
    private static volatile ConcurrentHashMap<String, List<Pair<String, String>>> multiPathWhiteURLAb = null;
    private static volatile CopyOnWriteArrayList<String> multiPathABConfig = null;
    private static volatile boolean isMultiPathOpened = true;
    private static volatile boolean isMultiPathABEnable = false;
    private static volatile boolean isBodyTimeoutCheckerABEnable = false;
    private static volatile int sessionConnectWaitTime = 3000;
    private static volatile int httpSessionConnectWaitTime = 1000;
    private static volatile boolean sessionFastTimeoutEnable = false;
    private static volatile long networkChangeThresholdTime = 30000;
    private static volatile boolean isMPQuicOpened = true;
    private static volatile boolean isNetworkDiagnosisOpened = true;
    private static volatile boolean isCookieDisable = false;
    private static volatile CopyOnWriteArrayList<String> falcoIdWhiteList = null;
    private static volatile boolean falcoIdEnable = true;
    private static volatile boolean isNetworkAnalysisMonitor = true;
    private static volatile boolean isInitConfigAsync = false;

    static {
        t2o.a(607126031);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            doInitTask();
        }
    }

    private static void doInitTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd710e7", new Object[0]);
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext());
        cacheFlag = defaultSharedPreferences.getLong(CACHE_FLAG, 0L);
        isChannelLocalInstanceEnable = defaultSharedPreferences.getBoolean(CHANNEL_LOCAL_INSTANCE_ENABLE, false);
        isWidgetLocalInstanceEnable = defaultSharedPreferences.getBoolean(WIDGET_LOCAL_INSTANCE_ENABLE, false);
        isAllowSpdyWhenBindServiceFailed = defaultSharedPreferences.getBoolean(ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED, true);
        isAllowAddABHeaderInMtop = defaultSharedPreferences.getBoolean(ALLOW_ADD_AB_HEADER_IN_MTOP, true);
        isMultiPathOpened = defaultSharedPreferences.getBoolean(MULTI_PATH_ENABLE, true);
        isNetworkDiagnosisOpened = defaultSharedPreferences.getBoolean(NETWORK_DIAGNOSIS_ENABLE, true);
        setMultiPathWhiteBiz(defaultSharedPreferences.getString(MULTI_PATH_WHITE_BIZ, ""));
        setMultiPathWhiteURL(defaultSharedPreferences.getString(MULTI_PATH_WHITE_URL, ""));
        setMultiPathAbWhiteList(defaultSharedPreferences.getString(MULTI_PATH_WHITE_AB, ""));
        multiPathTriggerTime = defaultSharedPreferences.getLong(MULTI_PATH_TRIGGER_TIME, 1500L);
        networkChangeThresholdTime = defaultSharedPreferences.getLong(NETWORK_CHANGE_THRESHOLD_TIME, 30000L);
        isNetworkAnalysisMonitor = defaultSharedPreferences.getBoolean(NETWORK_ANALYSIS_MONITOR, true);
        falcoIdEnable = defaultSharedPreferences.getBoolean(NETWORK_FALCO_ID_ENABLE, true);
        setFalcoIdWhiteList(defaultSharedPreferences.getString(NETWORK_FALCO_ID_WHITE_LIST, ""));
        sessionConnectWaitTime = defaultSharedPreferences.getInt(NETWORK_SESSION_WAIT_TIME, 3000);
        httpSessionConnectWaitTime = defaultSharedPreferences.getInt(NETWORK_HTTP_SESSION_WAIT_TIME, 1000);
        setHttpCacheConfigs(defaultSharedPreferences.getString(NETWORK_HTTP_CACHE_CONFIG, ""));
        isMPQuicOpened = defaultSharedPreferences.getBoolean(NETWORK_MP_QUIC_ENABLE, true);
        AwcnConfig.setMPQuicUserSwitch(isMPQuicOpened);
    }

    @Deprecated
    public static void enableNetworkSdkOptimizeTest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee08e2f", new Object[]{new Boolean(z)});
        }
    }

    public static int getBgForbidRequestThreshold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("50bedd65", new Object[0])).intValue();
        }
        return bgForbidRequestThreshold;
    }

    public static List<CacheConfig> getHttpCacheConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("85f25e13", new Object[0]);
        }
        return httpCacheConfigs;
    }

    public static int getHttpSessionConnectWaitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dacf648e", new Object[0])).intValue();
        }
        return httpSessionConnectWaitTime;
    }

    public static long getMultiPathTriggerTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1a32f38", new Object[0])).longValue();
        }
        return multiPathTriggerTime;
    }

    public static long getNetworkChangeThresholdTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5738636b", new Object[0])).longValue();
        }
        return networkChangeThresholdTime;
    }

    public static int getRequestStatisticSampleRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd23ffb", new Object[0])).intValue();
        }
        return requestStatisticSampleRate;
    }

    public static int getServiceBindWaitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f645c6d8", new Object[0])).intValue();
        }
        return serviceBindWaitTime;
    }

    public static int getSessionConnectWaitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83e4c4e6", new Object[0])).intValue();
        }
        if (sessionFastTimeoutEnable) {
            return (int) (sessionConnectWaitTime * Utils.getNetworkTimeFactor());
        }
        return 3000;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        isInitConfigAsync = AwcnConfig.isLaunchOptV1Opened();
        if (isInitConfigAsync) {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.config.NetworkConfigCenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NetworkConfigCenter.access$000();
                    }
                }
            });
        } else {
            doInitTask();
        }
    }

    public static boolean isAllowAddABHeaderInMtop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d447a6a8", new Object[0])).booleanValue();
        }
        return isAllowAddABHeaderInMtop;
    }

    public static boolean isAllowFastDegrade(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5571faaa", new Object[]{httpUrl})).booleanValue();
        }
        if (isFastDegradeEnable && (concurrentHashMap = allowFastDegradeUrlList) != null && concurrentHashMap.size() > 0) {
            return isHostInArrayListAllMatch(httpUrl.path(), concurrentHashMap.get(httpUrl.host()));
        }
        return false;
    }

    public static boolean isAllowHttpIpRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb8a7de5", new Object[0])).booleanValue();
        }
        if (!isHttpSessionEnable || !isAllowHttpIpRetry) {
            return false;
        }
        return true;
    }

    public static boolean isAllowSpdyWhenBindServiceFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("896bf175", new Object[0])).booleanValue();
        }
        return isAllowSpdyWhenBindServiceFailed;
    }

    public static boolean isBgRequestForbidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3de62364", new Object[0])).booleanValue();
        }
        return isBgRequestForbidden;
    }

    public static boolean isBindServiceOptimize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d594a836", new Object[0])).booleanValue();
        }
        return isBindServiceOptimize;
    }

    public static boolean isBizInMonitorRequestList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48ee3916", new Object[]{str})).booleanValue();
        }
        return isHostInArrayListAllMatch(str, monitorRequestBizList);
    }

    public static boolean isBizInWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebf2834e", new Object[]{str})).booleanValue();
        }
        return isHostInArrayList(str, bizWhiteList);
    }

    public static boolean isBodyTimeoutCheckerABEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd907faf", new Object[0])).booleanValue();
        }
        return isBodyTimeoutCheckerABEnable;
    }

    public static boolean isChannelLocalInstanceEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e987d15", new Object[0])).booleanValue();
        }
        return isChannelLocalInstanceEnable;
    }

    public static boolean isCookieDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81cad665", new Object[0])).booleanValue();
        }
        return isCookieDisable;
    }

    public static boolean isFalcoIdEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dde17dc", new Object[0])).booleanValue();
        }
        return falcoIdEnable;
    }

    public static boolean isGetSessionAsyncEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("661c27a0", new Object[0])).booleanValue();
        }
        return isGetSessionAsyncEnable;
    }

    private static boolean isHostInArrayList(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fa726", new Object[]{str, list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        return list.contains(str);
    }

    private static boolean isHostInArrayListAllMatch(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ce104ea", new Object[]{str, list})).booleanValue();
        }
        if (list == null) {
            return false;
        }
        if (list == ALLOW_ALL_PATH || list.contains(str)) {
            return true;
        }
        return false;
    }

    public static boolean isHttpCacheEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b5f167e", new Object[0])).booleanValue();
        }
        return isHttpCacheEnable;
    }

    public static boolean isHttpSessionEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933f2512", new Object[0])).booleanValue();
        }
        return isHttpSessionEnable;
    }

    public static boolean isInitConfigAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16672b", new Object[0])).booleanValue();
        }
        return isInitConfigAsync;
    }

    public static boolean isLongRequestMonitorEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12a5939f", new Object[0])).booleanValue();
        }
        return isLongRequestMonitorEnable;
    }

    public static boolean isMPQuicOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a840eeff", new Object[0])).booleanValue();
        }
        return isMPQuicOpened;
    }

    public static boolean isMultiPathABEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7526fc83", new Object[0])).booleanValue();
        }
        if (isMultiPathABEnable || (multiPathABConfig != null && !multiPathABConfig.isEmpty())) {
            return true;
        }
        return false;
    }

    public static boolean isMultiPathBizInWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c5f8418", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (isMultiPathBizInWhiteListDefault(str) || isMultiPathBizInWhiteListAB(str)) {
            return true;
        }
        return false;
    }

    private static boolean isMultiPathBizInWhiteListAB(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49a1f8b9", new Object[]{str})).booleanValue();
        }
        CopyOnWriteArrayList<Pair<String, String>> copyOnWriteArrayList = multiPathWhiteBizAb;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        Iterator<Pair<String, String>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            if (str.equalsIgnoreCase((String) next.first)) {
                if (multiPathABConfig == null || !multiPathABConfig.contains(next.second)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isMultiPathOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bc75688", new Object[0])).booleanValue();
        }
        return isMultiPathOpened;
    }

    public static boolean isMultiPathSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5197e146", new Object[0])).booleanValue();
        }
        return isMultiPathABEnable();
    }

    public static boolean isMultiPathUrlInWhiteList(HttpUrl httpUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7991177e", new Object[]{httpUrl})).booleanValue();
        }
        if (httpUrl == null) {
            return false;
        }
        if (isMultiPathUrlInWhiteListDefault(httpUrl) || isMultiPathUrlInWhiteListAb(httpUrl)) {
            return true;
        }
        return false;
    }

    private static boolean isMultiPathUrlInWhiteListAb(HttpUrl httpUrl) {
        List<Pair<String, String>> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63d95cdd", new Object[]{httpUrl})).booleanValue();
        }
        ConcurrentHashMap<String, List<Pair<String, String>>> concurrentHashMap = multiPathWhiteURLAb;
        if (concurrentHashMap == null || (list = concurrentHashMap.get(httpUrl.host())) == null) {
            return false;
        }
        for (Pair<String, String> pair : list) {
            if (httpUrl.path().startsWith((String) pair.first)) {
                if (multiPathABConfig == null || !multiPathABConfig.contains(pair.second)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean isMultiPathUrlInWhiteListDefault(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7261a4ab", new Object[]{httpUrl})).booleanValue();
        }
        if (isMultiPathABEnable && (concurrentHashMap = multiPathWhiteURL) != null) {
            return isHostInArrayListAllMatch(httpUrl.path(), concurrentHashMap.get(httpUrl.host()));
        }
        return false;
    }

    public static boolean isNetworkAnalysisMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d253425", new Object[0])).booleanValue();
        }
        return isNetworkAnalysisMonitor;
    }

    public static boolean isNetworkDiagnosisOpened() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2481a01", new Object[0])).booleanValue();
        }
        return isNetworkDiagnosisOpened;
    }

    public static boolean isRemoteNetworkServiceEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9745ac5", new Object[0])).booleanValue();
        }
        return isRemoteNetworkServiceEnable;
    }

    public static boolean isRequestDelayRetryForNoNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34727d9", new Object[0])).booleanValue();
        }
        return isRequestDelayRetryForNoNetwork;
    }

    public static boolean isRequestInMonitorList(RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47a7aa17", new Object[]{requestStatistic})).booleanValue();
        }
        if (requestStatistic == null) {
            return false;
        }
        return isHostInArrayList(requestStatistic.host, monitorRequestList);
    }

    public static boolean isResponseBufferEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fcfda99", new Object[0])).booleanValue();
        }
        return isResponseBufferEnable;
    }

    public static boolean isSSLEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8ea7d6a", new Object[0])).booleanValue();
        }
        return isSSLEnabled;
    }

    public static boolean isSpdyEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39e945b0", new Object[0])).booleanValue();
        }
        return isSpdyEnabled;
    }

    public static boolean isUrlInDegradeList(HttpUrl httpUrl) {
        ConcurrentHashMap<String, List<String>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6331af9b", new Object[]{httpUrl})).booleanValue();
        }
        if (httpUrl == null || (concurrentHashMap = degradeListMap) == null) {
            return false;
        }
        return isHostInArrayListAllMatch(httpUrl.path(), concurrentHashMap.get(httpUrl.host()));
    }

    public static boolean isUrlInWhiteList(HttpUrl httpUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d6ad508", new Object[]{httpUrl})).booleanValue();
        }
        if (httpUrl == null) {
            return false;
        }
        return isHostInArrayListAllMatch(httpUrl.path(), urlWhiteListMap.get(httpUrl.host()));
    }

    public static boolean isWidgetLocalInstanceEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60413de0", new Object[0])).booleanValue();
        }
        return isWidgetLocalInstanceEnable;
    }

    public static void setAllowAddABHeaderInMtop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd06e78", new Object[]{new Boolean(z)});
            return;
        }
        isAllowAddABHeaderInMtop = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putBoolean(ALLOW_ADD_AB_HEADER_IN_MTOP, isAllowAddABHeaderInMtop);
        edit.apply();
    }

    public static void setAllowHttpIpRetry(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383874db", new Object[]{new Boolean(z)});
        } else {
            isAllowHttpIpRetry = z;
        }
    }

    public static void setAllowSpdyWhenBindServiceFailed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81cf354b", new Object[]{new Boolean(z)});
            return;
        }
        isAllowSpdyWhenBindServiceFailed = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putBoolean(ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED, isAllowSpdyWhenBindServiceFailed);
        edit.apply();
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
                if (anet.channel.strategy.utils.Utils.checkHostValidAndNotIp(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            return copyOnWriteArrayList;
        } catch (Exception e) {
            ALog.e(TAG, "[setArrayListCheckIp] error", null, e, new Object[0]);
            return null;
        }
    }

    public static void setBgForbidRequestThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29604245", new Object[]{new Integer(i)});
        } else {
            bgForbidRequestThreshold = i;
        }
    }

    public static void setBgRequestForbidden(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebfad3c", new Object[]{new Boolean(z)});
        } else {
            isBgRequestForbidden = z;
        }
    }

    public static void setBindServiceOptimize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1936981a", new Object[]{new Boolean(z)});
        } else {
            isBindServiceOptimize = z;
        }
    }

    public static void setBodyTimeoutCheckerABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea969251", new Object[]{new Boolean(z)});
        } else {
            isBodyTimeoutCheckerABEnable = z;
        }
    }

    public static void setChannelLocalInstanceEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8e41ab", new Object[]{new Boolean(z)});
            return;
        }
        isChannelLocalInstanceEnable = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putBoolean(CHANNEL_LOCAL_INSTANCE_ENABLE, isChannelLocalInstanceEnable);
        edit.apply();
    }

    public static void setCookieDisable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f69f9cb", new Object[]{new Boolean(z)});
        } else {
            isCookieDisable = z;
        }
    }

    public static void setFalcoIdEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75bee734", new Object[]{new Boolean(z)});
            return;
        }
        falcoIdEnable = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putBoolean(NETWORK_FALCO_ID_ENABLE, falcoIdEnable);
        edit.apply();
    }

    public static void setFalcoIdWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92187262", new Object[]{str});
        } else {
            falcoIdWhiteList = setArrayList(str);
        }
    }

    public static void setFastDegradeEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de19b232", new Object[]{new Boolean(z)});
        } else {
            isFastDegradeEnable = z;
        }
    }

    public static void setGetSessionAsyncEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625a17f0", new Object[]{new Boolean(z)});
        } else {
            isGetSessionAsyncEnable = z;
        }
    }

    public static void setHttpCacheEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("374e4ed2", new Object[]{new Boolean(z)});
        } else {
            isHttpCacheEnable = z;
        }
    }

    public static void setHttpSessionConnectWaitTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9ad33c", new Object[]{new Integer(i)});
            return;
        }
        httpSessionConnectWaitTime = i;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putInt(NETWORK_HTTP_SESSION_WAIT_TIME, httpSessionConnectWaitTime);
        edit.apply();
    }

    public static void setHttpSessionEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908424be", new Object[]{new Boolean(z)});
        } else {
            isHttpSessionEnable = z;
        }
    }

    @Deprecated
    public static void setHttpsValidationEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c720a4ae", new Object[]{new Boolean(z)});
        }
    }

    public static void setLongRequestMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cc3ce61", new Object[]{new Boolean(z)});
        } else {
            isLongRequestMonitorEnable = z;
        }
    }

    public static void setMPQuicOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb794b01", new Object[]{new Boolean(z)});
            return;
        }
        isMPQuicOpened = z;
        AwcnConfig.setMPQuicUserSwitch(isMPQuicOpened);
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putBoolean(NETWORK_MP_QUIC_ENABLE, isMPQuicOpened);
        edit.apply();
    }

    public static void setMultiPathABEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb973b6d", new Object[]{new Boolean(z)});
        } else {
            isMultiPathABEnable = z;
        }
    }

    public static void setMultiPathOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ee1008", new Object[]{new Boolean(z)});
            return;
        }
        isMultiPathOpened = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putBoolean(MULTI_PATH_ENABLE, isMultiPathOpened);
        edit.apply();
    }

    public static void setMultiPathTriggerTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8f8874", new Object[]{new Long(j)});
        } else {
            multiPathTriggerTime = j;
        }
    }

    public static void setNetworkAnalysisMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a4909b", new Object[]{new Boolean(z)});
            return;
        }
        isNetworkAnalysisMonitor = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putBoolean(NETWORK_ANALYSIS_MONITOR, isNetworkAnalysisMonitor);
        edit.apply();
    }

    public static void setNetworkChangeThresholdTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d51b3a1", new Object[]{new Long(j)});
        } else {
            networkChangeThresholdTime = j;
        }
    }

    public static void setNetworkDiagnosisOpened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fde663f", new Object[]{new Boolean(z)});
            return;
        }
        isNetworkDiagnosisOpened = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putBoolean(NETWORK_DIAGNOSIS_ENABLE, isNetworkDiagnosisOpened);
        edit.apply();
    }

    public static void setRemoteConfig(IRemoteConfig iRemoteConfig2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94c06be", new Object[]{iRemoteConfig2});
            return;
        }
        if (iRemoteConfig != null) {
            iRemoteConfig.unRegister();
        }
        if (iRemoteConfig2 != null) {
            iRemoteConfig2.register();
        }
        iRemoteConfig = iRemoteConfig2;
    }

    public static void setRemoteNetworkServiceEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b2e19fb", new Object[]{new Boolean(z)});
        } else {
            isRemoteNetworkServiceEnable = z;
        }
    }

    public static void setRequestDelayRetryForNoNetwork(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde66d7", new Object[]{new Boolean(z)});
        } else {
            isRequestDelayRetryForNoNetwork = z;
        }
    }

    public static void setRequestStatisticSampleRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f3656f", new Object[]{new Integer(i)});
        } else {
            requestStatisticSampleRate = i;
        }
    }

    public static void setResponseBufferEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a78aa7", new Object[]{new Boolean(z)});
        } else {
            isResponseBufferEnable = z;
        }
    }

    public static void setServiceBindWaitTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824051ca", new Object[]{new Integer(i)});
        } else {
            serviceBindWaitTime = i;
        }
    }

    public static void setSessionConnectWaitTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc57e4", new Object[]{new Integer(i)});
            return;
        }
        sessionConnectWaitTime = i;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putInt(NETWORK_SESSION_WAIT_TIME, sessionConnectWaitTime);
        edit.apply();
    }

    public static void setSessionFastTimeoutEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f918dd9", new Object[]{new Boolean(z)});
        } else {
            sessionFastTimeoutEnable = z;
        }
    }

    public static void setWidgetLocalInstanceEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f86db0", new Object[]{new Boolean(z)});
            return;
        }
        isWidgetLocalInstanceEnable = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
        edit.putBoolean(WIDGET_LOCAL_INSTANCE_ENABLE, isWidgetLocalInstanceEnable);
        edit.apply();
    }

    private static boolean isMultiPathBizInWhiteListDefault(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1677713", new Object[]{str})).booleanValue();
        }
        if (!isMultiPathABEnable) {
            return false;
        }
        return isHostInArrayList(str, multiPathWhiteBiz);
    }

    public static void setMonitorRequestList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebf56e6", new Object[]{str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            monitorRequestList = null;
        }
        try {
            monitorRequestList = setArrayListCheckIp(new JSONObject(str).getJSONArray("host"));
        } catch (JSONException e) {
            ALog.e(TAG, "setMonitorRequestList failed", null, e, new Object[0]);
        }
    }

    public static boolean isFalcoIdWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f99bed2e", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return isHostInArrayList(str, falcoIdWhiteList) || isHostInArrayList("*", falcoIdWhiteList);
    }

    private static CopyOnWriteArrayList<String> setArrayList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("e991e4d3", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            return copyOnWriteArrayList;
        } catch (Exception e) {
            ALog.e(TAG, "[seArraytList] error", null, e, new Object[0]);
            return null;
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

    public static void setCacheFlag(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61de3ed1", new Object[]{new Long(j)});
        } else if (j != cacheFlag) {
            ALog.i(TAG, "set cache flag", null, "old", Long.valueOf(cacheFlag), "new", Long.valueOf(j));
            cacheFlag = j;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            edit.putLong(CACHE_FLAG, cacheFlag);
            edit.apply();
            CacheManager.clearAllCache();
        }
    }

    public static void setHttpCacheConfigs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce77e8a", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            httpCacheConfigs.clear();
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    copyOnWriteArrayList.add(CacheConfig.create(jSONArray.getJSONObject(i)));
                }
            } catch (Exception e) {
                ALog.e(TAG, "[setCacheConfigs]error.", null, e, new Object[0]);
            }
            httpCacheConfigs = copyOnWriteArrayList;
        }
    }

    public static void setSSLEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d8dbf6", new Object[]{new Boolean(z)});
            return;
        }
        ALog.i(TAG, "[setSSLEnabled]", null, "enable", Boolean.valueOf(z));
        isSSLEnabled = z;
    }

    public static void setSpdyEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52c61e0", new Object[]{new Boolean(z)});
            return;
        }
        ALog.i(TAG, "[setSpdyEnabled]", null, "enable", Boolean.valueOf(z));
        isSpdyEnabled = z;
    }

    public static void setAllowFastDegradeUrlList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4208cb", new Object[]{str});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "updateWhiteUrlList", null, "White List", str);
        }
        allowFastDegradeUrlList = setArrayListAllMatch(str);
    }

    public static void setDegradeRequestList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5adfbca", new Object[]{str});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "setDegradeRequestList", null, "Degrade List", str);
        }
        degradeListMap = setArrayListAllMatch(str);
    }

    public static void setMonitorRequestBizList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678028b", new Object[]{str});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "setMonitorRequestBizList", null, "White List", str);
        }
        monitorRequestBizList = setArrayList(str);
    }

    public static void setMultiPathWhiteBiz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa67117", new Object[]{str});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "setMultiPathWhiteBiz", null, "White List", str);
        }
        multiPathWhiteBiz = setArrayList(str);
    }

    public static void setMultiPathWhiteURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512ec873", new Object[]{str});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "setMultiPathWhiteURL", null, "White List", str);
        }
        multiPathWhiteURL = setArrayListAllMatch(str);
    }

    public static void updateBizWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be172ce", new Object[]{str});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "updateRequestWhiteList", null, "White List", str);
        }
        bizWhiteList = setArrayList(str);
    }

    public static void updateWhiteListMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21fa12ef", new Object[]{str});
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "updateWhiteUrlList", null, "White List", str);
        }
        urlWhiteListMap = setArrayListAllMatch(str);
    }

    public static void setMultiPathAbWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0956bfb", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
            multiPathWhiteBizAb = null;
            multiPathWhiteURLAb = null;
            multiPathABConfig = null;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ConcurrentHashMap<String, List<Pair<String, String>>> concurrentHashMap = new ConcurrentHashMap<>();
                CopyOnWriteArrayList<Pair<String, String>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("ab");
                    if (!TextUtils.isEmpty(string)) {
                        Context context = GlobalAppRuntimeInfo.getContext();
                        Boolean isABGlobalFeatureOpened = ABSwitchUtils.isABGlobalFeatureOpened(context, "network_multi_path_" + string);
                        if (isABGlobalFeatureOpened != null && isABGlobalFeatureOpened.booleanValue()) {
                            copyOnWriteArrayList2.add(string);
                            JSONObject optJSONObject = jSONObject.optJSONObject("url");
                            if (optJSONObject != null) {
                                Iterator<String> keys = optJSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    Object obj = optJSONObject.get(next);
                                    if (obj instanceof JSONArray) {
                                        JSONArray jSONArray2 = (JSONArray) obj;
                                        int length = jSONArray2.length();
                                        List<Pair<String, String>> list = concurrentHashMap.get(next);
                                        if (list == null) {
                                            list = new ArrayList<>(length);
                                        }
                                        for (int i2 = 0; i2 < length; i2++) {
                                            list.add(Pair.create(jSONArray2.getString(i2), string));
                                        }
                                        if (!list.isEmpty()) {
                                            concurrentHashMap.put(next, list);
                                        }
                                    }
                                }
                            }
                            JSONArray optJSONArray = jSONObject.optJSONArray("biz");
                            if (optJSONArray != null) {
                                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                    String string2 = optJSONArray.getString(i3);
                                    if (!string2.isEmpty()) {
                                        copyOnWriteArrayList.add(Pair.create(string2, string));
                                    }
                                }
                            }
                        }
                    }
                }
                multiPathWhiteBizAb = copyOnWriteArrayList;
                multiPathWhiteURLAb = concurrentHashMap;
                multiPathABConfig = copyOnWriteArrayList2;
            } catch (Exception e) {
                ALog.e(TAG, "parse failed", null, e, new Object[0]);
            }
        }
    }
}
