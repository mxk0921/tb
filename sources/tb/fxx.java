package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aws.a.b;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fxx extends mtx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ABNORMAL_CLOSE = 1006;
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
    public static final int TLS_ERROR = 1015;
    public static final int TOOBIG = 1009;
    public static final int UNEXPECTED_CONDITION = 1011;
    public int g;
    public String h;

    static {
        t2o.a(401604620);
    }

    public fxx() {
        super(5);
        m("");
        n(1000);
    }

    public static /* synthetic */ Object ipc$super(fxx fxxVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1045431124) {
            return super.d();
        }
        if (hashCode == 90991724) {
            return new Boolean(super.e());
        }
        if (hashCode == 761580009) {
            super.b((ByteBuffer) objArr[0]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/aws/b/b/b");
    }

    @Override // tb.u3y
    public void b(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d64c9e9", new Object[]{this, byteBuffer});
            return;
        }
        this.g = 1005;
        this.h = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.g = 1000;
        } else if (byteBuffer.remaining() == 1) {
            this.g = 1002;
        } else {
            if (byteBuffer.remaining() >= 2) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(2);
                allocate.putShort(byteBuffer.getShort());
                allocate.position(0);
                this.g = allocate.getInt();
            }
            byteBuffer.reset();
            try {
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.h = sj3.c(byteBuffer);
                    byteBuffer.position(position);
                } catch (IllegalArgumentException unused) {
                    throw new b(1007);
                }
            } catch (b unused2) {
                this.g = 1007;
                this.h = null;
            }
        }
    }

    @Override // tb.u3y, tb.zyx
    public ByteBuffer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("c1affcac", new Object[]{this});
        }
        if (this.g == 1005) {
            return tl1.c();
        }
        return super.d();
    }

    @Override // tb.mtx, tb.u3y
    public boolean e() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!super.e() || ((i = this.g) == 1007 && this.h == null)) {
            return false;
        }
        if (i == 1005 && this.h.length() > 0) {
            return false;
        }
        int i2 = this.g;
        if ((i2 > 1011 && i2 < 3000 && i2 != 1015) || i2 == 1006 || i2 == 1015 || i2 == 1005 || i2 > 4999 || i2 < 1000 || i2 == 1004) {
            return false;
        }
        return true;
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.h = str;
        q();
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        if (i == 1015) {
            this.g = 1005;
            this.h = "";
        }
        q();
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        return this.h;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        byte[] d = sj3.d(this.h);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.g);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(d.length + 2);
        allocate2.put(allocate);
        allocate2.put(d);
        allocate2.rewind();
        super.b(allocate2);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "code: " + this.g;
    }
}
