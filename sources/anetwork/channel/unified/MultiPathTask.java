package anetwork.channel.unified;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.NoAvailStrategyException;
import anet.channel.NoSocketPermissionInBgException;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionParamStat;
import anet.channel.WifiForceCellException;
import anet.channel.assist.ICapability;
import anet.channel.assist.ISysNetworkCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.SessionType;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.HttpSession;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.entity.RequestConfig;
import anetwork.channel.interceptor.Callback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MultiPathTask implements IUnifiedTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.MultiPathTask";
    private String bizReqId;
    private String f_refer;
    private RequestContext rc;
    private Request req;
    private volatile boolean isCanceled = false;
    public volatile Cancelable cancelable = null;
    private int contentLength = 0;
    private int dataChunkIndex = 0;
    private AtomicBoolean responseReturn = new AtomicBoolean(false);
    private AtomicBoolean isVpnFastDegradeTask = new AtomicBoolean(false);

    static {
        t2o.a(607126133);
        t2o.a(607126132);
    }

    public MultiPathTask(RequestContext requestContext) {
        this.rc = requestContext;
        this.req = requestContext.config.getAwcnRequest();
        this.f_refer = requestContext.config.getHeaders().get("f-refer");
        this.bizReqId = requestContext.config.bizReqId;
    }

    public static /* synthetic */ void access$000(MultiPathTask multiPathTask, int i, Map map, Request request, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9bd99", new Object[]{multiPathTask, new Integer(i), map, request, requestStatistic});
        } else {
            multiPathTask.onResponseCodeCallBack(i, map, request, requestStatistic);
        }
    }

    public static /* synthetic */ void access$100(MultiPathTask multiPathTask, ByteArray byteArray, boolean z, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d182b6a4", new Object[]{multiPathTask, byteArray, new Boolean(z), requestStatistic});
        } else {
            multiPathTask.onDataReceiveCallBack(byteArray, z, requestStatistic);
        }
    }

    public static /* synthetic */ void access$200(MultiPathTask multiPathTask, int i, String str, RequestStatistic requestStatistic, Session session, Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b476a2", new Object[]{multiPathTask, new Integer(i), str, requestStatistic, session, request});
        } else {
            multiPathTask.onFinishCallBack(i, str, requestStatistic, session, request);
        }
    }

    public static HttpUrl checkCName(HttpUrl httpUrl, RequestContext requestContext) {
        HttpUrl parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrl) ipChange.ipc$dispatch("489847f3", new Object[]{httpUrl, requestContext});
        }
        String str = requestContext.config.getHeaders().get(HttpConstant.X_HOST_CNAME);
        return (TextUtils.isEmpty(str) || (parse = HttpUrl.parse(httpUrl.urlString().replaceFirst(httpUrl.host(), str))) == null) ? httpUrl : parse;
    }

    private void onDataReceiveCallBack(ByteArray byteArray, boolean z, RequestStatistic requestStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("982fa3db", new Object[]{this, byteArray, new Boolean(z), requestStatistic});
        } else if (this.responseReturn.get() && !this.isCanceled && !this.rc.isDone.get()) {
            int i = this.dataChunkIndex + 1;
            this.dataChunkIndex = i;
            Callback callback = this.rc.callback;
            if (callback != null) {
                callback.onDataReceiveSize(i, this.contentLength, byteArray);
            }
            if (z) {
                requestStatistic.setNetworkChangeRequest(requestStatistic.fisrtStart, System.currentTimeMillis(), GlobalAppRuntimeInfo.NetworkChangeRequestStatus.YES_SUCCESS);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private anet.channel.request.Request preProcessRequest(anet.channel.request.Request r19) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.unified.MultiPathTask.preProcessRequest(anet.channel.request.Request):anet.channel.request.Request");
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.isCanceled = true;
        if (this.cancelable != null) {
            this.cancelable.cancel();
        }
    }

    public boolean isCanceled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83e706ee", new Object[]{this})).booleanValue();
        }
        return this.isCanceled;
    }

    public boolean isResponseReturn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38218fa6", new Object[]{this})).booleanValue();
        }
        return this.responseReturn.get();
    }

    public void setVpnFastDegradeTaskFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608d5cb4", new Object[]{this, new Boolean(z)});
        } else {
            this.isVpnFastDegradeTask.set(z);
        }
    }

    private Session tryGetSession() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("e3d315ac", new Object[]{this});
        }
        SessionCenter sessionCenter = GlobalAppRuntimeInfo.getSessionCenter();
        HttpUrl httpUrl = this.rc.config.getHttpUrl();
        boolean containsNonDefaultPort = httpUrl.containsNonDefaultPort();
        if (AwcnConfig.isAllowRetryUseLongLinkEnable() && AwcnConfig.isHostInAllowRetryUseLongLinkWhiteList(this.rc.config.getHost()) && this.rc.config.currentRetryTimes != 0) {
            z = true;
        }
        this.rc.config.rs.isAllowLongRetry = z;
        if (this.rc.config.requestType != 1 || !NetworkConfigCenter.isSpdyEnabled()) {
            return null;
        }
        if (((!z || this.rc.config.rs.retryType == 0) && this.rc.config.currentRetryTimes != 0) || containsNonDefaultPort) {
            return null;
        }
        HttpUrl checkCName = checkCName(httpUrl, this.rc);
        try {
            RequestContext requestContext = this.rc;
            String str = requestContext.seqNum;
            RequestConfig requestConfig = requestContext.config;
            Session throwsException = sessionCenter.getThrowsException(checkCName, SessionType.LONG_LINK, 0L, new SessionParamStat(str, z, requestConfig.rs.retryType, requestConfig.isForceCellRequestEnable()));
            if (throwsException != null) {
                try {
                    this.rc.config.rs.isPreSession = true;
                } catch (Exception unused) {
                }
            }
            return throwsException;
        } catch (NoAvailStrategyException | Exception unused2) {
            return null;
        } catch (NoSocketPermissionInBgException unused3) {
            throw new NoSocketPermissionInBgException("no socket permissions in background");
        } catch (WifiForceCellException unused4) {
            throw new WifiForceCellException("force cell not url white list!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        final Session session;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if ((!this.isVpnFastDegradeTask.get() || GlobalAppRuntimeInfo.isStatusChangedRequest(this.rc.seqNum)) && !this.isCanceled && !this.rc.isDone.get() && (context = GlobalAppRuntimeInfo.getContext()) != null) {
            if (this.isVpnFastDegradeTask.get()) {
                ALog.e(TAG, "[ap] start VpnFastDegradeTask request.", this.rc.seqNum, " bizReqId", this.bizReqId);
            } else {
                ALog.e(TAG, "[ap] start multi path request.", this.rc.seqNum, " bizReqId", this.bizReqId);
                GlobalAppRuntimeInfo.showUserToast();
            }
            final RequestStatistic requestStatistic = this.rc.config.rs;
            long currentTimeMillis = System.currentTimeMillis();
            final Request preProcessRequest = preProcessRequest(this.req);
            requestStatistic.reqStart = System.currentTimeMillis();
            requestStatistic.reqPreProcessTime = requestStatistic.reqStart - currentTimeMillis;
            HttpUrl httpUrl = this.rc.config.getHttpUrl();
            requestStatistic.bizReqId = this.bizReqId;
            if (this.isVpnFastDegradeTask.get()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                try {
                    session = tryGetSession();
                    if (session == null) {
                        String concatString = StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host());
                        HttpSession httpSession = new HttpSession(context, new ConnInfo(concatString, this.rc.seqNum + "_vpnFast", null));
                        requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis2;
                        requestStatistic.waitConnectStat = 1;
                        ALog.e(TAG, "[ap] VpnFastDegradeTask HttpSession session=" + httpSession.mSeq, this.rc.seqNum, " bizReqId", this.bizReqId);
                        session = httpSession;
                    } else {
                        requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis2;
                        ALog.e(TAG, "[ap] VpnFastDegradeTask tryGetSession=" + session.mSeq, this.rc.seqNum, " bizReqId", this.bizReqId);
                    }
                } catch (NoSocketPermissionInBgException unused) {
                    ALog.e(TAG, "[bg_socket_opt] send fail! no socket read and write permissions in the background！", this.rc.seqNum, "url", this.rc.config.getHttpUrl());
                    requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis2;
                    this.rc.config.commitStatic(this.rc.callback, requestStatistic, -212, "bg_socket");
                    return;
                } catch (WifiForceCellException unused2) {
                    ALog.e(TAG, "[force cellular] send request failed! set params fail！url not in white list! 1", this.rc.seqNum, "url", this.rc.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                    this.rc.config.commitStatic(this.rc.callback, requestStatistic, -109, "force_cellular");
                    return;
                }
            } else {
                String concatString2 = StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host());
                session = new HttpSession(context, new ConnInfo(concatString2, this.rc.seqNum + "_mc", null));
                session.setForceCellular(true);
                requestStatistic.isPreSession = true;
                requestStatistic.waitConnectStat = 1;
            }
            requestStatistic.isSetForceCell = session.getForceCellular();
            this.cancelable = session.request(preProcessRequest, new RequestCb() { // from class: anetwork.channel.unified.MultiPathTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.RequestCb
                public void onDataReceive(ByteArray byteArray, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                    } else {
                        MultiPathTask.access$100(MultiPathTask.this, byteArray, z, requestStatistic);
                    }
                }

                @Override // anet.channel.RequestCb
                public void onFinish(int i, String str, RequestStatistic requestStatistic2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic2});
                    } else {
                        MultiPathTask.access$200(MultiPathTask.this, i, str, requestStatistic2, session, preProcessRequest);
                    }
                }

                @Override // anet.channel.RequestCb
                public void onResponseCode(int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                    } else {
                        MultiPathTask.access$000(MultiPathTask.this, i, map, preProcessRequest, requestStatistic);
                    }
                }
            });
        }
    }

    private void onResponseCodeCallBack(int i, Map<String, List<String>> map, Request request, RequestStatistic requestStatistic) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850bf56e", new Object[]{this, new Integer(i), map, request, requestStatistic});
            return;
        }
        if (AwcnConfig.isVpnOptOpened()) {
            NetworkTask networkTask = (NetworkTask) this.rc.runningTask;
            if (this.isVpnFastDegradeTask.get()) {
                if ((this.rc.multiPathTask != null && this.rc.multiPathTask.isResponseReturn()) || (networkTask != null && networkTask.isResponseReturn())) {
                    ALog.e(TAG, "[ap] onResponseCode, end vpnFastDegrade task! other task already return", request.getSeq(), " bizReqId", this.bizReqId);
                    return;
                } else if (!this.rc.isDone.get() && !this.isCanceled) {
                    if (i != 431) {
                        long j = requestStatistic.customCookieLen;
                        if (j == 0 || requestStatistic.cookieLen != j) {
                            ALog.e(TAG, "[ap] onResponseCode, vpnFastDegrade task already return! cancel other task", request.getSeq(), " bizReqId", this.bizReqId);
                            this.rc.cancelMultiPathTask();
                            requestStatistic.useVpnFastDegrade = 1;
                            z = true;
                        }
                    }
                    ALog.e(TAG, "[ap] onResponseCode, vpnFastDegrade task already return! cancel other task", request.getSeq(), " bizReqId", this.bizReqId, "header", request.getHeaders());
                    this.rc.cancelMultiPathTask();
                    requestStatistic.useVpnFastDegrade = 1;
                    z = true;
                } else {
                    return;
                }
            } else if ((this.rc.vpnFastDegradeTask != null && this.rc.vpnFastDegradeTask.isResponseReturn()) || (networkTask != null && networkTask.isResponseReturn())) {
                ALog.e(TAG, "[ap] onResponseCode, end multiPath task! other task already return", request.getSeq(), " bizReqId", this.bizReqId);
                return;
            } else if (!this.rc.isDone.get() && !this.isCanceled) {
                if (i != 431) {
                    long j2 = requestStatistic.customCookieLen;
                    if (j2 == 0 || requestStatistic.cookieLen != j2) {
                        z = true;
                        ALog.e(TAG, "[ap] onResponseCode, multiPath task already return! cancel other task", request.getSeq(), " bizReqId", this.bizReqId);
                        this.rc.cancelVpnFastDegradeTask();
                        int i2 = z ? 1 : 0;
                        int i3 = z ? 1 : 0;
                        int i4 = z ? 1 : 0;
                        int i5 = z ? 1 : 0;
                        requestStatistic.useMultiPath = i2;
                    }
                }
                z = true;
                ALog.e(TAG, "[ap] onResponseCode, multiPath task already return! cancel other task", request.getSeq(), " bizReqId", this.bizReqId, "header", request.getHeaders());
                this.rc.cancelVpnFastDegradeTask();
                int i22 = z ? 1 : 0;
                int i32 = z ? 1 : 0;
                int i42 = z ? 1 : 0;
                int i52 = z ? 1 : 0;
                requestStatistic.useMultiPath = i22;
            } else {
                return;
            }
            this.rc.cancelRunningTask();
            this.responseReturn.set(z);
        } else if (!this.rc.isDone.get() && !this.isCanceled) {
            this.responseReturn.set(true);
            requestStatistic.useMultiPath = 1;
        } else {
            return;
        }
        this.rc.cancelTimeoutTask();
        CookieManager.setCookie(this.rc.config.getHost(), this.rc.config.getUrlString(), map);
        this.contentLength = HttpHelper.parseContentLength(map);
        if (requestStatistic.requestBodyCompressRet == 1) {
            map.put(HttpConstant.X_UPLINK_ENCODE, Arrays.asList(requestStatistic.requestBodyCompressType));
        }
        Callback callback = this.rc.callback;
        if (callback != null) {
            callback.onResponseCode(i, map);
        }
    }

    private void onFinishCallBack(int i, String str, RequestStatistic requestStatistic, Session session, Request request) {
        String str2;
        String str3;
        ICapability capability;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0512130", new Object[]{this, new Integer(i), str, requestStatistic, session, request});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.responseReturn.get() && !this.isCanceled) {
            if (!this.isVpnFastDegradeTask.get() && ((i == -406 || i == -405) && (capability = NetworkAssist.getAssistManager().getCapability(3)) != null && capability.isEnable())) {
                ((ISysNetworkCapability) capability).recoverCellularStatus();
            }
            if (!this.rc.isDone.getAndSet(true)) {
                if (ALog.isPrintLog(2)) {
                    ALog.i(TAG, "[onFinish]", this.rc.seqNum, "code", Integer.valueOf(i), "msg", str);
                }
                if (this.isVpnFastDegradeTask.get()) {
                    str2 = "[ap] isVpnFastDegradeTask";
                } else {
                    str2 = "[ap] isMultiPathTask";
                }
                ALog.e(TAG, str2 + "[onFinish] code" + i, this.rc.seqNum, " bizReqId", this.bizReqId);
                requestStatistic.deprecatedSessionType = session.getDeprecatedSessionType();
                requestStatistic.secondRefreshOpt = session.secondRefreshOpt;
                if (currentTimeMillis - GlobalAppRuntimeInfo.getNetworkStatusChangedTime() <= NetworkConfigCenter.getNetworkChangeThresholdTime()) {
                    z = true;
                }
                requestStatistic.isNetworkChangeThresholdTime = z;
                if (!this.isVpnFastDegradeTask.get()) {
                    requestStatistic.useMultiPath = 1;
                } else {
                    requestStatistic.useVpnFastDegrade = 1;
                }
                if (request.getHeaders() != null) {
                    str3 = request.getHeaders().get(HttpConstant.CONTENT_ENCODING);
                } else {
                    str3 = "";
                }
                requestStatistic.reqContentEncode = str3;
                requestStatistic.sessionSeq = session.toString();
                requestStatistic.setConnType(session.getConnType());
                this.rc.cancelTimeoutTask();
                requestStatistic.isDone.set(true);
                if (this.rc.callback != null) {
                    requestStatistic.setNetworkChangeRequest(requestStatistic.fisrtStart, currentTimeMillis, GlobalAppRuntimeInfo.NetworkChangeRequestStatus.YES_FAIL);
                    this.rc.callback.onFinish(new DefaultFinishEvent(i, str, request));
                }
            }
        }
    }
}
