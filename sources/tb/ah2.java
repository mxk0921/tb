package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ah2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f15735a;
    public int b;
    public int c;
    public long d;
    public String e;

    static {
        t2o.a(628097041);
    }

    public ah2() {
        a();
    }

    public static ah2 c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("ee600aa2", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new ah2(), bArr);
        }
        return (ah2) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(ah2 ah2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$Report");
        }
    }

    public ah2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ah2) ipChange.ipc$dispatch("cafd24ab", new Object[]{this});
        }
        this.f15735a = "";
        this.b = 0;
        this.c = 0;
        this.d = 0L;
        this.e = "";
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public ah2 mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ah2) ipChange.ipc$dispatch("b70ac1", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                this.f15735a = ly3Var.D();
            } else if (E == 16) {
                this.b = ly3Var.p();
            } else if (E == 24) {
                this.c = ly3Var.p();
            } else if (E == 32) {
                this.d = ly3Var.q();
            } else if (E == 42) {
                this.e = ly3Var.D();
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
        if (!this.f15735a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(1, this.f15735a);
        }
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(3, i2);
        }
        long j = this.d;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.p(4, j);
        }
        if (!this.e.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.B(5, this.e);
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
        if (!this.f15735a.equals("")) {
            codedOutputByteBufferNano.E0(1, this.f15735a);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputByteBufferNano.i0(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            codedOutputByteBufferNano.i0(3, i2);
        }
        long j = this.d;
        if (j != 0) {
            codedOutputByteBufferNano.k0(4, j);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.E0(5, this.e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
