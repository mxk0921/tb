package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class Draft {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte[] FLASH_POLICY_REQUEST = Charsetfunctions.utf8Bytes("<policy-file-request/>\u0000");
    public static int INITIAL_FAMESIZE = 64;
    public static int MAX_FAME_SIZE = 1000;
    public WebSocket.Role role = null;
    public Framedata.Opcode continuousFrameType = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum CloseHandshakeType {
        NONE,
        ONEWAY,
        TWOWAY
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    public static ByteBuffer readLine(ByteBuffer byteBuffer) {
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

    public static String readStringLine(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3bf566d1", new Object[]{byteBuffer});
        }
        ByteBuffer readLine = readLine(byteBuffer);
        if (readLine == null) {
            return null;
        }
        return Charsetfunctions.stringAscii(readLine.array(), 0, readLine.limit());
    }

    public abstract HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake);

    public abstract HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake);

    public int checkAlloc(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2d1ac62", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= 0) {
            return i;
        }
        throw new InvalidDataException(1002, "Negative count");
    }

    public List<Framedata> continuousFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        Framedata.Opcode opcode2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d5d3e759", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        }
        if (opcode == Framedata.Opcode.BINARY || opcode == (opcode2 = Framedata.Opcode.TEXT) || opcode == opcode2) {
            if (this.continuousFrameType != null) {
                this.continuousFrameType = Framedata.Opcode.CONTINUOUS;
            } else {
                this.continuousFrameType = opcode;
            }
            FramedataImpl1 framedataImpl1 = new FramedataImpl1(this.continuousFrameType);
            try {
                framedataImpl1.setPayload(byteBuffer);
                framedataImpl1.setFin(z);
                if (z) {
                    this.continuousFrameType = null;
                } else {
                    this.continuousFrameType = opcode;
                }
                return Collections.singletonList(framedataImpl1);
            } catch (InvalidDataException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
    }

    public abstract Draft copyInstance();

    public abstract ByteBuffer createBinaryFrame(Framedata framedata);

    public abstract List<Framedata> createFrames(String str, boolean z);

    public abstract List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z);

    public List<ByteBuffer> createHandshake(Handshakedata handshakedata, WebSocket.Role role) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("64f1a63", new Object[]{this, handshakedata, role}) : createHandshake(handshakedata, role, true);
    }

    public abstract CloseHandshakeType getCloseHandshakeType();

    public WebSocket.Role getRole() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocket.Role) ipChange.ipc$dispatch("cd5f2ec0", new Object[]{this});
        }
        return this.role;
    }

    public abstract ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder);

    public abstract HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder);

    public abstract void reset();

    public void setParseMode(WebSocket.Role role) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a46142", new Object[]{this, role});
        } else {
            this.role = role;
        }
    }

    public abstract List<Framedata> translateFrame(ByteBuffer byteBuffer);

    public Handshakedata translateHandshake(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handshakedata) ipChange.ipc$dispatch("38203ac", new Object[]{this, byteBuffer});
        }
        return translateHandshakeHttp(byteBuffer, this.role);
    }

    public List<ByteBuffer> createHandshake(Handshakedata handshakedata, WebSocket.Role role, boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6cf65857", new Object[]{this, handshakedata, role, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(100);
        if (handshakedata instanceof ClientHandshake) {
            sb.append("GET ");
            sb.append(((ClientHandshake) handshakedata).getResourceDescriptor());
            sb.append(" HTTP/1.1");
        } else if (handshakedata instanceof ServerHandshake) {
            sb.append("HTTP/1.1 101 " + ((ServerHandshake) handshakedata).getHttpStatusMessage());
        } else {
            throw new RuntimeException("unknow role");
        }
        sb.append("\r\n");
        Iterator<String> iterateHttpFields = handshakedata.iterateHttpFields();
        while (iterateHttpFields.hasNext()) {
            String next = iterateHttpFields.next();
            String fieldValue = handshakedata.getFieldValue(next);
            sb.append(next);
            sb.append(": ");
            sb.append(fieldValue);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] asciiBytes = Charsetfunctions.asciiBytes(sb.toString());
        byte[] content = z ? handshakedata.getContent() : null;
        if (content != null) {
            i = content.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + asciiBytes.length);
        allocate.put(asciiBytes);
        if (content != null) {
            allocate.put(content);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public boolean basicAccept(Handshakedata handshakedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58f09158", new Object[]{this, handshakedata})).booleanValue();
        }
        return handshakedata.getFieldValue("Upgrade").equalsIgnoreCase("websocket") && handshakedata.getFieldValue("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Server, com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder translateHandshakeHttp(java.nio.ByteBuffer r7, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket.Role r8) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "2b13288"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder r7 = (com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder) r7
            return r7
        L_0x0018:
            java.lang.String r3 = readStringLine(r7)
            if (r3 == 0) goto L_0x0087
            java.lang.String r4 = " "
            r5 = 3
            java.lang.String[] r3 = r3.split(r4, r5)
            int r4 = r3.length
            if (r4 != r5) goto L_0x0081
            com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role r4 = com.alipay.android.phone.mobilesdk.socketcraft.WebSocket.Role.CLIENT
            if (r8 != r4) goto L_0x0040
            com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Server r8 = new com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Server
            r8.<init>()
            r4 = r3[r0]
            short r4 = java.lang.Short.parseShort(r4)
            r8.setHttpStatus(r4)
            r3 = r3[r2]
            r8.setHttpStatusMessage(r3)
            goto L_0x004a
        L_0x0040:
            com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client r8 = new com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client
            r8.<init>()
            r3 = r3[r0]
            r8.setResourceDescriptor(r3)
        L_0x004a:
            java.lang.String r3 = readStringLine(r7)
            if (r3 == 0) goto L_0x0078
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0078
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4, r2)
            int r4 = r3.length
            if (r4 != r2) goto L_0x006f
            r4 = r3[r1]
            r3 = r3[r0]
            java.lang.String r5 = "^ +"
            java.lang.String r6 = ""
            java.lang.String r3 = r3.replaceFirst(r5, r6)
            r8.put(r4, r3)
            goto L_0x004a
        L_0x006f:
            com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException r7 = new com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException
            java.lang.String r8 = "not an http header"
            r7.<init>(r8)
            throw r7
        L_0x0078:
            if (r3 == 0) goto L_0x007b
            return r8
        L_0x007b:
            com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException r7 = new com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException
            r7.<init>()
            throw r7
        L_0x0081:
            com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException r7 = new com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException
            r7.<init>()
            throw r7
        L_0x0087:
            com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException r8 = new com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException
            int r7 = r7.capacity()
            int r7 = r7 + 128
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft.translateHandshakeHttp(java.nio.ByteBuffer, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket$Role):com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder");
    }
}
