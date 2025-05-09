package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.framing.Framedata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class n0x extends b40 implements Runnable, WebSocket {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CountDownLatch closeLatch;
    private CountDownLatch connectLatch;
    private Thread connectReadThread;
    private int connectTimeout;
    private Draft draft;
    private org.java_websocket.b engine;
    private Map<String, String> headers;
    private OutputStream ostream;
    private Proxy proxy;
    private Socket socket;
    public URI uri;
    private Thread writeThread;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Thread currentThread = Thread.currentThread();
            currentThread.setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            while (true) {
                try {
                    try {
                        try {
                            if (Thread.interrupted()) {
                                break;
                            }
                            ByteBuffer byteBuffer = (ByteBuffer) ((LinkedBlockingQueue) n0x.access$100(n0x.this).f15416a).take();
                            n0x.access$200(n0x.this).write(byteBuffer.array(), 0, byteBuffer.limit());
                            n0x.access$200(n0x.this).flush();
                        } catch (InterruptedException unused) {
                            Iterator it = ((LinkedBlockingQueue) n0x.access$100(n0x.this).f15416a).iterator();
                            while (it.hasNext()) {
                                ByteBuffer byteBuffer2 = (ByteBuffer) it.next();
                                n0x.access$200(n0x.this).write(byteBuffer2.array(), 0, byteBuffer2.limit());
                                n0x.access$200(n0x.this).flush();
                            }
                        }
                    } catch (IOException e) {
                        n0x.access$300(n0x.this, e);
                    }
                } finally {
                    n0x.access$400(n0x.this);
                    n0x.access$502(n0x.this, null);
                }
            }
        }
    }

    public n0x(URI uri) {
        this(uri, new org.java_websocket.drafts.a());
    }

    public static /* synthetic */ org.java_websocket.b access$100(n0x n0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.java_websocket.b) ipChange.ipc$dispatch("b410ff97", new Object[]{n0xVar});
        }
        return n0xVar.engine;
    }

    public static /* synthetic */ OutputStream access$200(n0x n0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OutputStream) ipChange.ipc$dispatch("44537068", new Object[]{n0xVar});
        }
        return n0xVar.ostream;
    }

    public static /* synthetic */ void access$300(n0x n0xVar, IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba731a95", new Object[]{n0xVar, iOException});
        } else {
            n0xVar.handleIOException(iOException);
        }
    }

    public static /* synthetic */ void access$400(n0x n0xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b5311e", new Object[]{n0xVar});
        } else {
            n0xVar.closeSocket();
        }
    }

    public static /* synthetic */ Thread access$502(n0x n0xVar, Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("e24e4bdb", new Object[]{n0xVar, thread});
        }
        n0xVar.writeThread = thread;
        return thread;
    }

    private void closeSocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdf5692", new Object[]{this});
            return;
        }
        try {
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            onWebsocketError(this, e);
        }
    }

    private int getPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        int port = this.uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.uri.getScheme();
        if ("wss".equals(scheme)) {
            return 443;
        }
        if ("ws".equals(scheme)) {
            return 80;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }

    private void handleIOException(IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d2f28c", new Object[]{this, iOException});
            return;
        }
        if (iOException instanceof SSLException) {
            onError(iOException);
        }
        this.engine.m();
    }

    public static /* synthetic */ Object ipc$super(n0x n0xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/client/WebSocketClient");
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread == this.writeThread || currentThread == this.connectReadThread) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup.");
        }
        try {
            closeBlocking();
            Thread thread = this.writeThread;
            if (thread != null) {
                thread.interrupt();
                this.writeThread = null;
            }
            Thread thread2 = this.connectReadThread;
            if (thread2 != null) {
                thread2.interrupt();
                this.connectReadThread = null;
            }
            this.draft.t();
            Socket socket = this.socket;
            if (socket != null) {
                socket.close();
                this.socket = null;
            }
            this.connectLatch = new CountDownLatch(1);
            this.closeLatch = new CountDownLatch(1);
            this.engine = new org.java_websocket.b(this, this.draft);
        } catch (Exception e) {
            onError(e);
            this.engine.closeConnection(1006, e.getMessage());
        }
    }

    private void sendHandshake() throws InvalidHandshakeException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d940a56", new Object[]{this});
            return;
        }
        String rawPath = this.uri.getRawPath();
        String rawQuery = this.uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + f7l.CONDITION_IF + rawQuery;
        }
        int port = getPort();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        if (port == 80 || port == 443) {
            str = "";
        } else {
            str = ":" + port;
        }
        sb.append(str);
        String sb2 = sb.toString();
        cta ctaVar = new cta();
        ctaVar.a(rawPath);
        ctaVar.put(HttpConstant.HOST, sb2);
        Map<String, String> map = this.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ctaVar.put(entry.getKey(), entry.getValue());
            }
        }
        this.engine.E(ctaVar);
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.writeThread != null) {
            this.engine.close(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf49cc54", new Object[]{this});
            return;
        }
        close();
        this.closeLatch.await();
    }

    @Override // org.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed9f270", new Object[]{this, new Integer(i), str});
        } else {
            this.engine.closeConnection(i, str);
        }
    }

    public void connect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
        } else if (this.connectReadThread == null) {
            Thread thread = new Thread(this);
            this.connectReadThread = thread;
            thread.setName("WebSocketConnectReadThread-" + this.connectReadThread.getId());
            this.connectReadThread.start();
        } else {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
    }

    public boolean connectBlocking() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("271d8c4a", new Object[]{this})).booleanValue();
        }
        connect();
        this.connectLatch.await();
        return this.engine.isOpen();
    }

    public <T> T getAttachment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c2c41a12", new Object[]{this});
        }
        return (T) this.engine.p();
    }

    public WebSocket getConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocket) ipChange.ipc$dispatch("d5b1c77d", new Object[]{this});
        }
        return this.engine;
    }

    @Override // tb.b40
    public Collection<WebSocket> getConnections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("cc248f61", new Object[]{this});
        }
        return Collections.singletonList(this.engine);
    }

    @Override // org.java_websocket.WebSocket
    public Draft getDraft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft) ipChange.ipc$dispatch("56954f65", new Object[]{this});
        }
        return this.draft;
    }

    @Override // tb.y0x
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("20fd5b62", new Object[]{this, webSocket});
        }
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    public WebSocket.READYSTATE getReadyState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocket.READYSTATE) ipChange.ipc$dispatch("bf1383d7", new Object[]{this});
        }
        return this.engine.r();
    }

    @Override // tb.y0x
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("dbd63c29", new Object[]{this, webSocket});
        }
        Socket socket = this.socket;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    public String getResourceDescriptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2af5ecc6", new Object[]{this});
        }
        return this.uri.getPath();
    }

    public Socket getSocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("d1f9228f", new Object[]{this});
        }
        return this.socket;
    }

    public URI getURI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("8e1ee1b", new Object[]{this});
        }
        return this.uri;
    }

    public boolean hasBufferedData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("955097ee", new Object[]{this})).booleanValue();
        }
        return this.engine.t();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue();
        }
        return this.engine.isClosed();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7191b36", new Object[]{this})).booleanValue();
        }
        return this.engine.isClosing();
    }

    @Deprecated
    public boolean isConnecting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0376f0d", new Object[]{this})).booleanValue();
        }
        return this.engine.u();
    }

    public boolean isFlushAndClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3388386", new Object[]{this})).booleanValue();
        }
        return this.engine.v();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return this.engine.isOpen();
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

    public abstract void onError(Exception exc);

    @Deprecated
    public void onFragment(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3cb89cd", new Object[]{this, framedata});
        }
    }

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        }
    }

    public abstract void onOpen(rcp rcpVar);

    @Override // tb.y0x
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271d2f00", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
            return;
        }
        stopConnectionLostTimer();
        Thread thread = this.writeThread;
        if (thread != null) {
            thread.interrupt();
        }
        onClose(i, str, z);
        this.connectLatch.countDown();
        this.closeLatch.countDown();
    }

    @Override // tb.y0x
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751320c9", new Object[]{this, webSocket, new Integer(i), str});
        } else {
            onCloseInitiated(i, str);
        }
    }

    @Override // tb.y0x
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d6ffd", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        } else {
            onClosing(i, str, z);
        }
    }

    @Override // tb.y0x
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812ffefd", new Object[]{this, webSocket, exc});
        } else {
            onError(exc);
        }
    }

    @Override // tb.y0x
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14641332", new Object[]{this, webSocket, str});
        } else {
            onMessage(str);
        }
    }

    @Override // tb.j0x
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dcb7ccf", new Object[]{this, webSocket, framedata});
        } else {
            onFragment(framedata);
        }
    }

    @Override // tb.y0x
    public final void onWebsocketOpen(WebSocket webSocket, gta gtaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7204c7b", new Object[]{this, webSocket, gtaVar});
            return;
        }
        startConnectionLostTimer();
        onOpen((rcp) gtaVar);
        this.connectLatch.countDown();
    }

    @Override // tb.y0x
    public final void onWriteDemand(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe48f9d4", new Object[]{this, webSocket});
        }
    }

    public void reconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61e9c5e", new Object[]{this});
            return;
        }
        reset();
        connect();
    }

    public boolean reconnectBlocking() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26147337", new Object[]{this})).booleanValue();
        }
        reset();
        return connectBlocking();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        int read;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            Socket socket = this.socket;
            if (socket == null) {
                this.socket = new Socket(this.proxy);
                z = true;
            } else if (!socket.isClosed()) {
                z = false;
            } else {
                throw new IOException();
            }
            this.socket.setTcpNoDelay(isTcpNoDelay());
            this.socket.setReuseAddress(isReuseAddr());
            if (!this.socket.isBound()) {
                this.socket.connect(new InetSocketAddress(this.uri.getHost(), getPort()), this.connectTimeout);
            }
            if (z && "wss".equals(this.uri.getScheme())) {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, null);
                this.socket = instance.getSocketFactory().createSocket(this.socket, this.uri.getHost(), getPort(), true);
            }
            InputStream inputStream = this.socket.getInputStream();
            this.ostream = this.socket.getOutputStream();
            sendHandshake();
            Thread thread = new Thread(new b());
            this.writeThread = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!isClosing() && !isClosed() && (read = inputStream.read(bArr)) != -1) {
                try {
                    this.engine.j(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException e) {
                    handleIOException(e);
                } catch (RuntimeException e2) {
                    onError(e2);
                    this.engine.closeConnection(1006, e2.getMessage());
                }
            }
            this.engine.m();
            this.connectReadThread = null;
        } catch (Exception e3) {
            onWebsocketError(this.engine, e3);
            this.engine.closeConnection(-1, e3.getMessage());
        }
    }

    @Override // org.java_websocket.WebSocket
    public void send(String str) throws NotYetConnectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{this, str});
        } else {
            this.engine.send(str);
        }
    }

    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c5e78d", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        } else {
            this.engine.A(opcode, byteBuffer, z);
        }
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aeafc3", new Object[]{this, framedata});
        } else {
            this.engine.sendFrame(framedata);
        }
    }

    public void sendPing() throws NotYetConnectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9428a1", new Object[]{this});
        } else {
            this.engine.B();
        }
    }

    public <T> void setAttachment(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c04608", new Object[]{this, t});
        } else {
            this.engine.C(t);
        }
    }

    public void setProxy(Proxy proxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd032e53", new Object[]{this, proxy});
        } else if (proxy != null) {
            this.proxy = proxy;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setSocket(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2bd1933", new Object[]{this, socket});
        } else if (this.socket == null) {
            this.socket = socket;
        } else {
            throw new IllegalStateException("socket has already been set");
        }
    }

    public n0x(URI uri, Draft draft) {
        this(uri, draft, null, 0);
    }

    @Override // tb.y0x
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fda2e9", new Object[]{this, webSocket, byteBuffer});
        } else {
            onMessage(byteBuffer);
        }
    }

    public void send(byte[] bArr) throws NotYetConnectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else {
            this.engine.z(bArr);
        }
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Collection<Framedata> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830be57d", new Object[]{this, collection});
        } else {
            this.engine.sendFrame(collection);
        }
    }

    public n0x(URI uri, Map<String, String> map) {
        this(uri, new org.java_websocket.drafts.a(), map);
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82499c64", new Object[]{this, new Integer(i)});
        } else {
            this.engine.a();
        }
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("12ea2804", new Object[]{this}) : this.engine.getLocalSocketAddress();
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("f283cf0b", new Object[]{this}) : this.engine.getRemoteSocketAddress();
    }

    public void send(ByteBuffer byteBuffer) throws IllegalArgumentException, NotYetConnectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652184a2", new Object[]{this, byteBuffer});
        } else {
            this.engine.x(byteBuffer);
        }
    }

    public n0x(URI uri, Draft draft, Map<String, String> map) {
        this(uri, draft, map, 0);
    }

    public void close(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eedf52e", new Object[]{this, new Integer(i), str});
        } else {
            this.engine.b(i, str);
        }
    }

    public boolean connectBlocking(long j, TimeUnit timeUnit) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6fa013e", new Object[]{this, new Long(j), timeUnit})).booleanValue();
        }
        connect();
        return this.connectLatch.await(j, timeUnit) && this.engine.isOpen();
    }

    public n0x(URI uri, Draft draft, Map<String, String> map, int i) {
        this.uri = null;
        this.engine = null;
        this.socket = null;
        this.proxy = Proxy.NO_PROXY;
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.connectTimeout = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        } else if (draft != null) {
            this.uri = uri;
            this.draft = draft;
            this.headers = map;
            this.connectTimeout = i;
            setTcpNoDelay(false);
            setReuseAddr(false);
            this.engine = new org.java_websocket.b(this, draft);
        } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
    }
}
