package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ndz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hoz f24670a;
    public final jkz b;

    static {
        t2o.a(598737025);
    }

    public ndz(hoz hozVar, jkz jkzVar) {
        ckf.g(jkzVar, "props");
        this.f24670a = hozVar;
        this.b = jkzVar;
    }

    public final hoz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hoz) ipChange.ipc$dispatch("fe4676b", new Object[]{this});
        }
        return this.f24670a;
    }

    public final jkz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("ab805e8e", new Object[]{this});
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
        if (!(obj instanceof ndz)) {
            return false;
        }
        ndz ndzVar = (ndz) obj;
        if (ckf.b(this.f24670a, ndzVar.f24670a) && ckf.b(this.b, ndzVar.b)) {
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
        hoz hozVar = this.f24670a;
        if (hozVar != null) {
            i = hozVar.hashCode();
        }
        return (i * 31) + this.b.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MeasurePolicyCreateParams(delegate=" + this.f24670a + ", props=" + this.b + ')';
    }
}
