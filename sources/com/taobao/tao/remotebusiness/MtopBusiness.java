package com.taobao.tao.remotebusiness;

import android.content.Context;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.ApiID;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.ApiTypeEnum;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;
import mtopsdk.mtop.stat.IMtopMonitor;
import mtopsdk.mtop.stat.MtopMonitor;
import mtopsdk.mtop.util.MtopStatistics;
import tb.k5j;
import tb.m7j;
import tb.t2o;
import tb.tpq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopBusiness extends MtopBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_RETRY_TIMES = 3;
    private static final String TAG = "mtopsdk.MtopBusiness";
    private static AtomicInteger seqGen = new AtomicInteger(0);
    private ApiID apiID;
    public Class<?> clazz;
    public MtopListener listener;
    private boolean isCancelled = false;
    public int retryTime = 0;
    public int requestType = 0;
    @Deprecated
    public Object requestContext = null;
    private boolean showLoginUI = true;
    private boolean isErrorNotifyAfterCache = false;
    public String authParam = null;
    public boolean showAuthUI = true;
    private boolean needAuth = false;
    public boolean isCached = false;
    public long reqStartTime = 0;
    public long onBgFinishTime = 0;
    public long sendStartTime = 0;
    public long onStreamFirstResReadyTime = 0;
    private MtopResponse mtopResponse = null;
    private boolean syncRequestFlag = false;
    private boolean allowParseJson = true;
    private boolean mForbidStreamExceptionCallback = false;
    private final String seqNo = genSeqNo();

    static {
        t2o.a(589299727);
    }

    public MtopBusiness(Mtop mtop, IMTOPDataObject iMTOPDataObject, String str) {
        super(mtop, iMTOPDataObject, str);
    }

    public static MtopBusiness build(Mtop mtop, IMTOPDataObject iMTOPDataObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("4b039f10", new Object[]{mtop, iMTOPDataObject, str}) : new MtopBusiness(mtop, iMTOPDataObject, str);
    }

    private String genSeqNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e60a3be9", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("MB");
        sb.append(seqGen.incrementAndGet());
        sb.append('.');
        sb.append(this.stat.seqNo);
        return sb.toString();
    }

    private String getRequestLogInfo(String str, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c81c7c78", new Object[]{this, str, mtopBusiness});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(str);
        sb.append(" [");
        if (mtopBusiness != null) {
            sb.append("apiName=");
            sb.append(mtopBusiness.request.getApiName());
            sb.append(";version=");
            sb.append(mtopBusiness.request.getVersion());
            sb.append(";requestType=");
            sb.append(mtopBusiness.getRequestType());
        }
        sb.append("]");
        return sb.toString();
    }

    public static /* synthetic */ Object ipc$super(MtopBusiness mtopBusiness, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2025565375:
                return super.addListener((MtopListener) objArr[0]);
            case -2023524146:
                return super.prefetchMode(((Number) objArr[0]).intValue());
            case -1950132002:
                return super.reqMethod((MethodEnum) objArr[0]);
            case -1944584744:
                return super.setUserInfo((String) objArr[0]);
            case -1925083483:
                return super.forceRefreshCache();
            case -1848694279:
                return super.setPageName((String) objArr[0]);
            case -1802302012:
                return super.headers((Map) objArr[0]);
            case -1699026541:
                return super.retryTime(((Number) objArr[0]).intValue());
            case -1677868453:
                return super.setPageUrl((String) objArr[0]);
            case -1673419593:
                return super.setCacheControlNoCache();
            case -1635075736:
                return super.setCustomDomain((String) objArr[0], (String) objArr[1], (String) objArr[2]);
            case -1554219346:
                return super.useCache();
            case -1391358910:
                return super.setJsonType((JsonTypeEnum) objArr[0]);
            case -1239334929:
                return super.setPTraceId((String) objArr[0]);
            case -1154223144:
                return super.ttid((String) objArr[0]);
            case -922227001:
                return super.setReqBizExt((String) objArr[0]);
            case -887431397:
                return super.setBizTopic((String) objArr[0]);
            case -878109952:
                return super.reqContext(objArr[0]);
            case -767756697:
                return super.setPageIndex(((Number) objArr[0]).intValue());
            case -659357244:
                return super.forceCellular(((Boolean) objArr[0]).booleanValue());
            case -639373368:
                return super.setConnectionTimeoutMilliSecond(((Number) objArr[0]).intValue());
            case -626755570:
                return super.securitySignDegraded(((Boolean) objArr[0]).booleanValue());
            case -378062964:
                return super.useWua(((Number) objArr[0]).intValue());
            case -373705900:
                return super.setCustomDomain((String) objArr[0]);
            case -312699775:
                return super.allowSwitchToPOST(((Boolean) objArr[0]).booleanValue());
            case -310607489:
                return super.setNetInfo(((Number) objArr[0]).intValue());
            case -256725936:
                return super.prefetchComparator((MtopPrefetch.IPrefetchComparator) objArr[0]);
            case -178569258:
                return super.setUnitStrategy((String) objArr[0]);
            case -75149070:
                return super.addCacheKeyParamBlackList((List) objArr[0]);
            case -19586494:
                return super.supportStreamJson(((Boolean) objArr[0]).booleanValue());
            case 94584188:
                return super.setBizId(((Number) objArr[0]).intValue());
            case 108692017:
                return super.setOpenTracingContext((Map) objArr[0]);
            case 494188143:
                return super.useWua();
            case 745790460:
                return super.addOpenApiParams((String) objArr[0], (String) objArr[1]);
            case 963608585:
                return super.setBizId((String) objArr[0]);
            case 1102463964:
                return super.upstreamCompress(((Boolean) objArr[0]).booleanValue());
            case 1108334847:
                return super.setReqUserId((String) objArr[0]);
            case 1174537389:
                return super.handler((Handler) objArr[0]);
            case 1271451601:
                return super.setReqSource(((Number) objArr[0]).intValue());
            case 1336824147:
                return super.setSocketTimeoutMilliSecond(((Number) objArr[0]).intValue());
            case 1404511035:
                return super.setTraceId((String) objArr[0]);
            case 1525424512:
                return super.protocol((ProtocolEnum) objArr[0]);
            case 1525462544:
                return super.asyncRequest();
            case 1659446065:
                return super.addHttpQueryParameter((String) objArr[0], (String) objArr[1]);
            case 1675395031:
                return super.enableProgressListener();
            case 1754036929:
                return super.setReqAppKey((String) objArr[0], (String) objArr[1]);
            case 1847160467:
                return super.prefetch(((Number) objArr[0]).longValue(), (MtopPrefetch.IPrefetchCallback) objArr[1]);
            case 1991674379:
                return super.supportZstdDictionary(((Boolean) objArr[0]).booleanValue());
            case 2030445956:
                return super.prefetch(((Number) objArr[0]).longValue(), (List) objArr[1], (MtopPrefetch.IPrefetchCallback) objArr[2]);
            case 2092132145:
                return super.addMteeUa((String) objArr[0]);
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/remotebusiness/MtopBusiness");
        }
    }

    public MtopBusiness allowParseJson(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("1d61aa99", new Object[]{this, new Boolean(z)});
        }
        this.allowParseJson = z;
        return this;
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    public ApiID asyncRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("5aecb610", new Object[]{this});
        }
        startRequest();
        return this.apiID;
    }

    public void doStreamReceiveData(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f44c8c", new Object[]{this, mtopResponse, baseOutDo});
        } else if (this.isCancelled) {
            TBSdkLog.w(TAG, this.seqNo, "request is cancelled,don't callback listener.");
        } else {
            try {
                if (!(this.listener instanceof IMtopStreamListener)) {
                    String str2 = this.seqNo;
                    StringBuilder sb = new StringBuilder("listener did't implement IMtopStreamListener.apiKey=");
                    if (mtopResponse != null) {
                        str = mtopResponse.getFullKey();
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    TBSdkLog.e(TAG, str2, sb.toString());
                    return;
                }
                if (mtopResponse != null) {
                    mtopResponse.setAllowParseJson(this.allowParseJson);
                }
                IMtopStreamListener iMtopStreamListener = (IMtopStreamListener) this.listener;
                TBSdkLog.d(TAG, this.mtopContext.h, "[doStreamReceiveData] callback");
                long currentTimeMillis = System.currentTimeMillis();
                m7j c = tpq.c(mtopResponse);
                MtopStatistics mtopStatistics = this.stat;
                if (mtopStatistics != null && mtopStatistics.streamFirstResCallbackDuration <= 0) {
                    mtopStatistics.streamFirstResCallbackDuration = mtopStatistics.currentTimeMillis() - this.stat.startTime;
                }
                String str3 = this.mtopContext.h;
                TBSdkLog.d(TAG, str3, "[doStreamReceiveData] convertStreamResponse: " + (System.currentTimeMillis() - currentTimeMillis));
                iMtopStreamListener.onReceiveData(c, baseOutDo, this.requestType, getReqContext());
            } catch (Throwable th) {
                TBSdkLog.e(TAG, this.seqNo, "doStreamReceiveData listener callback error", th);
            }
        }
    }

    public void forbidStreamExceptionCallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4c734d", new Object[]{this, new Boolean(z)});
        } else {
            this.mForbidStreamExceptionCallback = z;
        }
    }

    public int getRequestType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5651102d", new Object[]{this})).intValue();
        }
        return this.requestType;
    }

    public int getRetryTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d972c3d9", new Object[]{this})).intValue();
        }
        return this.retryTime;
    }

    public String getSeqNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3df0a06f", new Object[]{this});
        }
        return this.seqNo;
    }

    public boolean isNeedAuth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("840a3733", new Object[]{this})).booleanValue();
        }
        if (this.needAuth || this.authParam != null) {
            return true;
        }
        return false;
    }

    public boolean isShowLoginUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff889001", new Object[]{this})).booleanValue();
        }
        return this.showLoginUI;
    }

    public boolean isSycnRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810f4aff", new Object[]{this})).booleanValue();
        }
        return this.syncRequestFlag;
    }

    public boolean isTaskCanceled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9d3c13", new Object[]{this})).booleanValue();
        }
        return this.isCancelled;
    }

    @Deprecated
    public MtopBusiness registerListener(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("5ca09efd", new Object[]{this, mtopListener});
        }
        this.listener = mtopListener;
        return this;
    }

    public MtopBusiness setErrorNotifyAfterCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("a6bfe9bc", new Object[]{this, new Boolean(z)});
        }
        this.isErrorNotifyAfterCache = z;
        return this;
    }

    @Deprecated
    public void setErrorNotifyNeedAfterCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8462a42", new Object[]{this, new Boolean(z)});
        } else {
            setErrorNotifyAfterCache(z);
        }
    }

    public MtopBusiness setNeedAuth(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("12c4a291", new Object[]{this, str, new Boolean(z)});
        }
        this.authParam = str;
        this.showAuthUI = z;
        this.needAuth = true;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[setNeedAuth] authParam=");
            sb.append(str);
            sb.append(", showAuthUI=");
            sb.append(z);
            sb.append(", needAuth=");
            sb.append(this.needAuth);
            TBSdkLog.d(TAG, this.seqNo, sb.toString());
        }
        return this;
    }

    public MtopBusiness setPriorityData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("84911d06", new Object[]{this, map});
        }
        this.mtopProp.priorityData = map;
        return this;
    }

    public MtopBusiness setPriorityFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("c492a59", new Object[]{this, new Boolean(z)});
        }
        this.mtopProp.priorityFlag = z;
        return this;
    }

    public MtopBusiness showLoginUI(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("b7f2a7a7", new Object[]{this, new Boolean(z)});
        }
        this.showLoginUI = z;
        return this;
    }

    public void startRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb849d4", new Object[]{this});
        } else {
            startRequest(0, null);
        }
    }

    public MtopBusiness streamMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("413f98ea", new Object[]{this, new Boolean(z)});
        }
        this.mtopProp.streamMode = z;
        return this;
    }

    public static MtopBusiness build(Mtop mtop, IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("ef8e209a", new Object[]{mtop, iMTOPDataObject}) : build(mtop, iMTOPDataObject, (String) null);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness addCacheKeyParamBlackList(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("fceb68ae", new Object[]{this, list}) : (MtopBusiness) super.addCacheKeyParamBlackList(list);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness addHttpQueryParameter(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("736174cf", new Object[]{this, str, str2}) : (MtopBusiness) super.addHttpQueryParameter(str, str2);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    public MtopBusiness addListener(MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("2e90debf", new Object[]{this, mtopListener});
        }
        this.listener = mtopListener;
        return this;
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness addMteeUa(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("fb65b0cf", new Object[]{this, str}) : (MtopBusiness) super.addMteeUa(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness addOpenApiParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("7de09de4", new Object[]{this, str, str2}) : (MtopBusiness) super.addOpenApiParams(str, str2);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness allowSwitchToPOST(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("371ca57f", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.allowSwitchToPOST(z);
    }

    public void cancelRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8a20bc", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, this.seqNo, getRequestLogInfo("cancelRequest.", this));
        }
        this.isCancelled = true;
        ApiID apiID = this.apiID;
        if (apiID != null) {
            try {
                apiID.cancelApiCall();
            } catch (Throwable th) {
                TBSdkLog.w(TAG, this.seqNo, getRequestLogInfo("cancelRequest failed.", this), th);
            }
        }
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness enableProgressListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("ff9455e9", new Object[]{this}) : (MtopBusiness) super.enableProgressListener();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness forceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("736b1d1c", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.forceCellular(z);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness forceRefreshCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("e3ce45db", new Object[]{this}) : (MtopBusiness) super.forceRefreshCache();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness handler(Handler handler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("acebdcd3", new Object[]{this, handler}) : (MtopBusiness) super.handler(handler);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness headers(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("68fe911c", new Object[]{this, map}) : (MtopBusiness) super.headers(map);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness prefetchComparator(MtopPrefetch.IPrefetchComparator iPrefetchComparator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("5ef9f610", new Object[]{this, iPrefetchComparator}) : (MtopBusiness) super.prefetchComparator(iPrefetchComparator);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness prefetchMode(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("e1de652", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.prefetchMode(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness protocol(ProtocolEnum protocolEnum) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("d01c6ee0", new Object[]{this, protocolEnum}) : (MtopBusiness) super.protocol(protocolEnum);
    }

    public MtopBusiness registerListener(IRemoteListener iRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("8cd91a0b", new Object[]{this, iRemoteListener});
        }
        this.listener = iRemoteListener;
        return this;
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness reqContext(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("18e0e560", new Object[]{this, obj}) : (MtopBusiness) super.reqContext(obj);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness reqMethod(MethodEnum methodEnum) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("8a66a042", new Object[]{this, methodEnum}) : (MtopBusiness) super.reqMethod(methodEnum);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness retryTime(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("38089dad", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.retryTime(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness securitySignDegraded(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("6625af12", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.securitySignDegraded(z);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setBizTopic(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("19d1e525", new Object[]{this, str}) : (MtopBusiness) super.setBizTopic(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setCacheControlNoCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("25ba1d09", new Object[]{this}) : (MtopBusiness) super.setCacheControlNoCache();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setConnectionTimeoutMilliSecond(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("99241598", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.setConnectionTimeoutMilliSecond(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setJsonType(JsonTypeEnum jsonTypeEnum) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("e1a60f5e", new Object[]{this, jsonTypeEnum}) : (MtopBusiness) super.setJsonType(jsonTypeEnum);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setNetInfo(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("314a4541", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.setNetInfo(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setOpenTracingContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("314275cf", new Object[]{this, map}) : (MtopBusiness) super.setOpenTracingContext(map);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setPTraceId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("ffd27cd1", new Object[]{this, str}) : (MtopBusiness) super.setPTraceId(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setPageIndex(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("34e50959", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.setPageIndex(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setPageName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("d23ab307", new Object[]{this, str}) : (MtopBusiness) super.setPageName(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("696a49e5", new Object[]{this, str}) : (MtopBusiness) super.setPageUrl(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setReqAppKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("5ae4e73f", new Object[]{this, str, str2}) : (MtopBusiness) super.setReqAppKey(str, str2);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setReqBizExt(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("a4d8acf9", new Object[]{this, str}) : (MtopBusiness) super.setReqBizExt(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setReqSource(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("5af74c2f", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.setReqSource(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setReqUserId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("72011dc1", new Object[]{this, str}) : (MtopBusiness) super.setReqUserId(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setSocketTimeoutMilliSecond(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("86bcded", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.setSocketTimeoutMilliSecond(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setTraceId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("93fd5505", new Object[]{this, str}) : (MtopBusiness) super.setTraceId(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setUnitStrategy(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("c02fcc4a", new Object[]{this, str}) : (MtopBusiness) super.setUnitStrategy(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setUserInfo(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("5a536188", new Object[]{this, str}) : (MtopBusiness) super.setUserInfo(str);
    }

    public void startRequest(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf6fe9", new Object[]{this, cls});
        } else {
            startRequest(0, cls);
        }
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness supportStreamJson(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("b8e6395e", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.supportStreamJson(z);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness supportZstdDictionary(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("69e78035", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.supportZstdDictionary(z);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopResponse syncRequest() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("bac48c0", new Object[]{this});
        }
        if (this.mtopProp.streamMode) {
            TBSdkLog.e(TAG, this.seqNo, "Streaming requests do not support synchronous requests");
            return null;
        }
        MtopRequest mtopRequest = this.request;
        if (mtopRequest != null) {
            str = mtopRequest.getKey();
        } else {
            str = "";
        }
        if (MtopUtils.isMainThread()) {
            TBSdkLog.e(TAG, this.seqNo, "do syncRequest in UI main thread!");
        }
        this.syncRequestFlag = true;
        if (this.listener == null) {
            this.listener = new IRemoteBaseListener() { // from class: com.taobao.tao.remotebusiness.MtopBusiness.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    }
                }
            };
        }
        startRequest();
        synchronized (this.listener) {
            try {
                if (this.mtopResponse == null) {
                    this.listener.wait(60000L);
                }
            } catch (InterruptedException unused) {
                String str2 = this.seqNo;
                TBSdkLog.e(TAG, str2, "syncRequest InterruptedException. apiKey=" + str);
            } catch (Exception unused2) {
                String str3 = this.seqNo;
                TBSdkLog.e(TAG, str3, "syncRequest do wait Exception. apiKey=" + str);
            }
        }
        if (this.mtopResponse == null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                String str4 = this.seqNo;
                TBSdkLog.w(TAG, str4, "syncRequest timeout. apiKey=" + str);
            }
            cancelRequest();
        }
        MtopResponse mtopResponse = this.mtopResponse;
        return mtopResponse != null ? mtopResponse : handleAsyncTimeoutException();
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness ttid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("eed72b88", new Object[]{this, str}) : (MtopBusiness) super.ttid(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness upstreamCompress(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("620e0204", new Object[]{this, new Boolean(z)}) : (MtopBusiness) super.upstreamCompress(z);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness useCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("e5c56c72", new Object[]{this}) : (MtopBusiness) super.useCache();
    }

    @Deprecated
    public static MtopBusiness build(IMTOPDataObject iMTOPDataObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("7ce57bb7", new Object[]{iMTOPDataObject, str}) : build(Mtop.instance((Context) null, str), iMTOPDataObject, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:25:0x0090, B:27:0x0094, B:30:0x00a2, B:31:0x00ab, B:33:0x00b1, B:35:0x00bb, B:37:0x00c3), top: B:47:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void doErrorCallback(mtopsdk.mtop.domain.MtopResponse r6, com.taobao.tao.remotebusiness.IRemoteListener r7) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.remotebusiness.MtopBusiness.doErrorCallback(mtopsdk.mtop.domain.MtopResponse, com.taobao.tao.remotebusiness.IRemoteListener):void");
    }

    public void doFinish(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        String str;
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b6150", new Object[]{this, mtopResponse, baseOutDo});
            return;
        }
        if (this.syncRequestFlag) {
            this.mtopResponse = mtopResponse;
            synchronized (this.listener) {
                try {
                    this.listener.notify();
                } catch (Exception e) {
                    String str3 = this.seqNo;
                    StringBuilder sb = new StringBuilder("[doFinish]syncRequest do notify Exception. apiKey=");
                    if (mtopResponse != null) {
                        str2 = mtopResponse.getFullKey();
                    } else {
                        str2 = "";
                    }
                    sb.append(str2);
                    TBSdkLog.e(TAG, str3, sb.toString(), e);
                }
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("doFinish request=");
            sb2.append(this.request);
            if (mtopResponse != null) {
                sb2.append(", retCode=");
                sb2.append(mtopResponse.getRetCode());
            }
            TBSdkLog.i(TAG, this.seqNo, sb2.toString());
        }
        if (this.isCancelled) {
            TBSdkLog.w(TAG, this.seqNo, "request is cancelled,don't callback listener.");
            return;
        }
        MtopListener mtopListener = this.listener;
        if (!(mtopListener instanceof IRemoteListener)) {
            String str4 = this.seqNo;
            StringBuilder sb3 = new StringBuilder("listener did't implement IRemoteBaseListener.apiKey=");
            if (mtopResponse != null) {
                str = mtopResponse.getFullKey();
            } else {
                str = "";
            }
            sb3.append(str);
            TBSdkLog.e(TAG, str4, sb3.toString());
            return;
        }
        IRemoteListener iRemoteListener = (IRemoteListener) mtopListener;
        if (mtopResponse != null && mtopResponse.isApiSuccess()) {
            long currentTimeMillis = this.stat.currentTimeMillis();
            MtopStatistics mtopStatistics = this.stat;
            mtopStatistics.callbackPocTime = currentTimeMillis - mtopStatistics.netSendEndTime;
            mtopStatistics.allTime = currentTimeMillis - mtopStatistics.startTime;
            if (this.mtopContext.d.handler == null) {
                z = false;
            }
            mtopStatistics.handler = z;
            try {
                iRemoteListener.onSuccess(this.requestType, mtopResponse, baseOutDo, getReqContext());
                if (MtopMonitor.getInstance() != null) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put(IMtopMonitor.DATA_RESPONSE, mtopResponse.getApi());
                    MtopMonitor.getInstance().onCommit(IMtopMonitor.MtopMonitorType.TYPE_CALLBACK, hashMap);
                }
            } catch (Throwable th) {
                TBSdkLog.e(TAG, this.seqNo, "listener onSuccess callback error", th);
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, this.seqNo, "listener onSuccess callback.");
            }
        } else if (!this.isCached || this.isErrorNotifyAfterCache) {
            doErrorCallback(mtopResponse, iRemoteListener);
        } else {
            TBSdkLog.i(TAG, this.seqNo, "listener onCached callback,doNothing in doFinish()");
        }
    }

    public void doStreamFinish(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
        ApiID apiID;
        ApiID apiID2;
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7a9df0", new Object[]{this, mtopResponse, baseOutDo});
        } else if (this.isCancelled) {
            TBSdkLog.w(TAG, this.seqNo, "request is cancelled,don't callback listener.");
        } else if (!(this.listener instanceof IMtopStreamListener)) {
            String str2 = this.seqNo;
            StringBuilder sb = new StringBuilder("listener did't implement IMtopStreamListener.apiKey=");
            if (mtopResponse != null) {
                str = mtopResponse.getFullKey();
            } else {
                str = "";
            }
            sb.append(str);
            TBSdkLog.e(TAG, str2, sb.toString());
        } else {
            TBSdkLog.d(TAG, this.mtopContext.h, "[doStreamFinish] callback");
            IMtopStreamListener iMtopStreamListener = (IMtopStreamListener) this.listener;
            if (mtopResponse != null) {
                try {
                    mtopResponse.setAllowParseJson(this.allowParseJson);
                } catch (Throwable th) {
                    TBSdkLog.e(TAG, this.seqNo, "doStreamFinish listener cancel error", th);
                    return;
                }
            }
            if (mtopResponse == null || !mtopResponse.isApiSuccess()) {
                if (!this.mForbidStreamExceptionCallback && mtopResponse != null && mtopResponse.getStreamModeData() == null) {
                    TBSdkLog.e(TAG, this.seqNo, "stream listener degraded onReceiveData error callback.");
                    iMtopStreamListener.onReceiveData(tpq.c(mtopResponse), baseOutDo, this.requestType, getReqContext());
                }
                iMtopStreamListener.onError(tpq.a(mtopResponse), this.requestType, getReqContext());
                MtopResponse mtopResponse2 = this.mtopResponse;
                if (mtopResponse2 != null && mtopResponse2.getResponseCode() == -9 && (apiID = this.mtopContext.f) != null && apiID.getCall() != null) {
                    this.mtopContext.f.getCall().cancel();
                    return;
                }
                return;
            }
            long currentTimeMillis = this.stat.currentTimeMillis();
            MtopStatistics mtopStatistics = this.stat;
            mtopStatistics.callbackPocTime = currentTimeMillis - mtopStatistics.netSendEndTime;
            mtopStatistics.allTime = currentTimeMillis - mtopStatistics.startTime;
            if (this.mtopContext.d.handler == null) {
                z = false;
            }
            mtopStatistics.handler = z;
            if (mtopResponse.getStreamModeData() == null) {
                iMtopStreamListener.onReceiveData(tpq.c(mtopResponse), baseOutDo, this.requestType, getReqContext());
                TBSdkLog.e(TAG, this.seqNo, "stream listener degraded onReceiveData success callback.");
            }
            iMtopStreamListener.onFinish(tpq.b(mtopResponse), this.requestType, getReqContext());
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, this.seqNo, "listener onSuccess callback.");
            }
            try {
                MtopResponse mtopResponse3 = this.mtopResponse;
                if (mtopResponse3 != null && mtopResponse3.getResponseCode() == -9 && (apiID2 = this.mtopContext.f) != null && apiID2.getCall() != null) {
                    this.mtopContext.f.getCall().cancel();
                }
            } catch (Throwable th2) {
                TBSdkLog.e(TAG, this.seqNo, "doStreamFinish listener cancel error", th2);
            }
        }
    }

    public MtopBusiness registerListener(IMtopStreamListener iMtopStreamListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("7ad10927", new Object[]{this, iMtopStreamListener});
        }
        this.listener = iMtopStreamListener;
        return this;
    }

    public void retryRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03963ce", new Object[]{this});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, this.seqNo, getRequestLogInfo("retryRequest.", this));
        }
        if (this.retryTime >= 3) {
            this.retryTime = 0;
            doFinish(this.mtopContext.c, null);
            return;
        }
        cancelRequest();
        startRequest(this.requestType, this.clazz);
        this.retryTime++;
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    public MtopBusiness setBizId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("415bac64", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.setBizId(i);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setCustomDomain(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("214d758c", new Object[]{this, str}) : (MtopBusiness) super.setCustomDomain(str);
    }

    public MtopBusiness setSocketTimeoutMilliSecond(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("80f94838", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        mtopNetworkProp.streamFirstStageReadTimeMills = i;
        mtopNetworkProp.streamSubStageReadTimeMills = i2;
        return this;
    }

    public void startRequest(int i, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f537e76e", new Object[]{this, new Integer(i), cls});
        } else if (this.request == null) {
            TBSdkLog.e(TAG, this.seqNo, "MtopRequest is null!");
        } else {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                String str = this.seqNo;
                TBSdkLog.i(TAG, str, "startRequest " + this.request);
            }
            boolean z = this.mtopProp.streamMode;
            if ((!z || (this.listener instanceof IMtopStreamListener)) && (z || !(this.listener instanceof IMtopStreamListener))) {
                this.reqStartTime = System.currentTimeMillis();
                this.isCancelled = false;
                this.isCached = false;
                this.clazz = cls;
                setClazz(cls);
                this.requestType = i;
                Object obj = this.requestContext;
                if (obj != null) {
                    reqContext(obj);
                }
                MtopListener mtopListener = this.listener;
                if (mtopListener != null && !this.isCancelled) {
                    super.addListener(k5j.a(this, mtopListener));
                }
                mtopCommitStatData(false);
                this.sendStartTime = System.currentTimeMillis();
                this.apiID = super.asyncRequest();
                return;
            }
            TBSdkLog.e(TAG, this.seqNo, "listener not match streamMode");
        }
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness useWua() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("81339651", new Object[]{this}) : (MtopBusiness) super.useWua();
    }

    @Deprecated
    public static MtopBusiness build(IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("cb74a901", new Object[]{iMTOPDataObject}) : build(Mtop.instance(null), iMTOPDataObject);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness prefetch(long j, List<String> list, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("eae0115c", new Object[]{this, new Long(j), list, iPrefetchCallback}) : (MtopBusiness) super.prefetch(j, list, iPrefetchCallback);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setBizId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("2e32b6f7", new Object[]{this, str}) : (MtopBusiness) super.setBizId(str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness setCustomDomain(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("6029eff8", new Object[]{this, str, str2, str3}) : (MtopBusiness) super.setCustomDomain(str, str2, str3);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    @Deprecated
    public MtopBusiness useWua(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("212a8c54", new Object[]{this, new Integer(i)}) : (MtopBusiness) super.useWua(i);
    }

    public static MtopBusiness build(Mtop mtop, MtopRequest mtopRequest, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("18cb89d", new Object[]{mtop, mtopRequest, str}) : new MtopBusiness(mtop, mtopRequest, str);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness prefetch(long j, MtopPrefetch.IPrefetchCallback iPrefetchCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("872a38ad", new Object[]{this, new Long(j), iPrefetchCallback}) : (MtopBusiness) super.prefetch(j, iPrefetchCallback);
    }

    public static MtopBusiness build(Mtop mtop, MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("71977367", new Object[]{mtop, mtopRequest}) : build(mtop, mtopRequest, (String) null);
    }

    @Override // mtopsdk.mtop.intf.MtopBuilder
    public MtopBusiness prefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("bc1c136", new Object[]{this}) : (MtopBusiness) super.prefetch(0L, (MtopPrefetch.IPrefetchCallback) null);
    }

    @Deprecated
    public static MtopBusiness build(MtopRequest mtopRequest, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("caad00c4", new Object[]{mtopRequest, str}) : build(Mtop.instance((Context) null, str), mtopRequest, str);
    }

    @Deprecated
    public static MtopBusiness build(MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBusiness) ipChange.ipc$dispatch("b68474e", new Object[]{mtopRequest}) : build(Mtop.instance(null), mtopRequest, (String) null);
    }

    public MtopBusiness setNeedAuth(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("28d94b1b", new Object[]{this, str, str2, new Boolean(z)});
        }
        MtopNetworkProp mtopNetworkProp = this.mtopProp;
        mtopNetworkProp.apiType = ApiTypeEnum.ISV_OPEN_API;
        mtopNetworkProp.isInnerOpen = true;
        if (StringUtils.isNotBlank(str)) {
            this.mtopProp.openAppKey = str;
        }
        this.authParam = str2;
        this.showAuthUI = z;
        this.needAuth = true;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("[setNeedAuth] openAppKey=");
            sb.append(str);
            sb.append(", bizParam=");
            sb.append(str2);
            sb.append(", showAuthUI=");
            sb.append(z);
            sb.append(", needAuth=");
            sb.append(this.needAuth);
            sb.append(", isInnerOpen=true");
            TBSdkLog.d(TAG, this.seqNo, sb.toString());
        }
        return this;
    }

    public MtopBusiness(Mtop mtop, MtopRequest mtopRequest, String str) {
        super(mtop, mtopRequest, str);
    }
}
