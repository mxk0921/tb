package mtopsdk.mtop.intf;

import android.os.Handler;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.FullTraceAnalysis;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.DefaultMtopCallback;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.common.MtopRequestStListener;
import mtopsdk.mtop.common.listener.MtopBaseListenerProxy;
import mtopsdk.mtop.common.listener.MtopCacheListenerProxy;
import mtopsdk.mtop.domain.ApiTypeEnum;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.stat.PrefetchStatistics;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopConvert;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.mtop.util.RequestIdGenerator;
import tb.f10;
import tb.gz8;
import tb.hi9;
import tb.inx;
import tb.owp;
import tb.raq;
import tb.t2o;
import tb.tz8;
import tb.ui9;
import tb.w4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopBuilder";
    private Class<?> clazz;
    private boolean forceCellular;
    public MtopListener listener;
    public w4j mtopContext;
    public Mtop mtopInstance;
    public MtopPrefetch mtopPrefetch;
    public final MtopNetworkProp mtopProp;
    public MtopRequest request;
    @Deprecated
    public Object requestContext;
    public String requestId;
    public MtopStatistics stat;
    private boolean supportStreamJson;
    private boolean supportZstdDictionary;
    private boolean upstreamCompress;

    static {
        t2o.a(589299944);
    }

    public MtopBuilder(Mtop mtop, IMTOPDataObject iMTOPDataObject, String str) {
        this(mtop, MtopConvert.inputDoToMtopRequest(iMTOPDataObject), str);
    }

    private ApiID asyncRequest(MtopListener mtopListener) {
        String str;
        raq k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("78073e9", new Object[]{this, mtopListener});
        }
        MtopStatistics mtopStatistics = this.stat;
        mtopStatistics.startTime = mtopStatistics.currentTimeMillis();
        final w4j createMtopContext = createMtopContext(mtopListener);
        createMtopContext.g.instanceId = createMtopContext.f30449a.getInstanceId();
        MtopStatistics mtopStatistics2 = createMtopContext.g;
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        mtopStatistics2.isJsTimeoutEnable = mtopNetworkProp.isTimeoutEnable;
        mtopStatistics2.ttid = mtopNetworkProp.ttid;
        this.mtopContext = createMtopContext;
        createMtopContext.f = new ApiID(null, createMtopContext);
        try {
            if (Mtop.mIsFullTrackValid) {
                if (!TextUtils.isEmpty(this.mtopProp.fullTraceId)) {
                    str = this.mtopProp.fullTraceId;
                } else {
                    str = FullTraceAnalysis.getInstance().createRequest("mtop");
                }
                tz8 tz8Var = FalcoGlobalTracer.get();
                if (tz8Var != null) {
                    tz8.a d = tz8Var.d("mtop", "MTOP_UnknownScene");
                    Map<String, String> map = this.mtopProp.openTraceContext;
                    if (!(map == null || map.isEmpty() || (k = tz8Var.k(this.mtopProp.openTraceContext)) == null)) {
                        d.b(k);
                    }
                    gz8 h = d.h();
                    MtopStatistics mtopStatistics3 = createMtopContext.g;
                    mtopStatistics3.openTraceSpan = h;
                    mtopStatistics3.openTraceContext = tz8Var.c(h.a());
                }
                if (!TextUtils.isEmpty(str)) {
                    MtopStatistics mtopStatistics4 = createMtopContext.g;
                    mtopStatistics4.falcoId = str;
                    mtopStatistics4.fullTraceId = str;
                    if (!TextUtils.isEmpty(this.mtopProp.bizIdStr)) {
                        createMtopContext.g.bizIdStr = this.mtopProp.bizIdStr;
                    } else {
                        createMtopContext.g.bizId = this.mtopProp.bizId;
                    }
                    MtopStatistics mtopStatistics5 = createMtopContext.g;
                    MtopNetworkProp mtopNetworkProp2 = this.mtopProp;
                    mtopStatistics5.pageIndex = mtopNetworkProp2.pageIndex;
                    mtopStatistics5.bizTopic = mtopNetworkProp2.bizTopic;
                    mtopStatistics5.pTraceId = mtopNetworkProp2.pTraceId;
                    mtopStatistics5.isReqMain = MtopUtils.isMainThread();
                    createMtopContext.g.formatStartLog();
                    FullTraceHelper.recordReqStart(createMtopContext.g, createMtopContext.b.getKey());
                }
            }
            MtopRequestStListener mtopRequestStListener = createMtopContext.f30449a.mtopConfig.requestStListener;
            if (mtopRequestStListener != null) {
                try {
                    mtopRequestStListener.onRequest(createMtopContext.o);
                } catch (Exception e) {
                    TBSdkLog.e(TAG, "[asyncRequest] requestStListener onRequest error", e);
                }
            }
            if (!MtopUtils.isMainThread() && this.mtopInstance.isInited()) {
                FullTraceHelper.beginSection("mtop_startExecute", createMtopContext.h);
                createMtopContext.g.startExecuteTime = this.stat.currentTimeMillis();
                FullTraceHelper.recordReqProcessStart(createMtopContext.g);
                hi9 hi9Var = this.mtopInstance.getMtopConfig().filterManager;
                if (hi9Var != null) {
                    ((f10) hi9Var).d(null, createMtopContext);
                }
                ui9.a(hi9Var, createMtopContext);
                FullTraceHelper.endSection();
                return createMtopContext.f;
            }
            MtopSDKThreadPoolExecutorFactory.getRequestThreadPoolExecutor().submit(new Runnable() { // from class: mtopsdk.mtop.intf.MtopBuilder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FullTraceHelper.beginSection("mtop_waitExecute", createMtopContext.h);
                    FullTraceHelper.recordReqProcessStart(createMtopContext.g);
                    createMtopContext.g.startExecuteTime = MtopBuilder.this.stat.currentTimeMillis();
                    if (MtopBuilder.this.mtopInstance.isInited() || !owp.c(createMtopContext)) {
                        MtopBuilder.this.mtopInstance.checkMtopSDKInit();
                    } else {
                        MtopBuilder.this.mtopInstance.checkMtopSDKSignDegradeInit();
                    }
                    FullTraceHelper.endSection();
                    FullTraceHelper.beginSection("mtop_startExecute", createMtopContext.h);
                    hi9 hi9Var2 = MtopBuilder.this.mtopInstance.getMtopConfig().filterManager;
                    if (hi9Var2 != null) {
                        ((f10) hi9Var2).d(null, createMtopContext);
                    }
                    ui9.a(hi9Var2, createMtopContext);
                    FullTraceHelper.endSection();
                }
            });
            return createMtopContext.f;
        } catch (Throwable unused) {
            return createMtopContext.f;
        }
    }

    private MtopBaseListenerProxy createListenerProxy(MtopListener mtopListener) {
        MtopBaseListenerProxy mtopBaseListenerProxy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBaseListenerProxy) ipChange.ipc$dispatch("33420e67", new Object[]{this, mtopListener});
        }
        if (mtopListener == null) {
            return new MtopBaseListenerProxy(new DefaultMtopCallback());
        }
        if (mtopListener instanceof MtopCallback.MtopCacheListener) {
            mtopBaseListenerProxy = new MtopCacheListenerProxy(mtopListener);
        } else {
            mtopBaseListenerProxy = new MtopBaseListenerProxy(mtopListener);
        }
        return mtopBaseListenerProxy;
    }

    public MtopBuilder addCacheKeyParamBlackList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("fb8550f2", new Object[]{this, list});
        }
        if (list != null) {
            this.mtopProp.cacheKeyBlackList = list;
        }
        return this;
    }

    public MtopBuilder addHttpQueryParameter(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("62e92331", new Object[]{this, str, str2});
        }
        if (StringUtils.isBlank(str) || StringUtils.isBlank(str2)) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                TBSdkLog.d(TAG, "[addHttpQueryParameter]add HttpQueryParameter error,key=" + str + ",value=" + str2);
            }
            return this;
        }
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        if (mtopNetworkProp.queryParameterMap == null) {
            mtopNetworkProp.queryParameterMap = new HashMap();
        }
        this.mtopProp.queryParameterMap.put(str, str2);
        return this;
    }

    public MtopBuilder addListener(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("87445341", new Object[]{this, mtopListener});
        }
        this.listener = mtopListener;
        return this;
    }

    public MtopBuilder addMteeUa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("7cb36731", new Object[]{this, str});
        }
        addHttpQueryParameter(MspGlobalDefine.UA, str);
        return this;
    }

    public MtopBuilder addOpenApiParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("2c73dbfc", new Object[]{this, str, str2});
        }
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        mtopNetworkProp.apiType = ApiTypeEnum.ISV_OPEN_API;
        mtopNetworkProp.openAppKey = str;
        mtopNetworkProp.accessToken = str2;
        return this;
    }

    public MtopBuilder allowSwitchToPOST(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("ed5c9481", new Object[]{this, new Boolean(z)});
        }
        this.mtopProp.allowSwitchToPOST = z;
        return this;
    }

    public w4j createMtopContext(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4j) ipChange.ipc$dispatch("7bf624d0", new Object[]{this, mtopListener});
        }
        w4j w4jVar = new w4j();
        w4jVar.f30449a = this.mtopInstance;
        MtopStatistics mtopStatistics = this.stat;
        w4jVar.g = mtopStatistics;
        w4jVar.h = mtopStatistics.seqNo;
        MtopRequest mtopRequest = this.request;
        w4jVar.b = mtopRequest;
        w4jVar.d = this.mtopProp;
        w4jVar.e = mtopListener;
        w4jVar.o = this;
        boolean z = this.supportStreamJson;
        w4jVar.q = z;
        boolean z2 = this.upstreamCompress;
        w4jVar.r = z2;
        boolean z3 = this.supportZstdDictionary;
        w4jVar.s = z3;
        w4jVar.u = this.forceCellular;
        w4jVar.v = this.clazz;
        mtopStatistics.supportStreamJson = z;
        mtopStatistics.upstreamCompress = z2;
        mtopStatistics.supportZstdDictionary = z3;
        if (mtopRequest != null) {
            mtopStatistics.apiKey = mtopRequest.getKey();
            this.stat.reqSource = this.mtopProp.reqSource;
        }
        if (StringUtils.isBlank(w4jVar.d.ttid)) {
            w4jVar.d.ttid = this.mtopInstance.getTtid();
        }
        Object obj = this.requestContext;
        if (obj != null) {
            reqContext(obj);
        }
        return w4jVar;
    }

    public MtopBuilder enableProgressListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("63dc7fd7", new Object[]{this});
        }
        this.mtopProp.enableProgressListener = true;
        return this;
    }

    public MtopBuilder forceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("d8b301c4", new Object[]{this, new Boolean(z)});
        }
        this.forceCellular = z;
        return this;
    }

    public MtopBuilder forceRefreshCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("8d418ea5", new Object[]{this});
        }
        this.mtopProp.forceRefreshCache = true;
        return this;
    }

    public w4j getMtopContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4j) ipChange.ipc$dispatch("467efba3", new Object[]{this});
        }
        return this.mtopContext;
    }

    public Mtop getMtopInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("3adfdfb5", new Object[]{this});
        }
        return this.mtopInstance;
    }

    public MtopPrefetch getMtopPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch) ipChange.ipc$dispatch("122a29dc", new Object[]{this});
        }
        return this.mtopPrefetch;
    }

    public Object getReqContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5d3a0c4", new Object[]{this});
        }
        return this.mtopProp.reqContext;
    }

    public MtopResponse handleAsyncTimeoutException() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("eb2c13b2", new Object[]{this});
        }
        MtopResponse mtopResponse = new MtopResponse(this.request.getApiName(), this.request.getVersion(), ErrorConstant.ERRCODE_MTOP_APICALL_ASYNC_TIMEOUT, ErrorConstant.MappingMsg.SERVICE_MAPPING_MSG);
        mtopResponse.mappingCodeSuffix = ErrorConstant.getMappingCodeByErrorCode(mtopResponse.getRetCode());
        mtopResponse.mappingCode = ErrorConstant.appendMappingCode(mtopResponse.getResponseCode(), mtopResponse.mappingCodeSuffix);
        this.stat.retCode = mtopResponse.getRetCode();
        this.stat.mappingCode = mtopResponse.getMappingCode();
        MtopStatistics mtopStatistics = this.stat;
        mtopStatistics.retType = 2;
        mtopResponse.setMtopStat(mtopStatistics);
        this.stat.onEndAndCommit();
        this.stat.commitFullTrace();
        return mtopResponse;
    }

    public MtopBuilder handler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("460204ad", new Object[]{this, handler});
        }
        this.mtopProp.handler = handler;
        return this;
    }

    public MtopBuilder headers(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("94930dc4", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            MtopNetworkProp mtopNetworkProp = this.mtopProp;
            Map<String, String> map2 = mtopNetworkProp.requestHeaders;
            if (map2 != null) {
                map2.putAll(map);
            } else {
                mtopNetworkProp.requestHeaders = map;
            }
        }
        return this;
    }

    public void mtopCommitStatData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79cef0", new Object[]{this, new Boolean(z)});
        } else {
            this.stat.commitStat = z;
        }
    }

    public MtopBuilder prefetch(long j, List<String> list, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("79062584", new Object[]{this, new Long(j), list, iPrefetchCallback});
        }
        prefetch(j, iPrefetchCallback);
        MtopPrefetch mtopPrefetch = this.mtopPrefetch;
        if (mtopPrefetch != null) {
            mtopPrefetch.whiteListParams = list;
        }
        return this;
    }

    public MtopBuilder prefetchComparator(MtopPrefetch.IPrefetchComparator iPrefetchComparator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("f0b2ac50", new Object[]{this, iPrefetchComparator});
        }
        if (this.mtopPrefetch == null) {
            this.mtopPrefetch = new MtopPrefetch(new PrefetchStatistics(this.mtopInstance.getMtopConfig().uploadStats));
        }
        this.mtopPrefetch.setComparator(iPrefetchComparator);
        return this;
    }

    public MtopBuilder prefetchMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("876378ce", new Object[]{this, new Integer(i)});
        }
        if (this.mtopPrefetch == null) {
            this.mtopPrefetch = new MtopPrefetch(new PrefetchStatistics(this.mtopInstance.getMtopConfig().uploadStats));
        }
        TBSdkLog.e(TAG, "[prefetchMode]mode=" + i);
        this.mtopPrefetch.setPrefetchMode(i);
        return this;
    }

    public MtopBuilder protocol(ProtocolEnum protocolEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("5aec2180", new Object[]{this, protocolEnum});
        }
        if (protocolEnum != null) {
            this.mtopProp.protocol = protocolEnum;
        }
        return this;
    }

    public MtopBuilder reqContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("cba91b00", new Object[]{this, obj});
        }
        this.mtopProp.reqContext = obj;
        return this;
    }

    public MtopBuilder reqMethod(MethodEnum methodEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("8bc358de", new Object[]{this, methodEnum});
        }
        if (methodEnum != null) {
            this.mtopProp.method = methodEnum;
        }
        return this;
    }

    public MtopBuilder retryTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("9abae993", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.retryTimes = i;
        return this;
    }

    @Deprecated
    public MtopBuilder securitySignDegraded(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("daa4780e", new Object[]{this, new Boolean(z)}) : this;
    }

    @Deprecated
    public MtopBuilder setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("5a33d7c", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.bizId = i;
        return this;
    }

    public MtopBuilder setBizTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("cb1adf1b", new Object[]{this, str});
        }
        this.mtopProp.bizTopic = str;
        return this;
    }

    public MtopBuilder setCacheControlNoCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("9c41a4b7", new Object[]{this});
        }
        Map<String, String> map = this.mtopProp.requestHeaders;
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("cache-control", HttpHeaderConstant.NO_CACHE);
        this.mtopProp.requestHeaders = map;
        return this;
    }

    public void setClazz(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69c1040", new Object[]{this, cls});
        } else {
            this.clazz = cls;
        }
    }

    public MtopBuilder setConnectionTimeoutMilliSecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("d9e3efc8", new Object[]{this, new Integer(i)});
        }
        if (i > 0) {
            this.mtopProp.connTimeout = i;
        }
        return this;
    }

    public MtopBuilder setCustomDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("e9b9b354", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.customDomain = str;
        }
        return this;
    }

    public MtopBuilder setJsonType(JsonTypeEnum jsonTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("ad118c42", new Object[]{this, jsonTypeEnum});
        }
        if (jsonTypeEnum != null) {
            addHttpQueryParameter("type", jsonTypeEnum.getJsonType());
        }
        return this;
    }

    public MtopBuilder setMiniAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("25bc87f4", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.miniAppKey = str;
        }
        return this;
    }

    public MtopBuilder setNetInfo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("ed7c817f", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.netParam = i;
        return this;
    }

    public MtopBuilder setOpenBiz(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("49e915e4", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.openBiz = str;
        }
        return this;
    }

    public MtopBuilder setOpenBizData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("ba689d2e", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.openBizData = str;
        }
        return this;
    }

    public MtopBuilder setOpenTracingContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("67a8231", new Object[]{this, map});
        }
        this.mtopProp.openTraceContext = map;
        return this;
    }

    public MtopBuilder setPTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("b6213fef", new Object[]{this, str});
        }
        this.mtopProp.pTraceId = str;
        return this;
    }

    public MtopBuilder setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("d23cf667", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.pageIndex = i;
        return this;
    }

    public MtopBuilder setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("91cf29f9", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.pageName = str;
            this.stat.pageName = str;
        }
        return this;
    }

    public MtopBuilder setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("9bfdc25b", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.pageUrl = str;
            this.stat.pageUrl = str;
        }
        return this;
    }

    public MtopBuilder setPlaceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("c351657d", new Object[]{this, str});
        }
        this.mtopProp.placeId = str;
        return this;
    }

    public MtopBuilder setReqAppKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("688c7ac1", new Object[]{this, str, str2});
        }
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        mtopNetworkProp.reqAppKey = str;
        mtopNetworkProp.authCode = str2;
        return this;
    }

    public MtopBuilder setReqBizExt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("c907eec7", new Object[]{this, str});
        }
        this.mtopProp.reqBizExt = str;
        return this;
    }

    public MtopBuilder setReqSource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("4bc8cfd1", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.reqSource = i;
        return this;
    }

    public MtopBuilder setReqUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("420fd8ff", new Object[]{this, str});
        }
        this.mtopProp.reqUserId = str;
        return this;
    }

    public MtopBuilder setRequestSourceAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("12857da3", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopProp.requestSourceAppKey = str;
        }
        return this;
    }

    public MtopBuilder setRouterId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("11ce5983", new Object[]{this, str});
        }
        this.mtopProp.routerId = str;
        return this;
    }

    public MtopBuilder setSocketTimeoutMilliSecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("4fae5153", new Object[]{this, new Integer(i)});
        }
        if (i > 0) {
            this.mtopProp.socketTimeout = i;
        }
        return this;
    }

    public MtopBuilder setTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("53b7233b", new Object[]{this, str});
        }
        this.mtopProp.fullTraceId = str;
        return this;
    }

    public MtopBuilder setUserInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("8c17fdd8", new Object[]{this, str});
        }
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        mtopNetworkProp.userInfo = str;
        return this;
    }

    public MtopBuilder supportStreamJson(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("fed52242", new Object[]{this, new Boolean(z)});
        }
        this.supportStreamJson = z;
        return this;
    }

    public MtopBuilder supportZstdDictionary(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("76b68a0b", new Object[]{this, new Boolean(z)});
        }
        this.supportZstdDictionary = z;
        return this;
    }

    public MtopBuilder ttid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("bb33f3d8", new Object[]{this, str});
        }
        this.mtopProp.ttid = str;
        return this;
    }

    public MtopBuilder upstreamCompress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("41b643dc", new Object[]{this, new Boolean(z)});
        }
        this.upstreamCompress = z;
        return this;
    }

    public MtopBuilder useCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("a35c7eae", new Object[]{this});
        }
        this.mtopProp.useCache = true;
        return this;
    }

    public MtopBuilder useWua() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("1d74b66f", new Object[]{this}) : useWua(4);
    }

    public MtopBuilder(Mtop mtop, MtopRequest mtopRequest, String str) {
        MtopNetworkProp mtopNetworkProp = new MtopNetworkProp();
        this.mtopProp = mtopNetworkProp;
        this.listener = null;
        this.requestContext = null;
        this.stat = null;
        this.supportStreamJson = false;
        this.upstreamCompress = false;
        this.supportZstdDictionary = false;
        this.forceCellular = false;
        this.mtopInstance = mtop;
        this.request = mtopRequest;
        mtopNetworkProp.ttid = str;
        this.requestId = RequestIdGenerator.getRequestId();
        mtopNetworkProp.pageName = inx.c("PageName");
        mtopNetworkProp.pageUrl = inx.c("PageUrl");
        mtopNetworkProp.backGround = inx.h();
        this.stat = new MtopStatistics(mtop.getMtopConfig().uploadStats, mtop.getMtopConfig().mtopStatsListener, mtopNetworkProp);
    }

    public MtopBuilder setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("396f8009", new Object[]{this, str});
        }
        this.mtopProp.bizIdStr = str;
        return this;
    }

    public MtopBuilder setCustomDomain(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("9e8ab968", new Object[]{this, str, str2, str3});
        }
        if (StringUtils.isNotBlank(str)) {
            this.mtopProp.customOnlineDomain = str;
        }
        if (StringUtils.isNotBlank(str2)) {
            this.mtopProp.customPreDomain = str2;
        }
        if (StringUtils.isNotBlank(str3)) {
            this.mtopProp.customDailyDomain = str3;
        }
        return this;
    }

    public MtopResponse syncRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("bac48c0", new Object[]{this});
        }
        this.stat.isReqSync = true;
        MtopBaseListenerProxy createListenerProxy = createListenerProxy(this.listener);
        asyncRequest(createListenerProxy);
        synchronized (createListenerProxy) {
            try {
                if (createListenerProxy.response == null) {
                    createListenerProxy.wait(60000L);
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, "[syncRequest] callback wait error", e);
            }
        }
        MtopResponse mtopResponse = createListenerProxy.response;
        Object obj = createListenerProxy.reqContext;
        if (obj != null) {
            this.mtopProp.reqContext = obj;
        }
        return mtopResponse != null ? mtopResponse : handleAsyncTimeoutException();
    }

    @Deprecated
    public MtopBuilder useWua(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBuilder) ipChange.ipc$dispatch("e977378c", new Object[]{this, new Integer(i)});
        }
        this.mtopProp.wuaFlag = i;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r3.contains(r2) != false) goto L_0x0056;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mtopsdk.mtop.intf.MtopBuilder prefetch(long r6, mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = mtopsdk.mtop.intf.MtopBuilder.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0020
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r6)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r5
            r6[r0] = r3
            r7 = 2
            r6[r7] = r8
            java.lang.String r7 = "6e196e93"
            java.lang.Object r6 = r2.ipc$dispatch(r7, r6)
            mtopsdk.mtop.intf.MtopBuilder r6 = (mtopsdk.mtop.intf.MtopBuilder) r6
            return r6
        L_0x0020:
            mtopsdk.mtop.intf.MtopPrefetch r2 = r5.mtopPrefetch
            if (r2 != 0) goto L_0x0038
            mtopsdk.mtop.intf.MtopPrefetch r2 = new mtopsdk.mtop.intf.MtopPrefetch
            mtopsdk.mtop.stat.PrefetchStatistics r3 = new mtopsdk.mtop.stat.PrefetchStatistics
            mtopsdk.mtop.intf.Mtop r4 = r5.mtopInstance
            mtopsdk.mtop.global.MtopConfig r4 = r4.getMtopConfig()
            mtopsdk.mtop.stat.IUploadStats r4 = r4.uploadStats
            r3.<init>(r4)
            r2.<init>(r3)
            r5.mtopPrefetch = r2
        L_0x0038:
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0065
            mtopsdk.mtop.domain.MtopRequest r2 = r5.request
            if (r2 == 0) goto L_0x0055
            java.lang.String r2 = r2.getKey()
            mtopsdk.mtop.global.SwitchConfig r3 = mtopsdk.mtop.global.SwitchConfig.getInstance()
            java.util.Set<java.lang.String> r3 = r3.allowCustomPrefetchExpireTimeApiSet
            if (r3 == 0) goto L_0x0055
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            mtopsdk.mtop.intf.MtopPrefetch r1 = r5.mtopPrefetch
            if (r0 != 0) goto L_0x0062
            r2 = 15000(0x3a98, double:7.411E-320)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r6 = r2
        L_0x0062:
            r1.setPrefetchExpireTime(r6)
        L_0x0065:
            mtopsdk.mtop.intf.MtopPrefetch r6 = r5.mtopPrefetch
            r6.setCallback(r8)
            mtopsdk.mtop.intf.MtopPrefetch r6 = r5.mtopPrefetch
            mtopsdk.mtop.intf.MtopPrefetch$IPrefetchComparator r6 = r6.getComparator()
            if (r6 != 0) goto L_0x007c
            mtopsdk.mtop.intf.MtopPrefetch r6 = r5.mtopPrefetch
            mtopsdk.mtop.intf.MtopPrefetch$DefaultPrefetchComparator r7 = new mtopsdk.mtop.intf.MtopPrefetch$DefaultPrefetchComparator
            r7.<init>()
            r6.setComparator(r7)
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.intf.MtopBuilder.prefetch(long, mtopsdk.mtop.intf.MtopPrefetch$IPrefetchCallback):mtopsdk.mtop.intf.MtopBuilder");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r6.equals("UNIT_TRADE") == false) goto L_0x0026;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mtopsdk.mtop.intf.MtopBuilder setUnitStrategy(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = mtopsdk.mtop.intf.MtopBuilder.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "f55b3fd6"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            mtopsdk.mtop.intf.MtopBuilder r6 = (mtopsdk.mtop.intf.MtopBuilder) r6
            return r6
        L_0x0019:
            if (r6 == 0) goto L_0x006d
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -366328735: goto L_0x003c;
                case -354420023: goto L_0x0033;
                case 1399582576: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r0 = -1
            goto L_0x0046
        L_0x0028:
            java.lang.String r0 = "UNIT_CENTER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r0 = 2
            goto L_0x0046
        L_0x0033:
            java.lang.String r1 = "UNIT_TRADE"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0046
            goto L_0x0026
        L_0x003c:
            java.lang.String r0 = "UNIT_GUIDE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0045
            goto L_0x0026
        L_0x0045:
            r0 = 0
        L_0x0046:
            switch(r0) {
                case 0: goto L_0x0061;
                case 1: goto L_0x0054;
                case 2: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x006d
        L_0x004a:
            java.lang.String r6 = "acs.wapa.taobao.com"
            java.lang.String r0 = "acs.waptest.taobao.com"
            java.lang.String r1 = "acs.m.taobao.com"
            r5.setCustomDomain(r1, r6, r0)
            goto L_0x006d
        L_0x0054:
            java.lang.String r6 = "trade-acs.wapa.taobao.com"
            java.lang.String r0 = "trade-acs.waptest.taobao.com"
            java.lang.String r1 = "trade-acs.m.taobao.com"
            r5.setCustomDomain(r1, r6, r0)
            goto L_0x006d
        L_0x0061:
            java.lang.String r6 = "guide-acs.wapa.taobao.com"
            java.lang.String r0 = "guide-acs.waptest.taobao.com"
            java.lang.String r1 = "guide-acs.m.taobao.com"
            r5.setCustomDomain(r1, r6, r0)
        L_0x006d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.mtop.intf.MtopBuilder.setUnitStrategy(java.lang.String):mtopsdk.mtop.intf.MtopBuilder");
    }

    public MtopBuilder prefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("2fa1bb6a", new Object[]{this}) : prefetch(0L, null);
    }

    @Deprecated
    public MtopBuilder(Mtop mtop, Object obj, String str) {
        this(mtop, MtopConvert.inputDoToMtopRequest(obj), str);
    }

    @Deprecated
    public MtopBuilder(IMTOPDataObject iMTOPDataObject, String str) {
        this(Mtop.instance(null), iMTOPDataObject, str);
    }

    @Deprecated
    public MtopBuilder(MtopRequest mtopRequest, String str) {
        this(Mtop.instance(null), mtopRequest, str);
    }

    @Deprecated
    public MtopBuilder(Object obj, String str) {
        this(Mtop.instance(null), obj, str);
    }

    public ApiID asyncRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("5aecb610", new Object[]{this});
        }
        this.stat.isReqSync = false;
        return asyncRequest(this.listener);
    }
}
