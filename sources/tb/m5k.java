package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.Node;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m5k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T, R> Node<T, R> a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Node) ipChange.ipc$dispatch("43371918", new Object[]{t});
        }
        return new Node<>(t);
    }
}
