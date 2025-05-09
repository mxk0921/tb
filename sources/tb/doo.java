package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class doo extends SSLSocketFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SSLSocketFactory f17986a;
    public final String b;
    public final int c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements HandshakeCompletedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(doo dooVar) {
        }

        @Override // javax.net.ssl.HandshakeCompletedListener
        public void handshakeCompleted(HandshakeCompletedEvent handshakeCompletedEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("771e882e", new Object[]{this, handshakeCompletedEvent});
                return;
            }
            v7t.a("tag", "Handshake finished!");
            v7t.a("tag", "\t CipherSuite:" + handshakeCompletedEvent.getCipherSuite());
            v7t.a("tag", "\t SessionId " + handshakeCompletedEvent.getSession());
            v7t.a("tag", "\t PeerHost " + handshakeCompletedEvent.getSession().getPeerHost());
        }
    }

    static {
        t2o.a(989856383);
    }

    public doo(String str, int i, SSLSocketFactory sSLSocketFactory, String str2) {
        this.b = str;
        this.c = i;
        if (sSLSocketFactory != null) {
            this.f17986a = sSLSocketFactory;
        } else {
            this.f17986a = (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
        this.d = str2;
    }

    public static /* synthetic */ Object ipc$super(doo dooVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/security/SSLTunnelSocketFactory");
    }

    public final void a(Socket socket, String str, int i) throws IOException {
        byte[] bArr;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e9d155", new Object[]{this, socket, str, new Integer(i)});
            return;
        }
        OutputStream outputStream = socket.getOutputStream();
        String str3 = "CONNECT " + str + ":" + i + " HTTP/1.1\nUser-Agent: " + this.d + "\nHost:" + str + "\r\n\r\n";
        try {
            bArr = str3.getBytes("ASCII7");
        } catch (UnsupportedEncodingException unused) {
            bArr = str3.getBytes();
        }
        outputStream.write(bArr);
        outputStream.flush();
        byte[] bArr2 = new byte[200];
        InputStream inputStream = socket.getInputStream();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i2 < 2) {
            int read = inputStream.read();
            if (read < 0) {
                throw new IOException("Unexpected EOF from proxy");
            } else if (read == 10) {
                i2++;
                z = true;
            } else if (read != 13) {
                if (!z && i3 < 200) {
                    bArr2[i3] = (byte) read;
                    i3++;
                }
                i2 = 0;
            }
        }
        try {
            str2 = new String(bArr2, 0, i3, "ASCII7");
        } catch (UnsupportedEncodingException unused2) {
            str2 = new String(bArr2, 0, i3);
        }
        if (str2.toLowerCase().indexOf("200 connection established") == -1) {
            throw new IOException("Unable to tunnel through " + this.b + ":" + this.c + ".  Proxy returns \"" + str2 + "\"");
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Socket) ipChange.ipc$dispatch("ecb56c42", new Object[]{this, str, new Integer(i)}) : createSocket((Socket) null, str, i, true);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3dfd25e7", new Object[]{this});
        }
        return this.f17986a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6fb81e94", new Object[]{this});
        }
        return this.f17986a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Socket) ipChange.ipc$dispatch("d05ff8d1", new Object[]{this, str, new Integer(i), inetAddress, new Integer(i2)}) : createSocket((Socket) null, str, i, true);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Socket) ipChange.ipc$dispatch("a4ed42fe", new Object[]{this, inetAddress, new Integer(i)}) : createSocket((Socket) null, inetAddress.getHostName(), i, true);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Socket) ipChange.ipc$dispatch("28dc4e95", new Object[]{this, inetAddress, new Integer(i), inetAddress2, new Integer(i2)}) : createSocket((Socket) null, inetAddress.getHostName(), i, true);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("f9006d73", new Object[]{this, socket, str, new Integer(i), new Boolean(z)});
        }
        Socket socket2 = new Socket(this.b, this.c);
        a(socket2, str, i);
        SSLSocket sSLSocket = (SSLSocket) this.f17986a.createSocket(socket2, str, i, z);
        sSLSocket.addHandshakeCompletedListener(new a(this));
        sSLSocket.startHandshake();
        return sSLSocket;
    }
}
