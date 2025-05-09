package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xx5 implements uvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte f31656a;
    public Object b;

    static {
        t2o.a(444597920);
        t2o.a(444597921);
    }

    public xx5(byte b) {
        this.f31656a = b;
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        return this.b;
    }

    public void b(lg5 lg5Var, gh5 gh5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e5d38c", new Object[]{this, lg5Var, gh5Var});
        } else {
            this.b = zx5.a(gh5Var, lg5Var, this.f31656a);
        }
    }
}
