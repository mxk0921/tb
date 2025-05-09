package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import tb.d3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class dva extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18091a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public String i;
    public int j;
    public a k;
    public int l;
    public Map<String, String> m;
    public Map<String, String> n;
    public long o;
    public String p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends MessageNano {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f18092a;
        public int b;

        static {
            t2o.a(628097048);
        }

        public a() {
            a();
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/header/nano/HeaderV1$Header$Config");
            }
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fb79e5c8", new Object[]{this});
            }
            this.f18092a = 0;
            this.b = 0;
            this.cachedSize = -1;
            return this;
        }

        /* renamed from: b */
        public a mergeFrom(ly3 ly3Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6bf875f2", new Object[]{this, ly3Var});
            }
            while (true) {
                int E = ly3Var.E();
                if (E == 0) {
                    return this;
                }
                if (E == 8) {
                    this.f18092a = ly3Var.p();
                } else if (E == 16) {
                    this.b = ly3Var.p();
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
            int i = this.f18092a;
            if (i != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.n(1, i);
            }
            int i2 = this.b;
            if (i2 != 0) {
                return computeSerializedSize + CodedOutputByteBufferNano.n(2, i2);
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
            int i = this.f18092a;
            if (i != 0) {
                codedOutputByteBufferNano.i0(1, i);
            }
            int i2 = this.b;
            if (i2 != 0) {
                codedOutputByteBufferNano.i0(2, i2);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    static {
        t2o.a(628097047);
    }

    public dva() {
        a();
    }

    public static dva c(byte[] bArr) {
        Object mergeFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mergeFrom = ipChange.ipc$dispatch("55b280bf", new Object[]{bArr});
        } else {
            mergeFrom = MessageNano.mergeFrom(new dva(), bArr);
        }
        return (dva) mergeFrom;
    }

    public static /* synthetic */ Object ipc$super(dva dvaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/header/nano/HeaderV1$Header");
        }
    }

    public dva a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dva) ipChange.ipc$dispatch("ab16e48", new Object[]{this});
        }
        this.f18091a = "";
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = 0;
        this.h = "";
        this.i = "";
        this.j = 0;
        this.k = null;
        this.l = 0;
        this.m = null;
        this.n = null;
        this.o = 0L;
        this.p = "";
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: b */
    public dva mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            d3i.c cVar = d3i.f17549a;
            while (true) {
                int E = ly3Var.E();
                switch (E) {
                    case 0:
                        return this;
                    case 10:
                        this.f18091a = ly3Var.D();
                        break;
                    case 16:
                        this.b = ly3Var.p();
                        break;
                    case 24:
                        this.c = ly3Var.p();
                        break;
                    case 34:
                        this.d = ly3Var.D();
                        break;
                    case 42:
                        this.e = ly3Var.D();
                        break;
                    case 50:
                        this.f = ly3Var.D();
                        break;
                    case 56:
                        this.g = ly3Var.p();
                        break;
                    case 66:
                        this.h = ly3Var.D();
                        break;
                    case 74:
                        this.i = ly3Var.D();
                        break;
                    case 80:
                        this.j = ly3Var.p();
                        break;
                    case 90:
                        if (this.k == null) {
                            this.k = new a();
                        }
                        ly3Var.r(this.k);
                        break;
                    case 96:
                        this.l = ly3Var.p();
                        break;
                    case 106:
                        this.m = hjf.b(ly3Var, this.m, cVar, 9, 9, null, 10, 18);
                        break;
                    case 114:
                        this.n = hjf.b(ly3Var, this.n, cVar, 9, 9, null, 10, 18);
                        break;
                    case 120:
                        this.o = ly3Var.q();
                        break;
                    case 130:
                        this.p = ly3Var.D();
                        break;
                    default:
                        if (hix.e(ly3Var, E)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        } else {
            return (dva) ipChange.ipc$dispatch("663e595e", new Object[]{this, ly3Var});
        }
    }

    @Override // com.google.protobuf.nano.MessageNano
    public int computeSerializedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fd7d636", new Object[]{this})).intValue();
        }
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f18091a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(1, this.f18091a);
        }
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(3, i2);
        }
        if (!this.d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(4, this.d);
        }
        if (!this.e.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(5, this.e);
        }
        if (!this.f.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(6, this.f);
        }
        int i3 = this.g;
        if (i3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(7, i3);
        }
        if (!this.h.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(8, this.h);
        }
        if (!this.i.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(9, this.i);
        }
        int i4 = this.j;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(10, i4);
        }
        a aVar = this.k;
        if (aVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.r(11, aVar);
        }
        int i5 = this.l;
        if (i5 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(12, i5);
        }
        Map<String, String> map = this.m;
        if (map != null) {
            computeSerializedSize += hjf.a(map, 13, 9, 9);
        }
        Map<String, String> map2 = this.n;
        if (map2 != null) {
            computeSerializedSize += hjf.a(map2, 14, 9, 9);
        }
        long j = this.o;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.p(15, j);
        }
        if (!this.p.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.B(16, this.p);
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
        if (!this.f18091a.equals("")) {
            codedOutputByteBufferNano.E0(1, this.f18091a);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputByteBufferNano.i0(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            codedOutputByteBufferNano.i0(3, i2);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.E0(4, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.E0(5, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.E0(6, this.f);
        }
        int i3 = this.g;
        if (i3 != 0) {
            codedOutputByteBufferNano.i0(7, i3);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.E0(8, this.h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.E0(9, this.i);
        }
        int i4 = this.j;
        if (i4 != 0) {
            codedOutputByteBufferNano.i0(10, i4);
        }
        a aVar = this.k;
        if (aVar != null) {
            codedOutputByteBufferNano.m0(11, aVar);
        }
        int i5 = this.l;
        if (i5 != 0) {
            codedOutputByteBufferNano.i0(12, i5);
        }
        Map<String, String> map = this.m;
        if (map != null) {
            hjf.d(codedOutputByteBufferNano, map, 13, 9, 9);
        }
        Map<String, String> map2 = this.n;
        if (map2 != null) {
            hjf.d(codedOutputByteBufferNano, map2, 14, 9, 9);
        }
        long j = this.o;
        if (j != 0) {
            codedOutputByteBufferNano.k0(15, j);
        }
        if (!this.p.equals("")) {
            codedOutputByteBufferNano.E0(16, this.p);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
