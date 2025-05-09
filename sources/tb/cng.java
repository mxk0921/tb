package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.Node;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cng<T, R> extends hfu<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public cng(mc7<T, R> mc7Var) {
        super(mc7Var);
    }

    public static /* synthetic */ Object ipc$super(cng cngVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/job/core/graph/LevelOrderTraverser");
    }

    @Override // tb.hfu
    public void e(ifu<T, R> ifuVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92b463e", new Object[]{this, ifuVar});
            return;
        }
        for (List<List<Node<T, R>>> list : f(this.b)) {
            u35 u35Var = (u35) ifuVar;
            u35Var.c(i);
            g(list, u35Var);
            i++;
        }
    }
}
