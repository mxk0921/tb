package com.alipay.mobile.common.transport.http;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.HttpDns;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.apache.http.Header;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.protocol.HttpContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZHttpRequestRetryHandler implements HttpRequestRetryHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte MAX_TIMES = 3;
    public static final String TAG = "ZHttpRequestRetryHandler";

    public static final boolean isCanRetryForStandardHttpRequest(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc580942", new Object[]{httpUrlRequest})).booleanValue();
        }
        if (!httpUrlRequest.isUseHttpStdRetryModel()) {
            return true;
        }
        String requestMethod = httpUrlRequest.getRequestMethod();
        if (TextUtils.equals(requestMethod, "GET") || TextUtils.equals(requestMethod, "PUT") || TextUtils.equals(requestMethod, "HEAD")) {
            return true;
        }
        LogCatUtil.verbose(TAG, "UseHttpStdRetryStrategy model, " + requestMethod + " request method don't support retry!");
        return false;
    }

    public static boolean isShutdown(IOException iOException) {
        Throwable rootCause;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68dacc71", new Object[]{iOException})).booleanValue();
        }
        if (iOException == null || (rootCause = MiscUtils.getRootCause(iOException)) == null) {
            return false;
        }
        String th = rootCause.toString();
        if (!TextUtils.isEmpty(th) && th.contains("Connection already shutdown")) {
            return true;
        }
        return false;
    }

    public final Boolean a(HttpContext httpContext, HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("85889607", new Object[]{this, httpContext, httpUrlRequest});
        }
        return isRetryForRpc(httpUrlRequest, (TransportContext) httpContext.getAttribute(TransportConstants.KEY_NET_CONTEXT));
    }

    public final void b(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1e979c", new Object[]{this, httpUrlRequest});
        } else if (httpUrlRequest != null) {
            try {
                String host = httpUrlRequest.getHttpUriRequest().getURI().getHost();
                LogCatUtil.debug(TAG, "removeOldIpsAndUpdateDns,host=[" + host + "]");
                AlipayHttpDnsClient.getDnsClient().setErrorByHost(host);
                HttpDns.getInstance().getGetAllByNameHelper().clearCache();
            } catch (Throwable th) {
                LogCatUtil.error(TAG, th);
            }
        }
    }

    public void logRetry(HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73faf779", new Object[]{this, httpContext});
            return;
        }
        try {
            ((TransportContext) httpContext.getAttribute(TransportConstants.KEY_NET_CONTEXT)).getCurrentDataContainer().putDataItem("RETRY", "T");
        } catch (Throwable th) {
            LogCatUtil.warn(TAG, "logRetry exception: " + th.toString());
        }
    }

    public void removeOldIpsWhenUserTimeout(HttpContext httpContext, HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d25c3c", new Object[]{this, httpContext, httpUrlRequest});
            return;
        }
        TransportContext transportContext = (TransportContext) httpContext.getAttribute(TransportConstants.KEY_NET_CONTEXT);
        if (transportContext != null && System.currentTimeMillis() - transportContext.startExecutionTime >= 3000) {
            LogCatUtil.warn(TAG, "removeOldIpsWhenUserTimeout. ");
            b(httpUrlRequest);
        }
    }

    public static final int getRetryCount(HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2f375a5", new Object[]{httpContext})).intValue();
        }
        try {
            Integer num = (Integer) httpContext.getAttribute(TransportConstants.KEY_HTTP_RETRY_COUNT);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getRetryCount", th);
            return 0;
        }
    }

    public static Boolean isRetryForRpc(HttpUrlRequest httpUrlRequest, TransportContext transportContext) {
        HttpUriRequest httpUriRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("ddd21ecf", new Object[]{httpUrlRequest, transportContext});
        }
        if (transportContext == null) {
            return Boolean.FALSE;
        }
        if (transportContext.bizType != 1) {
            return null;
        }
        String tag = httpUrlRequest.getTag("operationType");
        if (TextUtils.isEmpty(tag) || (httpUriRequest = httpUrlRequest.getHttpUriRequest()) == null) {
            return null;
        }
        Header firstHeader = httpUriRequest.getFirstHeader(HeaderConstant.HEADER_KEY_RETRYABLE_2);
        if (firstHeader == null || !TextUtils.equals("1", firstHeader.getValue())) {
            LogCatUtil.debug(TAG, "rpc can't retry");
            return Boolean.FALSE;
        }
        LogCatUtil.debug(TAG, "opeType: " + tag + " ,rpc allow retry");
        return Boolean.TRUE;
    }

    public boolean isRepeatable(HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bad0ae38", new Object[]{this, httpContext})).booleanValue();
        }
        Object attribute = httpContext.getAttribute(TransportConstants.KEY_IS_REPEATABLE);
        if (attribute == null) {
            return true;
        }
        try {
            if (((Boolean) attribute).booleanValue()) {
                return true;
            }
            LogCatUtil.warn(TAG, "isRepeatable==false, no retry.");
            return false;
        } catch (Exception e) {
            LogCatUtil.warn(TAG, "isRepeatable exceptoin=[" + e.toString() + "]  no retry");
            return false;
        }
    }

    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ace81c4f", new Object[]{this, iOException, new Integer(i), httpContext})).booleanValue();
        }
        LogCatUtil.verbose(TAG, "retryRequest: executionCount=[" + i + "], exception[" + iOException.toString() + "]");
        if (i >= 3) {
            LogCatUtil.verbose(TAG, " >= 3,  no retry");
            return false;
        }
        httpContext.setAttribute(TransportConstants.KEY_HTTP_RETRY_COUNT, Integer.valueOf(i));
        if (i >= 3) {
            LogCatUtil.verbose(TAG, " >= 3,  no retry");
            return false;
        } else if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
            LogCatUtil.verbose(TAG, "Network unavailable, no retry");
            return false;
        } else {
            HttpUrlRequest httpUrlRequest = (HttpUrlRequest) httpContext.getAttribute(TransportConstants.KEY_ORIGIN_REQUEST);
            if (httpUrlRequest == null) {
                LogCatUtil.verbose(TAG, "httpUrlRequest is null, what happened?");
                return false;
            }
            removeOldIpsWhenUserTimeout(httpContext, httpUrlRequest);
            if (httpUrlRequest.isCanceled()) {
                LogCatUtil.verbose(TAG, "httpUrlRequest is already canceled");
                return false;
            } else if (!isCanRetryForStandardHttpRequest(httpUrlRequest)) {
                return false;
            } else {
                Boolean a2 = a(httpContext, httpUrlRequest);
                if (a2 != null) {
                    return a2.booleanValue();
                }
                if (isShutdown(iOException)) {
                    LogCatUtil.info(TAG, "Connection shutdown, no retry");
                    return false;
                }
                Object attribute = httpContext.getAttribute("http.target_host");
                if (attribute != null && (attribute instanceof String)) {
                    String str = (String) attribute;
                    if (str.contains("127.0.0.1") || str.contains("localhost")) {
                        LogCatUtil.verbose(TAG, "host=[" + str + "] no retry.");
                        return false;
                    }
                }
                if ((iOException instanceof NoHttpResponseException) || (iOException instanceof ClientProtocolException)) {
                    b(httpUrlRequest);
                    if (!isRepeatable(httpContext)) {
                        LogCatUtil.info(TAG, iOException.getClass().getSimpleName().concat("isRepeatable==false, no retry"));
                        return false;
                    }
                    logRetry(httpContext);
                    LogCatUtil.error(TAG, iOException.getClass().getSimpleName().concat(" retry. exception:"), iOException);
                    return true;
                }
                if (!(iOException instanceof SocketException) && !(iOException instanceof SSLException) && !(iOException instanceof SocketTimeoutException) && !(iOException instanceof ConnectionPoolTimeoutException)) {
                    boolean z = iOException instanceof UnknownHostException;
                }
                LogCatUtil.error(TAG, iOException.getClass().getSimpleName().concat(" retry. exception:"), iOException);
                logRetry(httpContext);
                return true;
            }
        }
    }
}
