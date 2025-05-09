package com.taobao.android.icart.widget.touch;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.CartRecyclerView;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.List;
import tb.i2b;
import tb.kmb;
import tb.kw7;
import tb.nw7;
import tb.q0c;
import tb.s0c;
import tb.t0c;
import tb.t2o;
import tb.v0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DragManager extends DragFloatLayer.c<String, IDMComponent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final CartRecyclerView c;
    public final kmb d;
    public final DragFloatLayer<String> e;
    public final TipsLineFollower f;
    public final List<IDMComponent> g = new ArrayList();
    public final List<IDMComponent> h = new ArrayList();
    public IDMComponent i;
    public RecyclerView.AdapterDataObserver j;
    public t0c k;
    public q0c l;
    public v0c m;
    public s0c n;
    public final RecyclerView.ItemAnimator o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class ReplayAdapterDataObserver extends RecyclerView.AdapterDataObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151158);
        }

        public ReplayAdapterDataObserver() {
        }

        public static /* synthetic */ Object ipc$super(ReplayAdapterDataObserver replayAdapterDataObserver, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1902625302:
                    super.onItemRangeInserted(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                case -1756146412:
                    super.onItemRangeMoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                case -1389471316:
                    super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), objArr[2]);
                    return null;
                case -238222724:
                    super.onItemRangeRemoved(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                case 1882209744:
                    super.onItemRangeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/touch/DragManager$ReplayAdapterDataObserver");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                super.onItemRangeChanged(i, i2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                super.onItemRangeInserted(i, i2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97535514", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                super.onItemRangeMoved(i, i2, i3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                super.onItemRangeRemoved(i, i2);
            }
        }

        public /* synthetic */ ReplayAdapterDataObserver(DragManager dragManager, a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                return;
            }
            Point j = DragManager.this.j();
            if (!DragManager.o(DragManager.this).isEmpty() || !DragManager.p(DragManager.this).isEmpty()) {
                for (int size = DragManager.this.f8096a.size() - 1; size >= 0; size--) {
                    IDMComponent iDMComponent = (IDMComponent) DragManager.this.f8096a.get(size);
                    if ((DragManager.q(DragManager.this) != iDMComponent && kw7.p(DragManager.o(DragManager.this), iDMComponent) >= 0) || kw7.p(DragManager.p(DragManager.this), iDMComponent) >= 0) {
                        DragManager.this.f8096a.remove(size);
                    }
                }
            }
            if (!(j == null || j.x == j.y)) {
                DragFloatLayer.c.k(DragManager.this.f8096a, j);
            }
            for (int size2 = DragManager.this.f8096a.size() - 1; size2 >= 0; size2--) {
                IDMComponent iDMComponent2 = (IDMComponent) DragManager.this.f8096a.get(size2);
                if (DragManager.q(DragManager.this) != null && TextUtils.equals(iDMComponent2.getKey(), DragManager.q(DragManager.this).getKey())) {
                    iDMComponent2.writeFields("_draging", "true");
                } else if (iDMComponent2.getFields() != null) {
                    iDMComponent2.getFields().remove("_draging");
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad2e59ac", new Object[]{this, new Integer(i), new Integer(i2), obj});
            } else {
                super.onItemRangeChanged(i, i2, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DragManager.l(DragManager.this).b(true, null, null, -1, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (DragManager.m(DragManager.this).getItemAnimator() == null) {
                DragManager.m(DragManager.this).setItemAnimator(DragManager.n(DragManager.this));
            }
        }
    }

    static {
        t2o.a(478151155);
    }

    public DragManager(kmb kmbVar, CartRecyclerView cartRecyclerView, DragFloatLayer<String> dragFloatLayer, TipsLineFollower tipsLineFollower) {
        super(kmbVar.e().t().H().getData());
        this.c = cartRecyclerView;
        this.d = kmbVar;
        this.e = dragFloatLayer;
        this.f = tipsLineFollower;
        this.o = cartRecyclerView.getItemAnimator();
        t();
    }

    public static /* synthetic */ Object ipc$super(DragManager dragManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1923120736) {
            super.c((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == -208241085) {
            super.i((RecyclerView) objArr[0], objArr[1], objArr[2], objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/widget/touch/DragManager");
        }
    }

    public static /* synthetic */ t0c l(DragManager dragManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t0c) ipChange.ipc$dispatch("3a277291", new Object[]{dragManager});
        }
        return dragManager.k;
    }

    public static /* synthetic */ CartRecyclerView m(DragManager dragManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartRecyclerView) ipChange.ipc$dispatch("dba825be", new Object[]{dragManager});
        }
        return dragManager.c;
    }

    public static /* synthetic */ RecyclerView.ItemAnimator n(DragManager dragManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemAnimator) ipChange.ipc$dispatch("cf6be741", new Object[]{dragManager});
        }
        return dragManager.o;
    }

    public static /* synthetic */ List o(DragManager dragManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2b002c58", new Object[]{dragManager});
        }
        return dragManager.h;
    }

    public static /* synthetic */ List p(DragManager dragManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f20c1359", new Object[]{dragManager});
        }
        return dragManager.g;
    }

    public static /* synthetic */ IDMComponent q(DragManager dragManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("1ed3d3d1", new Object[]{dragManager});
        }
        return dragManager.i;
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.d
    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("113b0317", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return this.l.d(this.c, i, i2);
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.c, com.taobao.android.icart.widget.touch.DragFloatLayer.d
    public void c(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5f81a0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.c(recyclerView, i, i2);
        this.k.g(i2);
    }

    @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.d
    public boolean g(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12c00e6e", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.c.getItemAnimator() == null) {
            this.c.setItemAnimator(this.o);
        }
        boolean b2 = this.l.b(this.c, i, i2);
        if (b2) {
            this.c.post(new a());
        }
        return b2;
    }

    public boolean r(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("997f4c8d", new Object[]{this, iDMComponent})).booleanValue();
        }
        v0c v0cVar = this.m;
        if (v0cVar == null || !v0cVar.b(iDMComponent)) {
            return false;
        }
        return true;
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c291ffe5", new Object[]{this});
            return;
        }
        nw7 nw7Var = new nw7();
        this.k = nw7Var.b(this.d, this.c, this.f, this.e);
        this.l = nw7Var.a(this.d);
        this.m = nw7Var.c(this.d);
        this.n = nw7Var.d(this.d);
    }

    /* renamed from: u */
    public String f(int i) {
        IDMComponent iDMComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43e788d0", new Object[]{this, new Integer(i)});
        }
        int k = kw7.k(this.c, i);
        List<C> list = this.f8096a;
        if (k < 0 || k >= list.size() || (iDMComponent = (IDMComponent) list.get(k)) == null) {
            return null;
        }
        return iDMComponent.getKey();
    }

    /* renamed from: v */
    public void h(RecyclerView recyclerView, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f184a9", new Object[]{this, recyclerView, str, str2, new Integer(i), new Integer(i2)});
        } else {
            this.k.j(recyclerView, this.l, str, str2, i, i2);
        }
    }

    /* renamed from: w */
    public void d(RecyclerView recyclerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908a8b4e", new Object[]{this, recyclerView, str});
        } else {
            this.d.U().h(recyclerView, 0, 1, true);
        }
    }

    /* renamed from: x */
    public void b(RecyclerView recyclerView, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccdd2d2b", new Object[]{this, recyclerView, str, str2, new Integer(i), new Integer(i2)});
        } else {
            this.l.c(recyclerView, this.k, str, str2, i, i2);
        }
    }

    /* renamed from: y */
    public void i(RecyclerView recyclerView, String str, String str2, String str3) {
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a2ed8d", new Object[]{this, recyclerView, str, str2, str3});
            return;
        }
        ArrayList arrayList = new ArrayList(this.h);
        ArrayList arrayList2 = new ArrayList(this.g);
        int f = this.k.f();
        int p = kw7.p(this.f8096a, this.i);
        this.c.getAdapter().notifyItemChanged(p);
        z();
        if (str == null) {
            UnifyLog.e("DragManager", "dragUniqueId null");
            return;
        }
        IDMComponent componentByName = this.d.b().getComponentByName(str);
        if (componentByName == null) {
            UnifyLog.e("DragManager", "dragComponent null");
        } else if (kw7.x(componentByName) || kw7.q(componentByName)) {
            if (str3 != null) {
                this.n.a(componentByName, this.d.b().getComponentByName(str3), f);
            } else {
                this.c.setItemAnimator(null);
                Point j = j();
                if (!(j == null || j.x == j.y)) {
                    z = true;
                }
                if (f != 0) {
                    z = true;
                }
                if (z) {
                    if (j == null) {
                        i = p;
                    } else {
                        i = kw7.k(this.c, j.y);
                    }
                    this.n.a(componentByName, kw7.d(this.f8096a, i), f);
                    if (!arrayList2.isEmpty()) {
                        if (p == this.f8096a.size() - 1) {
                            this.f8096a.addAll(arrayList2);
                        } else {
                            this.f8096a.addAll(p + 1, arrayList2);
                        }
                        this.c.getAdapter().notifyItemRangeInserted(1 + p, arrayList2.size());
                    }
                    if (!arrayList.isEmpty()) {
                        this.f8096a.addAll(p, arrayList);
                        this.c.getAdapter().notifyItemRangeInserted(p, arrayList.size());
                    }
                    kw7.e(this.c, componentByName, this.i, arrayList, arrayList2);
                } else {
                    this.d.e().B(this.d.d().d());
                }
            }
            this.c.post(new b());
            super.i(recyclerView, str, str2, str3);
        } else {
            UnifyLog.e("DragManager", "isOperateComponent false");
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.l.a();
        ((ArrayList) this.g).clear();
        ((ArrayList) this.h).clear();
        this.k.d();
        IDMComponent iDMComponent = this.i;
        if (iDMComponent != null) {
            iDMComponent.getFields().remove("_draging");
            this.i = null;
        }
        this.k.k(0, "", true);
    }

    /* renamed from: s */
    public boolean e(RecyclerView recyclerView, String str, boolean z) {
        View findViewWithTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af47a3b", new Object[]{this, recyclerView, str, new Boolean(z)})).booleanValue();
        }
        if (!z || (findViewWithTag = this.c.findViewWithTag(i2b.VIEW_PROVIDER_RECOMMEND_CONTAINER)) == null) {
            return true;
        }
        return this.c.getBottom() - findViewWithTag.getTop() < this.d.e().q().getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a A[LOOP:4: B:57:0x0158->B:58:0x015a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(android.view.View r18, com.taobao.android.ultron.common.model.IDMComponent r19) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.widget.touch.DragManager.A(android.view.View, com.taobao.android.ultron.common.model.IDMComponent):void");
    }
}
