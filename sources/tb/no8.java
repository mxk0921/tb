package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class no8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24859a;
    public final boolean b;
    public final int c;

    static {
        t2o.a(839909950);
    }

    public no8(String str, boolean z, int i) {
        ckf.g(str, "groupName");
        this.f24859a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f1294e0", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc05d085", new Object[]{this});
        }
        return this.f24859a;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1db05a83", new Object[]{this})).booleanValue();
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
        if (!(obj instanceof no8)) {
            return false;
        }
        no8 no8Var = (no8) obj;
        if (ckf.b(this.f24859a, no8Var.f24859a) && this.b == no8Var.b && this.c == no8Var.c) {
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
        int hashCode = this.f24859a.hashCode() * 31;
        boolean z = this.b;
        if (!z) {
            i = z ? 1 : 0;
        }
        return ((hashCode + i) * 31) + this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ExperimentGroupDetail(groupName=" + this.f24859a + ", isExperimentGroup=" + this.b + ", index=" + this.c + ')';
    }
}
