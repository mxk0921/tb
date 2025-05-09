package org.java_websocket.framing;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.framing.Framedata;
import tb.fp2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class f implements Framedata {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Framedata.Opcode b;
    public ByteBuffer c = fp2.a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f15418a = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$org$java_websocket$framing$Framedata$Opcode;

        static {
            int[] iArr = new int[Framedata.Opcode.values().length];
            $SwitchMap$org$java_websocket$framing$Framedata$Opcode = iArr;
            try {
                iArr[Framedata.Opcode.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$java_websocket$framing$Framedata$Opcode[Framedata.Opcode.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public f(Framedata.Opcode opcode) {
        this.b = opcode;
    }

    public static f d(Framedata.Opcode opcode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("63fbc002", new Object[]{opcode});
        }
        if (opcode != null) {
            switch (a.$SwitchMap$org$java_websocket$framing$Framedata$Opcode[opcode.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new h();
                case 3:
                    return new i();
                case 4:
                    return new org.java_websocket.framing.a();
                case 5:
                    return new b();
                case 6:
                    return new c();
                default:
                    throw new IllegalArgumentException("Supplied opcode is invalid");
            }
        } else {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf2ba251", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf39b9d2", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf47d153", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public abstract void e() throws InvalidDataException;

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f15418a != fVar.f15418a || this.d != fVar.d || this.e != fVar.e || this.f != fVar.f || this.g != fVar.g || this.b != fVar.b) {
            return false;
        }
        ByteBuffer byteBuffer = this.c;
        ByteBuffer byteBuffer2 = fVar.c;
        if (byteBuffer != null) {
            return byteBuffer.equals(byteBuffer2);
        }
        if (byteBuffer2 == null) {
            return true;
        }
        return false;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b09a084", new Object[]{this, new Boolean(z)});
        } else {
            this.f15418a = z;
        }
    }

    public void g(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68b5dde", new Object[]{this, byteBuffer});
        } else {
            this.c = byteBuffer;
        }
    }

    @Override // org.java_websocket.framing.Framedata
    public Framedata.Opcode getOpcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Framedata.Opcode) ipChange.ipc$dispatch("a77cbfa2", new Object[]{this});
        }
        return this.b;
    }

    @Override // org.java_websocket.framing.Framedata
    public ByteBuffer getPayloadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("298376a", new Object[]{this});
        }
        return this.c;
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bcd49ef", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = (((this.f15418a ? 1 : 0) * 31) + this.b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            i = byteBuffer.hashCode();
        }
        return ((((((((hashCode + i) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d82228e", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    @Override // org.java_websocket.framing.Framedata
    public boolean isFin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa7d5a8c", new Object[]{this})).booleanValue();
        }
        return this.f15418a;
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f36fb2d", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9faeea", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("Framedata{ optcode:");
        sb.append(getOpcode());
        sb.append(", fin:");
        sb.append(isFin());
        sb.append(", rsv1:");
        sb.append(a());
        sb.append(", rsv2:");
        sb.append(b());
        sb.append(", rsv3:");
        sb.append(c());
        sb.append(", payloadlength:[pos:");
        sb.append(this.c.position());
        sb.append(", len:");
        sb.append(this.c.remaining());
        sb.append("], payload:");
        if (this.c.remaining() > 1000) {
            str = "(too big to display)";
        } else {
            str = new String(this.c.array());
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
