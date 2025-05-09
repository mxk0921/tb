package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class zj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tj1 f32801a = new tj1();
    public final qj1 b = new qj1();
    public boolean c;

    static {
        t2o.a(843055336);
    }

    public final qj1 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qj1) ipChange.ipc$dispatch("a162f319", new Object[]{this});
        }
        return this.b;
    }

    public final tj1 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tj1) ipChange.ipc$dispatch("f011611", new Object[]{this});
        }
        return this.f32801a;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a1c39c2", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5deaa9e", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
