package tb;

import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.loc.at;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import tb.r84;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\""}, d2 = {"Ltb/jut;", "Ltb/r84;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "e", "(J)J", "Ltb/s08;", "f", "duration", "q", "(JJ)J", "n", "", at.j, "(J)Z", bmv.MSGTYPE_INTERVAL, "other", o.b, "(JLtb/r84;)J", "l", "", TplMsg.VALUE_T_NATIVE_RETURN, "(JJ)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class jut implements r84 {

    /* renamed from: a  reason: collision with root package name */
    private final long f22230a;

    private /* synthetic */ jut(long j) {
        this.f22230a = j;
    }

    public static final /* synthetic */ jut a(long j) {
        return new jut(j);
    }

    public static final int b(long j, long j2) {
        return s08.i(l(j, j2), s08.Companion.c());
    }

    public static int d(long j, r84 r84Var) {
        ckf.g(r84Var, "other");
        return a(j).compareTo(r84Var);
    }

    public static long f(long j) {
        return x0j.INSTANCE.c(j);
    }

    public static boolean g(long j, Object obj) {
        if ((obj instanceof jut) && j == ((jut) obj).s()) {
            return true;
        }
        return false;
    }

    public static final boolean h(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static boolean i(long j) {
        return s08.T(f(j));
    }

    public static boolean j(long j) {
        return !s08.T(f(j));
    }

    public static int k(long j) {
        return en9.a(j);
    }

    public static final long l(long j, long j2) {
        return x0j.INSTANCE.b(j, j2);
    }

    public static long n(long j, long j2) {
        return x0j.INSTANCE.a(j, s08.l0(j2));
    }

    public static long o(long j, r84 r84Var) {
        ckf.g(r84Var, "other");
        if (r84Var instanceof jut) {
            return l(j, ((jut) r84Var).s());
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) r(j)) + " and " + r84Var);
    }

    public static long q(long j, long j2) {
        return x0j.INSTANCE.a(j, j2);
    }

    public static String r(long j) {
        return "ValueTimeMark(reading=" + j + ')';
    }

    @Override // tb.r84, tb.stt
    public long D() {
        return f(this.f22230a);
    }

    @Override // tb.r84
    /* renamed from: F */
    public int compareTo(r84 r84Var) {
        return r84.a.a(this, r84Var);
    }

    @Override // tb.r84
    public long G(r84 r84Var) {
        ckf.g(r84Var, "other");
        return o(this.f22230a, r84Var);
    }

    @Override // tb.r84
    public boolean H() {
        return i(this.f22230a);
    }

    @Override // tb.r84
    public boolean I() {
        return j(this.f22230a);
    }

    @Override // tb.r84
    public boolean equals(Object obj) {
        return g(this.f22230a, obj);
    }

    @Override // tb.r84
    public int hashCode() {
        return k(this.f22230a);
    }

    public long m(long j) {
        return n(this.f22230a, j);
    }

    public long p(long j) {
        return q(this.f22230a, j);
    }

    public final /* synthetic */ long s() {
        return this.f22230a;
    }

    public String toString() {
        return r(this.f22230a);
    }

    public static long e(long j) {
        return j;
    }
}
