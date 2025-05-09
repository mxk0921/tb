package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import tb.d3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class rg2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f27352a;
    public int b;
    public int c;
    public int d;
    public Map<String, String> e;

    static {
        t2o.a(628097032);
    }

    public rg2() {
        a();
    }

    public static rg2 c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("d32b7495", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new rg2(), bArr);
        }
        return (rg2) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(rg2 rg2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$Command");
        }
    }

    public rg2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg2) ipChange.ipc$dispatch("8a319bac", new Object[]{this});
        }
        this.f27352a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public rg2 mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rg2) ipChange.ipc$dispatch("bb47856", new Object[]{this, ly3Var});
        }
        d3i.c cVar = d3i.f17549a;
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 16) {
                this.f27352a = ly3Var.p();
            } else if (E == 24) {
                this.b = ly3Var.p();
            } else if (E == 32) {
                this.c = ly3Var.p();
            } else if (E == 40) {
                this.d = ly3Var.p();
            } else if (E == 50) {
                this.e = hjf.b(ly3Var, this.e, cVar, 9, 9, null, 10, 18);
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
        int i = this.f27352a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(2, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(3, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(4, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(5, i4);
        }
        Map<String, String> map = this.e;
        if (map != null) {
            return computeSerializedSize + hjf.a(map, 6, 9, 9);
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
        int i = this.f27352a;
        if (i != 0) {
            codedOutputByteBufferNano.i0(2, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.i0(3, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            codedOutputByteBufferNano.i0(4, i3);
        }
        int i4 = this.d;
        if (i4 != 0) {
            codedOutputByteBufferNano.i0(5, i4);
        }
        Map<String, String> map = this.e;
        if (map != null) {
            hjf.d(codedOutputByteBufferNano, map, 6, 9, 9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
