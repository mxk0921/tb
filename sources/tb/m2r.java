package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class m2r extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f23744a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        t2o.a(628097236);
    }

    public m2r() {
        a();
    }

    public static m2r c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("2cdbf2ff", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new m2r(), bArr);
        }
        return (m2r) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(m2r m2rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/powermsg/common/protocol/sysData/nano/SysBizV1$TopicStat");
        }
    }

    public m2r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2r) ipChange.ipc$dispatch("b73d4788", new Object[]{this});
        }
        this.f23744a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public m2r mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2r) ipChange.ipc$dispatch("5690bc9e", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 8) {
                this.f23744a = ly3Var.p();
            } else if (E == 16) {
                this.b = ly3Var.p();
            } else if (E == 24) {
                this.c = ly3Var.p();
            } else if (E == 32) {
                this.d = ly3Var.p();
            } else if (E == 40) {
                this.e = ly3Var.p();
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
        int i = this.f23744a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(3, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(4, i4);
        }
        int i5 = this.e;
        if (i5 != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.n(5, i5);
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
        int i = this.f23744a;
        if (i != 0) {
            codedOutputByteBufferNano.i0(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.i0(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            codedOutputByteBufferNano.i0(3, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            codedOutputByteBufferNano.i0(4, i4);
        }
        int i5 = this.e;
        if (i5 != 0) {
            codedOutputByteBufferNano.i0(5, i5);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
