package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class g1n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19681a;
    public final String b;
    public final boolean c;
    public final boolean d;

    static {
        t2o.a(815792440);
    }

    public g1n(String str, String str2, boolean z, boolean z2) {
        ckf.g(str, "propertyName");
        ckf.g(str2, "propertyValue");
        this.f19681a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34215713", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7424843", new Object[]{this});
        }
        return this.f19681a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4edc7dd3", new Object[]{this});
        }
        return this.b;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c6ab047", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1n)) {
            return false;
        }
        g1n g1nVar = (g1n) obj;
        if (ckf.b(this.f19681a, g1nVar.f19681a) && ckf.b(this.b, g1nVar.b) && this.c == g1nVar.c && this.d == g1nVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((this.f19681a.hashCode() * 31) + this.b.hashCode()) * 31) + bbz.a(this.c)) * 31) + bbz.a(this.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PropertyItemInfo(propertyName=" + this.f19681a + ", propertyValue=" + this.b + ", priceProperty=" + this.c + ", singleRow=" + this.d + ')';
    }
}
