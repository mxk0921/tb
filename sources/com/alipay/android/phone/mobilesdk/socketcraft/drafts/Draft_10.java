package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.LimitExedeedException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.NotSendableException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Base64;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import tb.c0z;
import tb.cq1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Draft_10 extends Draft {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f3754a;
    public final Random b = new Random();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class IncompleteException extends Throwable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 7330519489840500997L;
        private int preferedsize;

        public IncompleteException(int i) {
            this.preferedsize = i;
        }

        public static /* synthetic */ Object ipc$super(IncompleteException incompleteException, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/drafts/Draft_10$IncompleteException");
        }

        public int getPreferedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58faa340", new Object[]{this})).intValue();
            }
            return this.preferedsize;
        }
    }

    public static /* synthetic */ Object ipc$super(Draft_10 draft_10, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/drafts/Draft_10");
    }

    public static int readVersion(Handshakedata handshakedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1610aad3", new Object[]{handshakedata})).intValue();
        }
        String fieldValue = handshakedata.getFieldValue("Sec-WebSocket-Version");
        if (fieldValue.length() > 0) {
            try {
                return new Integer(fieldValue.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public final byte a(Framedata.Opcode opcode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca8579fd", new Object[]{this, opcode})).byteValue();
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
        throw new RuntimeException("Don't know how to handle " + opcode.toString());
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("e3946259", new Object[]{this, clientHandshake, serverHandshake});
        }
        if (!clientHandshake.hasFieldValue("Sec-WebSocket-Key") || !serverHandshake.hasFieldValue("Sec-WebSocket-Accept")) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (b(clientHandshake.getFieldValue("Sec-WebSocket-Key")).equals(serverHandshake.getFieldValue("Sec-WebSocket-Accept"))) {
            return Draft.HandshakeState.MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("1f6526e5", new Object[]{this, clientHandshake});
        }
        int readVersion = readVersion(clientHandshake);
        if (readVersion != 7 && readVersion != 8) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (basicAccept(clientHandshake)) {
            return Draft.HandshakeState.MATCHED;
        }
        return Draft.HandshakeState.NOT_MATCHED;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("467ad1", new Object[]{this, str});
        }
        String trim = str.trim();
        try {
            return Base64.encodeBytes(MessageDigest.getInstance("SHA1").digest((trim + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final byte[] c(long j, int i) {
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

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft copyInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft) ipChange.ipc$dispatch("b27244d", new Object[]{this});
        }
        return new Draft_10();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ByteBuffer createBinaryFrame(Framedata framedata) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("e0b18486", new Object[]{this, framedata});
        }
        ByteBuffer payloadData = framedata.getPayloadData();
        if (this.role == WebSocket.Role.CLIENT) {
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
        byte a2 = a(framedata.getOpcode());
        boolean isFin = framedata.isFin();
        byte b = c0z.STATE;
        if (isFin) {
            i4 = cq1.SIGN;
        } else {
            i4 = 0;
        }
        allocate.put((byte) (((byte) i4) | a2));
        byte[] c = c(payloadData.remaining(), i);
        if (i == 1) {
            byte b2 = c[0];
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b2 | b));
        } else if (i == 2) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | 126));
            allocate.put(c);
        } else if (i == 8) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | Byte.MAX_VALUE));
            allocate.put(c);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.b.nextInt());
            allocate.put(allocate2.array());
            while (payloadData.hasRemaining()) {
                allocate.put((byte) (payloadData.get() ^ allocate2.get(i5 % 4)));
                i5++;
            }
        } else {
            allocate.put(payloadData);
        }
        allocate.flip();
        return allocate;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("43a6b19b", new Object[]{this, byteBuffer, new Boolean(z)});
        }
        FramedataImpl1 framedataImpl1 = new FramedataImpl1();
        try {
            framedataImpl1.setPayload(byteBuffer);
            framedataImpl1.setFin(true);
            framedataImpl1.setOptcode(Framedata.Opcode.BINARY);
            framedataImpl1.setTransferemasked(z);
            return Collections.singletonList(framedataImpl1);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.CloseHandshakeType getCloseHandshakeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.CloseHandshakeType) ipChange.ipc$dispatch("4cdb3ae7", new Object[]{this});
        }
        return Draft.CloseHandshakeType.TWOWAY;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientHandshakeBuilder) ipChange.ipc$dispatch("8b007ef7", new Object[]{this, clientHandshakeBuilder});
        }
        clientHandshakeBuilder.put("Upgrade", "websocket");
        clientHandshakeBuilder.put("Connection", "Upgrade");
        clientHandshakeBuilder.put("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.b.nextBytes(bArr);
        clientHandshakeBuilder.put("Sec-WebSocket-Key", Base64.encodeBytes(bArr));
        return clientHandshakeBuilder;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandshakeBuilder) ipChange.ipc$dispatch("4610b284", new Object[]{this, clientHandshake, serverHandshakeBuilder});
        }
        serverHandshakeBuilder.put("Upgrade", "websocket");
        serverHandshakeBuilder.put("Connection", clientHandshake.getFieldValue("Connection"));
        serverHandshakeBuilder.setHttpStatusMessage("Switching Protocols");
        String fieldValue = clientHandshake.getFieldValue("Sec-WebSocket-Key");
        if (fieldValue != null) {
            serverHandshakeBuilder.put("Sec-WebSocket-Accept", b(fieldValue));
            return serverHandshakeBuilder;
        }
        throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.f3754a = null;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> translateFrame(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7380b9c", new Object[]{this, byteBuffer});
        }
        LinkedList linkedList = new LinkedList();
        if (this.f3754a != null) {
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f3754a.remaining();
                if (remaining2 > remaining) {
                    this.f3754a.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f3754a.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(translateSingleFrame((ByteBuffer) this.f3754a.duplicate().position(0)));
                this.f3754a = null;
            } catch (IncompleteException e) {
                this.f3754a.limit();
                ByteBuffer allocate = ByteBuffer.allocate(checkAlloc(e.getPreferedSize()));
                this.f3754a.rewind();
                allocate.put(this.f3754a);
                this.f3754a = allocate;
                return translateFrame(byteBuffer);
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(translateSingleFrame(byteBuffer));
            } catch (IncompleteException e2) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(checkAlloc(e2.getPreferedSize()));
                this.f3754a = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public final Framedata.Opcode d(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Framedata.Opcode) ipChange.ipc$dispatch("947938c", new Object[]{this, new Byte(b)});
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
                throw new InvalidFrameException("unknow optcode " + ((int) b));
        }
    }

    public Framedata translateSingleFrame(ByteBuffer byteBuffer) {
        FrameBuilder frameBuilder;
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Framedata) ipChange.ipc$dispatch("82236ab1", new Object[]{this, byteBuffer});
        }
        int remaining = byteBuffer.remaining();
        if (remaining >= 2) {
            byte b = byteBuffer.get();
            boolean z = (b >> 8) != 0;
            byte b2 = (byte) ((b & Byte.MAX_VALUE) >> 4);
            if (b2 == 0) {
                byte b3 = byteBuffer.get();
                boolean z2 = (b3 & c0z.STATE) != 0;
                int i2 = (byte) (b3 & Byte.MAX_VALUE);
                Framedata.Opcode d = d((byte) (b & 15));
                if (z || !(d == Framedata.Opcode.PING || d == Framedata.Opcode.PONG || d == Framedata.Opcode.CLOSING)) {
                    if (i2 < 0 || i2 > 125) {
                        if (d == Framedata.Opcode.PING || d == Framedata.Opcode.PONG || d == Framedata.Opcode.CLOSING) {
                            throw new InvalidFrameException("more than 125 octets");
                        } else if (i2 != 126) {
                            i = 10;
                            if (remaining >= 10) {
                                byte[] bArr = new byte[8];
                                for (int i3 = 0; i3 < 8; i3++) {
                                    bArr[i3] = byteBuffer.get();
                                }
                                long longValue = new BigInteger(bArr).longValue();
                                if (longValue <= 2147483647L) {
                                    i2 = (int) longValue;
                                } else {
                                    throw new LimitExedeedException(WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
                                }
                            } else {
                                throw new IncompleteException(10);
                            }
                        } else if (remaining >= 4) {
                            i2 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                            i = 4;
                        } else {
                            throw new IncompleteException(4);
                        }
                    }
                    int i4 = i + (z2 ? 4 : 0) + i2;
                    if (remaining >= i4) {
                        ByteBuffer allocate = ByteBuffer.allocate(checkAlloc(i2));
                        if (z2) {
                            byte[] bArr2 = new byte[4];
                            byteBuffer.get(bArr2);
                            for (int i5 = 0; i5 < i2; i5++) {
                                allocate.put((byte) (byteBuffer.get() ^ bArr2[i5 % 4]));
                            }
                        } else {
                            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                            byteBuffer.position(byteBuffer.position() + allocate.limit());
                        }
                        if (d == Framedata.Opcode.CLOSING) {
                            frameBuilder = new CloseFrameBuilder();
                        } else {
                            frameBuilder = new FramedataImpl1();
                            frameBuilder.setFin(z);
                            frameBuilder.setOptcode(d);
                        }
                        allocate.flip();
                        frameBuilder.setPayload(allocate);
                        return frameBuilder;
                    }
                    throw new IncompleteException(i4);
                }
                throw new InvalidFrameException("control frames may no be fragmented");
            }
            throw new InvalidFrameException("bad rsv " + ((int) b2));
        }
        throw new IncompleteException(2);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> createFrames(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("be3c58c6", new Object[]{this, str, new Boolean(z)});
        }
        FramedataImpl1 framedataImpl1 = new FramedataImpl1();
        try {
            framedataImpl1.setPayload(ByteBuffer.wrap(Charsetfunctions.utf8Bytes(str)));
            framedataImpl1.setFin(true);
            framedataImpl1.setOptcode(Framedata.Opcode.TEXT);
            framedataImpl1.setTransferemasked(z);
            return Collections.singletonList(framedataImpl1);
        } catch (InvalidDataException e) {
            throw new NotSendableException(e);
        }
    }
}
