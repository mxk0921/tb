package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import tb.d3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class l2r extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23072a;
    public Map<String, String> b;

    static {
        t2o.a(628097235);
    }

    public l2r() {
        a();
    }

    public static l2r c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("600fae28", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new l2r(), bArr);
        }
        return (l2r) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(l2r l2rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/powermsg/common/protocol/sysData/nano/SysBizV1$TextMessage");
        }
    }

    public l2r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l2r) ipChange.ipc$dispatch("d76e0471", new Object[]{this});
        }
        this.f23072a = "";
        this.b = null;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public l2r mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l2r) ipChange.ipc$dispatch("efb88c07", new Object[]{this, ly3Var});
        }
        d3i.c cVar = d3i.f17549a;
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                this.f23072a = ly3Var.D();
            } else if (E == 18) {
                this.b = hjf.b(ly3Var, this.b, cVar, 9, 9, null, 10, 18);
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
        if (!this.f23072a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(1, this.f23072a);
        }
        Map<String, String> map = this.b;
        if (map != null) {
            return computeSerializedSize + hjf.a(map, 2, 9, 9);
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
        if (!this.f23072a.equals("")) {
            codedOutputByteBufferNano.E0(1, this.f23072a);
        }
        Map<String, String> map = this.b;
        if (map != null) {
            hjf.d(codedOutputByteBufferNano, map, 2, 9, 9);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
