package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class cvm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17353a;
    public final String b;
    public final String c;

    static {
        t2o.a(839909831);
    }

    public cvm(String str, String str2, String str3) {
        ckf.g(str, "name");
        ckf.g(str2, "appId");
        ckf.g(str3, "navigationUrl");
        this.f17353a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f17353a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvm)) {
            return false;
        }
        cvm cvmVar = (cvm) obj;
        if (ckf.b(this.f17353a, cvmVar.f17353a) && ckf.b(this.b, cvmVar.b) && ckf.b(this.c, cvmVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((this.f17353a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PresetBaseInfo(name=" + this.f17353a + ", appId=" + this.b + ", navigationUrl=" + this.c + ')';
    }
}
