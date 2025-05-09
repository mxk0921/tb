package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class hfu<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<Node<T, R>> f20612a = new ArrayList();
    public final mc7<T, R> b;

    public hfu(mc7<T, R> mc7Var) {
        this.b = mc7Var;
    }

    public static <T, R> hfu<T, R> b(mc7<T, R> mc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hfu) ipChange.ipc$dispatch("7f06609b", new Object[]{mc7Var});
        }
        return new cng(mc7Var);
    }

    public final void a(List<List<Node<T, R>>> list, Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec40f56", new Object[]{this, list, node});
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.offer(node);
        while (!linkedList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int size = linkedList.size();
            for (int i = 0; i < size; i++) {
                Node<T, R> node2 = (Node) linkedList.poll();
                if (!c(node2) && d(node2.getInComingNodes())) {
                    if (!arrayList.contains(node2) && !h(arrayList, node2.getInComingNodes())) {
                        arrayList.add(node2);
                        ((ArrayList) this.f20612a).add(node2);
                    }
                    for (Node<T, R> node3 : node2.getOutGoingNodes()) {
                        if (node3 != null && !((ArrayList) this.f20612a).contains(node3)) {
                            linkedList.offer(node3);
                        }
                    }
                }
            }
            list.add(arrayList);
        }
    }

    public final boolean c(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d3a566c", new Object[]{this, node})).booleanValue();
        }
        return ((ArrayList) this.f20612a).contains(node);
    }

    public final boolean d(Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7935cbc", new Object[]{this, set})).booleanValue();
        }
        return this.f20612a.containsAll(set);
    }

    public abstract void e(ifu<T, R> ifuVar);

    public List<List<List<Node<T, R>>>> f(mc7<T, R> mc7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a244dc80", new Object[]{this, mc7Var});
        }
        ArrayList arrayList = new ArrayList();
        for (Node<T, R> node : mc7Var.getInitialNodes()) {
            ArrayList arrayList2 = new ArrayList();
            a(arrayList2, node);
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public void g(List<List<Node<T, R>>> list, ifu<T, R> ifuVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba0f0c8", new Object[]{this, list, ifuVar});
            return;
        }
        for (List<Node<T, R>> list2 : list) {
            u35 u35Var = (u35) ifuVar;
            u35Var.b(i);
            for (Node<T, R> node : list2) {
                u35Var.d(node);
            }
            i++;
        }
    }

    public final boolean h(List<Node<T, R>> list, Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc7614a2", new Object[]{this, list, set})).booleanValue();
        }
        for (Node<T, R> node : set) {
            if (list.contains(node)) {
                return true;
            }
        }
        return false;
    }
}
