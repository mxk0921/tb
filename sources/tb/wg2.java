package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import java.util.Arrays;
import java.util.Map;
import tb.d3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wg2 extends MessageNano {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile wg2[] g;

    /* renamed from: a  reason: collision with root package name */
    public String f30675a;
    public int b;
    public byte[] c;
    public Map<String, String> d;
    public Map<String, String> e;
    public long f;

    static {
        t2o.a(628097037);
    }

    public wg2() {
        a();
    }

    public static wg2[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wg2[]) ipChange.ipc$dispatch("813efb7", new Object[0]);
        }
        if (g == null) {
            synchronized (hjf.LAZY_INIT_LOCK) {
                try {
                    if (g == null) {
                        g = new wg2[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public static /* synthetic */ Object ipc$super(wg2 wg2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1282848581) {
            super.writeTo((CodedOutputByteBufferNano) objArr[0]);
            return null;
        } else if (hashCode == 1607980598) {
            return new Integer(super.computeSerializedSize());
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/powermsg/common/protocol/body/nano/BodyV1$MessageFrameElement");
        }
    }

    public wg2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wg2) ipChange.ipc$dispatch("ea9d2be1", new Object[]{this});
        }
        this.f30675a = "";
        this.b = 0;
        this.c = hix.EMPTY_BYTES;
        this.d = null;
        this.e = null;
        this.f = 0L;
        this.cachedSize = -1;
        return this;
    }

    /* renamed from: c */
    public wg2 mergeFrom(ly3 ly3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wg2) ipChange.ipc$dispatch("35b8598b", new Object[]{this, ly3Var});
        }
        d3i.c cVar = d3i.f17549a;
        while (true) {
            int E = ly3Var.E();
            if (E == 0) {
                return this;
            }
            if (E == 10) {
                this.f30675a = ly3Var.D();
            } else if (E == 16) {
                this.b = ly3Var.p();
            } else if (E == 26) {
                this.c = ly3Var.j();
            } else if (E == 34) {
                this.d = hjf.b(ly3Var, this.d, cVar, 9, 9, null, 10, 18);
            } else if (E == 42) {
                this.e = hjf.b(ly3Var, this.e, cVar, 9, 9, null, 10, 18);
            } else if (E == 48) {
                this.f = ly3Var.q();
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
        if (!this.f30675a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.B(1, this.f30675a);
        }
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.n(2, i);
        }
        if (!Arrays.equals(this.c, hix.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.c(3, this.c);
        }
        Map<String, String> map = this.d;
        if (map != null) {
            computeSerializedSize += hjf.a(map, 4, 9, 9);
        }
        Map<String, String> map2 = this.e;
        if (map2 != null) {
            computeSerializedSize += hjf.a(map2, 5, 9, 9);
        }
        long j = this.f;
        if (j != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.p(6, j);
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
        if (!this.f30675a.equals("")) {
            codedOutputByteBufferNano.E0(1, this.f30675a);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputByteBufferNano.i0(2, i);
        }
        if (!Arrays.equals(this.c, hix.EMPTY_BYTES)) {
            codedOutputByteBufferNano.T(3, this.c);
        }
        Map<String, String> map = this.d;
        if (map != null) {
            hjf.d(codedOutputByteBufferNano, map, 4, 9, 9);
        }
        Map<String, String> map2 = this.e;
        if (map2 != null) {
            hjf.d(codedOutputByteBufferNano, map2, 5, 9, 9);
        }
        long j = this.f;
        if (j != 0) {
            codedOutputByteBufferNano.k0(6, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
