package com.taobao.android.icart.widget.touch.tips;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.TipsLineFollower;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.kw7;
import tb.q0c;
import tb.t0c;
import tb.t2o;
import tb.u0c;
import tb.vw7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DragTips implements t0c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LAST_BUNDLE_STATE_IDLE = 0;
    public static final int LAST_BUNDLE_STATE_JOIN = 1;
    public static final int LAST_BUNDLE_STATE_MERGE = 3;
    public static final int LAST_BUNDLE_STATE_ONLY_TIP = 4;
    public static final int LAST_BUNDLE_STATE_REMOVE = 2;
    public final TipsLineFollower b;
    public final RecyclerView c;
    public IDMComponent e;
    public final DragFloatLayer f;

    /* renamed from: a  reason: collision with root package name */
    public final List<IDMComponent> f8101a = new ArrayList();
    public int d = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface BundleState {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements TipsLineFollower.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478151187);
            t2o.a(478151161);
        }

        public b() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("920d8e1d", new Object[]{this, new Boolean(z)});
                return;
            }
            List<IDMComponent> j = kw7.j(DragTips.this.c);
            int dragPos = DragTips.l(DragTips.this).getDragPos();
            if (dragPos <= j.size() - 1 && dragPos >= 0) {
                DragTips dragTips = DragTips.this;
                dragTips.n(j, j.get(dragPos), z, DragTips.l(dragTips).getDragPos(), DragTips.l(DragTips.this).getEnterPos());
            }
        }
    }

    static {
        t2o.a(478151184);
        t2o.a(478151172);
    }

    public DragTips(RecyclerView recyclerView, TipsLineFollower tipsLineFollower, DragFloatLayer dragFloatLayer) {
        this.b = tipsLineFollower;
        this.c = recyclerView;
        this.f = dragFloatLayer;
    }

    public static /* synthetic */ DragFloatLayer l(DragTips dragTips) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragFloatLayer) ipChange.ipc$dispatch("cd042292", new Object[]{dragTips});
        }
        return dragTips.f;
    }

    @Override // tb.t0c
    public List<IDMComponent> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31e9f697", new Object[]{this});
        }
        return this.f8101a;
    }

    @Override // tb.t0c
    public void b(boolean z, IDMComponent iDMComponent, IDMComponent iDMComponent2, int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687460", new Object[]{this, new Boolean(z), iDMComponent, iDMComponent2, new Integer(i), new Boolean(z2)});
            return;
        }
        if (z || (!((ArrayList) this.f8101a).isEmpty() && !kw7.v((IDMComponent) ((ArrayList) this.f8101a).get(0), iDMComponent2))) {
            d();
        }
        if (!z && z2) {
            ArrayList arrayList = new ArrayList();
            List<IDMComponent> g = kw7.g(iDMComponent2);
            if (g != null) {
                arrayList.addAll(g);
            }
            ((ArrayList) this.f8101a).addAll(arrayList);
        }
    }

    @Override // tb.t0c
    public void c(RecyclerView recyclerView, IDMComponent iDMComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1036e40", new Object[]{this, recyclerView, iDMComponent, new Integer(i)});
        } else if (!kw7.x(iDMComponent) || !kw7.u(kw7.j(recyclerView), iDMComponent, i)) {
            this.b.setShowInCardUp(null);
        } else {
            this.b.setShowInCardUp(new b());
        }
    }

    @Override // tb.t0c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda0a2e9", new Object[]{this});
        } else if (!((ArrayList) this.f8101a).isEmpty()) {
            ((ArrayList) this.f8101a).clear();
        }
    }

    @Override // tb.t0c
    public IDMComponent e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("a4f6b00e", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.t0c
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18dfbd7d", new Object[]{this})).intValue();
        }
        return this.d;
    }

    @Override // tb.t0c
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8c3056", new Object[]{this, new Integer(i)});
            return;
        }
        k(0, "", true);
        List<IDMComponent> j = kw7.j(this.c);
        IDMComponent iDMComponent = j.get(i);
        if (!kw7.x(iDMComponent) || !kw7.u(j, iDMComponent, i)) {
            this.b.setShowInCardUp(null);
        } else {
            this.b.setShowInCardUp(new b());
        }
    }

    @Override // tb.t0c
    public List<IDMComponent> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("743853d3", new Object[]{this});
        }
        return kw7.j(this.c);
    }

    @Override // tb.t0c
    public void i(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270b09fe", new Object[]{this, iDMComponent});
        } else {
            this.e = iDMComponent;
        }
    }

    @Override // tb.t0c
    public void j(RecyclerView recyclerView, q0c q0cVar, String str, String str2, int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e6abe6", new Object[]{this, recyclerView, q0cVar, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        List<IDMComponent> j = kw7.j(recyclerView);
        if (i >= 0) {
            int dragPos = this.f.getDragPos();
            IDMComponent iDMComponent = j.get(dragPos);
            if (kw7.x(iDMComponent)) {
                if (dragPos >= 1 && dragPos < j.size() - 1) {
                    if (i <= dragPos) {
                        z = false;
                    }
                    n(j, iDMComponent, z, dragPos, i);
                }
            } else if (kw7.q(iDMComponent)) {
                m(q0cVar, j, iDMComponent, dragPos, i);
            }
        }
    }

    @Override // tb.t0c
    public void k(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e50465", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.d = i;
        if (i == 0) {
            this.b.setData("", z, false);
        } else if (i == 1) {
            this.b.setData(str, z, false);
        } else if (i == 2) {
            this.b.setData(str, z, false);
        } else if (i == 3) {
            this.b.setData(str, z, false);
        } else if (i == 4) {
            this.b.setData(str, z, true);
        }
    }

    public void m(q0c q0cVar, List<IDMComponent> list, IDMComponent iDMComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7dbdeb", new Object[]{this, q0cVar, list, iDMComponent, new Integer(i), new Integer(i2)});
        } else if (i2 >= 0 && i2 < list.size()) {
            IDMComponent iDMComponent2 = list.get(i2);
            if (iDMComponent != null && iDMComponent2 != null) {
                vw7.a().a(this, false, q0cVar.b(this.c, i, i2), null, iDMComponent2, iDMComponent);
            }
        }
    }

    public void n(List<IDMComponent> list, IDMComponent iDMComponent, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1da12ae", new Object[]{this, list, iDMComponent, new Boolean(z), new Integer(i), new Integer(i2)});
        } else if (i2 >= 0 && i2 < list.size()) {
            IDMComponent d = kw7.d(list, i);
            IDMComponent iDMComponent2 = list.get(i2);
            if (iDMComponent != null && iDMComponent2 != null) {
                b(false, iDMComponent, iDMComponent2, i, false);
                u0c b2 = vw7.b(iDMComponent, d, iDMComponent2);
                if (b2 != null) {
                    b2.a(this, z, false, d, iDMComponent2, iDMComponent);
                }
            }
        }
    }
}
