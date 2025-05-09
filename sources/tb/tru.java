package tb;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.loc.at;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00018B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0013\u0010\tJ\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0014\u0010\fJ\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0015\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0018\u0010\tJ\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0019\u0010\fJ\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001a\u0010\u000fJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001b\u0010\u0017J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001c\u0010\tJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u001d\u0010\fJ\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0017J\u0018\u0010 \u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\tJ\u0018\u0010!\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\nH\u0087\n¢\u0006\u0004\b!\u0010\fJ\u0018\u0010\"\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\"\u0010\u000fJ\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b#\u0010\u0017J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b$\u0010\tJ\u0018\u0010%\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\nH\u0087\n¢\u0006\u0004\b%\u0010\fJ\u0018\u0010&\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\n¢\u0006\u0004\b&\u0010\u000fJ\u0018\u0010'\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b'\u0010\u0017J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b(\u0010\tJ\u0018\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\nH\u0087\b¢\u0006\u0004\b)\u0010\fJ\u0018\u0010*\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b¢\u0006\u0004\b*\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b+\u0010\u0017J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0087\b¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b¢\u0006\u0004\b0\u0010\u000fJ\u0018\u00101\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b1\u0010\u0017J\u0010\u00102\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b2\u0010\u0005J\u0010\u00103\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b3\u0010\u0005J\u0018\u00105\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b7\u00106J\u0018\u00108\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b8\u0010-J\u0018\u00109\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b9\u0010-J\u0018\u0010:\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b:\u0010-J\u0010\u0010;\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b;\u0010\u0005J\u0010\u0010<\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b<\u0010\u0005J\u0010\u0010>\u001a\u00020=H\u0087\b¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BH\u0087\b¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bE\u0010\u0005J\u0010\u0010F\u001a\u00020\nH\u0087\b¢\u0006\u0004\bF\u0010?J\u0010\u0010G\u001a\u00020\rH\u0087\b¢\u0006\u0004\bG\u0010AJ\u0010\u0010H\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\bH\u0010DJ\u0010\u0010J\u001a\u00020IH\u0087\b¢\u0006\u0004\bJ\u0010KJ\u0010\u0010M\u001a\u00020LH\u0087\b¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bR\u0010SJ\u001a\u0010V\u001a\u00020U2\b\u0010\u0006\u001a\u0004\u0018\u00010THÖ\u0003¢\u0006\u0004\bV\u0010WR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b8\u0010\u0019\u0012\u0004\bX\u0010Y\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006["}, d2 = {"Ltb/tru;", "", "", "data", bmv.MSGTYPE_INTERVAL, "(B)B", "other", "", "e", "(BB)I", "Ltb/tyu;", "h", "(BS)I", "Ltb/fwu;", at.f, "(BI)I", "Ltb/kwu;", "f", "(BJ)I", "N", "Q", "P", "O", "(BJ)J", "y", "B", "A", AmnetConstant.VAL_SUPPORT_ZSTD, "X", "a0", "Z", "Y", at.k, "n", "m", "l", "T", "W", "V", "U", "q", "t", "s", "r", "C", "(BB)B", "L", "(BS)S", "K", "J", "w", at.j, "Ltb/iwu;", "R", "(BB)Ltb/iwu;", ExifInterface.LATITUDE_SOUTH, "a", "M", "n0", "x", "b0", "", "g0", "(B)S", "e0", "(B)I", "", "f0", "(B)J", "i0", "l0", "j0", "k0", "", "d0", "(B)F", "", "c0", "(B)D", "", "h0", "(B)Ljava/lang/String;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "u", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class tru implements Comparable<tru> {
    public static final a Companion = new a(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;

    /* renamed from: a  reason: collision with root package name */
    private final byte f28917a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ tru(byte b) {
        this.f28917a = b;
    }

    private static final int A(byte b, int i) {
        return (b & 255) - i;
    }

    private static final int B(byte b, short s) {
        return (b & 255) - (s & 65535);
    }

    private static final byte C(byte b, byte b2) {
        return (byte) pru.a(b & 255, b2 & 255);
    }

    private static final long J(byte b, long j) {
        return qru.a(b & 255, j);
    }

    private static final int K(byte b, int i) {
        return pru.a(b & 255, i);
    }

    private static final short L(byte b, short s) {
        return (short) pru.a(b & 255, s & 65535);
    }

    private static final byte M(byte b, byte b2) {
        return (byte) (b | b2);
    }

    private static final int N(byte b, byte b2) {
        return (b & 255) + (b2 & 255);
    }

    private static final long O(byte b, long j) {
        return (b & 255) + j;
    }

    private static final int P(byte b, int i) {
        return (b & 255) + i;
    }

    private static final int Q(byte b, short s) {
        return (b & 255) + (s & 65535);
    }

    private static final iwu R(byte b, byte b2) {
        return new iwu(b & 255, b2 & 255, null);
    }

    private static final iwu S(byte b, byte b2) {
        return syu.a(b & 255, b2 & 255);
    }

    private static final int T(byte b, byte b2) {
        return pru.a(b & 255, b2 & 255);
    }

    private static final long U(byte b, long j) {
        return qru.a(b & 255, j);
    }

    private static final int V(byte b, int i) {
        return pru.a(b & 255, i);
    }

    private static final int W(byte b, short s) {
        return pru.a(b & 255, s & 65535);
    }

    private static final int X(byte b, byte b2) {
        return (b & 255) * (b2 & 255);
    }

    private static final long Y(byte b, long j) {
        return (b & 255) * j;
    }

    private static final int Z(byte b, int i) {
        return (b & 255) * i;
    }

    private static final byte a(byte b, byte b2) {
        return (byte) (b & b2);
    }

    private static final int a0(byte b, short s) {
        return (b & 255) * (s & 65535);
    }

    public static final /* synthetic */ tru b(byte b) {
        return new tru(b);
    }

    private static final double c0(byte b) {
        return uiv.d(b & 255);
    }

    private int d(byte b) {
        return ckf.i(m0() & 255, b & 255);
    }

    private static final float d0(byte b) {
        return (float) uiv.d(b & 255);
    }

    private static int e(byte b, byte b2) {
        return ckf.i(b & 255, b2 & 255);
    }

    private static final int e0(byte b) {
        return b & 255;
    }

    private static final int f(byte b, long j) {
        int compare;
        compare = Long.compare((b & 255) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        return compare;
    }

    private static final long f0(byte b) {
        return b & 255;
    }

    private static final int g(byte b, int i) {
        int compare;
        compare = Integer.compare((b & 255) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
        return compare;
    }

    private static final short g0(byte b) {
        return (short) (b & 255);
    }

    private static final int h(byte b, short s) {
        return ckf.i(b & 255, s & 65535);
    }

    public static String h0(byte b) {
        return String.valueOf(b & 255);
    }

    private static final byte j(byte b) {
        return (byte) (b - 1);
    }

    private static final int j0(byte b) {
        return b & 255;
    }

    private static final int k(byte b, byte b2) {
        return oru.a(b & 255, b2 & 255);
    }

    private static final long k0(byte b) {
        return b & 255;
    }

    private static final long l(byte b, long j) {
        return rru.a(b & 255, j);
    }

    private static final short l0(byte b) {
        return (short) (b & 255);
    }

    private static final int m(byte b, int i) {
        return oru.a(b & 255, i);
    }

    private static final int n(byte b, short s) {
        return oru.a(b & 255, s & 65535);
    }

    private static final byte n0(byte b, byte b2) {
        return (byte) (b ^ b2);
    }

    public static boolean o(byte b, Object obj) {
        if ((obj instanceof tru) && b == ((tru) obj).m0()) {
            return true;
        }
        return false;
    }

    public static final boolean p(byte b, byte b2) {
        if (b == b2) {
            return true;
        }
        return false;
    }

    private static final int q(byte b, byte b2) {
        return oru.a(b & 255, b2 & 255);
    }

    private static final long r(byte b, long j) {
        return rru.a(b & 255, j);
    }

    private static final int s(byte b, int i) {
        return oru.a(b & 255, i);
    }

    private static final int t(byte b, short s) {
        return oru.a(b & 255, s & 65535);
    }

    private static final byte w(byte b) {
        return (byte) (b + 1);
    }

    private static final byte x(byte b) {
        return (byte) (~b);
    }

    private static final int y(byte b, byte b2) {
        return (b & 255) - (b2 & 255);
    }

    private static final long z(byte b, long j) {
        return (b & 255) - j;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(tru truVar) {
        return ckf.i(m0() & 255, truVar.m0() & 255);
    }

    public boolean equals(Object obj) {
        return o(this.f28917a, obj);
    }

    public int hashCode() {
        return this.f28917a;
    }

    public final /* synthetic */ byte m0() {
        return this.f28917a;
    }

    public String toString() {
        return h0(this.f28917a);
    }

    public static /* synthetic */ void u() {
    }

    private static final byte b0(byte b) {
        return b;
    }

    public static byte i(byte b) {
        return b;
    }

    private static final byte i0(byte b) {
        return b;
    }

    public static int v(byte b) {
        return b;
    }
}
