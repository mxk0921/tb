package tb;

import anet.channel.util.HttpConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketAdapter;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.SSLExtensionsFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.MessagePriority;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import tb.mxn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rcn extends WebSocketAdapter implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int k = 5000;
    private static SSLSocketFactory l;

    /* renamed from: a  reason: collision with root package name */
    private final URI f27279a;
    private final l0x b;
    private final SSLSocketFactory c;
    private final WebSocketImpl d;
    private final ConcurrentLinkedQueue<String> e = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<String> f = new ConcurrentLinkedQueue<>();
    private final Thread g;
    private Socket h;
    private OutputStream i;
    private static final Draft j = new Draft_17();
    private static final AtomicInteger m = new AtomicInteger();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer poll = rcn.a(rcn.this).outQueue.poll();
                    if (poll == null) {
                        rcn.b(rcn.this);
                        poll = rcn.a(rcn.this).outQueue.take();
                    }
                    rcn.c(rcn.this).write(poll.array(), 0, poll.limit());
                    rcn.c(rcn.this).flush();
                } catch (IOException unused) {
                    rcn.a(rcn.this).eot();
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }

    static {
        t2o.a(649068603);
    }

    public rcn(URI uri, l0x l0xVar) {
        this.f27279a = uri;
        this.b = l0xVar;
        if ("wss".equals(uri.getScheme())) {
            this.c = f();
        } else {
            this.c = null;
        }
        WebSocketImpl.DEBUG = false;
        this.d = new WebSocketImpl(this, j);
        int incrementAndGet = m.incrementAndGet();
        new Thread(this, "RVLWebSocket.Read_" + incrementAndGet).start();
        a aVar = new a();
        Thread thread = new Thread(aVar, "RVLWebSocket.Write_" + incrementAndGet);
        this.g = thread;
        thread.start();
    }

    public static /* synthetic */ WebSocketImpl a(rcn rcnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocketImpl) ipChange.ipc$dispatch("4f329a2d", new Object[]{rcnVar});
        }
        return rcnVar.d;
    }

    public static /* synthetic */ void b(rcn rcnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dbc8821", new Object[]{rcnVar});
        } else {
            rcnVar.i();
        }
    }

    public static /* synthetic */ OutputStream c(rcn rcnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutputStream) ipChange.ipc$dispatch("1e08d4c8", new Object[]{rcnVar});
        }
        return rcnVar.i;
    }

    private void d() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5d706b", new Object[]{this});
            return;
        }
        InetAddress[] allByName = InetAddress.getAllByName(this.f27279a.getHost());
        if (allByName == null || allByName.length <= 0) {
            throw new UnknownHostException("Unknown host : " + this.f27279a.getHost());
        }
        this.h.connect(new InetSocketAddress(allByName[0], e()), 5000);
        SSLSocketFactory sSLSocketFactory = this.c;
        if (sSLSocketFactory != null) {
            SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(this.h, this.f27279a.getHost(), e(), true);
            SSLExtensionsFactory.getInstance().enableTlsExtensions(sSLSocket, this.f27279a.getHost());
            sSLSocket.startHandshake();
            this.h = sSLSocket;
        }
    }

    private int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        int port = this.f27279a.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.f27279a.getScheme();
        if (scheme.equals("wss")) {
            return 443;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        throw new RuntimeException("Unkonow scheme".concat(scheme));
    }

    private static SSLSocketFactory f() {
        Throwable e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLSocketFactory) ipChange.ipc$dispatch("8af93504", new Object[0]);
        }
        if (l == null) {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        SSLContext instance2 = SSLContext.getInstance("SSL");
                        instance2.init(null, new TrustManager[]{(X509TrustManager) trustManager}, null);
                        l = instance2.getSocketFactory();
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers: " + Arrays.toString(trustManagers));
            } catch (KeyManagementException e2) {
                e = e2;
                e.printStackTrace();
                return l;
            } catch (KeyStoreException e3) {
                e = e3;
                e.printStackTrace();
                return l;
            } catch (NoSuchAlgorithmException e4) {
                e = e4;
                e.printStackTrace();
                return l;
            }
        }
        return l;
    }

    private void h() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d940a56", new Object[]{this});
            return;
        }
        String path = this.f27279a.getPath();
        String query = this.f27279a.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            path = path + "?" + query;
        }
        int e = e();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27279a.getHost());
        if (e != 80) {
            str = ":" + e;
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
        handshakeImpl1Client.setResourceDescriptor(path);
        handshakeImpl1Client.put(HttpConstant.HOST, sb2);
        this.d.startHandshake(handshakeImpl1Client);
    }

    private void i() {
        String poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("916aea7e", new Object[]{this});
        } else if (this.d.outQueue.size() <= 0 && this.d.isOpen() && (poll = this.f.poll()) != null) {
            this.d.send(poll);
        }
    }

    public static /* synthetic */ Object ipc$super(rcn rcnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/riverlogger/inspector/RVLWebSocketClient");
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.g != null) {
            this.d.close(1000);
        }
    }

    public void g(String str, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ffd0bb", new Object[]{this, str, messagePriority});
        } else if (messagePriority != MessagePriority.Normal) {
            this.f.add(str);
            if (this.d.isOpen()) {
                i();
            }
        } else if (this.d.isOpen()) {
            this.d.send(str);
        } else {
            this.e.add(str);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("f6d73acb", new Object[]{this, webSocket});
        }
        Socket socket = this.h;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("82babb12", new Object[]{this, webSocket});
        }
        Socket socket = this.h;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405de5b7", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.g.interrupt();
        try {
            Socket socket = this.h;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            onWebsocketError(webSocket, e);
        }
        ((mxn.a) this.b).a(i, str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d89a5b2", new Object[]{this, webSocket, new Integer(i), str});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a62f934", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketError(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48cd726", new Object[]{this, webSocket, exc});
        } else {
            ((mxn.a) this.b).b(exc.getMessage());
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b116f92", new Object[]{this, webSocket, byteBuffer});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c91ca9", new Object[]{this, webSocket, handshakedata});
            return;
        }
        while (true) {
            String poll = this.e.poll();
            if (poll != null) {
                this.d.send(poll);
            } else {
                i();
                ((mxn.a) this.b).d();
                return;
            }
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWriteDemand(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67db8b", new Object[]{this, webSocket});
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            Socket socket = this.h;
            if (socket == null) {
                this.h = new Socket();
            } else if (socket.isClosed()) {
                throw new SocketException("Socket is closed");
            }
            if (!this.h.isBound()) {
                d();
            }
            InputStream inputStream = this.h.getInputStream();
            this.i = this.h.getOutputStream();
            h();
            byte[] bArr = new byte[WebSocketImpl.RCVBUF];
            while (!this.d.isClosed() && !this.d.isClosing() && (read = inputStream.read(bArr)) != -1) {
                try {
                    this.d.decode(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.d.eot();
                    return;
                } catch (RuntimeException e) {
                    onWebsocketError(null, e);
                    this.d.closeConnection(1006, e.getMessage());
                    return;
                }
            }
            this.d.eot();
        } catch (Exception e2) {
            onWebsocketError(this.d, e2);
            this.d.closeConnection(-1, e2.getMessage());
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketMessage(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f6af29", new Object[]{this, webSocket, str});
        } else if (str != null && str.length() > 0) {
            ((mxn.a) this.b).c(str);
        }
    }
}
