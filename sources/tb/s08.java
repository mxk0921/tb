package tb;

import androidx.exifinterface.media.ExifInterface;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.loc.at;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.time.DurationUnit;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b*\b\u0087@\u0018\u0000 |2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001VB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u0005J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\bJ\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\bJ\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\bJ\r\u0010%\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\bJ\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u009d\u0001\u00101\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2u\u00100\u001aq\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00028\u00000(H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b1\u00102J\u0088\u0001\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2`\u00100\u001a\\\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00028\u000003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b4\u00105Js\u00107\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"2K\u00100\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00028\u000006H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b7\u00108J^\u0010:\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"26\u00100\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(/\u0012\u0004\u0012\u00028\u000009H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b>\u0010!J\u0015\u0010?\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ?\u0010K\u001a\u00020J*\u00060Dj\u0002`E2\u0006\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u00132\u0006\u0010H\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020A2\u0006\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020A2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010M\u001a\u00020\u0013¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020A¢\u0006\u0004\bP\u0010CJ\u0010\u0010Q\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bQ\u0010RJ\u001a\u0010T\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010SHÖ\u0003¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0005R\u0015\u0010\\\u001a\u00020\u00138Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0011\u0010a\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b`\u0010\u0005R\u001a\u0010e\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\bc\u0010d\u001a\u0004\bb\u0010[R\u001a\u0010h\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\bg\u0010d\u001a\u0004\bf\u0010[R\u001a\u0010j\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\bW\u0010d\u001a\u0004\bi\u0010[R\u001a\u0010m\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\bl\u0010d\u001a\u0004\bk\u0010[R\u0011\u0010o\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bn\u0010\u0005R\u0011\u0010q\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bp\u0010\u0005R\u0011\u0010s\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\br\u0010\u0005R\u0011\u0010u\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bt\u0010\u0005R\u0011\u0010w\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bv\u0010\u0005R\u0011\u0010y\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bx\u0010\u0005R\u0011\u0010{\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bz\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006}"}, d2 = {"Ltb/s08;", "", "", "rawValue", at.j, "(J)J", "", "R", "(J)Z", "Q", "l0", "other", "W", "(JJ)J", "thisMillis", "otherNanos", "e", "(JJJ)J", "V", "", "scale", "Y", "(JI)J", "", "X", "(JD)J", "m", "l", at.k, "(JJ)D", "Lkotlin/time/DurationUnit;", mh1.PRICE_UNIT, "k0", "(JLkotlin/time/DurationUnit;)J", "T", "U", ExifInterface.LATITUDE_SOUTH, "P", bmv.MSGTYPE_INTERVAL, "(JJ)I", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "action", "c0", "(JLtb/a2a;)Ljava/lang/Object;", "Lkotlin/Function4;", "b0", "(JLtb/y1a;)Ljava/lang/Object;", "Lkotlin/Function3;", "a0", "(JLtb/w1a;)Ljava/lang/Object;", "Lkotlin/Function2;", "Z", "(JLtb/u1a;)Ljava/lang/Object;", "d0", "(JLkotlin/time/DurationUnit;)D", "g0", "e0", "(JLkotlin/time/DurationUnit;)I", "", "h0", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "Ltb/xhv;", "f", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "i0", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "f0", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "N", "value", "M", "(J)I", "unitDiscriminator", "L", "(J)Lkotlin/time/DurationUnit;", "storageUnit", "p", "absoluteValue", "r", "q", "()V", "hoursComponent", "A", AmnetConstant.VAL_SUPPORT_ZSTD, "minutesComponent", "K", "secondsComponent", "C", "B", "nanosecondsComponent", "s", "inWholeDays", "t", "inWholeHours", "w", "inWholeMinutes", "y", "inWholeSeconds", "v", "inWholeMilliseconds", "u", "inWholeMicroseconds", "x", "inWholeNanoseconds", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class s08 implements Comparable<s08> {
    public static final a Companion = new a(null);
    private static final long b = 0;
    private static final long c = w08.b(w08.MAX_MILLIS);
    private static final long d = w08.b(-4611686018427387903L);

    /* renamed from: a  reason: collision with root package name */
    private final long f27710a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final long a() {
            return s08.c;
        }

        public final long b() {
            return s08.d;
        }

        public final long c() {
            return s08.b;
        }

        public a() {
        }
    }

    static {
        j(0L);
    }

    private /* synthetic */ s08(long j) {
        this.f27710a = j;
    }

    public static final int A(long j) {
        if (S(j)) {
            return 0;
        }
        return (int) (w(j) % 60);
    }

    public static final int C(long j) {
        long N;
        if (S(j)) {
            return 0;
        }
        if (Q(j)) {
            N = w08.f(N(j) % 1000);
        } else {
            N = N(j) % ((long) fxv.SECOND_IN_NANOS);
        }
        return (int) N;
    }

    public static final int K(long j) {
        if (S(j)) {
            return 0;
        }
        return (int) (y(j) % 60);
    }

    private static final DurationUnit L(long j) {
        if (R(j)) {
            return DurationUnit.NANOSECONDS;
        }
        return DurationUnit.MILLISECONDS;
    }

    private static final int M(long j) {
        return ((int) j) & 1;
    }

    private static final long N(long j) {
        return j >> 1;
    }

    public static int O(long j) {
        return en9.a(j);
    }

    public static final boolean P(long j) {
        return !S(j);
    }

    private static final boolean Q(long j) {
        if ((((int) j) & 1) == 1) {
            return true;
        }
        return false;
    }

    private static final boolean R(long j) {
        if ((((int) j) & 1) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean S(long j) {
        if (j == c || j == d) {
            return true;
        }
        return false;
    }

    public static final boolean T(long j) {
        if (j < 0) {
            return true;
        }
        return false;
    }

    public static final boolean U(long j) {
        if (j > 0) {
            return true;
        }
        return false;
    }

    public static final long V(long j, long j2) {
        return W(j, l0(j2));
    }

    public static final long W(long j, long j2) {
        if (S(j)) {
            if (P(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (S(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long N = N(j) + N(j2);
                if (R(j)) {
                    return w08.e(N);
                }
                return w08.c(N);
            } else if (Q(j)) {
                return e(j, N(j), N(j2));
            } else {
                return e(j, N(j2), N(j));
            }
        }
    }

    public static final long X(long j, double d2) {
        int c2 = iai.c(d2);
        if (c2 == d2) {
            return Y(j, c2);
        }
        DurationUnit L = L(j);
        return w08.o(d0(j, L) * d2, L);
    }

    public static final long Y(long j, int i) {
        if (S(j)) {
            if (i == 0) {
                throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
            } else if (i > 0) {
                return j;
            } else {
                return l0(j);
            }
        } else if (i == 0) {
            return b;
        } else {
            long N = N(j);
            long j2 = i;
            long j3 = N * j2;
            if (R(j)) {
                if (-2147483647L <= N && N < 2147483648L) {
                    return w08.d(j3);
                }
                if (j3 / j2 == N) {
                    return w08.e(j3);
                }
                long g = w08.g(N);
                long j4 = g * j2;
                long g2 = w08.g((N - w08.f(g)) * j2) + j4;
                if (j4 / j2 == g && (g2 ^ j4) >= 0) {
                    return w08.b(hfn.j(g2, new akh(-4611686018427387903L, w08.MAX_MILLIS)));
                }
                if (iai.b(N) * iai.a(i) > 0) {
                    return c;
                }
                return d;
            } else if (j3 / j2 == N) {
                return w08.b(hfn.j(j3, new akh(-4611686018427387903L, w08.MAX_MILLIS)));
            } else {
                if (iai.b(N) * iai.a(i) > 0) {
                    return c;
                }
                return d;
            }
        }
    }

    public static final <T> T Z(long j, u1a<? super Long, ? super Integer, ? extends T> u1aVar) {
        ckf.g(u1aVar, "action");
        return (T) u1aVar.invoke(Long.valueOf(y(j)), Integer.valueOf(C(j)));
    }

    public static final <T> T a0(long j, w1a<? super Long, ? super Integer, ? super Integer, ? extends T> w1aVar) {
        ckf.g(w1aVar, "action");
        return (T) w1aVar.invoke(Long.valueOf(w(j)), Integer.valueOf(K(j)), Integer.valueOf(C(j)));
    }

    public static final <T> T b0(long j, y1a<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> y1aVar) {
        ckf.g(y1aVar, "action");
        return (T) y1aVar.invoke(Long.valueOf(t(j)), Integer.valueOf(A(j)), Integer.valueOf(K(j)), Integer.valueOf(C(j)));
    }

    public static final <T> T c0(long j, a2a<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> a2aVar) {
        ckf.g(a2aVar, "action");
        return (T) a2aVar.invoke(Long.valueOf(s(j)), Integer.valueOf(r(j)), Integer.valueOf(A(j)), Integer.valueOf(K(j)), Integer.valueOf(C(j)));
    }

    public static final double d0(long j, DurationUnit durationUnit) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        if (j == c) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == d) {
            return Double.NEGATIVE_INFINITY;
        }
        return x08.a(N(j), L(j), durationUnit);
    }

    private static final long e(long j, long j2, long j3) {
        long g = w08.g(j3);
        long j4 = j2 + g;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return w08.b(hfn.i(j4, -4611686018427387903L, w08.MAX_MILLIS));
        }
        return w08.d(w08.f(j4) + (j3 - w08.f(g)));
    }

    public static final int e0(long j, DurationUnit durationUnit) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        return (int) hfn.i(g0(j, durationUnit), -2147483648L, 2147483647L);
    }

    private static final void f(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String j0 = wsq.j0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = j0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (j0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) j0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) j0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static final String f0(long j) {
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        if (T(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long p = p(j);
        long t = t(p);
        int A = A(p);
        int K = K(p);
        int C = C(p);
        if (S(j)) {
            t = 9999999999999L;
        }
        boolean z3 = false;
        if (t != 0) {
            z = true;
        } else {
            z = false;
        }
        if (K == 0 && C == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (A != 0 || (z2 && z)) {
            z3 = true;
        }
        if (z) {
            sb.append(t);
            sb.append('H');
        }
        if (z3) {
            sb.append(A);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            f(j, sb, K, C, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    public static final /* synthetic */ s08 g(long j) {
        return new s08(j);
    }

    public static final long g0(long j, DurationUnit durationUnit) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        return x08.b(N(j), L(j), durationUnit);
    }

    public static String h0(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (j == 0) {
            return "0s";
        }
        if (j == c) {
            return pg1.ATOM_EXT_Infinity;
        }
        if (j == d) {
            return "-Infinity";
        }
        boolean T = T(j);
        StringBuilder sb = new StringBuilder();
        if (T) {
            sb.append('-');
        }
        long p = p(j);
        long s = s(p);
        int r = r(p);
        int A = A(p);
        int K = K(p);
        int C = C(p);
        int i = 0;
        if (s != 0) {
            z = true;
        } else {
            z = false;
        }
        if (r != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (A != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (K == 0 && C == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            sb.append(s);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(r);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(A);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (K != 0 || z || z2 || z3) {
                f(j, sb, K, C, 9, "s", false);
            } else if (C >= 1000000) {
                f(j, sb, C / 1000000, C % 1000000, 6, "ms", false);
            } else if (C >= 1000) {
                f(j, sb, C / 1000, C % 1000, 3, "us", false);
            } else {
                sb.append(C);
                sb.append(NotificationStyle.NOTIFICATION_STYLE);
            }
            i = i4;
        }
        if (T && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static int i(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return ckf.j(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        if (T(j)) {
            return -i;
        }
        return i;
    }

    public static final String i0(long j, DurationUnit durationUnit, int i) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        if (i >= 0) {
            double d0 = d0(j, durationUnit);
            if (Double.isInfinite(d0)) {
                return String.valueOf(d0);
            }
            return v08.b(d0, hfn.f(i, 12)).concat(y08.d(durationUnit));
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
    }

    public static long j(long j) {
        ThreadLocal<DecimalFormat>[] threadLocalArr = v08.f29711a;
        return j;
    }

    public static /* synthetic */ String j0(long j, DurationUnit durationUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return i0(j, durationUnit, i);
    }

    public static final double k(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) u84.b(L(j), L(j2));
        return d0(j, durationUnit) / d0(j2, durationUnit);
    }

    public static final long k0(long j, DurationUnit durationUnit) {
        ckf.g(durationUnit, mh1.PRICE_UNIT);
        DurationUnit L = L(j);
        if (durationUnit.compareTo(L) <= 0 || S(j)) {
            return j;
        }
        return w08.p(N(j) - (N(j) % x08.b(1L, durationUnit, L)), L);
    }

    public static final long l(long j, double d2) {
        int c2 = iai.c(d2);
        if (c2 == d2 && c2 != 0) {
            return m(j, c2);
        }
        DurationUnit L = L(j);
        return w08.o(d0(j, L) / d2, L);
    }

    public static final long l0(long j) {
        return w08.a(-N(j), ((int) j) & 1);
    }

    public static final long m(long j, int i) {
        if (i == 0) {
            if (U(j)) {
                return c;
            }
            if (T(j)) {
                return d;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        } else if (R(j)) {
            return w08.d(N(j) / i);
        } else {
            if (S(j)) {
                return Y(j, iai.a(i));
            }
            long j2 = i;
            long N = N(j) / j2;
            if (-4611686018426L > N || N >= 4611686018427L) {
                return w08.b(N);
            }
            return w08.d(w08.f(N) + (w08.f(N(j) - (N * j2)) / j2));
        }
    }

    public static boolean n(long j, Object obj) {
        if ((obj instanceof s08) && j == ((s08) obj).m0()) {
            return true;
        }
        return false;
    }

    public static final boolean o(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long p(long j) {
        if (T(j)) {
            return l0(j);
        }
        return j;
    }

    public static final int r(long j) {
        if (S(j)) {
            return 0;
        }
        return (int) (t(j) % 24);
    }

    public static final long s(long j) {
        return g0(j, DurationUnit.DAYS);
    }

    public static final long t(long j) {
        return g0(j, DurationUnit.HOURS);
    }

    public static final long u(long j) {
        return g0(j, DurationUnit.MICROSECONDS);
    }

    public static final long v(long j) {
        if (!Q(j) || !P(j)) {
            return g0(j, DurationUnit.MILLISECONDS);
        }
        return N(j);
    }

    public static final long w(long j) {
        return g0(j, DurationUnit.MINUTES);
    }

    public static final long x(long j) {
        long N = N(j);
        if (R(j)) {
            return N;
        }
        if (N > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (N < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return w08.f(N);
    }

    public static final long y(long j) {
        return g0(j, DurationUnit.SECONDS);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(s08 s08Var) {
        return h(s08Var.m0());
    }

    public boolean equals(Object obj) {
        return n(this.f27710a, obj);
    }

    public int h(long j) {
        return i(this.f27710a, j);
    }

    public int hashCode() {
        return O(this.f27710a);
    }

    public final /* synthetic */ long m0() {
        return this.f27710a;
    }

    public String toString() {
        return h0(this.f27710a);
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void J() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void z() {
    }
}
