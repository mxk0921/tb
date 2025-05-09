package tb;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a8p extends SSLSocketFactory {
    @Deprecated
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    @Deprecated
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();
    public static final String d = a8p.class.getSimpleName();
    public static volatile a8p e = null;

    /* renamed from: a  reason: collision with root package name */
    public SSLContext f15600a = null;
    public Context b;
    public String[] c;

    public a8p(Context context, SecureRandom secureRandom) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        if (context == null) {
            x5y.c(d, "SecureSSLSocketFactory: context is null");
            return;
        }
        c(context);
        d(eoo.f());
        this.f15600a.init(null, new X509TrustManager[]{c8p.a(context)}, secureRandom);
    }

    @Deprecated
    public static a8p b(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        System.currentTimeMillis();
        sq4.b(context);
        if (e == null) {
            synchronized (a8p.class) {
                try {
                    if (e == null) {
                        e = new a8p(context, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (e.b == null && context != null) {
            e.c(context);
        }
        System.currentTimeMillis();
        return e;
    }

    public void c(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        x5y.d(d, "createSocket: host , port");
        Socket createSocket = this.f15600a.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.c = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public void d(SSLContext sSLContext) {
        this.f15600a = sSLContext;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.c;
        if (strArr != null) {
            return strArr;
        }
        return new String[0];
    }

    public final void a(Socket socket) {
        boolean z;
        boolean a2 = dtx.a(null);
        boolean z2 = true;
        String str = d;
        if (!a2) {
            x5y.d(str, "set protocols");
            eoo.e((SSLSocket) socket, null);
            z = true;
        } else {
            z = false;
        }
        if (!dtx.a(null) || !dtx.a(null)) {
            x5y.d(str, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            eoo.d(sSLSocket);
            if (!dtx.a(null)) {
                eoo.h(sSLSocket, null);
            } else {
                eoo.b(sSLSocket, null);
            }
        } else {
            z2 = false;
        }
        if (!z) {
            x5y.d(str, "set default protocols");
            eoo.d((SSLSocket) socket);
        }
        if (!z2) {
            x5y.d(str, "set default cipher suites");
            eoo.c((SSLSocket) socket);
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        x5y.d(d, "createSocket s host port autoClose");
        Socket createSocket = this.f15600a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.c = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
