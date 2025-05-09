package org.java_websocket.framing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import org.java_websocket.framing.Framedata;
import tb.fp2;
import tb.tj3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class b extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ABNORMAL_CLOSE = 1006;
    public static final int BAD_GATEWAY = 1014;
    public static final int BUGGYCLOSE = -2;
    public static final int EXTENSION = 1010;
    public static final int FLASHPOLICY = -3;
    public static final int GOING_AWAY = 1001;
    public static final int NEVER_CONNECTED = -1;
    public static final int NOCODE = 1005;
    public static final int NORMAL = 1000;
    public static final int NO_UTF8 = 1007;
    public static final int POLICY_VALIDATION = 1008;
    public static final int PROTOCOL_ERROR = 1002;
    public static final int REFUSE = 1003;
    public static final int SERVICE_RESTART = 1012;
    public static final int TLS_ERROR = 1015;
    public static final int TOOBIG = 1009;
    public static final int TRY_AGAIN_LATER = 1013;
    public static final int UNEXPECTED_CONDITION = 1011;
    public int h;
    public String i;

    public b() {
        super(Framedata.Opcode.CLOSING);
        o("");
        n(1000);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -427074082:
                super.g((ByteBuffer) objArr[0]);
                return null;
            case 43530090:
                return super.getPayloadData();
            case 67041401:
                super.e();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/java_websocket/framing/CloseFrame");
        }
    }

    @Override // org.java_websocket.framing.d, org.java_websocket.framing.f
    public void e() throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fef879", new Object[]{this});
            return;
        }
        super.e();
        int i = this.h;
        if (i == 1007 && this.i == null) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        } else if (i != 1005 || this.i.length() <= 0) {
            int i2 = this.h;
            if (i2 > 1015 && i2 < 3000) {
                throw new InvalidDataException(1002, "Trying to send an illegal close code!");
            } else if (i2 == 1006 || i2 == 1015 || i2 == 1005 || i2 > 4999 || i2 < 1000 || i2 == 1004) {
                throw new InvalidFrameException("closecode must not be sent over the wire: " + this.h);
            }
        } else {
            throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
        }
    }

    @Override // org.java_websocket.framing.f
    public void g(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68b5dde", new Object[]{this, byteBuffer});
            return;
        }
        this.h = 1005;
        this.i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.h = 1000;
        } else if (byteBuffer.remaining() == 1) {
            this.h = 1002;
        } else {
            if (byteBuffer.remaining() >= 2) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(2);
                allocate.putShort(byteBuffer.getShort());
                allocate.position(0);
                this.h = allocate.getInt();
            }
            byteBuffer.reset();
            try {
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.i = tj3.e(byteBuffer);
                    byteBuffer.position(position);
                } catch (IllegalArgumentException unused) {
                    throw new InvalidDataException(1007);
                }
            } catch (InvalidDataException unused2) {
                this.h = 1007;
                this.i = null;
            }
        }
    }

    @Override // org.java_websocket.framing.f, org.java_websocket.framing.Framedata
    public ByteBuffer getPayloadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("298376a", new Object[]{this});
        }
        if (this.h == 1005) {
            return fp2.a();
        }
        return super.getPayloadData();
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d42ffa49", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.i;
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15beaf4d", new Object[]{this, new Integer(i)});
            return;
        }
        this.h = i;
        if (i == 1015) {
            this.h = 1005;
            this.i = "";
        }
        p();
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b84b57", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.i = str;
        p();
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23b368c", new Object[]{this});
            return;
        }
        byte[] f = tj3.f(this.i);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.h);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(f.length + 2);
        allocate2.put(allocate);
        allocate2.put(f);
        allocate2.rewind();
        super.g(allocate2);
    }

    @Override // org.java_websocket.framing.f
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "code: " + this.h;
    }
}
