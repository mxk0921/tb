package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.Node;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u35<T, R> implements ifu<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f29105a;
    public final Map<T, fn8> b;

    public u35(StringBuilder sb, Map<T, fn8> map) {
        this.f29105a = sb;
        this.b = map;
    }

    public static <T, R> Set<Node<T, R>> a(Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("59bdba1b", new Object[]{set});
        }
        HashSet hashSet = new HashSet(set.size());
        for (Node<T, R> node : set) {
            if (!node.isSkipped()) {
                hashSet.add(node);
            }
        }
        return hashSet;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f155879", new Object[]{this, new Integer(i)});
        } else {
            this.f29105a.append("\n");
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e10c016", new Object[]{this, new Integer(i)});
            return;
        }
        StringBuilder sb = this.f29105a;
        sb.append("\n");
        sb.append("Path #");
        sb.append(i);
    }

    public void d(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40cf76c9", new Object[]{this, node});
        } else if (!node.isSkipped()) {
            Set a2 = a(node.getInComingNodes());
            StringBuilder sb = this.f29105a;
            sb.append(node);
            sb.append("#");
            sb.append(this.b.get(node.getValue()));
            sb.append(a2);
            sb.append("|");
        }
    }
}
