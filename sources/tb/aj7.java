package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class aj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15772a = true;
    public final int b = 90;
    public boolean c = true;
    public int d = 1;
    public final boolean e = true;
    public final int f = 270;
    public final int g = 100;
    public final int h = 2056;
    public final int i = 1080;

    static {
        t2o.a(245366901);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("157a2df0", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37796a12", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f189d00", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dec984a1", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b41facc9", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d37ff12", new Object[]{this})).booleanValue();
        }
        return this.f15772a;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc499877", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ca26b1a", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DeviceSetting{displayAuto=" + this.f15772a + ", displayAngle=" + this.b + ", cameraAuto=" + this.c + ", cameraID=" + this.d + ", algorithmAuto=" + this.e + ", algorithmAngle=" + this.f + ", maxApiLevel=" + this.g + ", minApiLevel=0}";
    }
}
