package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpWorker implements Callable<Response> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HttpRequestRetryHandler j = new ZHttpRequestRetryHandler();

    /* renamed from: a  reason: collision with root package name */
    public HttpUriRequest f4563a;
    public CookieManager d;
    public AbstractHttpEntity e;
    public HttpHost f;
    public URL g;
    public String i;
    public Context mContext;
    public HttpManager mHttpManager;
    public HttpUrlRequest mRequest;
    public String mUrl;
    public final HttpContext b = new BasicHttpContext();
    public final CookieStore c = new BasicCookieStore();
    public int h = 0;

    public HttpWorker(HttpManager httpManager, HttpUrlRequest httpUrlRequest) {
        this.mHttpManager = httpManager;
        this.mContext = httpManager.mContext;
        this.mRequest = httpUrlRequest;
    }

    public final HttpUriRequest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("9f9852be", new Object[]{this});
        }
        HttpUriRequest httpUriRequest = this.f4563a;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        AbstractHttpEntity postData = getPostData();
        if (postData != null) {
            HttpPost httpPost = new HttpPost(getUri());
            httpPost.setEntity(postData);
            this.f4563a = httpPost;
        } else {
            this.f4563a = new HttpGet(getUri());
        }
        return this.f4563a;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HttpUriRequest httpUriRequest = this.f4563a;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        String tag = this.mRequest.getTag("operationType");
        this.i = tag;
        return tag;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        URL e = e();
        if (e.getPort() == -1) {
            return e.getDefaultPort();
        }
        return e.getPort();
    }

    public final URL e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("1d80a429", new Object[]{this});
        }
        URL url = this.g;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.mRequest.getUrl());
        this.g = url2;
        return url2;
    }

    public final CookieManager f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CookieManager) ipChange.ipc$dispatch("418a90dc", new Object[]{this});
        }
        CookieManager cookieManager = this.d;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager instance = CookieManager.getInstance();
        this.d = instance;
        return instance;
    }

    public void fillResponse(HttpUrlResponse httpUrlResponse, HttpResponse httpResponse) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e484d722", new Object[]{this, httpUrlResponse, httpResponse});
            return;
        }
        long period = getPeriod(httpResponse);
        Header contentType = httpResponse.getEntity().getContentType();
        if (contentType != null) {
            HashMap<String, String> contentType2 = getContentType(contentType.getValue());
            str2 = contentType2.get("charset");
            str = contentType2.get("Content-Type");
        } else {
            str2 = null;
            str = null;
        }
        httpUrlResponse.setContentType(str);
        httpUrlResponse.setCharset(str2);
        httpUrlResponse.setCreateTime(System.currentTimeMillis());
        httpUrlResponse.setPeriod(period);
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

    public ArrayList<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("387b9a31", new Object[]{this});
        }
        return this.mRequest.getHeaders();
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
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return AndroidHttpClient.parseDate(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    public AbstractHttpEntity getPostData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractHttpEntity) ipChange.ipc$dispatch("66f78a10", new Object[]{this});
        }
        AbstractHttpEntity abstractHttpEntity = this.e;
        if (abstractHttpEntity != null) {
            return abstractHttpEntity;
        }
        byte[] reqData = this.mRequest.getReqData();
        String tag = this.mRequest.getTag("gzip");
        if (reqData != null) {
            if (TextUtils.equals(tag, "true")) {
                this.e = AndroidHttpClient.getCompressedEntity(reqData, null);
            } else {
                this.e = new ByteArrayEntity(reqData);
            }
            this.e.setContentType(this.mRequest.getContentType());
        }
        return this.e;
    }

    public HttpUrlRequest getRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlRequest) ipChange.ipc$dispatch("7381681e", new Object[]{this});
        }
        return this.mRequest;
    }

    public URI getUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("506a6a1b", new Object[]{this});
        }
        String url = this.mRequest.getUrl();
        String str = this.mUrl;
        if (str != null) {
            url = str;
        }
        if (url != null) {
            return new URI(url);
        }
        throw new RuntimeException("url should not be null");
    }

    public Response handleResponse(HttpResponse httpResponse, int i, String str) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("d47366bd", new Object[]{this, httpResponse, new Integer(i), str});
        }
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        HttpUrlResponse httpUrlResponse = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        httpUrlResponse = null;
        if (entity != null && httpResponse.getStatusLine().getStatusCode() == 200) {
            Thread.currentThread().getId();
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    writeData(entity, 0L, byteArrayOutputStream2);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    this.mHttpManager.addSocketTime(System.currentTimeMillis() - currentTimeMillis);
                    this.mHttpManager.addDataSize(byteArray.length);
                    httpUrlResponse = new HttpUrlResponse(handleResponseHeader(httpResponse), i, str, byteArray);
                    fillResponse(httpUrlResponse, httpResponse);
                    try {
                        byteArrayOutputStream2.close();
                    } catch (IOException e) {
                        throw new RuntimeException("ArrayOutputStream close error!", e.getCause());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (entity == null) {
            httpResponse.getStatusLine().getStatusCode();
        }
        return httpUrlResponse;
    }

    public HttpUrlHeader handleResponseHeader(HttpResponse httpResponse) {
        Header[] allHeaders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlHeader) ipChange.ipc$dispatch("f6de090e", new Object[]{this, httpResponse});
        }
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    public Response processResponse(HttpResponse httpResponse, HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("16d1f471", new Object[]{this, httpResponse, httpUrlRequest});
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
        if (statusCode == 200 || willHandleOtherCode(statusCode, reasonPhrase)) {
            return handleResponse(httpResponse, statusCode, reasonPhrase);
        }
        throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
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

    public void writeData(HttpEntity httpEntity, long j2, OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("302604d3", new Object[]{this, httpEntity, new Long(j2), outputStream});
        } else if (outputStream != null) {
            InputStream ungzippedContent = AndroidHttpClient.getUngzippedContent(httpEntity);
            long contentLength = httpEntity.getContentLength();
            try {
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = ungzippedContent.read(bArr);
                        if (read == -1 || this.mRequest.isCanceled()) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                        j2 += read;
                        if (this.mRequest.getCallback() != null && contentLength > 0) {
                            this.mRequest.getCallback().onProgressUpdate(this.mRequest, j2 / contentLength);
                        }
                    }
                    outputStream.flush();
                    IOUtil.closeStream(ungzippedContent);
                } catch (Exception e) {
                    e.getCause();
                    throw new IOException("HttpWorker Request Error!" + e.getLocalizedMessage());
                }
            } catch (Throwable th) {
                IOUtil.closeStream(ungzippedContent);
                throw th;
            }
        } else {
            httpEntity.consumeContent();
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Response call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("76becbe0", new Object[]{this});
        }
        try {
            if (NetworkUtils.isNetworkAvailable(this.mContext)) {
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onPreExecute(this.mRequest);
                }
                ArrayList<Header> headers = getHeaders();
                if (headers != null && !headers.isEmpty()) {
                    Iterator<Header> it = headers.iterator();
                    while (it.hasNext()) {
                        a().addHeader(it.next());
                    }
                }
                AndroidHttpClient.modifyRequestToAcceptGzipResponse(a());
                AndroidHttpClient.modifyRequestToKeepAlive(a());
                a().addHeader("cookie", f().getCookie(this.mRequest.getUrl()));
                this.b.setAttribute("http.cookie-store", this.c);
                this.mHttpManager.getHttpClient().setHttpRequestRetryHandler(j);
                long currentTimeMillis = System.currentTimeMillis();
                c();
                this.f4563a.getURI().toString();
                HttpParams params = this.mHttpManager.getHttpClient().getParams();
                HttpHost proxy = NetworkUtils.getProxy(this.mContext);
                if (proxy != null && TextUtils.equals(proxy.getHostName(), "127.0.0.1") && proxy.getPort() == 8087) {
                    proxy = null;
                }
                params.setParameter("http.route.default-proxy", proxy);
                HttpHost httpHost = this.f;
                if (httpHost == null) {
                    URL e = e();
                    HttpHost httpHost2 = new HttpHost(e.getHost(), d(), e.getProtocol());
                    this.f = httpHost2;
                    httpHost = httpHost2;
                }
                if (d() == 80) {
                    httpHost = new HttpHost(e().getHost());
                }
                HttpResponse execute = this.mHttpManager.getHttpClient().execute(httpHost, (HttpRequest) this.f4563a, this.b);
                this.mHttpManager.addConnectTime(System.currentTimeMillis() - currentTimeMillis);
                List<Cookie> cookies = this.c.getCookies();
                if (this.mRequest.isResetCookie()) {
                    f().removeAllCookie();
                }
                if (!cookies.isEmpty()) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getDomain() != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(cookie.getName());
                            sb.append("=");
                            sb.append(cookie.getValue());
                            sb.append("; domain=");
                            sb.append(cookie.getDomain());
                            sb.append(cookie.isSecure() ? "; Secure" : "");
                            f().setCookie(this.mRequest.getUrl(), sb.toString());
                            CookieSyncManager.getInstance().sync();
                        }
                    }
                }
                Response processResponse = processResponse(execute, this.mRequest);
                if (((processResponse == null || processResponse.getResData() == null) ? -1L : processResponse.getResData().length) == -1 && (processResponse instanceof HttpUrlResponse)) {
                    try {
                        Long.parseLong(((HttpUrlResponse) processResponse).getHeader().getHead("Content-Length"));
                    } catch (Exception unused) {
                    }
                }
                if (this.mRequest.getUrl() != null && !TextUtils.isEmpty(c())) {
                    c();
                }
                return processResponse;
            }
            throw new HttpException(1, "The network is not available");
        } catch (HttpException e2) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, e2.getCode(), e2.getMsg());
            }
            e2.toString();
            throw e2;
        } catch (NullPointerException e3) {
            b();
            int i = this.h;
            if (i <= 0) {
                this.h = i + 1;
                return call();
            }
            e3.toString();
            throw new HttpException(0, String.valueOf(e3));
        } catch (URISyntaxException e4) {
            throw new RuntimeException("Url parser error!", e4.getCause());
        } catch (UnknownHostException e5) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 9, String.valueOf(e5));
            }
            e5.toString();
            throw new HttpException(9, String.valueOf(e5));
        } catch (SSLHandshakeException e6) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 2, String.valueOf(e6));
            }
            e6.toString();
            throw new HttpException(2, String.valueOf(e6));
        } catch (SSLException e7) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 6, String.valueOf(e7));
            }
            e7.toString();
            throw new HttpException(6, String.valueOf(e7));
        } catch (HttpHostConnectException e8) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 8, String.valueOf(e8));
            }
            throw new HttpException(8, String.valueOf(e8));
        } catch (SocketTimeoutException e9) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 4, String.valueOf(e9));
            }
            e9.toString();
            throw new HttpException(4, String.valueOf(e9));
        } catch (ConnectTimeoutException e10) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 3, String.valueOf(e10));
            }
            e10.toString();
            throw new HttpException(3, String.valueOf(e10));
        } catch (IOException e11) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 6, String.valueOf(e11));
            }
            e11.toString();
            throw new HttpException(6, String.valueOf(e11));
        } catch (NoHttpResponseException e12) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 5, String.valueOf(e12));
            }
            e12.toString();
            throw new HttpException(5, String.valueOf(e12));
        } catch (Exception e13) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 0, String.valueOf(e13));
            }
            throw new HttpException(0, String.valueOf(e13));
        } catch (ConnectionPoolTimeoutException e14) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 3, String.valueOf(e14));
            }
            e14.toString();
            throw new HttpException(3, String.valueOf(e14));
        } catch (SSLPeerUnverifiedException e15) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 2, String.valueOf(e15));
            }
            e15.toString();
            throw new HttpException(2, String.valueOf(e15));
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
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }
}
