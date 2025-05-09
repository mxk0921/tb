package com.alipay.android.msp.network.http.http;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.SocketException;
import java.security.Security;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import tb.f51;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PhoneCashierHttpClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static PhoneCashierHttpClient b;
    public static boolean c;
    public static DefaultHttpClient d;
    public static int e;

    /* renamed from: a  reason: collision with root package name */
    public HttpUriRequest f3704a;

    public static synchronized void a() {
        synchronized (PhoneCashierHttpClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c3525c", new Object[0]);
                return;
            }
            e++;
            LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.timeOutThreadInc", "sTimeOutThreadCnt:" + e);
        }
    }

    public static /* synthetic */ HttpUriRequest access$000(PhoneCashierHttpClient phoneCashierHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("82ace6fb", new Object[]{phoneCashierHttpClient});
        }
        return phoneCashierHttpClient.f3704a;
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            b();
        }
    }

    public static synchronized void b() {
        synchronized (PhoneCashierHttpClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d169dd", new Object[0]);
                return;
            }
            e--;
            LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.timeOutThreadDec", "sTimeOutThreadCnt:" + e);
        }
    }

    public static boolean isNeedShutdownAtPayEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5a0f927", new Object[0])).booleanValue();
        }
        return c;
    }

    public static PhoneCashierHttpClient newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhoneCashierHttpClient) ipChange.ipc$dispatch("5e4a1788", new Object[0]);
        }
        if (b == null) {
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
            Security.setProperty("networkaddress.cache.ttl", "-1");
            basicHttpParams.setBooleanParameter("http.protocol.expect-continue", false);
            HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, GlobalConstant.HTTP_CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(basicHttpParams, GlobalConstant.HTTP_SO_TIMEOUT);
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, GlobalConstant.HTTP_SOCKET_BUFFER_SIZE);
            HttpClientParams.setRedirecting(basicHttpParams, true);
            Scheme scheme = new Scheme("https", new ZSSLSocketFactory(), 443);
            Scheme scheme2 = new Scheme("http", PlainSocketFactory.getSocketFactory(), 80);
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(scheme);
            schemeRegistry.register(scheme2);
            ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
            ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
            ConnManagerParams.setTimeout(basicHttpParams, 60000L);
            try {
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ZThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams) { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        if (str.hashCode() == -2133082364) {
                            return PhoneCashierHttpClient.super.createHttpProcessor();
                        }
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/http/http/PhoneCashierHttpClient$2");
                    }

                    public ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (ConnectionKeepAliveStrategy) ipChange2.ipc$dispatch("aa827552", new Object[]{this});
                        }
                        return new ConnectionKeepAliveStrategy() { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Number) ipChange3.ipc$dispatch("e11ceca4", new Object[]{this, httpResponse, httpContext})).longValue();
                                }
                                return 90000L;
                            }
                        };
                    }

                    public HttpContext createHttpContext() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (HttpContext) ipChange2.ipc$dispatch("1a291a92", new Object[]{this});
                        }
                        BasicHttpContext basicHttpContext = new BasicHttpContext();
                        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
                        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
                        basicHttpContext.setAttribute("http.cookie-store", getCookieStore());
                        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
                        return basicHttpContext;
                    }

                    public BasicHttpProcessor createHttpProcessor() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (BasicHttpProcessor) ipChange2.ipc$dispatch("80dbbf04", new Object[]{this});
                        }
                        return PhoneCashierHttpClient.super.createHttpProcessor();
                    }

                    public RedirectHandler createRedirectHandler() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (RedirectHandler) ipChange2.ipc$dispatch("e60fb571", new Object[]{this});
                        }
                        return new DefaultRedirectHandler() { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;
                            public int mRedirects;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                if (str.hashCode() == 1628537942) {
                                    return new Boolean(AnonymousClass2.super.isRedirectRequested((HttpResponse) objArr[0], (HttpContext) objArr[1]));
                                }
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/http/http/PhoneCashierHttpClient$2$1");
                            }

                            public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
                                int statusCode;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Boolean) ipChange3.ipc$dispatch("61118456", new Object[]{this, httpResponse, httpContext})).booleanValue();
                                }
                                this.mRedirects++;
                                boolean isRedirectRequested = AnonymousClass2.super.isRedirectRequested(httpResponse, httpContext);
                                if (isRedirectRequested || this.mRedirects >= 5 || ((statusCode = httpResponse.getStatusLine().getStatusCode()) != 301 && statusCode != 302)) {
                                    return isRedirectRequested;
                                }
                                return true;
                            }
                        };
                    }
                };
                d = defaultHttpClient;
                defaultHttpClient.setHttpRequestRetryHandler(new HttpRequestRetryHandler() { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("ace81c4f", new Object[]{this, iOException, new Integer(i), httpContext})).booleanValue();
                        }
                        if (i >= 2) {
                            return false;
                        }
                        PluginManager.getDnsEngine().inscLoopCount();
                        if (iOException instanceof NoHttpResponseException) {
                            LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.newInstance", "try:" + i + "::Nohttp");
                            return true;
                        } else if (iOException instanceof ClientProtocolException) {
                            LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.newInstance", "try:" + i + "::ClientPro");
                            return true;
                        } else if ((iOException instanceof SocketException) || ((iOException instanceof SSLException) && iOException.getMessage() != null && iOException.getMessage().contains("pipe"))) {
                            LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.newInstance", "try:" + i + "::" + iOException.getClass().getSimpleName());
                            return true;
                        } else {
                            LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.newInstance", "try:null::".concat(iOException.getClass().getSimpleName()));
                            return false;
                        }
                    }
                });
                b = new PhoneCashierHttpClient();
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
                LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.newInstance", "不应该执行到的地方");
                d = new DefaultHttpClient(basicHttpParams);
                b = new PhoneCashierHttpClient();
            }
        }
        return b;
    }

    public static void setIsNeedShutdownAtPayEnd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2a5c4f", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ClientConnectionManager connectionManager = d.getConnectionManager();
        if (connectionManager != null) {
            connectionManager.closeExpiredConnections();
            connectionManager.closeIdleConnections((long) f51.DEF_MAX_ASYNC_SECONDS, TimeUnit.SECONDS);
        }
    }

    public HttpParams getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpParams) ipChange.ipc$dispatch("233d330e", new Object[]{this});
        }
        return d.getParams();
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        LogUtil.record(2, "PhoneCashierHttpClient", "shutdown");
        PluginManager.getDnsEngine().inscLoopCount();
        ClientConnectionManager connectionManager = d.getConnectionManager();
        if (connectionManager != null) {
            clear();
            connectionManager.shutdown();
        }
        b = null;
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("b7376892", new Object[]{this, httpUriRequest, new Integer(i)});
        }
        if (i != -1) {
            PluginManager.getDnsEngine().updateDns();
        }
        this.f3704a = httpUriRequest;
        final HandlerThread handlerThread = new HandlerThread("timeout thread");
        handlerThread.start();
        a();
        Handler handler = new Handler(handlerThread.getLooper()) { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/network/http/http/PhoneCashierHttpClient$1");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                int i2 = message.what;
                if (i2 == 0) {
                    LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.createTimeoutHandler", "COUNT_TIME_OUT");
                    sendEmptyMessageDelayed(2, 20000L);
                } else if (i2 == 2) {
                    LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.createTimeoutHandler", "TRIGGER_TIME_OUT");
                    try {
                        if (PhoneCashierHttpClient.access$000(PhoneCashierHttpClient.this) != null && !PhoneCashierHttpClient.access$000(PhoneCashierHttpClient.this).isAborted()) {
                            try {
                                PhoneCashierHttpClient.access$000(PhoneCashierHttpClient.this).abort();
                            } catch (Exception e2) {
                                LogUtil.printExceptionStackTrace(e2);
                            }
                        }
                        handlerThread.getLooper().quit();
                        PhoneCashierHttpClient.access$100();
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            }
        };
        handler.sendEmptyMessage(0);
        try {
            try {
                HttpResponse execute = d.execute(httpUriRequest);
                this.f3704a = null;
                handler.sendEmptyMessage(2);
                return execute;
            } catch (IOException e2) {
                shutdown();
                throw e2;
            } catch (AssertionError e3) {
                LogUtil.printExceptionStackTrace(e3);
                this.f3704a = null;
                handler.sendEmptyMessage(2);
                return null;
            }
        } catch (Throwable th) {
            this.f3704a = null;
            handler.sendEmptyMessage(2);
            throw th;
        }
    }
}
