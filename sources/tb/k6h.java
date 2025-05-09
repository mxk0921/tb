package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k6h implements m94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(768606244);
        t2o.a(768606240);
    }

    @Override // tb.m94
    public void a(i94 i94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13bf6a64", new Object[]{this, i94Var});
            return;
        }
        yzm e = i94Var.e();
        e.reset();
        k94 c = i94Var.c();
        e.c(c.f22492a, c.b);
        e.d(101);
        qzm d = vzm.d(i94Var.d(), c.f22492a, c.b, Build.VERSION.SDK_INT);
        if (d == null || d.a() <= 0) {
            i94Var.g(new jy8(this, new Exception("profile load failed"))).f();
        } else {
            i94Var.g(new hcf(d)).f();
        }
    }

    @Override // tb.m94
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "LoadProfile";
    }
}
