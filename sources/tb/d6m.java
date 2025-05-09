package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class d6m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17621a;
    public final String b;
    public double c;
    public double d;

    static {
        t2o.a(1004536646);
    }

    public d6m() {
        this(false, null, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, 15, null);
    }

    public final void a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d46100c", new Object[]{this, new Double(d)});
        } else {
            this.d = d;
        }
    }

    public final void b(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84bded5", new Object[]{this, new Double(d)});
        } else {
            this.c = d;
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e22cec", new Object[]{this, new Boolean(z)});
        } else {
            this.f17621a = z;
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
        if (!(obj instanceof d6m)) {
            return false;
        }
        d6m d6mVar = (d6m) obj;
        if (this.f17621a == d6mVar.f17621a && ckf.b(this.b, d6mVar.b) && Double.compare(this.c, d6mVar.c) == 0 && Double.compare(this.d, d6mVar.d) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((bbz.a(this.f17621a) * 31) + this.b.hashCode()) * 31) + Double.doubleToLongBits(this.c)) * 31) + Double.doubleToLongBits(this.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PlayControlViewModel(needShowCoverImg=" + this.f17621a + ", tag=" + this.b + ", calculateWidth=" + this.c + ", calculateHeight=" + this.d + ')';
    }

    public d6m(boolean z, String str, double d, double d2) {
        ckf.g(str, "tag");
        this.f17621a = z;
        this.b = str;
        this.c = d;
        this.d = d2;
    }

    public /* synthetic */ d6m(boolean z, String str, double d, double d2, int i, a07 a07Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "undefined" : str, (i & 4) != 0 ? 0.0d : d, (i & 8) == 0 ? d2 : vu3.b.GEO_NOT_SUPPORT);
    }
}
