package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class hhf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<dif> f20643a;
    public boolean b;
    public final boolean c;

    static {
        t2o.a(815792407);
    }

    public hhf(List<dif> list, boolean z, boolean z2) {
        ckf.g(list, "tagList");
        this.f20643a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15d5eac4", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("786da075", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final List<dif> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2057a47e", new Object[]{this});
        }
        return this.f20643a;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb901b8f", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhf)) {
            return false;
        }
        hhf hhfVar = (hhf) obj;
        if (ckf.b(this.f20643a, hhfVar.f20643a) && this.b == hhfVar.b && this.c == hhfVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((this.f20643a.hashCode() * 31) + bbz.a(this.b)) * 31) + bbz.a(this.c);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "InteractiveInfo(tagList=" + this.f20643a + ", exposed=" + this.b + ", bottomTag=" + this.c + ')';
    }

    public /* synthetic */ hhf(List list, boolean z, boolean z2, int i, a07 a07Var) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
