package com.alipay.android.phone.mobilesdk.socketcraft.framing;

import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FramedataImpl1 implements FrameBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static byte[] emptyarray = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f3756a;
    public boolean fin;
    public Framedata.Opcode optcode;
    public boolean transferemasked;

    public FramedataImpl1() {
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public void append(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac1540f", new Object[]{this, framedata});
            return;
        }
        ByteBuffer payloadData = framedata.getPayloadData();
        if (this.f3756a == null) {
            this.f3756a = ByteBuffer.allocate(payloadData.remaining());
            payloadData.mark();
            this.f3756a.put(payloadData);
            payloadData.reset();
        } else {
            payloadData.mark();
            ByteBuffer byteBuffer = this.f3756a;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f3756a;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (payloadData.remaining() > this.f3756a.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(payloadData.remaining() + this.f3756a.capacity());
                this.f3756a.flip();
                allocate.put(this.f3756a);
                allocate.put(payloadData);
                this.f3756a = allocate;
            } else {
                this.f3756a.put(payloadData);
            }
            this.f3756a.rewind();
            payloadData.reset();
        }
        this.fin = framedata.isFin();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public Framedata.Opcode getOpcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Framedata.Opcode) ipChange.ipc$dispatch("c00d044b", new Object[]{this});
        }
        return this.optcode;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public ByteBuffer getPayloadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("298376a", new Object[]{this});
        }
        return this.f3756a;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public boolean getTransfereMasked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b345da", new Object[]{this})).booleanValue();
        }
        return this.transferemasked;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public boolean isFin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa7d5a8c", new Object[]{this})).booleanValue();
        }
        return this.fin;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setFin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b09a084", new Object[]{this, new Boolean(z)});
        } else {
            this.fin = z;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setOptcode(Framedata.Opcode opcode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579ec70b", new Object[]{this, opcode});
        } else {
            this.optcode = opcode;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setPayload(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68b5dde", new Object[]{this, byteBuffer});
        } else {
            this.f3756a = byteBuffer;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setTransferemasked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9faeea", new Object[]{this, new Boolean(z)});
        } else {
            this.transferemasked = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Framedata{ optcode:" + getOpcode() + ", fin:" + isFin() + ", payloadlength:[pos:" + this.f3756a.position() + ", len:" + this.f3756a.remaining() + "], payload:" + Arrays.toString(Charsetfunctions.utf8Bytes(new String(this.f3756a.array()))) + "}";
    }

    public FramedataImpl1(Framedata.Opcode opcode) {
        this.optcode = opcode;
        this.f3756a = ByteBuffer.wrap(emptyarray);
    }

    public FramedataImpl1(Framedata framedata) {
        this.fin = framedata.isFin();
        this.optcode = framedata.getOpcode();
        this.f3756a = framedata.getPayloadData();
        this.transferemasked = framedata.getTransfereMasked();
    }
}
