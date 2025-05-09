package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.Thread;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.java_websocket.WebSocket;
import org.java_websocket.b;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.Framedata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class c1x extends b40 implements Runnable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int n = Runtime.getRuntime().availableProcessors();

    /* renamed from: a  reason: collision with root package name */
    private final Collection<WebSocket> f16782a;
    private final InetSocketAddress b;
    private ServerSocketChannel c;
    private Selector d;
    private List<Draft> e;
    private Thread f;
    private final AtomicBoolean g;
    public List<a> h;
    private List<b> i;
    private BlockingQueue<ByteBuffer> j;
    private int k;
    private final AtomicInteger l;
    private d1x m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends Thread {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private BlockingQueue<b> f16783a = new LinkedBlockingQueue();

        /* compiled from: Taobao */
        /* renamed from: tb.c1x$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class C0888a implements Thread.UncaughtExceptionHandler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0888a(a aVar, c1x c1xVar) {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
                    return;
                }
                PrintStream printStream = System.err;
                printStream.print("Uncaught exception in thread \"" + thread.getName() + "\":");
                th.printStackTrace(printStream);
            }
        }

        public a() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new C0888a(this, c1x.this));
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/server/WebSocketServer$WebSocketWorker");
        }

        public void a(b bVar) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95b709f8", new Object[]{this, bVar});
            } else {
                this.f16783a.put(bVar);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b bVar;
            RuntimeException e;
            c1x c1xVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            b bVar2 = null;
            while (true) {
                try {
                    try {
                        bVar = this.f16783a.take();
                    } catch (RuntimeException e2) {
                        bVar = bVar2;
                        e = e2;
                    }
                    try {
                        ByteBuffer byteBuffer = (ByteBuffer) ((LinkedBlockingQueue) bVar.b).poll();
                        try {
                            try {
                                bVar.j(byteBuffer);
                                c1xVar = c1x.this;
                            } catch (Throwable th) {
                                c1x.a(c1x.this, byteBuffer);
                                throw th;
                            }
                        } catch (Exception e3) {
                            PrintStream printStream = System.err;
                            printStream.println("Error while reading from remote connection: " + e3);
                            e3.printStackTrace();
                            c1xVar = c1x.this;
                        }
                        c1x.a(c1xVar, byteBuffer);
                        bVar2 = bVar;
                    } catch (RuntimeException e4) {
                        e = e4;
                        c1x.b(c1x.this, bVar, e);
                        return;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public c1x() {
        this(new InetSocketAddress(80), n, null);
    }

    private void D(ByteBuffer byteBuffer) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb6e470", new Object[]{this, byteBuffer});
        } else if (this.j.size() <= this.l.intValue()) {
            this.j.put(byteBuffer);
        }
    }

    private ByteBuffer M() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("1bd416ef", new Object[]{this});
        }
        return this.j.take();
    }

    public static /* synthetic */ void a(c1x c1xVar, ByteBuffer byteBuffer) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca11cdf", new Object[]{c1xVar, byteBuffer});
        } else {
            c1xVar.D(byteBuffer);
        }
    }

    public static /* synthetic */ void b(c1x c1xVar, WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4992bb3", new Object[]{c1xVar, webSocket, exc});
        } else {
            c1xVar.q(webSocket, exc);
        }
    }

    public static /* synthetic */ Object ipc$super(c1x c1xVar, String str, Object... objArr) {
        if (str.hashCode() == 297796930) {
            return super.onWebsocketHandshakeReceivedAsServer((WebSocket) objArr[0], (Draft) objArr[1], (mu3) objArr[2]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/server/WebSocketServer");
    }

    private Socket o(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Socket) ipChange.ipc$dispatch("6cfe2d31", new Object[]{this, webSocket});
        }
        return ((SocketChannel) ((b) webSocket).d.channel()).socket();
    }

    private void q(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9ec601", new Object[]{this, webSocket, exc});
            return;
        }
        w(webSocket, exc);
        List<a> list = this.h;
        if (list != null) {
            for (a aVar : list) {
                aVar.interrupt();
            }
        }
        Thread thread = this.f;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            J();
        } catch (IOException e) {
            w(null, e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            w(null, e2);
        }
    }

    private void r(SelectionKey selectionKey, WebSocket webSocket, IOException iOException) {
        SelectableChannel channel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de0fea65", new Object[]{this, selectionKey, webSocket, iOException});
        } else if (webSocket != null) {
            webSocket.closeConnection(1006, iOException.getMessage());
        } else if (selectionKey != null && (channel = selectionKey.channel()) != null && channel.isOpen()) {
            try {
                channel.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract void A(WebSocket webSocket, mu3 mu3Var);

    public abstract void B();

    public void C(WebSocket webSocket) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726ba415", new Object[]{this, webSocket});
        }
    }

    public void E(b bVar) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e9de7a", new Object[]{this, bVar});
            return;
        }
        if (bVar.f == null) {
            List<a> list = this.h;
            bVar.f = list.get(this.k % list.size());
            this.k++;
        }
        bVar.f.a(bVar);
    }

    public boolean G(WebSocket webSocket) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c61eeef", new Object[]{this, webSocket})).booleanValue();
        }
        synchronized (this.f16782a) {
            try {
                if (this.f16782a.contains(webSocket)) {
                    z = this.f16782a.remove(webSocket);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g.get() && this.f16782a.size() == 0) {
            this.f.interrupt();
        }
        return z;
    }

    public final void H(d1x d1xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c79e7b", new Object[]{this, d1xVar});
        } else {
            this.m = d1xVar;
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.f == null) {
            new Thread(this).start();
        } else {
            throw new IllegalStateException(getClass().getName().concat(" can only be started once."));
        }
    }

    public void J() throws IOException, InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            K(0);
        }
    }

    public void K(int i) throws InterruptedException {
        ArrayList arrayList;
        Selector selector;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e54289a", new Object[]{this, new Integer(i)});
        } else if (this.g.compareAndSet(false, true)) {
            synchronized (this.f16782a) {
                arrayList = new ArrayList(this.f16782a);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((WebSocket) it.next()).close(1001);
            }
            ((h97) this.m).a();
            synchronized (this) {
                try {
                    if (!(this.f == null || (selector = this.d) == null)) {
                        selector.wakeup();
                        this.f.join(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean c(WebSocket webSocket) {
        boolean add;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f08e778c", new Object[]{this, webSocket})).booleanValue();
        }
        if (!this.g.get()) {
            synchronized (this.f16782a) {
                add = this.f16782a.add(webSocket);
            }
            return add;
        }
        webSocket.close(1001);
        return true;
    }

    public void d(WebSocket webSocket) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8cd19f", new Object[]{this, webSocket});
        } else if (this.l.get() < (this.h.size() * 2) + 1) {
            this.l.incrementAndGet();
            this.j.put(l());
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e3ac92", new Object[]{this, str});
        } else {
            f(str, this.f16782a);
        }
    }

    public void f(String str, Collection<WebSocket> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2ee0c3", new Object[]{this, str, collection});
        } else if (str == null || collection == null) {
            throw new IllegalArgumentException();
        } else {
            HashMap hashMap = new HashMap();
            synchronized (collection) {
                for (WebSocket webSocket : collection) {
                    if (webSocket != null) {
                        Draft draft = webSocket.getDraft();
                        if (!hashMap.containsKey(draft)) {
                            hashMap.put(draft, draft.h(str, false));
                        }
                        try {
                            webSocket.sendFrame((Collection) hashMap.get(draft));
                        } catch (WebsocketNotConnectedException unused) {
                        }
                    }
                }
            }
        }
    }

    public void g(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d70d89", new Object[]{this, byteBuffer});
        } else {
            h(byteBuffer, this.f16782a);
        }
    }

    @Override // tb.b40
    public Collection<WebSocket> getConnections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("cc248f61", new Object[]{this});
        }
        return Collections.unmodifiableCollection(new ArrayList(this.f16782a));
    }

    @Override // tb.y0x
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("20fd5b62", new Object[]{this, webSocket});
        }
        return (InetSocketAddress) o(webSocket).getLocalSocketAddress();
    }

    public int getPort() {
        ServerSocketChannel serverSocketChannel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        int port = m().getPort();
        if (port != 0 || (serverSocketChannel = this.c) == null) {
            return port;
        }
        return serverSocketChannel.socket().getLocalPort();
    }

    @Override // tb.y0x
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("dbd63c29", new Object[]{this, webSocket});
        }
        return (InetSocketAddress) o(webSocket).getRemoteSocketAddress();
    }

    public void h(ByteBuffer byteBuffer, Collection<WebSocket> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9351e7a", new Object[]{this, byteBuffer, collection});
        } else if (byteBuffer == null || collection == null) {
            throw new IllegalArgumentException();
        } else {
            HashMap hashMap = new HashMap();
            synchronized (collection) {
                for (WebSocket webSocket : collection) {
                    if (webSocket != null) {
                        Draft draft = webSocket.getDraft();
                        if (!hashMap.containsKey(draft)) {
                            hashMap.put(draft, draft.i(byteBuffer, false));
                        }
                        try {
                            webSocket.sendFrame((Collection) hashMap.get(draft));
                        } catch (WebsocketNotConnectedException unused) {
                        }
                    }
                }
            }
        }
    }

    public void i(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e3878f", new Object[]{this, bArr});
        } else {
            j(bArr, this.f16782a);
        }
    }

    public void j(byte[] bArr, Collection<WebSocket> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e573b000", new Object[]{this, bArr, collection});
        } else if (bArr == null || collection == null) {
            throw new IllegalArgumentException();
        } else {
            h(ByteBuffer.wrap(bArr), collection);
        }
    }

    @Deprecated
    public Collection<WebSocket> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("27047eeb", new Object[]{this});
        }
        return getConnections();
    }

    public ByteBuffer l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("11a208a4", new Object[]{this});
        }
        return ByteBuffer.allocate(16384);
    }

    public InetSocketAddress m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("f5473752", new Object[]{this});
        }
        return this.b;
    }

    public List<Draft> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3bd51915", new Object[]{this});
        }
        return Collections.unmodifiableList(this.e);
    }

    @Override // tb.y0x
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271d2f00", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.d.wakeup();
        try {
            if (G(webSocket)) {
                s(webSocket, i, str, z);
            }
            try {
                C(webSocket);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                C(webSocket);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @Override // tb.y0x
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751320c9", new Object[]{this, webSocket, new Integer(i), str});
        } else {
            t(webSocket, i, str);
        }
    }

    @Override // tb.y0x
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d6ffd", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        } else {
            u(webSocket, i, str, z);
        }
    }

    @Override // tb.y0x
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812ffefd", new Object[]{this, webSocket, exc});
        } else {
            w(webSocket, exc);
        }
    }

    @Override // tb.j0x, tb.y0x
    public scp onWebsocketHandshakeReceivedAsServer(WebSocket webSocket, Draft draft, mu3 mu3Var) throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scp) ipChange.ipc$dispatch("11c00542", new Object[]{this, webSocket, draft, mu3Var});
        }
        return super.onWebsocketHandshakeReceivedAsServer(webSocket, draft, mu3Var);
    }

    @Override // tb.y0x
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14641332", new Object[]{this, webSocket, str});
        } else {
            y(webSocket, str);
        }
    }

    @Override // tb.j0x
    @Deprecated
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dcb7ccf", new Object[]{this, webSocket, framedata});
        } else {
            x(webSocket, framedata);
        }
    }

    @Override // tb.y0x
    public final void onWebsocketOpen(WebSocket webSocket, gta gtaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7204c7b", new Object[]{this, webSocket, gtaVar});
        } else if (c(webSocket)) {
            A(webSocket, (mu3) gtaVar);
        }
    }

    @Override // tb.y0x
    public final void onWriteDemand(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe48f9d4", new Object[]{this, webSocket});
            return;
        }
        b bVar = (b) webSocket;
        try {
            bVar.d.interestOps(5);
        } catch (CancelledKeyException unused) {
            ((LinkedBlockingQueue) bVar.f15416a).clear();
        }
        this.d.wakeup();
    }

    public final u0x p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u0x) ipChange.ipc$dispatch("3ca3e5d4", new Object[]{this});
        }
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x023a A[Catch: all -> 0x00a6, RuntimeException -> 0x00a9, TRY_ENTER, TryCatch #16 {RuntimeException -> 0x00a9, blocks: (B:19:0x007f, B:22:0x0089, B:25:0x0092, B:27:0x009b, B:29:0x00a3, B:38:0x00b7, B:40:0x00c3, B:42:0x00c9, B:43:0x00cf, B:46:0x00d6, B:48:0x00dc, B:50:0x00e2, B:54:0x00eb, B:57:0x00f4, B:58:0x0117, B:60:0x0129, B:62:0x012d, B:63:0x0130, B:66:0x0138, B:68:0x013e, B:69:0x0145, B:71:0x014d, B:73:0x015b, B:75:0x0161, B:77:0x0167, B:79:0x017a, B:81:0x0182, B:84:0x018a, B:85:0x018e, B:86:0x0192, B:87:0x0195, B:89:0x0197, B:91:0x019d, B:92:0x01a3, B:94:0x01ab, B:96:0x01b1, B:101:0x01bf, B:103:0x01c7, B:104:0x01cf, B:105:0x01d7, B:107:0x01dd, B:110:0x01e5, B:112:0x01eb, B:113:0x01f6, B:115:0x01fb, B:116:0x01fe, B:137:0x023a, B:138:0x023d), top: B:217:0x007f, outer: #2 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c1x.run():void");
    }

    public abstract void s(WebSocket webSocket, int i, String str, boolean z);

    public void t(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861f8432", new Object[]{this, webSocket, new Integer(i), str});
        }
    }

    public void u(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95ed626", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        }
    }

    public boolean v(SelectionKey selectionKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91d61dbb", new Object[]{this, selectionKey})).booleanValue();
        }
        return true;
    }

    public abstract void w(WebSocket webSocket, Exception exc);

    @Deprecated
    public void x(WebSocket webSocket, Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab8986f", new Object[]{this, webSocket, framedata});
        }
    }

    public abstract void y(WebSocket webSocket, String str);

    public void z(WebSocket webSocket, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed901e0", new Object[]{this, webSocket, byteBuffer});
        }
    }

    public c1x(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, n, null);
    }

    @Override // tb.y0x
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fda2e9", new Object[]{this, webSocket, byteBuffer});
        } else {
            z(webSocket, byteBuffer);
        }
    }

    public c1x(InetSocketAddress inetSocketAddress, int i) {
        this(inetSocketAddress, i, null);
    }

    public c1x(InetSocketAddress inetSocketAddress, List<Draft> list) {
        this(inetSocketAddress, n, list);
    }

    public c1x(InetSocketAddress inetSocketAddress, int i, List<Draft> list) {
        this(inetSocketAddress, i, list, new HashSet());
    }

    public c1x(InetSocketAddress inetSocketAddress, int i, List<Draft> list, Collection<WebSocket> collection) {
        this.g = new AtomicBoolean(false);
        this.k = 0;
        this.l = new AtomicInteger(0);
        this.m = new h97();
        if (inetSocketAddress == null || i < 1 || collection == null) {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        if (list == null) {
            this.e = Collections.emptyList();
        } else {
            this.e = list;
        }
        this.b = inetSocketAddress;
        this.f16782a = collection;
        setTcpNoDelay(false);
        setReuseAddr(false);
        this.i = new LinkedList();
        this.h = new ArrayList(i);
        this.j = new LinkedBlockingQueue();
        for (int i2 = 0; i2 < i; i2++) {
            a aVar = new a();
            this.h.add(aVar);
            aVar.start();
        }
    }
}
