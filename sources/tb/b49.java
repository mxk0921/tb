package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class b49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16171a;
    public final String b;

    static {
        t2o.a(481297066);
    }

    public b49(String str, String str2) {
        ckf.g(str, "feats");
        ckf.g(str2, "extraInfo");
        this.f16171a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b49)) {
            return false;
        }
        b49 b49Var = (b49) obj;
        if (ckf.b(this.f16171a, b49Var.f16171a) && ckf.b(this.b, b49Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (this.f16171a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FeatureExtractionOutput(feats=" + this.f16171a + ", extraInfo=" + this.b + ')';
    }
}
