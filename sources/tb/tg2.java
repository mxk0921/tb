package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class tg2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile tg2[] c;

    /* renamed from: a  reason: collision with root package name */
    public eh2 f28699a;
    public ug2[] b;

    static {
        t2o.a(628097034);
    }

    public tg2() {
        a();
    }

    public static tg2[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg2[]) ipChange.ipc$dispatch("3b49bf70", new Object[0]);
        }
        if (c == null) {
            synchronized (hjf.LAZY_INIT_LOCK) {
                try {
                    if (c == null) {
                        c = new tg2[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static /* synthetic */ Object ipc$super(tg2 tg2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$MessageAckGroup");
        }
    }

    public tg2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg2) ipChange.ipc$dispatch("295ba09a", new Object[]{this});
        }
        this.f28699a = null;
        this.b = ug2.b();
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: c */
    public tg2 mergeFrom(ly3 ly3Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tg2) ipChange.ipc$dispatch("4db43344", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                if (this.f28699a == null) {
                    this.f28699a = new eh2();
                }
                ly3Var.r(this.f28699a);
            } else if (E == 18) {
                int a2 = hix.a(ly3Var, 18);
                ug2[] ug2VarArr = this.b;
                if (ug2VarArr == null) {
                    i = 0;
                } else {
                    i = ug2VarArr.length;
                }
                int i2 = a2 + i;
                ug2[] ug2VarArr2 = new ug2[i2];
                if (i != 0) {
                    System.arraycopy(ug2VarArr, 0, ug2VarArr2, 0, i);
                }
                while (i < i2 - 1) {
                    ug2 ug2Var = new ug2();
                    ug2VarArr2[i] = ug2Var;
                    ly3Var.r(ug2Var);
                    ly3Var.E();
                    i++;
                }
                ug2 ug2Var2 = new ug2();
                ug2VarArr2[i] = ug2Var2;
                ly3Var.r(ug2Var2);
                this.b = ug2VarArr2;
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
        eh2 eh2Var = this.f28699a;
        if (eh2Var != null) {
            computeSerializedSize += CodedOutputByteBufferNano.r(1, eh2Var);
        }
        ug2[] ug2VarArr = this.b;
        if (ug2VarArr != null && ug2VarArr.length > 0) {
            while (true) {
                ug2[] ug2VarArr2 = this.b;
                if (i >= ug2VarArr2.length) {
                    break;
                }
                ug2 ug2Var = ug2VarArr2[i];
                if (ug2Var != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.r(2, ug2Var);
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
        eh2 eh2Var = this.f28699a;
        if (eh2Var != null) {
            codedOutputByteBufferNano.m0(1, eh2Var);
        }
        ug2[] ug2VarArr = this.b;
        if (ug2VarArr != null && ug2VarArr.length > 0) {
            while (true) {
                ug2[] ug2VarArr2 = this.b;
                if (i >= ug2VarArr2.length) {
                    break;
                }
                ug2 ug2Var = ug2VarArr2[i];
                if (ug2Var != null) {
                    codedOutputByteBufferNano.m0(2, ug2Var);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
