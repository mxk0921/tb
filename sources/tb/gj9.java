package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gj9 implements m94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final m94 f20040a;
    public final String b;

    static {
        t2o.a(768606242);
        t2o.a(768606240);
    }

    public gj9(m94 m94Var) {
        this(m94Var, null);
    }

    @Override // tb.m94
    public void a(i94 i94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13bf6a64", new Object[]{this, i94Var});
            return;
        }
        i94Var.e().d(104);
        if (this.b == null) {
            String name = getName();
            vhh.a(name, "finished from state: " + this.f20040a.getName());
            return;
        }
        String name2 = getName();
        vhh.a(name2, "finished from state: " + this.f20040a.getName() + " due to " + this.b);
    }

    @Override // tb.m94
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "FinishedState";
    }

    public gj9(m94 m94Var, String str) {
        this.f20040a = m94Var;
        this.b = str;
    }
}
