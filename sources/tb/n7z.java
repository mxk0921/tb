package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n7z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24563a;
    public final List<o7z> b;
    public final List<m7z> c;
    public final int d;

    static {
        t2o.a(598737374);
    }

    public /* synthetic */ n7z(String str, List list, List list2, int i, a07 a07Var) {
        this(str, list, list2, i);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a02426c7", new Object[]{this})).intValue();
        }
        List<o7z> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final List<m7z> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9ffd5ebe", new Object[]{this});
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7z)) {
            return false;
        }
        n7z n7zVar = (n7z) obj;
        if (ckf.b(this.f24563a, n7zVar.f24563a) && ckf.b(this.b, n7zVar.b) && ckf.b(this.c, n7zVar.c) && u6z.c(this.d, n7zVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = this.f24563a.hashCode() * 31;
        List<o7z> list = this.b;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        List<m7z> list2 = this.c;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return ((i3 + i2) * 31) + u6z.d(this.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FuncInfo(name=" + this.f24563a + ", params=" + this.b + ", codeInfos=" + this.c + ", returnType=" + ((Object) u6z.e(this.d)) + ')';
    }

    public n7z(String str, List<o7z> list, List<m7z> list2, int i) {
        this.f24563a = str;
        this.b = list;
        this.c = list2;
        this.d = i;
    }
}
