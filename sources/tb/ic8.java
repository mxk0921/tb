package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ic8 implements yse {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21235a;

    public ic8(boolean z) {
        this.f21235a = z;
    }

    @Override // tb.yse
    public f5k getList() {
        return null;
    }

    @Override // tb.yse
    public boolean isActive() {
        return this.f21235a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (isActive()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
