package tb;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b8p extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    public final SSLContext f16250a;
    public String[] b;

    @Deprecated
    public b8p(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.f16250a = null;
        SSLContext f = eoo.f();
        this.f16250a = f;
        f.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    public void b(Context context) {
        context.getApplicationContext();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        x5y.d("SSLFNew", "createSocket: host , port");
        Socket createSocket = this.f16250a.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.b = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.b;
        if (strArr != null) {
            return strArr;
        }
        return new String[0];
    }

    public final void a(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (!dtx.a(null)) {
            x5y.d("SSLFNew", "set protocols");
            eoo.e((SSLSocket) socket, null);
            z = true;
        } else {
            z = false;
        }
        if (!dtx.a(null) || !dtx.a(null)) {
            x5y.d("SSLFNew", "set cipher");
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
            x5y.d("SSLFNew", "set default protocols");
            eoo.d((SSLSocket) socket);
        }
        if (!z2) {
            x5y.d("SSLFNew", "set default cipher");
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
        x5y.d("SSLFNew", "createSocket");
        Socket createSocket = this.f16250a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.b = (String[]) ((SSLSocket) createSocket).getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
