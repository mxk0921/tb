package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.Node;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t35<T, R> implements s35<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mc7<T, R> f28450a = jja.a();
    public final AtomicInteger b = new AtomicInteger(0);
    public final Collection<Node<T, R>> c = new CopyOnWriteArrayList();
    public final Collection<Node<T, R>> d = new CopyOnWriteArrayList();
    public final Collection<dn8<T, R>> e = new CopyOnWriteArraySet();

    public void a(dn8<T, R> dn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2582fd9a", new Object[]{this, dn8Var});
        } else {
            ((CopyOnWriteArraySet) this.e).add(dn8Var);
        }
    }

    @Override // tb.lc7
    public void addAsDependencyToAllInitialNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19e8038", new Object[]{this, t});
        } else {
            this.f28450a.addAsDependencyToAllInitialNodes(t);
        }
    }

    @Override // tb.lc7
    public void addAsDependentOnAllLeafNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc98860", new Object[]{this, t});
        } else {
            this.f28450a.addAsDependentOnAllLeafNodes(t);
        }
    }

    @Override // tb.lc7
    public void addDependency(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1763048b", new Object[]{this, t, t2});
        } else {
            this.f28450a.addDependency(t, t2);
        }
    }

    @Override // tb.lc7
    public void addIndependent(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6089ffc", new Object[]{this, t});
        } else {
            this.f28450a.addIndependent(t);
        }
    }

    public final boolean b(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98c6630", new Object[]{this, node})).booleanValue();
        }
        if (node.getInComingNodes().isEmpty() || c(node.getInComingNodes())) {
            return true;
        }
        return false;
    }

    public final boolean c(Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6335ed2", new Object[]{this, set})).booleanValue();
        }
        return ((CopyOnWriteArrayList) this.c).containsAll(set);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab0ad27", new Object[]{this});
        } else {
            jdh.i("DAGStageStateImpl", "decrementUnProcessedNodesCount, total nodes unprocessed count: %d", Integer.valueOf(this.b.decrementAndGet()));
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74f8fe17", new Object[]{this})).intValue();
        }
        return ((CopyOnWriteArraySet) this.e).size();
    }

    public Collection<Node<T, R>> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("a44a04b4", new Object[]{this});
        }
        return new ArrayList(this.d);
    }

    public Node<T, R> g(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Node) ipChange.ipc$dispatch("e99b151a", new Object[]{this, t});
        }
        return this.f28450a.get(t);
    }

    public Set<Node<T, R>> getInitialNodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("33645b9", new Object[]{this});
        }
        return this.f28450a.getInitialNodes();
    }

    public Collection<Node<T, R>> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("fb0a77c7", new Object[]{this});
        }
        return new ArrayList(this.c);
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec7d7bb7", new Object[]{this})).intValue();
        }
        return this.b.get();
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20ad7369", new Object[]{this})).intValue();
        }
        return this.f28450a.size();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e51dcb", new Object[]{this});
        } else {
            jdh.i("DAGStageStateImpl", "incrementUnProcessedNodesCount, total nodes unprocessed count: %d", Integer.valueOf(this.b.incrementAndGet()));
        }
    }

    public final boolean l(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0c976ec", new Object[]{this, node})).booleanValue();
        }
        return ((CopyOnWriteArrayList) this.c).contains(node);
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27ab71fd", new Object[]{this})).booleanValue();
        }
        return true ^ ((CopyOnWriteArrayList) this.d).isEmpty();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9326d600", new Object[]{this});
        } else {
            ((CopyOnWriteArrayList) this.d).clear();
        }
    }

    public void o(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b9ae2a", new Object[]{this, node});
        } else {
            ((CopyOnWriteArrayList) this.c).add(node);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
        }
    }

    public void q(ifu<T, R> ifuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd52a3", new Object[]{this, ifuVar});
        } else {
            hfu.b(this.f28450a).e(ifuVar);
        }
    }

    public void r(Collection<Node<T, R>> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68be51d2", new Object[]{this, collection});
        } else {
            ((CopyOnWriteArrayList) this.d).addAll(collection);
        }
    }

    public void s(dn8<T, R> dn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9be8b97", new Object[]{this, dn8Var});
        } else {
            ((CopyOnWriteArraySet) this.e).remove(dn8Var);
        }
    }

    public void t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ba94d8", new Object[]{this, new Integer(i)});
        }
    }

    public boolean u(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6187c308", new Object[]{this, node})).booleanValue();
        }
        if (l(node) || !b(node)) {
            return false;
        }
        return true;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4060229d", new Object[]{this});
        } else {
            jja.b(this.f28450a);
        }
    }
}
