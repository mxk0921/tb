package tb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e4g {
    public static final e4g COMPOSITION = new e4g("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f18271a;
    public f4g b;

    public e4g(String... strArr) {
        this.f18271a = Arrays.asList(strArr);
    }

    public e4g a(String str) {
        e4g e4gVar = new e4g(this);
        e4gVar.f18271a.add(str);
        return e4gVar;
    }

    public final boolean b() {
        List<String> list = this.f18271a;
        return list.get(list.size() - 1).equals("**");
    }

    public boolean c(String str, int i) {
        boolean z;
        boolean z2;
        List<String> list = this.f18271a;
        if (i >= list.size()) {
            return false;
        }
        if (i == list.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = list.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((z || (i == list.size() - 2 && b())) && z2) {
                return true;
            }
            return false;
        } else if (z || !list.get(i + 1).equals(str)) {
            if (z) {
                return true;
            }
            int i2 = i + 1;
            if (i2 < list.size() - 1) {
                return false;
            }
            return list.get(i2).equals(str);
        } else if (i == list.size() - 2 || (i == list.size() - 3 && b())) {
            return true;
        } else {
            return false;
        }
    }

    public f4g d() {
        return this.b;
    }

    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        List<String> list = this.f18271a;
        if (!list.get(i).equals("**")) {
            return 1;
        }
        if (i != list.size() - 1 && list.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e4g.class != obj.getClass()) {
            return false;
        }
        e4g e4gVar = (e4g) obj;
        if (!this.f18271a.equals(e4gVar.f18271a)) {
            return false;
        }
        f4g f4gVar = this.b;
        f4g f4gVar2 = e4gVar.b;
        if (f4gVar != null) {
            return f4gVar.equals(f4gVar2);
        }
        if (f4gVar2 == null) {
            return true;
        }
        return false;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    public boolean g(String str, int i) {
        if (f(str)) {
            return true;
        }
        List<String> list = this.f18271a;
        if (i >= list.size()) {
            return false;
        }
        if (list.get(i).equals(str) || list.get(i).equals("**") || list.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    public boolean h(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f18271a;
        if (i < list.size() - 1 || list.get(i).equals("**")) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f18271a.hashCode() * 31;
        f4g f4gVar = this.b;
        if (f4gVar != null) {
            i = f4gVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public e4g i(f4g f4gVar) {
        e4g e4gVar = new e4g(this);
        e4gVar.b = f4gVar;
        return e4gVar;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f18271a);
        sb.append(",resolved=");
        if (this.b != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    public e4g(e4g e4gVar) {
        this.f18271a = new ArrayList(e4gVar.f18271a);
        this.b = e4gVar.b;
    }
}
