package com.alipay.mobile.common.transport.http;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.TraficConsumeModel;
import com.alipay.mobile.common.netsdkextdependapi.security.SecurityUtil;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportCallback;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.concurrent.ActThreadPoolExecutor;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.config.UserNetworkPreferencesManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.download.DownloadRequest;
import com.alipay.mobile.common.transport.ext.ExtTransportClient;
import com.alipay.mobile.common.transport.ext.ExtTransportException;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.ext.MMTPException;
import com.alipay.mobile.common.transport.h5.H5HttpUrlRequest;
import com.alipay.mobile.common.transport.http.inner.HttpClientPlannerHelper;
import com.alipay.mobile.common.transport.http.inner.HttpProxyWrapper;
import com.alipay.mobile.common.transport.http.inner.RpcInputStreamEntity;
import com.alipay.mobile.common.transport.http.selfencrypt.ClientRpcPack;
import com.alipay.mobile.common.transport.http.selfencrypt.SelfEncryptUtils;
import com.alipay.mobile.common.transport.interceptors.TransportInterceptorManager;
import com.alipay.mobile.common.transport.io.RpcBufferedInputStream;
import com.alipay.mobile.common.transport.monitor.DataContainer;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.monitor.RPCDataParser;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.strategy.StrategyUtil;
import com.alipay.mobile.common.transport.utils.DataItemsUtil;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.alipay.mobile.common.transport.utils.MonitorLogRecordUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.RequestMethodUtils;
import com.alipay.mobile.common.transport.utils.RetryService;
import com.alipay.mobile.common.transport.utils.SharedPreUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transport.zfeatures.LoginRefreshHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.DateUtils;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpWorker implements Callable<Response> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXPIRES_PATTERN = "EEE, dd-MMM-yyyy HH:mm:ss z";
    public static final String TAG = "HttpWorker";

    /* renamed from: a  reason: collision with root package name */
    public HttpUriRequest f4082a;
    public HttpEntity c;
    public ClientRpcPack clientRpcPack;
    public HttpHost d;
    public URL e;
    public URI f;
    public String k;
    public Context mContext;
    public ActThreadPoolExecutor mCurrentThreadPoolExecutor;
    public HttpManager mHttpManager;
    public HttpResponse mHttpResponse;
    public HttpUrlRequest mOriginRequest;
    public Response q;
    public Throwable r;
    public HttpHost t;
    public static final HttpRequestRetryHandler sHttpRequestRetryHandler = new ZHttpRequestRetryHandler();
    public static byte LAST_GOOD_PROXY = -1;
    public HttpContext mLocalContext = new BasicHttpContext();
    public final CookieStore b = new BasicCookieStore();
    public int mRetryTimes = 0;
    public final HttpContextExtend g = HttpContextExtend.getInstance();
    public boolean h = false;
    public boolean i = false;
    public String j = null;
    public TransportContext mTransportContext = new TransportContext();
    public long l = -1;
    public byte m = -1;
    public byte n = -1;
    public final long o = System.currentTimeMillis();
    public int p = 0;
    public boolean writedMonitorLog = false;
    public boolean s = false;
    public long u = 0;
    public boolean v = false;
    public boolean w = false;
    public RedirectHandler redirectHandler = getHttpClient().getRedirectHandler();

    public HttpWorker(HttpManager httpManager, HttpUrlRequest httpUrlRequest) {
        this.mHttpManager = httpManager;
        Context context = httpManager.getContext();
        this.mContext = context;
        this.mOriginRequest = httpUrlRequest;
        TransportContext transportContext = this.mTransportContext;
        transportContext.context = context;
        transportContext.rpcUUID = httpUrlRequest.getTag(TransportConstants.KEY_UUID);
        this.mTransportContext.mPerformanceDataCallback = httpUrlRequest.getPerformanceDataCallback();
        this.mTransportContext.urgentFlag = httpUrlRequest.getUrgentFlag();
        TransportContext transportContext2 = this.mTransportContext;
        transportContext2.originRequest = this.mOriginRequest;
        transportContext2.bizLog = httpUrlRequest.getBizLog();
        String tag = httpUrlRequest.getTag(TransportConstants.KEY_LOGGER_LEVEL);
        if (!TextUtils.isEmpty(tag)) {
            this.mTransportContext.loggerLevel = tag;
        }
        String tag2 = httpUrlRequest.getTag(TransportConstants.KEY_TARGET_SPI);
        if (!TextUtils.isEmpty(tag2)) {
            this.mTransportContext.targetSpi = tag2;
        }
        this.mTransportContext.logAttachmentMap = httpUrlRequest.refLogAttachmentMap();
    }

    public static /* synthetic */ void access$000(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf83150d", new Object[]{httpWorker});
        } else {
            httpWorker.K();
        }
    }

    public final void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            if (this.h && !this.i) {
                this.g.remove(str);
                LogCatUtil.printInfo(TAG, "removeEtagFromCache，完成," + Thread.currentThread().getId());
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "removeEtagFromCache", th);
        }
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (!canRetryForNetworkAvailable()) {
            LogCatUtil.info(TAG, "canRetryCurrTask. can't retry for proxy， because network is invalid。");
            return false;
        } else if (!ZHttpRequestRetryHandler.isCanRetryForStandardHttpRequest(getOriginRequest()) || !U()) {
            return false;
        } else {
            int retryCount = ZHttpRequestRetryHandler.getRetryCount(this.mLocalContext);
            if (this.mRetryTimes + retryCount >= 3) {
                LogCatUtil.debug(TAG, "canRetryCurrTask retryCount: " + retryCount + ",mRetryTimes：" + this.mRetryTimes + ",should't retry");
                return false;
            } else if (this.mOriginRequest.isCanceled()) {
                return false;
            } else {
                return true;
            }
        }
    }

    public final int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        return this.mRetryTimes + ZHttpRequestRetryHandler.getRetryCount(this.mLocalContext);
    }

    public final void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        try {
            RetryService.getInstance().addOperationTypeToRetryList(str);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    public final Map<String, String> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this});
        }
        try {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(getOperationType())) {
                hashMap.put(HeaderConstant.HEADER_KEY_OPERATION_TYPE, getOperationType());
            }
            getOriginRequest();
            return hashMap;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getExtMap ex:" + th.toString());
            return Collections.EMPTY_MAP;
        }
    }

    public final void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        try {
            RetryService.getInstance().removeOpetationTypeFromRetryList(str);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!isRpcRequest() || !MiscUtils.isMdapApi(getOperationType())) {
            NetworkServiceTracer.getInstance().clearErrorByType(this.mTransportContext.bizType);
        }
    }

    public final void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            TransportInterceptorManager.getInstance().onPreTransportInterceptor(str, null);
        }
    }

    public final TransportCallback I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportCallback) ipChange.ipc$dispatch("b70a86fc", new Object[]{this});
        }
        return this.mOriginRequest.getCallback();
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.transport.http.HttpWorker.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        HttpWorker.access$000(HttpWorker.this);
                    }
                }
            });
        }
    }

    public final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            getHttpClient().getConnectionManager().closeExpiredConnections();
            getHttpClient().getConnectionManager().closeIdleConnections(30L, TimeUnit.SECONDS);
            LogCatUtil.info(TAG, "close expired connections.");
        } catch (Throwable unused) {
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            if (MiscUtils.isDebugger(this.mContext) && isRpcRequest()) {
                String stringData = SharedPreUtils.getStringData(this.mContext, TransportConstants.KEY_SOFA_GROUP_NAME);
                if (!TextUtils.isEmpty(stringData)) {
                    getTargetHttpUriRequest().addHeader(TransportConstants.KEY_SOFA_GROUP_NAME, stringData);
                    LogCatUtil.debug(TAG, "add debug header,key:sofa-group-name,value:" + stringData);
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "addDebugHeaders ex:" + th.toString());
        }
    }

    public final int N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        URL O = O();
        if (O.getPort() == -1) {
            return O.getDefaultPort();
        }
        return O.getPort();
    }

    public final URL O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("6a19740", new Object[]{this});
        }
        URL url = this.e;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.mOriginRequest.getUrl());
        this.e = url2;
        return url2;
    }

    public final boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        return true ^ this.mTransportContext.isRequestByMRPC();
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.mTransportContext.rpcUUID = this.mOriginRequest.getTag(TransportConstants.KEY_UUID);
        this.s = true;
        DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.DOWN, "T");
        TransportStrategy.incrementRpcErrorCount();
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (!TextUtils.isEmpty(getOperationType())) {
            LogCatUtil.info(TAG, "reset cookie.  API=" + getOperationType());
            GwCookieCacheHelper.removeAllCookie();
            CookieAccessHelper.removeAllCookie();
            long currentTimeMillis = System.currentTimeMillis();
            while (CookieAccessHelper.getCookieManager().hasCookies() && System.currentTimeMillis() - currentTimeMillis < 1000) {
                Thread.yield();
            }
            if (!CookieAccessHelper.getCookieManager().hasCookies()) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.RESET_COOKIE, "T");
                LogCatUtil.info(TAG, "reset cookie success!");
                return;
            }
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.RESET_COOKIE, UTConstant.Args.UT_SUCCESS_F);
            LogCatUtil.info(TAG, "reset cookie fail!");
        }
    }

    public final Header S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Header) ipChange.ipc$dispatch("67f2c74e", new Object[]{this});
        }
        try {
            return getTargetHttpUriRequest().getFirstHeader("Content-Type");
        } catch (Exception e) {
            LogCatUtil.error(TAG, "getTargetContentType Exception", e);
            return null;
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            this.mTransportContext.deviceTrafficStateInfo = AlipayQosService.getInstance().startTrafficMonitor();
        }
    }

    public final boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
        }
        Boolean isRetryForRpc = ZHttpRequestRetryHandler.isRetryForRpc(getOriginRequest(), this.mTransportContext);
        if (isRetryForRpc == null || isRetryForRpc != Boolean.FALSE) {
            return true;
        }
        return false;
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        try {
            TransportStrategy.resetRpcErrorCount();
            if (isRpcRequest() && this.mTransportContext.isRequestByMRPC()) {
                ExtTransportTunnelWatchdog.getInstance().mrpcFailureRest();
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "resetRpcErrorCount ex:" + th.toString());
        }
    }

    public final Response a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("b82126e", new Object[]{this, str});
        }
        DataItemsUtil.removeFromDataContainer(this.mTransportContext.getCurrentDataContainer(), "ERROR");
        DataItemsUtil.removeFromDataContainer(this.mTransportContext.getCurrentDataContainer(), "NETTUNNEL");
        this.s = true;
        LogCatUtil.info(TAG, str + " retry,retryCount:" + ZHttpRequestRetryHandler.getRetryCount(this.mLocalContext) + ",mRetryTimes:" + this.mRetryTimes);
        this.mRetryTimes = this.mRetryTimes + 1;
        resetRequestHeaders();
        return call();
    }

    public void abort() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf58fb7", new Object[]{this});
            return;
        }
        try {
            if (getTargetHttpUriRequest() != null) {
                getTargetHttpUriRequest().abort();
                StringBuilder sb = new StringBuilder("abort request: ");
                if (TextUtils.isEmpty(getOperationType())) {
                    str = getTargetHttpUriRequest().getURI().toString();
                } else {
                    str = getOperationType();
                }
                sb.append(str);
                LogCatUtil.warn(TAG, sb.toString());
            }
        } catch (Exception e) {
            LogCatUtil.warn(TAG, "abort exception:", e);
        }
    }

    public void addCookie2Header() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a846ae1", new Object[]{this});
        } else {
            getTargetHttpUriRequest().addHeader("Cookie", GwCookieCacheHelper.getCookieWrapper(this.mContext, getTargetUri().toString(), this.mTransportContext));
        }
    }

    public void addEtag2RequestHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("debde47", new Object[]{this});
        } else if (!getOriginRequest().isUseEtag()) {
            LogCatUtil.printInfo(TAG, "addEtag2RequestHeader. don't use etag. go return.");
        } else {
            HttpUriRequest targetHttpUriRequest = getTargetHttpUriRequest();
            String valueOf = String.valueOf(this.mOriginRequest.hashCode());
            this.j = valueOf;
            Object y = y(valueOf);
            if (y == null || (y instanceof Exception)) {
                this.h = false;
                return;
            }
            targetHttpUriRequest.addHeader(new BasicHeader("If-None-Match", ((CachedResponseWrapper) y).getEtag()));
            this.h = true;
        }
    }

    public void addRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf7457f", new Object[]{this});
            return;
        }
        M();
        addEtag2RequestHeader();
        copyHeaders();
        addCookie2Header();
        String alipayLocaleDes = DeviceInfoUtil.getAlipayLocaleDes();
        if (!TextUtils.isEmpty(alipayLocaleDes)) {
            getTargetHttpUriRequest().addHeader(HeaderConstant.HEADER_KEY_ACCEPT_LANGUAGE, alipayLocaleDes);
        }
        AndroidHttpClient.modifyRequestToAcceptGzipResponse(getTargetHttpUriRequest());
        AndroidHttpClient.modifyRequestToKeepAlive(getTargetHttpUriRequest());
        if (RetryService.getInstance().isSupportResend(getOperationType(), getOriginRequest().allowRetry)) {
            getTargetHttpUriRequest().addHeader(HeaderConstant.HEADER_KEY_RETRYABLE_2, "1");
        } else {
            getTargetHttpUriRequest().addHeader(HeaderConstant.HEADER_KEY_RETRYABLE_2, "0");
        }
        if (isUseSelfEncrypt()) {
            getTargetHttpUriRequest().addHeader(TransportConstants.KEY_X_MGS_ENCRYPTION, "1");
            getTargetHttpUriRequest().addHeader(TransportConstants.KEY_X_CONTENT_ENCODING, "mgss");
        }
        printHeaderLog(getTargetHttpUriRequest().getAllHeaders());
    }

    public void asyncMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774eacad", new Object[]{this});
        } else if (!this.writedMonitorLog) {
            this.mTransportContext.taskFinishedTimeMillis = System.currentTimeMillis();
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transport.http.HttpWorker.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        HttpWorker.this.monitorLog();
                    }
                }
            });
        }
    }

    public final HttpUrlResponse b(HttpResponse httpResponse, int i, String str, HttpUrlResponse httpUrlResponse) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlResponse) ipChange.ipc$dispatch("e665e038", new Object[]{this, httpResponse, new Integer(i), str, httpUrlResponse});
        }
        CachedResponseWrapper cachedResponseWrapper = (CachedResponseWrapper) y(this.j);
        if (cachedResponseWrapper != null) {
            httpUrlResponse = new HttpUrlResponse(handleResponseHeader(httpResponse), i, str, cachedResponseWrapper.getValue());
            long period = getPeriod(httpResponse);
            Header typeHeader = cachedResponseWrapper.getTypeHeader();
            if (typeHeader != null) {
                HashMap<String, String> contentType = getContentType(typeHeader.getValue());
                str3 = contentType.get("charset");
                str2 = contentType.get("Content-Type");
            } else {
                str3 = null;
                str2 = null;
            }
            httpUrlResponse.setContentType(str2);
            httpUrlResponse.setCharset(str3);
            httpUrlResponse.setCreateTime(System.currentTimeMillis());
            httpUrlResponse.setPeriod(period);
            LogCatUtil.info(TAG, "[processCode304] Response cache data.");
        } else {
            LogCatUtil.info(TAG, "[processCode304] Response no cache data.");
            t(httpResponse);
        }
        return httpUrlResponse;
    }

    public final URI c(URI uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("9deb3c2e", new Object[]{this, uri});
        }
        if (!MiscUtils.isTFSHost(uri.getHost())) {
            return uri;
        }
        String replaceTFS2CDN = MiscUtils.replaceTFS2CDN(uri);
        URI uri2 = new URI(replaceTFS2CDN);
        this.mTransportContext.url = replaceTFS2CDN;
        LogCatUtil.info(TAG, "Origin url: " + uri.toString() + " convert to " + replaceTFS2CDN);
        return uri2;
    }

    public boolean canRetryCurrTaskForSubBiz(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2f3c485", new Object[]{this, th})).booleanValue();
        }
        return false;
    }

    public boolean canRetryForIoException(IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("701db0f9", new Object[]{this, iOException})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "canRetryForIoException fail. " + th.toString());
        }
        if (!canRetryForNetworkAvailable()) {
            LogCatUtil.info(TAG, "canRetryForIoException. can't retry for proxy， because network is invalid。");
            return false;
        }
        if (!ZHttpRequestRetryHandler.isShutdown(iOException) && U() && ZHttpRequestRetryHandler.isCanRetryForStandardHttpRequest(getOriginRequest()) && !this.mOriginRequest.isCanceled() && ZHttpRequestRetryHandler.getRetryCount(this.mLocalContext) < 3) {
            LogCatUtil.info(TAG, "canRetryForIoException return true.");
            return true;
        }
        return false;
    }

    public boolean canRetryForNetworkAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38a49d7", new Object[]{this})).booleanValue();
        }
        if (!NetworkUtils.isNetworkAvailable(this.mContext)) {
            return false;
        }
        return true;
    }

    public void consumeContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b26ae4", new Object[]{this});
        } else {
            consumeContent(this.mHttpResponse);
        }
    }

    public void copyHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5645ee58", new Object[]{this});
        } else {
            copyHeaders(getTargetHttpUriRequest(), getHeaders());
        }
    }

    public final void d(Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779e3224", new Object[]{this, response});
        } else if (response != null && (response instanceof HttpUrlResponse)) {
            HttpUrlResponse httpUrlResponse = (HttpUrlResponse) response;
            HttpUrlHeader header = httpUrlResponse.getHeader();
            String str = "is null";
            if (!MiscUtils.isDebugger(this.mContext)) {
                long id = Thread.currentThread().getId();
                String str2 = this.k;
                if (header != null) {
                    str = header.toString();
                }
                LogCatUtil.info(TAG, "threadid = " + id + "; Response success. mOperationType=[" + str2 + "] . response header=[" + str + "].  response body =   ");
                return;
            }
            long id2 = Thread.currentThread().getId();
            String str3 = this.k;
            if (header != null) {
                str = header.toString();
            }
            String bodyContent = getBodyContent(httpUrlResponse);
            LogCatUtil.info(TAG, "threadid = " + id2 + "; Response success. mOperationType=[" + str3 + "] . response header=[" + str + "].  response body = " + bodyContent + "  ");
        }
    }

    public HttpResponse doExecuteRequestByHttpClient(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("df7bd6f6", new Object[]{this, httpHost, httpRequest, httpContext});
        }
        return getHttpClient().execute(httpHost, httpRequest, httpContext);
    }

    public String doMonitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6ae0ba4", new Object[]{this});
        }
        if (this.writedMonitorLog) {
            return "";
        }
        this.writedMonitorLog = true;
        putCommonMonitorDataItems();
        putSubCommonMonitor();
        RPCDataParser.monitorLog(this.mTransportContext);
        return this.mTransportContext.perfLog;
    }

    public final void e(RpcBufferedInputStream rpcBufferedInputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac23381c", new Object[]{this, rpcBufferedInputStream});
            return;
        }
        try {
            this.mHttpManager.addDataSize(rpcBufferedInputStream.getReaded());
            this.u += rpcBufferedInputStream.getReaded();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "calcTrafficConsume exception", th);
        }
    }

    public HttpResponse executeExtClientRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("e54e4c6c", new Object[]{this});
        }
        HttpUrlRequest httpUrlRequest = this.mOriginRequest;
        if (httpUrlRequest != null && !httpUrlRequest.isRpcHttp2()) {
            LogCatUtil.debug(TAG, "rpc config Http1.1");
            return null;
        } else if (!isCanUseExtTransport()) {
            return null;
        } else {
            if (L()) {
                LogCatUtil.debug(TAG, "opeType:" + getOperationType() + ",go H2");
                return null;
            }
            if (isRpcRequest() && TransportStrategy.isEnabledTransportByLocalAmnet() && TransportStrategy.isNetworkRunInSingleProcess(TransportEnvUtil.getContext())) {
                if (TransportStrategy.isEnableMarsMultiLink()) {
                    this.mTransportContext.choseExtLinkType = 4;
                } else {
                    LogCatUtil.debug(TAG, "marsMultiLink switch is off,use Http1.1");
                    return null;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            ExtTransportOffice instance = ExtTransportOffice.getInstance();
            ExtTransportClient extTransportClient = instance.isEnableExtTransport(this.mContext) ? instance.getExtTransportClient(this.mContext, this.mTransportContext) : null;
            if (extTransportClient == null) {
                return null;
            }
            this.mTransportContext.getCurrentDataContainer().timeItemDot("ALL_TIME", currentTimeMillis);
            LogCatUtil.debug(TAG, "By " + this.mTransportContext.currentReqInfo.protocol + " to request. operationType=" + getOperationType() + " url=" + getTargetHttpUriRequest().getURI().toString() + " allowRetry=" + this.mOriginRequest.allowRetry);
            putStalledTime();
            if (extTransportClient.getModuleCategory() != 0) {
                getTargetHttpUriRequest().removeHeaders("Accept-Encoding");
                getTargetHttpUriRequest().removeHeaders("Connection");
            }
            HttpResponse execute = extTransportClient.execute(getTargetHttpHost(), getTargetHttpUriRequest(), this.mLocalContext);
            if (extTransportClient.getModuleCategory() == 0) {
                etagRpcv2Adapter(execute);
            }
            V();
            return execute;
        }
    }

    public HttpResponse executeHttpClientRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("225e25dd", new Object[]{this});
        }
        LogCatUtil.debug(TAG, "By Http/Https to request. operationType=" + getOperationType() + "  method=" + getTargetHttpUriRequest().getMethod() + " url=" + getTargetHttpUriRequest().getURI().toString() + " allowRetry=" + this.mOriginRequest.allowRetry);
        if (!TextUtils.isEmpty(getOperationType())) {
            this.mTransportContext.dcList.clear();
        }
        J();
        getHttpClient().setHttpRequestRetryHandler(sHttpRequestRetryHandler);
        TransportStrategy.fillCurrentReqInfo(true, "https", this.mTransportContext);
        if (this.s) {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), "RETRY", "T");
        }
        HttpParams params = getTargetHttpUriRequest().getParams();
        params.setParameter("http.protocol.element-charset", "utf-8");
        this.mTransportContext.getCurrentDataContainer().timeItemDot("ALL_TIME");
        HttpEntity postData = getPostData();
        if (postData != null) {
            this.mLocalContext.setAttribute(TransportConstants.KEY_IS_REPEATABLE, Boolean.valueOf(postData.isRepeatable()));
            DataContainer currentDataContainer = this.mTransportContext.getCurrentDataContainer();
            currentDataContainer.putDataItem(RPCDataItems.REQ_SIZE, postData.getContentLength() + "");
        }
        putStalledTime();
        HttpProxyWrapper determineProxyPlanner = determineProxyPlanner(params);
        HttpEntityEnclosingRequest targetHttpUriRequest = getTargetHttpUriRequest();
        if (!(targetHttpUriRequest instanceof HttpEntityEnclosingRequest)) {
            this.mLocalContext.setAttribute(TransportConstants.KEY_IS_REPEATABLE, Boolean.TRUE);
        } else {
            ZNetworkHttpEntityWrapper entity = targetHttpUriRequest.getEntity();
            if (entity instanceof ZNetworkHttpEntityWrapper) {
                entity.setHttpWorker(this);
            }
        }
        HttpHost targetHttpHost = getTargetHttpHost();
        params.setParameter("http.route.forced-route", HttpClientPlannerHelper.determineRoute(getHttpClient(), targetHttpHost, targetHttpUriRequest, this.mLocalContext));
        HttpResponse executeHttpClientRequest = executeHttpClientRequest(targetHttpHost, targetHttpUriRequest, this.mLocalContext);
        byte b = determineProxyPlanner.lastGoodProxy;
        if (b != -1) {
            LAST_GOOD_PROXY = b;
        }
        etagRpcv2Adapter(executeHttpClientRequest);
        V();
        return executeHttpClientRequest;
    }

    public void extNoteTraficConsume(TraficConsumeModel traficConsumeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf97df1a", new Object[]{this, traficConsumeModel});
        }
    }

    public final void f(String str, int i, Throwable th, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e51781", new Object[]{this, str, new Integer(i), th, map});
            return;
        }
        try {
            if (NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                if (isRpcRequest() && (th instanceof MMTPException) && ((MMTPException) th).errorCode == 1004) {
                    LogCatUtil.debug(TAG, "MMTP_EXP_IPC_ERROR happened, tick failure");
                    ExtTransportTunnelWatchdog.getInstance().mrpcFailureTick();
                }
                if ((!isRpcRequest() || !MiscUtils.isMdapApi(getOperationType())) && i != 13) {
                    NetworkServiceTracer instance = NetworkServiceTracer.getInstance();
                    byte b = this.mTransportContext.bizType;
                    instance.recordError(b, i, str + ":" + th.getMessage(), map);
                }
            }
        } catch (Exception unused) {
            LogCatUtil.debug(TAG, "reportError2Monitor exception");
        }
    }

    public void fillResponse(HttpUrlResponse httpUrlResponse, HttpResponse httpResponse) {
        String str;
        String str2;
        Header contentType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2deed6", new Object[]{this, httpUrlResponse, httpResponse});
            return;
        }
        try {
            long period = getPeriod(httpResponse);
            if (httpResponse.getEntity() == null || (contentType = httpResponse.getEntity().getContentType()) == null) {
                str2 = null;
                str = null;
            } else {
                HashMap<String, String> contentType2 = getContentType(contentType.getValue());
                str2 = contentType2.get(HeaderConstant.HEADER_KEY_CHARSET);
                str = contentType2.get("Content-Type");
            }
            httpUrlResponse.setContentType(str);
            httpUrlResponse.setCharset(str2);
            httpUrlResponse.setCreateTime(System.currentTimeMillis());
            httpUrlResponse.setPeriod(period);
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, th);
        }
    }

    public void finallyProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd531f3", new Object[]{this});
            return;
        }
        try {
            try {
                LoginRefreshHelper.removeRpc(this, this.mContext);
                notifyNetworkState();
                d(this.q);
                x();
                r();
                if (this.mHttpResponse != null) {
                    G();
                }
                J();
            } catch (Exception e) {
                LogCatUtil.error(TAG, e);
            }
            TransportContextThreadLocalUtils.setValue(null);
            this.mOriginRequest.setTaskState(2);
        } catch (Throwable th) {
            TransportContextThreadLocalUtils.setValue(null);
            this.mOriginRequest.setTaskState(2);
            throw th;
        }
    }

    public final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.equals(str, "1")) {
            D(str2);
        } else if (TextUtils.equals(str, "0")) {
            F(str2);
        }
    }

    public String getBodyContent(HttpUrlResponse httpUrlResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6acd167c", new Object[]{this, httpUrlResponse});
        }
        if (MiscUtils.isInLogBackList(this.k)) {
            return "根据相关法律法规和政策，本结果未予显示";
        }
        if (httpUrlResponse == null || httpUrlResponse.getResData() == null) {
            return "";
        }
        return new String(httpUrlResponse.getResData());
    }

    public HashMap<String, String> getContentType(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f204c6d1", new Object[]{this, str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split2 = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            hashMap.put(split2[0], split2[1]);
        }
        return hashMap;
    }

    public ActThreadPoolExecutor getCurrentThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActThreadPoolExecutor) ipChange.ipc$dispatch("b48453cd", new Object[]{this});
        }
        return this.mCurrentThreadPoolExecutor;
    }

    public ArrayList<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("387b9a31", new Object[]{this});
        }
        return this.mOriginRequest.getHeaders();
    }

    public AndroidHttpClient getHttpClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("909d0b72", new Object[]{this});
        }
        return this.mHttpManager.getHttpClient();
    }

    public HttpResponse getHttpResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("b24cc325", new Object[]{this});
        }
        return this.mHttpResponse;
    }

    public String getOperationType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76cb9a4e", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.k)) {
            return this.k;
        }
        String tag = getOriginRequest().getTag("operationType");
        this.k = tag;
        if (!TextUtils.isEmpty(tag)) {
            return this.k;
        }
        return "";
    }

    public HttpHost getOriginHttpHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("ab8c5a11", new Object[]{this});
        }
        HttpHost httpHost = this.d;
        if (httpHost != null) {
            return httpHost;
        }
        URL O = O();
        HttpHost httpHost2 = new HttpHost(O.getHost(), N(), O.getProtocol());
        this.d = httpHost2;
        return httpHost2;
    }

    public HttpUrlRequest getOriginRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlRequest) ipChange.ipc$dispatch("38bfcd30", new Object[]{this});
        }
        return this.mOriginRequest;
    }

    public HttpEntity getPostData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpEntity) ipChange.ipc$dispatch("8ef8bfe2", new Object[]{this});
        }
        HttpEntity httpEntity = this.c;
        if (httpEntity != null) {
            return httpEntity;
        }
        HttpEntity httpEntity2 = this.mOriginRequest.getHttpEntity();
        if (httpEntity2 != null) {
            this.c = httpEntity2;
            i(httpEntity2);
            return this.c;
        }
        InputStream inputStream = this.mOriginRequest.getInputStream();
        if (inputStream != null) {
            RpcInputStreamEntity rpcInputStreamEntity = new RpcInputStreamEntity(inputStream, this.mOriginRequest.getDataLength());
            this.c = rpcInputStreamEntity;
            i(rpcInputStreamEntity);
            return this.c;
        }
        HttpForm httpForm = this.mOriginRequest.getHttpForm();
        if (httpForm != null) {
            this.c = httpForm;
            i(httpForm);
            return httpForm;
        }
        byte[] reqData = this.mOriginRequest.getReqData();
        if (reqData != null) {
            if (isUseSelfEncrypt()) {
                this.c = SelfEncryptUtils.getEncryptedEntity(reqData, this.clientRpcPack, this.mOriginRequest);
            } else if (!this.mTransportContext.reqGzip || !this.mOriginRequest.isCompress()) {
                this.c = new ByteArrayEntity(reqData);
            } else {
                this.c = AndroidHttpClient.getCompressedEntity(reqData, null);
            }
            Header S = S();
            if (S != null) {
                AbstractHttpEntity abstractHttpEntity = this.c;
                if (abstractHttpEntity instanceof AbstractHttpEntity) {
                    abstractHttpEntity.setContentType(S);
                }
            } else {
                AbstractHttpEntity abstractHttpEntity2 = this.c;
                if (abstractHttpEntity2 instanceof AbstractHttpEntity) {
                    abstractHttpEntity2.setContentType(this.mOriginRequest.getContentType());
                }
            }
        }
        HttpEntityEnclosingRequest httpEntityEnclosingRequest = this.f4082a;
        if (httpEntityEnclosingRequest != null && (httpEntityEnclosingRequest instanceof HttpEntityEnclosingRequest)) {
            this.c = httpEntityEnclosingRequest.getEntity();
        }
        return this.c;
    }

    public HttpHost getTargetHttpHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("bda84e86", new Object[]{this});
        }
        HttpHost httpHost = this.t;
        if (httpHost != null) {
            return httpHost;
        }
        URI uri = getTargetHttpUriRequest().getURI();
        HttpHost httpHost2 = new HttpHost(uri.toURL().getHost(), uri.getPort(), uri.getScheme());
        this.t = httpHost2;
        return httpHost2;
    }

    public HttpUriRequest getTargetHttpUriRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("437adaaf", new Object[]{this});
        }
        HttpUriRequest httpUriRequest = this.f4082a;
        if (httpUriRequest != null) {
            try {
                if (httpUriRequest.isAborted()) {
                    HttpRequestBase httpRequestBase = this.f4082a;
                    if (httpRequestBase instanceof HttpRequestBase) {
                        this.f4082a = (HttpUriRequest) httpRequestBase.clone();
                    }
                }
            } catch (Throwable th) {
                LogCatUtil.warn(TAG, "getTargetHttpUriRequest. clone error " + th.toString());
            }
            return this.f4082a;
        }
        HttpUrlRequest originRequest = getOriginRequest();
        HttpEntityEnclosingRequest httpUriRequest2 = originRequest.getHttpUriRequest();
        if (httpUriRequest2 != null) {
            this.f4082a = httpUriRequest2;
            if (httpUriRequest2 instanceof HttpEntityEnclosingRequest) {
                this.c = httpUriRequest2.getEntity();
            }
            return this.f4082a;
        }
        HttpUriRequest createHttpUriRequestByMethod = RequestMethodUtils.createHttpUriRequestByMethod(getPostData(), originRequest.getRequestMethod(), getTargetUri());
        this.f4082a = createHttpUriRequestByMethod;
        originRequest.setHttpUriRequest(createHttpUriRequestByMethod);
        return this.f4082a;
    }

    public URI getTargetUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("d510eccc", new Object[]{this});
        }
        URI uri = this.f;
        if (uri != null) {
            return uri;
        }
        String url = this.mOriginRequest.getUrl();
        if (!TextUtils.isEmpty(url)) {
            URI c = c(new URI(url));
            this.f = c;
            return c;
        }
        throw new RuntimeException("url should not be null");
    }

    public final void h(List<Cookie> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (this.mOriginRequest.isResetCookie()) {
            s(list);
        } else {
            MiscUtils.isDebugger(this.mContext);
        }
    }

    public HttpUrlHeader handleResponseHeader(HttpResponse httpResponse) {
        Header[] allHeaders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlHeader) ipChange.ipc$dispatch("1f849742", new Object[]{this, httpResponse});
        }
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.addHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        HttpUrlRequest originRequest = getOriginRequest();
        StringBuilder sb = new StringBuilder();
        sb.append(originRequest.getUrl());
        String tag = originRequest.getTag(TransportConstants.KEY_REQ_DATA_DIGEST);
        if (!TextUtils.isEmpty(tag)) {
            sb.append(tag);
        }
        if (!TextUtils.isEmpty(originRequest.getContentType())) {
            sb.append(originRequest.getContentType());
        }
        if (!TextUtils.isEmpty(getOperationType())) {
            sb.append(getOperationType());
        }
        return hashcode(sb.toString().hashCode());
    }

    public int hashcode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa1a0c34", new Object[]{this, new Integer(i)})).intValue();
        }
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    public final void i(HttpEntity httpEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8380adbb", new Object[]{this, httpEntity});
            return;
        }
        Header S = S();
        if (S != null) {
            if (httpEntity instanceof AbstractHttpEntity) {
                ((AbstractHttpEntity) httpEntity).setContentType(S);
            }
        } else if (!TextUtils.isEmpty(this.mOriginRequest.getContentType()) && (httpEntity instanceof AbstractHttpEntity)) {
            ((AbstractHttpEntity) httpEntity).setContentType(this.mOriginRequest.getContentType());
        }
    }

    public boolean isRpcRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36595c3f", new Object[]{this})).booleanValue();
        }
        if (this.mTransportContext.bizType == 1) {
            return true;
        }
        return false;
    }

    public boolean isShouldReportTraffic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9deac37", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    public boolean isTraficConsumeAccept(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f297ccf2", new Object[]{this, str})).booleanValue();
        }
        return MonitorInfoUtil.isTraficConsumeAccept(str);
    }

    public final void j(HttpHost httpHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7297f56", new Object[]{this, httpHost});
        } else if (httpHost != null) {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.PROXY, "T");
            DataContainer currentDataContainer = this.mTransportContext.getCurrentDataContainer();
            DataItemsUtil.putDataItem2DataContainer(currentDataContainer, "TARGET_HOST", httpHost.getHostName() + ":" + httpHost.getPort());
        } else {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.PROXY, UTConstant.Args.UT_SUCCESS_F);
        }
    }

    public final void k(HttpResponse httpResponse) {
        Header firstHeader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e3a31d", new Object[]{this, httpResponse});
            return;
        }
        try {
            if (httpResponse == null) {
                LogCatUtil.debug(TAG, "processRetry,httpResponse is null");
            } else if (httpResponse.getStatusLine().getStatusCode() == 200 && (firstHeader = httpResponse.getFirstHeader(HeaderConstant.HEADER_KEY_RETRYABLE_2)) != null) {
                String value = firstHeader.getValue();
                LogCatUtil.debug(TAG, "response header [retryable] = " + value);
                String operationType = getOperationType();
                if (TextUtils.isEmpty(operationType)) {
                    LogCatUtil.debug(TAG, "operationType is null,not rpc");
                } else {
                    g(value, operationType);
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "processRetry ", th);
        }
    }

    public final void m(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{this, new Boolean(z), new Long(j)});
        } else if (z) {
            AlipayQosService.getInstance().estimateByStartTime(j, (byte) 5);
        }
    }

    public void monitorErrorLog(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cea8af8", new Object[]{this, th});
        } else if (!isRpcRequest() || !MiscUtils.isMdapApi(getOperationType())) {
            MonitorErrorLogHelper.log(TAG, new HttpException(getOperationType(), th));
        } else {
            LogCatUtil.error(TAG, th);
        }
    }

    public String monitorLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e95f1af", new Object[]{this});
        }
        return doMonitorLog();
    }

    public void notifyNetworkState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25701b73", new Object[]{this});
        } else if ((MiscUtils.isInAlipayClient(this.mContext) || TransportStrategy.isEnabledEnhanceNetworkModule()) && !MiscUtils.isPushProcess(this.mContext)) {
            ExtTransportOffice instance = ExtTransportOffice.getInstance();
            HttpResponse httpResponse = this.mHttpResponse;
            if (httpResponse == null || httpResponse.getStatusLine() == null) {
                if (this.r != null) {
                    instance.networkStateNotify(false);
                }
            } else if (this.mHttpResponse.getStatusLine().getStatusCode() == 200) {
                instance.networkStateNotify(true);
            } else if (this.redirectHandler.isRedirectRequested(this.mHttpResponse, this.mLocalContext)) {
                if (this.mHttpResponse.getStatusLine().getStatusCode() != 302) {
                    instance.networkStateNotify(true);
                }
            } else if (this.mHttpResponse.getStatusLine().getStatusCode() > 0) {
                instance.networkStateNotify(true);
            } else if (this.r != null) {
                instance.networkStateNotify(false);
            }
        }
    }

    public final boolean o(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb9ad891", new Object[]{this, th})).booleanValue();
        }
        if (!canRetryForNetworkAvailable()) {
            LogCatUtil.info(TAG, "canRetryCurrTaskForProxyNetwork. can't retry for proxy， because network is invalid。");
            return false;
        } else if (this.m == -1 || this.mOriginRequest.isCanceled()) {
            return false;
        } else {
            if (!(th instanceof IOException) && !(th instanceof GeneralSecurityException)) {
                return false;
            }
            if ((!ZHttpRequestRetryHandler.isCanRetryForStandardHttpRequest(getOriginRequest()) || !U()) && (th instanceof SocketTimeoutException)) {
                return false;
            }
            this.n = this.m;
            this.m = (byte) -1;
            LAST_GOOD_PROXY = (byte) -1;
            LogCatUtil.debug(TAG, "Switch proxy model and retry, retryProxy is " + ((int) this.n));
            return true;
        }
    }

    public void preCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bab5a2c", new Object[]{this});
            return;
        }
        this.mOriginRequest.setTaskState(1);
        if (!this.mOriginRequest.isCanceled()) {
            this.mOriginRequest.setNetworkThread(Thread.currentThread());
            if (!NetworkUtils.isNetworkAvailable(this.mContext)) {
                if (TextUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.IGNORE_NETWORK_STATE), "T")) {
                    this.w = true;
                    LogCatUtil.debug(TAG, "API=" + getOperationType() + ",ignoreNetState on,go on");
                } else if (this.mOriginRequest.isAllowNonNet()) {
                    LogCatUtil.debug(TAG, "API=" + getOperationType() + ",allowNonNet is set,go on..");
                } else {
                    throw new HttpException((Integer) 1, "The network is not available");
                }
            }
            String url = this.mOriginRequest.getUrl();
            if (!TextUtils.isEmpty(getOperationType())) {
                url = url + "#" + getOperationType();
            }
            if (!isTraficConsumeAccept(url)) {
                if (UserNetworkPreferencesManager.getInstance().isDisabledAllTraficLimit()) {
                    LogCatUtil.info(TAG, "[preCheck] Disabled trafic limit， url = " + url);
                } else {
                    throw new HttpException((Integer) 11, url + " trafic beyond limit");
                }
            }
            H(this.mOriginRequest.getUrl());
            return;
        }
        throw new HttpException((Integer) 13, "Cancel request :" + this.mOriginRequest.getUrl() + ",cancelMsg:" + this.mOriginRequest.getCancelMsg());
    }

    public void processExtTransException(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1394a26", new Object[]{this, exc});
            return;
        }
        MonitorErrorLogHelper.warn(TAG, new ExtTransportException("", MiscUtils.getRootCause(exc)));
        if (this.mOriginRequest.isCanceled()) {
            throw new HttpException((Integer) 13, "Cancel request :" + this.mOriginRequest.getUrl() + ",cancelMsg:" + this.mOriginRequest.getCancelMsg());
        } else if (!isRpcRequest()) {
            LogCatUtil.printInfo(TAG, "非RPC请求,不使用Https进行重试: " + exc.getMessage());
            throw exc;
        } else if (StrategyUtil.isRetryTaskForSwitchRpc(getOperationType()) || TransportStrategy.allowHttpsRetry(getOperationType())) {
            LogCatUtil.info(TAG, "Extended transport module connection failed, retry using Https.");
            Q();
        } else if (MiscUtils.grayscale(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.NO_DOWN_HTTPS))) {
            LogCatUtil.printInfo(TAG, "连接失败,没有开启使用Https进行重试: " + exc.getMessage());
            throw exc;
        } else if (!TransportStrategy.isDowngradeToHttps()) {
            LogCatUtil.printInfo(TAG, "连接失败,重试超过3次: " + exc.getMessage());
            throw exc;
        } else if (RetryService.getInstance().isSupportResend(getOperationType(), this.mOriginRequest.allowRetry)) {
            LogCatUtil.error(TAG, "扩展传输模块连接失败,使用Https进行重试", exc);
            Q();
        } else {
            LogCatUtil.printInfo(TAG, "连接失败,不允许使用Https进行重试: " + exc.getMessage());
            throw exc;
        }
    }

    public void processRespCookies(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a33361ac", new Object[]{this, httpResponse});
        } else if (!MiscUtils.isInAlipayClient(this.mContext) || !MiscUtils.isPushProcess(this.mContext)) {
            LoginRefreshHelper.checkIn(this, this.mContext);
            List<Cookie> cookies = this.b.getCookies();
            h(cookies);
            if (cookies.isEmpty()) {
                LogCatUtil.debug(TAG, "processRespCookies. cookies is empty");
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Cookie cookie : cookies) {
                if (isRpcRequest() && !TextUtils.isEmpty(cookie.getName()) && !TextUtils.isEmpty(cookie.getValue())) {
                    linkedHashMap.put(cookie.getName().trim(), cookie.getValue().trim());
                }
                StringBuilder sb = new StringBuilder();
                sb.append(cookie.getName());
                sb.append("=");
                sb.append(cookie.getValue());
                if (!TextUtils.isEmpty(cookie.getDomain())) {
                    sb.append("; domain=");
                    sb.append(cookie.getDomain());
                }
                if (!TextUtils.isEmpty(cookie.getPath())) {
                    sb.append("; path=");
                    sb.append(cookie.getPath());
                }
                if (cookie.getExpiryDate() != null) {
                    try {
                        String formatDate = DateUtils.formatDate(cookie.getExpiryDate(), EXPIRES_PATTERN);
                        sb.append("; ");
                        sb.append("expires=");
                        sb.append(formatDate);
                    } catch (Throwable th) {
                        LogCatUtil.warn(TAG, "expires format exception. " + th.toString());
                    }
                }
                if (cookie.isSecure()) {
                    sb.append("; Secure");
                }
                String sb2 = sb.toString();
                String uri = getTargetUri().toString();
                String domain = cookie.getDomain();
                if (TextUtils.isEmpty(domain)) {
                    domain = uri;
                } else if (!domain.startsWith(".")) {
                    domain = ".".concat(domain);
                }
                LogCatUtil.debug(TAG, "set cookie. domain=" + domain + "  cookie=" + sb2 + " .url=" + uri);
                CookieAccessHelper.applyCookie(domain, sb2, this.mContext);
            }
            if (!linkedHashMap.isEmpty()) {
                GwCookieCacheHelper.setCookies(MiscUtils.getTopDomain(getTargetUri().toString()), linkedHashMap);
            }
            linkedHashMap.clear();
            CookieAccessHelper.asyncFlushCookie();
        } else {
            LogCatUtil.info(TAG, "processRespCookies. Another process is not operating a cookie.");
        }
    }

    public Response processResponse(HttpResponse httpResponse, HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("b5f0373c", new Object[]{this, httpResponse, httpUrlRequest});
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
        LogCatUtil.debug(TAG, "Url: " + httpUrlRequest.getUrl() + " resCode:" + statusCode);
        if (statusCode == 206 || statusCode == 200 || willHandleOtherCode(statusCode, reasonPhrase)) {
            k(httpResponse);
            return handleResponse(httpUrlRequest, httpResponse, statusCode, reasonPhrase);
        }
        t(httpResponse);
        consumeContent();
        throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
    }

    public void putStalledTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ee6b24", new Object[]{this});
        } else if (this.l != -1) {
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.STALLED_TIME, String.valueOf(this.l));
            DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.RPC_ALL_TIME, String.valueOf(this.mTransportContext.startExecutionTime));
        }
    }

    public void putSubCommonMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1824545", new Object[]{this});
        }
    }

    public final byte[] q(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{this, bArr});
        }
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    return SecurityUtil.encrypt(bArr);
                }
            } catch (Throwable th) {
                LogCatUtil.error(TAG, "taoBaoEncrypt exception", th);
            }
        }
        return null;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.RPC_ASYNC_EXE_MONITOR, "T")) {
            asyncMonitorLog();
        } else {
            monitorLog();
        }
    }

    public final void s(List<Cookie> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.FORCE_RESET_COOKIE, "T")) {
            if (!MiscUtils.isAlipayGW(getOriginRequest().getUrl())) {
                R();
                return;
            }
            for (Cookie cookie : list) {
                String name = cookie.getName();
                if (!TextUtils.isEmpty(name) && name.equalsIgnoreCase("ALIPAYJSESSIONID")) {
                    R();
                    return;
                }
            }
        }
    }

    public void setCurrentThreadPoolExecutor(ActThreadPoolExecutor actThreadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b02243", new Object[]{this, actThreadPoolExecutor});
        } else {
            this.mCurrentThreadPoolExecutor = actThreadPoolExecutor;
        }
    }

    public void setShouldReportTraffic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2d1439", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public final void t(HttpResponse httpResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bc62de", new Object[]{this, httpResponse});
            return;
        }
        try {
            Header[] allHeaders = httpResponse.getAllHeaders();
            long id = Thread.currentThread().getId();
            String str2 = this.k;
            if (allHeaders != null) {
                str = Arrays.toString(allHeaders);
            } else {
                str = "is null";
            }
            LogCatUtil.info(TAG, "logHttpResponse, threadid = " + id + "; HttpResponse success. mOperationType=[" + str2 + "] . response header=[" + str + "]. ");
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "[logHttpResponse] log fail. " + th.toString());
        }
    }

    public final boolean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RPC_H2_LIST);
        if (!TextUtils.isEmpty(stringValue) && !TextUtils.isEmpty(str)) {
            for (String str2 : stringValue.split(",")) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final byte[] w(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8ef4ac6d", new Object[]{this, bArr});
        }
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    return SecurityUtil.decrypt(bArr);
                }
            } catch (Throwable th) {
                LogCatUtil.error(TAG, "taoBaoDecrypt exception", th);
            }
        }
        return null;
    }

    public void whenExceptionFlushUploadLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f696fb", new Object[]{this});
            return;
        }
        try {
            MonitorInfoUtil.flushMonitorLog();
            MonitorInfoUtil.doUploadMonitorLog();
        } catch (Throwable unused) {
        }
    }

    public boolean willHandleOtherCode(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd5a0127", new Object[]{this, new Integer(i), str})).booleanValue();
        }
        if (i == 304) {
            return true;
        }
        return false;
    }

    public final void x() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.q != null) {
                if (TextUtils.equals(this.mTransportContext.getCurrentDataContainer().getDataItem("RETRY"), "T")) {
                    ((HttpUrlResponse) this.q).getHeader().addHead(HeaderConstant.HEADER_KEY_PARAM_RETRY, "T");
                } else {
                    ((HttpUrlResponse) this.q).getHeader().addHead(HeaderConstant.HEADER_KEY_PARAM_RETRY, UTConstant.Args.UT_SUCCESS_F);
                }
                String dataItem = this.mTransportContext.getCurrentDataContainer().getDataItem(RPCDataItems.REQ_SIZE);
                String dataItem2 = this.mTransportContext.getCurrentDataContainer().getDataItem(RPCDataItems.RES_SIZE);
                long j2 = 0;
                if (!TextUtils.isEmpty(dataItem)) {
                    j = Long.parseLong(dataItem);
                } else {
                    j = 0;
                }
                if (!TextUtils.isEmpty(dataItem2)) {
                    j2 = Long.parseLong(dataItem2);
                }
                ((HttpUrlResponse) this.q).getHeader().addHead(HeaderConstant.HEADER_KEY_PARAM_REQ_SIZE, String.valueOf(j));
                ((HttpUrlResponse) this.q).getHeader().addHead(HeaderConstant.HEADER_KEY_PARAM_RES_SIZE, String.valueOf(j2));
                ((HttpUrlResponse) this.q).getHeader().addHead(HeaderConstant.HEADER_KEY_PARAM_TRAFFIC, String.valueOf(j + j2));
                ((HttpUrlResponse) this.q).getHeader().addHead(HeaderConstant.HEADER_KEY_CLIENT_TRACE_ID, this.mTransportContext.rpcUUID);
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    public final Object y(String str) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c56c56fe", new Object[]{this, str});
        }
        Serializable serializable = null;
        try {
            Serializable serializable2 = this.g.getSerializable(null, str);
            if (serializable2 == null) {
                return null;
            }
            try {
                if (serializable2 instanceof CachedResponseWrapper) {
                    CachedResponseWrapper cachedResponseWrapper = (CachedResponseWrapper) serializable2;
                    byte[] w = w(cachedResponseWrapper.getValue());
                    if (w == null) {
                        A(str);
                        return null;
                    }
                    cachedResponseWrapper.setValue(w);
                }
                return serializable2;
            } catch (Exception e2) {
                e = e2;
                serializable = serializable2;
                LogCatUtil.warn(TAG, e);
                return serializable;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Response call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("376e5a1", new Object[]{this});
        }
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            this.mTransportContext.url = getTargetHttpUriRequest().getURI().toString();
                                                            preCheck();
                                                            TransportContextThreadLocalUtils.setValue(this.mTransportContext);
                                                            if (!TextUtils.isEmpty(getOperationType()) && !getOriginRequest().isBgRpc()) {
                                                                Process.setThreadPriority(-4);
                                                                Thread.currentThread().setPriority(10);
                                                            }
                                                            TransportContext transportContext = this.mTransportContext;
                                                            if (transportContext.startExecutionTime < 1) {
                                                                transportContext.startExecutionTime = System.currentTimeMillis();
                                                            }
                                                            this.mTransportContext.taskRetryedCount = C();
                                                            this.l = this.mTransportContext.startExecutionTime - this.o;
                                                            if (I() != null) {
                                                                I().onPreExecute(this.mOriginRequest);
                                                            }
                                                            LoginRefreshHelper.recordRpc(this, this.mContext);
                                                            TransportStrategy.configInit(this.mContext, getOperationType(), this.mTransportContext);
                                                            addRequestHeaders();
                                                            this.mLocalContext.setAttribute(TransportConstants.KEY_NET_CONTEXT, this.mTransportContext);
                                                            this.mLocalContext.setAttribute("http.cookie-store", this.b);
                                                            T();
                                                            long currentTimeMillis = System.currentTimeMillis();
                                                            this.mHttpResponse = executeRequest();
                                                            this.mHttpManager.addConnectTime(System.currentTimeMillis() - currentTimeMillis);
                                                            processRespCookies(this.mHttpResponse);
                                                            Response processResponse = processResponse(this.mHttpResponse, this.mOriginRequest);
                                                            this.q = processResponse;
                                                            finallyProcess();
                                                            return processResponse;
                                                        } catch (SSLHandshakeException e) {
                                                            Response processException = processException("SSLHandshakeException", 2, e, false);
                                                            finallyProcess();
                                                            return processException;
                                                        }
                                                    } catch (GeneralSecurityException e2) {
                                                        Response processException2 = processException(e2.getClass().getSimpleName(), 2, e2, false);
                                                        finallyProcess();
                                                        return processException2;
                                                    }
                                                } catch (SSLException e3) {
                                                    Response processException3 = processException("SSLException", 2, e3, false);
                                                    finallyProcess();
                                                    return processException3;
                                                }
                                            } catch (SocketTimeoutException e4) {
                                                AlipayQosService.getInstance().estimate(5000.0d, (byte) 5);
                                                Response processException4 = processException("SocketTimeoutException", 4, e4, false);
                                                finallyProcess();
                                                return processException4;
                                            }
                                        } catch (HttpException e5) {
                                            Response processException5 = processException("HttpException", e5.getCode(), e5, false);
                                            finallyProcess();
                                            return processException5;
                                        }
                                    } catch (HttpHostConnectException e6) {
                                        Response processException6 = processException("HttpHostConnectException", 8, e6, false);
                                        finallyProcess();
                                        return processException6;
                                    }
                                } catch (UnknownHostException e7) {
                                    Response processException7 = processException("UnknownHostException", 9, e7, false);
                                    finallyProcess();
                                    return processException7;
                                }
                            } catch (IOException e8) {
                                Response processException8 = processException("IOException", 6, e8, canRetryForIoException(e8));
                                finallyProcess();
                                return processException8;
                            }
                        } catch (NullPointerException e9) {
                            Response processException9 = processException("NullPointerException", 0, e9, true);
                            finallyProcess();
                            return processException9;
                        }
                    } catch (ConnectionPoolTimeoutException e10) {
                        Response processException10 = processException("ConnectionPoolTimeoutException", 3, e10, false);
                        finallyProcess();
                        return processException10;
                    } catch (URISyntaxException e11) {
                        try {
                            this.mOriginRequest.setFailedException(e11);
                            I().onFailed(this.mOriginRequest, 10, e11.toString());
                        } catch (Exception e12) {
                            LogCatUtil.warn(TAG, "getTransportCallback().onFailed1 exception : " + e12.toString());
                        }
                        DataContainer currentDataContainer = this.mTransportContext.getCurrentDataContainer();
                        DataItemsUtil.putDataItem2DataContainer(currentDataContainer, "ERROR", "URISyntaxException:" + e11.getMessage());
                        throw new RuntimeException("Url parser error!", e11.getCause());
                    }
                } catch (NoHttpResponseException e13) {
                    Response processException11 = processException("NoHttpResponseException", 5, e13, false);
                    finallyProcess();
                    return processException11;
                } catch (ClientProtocolException e14) {
                    Response processException12 = processException("ClientProtocolException", 0, e14, true);
                    finallyProcess();
                    return processException12;
                }
            } catch (SSLPeerUnverifiedException e15) {
                Response processException13 = processException("SSLPeerUnverifiedException", 2, e15, false);
                finallyProcess();
                return processException13;
            } catch (ConnectTimeoutException e16) {
                Response processException14 = processException("ConnectTimeoutException", 3, e16, false);
                finallyProcess();
                return processException14;
            }
        }
    }

    public void consumeContent(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ada2099", new Object[]{this, httpResponse});
        } else if (httpResponse == null || httpResponse.getEntity() == null) {
            LogCatUtil.printInfo(TAG, "Consume content don't execution!");
        } else {
            try {
                httpResponse.getEntity().consumeContent();
                LogCatUtil.printInfo(TAG, "Consume content finish! threadid= " + Thread.currentThread().getId());
            } catch (Throwable th) {
                LogCatUtil.warn(TAG, "consumeContent exception. " + th.toString());
            }
        }
    }

    public void copyHeaders(HttpUriRequest httpUriRequest, ArrayList<Header> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103025c", new Object[]{this, httpUriRequest, arrayList});
        } else if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<Header> it = arrayList.iterator();
            while (it.hasNext()) {
                httpUriRequest.addHeader(it.next());
            }
        }
    }

    public HttpResponse executeRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("3d7f048a", new Object[]{this});
        }
        setTimeout();
        HttpResponse httpResponse = null;
        try {
            setShouldReportTraffic(true);
            this.mLocalContext.setAttribute(TransportConstants.KEY_ORIGIN_REQUEST, this.mOriginRequest);
            try {
                httpResponse = executeExtClientRequest();
                if (httpResponse != null) {
                    return httpResponse;
                }
            } catch (Exception e) {
                processExtTransException(e);
            }
            HttpResponse executeHttpClientRequest = executeHttpClientRequest();
            if (executeHttpClientRequest != null) {
                getOriginRequest().setHttpResponse(executeHttpClientRequest);
                DataItemsUtil.putDataItem2ContainerAnyway(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.HRC, String.valueOf(executeHttpClientRequest.getStatusLine().getStatusCode()));
            }
            return executeHttpClientRequest;
        } finally {
            if (httpResponse != null) {
                getOriginRequest().setHttpResponse(httpResponse);
                DataItemsUtil.putDataItem2ContainerAnyway(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.HRC, String.valueOf(httpResponse.getStatusLine().getStatusCode()));
            }
        }
    }

    public long getPeriod(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3408a5e7", new Object[]{this, httpResponse})).longValue();
        }
        Header firstHeader = httpResponse.getFirstHeader(HttpConstant.CACHE_CONTROL);
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return parserMaxage(split);
                } catch (NumberFormatException e) {
                    LogCatUtil.warn(TAG, e);
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 == null) {
            return 0L;
        }
        try {
            return AndroidHttpClient.parseDate(firstHeader2.getValue()) - System.currentTimeMillis();
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "parse expire exception. expire value: " + firstHeader2.getValue() + ",  exception: " + th.toString());
            return 0L;
        }
    }

    public HttpResponse handleResponseForRedirect(HttpRequest httpRequest, HttpParams httpParams, HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("e1957663", new Object[]{this, httpRequest, httpParams, httpResponse});
        }
        if ((!TextUtils.isEmpty(getOperationType()) && !TextUtils.equals(getOperationType(), DownloadRequest.OPERATION_TYPE) && !TextUtils.equals(getOperationType(), H5HttpUrlRequest.OPERATION_TYPE)) || !this.redirectHandler.isRedirectRequested(httpResponse, this.mLocalContext)) {
            return httpResponse;
        }
        processRespCookies(httpResponse);
        int i = this.p;
        if (i < 5) {
            this.p = i + 1;
            try {
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                LogCatUtil.warn(TAG, "Wait cookie sync. " + e.toString());
            }
            URI locationURI = this.redirectHandler.getLocationURI(httpResponse, this.mLocalContext);
            H(locationURI.toString());
            URI c = c(locationURI);
            HttpHost httpHost = new HttpHost(c.toURL().getHost(), c.getPort(), c.getScheme());
            HttpGet httpGet = new HttpGet(c);
            httpGet.setHeaders(httpRequest.getAllHeaders());
            httpGet.setParams(httpParams);
            httpGet.removeHeaders("Cookie");
            httpGet.removeHeaders("Cookie2");
            httpGet.addHeader("Cookie", CookieAccessHelper.getCookie(c.toString(), this.mContext));
            try {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.REDIRECT_URL, c.toString());
                LogCatUtil.info(TAG, "Redirect request new headers : ");
                printHeaderLog(httpGet.getAllHeaders());
            } catch (Exception e2) {
                LogCatUtil.warn(TAG, e2);
            }
            httpGet.getParams().setParameter("http.route.forced-route", HttpClientPlannerHelper.determineRoute(getHttpClient(), httpHost, httpGet, this.mLocalContext));
            LogCatUtil.debug(TAG, "By Http/Https to redirect request. operationType=" + getOperationType() + "  method=" + httpGet.getMethod() + " url=" + httpGet.getURI().toString());
            return handleResponseForRedirect(httpGet, httpGet.getParams(), doExecuteRequestByHttpClient(httpHost, httpGet, this.mLocalContext));
        }
        throw new RedirectException("Maximum redirects (5) exceeded");
    }

    public final void l(HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965be7b3", new Object[]{this, httpParams});
            return;
        }
        httpParams.setParameter("http.route.default-proxy", ConnRouteParams.NO_HOST);
        if (this.n == -1) {
            this.m = (byte) 1;
        }
    }

    public final boolean p(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d512c02", new Object[]{this, httpUriRequest})).booleanValue();
        }
        try {
            if (isRpcRequest()) {
                return L();
            }
            return v(httpUriRequest);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isGoUrlConnection ex:" + th.toString());
            return false;
        }
    }

    public void setProxyModel(HttpParams httpParams, HttpHost httpHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e278c765", new Object[]{this, httpParams, httpHost});
            return;
        }
        j(httpHost);
        httpParams.setParameter("http.route.default-proxy", httpHost);
        if (this.n == -1) {
            this.m = (byte) 0;
        }
    }

    public void setTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e8f3a6", new Object[]{this});
            return;
        }
        HttpParams params = getTargetHttpUriRequest().getParams();
        long timeout = getOriginRequest().getTimeout();
        long readTimeout = TransportStrategy.getReadTimeout(this.mContext);
        long max = Math.max(timeout, readTimeout);
        HttpConnectionParams.setSoTimeout(params, (int) max);
        int connTimeout = TransportStrategy.getConnTimeout(this.mContext);
        if (getOriginRequest().isRadicalStrategy()) {
            this.mTransportContext.mRadicalStrategy = true;
            connTimeout = Math.max(TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.RADICAL_STRATEGY_TIME_OUT), 5000);
            LogCatUtil.info(TAG, "[setTimeout] Enable radical strategy. connTimeout = " + connTimeout);
        }
        HttpConnectionParams.setConnectionTimeout(params, connTimeout);
        TransportContext transportContext = this.mTransportContext;
        if (transportContext.allowedRetryDuration == -1) {
            transportContext.allowedRetryDuration = (int) (connTimeout + max);
        }
        LogCatUtil.info(TAG, "setTimeout. custReadTimeout=" + timeout + ", networkReadTimeout=" + readTimeout + ", endReadtimeout=" + max + ", connTimeout=" + connTimeout);
    }

    public final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        try {
            if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.RPC_GO_H2_SWITCH))) {
                LogCatUtil.debug(TAG, "rpcGoH2Switch is off");
                return false;
            } else if (Build.VERSION.SDK_INT < 23 || !isRpcRequest() || !getTargetHttpUriRequest().getURI().getScheme().equalsIgnoreCase("https") || !u(getOperationType())) {
                return false;
            } else {
                LogCatUtil.printInfo(TAG, "API:" + getOperationType() + ",go H2");
                return true;
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isGoUrlConnectionForRPC ex:" + th.toString());
            return false;
        }
    }

    public HttpProxyWrapper determineProxyPlanner(HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpProxyWrapper) ipChange.ipc$dispatch("be8a16cf", new Object[]{this, httpParams});
        }
        HttpProxyWrapper httpProxyWrapper = new HttpProxyWrapper();
        HttpHost proxyOfEnhanced = NetworkUtils.getProxyOfEnhanced(this.mContext);
        httpProxyWrapper.proxy = proxyOfEnhanced;
        if (proxyOfEnhanced == null) {
            httpParams.setParameter("http.route.default-proxy", ConnRouteParams.NO_HOST);
            httpProxyWrapper.proxy = null;
            return httpProxyWrapper;
        }
        if (getOriginRequest().isCapture()) {
            LogCatUtil.info(TAG, "determineProxyPlanner. request capture: " + getOriginRequest().isCapture());
            j(httpProxyWrapper.proxy);
            httpParams.setParameter("http.route.default-proxy", httpProxyWrapper.proxy);
        } else {
            int networkType = NetworkUtils.getNetworkType(this.mContext);
            byte b = LAST_GOOD_PROXY;
            if (b != -1) {
                if (b == 1) {
                    setProxyModel(httpParams, httpProxyWrapper.proxy);
                } else {
                    l(httpParams);
                    httpProxyWrapper.proxy = null;
                }
            } else if ((!n(networkType) || this.n != -1) && this.n != 1) {
                l(httpParams);
                httpProxyWrapper.lastGoodProxy = (byte) 0;
                httpProxyWrapper.proxy = null;
            } else {
                setProxyModel(httpParams, httpProxyWrapper.proxy);
                httpProxyWrapper.lastGoodProxy = (byte) 1;
            }
        }
        return httpProxyWrapper;
    }

    public void etagRpcv2Adapter(HttpResponse httpResponse) {
        Header[] allHeaders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75458df", new Object[]{this, httpResponse});
            return;
        }
        try {
            String tag = getOriginRequest().getTag(TransportConstants.KEY_RPC_VERSION);
            if (!TextUtils.isEmpty(tag) && TextUtils.equals(tag, "2")) {
                Header[] headers = httpResponse.getHeaders(HeaderConstant.HEADER_KEY_RESULT_STATUS);
                if (httpResponse.getStatusLine().getStatusCode() == 200 && TextUtils.equals(headers[0].getValue(), "8001")) {
                    httpResponse.setStatusLine(HttpVersion.HTTP_1_1, 304, "Not Modified");
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("print headers:  ");
            for (Header header : httpResponse.getAllHeaders()) {
                sb.append(header.getName());
                sb.append("=");
                sb.append(header.getValue());
                sb.append(",");
            }
            LogCatUtil.error(TAG, "Illegal response. " + sb.toString(), e);
        }
    }

    public boolean isCanUseExtTransport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b999f214", new Object[]{this})).booleanValue();
        }
        String tag = this.mOriginRequest.getTag(TransportConstants.KEY_FORCE_HTTP);
        if (!TextUtils.isEmpty(tag) && TextUtils.equals(tag, "true")) {
            return false;
        }
        if (!MiscUtils.isInAlipayClient(this.mContext) && !TransportStrategy.isEnabledEnhanceNetworkModule()) {
            return false;
        }
        if (MiscUtils.isPushProcess(this.mContext)) {
            LogCatUtil.printInfo(TAG, "===> Rpc push process does not use spdy <===");
            return false;
        } else if (!this.mOriginRequest.isContainerHeader(HeaderConstant.HEADER_KEY_VERSION)) {
            return false;
        } else {
            URL O = O();
            String tag2 = getOriginRequest().getTag(TransportConstants.KEY_IS_CUST_GW_URL);
            if (!TextUtils.isEmpty(tag2) && tag2.equalsIgnoreCase("true") && TextUtils.equals("http", O.getProtocol())) {
                LogCatUtil.debug(TAG, "isCanUseExtTransport,http protocol do not use ExtTransport");
                return false;
            } else if (this.mOriginRequest.isRpcHttp2()) {
                return true;
            } else {
                if (!TransportStrategy.checkCanUseExtTransportByURL(O, this.mContext)) {
                    return false;
                }
                return !StrategyUtil.isSwitchRpc(getOperationType()) || TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.AFTER_LOGIN_GO_EXT, "T");
            }
        }
    }

    public boolean isUseSelfEncrypt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b4173c7", new Object[]{this})).booleanValue();
        }
        try {
            if (!SelfEncryptUtils.isRpcEncryptSwitchOn()) {
                LogCatUtil.debug(TAG, "rpcSelfEncryptSwitch is off");
                return false;
            }
            boolean equals = TextUtils.equals(this.mOriginRequest.getRequestMethod(), "GET");
            if (MiscUtils.isDebugger(this.mContext)) {
                LogCatUtil.debug(TAG, "isRpc: " + isRpcRequest() + " ,isGetMethod: " + equals + " ,isNeedSelfEncrypt: " + SelfEncryptUtils.isNeedSelfEncrypt() + " ,isInGwWhiteList: " + SelfEncryptUtils.isInGwWhiteList(this.mOriginRequest.getUrl()) + " ,isDefaultGlobalCrypt: " + SelfEncryptUtils.isDefaultGlobalCrypt());
            }
            if (!isRpcRequest() || equals || !SelfEncryptUtils.isNeedSelfEncrypt() || !SelfEncryptUtils.isInGwWhiteList(this.mOriginRequest.getUrl())) {
                return false;
            }
            if (SelfEncryptUtils.isDefaultGlobalCrypt()) {
                boolean isDisableEncrypt = true ^ this.mOriginRequest.isDisableEncrypt();
                LogCatUtil.debug(TAG, "isDisableEncrypt: " + this.mOriginRequest.isDisableEncrypt() + " ,result: " + isDisableEncrypt);
                return isDisableEncrypt;
            }
            boolean isEnableEncrypt = this.mOriginRequest.isEnableEncrypt();
            LogCatUtil.debug(TAG, "isEnableEncrypt: " + this.mOriginRequest.isEnableEncrypt() + " ,result: " + isEnableEncrypt);
            return isEnableEncrypt;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isUseSelfEncrypt ex:" + th.toString());
            return false;
        }
    }

    public final boolean n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        LogCatUtil.info(TAG, "isFirstUseProxy request capture: " + getOriginRequest().isCapture());
        if (MiscUtils.isDebugger(this.mContext)) {
            if (TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.DEBUG_HW_FIRST_USE_PROXY, "T")) {
                return true;
            }
            LogCatUtil.info(TAG, "isFirstUseProxy. DEBUG_HW_FIRST_USE_PROXY is false.");
            return false;
        } else if (i != 1 && !getOriginRequest().isCapture()) {
            return false;
        } else {
            LogCatUtil.info(TAG, "firstUseProxy");
            return true;
        }
    }

    public long parserMaxage(String[] strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d1291d2", new Object[]{this, strArr})).longValue();
        }
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i]) && (str = strArr[i + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception e) {
                    LogCatUtil.warn(TAG, "parserMaxage exception : " + e.toString());
                }
            }
        }
        return 0L;
    }

    public void printHeaderLog(Header[] headerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296704f5", new Object[]{this, headerArr});
        } else if (headerArr != null) {
            StringBuilder sb = new StringBuilder();
            for (Header header : headerArr) {
                sb.append(header.getName() + ":" + header.getValue());
                sb.append(", ");
            }
            LogCatUtil.info(TAG, "printHeaderLog.  : " + sb.toString());
        }
    }

    public Response processException(String str, int i, Throwable th, boolean z) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("cc0ab7ad", new Object[]{this, str, new Integer(i), th, new Boolean(z)});
        }
        try {
            LogCatUtil.error(TAG, "processException,code=[" + i + "] canRetry=[" + z + "] e=[" + th.toString() + "]", th);
            TransportStrategy.incrementRpcErrorCount();
            String th2 = th.toString();
            if (th instanceof HttpException) {
                HttpException httpException = (HttpException) th;
                int code = httpException.getCode();
                th2 = httpException.getMsg();
                i = code;
            }
            if (this.mOriginRequest.isCanceled()) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), "CANCEL", "T");
                if (i != 13) {
                    th2 = this.mOriginRequest.getCancelMsg();
                    i = 13;
                }
                z = false;
            }
            Map<String, String> E = E();
            if (!(th instanceof HttpException)) {
                monitorErrorLog(th);
                StringBuilder sb = new StringBuilder();
                if (this.mOriginRequest.isCanceled() && !TextUtils.isEmpty(this.mOriginRequest.getCancelMsg())) {
                    sb.append(this.mOriginRequest.getCancelMsg());
                    sb.append(" System error:");
                }
                sb.append(str);
                sb.append(":");
                if (TextUtils.isEmpty(th.getMessage())) {
                    str2 = th.toString();
                } else {
                    str2 = th.getMessage();
                }
                sb.append(str2);
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), "ERROR", sb.toString());
                f(str, i, th, E);
            } else if (((HttpException) th).getCode() != 1) {
                DataContainer currentDataContainer = this.mTransportContext.getCurrentDataContainer();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(":");
                if (TextUtils.isEmpty(th.getMessage())) {
                    str3 = th.toString();
                } else {
                    str3 = th.getMessage();
                }
                sb2.append(str3);
                DataItemsUtil.putDataItem2DataContainer(currentDataContainer, "ERROR", sb2.toString());
                monitorErrorLog(th);
                f(str, i, th, E);
            }
            if (this.mOriginRequest.isCanceled() || (!o(th) && !canRetryCurrTaskForSubBiz(th) && (!z || !B()))) {
                abort();
                try {
                    String monitorLog = monitorLog();
                    if (!TextUtils.isEmpty(monitorLog)) {
                        th2 = th2 + " " + monitorLog;
                    }
                } catch (Throwable unused) {
                }
                if (I() != null) {
                    this.mOriginRequest.setFailedException(th);
                    try {
                        I().onFailed(this.mOriginRequest, i, th2);
                    } catch (Throwable unused2) {
                    }
                }
                if (th instanceof HttpException) {
                    this.r = th;
                    throw ((HttpException) th);
                }
                HttpException httpException2 = new HttpException(Integer.valueOf(i), th2, th);
                this.r = httpException2;
                throw httpException2;
            }
            Response a2 = a(str);
            whenExceptionFlushUploadLog();
            return a2;
        } catch (Throwable th3) {
            whenExceptionFlushUploadLog();
            throw th3;
        }
    }

    public void putCommonMonitorDataItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cdf57d", new Object[]{this});
            return;
        }
        try {
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.SWITCH_TAG_LOG);
            if (!TextUtils.isEmpty(stringValue)) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.SWITCH_TAG_LOG, stringValue);
            }
            if (getOriginRequest().isBgRpc()) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.PRIO, "BG");
            } else {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.PRIO, "FG");
            }
            if (this.w) {
                DataItemsUtil.putDataItem2ContainerAnyway(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.IGN_ERR, "T");
            }
            if (MiscUtils.isAtFrontDesk(this.mContext)) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.GROUND, "FG");
            } else {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.GROUND, "BG");
            }
            int qosLevel = AlipayQosService.getInstance().getQosLevel();
            double rto = AlipayQosService.getInstance().getRto();
            DataContainer currentDataContainer = this.mTransportContext.getCurrentDataContainer();
            DataItemsUtil.putDataItem2DataContainer(currentDataContainer, RPCDataItems.QOS, qosLevel + "_" + String.format("%.4f", Double.valueOf(rto)));
            HttpResponse httpResponse = this.mHttpResponse;
            if (httpResponse != null) {
                Header firstHeader = httpResponse.getFirstHeader(TBImageFlowMonitor.VIA);
                if (firstHeader != null) {
                    String value = firstHeader.getValue();
                    if (!TextUtils.isEmpty(value)) {
                        DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.CDN_VIA, value.replace(",", "，"));
                    }
                }
                Header firstHeader2 = this.mHttpResponse.getFirstHeader(RPCDataItems.CDN_EAGLEID);
                if (firstHeader2 != null) {
                    String value2 = firstHeader2.getValue();
                    if (!TextUtils.isEmpty(value2)) {
                        DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.CDN_EAGLEID, value2);
                    }
                }
            }
            String tag = getOriginRequest().getTag("bizId");
            if (!TextUtils.isEmpty(tag)) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), "bizId", tag);
            }
            HttpUrlRequest httpUrlRequest = this.mOriginRequest;
            if (httpUrlRequest != null && httpUrlRequest.getDataLength() > 0) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.REQUSET_BODY_RAW_SIZE, String.valueOf(this.mOriginRequest.getDataLength()));
            }
            String requestMethod = this.mOriginRequest.getRequestMethod();
            if (isRpcRequest() && TextUtils.equals(requestMethod, "GET")) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.REQUEST_METHOD, requestMethod);
            }
            if (isUseSelfEncrypt()) {
                DataItemsUtil.putDataItem2DataContainer(this.mTransportContext.getCurrentDataContainer(), RPCDataItems.USE_SELF_ENCODE, "T");
            }
            MonitorLogRecordUtil.recordMultMainProcessItem(this.mTransportContext, this.mContext);
            z();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    public void resetRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed95aad", new Object[]{this});
            return;
        }
        try {
            for (Header header : getTargetHttpUriRequest().getAllHeaders()) {
                getTargetHttpUriRequest().removeHeaders(header.getName());
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "resetRequestHeaders ex:" + th.toString());
        }
    }

    public final boolean v(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b29c661", new Object[]{this, httpUriRequest})).booleanValue();
        }
        try {
            if (!MiscUtils.grayscaleUtdidForABTest(TransportConfigureItem.GO_URLCONNECTION_SWITCH)) {
                LogCatUtil.debug(TAG, "go urlConnectSwitch is off");
                return false;
            } else if (Build.VERSION.SDK_INT < 23) {
                return false;
            } else {
                if (this.mTransportContext.enableHttpCache) {
                    return true;
                }
                if (!httpUriRequest.getURI().getScheme().equalsIgnoreCase("https") || isRpcRequest()) {
                    return false;
                }
                if (getOriginRequest().isUseSystemH2()) {
                    LogCatUtil.debug(TAG, "host:" + httpUriRequest.getURI().getHost() + ",set use system h2,go H2");
                    return true;
                } else if (!MiscUtils.isInUrlconnectionHostList(httpUriRequest.getURI().getHost())) {
                    return false;
                } else {
                    LogCatUtil.debug(TAG, "host:" + httpUriRequest.getURI().getHost() + ",go H2");
                    return true;
                }
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "isGoUrlConnectionForRSRC ex:" + th.toString());
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:37|(10:(3:77|39|(18:41|70|42|43|73|49|(1:53)|56|58|75|59|60|61|62|(1:64)|65|66|79))|75|59|60|61|62|(0)|65|66|79)|48|73|49|(2:51|53)|56|58) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0109, code lost:
        r0 = r9;
        r9 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c A[Catch: all -> 0x0187, TRY_LEAVE, TryCatch #7 {all -> 0x01ab, blocks: (B:59:0x0134, B:66:0x01a2, B:61:0x0157, B:62:0x0176, B:64:0x017c, B:60:0x013a, B:65:0x0197), top: B:75:0x0134 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.http.HttpWorker.z():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0237 A[Catch: all -> 0x023e, TryCatch #11 {all -> 0x023e, blocks: (B:66:0x021a, B:68:0x0237, B:70:0x023b, B:71:0x023d, B:74:0x0242), top: B:120:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0264 A[Catch: all -> 0x0262, TryCatch #1 {all -> 0x0262, blocks: (B:76:0x024b, B:77:0x0261, B:80:0x0264, B:81:0x0268), top: B:101:0x0235 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alipay.mobile.common.transport.http.ResponseSizeModel writeData(org.apache.http.HttpEntity r32, long r33, java.io.OutputStream r35) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.http.HttpWorker.writeData(org.apache.http.HttpEntity, long, java.io.OutputStream):com.alipay.mobile.common.transport.http.ResponseSizeModel");
    }

    public Response handleResponse(HttpUrlRequest httpUrlRequest, HttpResponse httpResponse, int i, String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("4fc44930", new Object[]{this, httpUrlRequest, httpResponse, new Integer(i), str});
        }
        LogCatUtil.printInfo(TAG, "开始handle，handleResponse-1," + Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        HttpUrlResponse httpUrlResponse = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (entity != null && httpResponse.getStatusLine().getStatusCode() == 200) {
            LogCatUtil.debug(TAG, "200，开始处理，handleResponse-2,threadid = " + Thread.currentThread().getId());
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    ResponseSizeModel writeData = writeData(entity, 0L, byteArrayOutputStream2);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (isUseSelfEncrypt() && writeData.compressedSize > 0) {
                        byteArray = SelfEncryptUtils.getDecryptedContent(byteArray, this.clientRpcPack);
                    }
                    Header[] headers = httpResponse.getHeaders(HeaderConstant.HEADER_KEY_ETAG);
                    if (headers.length > 0) {
                        byte[] q = q(byteArray);
                        if (q == null) {
                            this.i = false;
                            LogCatUtil.info(TAG, "[handleResponse]  Etag fail");
                        } else if (getOriginRequest().isUseEtag()) {
                            String value = headers[0].getValue();
                            CachedResponseWrapper cachedResponseWrapper = new CachedResponseWrapper();
                            cachedResponseWrapper.setEtag(value);
                            cachedResponseWrapper.setValue(q);
                            cachedResponseWrapper.setTypeHeader(httpResponse.getEntity().getContentType());
                            this.g.putSerializable(null, HeaderConstant.HEADER_KEY_ETAG, this.j, cachedResponseWrapper, new Date().getTime(), 604800000L, "Serializable");
                            this.i = true;
                            LogCatUtil.info(TAG, "[handleResponse]  Etag success ， etag = " + value);
                        }
                    } else {
                        this.i = false;
                    }
                    this.mHttpManager.addSocketTime(System.currentTimeMillis() - currentTimeMillis);
                    HttpUrlResponse httpUrlResponse2 = new HttpUrlResponse(handleResponseHeader(httpResponse), i, str, byteArray);
                    fillResponse(httpUrlResponse2, httpResponse);
                    A(this.j);
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception e) {
                        LogCatUtil.error(TAG, e);
                    }
                    consumeContent();
                    LogCatUtil.printInfo(TAG, "finally,handleResponse");
                    httpUrlResponse = httpUrlResponse2;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    A(this.j);
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e2) {
                            LogCatUtil.error(TAG, e2);
                        }
                    }
                    consumeContent();
                    LogCatUtil.printInfo(TAG, "finally,handleResponse");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (httpResponse.getStatusLine().getStatusCode() == 304) {
            httpUrlResponse = b(httpResponse, i, str, null);
        } else {
            t(httpResponse);
        }
        consumeContent();
        return httpUrlResponse;
    }

    public HttpResponse executeHttpClientRequest(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        HttpResponse doExecuteRequestByHttpClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("35d5f10e", new Object[]{this, httpHost, httpRequest, httpContext});
        }
        if (p((HttpUriRequest) httpRequest)) {
            try {
                doExecuteRequestByHttpClient = AndroidH2UrlConnection.getInstance(this.mContext).execute(httpHost, httpRequest, httpContext);
            } catch (RequestSwitchDirectionException unused) {
                LogCatUtil.warn(TAG, "[executeHttpClientRequest] Downgrade to httpclient.");
                doExecuteRequestByHttpClient = doExecuteRequestByHttpClient(httpHost, httpRequest, httpContext);
            }
        } else {
            doExecuteRequestByHttpClient = doExecuteRequestByHttpClient(httpHost, httpRequest, httpContext);
        }
        return handleResponseForRedirect(httpRequest, httpRequest.getParams(), doExecuteRequestByHttpClient);
    }
}
