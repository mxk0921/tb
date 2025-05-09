package com.alipay.android.phone.mobilesdk.socketcraft.drafts;

import anet.channel.util.HttpConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.NotSendableException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Draft_75 extends Draft {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte CR = 13;
    public static final byte END_OF_FRAME = -1;
    public static final byte LF = 10;
    public static final byte START_OF_FRAME = 0;
    public ByteBuffer currentFrame;
    public boolean readingState = false;
    public List<Framedata> readyframes = new LinkedList();

    /* renamed from: a  reason: collision with root package name */
    public final Random f3755a = new Random();

    public static /* synthetic */ Object ipc$super(Draft_75 draft_75, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/drafts/Draft_75");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsClient(ClientHandshake clientHandshake, ServerHandshake serverHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("e3946259", new Object[]{this, clientHandshake, serverHandshake});
        }
        if (!clientHandshake.getFieldValue("WebSocket-Origin").equals(serverHandshake.getFieldValue("Origin")) || !basicAccept(serverHandshake)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.MATCHED;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.HandshakeState acceptHandshakeAsServer(ClientHandshake clientHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("1f6526e5", new Object[]{this, clientHandshake});
        }
        if (!clientHandshake.hasFieldValue("Origin") || !basicAccept(clientHandshake)) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        return Draft.HandshakeState.MATCHED;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft copyInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft) ipChange.ipc$dispatch("b27244d", new Object[]{this});
        }
        return new Draft_75();
    }

    public ByteBuffer createBuffer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("11a208a4", new Object[]{this});
        }
        return ByteBuffer.allocate(Draft.INITIAL_FAMESIZE);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> createFrames(ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("43a6b19b", new Object[]{this, byteBuffer, new Boolean(z)});
        }
        throw new RuntimeException("not yet implemented");
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public Draft.CloseHandshakeType getCloseHandshakeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Draft.CloseHandshakeType) ipChange.ipc$dispatch("4cdb3ae7", new Object[]{this});
        }
        return Draft.CloseHandshakeType.NONE;
    }

    public ByteBuffer increaseBuffer(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("2ed72989", new Object[]{this, byteBuffer});
        }
        byteBuffer.flip();
        ByteBuffer allocate = ByteBuffer.allocate(checkAlloc(byteBuffer.capacity() * 2));
        allocate.put(byteBuffer);
        return allocate;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ClientHandshakeBuilder postProcessHandshakeRequestAsClient(ClientHandshakeBuilder clientHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientHandshakeBuilder) ipChange.ipc$dispatch("8b007ef7", new Object[]{this, clientHandshakeBuilder});
        }
        clientHandshakeBuilder.put("Upgrade", "WebSocket");
        clientHandshakeBuilder.put("Connection", "Upgrade");
        if (!clientHandshakeBuilder.hasFieldValue("Origin")) {
            clientHandshakeBuilder.put("Origin", pg1.ATOM_EXT_random + this.f3755a.nextInt());
        }
        return clientHandshakeBuilder;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public HandshakeBuilder postProcessHandshakeResponseAsServer(ClientHandshake clientHandshake, ServerHandshakeBuilder serverHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandshakeBuilder) ipChange.ipc$dispatch("4610b284", new Object[]{this, clientHandshake, serverHandshakeBuilder});
        }
        serverHandshakeBuilder.setHttpStatusMessage("Web Socket Protocol Handshake");
        serverHandshakeBuilder.put("Upgrade", "WebSocket");
        serverHandshakeBuilder.put("Connection", clientHandshake.getFieldValue("Connection"));
        serverHandshakeBuilder.put("WebSocket-Origin", clientHandshake.getFieldValue("Origin"));
        serverHandshakeBuilder.put("WebSocket-Location", "ws://" + clientHandshake.getFieldValue(HttpConstant.HOST) + clientHandshake.getResourceDescriptor());
        return serverHandshakeBuilder;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.readingState = false;
        this.currentFrame = null;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public List<Framedata> translateFrame(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7380b9c", new Object[]{this, byteBuffer});
        }
        List<Framedata> translateRegularFrame = translateRegularFrame(byteBuffer);
        if (translateRegularFrame != null) {
            return translateRegularFrame;
        }
        throw new InvalidDataException(1002);
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

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft
    public ByteBuffer createBinaryFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("e0b18486", new Object[]{this, framedata});
        }
        if (framedata.getOpcode() == Framedata.Opcode.TEXT) {
            ByteBuffer payloadData = framedata.getPayloadData();
            ByteBuffer allocate = ByteBuffer.allocate(payloadData.remaining() + 2);
            allocate.put((byte) 0);
            payloadData.mark();
            allocate.put(payloadData);
            payloadData.reset();
            allocate.put((byte) -1);
            allocate.flip();
            return allocate;
        }
        throw new RuntimeException("only text frames supported");
    }

    public List<Framedata> translateRegularFrame(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bd5ffe7c", new Object[]{this, byteBuffer});
        }
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            if (b == 0) {
                if (!this.readingState) {
                    this.readingState = true;
                } else {
                    throw new InvalidFrameException("unexpected START_OF_FRAME");
                }
            } else if (b == -1) {
                if (this.readingState) {
                    ByteBuffer byteBuffer2 = this.currentFrame;
                    if (byteBuffer2 != null) {
                        byteBuffer2.flip();
                        FramedataImpl1 framedataImpl1 = new FramedataImpl1();
                        framedataImpl1.setPayload(this.currentFrame);
                        framedataImpl1.setFin(true);
                        framedataImpl1.setOptcode(Framedata.Opcode.TEXT);
                        this.readyframes.add(framedataImpl1);
                        this.currentFrame = null;
                        byteBuffer.mark();
                    }
                    this.readingState = false;
                } else {
                    throw new InvalidFrameException("unexpected END_OF_FRAME");
                }
            } else if (!this.readingState) {
                return null;
            } else {
                ByteBuffer byteBuffer3 = this.currentFrame;
                if (byteBuffer3 == null) {
                    this.currentFrame = createBuffer();
                } else if (!byteBuffer3.hasRemaining()) {
                    this.currentFrame = increaseBuffer(this.currentFrame);
                }
                this.currentFrame.put(b);
            }
        }
        List<Framedata> list = this.readyframes;
        this.readyframes = new LinkedList();
        return list;
    }
}
