package tb;

import kotlin.time.DurationUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class x0j {
    public static final x0j INSTANCE = new x0j();

    /* renamed from: a  reason: collision with root package name */
    public static final long f31052a = System.nanoTime();

    public final long a(long j, long j2) {
        return bkh.c(j, DurationUnit.NANOSECONDS, j2);
    }

    public final long b(long j, long j2) {
        return bkh.g(j, j2, DurationUnit.NANOSECONDS);
    }

    public final long c(long j) {
        return bkh.e(d(), j, DurationUnit.NANOSECONDS);
    }

    public final long d() {
        return System.nanoTime() - f31052a;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
