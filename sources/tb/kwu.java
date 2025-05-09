package tb;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.loc.at;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 `2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001>B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u001b\u0010\u0014J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u001c\u0010\u0016J\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001d\u0010\u0018J\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0014J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b \u0010\u0016J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b!\u0010\u0018J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\"\u0010\u001aJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b#\u0010\u0014J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b$\u0010\u0016J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b%\u0010\u0018J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b&\u0010\u001aJ\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b'\u0010\u0014J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b(\u0010\u0016J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b)\u0010\u0018J\u0018\u0010*\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b*\u0010\u001aJ\u0018\u0010+\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b+\u0010\u0014J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b,\u0010\u0016J\u0018\u0010-\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b-\u0010\u0018J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b.\u0010\u001aJ\u0018\u0010/\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b3\u0010\u0010J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b4\u0010\u001aJ\u0010\u00105\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b5\u0010\u0005J\u0010\u00106\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b6\u0010\u0005J\u0018\u00108\u001a\u0002072\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u0002072\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b:\u00109J\u0018\u0010<\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\bH\u0087\f¢\u0006\u0004\b<\u0010\u0018J\u0018\u0010=\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\bH\u0087\f¢\u0006\u0004\b=\u0010\u0018J\u0018\u0010>\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b>\u0010\u001aJ\u0018\u0010?\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b?\u0010\u001aJ\u0018\u0010@\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b@\u0010\u001aJ\u0010\u0010A\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bA\u0010\u0005J\u0010\u0010C\u001a\u00020BH\u0087\b¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020EH\u0087\b¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\bH\u0087\b¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\bJ\u0010\u0005J\u0010\u0010K\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\bK\u0010DJ\u0010\u0010L\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\bL\u0010GJ\u0010\u0010M\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\bM\u0010IJ\u0010\u0010N\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bN\u0010\u0005J\u0010\u0010P\u001a\u00020OH\u0087\b¢\u0006\u0004\bP\u0010QJ\u0010\u0010S\u001a\u00020RH\u0087\b¢\u0006\u0004\bS\u0010TJ\u000f\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bX\u0010YJ\u001a\u0010\\\u001a\u00020[2\b\u0010\u0007\u001a\u0004\u0018\u00010ZHÖ\u0003¢\u0006\u0004\b\\\u0010]R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b>\u00104\u0012\u0004\b^\u0010_\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006a"}, d2 = {"Ltb/kwu;", "", "", "data", bmv.MSGTYPE_INTERVAL, "(J)J", "Ltb/tru;", "other", "", "d", "(JB)I", "Ltb/tyu;", "h", "(JS)I", "Ltb/fwu;", at.f, "(JI)I", "f", "(JJ)I", "N", "(JB)J", "Q", "(JS)J", "P", "(JI)J", "O", "(JJ)J", "y", "B", "A", AmnetConstant.VAL_SUPPORT_ZSTD, "Z", "c0", "b0", "a0", at.k, "n", "m", "l", "T", "W", "V", "U", "q", "t", "s", "r", "C", "(JB)B", "L", "(JS)S", "K", "J", "w", at.j, "Ltb/nwu;", "R", "(JJ)Ltb/nwu;", ExifInterface.LATITUDE_SOUTH, "bitCount", "X", "Y", "a", "M", "p0", "x", "", "d0", "(J)B", "", "i0", "(J)S", "g0", "(J)I", "h0", "k0", "n0", "l0", "m0", "", "f0", "(J)F", "", "e0", "(J)D", "", "j0", "(J)Ljava/lang/String;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "u", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class kwu implements Comparable<kwu> {
    public static final a Companion = new a(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;

    /* renamed from: a */
    private final long f22976a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ kwu(long j) {
        this.f22976a = j;
    }

    private static final long A(long j, int i) {
        return j - (i & tiv.INT_MASK);
    }

    private static final long B(long j, short s) {
        return j - (s & 65535);
    }

    private static final byte C(long j, byte b) {
        return (byte) qru.a(j, b & 255);
    }

    private static final long J(long j, long j2) {
        return qru.a(j, j2);
    }

    private static final int K(long j, int i) {
        return (int) qru.a(j, i & tiv.INT_MASK);
    }

    private static final short L(long j, short s) {
        return (short) qru.a(j, s & 65535);
    }

    private static final long M(long j, long j2) {
        return j | j2;
    }

    private static final long N(long j, byte b) {
        return j + (b & 255);
    }

    private static final long O(long j, long j2) {
        return j + j2;
    }

    private static final long P(long j, int i) {
        return j + (i & tiv.INT_MASK);
    }

    private static final long Q(long j, short s) {
        return j + (s & 65535);
    }

    private static final nwu R(long j, long j2) {
        return new nwu(j, j2, null);
    }

    private static final nwu S(long j, long j2) {
        return syu.b(j, j2);
    }

    private static final long T(long j, byte b) {
        return qru.a(j, b & 255);
    }

    private static final long U(long j, long j2) {
        return uiv.g(j, j2);
    }

    private static final long V(long j, int i) {
        return qru.a(j, i & tiv.INT_MASK);
    }

    private static final long W(long j, short s) {
        return qru.a(j, s & 65535);
    }

    private static final long X(long j, int i) {
        return j << i;
    }

    private static final long Y(long j, int i) {
        return j >>> i;
    }

    private static final long Z(long j, byte b) {
        return j * (b & 255);
    }

    private static final long a(long j, long j2) {
        return j & j2;
    }

    private static final long a0(long j, long j2) {
        return j * j2;
    }

    public static final /* synthetic */ kwu b(long j) {
        return new kwu(j);
    }

    private static final long b0(long j, int i) {
        return j * (i & tiv.INT_MASK);
    }

    private static final long c0(long j, short s) {
        return j * (s & 65535);
    }

    private static final int d(long j, byte b) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, (b & 255) ^ Long.MIN_VALUE);
        return compare;
    }

    private static final byte d0(long j) {
        return (byte) j;
    }

    private int e(long j) {
        return uiv.e(o0(), j);
    }

    private static final double e0(long j) {
        return uiv.h(j);
    }

    private static int f(long j, long j2) {
        return uiv.e(j, j2);
    }

    private static final float f0(long j) {
        return (float) uiv.h(j);
    }

    private static final int g(long j, int i) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, (i & tiv.INT_MASK) ^ Long.MIN_VALUE);
        return compare;
    }

    private static final int g0(long j) {
        return (int) j;
    }

    private static final int h(long j, short s) {
        int compare;
        compare = Long.compare(j ^ Long.MIN_VALUE, (s & 65535) ^ Long.MIN_VALUE);
        return compare;
    }

    private static final short i0(long j) {
        return (short) j;
    }

    private static final long j(long j) {
        return j - 1;
    }

    public static String j0(long j) {
        return uiv.i(j, 10);
    }

    private static final long k(long j, byte b) {
        return rru.a(j, b & 255);
    }

    private static final byte k0(long j) {
        return (byte) j;
    }

    private static final long l(long j, long j2) {
        return uiv.f(j, j2);
    }

    private static final int l0(long j) {
        return (int) j;
    }

    private static final long m(long j, int i) {
        return rru.a(j, i & tiv.INT_MASK);
    }

    private static final long n(long j, short s) {
        return rru.a(j, s & 65535);
    }

    private static final short n0(long j) {
        return (short) j;
    }

    public static boolean o(long j, Object obj) {
        if ((obj instanceof kwu) && j == ((kwu) obj).o0()) {
            return true;
        }
        return false;
    }

    public static final boolean p(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    private static final long p0(long j, long j2) {
        return j ^ j2;
    }

    private static final long q(long j, byte b) {
        return rru.a(j, b & 255);
    }

    private static final long r(long j, long j2) {
        return rru.a(j, j2);
    }

    private static final long s(long j, int i) {
        return rru.a(j, i & tiv.INT_MASK);
    }

    private static final long t(long j, short s) {
        return rru.a(j, s & 65535);
    }

    public static int v(long j) {
        return en9.a(j);
    }

    private static final long w(long j) {
        return j + 1;
    }

    private static final long x(long j) {
        return ~j;
    }

    private static final long y(long j, byte b) {
        return j - (b & 255);
    }

    private static final long z(long j, long j2) {
        return j - j2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kwu kwuVar) {
        return uiv.e(o0(), kwuVar.o0());
    }

    public boolean equals(Object obj) {
        return o(this.f22976a, obj);
    }

    public int hashCode() {
        return v(this.f22976a);
    }

    public final /* synthetic */ long o0() {
        return this.f22976a;
    }

    public String toString() {
        return j0(this.f22976a);
    }

    public static /* synthetic */ void u() {
    }

    private static final long h0(long j) {
        return j;
    }

    public static long i(long j) {
        return j;
    }

    private static final long m0(long j) {
        return j;
    }
}
