package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class vzy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f30376a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;

    static {
        t2o.a(598737164);
    }

    public vzy(float f, float f2, float f3, float f4, int i) {
        this.f30376a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de70b340", new Object[]{this})).floatValue();
        }
        return this.f30376a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzy)) {
            return false;
        }
        vzy vzyVar = (vzy) obj;
        if (ckf.b(Float.valueOf(this.f30376a), Float.valueOf(vzyVar.f30376a)) && ckf.b(Float.valueOf(this.b), Float.valueOf(vzyVar.b)) && ckf.b(Float.valueOf(this.c), Float.valueOf(vzyVar.c)) && ckf.b(Float.valueOf(this.d), Float.valueOf(vzyVar.d)) && this.e == vzyVar.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((Float.floatToIntBits(this.f30376a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + this.e;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Border(leftWidth=" + this.f30376a + ", topWidth=" + this.b + ", rightWidth=" + this.c + ", bottomWidth=" + this.d + ", color=" + this.e + ')';
    }
}
