package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class lwc implements mid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(589299738);
        t2o.a(589299739);
    }

    @Override // tb.mid
    @Deprecated
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f32167", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mid
    @Deprecated
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a9984a7", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mid
    @Deprecated
    public void c(String str, String str2, String str3, boolean z, wj1 wj1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f41d9021", new Object[]{this, str, str2, str3, new Boolean(z), wj1Var});
            return;
        }
        xj1 xj1Var = new xj1(null, str, z);
        xj1Var.d = str2;
        xj1Var.e = str3;
        d(xj1Var, wj1Var);
    }

    public abstract void d(xj1 xj1Var, wj1 wj1Var);

    public abstract String e(xj1 xj1Var);

    public abstract boolean f(xj1 xj1Var);

    public abstract boolean g(xj1 xj1Var);

    @Override // tb.mid
    @Deprecated
    public String getAuthToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("568bf35e", new Object[]{this});
        }
        return null;
    }
}
