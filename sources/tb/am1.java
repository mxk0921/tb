package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class am1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<zl1> f15832a;
    public String b;
    public String c;

    static {
        t2o.a(815793215);
    }

    public am1() {
        this(null, null, null, 7, null);
    }

    public final List<zl1> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6d441474", new Object[]{this});
        }
        return this.f15832a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7950f30f", new Object[]{this});
        }
        return this.b;
    }

    public final void c(List<zl1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f375c1d8", new Object[]{this, list});
        } else {
            this.f15832a = list;
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7994b307", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330b2aaf", new Object[]{this, str});
        } else {
            this.b = str;
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
        if (!(obj instanceof am1)) {
            return false;
        }
        am1 am1Var = (am1) obj;
        if (ckf.b(this.f15832a, am1Var.f15832a) && ckf.b(this.b, am1Var.b) && ckf.b(this.c, am1Var.c)) {
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
        List<zl1> list = this.f15832a;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i4 = i * 31;
        String str = this.b;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BGWordsResult(bgWordsList=" + this.f15832a + ", suggestRn=" + this.b + ", dataFrom=" + this.c + ')';
    }

    public am1(List<zl1> list, String str, String str2) {
        this.f15832a = list;
        this.b = str;
        this.c = str2;
    }

    public /* synthetic */ am1(List list, String str, String str2, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
