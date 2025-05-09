package tb;

import com.taobao.android.job.core.graph.Node;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface mc7<T, R> extends lc7<T> {
    Node<T, R> get(T t);

    Set<Node<T, R>> getInitialNodes();

    int size();
}
