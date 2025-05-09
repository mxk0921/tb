package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import tb.d3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class j2r extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f21727a;
    public int b;
    public Map<String, String> c;
    public long d;

    static {
        t2o.a(628097232);
    }

    public j2r() {
        a();
    }

    public static j2r c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("702293e1", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new j2r(), bArr);
        }
        return (j2r) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(j2r j2rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/powermsg/common/protocol/sysData/nano/SysBizV1$JoinNotify");
        }
    }

    public j2r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2r) ipChange.ipc$dispatch("31ebd078", new Object[]{this});
        }
        this.f21727a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0L;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public j2r mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2r) ipChange.ipc$dispatch("7d06fe22", new Object[]{this, ly3Var});
        }
        d3i.c cVar = d3i.f17549a;
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 8) {
                this.f21727a = ly3Var.p();
            } else if (E == 16) {
                this.b = ly3Var.p();
            } else if (E == 26) {
                this.c = hjf.b(ly3Var, this.c, cVar, 9, 9, null, 10, 18);
            } else if (E == 32) {
                this.d = ly3Var.q();
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
        int i = this.f21727a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(2, i2);
        }
        Map<String, String> map = this.c;
        if (map != null) {
            computeSerializedSize += hjf.a(map, 3, 9, 9);
        }
        long j = this.d;
        if (j != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.p(4, j);
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
        int i = this.f21727a;
        if (i != 0) {
            codedOutputByteBufferNano.i0(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.i0(2, i2);
        }
        Map<String, String> map = this.c;
        if (map != null) {
            hjf.d(codedOutputByteBufferNano, map, 3, 9, 9);
        }
        long j = this.d;
        if (j != 0) {
            codedOutputByteBufferNano.k0(4, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
