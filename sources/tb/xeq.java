package tb;

import android.net.SSLCertificateSocketFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class xeq extends SSLSocketFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31338a;

    static {
        t2o.a(961544418);
    }

    public xeq(String str) {
        this.f31338a = str;
    }

    public static /* synthetic */ Object ipc$super(xeq xeqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/pipeline/SslSocketFactory");
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("d90ad0b5", new Object[]{this});
        }
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3dfd25e7", new Object[]{this});
        }
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6fb81e94", new Object[]{this});
        }
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("ecb56c42", new Object[]{this, str, new Integer(i)});
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("d05ff8d1", new Object[]{this, str, new Integer(i), inetAddress, new Integer(i2)});
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("a4ed42fe", new Object[]{this, inetAddress, new Integer(i)});
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("28dc4e95", new Object[]{this, inetAddress, new Integer(i), inetAddress2, new Integer(i2)});
        }
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        if (this.f31338a == null) {
            this.f31338a = str;
        }
        ogh.e("SslSocketFactory", "host=" + this.f31338a + ", port=" + i + ", autoClose=" + z);
        InetAddress inetAddress = socket.getInetAddress();
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f31338a);
        SSLSession session = sSLSocket.getSession();
        ogh.e("SslSocketFactory", "SSLSession PeerHost " + session.getPeerHost());
        return sSLSocket;
    }
}
