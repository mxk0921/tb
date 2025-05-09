package tb;

import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zlh<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f32847a;
    public final Throwable b;

    public zlh(V v) {
        this.f32847a = v;
        this.b = null;
    }

    public Throwable a() {
        return this.b;
    }

    public V b() {
        return this.f32847a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlh)) {
            return false;
        }
        zlh zlhVar = (zlh) obj;
        if (b() != null && b().equals(zlhVar.b())) {
            return true;
        }
        if (a() == null || zlhVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public zlh(Throwable th) {
        this.b = th;
        this.f32847a = null;
    }
}
