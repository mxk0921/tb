package anetwork.channel.entity;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.encode.EncodingHelper;
import anet.channel.encode.ZstdAttributes;
import anet.channel.encode.ZstdDictHelper;
import anet.channel.entity.ENV;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.request.Request;
import anet.channel.statist.ErrorStatistic;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.AmdcPriorityHelper;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.Utils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.ParcelableRequest;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.http.NetworkSdkSetting;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.monitor.NetworkQoSCenter;
import anetwork.channel.unified.DownloadResourcePriorityConf;
import anetwork.channel.util.RequestConstant;
import anetwork.channel.util.SeqGen;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a7m;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RequestConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.RequestConfig";
    private Request awcnRequest;
    public final String bizReqId;
    public final int connectTimeout;
    private final String fRefer;
    private final boolean isSync;
    private int maxRetryTime;
    public int priority;
    public final int readTimeout;
    private ParcelableRequest request;
    public final int requestType;
    public RequestStatistic rs;
    public final String seqNo;
    public String urlKey;
    public boolean zstdDictFlag;
    private int mRedirectTimes = 0;
    public int currentRetryTimes = 0;
    private long interceptorOptType = 0;
    private int isDetectReq = -1;
    private int isUpdateDetectReq = -1;
    private HashMap<String, Pair<Long, Long>> rangeMaps = new HashMap<>();
    public int resourceScene = 0;
    public boolean isBlockingResource = false;
    public DownloadResourcePriorityConf.DynamicResource vipDynamicResource = null;
    public int bandwidthLevel = -1;
    public boolean isRemoteCriticalPlan = false;
    public AtomicBoolean isAllowZstdDict = new AtomicBoolean(true);
    public SessionCenter sessionCenterInstance = null;

    static {
        t2o.a(607126055);
    }

    public RequestConfig(ParcelableRequest parcelableRequest, int i, boolean z) {
        String str;
        String str2 = null;
        this.awcnRequest = null;
        boolean z2 = false;
        this.maxRetryTime = 0;
        this.priority = 4;
        this.zstdDictFlag = false;
        if (parcelableRequest != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.request = parcelableRequest;
            this.requestType = i;
            this.isSync = z;
            String str3 = parcelableRequest.seqNo;
            if (i == 0) {
                str = "HTTP";
            } else {
                str = "DGRD";
            }
            this.seqNo = SeqGen.createSeqNo(str3, str);
            int i2 = parcelableRequest.connectTimeout;
            i2 = i2 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i2;
            this.connectTimeout = i2;
            int i3 = parcelableRequest.readTimeout;
            i3 = i3 <= 0 ? (int) (Utils.getNetworkTimeFactor() * 12000.0f) : i3;
            this.readTimeout = i3;
            HttpUrl initHttpUrl = initHttpUrl();
            int i4 = parcelableRequest.retryTime;
            this.maxRetryTime = (i4 < 0 || i4 > 3) ? 2 : i4;
            RequestStatistic requestStatistic = new RequestStatistic(initHttpUrl.host(), String.valueOf(parcelableRequest.bizId));
            this.rs = requestStatistic;
            requestStatistic.url = initHttpUrl.simpleUrlString();
            this.rs.maxRetryTime = this.maxRetryTime;
            RequestStatistic requestStatistic2 = this.rs;
            requestStatistic2.connTimeoutInterval = i2;
            requestStatistic2.socketTimeoutInterval = i3;
            requestStatistic2.httpMethod = parcelableRequest.method;
            Map<String, String> map = parcelableRequest.headers;
            if (map != null) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<String, String> next = it.next();
                        if (next != null && HttpConstant.REFERER.equalsIgnoreCase(next.getKey())) {
                            this.rs.pageReferer = next.getValue();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.awcnRequest = buildRequest(initHttpUrl);
            this.urlKey = initHttpUrl.host() + initHttpUrl.path();
            if (this.rs.isReqConfigOpt) {
                if (AwcnConfig.isZstdDictDecompressOpened() && AwcnConfig.isZstdDictDecompressMtopEnable() && AwcnConfig.isZstdDictDecompressWhiteList(this.urlKey) && EncodingHelper.isZstdValid()) {
                    z2 = true;
                }
                this.zstdDictFlag = z2;
            } else {
                if (EncodingHelper.isZstdValid() && AwcnConfig.isZstdDictDecompressOpened() && AwcnConfig.isZstdDictDecompressWhiteList(this.urlKey) && AwcnConfig.isZstdDictDecompressMtopEnable()) {
                    z2 = true;
                }
                this.zstdDictFlag = z2;
            }
            Map<String, String> map2 = parcelableRequest.headers;
            this.fRefer = map2 != null ? map2.get("f-refer") : null;
            this.priority = NetworkQoSCenter.getRequestPriority(this);
            Map<String, String> map3 = parcelableRequest.headers;
            this.bizReqId = map3 != null ? map3.get("f-biz-req-id") : str2;
            this.rs.reqConfigTime = System.currentTimeMillis() - currentTimeMillis;
            return;
        }
        throw new IllegalArgumentException("request is null");
    }

    private Request buildRequest(HttpUrl httpUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("e5befbb5", new Object[]{this, httpUrl});
        }
        Request.Builder requestStatistic = new Request.Builder().setUrl(httpUrl).setMethod(this.request.method).setBody(this.request.bodyEntry).setReadTimeout(this.readTimeout).setConnectTimeout(this.connectTimeout).setRedirectEnable(this.request.allowRedirect).setRedirectTimes(this.mRedirectTimes).setBizId(this.request.bizId).setSeq(this.seqNo).setRequestStatistic(this.rs);
        requestStatistic.setParams(this.request.params);
        String str = this.request.charset;
        if (str != null) {
            requestStatistic.setCharset(str);
        }
        requestStatistic.setHeaders(initHeaders(httpUrl));
        return requestStatistic.build();
    }

    public static SessionCenter getSessionCenter(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionCenter) ipChange.ipc$dispatch("f63739e7", new Object[]{requestConfig});
        }
        if (requestConfig != null) {
            SessionCenter sessionCenter = requestConfig.sessionCenterInstance;
            if (sessionCenter != null) {
                return sessionCenter;
            }
            String requestProperty = requestConfig.getRequestProperty("APPKEY");
            if (TextUtils.isEmpty(requestProperty)) {
                requestProperty = GlobalAppRuntimeInfo.getAppkey();
            }
            if (TextUtils.isEmpty(requestProperty)) {
                requestConfig.sessionCenterInstance = SessionCenter.getInstance();
            } else {
                ENV env = GlobalAppRuntimeInfo.getEnv();
                String requestProperty2 = requestConfig.getRequestProperty(RequestConstant.ENVIRONMENT);
                if ("pre".equalsIgnoreCase(requestProperty2)) {
                    env = ENV.PREPARE;
                } else if ("test".equalsIgnoreCase(requestProperty2)) {
                    env = ENV.TEST;
                }
                if (env != NetworkSdkSetting.CURRENT_ENV) {
                    NetworkSdkSetting.CURRENT_ENV = env;
                    SessionCenter.switchEnvironment(env);
                }
                Config config = Config.getConfig(requestProperty, env);
                if (config == null) {
                    config = new Config.Builder().setAppkey(requestProperty).setEnv(env).setAuthCode(requestConfig.getRequestProperty(RequestConstant.AUTH_CODE)).build();
                }
                requestConfig.sessionCenterInstance = SessionCenter.getInstance(config);
            }
            return requestConfig.sessionCenterInstance;
        }
        throw new IllegalArgumentException("request config is null");
    }

    public Request getAwcnRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("cdaf8876", new Object[]{this});
        }
        return this.awcnRequest;
    }

    public String getBizScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e69425aa", new Object[]{this});
        }
        return this.request.getExtProperty(RequestConstant.KEY_BIZ_SCENE);
    }

    public long getFileLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79d1cff3", new Object[]{this})).longValue();
        }
        String extProperty = this.request.getExtProperty(RequestConstant.KEY_FILE_LENGTH);
        if (extProperty == null || extProperty.isEmpty()) {
            return 0L;
        }
        return Long.parseLong(extProperty);
    }

    public String getFlowRefer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e40933d", new Object[]{this});
        }
        return this.fRefer;
    }

    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.awcnRequest.getHeaders();
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        HttpUrl httpUrl = getHttpUrl();
        if (httpUrl != null) {
            return httpUrl.host();
        }
        return null;
    }

    public HttpUrl getHttpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrl) ipChange.ipc$dispatch("df8d72b0", new Object[]{this});
        }
        return this.awcnRequest.getHttpUrl();
    }

    public long getInterceptorOptType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30bbd619", new Object[]{this})).longValue();
        }
        return this.interceptorOptType;
    }

    public int getMaxRetryTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eabfdc01", new Object[]{this})).intValue();
        }
        return this.maxRetryTime;
    }

    public String getPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        HttpUrl httpUrl = getHttpUrl();
        if (httpUrl != null) {
            return httpUrl.path();
        }
        return null;
    }

    public String getPriorityLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ea9f4af", new Object[]{this});
        }
        return this.request.getExtProperty(RequestConstant.KEY_PRIORITY_LEVEL);
    }

    public Map<String, String> getRequestProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dac17e8", new Object[]{this});
        }
        return this.request.extProperties;
    }

    public String getRequestProperty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21af8b21", new Object[]{this, str});
        }
        return this.request.getExtProperty(str);
    }

    public String getUrlString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bb9898f", new Object[]{this});
        }
        return this.awcnRequest.getUrlString();
    }

    public boolean isAllowRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7296b9b4", new Object[]{this})).booleanValue();
        }
        if (this.currentRetryTimes < this.maxRetryTime) {
            return true;
        }
        return false;
    }

    public boolean isRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("195e193e", new Object[]{this})).booleanValue();
        }
        ParcelableRequest parcelableRequest = this.request;
        if (parcelableRequest == null || parcelableRequest.getExtProperty(HttpConstant.RANGE) == null) {
            return false;
        }
        return true;
    }

    public boolean isStreamParseEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d11cf7", new Object[]{this})).booleanValue();
        }
        return "open".equalsIgnoreCase(this.request.getExtProperty(HttpConstant.STREAMING_PARSER));
    }

    public boolean isSyncRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c0e7775", new Object[]{this})).booleanValue();
        }
        return this.isSync;
    }

    public boolean isZstdEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fca658a1", new Object[]{this})).booleanValue();
        }
        return "enable".equalsIgnoreCase(this.request.getExtProperty("zstd"));
    }

    public void retryRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03963ce", new Object[]{this});
            return;
        }
        int i = this.currentRetryTimes + 1;
        this.currentRetryTimes = i;
        this.rs.retryTimes = i;
    }

    public void setAwcnRequest(Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb59b2", new Object[]{this, request});
        } else {
            this.awcnRequest = request;
        }
    }

    public boolean shouldCheckContentLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd1a9f35", new Object[]{this})).booleanValue();
        }
        return "true".equals(this.request.getExtProperty(RequestConstant.CHECK_CONTENT_LENGTH));
    }

    private HttpUrl initHttpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrl) ipChange.ipc$dispatch("13148936", new Object[]{this});
        }
        HttpUrl parse = HttpUrl.parse(this.request.url);
        if (parse != null) {
            if (!NetworkConfigCenter.isSSLEnabled()) {
                ALog.i(TAG, "request ssl disabled.", this.seqNo, new Object[0]);
                parse.downgradeSchemeAndLock();
            } else if ("false".equalsIgnoreCase(this.request.getExtProperty(RequestConstant.ENABLE_SCHEME_REPLACE))) {
                parse.lockScheme();
            }
            return parse;
        }
        throw new IllegalArgumentException("httpUrl is invalid, url=" + this.request.url);
    }

    public boolean isBizRangeEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fa142e2", new Object[]{this})).booleanValue();
        }
        String extProperty = this.request.getExtProperty(RequestConstant.KEY_OPEN_RANGE_BOOST);
        if (extProperty != null) {
            return "enable".equalsIgnoreCase(extProperty);
        }
        return false;
    }

    public boolean isRequestCookieEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51182ec3", new Object[]{this})).booleanValue();
        }
        return true ^ "false".equalsIgnoreCase(this.request.getExtProperty(RequestConstant.ENABLE_COOKIE));
    }

    public boolean isZstdDictEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37e45377", new Object[]{this})).booleanValue();
        }
        String extProperty = this.request.getExtProperty("zstd-d");
        ALog.e("awcn.Request", "[uplink encode] mtop isZstdDictEnable=" + extProperty, this.seqNo, new Object[0]);
        return "enable".equalsIgnoreCase(extProperty);
    }

    public void setRecvRateBpsLimitation(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e13ca8d", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        Request request = this.awcnRequest;
        if (request != null) {
            request.isGold = z;
            request.recvRateBpsLimit = i;
            ALog.e("RemoteFeatureQoS", "set recv rate limitation: " + i + " B/S", this.seqNo, new Object[0]);
        }
    }

    public ArrayList<NetworkQoSCenter.FragmentationRecommender.Fragment> getFragmentationControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("822b104f", new Object[]{this});
        }
        if (this.request == null || !AwcnConfig.getRangeBoostOpen()) {
            return null;
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.NO) {
            ALog.e(TAG, "[fusion-concurrency] NetworkStatus NO: FRAGMENTATION_NONE ", null, new Object[0]);
            return null;
        }
        NetworkQoSCenter.FragmentationRecommender fragmentationRecommender = NetworkQoSCenter.getInstance().getFragmentationRecommender();
        if (fragmentationRecommender == null) {
            ALog.e(TAG, "[fusion-concurrency] get FragmentationRecommender NULL", null, new Object[0]);
            return null;
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        boolean z = NetworkStatusHelper.getCellularNetwork() != null;
        String extProperty = this.request.getExtProperty(HttpConstant.RANGE);
        if (extProperty != null) {
            return fragmentationRecommender.getFragmentation(extProperty, true, z, status);
        }
        String extProperty2 = this.request.getExtProperty(RequestConstant.KEY_FILE_LENGTH);
        if (extProperty2 == null || extProperty2.isEmpty()) {
            return null;
        }
        return fragmentationRecommender.getFragmentation(Long.parseLong(extProperty2), true, z, status);
    }

    public int getWaitTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76bd1670", new Object[]{this})).intValue();
        }
        if (AwcnConfig.isSupportSetWaitTimeoutOpened()) {
            try {
                String extProperty = this.request.getExtProperty(HttpConstant.REQ_TOTAL_TIMEOUT);
                int parseInt = (extProperty == null || extProperty.isEmpty()) ? -1 : Integer.parseInt(extProperty);
                int i = (parseInt <= 0 || parseInt >= Integer.MAX_VALUE) ? this.readTimeout * (this.maxRetryTime + 1) : parseInt;
                ALog.e("awcn.Request", "[req wait timeout] get reqWaitTimeout =" + parseInt, this.seqNo, "final wait", Integer.valueOf(i), "mtop val", extProperty);
                return i;
            } catch (Throwable th) {
                ALog.e("awcn.Request", "[req wait timeout] get error = " + th.toString(), this.seqNo, new Object[0]);
            }
        }
        return this.readTimeout * (this.maxRetryTime + 1);
    }

    public boolean isDetectReq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b0458fc", new Object[]{this})).booleanValue();
        }
        if (this.isDetectReq == -1) {
            String extProperty = this.request.getExtProperty(RequestConstant.KEY_WIFI_DETECT_REQ);
            if (extProperty == null || extProperty.isEmpty() || !extProperty.equalsIgnoreCase("true")) {
                this.isDetectReq = 0;
            } else {
                this.isDetectReq = 1;
                ALog.e(TAG, "[wifi fg detect opt] request is detect req = 1", this.seqNo, "host", this.awcnRequest.getHost());
            }
        }
        return this.isDetectReq == 1;
    }

    public boolean isHttpSessionEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933f2512", new Object[]{this})).booleanValue();
        }
        if (!NetworkConfigCenter.isHttpSessionEnable() || "false".equalsIgnoreCase(this.request.getExtProperty(RequestConstant.ENABLE_HTTP_DNS))) {
            return false;
        }
        return NetworkConfigCenter.isAllowHttpIpRetry() || this.currentRetryTimes == 0;
    }

    public boolean isQoSAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9928dc", new Object[]{this})).booleanValue();
        }
        String extProperty = this.request.getExtProperty(RequestConstant.KEY_QOS_ASYC_OPT);
        if (extProperty == null || !extProperty.equalsIgnoreCase("async")) {
            return false;
        }
        String str = this.fRefer;
        if (str == null || (!str.equals("download_featurepreload") && !this.fRefer.equals("download_remoteso_preload"))) {
            String urlString = getUrlString();
            this.isRemoteCriticalPlan = AwcnConfig.isRemoteCriticalPlan();
            ALog.e(TAG, "[fusion-concurrency] isRemoteCriticalPlan: " + this.isRemoteCriticalPlan, null, new Object[0]);
            DownloadResourcePriorityConf.DynamicResource vIPDynamicResourceInfo = DownloadResourcePriorityConf.getVIPDynamicResourceInfo(urlString, this.isRemoteCriticalPlan);
            this.vipDynamicResource = vIPDynamicResourceInfo;
            if (vIPDynamicResourceInfo != null && vIPDynamicResourceInfo.bandWidthPriority == 0) {
                this.bandwidthLevel = 0;
                this.resourceScene = DownloadResourcePriorityConf.getResourceScene(urlString);
            } else if (vIPDynamicResourceInfo == null || vIPDynamicResourceInfo.bandWidthPriority != 1) {
                this.bandwidthLevel = 2;
            } else {
                this.bandwidthLevel = 1;
                this.resourceScene = DownloadResourcePriorityConf.getResourceScene(urlString);
            }
            return true;
        }
        this.bandwidthLevel = 2;
        this.priority = 9;
        return true;
    }

    public void setInterceptorOptEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f29ffa", new Object[]{this});
            return;
        }
        long j = 0;
        if (AwcnConfig.getInterceptorOptType() != 0) {
            if (!AwcnConfig.isHostInMtopInterceptorWhiteList(this.awcnRequest.getHost())) {
                j = AwcnConfig.getInterceptorOptType();
            }
            this.interceptorOptType = j;
        } else {
            this.interceptorOptType = 0L;
        }
        ALog.e(TAG, "request setInterceptorOptEnable = " + this.interceptorOptType, this.seqNo, "host", this.awcnRequest.getHost(), a7m.READ_TIMEOUT, Integer.valueOf(this.readTimeout), "connectTimeout", Integer.valueOf(this.connectTimeout));
    }

    public static void illegalParamCommit(ParcelableRequest parcelableRequest, String str, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8618b48", new Object[]{parcelableRequest, str, new Integer(i)});
            return;
        }
        try {
            int indexOf = str.indexOf(",");
            if (indexOf != -1) {
                str = str.substring(0, indexOf).trim();
            }
            ErrorStatistic errorStatistic = new ErrorStatistic(str, i);
            if (!(parcelableRequest == null || (str2 = parcelableRequest.url) == null)) {
                errorStatistic.url = str2;
            }
            AppMonitor.getInstance().commitStat(errorStatistic);
            ALog.e(TAG, "[illegalUrlCommit] " + errorStatistic.toString(), null, new Object[0]);
        } catch (Throwable th) {
            ALog.e(TAG, "[illegalUrlCommit] fail!", null, "e", th);
        }
    }

    private Map<String, String> initHeaders(HttpUrl httpUrl) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("47a41820", new Object[]{this, httpUrl});
        }
        String host = httpUrl.host();
        z = !anet.channel.strategy.utils.Utils.isIPV4Address(host);
        if (host.length() <= 2 || host.charAt(0) != '[' || host.charAt(host.length() - 1) != ']' || !anet.channel.strategy.utils.Utils.isIPV6Address(host.substring(1, host.length() - 1))) {
        }
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.request.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!HttpConstant.HOST.equalsIgnoreCase(key) && !":host".equalsIgnoreCase(key)) {
                    boolean equalsIgnoreCase = "true".equalsIgnoreCase(this.request.getExtProperty(RequestConstant.KEEP_CUSTOM_COOKIE));
                    if (!"Cookie".equalsIgnoreCase(key) || equalsIgnoreCase) {
                        hashMap.put(key, entry.getValue());
                    }
                } else if (!z) {
                    hashMap.put(HttpConstant.HOST, entry.getValue());
                }
            }
        }
        return hashMap;
    }

    public void commitStatic(Callback callback, RequestStatistic requestStatistic, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d4d83d", new Object[]{this, callback, requestStatistic, new Integer(i), str});
            return;
        }
        requestStatistic.isDone.set(true);
        requestStatistic.statusCode = i;
        requestStatistic.msg = ErrorConstant.getErrMsg(i);
        requestStatistic.rspEnd = System.currentTimeMillis();
        AnalysisFactory.getV3Instance().log(requestStatistic.span, "netRspRecvEnd", null);
        if (callback != null) {
            callback.onFinish(new DefaultFinishEvent(i, (String) null, getAwcnRequest()));
        } else {
            ALog.e(TAG, "callback null", this.seqNo, "url", getUrlString());
        }
        ExceptionStatistic exceptionStatistic = new ExceptionStatistic(i, null, str);
        exceptionStatistic.host = getHttpUrl().host();
        exceptionStatistic.url = getUrlString();
        AppMonitor.getInstance().commitStat(exceptionStatistic);
    }

    public void dueToAcceptEncode(Request.Builder builder) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb6ec3c", new Object[]{this, builder});
            return;
        }
        this.rs.mtopZstdDictEnable = isZstdDictEnable() ? 1 : 0;
        this.rs.isZstdDictFlag = this.zstdDictFlag ? 1 : 0;
        if (this.isAllowZstdDict.get() && this.zstdDictFlag && this.rs.mtopZstdDictEnable == 1) {
            this.rs.useZstdDict = 1;
            builder.addHeader("Accept-Encoding", "zstd, zstd-d, gzip");
            ALog.e(TAG, "[zstd-d] addHeader zstd and zstd-d ,urlKey=" + this.urlKey, this.seqNo, new Object[0]);
            ZstdAttributes zstdAttributesByUrlKey = ZstdDictHelper.getZstdAttributesByUrlKey(this.urlKey, this.seqNo);
            if (zstdAttributesByUrlKey != null) {
                String path = getPath();
                if (path == null || (str = zstdAttributesByUrlKey.matchPath) == null || !path.startsWith(str)) {
                    ALog.e(TAG, "[zstd-d] request match fail!", this.seqNo, "matchPath", zstdAttributesByUrlKey.matchPath, "urlKey", this.urlKey);
                    return;
                }
                ALog.e(TAG, "[zstd-d] request match success!", this.seqNo, "matchPath", zstdAttributesByUrlKey.matchPath);
                String dictKeyByZstdAttributes = ZstdDictHelper.getDictKeyByZstdAttributes(this.urlKey, zstdAttributesByUrlKey, this.seqNo);
                if (dictKeyByZstdAttributes == null || dictKeyByZstdAttributes.isEmpty() || ZstdDictHelper.isAbandon(this.urlKey, dictKeyByZstdAttributes, this.seqNo)) {
                    ALog.e(TAG, "[zstd-d] dict null or dict already abandon, urlKey=" + this.urlKey, this.seqNo, new Object[0]);
                    return;
                }
                zstdAttributesByUrlKey.setCanUpdate(false);
                builder.addHeader("Sec-Available-Dictionary", dictKeyByZstdAttributes);
                this.rs.addSecAvailableDict = 1;
                ALog.e(TAG, "[zstd-d] dict not abandon, can add Sec-Available-Dictionary=" + dictKeyByZstdAttributes + " ,urlKey=" + this.urlKey, this.seqNo, new Object[0]);
            }
        } else if (isZstdEnable()) {
            builder.addHeader("Accept-Encoding", "zstd, gzip");
            ALog.e(TAG, "[zstd-d] addHeader zstd ,urlKey=" + this.urlKey, this.seqNo, "isAllowZstdDict", Boolean.valueOf(this.isAllowZstdDict.get()));
        }
    }

    public void dueToRequestPriority(Request.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e344b2d3", new Object[]{this, builder});
            return;
        }
        String priority = AmdcPriorityHelper.getPriority(1, this.seqNo, GlobalAppRuntimeInfo.getUserId());
        if (priority != null && !priority.isEmpty()) {
            builder.addHeader(HttpConstant.X_PRIORITY_ID, priority);
        }
        this.rs.priority = priority;
        ALog.e(TAG, "[amdc priority] set priority = " + priority, this.seqNo, " host", getHost());
    }

    public int isForceCellRequestEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b5a3dc9", new Object[]{this})).intValue();
        }
        if (!AwcnConfig.isReqForceCellEnable() || !NetworkStatusHelper.getStatus().isWifi()) {
            ALog.e(TAG, "[force cellular] not need force cellular!", this.seqNo, "isReqForceCellEnable", Boolean.valueOf(AwcnConfig.isReqForceCellEnable()));
            return 0;
        }
        String extProperty = this.request.getExtProperty(RequestConstant.FORCE_CELLULAR);
        if (!"true".equalsIgnoreCase(extProperty)) {
            ALog.e(TAG, "[force cellular] not need force cellular! mtop isForceCellRequestEnable=" + extProperty, this.seqNo, new Object[0]);
            return 0;
        } else if (!AwcnConfig.isUrlInReqForceCellWhiteList(this.urlKey)) {
            ALog.e(TAG, "[force cellular] set params fail! url not isUrlInReqForceCellWhiteList!!! mtop isForceCellRequestEnable=" + extProperty, this.seqNo, "urlKey", this.urlKey);
            return 2;
        } else {
            ALog.e(TAG, "[force cellular] mtop isForceCellRequestEnable=" + extProperty, this.seqNo, new Object[0]);
            return 1;
        }
    }

    public boolean isRequestUplinkEncodeEnable(int i) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fe14f6d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        ParcelableRequest parcelableRequest = this.request;
        String str = (parcelableRequest == null || (map = parcelableRequest.headers) == null) ? null : map.get(HttpConstant.CONTENT_ENCODING);
        if (str != null && !str.isEmpty()) {
            return false;
        }
        String extProperty = this.request.getExtProperty(RequestConstant.UPLINK_ENCODE);
        if (i != 0) {
            ALog.e(TAG, "[uplink encode] mtop requestUplinkEncodeEnable=" + extProperty, this.seqNo, "type", Integer.valueOf(i));
        }
        return "enable".equalsIgnoreCase(extProperty);
    }

    public void redirectToUrl(HttpUrl httpUrl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68cdeec9", new Object[]{this, httpUrl});
            return;
        }
        ALog.i(TAG, "redirect", this.seqNo, "to url", httpUrl.toString());
        this.mRedirectTimes++;
        this.rs.url = httpUrl.simpleUrlString();
        this.awcnRequest = buildRequest(httpUrl);
    }

    public int updateDetectReqType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8aac2506", new Object[]{this})).intValue();
        }
        if (this.isUpdateDetectReq == -1) {
            String extProperty = this.request.getExtProperty(RequestConstant.KEY_WIFI_DETECT_REQ);
            if (extProperty == null || extProperty.isEmpty()) {
                this.isUpdateDetectReq = 0;
            } else {
                if (extProperty.equalsIgnoreCase("long_link")) {
                    this.isUpdateDetectReq = 2;
                } else if (extProperty.equalsIgnoreCase("short_link") || extProperty.equalsIgnoreCase("true")) {
                    this.isUpdateDetectReq = 1;
                } else {
                    this.isUpdateDetectReq = 0;
                }
                ALog.e(TAG, "[wifi fg detect opt] request is detect req = 1", this.seqNo, "host", this.awcnRequest.getHost());
            }
        }
        return this.isUpdateDetectReq;
    }
}
