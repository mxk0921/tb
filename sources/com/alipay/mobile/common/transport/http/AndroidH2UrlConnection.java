package com.alipay.mobile.common.transport.http;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.io.RpcBufferedOutputStream;
import com.alipay.mobile.common.transport.monitor.DataContainer;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.ssl.ZCustSSLSocketFactory;
import com.alipay.mobile.common.transport.utils.DownloadUtils;
import com.alipay.mobile.common.transport.utils.HttpUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AndroidH2UrlConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AndroidH2UrlConnection d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4069a;
    public HttpUrlRequest b = null;
    public Object c;

    public AndroidH2UrlConnection(Context context) {
        this.f4069a = context.getApplicationContext();
        System.setProperty("http.keepAliveDuration", "30000");
        System.setProperty("http.maxConnections", "19");
    }

    public static synchronized AndroidH2UrlConnection getInstance(Context context) {
        AndroidH2UrlConnection androidH2UrlConnection;
        synchronized (AndroidH2UrlConnection.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AndroidH2UrlConnection) ipChange.ipc$dispatch("efa98148", new Object[]{context});
            }
            AndroidH2UrlConnection androidH2UrlConnection2 = d;
            if (androidH2UrlConnection2 != null) {
                return androidH2UrlConnection2;
            }
            synchronized (AndroidH2UrlConnection.class) {
                if (d == null) {
                    d = new AndroidH2UrlConnection(context);
                }
                androidH2UrlConnection = d;
            }
            return androidH2UrlConnection;
        }
    }

    @Deprecated
    public static synchronized AndroidH2UrlConnection newInstance(Context context) {
        synchronized (AndroidH2UrlConnection.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AndroidH2UrlConnection) ipChange.ipc$dispatch("d2986e92", new Object[]{context});
            }
            return getInstance(context);
        }
    }

    public final Object a(HttpURLConnection httpURLConnection) {
        Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
        declaredField.setAccessible(true);
        return declaredField.get(httpURLConnection);
    }

    public final HttpEntity b(HttpRequest httpRequest) {
        HttpEntity entity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpEntity) ipChange.ipc$dispatch("67c445e6", new Object[]{this, httpRequest});
        }
        if ((httpRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity()) != null) {
            return entity;
        }
        return null;
    }

    public final void c(TransportContext transportContext, HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c238a9c8", new Object[]{this, transportContext, httpURLConnection});
        } else if (transportContext != null && httpURLConnection != null) {
            if (!transportContext.enableHttpCache) {
                m(httpURLConnection);
                return;
            }
            httpURLConnection.setUseCaches(true);
            if (transportContext.cacheSetupTime > 0) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.H5_CACHE_SETUP_TIME, Integer.toString((int) transportContext.cacheSetupTime));
            }
        }
    }

    public final void d(TransportContext transportContext, HttpURLConnection httpURLConnection, BasicHttpResponse basicHttpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fdb5bb", new Object[]{this, transportContext, httpURLConnection, basicHttpResponse});
        } else if (basicHttpResponse != null && transportContext != null) {
            Header firstHeader = basicHttpResponse.getFirstHeader("X-Android-Selected-Protocol");
            String str = "";
            String value = firstHeader != null ? firstHeader.getValue() : str;
            if (!TextUtils.isEmpty(value)) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.PROTOCOL, value);
            }
            StringBuilder sb = new StringBuilder("[monitorFromRespHeaderInfos] urlconnection code:");
            sb.append(httpURLConnection.getResponseCode());
            sb.append(",protocol:");
            if (TextUtils.isEmpty(value)) {
                value = "null";
            }
            sb.append(value);
            LogCatUtil.info("AndroidH2UrlConnection", sb.toString());
            if (transportContext.enableHttpCache) {
                Header firstHeader2 = basicHttpResponse.getFirstHeader("X-Android-Response-Source");
                if (firstHeader2 != null) {
                    str = firstHeader2.getValue();
                }
                if (!TextUtils.isEmpty(str)) {
                    transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.H5_RESPONSE_SOURCE, str);
                }
            }
        }
    }

    public final void e(TransportContext transportContext, HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de50bb5", new Object[]{this, transportContext, httpRequest, httpURLConnection});
            return;
        }
        k(transportContext, httpRequest, httpURLConnection);
        HttpEntity b = b(httpRequest);
        if (b != null) {
            Header contentType = b.getContentType();
            if (contentType != null) {
                httpURLConnection.setRequestProperty(contentType.getName(), contentType.getValue());
            }
            Header contentEncoding = b.getContentEncoding();
            if (contentEncoding != null) {
                httpURLConnection.setRequestProperty(contentEncoding.getName(), contentEncoding.getValue());
            }
            if (b.isChunked() || b.getContentLength() < 0) {
                httpURLConnection.setChunkedStreamingMode(0);
            } else if (b.getContentLength() <= 8192) {
                httpURLConnection.setRequestProperty("Content-Length", Long.toString(b.getContentLength()));
            } else {
                httpURLConnection.setFixedLengthStreamingMode((int) b.getContentLength());
            }
        }
    }

    public final void f(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("connectionPool");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Class<?> cls = obj2.getClass();
            Field declaredField2 = cls.getDeclaredField("maxIdleConnections");
            declaredField2.setAccessible(true);
            declaredField2.set(obj2, 19);
            Field declaredField3 = cls.getDeclaredField("keepAliveDurationNs");
            declaredField3.setAccessible(true);
            declaredField3.set(obj2, 30000000000L);
        } catch (Throwable th) {
            LogCatUtil.error("AndroidH2UrlConnection", "hookConnectionPool ex:" + th.toString());
        }
    }

    public final void g(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else {
            throw new IOException(th);
        }
    }

    public HttpUrlRequest getHttpUrlRequest(HttpContext httpContext) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlRequest) ipChange.ipc$dispatch("b4ed21f7", new Object[]{this, httpContext});
        }
        HttpUrlRequest httpUrlRequest = this.b;
        if (httpUrlRequest != null) {
            return httpUrlRequest;
        }
        HttpUrlRequest httpUrlRequest2 = null;
        try {
            httpUrlRequest2 = (HttpUrlRequest) httpContext.getAttribute(TransportConstants.KEY_ORIGIN_REQUEST);
            try {
                this.b = httpUrlRequest2;
            } catch (Throwable th2) {
                th = th2;
                LogCatUtil.error("AndroidH2UrlConnection", "HttpUrlRequest cast fail. " + th.toString());
                return httpUrlRequest2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return httpUrlRequest2;
    }

    public final void i(HttpRequest httpRequest, TransportContext transportContext, HttpURLConnection httpURLConnection, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cc755b", new Object[]{this, httpRequest, transportContext, httpURLConnection, httpContext});
            return;
        }
        HttpEntity b = b(httpRequest);
        if (b != null) {
            httpURLConnection.setDoOutput(true);
            if (b instanceof ByteArrayEntity) {
                httpURLConnection.getOutputStream().write(EntityUtils.toByteArray(b));
                httpURLConnection.getOutputStream().flush();
            } else {
                RpcBufferedOutputStream rpcBufferedOutputStream = new RpcBufferedOutputStream(httpURLConnection.getOutputStream());
                b.writeTo(rpcBufferedOutputStream);
                rpcBufferedOutputStream.flush();
            }
            DataContainer currentDataContainer = transportContext.getCurrentDataContainer();
            currentDataContainer.putDataItem(RPCDataItems.REQ_SIZE, b.getContentLength() + "");
        }
    }

    public final void j(HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d47170c", new Object[]{this, httpRequest, httpURLConnection});
        } else if (httpRequest instanceof HttpRequestBase) {
            httpURLConnection.setRequestMethod(((HttpRequestBase) httpRequest).getMethod());
        } else {
            httpURLConnection.setRequestMethod(httpRequest.getRequestLine().getMethod());
        }
    }

    public final void k(TransportContext transportContext, HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7945076", new Object[]{this, transportContext, httpRequest, httpURLConnection});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Header[] allHeaders = httpRequest.getAllHeaders();
            int length = allHeaders.length;
            while (i < length) {
                Header header = allHeaders[i];
                httpURLConnection.addRequestProperty(header.getName(), header.getValue());
                i++;
            }
        } else if (transportContext.isRpcBizType()) {
            Header[] allHeaders2 = httpRequest.getAllHeaders();
            int length2 = allHeaders2.length;
            while (i < length2) {
                Header header2 = allHeaders2[i];
                httpURLConnection.setRequestProperty(header2.getName(), header2.getValue());
                i++;
            }
        } else {
            HashMap hashMap = new HashMap();
            Header[] allHeaders3 = httpRequest.getAllHeaders();
            int length3 = allHeaders3.length;
            while (i < length3) {
                Header header3 = allHeaders3[i];
                String name = header3.getName();
                if (TextUtils.isEmpty(name)) {
                    LogCatUtil.warn("AndroidH2UrlConnection", "O, headerKey is null.");
                } else {
                    String lowerCase = name.toLowerCase(Locale.US);
                    String str = (String) hashMap.get(lowerCase);
                    if (TextUtils.isEmpty(str)) {
                        httpURLConnection.addRequestProperty(header3.getName(), header3.getValue());
                        hashMap.put(lowerCase, header3.getValue());
                    } else if (!TextUtils.equals(str, header3.getValue())) {
                        String str2 = "There is a duplicate header that needs to be switched to http/1.1 。key=[" + header3.getName() + "], value1=[" + str + "]、value2=[" + header3.getValue() + "].";
                        LogCatUtil.warn("AndroidH2UrlConnection", str2);
                        throw new RequestSwitchDirectionException(str2);
                    }
                }
                i++;
            }
        }
    }

    public final BasicHttpResponse n(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasicHttpResponse) ipChange.ipc$dispatch("a736fc86", new Object[]{this, httpURLConnection});
        }
        int responseCode = httpURLConnection.getResponseCode();
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(HttpVersion.HTTP_1_1, responseCode, httpURLConnection.getResponseMessage());
        if (responseCode < 400) {
            inputStream = httpURLConnection.getInputStream();
        } else {
            inputStream = httpURLConnection.getErrorStream();
        }
        if (!(responseCode == 304 && inputStream.available() == 0)) {
            InputStreamEntity inputStreamEntity = new InputStreamEntity(inputStream, httpURLConnection.getContentLength());
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                if (headerFieldKey == null) {
                    break;
                }
                BasicHeader basicHeader = new BasicHeader(headerFieldKey, httpURLConnection.getHeaderField(i));
                basicHttpResponse.addHeader(basicHeader);
                if (headerFieldKey.equalsIgnoreCase("Content-Type")) {
                    inputStreamEntity.setContentType(basicHeader);
                } else if (headerFieldKey.equalsIgnoreCase(HttpConstant.CONTENT_ENCODING)) {
                    inputStreamEntity.setContentEncoding(basicHeader);
                } else {
                    headerFieldKey.equalsIgnoreCase("Content-Length");
                }
                i++;
            }
            basicHttpResponse.setEntity(inputStreamEntity);
        }
        return basicHttpResponse;
    }

    public final void o(Object obj) {
        String str;
        if (obj == null) {
            LogCatUtil.warn("AndroidH2UrlConnection", "[closeSocket] connection is null.");
            return;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField("socket");
            declaredField.setAccessible(true);
            Socket socket = (Socket) declaredField.get(obj);
            if (socket == null || socket.isClosed()) {
                if (socket == null) {
                    str = "it's null.";
                } else {
                    str = "closed.";
                }
                LogCatUtil.warn("AndroidH2UrlConnection", "[closeSocket] Socket ".concat(str));
            } else {
                socket.close();
                LogCatUtil.info("AndroidH2UrlConnection", "[closeSocket] closeSocket success.");
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof InvocationTargetException) {
                th = ((InvocationTargetException) th).getTargetException();
            }
            LogCatUtil.warn("AndroidH2UrlConnection", " closeSocket failed. ", th);
        }
    }

    public Proxy obtainProxy(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Proxy) ipChange.ipc$dispatch("16097660", new Object[]{this, httpUriRequest});
        }
        try {
            HttpHost httpHost = (HttpHost) httpUriRequest.getParams().getParameter("http.route.default-proxy");
            Proxy proxy = (httpHost == null || ConnRouteParams.NO_HOST == httpHost) ? null : new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(httpHost.getHostName(), httpHost.getPort()));
            return proxy != null ? proxy : Proxy.NO_PROXY;
        } catch (Throwable th) {
            LogCatUtil.warn("AndroidH2UrlConnection", "obtainProxy fail", th);
            return Proxy.NO_PROXY;
        }
    }

    public HttpURLConnection openConnection(HttpUriRequest httpUriRequest, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("25a8c54f", new Object[]{this, httpUriRequest, transportContext});
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpUriRequest.getURI().toURL().openConnection(obtainProxy(httpUriRequest));
        h(httpURLConnection, httpUriRequest, transportContext);
        return httpURLConnection;
    }

    public final Object p(HttpURLConnection httpURLConnection) {
        Object a2;
        Object obj;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 23 || (a2 = a(httpURLConnection)) == null) {
                return null;
            }
            Field declaredField = a2.getClass().getDeclaredField("httpEngine");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(a2);
            if (obj2 == null) {
                return null;
            }
            if (i >= 26) {
                Field declaredField2 = obj2.getClass().getDeclaredField("httpStream");
                declaredField2.setAccessible(true);
                Object obj3 = declaredField2.get(obj2);
                Field declaredField3 = obj3.getClass().getDeclaredField("framedConnection");
                declaredField3.setAccessible(true);
                obj = declaredField3.get(obj3);
            } else {
                Field declaredField4 = obj2.getClass().getDeclaredField("connection");
                declaredField4.setAccessible(true);
                obj = declaredField4.get(obj2);
            }
            if (obj != null) {
                return obj;
            }
            LogCatUtil.warn("AndroidH2UrlConnection", "[getCurrentConnection] connection is null.");
            return null;
        } catch (Throwable th) {
            LogCatUtil.warn("AndroidH2UrlConnection", "getCurrentConnection failed. errmsg: " + th.toString());
            return null;
        }
    }

    public final void m(HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d656b12", new Object[]{this, httpURLConnection});
            return;
        }
        try {
            if (httpURLConnection.getUseCaches()) {
                httpURLConnection.setUseCaches(false);
            }
        } catch (Exception e) {
            LogCatUtil.error("AndroidH2UrlConnection", "setUseCaches2False exception=" + e.getMessage());
        }
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        Throwable th;
        TransportContext transportContext;
        Object obj;
        HttpURLConnection httpURLConnection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("9bd8925c", new Object[]{this, httpHost, httpRequest, httpContext});
        }
        try {
            try {
                transportContext = (TransportContext) httpContext.getAttribute(TransportConstants.KEY_NET_CONTEXT);
                try {
                    transportContext.getCurrentDataContainer().putDataItem("NETTUNNEL", RPCDataItems.VALUE_NETTUNNEL_URLCONNECTION);
                    if (transportContext.mRadicalStrategy) {
                        transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.RADICAL_STRATEGY, "T");
                    }
                    HttpUriRequest httpUriRequest = (HttpUriRequest) httpRequest;
                    if (transportContext.bizType == 1) {
                        httpUriRequest.getParams().setParameter(TransportConstants.KEY_DOWNGRADE_HTTPS_HOST, TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.H2_RPC_GWHOST));
                        httpUriRequest = DownloadUtils.constructNewHttpUriRequest(httpUriRequest, null, null);
                        httpHost = new HttpHost(httpUriRequest.getURI().toURL().getHost(), httpUriRequest.getURI().getPort(), httpUriRequest.getURI().getScheme());
                    }
                    httpURLConnection = openConnection(httpUriRequest, transportContext);
                    try {
                        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpUriRequest.getParams());
                        httpURLConnection.setConnectTimeout(connectionTimeout);
                        int readTimeout = TransportStrategy.getReadTimeout(this.f4069a);
                        httpURLConnection.setReadTimeout(readTimeout);
                        LogCatUtil.info("AndroidH2UrlConnection", "url: " + httpUriRequest.getURI().toURL().toString() + " ,connectTimeout: " + connectionTimeout + " ,readTimeout: " + readTimeout);
                        httpURLConnection.setInstanceFollowRedirects(false);
                        c(transportContext, httpURLConnection);
                        j(httpRequest, httpURLConnection);
                        e(transportContext, httpRequest, httpURLConnection);
                        i(httpRequest, transportContext, httpURLConnection, httpContext);
                        obj = p(httpURLConnection);
                    } catch (Throwable th2) {
                        th = th2;
                        obj = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection = null;
                    obj = null;
                }
            } catch (RequestSwitchDirectionException e) {
                throw e;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
            obj = null;
            transportContext = null;
        }
        try {
            BasicHttpResponse n = n(httpURLConnection);
            if (obj == null) {
                obj = p(httpURLConnection);
            }
            HttpUtils.extractCookiesFromResponse(httpHost, httpRequest, n, httpContext);
            d(transportContext, httpURLConnection, n);
            AndroidH2Watchdog.getInstance().resetFailCount(transportContext.bizType);
            return n;
        } catch (Throwable th5) {
            th = th5;
            if (th instanceof UndeclaredThrowableException) {
                th = ((UndeclaredThrowableException) th).getUndeclaredThrowable();
                LogCatUtil.error("AndroidH2UrlConnection", "[execute] Undeclared throwable :" + th.toString(), th);
            } else {
                LogCatUtil.error("AndroidH2UrlConnection", "[execute] Exception :" + th.toString());
            }
            try {
                AndroidH2Watchdog.getInstance().reportH2Error(transportContext.bizType, "", th.getMessage(), th);
                httpURLConnection.disconnect();
            } catch (Throwable unused) {
            }
            try {
                if (th instanceof IOException) {
                    o(obj);
                }
            } catch (Throwable th6) {
                LogCatUtil.warn("AndroidH2UrlConnection", "[execute] closeSocket error. " + th6.toString());
            }
            if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
                LogCatUtil.warn("AndroidH2UrlConnection", "[execute] AndroidH2UrlConnection. isNetworkAvailable == false ");
                g(th);
            }
            transportContext.getCurrentDataContainer().putDataItem("ERROR", th.getMessage());
            g(th);
            LogCatUtil.error("AndroidH2UrlConnection", "[execute] It's impossible to get here");
            return null;
        }
    }

    public final void h(HttpURLConnection httpURLConnection, HttpUriRequest httpUriRequest, TransportContext transportContext) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Object a2 = a(httpURLConnection);
                Field declaredField = a2.getClass().getDeclaredField("client");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(a2);
                l(obj);
                f(obj);
                Method declaredMethod = obj.getClass().getDeclaredMethod("setProtocols", List.class);
                Field declaredField2 = obj.getClass().getDeclaredField("DEFAULT_PROTOCOLS");
                declaredField2.setAccessible(true);
                declaredMethod.invoke(obj, declaredField2.get(obj.getClass()));
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(ZCustSSLSocketFactory.getSSLSocketFactory());
                }
                LogCatUtil.debug("AndroidH2UrlConnection", "modifyParamtersInUrlConnection success");
            }
        } catch (Throwable th) {
            LogCatUtil.error("AndroidH2UrlConnection", "modifyParamtersInUrlConnection ex:" + th.toString(), th);
        }
    }

    public final void l(Object obj) {
        Field field;
        if (obj == null) {
            LogCatUtil.warn("AndroidH2UrlConnection", "objOkHttpClient is null");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                field = obj.getClass().getDeclaredField("dns");
            } else {
                field = obj.getClass().getDeclaredField("network");
            }
            if (field == null) {
                LogCatUtil.info("AndroidH2UrlConnection", "network field is null, return.");
                return;
            }
            field.setAccessible(true);
            Object obj2 = this.c;
            if (obj2 != null) {
                field.set(obj, obj2);
                return;
            }
            synchronized (AndroidH2UrlConnection.class) {
                Object obj3 = this.c;
                if (obj3 != null) {
                    field.set(obj, obj3);
                    return;
                }
                Object obj4 = field.get(obj);
                if (obj4 == null) {
                    LogCatUtil.info("AndroidH2UrlConnection", "Raw network is null, return.");
                    return;
                }
                this.c = java.lang.reflect.Proxy.newProxyInstance(field.getType().getClassLoader(), new Class[]{field.getType()}, AndroidH2DnsHandler.getInstance());
                AndroidH2DnsHandler.getInstance().setRawAndroidH2DnsHandler(obj4);
                field.set(obj, this.c);
            }
        } catch (Throwable th) {
            LogCatUtil.error("AndroidH2UrlConnection", "hookH2Dns fail, error=[" + th.toString() + "]");
        }
    }
}
