package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f2r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18966a = true;
    public final String b;
    public final String c;
    public final int d;
    public Object e;
    public String f;

    static {
        t2o.a(343933185);
    }

    public f2r(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("539dc66a", new Object[]{this});
        }
        return this.e;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3e13523", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19edfd35", new Object[]{this});
        }
        return this.f;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5f673f", new Object[]{this});
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec97f168", new Object[]{this});
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || f2r.class != obj.getClass()) {
            return false;
        }
        f2r f2rVar = (f2r) obj;
        if (this.d != f2rVar.d || !Objects.equals(this.b, f2rVar.b) || !Objects.equals(this.c, f2rVar.c)) {
            return false;
        }
        return true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48656f2b", new Object[]{this})).booleanValue();
        }
        return this.f18966a;
    }

    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bf8018", new Object[]{this, obj});
        } else {
            this.e = obj;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933ff455", new Object[]{this, new Boolean(z)});
        } else {
            this.f18966a = z;
        }
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(this.b, this.c, Integer.valueOf(this.d));
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349dcae1", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SyncMessage{serviceId='" + this.b + "', streamId='" + this.c + "', seq=" + this.d + '}';
    }
}
