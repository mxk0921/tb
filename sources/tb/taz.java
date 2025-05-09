package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class taz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gaz f28605a;

    static {
        t2o.a(598737379);
    }

    public taz() {
        this(null, 1, null);
    }

    public final gaz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gaz) ipChange.ipc$dispatch("1a2c2dcc", new Object[]{this});
        }
        return this.f28605a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof taz) && ckf.b(this.f28605a, ((taz) obj).f28605a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.f28605a.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LayoutMetrics(frame=" + this.f28605a + ')';
    }

    public taz(gaz gazVar) {
        ckf.g(gazVar, "frame");
        this.f28605a = gazVar;
    }

    public /* synthetic */ taz(gaz gazVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? new gaz(0L, 0L, 3, null) : gazVar);
    }
}
