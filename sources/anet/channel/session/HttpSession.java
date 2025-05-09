package anet.channel.session;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.request.Cancelable;
import anet.channel.request.FutureCancelable;
import anet.channel.request.Request;
import anet.channel.session.HttpConnector;
import anet.channel.session.okhttp.OkHttpConnector;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.Inet64Util;
import anet.channel.util.RequestPriorityTable;
import anet.channel.util.TlsSniSocketFactory;
import anet.channel.util.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import tb.pod;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HttpSession extends Session {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.HttpSession";
    private SSLSocketFactory sslSocketFactory;
    private boolean useOkhttp = false;

    static {
        t2o.a(607125713);
    }

    public HttpSession(Context context, ConnInfo connInfo) {
        super(context, connInfo);
        ConnType connType;
        if (this.mConnStrategy == null) {
            String str = this.mHost;
            if (str == null || !str.startsWith("https")) {
                connType = ConnType.HTTP;
            } else {
                connType = ConnType.HTTPS;
            }
            this.mConnType = connType;
        } else if (AwcnConfig.isHttpsSniEnable() && this.mConnType.equals(ConnType.HTTPS)) {
            this.sslSocketFactory = new TlsSniSocketFactory(this.mRealHost);
        }
    }

    public static /* synthetic */ void access$000(HttpSession httpSession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16feba21", new Object[]{httpSession, new Integer(i), event});
        } else {
            httpSession.notifyStatus(i, event);
        }
    }

    public static /* synthetic */ void access$100(HttpSession httpSession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85049a2", new Object[]{httpSession, new Integer(i), event});
        } else {
            httpSession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ void access$200(HttpSession httpSession, Request request, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f8c192", new Object[]{httpSession, request, new Integer(i)});
        } else {
            httpSession.handleResponseCode(request, i);
        }
    }

    public static /* synthetic */ void access$300(HttpSession httpSession, Request request, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb4673", new Object[]{httpSession, request, map});
        } else {
            httpSession.handleResponseHeaders(request, map);
        }
    }

    public static /* synthetic */ void access$400(HttpSession httpSession, int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc44f825", new Object[]{httpSession, new Integer(i), event});
        } else {
            httpSession.handleCallbacks(i, event);
        }
    }

    public static /* synthetic */ boolean access$500(HttpSession httpSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("787c419", new Object[]{httpSession})).booleanValue();
        }
        return httpSession.useOkhttp;
    }

    public static /* synthetic */ boolean access$600(HttpSession httpSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9427ef1a", new Object[]{httpSession})).booleanValue();
        }
        return httpSession.forceCellular;
    }

    public static /* synthetic */ boolean access$700(HttpSession httpSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c81a1b", new Object[]{httpSession})).booleanValue();
        }
        return httpSession.forceCellular;
    }

    public static /* synthetic */ boolean access$800(HttpSession httpSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad68451c", new Object[]{httpSession})).booleanValue();
        }
        return httpSession.forceCellular;
    }

    public static /* synthetic */ Object ipc$super(HttpSession httpSession, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/session/HttpSession");
    }

    @Override // anet.channel.Session
    public void close(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
            return;
        }
        updateCloseReason(str);
        notifyStatus(6, null);
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("4a74edeb", new Object[]{this});
        }
        return null;
    }

    @Override // anet.channel.Session
    public boolean isReuse(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4949e94d", new Object[]{this, session})).booleanValue();
        }
        return false;
    }

    @Override // anet.channel.Session
    public boolean isSupportSmoothReconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c04e9cf", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void setUseOkhttp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3405c244", new Object[]{this, new Boolean(z)});
        } else {
            this.useOkhttp = z;
        }
    }

    @Override // anet.channel.Session
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            notifyStatus(6, null);
        }
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        return this.mStatus == 4;
    }

    @Override // anet.channel.Session
    public void close(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651642bf", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.autoReCreate = false;
        close(str);
    }

    @Override // anet.channel.Session
    public void connect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
            return;
        }
        try {
            IConnStrategy iConnStrategy = this.mConnStrategy;
            if (iConnStrategy == null || iConnStrategy.getIpSource() != 1) {
                IConnStrategy iConnStrategy2 = this.mConnStrategy;
                if (iConnStrategy2 == null || iConnStrategy2.getStatus() != 1) {
                    Request.Builder redirectEnable = new Request.Builder().setUrl(this.mHost).setSeq(this.mSeq).setConnectTimeout((int) (this.mConnTimeout * Utils.getNetworkTimeFactor())).setReadTimeout((int) (this.mReadTimeout * Utils.getNetworkTimeFactor())).setRedirectEnable(false);
                    SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
                    if (sSLSocketFactory != null) {
                        redirectEnable.setSslSocketFactory(sSLSocketFactory);
                    }
                    if (this.mIpToHost) {
                        redirectEnable.addHeader(HttpConstant.HOST, this.mIp);
                    }
                    if (AwcnConfig.isAllowConvertIPv4ToIPv6() && Inet64Util.isIPv6OnlyNetwork() && anet.channel.strategy.utils.Utils.isIPV4Address(this.mIp)) {
                        try {
                            this.mConnectIp = Inet64Util.convertToIPv6ThrowsException(this.mIp);
                        } catch (Exception unused) {
                        }
                    }
                    ALog.e(TAG, "HttpSession connect", null, "host", this.mHost, pod.IP, this.mConnectIp, "port", Integer.valueOf(this.mPort));
                    final Request build = redirectEnable.build();
                    build.setDnsOptimize(this.mConnectIp, this.mPort);
                    ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anet.channel.session.HttpSession.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            HttpConnector.Response connect = HttpConnector.connect(build, HttpSession.this.getForceCellular());
                            if (connect.httpCode > 0) {
                                HttpSession.access$000(HttpSession.this, 4, new Event(1));
                            } else {
                                HttpSession.access$100(HttpSession.this, 256, new Event(256, connect.httpCode, "Http connect fail"));
                            }
                        }
                    }, ThreadPoolExecutorFactory.Priority.LOW);
                    return;
                }
                notifyStatus(4, new Event(1));
                return;
            }
            notifyStatus(4, new Event(1));
        } catch (Throwable th) {
            ALog.e(TAG, "HTTP connect fail.", null, th, new Object[0]);
        }
    }

    @Override // anet.channel.Session
    public Cancelable request(final Request request, final RequestCb requestCb) {
        final RequestStatistic requestStatistic;
        FutureCancelable futureCancelable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cancelable) ipChange.ipc$dispatch("f956c133", new Object[]{this, request, requestCb});
        }
        FutureCancelable futureCancelable2 = FutureCancelable.NULL;
        Request.Builder builder = null;
        if (request != null) {
            requestStatistic = request.rs;
        } else {
            requestStatistic = new RequestStatistic(this.mRealHost, null);
        }
        if (!this.forceCellular) {
            requestStatistic.setConnType(this.mConnType);
        }
        if (requestStatistic.start == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = currentTimeMillis;
            requestStatistic.start = currentTimeMillis;
        }
        requestStatistic.isComplex = this.mSessionStat.isComplex;
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return futureCancelable2;
        }
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (request.getSslSocketFactory() == null && this.sslSocketFactory != null) {
                builder = request.newBuilder().setSslSocketFactory(this.sslSocketFactory);
            }
            if (this.mIpToHost) {
                if (builder == null) {
                    builder = request.newBuilder();
                }
                builder.addHeader(HttpConstant.HOST, this.mIp);
            }
            if (builder != null) {
                request = builder.build();
            }
            if (this.mConnectIp == null) {
                String host = request.getHttpUrl().host();
                if (AwcnConfig.isAllowConvertIPv4ToIPv6() && Inet64Util.isIPv6OnlyNetwork() && anet.channel.strategy.utils.Utils.isIPV4Address(host)) {
                    try {
                        this.mConnectIp = Inet64Util.convertToIPv6ThrowsException(host);
                    } catch (Exception unused) {
                    }
                }
            }
            request.setDnsOptimize(this.mConnectIp, this.mPort);
            request.setUrlScheme(this.mConnType.isSSL());
            IConnStrategy iConnStrategy = this.mConnStrategy;
            if (iConnStrategy != null) {
                request.rs.setIpInfo(iConnStrategy.getIpSource(), this.mConnStrategy.getIpType());
            } else {
                request.rs.setIpInfo(1, 1);
            }
            request.rs.unit = this.unit;
            final RequestCb requestCb2 = new RequestCb() { // from class: anet.channel.session.HttpSession.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.RequestCb
                public void onDataReceive(ByteArray byteArray, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
                    } else {
                        requestCb.onDataReceive(byteArray, z);
                    }
                }

                @Override // anet.channel.RequestCb
                public void onFinish(int i, String str, RequestStatistic requestStatistic2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic2});
                        return;
                    }
                    if (i <= 0 && i != -204) {
                        HttpSession.access$400(HttpSession.this, 2, new Event(2, 0, "Http connect fail"));
                    }
                    requestCb.onFinish(i, str, requestStatistic2);
                }

                @Override // anet.channel.RequestCb
                public void onResponseCode(int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                        return;
                    }
                    ALog.i(HttpSession.TAG, "", request.getSeq(), "httpStatusCode", Integer.valueOf(i), " bizReqId", request.rs.bizReqId);
                    ALog.i(HttpSession.TAG, "", request.getSeq(), "response headers", map, " bizReqId", request.rs.bizReqId);
                    requestCb.onResponseCode(i, map);
                    requestStatistic.serverRT = HttpHelper.parseServerRT(map, 1);
                    requestStatistic.serverBRT = HttpHelper.parseServerRT(map, 2);
                    requestStatistic.eagleEyeId = HttpHelper.parseEagleId(map);
                    requestStatistic.isHitCache = HttpHelper.parseCache(map);
                    requestStatistic.hitCache = HttpHelper.parseXCache(map);
                    requestStatistic.via = HttpHelper.parseVia(map);
                    HttpSession.access$200(HttpSession.this, request, i);
                    HttpSession.access$300(HttpSession.this, request, map);
                }
            };
            Runnable runnable = new Runnable() { // from class: anet.channel.session.HttpSession.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    request.rs.sendBeforeTime = System.currentTimeMillis() - request.rs.reqStart;
                    if (!HttpSession.access$500(HttpSession.this) || HttpSession.access$600(HttpSession.this)) {
                        HttpConnector.connect(request, requestCb2, HttpSession.access$800(HttpSession.this));
                        return;
                    }
                    try {
                        OkHttpConnector.request(request, requestCb2, false);
                    } catch (Throwable th) {
                        ALog.e(HttpSession.TAG, "try OkHttp request error.", request.getSeq(), th, " bizReqId", request.rs.bizReqId);
                        Request request2 = request;
                        request2.rs.useOkHttp = -1;
                        HttpConnector.connect(request2, requestCb2, HttpSession.access$700(HttpSession.this));
                    }
                }
            };
            RequestStatistic requestStatistic2 = request.rs;
            requestStatistic2.requestTime = requestStatistic2.sendStart - currentTimeMillis2;
            if (!request.isGold && !this.forceCellular) {
                futureCancelable = new FutureCancelable(ThreadPoolExecutorFactory.submitPriorityTask(runnable, RequestPriorityTable.lookup(request)), request.getSeq());
                return futureCancelable;
            }
            ALog.e(TAG, "send request with BACKUP-QUEUE, isGold=" + request.isGold + ", forceCellular=" + this.forceCellular, request.getSeq(), " bizReqId", request.rs.bizReqId);
            futureCancelable = new FutureCancelable(ThreadPoolExecutorFactory.submitBackupTask(runnable), request.getSeq());
            return futureCancelable;
        } catch (Throwable th) {
            requestCb.onFinish(-101, ErrorConstant.formatMsg(-101, th.toString()), requestStatistic);
            return futureCancelable2;
        }
    }

    @Override // anet.channel.Session
    public void close(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8249dc35", new Object[]{this, new Boolean(z)});
            return;
        }
        this.autoReCreate = false;
        close();
    }
}
