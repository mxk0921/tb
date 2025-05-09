package tb;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001:B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0012\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0013\u0010\fJ\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0014\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0017\u0010\tJ\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0018\u0010\fJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0019\u0010\u000eJ\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\u001a\u0010\u0016J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u001b\u0010\tJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u001c\u0010\fJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001d\u0010\u000eJ\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\u001e\u0010\u0016J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u001f\u0010\tJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\nH\u0087\n¢\u0006\u0004\b \u0010\fJ\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b!\u0010\u000eJ\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\"\u0010\u0016J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b#\u0010\tJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\nH\u0087\n¢\u0006\u0004\b$\u0010\fJ\u0018\u0010%\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b%\u0010\u000eJ\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b&\u0010\u0016J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b'\u0010\tJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\nH\u0087\b¢\u0006\u0004\b(\u0010\fJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b)\u0010\u000eJ\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b*\u0010\u0016J\u0018\u0010+\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\nH\u0087\b¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b/\u0010\u000eJ\u0018\u00100\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b0\u0010\u0016J\u0010\u00101\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b1\u0010\u0005J\u0010\u00102\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b2\u0010\u0005J\u0018\u00104\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b6\u00105J\u0018\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0002H\u0087\f¢\u0006\u0004\b8\u0010\u000eJ\u0018\u00109\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0002H\u0087\f¢\u0006\u0004\b9\u0010\u000eJ\u0018\u0010:\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b:\u0010\u000eJ\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b;\u0010\u000eJ\u0018\u0010<\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\b<\u0010\u000eJ\u0010\u0010=\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b=\u0010\u0005J\u0010\u0010?\u001a\u00020>H\u0087\b¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020AH\u0087\b¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\bD\u0010\u0005J\u0010\u0010F\u001a\u00020EH\u0087\b¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\bH\u0010@J\u0010\u0010I\u001a\u00020\nH\u0087\b¢\u0006\u0004\bI\u0010CJ\u0010\u0010J\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bJ\u0010\u0005J\u0010\u0010K\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\bK\u0010GJ\u0010\u0010M\u001a\u00020LH\u0087\b¢\u0006\u0004\bM\u0010NJ\u0010\u0010P\u001a\u00020OH\u0087\b¢\u0006\u0004\bP\u0010QJ\u000f\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bU\u0010VJ\u001a\u0010Y\u001a\u00020X2\b\u0010\u0007\u001a\u0004\u0018\u00010WHÖ\u0003¢\u0006\u0004\bY\u0010ZR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b:\u0010[\u0012\u0004\b\\\u0010]\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006_"}, d2 = {"Ltb/fwu;", "", "", "data", bmv.MSGTYPE_INTERVAL, "(I)I", "Ltb/tru;", "other", "d", "(IB)I", "Ltb/tyu;", "h", "(IS)I", at.f, "(II)I", "Ltb/kwu;", "e", "(IJ)I", "N", "Q", "P", "O", "(IJ)J", "y", "B", "A", AmnetConstant.VAL_SUPPORT_ZSTD, "Z", "c0", "b0", "a0", at.k, "n", "m", "l", "T", "W", "V", "U", "q", "t", "s", "r", "C", "(IB)B", "L", "(IS)S", "K", "J", "w", at.j, "Ltb/iwu;", "R", "(II)Ltb/iwu;", ExifInterface.LATITUDE_SOUTH, "bitCount", "X", "Y", "a", "M", "p0", "x", "", "d0", "(I)B", "", "i0", "(I)S", "g0", "", "h0", "(I)J", "k0", "n0", "l0", "m0", "", "f0", "(I)F", "", "e0", "(I)D", "", "j0", "(I)Ljava/lang/String;", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", TLogTracker.LEVEL_INFO, "u", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class fwu implements Comparable<fwu> {
    public static final a Companion = new a(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;

    /* renamed from: a  reason: collision with root package name */
    private final int f19589a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ fwu(int i) {
        this.f19589a = i;
    }

    private static final int A(int i, int i2) {
        return i - i2;
    }

    private static final int B(int i, short s) {
        return i - (s & 65535);
    }

    private static final byte C(int i, byte b) {
        return (byte) pru.a(i, b & 255);
    }

    private static final long J(int i, long j) {
        return qru.a(i & tiv.INT_MASK, j);
    }

    private static final int K(int i, int i2) {
        return pru.a(i, i2);
    }

    private static final short L(int i, short s) {
        return (short) pru.a(i, s & 65535);
    }

    private static final int M(int i, int i2) {
        return i | i2;
    }

    private static final int N(int i, byte b) {
        return i + (b & 255);
    }

    private static final long O(int i, long j) {
        return (i & tiv.INT_MASK) + j;
    }

    private static final int P(int i, int i2) {
        return i + i2;
    }

    private static final int Q(int i, short s) {
        return i + (s & 65535);
    }

    private static final iwu R(int i, int i2) {
        return new iwu(i, i2, null);
    }

    private static final iwu S(int i, int i2) {
        return syu.a(i, i2);
    }

    private static final int T(int i, byte b) {
        return pru.a(i, b & 255);
    }

    private static final long U(int i, long j) {
        return qru.a(i & tiv.INT_MASK, j);
    }

    private static final int V(int i, int i2) {
        return uiv.c(i, i2);
    }

    private static final int W(int i, short s) {
        return pru.a(i, s & 65535);
    }

    private static final int X(int i, int i2) {
        return i << i2;
    }

    private static final int Y(int i, int i2) {
        return i >>> i2;
    }

    private static final int Z(int i, byte b) {
        return i * (b & 255);
    }

    private static final int a(int i, int i2) {
        return i & i2;
    }

    private static final long a0(int i, long j) {
        return (i & tiv.INT_MASK) * j;
    }

    public static final /* synthetic */ fwu b(int i) {
        return new fwu(i);
    }

    private static final int b0(int i, int i2) {
        return i * i2;
    }

    private static final int c0(int i, short s) {
        return i * (s & 65535);
    }

    private static final int d(int i, byte b) {
        int compare;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, (b & 255) ^ Integer.MIN_VALUE);
        return compare;
    }

    private static final byte d0(int i) {
        return (byte) i;
    }

    private static final int e(int i, long j) {
        int compare;
        compare = Long.compare((i & tiv.INT_MASK) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        return compare;
    }

    private static final double e0(int i) {
        return uiv.d(i);
    }

    private int f(int i) {
        return uiv.a(o0(), i);
    }

    private static final float f0(int i) {
        return (float) uiv.d(i);
    }

    private static int g(int i, int i2) {
        return uiv.a(i, i2);
    }

    private static final int h(int i, short s) {
        int compare;
        compare = Integer.compare(i ^ Integer.MIN_VALUE, (s & 65535) ^ Integer.MIN_VALUE);
        return compare;
    }

    private static final long h0(int i) {
        return i & tiv.INT_MASK;
    }

    private static final short i0(int i) {
        return (short) i;
    }

    private static final int j(int i) {
        return i - 1;
    }

    public static String j0(int i) {
        return String.valueOf(i & tiv.INT_MASK);
    }

    private static final int k(int i, byte b) {
        return oru.a(i, b & 255);
    }

    private static final byte k0(int i) {
        return (byte) i;
    }

    private static final long l(int i, long j) {
        return rru.a(i & tiv.INT_MASK, j);
    }

    private static final int m(int i, int i2) {
        return uiv.b(i, i2);
    }

    private static final long m0(int i) {
        return i & tiv.INT_MASK;
    }

    private static final int n(int i, short s) {
        return oru.a(i, s & 65535);
    }

    private static final short n0(int i) {
        return (short) i;
    }

    public static boolean o(int i, Object obj) {
        if ((obj instanceof fwu) && i == ((fwu) obj).o0()) {
            return true;
        }
        return false;
    }

    public static final boolean p(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    private static final int p0(int i, int i2) {
        return i ^ i2;
    }

    private static final int q(int i, byte b) {
        return oru.a(i, b & 255);
    }

    private static final long r(int i, long j) {
        return rru.a(i & tiv.INT_MASK, j);
    }

    private static final int s(int i, int i2) {
        return oru.a(i, i2);
    }

    private static final int t(int i, short s) {
        return oru.a(i, s & 65535);
    }

    private static final int w(int i) {
        return i + 1;
    }

    private static final int x(int i) {
        return ~i;
    }

    private static final int y(int i, byte b) {
        return i - (b & 255);
    }

    private static final long z(int i, long j) {
        return (i & tiv.INT_MASK) - j;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(fwu fwuVar) {
        return uiv.a(o0(), fwuVar.o0());
    }

    public boolean equals(Object obj) {
        return o(this.f19589a, obj);
    }

    public int hashCode() {
        return this.f19589a;
    }

    public final /* synthetic */ int o0() {
        return this.f19589a;
    }

    public String toString() {
        return j0(this.f19589a);
    }

    public static /* synthetic */ void u() {
    }

    private static final int g0(int i) {
        return i;
    }

    public static int i(int i) {
        return i;
    }

    private static final int l0(int i) {
        return i;
    }

    public static int v(int i) {
        return i;
    }
}
