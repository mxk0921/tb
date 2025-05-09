package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class cmz implements ofz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f17160a;
    public boolean b;
    public final d3z c;

    static {
        t2o.a(598737098);
        t2o.a(598737400);
    }

    public cmz() {
        this(0.0f, false, null, 7, null);
    }

    public final d3z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d3z) ipChange.ipc$dispatch("f6ee7c82", new Object[]{this});
        }
        return this.c;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50533e04", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975182e5", new Object[]{this})).floatValue();
        }
        return this.f17160a;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1668f548", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e944b6df", new Object[]{this, new Float(f)});
        } else {
            this.f17160a = f;
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
        if (!(obj instanceof cmz)) {
            return false;
        }
        cmz cmzVar = (cmz) obj;
        if (ckf.b(Float.valueOf(this.f17160a), Float.valueOf(cmzVar.f17160a)) && this.b == cmzVar.b && ckf.b(this.c, cmzVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int floatToIntBits = Float.floatToIntBits(this.f17160a) * 31;
        boolean z = this.b;
        if (!z) {
            i2 = z ? 1 : 0;
        }
        int i3 = (floatToIntBits + i2) * 31;
        d3z d3zVar = this.c;
        if (d3zVar != null) {
            i = d3zVar.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RowColumnParentData(weight=" + this.f17160a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ')';
    }

    public cmz(float f, boolean z, d3z d3zVar) {
        this.f17160a = f;
        this.b = z;
        this.c = d3zVar;
    }

    public /* synthetic */ cmz(float f, boolean z, d3z d3zVar, int i, a07 a07Var) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : d3zVar);
    }
}
