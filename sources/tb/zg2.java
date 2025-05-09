package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class zg2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32741a;

    static {
        t2o.a(628097040);
    }

    public zg2() {
        a();
    }

    public static zg2 c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("a83b07d2", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new zg2(), bArr);
        }
        return (zg2) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(zg2 zg2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$P2p");
        }
    }

    public zg2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zg2) ipChange.ipc$dispatch("f1a65269", new Object[]{this});
        }
        this.f32741a = "";
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public zg2 mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zg2) ipChange.ipc$dispatch("59961413", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                this.f32741a = ly3Var.D();
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
        if (!this.f32741a.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.B(1, this.f32741a);
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
        if (!this.f32741a.equals("")) {
            codedOutputByteBufferNano.E0(1, this.f32741a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
