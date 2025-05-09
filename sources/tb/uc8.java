package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uc8 extends j68 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IDENTITY = "empty";

    static {
        t2o.a(157286415);
    }

    public static /* synthetic */ Object ipc$super(uc8 uc8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/expr/op/EmptyOperator");
    }

    @Override // tb.j68
    public Stack a(Stack stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("cb66413", new Object[]{this, stack});
        }
        stack.push(Boolean.valueOf(b(stack.pop())));
        return stack;
    }

    @Override // tb.j68
    public boolean d(Stack stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c280ad5", new Object[]{this, stack})).booleanValue();
        }
        return false;
    }

    @Override // tb.j68
    public boolean f(Stack stack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a26dc7a", new Object[]{this, stack})).booleanValue();
        }
        if (stack == null || stack.size() < 1) {
            return false;
        }
        return true;
    }
}
