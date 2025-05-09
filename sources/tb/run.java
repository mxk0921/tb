package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class run {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f27619a;
    public final String b;
    public final nun c;

    static {
        t2o.a(815792885);
    }

    public run(boolean z, String str, nun nunVar) {
        this.f27619a = z;
        this.b = str;
        this.c = nunVar;
    }

    public final nun a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nun) ipChange.ipc$dispatch("2c069404", new Object[]{this});
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6efc181c", new Object[]{this});
        }
        return this.b;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b52368a", new Object[]{this})).booleanValue();
        }
        return this.f27619a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof run)) {
            return false;
        }
        run runVar = (run) obj;
        if (this.f27619a == runVar.f27619a && ckf.b(this.b, runVar.b) && ckf.b(this.c, runVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int a2 = bbz.a(this.f27619a) * 31;
        String str = this.b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (a2 + i) * 31;
        nun nunVar = this.c;
        if (nunVar != null) {
            i2 = nunVar.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RefreshInfo(refreshable=" + this.f27619a + ", hint=" + this.b + ", guide=" + this.c + ')';
    }
}
