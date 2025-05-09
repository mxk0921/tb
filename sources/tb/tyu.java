package tb;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.loc.at;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00018B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0013\u0010\nJ\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0014\u0010\fJ\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0015\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0018\u0010\nJ\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0019\u0010\fJ\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001a\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001b\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u001c\u0010\nJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001d\u0010\fJ\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0017J\u0018\u0010 \u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b \u0010\nJ\u0018\u0010!\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b!\u0010\fJ\u0018\u0010\"\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\"\u0010\u000fJ\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b#\u0010\u0017J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b$\u0010\nJ\u0018\u0010%\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b%\u0010\fJ\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0087\n¢\u0006\u0004\b&\u0010\u000fJ\u0018\u0010'\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b'\u0010\u0017J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b(\u0010\nJ\u0018\u0010)\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b)\u0010\fJ\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0087\b¢\u0006\u0004\b*\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b+\u0010\u0017J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0087\b¢\u0006\u0004\b0\u0010\u000fJ\u0018\u00101\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b1\u0010\u0017J\u0010\u00102\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b2\u0010\u0005J\u0010\u00103\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b3\u0010\u0005J\u0018\u00105\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b7\u00106J\u0018\u00108\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b8\u0010/J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b9\u0010/J\u0018\u0010:\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b:\u0010/J\u0010\u0010;\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b;\u0010\u0005J\u0010\u0010=\u001a\u00020<H\u0087\b¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b?\u0010\u0005J\u0010\u0010@\u001a\u00020\bH\u0087\b¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BH\u0087\b¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\bE\u0010>J\u0010\u0010F\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bF\u0010\u0005J\u0010\u0010G\u001a\u00020\rH\u0087\b¢\u0006\u0004\bG\u0010AJ\u0010\u0010H\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\bH\u0010DJ\u0010\u0010J\u001a\u00020IH\u0087\b¢\u0006\u0004\bJ\u0010KJ\u0010\u0010M\u001a\u00020LH\u0087\b¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bR\u0010SJ\u001a\u0010V\u001a\u00020U2\b\u0010\u0007\u001a\u0004\u0018\u00010THÖ\u0003¢\u0006\u0004\bV\u0010WR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b8\u00107\u0012\u0004\bX\u0010Y\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006["}, d2 = {"Ltb/tyu;", "", "", "data", bmv.MSGTYPE_INTERVAL, "(S)S", "Ltb/tru;", "other", "", "d", "(SB)I", "h", "(SS)I", "Ltb/fwu;", "f", "(SI)I", "Ltb/kwu;", "e", "(SJ)I", "N", "Q", "P", "O", "(SJ)J", "y", "B", "A", AmnetConstant.VAL_SUPPORT_ZSTD, "X", "a0", "Z", "Y", at.k, "n", "m", "l", "T", "W", "V", "U", "q", "t", "s", "r", "C", "(SB)B", "L", "(SS)S", "K", "J", "w", at.j, "Ltb/iwu;", "R", "(SS)Ltb/iwu;", ExifInterface.LATITUDE_SOUTH, "a", "M", "n0", "x", "", "b0", "(S)B", "g0", "e0", "(S)I", "", "f0", "(S)J", "i0", "l0", "j0", "k0", "", "d0", "(S)F", "", "c0", "(S)D", "", "h0", "(S)Ljava/lang/String;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "u", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class tyu implements Comparable<tyu> {
    public static final a Companion = new a(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;

    /* renamed from: a  reason: collision with root package name */
    private final short f29035a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ tyu(short s) {
        this.f29035a = s;
    }

    private static final int A(short s, int i) {
        return (s & 65535) - i;
    }

    private static final int B(short s, short s2) {
        return (s & 65535) - (s2 & 65535);
    }

    private static final byte C(short s, byte b) {
        return (byte) pru.a(s & 65535, b & 255);
    }

    private static final long J(short s, long j) {
        return qru.a(s & 65535, j);
    }

    private static final int K(short s, int i) {
        return pru.a(s & 65535, i);
    }

    private static final short L(short s, short s2) {
        return (short) pru.a(s & 65535, s2 & 65535);
    }

    private static final short M(short s, short s2) {
        return (short) (s | s2);
    }

    private static final int N(short s, byte b) {
        return (s & 65535) + (b & 255);
    }

    private static final long O(short s, long j) {
        return (s & 65535) + j;
    }

    private static final int P(short s, int i) {
        return (s & 65535) + i;
    }

    private static final int Q(short s, short s2) {
        return (s & 65535) + (s2 & 65535);
    }

    private static final iwu R(short s, short s2) {
        return new iwu(s & 65535, s2 & 65535, null);
    }

    private static final iwu S(short s, short s2) {
        return syu.a(s & 65535, s2 & 65535);
    }

    private static final int T(short s, byte b) {
        return pru.a(s & 65535, b & 255);
    }

    private static final long U(short s, long j) {
        return qru.a(s & 65535, j);
    }

    private static final int V(short s, int i) {
        return pru.a(s & 65535, i);
    }

    private static final int W(short s, short s2) {
        return pru.a(s & 65535, s2 & 65535);
    }

    private static final int X(short s, byte b) {
        return (s & 65535) * (b & 255);
    }

    private static final long Y(short s, long j) {
        return (s & 65535) * j;
    }

    private static final int Z(short s, int i) {
        return (s & 65535) * i;
    }

    private static final short a(short s, short s2) {
        return (short) (s & s2);
    }

    private static final int a0(short s, short s2) {
        return (s & 65535) * (s2 & 65535);
    }

    public static final /* synthetic */ tyu b(short s) {
        return new tyu(s);
    }

    private static final byte b0(short s) {
        return (byte) s;
    }

    private static final double c0(short s) {
        return uiv.d(s & 65535);
    }

    private static final int d(short s, byte b) {
        return ckf.i(s & 65535, b & 255);
    }

    private static final float d0(short s) {
        return (float) uiv.d(s & 65535);
    }

    private static final int e(short s, long j) {
        int compare;
        compare = Long.compare((s & 65535) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        return compare;
    }

    private static final int e0(short s) {
        return s & 65535;
    }

    private static final int f(short s, int i) {
        int compare;
        compare = Integer.compare((s & 65535) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
        return compare;
    }

    private static final long f0(short s) {
        return s & 65535;
    }

    private int g(short s) {
        return ckf.i(m0() & 65535, s & 65535);
    }

    private static int h(short s, short s2) {
        return ckf.i(s & 65535, s2 & 65535);
    }

    public static String h0(short s) {
        return String.valueOf(s & 65535);
    }

    private static final byte i0(short s) {
        return (byte) s;
    }

    private static final short j(short s) {
        return (short) (s - 1);
    }

    private static final int j0(short s) {
        return s & 65535;
    }

    private static final int k(short s, byte b) {
        return oru.a(s & 65535, b & 255);
    }

    private static final long k0(short s) {
        return s & 65535;
    }

    private static final long l(short s, long j) {
        return rru.a(s & 65535, j);
    }

    private static final int m(short s, int i) {
        return oru.a(s & 65535, i);
    }

    private static final int n(short s, short s2) {
        return oru.a(s & 65535, s2 & 65535);
    }

    private static final short n0(short s, short s2) {
        return (short) (s ^ s2);
    }

    public static boolean o(short s, Object obj) {
        if ((obj instanceof tyu) && s == ((tyu) obj).m0()) {
            return true;
        }
        return false;
    }

    public static final boolean p(short s, short s2) {
        if (s == s2) {
            return true;
        }
        return false;
    }

    private static final int q(short s, byte b) {
        return oru.a(s & 65535, b & 255);
    }

    private static final long r(short s, long j) {
        return rru.a(s & 65535, j);
    }

    private static final int s(short s, int i) {
        return oru.a(s & 65535, i);
    }

    private static final int t(short s, short s2) {
        return oru.a(s & 65535, s2 & 65535);
    }

    private static final short w(short s) {
        return (short) (s + 1);
    }

    private static final short x(short s) {
        return (short) (~s);
    }

    private static final int y(short s, byte b) {
        return (s & 65535) - (b & 255);
    }

    private static final long z(short s, long j) {
        return (s & 65535) - j;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(tyu tyuVar) {
        return ckf.i(m0() & 65535, tyuVar.m0() & 65535);
    }

    public boolean equals(Object obj) {
        return o(this.f29035a, obj);
    }

    public int hashCode() {
        return this.f29035a;
    }

    public final /* synthetic */ short m0() {
        return this.f29035a;
    }

    public String toString() {
        return h0(this.f29035a);
    }

    public static /* synthetic */ void u() {
    }

    private static final short g0(short s) {
        return s;
    }

    public static short i(short s) {
        return s;
    }

    private static final short l0(short s) {
        return s;
    }

    public static int v(short s) {
        return s;
    }
}
