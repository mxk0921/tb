package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yg2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32068a;
    public String b;
    public long c;
    public boolean d;
    public String[] e;

    static {
        t2o.a(628097039);
    }

    public yg2() {
        a();
    }

    public static yg2 c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("a83a9d9f", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new yg2(), bArr);
        }
        return (yg2) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(yg2 yg2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$Msg");
        }
    }

    public yg2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yg2) ipChange.ipc$dispatch("f1a5e836", new Object[]{this});
        }
        this.f32068a = "";
        this.b = "";
        this.c = 0L;
        this.d = false;
        this.e = hix.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public yg2 mergeFrom(ly3 ly3Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yg2) ipChange.ipc$dispatch("5995a9e0", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 18) {
                this.f32068a = ly3Var.D();
            } else if (E == 26) {
                this.b = ly3Var.D();
            } else if (E == 32) {
                this.c = ly3Var.q();
            } else if (E == 40) {
                this.d = ly3Var.i();
            } else if (E == 50) {
                int a2 = hix.a(ly3Var, 50);
                String[] strArr = this.e;
                if (strArr == null) {
                    i = 0;
                } else {
                    i = strArr.length;
                }
                int i2 = a2 + i;
                String[] strArr2 = new String[i2];
                if (i != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, i);
                }
                while (i < i2 - 1) {
                    strArr2[i] = ly3Var.D();
                    ly3Var.E();
                    i++;
                }
                strArr2[i] = ly3Var.D();
                this.e = strArr2;
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
        if (!this.f32068a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(2, this.f32068a);
        }
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(3, this.b);
        }
        long j = this.c;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.p(4, j);
        }
        boolean z = this.d;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.b(5, z);
        }
        String[] strArr = this.e;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.e;
            if (i >= strArr2.length) {
                return computeSerializedSize + i2 + i3;
            }
            String str = strArr2[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.C(str);
            }
            i++;
        }
    }

    @Override // com.google.protobuf.nano.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38948bb", new Object[]{this, codedOutputByteBufferNano});
            return;
        }
        if (!this.f32068a.equals("")) {
            codedOutputByteBufferNano.E0(2, this.f32068a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.E0(3, this.b);
        }
        long j = this.c;
        if (j != 0) {
            codedOutputByteBufferNano.k0(4, j);
        }
        boolean z = this.d;
        if (z) {
            codedOutputByteBufferNano.R(5, z);
        }
        String[] strArr = this.e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.e;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.E0(6, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
