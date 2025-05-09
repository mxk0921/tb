package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class g10 implements j9e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782771);
        t2o.a(491782775);
    }

    @Override // tb.j9e
    public List<aaw> a(List<aaw> list, a69 a69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a5885aae", new Object[]{this, list, a69Var});
        }
        int c = c(a69Var);
        for (aaw aawVar : list) {
            aawVar.g(b(c, aawVar));
        }
        Collections.sort(list);
        return list;
    }

    public final int b(int i, aaw aawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60036a89", new Object[]{this, new Integer(i), aawVar})).intValue();
        }
        return Math.abs(i - aawVar.f().b().centerY());
    }

    public abstract int c(a69 a69Var);
}
