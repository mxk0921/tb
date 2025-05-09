package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class xfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchDomBean f31349a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    static {
        t2o.a(815792380);
    }

    public xfe(SearchDomBean searchDomBean, String str, String str2, String str3, String str4) {
        ckf.g(searchDomBean, "domBean");
        ckf.g(str, "type");
        ckf.g(str4, "domClass");
        this.f31349a = searchDomBean;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final SearchDomBean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchDomBean) ipChange.ipc$dispatch("dcd74d69", new Object[]{this});
        }
        return this.f31349a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5bbbad", new Object[]{this});
        }
        return this.e;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30d19e71", new Object[]{this});
        }
        return this.d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.c;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfe)) {
            return false;
        }
        xfe xfeVar = (xfe) obj;
        if (ckf.b(this.f31349a, xfeVar.f31349a) && ckf.b(this.b, xfeVar.b) && ckf.b(this.c, xfeVar.c) && ckf.b(this.d, xfeVar.d) && ckf.b(this.e, xfeVar.e)) {
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
        int hashCode = ((this.f31349a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i3 + i2) * 31) + this.e.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IconItemInfo(domBean=" + this.f31349a + ", type=" + this.b + ", text=" + this.c + ", prefix=" + this.d + ", domClass=" + this.e + ')';
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return (!ckf.b(this.b, "text") && !ckf.b(this.b, "richText")) || !TextUtils.isEmpty(this.c) || !TextUtils.isEmpty(this.d);
    }
}
