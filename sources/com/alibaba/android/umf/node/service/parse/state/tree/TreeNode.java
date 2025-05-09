package com.alibaba.android.umf.node.service.parse.state.tree;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class TreeNode<T> implements Iterable<TreeNode<T>>, Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicLong ID_GENERATOR = new AtomicLong(0);
    public T data;
    private final long id = ID_GENERATOR.getAndIncrement();
    public TreeNode<T> parent;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class TreeNodeException extends RuntimeException {
        static {
            t2o.a(80740730);
        }

        public TreeNodeException(String str) {
            super(str);
        }

        public TreeNodeException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements e<TreeNode<T>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f2402a;
        public final /* synthetic */ TreeNode[] b;

        public a(TreeNode treeNode, Object obj, TreeNode[] treeNodeArr) {
            this.f2402a = obj;
            this.b = treeNodeArr;
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public void a(TreeNode<T> treeNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("432c49c5", new Object[]{this, treeNode});
                return;
            }
            if (treeNode.data() == null) {
                if (this.f2402a != null) {
                    return;
                }
            } else if (!treeNode.data().equals(this.f2402a)) {
                return;
            }
            this.b[0] = treeNode;
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public boolean isCompleted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
            }
            if (this.b[0] != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements e<TreeNode<T>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long[] f2403a;

        public b(TreeNode treeNode, long[] jArr) {
            this.f2403a = jArr;
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public void a(TreeNode<T> treeNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("432c49c5", new Object[]{this, treeNode});
                return;
            }
            long[] jArr = this.f2403a;
            jArr[0] = jArr[0] + 1;
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public boolean isCompleted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d implements e<TreeNode<T>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Collection f2405a;

        public d(Collection collection) {
            this.f2405a = collection;
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public void a(TreeNode<T> treeNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("432c49c5", new Object[]{this, treeNode});
            } else {
                this.f2405a.add(treeNode);
            }
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public boolean isCompleted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface e<T extends TreeNode> {
        void a(T t);

        boolean isCompleted();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public abstract class f implements Iterator<TreeNode<T>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f2406a;
        public TreeNode<T> b;
        public TreeNode<T> c;
        public boolean d = true;

        static {
            t2o.a(80740731);
        }

        public f() {
            this.f2406a = TreeNode.this.size();
            this.c = TreeNode.this;
        }

        public final TreeNode<T> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TreeNode) ipChange.ipc$dispatch("7e41ce59", new Object[]{this});
            }
            if (!TreeNode.this.isLeaf()) {
                return e();
            }
            throw new TreeNodeException("Leftmost node can't be obtained. Current tree node is a leaf");
        }

        public final TreeNode<T> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TreeNode) ipChange.ipc$dispatch("f762f97d", new Object[]{this});
            }
            if (!TreeNode.this.isRoot()) {
                return g();
            }
            throw new TreeNodeException("Right sibling node can't be obtained. Current tree node is root");
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e65b7b", new Object[]{this});
            } else if (this.f2406a != TreeNode.this.size()) {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2bcf61b9", new Object[]{this})).booleanValue();
            }
            if (this.b != null) {
                return true;
            }
            return false;
        }

        public abstract TreeNode<T> e();

        /* renamed from: f */
        public TreeNode<T> next() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TreeNode) ipChange.ipc$dispatch("de643f79", new Object[]{this});
            }
            c();
            if (hasNext()) {
                TreeNode<T> treeNode = this.c;
                this.b = treeNode;
                if (treeNode.isLeaf()) {
                    if (!this.c.isRoot()) {
                        while (true) {
                            TreeNode<T> treeNode2 = this.c;
                            this.c = treeNode2.parent();
                            if (!treeNode2.equals(TreeNode.this)) {
                                TreeNode<T> b = treeNode2.iterator().b();
                                if (b != null) {
                                    this.c = b;
                                    break;
                                }
                            } else {
                                this.d = false;
                                break;
                            }
                        }
                    } else {
                        this.d = false;
                    }
                } else {
                    this.c = this.c.iterator().a();
                }
                return this.b;
            }
            throw new NoSuchElementException();
        }

        public abstract TreeNode<T> g();

        @Override // java.util.Iterator
        public boolean hasNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        @Override // java.util.Iterator
        public void remove() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41689b0b", new Object[]{this});
            } else if (!d()) {
                throw new IllegalStateException("Failed to remove the tree node. The iteration has not been performed yet");
            } else if (this.b.isRoot()) {
                throw new TreeNodeException(String.format("Failed to remove the tree node. The tree node %1$s is root", this.b));
            } else if (!this.b.equals(TreeNode.this)) {
                c();
                TreeNode<T> treeNode = this.b;
                while (true) {
                    if (treeNode.isRoot()) {
                        this.d = false;
                        break;
                    }
                    TreeNode<T> b = treeNode.iterator().b();
                    if (b != null) {
                        this.c = b;
                        break;
                    }
                    treeNode = treeNode.parent;
                }
                TreeNode<T> parent = this.b.parent();
                parent.dropSubtree(this.b);
                this.b = parent;
                this.f2406a = TreeNode.this.size();
            } else {
                throw new TreeNodeException("Failed to remove the tree node. The starting node can't be removed");
            }
        }
    }

    static {
        t2o.a(80740724);
    }

    public TreeNode(T t) {
        this.data = t;
    }

    public static <T> boolean areAllNulls(Collection<T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a3935b", new Object[]{collection})).booleanValue();
        }
        return !isAnyNotNull(collection);
    }

    public static <T> boolean isAnyNotNull(Collection<T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dea6934", new Object[]{collection})).booleanValue();
        }
        if (collection != null && !collection.isEmpty()) {
            for (T t : collection) {
                if (t != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> void linkParent(TreeNode<T> treeNode, TreeNode<T> treeNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cd885", new Object[]{treeNode, treeNode2});
        } else if (treeNode != null) {
            treeNode.parent = treeNode2;
        }
    }

    public static <T> e<TreeNode<T>> populateAction(Collection<TreeNode<T>> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("c30f512b", new Object[]{collection});
        }
        return new d(collection);
    }

    public static <T> void unlinkParent(TreeNode<T> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a402901", new Object[]{treeNode});
        } else {
            treeNode.parent = null;
        }
    }

    public abstract boolean add(TreeNode<T> treeNode);

    public abstract void clear();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean contains(com.alibaba.android.umf.node.service.parse.state.tree.TreeNode<T> r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "715987"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            if (r6 == 0) goto L_0x004c
            boolean r2 = r5.isLeaf()
            if (r2 != 0) goto L_0x004c
            boolean r2 = r6.isRoot()
            if (r2 == 0) goto L_0x002b
            goto L_0x004c
        L_0x002b:
            java.util.Collection r2 = r5.subtrees()
            java.util.Iterator r2 = r2.iterator()
        L_0x0033:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r2.next()
            com.alibaba.android.umf.node.service.parse.state.tree.TreeNode r3 = (com.alibaba.android.umf.node.service.parse.state.tree.TreeNode) r3
            boolean r4 = r3.equals(r6)
            if (r4 != 0) goto L_0x004b
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L_0x0033
        L_0x004b:
            return r0
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.contains(com.alibaba.android.umf.node.service.parse.state.tree.TreeNode):boolean");
    }

    public T data() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("7b22b021", new Object[]{this});
        }
        return this.data;
    }

    public abstract boolean dropSubtree(TreeNode<T> treeNode);

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.id == ((TreeNode) obj).id) {
            return true;
        }
        return false;
    }

    public TreeNode<T> find(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("e13a3b97", new Object[]{this, t});
        }
        if (!isLeaf()) {
            TreeNode<T>[] treeNodeArr = (TreeNode[]) Array.newInstance(getClass(), 1);
            traversePreOrder(new a(this, t, treeNodeArr));
            return treeNodeArr[0];
        } else if (data() != null ? !data().equals(t) : t != null) {
            return null;
        } else {
            return this;
        }
    }

    public boolean hasSubtree(TreeNode<T> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("219aa6cc", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            Iterator<? extends TreeNode<T>> it = subtrees().iterator();
            while (it.hasNext()) {
                if (((TreeNode) it.next()).equals(treeNode)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        long j = this.id;
        return (int) (j ^ (j >>> 32));
    }

    public int height() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue();
        }
        if (isLeaf()) {
            return 0;
        }
        Iterator<? extends TreeNode<T>> it = subtrees().iterator();
        while (it.hasNext()) {
            i = Math.max(i, ((TreeNode) it.next()).height());
        }
        return i + 1;
    }

    public boolean isLeaf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dc4ec33", new Object[]{this})).booleanValue();
        }
        return subtrees().isEmpty();
    }

    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue();
        }
        if (this.parent == null) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public abstract TreeNode<T>.f iterator();

    public int level() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d35bdfe", new Object[]{this})).intValue();
        }
        if (isRoot()) {
            return 0;
        }
        TreeNode<T> treeNode = this;
        do {
            treeNode = treeNode.parent();
            i++;
        } while (!treeNode.isRoot());
        return i;
    }

    public TreeNode<T> parent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("71670a62", new Object[]{this});
        }
        return this.parent;
    }

    public Collection<TreeNode<T>> postOrdered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("bb392b93", new Object[]{this});
        }
        if (isLeaf()) {
            return Collections.singleton(this);
        }
        ArrayList arrayList = new ArrayList();
        traversePostOrder(populateAction(arrayList));
        return arrayList;
    }

    public Collection<TreeNode<T>> preOrdered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("a9a57996", new Object[]{this});
        }
        if (isLeaf()) {
            return Collections.singleton(this);
        }
        ArrayList arrayList = new ArrayList();
        traversePreOrder(populateAction(arrayList));
        return arrayList;
    }

    public boolean remove(TreeNode<T> treeNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc1b796c", new Object[]{this, treeNode})).booleanValue();
        }
        if (treeNode != null && !isLeaf() && !treeNode.isRoot()) {
            if (dropSubtree(treeNode)) {
                return true;
            }
            Iterator<? extends TreeNode<T>> it = subtrees().iterator();
            while (it.hasNext()) {
                if (((TreeNode) it.next()).remove(treeNode)) {
                    return true;
                }
            }
        }
        return false;
    }

    public TreeNode<T> root() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("27f8c72a", new Object[]{this});
        }
        if (isRoot()) {
            return this;
        }
        TreeNode<T> treeNode = this;
        do {
            treeNode = treeNode.parent();
        } while (!treeNode.isRoot());
        return treeNode;
    }

    public void setData(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, t});
        } else {
            this.data = t;
        }
    }

    public long size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfc", new Object[]{this})).longValue();
        }
        if (isLeaf()) {
            return 1L;
        }
        long[] jArr = {0};
        traversePreOrder(new b(this, jArr));
        return jArr[0];
    }

    public abstract Collection<? extends TreeNode<T>> subtrees();

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        traversePreOrder(new c(this, level(), sb));
        return sb.toString();
    }

    public void traversePostOrder(e<TreeNode<T>> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da42a850", new Object[]{this, eVar});
        } else if (!eVar.isCompleted()) {
            if (!isLeaf()) {
                Iterator<? extends TreeNode<T>> it = subtrees().iterator();
                while (it.hasNext()) {
                    ((TreeNode) it.next()).traversePostOrder(eVar);
                }
            }
            eVar.a(this);
        }
    }

    public void traversePreOrder(e<TreeNode<T>> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a62291", new Object[]{this, eVar});
        } else if (!eVar.isCompleted()) {
            eVar.a(this);
            if (!isLeaf()) {
                Iterator<? extends TreeNode<T>> it = subtrees().iterator();
                while (it.hasNext()) {
                    ((TreeNode) it.next()).traversePreOrder(eVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements e<TreeNode<T>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f2404a;
        public final /* synthetic */ StringBuilder b;

        public c(TreeNode treeNode, int i, StringBuilder sb) {
            this.f2404a = i;
            this.b = sb;
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public boolean isCompleted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8c6bb44c", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // com.alibaba.android.umf.node.service.parse.state.tree.TreeNode.e
        public void a(TreeNode<T> treeNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("432c49c5", new Object[]{this, treeNode});
                return;
            }
            int level = treeNode.level() - this.f2404a;
            for (int i = 0; i < level; i++) {
                this.b.append("|  ");
            }
            StringBuilder sb = this.b;
            sb.append("+- ");
            sb.append(treeNode.data());
            sb.append("\n");
        }
    }

    public TreeNode<T> clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TreeNode) ipChange.ipc$dispatch("1c132ccf", new Object[]{this});
        }
        try {
            return (TreeNode) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new TreeNodeException("Unable to clone the current tree node", e2);
        }
    }

    public TreeNode() {
    }
}
