package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ug2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ug2[] j;

    /* renamed from: a  reason: collision with root package name */
    public String f29353a;
    public String b;
    public int c;
    public long d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public String i;

    static {
        t2o.a(628097035);
    }

    public ug2() {
        a();
    }

    public static ug2[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ug2[]) ipChange.ipc$dispatch("5cf7f2b6", new Object[0]);
        }
        if (j == null) {
            synchronized (hjf.LAZY_INIT_LOCK) {
                try {
                    if (j == null) {
                        j = new ug2[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public static /* synthetic */ Object ipc$super(ug2 ug2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$MessageAckRecord");
        }
    }

    public ug2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ug2) ipChange.ipc$dispatch("312236cc", new Object[]{this});
        }
        this.f29353a = "";
        this.b = "";
        this.c = 0;
        this.d = 0L;
        this.e = 0;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = "";
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: c */
    public ug2 mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ug2) ipChange.ipc$dispatch("97dbf962", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                this.f29353a = ly3Var.D();
            } else if (E == 18) {
                this.b = ly3Var.D();
            } else if (E == 24) {
                this.c = ly3Var.F();
            } else if (E == 32) {
                this.d = ly3Var.G();
            } else if (E == 40) {
                this.e = ly3Var.F();
            } else if (E == 48) {
                this.f = ly3Var.i();
            } else if (E == 56) {
                this.g = ly3Var.F();
            } else if (E == 64) {
                this.h = ly3Var.F();
            } else if (E == 74) {
                this.i = ly3Var.D();
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
        if (!this.f29353a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(1, this.f29353a);
        }
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.E(3, i);
        }
        long j2 = this.d;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.G(4, j2);
        }
        int i2 = this.e;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.E(5, i2);
        }
        boolean z = this.f;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.b(6, z);
        }
        int i3 = this.g;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.E(7, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.E(8, i4);
        }
        if (!this.i.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.B(9, this.i);
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
        if (!this.f29353a.equals("")) {
            codedOutputByteBufferNano.E0(1, this.f29353a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.E0(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.H0(3, i);
        }
        long j2 = this.d;
        if (j2 != 0) {
            codedOutputByteBufferNano.J0(4, j2);
        }
        int i2 = this.e;
        if (i2 != 0) {
            codedOutputByteBufferNano.H0(5, i2);
        }
        boolean z = this.f;
        if (z) {
            codedOutputByteBufferNano.R(6, z);
        }
        int i3 = this.g;
        if (i3 != 0) {
            codedOutputByteBufferNano.H0(7, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            codedOutputByteBufferNano.H0(8, i4);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.E0(9, this.i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
