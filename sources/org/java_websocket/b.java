package org.java_websocket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.a;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.g;
import tb.c1x;
import tb.gta;
import tb.mu3;
import tb.nu3;
import tb.rcp;
import tb.tj3;
import tb.y0x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class b implements WebSocket {

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<ByteBuffer> f15416a;
    public final BlockingQueue<ByteBuffer> b;
    public final y0x c;
    public SelectionKey d;
    public ByteChannel e;
    public volatile c1x.a f;
    public volatile boolean g;
    public WebSocket.READYSTATE h;
    public final List<Draft> i;
    public Draft j;
    public final WebSocket.Role k;
    public ByteBuffer l;
    public mu3 m;
    public String n;
    public Integer o;
    public Boolean p;
    public long q;
    public final Object r;
    public g s;
    public Object t;

    public b(y0x y0xVar, List<Draft> list) {
        this(y0xVar, (Draft) null);
        this.k = WebSocket.Role.SERVER;
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.i = arrayList;
            arrayList.add(new a());
            return;
        }
        this.i = list;
    }

    public void A(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        y(this.j.e(opcode, byteBuffer, z));
    }

    public void B() throws NotYetConnectedException {
        if (this.s == null) {
            this.s = new g();
        }
        sendFrame(this.s);
    }

    public <T> void C(T t) {
        this.t = t;
    }

    public final void D(WebSocket.READYSTATE readystate) {
        this.h = readystate;
    }

    public void E(nu3 nu3Var) throws InvalidHandshakeException {
        y0x y0xVar = this.c;
        this.m = this.j.n(nu3Var);
        nu3Var.getResourceDescriptor();
        try {
            y0xVar.onWebsocketHandshakeSentAsClient(this, this.m);
            H(this.j.j(this.m, this.k));
        } catch (RuntimeException e) {
            y0xVar.onWebsocketError(this, e);
            throw new InvalidHandshakeException("rejected because of" + e);
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        }
    }

    public void F() {
        this.q = System.currentTimeMillis();
    }

    public final void G(ByteBuffer byteBuffer) {
        this.f15416a.add(byteBuffer);
        this.c.onWriteDemand(this);
    }

    public final void H(List<ByteBuffer> list) {
        synchronized (this.r) {
            try {
                for (ByteBuffer byteBuffer : list) {
                    G(byteBuffer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        close(1000);
    }

    public void b(int i, String str) {
        c(i, str, false);
    }

    public synchronized void c(int i, String str, boolean z) {
        WebSocket.READYSTATE r = r();
        WebSocket.READYSTATE readystate = WebSocket.READYSTATE.CLOSING;
        if (r != readystate && this.h != WebSocket.READYSTATE.CLOSED) {
            if (r() == WebSocket.READYSTATE.OPEN) {
                if (i == 1006) {
                    D(readystate);
                    n(i, str, false);
                    return;
                }
                if (this.j.l() != Draft.CloseHandshakeType.NONE) {
                    try {
                        if (!z) {
                            try {
                                this.c.onWebsocketCloseInitiated(this, i, str);
                            } catch (RuntimeException e) {
                                this.c.onWebsocketError(this, e);
                            }
                        }
                        if (isOpen()) {
                            org.java_websocket.framing.b bVar = new org.java_websocket.framing.b();
                            bVar.o(str);
                            bVar.n(i);
                            bVar.e();
                            sendFrame(bVar);
                        }
                    } catch (InvalidDataException e2) {
                        this.c.onWebsocketError(this, e2);
                        n(1006, "generated frame is invalid", false);
                    }
                }
                n(i, str, z);
            } else if (i == -3) {
                n(-3, str, true);
            } else if (i == 1002) {
                n(i, str, z);
            } else {
                n(-1, str, false);
            }
            D(WebSocket.READYSTATE.CLOSING);
            this.l = null;
        }
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i) {
        c(i, "", false);
    }

    @Override // org.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        f(i, str, false);
    }

    public void d(InvalidDataException invalidDataException) {
        c(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    public void e() {
        if (this.p != null) {
            f(this.o.intValue(), this.n, this.p.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
    }

    public synchronized void f(int i, String str, boolean z) {
        try {
            if (r() != WebSocket.READYSTATE.CLOSED) {
                if (r() == WebSocket.READYSTATE.OPEN && i == 1006) {
                    D(WebSocket.READYSTATE.CLOSING);
                }
                SelectionKey selectionKey = this.d;
                if (selectionKey != null) {
                    selectionKey.cancel();
                }
                ByteChannel byteChannel = this.e;
                if (byteChannel != null) {
                    try {
                        byteChannel.close();
                    } catch (IOException e) {
                        if (!e.getMessage().equals("Broken pipe")) {
                            this.c.onWebsocketError(this, e);
                        }
                    }
                }
                try {
                    this.c.onWebsocketClose(this, i, str, z);
                } catch (RuntimeException e2) {
                    this.c.onWebsocketError(this, e2);
                }
                Draft draft = this.j;
                if (draft != null) {
                    draft.t();
                }
                this.m = null;
                D(WebSocket.READYSTATE.CLOSED);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void g(int i, boolean z) {
        f(i, "", z);
    }

    @Override // org.java_websocket.WebSocket
    public Draft getDraft() {
        return this.j;
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        return this.c.getLocalSocketAddress(this);
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        return this.c.getRemoteSocketAddress(this);
    }

    public final void h(RuntimeException runtimeException) {
        G(o(500));
        n(-1, runtimeException.getMessage(), false);
    }

    public final void i(InvalidDataException invalidDataException) {
        G(o(404));
        n(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosed() {
        if (r() == WebSocket.READYSTATE.CLOSED) {
            return true;
        }
        return false;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosing() {
        if (r() == WebSocket.READYSTATE.CLOSING) {
            return true;
        }
        return false;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isOpen() {
        if (r() == WebSocket.READYSTATE.OPEN) {
            return true;
        }
        return false;
    }

    public void j(ByteBuffer byteBuffer) {
        if (r() != WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            if (r() == WebSocket.READYSTATE.OPEN) {
                k(byteBuffer);
            }
        } else if (l(byteBuffer) && !isClosing() && !isClosed()) {
            if (byteBuffer.hasRemaining()) {
                k(byteBuffer);
            } else if (this.l.hasRemaining()) {
                k(this.l);
            }
        }
    }

    public final void k(ByteBuffer byteBuffer) {
        try {
            for (Framedata framedata : this.j.v(byteBuffer)) {
                this.j.p(this, framedata);
            }
        } catch (InvalidDataException e) {
            this.c.onWebsocketError(this, e);
            d(e);
        }
    }

    public final boolean l(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        WebSocket.Role role;
        WebSocket.Role role2;
        y0x y0xVar;
        gta w;
        if (this.l.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.l.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.l.capacity() + byteBuffer.remaining());
                this.l.flip();
                allocate.put(this.l);
                this.l = allocate;
            }
            this.l.put(byteBuffer);
            this.l.flip();
            byteBuffer2 = this.l;
        }
        byteBuffer2.mark();
        try {
            try {
                role = WebSocket.Role.SERVER;
                role2 = this.k;
                y0xVar = this.c;
            } catch (InvalidHandshakeException e) {
                d(e);
            }
        } catch (IncompleteHandshakeException e2) {
            if (this.l.capacity() == 0) {
                byteBuffer2.reset();
                int preferedSize = e2.getPreferedSize();
                if (preferedSize == 0) {
                    preferedSize = byteBuffer2.capacity() + 16;
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(preferedSize);
                this.l = allocate2;
                allocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.l;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.l;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
        if (role2 == role) {
            Draft draft = this.j;
            if (draft == null) {
                for (Draft draft2 : this.i) {
                    Draft f = draft2.f();
                    try {
                        f.u(role2);
                        byteBuffer2.reset();
                        w = f.w(byteBuffer2);
                    } catch (InvalidHandshakeException unused) {
                    }
                    if (!(w instanceof mu3)) {
                        i(new InvalidDataException(1002, "wrong http function"));
                        return false;
                    }
                    mu3 mu3Var = (mu3) w;
                    if (f.b(mu3Var) == Draft.HandshakeState.MATCHED) {
                        mu3Var.getResourceDescriptor();
                        try {
                            H(f.j(f.o(mu3Var, y0xVar.onWebsocketHandshakeReceivedAsServer(this, f, mu3Var)), role2));
                            this.j = f;
                            w(mu3Var);
                            return true;
                        } catch (RuntimeException e3) {
                            y0xVar.onWebsocketError(this, e3);
                            h(e3);
                            return false;
                        } catch (InvalidDataException e4) {
                            i(e4);
                            return false;
                        }
                    }
                }
                if (this.j == null) {
                    i(new InvalidDataException(1002, "no draft matches"));
                }
                return false;
            }
            gta w2 = draft.w(byteBuffer2);
            if (!(w2 instanceof mu3)) {
                n(1002, "wrong http function", false);
                return false;
            }
            mu3 mu3Var2 = (mu3) w2;
            if (this.j.b(mu3Var2) == Draft.HandshakeState.MATCHED) {
                w(mu3Var2);
                return true;
            }
            b(1002, "the handshake did finaly not match");
            return false;
        }
        if (role2 == WebSocket.Role.CLIENT) {
            this.j.u(role2);
            gta w3 = this.j.w(byteBuffer2);
            if (!(w3 instanceof rcp)) {
                n(1002, "wrong http function", false);
                return false;
            }
            rcp rcpVar = (rcp) w3;
            if (this.j.a(this.m, rcpVar) == Draft.HandshakeState.MATCHED) {
                try {
                    y0xVar.onWebsocketHandshakeReceivedAsClient(this, this.m, rcpVar);
                    w(rcpVar);
                    return true;
                } catch (RuntimeException e5) {
                    y0xVar.onWebsocketError(this, e5);
                    n(-1, e5.getMessage(), false);
                    return false;
                } catch (InvalidDataException e6) {
                    n(e6.getCloseCode(), e6.getMessage(), false);
                    return false;
                }
            } else {
                b(1002, "draft " + this.j + " refuses handshake");
            }
        }
        return false;
    }

    public void m() {
        if (r() == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            g(-1, true);
        } else if (this.g) {
            f(this.o.intValue(), this.n, this.p.booleanValue());
        } else if (this.j.l() == Draft.CloseHandshakeType.NONE) {
            g(1000, true);
        } else if (this.j.l() != Draft.CloseHandshakeType.ONEWAY) {
            g(1006, true);
        } else if (this.k == WebSocket.Role.SERVER) {
            g(1006, true);
        } else {
            g(1000, true);
        }
    }

    public synchronized void n(int i, String str, boolean z) {
        if (!this.g) {
            this.o = Integer.valueOf(i);
            this.n = str;
            this.p = Boolean.valueOf(z);
            this.g = true;
            this.c.onWriteDemand(this);
            try {
                this.c.onWebsocketClosing(this, i, str, z);
            } catch (RuntimeException e) {
                this.c.onWebsocketError(this, e);
            }
            Draft draft = this.j;
            if (draft != null) {
                draft.t();
            }
            this.m = null;
        }
    }

    public final ByteBuffer o(int i) {
        String str;
        if (i != 404) {
            str = "500 Internal Server Error";
        } else {
            str = "404 WebSocket Upgrade Failure";
        }
        return ByteBuffer.wrap(tj3.a("HTTP/1.1 " + str + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    public <T> T p() {
        return (T) this.t;
    }

    public long q() {
        return this.q;
    }

    public WebSocket.READYSTATE r() {
        return this.h;
    }

    public y0x s() {
        return this.c;
    }

    @Override // org.java_websocket.WebSocket
    public void send(String str) throws WebsocketNotConnectedException {
        boolean z;
        if (str != null) {
            Draft draft = this.j;
            if (this.k == WebSocket.Role.CLIENT) {
                z = true;
            } else {
                z = false;
            }
            y(draft.h(str, z));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Collection<Framedata> collection) {
        y(collection);
    }

    public boolean t() {
        return !this.f15416a.isEmpty();
    }

    @Deprecated
    public boolean u() {
        if (r() == WebSocket.READYSTATE.CONNECTING) {
            return true;
        }
        return false;
    }

    public boolean v() {
        return this.g;
    }

    public final void w(gta gtaVar) {
        y0x y0xVar = this.c;
        D(WebSocket.READYSTATE.OPEN);
        try {
            y0xVar.onWebsocketOpen(this, gtaVar);
        } catch (RuntimeException e) {
            y0xVar.onWebsocketError(this, e);
        }
    }

    public void x(ByteBuffer byteBuffer) throws IllegalArgumentException, WebsocketNotConnectedException {
        boolean z;
        if (byteBuffer != null) {
            Draft draft = this.j;
            if (this.k == WebSocket.Role.CLIENT) {
                z = true;
            } else {
                z = false;
            }
            y(draft.i(byteBuffer, z));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    public final void y(Collection<Framedata> collection) {
        if (!isOpen()) {
            throw new WebsocketNotConnectedException();
        } else if (collection != null) {
            ArrayList arrayList = new ArrayList();
            for (Framedata framedata : collection) {
                arrayList.add(this.j.g(framedata));
            }
            H(arrayList);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void z(byte[] bArr) throws IllegalArgumentException, WebsocketNotConnectedException {
        x(ByteBuffer.wrap(bArr));
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        y(Collections.singletonList(framedata));
    }

    public b(y0x y0xVar, Draft draft) {
        this.g = false;
        this.h = WebSocket.READYSTATE.NOT_YET_CONNECTED;
        this.j = null;
        this.l = ByteBuffer.allocate(0);
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = System.currentTimeMillis();
        this.r = new Object();
        if (y0xVar == null || (draft == null && this.k == WebSocket.Role.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.f15416a = new LinkedBlockingQueue();
        this.b = new LinkedBlockingQueue();
        this.c = y0xVar;
        this.k = WebSocket.Role.CLIENT;
        if (draft != null) {
            this.j = draft.f();
        }
    }
}
