package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.DependencyGraphImpl;
import com.taobao.android.job.core.graph.GraphCycleDetectedException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jja {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T, R> mc7<T, R> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mc7) ipChange.ipc$dispatch("7c84fdbd", new Object[0]);
        }
        return new DependencyGraphImpl();
    }

    public static <T, R> void b(mc7<T, R> mc7Var) throws GraphCycleDetectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73a7040", new Object[]{mc7Var});
        } else {
            new c35().a(mc7Var);
        }
    }
}
