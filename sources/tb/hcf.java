package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hcf implements m94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qzm f20539a;

    static {
        t2o.a(768606243);
        t2o.a(768606240);
    }

    public hcf(qzm qzmVar) {
        this.f20539a = qzmVar;
    }

    @Override // tb.m94
    public void a(i94 i94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13bf6a64", new Object[]{this, i94Var});
            return;
        }
        yzm e = i94Var.e();
        e.b(this.f20539a.a());
        e.d(102);
        if (!uzm.b(i94Var.d(), this.f20539a)) {
            i94Var.g(new jy8(this, new Exception("write profile failed"))).f();
        } else if (i94Var.c().c == 0) {
            wzm wzmVar = new wzm();
            wzmVar.g(i94Var.c().c);
            wzmVar.h(-1L, -1L, -1L, 0);
            i94Var.g(new gj9(this, "POLICY_COPY_ONLY")).f();
        } else {
            i94Var.g(new l94()).f();
        }
    }

    @Override // tb.m94
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "WriteProfile";
    }
}
