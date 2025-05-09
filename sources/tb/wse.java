package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class wse implements yse {

    /* renamed from: a  reason: collision with root package name */
    public final f5k f30891a;

    public wse(f5k f5kVar) {
        this.f30891a = f5kVar;
    }

    @Override // tb.yse
    public f5k getList() {
        return this.f30891a;
    }

    @Override // tb.yse
    public boolean isActive() {
        return false;
    }

    public String toString() {
        if (dv6.b()) {
            return getList().p("New");
        }
        return super.toString();
    }
}
