package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class d6i {

    /* renamed from: a  reason: collision with root package name */
    public final String f17620a;
    public final aef b;

    public d6i(String str, aef aefVar) {
        ckf.g(str, "value");
        ckf.g(aefVar, x96.REFRESH_TYPE_RANGE);
        this.f17620a = str;
        this.b = aefVar;
    }

    public final String a() {
        return this.f17620a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6i)) {
            return false;
        }
        d6i d6iVar = (d6i) obj;
        if (ckf.b(this.f17620a, d6iVar.f17620a) && ckf.b(this.b, d6iVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f17620a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f17620a + ", range=" + this.b + ')';
    }
}
