package com.taobao.android.fluid.framework.list.render;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.WeexConsumeLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.render.ListRenderManager;
import com.taobao.android.fluid.framework.list.render.a;
import com.taobao.android.fluid.framework.list.render.b;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.az9;
import tb.b93;
import tb.bpk;
import tb.d69;
import tb.igs;
import tb.ir9;
import tb.lwl;
import tb.ntm;
import tb.o6d;
import tb.sz3;
import tb.t2o;
import tb.uq9;
import tb.yyr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class MultiRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NO_TYPE = -1;
    public static final int TYPE_CACHE_VIDEO = -3;
    public static final int TYPE_LOADING = -2;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f7854a;
    public List<com.taobao.android.fluid.framework.data.datamodel.a> f;
    public RecyclerViewHolder g;
    public RecyclerView i;
    public d j;
    public boolean m;
    public Message n;
    public int o;
    public RecyclerFooterViewHolder r;
    public ntm s;
    public final a.C0421a b = new a.C0421a();
    public final b.a c = new b.a();
    public final Set<RecyclerViewHolder> d = new HashSet();
    public final e e = new e();
    public final RecyclerView.OnScrollListener h = new RecyclerView.OnScrollListener() { // from class: com.taobao.android.fluid.framework.list.render.MultiRecyclerViewAdapter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/render/MultiRecyclerViewAdapter$1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            ir9.b("MultiRecyclerViewAdapter", "onScrollStateChanged/" + i);
            MultiRecyclerViewAdapter.M(MultiRecyclerViewAdapter.this, recyclerView, i);
        }
    };
    public int k = -1;
    public int l = -1;
    public boolean p = false;
    public int q = -1;
    public int t = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends o6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/render/MultiRecyclerViewAdapter$2");
        }

        @Override // tb.o6d.a, tb.o6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
                return;
            }
            for (RecyclerViewHolder recyclerViewHolder : MultiRecyclerViewAdapter.N(MultiRecyclerViewAdapter.this)) {
                recyclerViewHolder.f7861a.e();
            }
            if (MultiRecyclerViewAdapter.U(MultiRecyclerViewAdapter.this) != null) {
                MultiRecyclerViewAdapter.U(MultiRecyclerViewAdapter.this).f7861a.d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f7857a;

        public b(RecyclerView recyclerView) {
            this.f7857a = recyclerView;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            } else {
                MultiRecyclerViewAdapter.this.i0(this.f7857a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements LockableRecycerView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f7858a;

        public c(RecyclerView recyclerView) {
            this.f7858a = recyclerView;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ad3dde9", new Object[]{this});
            } else {
                MultiRecyclerViewAdapter.this.i0(this.f7858a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714481);
        }

        public void a(int i, RecyclerViewHolder recyclerViewHolder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfda56d2", new Object[]{this, new Integer(i), recyclerViewHolder});
            }
        }
    }

    static {
        t2o.a(468714475);
        t2o.a(468714459);
    }

    public MultiRecyclerViewAdapter(FluidContext fluidContext) {
        this.f7854a = fluidContext;
        if (!d69.b()) {
            ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener((o6d.a) new a());
        }
    }

    public static /* synthetic */ void M(MultiRecyclerViewAdapter multiRecyclerViewAdapter, RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54811b53", new Object[]{multiRecyclerViewAdapter, recyclerView, new Integer(i)});
        } else {
            multiRecyclerViewAdapter.p0(recyclerView, i);
        }
    }

    public static /* synthetic */ Set N(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("95e16bb5", new Object[]{multiRecyclerViewAdapter});
        }
        return multiRecyclerViewAdapter.d;
    }

    public static /* synthetic */ d O(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("e44eeaab", new Object[]{multiRecyclerViewAdapter});
        }
        return multiRecyclerViewAdapter.j;
    }

    public static /* synthetic */ int P(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35e471ea", new Object[]{multiRecyclerViewAdapter})).intValue();
        }
        return multiRecyclerViewAdapter.l;
    }

    public static /* synthetic */ int Q(MultiRecyclerViewAdapter multiRecyclerViewAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("94fc0461", new Object[]{multiRecyclerViewAdapter, new Integer(i)})).intValue();
        }
        multiRecyclerViewAdapter.l = i;
        return i;
    }

    public static /* synthetic */ boolean S(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13d7d7da", new Object[]{multiRecyclerViewAdapter})).booleanValue();
        }
        return multiRecyclerViewAdapter.m;
    }

    public static /* synthetic */ boolean T(MultiRecyclerViewAdapter multiRecyclerViewAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75759a44", new Object[]{multiRecyclerViewAdapter, new Boolean(z)})).booleanValue();
        }
        multiRecyclerViewAdapter.m = z;
        return z;
    }

    public static /* synthetic */ RecyclerViewHolder U(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewHolder) ipChange.ipc$dispatch("a8e705f5", new Object[]{multiRecyclerViewAdapter});
        }
        return multiRecyclerViewAdapter.g;
    }

    public static /* synthetic */ int V(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72ffcdf7", new Object[]{multiRecyclerViewAdapter})).intValue();
        }
        return multiRecyclerViewAdapter.q;
    }

    public static /* synthetic */ boolean W(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50f333e7", new Object[]{multiRecyclerViewAdapter})).booleanValue();
        }
        return multiRecyclerViewAdapter.p;
    }

    public static /* synthetic */ boolean X(MultiRecyclerViewAdapter multiRecyclerViewAdapter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbc5bfd7", new Object[]{multiRecyclerViewAdapter, new Boolean(z)})).booleanValue();
        }
        multiRecyclerViewAdapter.p = z;
        return z;
    }

    public static /* synthetic */ int Y(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ee699b5", new Object[]{multiRecyclerViewAdapter})).intValue();
        }
        return multiRecyclerViewAdapter.o;
    }

    public static /* synthetic */ int Z(MultiRecyclerViewAdapter multiRecyclerViewAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc3ed5f6", new Object[]{multiRecyclerViewAdapter, new Integer(i)})).intValue();
        }
        multiRecyclerViewAdapter.o = i;
        return i;
    }

    public static /* synthetic */ void a0(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9ffa1", new Object[]{multiRecyclerViewAdapter});
        } else {
            multiRecyclerViewAdapter.u0();
        }
    }

    public static /* synthetic */ RecyclerView b0(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("c8e167a7", new Object[]{multiRecyclerViewAdapter});
        }
        return multiRecyclerViewAdapter.i;
    }

    public static /* synthetic */ int c0(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8c0cb52", new Object[]{multiRecyclerViewAdapter})).intValue();
        }
        return multiRecyclerViewAdapter.k0();
    }

    public static /* synthetic */ int d0(MultiRecyclerViewAdapter multiRecyclerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6b43131", new Object[]{multiRecyclerViewAdapter})).intValue();
        }
        return multiRecyclerViewAdapter.k;
    }

    public static /* synthetic */ int e0(MultiRecyclerViewAdapter multiRecyclerViewAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e242dfa", new Object[]{multiRecyclerViewAdapter, new Integer(i)})).intValue();
        }
        multiRecyclerViewAdapter.k = i;
        return i;
    }

    public static /* synthetic */ Object ipc$super(MultiRecyclerViewAdapter multiRecyclerViewAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 143764512:
                super.onViewRecycled((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 430758011:
                super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 1156665041:
                super.onDetachedFromRecyclerView((RecyclerView) objArr[0]);
                return null;
            case 1591821244:
                super.onBindViewHolder((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue(), (List) objArr[2]);
                return null;
            case 1995301502:
                super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
                return null;
            case 2130396206:
                super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/render/MultiRecyclerViewAdapter");
        }
    }

    public final boolean f0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f19986c8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        List<com.taobao.android.fluid.framework.data.datamodel.a> list = this.f;
        if (list == null || i < 0 || i >= list.size()) {
            return true;
        }
        return false;
    }

    public final boolean g0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a937d609", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.s != null && i == 1) {
            return true;
        }
        if (!sz3.a(this.f) && i == this.f.size()) {
            return true;
        }
        return false;
    }

    public List<com.taobao.android.fluid.framework.data.datamodel.a> getDataList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6fd2c942", new Object[]{this});
        }
        return this.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        if (!sz3.a(this.f)) {
            return this.f.size() + (d69.g(this.f7854a) ? 1 : 0);
        }
        if (this.s != null) {
            return (d69.g(this.f7854a) ? 1 : 0) + 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 0 && this.s != null) {
            return -3;
        }
        if (d69.g(this.f7854a) && g0(i)) {
            return -2;
        }
        if (f0(i)) {
            return -1;
        }
        return ((ListRenderManager.AnonymousClass4) this).y0(this.f.get(i), i);
    }

    public void i0(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23bdbe1", new Object[]{this, recyclerView});
            return;
        }
        int j0 = j0(recyclerView);
        if (j0 != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(j0);
            if (!(findViewHolderForAdapterPosition instanceof RecyclerViewHolder)) {
                return;
            }
            if (d69.b() || ((ILifecycleService) this.f7854a.getService(ILifecycleService.class)).getPageState() == 2) {
                ((RecyclerViewHolder) findViewHolderForAdapterPosition).f7861a.d();
            } else {
                this.g = (RecyclerViewHolder) findViewHolderForAdapterPosition;
            }
        }
    }

    public int j0(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d88e866b", new Object[]{this, recyclerView})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        }
        return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
    }

    public final int k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fefa8988", new Object[]{this})).intValue();
        }
        int j0 = j0(this.i);
        if (j0 != -1) {
            return j0;
        }
        uq9 activeCard = ((ICardService) this.f7854a.getService(ICardService.class)).getActiveCard();
        if (activeCard != null) {
            return activeCard.M();
        }
        return 0;
    }

    public RecyclerFooterViewHolder l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerFooterViewHolder) ipChange.ipc$dispatch("f6fd449e", new Object[]{this});
        }
        return this.r;
    }

    public int m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b732bdcd", new Object[]{this})).intValue();
        }
        return this.t;
    }

    public final int n0(int i, int i2) {
        int i3;
        int i4 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c28782dd", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == 1002) {
            i3 = 900;
        } else {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0 || itemViewType == 2) {
                i3 = 1500;
            } else {
                i3 = 800;
            }
        }
        if (i != 0) {
            i4 = 1;
        }
        return i3 * i4;
    }

    public ntm o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("d066531a", new Object[]{this});
        }
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.i = recyclerView;
        if (recyclerView instanceof LockableRecycerView) {
            ((LockableRecycerView) recyclerView).setOnLayoutCompletedListener(new c(recyclerView));
        }
        recyclerView.addOnScrollListener(this.h);
        q0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!f0(i) && (viewHolder instanceof RecyclerViewHolder)) {
            RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) viewHolder;
            this.e.a(i, recyclerViewHolder);
            ir9.a("onBindViewHolder.bindData", "preload:" + i);
            recyclerViewHolder.f7861a.f(this.f.get(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        ir9.b("MultiRecyclerViewAdapter", "onCreateViewHolder viewType=" + i);
        if (i == -3) {
            igs.a("onCreateViewHolderCachevideo");
            CacheVideoViewHolder cacheVideoViewHolder = new CacheVideoViewHolder(this.f7854a, new WeexConsumeLayout(viewGroup.getContext()));
            cacheVideoViewHolder.b0(this.s);
            igs.c();
            return cacheVideoViewHolder;
        } else if (i != -2) {
            igs.a("onCreateViewHolder");
            uq9 z0 = ((ListRenderManager.AnonymousClass4) this).z0(i);
            RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(z0.i(viewGroup), z0, this, this.b, this.c);
            z0.onCreateView(z0, recyclerViewHolder);
            igs.c();
            return recyclerViewHolder;
        } else {
            igs.a("onCreateViewHolderLoadingview");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            RecyclerFooterViewHolder recyclerFooterViewHolder = new RecyclerFooterViewHolder(this.f7854a, frameLayout);
            this.r = recyclerFooterViewHolder;
            igs.c();
            return recyclerFooterViewHolder;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f14ed1", new Object[]{this, recyclerView});
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        if (recyclerView instanceof LockableRecycerView) {
            ((LockableRecycerView) recyclerView).setOnLayoutCompletedListener(null);
        }
        recyclerView.removeOnScrollListener(this.h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
            return;
        }
        this.t = viewHolder.getAdapterPosition();
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof RecyclerFooterViewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.i.findViewHolderForAdapterPosition(adapterPosition - 1);
            if (findViewHolderForAdapterPosition instanceof RecyclerViewHolder) {
                uq9 e0 = ((RecyclerViewHolder) findViewHolderForAdapterPosition).e0();
                ((RecyclerFooterViewHolder) viewHolder).g0(e0);
                if (!b93.s(this.f7854a)) {
                    e0.V().R().F(0.3f);
                    ir9.b("MultiRecyclerViewAdapter", "footer attach to window, set last card(" + e0.P() + ") opacity 0.3 at position:" + adapterPosition);
                }
            }
            ((RecyclerFooterViewHolder) viewHolder).e0();
        } else if (viewHolder instanceof RecyclerViewHolder) {
            RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) viewHolder;
            if (!d69.b() && ((ILifecycleService) this.f7854a.getService(ILifecycleService.class)).getPageState() != 2) {
                ((HashSet) this.d).add(recyclerViewHolder);
            } else if (((IQuickOpenService) this.f7854a.getService(IQuickOpenService.class)).isQuickOpenMode()) {
                recyclerViewHolder.f7861a.c = true;
            } else {
                recyclerViewHolder.f7861a.e();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (!d69.b()) {
            ((HashSet) this.d).remove(viewHolder);
            if (this.g == viewHolder) {
                this.g = null;
            }
        }
        if (viewHolder instanceof RecyclerViewHolder) {
            ((RecyclerViewHolder) viewHolder).f7861a.i();
        } else if (viewHolder instanceof RecyclerFooterViewHolder) {
            RecyclerFooterViewHolder recyclerFooterViewHolder = (RecyclerFooterViewHolder) viewHolder;
            recyclerFooterViewHolder.d0();
            uq9 b0 = recyclerFooterViewHolder.b0();
            if (b0 == null) {
                ir9.b("MultiRecyclerViewAdapter", "footer detach from window, opacity card is null");
                return;
            }
            if (b93.s(this.f7854a)) {
                uq9 activeCard = ((ICardService) this.f7854a.getService(ICardService.class)).getActiveCard();
                if (activeCard != null) {
                    ir9.b("MultiRecyclerViewAdapter", "footer detach from window, doCardSlideAlphaAnimation false");
                    activeCard.I(false);
                }
            } else {
                b0.V().R().F(1.0f);
                ir9.b("MultiRecyclerViewAdapter", "footer detach from window, set card(" + b0.P() + ") opacity 1");
            }
            recyclerFooterViewHolder.g0(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
            return;
        }
        super.onViewRecycled(viewHolder);
        if (!d69.b()) {
            ((HashSet) this.d).remove(viewHolder);
            if (this.g == viewHolder) {
                this.g = null;
            }
        }
        if (viewHolder instanceof RecyclerViewHolder) {
            ((RecyclerViewHolder) viewHolder).f7861a.n();
        }
    }

    public final void p0(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0cb4bf", new Object[]{this, recyclerView, new Integer(i)});
        } else if (i == 0) {
            Choreographer.getInstance().postFrameCallback(new b(recyclerView));
        } else if (i == 1 || i == 2) {
            az9.u();
        }
    }

    public final void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06e6c85", new Object[]{this});
        } else if (lwl.b()) {
            az9.l((Activity) this.f7854a.getContext());
        }
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170f6e38", new Object[]{this});
        } else if (this.j == null) {
            this.j = new d(Looper.getMainLooper());
        }
    }

    public void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261ded0a", new Object[]{this});
            return;
        }
        this.m = true;
        if (this.n != null) {
            int itemCount = getItemCount();
            Message message = this.n;
            int i = message.arg1;
            if (itemCount > 1 + i) {
                t0(i, message.arg2);
            }
        }
    }

    public final void u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2165ecd0", new Object[]{this});
            return;
        }
        this.j.removeMessages(10003);
        Message obtain = Message.obtain();
        obtain.what = 10003;
        obtain.arg1 = this.q;
        this.j.sendMessageDelayed(obtain, 3000L);
    }

    public MultiRecyclerViewAdapter v0(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiRecyclerViewAdapter) ipChange.ipc$dispatch("a9898152", new Object[]{this, list});
        }
        this.f = list;
        return this;
    }

    public void w0(bpk bpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2504e7", new Object[]{this, bpkVar});
        } else {
            this.b.g(bpkVar);
        }
    }

    public void x0(ntm ntmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2714cfa2", new Object[]{this, ntmVar});
        } else if (ntmVar == null || ntmVar.f24942a == null) {
            ir9.b("MultiRecyclerViewAdapter", "clear PreloadVideoData");
            this.s = null;
        } else {
            ir9.b("MultiRecyclerViewAdapter", "setPreloadVideoData");
            this.s = ntmVar;
            notifyDataSetChanged();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714480);
        }

        public d(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/render/MultiRecyclerViewAdapter$PreloadHandler");
        }

        public final boolean a(Message message, int i, int i2, int i3) {
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e441a82c", new Object[]{this, message, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
            }
            if (i3 == 0 && i2 == message.arg1) {
                z = true;
            } else {
                z = false;
            }
            if (i != MultiRecyclerViewAdapter.P(MultiRecyclerViewAdapter.this)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z) {
                ir9.b("PerfSmooth", "indexStable state/" + i3 + ", pos: " + i2 + ", fastcount: " + MultiRecyclerViewAdapter.Y(MultiRecyclerViewAdapter.this));
            }
            if (!z2) {
                ir9.b("PerfSmooth", "indexAlreadLoad state/" + i3 + ", pos: " + i2 + ", fastcount: " + MultiRecyclerViewAdapter.Y(MultiRecyclerViewAdapter.this));
            }
            if (!z || i < 0 || MultiRecyclerViewAdapter.this.getItemCount() <= i || !z2) {
                return false;
            }
            return true;
        }

        public final void b(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d776b051", new Object[]{this, message});
                return;
            }
            if (MultiRecyclerViewAdapter.V(MultiRecyclerViewAdapter.this) == message.arg1) {
                MultiRecyclerViewAdapter.X(MultiRecyclerViewAdapter.this, false);
                MultiRecyclerViewAdapter.Z(MultiRecyclerViewAdapter.this, 0);
                ir9.b("PerfSmooth", "fastcount reset , index: " + MultiRecyclerViewAdapter.V(MultiRecyclerViewAdapter.this));
            } else {
                if (MultiRecyclerViewAdapter.Y(MultiRecyclerViewAdapter.this) >= 3) {
                    MultiRecyclerViewAdapter.X(MultiRecyclerViewAdapter.this, true);
                    ir9.b("PerfSmooth", "fastcount set true, count: " + MultiRecyclerViewAdapter.Y(MultiRecyclerViewAdapter.this));
                } else {
                    MultiRecyclerViewAdapter.X(MultiRecyclerViewAdapter.this, false);
                    MultiRecyclerViewAdapter.Z(MultiRecyclerViewAdapter.this, 0);
                    ir9.b("PerfSmooth", "fastcount set false, count: " + MultiRecyclerViewAdapter.Y(MultiRecyclerViewAdapter.this));
                }
                MultiRecyclerViewAdapter.a0(MultiRecyclerViewAdapter.this);
            }
            az9.t(MultiRecyclerViewAdapter.W(MultiRecyclerViewAdapter.this));
        }

        public final void d(Message message, int i, Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("559090a1", new Object[]{this, message, new Integer(i), exc});
                return;
            }
            if (MultiRecyclerViewAdapter.S(MultiRecyclerViewAdapter.this)) {
                MultiRecyclerViewAdapter.O(MultiRecyclerViewAdapter.this).removeMessages(100);
                Message obtain = Message.obtain();
                obtain.what = message.what;
                obtain.arg1 = message.arg1;
                obtain.arg2 = message.arg2;
                MultiRecyclerViewAdapter.O(MultiRecyclerViewAdapter.this).sendMessageDelayed(obtain, 500L);
            }
            String str = "prealod index: " + i + ", finishType: " + message.arg2 + " , count: " + MultiRecyclerViewAdapter.this.getItemCount() + ", msg: " + exc.getMessage();
            ir9.b("PerfSmooth", str);
            yyr.b("PerfSmoothRV_PRE_FAIL_EXCEPTION", String.valueOf(message.arg1), str, null);
        }

        public final void e(Message message, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b684111", new Object[]{this, message, view});
                return;
            }
            RecyclerView.ViewHolder childViewHolder = MultiRecyclerViewAdapter.b0(MultiRecyclerViewAdapter.this).getChildViewHolder(view);
            if (message.arg2 != 1002 || !(childViewHolder instanceof RecyclerViewHolder)) {
                ir9.b("PerfSmooth", "preloadIdleData false " + message.arg2);
                return;
            }
            ((RecyclerViewHolder) childViewHolder).e0().o0();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            switch (message.what) {
                case 10001:
                case 10002:
                    try {
                        f(message);
                        return;
                    } catch (Throwable th) {
                        ir9.b("PerfSmooth", "MSG_PRELOAD_CARD error, msg: " + th.getMessage());
                        return;
                    }
                case 10003:
                    b(message);
                    return;
                default:
                    return;
            }
        }

        public final void c(Message message, int i, int i2, int i3) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9085872a", new Object[]{this, message, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            ir9.b("PerfSmooth", "MSG_PRELOAD_CARD/fail/state/" + i3 + ",index " + i);
            HashMap hashMap = new HashMap();
            hashMap.put("scroll_state", String.valueOf(i3));
            hashMap.put("nextPosition", String.valueOf(i));
            hashMap.put("activePosition", String.valueOf(i2));
            if (i != MultiRecyclerViewAdapter.P(MultiRecyclerViewAdapter.this)) {
                z = false;
            }
            hashMap.put("alreadLoad", String.valueOf(z));
            hashMap.put("fastScroll", String.valueOf(MultiRecyclerViewAdapter.W(MultiRecyclerViewAdapter.this)));
            yyr.b("PerfSmoothRV_PRE_FAIL_MISS", String.valueOf(message.arg1), String.valueOf(message.arg2), hashMap);
            if (message.arg1 == i2 && i3 == 0) {
                ir9.b("PerfSmooth", "xiewei hit index:" + message.arg1 + ", type: " + message.arg2);
            }
        }

        public final void f(Message message) {
            RecyclerView.Recycler recycler;
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c6e8a26", new Object[]{this, message});
            } else if ((MultiRecyclerViewAdapter.b0(MultiRecyclerViewAdapter.this) instanceof LockableRecycerView) && (recycler = ((LockableRecycerView) MultiRecyclerViewAdapter.b0(MultiRecyclerViewAdapter.this)).getRecycler()) != null) {
                int c0 = MultiRecyclerViewAdapter.c0(MultiRecyclerViewAdapter.this);
                int i = c0 >= MultiRecyclerViewAdapter.d0(MultiRecyclerViewAdapter.this) ? message.arg1 + 1 : message.arg1 - 1;
                MultiRecyclerViewAdapter.e0(MultiRecyclerViewAdapter.this, c0);
                int scrollState = MultiRecyclerViewAdapter.b0(MultiRecyclerViewAdapter.this).getScrollState();
                if (scrollState == 0) {
                    az9.v();
                } else {
                    az9.h();
                }
                if (a(message, i, c0, scrollState)) {
                    ir9.b("MultiRecyclerViewAdapter", "RV_PRE");
                    MultiRecyclerViewAdapter.O(MultiRecyclerViewAdapter.this).removeMessages(10001);
                    MultiRecyclerViewAdapter.O(MultiRecyclerViewAdapter.this).removeMessages(10002);
                    try {
                        view = recycler.getViewForPosition(i);
                    } catch (Exception e) {
                        d(message, i, e);
                        view = null;
                    }
                    if (view != null) {
                        e(message, view);
                        recycler.recycleView(view);
                        MultiRecyclerViewAdapter.Q(MultiRecyclerViewAdapter.this, i);
                        ir9.b("PerfSmooth", "MSG_PRELOAD_CARD/recycle/" + i);
                        HashMap hashMap = new HashMap();
                        hashMap.put("fastScroll", String.valueOf(MultiRecyclerViewAdapter.W(MultiRecyclerViewAdapter.this)));
                        yyr.b("PerfSmoothRV_PRE_SUC", String.valueOf(message.arg1), String.valueOf(message.arg2), hashMap);
                    } else {
                        ir9.b("PerfSmooth", "prealod index: " + i + ", count: " + MultiRecyclerViewAdapter.this.getItemCount() + ", msg: item is null");
                    }
                    MultiRecyclerViewAdapter.T(MultiRecyclerViewAdapter.this, false);
                    return;
                }
                c(message, i, c0, scrollState);
            }
        }
    }

    public void t0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c597e5", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (lwl.c(this.f7854a)) {
            try {
                r0();
                if (this.q != i) {
                    this.o++;
                    ir9.b("PerfSmooth", "fastcount add: " + this.o + ", last: " + this.q + ", index: " + i);
                    this.q = i;
                    if (!this.j.hasMessages(10003)) {
                        u0();
                    }
                }
                ir9.b("PerfSmooth", "onItemLoadFinish/index: " + i + ", loadType" + i2);
                int i3 = i2 == 1001 ? 10001 : 10002;
                this.j.removeMessages(i3);
                if (i3 == 10002) {
                    this.j.removeMessages(10001);
                }
                int n0 = n0(i, i2);
                if (this.p) {
                    ir9.b("PerfSmooth", "hit fastFastScroll");
                    n0 = 32;
                }
                Message obtain = Message.obtain(this.j, i3, i, i2, Integer.valueOf(i));
                if (h0(i)) {
                    ir9.b("PerfSmooth", "checkAlead load true fastcount: " + this.o);
                } else if (getItemCount() <= 1 + i) {
                    this.n = obtain;
                } else {
                    this.j.sendMessageDelayed(obtain, n0);
                    this.n = null;
                }
            } catch (Exception e2) {
                ir9.b("PerfSmooth", "notifyLoadFinishForPrefetch crash: " + e2.getMessage());
                yyr.b("PerfSmoothRV_PRE_FAIL_EXCEPTION_NOTIFY", String.valueOf(i), e2.getMessage(), null);
            }
        }
    }

    public final boolean h0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("234f1d97", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int k0 = k0();
        if (k0 >= this.k) {
            int i2 = i + 1;
            if (i2 <= k0) {
                ir9.b("PerfSmooth", "scroll next, next: " + i2 + ", active: " + k0);
                return true;
            }
        } else {
            int i3 = i - 1;
            if (i3 >= k0) {
                ir9.b("PerfSmooth", "scroll pre, next: " + i3 + ", active: " + k0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee143bc", new Object[]{this, viewHolder, new Integer(i), list});
        } else if (!f0(i) && (viewHolder instanceof RecyclerViewHolder)) {
            RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) viewHolder;
            this.e.a(i, recyclerViewHolder);
            ir9.a("onBindViewHolder.bindData", "preload:" + i);
            if (list.isEmpty()) {
                super.onBindViewHolder(recyclerViewHolder, i, list);
                return;
            }
            uq9 uq9Var = recyclerViewHolder.b;
            uq9Var.onBindData(uq9Var, this.f.get(i), i, list);
            if (((IQuickOpenService) this.f7854a.getService(IQuickOpenService.class)).isInQuickOpenMode()) {
                com.taobao.android.fluid.framework.list.render.a aVar = recyclerViewHolder.f7861a;
                if (aVar.c) {
                    aVar.c = false;
                    aVar.e();
                }
            }
        }
    }
}
