package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class k8n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f22472a;
    public final s29 b;

    static {
        t2o.a(1007681588);
    }

    public k8n(String str, s29 s29Var) {
        ckf.g(str, "itemId");
        ckf.g(s29Var, "callback");
        this.f22472a = str;
        this.b = s29Var;
    }

    public final s29 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s29) ipChange.ipc$dispatch("213a546d", new Object[]{this});
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.f22472a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8n)) {
            return false;
        }
        k8n k8nVar = (k8n) obj;
        if (ckf.b(this.f22472a, k8nVar.f22472a) && ckf.b(this.b, k8nVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (this.f22472a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "QueryStatusRequest(itemId=" + this.f22472a + ", callback=" + this.b + ')';
    }
}
