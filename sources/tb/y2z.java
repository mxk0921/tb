package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class y2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f31817a;
    public final float b;
    public final float c;
    public final float d;

    static {
        t2o.a(598737002);
    }

    public y2z(float f, float f2, float f3, float f4) {
        this.f31817a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("125d2b71", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("544cdfb8", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public final float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f117cb3", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4531e87a", new Object[]{this})).floatValue();
        }
        return this.f31817a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2z)) {
            return false;
        }
        y2z y2zVar = (y2z) obj;
        if (ckf.b(Float.valueOf(this.f31817a), Float.valueOf(y2zVar.f31817a)) && ckf.b(Float.valueOf(this.b), Float.valueOf(y2zVar.b)) && ckf.b(Float.valueOf(this.c), Float.valueOf(y2zVar.c)) && ckf.b(Float.valueOf(this.d), Float.valueOf(y2zVar.d))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((Float.floatToIntBits(this.f31817a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Corner(topStart=" + this.f31817a + ", topEnd=" + this.b + ", bottomEnd=" + this.c + ", bottomStart=" + this.d + ')';
    }
}
