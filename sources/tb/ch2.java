package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ch2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public eh2[] f17056a;

    static {
        t2o.a(628097043);
    }

    public ch2() {
        a();
    }

    public static /* synthetic */ Object ipc$super(ch2 ch2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$StatusReport");
        }
    }

    public ch2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ch2) ipChange.ipc$dispatch("c5a38d59", new Object[]{this});
        }
        this.f17056a = eh2.b();
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public ch2 mergeFrom(ly3 ly3Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ch2) ipChange.ipc$dispatch("71a20aef", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 26) {
                int a2 = hix.a(ly3Var, 26);
                eh2[] eh2VarArr = this.f17056a;
                if (eh2VarArr == null) {
                    i = 0;
                } else {
                    i = eh2VarArr.length;
                }
                int i2 = a2 + i;
                eh2[] eh2VarArr2 = new eh2[i2];
                if (i != 0) {
                    System.arraycopy(eh2VarArr, 0, eh2VarArr2, 0, i);
                }
                while (i < i2 - 1) {
                    eh2 eh2Var = new eh2();
                    eh2VarArr2[i] = eh2Var;
                    ly3Var.r(eh2Var);
                    ly3Var.E();
                    i++;
                }
                eh2 eh2Var2 = new eh2();
                eh2VarArr2[i] = eh2Var2;
                ly3Var.r(eh2Var2);
                this.f17056a = eh2VarArr2;
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
        eh2[] eh2VarArr = this.f17056a;
        if (eh2VarArr != null && eh2VarArr.length > 0) {
            while (true) {
                eh2[] eh2VarArr2 = this.f17056a;
                if (i >= eh2VarArr2.length) {
                    break;
                }
                eh2 eh2Var = eh2VarArr2[i];
                if (eh2Var != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.r(3, eh2Var);
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
        eh2[] eh2VarArr = this.f17056a;
        if (eh2VarArr != null && eh2VarArr.length > 0) {
            while (true) {
                eh2[] eh2VarArr2 = this.f17056a;
                if (i >= eh2VarArr2.length) {
                    break;
                }
                eh2 eh2Var = eh2VarArr2[i];
                if (eh2Var != null) {
                    codedOutputByteBufferNano.m0(3, eh2Var);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
