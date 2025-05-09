package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class xyn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31699a;
    public final mh7 b;

    static {
        t2o.a(481297386);
    }

    public xyn(boolean z, mh7 mh7Var) {
        ckf.g(mh7Var, "bean");
        this.f31699a = z;
        this.b = mh7Var;
    }

    public final mh7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mh7) ipChange.ipc$dispatch("88f49245", new Object[]{this});
        }
        return this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f84d441c", new Object[]{this})).booleanValue();
        }
        return this.f31699a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyn)) {
            return false;
        }
        xyn xynVar = (xyn) obj;
        if (this.f31699a == xynVar.f31699a && ckf.b(this.b, xynVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        boolean z = this.f31699a;
        if (!z) {
            i = z ? 1 : 0;
        }
        return (i * 31) + this.b.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoteRegion(selected=" + this.f31699a + ", bean=" + this.b + ')';
    }
}
