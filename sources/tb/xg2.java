package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class xg2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31370a;
    public String b;
    public int c;
    public int d;
    public int e;
    public ch2 f;
    public qg2 g;

    static {
        t2o.a(628097038);
    }

    public xg2() {
        a();
    }

    public static /* synthetic */ Object ipc$super(xg2 xg2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$Monitor");
        }
    }

    public xg2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xg2) ipChange.ipc$dispatch("9a827f7d", new Object[]{this});
        }
        this.f31370a = "";
        this.b = "";
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public xg2 mergeFrom(ly3 ly3Var) {
        MessageNano messageNano;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xg2) ipChange.ipc$dispatch("1c055c27", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                this.f31370a = ly3Var.D();
            } else if (E == 18) {
                this.b = ly3Var.D();
            } else if (E == 24) {
                this.c = ly3Var.F();
            } else if (E == 32) {
                int p = ly3Var.p();
                if (p == 0 || p == 1) {
                    this.d = p;
                }
            } else if (E != 40) {
                if (E == 50) {
                    if (this.f == null) {
                        this.f = new ch2();
                    }
                    messageNano = this.f;
                } else if (E == 58) {
                    if (this.g == null) {
                        this.g = new qg2();
                    }
                    messageNano = this.g;
                } else if (!hix.e(ly3Var, E)) {
                    return this;
                }
                ly3Var.r(messageNano);
            } else {
                int p2 = ly3Var.p();
                if (p2 == 0 || p2 == 1 || p2 == 2) {
                    this.e = p2;
                }
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
        if (!this.f31370a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(1, this.f31370a);
        }
        if (!this.b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.E(3, i);
        }
        int i2 = this.d;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(4, i2);
        }
        int i3 = this.e;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(5, i3);
        }
        ch2 ch2Var = this.f;
        if (ch2Var != null) {
            computeSerializedSize += CodedOutputByteBufferNano.r(6, ch2Var);
        }
        qg2 qg2Var = this.g;
        if (qg2Var != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.r(7, qg2Var);
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
        if (!this.f31370a.equals("")) {
            codedOutputByteBufferNano.E0(1, this.f31370a);
        }
        if (!this.b.equals("")) {
            codedOutputByteBufferNano.E0(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            codedOutputByteBufferNano.H0(3, i);
        }
        int i2 = this.d;
        if (i2 != 0) {
            codedOutputByteBufferNano.i0(4, i2);
        }
        int i3 = this.e;
        if (i3 != 0) {
            codedOutputByteBufferNano.i0(5, i3);
        }
        ch2 ch2Var = this.f;
        if (ch2Var != null) {
            codedOutputByteBufferNano.m0(6, ch2Var);
        }
        qg2 qg2Var = this.g;
        if (qg2Var != null) {
            codedOutputByteBufferNano.m0(7, qg2Var);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
