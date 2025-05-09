package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import anet.channel.util.HttpConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import tb.pg1;
import tb.tiv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Draft_76 extends Draft_75 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final byte[] c = {-1, 0};
    public final Random b = new Random();

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fad2fc8f", new Object[0]);
        }
        Random random = new Random();
        long nextInt = random.nextInt(12) + 1;
        String l = Long.toString((random.nextInt(Math.abs(new Long(tiv.INT_MASK / nextInt).intValue())) + 1) * nextInt);
        int nextInt2 = random.nextInt(12) + 1;
        for (int i = 0; i < nextInt2; i++) {
            int abs = Math.abs(random.nextInt(l.length()));
            char nextInt3 = (char) (random.nextInt(95) + 33);
            if (nextInt3 >= '0' && nextInt3 <= '9') {
                nextInt3 = (char) (nextInt3 - 15);
            }
            l = new StringBuilder(l).insert(abs, nextInt3).toString();
        }
        for (int i2 = 0; i2 < nextInt; i2++) {
            l = new StringBuilder(l).insert(Math.abs(random.nextInt(l.length() - 1) + 1), " ").toString();
        }
        return l;
    }

    public static byte[] createChallenge(String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3403bbd4", new Object[]{str, str2, bArr});
        }
        byte[] b = b(str);
        byte[] b2 = b(str2);
        try {
            return MessageDigest.getInstance("MD5").digest(new byte[]{b[0], b[1], b[2], b[3], b2[0], b2[1], b2[2], b2[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static /* synthetic */ Object ipc$super(Draft_76 draft_76, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117782404) {
            return super.translateRegularFrame((ByteBuffer) objArr[0]);
        }
        if (hashCode == -525237114) {
            return super.createBinaryFrame((Framedata) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/phone/mobilesdk/socketcraft/drafts/Draft_76");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("e3946259", new Object[]{this, clientHandshake, serverHandshake});
        }
        try {
            if (serverHandshake.getFieldValue("Sec-WebSocket-Origin").equals(clientHandshake.getFieldValue("Origin")) && basicAccept(serverHandshake)) {
                byte[] content = serverHandshake.getContent();
                if (content == null || content.length == 0) {
                    throw new IncompleteHandshakeException();
                } else if (Arrays.equals(content, createChallenge(clientHandshake.getFieldValue("Sec-WebSocket-Key1"), clientHandshake.getFieldValue("Sec-WebSocket-Key2"), clientHandshake.getContent()))) {
                    return Draft.HandshakeState.MATCHED;
                } else {
                    return Draft.HandshakeState.NOT_MATCHED;
                }
            }
            return Draft.HandshakeState.NOT_MATCHED;
        } catch (InvalidHandshakeException e) {
            throw new RuntimeException("bad handshakerequest", e);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("1f6526e5", new Object[]{this, clientHandshake});
        }
        if (!clientHandshake.getFieldValue("Upgrade").equals("WebSocket") || !clientHandshake.getFieldValue("Connection").contains("Upgrade") || clientHandshake.getFieldValue("Sec-WebSocket-Key1").length() <= 0 || clientHandshake.getFieldValue("Sec-WebSocket-Key2").isEmpty() || !clientHandshake.hasFieldValue("Origin")) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.MATCHED;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft copyInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft) ipChange.ipc$dispatch("b27244d", new Object[]{this});
        }
        return new Draft_76();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ByteBuffer createBinaryFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("e0b18486", new Object[]{this, framedata});
        }
        if (framedata.getOpcode() == Framedata.Opcode.CLOSING) {
            return ByteBuffer.wrap(c);
        }
        return super.createBinaryFrame(framedata);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.CloseHandshakeType getCloseHandshakeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.CloseHandshakeType) ipChange.ipc$dispatch("4cdb3ae7", new Object[]{this});
        }
        return Draft.CloseHandshakeType.ONEWAY;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientHandshakeBuilder) ipChange.ipc$dispatch("8b007ef7", new Object[]{this, clientHandshakeBuilder});
        }
        clientHandshakeBuilder.put("Upgrade", "WebSocket");
        clientHandshakeBuilder.put("Connection", "Upgrade");
        clientHandshakeBuilder.put("Sec-WebSocket-Key1", a());
        clientHandshakeBuilder.put("Sec-WebSocket-Key2", a());
        if (!clientHandshakeBuilder.hasFieldValue("Origin")) {
            clientHandshakeBuilder.put("Origin", pg1.ATOM_EXT_random + this.b.nextInt());
        }
        byte[] bArr = new byte[8];
        this.b.nextBytes(bArr);
        clientHandshakeBuilder.setContent(bArr);
        return clientHandshakeBuilder;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandshakeBuilder) ipChange.ipc$dispatch("4610b284", new Object[]{this, clientHandshake, serverHandshakeBuilder});
        }
        serverHandshakeBuilder.setHttpStatusMessage("WebSocket Protocol Handshake");
        serverHandshakeBuilder.put("Upgrade", "WebSocket");
        serverHandshakeBuilder.put("Connection", clientHandshake.getFieldValue("Connection"));
        serverHandshakeBuilder.put("Sec-WebSocket-Origin", clientHandshake.getFieldValue("Origin"));
        serverHandshakeBuilder.put("Sec-WebSocket-Location", "ws://" + clientHandshake.getFieldValue(HttpConstant.HOST) + clientHandshake.getResourceDescriptor());
        String fieldValue = clientHandshake.getFieldValue("Sec-WebSocket-Key1");
        String fieldValue2 = clientHandshake.getFieldValue("Sec-WebSocket-Key2");
        byte[] content = clientHandshake.getContent();
        if (fieldValue == null || fieldValue2 == null || content == null || content.length != 8) {
            throw new InvalidHandshakeException("Bad keys");
        }
        serverHandshakeBuilder.setContent(createChallenge(fieldValue, fieldValue2, content));
        return serverHandshakeBuilder;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75, com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> translateFrame(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7380b9c", new Object[]{this, byteBuffer});
        }
        byteBuffer.mark();
        List<Framedata> translateRegularFrame = super.translateRegularFrame(byteBuffer);
        if (translateRegularFrame != null) {
            return translateRegularFrame;
        }
        byteBuffer.reset();
        List<Framedata> list = this.readyframes;
        this.readingState = true;
        if (this.currentFrame == null) {
            this.currentFrame = ByteBuffer.allocate(2);
            if (byteBuffer.remaining() <= this.currentFrame.remaining()) {
                this.currentFrame.put(byteBuffer);
                if (this.currentFrame.hasRemaining()) {
                    this.readyframes = new LinkedList();
                    return list;
                } else if (Arrays.equals(this.currentFrame.array(), c)) {
                    list.add(new CloseFrameBuilder(1000));
                    return list;
                } else {
                    throw new InvalidFrameException();
                }
            } else {
                throw new InvalidFrameException();
            }
        } else {
            throw new InvalidFrameException();
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Handshakedata translateHandshake(ByteBuffer byteBuffer) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handshakedata) ipChange.ipc$dispatch("38203ac", new Object[]{this, byteBuffer});
        }
        HandshakeBuilder translateHandshakeHttp = Draft.translateHandshakeHttp(byteBuffer, this.role);
        if ((translateHandshakeHttp.hasFieldValue("Sec-WebSocket-Key1") || this.role == WebSocket.Role.CLIENT) && !translateHandshakeHttp.hasFieldValue("Sec-WebSocket-Version")) {
            if (this.role == WebSocket.Role.SERVER) {
                i = 8;
            } else {
                i = 16;
            }
            byte[] bArr = new byte[i];
            try {
                byteBuffer.get(bArr);
                translateHandshakeHttp.setContent(bArr);
            } catch (BufferUnderflowException unused) {
                throw new IncompleteHandshakeException(byteBuffer.capacity() + 16);
            }
        }
        return translateHandshakeHttp;
    }

    public static byte[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("602665e3", new Object[]{str});
        }
        try {
            long parseLong = Long.parseLong(str.replaceAll("[^0-9]", ""));
            long length = str.split(" ").length - 1;
            if (length != 0) {
                long longValue = new Long(parseLong / length).longValue();
                return new byte[]{(byte) (longValue >> 24), (byte) ((longValue << 8) >> 24), (byte) ((longValue << 16) >> 24), (byte) ((longValue << 24) >> 24)};
            }
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
        } catch (NumberFormatException unused) {
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }
}
