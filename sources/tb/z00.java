package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Deprecated;
import kotlin.Metadata;
import tb.r84;

/* compiled from: Taobao */
@Deprecated(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class z00 {

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001f¨\u0006 "}, d2 = {"Ltb/z00$a;", "Ltb/r84;", "", "startedAt", "Ltb/z00;", "timeSource", "Ltb/s08;", "offset", "<init>", "(DLtb/z00;JLtb/a07;)V", TLogTracker.LEVEL_DEBUG, "()J", "duration", "c", "(J)Ltb/r84;", "other", "G", "(Ltb/r84;)J", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", TplMsg.VALUE_T_NATIVE_RETURN, "Ltb/z00;", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements r84 {

        /* renamed from: a  reason: collision with root package name */
        private final double f32440a;
        private final z00 b;
        private final long c;

        private a(double d, z00 z00Var, long j) {
            ckf.g(z00Var, "timeSource");
            throw null;
        }

        @Override // tb.r84, tb.stt
        public long D() {
            throw null;
        }

        @Override // tb.r84
        public r84 E(long j) {
            return r84.a.d(this, j);
        }

        @Override // tb.r84
        /* renamed from: F */
        public int compareTo(r84 r84Var) {
            return r84.a.a(this, r84Var);
        }

        @Override // tb.r84
        public long G(r84 r84Var) {
            ckf.g(r84Var, "other");
            if (r84Var instanceof a) {
                a aVar = (a) r84Var;
                if (ckf.b(null, null)) {
                    if (s08.o(this.c, aVar.c) && s08.S(this.c)) {
                        return s08.Companion.c();
                    }
                    s08.V(this.c, aVar.c);
                    throw null;
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + r84Var);
        }

        @Override // tb.r84
        public boolean H() {
            return r84.a.b(this);
        }

        @Override // tb.r84
        public boolean I() {
            return r84.a.c(this);
        }

        @Override // tb.r84
        public boolean equals(Object obj) {
            if (obj instanceof a) {
                ((a) obj).getClass();
                if (ckf.b(null, null) && s08.o(G((r84) obj), s08.Companion.c())) {
                    return true;
                }
            }
            return false;
        }

        @Override // tb.r84
        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder("DoubleTimeMark(").append(this.f32440a);
            throw null;
        }

        public /* synthetic */ a(double d, z00 z00Var, long j, a07 a07Var) {
            this(d, z00Var, j);
            throw null;
        }

        @Override // tb.r84
        public r84 c(long j) {
            new a(this.f32440a, null, s08.W(this.c, j), null);
            throw null;
        }
    }
}
