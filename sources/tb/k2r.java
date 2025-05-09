package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class k2r extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f22367a;
    public int b;
    public int c;
    public a[] d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static volatile a[] c;

        /* renamed from: a  reason: collision with root package name */
        public long f22368a;
        public byte[] b;

        static {
            t2o.a(628097234);
        }

        public a() {
            a();
        }

        public static a[] b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a[]) ipChange.ipc$dispatch("f71efe73", new Object[0]);
            }
            if (c == null) {
                synchronized (hjf.LAZY_INIT_LOCK) {
                    try {
                        if (c == null) {
                            c = new a[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return c;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1282848581) {
                super.writeTo((CodedOutputByteBufferNano) objArr[0]);
                return null;
            } else if (hashCode == 1607980598) {
                return new Integer(super.computeSerializedSize());
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/powermsg/common/protocol/sysData/nano/SysBizV1$PullMsgInfo$PullMsg");
            }
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2945d189", new Object[]{this});
            }
            this.f22368a = 0L;
            this.b = hix.EMPTY_BYTES;
            this.cachedSize = -1;
            return this;
        }

        /* renamed from: c */
        public a mergeFrom(ly3 ly3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4e32631f", new Object[]{this, ly3Var});
            }
            while (true) {
                int E = ly3Var.E();
                if (E == 0) {
                    return this;
                }
                if (E == 8) {
                    this.f22368a = ly3Var.q();
                } else if (E == 18) {
                    this.b = ly3Var.j();
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
            long j = this.f22368a;
            if (j != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.p(1, j);
            }
            if (!Arrays.equals(this.b, hix.EMPTY_BYTES)) {
                return computeSerializedSize + CodedOutputByteBufferNano.c(2, this.b);
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
            long j = this.f22368a;
            if (j != 0) {
                codedOutputByteBufferNano.k0(1, j);
            }
            if (!Arrays.equals(this.b, hix.EMPTY_BYTES)) {
                codedOutputByteBufferNano.T(2, this.b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    static {
        t2o.a(628097233);
    }

    public k2r() {
        a();
    }

    public static k2r c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("47d2a078", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new k2r(), bArr);
        }
        return (k2r) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(k2r k2rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/powermsg/common/protocol/sysData/nano/SysBizV1$PullMsgInfo");
        }
    }

    public k2r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k2r) ipChange.ipc$dispatch("bf30f6c1", new Object[]{this});
        }
        this.f22367a = 0L;
        this.b = 0;
        this.c = 0;
        this.d = a.b();
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public k2r mergeFrom(ly3 ly3Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k2r) ipChange.ipc$dispatch("d77b7e57", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 8) {
                this.f22367a = ly3Var.q();
            } else if (E == 16) {
                this.b = ly3Var.p();
            } else if (E == 24) {
                this.c = ly3Var.p();
            } else if (E == 34) {
                int a2 = hix.a(ly3Var, 34);
                a[] aVarArr = this.d;
                if (aVarArr == null) {
                    i = 0;
                } else {
                    i = aVarArr.length;
                }
                int i2 = a2 + i;
                a[] aVarArr2 = new a[i2];
                if (i != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                }
                while (i < i2 - 1) {
                    a aVar = new a();
                    aVarArr2[i] = aVar;
                    ly3Var.r(aVar);
                    ly3Var.E();
                    i++;
                }
                a aVar2 = new a();
                aVarArr2[i] = aVar2;
                ly3Var.r(aVar2);
                this.d = aVarArr2;
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
        long j = this.f22367a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.p(1, j);
        }
        int i2 = this.b;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(3, i3);
        }
        a[] aVarArr = this.d;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.d;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.r(4, aVar);
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
        long j = this.f22367a;
        if (j != 0) {
            codedOutputByteBufferNano.k0(1, j);
        }
        int i2 = this.b;
        if (i2 != 0) {
            codedOutputByteBufferNano.i0(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            codedOutputByteBufferNano.i0(3, i3);
        }
        a[] aVarArr = this.d;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.d;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.m0(4, aVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
