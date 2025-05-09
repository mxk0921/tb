package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class f4m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18999a;
    public final String b;
    public final List<String> c;
    public boolean d;
    public final String e;

    static {
        t2o.a(815792421);
    }

    public f4m(String str, String str2, List<String> list, boolean z, String str3) {
        ckf.g(str3, DxContainerActivity.PARAMS_NAMESPACE);
        this.f18999a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = str3;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6aeb9dd", new Object[]{this});
        }
        return this.f18999a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e990d94", new Object[]{this});
        }
        return this.e;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f84d441c", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57be8cdb", new Object[]{this});
        }
        return this.b;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
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
        if (!(obj instanceof f4m)) {
            return false;
        }
        f4m f4mVar = (f4m) obj;
        if (ckf.b(this.f18999a, f4mVar.f18999a) && ckf.b(this.b, f4mVar.b) && ckf.b(this.c, f4mVar.c) && this.d == f4mVar.d && ckf.b(this.e, f4mVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f18999a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = i * 31;
        String str2 = this.b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        List<String> list = this.c;
        if (list != null) {
            i3 = list.hashCode();
        }
        return ((((i5 + i3) * 31) + bbz.a(this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PkButtonInfo(defText=" + this.f18999a + ", selectedText=" + this.b + ", extraParamsKey=" + this.c + ", selected=" + this.d + ", nameSpace=" + this.e + ')';
    }
}
