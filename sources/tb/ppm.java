package tb;

import androidx.core.util.Predicate;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final /* synthetic */ class ppm {
    public static Predicate a(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: tb.npm
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return ppm.a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate3) {
                return ppm.c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return ppm.d(Predicate.this, predicate2, obj);
            }
        };
    }

    public static Predicate b(final Predicate predicate) {
        return new Predicate() { // from class: tb.opm
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return ppm.a(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate2) {
                return ppm.c(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return ppm.e(Predicate.this, obj);
            }
        };
    }

    public static Predicate c(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: tb.kpm
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return ppm.a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate3) {
                return ppm.c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return ppm.f(Predicate.this, predicate2, obj);
            }
        };
    }

    public static /* synthetic */ boolean d(Predicate predicate, Predicate predicate2, Object obj) {
        if (!predicate.test(obj) || !predicate2.test(obj)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    public static /* synthetic */ boolean f(Predicate predicate, Predicate predicate2, Object obj) {
        if (predicate.test(obj) || predicate2.test(obj)) {
            return true;
        }
        return false;
    }

    public static <T> Predicate<T> g(final Object obj) {
        if (obj == null) {
            return new Predicate() { // from class: tb.lpm
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return ppm.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return ppm.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return ppm.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj2) {
                    boolean a2;
                    a2 = jpm.a(obj2);
                    return a2;
                }
            };
        }
        return new Predicate() { // from class: tb.mpm
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return ppm.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return ppm.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return ppm.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                boolean equals;
                equals = obj.equals(obj2);
                return equals;
            }
        };
    }

    public static <T> Predicate<T> j(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return (Predicate<? super T>) predicate.negate();
    }
}
