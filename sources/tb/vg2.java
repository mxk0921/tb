package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class vg2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public wg2[] f29998a;

    static {
        t2o.a(628097036);
    }

    public vg2() {
        a();
    }

    public static vg2 c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("12594830", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new vg2(), bArr);
        }
        return (vg2) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(vg2 vg2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$MessageFrame");
        }
    }

    public vg2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vg2) ipChange.ipc$dispatch("8352f779", new Object[]{this});
        }
        this.f29998a = wg2.b();
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public vg2 mergeFrom(ly3 ly3Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vg2) ipChange.ipc$dispatch("2f51750f", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                int a2 = hix.a(ly3Var, 10);
                wg2[] wg2VarArr = this.f29998a;
                if (wg2VarArr == null) {
                    i = 0;
                } else {
                    i = wg2VarArr.length;
                }
                int i2 = a2 + i;
                wg2[] wg2VarArr2 = new wg2[i2];
                if (i != 0) {
                    System.arraycopy(wg2VarArr, 0, wg2VarArr2, 0, i);
                }
                while (i < i2 - 1) {
                    wg2 wg2Var = new wg2();
                    wg2VarArr2[i] = wg2Var;
                    ly3Var.r(wg2Var);
                    ly3Var.E();
                    i++;
                }
                wg2 wg2Var2 = new wg2();
                wg2VarArr2[i] = wg2Var2;
                ly3Var.r(wg2Var2);
                this.f29998a = wg2VarArr2;
            } else if (!hix.e(ly3Var, E)) {
                return this;
            }
        }
    }

    @Override // com.google.protobuf.nano.MessageNano
    public int computeSerializedSize() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
        }
        int computeSerializedSize = super.computeSerializedSize();
        wg2[] wg2VarArr = this.f29998a;
        if (wg2VarArr != null && wg2VarArr.length > 0) {
            while (true) {
                wg2[] wg2VarArr2 = this.f29998a;
                if (i >= wg2VarArr2.length) {
                    break;
                }
                wg2 wg2Var = wg2VarArr2[i];
                if (wg2Var != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.r(1, wg2Var);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // com.google.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
            return;
        }
        wg2[] wg2VarArr = this.f29998a;
        if (wg2VarArr != null && wg2VarArr.length > 0) {
            while (true) {
                wg2[] wg2VarArr2 = this.f29998a;
                if (i >= wg2VarArr2.length) {
                    break;
                }
                wg2 wg2Var = wg2VarArr2[i];
                if (wg2Var != null) {
                    codedOutputByteBufferNano.m0(1, wg2Var);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
