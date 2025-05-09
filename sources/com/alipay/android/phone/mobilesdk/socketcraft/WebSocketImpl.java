package com.alipay.android.phone.mobilesdk.socketcraft;

import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_10;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_76;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.WebsocketNotConnectedException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrame;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WebSocketImpl implements WebSocket {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean DEBUG = true;
    public static int RCVBUF = 16384;
    public static final String TAG = "WebSocketImpl";
    public static final List<Draft> defaultdraftlist;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f3750a;
    public WebSocket.READYSTATE b;
    public final WebSocketListener c;
    public ByteChannel channel;
    public final List<Draft> d;
    public Draft e;
    public final WebSocket.Role f;
    public Framedata.Opcode g;
    public ByteBuffer h;
    public ClientHandshake i;
    public final BlockingQueue<ByteBuffer> inQueue;
    public String j;
    public Integer k;
    public SelectionKey key;
    public Boolean l;
    public String m;
    public final BlockingQueue<ByteBuffer> outQueue;

    static {
        ArrayList arrayList = new ArrayList(4);
        defaultdraftlist = arrayList;
        arrayList.add(new Draft_17());
        arrayList.add(new Draft_10());
        arrayList.add(new Draft_76());
        arrayList.add(new Draft_75());
    }

    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list) {
        this(webSocketListener, (Draft) null);
        this.f = WebSocket.Role.SERVER;
        if (list == null || list.isEmpty()) {
            this.d = defaultdraftlist;
        } else {
            this.d = list;
        }
    }

    public final void a(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed16366", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        WebSocket.READYSTATE readystate = this.b;
        WebSocket.READYSTATE readystate2 = WebSocket.READYSTATE.CLOSING;
        if (readystate != readystate2 && readystate != WebSocket.READYSTATE.CLOSED) {
            if (readystate == WebSocket.READYSTATE.OPEN) {
                if (i == 1006) {
                    this.b = readystate2;
                    flushAndClose(i, str, false);
                    return;
                }
                if (this.e.getCloseHandshakeType() != Draft.CloseHandshakeType.NONE) {
                    try {
                        if (!z) {
                            try {
                                this.c.onWebsocketCloseInitiated(this, i, str);
                            } catch (RuntimeException e) {
                                this.c.onWebsocketError(this, e);
                            }
                        }
                        sendFrame(new CloseFrameBuilder(i, str));
                    } catch (InvalidDataException e2) {
                        this.c.onWebsocketError(this, e2);
                        flushAndClose(1006, "generated frame is invalid", false);
                    }
                }
                flushAndClose(i, str, z);
            } else if (i == -3) {
                flushAndClose(-3, str, true);
            } else {
                flushAndClose(-1, str, false);
            }
            if (i == 1002) {
                flushAndClose(i, str, z);
            }
            this.b = WebSocket.READYSTATE.CLOSING;
            this.h = null;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eedf52e", new Object[]{this, new Integer(i), str});
        } else {
            a(i, str, false);
        }
    }

    public synchronized void closeConnection(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c650e64", new Object[]{this, new Integer(i), str, new Boolean(z)});
        } else if (this.b != WebSocket.READYSTATE.CLOSED) {
            SelectionKey selectionKey = this.key;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.channel;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e) {
                    this.c.onWebsocketError(this, e);
                }
            }
            try {
                this.c.onWebsocketClose(this, i, str, z);
            } catch (RuntimeException e2) {
                this.c.onWebsocketError(this, e2);
            }
            Draft draft = this.e;
            if (draft != null) {
                draft.reset();
            }
            this.i = null;
            this.b = WebSocket.READYSTATE.CLOSED;
            this.outQueue.clear();
        }
    }

    public final Draft.HandshakeState d(ByteBuffer byteBuffer) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("e9793785", new Object[]{this, byteBuffer});
        }
        byteBuffer.mark();
        int limit = byteBuffer.limit();
        byte[] bArr = Draft.FLASH_POLICY_REQUEST;
        if (limit > bArr.length) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (byteBuffer.limit() >= bArr.length) {
            while (byteBuffer.hasRemaining()) {
                if (Draft.FLASH_POLICY_REQUEST[i] != byteBuffer.get()) {
                    byteBuffer.reset();
                    return Draft.HandshakeState.NOT_MATCHED;
                }
                i++;
            }
            return Draft.HandshakeState.MATCHED;
        }
        throw new IncompleteHandshakeException(bArr.length);
    }

    public void decode(ByteBuffer byteBuffer) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0a20fc", new Object[]{this, byteBuffer});
            return;
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("process(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            if (byteBuffer.remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            }
            sb.append(str);
            sb.append("}");
            SCLogCatUtil.debug(TAG, sb.toString());
        }
        if (this.b != WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            b(byteBuffer);
        } else if (!c(byteBuffer)) {
        } else {
            if (byteBuffer.hasRemaining()) {
                b(byteBuffer);
            } else if (this.h.hasRemaining()) {
                b(this.h);
            }
        }
    }

    public final void e(Handshakedata handshakedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af966ec8", new Object[]{this, handshakedata});
            return;
        }
        if (DEBUG) {
            SCLogCatUtil.debug(TAG, "open using draft: ".concat(this.e.getClass().getSimpleName()));
        }
        this.b = WebSocket.READYSTATE.OPEN;
        try {
            this.c.onWebsocketOpen(this, handshakedata);
        } catch (RuntimeException e) {
            this.c.onWebsocketError(this, e);
        }
    }

    public void eot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b77891", new Object[]{this});
        } else if (getReadyState() == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            closeConnection(-1, true);
        } else if (this.f3750a) {
            closeConnection(this.k.intValue(), this.j, this.l.booleanValue());
        } else if (this.e.getCloseHandshakeType() == Draft.CloseHandshakeType.NONE) {
            closeConnection(1000, true);
        } else if (this.e.getCloseHandshakeType() != Draft.CloseHandshakeType.ONEWAY || this.f == WebSocket.Role.SERVER) {
            closeConnection(1006, true);
        } else {
            closeConnection(1000, true);
        }
    }

    public final void f(Collection<Framedata> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925f1880", new Object[]{this, collection});
        } else if (isOpen()) {
            for (Framedata framedata : collection) {
                sendFrame(framedata);
            }
        } else {
            throw new WebsocketNotConnectedException();
        }
    }

    public synchronized void flushAndClose(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e114bf3", new Object[]{this, new Integer(i), str, new Boolean(z)});
        } else if (!this.f3750a) {
            this.k = Integer.valueOf(i);
            this.j = str;
            this.l = Boolean.valueOf(z);
            this.f3750a = true;
            this.c.onWriteDemand(this);
            try {
                this.c.onWebsocketClosing(this, i, str, z);
            } catch (RuntimeException e) {
                this.c.onWebsocketError(this, e);
            }
            Draft draft = this.e;
            if (draft != null) {
                draft.reset();
            }
            this.i = null;
        }
    }

    public final void g(ByteBuffer byteBuffer) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9193c2b", new Object[]{this, byteBuffer});
            return;
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            if (byteBuffer.remaining() > 1000) {
                str = "too big to display";
            } else {
                str = new String(byteBuffer.array());
            }
            sb.append(str);
            sb.append("}");
            SCLogCatUtil.debug(TAG, sb.toString());
        }
        this.outQueue.add(byteBuffer);
        this.c.onWriteDemand(this);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public Draft getDraft() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft) ipChange.ipc$dispatch("b6ad590e", new Object[]{this});
        }
        return this.e;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("12ea2804", new Object[]{this});
        }
        return this.c.getLocalSocketAddress(this);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public WebSocket.READYSTATE getReadyState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocket.READYSTATE) ipChange.ipc$dispatch("f03d3500", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("f283cf0b", new Object[]{this});
        }
        return this.c.getRemoteSocketAddress(this);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public String getResourceDescriptor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2af5ecc6", new Object[]{this});
        }
        return this.m;
    }

    public final void h(List<ByteBuffer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77ed5d7", new Object[]{this, list});
            return;
        }
        for (ByteBuffer byteBuffer : list) {
            g(byteBuffer);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean hasBufferedData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("955097ee", new Object[]{this})).booleanValue();
        }
        if (!this.outQueue.isEmpty()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return super.hashCode();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isClosed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue();
        }
        if (this.b == WebSocket.READYSTATE.CLOSED) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isClosing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7191b36", new Object[]{this})).booleanValue();
        }
        if (this.b == WebSocket.READYSTATE.CLOSING) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isConnecting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0376f0d", new Object[]{this})).booleanValue();
        }
        if (this.b == WebSocket.READYSTATE.CONNECTING) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isFlushAndClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3388386", new Object[]{this})).booleanValue();
        }
        return this.f3750a;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        if (this.b == WebSocket.READYSTATE.OPEN) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{this, str});
        } else if (str != null) {
            Draft draft = this.e;
            if (this.f != WebSocket.Role.CLIENT) {
                z = false;
            }
            f(draft.createFrames(str, z));
        } else {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4eab6", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        } else {
            f(this.e.continuousFrame(opcode, byteBuffer, z));
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void sendFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da45f7a", new Object[]{this, framedata});
            return;
        }
        if (DEBUG) {
            SCLogCatUtil.debug(TAG, "send frame: " + framedata);
        }
        g(this.e.createBinaryFrame(framedata));
    }

    public void startHandshake(ClientHandshakeBuilder clientHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3edf49ad", new Object[]{this, clientHandshakeBuilder});
            return;
        }
        this.i = this.e.postProcessHandshakeRequestAsClient(clientHandshakeBuilder);
        this.m = clientHandshakeBuilder.getResourceDescriptor();
        try {
            this.c.onWebsocketHandshakeSentAsClient(this, this.i);
            h(this.e.createHandshake(this.i, this.f));
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        } catch (RuntimeException e) {
            this.c.onWebsocketError(this, e);
            throw new InvalidHandshakeException("rejected because of" + e);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82499c64", new Object[]{this, new Integer(i)});
        } else {
            a(i, "", false);
        }
    }

    public final void b(ByteBuffer byteBuffer) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4dfd576", new Object[]{this, byteBuffer});
            return;
        }
        try {
        } catch (InvalidDataException e) {
            this.c.onWebsocketError(this, e);
            close(e);
            return;
        }
        for (Framedata framedata : this.e.translateFrame(byteBuffer)) {
            if (DEBUG) {
                SCLogCatUtil.debug(TAG, "matched frame: " + framedata);
            }
            Framedata.Opcode opcode = framedata.getOpcode();
            boolean isFin = framedata.isFin();
            if (opcode == Framedata.Opcode.CLOSING) {
                if (framedata instanceof CloseFrame) {
                    CloseFrame closeFrame = (CloseFrame) framedata;
                    i = closeFrame.getCloseCode();
                    str = closeFrame.getMessage();
                } else {
                    str = "";
                    i = 1005;
                }
                if (this.b == WebSocket.READYSTATE.CLOSING) {
                    closeConnection(i, str, true);
                } else if (this.e.getCloseHandshakeType() == Draft.CloseHandshakeType.TWOWAY) {
                    a(i, str, true);
                } else {
                    flushAndClose(i, str, false);
                }
            } else if (opcode == Framedata.Opcode.PING) {
                this.c.onWebsocketPing(this, framedata);
            } else if (opcode == Framedata.Opcode.PONG) {
                this.c.onWebsocketPong(this, framedata);
            } else {
                if (isFin && opcode != Framedata.Opcode.CONTINUOUS) {
                    if (this.g == null) {
                        if (opcode == Framedata.Opcode.TEXT) {
                            try {
                                this.c.onWebsocketMessage(this, Charsetfunctions.stringUtf8(framedata.getPayloadData()));
                            } catch (RuntimeException e2) {
                                this.c.onWebsocketError(this, e2);
                            }
                        } else if (opcode == Framedata.Opcode.BINARY) {
                            try {
                                this.c.onWebsocketMessage(this, framedata.getPayloadData());
                            } catch (RuntimeException e3) {
                                this.c.onWebsocketError(this, e3);
                            }
                        } else {
                            throw new InvalidDataException(1002, "non control or continious frame expected");
                        }
                        this.c.onWebsocketError(this, e);
                        close(e);
                        return;
                    }
                    throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
                }
                if (opcode != Framedata.Opcode.CONTINUOUS) {
                    if (this.g == null) {
                        this.g = opcode;
                    } else {
                        throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                    }
                } else if (isFin) {
                    if (this.g != null) {
                        this.g = null;
                    } else {
                        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                    }
                } else if (this.g == null) {
                    throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                }
                try {
                    this.c.onWebsocketMessageFragment(this, framedata);
                } catch (RuntimeException e4) {
                    this.c.onWebsocketError(this, e4);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl.c(java.nio.ByteBuffer):boolean");
    }

    public void close(InvalidDataException invalidDataException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0c1206", new Object[]{this, invalidDataException});
        } else {
            a(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(ByteBuffer byteBuffer) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652184a2", new Object[]{this, byteBuffer});
        } else if (byteBuffer != null) {
            Draft draft = this.e;
            if (this.f != WebSocket.Role.CLIENT) {
                z = false;
            }
            f(draft.createFrames(byteBuffer, z));
        } else {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            close(1000);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else {
            send(ByteBuffer.wrap(bArr));
        }
    }

    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft) {
        this.f3750a = false;
        this.b = WebSocket.READYSTATE.NOT_YET_CONNECTED;
        this.e = null;
        this.g = null;
        this.h = ByteBuffer.allocate(0);
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        if (webSocketListener == null || (draft == null && this.f == WebSocket.Role.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.outQueue = new LinkedBlockingQueue();
        this.inQueue = new LinkedBlockingQueue();
        this.c = webSocketListener;
        this.f = WebSocket.Role.CLIENT;
        if (draft != null) {
            this.e = draft.copyInstance();
        }
    }

    public void closeConnection(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a309b16e", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            closeConnection(i, "", z);
        }
    }

    public void closeConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48183c7d", new Object[]{this});
        } else if (this.l != null) {
            closeConnection(this.k.intValue(), this.j, this.l.booleanValue());
        } else {
            throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void closeConnection(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed9f270", new Object[]{this, new Integer(i), str});
        } else {
            closeConnection(i, str, false);
        }
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft, Socket socket) {
        this(webSocketListener, draft);
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list, Socket socket) {
        this(webSocketListener, list);
    }
}
