package com.alipay.literpc.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
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
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpWorker implements Callable<Response> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HttpRequestRetryHandler j = new ZHttpRequestRetryHandler();

    /* renamed from: a  reason: collision with root package name */
    public HttpUriRequest f3850a;
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

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a3e46", new Object[]{this});
            return;
        }
        HttpUriRequest httpUriRequest = this.f3850a;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    public final void b() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf7457f", new Object[]{this});
            return;
        }
        ArrayList<Header> headers = getHeaders();
        if (headers != null && !headers.isEmpty()) {
            Iterator<Header> it = headers.iterator();
            while (it.hasNext()) {
                h().addHeader(it.next());
            }
        }
        AndroidHttpClient.modifyRequestToAcceptGzipResponse(h());
        AndroidHttpClient.modifyRequestToKeepAlive(h());
        h().addHeader("cookie", e().getCookie(this.mRequest.getUrl()));
    }

    public final HttpResponse c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("225e25dd", new Object[]{this});
        }
        i();
        this.f3850a.getURI().toString();
        f().getParams().setParameter("http.route.default-proxy", j());
        HttpHost g = g();
        if (k() == 80) {
            g = new HttpHost(l().getHost());
        }
        return f().execute(g, (HttpRequest) this.f3850a, this.b);
    }

    public final HttpResponse d() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("3d7f048a", new Object[]{this});
        }
        return c();
    }

    public final CookieManager e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CookieManager) ipChange.ipc$dispatch("62a5f5ef", new Object[]{this});
        }
        CookieManager cookieManager = this.d;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager instance = CookieManager.getInstance();
        this.d = instance;
        return instance;
    }

    public final AndroidHttpClient f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("3a43d37c", new Object[]{this});
        }
        return this.mHttpManager.getHttpClient();
    }

    public void fillResponse(HttpUrlResponse httpUrlResponse, HttpResponse httpResponse) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecf6850", new Object[]{this, httpUrlResponse, httpResponse});
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

    public final HttpHost g() throws MalformedURLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("23dd3917", new Object[]{this});
        }
        HttpHost httpHost = this.f;
        if (httpHost != null) {
            return httpHost;
        }
        URL l = l();
        HttpHost httpHost2 = new HttpHost(l.getHost(), k(), l.getProtocol());
        this.f = httpHost2;
        return httpHost2;
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

    public AbstractHttpEntity getPostData() throws IOException {
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
            return (HttpUrlRequest) ipChange.ipc$dispatch("729eb200", new Object[]{this});
        }
        return this.mRequest;
    }

    public URI getUri() throws URISyntaxException {
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

    public final HttpUriRequest h() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("13e8dd7e", new Object[]{this});
        }
        HttpUriRequest httpUriRequest = this.f3850a;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        AbstractHttpEntity postData = getPostData();
        if (postData != null) {
            HttpPost httpPost = new HttpPost(getUri());
            httpPost.setEntity(postData);
            this.f3850a = httpPost;
        } else {
            this.f3850a = new HttpGet(getUri());
        }
        return this.f3850a;
    }

    public Response handleResponse(HttpResponse httpResponse, int i, String str) throws IOException {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("7ba98faf", new Object[]{this, httpResponse, new Integer(i), str});
        }
        new StringBuilder("开始handle，handleResponse-1,").append(Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        HttpUrlResponse httpUrlResponse = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        httpUrlResponse = null;
        if (entity != null && httpResponse.getStatusLine().getStatusCode() == 200) {
            new StringBuilder("200，开始处理，handleResponse-2,threadid = ").append(Thread.currentThread().getId());
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    writeData(entity, 0L, byteArrayOutputStream2);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    this.mHttpManager.addSocketTime(System.currentTimeMillis() - currentTimeMillis);
                    this.mHttpManager.addDataSize(byteArray.length);
                    new StringBuilder("res:").append(byteArray.length);
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
            return (HttpUrlHeader) ipChange.ipc$dispatch("2560d08", new Object[]{this, httpResponse});
        }
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76cb9a4e", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        String tag = this.mRequest.getTag("operationType");
        this.i = tag;
        return tag;
    }

    public final HttpHost j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("aef6b165", new Object[]{this});
        }
        HttpHost proxy = NetworkUtils.getProxy(this.mContext);
        if (proxy == null || !TextUtils.equals(proxy.getHostName(), "127.0.0.1") || proxy.getPort() != 8087) {
            return proxy;
        }
        return null;
    }

    public final int k() throws MalformedURLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb0a7622", new Object[]{this})).intValue();
        }
        URL l = l();
        if (l.getPort() == -1) {
            return l.getDefaultPort();
        }
        return l.getPort();
    }

    public final URL l() throws MalformedURLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("db3e1786", new Object[]{this});
        }
        URL url = this.g;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.mRequest.getUrl());
        this.g = url2;
        return url2;
    }

    public final TransportCallback m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TransportCallback) ipChange.ipc$dispatch("6c7fc721", new Object[]{this});
        }
        return this.mRequest.getCallback();
    }

    public Response processResponse(HttpResponse httpResponse, HttpUrlRequest httpUrlRequest) throws HttpException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("f456766b", new Object[]{this, httpResponse, httpUrlRequest});
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

    public void writeData(HttpEntity httpEntity, long j2, OutputStream outputStream) throws IOException {
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
                        if (m() != null && contentLength > 0) {
                            m().onProgressUpdate(this.mRequest, j2 / contentLength);
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
    public Response call() throws HttpException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("256ee86c", new Object[]{this});
        }
        try {
            NetworkUtils.isNetworkAvailable(this.mContext);
            if (m() != null) {
                m().onPreExecute(this.mRequest);
            }
            b();
            this.b.setAttribute("http.cookie-store", this.c);
            f().setHttpRequestRetryHandler(j);
            long currentTimeMillis = System.currentTimeMillis();
            HttpResponse d = d();
            this.mHttpManager.addConnectTime(System.currentTimeMillis() - currentTimeMillis);
            List<Cookie> cookies = this.c.getCookies();
            if (this.mRequest.isResetCookie()) {
                e().removeAllCookie();
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
                        e().setCookie(this.mRequest.getUrl(), sb.toString());
                        CookieSyncManager.getInstance().sync();
                    }
                }
            }
            Response processResponse = processResponse(d, this.mRequest);
            if (((processResponse == null || processResponse.getResData() == null) ? -1L : processResponse.getResData().length) == -1 && (processResponse instanceof HttpUrlResponse)) {
                try {
                    Long.parseLong(((HttpUrlResponse) processResponse).getHeader().getHead("Content-Length"));
                } catch (Exception unused) {
                    Log.e(com.alipay.mobile.common.transport.http.HttpWorker.TAG, "parse Content-Length error");
                }
            }
            if (this.mRequest.getUrl() != null && !TextUtils.isEmpty(i())) {
                i();
            }
            return processResponse;
        } catch (HttpException e) {
            a();
            if (m() != null) {
                m().onFailed(this.mRequest, e.getCode(), e.getMsg());
            }
            Log.e("HttpManager", e + "");
            throw e;
        } catch (NullPointerException e2) {
            a();
            int i = this.h;
            if (i < 1) {
                this.h = i + 1;
                return call();
            }
            Log.e("HttpManager", e2 + "");
            throw new HttpException(0, e2 + "");
        } catch (URISyntaxException e3) {
            throw new RuntimeException("Url parser error!", e3.getCause());
        } catch (UnknownHostException e4) {
            a();
            if (m() != null) {
                TransportCallback m = m();
                HttpUrlRequest httpUrlRequest = this.mRequest;
                m.onFailed(httpUrlRequest, 9, e4 + "");
            }
            Log.e("HttpManager", e4 + "");
            throw new HttpException(9, e4 + "");
        } catch (SSLException e5) {
            a();
            if (m() != null) {
                TransportCallback m2 = m();
                HttpUrlRequest httpUrlRequest2 = this.mRequest;
                m2.onFailed(httpUrlRequest2, 6, e5 + "");
            }
            Log.e("HttpManager", e5 + "");
            throw new HttpException(6, e5 + "");
        } catch (HttpHostConnectException e6) {
            a();
            if (m() != null) {
                TransportCallback m3 = m();
                HttpUrlRequest httpUrlRequest3 = this.mRequest;
                m3.onFailed(httpUrlRequest3, 8, e6 + "");
            }
            Log.e("HttpManager", "", e6);
            throw new HttpException(8, e6 + "");
        } catch (SocketTimeoutException e7) {
            a();
            if (m() != null) {
                TransportCallback m4 = m();
                HttpUrlRequest httpUrlRequest4 = this.mRequest;
                m4.onFailed(httpUrlRequest4, 4, e7 + "");
            }
            Log.e("HttpManager", e7 + "");
            throw new HttpException(4, e7 + "");
        } catch (SSLHandshakeException e8) {
            a();
            if (m() != null) {
                TransportCallback m5 = m();
                HttpUrlRequest httpUrlRequest5 = this.mRequest;
                m5.onFailed(httpUrlRequest5, 2, e8 + "");
            }
            Log.e("HttpManager", e8 + "");
            throw new HttpException(2, e8 + "");
        } catch (SSLPeerUnverifiedException e9) {
            a();
            if (m() != null) {
                TransportCallback m6 = m();
                HttpUrlRequest httpUrlRequest6 = this.mRequest;
                m6.onFailed(httpUrlRequest6, 2, e9 + "");
            }
            Log.e("HttpManager", e9 + "");
            throw new HttpException(2, e9 + "");
        } catch (ConnectTimeoutException e10) {
            a();
            if (m() != null) {
                TransportCallback m7 = m();
                HttpUrlRequest httpUrlRequest7 = this.mRequest;
                m7.onFailed(httpUrlRequest7, 3, e10 + "");
            }
            Log.e("HttpManager", e10 + "");
            throw new HttpException(3, e10 + "");
        } catch (IOException e11) {
            a();
            if (m() != null) {
                TransportCallback m8 = m();
                HttpUrlRequest httpUrlRequest8 = this.mRequest;
                m8.onFailed(httpUrlRequest8, 6, e11 + "");
            }
            Log.e("HttpManager", e11 + "");
            throw new HttpException(6, e11 + "");
        } catch (ConnectionPoolTimeoutException e12) {
            a();
            if (m() != null) {
                TransportCallback m9 = m();
                HttpUrlRequest httpUrlRequest9 = this.mRequest;
                m9.onFailed(httpUrlRequest9, 3, e12 + "");
            }
            Log.e("HttpManager", e12 + "");
            throw new HttpException(3, e12 + "");
        } catch (Exception e13) {
            Log.e("HttpManager", "", e13);
            a();
            if (m() != null) {
                TransportCallback m10 = m();
                HttpUrlRequest httpUrlRequest10 = this.mRequest;
                m10.onFailed(httpUrlRequest10, 0, e13 + "");
            }
            throw new HttpException(0, e13 + "");
        } catch (NoHttpResponseException e14) {
            a();
            if (m() != null) {
                TransportCallback m11 = m();
                HttpUrlRequest httpUrlRequest11 = this.mRequest;
                m11.onFailed(httpUrlRequest11, 5, e14 + "");
            }
            Log.e("HttpManager", e14 + "");
            throw new HttpException(5, e14 + "");
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
