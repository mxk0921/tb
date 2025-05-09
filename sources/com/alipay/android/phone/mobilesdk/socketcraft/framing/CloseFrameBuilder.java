package com.alipay.android.phone.mobilesdk.socketcraft.framing;

import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidFrameException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CloseFrameBuilder extends FramedataImpl1 implements CloseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ByteBuffer emptybytebuffer = ByteBuffer.allocate(0);
    public int b;
    public String c;

    public CloseFrameBuilder() {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
    }

    public static /* synthetic */ Object ipc$super(CloseFrameBuilder closeFrameBuilder, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2128160755) {
            return super.toString();
        }
        if (hashCode == -427074082) {
            super.setPayload((ByteBuffer) objArr[0]);
            return null;
        } else if (hashCode == 43530090) {
            return super.getPayloadData();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/phone/mobilesdk/socketcraft/framing/CloseFrameBuilder");
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c46c2dc", new Object[]{this});
            return;
        }
        this.b = 1005;
        ByteBuffer payloadData = super.getPayloadData();
        payloadData.mark();
        if (payloadData.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(payloadData.getShort());
            allocate.position(0);
            int i = allocate.getInt();
            this.b = i;
            if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
                throw new InvalidFrameException("closecode must not be sent over the wire: " + this.b);
            }
        }
        payloadData.reset();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d4a1de", new Object[]{this});
        } else if (this.b == 1005) {
            this.c = Charsetfunctions.stringUtf8(super.getPayloadData());
        } else {
            ByteBuffer payloadData = super.getPayloadData();
            int position = payloadData.position();
            try {
                try {
                    payloadData.position(payloadData.position() + 2);
                    this.c = Charsetfunctions.stringUtf8(payloadData);
                } catch (IllegalArgumentException e) {
                    throw new InvalidFrameException(e);
                }
            } finally {
                payloadData.position(position);
            }
        }
    }

    public final void c(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c1b247", new Object[]{this, new Integer(i), str});
            return;
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (i == 1015) {
            i = 1005;
        } else {
            str2 = str;
        }
        if (i != 1005) {
            byte[] utf8Bytes = Charsetfunctions.utf8Bytes(str2);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(i);
            allocate.position(2);
            ByteBuffer allocate2 = ByteBuffer.allocate(utf8Bytes.length + 2);
            allocate2.put(allocate);
            allocate2.put(utf8Bytes);
            allocate2.rewind();
            setPayload(allocate2);
        } else if (str2.length() > 0) {
            throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrame
    public int getCloseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d42ffa49", new Object[]{this})).intValue();
        }
        return this.b;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrame
    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1, com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata
    public ByteBuffer getPayloadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("298376a", new Object[]{this});
        }
        if (this.b == 1005) {
            return emptybytebuffer;
        }
        return super.getPayloadData();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1, com.alipay.android.phone.mobilesdk.socketcraft.framing.FrameBuilder
    public void setPayload(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68b5dde", new Object[]{this, byteBuffer});
            return;
        }
        super.setPayload(byteBuffer);
        a();
        b();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.framing.FramedataImpl1
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "code: " + this.b;
    }

    public CloseFrameBuilder(int i) {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
        c(i, "");
    }

    public CloseFrameBuilder(int i, String str) {
        super(Framedata.Opcode.CLOSING);
        setFin(true);
        c(i, str);
    }
}
