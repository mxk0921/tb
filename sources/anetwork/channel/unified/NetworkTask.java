package anetwork.channel.unified;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.NoAvailStrategyException;
import anet.channel.NoSocketPermissionInBgException;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionGetCallback;
import anet.channel.SessionParamStat;
import anet.channel.WifiForceCellException;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ProtocolType;
import anet.channel.entity.SessionType;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.HttpSession;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.cache.CacheHelper;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.entity.RequestConfig;
import anetwork.channel.interceptor.Callback;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkTask implements IUnifiedTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_RSP_BUFFER_LENGTH = 131072;
    public static final String TAG = "anet.NetworkTask";
    public String bizReqId;
    public Cache cache;
    public Cache.Entry entry;
    public String f_refer;
    public volatile AtomicBoolean isDone;
    public RequestContext rc;
    public ByteArrayOutputStream cacheBuffer = null;
    public volatile Cancelable cancelable = null;
    public volatile boolean isCanceled = false;
    public int contentLength = 0;
    public int dataChunkIndex = 0;
    public boolean isHeaderCallback = false;
    public boolean isDataChuckCallback = false;
    public boolean isForceOkHttpEnabled = false;
    private AtomicBoolean responseReturn = new AtomicBoolean(false);
    public volatile BodyTimeoutChecker bodyTimeoutChecker = null;
    public ResponseBuffer responseBuffer = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class BodyTimeoutChecker implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private volatile long executeTime;
        private volatile boolean isCancelled;

        static {
            t2o.a(607126140);
        }

        private BodyTimeoutChecker() {
            this.executeTime = 0L;
            this.isCancelled = false;
        }

        private void submit(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b9205", new Object[]{this, new Long(j)});
                return;
            }
            this.executeTime = System.currentTimeMillis() + j;
            ThreadPoolExecutorFactory.submitScheduledTask(this, j, TimeUnit.MILLISECONDS);
        }

        public void reSchedule() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd73a171", new Object[]{this});
            } else {
                this.executeTime = System.currentTimeMillis() + NetworkConfigCenter.getMultiPathTriggerTime();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.isCancelled) {
                NetworkTask networkTask = NetworkTask.this;
                if (!networkTask.isHeaderCallback && !networkTask.isDataChuckCallback && !networkTask.isDone.get()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis <= this.executeTime) {
                        submit(this.executeTime - currentTimeMillis);
                        return;
                    }
                    RequestContext requestContext = NetworkTask.this.rc;
                    RequestStatistic requestStatistic = requestContext.config.rs;
                    requestStatistic.bodyTimeout = 1;
                    if (requestStatistic.allowMultiPath == 1 && requestContext.multiPathTask == null) {
                        NetworkTask.this.rc.multiPathTask = new MultiPathTask(NetworkTask.this.rc);
                        ThreadPoolExecutorFactory.submitBackupTask(NetworkTask.this.rc.multiPathTask);
                        NetworkTask networkTask2 = NetworkTask.this;
                        ALog.e(NetworkTask.TAG, "[bodyTimeoutChecker] run multi network task.", networkTask2.rc.seqNum, " bizReqId", networkTask2.bizReqId);
                    }
                }
            }
        }

        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            } else {
                submit(NetworkConfigCenter.getMultiPathTriggerTime());
            }
        }

        public void stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            } else {
                this.isCancelled = true;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ResponseBuffer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public List<ByteArray> bodyBufferList = new ArrayList();
        public int code;
        public Map<String, List<String>> header;

        static {
            t2o.a(607126141);
        }

        public ResponseBuffer(int i, Map<String, List<String>> map) {
            this.code = i;
            this.header = map;
        }

        public int callback(Callback callback, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4bcf849e", new Object[]{this, callback, new Integer(i)})).intValue();
            }
            callback.onResponseCode(this.code, this.header);
            int i2 = 1;
            for (ByteArray byteArray : this.bodyBufferList) {
                callback.onDataReceiveSize(i2, i, byteArray);
                i2++;
            }
            return i2;
        }

        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
                return;
            }
            for (ByteArray byteArray : this.bodyBufferList) {
                byteArray.recycle();
            }
        }
    }

    static {
        t2o.a(607126135);
        t2o.a(607126132);
    }

    public NetworkTask(RequestContext requestContext, Cache cache, Cache.Entry entry) {
        this.cache = null;
        this.entry = null;
        this.f_refer = "other";
        this.isDone = null;
        this.rc = requestContext;
        this.isDone = requestContext.isDone;
        this.cache = cache;
        this.entry = entry;
        this.f_refer = requestContext.config.getHeaders().get("f-refer");
        this.bizReqId = requestContext.config.bizReqId;
    }

    public static /* synthetic */ Session access$000(NetworkTask networkTask, boolean z, Session session, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z2, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("2fb57ed4", new Object[]{networkTask, new Boolean(z), session, sessionCenter, httpUrl, new Boolean(z2), sessionParamStat});
        }
        return networkTask.tryGetHttpSession(z, session, sessionCenter, httpUrl, z2, sessionParamStat);
    }

    public static /* synthetic */ void access$100(NetworkTask networkTask, Session session, Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1352a676", new Object[]{networkTask, session, request});
        } else {
            networkTask.sendRequest(session, request);
        }
    }

    public static /* synthetic */ AtomicBoolean access$200(NetworkTask networkTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("dab664a0", new Object[]{networkTask});
        }
        return networkTask.responseReturn;
    }

    private void sendRequest(final Session session, Request request) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edd9305", new Object[]{this, session, request});
        } else if (session != null && !this.isCanceled) {
            final RequestStatistic requestStatistic = this.rc.config.rs;
            long currentTimeMillis = System.currentTimeMillis();
            final Request preProcessRequest = preProcessRequest(request);
            requestStatistic.reqStart = System.currentTimeMillis();
            requestStatistic.reqPreProcessTime = requestStatistic.reqStart - currentTimeMillis;
            IFullTraceAnalysisV3 v3Instance = AnalysisFactory.getV3Instance();
            IFullTraceAnalysisV3.ISpan iSpan = requestStatistic.span;
            v3Instance.log(iSpan, "netReqProcessStart", "bizReqId=" + this.bizReqId);
            boolean forceCellular = session.getForceCellular();
            requestStatistic.isSetForceCell = forceCellular;
            if (forceCellular) {
                requestStatistic.setConnType(session.getConnType());
            }
            requestStatistic.isSupportStreaming = AwcnConfig.isSupportStreamingParserList(preProcessRequest.getUrlString());
            this.cancelable = session.request(preProcessRequest, new RequestCb() { // from class: anetwork.channel.unified.NetworkTask.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.RequestCb
                public void onDataReceive(ByteArray byteArray, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                    } else if ((NetworkTask.this.rc.multiPathTask != null && NetworkTask.this.rc.multiPathTask.isResponseReturn()) || (NetworkTask.this.rc.vpnFastDegradeTask != null && NetworkTask.this.rc.vpnFastDegradeTask.isResponseReturn())) {
                        ALog.e(NetworkTask.TAG, "[ap] onDataReceive, other task already return!", preProcessRequest.getSeq(), " bizReqId", NetworkTask.this.bizReqId);
                    } else if (!NetworkTask.this.isDone.get()) {
                        if (NetworkTask.this.bodyTimeoutChecker != null) {
                            NetworkTask.this.bodyTimeoutChecker.reSchedule();
                        }
                        if (NetworkTask.this.dataChunkIndex == 0) {
                            requestStatistic.firstChunkTime = System.currentTimeMillis();
                            NetworkTask networkTask = NetworkTask.this;
                            ALog.e(NetworkTask.TAG, "[onDataReceive] receive first data chunk!", networkTask.rc.seqNum, " bizReqId", networkTask.bizReqId);
                        }
                        if (z) {
                            NetworkTask networkTask2 = NetworkTask.this;
                            ALog.i(NetworkTask.TAG, "[onDataReceive] receive last data chunk!", networkTask2.rc.seqNum, " bizReqId", networkTask2.bizReqId);
                        }
                        NetworkTask networkTask3 = NetworkTask.this;
                        networkTask3.dataChunkIndex++;
                        try {
                            if (networkTask3.responseBuffer != null) {
                                if (byteArray.getDataLength() != 0) {
                                    NetworkTask.this.responseBuffer.bodyBufferList.add(byteArray);
                                }
                                if (requestStatistic.recDataSize > 131072 || z) {
                                    NetworkTask networkTask4 = NetworkTask.this;
                                    networkTask4.dataChunkIndex = networkTask4.responseBuffer.callback(networkTask4.rc.callback, networkTask4.contentLength);
                                    NetworkTask networkTask5 = NetworkTask.this;
                                    networkTask5.isHeaderCallback = true;
                                    networkTask5.isDataChuckCallback = networkTask5.dataChunkIndex > 1;
                                    networkTask5.responseBuffer = null;
                                }
                            } else {
                                if (byteArray.getDataLength() != 0) {
                                    NetworkTask networkTask6 = NetworkTask.this;
                                    networkTask6.rc.callback.onDataReceiveSize(networkTask6.dataChunkIndex, networkTask6.contentLength, byteArray);
                                }
                                NetworkTask.this.isDataChuckCallback = true;
                            }
                            if (NetworkTask.this.cacheBuffer != null) {
                                if (byteArray.getDataLength() != 0) {
                                    NetworkTask.this.cacheBuffer.write(byteArray.getBuffer(), 0, byteArray.getDataLength());
                                }
                                if (z) {
                                    String urlString = NetworkTask.this.rc.config.getUrlString();
                                    NetworkTask networkTask7 = NetworkTask.this;
                                    networkTask7.entry.data = networkTask7.cacheBuffer.toByteArray();
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    NetworkTask networkTask8 = NetworkTask.this;
                                    networkTask8.cache.put(urlString, networkTask8.entry);
                                    ALog.i(NetworkTask.TAG, "write cache", NetworkTask.this.rc.seqNum, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), "size", Integer.valueOf(NetworkTask.this.entry.data.length), "key", urlString, " bizReqId", NetworkTask.this.bizReqId);
                                }
                            }
                            if (z) {
                                RequestStatistic requestStatistic2 = requestStatistic;
                                requestStatistic2.setNetworkChangeRequest(requestStatistic2.fisrtStart, System.currentTimeMillis(), GlobalAppRuntimeInfo.NetworkChangeRequestStatus.YES_SUCCESS);
                            }
                        } catch (Throwable th) {
                            NetworkTask networkTask9 = NetworkTask.this;
                            ALog.e(NetworkTask.TAG, "[onDataReceive] error.", networkTask9.rc.seqNum, th, " bizReqId", networkTask9.bizReqId);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:77:0x0200  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x0202  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0212 A[Catch: Exception -> 0x015e, TryCatch #1 {Exception -> 0x015e, blocks: (B:34:0x0144, B:36:0x014f, B:40:0x0163, B:42:0x0167, B:44:0x0173, B:46:0x0179, B:48:0x017d, B:50:0x0183, B:52:0x0187, B:53:0x0192, B:55:0x01ad, B:59:0x01b8, B:60:0x01c6, B:62:0x01d0, B:64:0x01df, B:67:0x01eb, B:70:0x01f1, B:75:0x01fc, B:84:0x020c, B:86:0x0212, B:88:0x0216, B:90:0x0230, B:95:0x0239, B:96:0x0286, B:98:0x02b1, B:99:0x02d0, B:100:0x02d4, B:102:0x02f2, B:104:0x030d, B:105:0x0311, B:107:0x0315, B:108:0x0317, B:109:0x0329, B:111:0x032f, B:112:0x0338, B:114:0x0350, B:116:0x0358, B:118:0x0360, B:122:0x03c3, B:124:0x03c9, B:125:0x03d7, B:126:0x03de, B:128:0x0402, B:129:0x0418, B:130:0x041e), top: B:137:0x0144 }] */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0215  */
                @Override // anet.channel.RequestCb
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onFinish(int r24, java.lang.String r25, anet.channel.statist.RequestStatistic r26) {
                    /*
                        Method dump skipped, instructions count: 1110
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.unified.NetworkTask.AnonymousClass4.onFinish(int, java.lang.String, anet.channel.statist.RequestStatistic):void");
                }

                @Override // anet.channel.RequestCb
                public void onResponseCode(int i, Map<String, List<String>> map) {
                    String singleHeaderFieldByKey;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                    } else if (!NetworkTask.this.isDone.get()) {
                        if (AwcnConfig.isVpnOptOpened()) {
                            if ((NetworkTask.this.rc.multiPathTask == null || !NetworkTask.this.rc.multiPathTask.isResponseReturn()) && (NetworkTask.this.rc.vpnFastDegradeTask == null || !NetworkTask.this.rc.vpnFastDegradeTask.isResponseReturn())) {
                                if (i != 431) {
                                    RequestStatistic requestStatistic2 = requestStatistic;
                                    long j = requestStatistic2.customCookieLen;
                                    if (j == 0 || requestStatistic2.cookieLen != j) {
                                        ALog.e(NetworkTask.TAG, "[ap] onResponseCode, network task already return! cancel other task", preProcessRequest.getSeq(), " bizReqId", NetworkTask.this.bizReqId);
                                        NetworkTask.this.rc.cancelMultiPathTask();
                                        NetworkTask.this.rc.cancelVpnFastDegradeTask();
                                    }
                                }
                                ALog.e(NetworkTask.TAG, "[ap] onResponseCode, network task already return! cancel other task", preProcessRequest.getSeq(), " bizReqId", NetworkTask.this.bizReqId, "header", preProcessRequest.getHeaders());
                                NetworkTask.this.rc.cancelMultiPathTask();
                                NetworkTask.this.rc.cancelVpnFastDegradeTask();
                            } else {
                                ALog.e(NetworkTask.TAG, "[ap] onResponseCode, other task already return, end network task!", preProcessRequest.getSeq(), " bizReqId", NetworkTask.this.bizReqId);
                                return;
                            }
                        } else if (NetworkTask.this.rc.multiPathTask == null || !NetworkTask.this.rc.multiPathTask.isResponseReturn()) {
                            NetworkTask.this.rc.cancelMultiPathTask();
                        } else {
                            return;
                        }
                        if (ALog.isPrintLog(2)) {
                            ALog.i(NetworkTask.TAG, "onResponseCode", preProcessRequest.getSeq(), "code", Integer.valueOf(i), " bizReqId", NetworkTask.this.bizReqId);
                            ALog.i(NetworkTask.TAG, "onResponseCode", preProcessRequest.getSeq(), "headers", map, " bizReqId", NetworkTask.this.bizReqId);
                        }
                        ALog.e(NetworkTask.TAG, "[ap] network-task onResponseCode", preProcessRequest.getSeq(), "code", Integer.valueOf(i), " bizReqId", NetworkTask.this.bizReqId, "isSupportStreaming", Boolean.valueOf(requestStatistic.isSupportStreaming));
                        RequestStatistic requestStatistic3 = requestStatistic;
                        if (requestStatistic3.requestBodyCompressRet == 1) {
                            map.put(HttpConstant.X_UPLINK_ENCODE, Arrays.asList(requestStatistic3.requestBodyCompressType));
                        }
                        if (HttpHelper.checkRedirect(preProcessRequest, i) && (singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Location")) != null) {
                            HttpUrl parse = HttpUrl.parse(singleHeaderFieldByKey);
                            if (parse == null) {
                                ALog.e(NetworkTask.TAG, "redirect url is invalid!", preProcessRequest.getSeq(), "redirect url", singleHeaderFieldByKey, " bizReqId", NetworkTask.this.bizReqId);
                            } else if (NetworkTask.this.isDone.compareAndSet(false, true)) {
                                parse.lockScheme();
                                NetworkTask.this.rc.config.redirectToUrl(parse);
                                NetworkTask.this.rc.isDone = new AtomicBoolean();
                                NetworkTask.this.rc.runningTask = new NetworkTask(NetworkTask.this.rc, null, null);
                                requestStatistic.recordRedirect(i, parse.simpleUrlString());
                                requestStatistic.locationUrl = singleHeaderFieldByKey;
                                ThreadPoolExecutorFactory.submitPriorityTask(NetworkTask.this.rc.runningTask, ThreadPoolExecutorFactory.Priority.HIGH);
                                return;
                            } else {
                                return;
                            }
                        }
                        try {
                            NetworkTask.this.rc.cancelTimeoutTask();
                            NetworkTask.access$200(NetworkTask.this).set(true);
                            CookieManager.setCookie(NetworkTask.this.rc.config.getHost(), NetworkTask.this.rc.config.getUrlString(), map);
                            NetworkTask.this.contentLength = HttpHelper.parseContentLength(map);
                            String urlString = NetworkTask.this.rc.config.getUrlString();
                            NetworkTask networkTask = NetworkTask.this;
                            Cache.Entry entry = networkTask.entry;
                            if (entry == null || i != 304) {
                                if (networkTask.cache != null) {
                                    if ("no-store".equals(HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.CACHE_CONTROL))) {
                                        NetworkTask.this.cache.remove(urlString);
                                    } else {
                                        NetworkTask networkTask2 = NetworkTask.this;
                                        Cache.Entry parseCacheHeaders = CacheHelper.parseCacheHeaders(map);
                                        networkTask2.entry = parseCacheHeaders;
                                        if (parseCacheHeaders != null) {
                                            HttpHelper.removeHeaderFiledByKey(map, HttpConstant.CACHE_CONTROL);
                                            map.put(HttpConstant.CACHE_CONTROL, Arrays.asList("no-store"));
                                            NetworkTask networkTask3 = NetworkTask.this;
                                            int i2 = NetworkTask.this.contentLength;
                                            if (i2 == 0) {
                                                i2 = 5120;
                                            }
                                            networkTask3.cacheBuffer = new ByteArrayOutputStream(i2);
                                        }
                                    }
                                }
                                map.put(HttpConstant.X_PROTOCOL, Arrays.asList(requestStatistic.protocolType));
                                boolean equalsIgnoreCase = "open".equalsIgnoreCase(HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.STREAMING_PARSER));
                                if (!requestStatistic.isSupportStreaming && !NetworkTask.this.rc.config.isStreamParseEnable() && !equalsIgnoreCase && NetworkConfigCenter.isResponseBufferEnable()) {
                                    NetworkTask networkTask4 = NetworkTask.this;
                                    if (networkTask4.contentLength <= 131072) {
                                        networkTask4.responseBuffer = new ResponseBuffer(i, map);
                                        if (NetworkConfigCenter.isBodyTimeoutCheckerABEnable()) {
                                            NetworkTask networkTask5 = NetworkTask.this;
                                            if (!networkTask5.isHeaderCallback) {
                                                networkTask5.bodyTimeoutChecker = new BodyTimeoutChecker();
                                                NetworkTask.this.bodyTimeoutChecker.start();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                }
                                NetworkTask.this.rc.callback.onResponseCode(i, map);
                                NetworkTask.this.isHeaderCallback = true;
                                return;
                            }
                            entry.responseHeaders.putAll(map);
                            Cache.Entry parseCacheHeaders2 = CacheHelper.parseCacheHeaders(map);
                            if (parseCacheHeaders2 != null) {
                                long j2 = parseCacheHeaders2.ttl;
                                Cache.Entry entry2 = NetworkTask.this.entry;
                                if (j2 > entry2.ttl) {
                                    entry2.ttl = j2;
                                }
                            }
                            requestStatistic.protocolType = "cache";
                            Map<String, List<String>> map2 = NetworkTask.this.entry.responseHeaders;
                            if (map2 != null) {
                                map2.put(HttpConstant.X_PROTOCOL, Arrays.asList(requestStatistic.protocolType));
                            }
                            NetworkTask networkTask6 = NetworkTask.this;
                            networkTask6.rc.callback.onResponseCode(200, networkTask6.entry.responseHeaders);
                            NetworkTask networkTask7 = NetworkTask.this;
                            Callback callback = networkTask7.rc.callback;
                            byte[] bArr = networkTask7.entry.data;
                            callback.onDataReceiveSize(1, bArr.length, ByteArray.wrap(bArr));
                            long currentTimeMillis2 = System.currentTimeMillis();
                            NetworkTask networkTask8 = NetworkTask.this;
                            networkTask8.cache.put(urlString, networkTask8.entry);
                            ALog.i(NetworkTask.TAG, "update cache", NetworkTask.this.rc.seqNum, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), "key", urlString);
                        } catch (Exception e) {
                            NetworkTask networkTask9 = NetworkTask.this;
                            ALog.w(NetworkTask.TAG, "[onResponseCode] error.", networkTask9.rc.seqNum, e, " bizReqId", networkTask9.bizReqId);
                        }
                    }
                }
            });
        }
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

    public boolean isResponseReturn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38218fa6", new Object[]{this})).booleanValue();
        }
        return this.responseReturn.get();
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.isCanceled) {
            ALog.e(TAG, "network-task run", this.rc.seqNum, " bizReqId", this.bizReqId);
            if (this.rc.config.getAwcnRequest().rs.retryTimes > 0 && this.rc.config.rs.retryTimes <= this.rc.config.rs.maxRetryTime) {
                Request.Builder newBuilder = this.rc.config.getAwcnRequest().newBuilder();
                newBuilder.addHeader("x-nw-retry", "true");
                this.rc.config.setAwcnRequest(newBuilder.build());
            }
            RequestStatistic requestStatistic = this.rc.config.rs;
            requestStatistic.f_refer = this.f_refer;
            requestStatistic.bizReqId = this.bizReqId;
            if (!NetworkStatusHelper.isConnected()) {
                if (!NetworkConfigCenter.isRequestDelayRetryForNoNetwork() || requestStatistic.statusCode == -200) {
                    this.isDone.set(true);
                    this.rc.cancelTimeoutTask();
                    requestStatistic.isDone.set(true);
                    requestStatistic.statusCode = -200;
                    requestStatistic.msg = ErrorConstant.getErrMsg(-200);
                    requestStatistic.rspEnd = System.currentTimeMillis();
                    AnalysisFactory.getV3Instance().log(requestStatistic.span, "netRspRecvEnd", null);
                    if (this.rc.config.isQoSAsync()) {
                        ALog.e(TAG, "[RemoteFeatureQoS][onFinish]1 code = -200", this.rc.seqNum, " bizReqId", this.bizReqId);
                        QosTaskQueue.getInstance().pollQueuingTask(this.rc);
                    }
                    this.rc.callback.onFinish(new DefaultFinishEvent(-200, (String) null, this.rc.config.getAwcnRequest()));
                    return;
                }
                requestStatistic.statusCode = -200;
                ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.unified.NetworkTask.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ThreadPoolExecutorFactory.submitPriorityTask(NetworkTask.this, ThreadPoolExecutorFactory.Priority.HIGH);
                        }
                    }
                }, 1000L, TimeUnit.MILLISECONDS);
            } else if (!NetworkConfigCenter.isBgRequestForbidden() || !GlobalAppRuntimeInfo.isAppBackground() || AppLifecycle.lastEnterBackgroundTime <= 0 || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= NetworkConfigCenter.getBgForbidRequestThreshold() || NetworkConfigCenter.isUrlInWhiteList(this.rc.config.getHttpUrl()) || NetworkConfigCenter.isBizInWhiteList(this.rc.config.getAwcnRequest().getBizId()) || this.rc.config.getAwcnRequest().isAllowRequestInBg()) {
                if (ALog.isPrintLog(2)) {
                    RequestContext requestContext = this.rc;
                    ALog.i(TAG, "exec request", requestContext.seqNum, "retryTimes", Integer.valueOf(requestContext.config.currentRetryTimes));
                }
                try {
                    if (AwcnConfig.isWifiUnavailableUseCellOptOpened()) {
                        if (!AwcnConfig.isWifiDetectOptOpened()) {
                            if (!this.rc.config.isDetectReq()) {
                            }
                            HttpUrl httpUrl = this.rc.config.getHttpUrl();
                            HttpSession httpSession = new HttpSession(GlobalAppRuntimeInfo.getContext(), new ConnInfo(StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host()), this.rc.seqNum, null));
                            httpSession.setForceCellular(false);
                            RequestConfig requestConfig = this.rc.config;
                            requestConfig.rs.isDetectReq = true;
                            sendRequest(httpSession, requestConfig.getAwcnRequest());
                            RequestContext requestContext2 = this.rc;
                            ALog.e(TAG, "[wifi fg detect opt] detect request start send! use HttpSession!", requestContext2.seqNum, "url", requestContext2.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                            return;
                        }
                        if (!AwcnConfig.isWifiDetectOptOpened() || this.rc.config.updateDetectReqType() != 1) {
                            if (AwcnConfig.isWifiDetectOptOpened() && this.rc.config.updateDetectReqType() == 2) {
                                this.rc.config.rs.isDetectReq = true;
                                executeRequest();
                                RequestContext requestContext3 = this.rc;
                                ALog.e(TAG, "[wifi fg detect opt] detect request start send! use TnetSpdySession! ", requestContext3.seqNum, "url", requestContext3.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                                return;
                            }
                        }
                        HttpUrl httpUrl2 = this.rc.config.getHttpUrl();
                        HttpSession httpSession2 = new HttpSession(GlobalAppRuntimeInfo.getContext(), new ConnInfo(StringUtils.concatString(httpUrl2.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl2.host()), this.rc.seqNum, null));
                        httpSession2.setForceCellular(false);
                        RequestConfig requestConfig2 = this.rc.config;
                        requestConfig2.rs.isDetectReq = true;
                        sendRequest(httpSession2, requestConfig2.getAwcnRequest());
                        RequestContext requestContext22 = this.rc;
                        ALog.e(TAG, "[wifi fg detect opt] detect request start send! use HttpSession!", requestContext22.seqNum, "url", requestContext22.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                        return;
                    }
                    if (NetworkConfigCenter.isGetSessionAsyncEnable()) {
                        executeRequest();
                        return;
                    }
                    Session tryGetSession = tryGetSession();
                    if (tryGetSession == null) {
                        RequestContext requestContext4 = this.rc;
                        ALog.e(TAG, "session null,not send request!", requestContext4.seqNum, " bizReqId", this.bizReqId, "url", requestContext4.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                        return;
                    }
                    sendRequest(tryGetSession, this.rc.config.getAwcnRequest());
                } catch (NoSocketPermissionInBgException unused) {
                    RequestContext requestContext5 = this.rc;
                    ALog.e(TAG, "[bg_socket_opt] send request failed! no socket read and write permissions in the background！", requestContext5.seqNum, "url", requestContext5.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                    RequestContext requestContext6 = this.rc;
                    requestContext6.config.commitStatic(requestContext6.callback, requestStatistic, -212, "bg_socket");
                } catch (WifiForceCellException unused2) {
                    RequestContext requestContext7 = this.rc;
                    ALog.e(TAG, "[force cellular] send request failed! set params fail！url not in white list!", requestContext7.seqNum, "url", requestContext7.config.getHttpUrl(), "retryTimes", Integer.valueOf(this.rc.config.currentRetryTimes));
                    RequestContext requestContext8 = this.rc;
                    requestContext8.config.commitStatic(requestContext8.callback, requestStatistic, -109, "force_cellular");
                } catch (Exception e) {
                    RequestContext requestContext9 = this.rc;
                    ALog.e(TAG, "[bg_socket_opt] send request failed.", requestContext9.seqNum, e, " bizReqId", this.bizReqId, "retryTimes", Integer.valueOf(requestContext9.config.currentRetryTimes));
                }
            } else {
                this.isDone.set(true);
                this.rc.cancelTimeoutTask();
                if (ALog.isPrintLog(2)) {
                    RequestContext requestContext10 = this.rc;
                    ALog.i(TAG, "request forbidden in background", requestContext10.seqNum, "url", requestContext10.config.getHttpUrl());
                }
                RequestContext requestContext11 = this.rc;
                requestContext11.config.commitStatic(requestContext11.callback, requestStatistic, -205, "rt");
            }
        }
    }

    private void executeRequest() {
        SessionParamStat.UseConnectType useConnectType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4b7ce1", new Object[]{this});
            return;
        }
        final SessionCenter sessionCenter = RequestConfig.getSessionCenter(this.rc.config);
        final HttpUrl httpUrl = this.rc.config.getHttpUrl();
        final boolean containsNonDefaultPort = httpUrl.containsNonDefaultPort();
        RequestConfig requestConfig = this.rc.config;
        final RequestStatistic requestStatistic = requestConfig.rs;
        final Request awcnRequest = requestConfig.getAwcnRequest();
        boolean z = AwcnConfig.isAllowRetryUseLongLinkEnable() && AwcnConfig.isHostInAllowRetryUseLongLinkWhiteList(this.rc.config.getHost()) && this.rc.config.currentRetryTimes != 0;
        this.rc.config.rs.isAllowLongRetry = z;
        RequestContext requestContext = this.rc;
        final SessionParamStat sessionParamStat = new SessionParamStat(requestContext.seqNum, z, requestStatistic.retryType, requestContext.config.isForceCellRequestEnable());
        if (sessionParamStat.forceCellType != 2) {
            if (!AwcnConfig.isWifiDetectOptOpened() || this.rc.config.updateDetectReqType() != 2) {
                useConnectType = SessionParamStat.UseConnectType.DEFAULT;
            } else {
                useConnectType = SessionParamStat.UseConnectType.DEF_NIC;
            }
            sessionParamStat.sessionFlag = useConnectType.ordinal();
            if (this.rc.config.requestType != 1 || !NetworkConfigCenter.isSpdyEnabled() || (((!z || requestStatistic.retryType == 0) && this.rc.config.currentRetryTimes != 0) || containsNonDefaultPort)) {
                sendRequest(tryGetHttpSession(false, null, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat), awcnRequest);
                return;
            }
            final HttpUrl checkCName = MultiPathTask.checkCName(httpUrl, this.rc);
            checkCName.isNoStrategy = false;
            final long currentTimeMillis = System.currentTimeMillis();
            sessionCenter.asyncGet(checkCName, SessionType.LONG_LINK, 3000L, new SessionGetCallback() { // from class: anetwork.channel.unified.NetworkTask.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.SessionGetCallback
                public void onSessionGetSuccess(Session session) {
                    boolean z2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6d473443", new Object[]{this, session});
                        return;
                    }
                    String str = NetworkTask.this.rc.seqNum;
                    SessionParamStat sessionParamStat2 = sessionParamStat;
                    if (sessionParamStat2 == null || sessionParamStat2.sessionFlag != SessionParamStat.UseConnectType.DEF_NIC.ordinal()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    ALog.e(NetworkTask.TAG, "[wifi fg detect opt] onSessionGetSuccess", str, "Session", session, "isWifiDetectReq", Boolean.valueOf(z2));
                    requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis;
                    requestStatistic.spdyRequestSend = true;
                    NetworkTask.access$100(NetworkTask.this, session, awcnRequest);
                }

                @Override // anet.channel.SessionGetCallback
                public void onSessionGetFail() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("735355e4", new Object[]{this});
                        return;
                    }
                    String str = NetworkTask.this.rc.seqNum;
                    String str2 = requestStatistic.url;
                    String str3 = NetworkTask.this.bizReqId;
                    SessionParamStat sessionParamStat2 = sessionParamStat;
                    ALog.e(NetworkTask.TAG, "[wifi fg detect opt] onSessionGetFail", str, "url", str2, " bizReqId", str3, "isWifiDetectReq", Boolean.valueOf(sessionParamStat2 != null && sessionParamStat2.sessionFlag == SessionParamStat.UseConnectType.DEF_NIC.ordinal()));
                    requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis;
                    NetworkTask networkTask = NetworkTask.this;
                    NetworkTask.access$100(networkTask, NetworkTask.access$000(networkTask, checkCName.isNoStrategy, null, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat), awcnRequest);
                }
            }, sessionParamStat);
            return;
        }
        throw new WifiForceCellException("force cell not url white list!");
    }

    private Session tryGetSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("e3d315ac", new Object[]{this});
        }
        final SessionCenter sessionCenter = RequestConfig.getSessionCenter(this.rc.config);
        final HttpUrl httpUrl = this.rc.config.getHttpUrl();
        httpUrl.isNoStrategy = false;
        final boolean containsNonDefaultPort = httpUrl.containsNonDefaultPort();
        final RequestStatistic requestStatistic = this.rc.config.rs;
        boolean z = AwcnConfig.isAllowRetryUseLongLinkEnable() && AwcnConfig.isHostInAllowRetryUseLongLinkWhiteList(this.rc.config.getHost()) && this.rc.config.currentRetryTimes != 0;
        this.rc.config.rs.isAllowLongRetry = z;
        RequestContext requestContext = this.rc;
        final SessionParamStat sessionParamStat = new SessionParamStat(requestContext.seqNum, z, requestStatistic.retryType, requestContext.config.isForceCellRequestEnable());
        if (sessionParamStat.forceCellType != 2) {
            Session session = null;
            if (this.rc.config.requestType != 1 || !NetworkConfigCenter.isSpdyEnabled() || (((!z || sessionParamStat.retryType == SessionParamStat.UseRetryType.SHORT_LINK) && this.rc.config.currentRetryTimes != 0) || containsNonDefaultPort)) {
                requestStatistic.isPreSession = true;
                return tryGetHttpSession(false, null, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat);
            }
            final HttpUrl checkCName = MultiPathTask.checkCName(httpUrl, this.rc);
            long currentTimeMillis = System.currentTimeMillis();
            try {
                session = sessionCenter.getThrowsException(checkCName, SessionType.LONG_LINK, 0L, sessionParamStat);
                if (session != null) {
                    requestStatistic.isPreSession = true;
                }
                requestStatistic.sessionSyncTime = System.currentTimeMillis() - currentTimeMillis;
            } catch (NoAvailStrategyException unused) {
                requestStatistic.sessionSyncTime = System.currentTimeMillis() - currentTimeMillis;
                requestStatistic.isNoStrategyTryHttpSession = true;
                return tryGetHttpSession(true, session, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat);
            } catch (NoSocketPermissionInBgException unused2) {
                requestStatistic.sessionSyncTime = System.currentTimeMillis() - currentTimeMillis;
                throw new NoSocketPermissionInBgException("no socket permissions in background");
            } catch (Exception unused3) {
                requestStatistic.sessionSyncTime = System.currentTimeMillis() - currentTimeMillis;
            }
            if (session == null) {
                final long currentTimeMillis2 = System.currentTimeMillis();
                ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anetwork.channel.unified.NetworkTask.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z2 = false;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long currentTimeMillis3 = System.currentTimeMillis();
                        requestStatistic.sessionThreadWaitTime = currentTimeMillis3 - currentTimeMillis2;
                        Session session2 = sessionCenter.get(checkCName, SessionType.LONG_LINK, ProtocolType.ALL, NetworkConfigCenter.getSessionConnectWaitTime(), sessionParamStat);
                        if (!(session2 == null || session2.getConnType() == null || (!session2.getConnType().is1RttHTTP3() && !session2.getConnType().isH2S() && !session2.getConnType().isH2()))) {
                            requestStatistic.waitConnectStat = 1;
                        }
                        requestStatistic.connWaitTime = System.currentTimeMillis() - currentTimeMillis3;
                        RequestStatistic requestStatistic2 = requestStatistic;
                        if (session2 != null) {
                            z2 = true;
                        }
                        requestStatistic2.spdyRequestSend = z2;
                        Session access$000 = NetworkTask.access$000(NetworkTask.this, checkCName.isNoStrategy, session2, sessionCenter, httpUrl, containsNonDefaultPort, sessionParamStat);
                        NetworkTask networkTask = NetworkTask.this;
                        NetworkTask.access$100(networkTask, access$000, networkTask.rc.config.getAwcnRequest());
                    }
                }, ThreadPoolExecutorFactory.Priority.NORMAL);
                return null;
            }
            ALog.i(TAG, "tryGetSession", this.rc.seqNum, "Session", session);
            requestStatistic.spdyRequestSend = true;
            return session;
        }
        throw new WifiForceCellException("force cell not url white list!");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0291 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private anet.channel.request.Request preProcessRequest(anet.channel.request.Request r21) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.unified.NetworkTask.preProcessRequest(anet.channel.request.Request):anet.channel.request.Request");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private anet.channel.Session tryGetHttpSession(boolean r22, anet.channel.Session r23, anet.channel.SessionCenter r24, anet.channel.util.HttpUrl r25, boolean r26, anet.channel.SessionParamStat r27) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.unified.NetworkTask.tryGetHttpSession(boolean, anet.channel.Session, anet.channel.SessionCenter, anet.channel.util.HttpUrl, boolean, anet.channel.SessionParamStat):anet.channel.Session");
    }
}
