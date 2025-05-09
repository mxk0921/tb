package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class eh2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile eh2[] h;

    /* renamed from: a  reason: collision with root package name */
    public int f18574a;
    public String b;
    public long c;
    public String d;
    public boolean e;
    public int f;
    public int g;

    static {
        t2o.a(628097045);
    }

    public eh2() {
        a();
    }

    public static eh2[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eh2[]) ipChange.ipc$dispatch("affdf3cc", new Object[0]);
        }
        if (h == null) {
            synchronized (hjf.LAZY_INIT_LOCK) {
                try {
                    if (h == null) {
                        h = new eh2[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public static /* synthetic */ Object ipc$super(eh2 eh2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$Subscription");
        }
    }

    public eh2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eh2) ipChange.ipc$dispatch("6ce9b2e2", new Object[]{this});
        }
        this.f18574a = 0;
        this.b = "";
        this.c = 0L;
        this.d = "";
        this.e = false;
        this.f = 0;
        this.g = 0;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: c */
    public eh2 mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eh2) ipChange.ipc$dispatch("18e83078", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 8) {
                this.f18574a = ly3Var.F();
            } else if (E == 18) {
                this.b = ly3Var.D();
            } else if (E == 24) {
                this.c = ly3Var.G();
            } else if (E == 34) {
                this.d = ly3Var.D();
            } else if (E == 40) {
                this.e = ly3Var.i();
            } else if (E == 48) {
                this.f = ly3Var.F();
            } else if (E == 56) {
                this.g = ly3Var.F();
            } else if (!hix.e(ly3Var, E)) {
                return this;
            }
        }
    }

    @Override // com.google.protobuf.nano.MessageNano
    public int computeSerializedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
        }
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f18574a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.E(1, i);
        }
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(2, this.b);
        }
        long j = this.c;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.G(3, j);
        }
        if (!this.d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(4, this.d);
        }
        boolean z = this.e;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.b(5, z);
        }
        int i2 = this.f;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.E(6, i2);
        }
        int i3 = this.g;
        if (i3 != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.E(7, i3);
        }
        return computeSerializedSize;
    }

    @Override // com.google.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
            return;
        }
        int i = this.f18574a;
        if (i != 0) {
            codedOutputByteBufferNano.H0(1, i);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.E0(2, this.b);
        }
        long j = this.c;
        if (j != 0) {
            codedOutputByteBufferNano.J0(3, j);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.E0(4, this.d);
        }
        boolean z = this.e;
        if (z) {
            codedOutputByteBufferNano.R(5, z);
        }
        int i2 = this.f;
        if (i2 != 0) {
            codedOutputByteBufferNano.H0(6, i2);
        }
        int i3 = this.g;
        if (i3 != 0) {
            codedOutputByteBufferNano.H0(7, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
