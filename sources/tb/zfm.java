package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class zfm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f32727a;
    public float b;
    public float c;
    public float d;

    static {
        t2o.a(786432017);
    }

    public zfm() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public final float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b54e726", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c680af82", new Object[]{this})).floatValue();
        }
        return this.f32727a;
    }

    public final float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d0002b", new Object[]{this})).floatValue();
        }
        return this.c;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3710f6a4", new Object[]{this})).floatValue();
        }
        return this.b;
    }

    public final void e(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ade73be", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof zfm) {
                zfm zfmVar = (zfm) obj;
                if (!(Float.compare(this.f32727a, zfmVar.f32727a) == 0 && Float.compare(this.b, zfmVar.b) == 0 && Float.compare(this.c, zfmVar.c) == 0 && Float.compare(this.d, zfmVar.d) == 0)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406c43e2", new Object[]{this, new Float(f)});
        } else {
            this.f32727a = f;
        }
    }

    public final void g(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772d03f1", new Object[]{this, new Float(f)});
        } else {
            this.c = f;
        }
    }

    public final void h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7304af98", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((Float.floatToIntBits(this.f32727a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PopMargins(leftMargin=" + this.f32727a + ", topMargin=" + this.b + ", rightMargin=" + this.c + ", bottomMargin=" + this.d + f7l.BRACKET_END_STR;
    }

    public zfm(float f, float f2, float f3, float f4) {
        this.f32727a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public /* synthetic */ zfm(float f, float f2, float f3, float f4, int i, a07 a07Var) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}
