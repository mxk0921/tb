package tb;

import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aws.a.a;
import com.taobao.aws.a.b;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ltx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ltx e;

    /* renamed from: a  reason: collision with root package name */
    public zyx f23565a;
    public ByteBuffer c;
    public final Random d = new Random();
    public final List<ByteBuffer> b = new ArrayList();

    static {
        t2o.a(401604614);
    }

    public static ltx e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ltx) ipChange.ipc$dispatch("17e02eae", new Object[0]);
        }
        if (e == null) {
            synchronized (ltx.class) {
                try {
                    if (e == null) {
                        e = new ltx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final int a(byte b) throws b {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8217947", new Object[]{this, new Byte(b)})).intValue();
        }
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        switch (b) {
            case 8:
                return 5;
            case 9:
                return 3;
            case 10:
                return 4;
            default:
                throw new b(1002, "Unknown opCode " + ((int) b));
        }
    }

    public int b(int i) throws b {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= 0) {
            return i;
        }
        throw new b(1002, "Negative count");
    }

    public ByteBuffer c(zyx zyxVar) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("d8d49d95", new Object[]{this, zyxVar});
        }
        return j(zyxVar);
    }

    public List<zyx> d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("90524525", new Object[]{this, str, new Boolean(z)});
        }
        c6y c6yVar = new c6y();
        c6yVar.b(ByteBuffer.wrap(sj3.d(str)));
        c6yVar.i(z);
        if (c6yVar.e()) {
            return Collections.singletonList(c6yVar);
        }
        return Collections.emptyList();
    }

    public final byte[] h(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("26271e96", new Object[]{this, new Long(j), new Integer(i)});
        }
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (j >>> (i2 - (i3 * 8)));
        }
        return bArr;
    }

    public final byte i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c26", new Object[]{this, new Integer(i)})).byteValue();
        }
        if (i == 0) {
            return (byte) 0;
        }
        if (i == 1) {
            return (byte) 1;
        }
        if (i == 2) {
            return (byte) 2;
        }
        if (i == 5) {
            return (byte) 8;
        }
        if (i == 3) {
            return (byte) 9;
        }
        if (i == 4) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + i);
    }

    public final ByteBuffer j(zyx zyxVar) throws RuntimeException {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("4e4ec3d6", new Object[]{this, zyxVar});
        }
        ByteBuffer d = zyxVar.d();
        if (d.remaining() <= 125) {
            i = 1;
        } else if (d.remaining() <= 65535) {
            i = 2;
        } else {
            i = 8;
        }
        if (i > 1) {
            i2 = i + 1;
        } else {
            i2 = i;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2 + 5 + d.remaining());
        byte i5 = i(zyxVar.c());
        if (zyxVar.b()) {
            i3 = cq1.SIGN;
        } else {
            i3 = 0;
        }
        allocate.put((byte) (((byte) i3) | i5));
        byte[] h = h(d.remaining(), i);
        if (i == 1) {
            allocate.put((byte) (h[0] | c0z.STATE));
        } else if (i == 2) {
            allocate.put((byte) -2);
            allocate.put(h);
        } else {
            allocate.put((byte) -1);
            allocate.put(h);
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(4);
        allocate2.putInt(this.d.nextInt());
        allocate.put(allocate2.array());
        while (d.hasRemaining()) {
            allocate.put((byte) (d.get() ^ allocate2.get(i4 % 4)));
            i4++;
        }
        allocate.flip();
        return allocate;
    }

    public List<zyx> k(ByteBuffer byteBuffer) throws b {
        LinkedList linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8039043f", new Object[]{this, byteBuffer});
        }
        while (true) {
            linkedList = new LinkedList();
            if (this.c == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.c.remaining();
                if (remaining2 > remaining) {
                    this.c.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.c.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                zyx f = f((ByteBuffer) this.c.duplicate().position(0));
                if (f != null) {
                    linkedList.add(f);
                    this.c = null;
                }
            } catch (a e2) {
                ByteBuffer allocate = ByteBuffer.allocate(b(e2.getPreferredSize()));
                this.c.rewind();
                allocate.put(this.c);
                this.c = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                zyx f2 = f(byteBuffer);
                if (f2 != null) {
                    linkedList.add(f2);
                }
            } catch (a e3) {
                byteBuffer.reset();
                ByteBuffer allocate2 = ByteBuffer.allocate(b(e3.getPreferredSize()));
                this.c = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public final ByteBuffer m() throws b {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("3d7fafab", new Object[]{this});
        }
        Iterator it = ((ArrayList) this.b).iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((ByteBuffer) it.next()).limit();
        }
        if (j <= 2147483647L) {
            ByteBuffer allocate = ByteBuffer.allocate((int) j);
            Iterator it2 = ((ArrayList) this.b).iterator();
            while (it2.hasNext()) {
                allocate.put((ByteBuffer) it2.next());
            }
            allocate.flip();
            return allocate;
        }
        throw new b(1009, WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString();
    }

    public void g(v0x v0xVar, zyx zyxVar) throws b {
        String str;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8929aec8", new Object[]{this, v0xVar, zyxVar});
            return;
        }
        int c = zyxVar.c();
        if (c == 5) {
            if (zyxVar instanceof fxx) {
                fxx fxxVar = (fxx) zyxVar;
                i = fxxVar.o();
                str = fxxVar.p();
            } else {
                i = 1005;
                str = "";
            }
            v0xVar.w(i, str, true);
        } else if (c == 3) {
            v0xVar.B(zyxVar);
        } else if (c == 4) {
            v0xVar.C(zyxVar);
        } else if (!zyxVar.b() || c == 0) {
            if (c != 0) {
                if (this.f23565a == null) {
                    this.f23565a = zyxVar;
                    ((ArrayList) this.b).add(zyxVar.d());
                } else {
                    throw new b(1002, "Previous continuous frame sequence not completed.");
                }
            } else if (zyxVar.b()) {
                if (this.f23565a != null) {
                    ((ArrayList) this.b).add(zyxVar.d());
                    if (this.f23565a.c() == 1) {
                        ((u3y) this.f23565a).b(m());
                        if (((u3y) this.f23565a).e()) {
                            v0xVar.A().e(v0xVar, sj3.c(this.f23565a.d()));
                        }
                    } else if (this.f23565a.c() == 2) {
                        ((u3y) this.f23565a).b(m());
                        if (((u3y) this.f23565a).e()) {
                            v0xVar.A().b(v0xVar, this.f23565a.d().array());
                        }
                    }
                    this.f23565a = null;
                    ((ArrayList) this.b).clear();
                } else {
                    throw new b(1002, "Continuous frame sequence was not started.");
                }
            } else if (this.f23565a == null) {
                throw new b(1002, "Continuous frame sequence was not started.");
            }
            if (c == 1 && !sj3.a(zyxVar.d())) {
                throw new b(1007);
            } else if (c == 0 && this.f23565a != null) {
                ((ArrayList) this.b).add(zyxVar.d());
            }
        } else if (this.f23565a != null) {
            throw new b(1002, "Continuous frame sequence not completed.");
        } else if (c == 1) {
            v0xVar.A().e(v0xVar, sj3.c(zyxVar.d()));
        } else if (c == 2) {
            v0xVar.A().b(v0xVar, zyxVar.d().array());
        } else {
            throw new b(1002, "non control or continious frame expected");
        }
    }

    public zyx f(ByteBuffer byteBuffer) throws a, b {
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zyx) ipChange.ipc$dispatch("1c5e779", new Object[]{this, byteBuffer});
        }
        int remaining = byteBuffer.remaining();
        if (remaining >= 2) {
            byte b = byteBuffer.get();
            boolean z = (b >> 8) != 0;
            boolean z2 = (b & 64) != 0;
            boolean z3 = (b & 32) != 0;
            boolean z4 = (b & 16) != 0;
            byte b2 = byteBuffer.get();
            boolean z5 = (b2 & c0z.STATE) != 0;
            int i2 = (byte) (b2 & Byte.MAX_VALUE);
            int a2 = a((byte) (b & 15));
            if (i2 < 0 || i2 > 125) {
                if (a2 == 3 || a2 == 4 || a2 == 5) {
                    throw new b(1002, "more than 125 octets");
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
                            throw new b(1009, WsMessageConstants.MSG_PAYLOAD_SIZE_BIG);
                        }
                    } else {
                        throw new a(10);
                    }
                } else if (remaining >= 4) {
                    i2 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                    i = 4;
                } else {
                    throw new a(4);
                }
            }
            int i4 = i + (z5 ? 4 : 0) + i2;
            if (remaining >= i4) {
                ByteBuffer allocate = ByteBuffer.allocate(b(i2));
                if (z5) {
                    byte[] bArr2 = new byte[4];
                    byteBuffer.get(bArr2);
                    for (int i5 = 0; i5 < i2; i5++) {
                        allocate.put((byte) (byteBuffer.get() ^ bArr2[i5 % 4]));
                    }
                } else {
                    allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                    byteBuffer.position(byteBuffer.position() + allocate.limit());
                }
                u3y a3 = u3y.a(a2);
                a3.c(z);
                a3.f(z2);
                a3.g(z3);
                a3.h(z4);
                allocate.flip();
                a3.b(allocate);
                if (a3.e()) {
                    return a3;
                }
                return null;
            }
            throw new a(i4);
        }
        throw new a(2);
    }
}
