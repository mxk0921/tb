package com.taobao.android.job.core.graph;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import tb.m5k;
import tb.mc7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DependencyGraphImpl<T, R> implements mc7<T, R>, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<T, Node<T, R>> nodes = new HashMap();

    private void addEdges(Node<T, R> node, Node<T, R> node2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c3c7be", new Object[]{this, node, node2});
        } else if (!node.equals(node2)) {
            node.addOutGoingNode(node2);
            node2.addInComingNode(node);
        }
    }

    private Node<T, R> addOrGet(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Node) ipChange.ipc$dispatch("ac756b82", new Object[]{this, t});
        }
        if (this.nodes.containsKey(t)) {
            return this.nodes.get(t);
        }
        Node<T, R> a2 = m5k.a(t);
        this.nodes.put(t, a2);
        return a2;
    }

    private boolean allParentProcessed(Set<Node<T, R>> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("875c6899", new Object[]{this, set})).booleanValue();
        }
        for (Node<T, R> node : set) {
            if (node.isNotProcessed()) {
                return false;
            }
        }
        return true;
    }

    private void doProcess(Set<Node<T, R>> set, Set<Node<T, R>> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3996cb", new Object[]{this, set, set2});
            return;
        }
        for (Node<T, R> node : set2) {
            if (node.isNotProcessed() && allParentProcessed(node.getInComingNodes())) {
                set.add(node);
            } else if (allParentProcessed(node.getInComingNodes())) {
                doProcess(set, node.getOutGoingNodes());
            }
        }
    }

    @Override // tb.lc7
    public void addAsDependencyToAllInitialNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19e8038", new Object[]{this, t});
        } else if (size() == 0) {
            addIndependent(t);
        } else {
            for (Node<T, R> node : getInitialNodes()) {
                addDependency(t, node.getValue());
            }
        }
    }

    @Override // tb.lc7
    public void addAsDependentOnAllLeafNodes(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc98860", new Object[]{this, t});
        } else if (size() == 0) {
            addIndependent(t);
        } else {
            for (Node<T, R> node : getLeafNodes()) {
                addDependency(node.getValue(), t);
            }
        }
    }

    @Override // tb.lc7
    public void addDependency(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1763048b", new Object[]{this, t, t2});
        } else {
            addEdges(addOrGet(t), addOrGet(t2));
        }
    }

    @Override // tb.lc7
    public void addIndependent(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6089ffc", new Object[]{this, t});
        } else {
            addOrGet(t);
        }
    }

    public Collection<Node<T, R>> allNodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("e9e57f10", new Object[]{this});
        }
        return new ArrayList(this.nodes.values());
    }

    @Override // tb.mc7
    public Node<T, R> get(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Node) ipChange.ipc$dispatch("b23528fe", new Object[]{this, t});
        }
        return this.nodes.get(t);
    }

    @Override // tb.mc7
    public Set<Node<T, R>> getInitialNodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("33645b9", new Object[]{this});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<T, Node<T, R>> entry : this.nodes.entrySet()) {
            Node<T, R> value = entry.getValue();
            if (value.getInComingNodes().isEmpty()) {
                linkedHashSet.add(value);
            }
        }
        return linkedHashSet;
    }

    public Set<Node<T, R>> getLeafNodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("4234d233", new Object[]{this});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<T, Node<T, R>> entry : this.nodes.entrySet()) {
            Node<T, R> value = entry.getValue();
            if (value.getOutGoingNodes().isEmpty()) {
                linkedHashSet.add(value);
            }
        }
        return linkedHashSet;
    }

    public Set<Node<T, R>> getNonProcessedRootNodes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("e724956e", new Object[]{this});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        doProcess(linkedHashSet, getInitialNodes());
        return linkedHashSet;
    }

    @Override // tb.mc7
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.nodes.size();
    }
}
