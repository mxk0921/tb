package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.solution.BHRSolution;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ir1<O, R> implements BHRSolution<O, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750394);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final void a(em1 em1Var, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b3ab26", new Object[]{this, em1Var, runnable});
        } else {
            m((kq4) em1Var, runnable);
        }
    }

    public abstract O c(kq4 kq4Var);

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final O f(em1 em1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (O) ipChange.ipc$dispatch("7711610e", new Object[]{this, em1Var});
        }
        return c((kq4) em1Var);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final boolean g(em1 em1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37d14aff", new Object[]{this, em1Var})).booleanValue();
        }
        return l((kq4) em1Var);
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final void h(em1 em1Var, R r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85240302", new Object[]{this, em1Var, r});
        } else {
            k((kq4) em1Var, r);
        }
    }

    @Override // com.taobao.android.behavir.solution.BHRSolution
    public final Map<String, String> i(em1 em1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a0c2649", new Object[]{this, em1Var});
        }
        return j((kq4) em1Var);
    }

    public abstract Map<String, String> j(kq4 kq4Var);

    public abstract void k(kq4 kq4Var, R r);

    public abstract boolean l(kq4 kq4Var);

    public abstract void m(kq4 kq4Var, Runnable runnable);
}
