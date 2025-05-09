package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class u3y implements zyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BINARY = 2;
    public static final int CLOSING = 5;
    public static final int CONTINUOUS = 0;
    public static final int PING = 3;
    public static final int PONG = 4;
    public static final int TEXT = 1;
    public final int b;
    public ByteBuffer c = tl1.c();

    /* renamed from: a  reason: collision with root package name */
    public boolean f29126a = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    static {
        t2o.a(401604618);
        t2o.a(401604617);
    }

    public u3y(int i) {
        this.b = i;
    }

    public static u3y a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u3y) ipChange.ipc$dispatch("5d0c8126", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return new azx();
        }
        if (i == 1) {
            return new c6y();
        }
        if (i == 2) {
            return new ntx();
        }
        if (i == 3) {
            return new v3y();
        }
        if (i == 4) {
            return new f5y();
        }
        if (i == 5) {
            return new fxx();
        }
        throw new IllegalArgumentException("Supplied opCode is invalid");
    }

    @Override // tb.zyx
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f29126a;
    }

    @Override // tb.zyx
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
    }

    @Override // tb.zyx
    public ByteBuffer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("c1affcac", new Object[]{this});
        }
        return this.c;
    }

    public abstract boolean e();

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void b(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d64c9e9", new Object[]{this, byteBuffer});
        } else {
            this.c = byteBuffer;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f29126a = z;
        }
    }
}
