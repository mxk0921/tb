package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r0m implements m94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(768606245);
        t2o.a(768606240);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.m94
    public void a(i94 i94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13bf6a64", new Object[]{this, i94Var});
            return;
        }
        switch (i94Var.e().a()) {
            case 103:
                i94Var.g(new k6h()).f();
                return;
            case 104:
                i94Var.g(new gj9(this, "finished before")).f();
                return;
            case 105:
                if (i94Var.c().e) {
                    i94Var.g(new gj9(this, "invoked before")).f();
                    return;
                }
                break;
        }
        i94Var.g(new k6h()).f();
    }

    @Override // tb.m94
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "PhaseCheck";
    }
}
