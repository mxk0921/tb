package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class z08 implements rmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<ggc> f32445a;

    static {
        t2o.a(350224391);
        t2o.a(350224392);
    }

    public z08(Stack<ggc> stack) {
        this.f32445a = stack;
    }

    public wao a(DXEvent dXEvent, Object[] objArr, jh3 jh3Var) {
        ggc pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("5b8a824b", new Object[]{this, dXEvent, objArr, jh3Var});
        }
        Stack<ggc> stack = this.f32445a;
        if (stack == null || stack.empty() || (pop = this.f32445a.pop()) == null) {
            return wao.a();
        }
        return pop.a(new z08(this.f32445a), dXEvent, objArr, jh3Var);
    }
}
