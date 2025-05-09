package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.GraphCycleDetectedException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c35<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(mc7<T, R> mc7Var) throws GraphCycleDetectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd385a0", new Object[]{this, mc7Var});
        }
    }
}
