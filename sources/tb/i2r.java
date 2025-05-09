package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import tb.d3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class i2r extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Long> f21061a;

    static {
        t2o.a(628097231);
    }

    public i2r() {
        a();
    }

    public static i2r c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("20534805", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new i2r(), bArr);
        }
        return (i2r) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(i2r i2rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/powermsg/common/protocol/sysData/nano/SysBizV1$CountInfo");
        }
    }

    public i2r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2r) ipChange.ipc$dispatch("aab49c8e", new Object[]{this});
        }
        this.f21061a = null;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public i2r mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i2r) ipChange.ipc$dispatch("4a0811a4", new Object[]{this, ly3Var});
        }
        d3i.c cVar = d3i.f17549a;
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                this.f21061a = hjf.b(ly3Var, this.f21061a, cVar, 9, 3, null, 10, 16);
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
        Map<String, Long> map = this.f21061a;
        if (map != null) {
            return computeSerializedSize + hjf.a(map, 1, 9, 3);
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
        Map<String, Long> map = this.f21061a;
        if (map != null) {
            hjf.d(codedOutputByteBufferNano, map, 1, 9, 3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
