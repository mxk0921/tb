package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class g11 extends e11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public e11 b;

    static {
        t2o.a(839909441);
    }

    public g11(f11 f11Var) {
        super(f11Var);
    }

    public static /* synthetic */ Object ipc$super(g11 g11Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/ability/invoker/ApiMiddleware");
    }

    public g11 b(g11 g11Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g11) ipChange.ipc$dispatch("a821a03a", new Object[]{this, g11Var});
        }
        this.b = g11Var;
        return g11Var;
    }
}
