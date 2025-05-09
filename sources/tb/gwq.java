package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gwq {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20273a;
    public final ewq b;
    public final int c;
    public volatile boolean d = true;

    public gwq(Object obj, ewq ewqVar, int i) {
        this.f20273a = obj;
        this.b = ewqVar;
        this.c = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gwq)) {
            return false;
        }
        gwq gwqVar = (gwq) obj;
        if (this.f20273a != gwqVar.f20273a || !this.b.equals(gwqVar.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f20273a.hashCode() + this.b.d.hashCode();
    }
}
