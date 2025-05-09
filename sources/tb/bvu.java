package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ouu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINodeGroup f16664a;
    public boolean e;
    public ouu.b f;
    public final List<UINode> b = new ArrayList(1);
    public final List<UINode> d = new ArrayList(0);
    public final List<UINode> c = new ArrayList(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends yio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ b d;

        public a(b bVar) {
            this.d = bVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/UINodeChildren$1");
        }

        @Override // tb.yio
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                bvu.a(bvu.this).a(this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<UINode> f16665a;
        public final List<UINode> b;
        public final List<UINode> c;

        static {
            t2o.a(986710085);
        }

        public b(List<UINode> list, List<UINode> list2, List<UINode> list3) {
            this.f16665a = new ArrayList();
            if (!list.isEmpty()) {
                this.f16665a = new ArrayList(list);
            }
            if (!list2.isEmpty()) {
                this.b = new ArrayList(list2);
            }
            if (!list3.isEmpty()) {
                this.c = new ArrayList(list3);
            }
        }
    }

    static {
        t2o.a(986710083);
    }

    public bvu(UINodeGroup uINodeGroup) {
        this.f16664a = uINodeGroup;
    }

    public static /* synthetic */ ouu.b a(bvu bvuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ouu.b) ipChange.ipc$dispatch("85f43a72", new Object[]{bvuVar});
        }
        return bvuVar.f;
    }

    public void b(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        ArrayList arrayList = (ArrayList) this.b;
        if (i > arrayList.size() || i < 0) {
            throw new IllegalStateException("AddChild parent index out of bounds, parent: " + toString() + ", index: " + i);
        }
        arrayList.add(i, uINode);
        ((ArrayList) this.d).add(uINode);
        this.e = true;
    }

    public void c(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        ((ArrayList) this.b).add(uINode);
        ((ArrayList) this.d).add(uINode);
        this.e = true;
    }

    public void d(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968215a5", new Object[]{this, bVar});
            return;
        }
        ((ArrayList) this.b).clear();
        List<UINode> list = bVar.f16665a;
        if (list != null) {
            ((ArrayList) this.b).addAll(list);
        }
        List<UINode> list2 = bVar.b;
        if (list2 != null) {
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                UINode uINode = (UINode) it.next();
                if (uINode != null) {
                    uINode.removedFromParent();
                }
            }
        }
        xuu layoutState = this.f16664a.getLayoutState();
        List<UINode> list3 = bVar.c;
        if (!(list3 == null || layoutState == null)) {
            Iterator it2 = ((ArrayList) list3).iterator();
            while (it2.hasNext()) {
                UINode uINode2 = (UINode) it2.next();
                if (uINode2 != null) {
                    uINode2.setParentNode(this.f16664a);
                    if (!uINode2.isRoot()) {
                        layoutState.a(uINode2);
                    }
                }
            }
        }
        this.f16664a.notifyChildrenChange();
    }

    public void e(bvu bvuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db09b25", new Object[]{this, bvuVar});
            return;
        }
        ((ArrayList) bvuVar.b).clear();
        ((ArrayList) bvuVar.b).addAll(this.b);
    }

    public void f(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefd8b2f", new Object[]{this, list});
        } else if (this.e) {
            this.e = false;
            if (this.f == null) {
                dwh.v("commitListener is null");
                return;
            }
            b bVar = new b(this.b, this.c, this.d);
            ((ArrayList) this.c).clear();
            ((ArrayList) this.d).clear();
            list.add(new a(bVar));
        }
    }

    public UINode g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        return (UINode) ((ArrayList) this.b).get(i);
    }

    public int h(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue();
        }
        return ((ArrayList) this.b).indexOf(uINode);
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba35b64", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList arrayList = (ArrayList) this.b;
        if (i >= arrayList.size() || i < 0) {
            throw new IllegalStateException("RemoveChild from parent index out of bounds, parent: " + toString() + ", index: " + i);
        }
        UINode uINode = (UINode) arrayList.remove(i);
        if (uINode != null) {
            ((ArrayList) this.c).add(uINode);
        }
        this.e = true;
    }

    public void k(ouu.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50d512fc", new Object[]{this, bVar});
        } else {
            this.f = bVar;
        }
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.b).size();
    }

    public void i(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i != i2) {
            ArrayList arrayList = (ArrayList) this.b;
            if (i >= arrayList.size() || i < 0) {
                throw new IllegalStateException("moveChild from parent index out of bounds, parent: " + toString() + ", fromIndex: " + i);
            }
            UINode uINode = (UINode) arrayList.remove(i);
            if (i < i2) {
                arrayList.add(i2 - 1, uINode);
            } else {
                arrayList.add(i2, uINode);
            }
            this.e = true;
        }
    }
}
