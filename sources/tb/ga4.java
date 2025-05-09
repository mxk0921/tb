package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ga4 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f19828a;
    public final g1a<Throwable, xhv> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ga4(Object obj, g1a<? super Throwable, xhv> g1aVar) {
        this.f19828a = obj;
        this.b = g1aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga4)) {
            return false;
        }
        ga4 ga4Var = (ga4) obj;
        if (ckf.b(this.f19828a, ga4Var.f19828a) && ckf.b(this.b, ga4Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        Object obj = this.f19828a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return (i * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f19828a + ", onCancellation=" + this.b + ')';
    }
}
