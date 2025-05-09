package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class dh2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17810a;
    public int b;
    public String c;
    public int d;
    public String e;
    public long f;
    public String g;
    public String h;
    public String i;

    static {
        t2o.a(628097044);
    }

    public dh2() {
        a();
    }

    public static dh2 c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("3eafb936", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new dh2(), bArr);
        }
        return (dh2) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(dh2 dh2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$Subscribe");
        }
    }

    public dh2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh2) ipChange.ipc$dispatch("4cc8768d", new Object[]{this});
        }
        this.f17810a = "";
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = "";
        this.f = 0L;
        this.g = "";
        this.h = "";
        this.i = "";
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public dh2 mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dh2) ipChange.ipc$dispatch("7906d0b7", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                this.f17810a = ly3Var.D();
            } else if (E == 16) {
                this.b = ly3Var.p();
            } else if (E == 26) {
                this.c = ly3Var.D();
            } else if (E == 32) {
                this.d = ly3Var.p();
            } else if (E == 42) {
                this.e = ly3Var.D();
            } else if (E == 48) {
                this.f = ly3Var.q();
            } else if (E == 58) {
                this.g = ly3Var.D();
            } else if (E == 66) {
                this.h = ly3Var.D();
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
        if (!this.f17810a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(1, this.f17810a);
        }
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(2, i);
        }
        if (!this.c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(3, this.c);
        }
        int i2 = this.d;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(4, i2);
        }
        if (!this.e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(5, this.e);
        }
        long j = this.f;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.p(6, j);
        }
        if (!this.g.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(7, this.g);
        }
        if (!this.h.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(8, this.h);
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
        if (!this.f17810a.equals("")) {
            codedOutputByteBufferNano.E0(1, this.f17810a);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputByteBufferNano.i0(2, i);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.E0(3, this.c);
        }
        int i2 = this.d;
        if (i2 != 0) {
            codedOutputByteBufferNano.i0(4, i2);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.E0(5, this.e);
        }
        long j = this.f;
        if (j != 0) {
            codedOutputByteBufferNano.k0(6, j);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.E0(7, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.E0(8, this.h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.E0(9, this.i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
