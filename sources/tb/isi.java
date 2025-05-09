package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class isi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f21550a;
    public final BaseTypedBean b;
    public final String c;

    static {
        t2o.a(993001488);
    }

    public isi(String str, BaseTypedBean baseTypedBean, String str2) {
        ckf.g(str, "type");
        ckf.g(baseTypedBean, "bean");
        this.f21550a = str;
        this.b = baseTypedBean;
        this.c = str2;
    }

    public final BaseTypedBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTypedBean) ipChange.ipc$dispatch("76b65642", new Object[]{this});
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.f21550a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isi)) {
            return false;
        }
        isi isiVar = (isi) obj;
        if (ckf.b(this.f21550a, isiVar.f21550a) && ckf.b(this.b, isiVar.b) && ckf.b(this.c, isiVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = ((this.f21550a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MetaMod(type=" + this.f21550a + ", bean=" + this.b + ", id=" + this.c + ')';
    }
}
