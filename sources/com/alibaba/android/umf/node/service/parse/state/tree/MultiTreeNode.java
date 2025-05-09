package com.alibaba.android.umf.node.service.parse.state.tree;

import android.text.TextUtils;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MultiTreeNode extends TreeNode<RenderComponent> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_BRANCHING_FACTOR = 10;
    private static final int MAX_ARRAY_SIZE = 2147483639;
    private static final long serialVersionUID = 1;
    private final int branchingFactor;
    private Object[] subtrees;
    private int subtreesSize;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends TreeNode<RenderComponent>.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
            super();
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/parse/state/tree/MultiTreeNode$1");
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.f
        public TreeNode<RenderComponent> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TreeNode) ipChange.ipc$dispatch("4afdd680", new Object[]{this});
            }
            return (TreeNode) MultiTreeNode.access$000(MultiTreeNode.this)[0];
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.f
        public TreeNode<RenderComponent> g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TreeNode) ipChange.ipc$dispatch("79009624", new Object[]{this});
            }
            MultiTreeNode multiTreeNode = MultiTreeNode.this;
            MultiTreeNode multiTreeNode2 = (MultiTreeNode) multiTreeNode.parent;
            int access$100 = MultiTreeNode.access$100(multiTreeNode2, multiTreeNode) + 1;
            if (access$100 < MultiTreeNode.access$200(multiTreeNode2)) {
                return (TreeNode) MultiTreeNode.access$000(multiTreeNode2)[access$100];
            }
            return null;
        }
    }

    static {
        t2o.a(80740722);
    }

    public MultiTreeNode(RenderComponent renderComponent) {
        super(renderComponent);
        this.branchingFactor = 10;
        this.subtrees = new Object[10];
    }

    public static /* synthetic */ Object[] access$000(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("e1acd264", new Object[]{multiTreeNode});
        }
        return multiTreeNode.subtrees;
    }

    public static /* synthetic */ int access$100(MultiTreeNode multiTreeNode, TreeNode treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7afaba72", new Object[]{multiTreeNode, treeNode})).intValue();
        }
        return multiTreeNode.indexOf(treeNode);
    }

    public static /* synthetic */ int access$200(MultiTreeNode multiTreeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce734174", new Object[]{multiTreeNode})).intValue();
        }
        return multiTreeNode.subtreesSize;
    }

    private void ensureSubtreesCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d9cecef", new Object[]{this, new Integer(i)});
        } else if (i > this.subtrees.length) {
            increaseSubtreesCapacity(i);
        }
    }

    private void increaseSubtreesCapacity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd64356b", new Object[]{this, new Integer(i)});
            return;
        }
        Object[] objArr = this.subtrees;
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 < i) {
            i2 = i;
        }
        if (i2 > MAX_ARRAY_SIZE) {
            if (i < 0) {
                throw new OutOfMemoryError();
            } else if (i > MAX_ARRAY_SIZE) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = MAX_ARRAY_SIZE;
            }
        }
        this.subtrees = Arrays.copyOf(objArr, i2);
    }

    private int indexOf(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff11b4a0", new Object[]{this, treeNode})).intValue();
        }
        for (int i = 0; i < this.subtreesSize; i++) {
            if (((TreeNode) this.subtrees[i]).equals(treeNode)) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ Object ipc$super(MultiTreeNode multiTreeNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/parse/state/tree/MultiTreeNode");
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean add(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6cf3b09", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode == null) {
            return false;
        }
        TreeNode.linkParent(treeNode, this);
        ensureSubtreesCapacity(this.subtreesSize + 1);
        Object[] objArr = this.subtrees;
        int i = this.subtreesSize;
        this.subtreesSize = i + 1;
        objArr[i] = treeNode;
        return true;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else if (!isLeaf()) {
            for (int i = 0; i < this.subtreesSize; i++) {
                TreeNode treeNode = (TreeNode) this.subtrees[i];
                if (treeNode != null) {
                    TreeNode.unlinkParent(treeNode);
                }
            }
            this.subtrees = new Object[this.branchingFactor];
            this.subtreesSize = 0;
        }
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean contains(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("715987", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            for (int i = 0; i < this.subtreesSize; i++) {
                TreeNode treeNode2 = (TreeNode) this.subtrees[i];
                if (treeNode2.equals(treeNode) || treeNode2.contains(treeNode)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean dropSubtree(TreeNode<RenderComponent> treeNode) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ca59b57", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode == null || isLeaf() || treeNode.isRoot() || (indexOf = indexOf(treeNode)) < 0) {
            return false;
        }
        int i = (this.subtreesSize - indexOf) - 1;
        if (i > 0) {
            Object[] objArr = this.subtrees;
            System.arraycopy(objArr, indexOf + 1, objArr, indexOf, i);
        }
        Object[] objArr2 = this.subtrees;
        int i2 = this.subtreesSize - 1;
        this.subtreesSize = i2;
        objArr2[i2] = null;
        TreeNode.unlinkParent(treeNode);
        return true;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean hasSubtree(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219aa6cc", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            for (int i = 0; i < this.subtreesSize; i++) {
                if (treeNode.equals((TreeNode) this.subtrees[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public int height() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue();
        }
        if (isLeaf()) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.subtreesSize; i2++) {
            i = Math.max(i, ((TreeNode) this.subtrees[i2]).height());
        }
        return i + 1;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean isLeaf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dc4ec33", new Object[]{this})).booleanValue();
        }
        if (this.subtreesSize == 0) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        T t = this.data;
        if (t == 0 || TextUtils.isEmpty(((RenderComponent) t).key)) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public boolean remove(TreeNode<RenderComponent> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc1b796c", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            if (dropSubtree(treeNode)) {
                return true;
            }
            for (int i = 0; i < this.subtreesSize; i++) {
                if (((TreeNode) this.subtrees[i]).remove(treeNode)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public Collection<? extends TreeNode<RenderComponent>> subtrees() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("420d51eb", new Object[]{this});
        }
        if (isLeaf()) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.subtreesSize);
        for (int i = 0; i < this.subtreesSize; i++) {
            linkedHashSet.add((TreeNode) this.subtrees[i]);
        }
        return linkedHashSet;
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public void traversePostOrder(TreeNode.e<TreeNode<RenderComponent>> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da42a850", new Object[]{this, eVar});
        } else if (!eVar.isCompleted()) {
            if (!isLeaf()) {
                for (int i = 0; i < this.subtreesSize; i++) {
                    ((TreeNode) this.subtrees[i]).traversePostOrder(eVar);
                }
            }
            eVar.a(this);
        }
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode
    public void traversePreOrder(TreeNode.e<TreeNode<RenderComponent>> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a62291", new Object[]{this, eVar});
        } else if (!eVar.isCompleted()) {
            eVar.a(this);
            if (!isLeaf()) {
                for (int i = 0; i < this.subtreesSize; i++) {
                    ((TreeNode) this.subtrees[i]).traversePreOrder(eVar);
                }
            }
        }
    }

    @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode, java.lang.Iterable
    public TreeNode<RenderComponent>.f iterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TreeNode.f) ipChange.ipc$dispatch("466f3166", new Object[]{this}) : new a();
    }

    public MultiTreeNode(RenderComponent renderComponent, int i) {
        super(renderComponent);
        if (i >= 0) {
            this.branchingFactor = i;
            this.subtrees = new Object[i];
            return;
        }
        throw new IllegalArgumentException("Branching factor can not be negative");
    }
}
