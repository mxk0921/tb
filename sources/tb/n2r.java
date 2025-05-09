package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class n2r extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a[] f24471a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static volatile a[] d;

        /* renamed from: a  reason: collision with root package name */
        public String f24472a;
        public String b;
        public long c;

        static {
            t2o.a(628097238);
        }

        public a() {
            a();
        }

        public static a[] b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a[]) ipChange.ipc$dispatch("f8d9edec", new Object[0]);
            }
            if (d == null) {
                synchronized (hjf.LAZY_INIT_LOCK) {
                    try {
                        if (d == null) {
                            d = new a[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return d;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/powermsg/common/protocol/sysData/nano/SysBizV1$TopicUser$User");
            }
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("beb50516", new Object[]{this});
            }
            this.f24472a = "";
            this.b = "";
            this.c = 0L;
            this.cachedSize = -1;
            return this;
        }

        /* renamed from: c */
        public a mergeFrom(ly3 ly3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("87cd4dc0", new Object[]{this, ly3Var});
            }
            while (true) {
                int E = ly3Var.E();
                if (E == 0) {
                    return this;
                }
                if (E == 10) {
                    this.f24472a = ly3Var.D();
                } else if (E == 18) {
                    this.b = ly3Var.D();
                } else if (E == 24) {
                    this.c = ly3Var.q();
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
            if (!this.f24472a.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.B(1, this.f24472a);
            }
            if (!this.b.equals("")) {
                computeSerializedSize += CodedOutputByteBufferNano.B(2, this.b);
            }
            long j = this.c;
            if (j != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.p(3, j);
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
            if (!this.f24472a.equals("")) {
                codedOutputByteBufferNano.E0(1, this.f24472a);
            }
            if (!this.b.equals("")) {
                codedOutputByteBufferNano.E0(2, this.b);
            }
            long j = this.c;
            if (j != 0) {
                codedOutputByteBufferNano.k0(3, j);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    static {
        t2o.a(628097237);
    }

    public n2r() {
        a();
    }

    public static n2r c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("2cf7bc68", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new n2r(), bArr);
        }
        return (n2r) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(n2r n2rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/powermsg/common/protocol/sysData/nano/SysBizV1$TopicUser");
        }
    }

    public n2r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n2r) ipChange.ipc$dispatch("b75910f1", new Object[]{this});
        }
        this.f24471a = a.b();
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public n2r mergeFrom(ly3 ly3Var) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n2r) ipChange.ipc$dispatch("56ac8607", new Object[]{this, ly3Var});
        }
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                int a2 = hix.a(ly3Var, 10);
                a[] aVarArr = this.f24471a;
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
                this.f24471a = aVarArr2;
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
        a[] aVarArr = this.f24471a;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f24471a;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.r(1, aVar);
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
        a[] aVarArr = this.f24471a;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f24471a;
                if (i >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i];
                if (aVar != null) {
                    codedOutputByteBufferNano.m0(1, aVar);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
