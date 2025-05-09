package com.alipay.vi.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import tb.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AndroidHttpClient implements HttpClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static long DEFAULT_SYNC_MIN_GZIP_BYTES = 160;
    public static final String[] d = {"text/", "application/xml", "application/json"};
    public static final HttpRequestInterceptor e = new HttpRequestInterceptor() { // from class: com.alipay.vi.android.phone.mrpc.core.AndroidHttpClient.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7665a43", new Object[]{this, httpRequest, httpContext});
            } else if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final HttpClient f4554a;
    public RuntimeException b = new IllegalStateException("AndroidHttpClient created and never closed");
    public volatile LoggingConfiguration c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class CurlLogger implements HttpRequestInterceptor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public CurlLogger() {
        }

        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7665a43", new Object[]{this, httpRequest, httpContext});
                return;
            }
            LoggingConfiguration access$300 = AndroidHttpClient.access$300(AndroidHttpClient.this);
            if (access$300 != null && LoggingConfiguration.access$400(access$300) && (httpRequest instanceof HttpUriRequest)) {
                LoggingConfiguration.access$600(access$300, AndroidHttpClient.access$500((HttpUriRequest) httpRequest, false));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class LoggingConfiguration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f4555a;
        public final int b;

        public static /* synthetic */ boolean access$400(LoggingConfiguration loggingConfiguration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3a5420f6", new Object[]{loggingConfiguration})).booleanValue();
            }
            return Log.isLoggable(loggingConfiguration.f4555a, loggingConfiguration.b);
        }

        public static /* synthetic */ void access$600(LoggingConfiguration loggingConfiguration, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e2e90be", new Object[]{loggingConfiguration, str});
            }
        }

        public LoggingConfiguration(String str, int i) {
            this.f4555a = str;
            this.b = i;
        }
    }

    public AndroidHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f4554a = new DefaultHttpClient(clientConnectionManager, httpParams) { // from class: com.alipay.vi.android.phone.mrpc.core.AndroidHttpClient.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == -2133082364) {
                    return AndroidHttpClient.super.createHttpProcessor();
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/vi/android/phone/mrpc/core/AndroidHttpClient$2");
            }

            public ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ConnectionKeepAliveStrategy) ipChange.ipc$dispatch("aa827552", new Object[]{this});
                }
                return new ConnectionKeepAliveStrategy() { // from class: com.alipay.vi.android.phone.mrpc.core.AndroidHttpClient.2.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Number) ipChange2.ipc$dispatch("e11ceca4", new Object[]{this, httpResponse, httpContext})).longValue();
                        }
                        return m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
                    }
                };
            }

            public HttpContext createHttpContext() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (HttpContext) ipChange.ipc$dispatch("1a291a92", new Object[]{this});
                }
                BasicHttpContext basicHttpContext = new BasicHttpContext();
                basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
                basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
                basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
                return basicHttpContext;
            }

            public BasicHttpProcessor createHttpProcessor() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BasicHttpProcessor) ipChange.ipc$dispatch("80dbbf04", new Object[]{this});
                }
                BasicHttpProcessor createHttpProcessor = AndroidHttpClient.super.createHttpProcessor();
                createHttpProcessor.addRequestInterceptor(AndroidHttpClient.access$000());
                createHttpProcessor.addRequestInterceptor(new CurlLogger());
                return createHttpProcessor;
            }

            public RedirectHandler createRedirectHandler() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (RedirectHandler) ipChange.ipc$dispatch("e60fb571", new Object[]{this});
                }
                return new DefaultRedirectHandler() { // from class: com.alipay.vi.android.phone.mrpc.core.AndroidHttpClient.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;
                    public int mRedirects;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                        if (str.hashCode() == 1628537942) {
                            return new Boolean(AnonymousClass2.super.isRedirectRequested((HttpResponse) objArr[0], (HttpContext) objArr[1]));
                        }
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/vi/android/phone/mrpc/core/AndroidHttpClient$2$1");
                    }

                    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
                        int statusCode;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("61118456", new Object[]{this, httpResponse, httpContext})).booleanValue();
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
    }

    public static /* synthetic */ HttpRequestInterceptor access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpRequestInterceptor) ipChange.ipc$dispatch("aea8c3ff", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ LoggingConfiguration access$300(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoggingConfiguration) ipChange.ipc$dispatch("9573a229", new Object[]{androidHttpClient});
        }
        return androidHttpClient.c;
    }

    public static /* synthetic */ String access$500(HttpUriRequest httpUriRequest, boolean z) {
        Header[] allHeaders;
        HttpEntity entity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c32c73f6", new Object[]{httpUriRequest, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpUriRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = original.getURI();
            }
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (a(httpUriRequest)) {
                    sb.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    sb.append(" --data-binary @/tmp/$$.bin");
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    sb.append(" --data-ascii \"");
                    sb.append(byteArrayOutputStream2);
                    sb.append("\"");
                }
            } else {
                sb.append(" [TOO MUCH DATA TO INCLUDE]");
            }
        }
        return sb.toString();
    }

    public static AbstractHttpEntity getCompressedEntity(byte[] bArr, ContentResolver contentResolver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractHttpEntity) ipChange.ipc$dispatch("ead307f9", new Object[]{bArr, contentResolver});
        }
        if (bArr.length < getMinGzipSize(contentResolver)) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        byteArrayEntity.getContentLength();
        return byteArrayEntity;
    }

    public static long getMinGzipSize(ContentResolver contentResolver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6b8fce", new Object[]{contentResolver})).longValue();
        }
        return DEFAULT_SYNC_MIN_GZIP_BYTES;
    }

    public static InputStream getUngzippedContent(HttpEntity httpEntity) {
        Header contentEncoding;
        String value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("57ad3b70", new Object[]{httpEntity});
        }
        InputStream content = httpEntity.getContent();
        return (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null || !value.contains("gzip")) ? content : new GZIPInputStream(content);
    }

    public static void modifyRequestToAcceptGzipResponse(HttpRequest httpRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477c66b1", new Object[]{httpRequest});
        } else {
            httpRequest.addHeader("Accept-Encoding", "gzip");
        }
    }

    public static void modifyRequestToKeepAlive(HttpRequest httpRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08481cc", new Object[]{httpRequest});
        } else {
            httpRequest.addHeader("Connection", "Keep-Alive");
        }
    }

    public static AndroidHttpClient newInstance(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("c0fd41b0", new Object[]{str, context});
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(30000, context == null ? null : new SSLSessionCache(context)), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", "-1");
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        return new AndroidHttpClient(threadSafeClientConnManager, basicHttpParams);
    }

    public static long parseDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78e300c6", new Object[]{str})).longValue();
        }
        return HttpDateTime.parse(str);
    }

    public final void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.b != null) {
            getConnectionManager().shutdown();
            this.b = null;
        }
    }

    public final void disableCurlLogging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33227e92", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("2e48d5a1", new Object[]{this, httpUriRequest}) : this.f4554a.execute(httpUriRequest);
    }

    public final ClientConnectionManager getConnectionManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientConnectionManager) ipChange.ipc$dispatch("81729133", new Object[]{this});
        }
        return this.f4554a.getConnectionManager();
    }

    public final HttpParams getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpParams) ipChange.ipc$dispatch("233d330e", new Object[]{this});
        }
        return this.f4554a.getParams();
    }

    public final void setHttpRequestRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab38767", new Object[]{this, httpRequestRetryHandler});
        } else {
            this.f4554a.setHttpRequestRetryHandler(httpRequestRetryHandler);
        }
    }

    public final void enableCurlLogging(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5402282", new Object[]{this, str, new Integer(i)});
        } else if (str == null) {
            throw new NullPointerException("name");
        } else if (i < 2 || i > 7) {
            throw new IllegalArgumentException("Level is out of range [2..7]");
        } else {
            this.c = new LoggingConfiguration(str, i);
        }
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("ef755873", new Object[]{this, httpUriRequest, httpContext}) : this.f4554a.execute(httpUriRequest, httpContext);
    }

    public static boolean a(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d512c02", new Object[]{httpUriRequest})).booleanValue();
        }
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header header : headers) {
                if ("gzip".equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 != null) {
            for (Header header2 : headers2) {
                String[] strArr = d;
                for (int i = 0; i < 3; i++) {
                    if (header2.getValue().startsWith(strArr[i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("3908d64a", new Object[]{this, httpHost, httpRequest}) : this.f4554a.execute(httpHost, httpRequest);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("9bd8925c", new Object[]{this, httpHost, httpRequest, httpContext}) : this.f4554a.execute(httpHost, httpRequest, httpContext);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("dcc2fbcf", new Object[]{this, httpUriRequest, responseHandler}) : (T) this.f4554a.execute(httpUriRequest, responseHandler);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("3d9a9c61", new Object[]{this, httpUriRequest, responseHandler, httpContext}) : (T) this.f4554a.execute(httpUriRequest, responseHandler, httpContext);
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8d40d4f8", new Object[]{this, httpHost, httpRequest, responseHandler}) : (T) this.f4554a.execute(httpHost, httpRequest, responseHandler);
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ab154eca", new Object[]{this, httpHost, httpRequest, responseHandler, httpContext}) : (T) this.f4554a.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public static AndroidHttpClient newInstance(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("7c1ea174", new Object[]{str}) : newInstance(str, null);
    }
}
