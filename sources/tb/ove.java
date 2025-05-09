package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.StaggeredGridSmoothScroller;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewAdapter;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewHolder;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.afterbuy.NestedScrollRecyclerView;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowItemDecoration;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.listener.RecycleViewListenerLoader;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.view.InfoFlowRecyclerView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ove {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cfc f25683a;
    public RecyclerView b;
    public k6c<RecyclerView> c;
    public InfoFlowItemDecoration d;
    public l69 e;
    public RecycleViewListenerLoader g;
    public Context h;
    public int i = 2;
    public final asn f = new asn();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements RecycleViewAdapter.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewAdapter.c
        public void a(List<BaseSectionModel> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b21b431", new Object[]{this, list});
            } else if (ove.a(ove.this) != null) {
                ove.a(ove.this).k(list);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ove.this.g(4);
            }
        }
    }

    static {
        t2o.a(486539655);
    }

    public static /* synthetic */ InfoFlowItemDecoration a(ove oveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowItemDecoration) ipChange.ipc$dispatch("b09fb1f5", new Object[]{oveVar});
        }
        return oveVar.d;
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21284014", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (!(recyclerView == null || recyclerView.getAdapter() == null)) {
            int[] s = s();
            if (s != null && s.length == 2) {
                int i = s[0];
                int i2 = s[1];
                int min = Math.min(this.b.getAdapter().getItemCount() - 1, i2 + 5);
                for (int max = Math.max(0, i - 5); max <= min; max++) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.b.findViewHolderForAdapterPosition(max);
                    if (findViewHolderForAdapterPosition instanceof RecycleViewHolder) {
                        ((RecycleViewHolder) findViewHolderForAdapterPosition).c0(null);
                    } else {
                        aq6.a(i(max));
                    }
                }
            }
            this.b.getRecycledViewPool().clear();
            this.b.getAdapter().notifyDataSetChanged();
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be36fdc5", new Object[]{this});
            return;
        }
        RecycleViewAdapter l = l();
        if (l == null) {
            fve.e("MainRecycleViewServiceImpl", "resetErrorView adapter is null");
        } else {
            l.X();
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b55d7a", new Object[]{this});
            return;
        }
        X((InfoFlowStaggeredGridLayoutManager) this.b.getLayoutManager());
        InfoFlowStaggeredGridLayoutManager R = R(this.b);
        if (this.d == null) {
            this.d = P(this.b);
        }
        this.d.j(this.i);
        A(R);
        fve.e("MainRecycleViewServiceImpl", "reset Recycler view");
    }

    public void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
        } else {
            F(i, 0);
        }
    }

    public void F(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c5ef1", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (y(this.b, i) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.b.getLayoutManager()) != null) {
            staggeredGridLayoutManager.scrollToPositionWithOffset(i, i2);
        }
    }

    public void H(l69 l69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4459e4fb", new Object[]{this, l69Var});
            return;
        }
        this.e = l69Var;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            Q(recyclerView, l69Var);
        }
    }

    public void I(a9c a9cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc355c2", new Object[]{this, a9cVar});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView instanceof InfoFlowRecyclerView) {
            ((InfoFlowRecyclerView) recyclerView).setGestureDetectorCallback(a9cVar);
        } else if (recyclerView instanceof NestedScrollRecyclerView) {
            ((NestedScrollRecyclerView) recyclerView).setGestureDetectorCallback(a9cVar);
        }
    }

    public void J(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ba4d68", new Object[]{this, new Integer(i)});
            return;
        }
        this.i = i;
        fve.e("MainRecycleViewServiceImpl", "set info flow column: " + i);
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.getLayoutManager() != null) {
            D();
            this.b.getRecycledViewPool().clear();
        }
    }

    public final void K(RecyclerView recyclerView, int i) {
        try {
            Field declaredField = RecyclerView.class.getDeclaredField("mMaxFlingVelocity");
            declaredField.setAccessible(true);
            declaredField.set(recyclerView, Integer.valueOf(pb6.f(recyclerView.getContext(), i)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f267fb", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            fve.e("MainRecycleViewServiceImpl", "mRecyclerView == null");
        } else {
            ((InfoFlowStaggeredGridLayoutManager) recyclerView.getLayoutManager()).D(z);
        }
    }

    public final void M(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a2a017", new Object[]{this, recyclerView});
        } else if ("l".equals(sue.a())) {
            K(recyclerView, 3500);
        }
    }

    public final void N(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("419cc93e", new Object[]{this, recyclerView});
        } else {
            recyclerView.setAdapter(new RecycleViewAdapter(this.f25683a, recyclerView, this.c, d()));
        }
    }

    public final void O(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e3d306", new Object[]{this, recyclerView});
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
    }

    public final InfoFlowItemDecoration P(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowItemDecoration) ipChange.ipc$dispatch("31b708db", new Object[]{this, recyclerView});
        }
        InfoFlowItemDecoration infoFlowItemDecoration = new InfoFlowItemDecoration(this.f25683a, this.i);
        recyclerView.addItemDecoration(infoFlowItemDecoration);
        return infoFlowItemDecoration;
    }

    public final void Q(RecyclerView recyclerView, l69 l69Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87be55", new Object[]{this, recyclerView, l69Var});
        } else if (l69Var != null) {
            Integer a2 = l69Var.a();
            if (a2 != null) {
                recyclerView.setBackgroundColor(a2.intValue());
            }
            Integer b2 = l69Var.b();
            if (b2 != null) {
                K(recyclerView, b2.intValue());
            }
        }
    }

    public final InfoFlowStaggeredGridLayoutManager R(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InfoFlowStaggeredGridLayoutManager) ipChange.ipc$dispatch("b39dbdb4", new Object[]{this, recyclerView});
        }
        InfoFlowStaggeredGridLayoutManager infoFlowStaggeredGridLayoutManager = new InfoFlowStaggeredGridLayoutManager(this.i, 1);
        infoFlowStaggeredGridLayoutManager.C(recyclerView);
        recyclerView.setLayoutManager(infoFlowStaggeredGridLayoutManager);
        return infoFlowStaggeredGridLayoutManager;
    }

    public final void S(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0dea983", new Object[]{this, recyclerView});
            return;
        }
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipToPadding(false);
        recyclerView.setTag(R.id.tag_info_flow_data_delay_set, null);
    }

    public final void T(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4798cccf", new Object[]{this, recyclerView});
            return;
        }
        N(recyclerView);
        S(recyclerView);
        InfoFlowStaggeredGridLayoutManager R = R(recyclerView);
        InfoFlowItemDecoration P = P(recyclerView);
        this.d = P;
        this.g.m(recyclerView, P, R);
        O(recyclerView);
        M(recyclerView);
        Q(recyclerView, this.e);
    }

    public void U(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7153a0bf", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.h != null && y(this.b, i)) {
            StaggeredGridSmoothScroller staggeredGridSmoothScroller = new StaggeredGridSmoothScroller(this.h);
            staggeredGridSmoothScroller.setTargetPosition(i);
            staggeredGridSmoothScroller.a(i2);
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.b.getLayoutManager();
            if (staggeredGridLayoutManager != null) {
                staggeredGridLayoutManager.startSmoothScroll(staggeredGridSmoothScroller);
            }
        }
    }

    public void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.stopScroll();
        }
    }

    public void W(List<BaseSectionModel> list, e6c e6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92140999", new Object[]{this, list, e6cVar});
            return;
        }
        RecycleViewAdapter l = l();
        if (l == null) {
            fve.e("MainRecycleViewServiceImpl", "uiRefresh infoFlowAdapter is null");
            return;
        }
        l.W(list, e6cVar);
        b();
    }

    public final void Y(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2767b7dc", new Object[]{this, recyclerView});
        } else if (!recyclerView.isComputingLayout()) {
            recyclerView.removeItemDecoration(this.d);
        }
    }

    public final void Z(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b771788", new Object[]{this, recyclerView});
        } else if (recyclerView != null) {
            this.g.o(recyclerView, this.d, (InfoFlowStaggeredGridLayoutManager) recyclerView.getLayoutManager());
            Y(recyclerView);
        }
    }

    public void a0(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f0ea5cb", new Object[]{this, baseSectionModel});
            return;
        }
        this.f.k(this.b, baseSectionModel);
        b();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b817b9d1", new Object[]{this});
        } else if (!v()) {
            z();
        }
    }

    public RecyclerView c(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("ef262b83", new Object[]{this, context});
        }
        this.h = context;
        l69 l69Var = this.e;
        if (l69Var != null) {
            z = l69Var.c();
        }
        RecyclerView e = e(context, z);
        T(e);
        this.b = e;
        return e;
    }

    public final RecycleViewAdapter.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecycleViewAdapter.c) ipChange.ipc$dispatch("6a099e57", new Object[]{this});
        }
        return new a();
    }

    public RecyclerView e(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("1d0af6da", new Object[]{this, context, new Boolean(z)});
        }
        if (z) {
            return new mrj().a(context, this.c);
        }
        return new pve().a(context, this.c);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        Z(this.b);
        this.b = null;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fad3120", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.dispatchWindowVisibilityChanged(i);
        }
    }

    public int h(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42fc47b8", new Object[]{this, new Integer(i), new Boolean(z)})).intValue();
        }
        return this.f.b(this.b, i, z);
    }

    public BaseSectionModel<?> i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("a400b778", new Object[]{this, new Integer(i)});
        }
        return this.f.c(l(), i);
    }

    public View j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a245f2cd", new Object[]{this, new Integer(i)});
        }
        return this.f.d(this.b, i);
    }

    public int k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d5c5e04a", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.f.e(this.b, i);
    }

    public final RecycleViewAdapter l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecycleViewAdapter) ipChange.ipc$dispatch("59ec1cdb", new Object[]{this});
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            return null;
        }
        if (recyclerView.getAdapter() instanceof RecycleViewAdapter) {
            return (RecycleViewAdapter) this.b.getAdapter();
        }
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 instanceof TRecyclerView) {
            return (RecycleViewAdapter) ((TRecyclerView) recyclerView2).getRawAdapter();
        }
        return null;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19f342e2", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        RecycleViewAdapter l = l();
        if (l != null) {
            return l.getItemCount();
        }
        fve.e("MainRecycleViewServiceImpl", "getItemCount adapter is null");
        return -1;
    }

    public int[] o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("1828e97f", new Object[]{this});
        }
        InfoFlowItemDecoration infoFlowItemDecoration = this.d;
        if (infoFlowItemDecoration != null) {
            return infoFlowItemDecoration.e();
        }
        return null;
    }

    public int p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a1e8bb5", new Object[]{this, str})).intValue();
        }
        return this.f.h(l(), str);
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89715f46", new Object[]{this})).intValue();
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView instanceof sdb) {
            return ((sdb) recyclerView).getVerticalScrollOffset();
        }
        return 0;
    }

    public double r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99ec6901", new Object[]{this, new Integer(i)})).doubleValue();
        }
        return this.f.i(this.b, i);
    }

    public int[] s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("67b2b985", new Object[]{this});
        }
        try {
            return this.f.j(this.b);
        } catch (Throwable th) {
            fve.c("MainRecycleViewServiceImpl", "getVisiblePositionRange error.", th);
            return null;
        }
    }

    public void t(cfc cfcVar, k6c<RecyclerView> k6cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51f946f", new Object[]{this, cfcVar, k6cVar});
            return;
        }
        this.f25683a = cfcVar;
        this.c = k6cVar;
        this.g = new RecycleViewListenerLoader(k6cVar);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34cbfbfc", new Object[]{this});
            return;
        }
        try {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.invalidateItemDecorations();
            }
        } catch (Exception e) {
            fve.e("MainRecycleViewServiceImpl", "uiRefresh时 invalidateItemDecorations 出现异常: " + e);
        }
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214f872", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView instanceof sdb) {
            return ((sdb) recyclerView).isInterceptTouch();
        }
        return false;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("862a0214", new Object[]{this})).booleanValue();
        }
        return this.g.j();
    }

    public final boolean y(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9caf9b2", new Object[]{this, recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null || recyclerView.getAdapter() == null || i < 0 || i >= recyclerView.getAdapter().getItemCount()) {
            return false;
        }
        return true;
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa88719d", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.post(new b());
        }
    }

    public final void A(InfoFlowStaggeredGridLayoutManager infoFlowStaggeredGridLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a1e51c", new Object[]{this, infoFlowStaggeredGridLayoutManager});
        } else if (mve.a("enableFixFoldPhoneStatusError", true)) {
            fve.e("MainRecycleViewServiceImpl", "registerListenerRelatedToLayoutManager");
            this.g.l(infoFlowStaggeredGridLayoutManager);
        } else {
            this.g.m(this.b, this.d, infoFlowStaggeredGridLayoutManager);
        }
    }

    public void G() {
        boolean b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2787c14", new Object[]{this});
        } else if (y(this.b, 0)) {
            try {
                this.b.scrollToPosition(0);
            } finally {
                if (!b2) {
                }
            }
        }
    }

    public final void X(InfoFlowStaggeredGridLayoutManager infoFlowStaggeredGridLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0fd703", new Object[]{this, infoFlowStaggeredGridLayoutManager});
        } else if (mve.a("enableFixFoldPhoneStatusError", true)) {
            fve.e("MainRecycleViewServiceImpl", "unRegisterListenerRelatedToLayoutManager");
            this.g.n(infoFlowStaggeredGridLayoutManager);
        } else {
            this.g.o(this.b, this.d, infoFlowStaggeredGridLayoutManager);
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96538a99", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        Rect rect = new Rect();
        this.b.getGlobalVisibleRect(rect);
        int s = pb6.s(this.b.getContext());
        if (rect.right >= 0 && rect.left <= s) {
            return true;
        }
        fve.e("MainRecycleViewServiceImpl", "不在屏幕中");
        return false;
    }
}
