package tb;

import android.content.Context;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y7p extends SSLSocketFactory {
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();
    public static final String b = y7p.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final SSLContext f31899a;

    @Deprecated
    public y7p(KeyStore keyStore, X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalArgumentException {
        super(keyStore);
        SSLContext f = eoo.f();
        this.f31899a = f;
        f.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public void b(Context context) {
        context.getApplicationContext();
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        x5y.d(b, "createSocket: socket host port autoClose");
        Socket createSocket = this.f31899a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public final void a(Socket socket) {
        boolean z;
        boolean a2 = dtx.a(null);
        boolean z2 = true;
        String str = b;
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

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        x5y.d(b, "createSocket: ");
        Socket createSocket = this.f31899a.getSocketFactory().createSocket();
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
