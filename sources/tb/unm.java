package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class unm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29513a;
    public final int b;
    public final int c;
    public final boolean d;

    static {
        t2o.a(157286858);
    }

    public unm() {
        this(null, 0, 0, false, 15, null);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f29513a;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bba848e8", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof unm) {
                unm unmVar = (unm) obj;
                if (!(ckf.b(this.f29513a, unmVar.f29513a) && this.b == unmVar.b && this.c == unmVar.c && this.d == unmVar.d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f29513a;
        if (str != null) {
            i = str.hashCode();
        }
        int i3 = ((((i * 31) + this.b) * 31) + this.c) * 31;
        boolean z = this.d;
        if (!z) {
            i2 = z ? 1 : 0;
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreRequestImage(url=" + this.f29513a + ", width=" + this.b + ", height=" + this.c + ", isDecideUrl=" + this.d + f7l.BRACKET_END_STR;
    }

    public unm(String str, int i, int i2, boolean z) {
        ckf.g(str, "url");
        this.f29513a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public /* synthetic */ unm(String str, int i, int i2, boolean z, int i3, a07 a07Var) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 320 : i, (i3 & 4) != 0 ? 320 : i2, (i3 & 8) != 0 ? false : z);
    }
}
