package tb;

import androidx.core.util.Predicate;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final /* synthetic */ class ref implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f27317a;

    public /* synthetic */ ref(String str) {
        this.f27317a = str;
    }

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
    public final boolean test(Object obj) {
        return this.f27317a.equals((String) obj);
    }
}
