package anet.channel.util;

import android.net.SSLCertificateSocketFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TlsSniSocketFactory extends SSLSocketFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String peerHost;
    private final String TAG = "awcn.TlsSniSocketFactory";
    private Method setHostNameMethod = null;

    static {
        t2o.a(607125960);
    }

    public TlsSniSocketFactory(String str) {
        this.peerHost = str;
    }

    public static /* synthetic */ Object ipc$super(TlsSniSocketFactory tlsSniSocketFactory, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in anet/channel/util/TlsSniSocketFactory");
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
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("ecb56c42", new Object[]{this, str, new Integer(i)});
        }
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
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
        if (this.peerHost == null) {
            this.peerHost = str;
        }
        if (ALog.isPrintLog(1)) {
            ALog.i("awcn.TlsSniSocketFactory", "customized createSocket", null, "host", this.peerHost);
        }
        InetAddress inetAddress = socket.getInetAddress();
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.peerHost);
        SSLSession session = sSLSocket.getSession();
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.TlsSniSocketFactory", null, null, "SSLSession PeerHost", session.getPeerHost());
        }
        return sSLSocket;
    }
}
