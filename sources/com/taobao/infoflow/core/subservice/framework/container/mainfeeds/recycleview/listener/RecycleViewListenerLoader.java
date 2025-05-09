package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.listener;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewAdapter;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowItemAnimator;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowItemDecoration;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.InfoFlowStaggeredGridLayoutManager;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.LayoutCorrectListener;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.config.RecycleViewAdapterDataObserver;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.cw6;
import tb.h6c;
import tb.k6c;
import tb.lgc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RecycleViewListenerLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final k6c<RecyclerView> f10680a;
    public RecyclerView.OnScrollListener b;
    public LayoutCorrectListener c;
    public View.OnAttachStateChangeListener d;
    public RecyclerView.OnChildAttachStateChangeListener e;
    public RecycleViewAdapterDataObserver f;
    public h6c.a<RecyclerView> g;
    public h6c.c<RecyclerView> h;
    public boolean i = false;
    public boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else {
                RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).a(view);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).f(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements h6c.a<RecyclerView> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.h6c.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd5e6c3d", new Object[]{this, new Integer(i)});
            } else {
                RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).p(i);
            }
        }

        /* renamed from: c */
        public void b(Canvas canvas, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4b997fa", new Object[]{this, canvas, recyclerView});
            } else {
                RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).S(canvas, recyclerView);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements h6c.c<RecyclerView> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            }
        }

        /* renamed from: b */
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
                return;
            }
            RecycleViewListenerLoader.b(RecycleViewListenerLoader.this, z);
            RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).D(z, z2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements lgc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.lgc.a
        public void e(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66994eec", new Object[]{this, viewHolder});
            } else {
                RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).I(viewHolder);
            }
        }

        @Override // tb.lgc.a
        public void f(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe53713a", new Object[]{this, viewHolder});
            } else {
                RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).w(viewHolder);
            }
        }

        @Override // tb.lgc.a
        public void g(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6bd58c33", new Object[]{this, viewHolder});
            } else {
                RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).z(viewHolder);
            }
        }

        @Override // tb.lgc.a
        public void k(RecyclerView.ViewHolder viewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38fae81", new Object[]{this, viewHolder});
            } else {
                RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).A(viewHolder);
            }
        }
    }

    static {
        t2o.a(486539697);
    }

    public RecycleViewListenerLoader(k6c<RecyclerView> k6cVar) {
        this.f10680a = k6cVar;
    }

    public static /* synthetic */ k6c a(RecycleViewListenerLoader recycleViewListenerLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k6c) ipChange.ipc$dispatch("79c9698d", new Object[]{recycleViewListenerLoader});
        }
        return recycleViewListenerLoader.f10680a;
    }

    public static /* synthetic */ boolean b(RecycleViewListenerLoader recycleViewListenerLoader, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3adcb886", new Object[]{recycleViewListenerLoader, new Boolean(z)})).booleanValue();
        }
        recycleViewListenerLoader.j = z;
        return z;
    }

    public static /* synthetic */ void c(RecycleViewListenerLoader recycleViewListenerLoader, RecyclerView recyclerView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebfc6608", new Object[]{recycleViewListenerLoader, recyclerView, view, new Boolean(z)});
        } else {
            recycleViewListenerLoader.k(recyclerView, view, z);
        }
    }

    public final h6c.a<RecyclerView> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.a) ipChange.ipc$dispatch("b5432308", new Object[]{this});
        }
        return new b();
    }

    public final View.OnAttachStateChangeListener e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("d77d2a91", new Object[]{this});
        }
        return new a();
    }

    public final RecyclerView.OnChildAttachStateChangeListener f(final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnChildAttachStateChangeListener) ipChange.ipc$dispatch("abcb0f37", new Object[]{this, recyclerView});
        }
        return new RecyclerView.OnChildAttachStateChangeListener() { // from class: com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.listener.RecycleViewListenerLoader.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("517542da", new Object[]{this, view});
                } else {
                    RecycleViewListenerLoader.c(RecycleViewListenerLoader.this, recyclerView, view, true);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8a66017d", new Object[]{this, view});
                } else {
                    RecycleViewListenerLoader.c(RecycleViewListenerLoader.this, recyclerView, view, false);
                }
            }
        };
    }

    public final lgc.a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lgc.a) ipChange.ipc$dispatch("5c6d111a", new Object[]{this});
        }
        return new d();
    }

    public final RecyclerView.OnScrollListener h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("81c8a5c8", new Object[]{this});
        }
        return new RecyclerView.OnScrollListener() { // from class: com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.listener.RecycleViewListenerLoader.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/framework/container/mainfeeds/recycleview/listener/RecycleViewListenerLoader$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                } else {
                    RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).e(recyclerView, i);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                } else {
                    RecycleViewListenerLoader.a(RecycleViewListenerLoader.this).d(recyclerView, i, i2);
                }
            }
        };
    }

    public final h6c.c<RecyclerView> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("4fe45bab", new Object[]{this});
        }
        return new c();
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("862a0214", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final void k(RecyclerView recyclerView, View view, boolean z) {
        RecycleViewAdapter recycleViewAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbfcd72", new Object[]{this, recyclerView, view, new Boolean(z)});
        } else if (recyclerView.getAdapter() instanceof RecycleViewAdapter) {
            int position = recyclerView.getLayoutManager().getPosition(view);
            if (recyclerView.getAdapter() instanceof RecycleViewAdapter) {
                recycleViewAdapter = (RecycleViewAdapter) recyclerView.getAdapter();
            } else {
                recycleViewAdapter = recyclerView instanceof TRecyclerView ? (RecycleViewAdapter) ((TRecyclerView) recyclerView).getRawAdapter() : null;
            }
            if (recycleViewAdapter != null) {
                BaseSectionModel<?> S = recycleViewAdapter.S(position);
                if (z) {
                    this.f10680a.R(position, view, S);
                } else {
                    this.f10680a.P(position, view, S);
                }
            } else if (cw6.b()) {
                throw new IllegalStateException("Adapter为空");
            }
        }
    }

    public void l(InfoFlowStaggeredGridLayoutManager infoFlowStaggeredGridLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870a6e9f", new Object[]{this, infoFlowStaggeredGridLayoutManager});
            return;
        }
        h6c.c<RecyclerView> i = i();
        this.h = i;
        infoFlowStaggeredGridLayoutManager.B(i);
    }

    public void m(RecyclerView recyclerView, InfoFlowItemDecoration infoFlowItemDecoration, InfoFlowStaggeredGridLayoutManager infoFlowStaggeredGridLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5a1f0e", new Object[]{this, recyclerView, infoFlowItemDecoration, infoFlowStaggeredGridLayoutManager});
            return;
        }
        RecyclerView.OnScrollListener h = h();
        this.b = h;
        recyclerView.addOnScrollListener(h);
        LayoutCorrectListener layoutCorrectListener = new LayoutCorrectListener();
        this.c = layoutCorrectListener;
        recyclerView.addOnScrollListener(layoutCorrectListener);
        View.OnAttachStateChangeListener e = e();
        this.d = e;
        recyclerView.addOnAttachStateChangeListener(e);
        RecyclerView.OnChildAttachStateChangeListener f = f(recyclerView);
        this.e = f;
        recyclerView.addOnChildAttachStateChangeListener(f);
        this.f = new RecycleViewAdapterDataObserver(this.f10680a);
        if (recyclerView.getAdapter() != null) {
            this.i = true;
            recyclerView.getAdapter().registerAdapterDataObserver(this.f);
        }
        h6c.a<RecyclerView> d2 = d();
        this.g = d2;
        infoFlowItemDecoration.i(d2);
        h6c.c<RecyclerView> i = i();
        this.h = i;
        infoFlowStaggeredGridLayoutManager.B(i);
        recyclerView.setItemAnimator(new InfoFlowItemAnimator(g()));
    }

    public void n(InfoFlowStaggeredGridLayoutManager infoFlowStaggeredGridLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bee946", new Object[]{this, infoFlowStaggeredGridLayoutManager});
        } else if (this.h != null) {
            infoFlowStaggeredGridLayoutManager.B(null);
        }
    }

    public void o(RecyclerView recyclerView, InfoFlowItemDecoration infoFlowItemDecoration, InfoFlowStaggeredGridLayoutManager infoFlowStaggeredGridLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fc1a87", new Object[]{this, recyclerView, infoFlowItemDecoration, infoFlowStaggeredGridLayoutManager});
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = this.b;
        if (onScrollListener != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
            this.b = null;
        }
        LayoutCorrectListener layoutCorrectListener = this.c;
        if (layoutCorrectListener != null) {
            recyclerView.removeOnScrollListener(layoutCorrectListener);
            this.c = null;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.d;
        if (onAttachStateChangeListener != null) {
            recyclerView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.d = null;
        }
        RecyclerView.OnChildAttachStateChangeListener onChildAttachStateChangeListener = this.e;
        if (onChildAttachStateChangeListener != null) {
            recyclerView.removeOnChildAttachStateChangeListener(onChildAttachStateChangeListener);
            this.e = null;
        }
        if (!(!this.i || this.f == null || recyclerView.getAdapter() == null)) {
            this.i = false;
            recyclerView.getAdapter().unregisterAdapterDataObserver(this.f);
            this.f = null;
        }
        if (this.g != null) {
            infoFlowItemDecoration.i(null);
            this.g = null;
        }
        if (this.h != null) {
            infoFlowStaggeredGridLayoutManager.B(null);
        }
    }
}
