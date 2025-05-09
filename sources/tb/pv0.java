package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pv0 extends i68 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IDENTITY = "and";

    static {
        t2o.a(912262874);
    }

    public static /* synthetic */ Object ipc$super(pv0 pv0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/utils/operator/AndOperator");
    }

    @Override // tb.i68
    public Stack a(Stack stack) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("cb66413", new Object[]{this, stack});
        }
        Object pop = stack.pop();
        Object pop2 = stack.pop();
        if (!i68.e(pop) || !i68.e(pop2)) {
            z = false;
        }
        stack.push(Boolean.valueOf(z));
        return stack;
    }

    @Override // tb.i68
    public boolean d(Stack stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c280ad5", new Object[]{this, stack})).booleanValue();
        }
        if (!i68.e(stack.peek())) {
            return true;
        }
        return false;
    }

    @Override // tb.i68
    public boolean f(Stack stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a26dc7a", new Object[]{this, stack})).booleanValue();
        }
        if (stack == null || stack.size() < 2) {
            return false;
        }
        return true;
    }
}
