package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import tb.d3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sg2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Double> f28030a;

    static {
        t2o.a(628097033);
    }

    public sg2() {
        a();
    }

    public static sg2 c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("72c80891", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new sg2(), bArr);
        }
        return (sg2) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(sg2 sg2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$Count");
        }
    }

    public sg2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sg2) ipChange.ipc$dispatch("e8b0968", new Object[]{this});
        }
        this.f28030a = null;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public sg2 mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sg2) ipChange.ipc$dispatch("39910892", new Object[]{this, ly3Var});
        }
        d3i.c cVar = d3i.f17549a;
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                this.f28030a = hjf.b(ly3Var, this.f28030a, cVar, 9, 1, null, 10, 17);
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
        Map<String, Double> map = this.f28030a;
        if (map != null) {
            return computeSerializedSize + hjf.a(map, 1, 9, 1);
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
        Map<String, Double> map = this.f28030a;
        if (map != null) {
            hjf.d(codedOutputByteBufferNano, map, 1, 9, 1);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
