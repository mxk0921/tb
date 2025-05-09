package tb;

import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c8y {

    /* renamed from: a  reason: collision with root package name */
    public String f16918a;
    public String b;
    public String c;
    public String d;

    static {
        t2o.a(253755455);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c8y.class != obj.getClass()) {
            return false;
        }
        c8y c8yVar = (c8y) obj;
        if (!Objects.equals(this.f16918a, c8yVar.f16918a) || !Objects.equals(this.b, c8yVar.b) || !Objects.equals(this.c, c8yVar.c) || !Objects.equals(this.d, c8yVar.d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.f16918a, this.b, this.c, this.d);
    }

    public String toString() {
        return "TargetInfo{name='" + this.f16918a + "', packageName='" + this.b + "', authorities='" + this.c + "', action='" + this.d + "'}";
    }
}
