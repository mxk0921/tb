package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qg2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public tg2[] f26735a;
    public tg2[] b;

    static {
        t2o.a(628097031);
    }

    public qg2() {
        a();
    }

    public static /* synthetic */ Object ipc$super(qg2 qg2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$AckReport");
        }
    }

    public qg2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qg2) ipChange.ipc$dispatch("8b5c1f1a", new Object[]{this});
        }
        this.f26735a = tg2.b();
        this.b = tg2.b();
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public qg2 mergeFrom(ly3 ly3Var) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qg2) ipChange.ipc$dispatch("b79a7944", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                int a2 = hix.a(ly3Var, 10);
                tg2[] tg2VarArr = this.f26735a;
                if (tg2VarArr == null) {
                    i2 = 0;
                } else {
                    i2 = tg2VarArr.length;
                }
                int i3 = a2 + i2;
                tg2[] tg2VarArr2 = new tg2[i3];
                if (i2 != 0) {
                    System.arraycopy(tg2VarArr, 0, tg2VarArr2, 0, i2);
                }
                while (i2 < i3 - 1) {
                    tg2 tg2Var = new tg2();
                    tg2VarArr2[i2] = tg2Var;
                    ly3Var.r(tg2Var);
                    ly3Var.E();
                    i2++;
                }
                tg2 tg2Var2 = new tg2();
                tg2VarArr2[i2] = tg2Var2;
                ly3Var.r(tg2Var2);
                this.f26735a = tg2VarArr2;
            } else if (E == 18) {
                int a3 = hix.a(ly3Var, 18);
                tg2[] tg2VarArr3 = this.b;
                if (tg2VarArr3 == null) {
                    i = 0;
                } else {
                    i = tg2VarArr3.length;
                }
                int i4 = a3 + i;
                tg2[] tg2VarArr4 = new tg2[i4];
                if (i != 0) {
                    System.arraycopy(tg2VarArr3, 0, tg2VarArr4, 0, i);
                }
                while (i < i4 - 1) {
                    tg2 tg2Var3 = new tg2();
                    tg2VarArr4[i] = tg2Var3;
                    ly3Var.r(tg2Var3);
                    ly3Var.E();
                    i++;
                }
                tg2 tg2Var4 = new tg2();
                tg2VarArr4[i] = tg2Var4;
                ly3Var.r(tg2Var4);
                this.b = tg2VarArr4;
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
        tg2[] tg2VarArr = this.f26735a;
        if (tg2VarArr != null && tg2VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                tg2[] tg2VarArr2 = this.f26735a;
                if (i2 >= tg2VarArr2.length) {
                    break;
                }
                tg2 tg2Var = tg2VarArr2[i2];
                if (tg2Var != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.r(1, tg2Var);
                }
                i2++;
            }
        }
        tg2[] tg2VarArr3 = this.b;
        if (tg2VarArr3 != null && tg2VarArr3.length > 0) {
            while (true) {
                tg2[] tg2VarArr4 = this.b;
                if (i >= tg2VarArr4.length) {
                    break;
                }
                tg2 tg2Var2 = tg2VarArr4[i];
                if (tg2Var2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.r(2, tg2Var2);
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
        tg2[] tg2VarArr = this.f26735a;
        if (tg2VarArr != null && tg2VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                tg2[] tg2VarArr2 = this.f26735a;
                if (i2 >= tg2VarArr2.length) {
                    break;
                }
                tg2 tg2Var = tg2VarArr2[i2];
                if (tg2Var != null) {
                    codedOutputByteBufferNano.m0(1, tg2Var);
                }
                i2++;
            }
        }
        tg2[] tg2VarArr3 = this.b;
        if (tg2VarArr3 != null && tg2VarArr3.length > 0) {
            while (true) {
                tg2[] tg2VarArr4 = this.b;
                if (i >= tg2VarArr4.length) {
                    break;
                }
                tg2 tg2Var2 = tg2VarArr4[i];
                if (tg2Var2 != null) {
                    codedOutputByteBufferNano.m0(2, tg2Var2);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
