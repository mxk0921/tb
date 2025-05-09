package org.java_websocket.drafts;

import com.alipay.mobile.common.rpc.ProtocolVersions;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.java_websocket.WebSocket;
import org.java_websocket.b;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.LimitExedeedException;
import org.java_websocket.framing.Framedata;
import org.java_websocket.framing.a;
import org.java_websocket.framing.c;
import org.java_websocket.framing.f;
import org.java_websocket.framing.i;
import tb.bta;
import tb.cta;
import tb.dta;
import tb.gta;
import tb.mu3;
import tb.nu3;
import tb.rcp;
import tb.scp;
import tb.tj3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class Draft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WebSocket.Role f15417a = null;
    public Framedata.Opcode b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum CloseHandshakeType {
        NONE,
        ONEWAY,
        TWOWAY
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    public static ByteBuffer q(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("853e8901", new Object[]{byteBuffer});
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    public static String r(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bf566d1", new Object[]{byteBuffer});
        }
        ByteBuffer q = q(byteBuffer);
        if (q == null) {
            return null;
        }
        return tj3.d(q.array(), 0, q.limit());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bta x(ByteBuffer byteBuffer, WebSocket.Role role) throws InvalidHandshakeException, IncompleteHandshakeException {
        cta ctaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bta) ipChange.ipc$dispatch("4dcc8a36", new Object[]{byteBuffer, role});
        }
        String r = r(byteBuffer);
        if (r != null) {
            String[] split = r.split(" ", 3);
            if (split.length == 3) {
                if (role == WebSocket.Role.CLIENT) {
                    if (!"101".equals(split[1])) {
                        throw new InvalidHandshakeException("Invalid status code received: " + split[1] + " Status line: " + r);
                    } else if (ProtocolVersions.HTTP_1_1.equalsIgnoreCase(split[0])) {
                        dta dtaVar = new dta();
                        dtaVar.a(Short.parseShort(split[1]));
                        dtaVar.setHttpStatusMessage(split[2]);
                        ctaVar = dtaVar;
                    } else {
                        throw new InvalidHandshakeException("Invalid status line received: " + split[0] + " Status line: " + r);
                    }
                } else if (!"GET".equalsIgnoreCase(split[0])) {
                    throw new InvalidHandshakeException("Invalid request method received: " + split[0] + " Status line: " + r);
                } else if (ProtocolVersions.HTTP_1_1.equalsIgnoreCase(split[2])) {
                    cta ctaVar2 = new cta();
                    ctaVar2.a(split[1]);
                    ctaVar = ctaVar2;
                } else {
                    throw new InvalidHandshakeException("Invalid status line received: " + split[2] + " Status line: " + r);
                }
                String r2 = r(byteBuffer);
                while (r2 != null && r2.length() > 0) {
                    String[] split2 = r2.split(":", 2);
                    if (split2.length == 2) {
                        if (ctaVar.hasFieldValue(split2[0])) {
                            String str = split2[0];
                            ctaVar.put(str, ctaVar.getFieldValue(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
                        } else {
                            ctaVar.put(split2[0], split2[1].replaceFirst("^ +", ""));
                        }
                        r2 = r(byteBuffer);
                    } else {
                        throw new InvalidHandshakeException("not an http header");
                    }
                }
                if (r2 != null) {
                    return ctaVar;
                }
                throw new IncompleteHandshakeException();
            }
            throw new InvalidHandshakeException();
        }
        throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
    }

    public abstract HandshakeState a(mu3 mu3Var, rcp rcpVar) throws InvalidHandshakeException;

    public abstract HandshakeState b(mu3 mu3Var) throws InvalidHandshakeException;

    public boolean c(gta gtaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0449a61", new Object[]{this, gtaVar})).booleanValue();
        }
        if (!gtaVar.getFieldValue("Upgrade").equalsIgnoreCase("websocket") || !gtaVar.getFieldValue("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            return false;
        }
        return true;
    }

    public int d(int i) throws LimitExedeedException, InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2d1ac62", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= 0) {
            return i;
        }
        throw new InvalidDataException(1002, "Negative count");
    }

    public List<Framedata> e(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("76745da2", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        }
        Framedata.Opcode opcode2 = Framedata.Opcode.BINARY;
        if (opcode == opcode2 || opcode == Framedata.Opcode.TEXT) {
            if (this.b != null) {
                fVar = new c();
            } else {
                this.b = opcode;
                if (opcode == opcode2) {
                    fVar = new a();
                } else if (opcode == Framedata.Opcode.TEXT) {
                    fVar = new i();
                } else {
                    fVar = null;
                }
            }
            fVar.g(byteBuffer);
            fVar.f(z);
            try {
                fVar.e();
                if (z) {
                    this.b = null;
                } else {
                    this.b = opcode;
                }
                return Collections.singletonList(fVar);
            } catch (InvalidDataException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
    }

    public abstract Draft f();

    public abstract ByteBuffer g(Framedata framedata);

    public abstract List<Framedata> h(String str, boolean z);

    public abstract List<Framedata> i(ByteBuffer byteBuffer, boolean z);

    public List<ByteBuffer> j(gta gtaVar, WebSocket.Role role) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c91d48f5", new Object[]{this, gtaVar, role});
        }
        return k(gtaVar, role, true);
    }

    public List<ByteBuffer> k(gta gtaVar, WebSocket.Role role, boolean z) {
        byte[] bArr;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3edfc05", new Object[]{this, gtaVar, role, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(100);
        if (gtaVar instanceof mu3) {
            sb.append("GET ");
            sb.append(((mu3) gtaVar).getResourceDescriptor());
            sb.append(" HTTP/1.1");
        } else if (gtaVar instanceof rcp) {
            sb.append("HTTP/1.1 101 ");
            sb.append(((rcp) gtaVar).getHttpStatusMessage());
        } else {
            throw new IllegalArgumentException("unknown role");
        }
        sb.append("\r\n");
        Iterator<String> iterateHttpFields = gtaVar.iterateHttpFields();
        while (iterateHttpFields.hasNext()) {
            String next = iterateHttpFields.next();
            String fieldValue = gtaVar.getFieldValue(next);
            sb.append(next);
            sb.append(": ");
            sb.append(fieldValue);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] a2 = tj3.a(sb.toString());
        if (z) {
            bArr = gtaVar.getContent();
        } else {
            bArr = null;
        }
        if (bArr != null) {
            i = bArr.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + a2.length);
        allocate.put(a2);
        if (bArr != null) {
            allocate.put(bArr);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public abstract CloseHandshakeType l();

    public WebSocket.Role m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocket.Role) ipChange.ipc$dispatch("8059e6d7", new Object[]{this});
        }
        return this.f15417a;
    }

    public abstract nu3 n(nu3 nu3Var) throws InvalidHandshakeException;

    public abstract bta o(mu3 mu3Var, scp scpVar) throws InvalidHandshakeException;

    public abstract void p(b bVar, Framedata framedata) throws InvalidDataException;

    public int s(gta gtaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ab63ddc", new Object[]{this, gtaVar})).intValue();
        }
        String fieldValue = gtaVar.getFieldValue("Sec-WebSocket-Version");
        if (fieldValue.length() > 0) {
            try {
                return new Integer(fieldValue.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public abstract void t();

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getSimpleName();
    }

    public void u(WebSocket.Role role) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e119", new Object[]{this, role});
        } else {
            this.f15417a = role;
        }
    }

    public abstract List<Framedata> v(ByteBuffer byteBuffer) throws InvalidDataException;

    public gta w(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gta) ipChange.ipc$dispatch("85581475", new Object[]{this, byteBuffer});
        }
        return x(byteBuffer, this.f15417a);
    }
}
