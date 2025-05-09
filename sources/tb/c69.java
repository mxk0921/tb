package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.TBVideoPagerSnapHelper;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c69 implements d6c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f16889a;
    public final olk<bpk> b = new olk<>();
    public final olk<RecyclerView.OnScrollListener> c = new olk<>();
    public final olk<TBSwipeRefreshLayout.OnPushLoadMoreListener> d = new olk<>();
    public final olk<TBSwipeRefreshLayout.OnPullRefreshListener> e = new olk<>();
    public final olk<LockableRecycerView.a> f = new olk<>();
    public final olk<TBVideoPagerSnapHelper.b> g = new olk<>();
    public final olk<nkc> h = new olk<>();

    static {
        t2o.a(468714450);
        t2o.a(468714451);
        t2o.a(468714452);
    }

    public c69(FluidContext fluidContext) {
        this.f16889a = fluidContext;
    }

    @Override // com.taobao.android.fluid.common.view.TBVideoPagerSnapHelper.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c838a7", new Object[]{this, new Integer(i)});
            return;
        }
        for (TBVideoPagerSnapHelper.b bVar : this.g.b()) {
            try {
                bVar.a(i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, bVar, "onChanged", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.common.view.TBVideoPagerSnapHelper.b
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa88aa1", new Object[]{this, new Boolean(z)});
            return;
        }
        for (TBVideoPagerSnapHelper.b bVar : this.g.b()) {
            try {
                bVar.b(z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, bVar, "onFastScrollChanged", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.common.view.TBVideoPagerSnapHelper.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d08aa3", new Object[]{this});
            return;
        }
        for (TBVideoPagerSnapHelper.b bVar : this.g.b()) {
            try {
                bVar.c();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, bVar, "onFlingAtBorder", e);
            }
        }
    }

    public void d(bpk bpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6088f8b", new Object[]{this, bpkVar});
        } else if (bpkVar != null) {
            this.b.a(bpkVar);
        }
    }

    public void e(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0fc18b", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.f.a(aVar);
        }
    }

    public void f(nkc nkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41413921", new Object[]{this, nkcVar});
        } else if (nkcVar != null) {
            this.h.a(nkcVar);
        }
    }

    public void g(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a47452", new Object[]{this, onPushLoadMoreListener});
        } else if (onPushLoadMoreListener != null) {
            this.d.a(onPushLoadMoreListener);
        }
    }

    public void h(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5df2649", new Object[]{this, onPullRefreshListener});
        } else if (onPullRefreshListener != null) {
            this.e.a(onPullRefreshListener);
        }
    }

    public void i(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f328d7e", new Object[]{this, onScrollListener});
        } else if (onScrollListener != null) {
            this.c.a(onScrollListener);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b330fc", new Object[]{this});
            return;
        }
        for (LockableRecycerView.a aVar : this.f.b()) {
            try {
                aVar.j();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, aVar, "onDragDown", e);
            }
        }
    }

    @Override // tb.bpk
    public void k(uq9 uq9Var, uq9 uq9Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d85cf3e9", new Object[]{this, uq9Var, uq9Var2});
            return;
        }
        for (bpk bpkVar : this.b.b()) {
            try {
                bpkVar.k(uq9Var, uq9Var2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, bpkVar, "onBeforeActiveCardChanged", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd4d54c", new Object[]{this});
            return;
        }
        for (LockableRecycerView.a aVar : this.f.b()) {
            if (aVar instanceof LockableRecycerView.c) {
                try {
                    ((LockableRecycerView.c) aVar).l();
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f16889a, aVar, "onDragDownInLock", e);
                }
            }
        }
    }

    @Override // tb.bpk
    public void m(uq9 uq9Var, uq9 uq9Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3112268", new Object[]{this, uq9Var, uq9Var2});
            return;
        }
        for (bpk bpkVar : this.b.b()) {
            try {
                bpkVar.m(uq9Var, uq9Var2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, bpkVar, "onActiveCardChanged", e);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.c
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46ce4c5", new Object[]{this});
            return;
        }
        for (LockableRecycerView.a aVar : this.f.b()) {
            if (aVar instanceof LockableRecycerView.c) {
                try {
                    ((LockableRecycerView.c) aVar).n();
                } catch (Exception e) {
                    FluidException.throwObserverCallbackException(this.f16889a, aVar, "onDragUpInLock", e);
                }
            }
        }
    }

    public void o(bpk bpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54a81ee", new Object[]{this, bpkVar});
        } else if (bpkVar != null) {
            this.b.e(bpkVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.list.view.LockableRecycerView.a
    public void onDragUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76868f35", new Object[]{this});
            return;
        }
        for (LockableRecycerView.a aVar : this.f.b()) {
            try {
                aVar.onDragUp();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, aVar, "onDragUp", e);
            }
        }
    }

    @Override // tb.nkc
    public void onListSpeedChange(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d853402", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        for (nkc nkcVar : this.h.b()) {
            try {
                nkcVar.onListSpeedChange(i, i2, i3);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, nkcVar, "onListSpeedChange", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
    public void onLoadMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a87be1", new Object[]{this});
            return;
        }
        for (TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener : this.d.b()) {
            try {
                onPushLoadMoreListener.onLoadMore();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, onPushLoadMoreListener, "onLoadMore", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
    public void onLoadMoreStateChanged(TBLoadMoreFooter.LoadMoreState loadMoreState, TBLoadMoreFooter.LoadMoreState loadMoreState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78cecfe0", new Object[]{this, loadMoreState, loadMoreState2});
            return;
        }
        for (TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener : this.d.b()) {
            try {
                onPushLoadMoreListener.onLoadMoreStateChanged(loadMoreState, loadMoreState2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, onPushLoadMoreListener, "onLoadMoreStateChanged", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.e.b()) {
            try {
                onPullRefreshListener.onPullDistance(i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, onPullRefreshListener, "onPullDistance", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
    public void onPushDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b554b6e", new Object[]{this, new Integer(i)});
            return;
        }
        for (TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener : this.d.b()) {
            try {
                onPushLoadMoreListener.onPushDistance(i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, onPushLoadMoreListener, "onPushDistance", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.e.b()) {
            try {
                onPullRefreshListener.onRefresh();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, onPullRefreshListener, "onRefresh", e);
            }
        }
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
    public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.e.b()) {
            try {
                onPullRefreshListener.onRefreshStateChanged(refreshState, refreshState2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, onPullRefreshListener, "onRefreshStateChanged", e);
            }
        }
    }

    @Override // tb.d6c
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        for (RecyclerView.OnScrollListener onScrollListener : this.c.b()) {
            try {
                onScrollListener.onScrollStateChanged(recyclerView, i);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, onScrollListener, "onScrollStateChanged", e);
            }
        }
    }

    @Override // tb.d6c
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        for (RecyclerView.OnScrollListener onScrollListener : this.c.b()) {
            try {
                onScrollListener.onScrolled(recyclerView, i, i2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f16889a, onScrollListener, "onScrolled", e);
            }
        }
    }

    public void p(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9aa208", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.f.e(aVar);
        }
    }

    public void q(nkc nkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60564c9e", new Object[]{this, nkcVar});
        } else if (nkcVar != null) {
            this.h.e(nkcVar);
        }
    }

    public void r(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec29c8f", new Object[]{this, onPushLoadMoreListener});
        } else if (onPushLoadMoreListener != null) {
            this.d.e(onPushLoadMoreListener);
        }
    }

    public void s(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f439c6", new Object[]{this, onPullRefreshListener});
        } else if (onPullRefreshListener != null) {
            this.e.e(onPullRefreshListener);
        }
    }

    public void t(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3a6c21", new Object[]{this, onScrollListener});
        } else if (onScrollListener != null) {
            this.c.e(onScrollListener);
        }
    }
}
