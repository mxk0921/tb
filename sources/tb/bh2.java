package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class bh2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f16382a;
    public int b;
    public int c;
    public String d;

    static {
        t2o.a(628097042);
    }

    public bh2() {
        a();
    }

    public static bh2 c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("dfa4c9d1", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new bh2(), bArr);
        }
        return (bh2) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(bh2 bh2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$Request");
        }
    }

    public bh2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bh2) ipChange.ipc$dispatch("96aaf0e8", new Object[]{this});
        }
        this.f16382a = 0L;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public bh2 mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bh2) ipChange.ipc$dispatch("182dcd92", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 8) {
                this.f16382a = ly3Var.q();
            } else if (E == 16) {
                this.b = ly3Var.p();
            } else if (E == 24) {
                this.c = ly3Var.p();
            } else if (E == 34) {
                this.d = ly3Var.D();
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
        long j = this.f16382a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.p(1, j);
        }
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(3, i2);
        }
        if (!this.d.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.B(4, this.d);
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
        long j = this.f16382a;
        if (j != 0) {
            codedOutputByteBufferNano.k0(1, j);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputByteBufferNano.i0(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            codedOutputByteBufferNano.i0(3, i2);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.E0(4, this.d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
