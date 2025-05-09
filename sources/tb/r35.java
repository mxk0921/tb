package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.graph.Node;
import com.taobao.android.job.core.task.TaskNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r35<T, R> extends q35<T, R> implements lc7<T>, bn8<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final aft<T, R> f27081a;
    public final ket<T, R> b;
    public final eft<T, R> c;
    public final String e;
    public final s35<T, R> d = new t35();
    public final Map<T, fn8> f = new ConcurrentHashMap();

    public r35(String str, eft<T, R> eftVar, aft<T, R> aftVar, ket<T, R> ketVar) {
        this.e = str;
        this.c = eftVar;
        this.f27081a = aftVar;
        this.b = ketVar;
    }

    public static /* synthetic */ Object ipc$super(r35 r35Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/job/core/DAGStageImpl");
    }

    @Override // tb.bn8
    public void a(vct<T, R> vctVar, dn8<T, R> dn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b9adab", new Object[]{this, vctVar, dn8Var});
            return;
        }
        ((t35) this.d).s(dn8Var);
        jdh.j("DAGStageImpl", "Executed: %s, %s", vctVar.c(), dn8Var.e());
        ((ConcurrentHashMap) this.f).put(vctVar.c(), dn8Var.e());
    }

    @Override // tb.lc7
    public void addAsDependencyToAllInitialNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19e8038", new Object[]{this, t});
            return;
        }
        ((t35) this.d).v();
        ((t35) this.d).addAsDependencyToAllInitialNodes(t);
    }

    @Override // tb.lc7
    public void addAsDependentOnAllLeafNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc98860", new Object[]{this, t});
            return;
        }
        ((t35) this.d).v();
        ((t35) this.d).addAsDependentOnAllLeafNodes(t);
    }

    @Override // tb.lc7
    public void addDependency(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1763048b", new Object[]{this, t, t2});
            return;
        }
        ((t35) this.d).v();
        ((t35) this.d).addDependency(t, t2);
    }

    @Override // tb.lc7
    public void addIndependent(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6089ffc", new Object[]{this, t});
            return;
        }
        ((t35) this.d).v();
        ((t35) this.d).addIndependent(t);
    }

    @Override // tb.fxq
    public void b(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88482fb2", new Object[]{this, sb});
            return;
        }
        sb.append("stageName=");
        sb.append(this.e);
        for (Map.Entry entry : ((ConcurrentHashMap) this.f).entrySet()) {
            sb.append("|");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(((fn8) entry.getValue()).c());
        }
        sb.append("&");
    }

    @Override // tb.bn8
    public void c(vct<T, R> vctVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415894d1", new Object[]{this, vctVar, new Long(j)});
        } else {
            ((ConcurrentHashMap) this.f).put(vctVar.c(), fn8.b(j, -1L));
        }
    }

    @Override // tb.bn8
    public void d(vct<T, R> vctVar, dn8<T, R> dn8Var, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987e522f", new Object[]{this, vctVar, dn8Var, th});
        } else {
            ((t35) this.d).a(dn8Var);
        }
    }

    @Override // tb.q35
    public lc7<T> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lc7) ipChange.ipc$dispatch("4a0169ed", new Object[]{this});
        }
        return this;
    }

    @Override // tb.q35
    public fn8 f(xto xtoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fn8) ipChange.ipc$dispatch("e5089e7b", new Object[]{this, xtoVar});
        }
        ((t35) this.d).t(1);
        Set<Node<T, R>> initialNodes = ((t35) this.d).getInitialNodes();
        ((ConcurrentHashMap) this.f).clear();
        this.c.d(this);
        this.c.a(this);
        jdh.i("DAGStageImpl", "Start to process stage %s", this.e);
        long currentTimeMillis = System.currentTimeMillis();
        o(xtoVar, initialNodes);
        s(xtoVar);
        long currentTimeMillis2 = System.currentTimeMillis();
        long a2 = ptt.a(currentTimeMillis, currentTimeMillis2);
        this.c.b(this);
        this.c.c(this);
        ((t35) this.d).t(2);
        ((t35) this.d).p();
        int j = ((t35) this.d).j();
        int size = ((t35) this.d).h().size();
        jdh.k("DAGStageImpl", "Total Time taken to process %s jobs in %d ms of stage '%s'.", Integer.valueOf(j), Long.valueOf(a2), this.e);
        jdh.i("DAGStageImpl", "Processed Nodes Ordering %s", ((t35) this.d).h());
        return fn8.a(j, size, currentTimeMillis, currentTimeMillis2);
    }

    @Override // tb.q35
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.q35
    public Map<T, fn8> h(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("39de47ec", new Object[]{this, sb});
        }
        n(new u35(sb, this.f));
        return Collections.unmodifiableMap(this.f);
    }

    public final void i(xto xtoVar, dn8<T, R> dn8Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdc7d63", new Object[]{this, xtoVar, dn8Var, new Boolean(z)});
            return;
        }
        jdh.j("DAGStageImpl", "doneExecution node %s with status %s", dn8Var.b(), Integer.valueOf(dn8Var.d()));
        Node<T, R> g = ((t35) this.d).g(dn8Var.b());
        if (g == null) {
            jdh.a("DAGStageImpl", "got a unexpected node with id '%s', it seems that it is not in graph of stage '%s'", dn8Var.b(), this.e);
            return;
        }
        if (!z) {
            ((t35) this.d).d();
        }
        r(dn8Var, g);
        if (dn8Var.g()) {
            ((t35) this.d).o(g);
        }
        if (dn8Var.g() && !k() && ((t35) this.d).m()) {
            HashSet hashSet = new HashSet(((t35) this.d).f());
            ((t35) this.d).n();
            o(xtoVar, hashSet);
        }
        if (xtoVar.b() || !k()) {
            p(xtoVar, g.getOutGoingNodes());
        } else if (k() && dn8Var.g()) {
            ((t35) this.d).r(g.getOutGoingNodes());
        }
    }

    public final int j(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eff8de08", new Object[]{this, node})).intValue();
        }
        Integer num = (Integer) node.getData();
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9d29767", new Object[]{this})).booleanValue();
        }
        if (((t35) this.d).e() > 0) {
            return true;
        }
        return false;
    }

    public final vct<T, R> l(xto xtoVar, Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vct) ipChange.ipc$dispatch("e0b7c895", new Object[]{this, xtoVar, node});
        }
        return m(xtoVar, node.getValue());
    }

    public final vct<T, R> m(xto xtoVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vct) ipChange.ipc$dispatch("b1c1130", new Object[]{this, xtoVar, t});
        }
        vct<T, R> a2 = this.f27081a.a(t);
        if (a2 != null) {
            a2.g(t);
            return (vct<T, R>) ((chg) this.b).a(a2);
        }
        throw new TaskNotFoundException("task not found: " + t + " in " + this.f27081a);
    }

    public void n(ifu<T, R> ifuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd52a3", new Object[]{this, ifuVar});
        } else {
            ((t35) this.d).q(ifuVar);
        }
    }

    public final void p(xto xtoVar, Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487af43e", new Object[]{this, xtoVar, set});
        } else if (!set.isEmpty()) {
            o(xtoVar, set);
        }
    }

    public final void q(Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4d41c8", new Object[]{this, node});
        } else {
            node.setData(Integer.valueOf(j(node) + 1));
        }
    }

    public final void r(dn8<T, R> dn8Var, Node<T, R> node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a700ac0c", new Object[]{this, dn8Var, node});
            return;
        }
        q(node);
        node.setResult(dn8Var.c());
        if (dn8Var.f()) {
            node.setErrored();
        } else {
            node.setSuccess();
        }
    }

    public final void o(xto xtoVar, Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2524bb", new Object[]{this, xtoVar, set});
        } else if (!set.isEmpty()) {
            for (Node<T, R> node : set) {
                if (!((t35) this.d).u(node)) {
                    jdh.j("DAGStageImpl", "node %s depends on %s", node.getValue(), node.getInComingNodes());
                } else {
                    vct<T, R> l = l(xtoVar, node);
                    if (!node.isProcessed()) {
                        if (!l.d(null)) {
                            node.setSkipped();
                            jdh.i("DAGStageImpl", "Execution Skipped for node # %s ", node.getValue());
                            ((t35) this.d).o(node);
                            p(xtoVar, node.getOutGoingNodes());
                        } else {
                            jdh.i("DAGStageImpl", "Submitting %s node for execution", node.getValue());
                            dn8<T, R> e = this.c.e(l);
                            if (e != null) {
                                i(xtoVar, e, true);
                            } else {
                                ((t35) this.d).k();
                                p(xtoVar, node.getOutGoingNodes());
                            }
                        }
                    }
                }
            }
        }
    }

    public final void s(xto xtoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c55e6b", new Object[]{this, xtoVar});
            return;
        }
        while (true) {
            int i = ((t35) this.d).i();
            if (i > 0) {
                jdh.i("DAGStageImpl", "waitingDoneExecution, current unprocessed count: %d", Integer.valueOf(i));
                i(xtoVar, this.c.f(), false);
            } else {
                return;
            }
        }
    }
}
