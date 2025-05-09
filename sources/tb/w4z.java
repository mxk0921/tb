package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.v4z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class w4z implements v4z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final float f30466a;
    public final float b;

    static {
        t2o.a(598737153);
        t2o.a(598737151);
    }

    public w4z(float f, float f2) {
        this.f30466a = f;
        this.b = f2;
    }

    public float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce98117c", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    @Override // tb.v4z
    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42d3ac29", new Object[]{this})).floatValue();
        }
        return this.f30466a;
    }

    @Override // tb.v4z
    public float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c83f406", new Object[]{this, new Float(f)})).floatValue();
        }
        return v4z.a.b(this, f);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4z)) {
            return false;
        }
        w4z w4zVar = (w4z) obj;
        if (ckf.b(Float.valueOf(b()), Float.valueOf(w4zVar.b())) && ckf.b(Float.valueOf(a()), Float.valueOf(w4zVar.a()))) {
            return true;
        }
        return false;
    }

    @Override // tb.v4z
    public int f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa51101b", new Object[]{this, new Float(f)})).intValue();
        }
        return v4z.a.a(this, f);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (Float.floatToIntBits(b()) * 31) + Float.floatToIntBits(a());
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DensityImpl(density=" + b() + ", fontScale=" + a() + ')';
    }
}
