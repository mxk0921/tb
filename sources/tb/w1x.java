package tb;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w1x extends Thread {
    private static final String i = "w1x";

    /* renamed from: a  reason: collision with root package name */
    private SSLSocketFactory f30401a;
    private HostnameVerifier b;
    private org.apache.http.conn.ssl.SSLSocketFactory c;
    private X509HostnameVerifier d;
    private SslErrorHandler e;
    private String f;
    private a g;
    private Context h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Callback {
        public b(a aVar, Context context, String str, SslErrorHandler sslErrorHandler) {
        }
    }

    public w1x() {
    }

    private void b() {
        String str = i;
        x5y.d(str, "callbackCancel: ");
        if (this.e != null) {
            x5y.d(str, "callbackCancel 2: ");
            this.e.cancel();
        }
    }

    private void c() {
        x5y.d(i, "callbackProceed: ");
        SslErrorHandler sslErrorHandler = this.e;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    public static void d(SslErrorHandler sslErrorHandler, String str, Context context) {
        e(sslErrorHandler, str, context, null);
    }

    public static void e(SslErrorHandler sslErrorHandler, String str, Context context, a aVar) {
        if (sslErrorHandler == null || TextUtils.isEmpty(str) || context == null) {
            x5y.c(i, "checkServerCertificateWithOK: handler or url or context is null");
            return;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            b8p b8pVar = new b8p(new tyx(context));
            b8pVar.b(context);
            builder.sslSocketFactory(b8pVar, new tyx(context));
            builder.hostnameVerifier(new fqq());
            builder.build().newCall(new Request.Builder().url(str).build()).enqueue(new b(aVar, context, str, sslErrorHandler));
        } catch (Exception e) {
            String str2 = i;
            x5y.c(str2, "checkServerCertificateWithOK: exception : " + e.getMessage());
            sslErrorHandler.cancel();
        }
    }

    public X509HostnameVerifier f() {
        return this.d;
    }

    public org.apache.http.conn.ssl.SSLSocketFactory g() {
        return this.c;
    }

    public a h() {
        return null;
    }

    public Context i() {
        return this.h;
    }

    public HostnameVerifier j() {
        return this.b;
    }

    public SslErrorHandler k() {
        return this.e;
    }

    public SSLSocketFactory l() {
        return this.f30401a;
    }

    public String m() {
        return this.f;
    }

    public void n(X509HostnameVerifier x509HostnameVerifier) {
        this.d = x509HostnameVerifier;
    }

    public void o(org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory) {
        this.c = sSLSocketFactory;
    }

    public void q(Context context) {
        this.h = context;
    }

    public void r(HostnameVerifier hostnameVerifier) {
        this.b = hostnameVerifier;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Throwable th;
        Exception e;
        super.run();
        HttpsURLConnection httpsURLConnection = null;
        if (this.c == null || this.d == null) {
            if (this.f30401a != null) {
                try {
                    if (this.b != null) {
                        try {
                            URLConnection openConnection = new URL(this.f).openConnection();
                            if (openConnection instanceof HttpsURLConnection) {
                                HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) openConnection;
                                try {
                                    httpsURLConnection2.setSSLSocketFactory(this.f30401a);
                                    httpsURLConnection2.setHostnameVerifier(this.b);
                                    httpsURLConnection2.setRequestMethod("GET");
                                    httpsURLConnection2.setConnectTimeout(10000);
                                    httpsURLConnection2.setReadTimeout(20000);
                                    httpsURLConnection2.connect();
                                    httpsURLConnection = httpsURLConnection2;
                                } catch (Exception e2) {
                                    e = e2;
                                    httpsURLConnection = httpsURLConnection2;
                                    String str = i;
                                    x5y.c(str, "exception : " + e.getMessage());
                                    b();
                                    if (httpsURLConnection != null) {
                                        httpsURLConnection.disconnect();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    httpsURLConnection = httpsURLConnection2;
                                    if (httpsURLConnection != null) {
                                        httpsURLConnection.disconnect();
                                    }
                                    throw th;
                                }
                            }
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            c();
                            return;
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            b();
        } else if (this.e == null || TextUtils.isEmpty(this.f)) {
            x5y.c(i, "sslErrorHandler or url is null");
            b();
        } else {
            try {
                try {
                    this.c.setHostnameVerifier(this.d);
                    org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory = this.c;
                    if (sSLSocketFactory instanceof y7p) {
                        ((y7p) sSLSocketFactory).b(this.h);
                    }
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
                    SchemeRegistry schemeRegistry = new SchemeRegistry();
                    schemeRegistry.register(new Scheme("https", this.c, 443));
                    schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                    DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
                    HttpGet httpGet = new HttpGet();
                    httpGet.setURI(new URI(this.f));
                    HttpResponse execute = defaultHttpClient.execute(httpGet);
                    String str2 = i;
                    x5y.d(str2, "status code is : " + execute.getStatusLine().getStatusCode());
                    r3y.d(null);
                    c();
                } catch (Exception e4) {
                    String str3 = i;
                    x5y.c(str3, "run: exception : " + e4.getMessage());
                    b();
                    r3y.d(null);
                }
            } catch (Throwable th4) {
                r3y.d(null);
                throw th4;
            }
        }
    }

    public void s(SslErrorHandler sslErrorHandler) {
        this.e = sslErrorHandler;
    }

    public void t(SSLSocketFactory sSLSocketFactory) {
        this.f30401a = sSLSocketFactory;
    }

    public void u(String str) {
        this.f = str;
    }

    public w1x(SslErrorHandler sslErrorHandler, String str, Context context) throws CertificateException, NoSuchAlgorithmException, IOException, KeyManagementException, KeyStoreException, IllegalAccessException {
        s(sslErrorHandler);
        u(str);
        q(context);
        t(new b8p(new tyx(context)));
        r(new fqq());
        try {
            o(new y7p(null, new tyx(context)));
        } catch (UnrecoverableKeyException e) {
            String str2 = i;
            x5y.c(str2, "WebViewSSLCheckThread: UnrecoverableKeyException : " + e.getMessage());
        }
        n(y7p.STRICT_HOSTNAME_VERIFIER);
    }

    @Deprecated
    public w1x(SslErrorHandler sslErrorHandler, String str, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        s(sslErrorHandler);
        u(str);
        t(sSLSocketFactory);
        r(hostnameVerifier);
    }

    @Deprecated
    public w1x(SslErrorHandler sslErrorHandler, String str, org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        s(sslErrorHandler);
        u(str);
        o(sSLSocketFactory);
        n(x509HostnameVerifier);
    }

    @Deprecated
    public w1x(SslErrorHandler sslErrorHandler, String str, org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier, a aVar, Context context) {
        this.e = sslErrorHandler;
        this.f = str;
        this.c = sSLSocketFactory;
        this.d = x509HostnameVerifier;
        this.h = context;
    }

    public void p(a aVar) {
    }
}
