package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class vop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30144a;
    public final Integer b;
    public final List<yop> c;
    public boolean d;
    public final String e;

    static {
        t2o.a(815792448);
    }

    public vop(String str, Integer num, List<yop> list, boolean z, String str2) {
        ckf.g(list, "infoList");
        ckf.g(str2, "desc");
        this.f30144a = str;
        this.b = num;
        this.c = list;
        this.d = z;
        this.e = str2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.e;
    }

    public final Integer b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("e714deb", new Object[]{this});
        }
        return this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("756e33d", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final List<yop> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("33e2efbe", new Object[]{this});
        }
        return this.c;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f30144a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vop)) {
            return false;
        }
        vop vopVar = (vop) obj;
        if (ckf.b(this.f30144a, vopVar.f30144a) && ckf.b(this.b, vopVar.b) && ckf.b(this.c, vopVar.c) && this.d == vopVar.d && ckf.b(this.e, vopVar.e)) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab1b8c7", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f30144a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = i * 31;
        Integer num = this.b;
        if (num != null) {
            i2 = num.hashCode();
        }
        return ((((((i3 + i2) * 31) + this.c.hashCode()) * 31) + bbz.a(this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ShopInfo(url=" + this.f30144a + ", guideColor=" + this.b + ", infoList=" + this.c + ", hasBackground=" + this.d + ", desc=" + this.e + ')';
    }
}
