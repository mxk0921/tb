package com.alipay.mobile.common.logging.http;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.http.AndroidHttpClient;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.logging.api.http.BaseHttpClient;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.common.logging.util.ZipUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import tb.f7l;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpClient extends BaseHttpClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AndroidHttpClient h;

    /* renamed from: a  reason: collision with root package name */
    public HttpResponse f3973a;
    public String b;
    public Context c;
    public String d;
    public HttpRequest e;
    public long f = -1;
    public long g = -1;

    public HttpClient(String str, Context context) {
        super(str, context);
        this.c = context;
        this.d = str;
    }

    public static /* synthetic */ Object ipc$super(HttpClient httpClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/http/HttpClient");
    }

    public final URL a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("b391bad", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            return null;
        }
        try {
            return new URL(this.d);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final HttpHost b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("41bc79fb", new Object[]{this});
        }
        URL a2 = a();
        if (a2 == null) {
            return null;
        }
        String host = a2.getHost();
        if (TextUtils.isEmpty(host)) {
            return null;
        }
        String protocol = a2.getProtocol();
        if (TextUtils.isEmpty(protocol)) {
            return null;
        }
        int port = a2.getPort();
        if (port <= 0) {
            port = "https".equalsIgnoreCase(protocol) ? 443 : 80;
        }
        try {
            return new HttpHost(host, port, protocol);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final HttpHost c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("4269259a", new Object[]{this});
        }
        NetworkInfo activeNetworkInfo = NetUtil.getActiveNetworkInfo(this.c);
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || activeNetworkInfo.getType() != 0) {
            return null;
        }
        try {
            String defaultHost = Proxy.getDefaultHost();
            if (!TextUtils.isEmpty(defaultHost)) {
                return new HttpHost(defaultHost, Proxy.getDefaultPort());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public void closeStreamForNextExecute() {
        InputStream content;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c623638", new Object[]{this});
            return;
        }
        this.f = -1L;
        this.g = -1L;
        HttpGet httpGet = this.e;
        if (httpGet != null) {
            try {
                if (httpGet instanceof HttpGet) {
                    httpGet.abort();
                } else if (httpGet instanceof HttpPost) {
                    ((HttpPost) httpGet).abort();
                }
            } catch (Throwable unused) {
            }
            this.e = null;
        }
        HttpResponse httpResponse = this.f3973a;
        if (httpResponse != null) {
            try {
                HttpEntity entity = httpResponse.getEntity();
                if (!(entity == null || (content = entity.getContent()) == null)) {
                    content.close();
                }
            } catch (Throwable unused2) {
            }
            this.f3973a = null;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (h == null) {
            synchronized (HttpClient.class) {
                if (h == null) {
                    try {
                        AndroidHttpClient newInstance = AndroidHttpClient.newInstance("alipay", this.c);
                        h = newInstance;
                        HttpParams params = newInstance.getParams();
                        if (params != null) {
                            params.setParameter("http.connection.timeout", 30000);
                            params.setParameter("http.socket.timeout", Integer.valueOf((int) RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        AndroidHttpClient androidHttpClient = h;
        if (androidHttpClient != null) {
            try {
                HttpParams params2 = androidHttpClient.getParams();
                if (params2 != null) {
                    params2.setParameter("http.route.default-proxy", c());
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public long getRequestLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3ae8b9a", new Object[]{this})).longValue();
        }
        long j = this.f;
        if (j > 0) {
            return j;
        }
        HttpPost httpPost = this.e;
        if (!(httpPost instanceof HttpPost)) {
            return -1L;
        }
        try {
            HttpEntity entity = httpPost.getEntity();
            if (entity != null) {
                return entity.getContentLength();
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public int getResponseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("baa782be", new Object[]{this})).intValue();
        }
        HttpResponse httpResponse = this.f3973a;
        if (httpResponse == null) {
            return -1;
        }
        try {
            StatusLine statusLine = httpResponse.getStatusLine();
            if (statusLine != null) {
                return statusLine.getStatusCode();
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public long getResponseLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e4d9178", new Object[]{this})).longValue();
        }
        long j = this.g;
        if (j > 0) {
            return j;
        }
        HttpResponse httpResponse = this.f3973a;
        if (httpResponse == null) {
            return -1L;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                return entity.getContentLength();
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public HttpResponse synchronousRequestByGET(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("80d7d486", new Object[]{this, map});
        }
        closeStreamForNextExecute();
        try {
            String formatParamStringForGET = NetUtil.formatParamStringForGET(map);
            if (TextUtils.isEmpty(formatParamStringForGET)) {
                str = this.d;
            } else {
                str = this.d + f7l.CONDITION_IF + formatParamStringForGET;
            }
            this.b = str;
            HttpGet httpGet = new HttpGet(str);
            this.e = httpGet;
            httpGet.addHeader("Content-type", "text/xml");
            this.e.addHeader("Accept-Encoding", "gzip");
            d();
            HttpResponse execute = h.execute(b(), this.e);
            this.f3973a = execute;
            return execute;
        } catch (Throwable th) {
            closeStreamForNextExecute();
            throw new IllegalStateException(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(3:31|8|(1:10)(7:11|(3:18|(2:21|19)|33)|22|29|23|25|26))|14|(4:16|18|(1:19)|33)|22|29|23|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
        r4.f3973a = com.alipay.mobile.common.logging.http.HttpClient.h.execute(r5, r4.e, new org.apache.http.protocol.BasicHttpContext());
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: all -> 0x003a, LOOP:0: B:19:0x0055->B:21:0x005b, LOOP_END, TryCatch #1 {all -> 0x003a, blocks: (B:8:0x0020, B:11:0x0024, B:14:0x003c, B:16:0x0047, B:18:0x004d, B:19:0x0055, B:21:0x005b, B:22:0x0073, B:23:0x007a, B:24:0x0085), top: B:31:0x0020, inners: #0 }] */
    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.HttpResponse synchronousRequestByPOST(byte[] r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.http.HttpClient.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "9ee671d1"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            org.apache.http.HttpResponse r5 = (org.apache.http.HttpResponse) r5
            return r5
        L_0x001b:
            r4.closeStreamForNextExecute()
            if (r5 == 0) goto L_0x003c
            int r0 = r5.length     // Catch: all -> 0x003a
            if (r0 != 0) goto L_0x0024
            goto L_0x003c
        L_0x0024:
            org.apache.http.client.methods.HttpPost r0 = new org.apache.http.client.methods.HttpPost     // Catch: all -> 0x003a
            java.lang.String r1 = r4.d     // Catch: all -> 0x003a
            r0.<init>(r1)     // Catch: all -> 0x003a
            org.apache.http.entity.ByteArrayEntity r1 = new org.apache.http.entity.ByteArrayEntity     // Catch: all -> 0x003a
            r1.<init>(r5)     // Catch: all -> 0x003a
            r0.setEntity(r1)     // Catch: all -> 0x003a
            int r5 = r5.length     // Catch: all -> 0x003a
            long r1 = (long) r5     // Catch: all -> 0x003a
            r4.f = r1     // Catch: all -> 0x003a
            r4.e = r0     // Catch: all -> 0x003a
            goto L_0x0045
        L_0x003a:
            r5 = move-exception
            goto L_0x0097
        L_0x003c:
            org.apache.http.client.methods.HttpGet r5 = new org.apache.http.client.methods.HttpGet     // Catch: all -> 0x003a
            java.lang.String r0 = r4.d     // Catch: all -> 0x003a
            r5.<init>(r0)     // Catch: all -> 0x003a
            r4.e = r5     // Catch: all -> 0x003a
        L_0x0045:
            if (r6 == 0) goto L_0x0073
            int r5 = r6.size()     // Catch: all -> 0x003a
            if (r5 <= 0) goto L_0x0073
            java.util.Set r5 = r6.entrySet()     // Catch: all -> 0x003a
            java.util.Iterator r5 = r5.iterator()     // Catch: all -> 0x003a
        L_0x0055:
            boolean r6 = r5.hasNext()     // Catch: all -> 0x003a
            if (r6 == 0) goto L_0x0073
            java.lang.Object r6 = r5.next()     // Catch: all -> 0x003a
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: all -> 0x003a
            java.lang.Object r0 = r6.getKey()     // Catch: all -> 0x003a
            java.lang.String r0 = (java.lang.String) r0     // Catch: all -> 0x003a
            java.lang.Object r6 = r6.getValue()     // Catch: all -> 0x003a
            java.lang.String r6 = (java.lang.String) r6     // Catch: all -> 0x003a
            org.apache.http.HttpRequest r1 = r4.e     // Catch: all -> 0x003a
            r1.addHeader(r0, r6)     // Catch: all -> 0x003a
            goto L_0x0055
        L_0x0073:
            r4.d()     // Catch: all -> 0x003a
            org.apache.http.HttpHost r5 = r4.b()     // Catch: all -> 0x003a
            android.net.http.AndroidHttpClient r6 = com.alipay.mobile.common.logging.http.HttpClient.h     // Catch: all -> 0x003a, NullPointerException -> 0x0085
            org.apache.http.HttpRequest r0 = r4.e     // Catch: all -> 0x003a, NullPointerException -> 0x0085
            org.apache.http.HttpResponse r6 = r6.execute(r5, r0)     // Catch: all -> 0x003a, NullPointerException -> 0x0085
            r4.f3973a = r6     // Catch: all -> 0x003a, NullPointerException -> 0x0085
            goto L_0x0094
        L_0x0085:
            android.net.http.AndroidHttpClient r6 = com.alipay.mobile.common.logging.http.HttpClient.h     // Catch: all -> 0x003a
            org.apache.http.HttpRequest r0 = r4.e     // Catch: all -> 0x003a
            org.apache.http.protocol.BasicHttpContext r1 = new org.apache.http.protocol.BasicHttpContext     // Catch: all -> 0x003a
            r1.<init>()     // Catch: all -> 0x003a
            org.apache.http.HttpResponse r5 = r6.execute(r5, r0, r1)     // Catch: all -> 0x003a
            r4.f3973a = r5     // Catch: all -> 0x003a
        L_0x0094:
            org.apache.http.HttpResponse r5 = r4.f3973a
            return r5
        L_0x0097:
            r4.closeStreamForNextExecute()
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.http.HttpClient.synchronousRequestByPOST(byte[], java.util.Map):org.apache.http.HttpResponse");
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public String getResponseContent() {
        Header[] headers;
        String value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af6aed77", new Object[]{this});
        }
        HttpResponse httpResponse = this.f3973a;
        if (httpResponse == null) {
            return null;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            HttpResponse httpResponse2 = this.f3973a;
            if (httpResponse2 != null && (headers = httpResponse2.getHeaders(HttpConstant.CONTENT_ENCODING)) != null && headers.length > 0 && (value = headers[0].getValue()) != null && value.toLowerCase().indexOf("gzip") >= 0) {
                byte[] unCompressGzip = ZipUtil.unCompressGzip(this.f3973a.getEntity().getContent());
                if (unCompressGzip == null) {
                    return null;
                }
                this.g = unCompressGzip.length;
                return new String(unCompressGzip, "UTF-8");
            } else if (entity != null) {
                return EntityUtils.toString(entity);
            } else {
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
