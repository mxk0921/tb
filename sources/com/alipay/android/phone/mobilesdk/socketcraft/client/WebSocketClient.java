package com.alipay.android.phone.mobilesdk.socketcraft.client;

import anet.channel.util.HttpConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketAdapter;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.SSLExtensionsFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class WebSocketClient extends WebSocketAdapter implements WebSocket, Runnable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String m = "WebSocketClient";

    /* renamed from: a  reason: collision with root package name */
    private WebSocketImpl f3753a;
    private Socket b;
    private InputStream c;
    private OutputStream d;
    private Proxy e;
    private Thread f;
    private Draft g;
    private Map<String, String> h;
    private CountDownLatch i;
    private CountDownLatch j;
    private int k;
    private SSLSocketFactory l;
    public URI uri;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class WebsocketWriteThread implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private WebsocketWriteThread() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = WebSocketClient.access$100(WebSocketClient.this).outQueue.take();
                    WebSocketClient.access$200(WebSocketClient.this).write(take.array(), 0, take.limit());
                    WebSocketClient.access$200(WebSocketClient.this).flush();
                } catch (IOException unused) {
                    WebSocketClient.access$100(WebSocketClient.this).eot();
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }

    public WebSocketClient(URI uri) {
        this(uri, new Draft_17());
    }

    /* JADX WARN: Finally extract failed */
    private void a() {
        String str = " null ";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5d706b", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.uri.getHost());
            if (allByName == null || allByName.length <= 0) {
                throw new UnknownHostException("Unknown host : " + this.uri.getHost());
            }
            InetAddress inetAddress = allByName[0];
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (inetAddress != null) {
                str = inetAddress.getHostAddress();
            }
            onDns(str, currentTimeMillis2);
            SCLogCatUtil.info(m, "DNS timing: " + currentTimeMillis2 + ", ip: " + str);
            long currentTimeMillis3 = System.currentTimeMillis();
            try {
                this.b.connect(new InetSocketAddress(inetAddress, b()), this.k);
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                String hostAddress = inetAddress.getHostAddress();
                onTcpConnect(hostAddress, currentTimeMillis4);
                SCLogCatUtil.info(m, "Connection timing: " + currentTimeMillis4 + ", ip: " + hostAddress);
                SSLSocketFactory sSLSocketFactory = this.l;
                if (sSLSocketFactory != null) {
                    SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(this.b, this.uri.getHost(), b(), true);
                    SSLExtensionsFactory.getInstance().enableTlsExtensions(sSLSocket, this.uri.getHost());
                    long currentTimeMillis5 = System.currentTimeMillis();
                    try {
                        sSLSocket.startHandshake();
                        long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
                        onSSLHandshake(currentTimeMillis6);
                        SCLogCatUtil.info(m, "SSL timing: " + currentTimeMillis6 + ", ip: " + inetAddress.getHostAddress());
                        this.b = sSLSocket;
                    } catch (Throwable th) {
                        long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis5;
                        onSSLHandshake(currentTimeMillis7);
                        SCLogCatUtil.info(m, "SSL timing: " + currentTimeMillis7 + ", ip: " + inetAddress.getHostAddress());
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                long currentTimeMillis8 = System.currentTimeMillis() - currentTimeMillis3;
                String hostAddress2 = inetAddress.getHostAddress();
                onTcpConnect(hostAddress2, currentTimeMillis8);
                SCLogCatUtil.info(m, "Connection timing: " + currentTimeMillis8 + ", ip: " + hostAddress2);
                throw th2;
            }
        } catch (Throwable th3) {
            long currentTimeMillis9 = System.currentTimeMillis() - currentTimeMillis;
            onDns(str, currentTimeMillis9);
            SCLogCatUtil.info(m, "DNS timing: " + currentTimeMillis9 + ", ip:  null ");
            throw th3;
        }
    }

    public static /* synthetic */ WebSocketImpl access$100(WebSocketClient webSocketClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocketImpl) ipChange.ipc$dispatch("55e385", new Object[]{webSocketClient});
        }
        return webSocketClient.f3753a;
    }

    public static /* synthetic */ OutputStream access$200(WebSocketClient webSocketClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutputStream) ipChange.ipc$dispatch("6c1d03df", new Object[]{webSocketClient});
        }
        return webSocketClient.d;
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        int port = this.uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.uri.getScheme();
        if (scheme.equals("wss")) {
            return 443;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        throw new RuntimeException("unkonow scheme".concat(scheme));
    }

    private void c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d940a56", new Object[]{this});
            return;
        }
        String path = this.uri.getPath();
        String query = this.uri.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            path = path + "?" + query;
        }
        int b = b();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        if (b != 80) {
            str = ":" + b;
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
        handshakeImpl1Client.setResourceDescriptor(path);
        handshakeImpl1Client.put(HttpConstant.HOST, sb2);
        Map<String, String> map = this.h;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                handshakeImpl1Client.put(entry.getKey(), entry.getValue());
            }
        }
        this.f3753a.startHandshake(handshakeImpl1Client);
    }

    public static /* synthetic */ Object ipc$super(WebSocketClient webSocketClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/client/WebSocketClient");
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f != null) {
            this.f3753a.close(1000);
        }
    }

    public void closeBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf49cc54", new Object[]{this});
            return;
        }
        close();
        this.j.await();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void closeConnection(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed9f270", new Object[]{this, new Integer(i), str});
        } else {
            this.f3753a.closeConnection(i, str);
        }
    }

    public void connect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
        } else if (this.f == null) {
            Thread thread = new Thread(this);
            this.f = thread;
            thread.start();
        } else {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
    }

    public boolean connectBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("271d8c4a", new Object[]{this})).booleanValue();
        }
        connect();
        this.i.await();
        return this.f3753a.isOpen();
    }

    public WebSocket getConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocket) ipChange.ipc$dispatch("34185df4", new Object[]{this});
        }
        return this.f3753a;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public Draft getDraft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft) ipChange.ipc$dispatch("b6ad590e", new Object[]{this});
        }
        return this.g;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("f6d73acb", new Object[]{this, webSocket});
        }
        Socket socket = this.b;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public WebSocket.READYSTATE getReadyState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocket.READYSTATE) ipChange.ipc$dispatch("f03d3500", new Object[]{this});
        }
        return this.f3753a.getReadyState();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("82babb12", new Object[]{this, webSocket});
        }
        Socket socket = this.b;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public String getResourceDescriptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2af5ecc6", new Object[]{this});
        }
        return this.uri.getPath();
    }

    public URI getURI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("8e1ee1b", new Object[]{this});
        }
        return this.uri;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean hasBufferedData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("955097ee", new Object[]{this})).booleanValue();
        }
        return this.f3753a.hasBufferedData();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isClosed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue();
        }
        return this.f3753a.isClosed();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isClosing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7191b36", new Object[]{this})).booleanValue();
        }
        return this.f3753a.isClosing();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isConnecting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0376f0d", new Object[]{this})).booleanValue();
        }
        return this.f3753a.isConnecting();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isFlushAndClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3388386", new Object[]{this})).booleanValue();
        }
        return this.f3753a.isFlushAndClose();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return this.f3753a.isOpen();
    }

    public abstract void onClose(int i, String str, boolean z);

    public void onCloseInitiated(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f8454", new Object[]{this, new Integer(i), str});
        }
    }

    public void onClosing(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528da944", new Object[]{this, new Integer(i), str, new Boolean(z)});
        }
    }

    public void onDns(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f324c49", new Object[]{this, str, new Long(j)});
        }
    }

    public abstract void onError(Exception exc);

    public void onFragment(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef752684", new Object[]{this, framedata});
        }
    }

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        }
    }

    public abstract void onOpen(ServerHandshake serverHandshake);

    public void onSSLHandshake(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180eb693", new Object[]{this, new Long(j)});
        }
    }

    public void onTcpConnect(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3713a44b", new Object[]{this, str, new Long(j)});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405de5b7", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.i.countDown();
        this.j.countDown();
        Thread thread = this.f;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            Socket socket = this.b;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            onWebsocketError(this, e);
        }
        onClose(i, str, z);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d89a5b2", new Object[]{this, webSocket, new Integer(i), str});
        } else {
            onCloseInitiated(i, str);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a62f934", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        } else {
            onClosing(i, str, z);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48cd726", new Object[]{this, webSocket, exc});
        } else {
            onError(exc);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f6af29", new Object[]{this, webSocket, str});
        } else {
            onMessage(str);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketAdapter, com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ae0c7d", new Object[]{this, webSocket, framedata});
        } else {
            onFragment(framedata);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c91ca9", new Object[]{this, webSocket, handshakedata});
            return;
        }
        this.i.countDown();
        onOpen((ServerHandshake) handshakedata);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWriteDemand(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67db8b", new Object[]{this, webSocket});
        }
    }

    public void onWsHandshake(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685f4781", new Object[]{this, new Long(j)});
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
            Socket socket = this.b;
            if (socket == null) {
                this.b = new Socket(this.e);
            } else if (socket.isClosed()) {
                throw new SocketException("Socket is closed");
            }
            if (!this.b.isBound()) {
                a();
            }
            this.c = this.b.getInputStream();
            this.d = this.b.getOutputStream();
            long currentTimeMillis = System.currentTimeMillis();
            c();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            onWsHandshake(currentTimeMillis2);
            SCLogCatUtil.info(m, "WebSocketHandshark timing: " + currentTimeMillis2);
            Thread thread = new Thread(new WebsocketWriteThread());
            this.f = thread;
            thread.start();
            byte[] bArr = new byte[WebSocketImpl.RCVBUF];
            while (!isClosed() && !isClosing() && (read = this.c.read(bArr)) != -1) {
                try {
                    this.f3753a.decode(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.f3753a.eot();
                    return;
                } catch (RuntimeException e) {
                    onError(e);
                    this.f3753a.closeConnection(1006, e.getMessage());
                    return;
                }
            }
            this.f3753a.eot();
        } catch (Exception e2) {
            onWebsocketError(this.f3753a, e2);
            this.f3753a.closeConnection(-1, e2.getMessage());
        }
    }

    public void send(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{this, str});
        } else {
            this.f3753a.send(str);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4eab6", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        } else {
            this.f3753a.sendFragmentedFrame(opcode, byteBuffer, z);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void sendFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da45f7a", new Object[]{this, framedata});
        } else {
            this.f3753a.sendFrame(framedata);
        }
    }

    public void setProxy(Proxy proxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd032e53", new Object[]{this, proxy});
        } else if (proxy != null) {
            this.e = proxy;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setSocket(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2bd1933", new Object[]{this, socket});
        } else if (this.b == null) {
            this.b = socket;
        } else {
            throw new IllegalStateException("socket has already been set");
        }
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f41164a", new Object[]{this, sSLSocketFactory});
        } else {
            this.l = sSLSocketFactory;
        }
    }

    public WebSocketClient(URI uri, Draft draft) {
        this(uri, draft, null, 0);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b116f92", new Object[]{this, webSocket, byteBuffer});
        } else {
            onMessage(byteBuffer);
        }
    }

    public void send(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else {
            this.f3753a.send(bArr);
        }
    }

    public WebSocketClient(URI uri, Draft draft, Map<String, String> map, int i) {
        this.uri = null;
        this.f3753a = null;
        this.b = null;
        this.e = Proxy.NO_PROXY;
        this.i = new CountDownLatch(1);
        this.j = new CountDownLatch(1);
        this.k = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        } else if (draft != null) {
            this.uri = uri;
            this.g = draft;
            this.h = map;
            this.k = i;
            this.f3753a = new WebSocketImpl(this, draft);
        } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82499c64", new Object[]{this, new Integer(i)});
        } else {
            this.f3753a.close();
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("12ea2804", new Object[]{this}) : this.f3753a.getLocalSocketAddress();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("f283cf0b", new Object[]{this}) : this.f3753a.getRemoteSocketAddress();
    }

    public void send(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652184a2", new Object[]{this, byteBuffer});
        } else {
            this.f3753a.send(byteBuffer);
        }
    }

    public void close(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eedf52e", new Object[]{this, new Integer(i), str});
        } else {
            this.f3753a.close(i, str);
        }
    }
}
