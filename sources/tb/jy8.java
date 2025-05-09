package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jy8 implements m94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final m94 f22283a;
    public final Throwable b;

    static {
        t2o.a(768606241);
        t2o.a(768606240);
    }

    public jy8(m94 m94Var, Throwable th) {
        this.f22283a = m94Var;
        this.b = th;
    }

    @Override // tb.m94
    public void a(i94 i94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13bf6a64", new Object[]{this, i94Var});
            return;
        }
        i94Var.e().reset();
        String name = getName();
        vhh.b(name, "failed from state: " + this.f22283a.getName(), this.b);
    }

    @Override // tb.m94
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "FailureState";
    }
}
