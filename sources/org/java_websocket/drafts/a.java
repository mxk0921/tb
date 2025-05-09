package org.java_websocket.drafts;

import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import org.java_websocket.WebSocket;
import org.java_websocket.b;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.IncompleteException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExedeedException;
import org.java_websocket.exceptions.NotSendableException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.f;
import org.java_websocket.framing.i;
import tb.bq1;
import tb.bta;
import tb.c0z;
import tb.cq1;
import tb.m1n;
import tb.mu3;
import tb.nu3;
import tb.rcp;
import tb.scp;
import tb.tj3;
import tb.u4c;
import tb.w07;
import tb.zdd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a extends Draft {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public u4c c;
    public final List<u4c> d;
    public zdd e;
    public final List<zdd> f;
    public Framedata g;
    public final List<ByteBuffer> h;
    public ByteBuffer i;
    public final Random j;

    public a() {
        this(Collections.emptyList());
    }

    public static void H(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355f20d2", new Object[]{obj});
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -2128160755) {
            return super.toString();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/drafts/Draft_6455");
    }

    public final String A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("467ad1", new Object[]{this, str});
        }
        String trim = str.trim();
        try {
            return bq1.g(MessageDigest.getInstance("SHA1").digest((trim + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public u4c B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u4c) ipChange.ipc$dispatch("1f53179e", new Object[]{this});
        }
        return this.c;
    }

    public List<u4c> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fb580fbf", new Object[]{this});
        }
        return this.d;
    }

    public List<zdd> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("508e0652", new Object[]{this});
        }
        return this.f;
    }

    public final ByteBuffer E() throws LimitExedeedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("96f94230", new Object[]{this});
        }
        Iterator it = ((ArrayList) this.h).iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((ByteBuffer) it.next()).limit();
        }
        if (j <= 2147483647L) {
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            Iterator it2 = ((ArrayList) this.h).iterator();
            while (it2.hasNext()) {
                allocate.put((ByteBuffer) it2.next());
            }
            allocate.flip();
            return allocate;
        }
        throw new LimitExedeedException(WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
    }

    public zdd F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zdd) ipChange.ipc$dispatch("2cc56d7d", new Object[]{this});
        }
        return this.e;
    }

    public final String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2b35e13", new Object[]{this});
        }
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(instance.getTime());
    }

    public final byte[] I(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3a1b6b61", new Object[]{this, new Long(j), new Integer(i)});
        }
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    public final Framedata.Opcode J(byte b) throws InvalidFrameException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Framedata.Opcode) ipChange.ipc$dispatch("b26f0a63", new Object[]{this, new Byte(b)});
        }
        if (b == 0) {
            return Framedata.Opcode.CONTINUOUS;
        }
        if (b == 1) {
            return Framedata.Opcode.TEXT;
        }
        if (b == 2) {
            return Framedata.Opcode.BINARY;
        }
        switch (b) {
            case 8:
                return Framedata.Opcode.CLOSING;
            case 9:
                return Framedata.Opcode.PING;
            case 10:
                return Framedata.Opcode.PONG;
            default:
                throw new InvalidFrameException("Unknown opcode " + ((int) b));
        }
    }

    public Framedata K(ByteBuffer byteBuffer) throws IncompleteException, InvalidDataException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Framedata) ipChange.ipc$dispatch("3e97073a", new Object[]{this, byteBuffer});
        }
        int remaining = byteBuffer.remaining();
        if (remaining >= 2) {
            byte b = byteBuffer.get();
            if ((b >> 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 64) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((b & 32) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((b & 16) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            byte b2 = byteBuffer.get();
            if ((b2 & c0z.STATE) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            byte b3 = (byte) (b2 & Byte.MAX_VALUE);
            Framedata.Opcode J = J((byte) (b & 15));
            if (b3 >= 0 && b3 <= 125) {
                i = b3;
            } else if (J == Framedata.Opcode.PING || J == Framedata.Opcode.PONG || J == Framedata.Opcode.CLOSING) {
                throw new InvalidFrameException("more than 125 octets");
            } else if (b3 == 126) {
                if (remaining >= 4) {
                    i = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                    i3 = 4;
                } else {
                    throw new IncompleteException(4);
                }
            } else if (remaining >= 10) {
                byte[] bArr = new byte[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    bArr[i4] = byteBuffer.get();
                }
                long longValue = new BigInteger(bArr).longValue();
                if (longValue <= 2147483647L) {
                    i = (int) longValue;
                    i3 = 10;
                } else {
                    throw new LimitExedeedException(WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
                }
            } else {
                throw new IncompleteException(10);
            }
            if (z5) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            int i5 = i3 + i2 + i;
            if (remaining >= i5) {
                ByteBuffer allocate = ByteBuffer.allocate(d(i));
                if (z5) {
                    byte[] bArr2 = new byte[4];
                    byteBuffer.get(bArr2);
                    for (int i6 = 0; i6 < i; i6++) {
                        allocate.put((byte) (byteBuffer.get() ^ bArr2[i6 % 4]));
                    }
                } else {
                    allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                    byteBuffer.position(byteBuffer.position() + allocate.limit());
                }
                f d = f.d(J);
                d.f(z);
                d.h(z2);
                d.i(z3);
                d.j(z4);
                allocate.flip();
                d.g(allocate);
                B().d(d);
                B().g(d);
                d.e();
                return d;
            }
            throw new IncompleteException(i5);
        }
        throw new IncompleteException(2);
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft.HandshakeState a(mu3 mu3Var, rcp rcpVar) throws InvalidHandshakeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("5930c790", new Object[]{this, mu3Var, rcpVar});
        }
        if (!c(rcpVar)) {
            H("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return Draft.HandshakeState.NOT_MATCHED;
        } else if (!mu3Var.hasFieldValue("Sec-WebSocket-Key") || !rcpVar.hasFieldValue("Sec-WebSocket-Accept")) {
            H("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return Draft.HandshakeState.NOT_MATCHED;
        } else if (!A(mu3Var.getFieldValue("Sec-WebSocket-Key")).equals(rcpVar.getFieldValue("Sec-WebSocket-Accept"))) {
            H("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
            return Draft.HandshakeState.NOT_MATCHED;
        } else {
            Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
            String fieldValue = rcpVar.getFieldValue("Sec-WebSocket-Extensions");
            Iterator it = ((ArrayList) this.d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u4c u4cVar = (u4c) it.next();
                if (u4cVar.e(fieldValue)) {
                    this.c = u4cVar;
                    handshakeState = Draft.HandshakeState.MATCHED;
                    H("acceptHandshakeAsClient - Matching extension found: " + this.c.toString());
                    break;
                }
            }
            Draft.HandshakeState handshakeState2 = Draft.HandshakeState.NOT_MATCHED;
            String fieldValue2 = rcpVar.getFieldValue(com.taobao.weex.appfram.websocket.a.HEADER_SEC_WEBSOCKET_PROTOCOL);
            Iterator it2 = ((ArrayList) this.f).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zdd zddVar = (zdd) it2.next();
                if (zddVar.c(fieldValue2)) {
                    this.e = zddVar;
                    handshakeState2 = Draft.HandshakeState.MATCHED;
                    H("acceptHandshakeAsClient - Matching protocol found: " + this.e.toString());
                    break;
                }
            }
            Draft.HandshakeState handshakeState3 = Draft.HandshakeState.MATCHED;
            if (handshakeState2 == handshakeState3 && handshakeState == handshakeState3) {
                return handshakeState3;
            }
            H("acceptHandshakeAsClient - No matching extension or protocol found.");
            return Draft.HandshakeState.NOT_MATCHED;
        }
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft.HandshakeState b(mu3 mu3Var) throws InvalidHandshakeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("23450b45", new Object[]{this, mu3Var});
        }
        if (s(mu3Var) != 13) {
            H("acceptHandshakeAsServer - Wrong websocket version.");
            return Draft.HandshakeState.NOT_MATCHED;
        }
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        String fieldValue = mu3Var.getFieldValue("Sec-WebSocket-Extensions");
        Iterator it = ((ArrayList) this.d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            u4c u4cVar = (u4c) it.next();
            if (u4cVar.c(fieldValue)) {
                this.c = u4cVar;
                handshakeState = Draft.HandshakeState.MATCHED;
                H("acceptHandshakeAsServer - Matching extension found: " + this.c.toString());
                break;
            }
        }
        Draft.HandshakeState handshakeState2 = Draft.HandshakeState.NOT_MATCHED;
        String fieldValue2 = mu3Var.getFieldValue(com.taobao.weex.appfram.websocket.a.HEADER_SEC_WEBSOCKET_PROTOCOL);
        Iterator it2 = ((ArrayList) this.f).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            zdd zddVar = (zdd) it2.next();
            if (zddVar.c(fieldValue2)) {
                this.e = zddVar;
                handshakeState2 = Draft.HandshakeState.MATCHED;
                H("acceptHandshakeAsServer - Matching protocol found: " + this.e.toString());
                break;
            }
        }
        Draft.HandshakeState handshakeState3 = Draft.HandshakeState.MATCHED;
        if (handshakeState2 == handshakeState3 && handshakeState == handshakeState3) {
            return handshakeState3;
        }
        H("acceptHandshakeAsServer - No matching extension or protocol found.");
        return Draft.HandshakeState.NOT_MATCHED;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        u4c u4cVar = this.c;
        if (u4cVar == null ? aVar.c != null : !u4cVar.equals(aVar.c)) {
            return false;
        }
        zdd zddVar = this.e;
        zdd zddVar2 = aVar.e;
        if (zddVar != null) {
            return zddVar.equals(zddVar2);
        }
        if (zddVar2 == null) {
            return true;
        }
        return false;
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft) ipChange.ipc$dispatch("89b01f24", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (u4c u4cVar : C()) {
            arrayList.add(u4cVar.a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (zdd zddVar : D()) {
            arrayList2.add(zddVar.a());
        }
        return new a(arrayList, arrayList2);
    }

    @Override // org.java_websocket.drafts.Draft
    public ByteBuffer g(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("38ca64cf", new Object[]{this, framedata});
        }
        B().f(framedata);
        return y(framedata);
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("be3c58c6", new Object[]{this, str, new Boolean(z)});
        }
        i iVar = new i();
        iVar.g(ByteBuffer.wrap(tj3.f(str)));
        iVar.k(z);
        try {
            iVar.e();
            return Collections.singletonList(iVar);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        u4c u4cVar = this.c;
        if (u4cVar != null) {
            i = u4cVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        zdd zddVar = this.e;
        if (zddVar != null) {
            i2 = zddVar.hashCode();
        }
        return i3 + i2;
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> i(ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("43a6b19b", new Object[]{this, byteBuffer, new Boolean(z)});
        }
        org.java_websocket.framing.a aVar = new org.java_websocket.framing.a();
        aVar.g(byteBuffer);
        aVar.k(z);
        try {
            aVar.e();
            return Collections.singletonList(aVar);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    @Override // org.java_websocket.drafts.Draft
    public Draft.CloseHandshakeType l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.CloseHandshakeType) ipChange.ipc$dispatch("8279130", new Object[]{this});
        }
        return Draft.CloseHandshakeType.TWOWAY;
    }

    @Override // org.java_websocket.drafts.Draft
    public nu3 n(nu3 nu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nu3) ipChange.ipc$dispatch("d08d2065", new Object[]{this, nu3Var});
        }
        nu3Var.put("Upgrade", "websocket");
        nu3Var.put("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        this.j.nextBytes(bArr);
        nu3Var.put("Sec-WebSocket-Key", bq1.g(bArr));
        nu3Var.put("Sec-WebSocket-Version", "13");
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            u4c u4cVar = (u4c) it.next();
            if (!(u4cVar.h() == null || u4cVar.h().length() == 0)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(u4cVar.h());
            }
        }
        if (sb.length() != 0) {
            nu3Var.put("Sec-WebSocket-Extensions", sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = ((ArrayList) this.f).iterator();
        while (it2.hasNext()) {
            zdd zddVar = (zdd) it2.next();
            if (zddVar.b().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(zddVar.b());
            }
        }
        if (sb2.length() != 0) {
            nu3Var.put(com.taobao.weex.appfram.websocket.a.HEADER_SEC_WEBSOCKET_PROTOCOL, sb2.toString());
        }
        return nu3Var;
    }

    @Override // org.java_websocket.drafts.Draft
    public bta o(mu3 mu3Var, scp scpVar) throws InvalidHandshakeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bta) ipChange.ipc$dispatch("afc5f509", new Object[]{this, mu3Var, scpVar});
        }
        scpVar.put("Upgrade", "websocket");
        scpVar.put("Connection", mu3Var.getFieldValue("Connection"));
        String fieldValue = mu3Var.getFieldValue("Sec-WebSocket-Key");
        if (fieldValue != null) {
            scpVar.put("Sec-WebSocket-Accept", A(fieldValue));
            if (B().b().length() != 0) {
                scpVar.put("Sec-WebSocket-Extensions", B().b());
            }
            if (!(F() == null || F().b().length() == 0)) {
                scpVar.put(com.taobao.weex.appfram.websocket.a.HEADER_SEC_WEBSOCKET_PROTOCOL, F().b());
            }
            scpVar.setHttpStatusMessage("Web Socket Protocol Handshake");
            scpVar.put("Server", "TooTallNate Java-WebSocket");
            scpVar.put("Date", G());
            return scpVar;
        }
        throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
    }

    @Override // org.java_websocket.drafts.Draft
    public void p(b bVar, Framedata framedata) throws InvalidDataException {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd2dce9e", new Object[]{this, bVar, framedata});
            return;
        }
        Framedata.Opcode opcode = framedata.getOpcode();
        if (opcode == Framedata.Opcode.CLOSING) {
            if (framedata instanceof org.java_websocket.framing.b) {
                org.java_websocket.framing.b bVar2 = (org.java_websocket.framing.b) framedata;
                i = bVar2.l();
                str = bVar2.m();
            } else {
                i = 1005;
                str = "";
            }
            if (bVar.r() == WebSocket.READYSTATE.CLOSING) {
                bVar.f(i, str, true);
            } else if (l() == Draft.CloseHandshakeType.TWOWAY) {
                bVar.c(i, str, true);
            } else {
                bVar.n(i, str, false);
            }
        } else if (opcode == Framedata.Opcode.PING) {
            bVar.s().onWebsocketPing(bVar, framedata);
        } else if (opcode == Framedata.Opcode.PONG) {
            bVar.F();
            bVar.s().onWebsocketPong(bVar, framedata);
        } else if (!framedata.isFin() || opcode == Framedata.Opcode.CONTINUOUS) {
            if (opcode != Framedata.Opcode.CONTINUOUS) {
                if (this.g == null) {
                    this.g = framedata;
                    ((ArrayList) this.h).add(framedata.getPayloadData());
                } else {
                    throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                }
            } else if (framedata.isFin()) {
                if (this.g != null) {
                    ((ArrayList) this.h).add(framedata.getPayloadData());
                    if (this.g.getOpcode() == Framedata.Opcode.TEXT) {
                        ((f) this.g).g(E());
                        ((f) this.g).e();
                        try {
                            bVar.s().onWebsocketMessage(bVar, tj3.e(this.g.getPayloadData()));
                        } catch (RuntimeException e) {
                            bVar.s().onWebsocketError(bVar, e);
                        }
                    } else if (this.g.getOpcode() == Framedata.Opcode.BINARY) {
                        ((f) this.g).g(E());
                        ((f) this.g).e();
                        try {
                            bVar.s().onWebsocketMessage(bVar, this.g.getPayloadData());
                        } catch (RuntimeException e2) {
                            bVar.s().onWebsocketError(bVar, e2);
                        }
                    }
                    this.g = null;
                    ((ArrayList) this.h).clear();
                } else {
                    throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                }
            } else if (this.g == null) {
                throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
            }
            if (opcode == Framedata.Opcode.TEXT && !tj3.b(framedata.getPayloadData())) {
                throw new InvalidDataException(1007);
            } else if (opcode == Framedata.Opcode.CONTINUOUS && this.g != null) {
                ((ArrayList) this.h).add(framedata.getPayloadData());
            }
        } else if (this.g != null) {
            throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
        } else if (opcode == Framedata.Opcode.TEXT) {
            try {
                bVar.s().onWebsocketMessage(bVar, tj3.e(framedata.getPayloadData()));
            } catch (RuntimeException e3) {
                bVar.s().onWebsocketError(bVar, e3);
            }
        } else if (opcode == Framedata.Opcode.BINARY) {
            try {
                bVar.s().onWebsocketMessage(bVar, framedata.getPayloadData());
            } catch (RuntimeException e4) {
                bVar.s().onWebsocketError(bVar, e4);
            }
        } else {
            throw new InvalidDataException(1002, "non control or continious frame expected");
        }
    }

    @Override // org.java_websocket.drafts.Draft
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.i = null;
        u4c u4cVar = this.c;
        if (u4cVar != null) {
            u4cVar.reset();
        }
        this.c = new w07();
        this.e = null;
    }

    @Override // org.java_websocket.drafts.Draft
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String draft = super.toString();
        if (B() != null) {
            draft = draft + " extension: " + B().toString();
        }
        if (F() == null) {
            return draft;
        }
        return draft + " protocol: " + F().toString();
    }

    @Override // org.java_websocket.drafts.Draft
    public List<Framedata> v(ByteBuffer byteBuffer) throws InvalidDataException {
        LinkedList linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7380b9c", new Object[]{this, byteBuffer});
        }
        while (true) {
            linkedList = new LinkedList();
            if (this.i == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.i.remaining();
                if (remaining2 > remaining) {
                    this.i.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.i.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(K((ByteBuffer) this.i.duplicate().position(0)));
                this.i = null;
            } catch (IncompleteException e) {
                ByteBuffer allocate = ByteBuffer.allocate(d(e.getPreferredSize()));
                this.i.rewind();
                allocate.put(this.i);
                this.i = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(K(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(d(e2.getPreferredSize()));
                this.i = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public final ByteBuffer y(Framedata framedata) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("5b9752a8", new Object[]{this, framedata});
        }
        ByteBuffer payloadData = framedata.getPayloadData();
        if (this.f15417a == WebSocket.Role.CLIENT) {
            z = true;
        } else {
            z = false;
        }
        if (payloadData.remaining() <= 125) {
            i = 1;
        } else if (payloadData.remaining() <= 65535) {
            i = 2;
        } else {
            i = 8;
        }
        if (i > 1) {
            i2 = i + 1;
        } else {
            i2 = i;
        }
        int i6 = i2 + 1;
        if (z) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i6 + i3 + payloadData.remaining());
        byte z2 = z(framedata.getOpcode());
        boolean isFin = framedata.isFin();
        byte b = c0z.STATE;
        if (isFin) {
            i4 = cq1.SIGN;
        } else {
            i4 = 0;
        }
        allocate.put((byte) (((byte) i4) | z2));
        byte[] I = I(payloadData.remaining(), i);
        if (i == 1) {
            byte b2 = I[0];
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b2 | b));
        } else if (i == 2) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | 126));
            allocate.put(I);
        } else if (i == 8) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | Byte.MAX_VALUE));
            allocate.put(I);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.j.nextInt());
            allocate.put(allocate2.array());
            while (payloadData.hasRemaining()) {
                allocate.put((byte) (payloadData.get() ^ allocate2.get(i5 % 4)));
                i5++;
            }
        } else {
            allocate.put(payloadData);
            payloadData.flip();
        }
        allocate.flip();
        return allocate;
    }

    public final byte z(Framedata.Opcode opcode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff849b14", new Object[]{this, opcode})).byteValue();
        }
        if (opcode == Framedata.Opcode.CONTINUOUS) {
            return (byte) 0;
        }
        if (opcode == Framedata.Opcode.TEXT) {
            return (byte) 1;
        }
        if (opcode == Framedata.Opcode.BINARY) {
            return (byte) 2;
        }
        if (opcode == Framedata.Opcode.CLOSING) {
            return (byte) 8;
        }
        if (opcode == Framedata.Opcode.PING) {
            return (byte) 9;
        }
        if (opcode == Framedata.Opcode.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + opcode.toString());
    }

    public a(List<u4c> list) {
        this(list, Collections.singletonList(new m1n("")));
    }

    public a(List<u4c> list, List<zdd> list2) {
        this.c = new w07();
        this.j = new Random();
        if (list == null || list2 == null) {
            throw new IllegalArgumentException();
        }
        this.d = new ArrayList(list.size());
        this.f = new ArrayList(list2.size());
        this.h = new ArrayList();
        boolean z = false;
        for (u4c u4cVar : list) {
            if (u4cVar.getClass().equals(w07.class)) {
                z = true;
            }
        }
        this.d.addAll(list);
        if (!z) {
            List<u4c> list3 = this.d;
            list3.add(list3.size(), this.c);
        }
        this.f.addAll(list2);
    }
}
